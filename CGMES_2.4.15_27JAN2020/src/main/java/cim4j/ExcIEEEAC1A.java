/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents IEEE Std 421.5-2005 type AC1A model. The model represents the field-controlled alternator-rectifier excitation systems designated Type AC1A. These excitation systems consist of an alternator main exciter with non-controlled rectifiers.  Reference: IEEE Standard 421.5-2005 Section 6.1.
 */
public class ExcIEEEAC1A extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcIEEEAC1A.class);

    private BaseClass[] ExcIEEEAC1A_class_attributes;
    private BaseClass[] ExcIEEEAC1A_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new ExcIEEEAC1A().getAttributeNamesMap();
    }

    private enum ExcIEEEAC1A_primitive_builder implements PrimitiveBuilder {
        ka() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
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
        ke() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kf() {
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
        ta() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tb() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tc() {
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

    private enum ExcIEEEAC1A_class_attributes_enum {
        ka,
        kc,
        kd,
        ke,
        kf,
        seve1,
        seve2,
        ta,
        tb,
        tc,
        te,
        tf,
        vamax,
        vamin,
        ve1,
        ve2,
        vrmax,
        vrmin,
        LAST_ENUM
    }

    public ExcIEEEAC1A() {
        ExcIEEEAC1A_primitive_attributes = new BaseClass[ExcIEEEAC1A_primitive_builder.values().length];
        ExcIEEEAC1A_class_attributes = new BaseClass[ExcIEEEAC1A_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new ExcIEEEAC1A();
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

    private void updateAttributeInArray(ExcIEEEAC1A_class_attributes_enum attrEnum, BaseClass value) {
        try {
            ExcIEEEAC1A_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(ExcIEEEAC1A_primitive_builder attrEnum, BaseClass value) {
        try {
            ExcIEEEAC1A_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            ExcIEEEAC1A_class_attributes_enum attrEnum = ExcIEEEAC1A_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated ExcIEEEAC1A, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            ExcIEEEAC1A_primitive_builder attrEnum = ExcIEEEAC1A_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated ExcIEEEAC1A, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            ExcIEEEAC1A_primitive_builder attrEnum = ExcIEEEAC1A_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcIEEEAC1A_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            ExcIEEEAC1A_class_attributes_enum attrEnum = ExcIEEEAC1A_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcIEEEAC1A_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : ExcIEEEAC1A_primitive_builder.values()) {
            if (enumValue != ExcIEEEAC1A_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcIEEEAC1A." + enumValue.name());
            }
        }
        for (var enumValue : ExcIEEEAC1A_class_attributes_enum.values()) {
            if (enumValue != ExcIEEEAC1A_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcIEEEAC1A." + enumValue.name());
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
            for (ExcIEEEAC1A_primitive_builder attrEnum : ExcIEEEAC1A_primitive_builder.values()) {
                BaseClass bc = ExcIEEEAC1A_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcIEEEAC1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (ExcIEEEAC1A_class_attributes_enum attrEnum : ExcIEEEAC1A_class_attributes_enum.values()) {
                BaseClass bc = ExcIEEEAC1A_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcIEEEAC1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(ExcIEEEAC1A) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "ExcIEEEAC1A";

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
        ATTR_NAMESPACE_MAP = new ExcIEEEAC1A().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("ka", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kd", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ke", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kf", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("seve1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("seve2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ta", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tb", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("te", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tf", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vamax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vamin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ve1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ve2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
