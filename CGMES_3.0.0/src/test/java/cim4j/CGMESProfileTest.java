package cim4j;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * Test for enum containing all CGMES profiles.
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CGMESProfileTest {
    @Test
    @Order(100)
    void testValues() {
        int count = 9;
        int EQ = 0;
        int TP = 7;
        if (CimConstants.CIM_VERSION.equals("cgmes_v3_0_0")) {
            count = 10;
            TP = 9;
        }
        var values = CGMESProfile.values();
        assertEquals(count, values.length);
        assertEquals(CGMESProfile.EQ, values[EQ]);
        assertEquals(CGMESProfile.TP, values[TP]);
    }

    @Test
    @Order(110)
    void testOrdinal() {
        int EQ = 0;
        int TP = 7;
        if (CimConstants.CIM_VERSION.equals("cgmes_v3_0_0")) {
            TP = 9;
        }
        assertEquals(EQ, CGMESProfile.EQ.ordinal());
        assertEquals(TP, CGMESProfile.TP.ordinal());
    }

    @Test
    @Order(120)
    void testToString() {
        assertEquals("EQ", CGMESProfile.EQ.toString());
        assertEquals("TP", CGMESProfile.TP.toString());
    }

    @Test
    @Order(130)
    void testValueOf() {
        assertEquals(CGMESProfile.EQ, CGMESProfile.valueOf("EQ"));
        assertEquals(CGMESProfile.TP, CGMESProfile.valueOf("TP"));

        var ex = assertThrows(IllegalArgumentException.class, () -> CGMESProfile.valueOf("dummy"));
        var msg = ex.getMessage();
        assertTrue(msg.startsWith("No enum constant cim4j.CGMESProfile.dummy"));
    }

    @Test
    @Order(140)
    void testFromLongName() {
        var EQ = "Equipment";
        var TP = "Topology";
        if (CimConstants.CIM_VERSION.equals("cgmes_v3_0_0")) {
            EQ = "CoreEquipment";
        }
        assertEquals(CGMESProfile.EQ, CGMESProfile.fromLongName(EQ));
        assertEquals(CGMESProfile.TP, CGMESProfile.fromLongName(TP));
        assertNull(CGMESProfile.fromLongName("dummy"));
    }

    @Test
    @Order(150)
    void testGetLongName() {
        var EQ = "Equipment";
        var TP = "Topology";
        if (CimConstants.CIM_VERSION.equals("cgmes_v3_0_0")) {
            EQ = "CoreEquipment";
        }
        assertEquals(EQ, CGMESProfile.EQ.getLongName());
        assertEquals(TP, CGMESProfile.TP.getLongName());
    }

    @Test
    @Order(160)
    void testGetUris() {
        if (CimConstants.CIM_VERSION.equals("cgmes_v2_4_13") || CimConstants.CIM_VERSION.equals("cgmes_v2_4_15")) {
            var uris = CGMESProfile.EQ.getUris();
            assertEquals(3, uris.size());
            assertEquals("http://entsoe.eu/CIM/EquipmentCore/3/1", uris.get(0));
            assertEquals("http://entsoe.eu/CIM/EquipmentOperation/3/1", uris.get(1));
            assertEquals("http://entsoe.eu/CIM/EquipmentShortCircuit/3/1", uris.get(2));

            uris = CGMESProfile.TP.getUris();
            assertEquals(1, uris.size());
            assertEquals("http://entsoe.eu/CIM/Topology/4/1", uris.get(0));
        } else if (CimConstants.CIM_VERSION.equals("cgmes_v3_0_0")) {
            var uris = CGMESProfile.EQ.getUris();
            assertEquals(1, uris.size());
            assertEquals("http://iec.ch/TC57/ns/CIM/CoreEquipment-EU/3.0", uris.get(0));

            uris = CGMESProfile.TP.getUris();
            assertEquals(1, uris.size());
            assertEquals("http://iec.ch/TC57/ns/CIM/Topology-EU/3.0", uris.get(0));
        }
    }

    @Test
    @Order(170)
    void testOrder() {
        var list = new ArrayList<CGMESProfile>();
        var set = new HashSet<CGMESProfile>();
        for (CGMESProfile profile : CGMESProfile.values()) {
            list.add(profile);
            set.add(profile);
        }
        assertEquals(list.size(), set.size());

        var sortedList = new ArrayList<CGMESProfile>(set);
        Collections.sort(sortedList);

        assertEquals(list, sortedList);
    }
}
