package cim4j.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
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
import cim4j.Boolean;
import cim4j.CimConstants;
import cim4j.ConnectivityNode;
import cim4j.DateTime;
import cim4j.EnergySchedulingType;
import cim4j.EnergySource;
import cim4j.Location;
import cim4j.Logging;
import cim4j.MonthDay;
import cim4j.OperationalLimitType;
import cim4j.Season;
import cim4j.SvVoltage;
import cim4j.Terminal;
import cim4j.TopologicalIsland;
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

        var obj = cimData.get("VoltageLevel.98");
        assertNotNull(obj);
        assertTrue(obj instanceof VoltageLevel);
        var voltageLevel = (VoltageLevel) obj;
        assertEquals(VoltageLevel.class, voltageLevel.getClass());
        assertEquals("VoltageLevel.98", voltageLevel.getRdfid());

        var attributeNames = voltageLevel.getAttributeNames();
        assertTrue(attributeNames.contains("BaseVoltage"));
        assertTrue(attributeNames.contains("name"));
        assertEquals("98", voltageLevel.getAttribute("name").toString(false));

        var baseVoltage = voltageLevel.getAttribute("BaseVoltage");
        assertNotNull(baseVoltage);
        assertEquals(BaseVoltage.class, baseVoltage.getClass());
        assertEquals("BaseVoltage.20", baseVoltage.getRdfid());
        assertEquals(baseVoltage, cimData.get("BaseVoltage.20"));

        attributeNames = baseVoltage.getAttributeNames();
        assertTrue(attributeNames.contains("nominalVoltage"));

        var nominalVoltage = baseVoltage.getAttribute("nominalVoltage");
        assertNotNull(nominalVoltage);
        assertEquals(Voltage.class, nominalVoltage.getClass());
        assertTrue(nominalVoltage.isInitialized());

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

        var obj = cimData.get("AnalogValue.N0.Voltage");
        assertNotNull(obj);
        assertTrue(obj instanceof AnalogValue);
        var analogValue = (AnalogValue) obj;
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
        assertTrue(attributeNames.contains("measurementType"));
        assertTrue(attributeNames.contains("unitMultiplier"));
        assertTrue(attributeNames.contains("unitSymbol"));
        assertTrue(attributeNames.contains("name"));
        assertEquals("Voltage", analog.getAttribute("measurementType").toString(false));
        assertEquals("Voltage Magnitude Measurement at N0", analog.getAttribute("name").toString(false));

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

        var obj = cimData.get("Terminal.N0");
        assertNotNull(obj);
        assertTrue(obj instanceof Terminal);
        var terminal = (Terminal) obj;
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
            assertTrue(attributeNames.contains("limitType"));
            assertTrue(attributeNames.contains("name"));
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
            assertTrue(attributeNames.contains("kind"));
            assertTrue(attributeNames.contains("name"));
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

        var obj = cimData.get("VoltageLevel.96");
        assertNotNull(obj);
        assertTrue(obj instanceof VoltageLevel);
        var voltageLevel = (VoltageLevel) obj;

        var baseVoltage = voltageLevel.getAttribute("BaseVoltage");
        assertNotNull(baseVoltage);
        assertEquals(BaseVoltage.class, baseVoltage.getClass());
        assertEquals("BaseVoltage.20", baseVoltage.getRdfid());
        assertEquals(baseVoltage, cimData.get("BaseVoltage.20"));

        obj = cimData.get("VoltageLevel.97");
        assertNotNull(obj);
        assertTrue(obj instanceof VoltageLevel);
        voltageLevel = (VoltageLevel) obj;
        assertEquals(baseVoltage, voltageLevel.getAttribute("BaseVoltage"));

        obj = cimData.get("VoltageLevel.98");
        assertNotNull(obj);
        assertTrue(obj instanceof VoltageLevel);
        voltageLevel = (VoltageLevel) obj;
        assertEquals(baseVoltage, voltageLevel.getAttribute("BaseVoltage"));
    }

    @Test
    @Order(180)
    void testRead008_EQ_TP() {
        testRead_008_009(List.of(getPath("rdf/test008_EQ.xml"), getPath("rdf/test008_TP.xml")));
    }

    @Test
    @Order(190)
    void testRead008_TP_EQ() {
        testRead_008_009(List.of(getPath("rdf/test008_TP.xml"), getPath("rdf/test008_EQ.xml")));
    }

    @Test
    @Order(200)
    void testRead009_EQ_TP() {
        testRead_008_009(List.of(getPath("rdf/test009_EQ.xml"), getPath("rdf/test009_TP.xml")));
    }

    @Test
    @Order(210)
    void testRead009_TP_EQ() {
        testRead_008_009(List.of(getPath("rdf/test009_TP.xml"), getPath("rdf/test009_EQ.xml")));
    }

    private void testRead_008_009(List<String> test_008_009) {
        var cimData = RdfReader.read(test_008_009);
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("N0"));
        assertTrue(cimData.containsKey("Terminal.N0"));

        var obj = cimData.get("Terminal.N0");
        assertNotNull(obj);
        assertTrue(obj instanceof Terminal);
        var terminal = (Terminal) obj;
        assertEquals(Terminal.class, terminal.getClass());
        assertEquals("Terminal.N0", terminal.getRdfid());

        var attributeNames = terminal.getAttributeNames();
        assertTrue(attributeNames.contains("TopologicalNode"));
        assertTrue(attributeNames.contains("name"));
        assertEquals("Terminal.N0", terminal.getAttribute("name").toString(false));

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
    @Order(220)
    void testRead010() {
        var cimData = RdfReader.read(List.of(getPath("rdf/test010.xml")));
        assertEquals(1, cimData.size());

        assertTrue(cimData.containsKey("BaseVoltage.20"));

        var baseVoltage = cimData.get("BaseVoltage.20");
        assertNotNull(baseVoltage);

        var attributeNames = baseVoltage.getAttributeNames();
        assertTrue(attributeNames.contains("description"));
        assertEquals("€ÄÖÜäöüß", baseVoltage.getAttribute("description").toString(false));
    }

    @Test
    @Order(230)
    void testReadFromStrings() {
        final String xml = "<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n" +
                "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" +
                "         xmlns:cim=\"http://iec.ch/TC57/2013/CIM-schema-cim16#\">\n" +
                "  <cim:BaseVoltage rdf:ID=\"BaseVoltage.20\">\n" +
                "    <cim:IdentifiedObject.description>€ÄÖÜäöüß</cim:IdentifiedObject.description>\n" +
                "  </cim:BaseVoltage>\n" +
                "</rdf:RDF>\n";
        var cimData = RdfReader.readFromStrings(List.of(xml));
        assertEquals(1, cimData.size());

        assertTrue(cimData.containsKey("BaseVoltage.20"));

        var baseVoltage = cimData.get("BaseVoltage.20");
        assertNotNull(baseVoltage);

        var attributeNames = baseVoltage.getAttributeNames();
        assertTrue(attributeNames.contains("description"));
        assertEquals("€ÄÖÜäöüß", baseVoltage.getAttribute("description").toString(false));
    }

    @Test
    @Order(240)
    void testRead011() {
        if (CimConstants.CIM_VERSION.equals("cgmes_v3_0_0")) {
            var cimData = RdfReader.read(List.of(getPath("rdf/test011_CGMES3.xml")));
            assertEquals(5, cimData.size());

            assertTrue(cimData.containsKey("_Location"));
            assertTrue(cimData.containsKey("_Address"));
            assertTrue(cimData.containsKey("_Status"));
            assertTrue(cimData.containsKey("_Street"));
            assertTrue(cimData.containsKey("_Town"));

            var location = cimData.get("_Location");
            assertNotNull(location);
            assertEquals(Location.class, location.getClass());
            assertEquals("_Location", location.getRdfid());

            var attributeNames = location.getAttributeNames();
            assertTrue(attributeNames.contains("mainAddress"));

            var address = location.getAttribute("mainAddress");
            assertNotNull(address);
            assertEquals("StreetAddress", address.debugString());
            assertEquals("_Address", address.getRdfid());
            assertEquals(address, cimData.get("_Address"));

            attributeNames = address.getAttributeNames();
            assertTrue(attributeNames.contains("status"));
            assertTrue(attributeNames.contains("streetDetail"));
            assertTrue(attributeNames.contains("townDetail"));

            var status = address.getAttribute("status");
            assertNotNull(status);
            assertEquals("Status", status.debugString());
            assertEquals("_Status", status.getRdfid());
            assertEquals(status, cimData.get("_Status"));

            var streetDetail = address.getAttribute("streetDetail");
            assertNotNull(streetDetail);
            assertEquals("StreetDetail", streetDetail.debugString());
            assertEquals("_Street", streetDetail.getRdfid());
            assertEquals(streetDetail, cimData.get("_Street"));

            var townDetail = address.getAttribute("townDetail");
            assertNotNull(townDetail);
            assertEquals("TownDetail", townDetail.debugString());
            assertEquals("_Town", townDetail.getRdfid());
            assertEquals(townDetail, cimData.get("_Town"));

            attributeNames = status.getAttributeNames();
            assertTrue(attributeNames.contains("dateTime"));
            assertTrue(attributeNames.contains("value"));
            assertEquals("verified", status.getAttribute("value").toString(false));

            var dateTime = status.getAttribute("dateTime");
            assertNotNull(dateTime);
            assertEquals(DateTime.class, dateTime.getClass());
            assertTrue(dateTime.isInitialized());

            var value = dateTime.getValue();
            assertNotNull(value);
            assertEquals(String.class, value.getClass());
            assertEquals("2024-10-13 19:17:22 +0200", value);

            attributeNames = streetDetail.getAttributeNames();
            assertTrue(attributeNames.contains("name"));
            assertTrue(attributeNames.contains("number"));
            assertTrue(attributeNames.contains("withinTownLimits"));
            assertEquals("Ku'damm", streetDetail.getAttribute("name").toString(false));
            assertEquals("33", streetDetail.getAttribute("number").toString(false));

            var withinTownLimits = streetDetail.getAttribute("withinTownLimits");
            assertNotNull(withinTownLimits);
            assertEquals(Boolean.class, withinTownLimits.getClass());
            assertTrue(withinTownLimits.isInitialized());

            value = withinTownLimits.getValue();
            assertNotNull(value);
            assertEquals(java.lang.Boolean.class, value.getClass());
            assertEquals(true, value);

            attributeNames = townDetail.getAttributeNames();
            assertTrue(attributeNames.contains("country"));
            assertTrue(attributeNames.contains("name"));
            assertEquals("Germany", townDetail.getAttribute("country").toString(false));
            assertEquals("Berlin", townDetail.getAttribute("name").toString(false));
        }
    }

    @Test
    @Order(250)
    void testRead012() {
        var cimData = RdfReader.read(List.of(getPath("rdf/test012.xml")));
        assertEquals(1, cimData.size());

        assertTrue(cimData.containsKey("_Season"));

        var obj = cimData.get("_Season");
        assertNotNull(obj);
        assertTrue(obj instanceof Season);
        var season = (Season) obj;
        assertEquals(Season.class, season.getClass());
        assertEquals("_Season", season.getRdfid());

        var attributeNames = season.getAttributeNames();
        assertTrue(attributeNames.contains("endDate"));
        assertTrue(attributeNames.contains("startDate"));

        var endDate = season.getAttribute("endDate");
        assertNotNull(endDate);
        assertEquals(MonthDay.class, endDate.getClass());
        assertTrue(endDate.isInitialized());

        var value = endDate.getValue();
        assertNotNull(value);
        assertEquals(String.class, value.getClass());
        assertEquals("--10-31", value);

        var startDate = season.getAttribute("startDate");
        assertNotNull(startDate);
        assertEquals(MonthDay.class, startDate.getClass());
        assertTrue(startDate.isInitialized());

        value = startDate.getValue();
        assertNotNull(value);
        assertEquals(String.class, value.getClass());
        assertEquals("--10-13", value);
    }

    @Test
    @Order(260)
    void testRead013() {
        var cimData = RdfReader.read(List.of(getPath("rdf/test013.xml")));
        assertEquals(3, cimData.size());

        assertTrue(cimData.containsKey("TopologicalIsland.N"));
        assertTrue(cimData.containsKey("N0"));
        assertTrue(cimData.containsKey("N1"));

        var obj = cimData.get("TopologicalIsland.N");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalIsland);
        var topologicalIsland = (TopologicalIsland) obj;
        assertEquals(TopologicalIsland.class, topologicalIsland.getClass());
        assertEquals("TopologicalIsland.N", topologicalIsland.getRdfid());

        obj = cimData.get("N0");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalNode);
        var topologicalNode1 = (TopologicalNode) obj;
        assertEquals(TopologicalNode.class, topologicalNode1.getClass());
        assertEquals("N0", topologicalNode1.getRdfid());

        obj = cimData.get("N1");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalNode);
        var topologicalNode2 = (TopologicalNode) obj;
        assertEquals(TopologicalNode.class, topologicalNode2.getClass());
        assertEquals("N1", topologicalNode2.getRdfid());

        /// assertEquals(topologicalIsland, topologicalNode1.getAttribute("TopologicalIsland")); /// missing
        /// assertEquals(topologicalIsland, topologicalNode2.getAttribute("TopologicalIsland")); /// missing
        /// assertEquals(topologicalNode1, topologicalIsland.getAttribute("TopologicalNodes")); /// missing
        assertEquals(topologicalNode2, topologicalIsland.getAttribute("TopologicalNodes"));
    }

    @Test
    @Order(270)
    void testRead014() {
        var cimData = RdfReader.read(List.of(getPath("rdf/test014.xml")));
        assertEquals(3, cimData.size());

        assertTrue(cimData.containsKey("TopologicalIsland.N"));
        assertTrue(cimData.containsKey("N0"));
        assertTrue(cimData.containsKey("N1"));

        var obj = cimData.get("TopologicalIsland.N");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalIsland);
        var topologicalIsland = (TopologicalIsland) obj;
        assertEquals(TopologicalIsland.class, topologicalIsland.getClass());
        assertEquals("TopologicalIsland.N", topologicalIsland.getRdfid());

        obj = cimData.get("N0");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalNode);
        var topologicalNode1 = (TopologicalNode) obj;
        assertEquals(TopologicalNode.class, topologicalNode1.getClass());
        assertEquals("N0", topologicalNode1.getRdfid());

        obj = cimData.get("N1");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalNode);
        var topologicalNode2 = (TopologicalNode) obj;
        assertEquals(TopologicalNode.class, topologicalNode2.getClass());
        assertEquals("N1", topologicalNode2.getRdfid());

        assertEquals(topologicalIsland, topologicalNode1.getAttribute("TopologicalIsland"));
        assertEquals(topologicalIsland, topologicalNode2.getAttribute("TopologicalIsland"));
        /// assertEquals(topologicalNode1, topologicalIsland.getAttribute("TopologicalNodes")); /// missing
        /// assertEquals(topologicalNode2, topologicalIsland.getAttribute("TopologicalNodes")); /// missing
    }

    @Test
    @Order(280)
    void testRead015() {
        var cimData = RdfReader.read(List.of(getPath("rdf/test015.xml")));
        assertEquals(3, cimData.size());

        assertTrue(cimData.containsKey("TopologicalIsland.N"));
        assertTrue(cimData.containsKey("N0"));
        assertTrue(cimData.containsKey("N1"));

        var obj = cimData.get("TopologicalIsland.N");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalIsland);
        var topologicalIsland = (TopologicalIsland) obj;
        assertEquals(TopologicalIsland.class, topologicalIsland.getClass());
        assertEquals("TopologicalIsland.N", topologicalIsland.getRdfid());

        obj = cimData.get("N0");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalNode);
        var topologicalNode1 = (TopologicalNode) obj;
        assertEquals(TopologicalNode.class, topologicalNode1.getClass());
        assertEquals("N0", topologicalNode1.getRdfid());

        obj = cimData.get("N1");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalNode);
        var topologicalNode2 = (TopologicalNode) obj;
        assertEquals(TopologicalNode.class, topologicalNode2.getClass());
        assertEquals("N1", topologicalNode2.getRdfid());

        assertEquals(topologicalIsland, topologicalNode1.getAttribute("TopologicalIsland"));
        assertEquals(topologicalIsland, topologicalNode2.getAttribute("TopologicalIsland"));
        /// assertEquals(topologicalNode1, topologicalIsland.getAttribute("TopologicalNodes")); /// missing
        assertEquals(topologicalNode2, topologicalIsland.getAttribute("TopologicalNodes"));
    }

    @Test
    @Order(290)
    void testRead016() {
        var cimData = RdfReader.read(List.of(getPath("rdf/test016.xml")));
        assertEquals(3, cimData.size());

        assertTrue(cimData.containsKey("TopologicalIsland.N"));
        assertTrue(cimData.containsKey("N0"));
        assertTrue(cimData.containsKey("N1"));

        var obj = cimData.get("TopologicalIsland.N");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalIsland);
        var topologicalIsland = (TopologicalIsland) obj;
        assertEquals(TopologicalIsland.class, topologicalIsland.getClass());
        assertEquals("TopologicalIsland.N", topologicalIsland.getRdfid());

        obj = cimData.get("N0");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalNode);
        var topologicalNode1 = (TopologicalNode) obj;
        assertEquals(TopologicalNode.class, topologicalNode1.getClass());
        assertEquals("N0", topologicalNode1.getRdfid());

        obj = cimData.get("N1");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalNode);
        var topologicalNode2 = (TopologicalNode) obj;
        assertEquals(TopologicalNode.class, topologicalNode2.getClass());
        assertEquals("N1", topologicalNode2.getRdfid());

        /// assertEquals(topologicalIsland, topologicalNode1.getAttribute("TopologicalIsland")); /// missing
        assertEquals(topologicalIsland, topologicalNode2.getAttribute("TopologicalIsland"));
        assertEquals(topologicalNode1, topologicalIsland.getAttribute("TopologicalNodes"));
        /// assertEquals(topologicalNode2, topologicalIsland.getAttribute("TopologicalNodes")); /// missing
    }

    @Test
    @Order(300)
    void testRead017() {
        var cimData = RdfReader.read(List.of(getPath("rdf/test017.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("N0"));
        assertTrue(cimData.containsKey("SvVoltage.N0"));

        var obj = cimData.get("N0");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalNode);
        var topologicalNode = (TopologicalNode) obj;
        assertEquals(TopologicalNode.class, topologicalNode.getClass());
        assertEquals("N0", topologicalNode.getRdfid());

        obj = cimData.get("SvVoltage.N0");
        assertNotNull(obj);
        assertTrue(obj instanceof SvVoltage);
        var svVoltage = (SvVoltage) obj;
        assertEquals(SvVoltage.class, svVoltage.getClass());
        assertEquals("SvVoltage.N0", svVoltage.getRdfid());

        /// assertEquals(svVoltage, topologicalNode.getAttribute("SvVoltage")); /// missing
        assertEquals(topologicalNode, svVoltage.getAttribute("TopologicalNode"));
    }

    @Test
    @Order(310)
    void testRead018() {
        var cimData = RdfReader.read(List.of(getPath("rdf/test018.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("N0"));
        assertTrue(cimData.containsKey("SvVoltage.N0"));

        var obj = cimData.get("N0");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalNode);
        var topologicalNode = (TopologicalNode) obj;
        assertEquals(TopologicalNode.class, topologicalNode.getClass());
        assertEquals("N0", topologicalNode.getRdfid());

        obj = cimData.get("SvVoltage.N0");
        assertNotNull(obj);
        assertTrue(obj instanceof SvVoltage);
        var svVoltage = (SvVoltage) obj;
        assertEquals(SvVoltage.class, svVoltage.getClass());
        assertEquals("SvVoltage.N0", svVoltage.getRdfid());

        assertEquals(svVoltage, topologicalNode.getAttribute("SvVoltage"));
        /// assertEquals(topologicalNode, svVoltage.getAttribute("TopologicalNode")); /// missing
    }

    @Test
    @Order(320)
    void testRead019() {
        var cimData = RdfReader.read(List.of(getPath("rdf/test019.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("N0"));
        assertTrue(cimData.containsKey("SvVoltage.N0"));

        var obj = cimData.get("N0");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalNode);
        var topologicalNode = (TopologicalNode) obj;
        assertEquals(TopologicalNode.class, topologicalNode.getClass());
        assertEquals("N0", topologicalNode.getRdfid());

        obj = cimData.get("SvVoltage.N0");
        assertNotNull(obj);
        assertTrue(obj instanceof SvVoltage);
        var svVoltage = (SvVoltage) obj;
        assertEquals(SvVoltage.class, svVoltage.getClass());
        assertEquals("SvVoltage.N0", svVoltage.getRdfid());

        assertEquals(svVoltage, topologicalNode.getAttribute("SvVoltage"));
        assertEquals(topologicalNode, svVoltage.getAttribute("TopologicalNode"));
    }

    @Test
    @Order(350)
    void testRead022() {
        var cimData = RdfReader.read(List.of(getPath("rdf/test022.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("TopologicalIsland.N"));
        assertTrue(cimData.containsKey("TopologicalIsland.N2"));

        var obj = cimData.get("TopologicalIsland.N");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalIsland);
        var topologicalIsland = (TopologicalIsland) obj;
        assertEquals(TopologicalIsland.class, topologicalIsland.getClass());
        assertEquals("TopologicalIsland.N", topologicalIsland.getRdfid());

        var attributeNames = topologicalIsland.getAttributeNames();
        assertTrue(attributeNames.contains("TopologicalNodes"));
        assertTrue(attributeNames.contains("description"));
        assertTrue(attributeNames.contains("name"));
        assertNull(topologicalIsland.getAttribute("TopologicalNodes"));
        assertEquals("Island N", topologicalIsland.getAttribute("description").toString(false));
        assertEquals("N", topologicalIsland.getAttribute("name").toString(false));

        obj = cimData.get("TopologicalIsland.N2");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalIsland);
        topologicalIsland = (TopologicalIsland) obj;
        assertEquals(TopologicalIsland.class, topologicalIsland.getClass());
        assertEquals("TopologicalIsland.N2", topologicalIsland.getRdfid());

        attributeNames = topologicalIsland.getAttributeNames();
        assertTrue(attributeNames.contains("TopologicalNodes"));
        assertTrue(attributeNames.contains("description"));
        assertTrue(attributeNames.contains("name"));
        assertNull(topologicalIsland.getAttribute("TopologicalNodes"));
        assertNull(topologicalIsland.getAttribute("description"));
        assertNull(topologicalIsland.getAttribute("name"));
    }

    @Test
    @Order(360)
    void testRead023() {
        var cimData = RdfReader.read(List.of(getPath("rdf/test023.xml")));
        assertEquals(1, cimData.size());

        assertTrue(cimData.containsKey("BaseVoltage.20"));

        var baseVoltage = cimData.get("BaseVoltage.20");
        assertNotNull(baseVoltage);

        var attributeNames = baseVoltage.getAttributeNames();
        assertTrue(attributeNames.contains("description"));
        assertTrue(attributeNames.contains("name"));
        assertEquals("<&> <&> <&>", baseVoltage.getAttribute("description").toString(false));
        assertEquals("unknown entity reference: &nbsp;", baseVoltage.getAttribute("name").toString(false));
    }

    private String getPath(String aResource) {
        var url = getClass().getClassLoader().getResource(aResource);
        assertNotNull(url);
        assertEquals("file", url.getProtocol());
        return url.getPath();
    }
}
