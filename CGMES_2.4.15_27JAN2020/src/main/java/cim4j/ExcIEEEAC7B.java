/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents IEEE Std 421.5-2005 type AC7B model. The model represents excitation systems which consist of an ac alternator with either stationary or rotating rectifiers to produce the dc field requirements. It is an upgrade to earlier ac excitation systems, which replace only the controls but retain the ac alternator and diode rectifier bridge.  Reference: IEEE Standard 421.5-2005 Section 6.7.  In the IEEE Standard 421.5 - 2005, the [1 / sT] block is shown as [1 / (1 + sT)], which is incorrect.
 */
public class ExcIEEEAC7B extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcIEEEAC7B.class);

    private BaseClass[] ExcIEEEAC7B_class_attributes;
    private BaseClass[] ExcIEEEAC7B_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new ExcIEEEAC7B().getAttributeNamesMap();
    }

    private enum ExcIEEEAC7B_primitive_builder implements PrimitiveBuilder {
        kc() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kd() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kdr() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ke() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kf1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kf2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kf3() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kia() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kir() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kl() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kp() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kpa() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kpr() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        seve1() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        seve2() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        tdr() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        te() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tf() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        vamax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vamin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ve1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ve2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vemin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vfemax() {
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

    private enum ExcIEEEAC7B_class_attributes_enum {
        kc,
        kd,
        kdr,
        ke,
        kf1,
        kf2,
        kf3,
        kia,
        kir,
        kl,
        kp,
        kpa,
        kpr,
        seve1,
        seve2,
        tdr,
        te,
        tf,
        vamax,
        vamin,
        ve1,
        ve2,
        vemin,
        vfemax,
        vrmax,
        vrmin,
        LAST_ENUM
    }

    public ExcIEEEAC7B() {
        ExcIEEEAC7B_primitive_attributes = new BaseClass[ExcIEEEAC7B_primitive_builder.values().length];
        ExcIEEEAC7B_class_attributes = new BaseClass[ExcIEEEAC7B_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new ExcIEEEAC7B();
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

    private void updateAttributeInArray(ExcIEEEAC7B_class_attributes_enum attrEnum, BaseClass value) {
        try {
            ExcIEEEAC7B_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(ExcIEEEAC7B_primitive_builder attrEnum, BaseClass value) {
        try {
            ExcIEEEAC7B_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            ExcIEEEAC7B_class_attributes_enum attrEnum = ExcIEEEAC7B_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated ExcIEEEAC7B, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            ExcIEEEAC7B_primitive_builder attrEnum = ExcIEEEAC7B_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated ExcIEEEAC7B, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            ExcIEEEAC7B_primitive_builder attrEnum = ExcIEEEAC7B_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcIEEEAC7B_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            ExcIEEEAC7B_class_attributes_enum attrEnum = ExcIEEEAC7B_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcIEEEAC7B_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : ExcIEEEAC7B_primitive_builder.values()) {
            if (enumValue != ExcIEEEAC7B_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcIEEEAC7B." + enumValue.name());
            }
        }
        for (var enumValue : ExcIEEEAC7B_class_attributes_enum.values()) {
            if (enumValue != ExcIEEEAC7B_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcIEEEAC7B." + enumValue.name());
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
            for (ExcIEEEAC7B_primitive_builder attrEnum : ExcIEEEAC7B_primitive_builder.values()) {
                BaseClass bc = ExcIEEEAC7B_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcIEEEAC7B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (ExcIEEEAC7B_class_attributes_enum attrEnum : ExcIEEEAC7B_class_attributes_enum.values()) {
                BaseClass bc = ExcIEEEAC7B_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcIEEEAC7B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(ExcIEEEAC7B) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "ExcIEEEAC7B";

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
        ATTR_NAMESPACE_MAP = new ExcIEEEAC7B().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("kc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kd", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kdr", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ke", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kf1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kf2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kf3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kia", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kir", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kl", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kpa", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kpr", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("seve1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("seve2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tdr", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("te", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tf", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vamax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vamin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ve1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ve2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vemin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vfemax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
