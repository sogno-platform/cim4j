package cim4j.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import cim4j.Analog;
import cim4j.AnalogValue;
import cim4j.BaseVoltage;
import cim4j.Logging;
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
        var ex = assertThrows(RuntimeException.class, () -> RdfReader.read("dummy.xml"));
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
        var cimData = RdfReader.read(getPath("rdf/test001.xml"));
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
        var cimData = RdfReader.read(getPath("rdf/test002.xml"));
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
        var cimData = RdfReader.read(getPath("rdf/test003.xml"));
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

    private String getPath(String aResource) {
        var url = getClass().getClassLoader().getResource(aResource);
        assertNotNull(url);
        assertEquals("file", url.getProtocol());
        return url.getPath();
    }
}
