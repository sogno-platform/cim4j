/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * This is a root class to provide common identification for all classes needing identification and naming attributes.
 */
public class IdentifiedObject extends BaseClass {

    private static final Logging LOG = Logging.getLogger(IdentifiedObject.class);

    private BaseClass[] IdentifiedObject_class_attributes;
    private BaseClass[] IdentifiedObject_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new IdentifiedObject().getAttributeNamesMap();
    }

    private enum IdentifiedObject_primitive_builder implements PrimitiveBuilder {
        description() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        energyIdentCodeEic() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        mRID() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        name() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        shortName() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum IdentifiedObject_class_attributes_enum {
        DiagramObjects,
        description,
        energyIdentCodeEic,
        mRID,
        name,
        shortName,
        LAST_ENUM
    }

    public IdentifiedObject() {
        IdentifiedObject_primitive_attributes = new BaseClass[IdentifiedObject_primitive_builder.values().length];
        IdentifiedObject_class_attributes = new BaseClass[IdentifiedObject_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new IdentifiedObject();
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

    private void updateAttributeInArray(IdentifiedObject_class_attributes_enum attrEnum, BaseClass value) {
        try {
            IdentifiedObject_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(IdentifiedObject_primitive_builder attrEnum, BaseClass value) {
        try {
            IdentifiedObject_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            IdentifiedObject_class_attributes_enum attrEnum = IdentifiedObject_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated IdentifiedObject, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            IdentifiedObject_primitive_builder attrEnum = IdentifiedObject_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated IdentifiedObject, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            IdentifiedObject_primitive_builder attrEnum = IdentifiedObject_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = IdentifiedObject_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            IdentifiedObject_class_attributes_enum attrEnum = IdentifiedObject_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = IdentifiedObject_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : IdentifiedObject_primitive_builder.values()) {
            if (enumValue != IdentifiedObject_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "IdentifiedObject." + enumValue.name());
            }
        }
        for (var enumValue : IdentifiedObject_class_attributes_enum.values()) {
            if (enumValue != IdentifiedObject_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "IdentifiedObject." + enumValue.name());
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
            for (IdentifiedObject_primitive_builder attrEnum : IdentifiedObject_primitive_builder.values()) {
                BaseClass bc = IdentifiedObject_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    IdentifiedObject." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (IdentifiedObject_class_attributes_enum attrEnum : IdentifiedObject_class_attributes_enum.values()) {
                BaseClass bc = IdentifiedObject_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    IdentifiedObject." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(IdentifiedObject) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "IdentifiedObject";

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
        ATTR_NAMESPACE_MAP = new IdentifiedObject().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("DiagramObjects", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("description", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("energyIdentCodeEic", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("mRID", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("name", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("shortName", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
