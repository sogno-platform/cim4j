package cim4j.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import cim4j.Analog;
import cim4j.AnalogValue;
import cim4j.BaseVoltage;
import cim4j.CimConstants;
import cim4j.ConnectivityNode;
import cim4j.EnergySchedulingType;
import cim4j.EnergySource;
import cim4j.Logging;
import cim4j.OperationalLimitType;
import cim4j.Terminal;
import cim4j.TopologicalNode;
import cim4j.Voltage;
import cim4j.VoltageLevel;

/**
 * Test reading rdf files into a map of rdfid to cim object.
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RdfReaderTest {
    @Test
    @Order(100)
    void testRead() {
        Logging.setEnabled(false);
        assertFalse(Logging.isEnabled());
        var ex = assertThrows(RuntimeException.class, () -> RdfReader.read(List.of("dummy.xml")));
        var msg = ex.getMessage();
        assertTrue(msg.startsWith("Error while reading rdf file:"));
        var cause = ex.getCause();
        assertEquals(FileNotFoundException.class, cause.getClass());
        msg = cause.getMessage();
        assertTrue(msg.contains("dummy.xml"));
        Logging.setEnabled(true);
        assertTrue(Logging.isEnabled());
    }

    @Test
    @Order(110)
    void testRead001() {
        var cimData = RdfReader.read(List.of(getPath("rdf/test001.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("VoltageLevel.98"));
        assertTrue(cimData.containsKey("BaseVoltage.20"));

        var voltageLevel = cimData.get("VoltageLevel.98");
        assertNotNull(voltageLevel);
        assertEquals(VoltageLevel.class, voltageLevel.getClass());
        assertEquals("VoltageLevel.98", voltageLevel.getRdfid());

        var attributeNames = voltageLevel.getAttributeNames();
        assertTrue(attributeNames.contains("name"));
        assertTrue(attributeNames.contains("BaseVoltage"));
        assertEquals("98", voltageLevel.getAttribute("name").toString(false));

        var baseVoltage = voltageLevel.getAttribute("BaseVoltage");
        assertNotNull(baseVoltage);
        assertEquals(BaseVoltage.class, baseVoltage.getClass());
        assertEquals("BaseVoltage.20", baseVoltage.getRdfid());
        assertEquals(baseVoltage, cimData.get("BaseVoltage.20"));

        var nominalVoltage = baseVoltage.getAttribute("nominalVoltage");
        assertNotNull(nominalVoltage);
        assertEquals(Voltage.class, nominalVoltage.getClass());

        var value = nominalVoltage.getValue();
        assertNotNull(value);
        assertEquals(Double.class, value.getClass());
        assertEquals(20.0, value);
    }

    @Test
    @Order(120)
    void testRead002() {
        var cimData = RdfReader.read(List.of(getPath("rdf/test002.xml")));
        assertEquals(4, cimData.size());

        assertTrue(cimData.containsKey("Analog.N0.Voltage"));
        assertTrue(cimData.containsKey("AnalogValue.N0.Voltage"));

        var analogValue = cimData.get("AnalogValue.N0.Voltage");
        assertNotNull(analogValue);
        assertEquals(AnalogValue.class, analogValue.getClass());
        assertEquals("AnalogValue.N0.Voltage", analogValue.getRdfid());

        var attributeNames = analogValue.getAttributeNames();
        assertTrue(attributeNames.contains("Analog"));

        var analog = analogValue.getAttribute("Analog");
        assertNotNull(analog);
        assertEquals(Analog.class, analog.getClass());
        assertEquals("Analog.N0.Voltage", analog.getRdfid());
        assertEquals(analog, cimData.get("Analog.N0.Voltage"));

        attributeNames = analog.getAttributeNames();
        assertTrue(attributeNames.contains("name"));
        assertTrue(attributeNames.contains("measurementType"));
        assertTrue(attributeNames.contains("unitMultiplier"));
        assertTrue(attributeNames.contains("unitSymbol"));
        assertEquals("Voltage Magnitude Measurement at N0", analog.getAttribute("name").toString(false));
        assertEquals("Voltage", analog.getAttribute("measurementType").toString(false));

        var unitMultiplier = analog.getAttribute("unitMultiplier");
        assertNotNull(unitMultiplier);
        String[] parts = unitMultiplier.getRdfid().split("#");
        assertEquals(2, parts.length);
        assertEquals("UnitMultiplier.k", parts[1]);

        var unitSymbol = analog.getAttribute("unitSymbol");
        assertNotNull(unitSymbol);
        parts = unitSymbol.getRdfid().split("#");
        assertEquals(2, parts.length);
        assertEquals("UnitSymbol.V", parts[1]);
    }

    @Test
    @Order(130)
    void testRead003() {
        var cimData = RdfReader.read(List.of(getPath("rdf/test003.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("N0"));
        assertTrue(cimData.containsKey("Terminal.N0"));

        var terminal = cimData.get("Terminal.N0");
        assertNotNull(terminal);
        assertEquals(Terminal.class, terminal.getClass());
        assertEquals("Terminal.N0", terminal.getRdfid());

        var attributeNames = terminal.getAttributeNames();
        assertTrue(attributeNames.contains("TopologicalNode"));

        var topologicalNode = terminal.getAttribute("TopologicalNode");
        assertNotNull(topologicalNode);
        assertEquals(TopologicalNode.class, topologicalNode.getClass());
        assertEquals("N0", topologicalNode.getRdfid());
        assertEquals(topologicalNode, cimData.get("N0"));

        attributeNames = topologicalNode.getAttributeNames();
        assertTrue(attributeNames.contains("name"));
        assertEquals("N0", topologicalNode.getAttribute("name").toString(false));
    }

    @Test
    @Order(140)
    void testRead004() {
        var cimData = RdfReader.read(List.of(getPath("rdf/test004.xml")));
        assertEquals(1, cimData.size());

        assertTrue(cimData.containsKey("BaseVoltage.20"));

        var baseVoltage = cimData.get("BaseVoltage.20");
        assertNotNull(baseVoltage);
        assertEquals(BaseVoltage.class, baseVoltage.getClass());
        assertEquals("BaseVoltage.20", baseVoltage.getRdfid());

        var attributeNames = baseVoltage.getAttributeNames();
        assertTrue(attributeNames.contains("shortName"));
        assertEquals("20", baseVoltage.getAttribute("shortName").toString(false));
    }

    @Test
    @Order(150)
    void testRead005() {
        if (CimConstants.CIM_VERSION.equals("cgmes_v2_4_13") || CimConstants.CIM_VERSION.equals("cgmes_v2_4_15")) {
            var cimData = RdfReader.read(List.of(getPath("rdf/test005_CGMES2.xml")));
            assertEquals(2, cimData.size());

            assertTrue(cimData.containsKey("ES"));
            assertTrue(cimData.containsKey("EST"));

            var energySource = cimData.get("ES");
            assertNotNull(energySource);
            assertEquals(EnergySource.class, energySource.getClass());
            assertEquals("ES", energySource.getRdfid());

            var attributeNames = energySource.getAttributeNames();
            assertTrue(attributeNames.contains("EnergySchedulingType"));

            var energySchedulingType = energySource.getAttribute("EnergySchedulingType");
            assertNotNull(energySchedulingType);
            assertEquals(EnergySchedulingType.class, energySchedulingType.getClass());
            assertEquals("EST", energySchedulingType.getRdfid());
            assertEquals(energySchedulingType, cimData.get("EST"));

            attributeNames = energySchedulingType.getAttributeNames();
            assertTrue(attributeNames.contains("name"));
            assertEquals("EST", energySchedulingType.getAttribute("name").toString(false));
        } else if (CimConstants.CIM_VERSION.equals("cgmes_v3_0_0")) {
            var cimData = RdfReader.read(List.of(getPath("rdf/test005_CGMES3.xml")));
            assertEquals(2, cimData.size());

            assertTrue(cimData.containsKey("N0"));
            assertTrue(cimData.containsKey("N0_BP"));

            var boundaryPoint = cimData.get("N0_BP");
            assertNotNull(boundaryPoint);
            assertEquals("BoundaryPoint", boundaryPoint.debugString());
            assertEquals("N0_BP", boundaryPoint.getRdfid());

            var attributeNames = boundaryPoint.getAttributeNames();
            assertTrue(attributeNames.contains("ConnectivityNode"));

            var connectivityNode = boundaryPoint.getAttribute("ConnectivityNode");
            assertNotNull(connectivityNode);
            assertEquals(ConnectivityNode.class, connectivityNode.getClass());
            assertEquals("N0", connectivityNode.getRdfid());
            assertEquals(connectivityNode, cimData.get("N0"));

            attributeNames = connectivityNode.getAttributeNames();
            assertTrue(attributeNames.contains("name"));
            assertEquals("N0", connectivityNode.getAttribute("name").toString(false));
        }
    }

    @Test
    @Order(160)
    void testRead006() {
        if (CimConstants.CIM_VERSION.equals("cgmes_v2_4_13") || CimConstants.CIM_VERSION.equals("cgmes_v2_4_15")) {
            var cimData = RdfReader.read(List.of(getPath("rdf/test006_CGMES2.xml")));
            assertEquals(2, cimData.size());

            assertTrue(cimData.containsKey("OLT"));

            var operationalLimitType = cimData.get("OLT");
            assertNotNull(operationalLimitType);
            assertEquals(OperationalLimitType.class, operationalLimitType.getClass());
            assertEquals("OLT", operationalLimitType.getRdfid());

            var attributeNames = operationalLimitType.getAttributeNames();
            assertTrue(attributeNames.contains("name"));
            assertTrue(attributeNames.contains("limitType"));
            assertEquals("High Voltage", operationalLimitType.getAttribute("name").toString(false));

            var limitType = operationalLimitType.getAttribute("limitType");
            assertNotNull(limitType);
            String[] parts = limitType.getRdfid().split("#");
            assertEquals(2, parts.length);
            assertEquals("LimitTypeKind.highVoltage", parts[1]);
        } else if (CimConstants.CIM_VERSION.equals("cgmes_v3_0_0")) {
            var cimData = RdfReader.read(List.of(getPath("rdf/test006_CGMES3.xml")));
            assertEquals(2, cimData.size());

            assertTrue(cimData.containsKey("OLT"));

            var operationalLimitType = cimData.get("OLT");
            assertNotNull(operationalLimitType);
            assertEquals(OperationalLimitType.class, operationalLimitType.getClass());
            assertEquals("OLT", operationalLimitType.getRdfid());

            var attributeNames = operationalLimitType.getAttributeNames();
            assertTrue(attributeNames.contains("name"));
            assertTrue(attributeNames.contains("kind"));
            assertEquals("High Voltage", operationalLimitType.getAttribute("name").toString(false));

            var kind = operationalLimitType.getAttribute("kind");
            assertNotNull(kind);
            String[] parts = kind.getRdfid().split("#");
            assertEquals(2, parts.length);
            assertEquals("LimitKind.highVoltage", parts[1]);
        }
    }

    @Test
    @Order(170)
    void testRead007() {
        var cimData = RdfReader.read(List.of(getPath("rdf/test007.xml")));
        assertEquals(4, cimData.size());

        assertTrue(cimData.containsKey("VoltageLevel.96"));
        assertTrue(cimData.containsKey("VoltageLevel.97"));
        assertTrue(cimData.containsKey("VoltageLevel.98"));
        assertTrue(cimData.containsKey("BaseVoltage.20"));

        var voltageLevel = cimData.get("VoltageLevel.96");
        assertNotNull(voltageLevel);

        var baseVoltage = voltageLevel.getAttribute("BaseVoltage");
        assertNotNull(baseVoltage);
        assertEquals(BaseVoltage.class, baseVoltage.getClass());
        assertEquals("BaseVoltage.20", baseVoltage.getRdfid());
        assertEquals(baseVoltage, cimData.get("BaseVoltage.20"));

        voltageLevel = cimData.get("VoltageLevel.97");
        assertNotNull(voltageLevel);
        assertEquals(baseVoltage, voltageLevel.getAttribute("BaseVoltage"));

        voltageLevel = cimData.get("VoltageLevel.98");
        assertNotNull(voltageLevel);
        assertEquals(baseVoltage, voltageLevel.getAttribute("BaseVoltage"));
    }

    private String getPath(String aResource) {
        var url = getClass().getClassLoader().getResource(aResource);
        assertNotNull(url);
        assertEquals("file", url.getProtocol());
        return url.getPath();
    }
}
