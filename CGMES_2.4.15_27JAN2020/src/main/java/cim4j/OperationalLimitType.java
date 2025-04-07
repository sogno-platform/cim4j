/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The operational meaning of a category of limits.
 */
public class OperationalLimitType extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(OperationalLimitType.class);

    private BaseClass[] OperationalLimitType_class_attributes;
    private BaseClass[] OperationalLimitType_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new OperationalLimitType().getAttributeNamesMap();
    }

    private enum OperationalLimitType_primitive_builder implements PrimitiveBuilder {
        acceptableDuration() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        direction() {
            public BaseClass construct(java.lang.String value) {
                return new OperationalLimitDirectionKind(value);
            }
        },
        limitType() {
            public BaseClass construct(java.lang.String value) {
                return new LimitTypeKind(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum OperationalLimitType_class_attributes_enum {
        OperationalLimit,
        acceptableDuration,
        direction,
        limitType,
        LAST_ENUM
    }

    public OperationalLimitType() {
        OperationalLimitType_primitive_attributes = new BaseClass[OperationalLimitType_primitive_builder.values().length];
        OperationalLimitType_class_attributes = new BaseClass[OperationalLimitType_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new OperationalLimitType();
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

    private void updateAttributeInArray(OperationalLimitType_class_attributes_enum attrEnum, BaseClass value) {
        try {
            OperationalLimitType_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(OperationalLimitType_primitive_builder attrEnum, BaseClass value) {
        try {
            OperationalLimitType_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            OperationalLimitType_class_attributes_enum attrEnum = OperationalLimitType_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated OperationalLimitType, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            OperationalLimitType_primitive_builder attrEnum = OperationalLimitType_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated OperationalLimitType, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            OperationalLimitType_primitive_builder attrEnum = OperationalLimitType_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = OperationalLimitType_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            OperationalLimitType_class_attributes_enum attrEnum = OperationalLimitType_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = OperationalLimitType_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : OperationalLimitType_primitive_builder.values()) {
            if (enumValue != OperationalLimitType_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "OperationalLimitType." + enumValue.name());
            }
        }
        for (var enumValue : OperationalLimitType_class_attributes_enum.values()) {
            if (enumValue != OperationalLimitType_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "OperationalLimitType." + enumValue.name());
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
            for (OperationalLimitType_primitive_builder attrEnum : OperationalLimitType_primitive_builder.values()) {
                BaseClass bc = OperationalLimitType_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    OperationalLimitType." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (OperationalLimitType_class_attributes_enum attrEnum : OperationalLimitType_class_attributes_enum.values()) {
                BaseClass bc = OperationalLimitType_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    OperationalLimitType." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(OperationalLimitType) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "OperationalLimitType";

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
        ATTR_NAMESPACE_MAP = new OperationalLimitType().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("OperationalLimit", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("acceptableDuration", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("direction", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("limitType", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
