/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Layers are typically used for grouping diagram objects according to themes and scales. Themes are used to display or hide certain information (e.g., lakes, borders), while scales are used for hiding or displaying information depending on the current zoom level (hide text when it is too small to be read, or when it exceeds the screen size). This is also called de-cluttering.  CIM based graphics exchange will support an m:n relationship between diagram objects and layers. It will be the task of the importing system to convert an m:n case into an appropriate 1:n representation if the importing system does not support m:n.
 */
public class VisibilityLayer extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(VisibilityLayer.class);

    private BaseClass[] VisibilityLayer_class_attributes;
    private BaseClass[] VisibilityLayer_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new VisibilityLayer().getAttributeNamesMap();
    }

    private enum VisibilityLayer_primitive_builder implements PrimitiveBuilder {
        drawingOrder() {
            public BaseClass construct(java.lang.String value) {
                return new Integer(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum VisibilityLayer_class_attributes_enum {
        VisibleObjects,
        drawingOrder,
        LAST_ENUM
    }

    public VisibilityLayer() {
        VisibilityLayer_primitive_attributes = new BaseClass[VisibilityLayer_primitive_builder.values().length];
        VisibilityLayer_class_attributes = new BaseClass[VisibilityLayer_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new VisibilityLayer();
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

    private void updateAttributeInArray(VisibilityLayer_class_attributes_enum attrEnum, BaseClass value) {
        try {
            VisibilityLayer_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(VisibilityLayer_primitive_builder attrEnum, BaseClass value) {
        try {
            VisibilityLayer_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            VisibilityLayer_class_attributes_enum attrEnum = VisibilityLayer_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated VisibilityLayer, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            VisibilityLayer_primitive_builder attrEnum = VisibilityLayer_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated VisibilityLayer, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            VisibilityLayer_primitive_builder attrEnum = VisibilityLayer_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = VisibilityLayer_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            VisibilityLayer_class_attributes_enum attrEnum = VisibilityLayer_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = VisibilityLayer_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : VisibilityLayer_primitive_builder.values()) {
            if (enumValue != VisibilityLayer_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "VisibilityLayer." + enumValue.name());
            }
        }
        for (var enumValue : VisibilityLayer_class_attributes_enum.values()) {
            if (enumValue != VisibilityLayer_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "VisibilityLayer." + enumValue.name());
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
            for (VisibilityLayer_primitive_builder attrEnum : VisibilityLayer_primitive_builder.values()) {
                BaseClass bc = VisibilityLayer_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    VisibilityLayer." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (VisibilityLayer_class_attributes_enum attrEnum : VisibilityLayer_class_attributes_enum.values()) {
                BaseClass bc = VisibilityLayer_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    VisibilityLayer." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(VisibilityLayer) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "VisibilityLayer";

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
        ATTR_NAMESPACE_MAP = new VisibilityLayer().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("VisibleObjects", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("drawingOrder", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
