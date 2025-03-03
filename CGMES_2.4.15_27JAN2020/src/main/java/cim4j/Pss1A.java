/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Single input power system stabilizer. It is a modified version in order to allow representation of various vendors' implementations on PSS type 1A.
 */
public class Pss1A extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(Pss1A.class);

    private BaseClass[] Pss1A_class_attributes;
    private BaseClass[] Pss1A_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new Pss1A().getAttributeNamesMap();
    }

    private enum Pss1A_primitive_builder implements PrimitiveBuilder {
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
        inputSignalType() {
            public BaseClass construct(java.lang.String value) {
                return new InputSignalKind(value);
            }
        },
        kd() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
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
        tdelay() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        vcl() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vcu() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
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

    private enum Pss1A_class_attributes_enum {
        a1,
        a2,
        a3,
        a4,
        a5,
        a6,
        a7,
        a8,
        inputSignalType,
        kd,
        ks,
        t1,
        t2,
        t3,
        t4,
        t5,
        t6,
        tdelay,
        vcl,
        vcu,
        vrmax,
        vrmin,
        LAST_ENUM
    }

    public Pss1A() {
        Pss1A_primitive_attributes = new BaseClass[Pss1A_primitive_builder.values().length];
        Pss1A_class_attributes = new BaseClass[Pss1A_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new Pss1A();
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

    private void updateAttributeInArray(Pss1A_class_attributes_enum attrEnum, BaseClass value) {
        try {
            Pss1A_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(Pss1A_primitive_builder attrEnum, BaseClass value) {
        try {
            Pss1A_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            Pss1A_class_attributes_enum attrEnum = Pss1A_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated Pss1A, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            Pss1A_primitive_builder attrEnum = Pss1A_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated Pss1A, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            Pss1A_primitive_builder attrEnum = Pss1A_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = Pss1A_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            Pss1A_class_attributes_enum attrEnum = Pss1A_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = Pss1A_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : Pss1A_primitive_builder.values()) {
            if (enumValue != Pss1A_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "Pss1A." + enumValue.name());
            }
        }
        for (var enumValue : Pss1A_class_attributes_enum.values()) {
            if (enumValue != Pss1A_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "Pss1A." + enumValue.name());
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
            for (Pss1A_primitive_builder attrEnum : Pss1A_primitive_builder.values()) {
                BaseClass bc = Pss1A_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    Pss1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (Pss1A_class_attributes_enum attrEnum : Pss1A_class_attributes_enum.values()) {
                BaseClass bc = Pss1A_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    Pss1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(Pss1A) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "Pss1A";

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
        ATTR_NAMESPACE_MAP = new Pss1A().allAttrNamespaceMap();
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
            Map.entry("inputSignalType", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kd", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ks", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t5", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t6", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tdelay", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vcl", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vcu", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
