/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Proportional/Integral Regulator Excitation System Model.  This model can be used to represent excitation systems with a proportional-integral (PI) voltage regulator controller.
 */
public class ExcPIC extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcPIC.class);

    private BaseClass[] ExcPIC_class_attributes;
    private BaseClass[] ExcPIC_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new ExcPIC().getAttributeNamesMap();
    }

    private enum ExcPIC_primitive_builder implements PrimitiveBuilder {
        e1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        e2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        efdmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        efdmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
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
        ki() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kp() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        se1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        se2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ta1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ta2() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ta3() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ta4() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        te() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tf1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tf2() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        vr1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vr2() {
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

    private enum ExcPIC_class_attributes_enum {
        e1,
        e2,
        efdmax,
        efdmin,
        ka,
        kc,
        ke,
        kf,
        ki,
        kp,
        se1,
        se2,
        ta1,
        ta2,
        ta3,
        ta4,
        te,
        tf1,
        tf2,
        vr1,
        vr2,
        vrmax,
        vrmin,
        LAST_ENUM
    }

    public ExcPIC() {
        ExcPIC_primitive_attributes = new BaseClass[ExcPIC_primitive_builder.values().length];
        ExcPIC_class_attributes = new BaseClass[ExcPIC_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new ExcPIC();
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

    private void updateAttributeInArray(ExcPIC_class_attributes_enum attrEnum, BaseClass value) {
        try {
            ExcPIC_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(ExcPIC_primitive_builder attrEnum, BaseClass value) {
        try {
            ExcPIC_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            ExcPIC_class_attributes_enum attrEnum = ExcPIC_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated ExcPIC, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            ExcPIC_primitive_builder attrEnum = ExcPIC_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated ExcPIC, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            ExcPIC_primitive_builder attrEnum = ExcPIC_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcPIC_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            ExcPIC_class_attributes_enum attrEnum = ExcPIC_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcPIC_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : ExcPIC_primitive_builder.values()) {
            if (enumValue != ExcPIC_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcPIC." + enumValue.name());
            }
        }
        for (var enumValue : ExcPIC_class_attributes_enum.values()) {
            if (enumValue != ExcPIC_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcPIC." + enumValue.name());
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
            for (ExcPIC_primitive_builder attrEnum : ExcPIC_primitive_builder.values()) {
                BaseClass bc = ExcPIC_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcPIC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (ExcPIC_class_attributes_enum attrEnum : ExcPIC_class_attributes_enum.values()) {
                BaseClass bc = ExcPIC_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcPIC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(ExcPIC) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "ExcPIC";

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
        ATTR_NAMESPACE_MAP = new ExcPIC().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("e1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("e2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("efdmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("efdmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ka", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ke", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kf", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ki", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("se1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("se2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ta1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ta2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ta3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ta4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("te", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tf1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tf2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vr1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vr2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
