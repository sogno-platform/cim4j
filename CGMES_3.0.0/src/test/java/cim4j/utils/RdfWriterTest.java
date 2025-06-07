package cim4j.utils;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.StringWriter;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import cim4j.BaseClass;
import cim4j.BaseVoltage;
import cim4j.CGMESProfile;
import cim4j.CimClassMap;
import cim4j.CimConstants;
import cim4j.Logging;
import cim4j.SvVoltage;
import cim4j.TopologicalIsland;
import cim4j.TopologicalNode;
import cim4j.VoltageLevel;

/**
 * Test writing CIM data to RDF files.
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RdfWriterTest {

    private static final String XML_HEADER = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
    private static final String RDF = CimConstants.NAMESPACES_MAP.get("rdf");
    private static final String CIM = CimConstants.NAMESPACES_MAP.get("cim");
    private static final String MD = CimConstants.NAMESPACES_MAP.get("md");
    private static final String RDF_HEADER = "<rdf:RDF xmlns:cim=\"" + CIM + "\"" + " xmlns:rdf=\"" + RDF + "\">";
    private static final String ENTSOE_EU = CimConstants.CIM_VERSION.equals("cgmes_v3_0_0") ? "eu" : "entsoe";
    private static final String RDF_HEADER_EU = "<rdf:RDF xmlns:cim=\"" + CIM + "\" xmlns:" + ENTSOE_EU + "=\""
            + CimConstants.NAMESPACES_MAP.get(ENTSOE_EU) + "\" xmlns:rdf=\"" + RDF + "\">";
    private static final String RDF_HEADER_MD = "<rdf:RDF xmlns:cim=\"" + CIM + "\" xmlns:md=\"" + MD
            + "\" xmlns:rdf=\"" + RDF + "\">";
    private static final String SV_PROFILE = CGMESProfile.SV.getUris().get(0);
    private static final String TP_PROFILE = CGMESProfile.TP.getUris().get(0);

    @Test
    @Order(100)
    void testRdfWriter() {
        // Check creating a writer
        var rdfWriter = new RdfWriter();
        assertNotNull(rdfWriter);
    }

    @Test
    @Order(110)
    void testGetCimData() {
        // Check getting CIM data from a writer
        var rdfWriter = new RdfWriter();
        var cimData = rdfWriter.getCimData();
        assertNotNull(cimData);
        assertTrue(cimData.isEmpty());
    }

    @Test
    @Order(120)
    void testAddCimData() {
        // Check adding CIM data to a writer
        var rdfWriter = new RdfWriter();

        var cimObj = CimClassMap.createCimObject("Location", "rdfid");
        rdfWriter.addCimData(Map.of("rdfid", cimObj));

        var cimData = rdfWriter.getCimData();
        assertEquals(1, cimData.size());

        var cimObj2 = cimData.get("rdfid");
        assertNotNull(cimObj2);
        assertEquals("rdfid", cimObj2.getRdfid());
    }

    @Test
    @Order(130)
    void testWrite001() {
        // Check CIM objects with primitive, datatype and class attribute (ManyToOne)
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test001.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("VoltageLevel.98"));
        assertTrue(cimData.containsKey("BaseVoltage.20"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(10, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:BaseVoltage rdf:ID=\"BaseVoltage.20\">", lines[2]);
        assertEquals("    <cim:BaseVoltage.nominalVoltage>20.0</cim:BaseVoltage.nominalVoltage>", lines[3]);
        assertEquals("  </cim:BaseVoltage>", lines[4]);
        assertEquals("  <cim:VoltageLevel rdf:ID=\"VoltageLevel.98\">", lines[5]);
        assertEquals("    <cim:VoltageLevel.BaseVoltage rdf:resource=\"#BaseVoltage.20\"/>", lines[6]);
        assertEquals("    <cim:IdentifiedObject.name>98</cim:IdentifiedObject.name>", lines[7]);
        assertEquals("  </cim:VoltageLevel>", lines[8]);
        assertEquals("</rdf:RDF>", lines[9]);
    }

    @Test
    @Order(140)
    void testWrite002() {
        // Check enum attributes
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test002.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("Analog.N0.Voltage"));
        assertTrue(cimData.containsKey("AnalogValue.N0.Voltage"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(12, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:Analog rdf:ID=\"Analog.N0.Voltage\">", lines[2]);
        assertEquals("    <cim:Measurement.measurementType>Voltage</cim:Measurement.measurementType>", lines[3]);
        assertEquals("    <cim:Measurement.unitMultiplier rdf:resource=\"" + CIM + "UnitMultiplier.k\"/>", lines[4]);
        assertEquals("    <cim:Measurement.unitSymbol rdf:resource=\"" + CIM + "UnitSymbol.V\"/>", lines[5]);
        assertEquals("    <cim:IdentifiedObject.name>Voltage Magnitude Measurement at N0</cim:IdentifiedObject.name>",
                lines[6]);
        assertEquals("  </cim:Analog>", lines[7]);
        assertEquals("  <cim:AnalogValue rdf:ID=\"AnalogValue.N0.Voltage\">", lines[8]);
        assertEquals("    <cim:AnalogValue.Analog rdf:resource=\"#Analog.N0.Voltage\"/>", lines[9]);
        assertEquals("  </cim:AnalogValue>", lines[10]);
        assertEquals("</rdf:RDF>", lines[11]);
    }

    @Test
    @Order(150)
    void testWrite003() {
        // Check reading rdf:about instead of rdf:ID
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test003.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("N0"));
        assertTrue(cimData.containsKey("Terminal.N0"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(9, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:TopologicalNode rdf:ID=\"N0\">", lines[2]);
        assertEquals("    <cim:IdentifiedObject.name>N0</cim:IdentifiedObject.name>", lines[3]);
        assertEquals("  </cim:TopologicalNode>", lines[4]);
        assertEquals("  <cim:Terminal rdf:ID=\"Terminal.N0\">", lines[5]);
        assertEquals("    <cim:Terminal.TopologicalNode rdf:resource=\"#N0\"/>", lines[6]);
        assertEquals("  </cim:Terminal>", lines[7]);
        assertEquals("</rdf:RDF>", lines[8]);
    }

    @Test
    @Order(160)
    void testWrite004() {
        // Check reading model header
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test004.xml")));
        assertEquals(1, cimData.size());

        assertTrue(cimData.containsKey("BaseVoltage.20"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(7, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER_EU, lines[1]);
        assertEquals("  <cim:BaseVoltage rdf:ID=\"BaseVoltage.20\">", lines[2]);
        assertEquals("    <cim:BaseVoltage.nominalVoltage>20.0</cim:BaseVoltage.nominalVoltage>", lines[3]);
        assertEquals("    <" + ENTSOE_EU + ":IdentifiedObject.shortName>20</" + ENTSOE_EU
                + ":IdentifiedObject.shortName>", lines[4]);
        assertEquals("  </cim:BaseVoltage>", lines[5]);
        assertEquals("</rdf:RDF>", lines[6]);
    }

    @Test
    @Order(170)
    void testWrite005() {
        // Check custom namespaces
        if (CimConstants.CIM_VERSION.equals("cgmes_v2_4_13")) {
            // There is no class or list attribute in cgmes_v2_4_13 with entsoe namespace
        } else if (CimConstants.CIM_VERSION.equals("cgmes_v2_4_15")) {
            var rdfReader = new RdfReader();
            var cimData = rdfReader.read(List.of(getPath("rdf/test005_CGMES2.xml")));
            assertEquals(2, cimData.size());

            assertTrue(cimData.containsKey("ES"));
            assertTrue(cimData.containsKey("EST"));

            var rdfWriter = new RdfWriter();
            rdfWriter.addCimData(cimData);
            rdfWriter.write("target/test.xml");

            var stringWriter = new StringWriter();
            rdfWriter.write(stringWriter);
            String result = stringWriter.toString();

            var lines = result.lines().toArray();
            assertEquals(9, lines.length);
            assertEquals(XML_HEADER, lines[0]);
            assertEquals(RDF_HEADER_EU, lines[1]);
            assertEquals("  <cim:EnergySource rdf:ID=\"ES\">", lines[2]);
            assertEquals("    <entsoe:EnergySource.EnergySchedulingType rdf:resource=\"#EST\"/>", lines[3]);
            assertEquals("  </cim:EnergySource>", lines[4]);
            assertEquals("  <entsoe:EnergySchedulingType rdf:ID=\"EST\">", lines[5]);
            assertEquals("    <cim:IdentifiedObject.name>EST</cim:IdentifiedObject.name>", lines[6]);
            assertEquals("  </entsoe:EnergySchedulingType>", lines[7]);
            assertEquals("</rdf:RDF>", lines[8]);
        } else if (CimConstants.CIM_VERSION.equals("cgmes_v3_0_0")) {
            var rdfReader = new RdfReader();
            var cimData = rdfReader.read(List.of(getPath("rdf/test005_CGMES3.xml")));
            assertEquals(2, cimData.size());

            assertTrue(cimData.containsKey("N0"));
            assertTrue(cimData.containsKey("N0_BP"));

            var rdfWriter = new RdfWriter();
            rdfWriter.addCimData(cimData);
            rdfWriter.write("target/test.xml");

            var stringWriter = new StringWriter();
            rdfWriter.write(stringWriter);
            String result = stringWriter.toString();

            var lines = result.lines().toArray();
            assertEquals(9, lines.length);
            assertEquals(XML_HEADER, lines[0]);
            assertEquals(RDF_HEADER_EU, lines[1]);
            assertEquals("  <cim:ConnectivityNode rdf:ID=\"N0\">", lines[2]);
            assertEquals("    <cim:IdentifiedObject.name>N0</cim:IdentifiedObject.name>", lines[3]);
            assertEquals("  </cim:ConnectivityNode>", lines[4]);
            assertEquals("  <eu:BoundaryPoint rdf:ID=\"N0_BP\">", lines[5]);
            assertEquals("    <eu:BoundaryPoint.ConnectivityNode rdf:resource=\"#N0\"/>", lines[6]);
            assertEquals("  </eu:BoundaryPoint>", lines[7]);
            assertEquals("</rdf:RDF>", lines[8]);
        }
    }

    @Test
    @Order(180)
    void testWrite006() {
        // Check enum attribute with custom namespace
        if (CimConstants.CIM_VERSION.equals("cgmes_v2_4_13") || CimConstants.CIM_VERSION.equals("cgmes_v2_4_15")) {
            var rdfReader = new RdfReader();
            var cimData = rdfReader.read(List.of(getPath("rdf/test006_CGMES2.xml")));
            assertEquals(1, cimData.size());

            assertTrue(cimData.containsKey("OLT"));

            var rdfWriter = new RdfWriter();
            rdfWriter.addCimData(cimData);
            rdfWriter.write("target/test.xml");

            var stringWriter = new StringWriter();
            rdfWriter.write(stringWriter);
            String result = stringWriter.toString();

            var lines = result.lines().toArray();
            assertEquals(7, lines.length);
            assertEquals(XML_HEADER, lines[0]);
            assertEquals(RDF_HEADER_EU, lines[1]);
            assertEquals("  <cim:OperationalLimitType rdf:ID=\"OLT\">", lines[2]);
            assertEquals("    <entsoe:OperationalLimitType.limitType rdf:resource=\""
                    + CimConstants.NAMESPACES_MAP.get("entsoe") + "LimitTypeKind.highVoltage\"/>", lines[3]);
            assertEquals("    <cim:IdentifiedObject.name>High Voltage</cim:IdentifiedObject.name>", lines[4]);
            assertEquals("  </cim:OperationalLimitType>", lines[5]);
            assertEquals("</rdf:RDF>", lines[6]);
        } else if (CimConstants.CIM_VERSION.equals("cgmes_v3_0_0")) {
            var rdfReader = new RdfReader();
            var cimData = rdfReader.read(List.of(getPath("rdf/test006_CGMES3.xml")));
            assertEquals(1, cimData.size());

            assertTrue(cimData.containsKey("OLT"));

            var rdfWriter = new RdfWriter();
            rdfWriter.addCimData(cimData);
            rdfWriter.write("target/test.xml");

            var stringWriter = new StringWriter();
            rdfWriter.write(stringWriter);
            String result = stringWriter.toString();

            var lines = result.lines().toArray();
            assertEquals(7, lines.length);
            assertEquals(XML_HEADER, lines[0]);
            assertEquals(RDF_HEADER_EU, lines[1]);
            assertEquals("  <cim:OperationalLimitType rdf:ID=\"OLT\">", lines[2]);
            assertEquals("    <eu:OperationalLimitType.kind rdf:resource=\""
                    + CimConstants.NAMESPACES_MAP.get("eu") + "LimitKind.highVoltage\"/>", lines[3]);
            assertEquals("    <cim:IdentifiedObject.name>High Voltage</cim:IdentifiedObject.name>", lines[4]);
            assertEquals("  </cim:OperationalLimitType>", lines[5]);
            assertEquals("</rdf:RDF>", lines[6]);
        }
    }

    @Test
    @Order(190)
    void testWrite007() {
        // Check class attributes if the linked object is defined later
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test007.xml")));
        assertEquals(4, cimData.size());

        assertTrue(cimData.containsKey("VoltageLevel.96"));
        assertTrue(cimData.containsKey("VoltageLevel.97"));
        assertTrue(cimData.containsKey("VoltageLevel.98"));
        assertTrue(cimData.containsKey("BaseVoltage.20"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(15, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:VoltageLevel rdf:ID=\"VoltageLevel.96\">", lines[2]);
        assertEquals("    <cim:VoltageLevel.BaseVoltage rdf:resource=\"#BaseVoltage.20\"/>", lines[3]);
        assertEquals("  </cim:VoltageLevel>", lines[4]);
        assertEquals("  <cim:VoltageLevel rdf:ID=\"VoltageLevel.97\">", lines[5]);
        assertEquals("    <cim:VoltageLevel.BaseVoltage rdf:resource=\"#BaseVoltage.20\"/>", lines[6]);
        assertEquals("  </cim:VoltageLevel>", lines[7]);
        assertEquals("  <cim:BaseVoltage rdf:ID=\"BaseVoltage.20\">", lines[8]);
        assertEquals("    <cim:BaseVoltage.nominalVoltage>20.0</cim:BaseVoltage.nominalVoltage>", lines[9]);
        assertEquals("  </cim:BaseVoltage>", lines[10]);
        assertEquals("  <cim:VoltageLevel rdf:ID=\"VoltageLevel.98\">", lines[11]);
        assertEquals("    <cim:VoltageLevel.BaseVoltage rdf:resource=\"#BaseVoltage.20\"/>", lines[12]);
        assertEquals("  </cim:VoltageLevel>", lines[13]);
        assertEquals("</rdf:RDF>", lines[14]);
    }

    @Test
    @Order(200)
    void testWrite008_EQ_TP() {
        // Check reading models from more than one file
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test008_EQ.xml"), getPath("rdf/test008_TP.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("N0"));
        assertTrue(cimData.containsKey("Terminal.N0"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(10, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:Terminal rdf:ID=\"Terminal.N0\">", lines[2]);
        assertEquals("    <cim:Terminal.TopologicalNode rdf:resource=\"#N0\"/>", lines[3]);
        assertEquals("    <cim:IdentifiedObject.name>Terminal.N0</cim:IdentifiedObject.name>", lines[4]);
        assertEquals("  </cim:Terminal>", lines[5]);
        assertEquals("  <cim:TopologicalNode rdf:ID=\"N0\">", lines[6]);
        assertEquals("    <cim:IdentifiedObject.name>N0</cim:IdentifiedObject.name>", lines[7]);
        assertEquals("  </cim:TopologicalNode>", lines[8]);
        assertEquals("</rdf:RDF>", lines[9]);
    }

    @Test
    @Order(210)
    void testWrite008_TP_EQ() {
        // Check reading models from more than one file in reverse order
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test008_TP.xml"), getPath("rdf/test008_EQ.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("N0"));
        assertTrue(cimData.containsKey("Terminal.N0"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(10, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:TopologicalNode rdf:ID=\"N0\">", lines[2]);
        assertEquals("    <cim:IdentifiedObject.name>N0</cim:IdentifiedObject.name>", lines[3]);
        assertEquals("  </cim:TopologicalNode>", lines[4]);
        assertEquals("  <cim:Terminal rdf:ID=\"Terminal.N0\">", lines[5]);
        assertEquals("    <cim:Terminal.TopologicalNode rdf:resource=\"#N0\"/>", lines[6]);
        assertEquals("    <cim:IdentifiedObject.name>Terminal.N0</cim:IdentifiedObject.name>", lines[7]);
        assertEquals("  </cim:Terminal>", lines[8]);
        assertEquals("</rdf:RDF>", lines[9]);
    }

    @Test
    @Order(220)
    void testWrite009_EQ_TP() {
        // Check reading one object from more than one file
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test009_EQ.xml"), getPath("rdf/test009_TP.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("N0"));
        assertTrue(cimData.containsKey("Terminal.N0"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(10, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:Terminal rdf:ID=\"Terminal.N0\">", lines[2]);
        assertEquals("    <cim:Terminal.TopologicalNode rdf:resource=\"#N0\"/>", lines[3]);
        assertEquals("    <cim:IdentifiedObject.name>Terminal.N0</cim:IdentifiedObject.name>", lines[4]);
        assertEquals("  </cim:Terminal>", lines[5]);
        assertEquals("  <cim:TopologicalNode rdf:ID=\"N0\">", lines[6]);
        assertEquals("    <cim:IdentifiedObject.name>N0</cim:IdentifiedObject.name>", lines[7]);
        assertEquals("  </cim:TopologicalNode>", lines[8]);
        assertEquals("</rdf:RDF>", lines[9]);
    }

    @Test
    @Order(230)
    void testWrite009_TP_EQ() {
        // Check reading one object from more than one file in reverse order
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test009_TP.xml"), getPath("rdf/test009_EQ.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("N0"));
        assertTrue(cimData.containsKey("Terminal.N0"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(10, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:TopologicalNode rdf:ID=\"N0\">", lines[2]);
        assertEquals("    <cim:IdentifiedObject.name>N0</cim:IdentifiedObject.name>", lines[3]);
        assertEquals("  </cim:TopologicalNode>", lines[4]);
        assertEquals("  <cim:Terminal rdf:ID=\"Terminal.N0\">", lines[5]);
        assertEquals("    <cim:Terminal.TopologicalNode rdf:resource=\"#N0\"/>", lines[6]);
        assertEquals("    <cim:IdentifiedObject.name>Terminal.N0</cim:IdentifiedObject.name>", lines[7]);
        assertEquals("  </cim:Terminal>", lines[8]);
        assertEquals("</rdf:RDF>", lines[9]);
    }

    @Test
    @Order(240)
    void testWrite010() {
        // Check text with non ASCII utf-8 characters
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test010.xml")));
        assertEquals(1, cimData.size());

        assertTrue(cimData.containsKey("BaseVoltage.20"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(6, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:BaseVoltage rdf:ID=\"BaseVoltage.20\">", lines[2]);
        assertEquals("    <cim:IdentifiedObject.description>€ÄÖÜäöüß</cim:IdentifiedObject.description>", lines[3]);
        assertEquals("  </cim:BaseVoltage>", lines[4]);
        assertEquals("</rdf:RDF>", lines[5]);
    }

    @Test
    @Order(250)
    void testWrite011() {
        // Check class attributes to Status, StreetAddress, StreetDetail, TownDetail
        // (to make sure they are not primitive string attributes, only for CGMES3)
        if (CimConstants.CIM_VERSION.equals("cgmes_v3_0_0")) {
            var rdfReader = new RdfReader();
            var cimData = rdfReader.read(List.of(getPath("rdf/test011_CGMES3.xml")));
            assertEquals(5, cimData.size());

            assertTrue(cimData.containsKey("_Location"));
            assertTrue(cimData.containsKey("_Address"));
            assertTrue(cimData.containsKey("_Status"));
            assertTrue(cimData.containsKey("_Street"));
            assertTrue(cimData.containsKey("_Town"));

            var rdfWriter = new RdfWriter();
            rdfWriter.addCimData(cimData);
            rdfWriter.write("target/test.xml");

            var stringWriter = new StringWriter();
            rdfWriter.write(stringWriter);
            String result = stringWriter.toString();

            var lines = result.lines().toArray();
            assertEquals(24, lines.length);
            assertEquals(XML_HEADER, lines[0]);
            assertEquals(RDF_HEADER, lines[1]);
            assertEquals("  <cim:Location rdf:ID=\"_Location\">", lines[2]);
            assertEquals("    <cim:Location.mainAddress rdf:resource=\"#_Address\"/>", lines[3]);
            assertEquals("  </cim:Location>", lines[4]);
            assertEquals("  <cim:StreetAddress rdf:ID=\"_Address\">", lines[5]);
            assertEquals("    <cim:StreetAddress.status rdf:resource=\"#_Status\"/>", lines[6]);
            assertEquals("    <cim:StreetAddress.streetDetail rdf:resource=\"#_Street\"/>", lines[7]);
            assertEquals("    <cim:StreetAddress.townDetail rdf:resource=\"#_Town\"/>", lines[8]);
            assertEquals("  </cim:StreetAddress>", lines[9]);
            assertEquals("  <cim:Status rdf:ID=\"_Status\">", lines[10]);
            assertEquals("    <cim:Status.dateTime>2024-10-13 19:17:22 +0200</cim:Status.dateTime>", lines[11]);
            assertEquals("    <cim:Status.value>verified</cim:Status.value>", lines[12]);
            assertEquals("  </cim:Status>", lines[13]);
            assertEquals("  <cim:StreetDetail rdf:ID=\"_Street\">", lines[14]);
            assertEquals("    <cim:StreetDetail.name>Ku'damm</cim:StreetDetail.name>", lines[15]);
            assertEquals("    <cim:StreetDetail.number>33</cim:StreetDetail.number>", lines[16]);
            assertEquals("    <cim:StreetDetail.withinTownLimits>true</cim:StreetDetail.withinTownLimits>", lines[17]);
            assertEquals("  </cim:StreetDetail>", lines[18]);
            assertEquals("  <cim:TownDetail rdf:ID=\"_Town\">", lines[19]);
            assertEquals("    <cim:TownDetail.country>Germany</cim:TownDetail.country>", lines[20]);
            assertEquals("    <cim:TownDetail.name>Berlin</cim:TownDetail.name>", lines[21]);
            assertEquals("  </cim:TownDetail>", lines[22]);
            assertEquals("</rdf:RDF>", lines[23]);
        }
    }

    @Test
    @Order(260)
    void testWrite012() {
        // Check MonthDay as primitive string attribute
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test012.xml")));
        assertEquals(1, cimData.size());

        assertTrue(cimData.containsKey("_Season"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(7, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:Season rdf:ID=\"_Season\">", lines[2]);
        assertEquals("    <cim:Season.endDate>--10-31</cim:Season.endDate>", lines[3]);
        assertEquals("    <cim:Season.startDate>--10-13</cim:Season.startDate>", lines[4]);
        assertEquals("  </cim:Season>", lines[5]);
        assertEquals("</rdf:RDF>", lines[6]);
    }

    @Test
    @Order(270)
    void testWrite013() {
        // Check list attributes (TopologicalIsland to TopologicalNode, OneToMany)
        testWrite_013_014_015_016("rdf/test013.xml");
    }

    @Test
    @Order(280)
    void testWrite014() {
        // Check links from TopologicalNode to TopologicalIsland (not CGMES conform)
        testWrite_013_014_015_016("rdf/test014.xml");
    }

    @Test
    @Order(290)
    void testWrite015() {
        // Check reading links between TopologicalNode and TopologicalIsland
        // if they are set on both sides (not CGMES conform)
        testWrite_013_014_015_016("rdf/test015.xml");
    }

    @Test
    @Order(300)
    void testWrite016() {
        // Check reading mixed links between TopologicalNode and TopologicalIsland:
        // one from TopologicalIsland to TopologicalNode and the other
        // from TopologicalNode to TopologicalIsland (not CGMES conform)
        testWrite_013_014_015_016("rdf/test016.xml");
    }

    private void testWrite_013_014_015_016(String test_013_014_015_016) {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath(test_013_014_015_016)));
        assertEquals(3, cimData.size());

        assertTrue(cimData.containsKey("TopologicalIsland.N"));
        assertTrue(cimData.containsKey("N0"));
        assertTrue(cimData.containsKey("N1"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(14, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:TopologicalIsland rdf:ID=\"TopologicalIsland.N\">", lines[2]);
        assertEquals("    <cim:TopologicalIsland.TopologicalNodes rdf:resource=\"#N0\"/>", lines[3]);
        assertEquals("    <cim:TopologicalIsland.TopologicalNodes rdf:resource=\"#N1\"/>", lines[4]);
        assertEquals("    <cim:IdentifiedObject.name>N</cim:IdentifiedObject.name>", lines[5]);
        assertEquals("  </cim:TopologicalIsland>", lines[6]);
        assertEquals("  <cim:TopologicalNode rdf:ID=\"N0\">", lines[7]);
        assertEquals("    <cim:IdentifiedObject.name>N0</cim:IdentifiedObject.name>", lines[8]);
        assertEquals("  </cim:TopologicalNode>", lines[9]);
        assertEquals("  <cim:TopologicalNode rdf:ID=\"N1\">", lines[10]);
        assertEquals("    <cim:IdentifiedObject.name>N1</cim:IdentifiedObject.name>", lines[11]);
        assertEquals("  </cim:TopologicalNode>", lines[12]);
        assertEquals("</rdf:RDF>", lines[13]);
    }

    @Test
    @Order(310)
    void testWrite017() {
        // Check class attributes (SvVoltage to TopologicalNode, OneToOne)
        testWrite_017_018_019("rdf/test017.xml");
    }

    @Test
    @Order(320)
    void testWrite018() {
        // Check link from TopologicalNode to SvVoltage (not CGMES conform)
        testWrite_017_018_019("rdf/test018.xml");
    }

    @Test
    @Order(330)
    void testWrite019() {
        // Check reading links between SvVoltage and TopologicalNode
        // if they are set on both sides (not CGMES conform)
        testWrite_017_018_019("rdf/test019.xml");
    }

    private void testWrite_017_018_019(String test_017_018_019) {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath(test_017_018_019)));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("N0"));
        assertTrue(cimData.containsKey("SvVoltage.N0"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(10, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:TopologicalNode rdf:ID=\"N0\">", lines[2]);
        assertEquals("    <cim:IdentifiedObject.name>N0</cim:IdentifiedObject.name>", lines[3]);
        assertEquals("  </cim:TopologicalNode>", lines[4]);
        assertEquals("  <cim:SvVoltage rdf:ID=\"SvVoltage.N0\">", lines[5]);
        assertEquals("    <cim:SvVoltage.TopologicalNode rdf:resource=\"#N0\"/>", lines[6]);
        assertEquals("    <cim:SvVoltage.v>110.5</cim:SvVoltage.v>", lines[7]);
        assertEquals("  </cim:SvVoltage>", lines[8]);
        assertEquals("</rdf:RDF>", lines[9]);
    }

    @Test
    @Order(340)
    void testWrite020() {
        // Check inherited object links
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test020.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("VoltageLevel.98"));
        assertTrue(cimData.containsKey("EnergyConsumer.H-5"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(9, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:VoltageLevel rdf:ID=\"VoltageLevel.98\">", lines[2]);
        assertEquals("    <cim:IdentifiedObject.name>98</cim:IdentifiedObject.name>", lines[3]);
        assertEquals("  </cim:VoltageLevel>", lines[4]);
        assertEquals("  <cim:EnergyConsumer rdf:ID=\"EnergyConsumer.H-5\">", lines[5]);
        assertEquals("    <cim:Equipment.EquipmentContainer rdf:resource=\"#VoltageLevel.98\"/>", lines[6]);
        assertEquals("  </cim:EnergyConsumer>", lines[7]);
        assertEquals("</rdf:RDF>", lines[8]);
    }

    @Test
    @Order(350)
    void testWrite021() {
        // Check handling links to not existing objects (causing an error log entry)
        Logging.setEnabled(false);
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test021.xml")));
        assertEquals(1, cimData.size());

        assertTrue(cimData.containsKey("VoltageLevel.98"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(6, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:VoltageLevel rdf:ID=\"VoltageLevel.98\">", lines[2]);
        assertEquals("    <cim:IdentifiedObject.name>98</cim:IdentifiedObject.name>", lines[3]);
        assertEquals("  </cim:VoltageLevel>", lines[4]);
        assertEquals("</rdf:RDF>", lines[5]);
        Logging.setEnabled(true);
    }

    @Test
    @Order(360)
    void testIsClassMatchingProfile() {
        // Check isClassMatchingProfile
        BaseClass cimObj = new BaseVoltage("rdfid1");
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.EQ));
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.TP));

        // Many profiles are matching because of the attributes inherited from
        // IdentifiedObject (e.g. name).
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.DL));
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.DY));
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.GL));
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.SSH));
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.SV));

        cimObj = new VoltageLevel("rdfid2");
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.EQ));

        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.DL));
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.DY));
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.GL));
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.SSH));
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.SV));
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.TP));

        cimObj = new TopologicalNode("rdfid3");
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.SV));
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.TP));

        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.EQ));
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.DL));
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.DY));
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.GL));
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.SSH));

        cimObj = new TopologicalIsland("rdfid4");
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.SV));

        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.EQ));
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.DL));
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.DY));
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.GL));
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.SSH));
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.TP));

        cimObj = new SvVoltage("rdfid5");
        assertTrue(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.SV));
        assertFalse(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.EQ));
        assertFalse(RdfWriter.isClassMatchingProfile(cimObj, CGMESProfile.TP));

        // SvVoltage does not inherit from IdentifiedObject
        for (CGMESProfile profile : CGMESProfile.values()) {
            if (profile == CGMESProfile.SV) {
                assertTrue(RdfWriter.isClassMatchingProfile(cimObj, profile), profile.toString());
            } else {
                assertFalse(RdfWriter.isClassMatchingProfile(cimObj, profile), profile.toString());
            }
        }
    }

    @Test
    @Order(370)
    void testGetClassProfile() {
        // Check getClassProfile
        assertEquals(CGMESProfile.EQ, RdfWriter.getClassProfile(new BaseVoltage("rdfid1")));
        assertEquals(CGMESProfile.EQ, RdfWriter.getClassProfile(new VoltageLevel("rdfid2")));
        assertEquals(CGMESProfile.TP, RdfWriter.getClassProfile(new TopologicalNode("rdfid3")));
        assertEquals(CGMESProfile.SV, RdfWriter.getClassProfile(new TopologicalIsland("rdfid4")));
    }

    @Test
    @Order(380)
    void testGetClassProfileMap() {
        // Check getClassProfileMap
        List<BaseClass> cimList = List.of(new BaseVoltage("rdfid1"), new TopologicalNode("rdfid2"),
                new BaseVoltage("rdfid3"));
        var profileMap = RdfWriter.getClassProfileMap(cimList);
        assertEquals(2, profileMap.size());

        assertTrue(profileMap.containsKey("BaseVoltage"));
        assertTrue(profileMap.containsKey("TopologicalNode"));

        assertEquals(CGMESProfile.EQ, profileMap.get("BaseVoltage"));
        assertEquals(CGMESProfile.TP, profileMap.get("TopologicalNode"));
    }

    @Test
    @Order(390)
    void testGetAttributeProfile() {
        // Check getAttributeProfile
        BaseClass cimObj = new BaseVoltage("rdfid1");
        var profile = CGMESProfile.EQ;
        assertEquals(CGMESProfile.EQ, RdfWriter.getAttributeProfile(cimObj, "nominalVoltage", profile));
        assertEquals(CGMESProfile.EQ, RdfWriter.getAttributeProfile(cimObj, "VoltageLevel", profile));
        assertEquals(CGMESProfile.TP, RdfWriter.getAttributeProfile(cimObj, "TopologicalNode", profile));
        assertEquals(CGMESProfile.EQ, RdfWriter.getAttributeProfile(cimObj, "name", profile));
        assertEquals(CGMESProfile.EQ, RdfWriter.getAttributeProfile(cimObj, "description", profile));
        profile = CGMESProfile.TP;
        assertEquals(CGMESProfile.EQ, RdfWriter.getAttributeProfile(cimObj, "nominalVoltage", profile));
        assertEquals(CGMESProfile.EQ, RdfWriter.getAttributeProfile(cimObj, "VoltageLevel", profile));
        assertEquals(CGMESProfile.TP, RdfWriter.getAttributeProfile(cimObj, "TopologicalNode", profile));
        assertEquals(CGMESProfile.TP, RdfWriter.getAttributeProfile(cimObj, "name", profile));
        assertEquals(CGMESProfile.TP, RdfWriter.getAttributeProfile(cimObj, "description", profile));

        cimObj = new VoltageLevel("rdfid2");
        profile = CGMESProfile.EQ;
        assertEquals(CGMESProfile.EQ, RdfWriter.getAttributeProfile(cimObj, "BaseVoltage", profile));
        assertEquals(CGMESProfile.EQ, RdfWriter.getAttributeProfile(cimObj, "name", profile));
        assertEquals(CGMESProfile.EQ, RdfWriter.getAttributeProfile(cimObj, "description", profile));

        cimObj = new TopologicalNode("rdfid3");
        profile = CGMESProfile.TP;
        assertEquals(CGMESProfile.TP, RdfWriter.getAttributeProfile(cimObj, "BaseVoltage", profile));
        assertEquals(CGMESProfile.SV, RdfWriter.getAttributeProfile(cimObj, "TopologicalIsland", profile));
        assertEquals(CGMESProfile.TP, RdfWriter.getAttributeProfile(cimObj, "name", profile));
        assertEquals(CGMESProfile.TP, RdfWriter.getAttributeProfile(cimObj, "description", profile));
        profile = CGMESProfile.SV;
        assertEquals(CGMESProfile.TP, RdfWriter.getAttributeProfile(cimObj, "BaseVoltage", profile));
        assertEquals(CGMESProfile.SV, RdfWriter.getAttributeProfile(cimObj, "TopologicalIsland", profile));
        assertEquals(CGMESProfile.SV, RdfWriter.getAttributeProfile(cimObj, "name", profile));
        assertEquals(CGMESProfile.EQ, RdfWriter.getAttributeProfile(cimObj, "description", profile));

        cimObj = new TopologicalIsland("rdfid4");
        profile = CGMESProfile.SV;
        assertEquals(CGMESProfile.SV, RdfWriter.getAttributeProfile(cimObj, "TopologicalNodes", profile));
        assertEquals(CGMESProfile.SV, RdfWriter.getAttributeProfile(cimObj, "name", profile));
        assertEquals(CGMESProfile.EQ, RdfWriter.getAttributeProfile(cimObj, "description", profile));

        assertNull(RdfWriter.getAttributeProfile(cimObj, "dummy", profile));
    }

    @Test
    @Order(400)
    void testWrite022_SV() {
        // Check models with more than one profile for StateVariables profile
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test022.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("TopologicalIsland.N"));
        assertTrue(cimData.containsKey("TopologicalIsland.N2"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        var classProfileMap = rdfWriter.getClassProfileMap();
        rdfWriter.write("target/test.xml", CGMESProfile.SV, "model", classProfileMap);

        var stringWriter = new StringWriter();
        var success = rdfWriter.write(stringWriter, CGMESProfile.SV, "model", classProfileMap);
        assertTrue(success);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(11, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER_MD, lines[1]);
        assertEquals("  <md:FullModel rdf:about=\"#model\">", lines[2]);
        assertEquals("    <md:Model.profile>" + SV_PROFILE + "</md:Model.profile>", lines[3]);
        assertEquals("  </md:FullModel>", lines[4]);
        assertEquals("  <cim:TopologicalIsland rdf:ID=\"TopologicalIsland.N\">", lines[5]);
        assertEquals("    <cim:IdentifiedObject.name>N</cim:IdentifiedObject.name>", lines[6]);
        assertEquals("  </cim:TopologicalIsland>", lines[7]);
        assertEquals("  <cim:TopologicalIsland rdf:ID=\"TopologicalIsland.N2\">", lines[8]);
        assertEquals("  </cim:TopologicalIsland>", lines[9]);
        assertEquals("</rdf:RDF>", lines[10]);
    }

    @Test
    @Order(410)
    void testWrite022_EQ() {
        // Check models with more than one profile for Equipment/CoreEquipment profile
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test022.xml")));
        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        var classProfileMap = rdfWriter.getClassProfileMap();
        rdfWriter.write("target/test.xml", CGMESProfile.EQ, "model", classProfileMap);

        var stringWriter = new StringWriter();
        var success = rdfWriter.write(stringWriter, CGMESProfile.EQ, "model", classProfileMap);
        assertTrue(success);
        String result = stringWriter.toString();

        var lines = result.lines().skip(4 + CGMESProfile.EQ.getUris().size()).toArray();
        assertEquals(4, lines.length);
        assertEquals("  <cim:TopologicalIsland rdf:about=\"#TopologicalIsland.N\">", lines[0]);
        assertEquals("    <cim:IdentifiedObject.description>Island N</cim:IdentifiedObject.description>", lines[1]);
        assertEquals("  </cim:TopologicalIsland>", lines[2]);
        assertEquals("</rdf:RDF>", lines[3]);
    }

    @Test
    @Order(420)
    void testWrite022_TP() {
        // Check models with more than one profile for Topology profile
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test022.xml")));
        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        var classProfileMap = rdfWriter.getClassProfileMap();
        rdfWriter.write("target/test.xml", CGMESProfile.TP, "model", classProfileMap);

        var stringWriter = new StringWriter();
        var success = rdfWriter.write(stringWriter, CGMESProfile.TP, "model", classProfileMap);
        assertFalse(success);
    }

    @Test
    @Order(430)
    void testWrite008_TP() {
        // Check reading models from more than one file and writing for Topology profile
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test008_TP.xml"), getPath("rdf/test008_EQ.xml")));
        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        var classProfileMap = rdfWriter.getClassProfileMap();
        rdfWriter.write("target/test.xml", CGMESProfile.TP, "model", classProfileMap);

        var stringWriter = new StringWriter();
        var success = rdfWriter.write(stringWriter, CGMESProfile.TP, "model", classProfileMap);
        assertTrue(success);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(12, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER_MD, lines[1]);
        assertEquals("  <md:FullModel rdf:about=\"#model\">", lines[2]);
        assertEquals("    <md:Model.profile>" + TP_PROFILE + "</md:Model.profile>", lines[3]);
        assertEquals("  </md:FullModel>", lines[4]);
        assertEquals("  <cim:TopologicalNode rdf:ID=\"N0\">", lines[5]);
        assertEquals("    <cim:IdentifiedObject.name>N0</cim:IdentifiedObject.name>", lines[6]);
        assertEquals("  </cim:TopologicalNode>", lines[7]);
        assertEquals("  <cim:Terminal rdf:about=\"#Terminal.N0\">", lines[8]);
        assertEquals("    <cim:Terminal.TopologicalNode rdf:resource=\"#N0\"/>", lines[9]);
        assertEquals("  </cim:Terminal>", lines[10]);
        assertEquals("</rdf:RDF>", lines[11]);
    }

    @Test
    @Order(440)
    void testWrite008_EQ() {
        // Check reading models from more than one file and writing for EQ profile
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test008_TP.xml"), getPath("rdf/test008_EQ.xml")));
        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        var classProfileMap = rdfWriter.getClassProfileMap();
        rdfWriter.write("target/test.xml", CGMESProfile.EQ, "model", classProfileMap);

        var stringWriter = new StringWriter();
        var success = rdfWriter.write(stringWriter, CGMESProfile.EQ, "model", classProfileMap);
        assertTrue(success);
        String result = stringWriter.toString();

        var lines = result.lines().skip(4 + CGMESProfile.EQ.getUris().size()).toArray();
        assertEquals(4, lines.length);
        assertEquals("  <cim:Terminal rdf:ID=\"Terminal.N0\">", lines[0]);
        assertEquals("    <cim:IdentifiedObject.name>Terminal.N0</cim:IdentifiedObject.name>", lines[1]);
        assertEquals("  </cim:Terminal>", lines[2]);
        assertEquals("</rdf:RDF>", lines[3]);
    }

    @Test
    @Order(450)
    void testWrite008_TPall() {
        // Check reading models from more than one file and writing for Topology profile
        // forcing Terminal object to be written completely into Topology profile
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test008_TP.xml"), getPath("rdf/test008_EQ.xml")));
        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);

        // Set class profile of class Terminal also to TP.
        var classProfileMap = rdfWriter.getClassProfileMap();
        assertEquals(CGMESProfile.TP, classProfileMap.get("TopologicalNode"));
        assertEquals(CGMESProfile.EQ, classProfileMap.get("Terminal"));
        classProfileMap.put("Terminal", CGMESProfile.TP);
        assertEquals(CGMESProfile.TP, classProfileMap.get("Terminal"));
        rdfWriter.write("target/test.xml", CGMESProfile.TP, "model", classProfileMap);

        var stringWriter = new StringWriter();
        var success = rdfWriter.write(stringWriter, CGMESProfile.TP, "model", classProfileMap);
        assertTrue(success);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(13, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER_MD, lines[1]);
        assertEquals("  <md:FullModel rdf:about=\"#model\">", lines[2]);
        assertEquals("    <md:Model.profile>" + TP_PROFILE + "</md:Model.profile>", lines[3]);
        assertEquals("  </md:FullModel>", lines[4]);
        assertEquals("  <cim:TopologicalNode rdf:ID=\"N0\">", lines[5]);
        assertEquals("    <cim:IdentifiedObject.name>N0</cim:IdentifiedObject.name>", lines[6]);
        assertEquals("  </cim:TopologicalNode>", lines[7]);
        assertEquals("  <cim:Terminal rdf:ID=\"Terminal.N0\">", lines[8]);
        assertEquals("    <cim:Terminal.TopologicalNode rdf:resource=\"#N0\"/>", lines[9]);
        assertEquals("    <cim:IdentifiedObject.name>Terminal.N0</cim:IdentifiedObject.name>", lines[10]);
        assertEquals("  </cim:Terminal>", lines[11]);
        assertEquals("</rdf:RDF>", lines[12]);
    }

    @Test
    @Order(460)
    void testWrite023() {
        // Check text with entity references
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test023.xml")));
        assertEquals(1, cimData.size());

        assertTrue(cimData.containsKey("BaseVoltage.20"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(7, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:BaseVoltage rdf:ID=\"BaseVoltage.20\">", lines[2]);
        assertEquals(
                "    <cim:IdentifiedObject.description>&lt;&amp;&gt; &lt;&amp;&gt; &lt;&amp;&gt;</cim:IdentifiedObject.description>",
                lines[3]);
        assertEquals("    <cim:IdentifiedObject.name>unknown entity reference: &amp;nbsp;</cim:IdentifiedObject.name>",
                lines[4]);
        assertEquals("  </cim:BaseVoltage>", lines[5]);
        assertEquals("</rdf:RDF>", lines[6]);
    }

    @Test
    @Order(470)
    void testWrite024() {
        // Check parsing one object with different types (maybe not CGMES conform)
        // PowerTransformer gets more attributes from Equipment entry with rdf:about
        testWrite_024_025_026_027("rdf/test024.xml");
    }

    @Test
    @Order(480)
    void testWrite025() {
        // Check parsing one object with changing type (maybe not CGMES conform)
        // Equipment object (rdf:about) has to be changed to PowerTransformer
        testWrite_024_025_026_027("rdf/test025.xml");
    }

    @Test
    @Order(490)
    void testWrite026() {
        // Check parsing one object with different types (maybe not CGMES conform)
        // PowerTransformer (rdf:about) gets more attributes from Equipment entry
        testWrite_024_025_026_027("rdf/test026.xml");
    }

    @Test
    @Order(500)
    void testWrite027() {
        // Check parsing one object with changing type (maybe not CGMES conform)
        // Equipment object has to be changed to PowerTransformer (rdf:about)
        testWrite_024_025_026_027("rdf/test027.xml");
    }

    private void testWrite_024_025_026_027(String test_024_025_026_027) {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath(test_024_025_026_027)));
        assertEquals(3, cimData.size());

        assertTrue(cimData.containsKey("_VL"));
        assertTrue(cimData.containsKey("_PT"));
        assertTrue(cimData.containsKey("_PTE"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(14, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:VoltageLevel rdf:ID=\"_VL\">", lines[2]);
        assertEquals("    <cim:IdentifiedObject.name>VL</cim:IdentifiedObject.name>", lines[3]);
        assertEquals("  </cim:VoltageLevel>", lines[4]);
        assertEquals("  <cim:PowerTransformer rdf:ID=\"_PT\">", lines[5]);
        assertEquals("    <cim:Equipment.EquipmentContainer rdf:resource=\"#_VL\"/>", lines[6]);
        assertEquals("    <cim:IdentifiedObject.description>PowerTransformer</cim:IdentifiedObject.description>",
                lines[7]);
        assertEquals("    <cim:IdentifiedObject.name>PT</cim:IdentifiedObject.name>", lines[8]);
        assertEquals("  </cim:PowerTransformer>", lines[9]);
        assertEquals("  <cim:PowerTransformerEnd rdf:ID=\"_PTE\">", lines[10]);
        assertEquals("    <cim:PowerTransformerEnd.PowerTransformer rdf:resource=\"#_PT\"/>", lines[11]);
        assertEquals("  </cim:PowerTransformerEnd>", lines[12]);
        assertEquals("</rdf:RDF>", lines[13]);
    }

    @Test
    @Order(510)
    void testWrite028() {
        // Check parsing one object with changing type (maybe not CGMES conform)
        // Equipment object has to be changed to PowerTransformer (rdf:about)
        // Equipment has class attribute, but the linked object is defined later
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test028.xml")));
        assertEquals(3, cimData.size());

        assertTrue(cimData.containsKey("_VL"));
        assertTrue(cimData.containsKey("_PT"));
        assertTrue(cimData.containsKey("_PTE"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(14, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:PowerTransformer rdf:ID=\"_PT\">", lines[2]);
        assertEquals("    <cim:Equipment.EquipmentContainer rdf:resource=\"#_VL\"/>", lines[3]);
        assertEquals("    <cim:IdentifiedObject.description>PowerTransformer</cim:IdentifiedObject.description>",
                lines[4]);
        assertEquals("    <cim:IdentifiedObject.name>PT</cim:IdentifiedObject.name>", lines[5]);
        assertEquals("  </cim:PowerTransformer>", lines[6]);
        assertEquals("  <cim:VoltageLevel rdf:ID=\"_VL\">", lines[7]);
        assertEquals("    <cim:IdentifiedObject.name>VL</cim:IdentifiedObject.name>", lines[8]);
        assertEquals("  </cim:VoltageLevel>", lines[9]);
        assertEquals("  <cim:PowerTransformerEnd rdf:ID=\"_PTE\">", lines[10]);
        assertEquals("    <cim:PowerTransformerEnd.PowerTransformer rdf:resource=\"#_PT\"/>", lines[11]);
        assertEquals("  </cim:PowerTransformerEnd>", lines[12]);
        assertEquals("</rdf:RDF>", lines[13]);
    }

    @Test
    @Order(520)
    void testWrite029() {
        // Check parsing one object with overriding attribute (maybe not CGMES conform)
        testWrite_029_030_031_032("rdf/test029.xml", 6);
    }

    @Test
    @Order(530)
    void testWrite030() {
        // Check parsing one object with overriding attribute (maybe not CGMES conform)
        // and the overriding class attribute links to object, that is defined later
        testWrite_029_030_031_032("rdf/test030.xml", 4);
    }

    @Test
    @Order(540)
    void testWrite031() {
        // Check parsing one object with overriding attribute (maybe not CGMES conform)
        // and both (overridden and overriding) link to objects, that are defined later
        testWrite_029_030_031_032("rdf/test031.xml", 2);
    }

    @Test
    @Order(550)
    void testWrite032() {
        // Check parsing one object with overriding attribute (maybe not CGMES conform)
        // and the overridden class attribute links to object, that is defined later
        testWrite_029_030_031_032("rdf/test032.xml", 4);
    }

    private void testWrite_029_030_031_032(String test_029_030_031_032, int offset) {
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath(test_029_030_031_032)));
        assertEquals(3, cimData.size());

        assertTrue(cimData.containsKey("_VL0"));
        assertTrue(cimData.containsKey("_VL"));
        assertTrue(cimData.containsKey("_PT"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(11, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        // ...
        assertEquals("  <cim:PowerTransformer rdf:ID=\"_PT\">", lines[offset]);
        assertEquals("    <cim:Equipment.EquipmentContainer rdf:resource=\"#_VL\"/>", lines[offset + 1]);
        assertEquals("    <cim:IdentifiedObject.name>PT</cim:IdentifiedObject.name>", lines[offset + 2]);
        assertEquals("  </cim:PowerTransformer>", lines[offset + 3]);
        // ...
        assertEquals("</rdf:RDF>", lines[10]);
    }

    @Test
    @Order(560)
    void testWrite033() {
        // Check parsing one object with changing type (maybe not CGMES conform)
        // Equipment object has to be changed to PowerTransformer (rdf:about)
        // Equipment has class attribute, but the linked object is defined later
        // after changing to PowerTransformer
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test033.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("_VL"));
        assertTrue(cimData.containsKey("_PT"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(10, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:PowerTransformer rdf:ID=\"_PT\">", lines[2]);
        assertEquals("    <cim:Equipment.EquipmentContainer rdf:resource=\"#_VL\"/>", lines[3]);
        assertEquals("    <cim:IdentifiedObject.name>PT</cim:IdentifiedObject.name>", lines[4]);
        assertEquals("  </cim:PowerTransformer>", lines[5]);
        assertEquals("  <cim:VoltageLevel rdf:ID=\"_VL\">", lines[6]);
        assertEquals("    <cim:IdentifiedObject.name>VL</cim:IdentifiedObject.name>", lines[7]);
        assertEquals("  </cim:VoltageLevel>", lines[8]);
        assertEquals("</rdf:RDF>", lines[9]);
    }

    @Test
    @Order(570)
    void testWrite034() {
        // Check parsing one object with changing type (maybe not CGMES conform)
        // EquipmentContainer object has to be changed to VoltageLevel
        // EquipmentContainer has list attributes (not CGMES conform), but the linked
        // objects are defined later after changing to VoltageLevel
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test034.xml")));
        assertEquals(3, cimData.size());

        assertTrue(cimData.containsKey("_VL"));
        assertTrue(cimData.containsKey("_PT"));
        assertTrue(cimData.containsKey("_PT2"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(14, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:VoltageLevel rdf:ID=\"_VL\">", lines[2]);
        assertEquals("    <cim:IdentifiedObject.name>VL</cim:IdentifiedObject.name>", lines[3]);
        assertEquals("  </cim:VoltageLevel>", lines[4]);
        assertEquals("  <cim:PowerTransformer rdf:ID=\"_PT\">", lines[5]);
        assertEquals("    <cim:Equipment.EquipmentContainer rdf:resource=\"#_VL\"/>", lines[6]);
        assertEquals("    <cim:IdentifiedObject.name>PT</cim:IdentifiedObject.name>", lines[7]);
        assertEquals("  </cim:PowerTransformer>", lines[8]);
        assertEquals("  <cim:PowerTransformer rdf:ID=\"_PT2\">", lines[9]);
        assertEquals("    <cim:Equipment.EquipmentContainer rdf:resource=\"#_VL\"/>", lines[10]);
        assertEquals("    <cim:IdentifiedObject.name>PT2</cim:IdentifiedObject.name>", lines[11]);
        assertEquals("  </cim:PowerTransformer>", lines[12]);
        assertEquals("</rdf:RDF>", lines[13]);
    }

    @Test
    @Order(580)
    void testWrite035() {
        // Check parsing one object with changing type (maybe not CGMES conform)
        // EquipmentContainer object has to be changed to VoltageLevel
        // EquipmentContainer has list attributes (not CGMES conform), but the linked
        // objects are defined later: one before and one after changing to VoltageLevel
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test035.xml")));
        assertEquals(3, cimData.size());

        assertTrue(cimData.containsKey("_VL"));
        assertTrue(cimData.containsKey("_PT"));
        assertTrue(cimData.containsKey("_PT2"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(14, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:VoltageLevel rdf:ID=\"_VL\">", lines[2]);
        assertEquals("    <cim:IdentifiedObject.name>VL</cim:IdentifiedObject.name>", lines[3]);
        assertEquals("  </cim:VoltageLevel>", lines[4]);
        assertEquals("  <cim:PowerTransformer rdf:ID=\"_PT\">", lines[5]);
        assertEquals("    <cim:Equipment.EquipmentContainer rdf:resource=\"#_VL\"/>", lines[6]);
        assertEquals("    <cim:IdentifiedObject.name>PT</cim:IdentifiedObject.name>", lines[7]);
        assertEquals("  </cim:PowerTransformer>", lines[8]);
        assertEquals("  <cim:PowerTransformer rdf:ID=\"_PT2\">", lines[9]);
        assertEquals("    <cim:Equipment.EquipmentContainer rdf:resource=\"#_VL\"/>", lines[10]);
        assertEquals("    <cim:IdentifiedObject.name>PT2</cim:IdentifiedObject.name>", lines[11]);
        assertEquals("  </cim:PowerTransformer>", lines[12]);
        assertEquals("</rdf:RDF>", lines[13]);
    }

    @Test
    @Order(590)
    void testWrite036() {
        // Check parsing one object with changing type (maybe not CGMES conform)
        // Equipment object has to be changed to PowerTransformer
        // and is linked as ConductingEquipment (which is not allowed for Equipment)
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test036.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("_Status"));
        assertTrue(cimData.containsKey("_PT"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(10, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:SvStatus rdf:ID=\"_Status\">", lines[2]);
        assertEquals("    <cim:SvStatus.ConductingEquipment rdf:resource=\"#_PT\"/>", lines[3]);
        assertEquals("  </cim:SvStatus>", lines[4]);
        assertEquals("  <cim:PowerTransformer rdf:ID=\"_PT\">", lines[5]);
        assertEquals("    <cim:IdentifiedObject.description>PowerTransformer</cim:IdentifiedObject.description>",
                lines[6]);
        assertEquals("    <cim:IdentifiedObject.name>PT</cim:IdentifiedObject.name>", lines[7]);
        assertEquals("  </cim:PowerTransformer>", lines[8]);
        assertEquals("</rdf:RDF>", lines[9]);
    }

    @Test
    @Order(600)
    void testWrite037() {
        // Check parsing one object with changing type (maybe not CGMES conform)
        // Equipment object has to be changed to PowerTransformer
        // and is linked as ConductingEquipment (which is not allowed for Equipment)
        // before changing to PowerTransformer (typically the entries are defined
        // in more than one file, so the order of reading is not clearly defined)
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test037.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("_Status"));
        assertTrue(cimData.containsKey("_PT"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(10, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:PowerTransformer rdf:ID=\"_PT\">", lines[2]);
        assertEquals("    <cim:IdentifiedObject.description>PowerTransformer</cim:IdentifiedObject.description>",
                lines[3]);
        assertEquals("    <cim:IdentifiedObject.name>PT</cim:IdentifiedObject.name>", lines[4]);
        assertEquals("  </cim:PowerTransformer>", lines[5]);
        assertEquals("  <cim:SvStatus rdf:ID=\"_Status\">", lines[6]);
        assertEquals("    <cim:SvStatus.ConductingEquipment rdf:resource=\"#_PT\"/>", lines[7]);
        assertEquals("  </cim:SvStatus>", lines[8]);
        assertEquals("</rdf:RDF>", lines[9]);
    }

    @Test
    @Order(610)
    void testWrite038() {
        // Check not allowed linked type (causing an error log entry)
        // Equipment object is tried to be linked as ConductingEquipment
        Logging.setEnabled(false);
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test038.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("_Status"));
        assertTrue(cimData.containsKey("_PT"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        rdfWriter.write("target/test.xml");

        var stringWriter = new StringWriter();
        rdfWriter.write(stringWriter);
        String result = stringWriter.toString();

        var lines = result.lines().toArray();
        assertEquals(8, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:Equipment rdf:ID=\"_PT\">", lines[2]);
        assertEquals("    <cim:IdentifiedObject.description>PowerTransformer</cim:IdentifiedObject.description>",
                lines[3]);
        assertEquals("  </cim:Equipment>", lines[4]);
        assertEquals("  <cim:SvStatus rdf:ID=\"_Status\">", lines[5]);
        assertEquals("  </cim:SvStatus>", lines[6]);
        assertEquals("</rdf:RDF>", lines[7]);
        Logging.setEnabled(true);
    }

    @Test
    @Order(900)
    void testWriteEmpty() {
        // Check writing an empty file (i.e. with no CIM objects)
        var rdfWriter = new RdfWriter();
        assertDoesNotThrow(() -> rdfWriter.write("target/test.xml"));
    }

    @Test
    @Order(910)
    void testWriteWithProfiles() {
        // Check writing more than one profile file
        var rdfReader = new RdfReader();
        var cimData = rdfReader.read(List.of(getPath("rdf/test022.xml")));
        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);
        var map = rdfWriter.write("target/test", "model", rdfWriter.getClassProfileMap());

        assertEquals(2, map.size());
        assertTrue(map.containsKey(CGMESProfile.EQ));
        assertTrue(map.containsKey(CGMESProfile.SV));
        assertEquals("target/test_StateVariables.xml", map.get(CGMESProfile.SV));
    }

    private String getPath(String resource) {
        var url = getClass().getClassLoader().getResource(resource);
        assertNotNull(url);
        assertEquals("file", url.getProtocol());
        return url.getPath();
    }
}
