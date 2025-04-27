/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents IEEE Std 421.5-2005 type ST7B model. This model is representative of static potential-source excitation systems. In this system, the AVR consists of a PI voltage regulator. A phase lead-lag filter in series allows introduction of a derivative function, typically used with brushless excitation systems. In that case, the regulator is of the PID type. In addition, the terminal voltage channel includes a phase lead-lag filter.  The AVR includes the appropriate inputs on its reference for overexcitation limiter (OEL1), underexcitation limiter (UEL), stator current limiter (SCL), and current compensator (DROOP). All these limitations, when they work at voltage reference level, keep the PSS (VS signal from Type PSS1A, PSS2A, or PSS2B) in operation. However, the UEL limitation can also be transferred to the high value (HV) gate acting on the output signal. In addition, the output signal passes through a low value (LV) gate for a ceiling overexcitation limiter (OEL2).  Reference: IEEE Standard 421.5-2005 Section 7.7.
 */
public class ExcIEEEST7B extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcIEEEST7B.class);

    private BaseClass[] ExcIEEEST7B_class_attributes;
    private BaseClass[] ExcIEEEST7B_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new ExcIEEEST7B().getAttributeNamesMap();
    }

    private enum ExcIEEEST7B_primitive_builder implements PrimitiveBuilder {
        kh() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kia() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kl() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kpa() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        oelin() {
            public BaseClass construct(java.lang.String value) {
                return new ExcST7BOELselectorKind(value);
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
        tf() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tg() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tia() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        uelin() {
            public BaseClass construct(java.lang.String value) {
                return new ExcST7BUELselectorKind(value);
            }
        },
        vmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vmin() {
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

    private enum ExcIEEEST7B_class_attributes_enum {
        kh,
        kia,
        kl,
        kpa,
        oelin,
        tb,
        tc,
        tf,
        tg,
        tia,
        uelin,
        vmax,
        vmin,
        vrmax,
        vrmin,
        LAST_ENUM
    }

    public ExcIEEEST7B() {
        ExcIEEEST7B_primitive_attributes = new BaseClass[ExcIEEEST7B_primitive_builder.values().length];
        ExcIEEEST7B_class_attributes = new BaseClass[ExcIEEEST7B_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new ExcIEEEST7B();
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

    private void updateAttributeInArray(ExcIEEEST7B_class_attributes_enum attrEnum, BaseClass value) {
        try {
            ExcIEEEST7B_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(ExcIEEEST7B_primitive_builder attrEnum, BaseClass value) {
        try {
            ExcIEEEST7B_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            ExcIEEEST7B_class_attributes_enum attrEnum = ExcIEEEST7B_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated ExcIEEEST7B, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            ExcIEEEST7B_primitive_builder attrEnum = ExcIEEEST7B_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated ExcIEEEST7B, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            ExcIEEEST7B_primitive_builder attrEnum = ExcIEEEST7B_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcIEEEST7B_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            ExcIEEEST7B_class_attributes_enum attrEnum = ExcIEEEST7B_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcIEEEST7B_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : ExcIEEEST7B_primitive_builder.values()) {
            if (enumValue != ExcIEEEST7B_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcIEEEST7B." + enumValue.name());
            }
        }
        for (var enumValue : ExcIEEEST7B_class_attributes_enum.values()) {
            if (enumValue != ExcIEEEST7B_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcIEEEST7B." + enumValue.name());
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
            for (ExcIEEEST7B_primitive_builder attrEnum : ExcIEEEST7B_primitive_builder.values()) {
                BaseClass bc = ExcIEEEST7B_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcIEEEST7B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (ExcIEEEST7B_class_attributes_enum attrEnum : ExcIEEEST7B_class_attributes_enum.values()) {
                BaseClass bc = ExcIEEEST7B_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcIEEEST7B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(ExcIEEEST7B) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "ExcIEEEST7B";

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
        ATTR_NAMESPACE_MAP = new ExcIEEEST7B().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("kh", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kia", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kl", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kpa", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("oelin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tb", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tf", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tg", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tia", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("uelin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
