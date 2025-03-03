/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Detailed Excitation System Model - ELIN (VATECH).  This model represents an all-static excitation system. A PI voltage controller establishes a desired field current set point for a proportional current controller. The integrator of the PI controller has a follow-up input to match its signal to the present field current.  Power system stabilizer models used in conjunction with this excitation system model: PssELIN2, PssIEEE2B, Pss2B.
 */
public class ExcELIN2 extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcELIN2.class);

    private BaseClass[] ExcELIN2_class_attributes;
    private BaseClass[] ExcELIN2_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new ExcELIN2().getAttributeNamesMap();
    }

    private enum ExcELIN2_primitive_builder implements PrimitiveBuilder {
        efdbas() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        iefmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        iefmax2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        iefmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        k1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        k1ec() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        k2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        k3() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        k4() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kd1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ke2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ketb() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pid1max() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        seve1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        seve2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        tb1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        te() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        te2() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ti3() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti4() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tr4() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        upmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        upmin() {
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
        xp() {
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

    private enum ExcELIN2_class_attributes_enum {
        efdbas,
        iefmax,
        iefmax2,
        iefmin,
        k1,
        k1ec,
        k2,
        k3,
        k4,
        kd1,
        ke2,
        ketb,
        pid1max,
        seve1,
        seve2,
        tb1,
        te,
        te2,
        ti1,
        ti3,
        ti4,
        tr4,
        upmax,
        upmin,
        ve1,
        ve2,
        xp,
        LAST_ENUM
    }

    public ExcELIN2() {
        ExcELIN2_primitive_attributes = new BaseClass[ExcELIN2_primitive_builder.values().length];
        ExcELIN2_class_attributes = new BaseClass[ExcELIN2_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new ExcELIN2();
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

    private void updateAttributeInArray(ExcELIN2_class_attributes_enum attrEnum, BaseClass value) {
        try {
            ExcELIN2_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(ExcELIN2_primitive_builder attrEnum, BaseClass value) {
        try {
            ExcELIN2_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            ExcELIN2_class_attributes_enum attrEnum = ExcELIN2_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated ExcELIN2, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            ExcELIN2_primitive_builder attrEnum = ExcELIN2_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated ExcELIN2, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            ExcELIN2_primitive_builder attrEnum = ExcELIN2_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcELIN2_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            ExcELIN2_class_attributes_enum attrEnum = ExcELIN2_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcELIN2_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : ExcELIN2_primitive_builder.values()) {
            if (enumValue != ExcELIN2_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcELIN2." + enumValue.name());
            }
        }
        for (var enumValue : ExcELIN2_class_attributes_enum.values()) {
            if (enumValue != ExcELIN2_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcELIN2." + enumValue.name());
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
            for (ExcELIN2_primitive_builder attrEnum : ExcELIN2_primitive_builder.values()) {
                BaseClass bc = ExcELIN2_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcELIN2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (ExcELIN2_class_attributes_enum attrEnum : ExcELIN2_class_attributes_enum.values()) {
                BaseClass bc = ExcELIN2_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcELIN2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(ExcELIN2) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "ExcELIN2";

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
        ATTR_NAMESPACE_MAP = new ExcELIN2().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("efdbas", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("iefmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("iefmax2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("iefmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("k1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("k1ec", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("k2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("k3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("k4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kd1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ke2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ketb", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pid1max", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("seve1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("seve2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tb1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("te", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("te2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ti1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ti3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ti4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tr4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("upmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("upmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ve1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ve2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("xp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
