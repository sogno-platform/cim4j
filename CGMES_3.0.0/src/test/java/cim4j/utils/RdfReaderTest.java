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
import cim4j.EnergyConsumer;
import cim4j.EnergySchedulingType;
import cim4j.EnergySource;
import cim4j.Equipment;
import cim4j.Location;
import cim4j.Logging;
import cim4j.OperationalLimitType;
import cim4j.PowerTransformer;
import cim4j.PowerTransformerEnd;
import cim4j.Season;
import cim4j.SvStatus;
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
        assertEquals("98", voltageLevel.getAttribute("name"));
        assertEquals("98", voltageLevel.getName());

        var baseVoltage = voltageLevel.getBaseVoltage();
        assertNotNull(baseVoltage);
        assertEquals(baseVoltage, voltageLevel.getAttribute("BaseVoltage"));
        assertEquals(BaseVoltage.class, baseVoltage.getClass());
        assertEquals("BaseVoltage", baseVoltage.getCimType());
        assertEquals("BaseVoltage.20", baseVoltage.getRdfid());
        assertEquals(baseVoltage, cimData.get("BaseVoltage.20"));

        attributeNames = baseVoltage.getAttributeNames();
        assertTrue(attributeNames.contains("VoltageLevel"));
        assertTrue(attributeNames.contains("nominalVoltage"));
        assertEquals(20.0, baseVoltage.getAttribute("nominalVoltage"));

        var voltageLevels = baseVoltage.getVoltageLevel();
        assertNotNull(voltageLevels);
        assertEquals(voltageLevels, baseVoltage.getAttribute("VoltageLevel"));
        assertEquals(1, voltageLevels.size());
        assertTrue(voltageLevels.contains(voltageLevel));

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

        var analog = analogValue.getAnalog();
        assertNotNull(analog);
        assertEquals(analog, analogValue.getAttribute("Analog"));
        assertEquals(Analog.class, analog.getClass());
        assertEquals("Analog", analog.getCimType());
        assertEquals("Analog.N0.Voltage", analog.getRdfid());
        assertEquals(analog, cimData.get("Analog.N0.Voltage"));

        attributeNames = analog.getAttributeNames();
        assertTrue(attributeNames.contains("measurementType"));
        assertTrue(attributeNames.contains("unitMultiplier"));
        assertTrue(attributeNames.contains("unitSymbol"));
        assertTrue(attributeNames.contains("name"));
        assertEquals("Voltage", analog.getAttribute("measurementType"));
        assertEquals("Voltage", analog.getMeasurementType());
        assertEquals("Voltage Magnitude Measurement at N0", analog.getAttribute("name"));
        assertEquals("Voltage Magnitude Measurement at N0", analog.getName());

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

        var topologicalNode = terminal.getTopologicalNode();
        assertNotNull(topologicalNode);
        assertEquals(topologicalNode, terminal.getAttribute("TopologicalNode"));
        assertEquals(TopologicalNode.class, topologicalNode.getClass());
        assertEquals("TopologicalNode", topologicalNode.getCimType());
        assertEquals("N0", topologicalNode.getRdfid());
        assertEquals(topologicalNode, cimData.get("N0"));

        attributeNames = topologicalNode.getAttributeNames();
        assertTrue(attributeNames.contains("name"));
        assertEquals("N0", topologicalNode.getAttribute("name"));
        assertEquals("N0", topologicalNode.getName());
    }

    @Test
    @Order(140)
    void testRead004() {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test004.xml")));
        assertEquals(1, cimData.size());

        assertTrue(cimData.containsKey("BaseVoltage.20"));

        var obj = cimData.get("BaseVoltage.20");
        assertNotNull(obj);
        assertTrue(obj instanceof BaseVoltage);
        var baseVoltage = (BaseVoltage) obj;
        assertEquals(BaseVoltage.class, baseVoltage.getClass());
        assertEquals("BaseVoltage", baseVoltage.getCimType());
        assertEquals("BaseVoltage.20", baseVoltage.getRdfid());

        var attributeNames = baseVoltage.getAttributeNames();
        assertTrue(attributeNames.contains("shortName"));
        assertEquals("20", baseVoltage.getAttribute("shortName"));
        assertEquals("20", baseVoltage.getShortName());
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

            var energySchedulingType = cimData.get("EST");
            assertNotNull(energySchedulingType);
            assertEquals(energySchedulingType, energySource.getAttribute("EnergySchedulingType"));
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

            var obj = boundaryPoint.getAttribute("ConnectivityNode");
            assertNotNull(obj);
            assertTrue(obj instanceof ConnectivityNode);

            var connectivityNode = (ConnectivityNode) obj;
            assertEquals(ConnectivityNode.class, connectivityNode.getClass());
            assertEquals("ConnectivityNode", connectivityNode.getCimType());
            assertEquals("N0", connectivityNode.getRdfid());

            attributeNames = connectivityNode.getAttributeNames();
            assertTrue(attributeNames.contains("name"));
            assertEquals("N0", connectivityNode.getAttribute("name"));
            assertEquals("N0", connectivityNode.getName());
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

            var attr = operationalLimitType.getAttribute("limitType");
            assertNotNull(attr);
            assertTrue(attr instanceof String);
            var limitType = (String) attr;
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

            var attr = operationalLimitType.getAttribute("kind");
            assertNotNull(attr);
            assertTrue(attr instanceof String);
            var kind = (String) attr;
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
        assertEquals("Terminal.N0", terminal.getAttribute("name"));

        var topologicalNode = terminal.getTopologicalNode();
        assertNotNull(topologicalNode);
        assertEquals(topologicalNode, terminal.getAttribute("TopologicalNode"));
        assertEquals(TopologicalNode.class, topologicalNode.getClass());
        assertEquals("TopologicalNode", topologicalNode.getCimType());
        assertEquals("N0", topologicalNode.getRdfid());
        assertEquals(topologicalNode, cimData.get("N0"));

        attributeNames = topologicalNode.getAttributeNames();
        assertTrue(attributeNames.contains("name"));
        assertEquals("N0", topologicalNode.getAttribute("name"));
        assertEquals("N0", topologicalNode.getName());
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

            var address = cimData.get("_Address");
            assertNotNull(address);
            assertEquals(address, location.getAttribute("mainAddress"));
            assertEquals("StreetAddress", address.getCimType());
            assertEquals("_Address", address.getRdfid());

            attributeNames = address.getAttributeNames();
            assertTrue(attributeNames.contains("status"));
            assertTrue(attributeNames.contains("streetDetail"));
            assertTrue(attributeNames.contains("townDetail"));

            var status = cimData.get("_Status");
            assertNotNull(status);
            assertEquals(status, address.getAttribute("status"));
            assertEquals("Status", status.getCimType());
            assertEquals("_Status", status.getRdfid());

            var streetDetail = cimData.get("_Street");
            assertNotNull(streetDetail);
            assertEquals(streetDetail, address.getAttribute("streetDetail"));
            assertEquals("StreetDetail", streetDetail.getCimType());
            assertEquals("_Street", streetDetail.getRdfid());

            var townDetail = cimData.get("_Town");
            assertNotNull(townDetail);
            assertEquals(townDetail, address.getAttribute("townDetail"));
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
            assertEquals(true, withinTownLimits);

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

        var topologicalNodes = topologicalIsland.getTopologicalNodes();
        assertNotNull(topologicalNodes);
        assertEquals(topologicalNodes, topologicalIsland.getAttribute("TopologicalNodes"));
        assertEquals(2, topologicalNodes.size());
        assertTrue(topologicalNodes.contains(topologicalNode1));
        assertTrue(topologicalNodes.contains(topologicalNode2));

        assertEquals(topologicalIsland, topologicalNode1.getAttribute("TopologicalIsland"));
        assertEquals(topologicalIsland, topologicalNode2.getAttribute("TopologicalIsland"));
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
    @Order(330)
    void testRead020() {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test020.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("VoltageLevel.98"));
        assertTrue(cimData.containsKey("EnergyConsumer.H-5"));

        var obj = cimData.get("EnergyConsumer.H-5");
        assertNotNull(obj);
        assertTrue(obj instanceof EnergyConsumer);
        var energyConsumer = (EnergyConsumer) obj;
        assertEquals(EnergyConsumer.class, energyConsumer.getClass());
        assertEquals("EnergyConsumer", energyConsumer.getCimType());
        assertEquals("EnergyConsumer.H-5", energyConsumer.getRdfid());

        var attributeNames = energyConsumer.getAttributeNames();
        assertTrue(attributeNames.contains("EquipmentContainer"));

        var voltageLevel = energyConsumer.getEquipmentContainer();
        assertNotNull(voltageLevel);
        assertEquals(voltageLevel, energyConsumer.getAttribute("EquipmentContainer"));
        assertEquals(VoltageLevel.class, voltageLevel.getClass());
        assertEquals("VoltageLevel", voltageLevel.getCimType());
        assertEquals("VoltageLevel.98", voltageLevel.getRdfid());
        assertEquals(voltageLevel, cimData.get("VoltageLevel.98"));

        attributeNames = voltageLevel.getAttributeNames();
        assertTrue(attributeNames.contains("Equipments"));
        assertTrue(attributeNames.contains("name"));
        assertEquals("98", voltageLevel.getAttribute("name"));

        var equipments = voltageLevel.getEquipments();
        assertNotNull(equipments);
        assertEquals(equipments, voltageLevel.getAttribute("Equipments"));
        assertEquals(1, equipments.size());
        assertTrue(equipments.contains(energyConsumer));
    }

    @Test
    @Order(340)
    void testRead021() {
        Logging.setEnabled(false);
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test021.xml")));
        assertEquals(1, cimData.size());

        assertTrue(cimData.containsKey("VoltageLevel.98"));

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
        assertNull(voltageLevel.getAttribute("BaseVoltage"));
        assertEquals("98", voltageLevel.getAttribute("name"));
        assertEquals("98", voltageLevel.getName());
        Logging.setEnabled(true);
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
        assertEquals("Island N", topologicalIsland.getAttribute("description"));
        assertEquals("N", topologicalIsland.getAttribute("name"));

        var topologicalNodes = topologicalIsland.getTopologicalNodes();
        assertNotNull(topologicalNodes);
        assertEquals(topologicalNodes, topologicalIsland.getAttribute("TopologicalNodes"));
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
        assertNull(topologicalIsland.getAttribute("description"));
        assertNull(topologicalIsland.getAttribute("name"));

        topologicalNodes = topologicalIsland.getTopologicalNodes();
        assertNotNull(topologicalNodes);
        assertEquals(topologicalNodes, topologicalIsland.getAttribute("TopologicalNodes"));
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

    @Test
    @Order(370)
    void testRead024() {
        testRead_024_025_026_027_028("rdf/test024.xml");
    }

    @Test
    @Order(380)
    void testRead025() {
        testRead_024_025_026_027_028("rdf/test025.xml");
    }

    @Test
    @Order(390)
    void testRead026() {
        testRead_024_025_026_027_028("rdf/test026.xml");
    }

    @Test
    @Order(400)
    void testRead027() {
        testRead_024_025_026_027_028("rdf/test027.xml");
    }

    @Test
    @Order(410)
    void testRead028() {
        testRead_024_025_026_027_028("rdf/test028.xml");
    }

    private void testRead_024_025_026_027_028(String test_024_025_026_027_028) {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath(test_024_025_026_027_028)));
        assertEquals(3, cimData.size());

        assertTrue(cimData.containsKey("_VL"));
        assertTrue(cimData.containsKey("_PT"));
        assertTrue(cimData.containsKey("_PTE"));

        var obj = cimData.get("_VL");
        assertNotNull(obj);
        assertTrue(obj instanceof VoltageLevel);
        var voltageLevel = (VoltageLevel) obj;
        assertEquals(VoltageLevel.class, voltageLevel.getClass());
        assertEquals("VoltageLevel", voltageLevel.getCimType());
        assertEquals("_VL", voltageLevel.getRdfid());
        assertEquals("VL", voltageLevel.getName());

        obj = cimData.get("_PT");
        assertNotNull(obj);
        assertTrue(obj instanceof PowerTransformer);
        var powerTransformer = (PowerTransformer) obj;
        assertEquals(PowerTransformer.class, powerTransformer.getClass());
        assertEquals("PowerTransformer", powerTransformer.getCimType());
        assertEquals("_PT", powerTransformer.getRdfid());
        assertEquals("PT", powerTransformer.getName());
        assertEquals("PowerTransformer", powerTransformer.getDescription());

        obj = cimData.get("_PTE");
        assertNotNull(obj);
        assertTrue(obj instanceof PowerTransformerEnd);
        var powerTransformerEnd = (PowerTransformerEnd) obj;
        assertEquals(PowerTransformerEnd.class, powerTransformerEnd.getClass());
        assertEquals("PowerTransformerEnd", powerTransformerEnd.getCimType());
        assertEquals("_PTE", powerTransformerEnd.getRdfid());

        assertEquals(powerTransformer, powerTransformerEnd.getPowerTransformer());
        var powerTransformerEnds = powerTransformer.getPowerTransformerEnd();
        assertNotNull(powerTransformerEnds);
        assertEquals(1, powerTransformerEnds.size());
        assertTrue(powerTransformerEnds.contains(powerTransformerEnd));

        assertEquals(voltageLevel, powerTransformer.getEquipmentContainer());
        var equipments = voltageLevel.getEquipments();
        assertNotNull(equipments);
        assertEquals(1, equipments.size());
        assertTrue(equipments.contains(powerTransformer));
    }

    @Test
    @Order(420)
    void testRead029() {
        testRead_029_030_031_032("rdf/test029.xml");
    }

    @Test
    @Order(430)
    void testRead030() {
        testRead_029_030_031_032("rdf/test030.xml");
    }

    @Test
    @Order(440)
    void testRead031() {
        testRead_029_030_031_032("rdf/test031.xml");
    }

    @Test
    @Order(450)
    void testRead032() {
        testRead_029_030_031_032("rdf/test032.xml");
    }

    private void testRead_029_030_031_032(String test_029_030_031_032) {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath(test_029_030_031_032)));
        assertEquals(3, cimData.size());

        assertTrue(cimData.containsKey("_VL0"));
        assertTrue(cimData.containsKey("_VL"));
        assertTrue(cimData.containsKey("_PT"));

        var obj = cimData.get("_VL");
        assertNotNull(obj);
        assertTrue(obj instanceof VoltageLevel);
        var voltageLevel = (VoltageLevel) obj;

        obj = cimData.get("_PT");
        assertNotNull(obj);
        assertTrue(obj instanceof PowerTransformer);
        var powerTransformer = (PowerTransformer) obj;

        assertEquals("PT", powerTransformer.getName());
        assertEquals(voltageLevel, powerTransformer.getEquipmentContainer());

        var equipments = voltageLevel.getEquipments();
        assertNotNull(equipments);
        assertEquals(1, equipments.size());
        assertTrue(equipments.contains(powerTransformer));
    }

    @Test
    @Order(460)
    void testRead033() {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test033.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("_VL"));
        assertTrue(cimData.containsKey("_PT"));

        var obj = cimData.get("_VL");
        assertNotNull(obj);
        assertTrue(obj instanceof VoltageLevel);
        var voltageLevel = (VoltageLevel) obj;

        obj = cimData.get("_PT");
        assertNotNull(obj);
        assertTrue(obj instanceof PowerTransformer);
        var powerTransformer = (PowerTransformer) obj;

        assertEquals("PT", powerTransformer.getName());
        assertEquals(voltageLevel, powerTransformer.getEquipmentContainer());

        var equipments = voltageLevel.getEquipments();
        assertNotNull(equipments);
        assertEquals(1, equipments.size());
        assertTrue(equipments.contains(powerTransformer));
    }

    @Test
    @Order(470)
    void testRead034() {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test034.xml")));
        assertEquals(3, cimData.size());

        assertTrue(cimData.containsKey("_VL"));
        assertTrue(cimData.containsKey("_PT"));
        assertTrue(cimData.containsKey("_PT2"));

        var obj = cimData.get("_VL");
        assertNotNull(obj);
        assertTrue(obj instanceof VoltageLevel);
        var voltageLevel = (VoltageLevel) obj;

        obj = cimData.get("_PT");
        assertNotNull(obj);
        assertTrue(obj instanceof PowerTransformer);
        var powerTransformer1 = (PowerTransformer) obj;

        obj = cimData.get("_PT2");
        assertNotNull(obj);
        assertTrue(obj instanceof PowerTransformer);
        var powerTransformer2 = (PowerTransformer) obj;

        assertEquals("PT", powerTransformer1.getName());
        assertEquals(voltageLevel, powerTransformer1.getEquipmentContainer());

        assertEquals("PT2", powerTransformer2.getName());
        assertEquals(voltageLevel, powerTransformer2.getEquipmentContainer());

        var equipments = voltageLevel.getEquipments();
        assertNotNull(equipments);
        assertEquals(2, equipments.size());
        assertTrue(equipments.contains(powerTransformer1));
        assertTrue(equipments.contains(powerTransformer2));
    }

    @Test
    @Order(480)
    void testRead035() {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test035.xml")));
        assertEquals(3, cimData.size());

        assertTrue(cimData.containsKey("_VL"));
        assertTrue(cimData.containsKey("_PT"));
        assertTrue(cimData.containsKey("_PT2"));

        var obj = cimData.get("_VL");
        assertNotNull(obj);
        assertTrue(obj instanceof VoltageLevel);
        var voltageLevel = (VoltageLevel) obj;

        obj = cimData.get("_PT");
        assertNotNull(obj);
        assertTrue(obj instanceof PowerTransformer);
        var powerTransformer1 = (PowerTransformer) obj;

        obj = cimData.get("_PT2");
        assertNotNull(obj);
        assertTrue(obj instanceof PowerTransformer);
        var powerTransformer2 = (PowerTransformer) obj;

        assertEquals("PT", powerTransformer1.getName());
        assertEquals(voltageLevel, powerTransformer1.getEquipmentContainer());

        assertEquals("PT2", powerTransformer2.getName());
        assertEquals(voltageLevel, powerTransformer2.getEquipmentContainer());

        var equipments = voltageLevel.getEquipments();
        assertNotNull(equipments);
        assertEquals(2, equipments.size());
        assertTrue(equipments.contains(powerTransformer1));
        assertTrue(equipments.contains(powerTransformer2));
    }

    @Test
    @Order(490)
    void testRead036() {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test036.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("_Status"));
        assertTrue(cimData.containsKey("_PT"));

        var obj = cimData.get("_Status");
        assertNotNull(obj);
        assertTrue(obj instanceof SvStatus);
        var svStatus = (SvStatus) obj;

        obj = cimData.get("_PT");
        assertNotNull(obj);
        assertTrue(obj instanceof PowerTransformer);
        var powerTransformer = (PowerTransformer) obj;

        assertEquals("PT", powerTransformer.getName());
        assertEquals("PowerTransformer", powerTransformer.getDescription());
        assertEquals(svStatus, powerTransformer.getSvStatus());

        assertEquals(powerTransformer, svStatus.getConductingEquipment());
    }

    @Test
    @Order(500)
    void testRead037() {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test037.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("_Status"));
        assertTrue(cimData.containsKey("_PT"));

        var obj = cimData.get("_Status");
        assertNotNull(obj);
        assertTrue(obj instanceof SvStatus);
        var svStatus = (SvStatus) obj;

        obj = cimData.get("_PT");
        assertNotNull(obj);
        assertTrue(obj instanceof PowerTransformer);
        var powerTransformer = (PowerTransformer) obj;

        assertEquals("PT", powerTransformer.getName());
        assertEquals("PowerTransformer", powerTransformer.getDescription());
        assertEquals(svStatus, powerTransformer.getSvStatus());

        assertEquals(powerTransformer, svStatus.getConductingEquipment());
    }

    @Test
    @Order(510)
    void testRead038() {
        Logging.setEnabled(false);
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test038.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("_Status"));
        assertTrue(cimData.containsKey("_PT"));

        var obj = cimData.get("_Status");
        assertNotNull(obj);
        assertTrue(obj instanceof SvStatus);
        var svStatus = (SvStatus) obj;

        obj = cimData.get("_PT");
        assertNotNull(obj);
        assertTrue(obj instanceof Equipment);
        var equipment = (Equipment) obj;
        assertEquals(Equipment.class, equipment.getClass());
        assertEquals("Equipment", equipment.getCimType());
        assertEquals("_PT", equipment.getRdfid());

        assertEquals("PowerTransformer", equipment.getDescription());
        assertNull(svStatus.getConductingEquipment());
        Logging.setEnabled(true);
    }

    private String getPath(String aResource) {
        var url = getClass().getClassLoader().getResource(aResource);
        assertNotNull(url);
        assertEquals("file", url.getProtocol());
        return url.getPath();
    }
}
