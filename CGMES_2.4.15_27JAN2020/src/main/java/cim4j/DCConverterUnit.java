/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Indivisible operative unit comprising all equipment between the point of common coupling on the AC side and the point of common coupling - DC side, essentially one or more converters, together with one or more converter transformers, converter control equipment, essential protective and switching devices and auxiliaries, if any, used for conversion.
 */
public class DCConverterUnit extends DCEquipmentContainer {

    private static final Logging LOG = Logging.getLogger(DCConverterUnit.class);

    private BaseClass[] DCConverterUnit_class_attributes;
    private BaseClass[] DCConverterUnit_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new DCConverterUnit().getAttributeNamesMap();
    }

    private enum DCConverterUnit_primitive_builder implements PrimitiveBuilder {
        operationMode() {
            public BaseClass construct(java.lang.String value) {
                return new DCConverterOperatingModeKind(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum DCConverterUnit_class_attributes_enum {
        Substation,
        operationMode,
        LAST_ENUM
    }

    public DCConverterUnit() {
        DCConverterUnit_primitive_attributes = new BaseClass[DCConverterUnit_primitive_builder.values().length];
        DCConverterUnit_class_attributes = new BaseClass[DCConverterUnit_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new DCConverterUnit();
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

    private void updateAttributeInArray(DCConverterUnit_class_attributes_enum attrEnum, BaseClass value) {
        try {
            DCConverterUnit_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(DCConverterUnit_primitive_builder attrEnum, BaseClass value) {
        try {
            DCConverterUnit_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            DCConverterUnit_class_attributes_enum attrEnum = DCConverterUnit_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated DCConverterUnit, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            DCConverterUnit_primitive_builder attrEnum = DCConverterUnit_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated DCConverterUnit, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            DCConverterUnit_primitive_builder attrEnum = DCConverterUnit_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = DCConverterUnit_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            DCConverterUnit_class_attributes_enum attrEnum = DCConverterUnit_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = DCConverterUnit_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : DCConverterUnit_primitive_builder.values()) {
            if (enumValue != DCConverterUnit_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "DCConverterUnit." + enumValue.name());
            }
        }
        for (var enumValue : DCConverterUnit_class_attributes_enum.values()) {
            if (enumValue != DCConverterUnit_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "DCConverterUnit." + enumValue.name());
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
            for (DCConverterUnit_primitive_builder attrEnum : DCConverterUnit_primitive_builder.values()) {
                BaseClass bc = DCConverterUnit_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    DCConverterUnit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (DCConverterUnit_class_attributes_enum attrEnum : DCConverterUnit_class_attributes_enum.values()) {
                BaseClass bc = DCConverterUnit_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    DCConverterUnit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(DCConverterUnit) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "DCConverterUnit";

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
        ATTR_NAMESPACE_MAP = new DCConverterUnit().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("Substation", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("operationMode", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
