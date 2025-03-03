/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Two mass model.  Reference: IEC Standard 61400-27-1 Section 6.6.2.1.
 */
public class WindMechIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindMechIEC.class);

    private BaseClass[] WindMechIEC_class_attributes;
    private BaseClass[] WindMechIEC_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new WindMechIEC().getAttributeNamesMap();
    }

    private enum WindMechIEC_primitive_builder implements PrimitiveBuilder {
        cdrt() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        hgen() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        hwtr() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        kdrt() {
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

    private enum WindMechIEC_class_attributes_enum {
        WindGenTurbineType3IEC,
        WindTurbineType1or2IEC,
        WindTurbineType4bIEC,
        cdrt,
        hgen,
        hwtr,
        kdrt,
        LAST_ENUM
    }

    public WindMechIEC() {
        WindMechIEC_primitive_attributes = new BaseClass[WindMechIEC_primitive_builder.values().length];
        WindMechIEC_class_attributes = new BaseClass[WindMechIEC_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new WindMechIEC();
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

    private void updateAttributeInArray(WindMechIEC_class_attributes_enum attrEnum, BaseClass value) {
        try {
            WindMechIEC_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(WindMechIEC_primitive_builder attrEnum, BaseClass value) {
        try {
            WindMechIEC_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            WindMechIEC_class_attributes_enum attrEnum = WindMechIEC_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated WindMechIEC, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            WindMechIEC_primitive_builder attrEnum = WindMechIEC_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated WindMechIEC, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            WindMechIEC_primitive_builder attrEnum = WindMechIEC_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindMechIEC_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            WindMechIEC_class_attributes_enum attrEnum = WindMechIEC_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindMechIEC_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : WindMechIEC_primitive_builder.values()) {
            if (enumValue != WindMechIEC_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindMechIEC." + enumValue.name());
            }
        }
        for (var enumValue : WindMechIEC_class_attributes_enum.values()) {
            if (enumValue != WindMechIEC_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindMechIEC." + enumValue.name());
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
            for (WindMechIEC_primitive_builder attrEnum : WindMechIEC_primitive_builder.values()) {
                BaseClass bc = WindMechIEC_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindMechIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (WindMechIEC_class_attributes_enum attrEnum : WindMechIEC_class_attributes_enum.values()) {
                BaseClass bc = WindMechIEC_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindMechIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(WindMechIEC) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "WindMechIEC";

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
        ATTR_NAMESPACE_MAP = new WindMechIEC().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("WindGenTurbineType3IEC", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("WindTurbineType1or2IEC", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("WindTurbineType4bIEC", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("cdrt", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("hgen", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("hwtr", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kdrt", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
