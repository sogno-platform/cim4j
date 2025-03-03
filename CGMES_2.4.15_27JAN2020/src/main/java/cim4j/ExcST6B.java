/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Modified IEEE ST6B static excitation system with PID controller and optional inner feedbacks loop.
 */
public class ExcST6B extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcST6B.class);

    private BaseClass[] ExcST6B_class_attributes;
    private BaseClass[] ExcST6B_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new ExcST6B().getAttributeNamesMap();
    }

    private enum ExcST6B_primitive_builder implements PrimitiveBuilder {
        ilr() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        k1() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        kcl() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kff() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kg() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kia() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        klr() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        km() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kpa() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kvd() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        oelin() {
            public BaseClass construct(java.lang.String value) {
                return new ExcST6BOELselectorKind(value);
            }
        },
        tg() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ts() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tvd() {
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
        vilim() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
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
        vmult() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
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
        xc() {
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

    private enum ExcST6B_class_attributes_enum {
        ilr,
        k1,
        kcl,
        kff,
        kg,
        kia,
        klr,
        km,
        kpa,
        kvd,
        oelin,
        tg,
        ts,
        tvd,
        vamax,
        vamin,
        vilim,
        vimax,
        vimin,
        vmult,
        vrmax,
        vrmin,
        xc,
        LAST_ENUM
    }

    public ExcST6B() {
        ExcST6B_primitive_attributes = new BaseClass[ExcST6B_primitive_builder.values().length];
        ExcST6B_class_attributes = new BaseClass[ExcST6B_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new ExcST6B();
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

    private void updateAttributeInArray(ExcST6B_class_attributes_enum attrEnum, BaseClass value) {
        try {
            ExcST6B_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(ExcST6B_primitive_builder attrEnum, BaseClass value) {
        try {
            ExcST6B_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            ExcST6B_class_attributes_enum attrEnum = ExcST6B_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated ExcST6B, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            ExcST6B_primitive_builder attrEnum = ExcST6B_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated ExcST6B, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            ExcST6B_primitive_builder attrEnum = ExcST6B_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcST6B_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            ExcST6B_class_attributes_enum attrEnum = ExcST6B_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcST6B_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : ExcST6B_primitive_builder.values()) {
            if (enumValue != ExcST6B_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcST6B." + enumValue.name());
            }
        }
        for (var enumValue : ExcST6B_class_attributes_enum.values()) {
            if (enumValue != ExcST6B_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcST6B." + enumValue.name());
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
            for (ExcST6B_primitive_builder attrEnum : ExcST6B_primitive_builder.values()) {
                BaseClass bc = ExcST6B_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcST6B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (ExcST6B_class_attributes_enum attrEnum : ExcST6B_class_attributes_enum.values()) {
                BaseClass bc = ExcST6B_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcST6B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(ExcST6B) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "ExcST6B";

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
        ATTR_NAMESPACE_MAP = new ExcST6B().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("ilr", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("k1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kcl", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kff", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kg", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kia", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("klr", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("km", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kpa", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kvd", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("oelin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tg", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ts", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tvd", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vamax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vamin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vilim", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vimax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vimin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vmult", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("xc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
