/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Current limitation model.  The current limitation model combines the physical limits.  Reference: IEC Standard 61400-27-1 Section 6.6.5.7.
 */
public class WindContCurrLimIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindContCurrLimIEC.class);

    private BaseClass[] WindContCurrLimIEC_class_attributes;
    private BaseClass[] WindContCurrLimIEC_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new WindContCurrLimIEC().getAttributeNamesMap();
    }

    private enum WindContCurrLimIEC_primitive_builder implements PrimitiveBuilder {
        imax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        imaxdip() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        mdfslim() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        mqpri() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        tufilt() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum WindContCurrLimIEC_class_attributes_enum {
        WindDynamicsLookupTable,
        WindTurbineType3or4IEC,
        imax,
        imaxdip,
        mdfslim,
        mqpri,
        tufilt,
        LAST_ENUM
    }

    public WindContCurrLimIEC() {
        WindContCurrLimIEC_primitive_attributes = new BaseClass[WindContCurrLimIEC_primitive_builder.values().length];
        WindContCurrLimIEC_class_attributes = new BaseClass[WindContCurrLimIEC_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new WindContCurrLimIEC();
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

    private void updateAttributeInArray(WindContCurrLimIEC_class_attributes_enum attrEnum, BaseClass value) {
        try {
            WindContCurrLimIEC_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(WindContCurrLimIEC_primitive_builder attrEnum, BaseClass value) {
        try {
            WindContCurrLimIEC_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            WindContCurrLimIEC_class_attributes_enum attrEnum = WindContCurrLimIEC_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated WindContCurrLimIEC, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            WindContCurrLimIEC_primitive_builder attrEnum = WindContCurrLimIEC_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated WindContCurrLimIEC, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            WindContCurrLimIEC_primitive_builder attrEnum = WindContCurrLimIEC_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindContCurrLimIEC_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            WindContCurrLimIEC_class_attributes_enum attrEnum = WindContCurrLimIEC_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindContCurrLimIEC_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : WindContCurrLimIEC_primitive_builder.values()) {
            if (enumValue != WindContCurrLimIEC_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindContCurrLimIEC." + enumValue.name());
            }
        }
        for (var enumValue : WindContCurrLimIEC_class_attributes_enum.values()) {
            if (enumValue != WindContCurrLimIEC_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindContCurrLimIEC." + enumValue.name());
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
            for (WindContCurrLimIEC_primitive_builder attrEnum : WindContCurrLimIEC_primitive_builder.values()) {
                BaseClass bc = WindContCurrLimIEC_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindContCurrLimIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (WindContCurrLimIEC_class_attributes_enum attrEnum : WindContCurrLimIEC_class_attributes_enum.values()) {
                BaseClass bc = WindContCurrLimIEC_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindContCurrLimIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(WindContCurrLimIEC) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "WindContCurrLimIEC";

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
        ATTR_NAMESPACE_MAP = new WindContCurrLimIEC().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("WindDynamicsLookupTable", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("WindTurbineType3or4IEC", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("imax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("imaxdip", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("mdfslim", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("mqpri", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tufilt", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
