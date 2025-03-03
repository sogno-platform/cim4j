/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents IEEE Std 421.5-2005 type PSS3B power system stabilizer model. The PSS model PSS3B has dual inputs of electrical power and rotor angular frequency deviation. The signals are used to derive an equivalent mechanical power signal.  Reference: IEEE 3B 421.5-2005 Section 8.3.
 */
public class PssIEEE3B extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssIEEE3B.class);

    private BaseClass[] PssIEEE3B_class_attributes;
    private BaseClass[] PssIEEE3B_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new PssIEEE3B().getAttributeNamesMap();
    }

    private enum PssIEEE3B_primitive_builder implements PrimitiveBuilder {
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
        a3() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        a4() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        a5() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        a6() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        a7() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        a8() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        inputSignal1Type() {
            public BaseClass construct(java.lang.String value) {
                return new InputSignalKind(value);
            }
        },
        inputSignal2Type() {
            public BaseClass construct(java.lang.String value) {
                return new InputSignalKind(value);
            }
        },
        ks1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ks2() {
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
        tw1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tw2() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tw3() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        vstmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vstmin() {
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

    private enum PssIEEE3B_class_attributes_enum {
        a1,
        a2,
        a3,
        a4,
        a5,
        a6,
        a7,
        a8,
        inputSignal1Type,
        inputSignal2Type,
        ks1,
        ks2,
        t1,
        t2,
        tw1,
        tw2,
        tw3,
        vstmax,
        vstmin,
        LAST_ENUM
    }

    public PssIEEE3B() {
        PssIEEE3B_primitive_attributes = new BaseClass[PssIEEE3B_primitive_builder.values().length];
        PssIEEE3B_class_attributes = new BaseClass[PssIEEE3B_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new PssIEEE3B();
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

    private void updateAttributeInArray(PssIEEE3B_class_attributes_enum attrEnum, BaseClass value) {
        try {
            PssIEEE3B_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(PssIEEE3B_primitive_builder attrEnum, BaseClass value) {
        try {
            PssIEEE3B_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            PssIEEE3B_class_attributes_enum attrEnum = PssIEEE3B_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated PssIEEE3B, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            PssIEEE3B_primitive_builder attrEnum = PssIEEE3B_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated PssIEEE3B, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            PssIEEE3B_primitive_builder attrEnum = PssIEEE3B_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PssIEEE3B_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            PssIEEE3B_class_attributes_enum attrEnum = PssIEEE3B_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PssIEEE3B_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : PssIEEE3B_primitive_builder.values()) {
            if (enumValue != PssIEEE3B_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PssIEEE3B." + enumValue.name());
            }
        }
        for (var enumValue : PssIEEE3B_class_attributes_enum.values()) {
            if (enumValue != PssIEEE3B_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PssIEEE3B." + enumValue.name());
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
            for (PssIEEE3B_primitive_builder attrEnum : PssIEEE3B_primitive_builder.values()) {
                BaseClass bc = PssIEEE3B_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PssIEEE3B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (PssIEEE3B_class_attributes_enum attrEnum : PssIEEE3B_class_attributes_enum.values()) {
                BaseClass bc = PssIEEE3B_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PssIEEE3B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(PssIEEE3B) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "PssIEEE3B";

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
        ATTR_NAMESPACE_MAP = new PssIEEE3B().allAttrNamespaceMap();
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
            Map.entry("a3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("a4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("a5", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("a6", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("a7", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("a8", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("inputSignal1Type", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("inputSignal2Type", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ks1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ks2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tw1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tw2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tw3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vstmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vstmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
