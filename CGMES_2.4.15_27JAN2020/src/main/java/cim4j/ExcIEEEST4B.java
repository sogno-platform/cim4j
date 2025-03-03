/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents IEEE Std 421.5-2005 type ST4B model. This model is a variation of the Type ST3A model, with a proportional plus integral (PI) regulator block replacing the lag-lead regulator characteristic that is in the ST3A model. Both potential and compound source rectifier excitation systems are modeled.  The PI regulator blocks have non-windup limits that are represented. The voltage regulator of this model is typically implemented digitally.  Reference: IEEE Standard 421.5-2005 Section 7.4.
 */
public class ExcIEEEST4B extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcIEEEST4B.class);

    private BaseClass[] ExcIEEEST4B_class_attributes;
    private BaseClass[] ExcIEEEST4B_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new ExcIEEEST4B().getAttributeNamesMap();
    }

    private enum ExcIEEEST4B_primitive_builder implements PrimitiveBuilder {
        kc() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kg() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ki() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kim() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kir() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kp() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kpm() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kpr() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ta() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        thetap() {
            public BaseClass construct(java.lang.String value) {
                return new AngleDegrees(value);
            }
        },
        vbmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vmmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vmmin() {
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
        xl() {
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

    private enum ExcIEEEST4B_class_attributes_enum {
        kc,
        kg,
        ki,
        kim,
        kir,
        kp,
        kpm,
        kpr,
        ta,
        thetap,
        vbmax,
        vmmax,
        vmmin,
        vrmax,
        vrmin,
        xl,
        LAST_ENUM
    }

    public ExcIEEEST4B() {
        ExcIEEEST4B_primitive_attributes = new BaseClass[ExcIEEEST4B_primitive_builder.values().length];
        ExcIEEEST4B_class_attributes = new BaseClass[ExcIEEEST4B_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new ExcIEEEST4B();
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

    private void updateAttributeInArray(ExcIEEEST4B_class_attributes_enum attrEnum, BaseClass value) {
        try {
            ExcIEEEST4B_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(ExcIEEEST4B_primitive_builder attrEnum, BaseClass value) {
        try {
            ExcIEEEST4B_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            ExcIEEEST4B_class_attributes_enum attrEnum = ExcIEEEST4B_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated ExcIEEEST4B, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            ExcIEEEST4B_primitive_builder attrEnum = ExcIEEEST4B_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated ExcIEEEST4B, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            ExcIEEEST4B_primitive_builder attrEnum = ExcIEEEST4B_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcIEEEST4B_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            ExcIEEEST4B_class_attributes_enum attrEnum = ExcIEEEST4B_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcIEEEST4B_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : ExcIEEEST4B_primitive_builder.values()) {
            if (enumValue != ExcIEEEST4B_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcIEEEST4B." + enumValue.name());
            }
        }
        for (var enumValue : ExcIEEEST4B_class_attributes_enum.values()) {
            if (enumValue != ExcIEEEST4B_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcIEEEST4B." + enumValue.name());
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
            for (ExcIEEEST4B_primitive_builder attrEnum : ExcIEEEST4B_primitive_builder.values()) {
                BaseClass bc = ExcIEEEST4B_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcIEEEST4B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (ExcIEEEST4B_class_attributes_enum attrEnum : ExcIEEEST4B_class_attributes_enum.values()) {
                BaseClass bc = ExcIEEEST4B_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcIEEEST4B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(ExcIEEEST4B) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "ExcIEEEST4B";

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
        ATTR_NAMESPACE_MAP = new ExcIEEEST4B().allAttrNamespaceMap();
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
            Map.entry("kg", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ki", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kim", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kir", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kpm", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kpr", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ta", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("thetap", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vbmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vmmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vmmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("xl", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
