/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents IEEE Std 421.5-2005 type DC4B model. These excitation systems utilize a field-controlled dc commutator exciter with a continuously acting voltage regulator having supplies obtained from the generator or auxiliary bus.  Reference: IEEE Standard 421.5-2005 Section 5.4.
 */
public class ExcIEEEDC4B extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcIEEEDC4B.class);

    private BaseClass[] ExcIEEEDC4B_class_attributes;
    private BaseClass[] ExcIEEEDC4B_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new ExcIEEEDC4B().getAttributeNamesMap();
    }

    private enum ExcIEEEDC4B_primitive_builder implements PrimitiveBuilder {
        efd1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        efd2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ka() {
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
        oelin() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        seefd1() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        seefd2() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        ta() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        td() {
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
        uelin() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        vemin() {
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

    private enum ExcIEEEDC4B_class_attributes_enum {
        efd1,
        efd2,
        ka,
        kd,
        ke,
        kf,
        ki,
        kp,
        oelin,
        seefd1,
        seefd2,
        ta,
        td,
        te,
        tf,
        uelin,
        vemin,
        vrmax,
        vrmin,
        LAST_ENUM
    }

    public ExcIEEEDC4B() {
        ExcIEEEDC4B_primitive_attributes = new BaseClass[ExcIEEEDC4B_primitive_builder.values().length];
        ExcIEEEDC4B_class_attributes = new BaseClass[ExcIEEEDC4B_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new ExcIEEEDC4B();
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

    private void updateAttributeInArray(ExcIEEEDC4B_class_attributes_enum attrEnum, BaseClass value) {
        try {
            ExcIEEEDC4B_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(ExcIEEEDC4B_primitive_builder attrEnum, BaseClass value) {
        try {
            ExcIEEEDC4B_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            ExcIEEEDC4B_class_attributes_enum attrEnum = ExcIEEEDC4B_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated ExcIEEEDC4B, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            ExcIEEEDC4B_primitive_builder attrEnum = ExcIEEEDC4B_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated ExcIEEEDC4B, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            ExcIEEEDC4B_primitive_builder attrEnum = ExcIEEEDC4B_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcIEEEDC4B_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            ExcIEEEDC4B_class_attributes_enum attrEnum = ExcIEEEDC4B_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcIEEEDC4B_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : ExcIEEEDC4B_primitive_builder.values()) {
            if (enumValue != ExcIEEEDC4B_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcIEEEDC4B." + enumValue.name());
            }
        }
        for (var enumValue : ExcIEEEDC4B_class_attributes_enum.values()) {
            if (enumValue != ExcIEEEDC4B_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcIEEEDC4B." + enumValue.name());
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
            for (ExcIEEEDC4B_primitive_builder attrEnum : ExcIEEEDC4B_primitive_builder.values()) {
                BaseClass bc = ExcIEEEDC4B_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcIEEEDC4B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (ExcIEEEDC4B_class_attributes_enum attrEnum : ExcIEEEDC4B_class_attributes_enum.values()) {
                BaseClass bc = ExcIEEEDC4B_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcIEEEDC4B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(ExcIEEEDC4B) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "ExcIEEEDC4B";

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
        ATTR_NAMESPACE_MAP = new ExcIEEEDC4B().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("efd1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("efd2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ka", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kd", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ke", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kf", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ki", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("oelin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("seefd1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("seefd2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ta", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("td", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("te", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tf", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("uelin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vemin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
