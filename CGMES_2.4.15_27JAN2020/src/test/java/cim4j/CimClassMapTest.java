// SPDX-FileCopyrightText: 2025 SOGNO
//
// SPDX-License-Identifier: Apache-2.0

package cim4j;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CimClassMapTest {
    @Test
    @Order(100)
    public void isCimClass() {
        assertTrue(CimClassMap.isCimClass("BaseVoltage"));
        assertFalse(CimClassMap.isCimClass("dummy"));
    }

    @Test
    @Order(110)
    public void createCimObject() {
        BaseClass obj1 = CimClassMap.createCimObject("BaseVoltage", "rdfid1");
        BaseClass obj2 = CimClassMap.createCimObject("BaseVoltage", "rdfid2");
        assertNotNull(obj1);
        assertNotNull(obj2);
        assertEquals(BaseVoltage.class, obj1.getClass());
        assertEquals(BaseVoltage.class, obj2.getClass());
        assertNotSame(obj1, obj2);
    }

    @Test
    @Order(120)
    public void createCimObjectWithType() {
        BaseVoltage obj1 = CimClassMap.createCimObject(BaseVoltage.class, "rdfid1");
        BaseVoltage obj2 = CimClassMap.createCimObject(BaseVoltage.class, "rdfid2");
        assertNotNull(obj1);
        assertNotNull(obj2);
        assertNotSame(obj1, obj2);
    }
}
