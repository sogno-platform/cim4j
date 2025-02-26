package cim4j.utils;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import cim4j.CIMClassMap;
import cim4j.CimConstants;

/**
 * Test converting cim data to rdf.
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RdfWriterTest {

    private static final String XML_HEADER = "<?xml version='1.0' encoding='utf-8' ?>";
    private static final String RDF = CimConstants.NAMESPACES_MAP.get("rdf");
    private static final String CIM = CimConstants.NAMESPACES_MAP.get("cim");
    private static final String RDF_HEADER = "<rdf:RDF xmlns:rdf='" + RDF + "' xmlns:cim='" + CIM + "'>";

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

        var cimObj = CIMClassMap.classMap.get("Location").construct();
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
    void testConvertCimData001() {
        var cimData = RdfReader.read(getPath("rdf/test001.xml"));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("VoltageLevel.98"));
        assertTrue(cimData.containsKey("BaseVoltage.20"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);

        String result = rdfWriter.convertCimData();
        var lines = result.lines().toArray();
        assertEquals(10, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:BaseVoltage rdf:ID='BaseVoltage.20'>", lines[2]);
        assertEquals("    <cim:BaseVoltage.nominalVoltage>20.0</cim:BaseVoltage.nominalVoltage>", lines[3]);
        assertEquals("  </cim:BaseVoltage>", lines[4]);
        assertEquals("  <cim:VoltageLevel rdf:ID='VoltageLevel.98'>", lines[5]);
        assertEquals("    <cim:VoltageLevel.BaseVoltage rdf:resource='#BaseVoltage.20' />", lines[6]);
        assertEquals("    <cim:IdentifiedObject.name>98</cim:IdentifiedObject.name>", lines[7]);
        assertEquals("  </cim:VoltageLevel>", lines[8]);
        assertEquals("</rdf:RDF>", lines[9]);
    }

    @Test
    @Order(140)
    void testConvertCimData002() {
        var cimData = RdfReader.read(getPath("rdf/test002.xml"));
        assertEquals(4, cimData.size());

        assertTrue(cimData.containsKey("Analog.N0.Voltage"));
        assertTrue(cimData.containsKey("AnalogValue.N0.Voltage"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);

        String result = rdfWriter.convertCimData();
        var lines = result.lines().toArray();
        assertEquals(12, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:Analog rdf:ID='Analog.N0.Voltage'>", lines[2]);
        assertEquals("    <cim:Measurement.measurementType>Voltage</cim:Measurement.measurementType>", lines[3]);
        // assertEquals("    <cim:Measurement.unitMultiplier rdf:resource='" + CIM + "UnitMultiplier.k' />", lines[4]);
        // assertEquals("    <cim:Measurement.unitSymbol rdf:resource='" + CIM + "UnitSymbol.V' />", lines[5]);
        assertEquals("    <cim:IdentifiedObject.name>Voltage Magnitude Measurement at N0</cim:IdentifiedObject.name>",
                lines[6]);
        assertEquals("  </cim:Analog>", lines[7]);
        assertEquals("  <cim:AnalogValue rdf:ID='AnalogValue.N0.Voltage'>", lines[8]);
        assertEquals("    <cim:AnalogValue.Analog rdf:resource='#Analog.N0.Voltage' />", lines[9]);
        assertEquals("  </cim:AnalogValue>", lines[10]);
        assertEquals("</rdf:RDF>", lines[11]);
    }

    @Test
    @Order(150)
    void testConvertCimData003() {
        var cimData = RdfReader.read(getPath("rdf/test003.xml"));
        assertEquals(2, cimData.size());

        assertTrue(cimData.containsKey("N0"));
        assertTrue(cimData.containsKey("Terminal.N0"));

        var rdfWriter = new RdfWriter();
        rdfWriter.addCimData(cimData);

        String result = rdfWriter.convertCimData();
        var lines = result.lines().toArray();
        assertEquals(9, lines.length);
        assertEquals(XML_HEADER, lines[0]);
        assertEquals(RDF_HEADER, lines[1]);
        assertEquals("  <cim:TopologicalNode rdf:ID='N0'>", lines[2]);
        assertEquals("    <cim:IdentifiedObject.name>N0</cim:IdentifiedObject.name>", lines[3]);
        assertEquals("  </cim:TopologicalNode>", lines[4]);
        assertEquals("  <cim:Terminal rdf:ID='Terminal.N0'>", lines[5]);
        assertEquals("    <cim:Terminal.TopologicalNode rdf:resource='#N0' />", lines[6]);
        assertEquals("  </cim:Terminal>", lines[7]);
        assertEquals("</rdf:RDF>", lines[8]);
    }

    @Test
    @Order(170)
    void testWriteCimData() {
        var rdfWriter = new RdfWriter();
        assertDoesNotThrow(() -> rdfWriter.writeCimData("target/test.xml"));
    }

    private String getPath(String resource) {
        var url = getClass().getClassLoader().getResource(resource);
        assertNotNull(url);
        assertEquals("file", url.getProtocol());
        return url.getPath();
    }
}
