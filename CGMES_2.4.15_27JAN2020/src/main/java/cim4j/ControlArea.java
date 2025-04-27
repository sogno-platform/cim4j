/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A control areais a grouping of generating units and/or loads and a cutset of tie lines (as terminals) which may be used for a variety of purposes including automatic generation control, powerflow solution area interchange control specification, and input to load forecasting.   Note that any number of overlapping control area specifications can be superimposed on the physical model.
 */
public class ControlArea extends PowerSystemResource {

    private static final Logging LOG = Logging.getLogger(ControlArea.class);

    private BaseClass[] ControlArea_class_attributes;
    private BaseClass[] ControlArea_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new ControlArea().getAttributeNamesMap();
    }

    private enum ControlArea_primitive_builder implements PrimitiveBuilder {
        netInterchange() {
            public BaseClass construct(java.lang.String value) {
                return new ActivePower(value);
            }
        },
        pTolerance() {
            public BaseClass construct(java.lang.String value) {
                return new ActivePower(value);
            }
        },
        type() {
            public BaseClass construct(java.lang.String value) {
                return new ControlAreaTypeKind(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum ControlArea_class_attributes_enum {
        ControlAreaGeneratingUnit,
        EnergyArea,
        TieFlow,
        netInterchange,
        pTolerance,
        type,
        LAST_ENUM
    }

    public ControlArea() {
        ControlArea_primitive_attributes = new BaseClass[ControlArea_primitive_builder.values().length];
        ControlArea_class_attributes = new BaseClass[ControlArea_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new ControlArea();
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

    private void updateAttributeInArray(ControlArea_class_attributes_enum attrEnum, BaseClass value) {
        try {
            ControlArea_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(ControlArea_primitive_builder attrEnum, BaseClass value) {
        try {
            ControlArea_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            ControlArea_class_attributes_enum attrEnum = ControlArea_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated ControlArea, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            ControlArea_primitive_builder attrEnum = ControlArea_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated ControlArea, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            ControlArea_primitive_builder attrEnum = ControlArea_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ControlArea_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            ControlArea_class_attributes_enum attrEnum = ControlArea_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ControlArea_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : ControlArea_primitive_builder.values()) {
            if (enumValue != ControlArea_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ControlArea." + enumValue.name());
            }
        }
        for (var enumValue : ControlArea_class_attributes_enum.values()) {
            if (enumValue != ControlArea_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ControlArea." + enumValue.name());
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
            for (ControlArea_primitive_builder attrEnum : ControlArea_primitive_builder.values()) {
                BaseClass bc = ControlArea_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ControlArea." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (ControlArea_class_attributes_enum attrEnum : ControlArea_class_attributes_enum.values()) {
                BaseClass bc = ControlArea_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ControlArea." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(ControlArea) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "ControlArea";

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
        ATTR_NAMESPACE_MAP = new ControlArea().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("ControlAreaGeneratingUnit", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("EnergyArea", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("TieFlow", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("netInterchange", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pTolerance", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("type", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
