/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Describes a curve for how the voltage magnitude and impedance varies with the tap step.
 */
public class RatioTapChangerTable extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(RatioTapChangerTable.class);

    private BaseClass[] RatioTapChangerTable_class_attributes;
    private BaseClass[] RatioTapChangerTable_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new RatioTapChangerTable().getAttributeNamesMap();
    }

    private enum RatioTapChangerTable_primitive_builder implements PrimitiveBuilder {
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum RatioTapChangerTable_class_attributes_enum {
        RatioTapChanger,
        RatioTapChangerTablePoint,
        LAST_ENUM
    }

    public RatioTapChangerTable() {
        RatioTapChangerTable_primitive_attributes = new BaseClass[RatioTapChangerTable_primitive_builder.values().length];
        RatioTapChangerTable_class_attributes = new BaseClass[RatioTapChangerTable_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new RatioTapChangerTable();
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

    private void updateAttributeInArray(RatioTapChangerTable_class_attributes_enum attrEnum, BaseClass value) {
        try {
            RatioTapChangerTable_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(RatioTapChangerTable_primitive_builder attrEnum, BaseClass value) {
        try {
            RatioTapChangerTable_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            RatioTapChangerTable_class_attributes_enum attrEnum = RatioTapChangerTable_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated RatioTapChangerTable, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            RatioTapChangerTable_primitive_builder attrEnum = RatioTapChangerTable_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated RatioTapChangerTable, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            RatioTapChangerTable_primitive_builder attrEnum = RatioTapChangerTable_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = RatioTapChangerTable_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            RatioTapChangerTable_class_attributes_enum attrEnum = RatioTapChangerTable_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = RatioTapChangerTable_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : RatioTapChangerTable_primitive_builder.values()) {
            if (enumValue != RatioTapChangerTable_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "RatioTapChangerTable." + enumValue.name());
            }
        }
        for (var enumValue : RatioTapChangerTable_class_attributes_enum.values()) {
            if (enumValue != RatioTapChangerTable_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "RatioTapChangerTable." + enumValue.name());
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
            for (RatioTapChangerTable_primitive_builder attrEnum : RatioTapChangerTable_primitive_builder.values()) {
                BaseClass bc = RatioTapChangerTable_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    RatioTapChangerTable." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (RatioTapChangerTable_class_attributes_enum attrEnum : RatioTapChangerTable_class_attributes_enum.values()) {
                BaseClass bc = RatioTapChangerTable_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    RatioTapChangerTable." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(RatioTapChangerTable) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "RatioTapChangerTable";

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
        ATTR_NAMESPACE_MAP = new RatioTapChangerTable().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("RatioTapChanger", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("RatioTapChangerTablePoint", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
