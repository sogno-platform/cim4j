/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A point in a given space defined by 3 coordinates and associated to a diagram object.  The coordinates may be positive or negative as the origin does not have to be in the corner of a diagram.
 */
public class DiagramObjectPoint extends BaseClass {

    private static final Logging LOG = Logging.getLogger(DiagramObjectPoint.class);

    private BaseClass[] DiagramObjectPoint_class_attributes;
    private BaseClass[] DiagramObjectPoint_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new DiagramObjectPoint().getAttributeNamesMap();
    }

    private enum DiagramObjectPoint_primitive_builder implements PrimitiveBuilder {
        sequenceNumber() {
            public BaseClass construct(java.lang.String value) {
                return new Integer(value);
            }
        },
        xPosition() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        yPosition() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        zPosition() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum DiagramObjectPoint_class_attributes_enum {
        DiagramObject,
        DiagramObjectGluePoint,
        sequenceNumber,
        xPosition,
        yPosition,
        zPosition,
        LAST_ENUM
    }

    public DiagramObjectPoint() {
        DiagramObjectPoint_primitive_attributes = new BaseClass[DiagramObjectPoint_primitive_builder.values().length];
        DiagramObjectPoint_class_attributes = new BaseClass[DiagramObjectPoint_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new DiagramObjectPoint();
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

    private void updateAttributeInArray(DiagramObjectPoint_class_attributes_enum attrEnum, BaseClass value) {
        try {
            DiagramObjectPoint_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(DiagramObjectPoint_primitive_builder attrEnum, BaseClass value) {
        try {
            DiagramObjectPoint_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            DiagramObjectPoint_class_attributes_enum attrEnum = DiagramObjectPoint_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated DiagramObjectPoint, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            DiagramObjectPoint_primitive_builder attrEnum = DiagramObjectPoint_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated DiagramObjectPoint, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            DiagramObjectPoint_primitive_builder attrEnum = DiagramObjectPoint_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = DiagramObjectPoint_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            DiagramObjectPoint_class_attributes_enum attrEnum = DiagramObjectPoint_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = DiagramObjectPoint_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : DiagramObjectPoint_primitive_builder.values()) {
            if (enumValue != DiagramObjectPoint_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "DiagramObjectPoint." + enumValue.name());
            }
        }
        for (var enumValue : DiagramObjectPoint_class_attributes_enum.values()) {
            if (enumValue != DiagramObjectPoint_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "DiagramObjectPoint." + enumValue.name());
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
            for (DiagramObjectPoint_primitive_builder attrEnum : DiagramObjectPoint_primitive_builder.values()) {
                BaseClass bc = DiagramObjectPoint_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    DiagramObjectPoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (DiagramObjectPoint_class_attributes_enum attrEnum : DiagramObjectPoint_class_attributes_enum.values()) {
                BaseClass bc = DiagramObjectPoint_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    DiagramObjectPoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(DiagramObjectPoint) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "DiagramObjectPoint";

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
        ATTR_NAMESPACE_MAP = new DiagramObjectPoint().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("DiagramObject", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("DiagramObjectGluePoint", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("sequenceNumber", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("xPosition", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("yPosition", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("zPosition", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
