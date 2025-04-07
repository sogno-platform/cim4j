/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * MeasurementValueSource describes the alternative sources updating a MeasurementValue. User conventions for how to use the MeasurementValueSource attributes are described in the introduction to IEC 61970-301.
 */
public class MeasurementValueSource extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(MeasurementValueSource.class);

    private BaseClass[] MeasurementValueSource_class_attributes;
    private BaseClass[] MeasurementValueSource_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new MeasurementValueSource().getAttributeNamesMap();
    }

    private enum MeasurementValueSource_primitive_builder implements PrimitiveBuilder {
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum MeasurementValueSource_class_attributes_enum {
        MeasurementValues,
        LAST_ENUM
    }

    public MeasurementValueSource() {
        MeasurementValueSource_primitive_attributes = new BaseClass[MeasurementValueSource_primitive_builder.values().length];
        MeasurementValueSource_class_attributes = new BaseClass[MeasurementValueSource_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new MeasurementValueSource();
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

    private void updateAttributeInArray(MeasurementValueSource_class_attributes_enum attrEnum, BaseClass value) {
        try {
            MeasurementValueSource_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(MeasurementValueSource_primitive_builder attrEnum, BaseClass value) {
        try {
            MeasurementValueSource_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            MeasurementValueSource_class_attributes_enum attrEnum = MeasurementValueSource_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated MeasurementValueSource, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            MeasurementValueSource_primitive_builder attrEnum = MeasurementValueSource_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated MeasurementValueSource, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            MeasurementValueSource_primitive_builder attrEnum = MeasurementValueSource_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = MeasurementValueSource_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            MeasurementValueSource_class_attributes_enum attrEnum = MeasurementValueSource_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = MeasurementValueSource_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : MeasurementValueSource_primitive_builder.values()) {
            if (enumValue != MeasurementValueSource_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "MeasurementValueSource." + enumValue.name());
            }
        }
        for (var enumValue : MeasurementValueSource_class_attributes_enum.values()) {
            if (enumValue != MeasurementValueSource_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "MeasurementValueSource." + enumValue.name());
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
            for (MeasurementValueSource_primitive_builder attrEnum : MeasurementValueSource_primitive_builder.values()) {
                BaseClass bc = MeasurementValueSource_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    MeasurementValueSource." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (MeasurementValueSource_class_attributes_enum attrEnum : MeasurementValueSource_class_attributes_enum.values()) {
                BaseClass bc = MeasurementValueSource_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    MeasurementValueSource." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(MeasurementValueSource) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "MeasurementValueSource";

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
        ATTR_NAMESPACE_MAP = new MeasurementValueSource().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("MeasurementValues", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
