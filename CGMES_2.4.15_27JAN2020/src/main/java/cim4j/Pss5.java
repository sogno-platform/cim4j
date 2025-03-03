/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Italian PSS - Detailed PSS.
 */
public class Pss5 extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(Pss5.class);

    private BaseClass[] Pss5_class_attributes;
    private BaseClass[] Pss5_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new Pss5().getAttributeNamesMap();
    }

    private enum Pss5_primitive_builder implements PrimitiveBuilder {
        ctw2() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        deadband() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        isfreq() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        kf() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kpe() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kpss() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        pmm() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        tl1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl2() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl3() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl4() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tpe() {
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
        vadat() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        vsmn() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vsmx() {
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

    private enum Pss5_class_attributes_enum {
        ctw2,
        deadband,
        isfreq,
        kf,
        kpe,
        kpss,
        pmm,
        tl1,
        tl2,
        tl3,
        tl4,
        tpe,
        tw1,
        tw2,
        vadat,
        vsmn,
        vsmx,
        LAST_ENUM
    }

    public Pss5() {
        Pss5_primitive_attributes = new BaseClass[Pss5_primitive_builder.values().length];
        Pss5_class_attributes = new BaseClass[Pss5_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new Pss5();
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

    private void updateAttributeInArray(Pss5_class_attributes_enum attrEnum, BaseClass value) {
        try {
            Pss5_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(Pss5_primitive_builder attrEnum, BaseClass value) {
        try {
            Pss5_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            Pss5_class_attributes_enum attrEnum = Pss5_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated Pss5, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            Pss5_primitive_builder attrEnum = Pss5_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated Pss5, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            Pss5_primitive_builder attrEnum = Pss5_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = Pss5_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            Pss5_class_attributes_enum attrEnum = Pss5_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = Pss5_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : Pss5_primitive_builder.values()) {
            if (enumValue != Pss5_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "Pss5." + enumValue.name());
            }
        }
        for (var enumValue : Pss5_class_attributes_enum.values()) {
            if (enumValue != Pss5_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "Pss5." + enumValue.name());
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
            for (Pss5_primitive_builder attrEnum : Pss5_primitive_builder.values()) {
                BaseClass bc = Pss5_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    Pss5." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (Pss5_class_attributes_enum attrEnum : Pss5_class_attributes_enum.values()) {
                BaseClass bc = Pss5_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    Pss5." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(Pss5) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "Pss5";

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
        ATTR_NAMESPACE_MAP = new Pss5().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("ctw2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("deadband", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("isfreq", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kf", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kpe", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kpss", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pmm", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tl1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tl2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tl3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tl4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tpe", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tw1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tw2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vadat", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vsmn", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vsmx", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
