/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Modified IEEE AC8B alternator-supplied rectifier excitation system with speed input and input limiter.
 */
public class ExcAC8B extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcAC8B.class);

    private BaseClass[] ExcAC8B_class_attributes;
    private BaseClass[] ExcAC8B_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new ExcAC8B().getAttributeNamesMap();
    }

    private enum ExcAC8B_primitive_builder implements PrimitiveBuilder {
        inlim() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
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
        kir() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kpr() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ks() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pidlim() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
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
        telim() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
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
        vimax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vimin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vpidmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vpidmin() {
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
        vtmult() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum ExcAC8B_class_attributes_enum {
        inlim,
        ka,
        kc,
        kd,
        kdr,
        ke,
        kir,
        kpr,
        ks,
        pidlim,
        seve1,
        seve2,
        ta,
        tdr,
        te,
        telim,
        ve1,
        ve2,
        vemin,
        vfemax,
        vimax,
        vimin,
        vpidmax,
        vpidmin,
        vrmax,
        vrmin,
        vtmult,
        LAST_ENUM
    }

    public ExcAC8B() {
        ExcAC8B_primitive_attributes = new BaseClass[ExcAC8B_primitive_builder.values().length];
        ExcAC8B_class_attributes = new BaseClass[ExcAC8B_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new ExcAC8B();
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

    private void updateAttributeInArray(ExcAC8B_class_attributes_enum attrEnum, BaseClass value) {
        try {
            ExcAC8B_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(ExcAC8B_primitive_builder attrEnum, BaseClass value) {
        try {
            ExcAC8B_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            ExcAC8B_class_attributes_enum attrEnum = ExcAC8B_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated ExcAC8B, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            ExcAC8B_primitive_builder attrEnum = ExcAC8B_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated ExcAC8B, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            ExcAC8B_primitive_builder attrEnum = ExcAC8B_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcAC8B_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            ExcAC8B_class_attributes_enum attrEnum = ExcAC8B_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcAC8B_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : ExcAC8B_primitive_builder.values()) {
            if (enumValue != ExcAC8B_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcAC8B." + enumValue.name());
            }
        }
        for (var enumValue : ExcAC8B_class_attributes_enum.values()) {
            if (enumValue != ExcAC8B_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcAC8B." + enumValue.name());
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
            for (ExcAC8B_primitive_builder attrEnum : ExcAC8B_primitive_builder.values()) {
                BaseClass bc = ExcAC8B_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcAC8B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (ExcAC8B_class_attributes_enum attrEnum : ExcAC8B_class_attributes_enum.values()) {
                BaseClass bc = ExcAC8B_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcAC8B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(ExcAC8B) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "ExcAC8B";

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
        ATTR_NAMESPACE_MAP = new ExcAC8B().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("inlim", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ka", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kd", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kdr", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ke", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kir", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kpr", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ks", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pidlim", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("seve1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("seve2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ta", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tdr", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("te", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("telim", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ve1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ve2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vemin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vfemax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vimax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vimin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vpidmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vpidmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vtmult", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
