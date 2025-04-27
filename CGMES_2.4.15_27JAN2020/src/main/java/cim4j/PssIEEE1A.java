/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents IEEE Std 421.5-2005 type PSS1A power system stabilizer model. PSS1A is the generalized form of a PSS with a single input. Some common stabilizer input signals are speed, frequency, and power.  Reference: IEEE 1A 421.5-2005 Section 8.1.
 */
public class PssIEEE1A extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssIEEE1A.class);

    private BaseClass[] PssIEEE1A_class_attributes;
    private BaseClass[] PssIEEE1A_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new PssIEEE1A().getAttributeNamesMap();
    }

    private enum PssIEEE1A_primitive_builder implements PrimitiveBuilder {
        a1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        a2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        inputSignalType() {
            public BaseClass construct(java.lang.String value) {
                return new InputSignalKind(value);
            }
        },
        ks() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        t1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        t2() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        t3() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        t4() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        t5() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        t6() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        vrmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vrmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum PssIEEE1A_class_attributes_enum {
        a1,
        a2,
        inputSignalType,
        ks,
        t1,
        t2,
        t3,
        t4,
        t5,
        t6,
        vrmax,
        vrmin,
        LAST_ENUM
    }

    public PssIEEE1A() {
        PssIEEE1A_primitive_attributes = new BaseClass[PssIEEE1A_primitive_builder.values().length];
        PssIEEE1A_class_attributes = new BaseClass[PssIEEE1A_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new PssIEEE1A();
    }

    @Override
    public void setValue(java.lang.String s) {
        LOG.error(debugString() + " is not sure what to do with " + s);
    }

    @Override
    public void setRdfid(java.lang.String id) {
        rdfid = id;
    }

    @Override
    public java.lang.String getRdfid() {
        return rdfid;
    }

    private void updateAttributeInArray(PssIEEE1A_class_attributes_enum attrEnum, BaseClass value) {
        try {
            PssIEEE1A_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(PssIEEE1A_primitive_builder attrEnum, BaseClass value) {
        try {
            PssIEEE1A_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            PssIEEE1A_class_attributes_enum attrEnum = PssIEEE1A_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated PssIEEE1A, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            PssIEEE1A_primitive_builder attrEnum = PssIEEE1A_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated PssIEEE1A, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            PssIEEE1A_primitive_builder attrEnum = PssIEEE1A_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PssIEEE1A_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            PssIEEE1A_class_attributes_enum attrEnum = PssIEEE1A_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PssIEEE1A_class_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        if (!defined) {
            return super.getAttribute(attrName);
        }
        return null;
    }

    @Override
    protected Map<java.lang.String, java.lang.String> getAttributeNamesMap() {
        Map<java.lang.String, java.lang.String> namesMap = new LinkedHashMap<>();
        for (var enumValue : PssIEEE1A_primitive_builder.values()) {
            if (enumValue != PssIEEE1A_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PssIEEE1A." + enumValue.name());
            }
        }
        for (var enumValue : PssIEEE1A_class_attributes_enum.values()) {
            if (enumValue != PssIEEE1A_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PssIEEE1A." + enumValue.name());
            }
        }
        namesMap.putAll(super.getAttributeNamesMap());
        return namesMap;
    }

    @Override
    public Set<java.lang.String> getAttributeNames() {
        return ATTRIBUTE_NAMES_MAP.keySet();
    }

    @Override
    public java.lang.String getAttributeFullName(java.lang.String attrName) {
        return ATTRIBUTE_NAMES_MAP.get(attrName);
    }

    @Override
    public java.lang.String toString(boolean topClass) {
        java.lang.String result = "";
        if (topClass) {
            for (PssIEEE1A_primitive_builder attrEnum : PssIEEE1A_primitive_builder.values()) {
                BaseClass bc = PssIEEE1A_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PssIEEE1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (PssIEEE1A_class_attributes_enum attrEnum : PssIEEE1A_class_attributes_enum.values()) {
                BaseClass bc = PssIEEE1A_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PssIEEE1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(PssIEEE1A) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "PssIEEE1A";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }

    /**
     * Get the namespace URL of an object of this class.
     *
     * @return The namespace URL
     */
    @Override
    public java.lang.String getClassNamespaceUrl() {
        return "http://iec.ch/TC57/2013/CIM-schema-cim16#";
    }

    /**
     * Get the namespace URL of an attribute (also for inherited attributes).
     *
     * @return The namespace URL
     */
    @Override
    public java.lang.String getAttributeNamespaceUrl(java.lang.String attrName) {
        return ATTR_NAMESPACE_MAP.get(attrName);
    }

    private static final Map<java.lang.String, java.lang.String> ATTR_NAMESPACE_MAP;
    static {
        ATTR_NAMESPACE_MAP = new PssIEEE1A().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("a1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("a2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("inputSignalType", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ks", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t5", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t6", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
