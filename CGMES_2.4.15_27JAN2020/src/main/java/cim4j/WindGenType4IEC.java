/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * IEC Type 4 generator set model.  Reference: IEC Standard 61400-27-1 Section 6.6.3.4.
 */
public class WindGenType4IEC extends WindTurbineType3or4IEC {

    private static final Logging LOG = Logging.getLogger(WindGenType4IEC.class);

    private BaseClass[] WindGenType4IEC_class_attributes;
    private BaseClass[] WindGenType4IEC_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new WindGenType4IEC().getAttributeNamesMap();
    }

    private enum WindGenType4IEC_primitive_builder implements PrimitiveBuilder {
        dipmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        diqmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        diqmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        tg() {
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

    private enum WindGenType4IEC_class_attributes_enum {
        dipmax,
        diqmax,
        diqmin,
        tg,
        LAST_ENUM
    }

    public WindGenType4IEC() {
        WindGenType4IEC_primitive_attributes = new BaseClass[WindGenType4IEC_primitive_builder.values().length];
        WindGenType4IEC_class_attributes = new BaseClass[WindGenType4IEC_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new WindGenType4IEC();
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

    private void updateAttributeInArray(WindGenType4IEC_class_attributes_enum attrEnum, BaseClass value) {
        try {
            WindGenType4IEC_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(WindGenType4IEC_primitive_builder attrEnum, BaseClass value) {
        try {
            WindGenType4IEC_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            WindGenType4IEC_class_attributes_enum attrEnum = WindGenType4IEC_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated WindGenType4IEC, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            WindGenType4IEC_primitive_builder attrEnum = WindGenType4IEC_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated WindGenType4IEC, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            WindGenType4IEC_primitive_builder attrEnum = WindGenType4IEC_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindGenType4IEC_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            WindGenType4IEC_class_attributes_enum attrEnum = WindGenType4IEC_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindGenType4IEC_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : WindGenType4IEC_primitive_builder.values()) {
            if (enumValue != WindGenType4IEC_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindGenType4IEC." + enumValue.name());
            }
        }
        for (var enumValue : WindGenType4IEC_class_attributes_enum.values()) {
            if (enumValue != WindGenType4IEC_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindGenType4IEC." + enumValue.name());
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
            for (WindGenType4IEC_primitive_builder attrEnum : WindGenType4IEC_primitive_builder.values()) {
                BaseClass bc = WindGenType4IEC_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindGenType4IEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (WindGenType4IEC_class_attributes_enum attrEnum : WindGenType4IEC_class_attributes_enum.values()) {
                BaseClass bc = WindGenType4IEC_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindGenType4IEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(WindGenType4IEC) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "WindGenType4IEC";

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
        ATTR_NAMESPACE_MAP = new WindGenType4IEC().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("dipmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("diqmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("diqmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tg", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
