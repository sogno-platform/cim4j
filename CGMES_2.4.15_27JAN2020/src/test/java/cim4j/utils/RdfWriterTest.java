package cim4j.utils;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.StringWriter;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import cim4j.CimClassMap;
import cim4j.CimConstants;

/**
 * Test converting cim data to rdf.
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RdfWriterTest {

    private static final String XML_HEADER = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
    private static final String RDF = CimConstants.NAMESPACES_MAP.get("rdf");
    private static final String CIM = CimConstants.NAMESPACES_MAP.get("cim");
    private static final String RDF_HEADER = "<rdf:RDF xmlns:cim=\"" + CIM + "\"" + " xmlns:rdf=\"" + RDF + "\">";
    private static final String ENTSOE_EU = CimConstants.CIM_VERSION.equals("cgmes_v3_0_0") ? "eu" : "entsoe";
    private static final String RDF_HEADER_EU = "<rdf:RDF xmlns:cim=\"" + CIM + "\" xmlns:" + ENTSOE_EU + "=\""
            + CimConstants.NAMESPACES_MAP.get(ENTSOE_EU) + "\" xmlns:rdf=\"" + RDF + "\">";

    @Test
    @Order(100)
    void testRdfWriter() {
        var rdfWriter = new RdfWriter();
        assertNotNull(rdfWriter);
    }

    @Test
    @Order(110)
    void testGetCimData() {
        var rdfWriter = new RdfWriter();
        var cimData = rdfWriter.getCimData();
        assertNotNull(cimData);
        assertTrue(cimData.isEmpty());
    }

    @Test
    @Order(120)
    void testAddCimData() {
        var rdfWriter = new RdfWriter();

        var cimObj = CimClassMap.createCimObject("Location");
        cimObj.setRdfid("ee.ORT:E_2785017863");
        rdfWriter.addCimData(Map.of("ee.ORT:E_2785017863", cimObj));

        var cimData = rdfWriter.getCimData();
        assertEquals(1, cimData.size());

        var cimObj2 = cimData.get("ee.ORT:E_2785017863");
        assertNotNull(cimObj2);
        assertEquals("ee.ORT:E_2785017863", cimObj2.getRdfid());
    }

    @Test
    @Order(130)
    void testWrite001() {
        var cimData = RdfReader.read(List.of(getPath("rdf/test001.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("VoltageLevel.98"));
        assertTrue(cimData.containsKey("BaseVoltage.20"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);

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
        var cimData = RdfReader.read(List.of(getPath("rdf/test002.xml")));
        assertEquals(4, cimData.size());

        assertTrue(cimData.containsKey("Analog.N0.Voltage"));
        assertTrue(cimData.containsKey("AnalogValue.N0.Voltage"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);

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
        var cimData = RdfReader.read(List.of(getPath("rdf/test003.xml")));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("N0"));
        assertTrue(cimData.containsKey("Terminal.N0"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);

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
        var cimData = RdfReader.read(List.of(getPath("rdf/test004.xml")));
        assertEquals(1, cimData.size());

        assertTrue(cimData.containsKey("BaseVoltage.20"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);

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
        if (CimConstants.CIM_VERSION.equals("cgmes_v2_4_13")) {
            // There is no class or list attribute in cgmes_v2_4_13 with entsoe namespace
        } else if (CimConstants.CIM_VERSION.equals("cgmes_v2_4_15")) {
            var cimData = RdfReader.read(List.of(getPath("rdf/test005_CGMES2.xml")));
            assertEquals(2, cimData.size());

            assertTrue(cimData.containsKey("ES"));
            assertTrue(cimData.containsKey("EST"));

            var rdfWriter = new RdfWriter();
            rdfWriter.addCimData(cimData);

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
            var cimData = RdfReader.read(List.of(getPath("rdf/test005_CGMES3.xml")));
            assertEquals(2, cimData.size());

            assertTrue(cimData.containsKey("N0"));
            assertTrue(cimData.containsKey("N0_BP"));

            var rdfWriter = new RdfWriter();
            rdfWriter.addCimData(cimData);

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
        if (CimConstants.CIM_VERSION.equals("cgmes_v2_4_13") || CimConstants.CIM_VERSION.equals("cgmes_v2_4_15")) {
            var cimData = RdfReader.read(List.of(getPath("rdf/test006_CGMES2.xml")));
            assertEquals(2, cimData.size());

            assertTrue(cimData.containsKey("OLT"));

            var rdfWriter = new RdfWriter();
            rdfWriter.addCimData(cimData);

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
            var cimData = RdfReader.read(List.of(getPath("rdf/test006_CGMES3.xml")));
            assertEquals(2, cimData.size());

            assertTrue(cimData.containsKey("OLT"));

            var rdfWriter = new RdfWriter();
            rdfWriter.addCimData(cimData);

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
        var cimData = RdfReader.read(List.of(getPath("rdf/test007.xml")));
        assertEquals(4, cimData.size());

        assertTrue(cimData.containsKey("VoltageLevel.96"));
        assertTrue(cimData.containsKey("VoltageLevel.97"));
        assertTrue(cimData.containsKey("VoltageLevel.98"));
        assertTrue(cimData.containsKey("BaseVoltage.20"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);

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
    @Order(900)
    void testWriteCimData() {
        var rdfWriter = new RdfWriter();
        assertDoesNotThrow(() -> rdfWriter.write("target/test.xml"));
    }

    private String getPath(String resource) {
        var url = getClass().getClassLoader().getResource(resource);
        assertNotNull(url);
        assertEquals("file", url.getProtocol());
        return url.getPath();
    }
}
