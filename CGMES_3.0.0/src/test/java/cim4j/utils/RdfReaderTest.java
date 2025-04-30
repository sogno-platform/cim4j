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
import cim4j.CimConstants;
import cim4j.ConnectivityNode;
import cim4j.EnergySchedulingType;
import cim4j.EnergySource;
import cim4j.Location;
import cim4j.Logging;
import cim4j.OperationalLimitType;
import cim4j.Season;
import cim4j.SvVoltage;
import cim4j.Terminal;
import cim4j.TopologicalIsland;
import cim4j.TopologicalNode;
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
        var rdfReader = new RdfReader();
        var ex = assertThrows(RuntimeException.class, () -> rdfReader.read(List.of("dummy.xml")));
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
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test001.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("VoltageLevel.98"));
        assertTrue(cimData.containsKey("BaseVoltage.20"));

        var obj = cimData.get("VoltageLevel.98");
        assertNotNull(obj);
        assertTrue(obj instanceof VoltageLevel);
        var voltageLevel = (VoltageLevel) obj;
        assertEquals(VoltageLevel.class, voltageLevel.getClass());
        assertEquals("VoltageLevel", voltageLevel.getCimType());
        assertEquals("VoltageLevel.98", voltageLevel.getRdfid());

        var attributeNames = voltageLevel.getAttributeNames();
        assertTrue(attributeNames.contains("BaseVoltage"));
        assertTrue(attributeNames.contains("name"));
        assertEquals("BaseVoltage.20", voltageLevel.getAttribute("BaseVoltage"));
        assertEquals("98", voltageLevel.getAttribute("name"));

        var baseVoltage = voltageLevel.getBaseVoltage();
        assertNotNull(baseVoltage);
        assertEquals(BaseVoltage.class, baseVoltage.getClass());
        assertEquals("BaseVoltage", baseVoltage.getCimType());
        assertEquals("BaseVoltage.20", baseVoltage.getRdfid());
        assertEquals(baseVoltage, cimData.get("BaseVoltage.20"));
        assertEquals(baseVoltage.getRdfid(), voltageLevel.BaseVoltageToString());

        attributeNames = baseVoltage.getAttributeNames();
        assertTrue(attributeNames.contains("VoltageLevel"));
        assertTrue(attributeNames.contains("nominalVoltage"));
        assertEquals("VoltageLevel.98", baseVoltage.getAttribute("VoltageLevel"));
        assertEquals("20.0", baseVoltage.getAttribute("nominalVoltage"));

        var voltageLevelSet = baseVoltage.getVoltageLevel();
        assertNotNull(voltageLevelSet);
        assertEquals(1, voltageLevelSet.size());
        assertTrue(voltageLevelSet.contains(voltageLevel));

        var nominalVoltage = baseVoltage.getNominalVoltage();
        assertNotNull(nominalVoltage);
        assertEquals(Double.class, nominalVoltage.getClass());
        assertEquals(20.0, nominalVoltage);
    }

    @Test
    @Order(120)
    void testRead002() {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test002.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("Analog.N0.Voltage"));
        assertTrue(cimData.containsKey("AnalogValue.N0.Voltage"));

        var obj = cimData.get("AnalogValue.N0.Voltage");
        assertNotNull(obj);
        assertTrue(obj instanceof AnalogValue);
        var analogValue = (AnalogValue) obj;
        assertEquals(AnalogValue.class, analogValue.getClass());
        assertEquals("AnalogValue", analogValue.getCimType());
        assertEquals("AnalogValue.N0.Voltage", analogValue.getRdfid());

        var attributeNames = analogValue.getAttributeNames();
        assertTrue(attributeNames.contains("Analog"));
        assertEquals("Analog.N0.Voltage", analogValue.getAttribute("Analog"));

        var analog = analogValue.getAnalog();
        assertNotNull(analog);
        assertEquals(Analog.class, analog.getClass());
        assertEquals("Analog", analog.getCimType());
        assertEquals("Analog.N0.Voltage", analog.getRdfid());
        assertEquals(analog, cimData.get("Analog.N0.Voltage"));
        assertEquals(analog.getRdfid(), analogValue.AnalogToString());

        attributeNames = analog.getAttributeNames();
        assertTrue(attributeNames.contains("measurementType"));
        assertTrue(attributeNames.contains("unitMultiplier"));
        assertTrue(attributeNames.contains("unitSymbol"));
        assertTrue(attributeNames.contains("name"));
        assertEquals("Voltage", analog.getAttribute("measurementType"));
        assertTrue(analog.getAttribute("unitMultiplier").endsWith("#UnitMultiplier.k"));
        assertTrue(analog.getAttribute("unitSymbol").endsWith("#UnitSymbol.V"));
        assertEquals("Voltage Magnitude Measurement at N0", analog.getAttribute("name"));

        var unitMultiplier = analog.getUnitMultiplier();
        assertNotNull(unitMultiplier);
        assertEquals(unitMultiplier, analog.getAttribute("unitMultiplier"));
        String[] parts = unitMultiplier.split("#");
        assertEquals(2, parts.length);
        assertEquals("UnitMultiplier.k", parts[1]);

        var unitSymbol = analog.getUnitSymbol();
        assertNotNull(unitSymbol);
        assertEquals(unitSymbol, analog.getAttribute("unitSymbol"));
        parts = unitSymbol.split("#");
        assertEquals(2, parts.length);
        assertEquals("UnitSymbol.V", parts[1]);
    }

    @Test
    @Order(130)
    void testRead003() {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test003.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("N0"));
        assertTrue(cimData.containsKey("Terminal.N0"));

        var obj = cimData.get("Terminal.N0");
        assertNotNull(obj);
        assertTrue(obj instanceof Terminal);
        var terminal = (Terminal) obj;
        assertEquals(Terminal.class, terminal.getClass());
        assertEquals("Terminal", terminal.getCimType());
        assertEquals("Terminal.N0", terminal.getRdfid());

        var attributeNames = terminal.getAttributeNames();
        assertTrue(attributeNames.contains("TopologicalNode"));
        assertEquals("N0", terminal.getAttribute("TopologicalNode"));

        var topologicalNode = terminal.getTopologicalNode();
        assertNotNull(topologicalNode);
        assertEquals(TopologicalNode.class, topologicalNode.getClass());
        assertEquals("TopologicalNode", topologicalNode.getCimType());
        assertEquals("N0", topologicalNode.getRdfid());
        assertEquals(topologicalNode, cimData.get("N0"));
        assertEquals(topologicalNode.getRdfid(), terminal.TopologicalNodeToString());

        attributeNames = topologicalNode.getAttributeNames();
        assertTrue(attributeNames.contains("name"));
        assertEquals("N0", topologicalNode.getAttribute("name"));
    }

    @Test
    @Order(140)
    void testRead004() {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test004.xml")));
        assertEquals(1, cimData.size());

        assertTrue(cimData.containsKey("BaseVoltage.20"));

        var baseVoltage = cimData.get("BaseVoltage.20");
        assertNotNull(baseVoltage);
        assertEquals(BaseVoltage.class, baseVoltage.getClass());
        assertEquals("BaseVoltage", baseVoltage.getCimType());
        assertEquals("BaseVoltage.20", baseVoltage.getRdfid());

        var attributeNames = baseVoltage.getAttributeNames();
        assertTrue(attributeNames.contains("shortName"));
        assertEquals("20", baseVoltage.getAttribute("shortName"));
    }

    @Test
    @Order(150)
    void testRead005() {
        if (CimConstants.CIM_VERSION.equals("cgmes_v2_4_13") || CimConstants.CIM_VERSION.equals("cgmes_v2_4_15")) {
            var rdfReader = new RdfReader();
            var cimData = rdfReader.read(List.of(getPath("rdf/test005_CGMES2.xml")));
            assertEquals(2, cimData.size());

            assertTrue(cimData.containsKey("ES"));
            assertTrue(cimData.containsKey("EST"));

            var energySource = cimData.get("ES");
            assertNotNull(energySource);
            assertEquals(EnergySource.class, energySource.getClass());
            assertEquals("EnergySource", energySource.getCimType());
            assertEquals("ES", energySource.getRdfid());

            var attributeNames = energySource.getAttributeNames();
            assertTrue(attributeNames.contains("EnergySchedulingType"));

            var energySchedulingTypeId = energySource.getAttribute("EnergySchedulingType");
            assertEquals("EST", energySchedulingTypeId);
            var obj = cimData.get(energySchedulingTypeId);
            assertNotNull(obj);
            assertTrue(obj instanceof EnergySchedulingType);

            var energySchedulingType = (EnergySchedulingType) obj;
            assertEquals(EnergySchedulingType.class, energySchedulingType.getClass());
            assertEquals("EnergySchedulingType", energySchedulingType.getCimType());
            assertEquals("EST", energySchedulingType.getRdfid());

            attributeNames = energySchedulingType.getAttributeNames();
            assertTrue(attributeNames.contains("name"));
            assertEquals("EST", energySchedulingType.getAttribute("name"));
        } else if (CimConstants.CIM_VERSION.equals("cgmes_v3_0_0")) {
            var rdfReader = new RdfReader();
            var cimData = rdfReader.read(List.of(getPath("rdf/test005_CGMES3.xml")));
            assertEquals(2, cimData.size());

            assertTrue(cimData.containsKey("N0"));
            assertTrue(cimData.containsKey("N0_BP"));

            var boundaryPoint = cimData.get("N0_BP");
            assertNotNull(boundaryPoint);
            assertEquals("BoundaryPoint", boundaryPoint.getCimType());
            assertEquals("N0_BP", boundaryPoint.getRdfid());

            var attributeNames = boundaryPoint.getAttributeNames();
            assertTrue(attributeNames.contains("ConnectivityNode"));

            var connectivityNodeId = boundaryPoint.getAttribute("ConnectivityNode");
            assertEquals("N0", connectivityNodeId);
            var obj = cimData.get(connectivityNodeId);
            assertNotNull(obj);
            assertTrue(obj instanceof ConnectivityNode);

            var connectivityNode = (ConnectivityNode) obj;
            assertEquals(ConnectivityNode.class, connectivityNode.getClass());
            assertEquals("ConnectivityNode", connectivityNode.getCimType());
            assertEquals("N0", connectivityNode.getRdfid());

            attributeNames = connectivityNode.getAttributeNames();
            assertTrue(attributeNames.contains("name"));
            assertEquals("N0", connectivityNode.getAttribute("name"));
        }
    }

    @Test
    @Order(160)
    void testRead006() {
        if (CimConstants.CIM_VERSION.equals("cgmes_v2_4_13") || CimConstants.CIM_VERSION.equals("cgmes_v2_4_15")) {
            var rdfReader = new RdfReader();
            var cimData = rdfReader.read(List.of(getPath("rdf/test006_CGMES2.xml")));
            assertEquals(1, cimData.size());

            assertTrue(cimData.containsKey("OLT"));

            var operationalLimitType = cimData.get("OLT");
            assertNotNull(operationalLimitType);
            assertEquals(OperationalLimitType.class, operationalLimitType.getClass());
            assertEquals("OperationalLimitType", operationalLimitType.getCimType());
            assertEquals("OLT", operationalLimitType.getRdfid());

            var attributeNames = operationalLimitType.getAttributeNames();
            assertTrue(attributeNames.contains("limitType"));
            assertTrue(attributeNames.contains("name"));
            assertEquals("High Voltage", operationalLimitType.getAttribute("name"));

            var limitType = operationalLimitType.getAttribute("limitType");
            assertNotNull(limitType);
            String[] parts = limitType.split("#");
            assertEquals(2, parts.length);
            assertEquals("LimitTypeKind.highVoltage", parts[1]);
        } else if (CimConstants.CIM_VERSION.equals("cgmes_v3_0_0")) {
            var rdfReader = new RdfReader();
            var cimData = rdfReader.read(List.of(getPath("rdf/test006_CGMES3.xml")));
            assertEquals(1, cimData.size());

            assertTrue(cimData.containsKey("OLT"));

            var operationalLimitType = cimData.get("OLT");
            assertNotNull(operationalLimitType);
            assertEquals(OperationalLimitType.class, operationalLimitType.getClass());
            assertEquals("OperationalLimitType", operationalLimitType.getCimType());
            assertEquals("OLT", operationalLimitType.getRdfid());

            var attributeNames = operationalLimitType.getAttributeNames();
            assertTrue(attributeNames.contains("kind"));
            assertTrue(attributeNames.contains("name"));
            assertEquals("High Voltage", operationalLimitType.getAttribute("name"));

            var kind = operationalLimitType.getAttribute("kind");
            assertNotNull(kind);
            String[] parts = kind.split("#");
            assertEquals(2, parts.length);
            assertEquals("LimitKind.highVoltage", parts[1]);
        }
    }

    @Test
    @Order(170)
    void testRead007() {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test007.xml")));
        assertEquals(4, cimData.size());

        assertTrue(cimData.containsKey("VoltageLevel.96"));
        assertTrue(cimData.containsKey("VoltageLevel.97"));
        assertTrue(cimData.containsKey("VoltageLevel.98"));
        assertTrue(cimData.containsKey("BaseVoltage.20"));

        var obj = cimData.get("VoltageLevel.96");
        assertNotNull(obj);
        assertTrue(obj instanceof VoltageLevel);
        var voltageLevel = (VoltageLevel) obj;

        var baseVoltage = voltageLevel.getBaseVoltage();
        assertNotNull(baseVoltage);
        assertEquals(BaseVoltage.class, baseVoltage.getClass());
        assertEquals("BaseVoltage", baseVoltage.getCimType());
        assertEquals("BaseVoltage.20", baseVoltage.getRdfid());
        assertEquals(baseVoltage, cimData.get("BaseVoltage.20"));
        assertEquals(baseVoltage.getRdfid(), voltageLevel.BaseVoltageToString());

        obj = cimData.get("VoltageLevel.97");
        assertNotNull(obj);
        assertTrue(obj instanceof VoltageLevel);
        voltageLevel = (VoltageLevel) obj;
        assertEquals(baseVoltage, voltageLevel.getBaseVoltage());

        obj = cimData.get("VoltageLevel.98");
        assertNotNull(obj);
        assertTrue(obj instanceof VoltageLevel);
        voltageLevel = (VoltageLevel) obj;
        assertEquals(baseVoltage, voltageLevel.getBaseVoltage());
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
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(test_008_009);
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("N0"));
        assertTrue(cimData.containsKey("Terminal.N0"));

        var obj = cimData.get("Terminal.N0");
        assertNotNull(obj);
        assertTrue(obj instanceof Terminal);
        var terminal = (Terminal) obj;
        assertEquals(Terminal.class, terminal.getClass());
        assertEquals("Terminal", terminal.getCimType());
        assertEquals("Terminal.N0", terminal.getRdfid());

        var attributeNames = terminal.getAttributeNames();
        assertTrue(attributeNames.contains("TopologicalNode"));
        assertTrue(attributeNames.contains("name"));
        assertEquals("N0", terminal.getAttribute("TopologicalNode"));
        assertEquals("Terminal.N0", terminal.getAttribute("name"));

        var topologicalNode = terminal.getTopologicalNode();
        assertNotNull(topologicalNode);
        assertEquals(TopologicalNode.class, topologicalNode.getClass());
        assertEquals("TopologicalNode", topologicalNode.getCimType());
        assertEquals("N0", topologicalNode.getRdfid());
        assertEquals(topologicalNode, cimData.get("N0"));
        assertEquals(topologicalNode.getRdfid(), terminal.TopologicalNodeToString());

        attributeNames = topologicalNode.getAttributeNames();
        assertTrue(attributeNames.contains("name"));
        assertEquals("N0", topologicalNode.getAttribute("name"));
    }

    @Test
    @Order(220)
    void testRead010() {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test010.xml")));
        assertEquals(1, cimData.size());

        assertTrue(cimData.containsKey("BaseVoltage.20"));

        var baseVoltage = cimData.get("BaseVoltage.20");
        assertNotNull(baseVoltage);

        var attributeNames = baseVoltage.getAttributeNames();
        assertTrue(attributeNames.contains("description"));
        assertEquals("€ÄÖÜäöüß", baseVoltage.getAttribute("description"));
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
        var rdfReader = new RdfReader();
        var cimData = rdfReader.readFromStrings(List.of(xml));
        assertEquals(1, cimData.size());

        assertTrue(cimData.containsKey("BaseVoltage.20"));

        var baseVoltage = cimData.get("BaseVoltage.20");
        assertNotNull(baseVoltage);

        var attributeNames = baseVoltage.getAttributeNames();
        assertTrue(attributeNames.contains("description"));
        assertEquals("€ÄÖÜäöüß", baseVoltage.getAttribute("description"));
    }

    @Test
    @Order(240)
    void testRead011() {
        if (CimConstants.CIM_VERSION.equals("cgmes_v3_0_0")) {
            var rdfReader = new RdfReader();
            var cimData = rdfReader.read(List.of(getPath("rdf/test011_CGMES3.xml")));
            assertEquals(5, cimData.size());

            assertTrue(cimData.containsKey("_Location"));
            assertTrue(cimData.containsKey("_Address"));
            assertTrue(cimData.containsKey("_Status"));
            assertTrue(cimData.containsKey("_Street"));
            assertTrue(cimData.containsKey("_Town"));

            var location = cimData.get("_Location");
            assertNotNull(location);
            assertEquals(Location.class, location.getClass());
            assertEquals("Location", location.getCimType());
            assertEquals("_Location", location.getRdfid());

            var attributeNames = location.getAttributeNames();
            assertTrue(attributeNames.contains("mainAddress"));

            var addressId = location.getAttribute("mainAddress");
            assertEquals("_Address", addressId);
            var address = cimData.get(addressId);
            assertNotNull(address);
            assertEquals("StreetAddress", address.getCimType());
            assertEquals("_Address", address.getRdfid());

            attributeNames = address.getAttributeNames();
            assertTrue(attributeNames.contains("status"));
            assertTrue(attributeNames.contains("streetDetail"));
            assertTrue(attributeNames.contains("townDetail"));

            var statusId = address.getAttribute("status");
            assertEquals("_Status", statusId);
            var status = cimData.get(statusId);
            assertNotNull(status);
            assertEquals("Status", status.getCimType());
            assertEquals("_Status", status.getRdfid());

            var streetDetailId = address.getAttribute("streetDetail");
            assertEquals("_Street", streetDetailId);
            var streetDetail = cimData.get(streetDetailId);
            assertNotNull(streetDetail);
            assertEquals("StreetDetail", streetDetail.getCimType());
            assertEquals("_Street", streetDetail.getRdfid());

            var townDetailId = address.getAttribute("townDetail");
            assertEquals("_Town", townDetailId);
            var townDetail = cimData.get(townDetailId);
            assertNotNull(townDetail);
            assertEquals("TownDetail", townDetail.getCimType());
            assertEquals("_Town", townDetail.getRdfid());

            attributeNames = status.getAttributeNames();
            assertTrue(attributeNames.contains("dateTime"));
            assertTrue(attributeNames.contains("value"));
            assertEquals("verified", status.getAttribute("value"));

            var dateTime = status.getAttribute("dateTime");
            assertNotNull(dateTime);
            assertEquals("2024-10-13 19:17:22 +0200", dateTime);

            attributeNames = streetDetail.getAttributeNames();
            assertTrue(attributeNames.contains("name"));
            assertTrue(attributeNames.contains("number"));
            assertTrue(attributeNames.contains("withinTownLimits"));
            assertEquals("Ku'damm", streetDetail.getAttribute("name"));
            assertEquals("33", streetDetail.getAttribute("number"));

            var withinTownLimits = streetDetail.getAttribute("withinTownLimits");
            assertNotNull(withinTownLimits);
            assertEquals("true", withinTownLimits);

            attributeNames = townDetail.getAttributeNames();
            assertTrue(attributeNames.contains("country"));
            assertTrue(attributeNames.contains("name"));
            assertEquals("Germany", townDetail.getAttribute("country"));
            assertEquals("Berlin", townDetail.getAttribute("name"));
        }
    }

    @Test
    @Order(250)
    void testRead012() {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test012.xml")));
        assertEquals(1, cimData.size());

        assertTrue(cimData.containsKey("_Season"));

        var obj = cimData.get("_Season");
        assertNotNull(obj);
        assertTrue(obj instanceof Season);
        var season = (Season) obj;
        assertEquals(Season.class, season.getClass());
        assertEquals("Season", season.getCimType());
        assertEquals("_Season", season.getRdfid());

        var attributeNames = season.getAttributeNames();
        assertTrue(attributeNames.contains("endDate"));
        assertTrue(attributeNames.contains("startDate"));
        assertEquals("--10-31", season.getAttribute("endDate"));
        assertEquals("--10-13", season.getAttribute("startDate"));

        var endDate = season.getEndDate();
        assertNotNull(endDate);
        assertEquals("--10-31", endDate);

        var startDate = season.getStartDate();
        assertNotNull(startDate);
        assertEquals("--10-13", startDate);
    }

    @Test
    @Order(260)
    void testRead013() {
        testRead_013_014_015_016("rdf/test013.xml");
    }

    @Test
    @Order(270)
    void testRead014() {
        testRead_013_014_015_016("rdf/test014.xml");
    }

    @Test
    @Order(280)
    void testRead015() {
        testRead_013_014_015_016("rdf/test015.xml");
    }

    @Test
    @Order(290)
    void testRead016() {
        testRead_013_014_015_016("rdf/test016.xml");
    }

    private void testRead_013_014_015_016(String test_013_014_015_016) {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath(test_013_014_015_016)));
        assertEquals(3, cimData.size());

        assertTrue(cimData.containsKey("TopologicalIsland.N"));
        assertTrue(cimData.containsKey("N0"));
        assertTrue(cimData.containsKey("N1"));

        var obj = cimData.get("TopologicalIsland.N");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalIsland);
        var topologicalIsland = (TopologicalIsland) obj;
        assertEquals(TopologicalIsland.class, topologicalIsland.getClass());
        assertEquals("TopologicalIsland", topologicalIsland.getCimType());
        assertEquals("TopologicalIsland.N", topologicalIsland.getRdfid());

        obj = cimData.get("N0");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalNode);
        var topologicalNode1 = (TopologicalNode) obj;
        assertEquals(TopologicalNode.class, topologicalNode1.getClass());
        assertEquals("TopologicalNode", topologicalNode1.getCimType());
        assertEquals("N0", topologicalNode1.getRdfid());

        obj = cimData.get("N1");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalNode);
        var topologicalNode2 = (TopologicalNode) obj;
        assertEquals(TopologicalNode.class, topologicalNode2.getClass());
        assertEquals("TopologicalNode", topologicalNode2.getCimType());
        assertEquals("N1", topologicalNode2.getRdfid());

        assertEquals("TopologicalIsland.N", topologicalNode1.getAttribute("TopologicalIsland"));
        assertEquals("TopologicalIsland.N", topologicalNode2.getAttribute("TopologicalIsland"));
        assertEquals("N0 N1", topologicalIsland.getAttribute("TopologicalNodes"));

        var topologicalNodes = topologicalIsland.getTopologicalNodes();
        assertNotNull(topologicalNodes);
        assertEquals(2, topologicalNodes.size());
        assertTrue(topologicalNodes.contains(topologicalNode1));
        assertTrue(topologicalNodes.contains(topologicalNode2));
        assertEquals(topologicalIsland, topologicalNode1.getTopologicalIsland());
        assertEquals(topologicalIsland, topologicalNode2.getTopologicalIsland());
    }

    @Test
    @Order(300)
    void testRead017() {
        testRead_017_018_019("rdf/test017.xml");
    }

    @Test
    @Order(310)
    void testRead018() {
        testRead_017_018_019("rdf/test018.xml");
    }

    @Test
    @Order(320)
    void testRead019() {
        testRead_017_018_019("rdf/test019.xml");
    }

    private void testRead_017_018_019(String test_017_018_019) {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath(test_017_018_019)));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("N0"));
        assertTrue(cimData.containsKey("SvVoltage.N0"));

        var obj = cimData.get("N0");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalNode);
        var topologicalNode = (TopologicalNode) obj;
        assertEquals(TopologicalNode.class, topologicalNode.getClass());
        assertEquals("TopologicalNode", topologicalNode.getCimType());
        assertEquals("N0", topologicalNode.getRdfid());

        obj = cimData.get("SvVoltage.N0");
        assertNotNull(obj);
        assertTrue(obj instanceof SvVoltage);
        var svVoltage = (SvVoltage) obj;
        assertEquals(SvVoltage.class, svVoltage.getClass());
        assertEquals("SvVoltage", svVoltage.getCimType());
        assertEquals("SvVoltage.N0", svVoltage.getRdfid());

        assertEquals(svVoltage, topologicalNode.getSvVoltage());
        assertEquals(topologicalNode, svVoltage.getTopologicalNode());
    }

    @Test
    @Order(350)
    void testRead022() {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test022.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("TopologicalIsland.N"));
        assertTrue(cimData.containsKey("TopologicalIsland.N2"));

        var obj = cimData.get("TopologicalIsland.N");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalIsland);
        var topologicalIsland = (TopologicalIsland) obj;
        assertEquals(TopologicalIsland.class, topologicalIsland.getClass());
        assertEquals("TopologicalIsland", topologicalIsland.getCimType());
        assertEquals("TopologicalIsland.N", topologicalIsland.getRdfid());

        var attributeNames = topologicalIsland.getAttributeNames();
        assertTrue(attributeNames.contains("TopologicalNodes"));
        assertTrue(attributeNames.contains("description"));
        assertTrue(attributeNames.contains("name"));
        assertNull(topologicalIsland.getAttribute("TopologicalNodes"));
        assertEquals("Island N", topologicalIsland.getAttribute("description"));
        assertEquals("N", topologicalIsland.getAttribute("name"));

        var topologicalNodes = topologicalIsland.getTopologicalNodes();
        assertNotNull(topologicalNodes);
        assertEquals(0, topologicalNodes.size());

        obj = cimData.get("TopologicalIsland.N2");
        assertNotNull(obj);
        assertTrue(obj instanceof TopologicalIsland);
        topologicalIsland = (TopologicalIsland) obj;
        assertEquals(TopologicalIsland.class, topologicalIsland.getClass());
        assertEquals("TopologicalIsland", topologicalIsland.getCimType());
        assertEquals("TopologicalIsland.N2", topologicalIsland.getRdfid());

        attributeNames = topologicalIsland.getAttributeNames();
        assertTrue(attributeNames.contains("TopologicalNodes"));
        assertTrue(attributeNames.contains("description"));
        assertTrue(attributeNames.contains("name"));
        assertNull(topologicalIsland.getAttribute("TopologicalNodes"));
        assertNull(topologicalIsland.getAttribute("description"));
        assertNull(topologicalIsland.getAttribute("name"));

        topologicalNodes = topologicalIsland.getTopologicalNodes();
        assertNotNull(topologicalNodes);
        assertEquals(0, topologicalNodes.size());
    }

    @Test
    @Order(360)
    void testRead023() {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test023.xml")));
        assertEquals(1, cimData.size());

        assertTrue(cimData.containsKey("BaseVoltage.20"));

        var baseVoltage = cimData.get("BaseVoltage.20");
        assertNotNull(baseVoltage);

        var attributeNames = baseVoltage.getAttributeNames();
        assertTrue(attributeNames.contains("description"));
        assertTrue(attributeNames.contains("name"));
        assertEquals("<&> <&> <&>", baseVoltage.getAttribute("description"));
        assertEquals("unknown entity reference: &nbsp;", baseVoltage.getAttribute("name"));
    }

    private String getPath(String aResource) {
        var url = getClass().getClassLoader().getResource(aResource);
        assertNotNull(url);
        assertEquals("file", url.getProtocol());
        return url.getPath();
    }
}
