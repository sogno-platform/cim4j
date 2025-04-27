/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * An AC electrical connection point to a piece of conducting equipment. Terminals are connected at physical connection points called connectivity nodes.
 */
public class Terminal extends ACDCTerminal {

    private static final Logging LOG = Logging.getLogger(Terminal.class);

    private BaseClass[] Terminal_class_attributes;
    private BaseClass[] Terminal_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new Terminal().getAttributeNamesMap();
    }

    private enum Terminal_primitive_builder implements PrimitiveBuilder {
        phases() {
            public BaseClass construct(java.lang.String value) {
                return new PhaseCode(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum Terminal_class_attributes_enum {
        ConductingEquipment,
        ConnectivityNode,
        ConverterDCSides,
        HasFirstMutualCoupling,
        HasSecondMutualCoupling,
        RegulatingControl,
        RemoteInputSignal,
        SvPowerFlow,
        TieFlow,
        TopologicalNode,
        TransformerEnd,
        phases,
        LAST_ENUM
    }

    public Terminal() {
        Terminal_primitive_attributes = new BaseClass[Terminal_primitive_builder.values().length];
        Terminal_class_attributes = new BaseClass[Terminal_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new Terminal();
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

    private void updateAttributeInArray(Terminal_class_attributes_enum attrEnum, BaseClass value) {
        try {
            Terminal_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(Terminal_primitive_builder attrEnum, BaseClass value) {
        try {
            Terminal_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            Terminal_class_attributes_enum attrEnum = Terminal_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated Terminal, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            Terminal_primitive_builder attrEnum = Terminal_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated Terminal, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            Terminal_primitive_builder attrEnum = Terminal_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = Terminal_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            Terminal_class_attributes_enum attrEnum = Terminal_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = Terminal_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : Terminal_primitive_builder.values()) {
            if (enumValue != Terminal_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "Terminal." + enumValue.name());
            }
        }
        for (var enumValue : Terminal_class_attributes_enum.values()) {
            if (enumValue != Terminal_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "Terminal." + enumValue.name());
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
            for (Terminal_primitive_builder attrEnum : Terminal_primitive_builder.values()) {
                BaseClass bc = Terminal_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    Terminal." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (Terminal_class_attributes_enum attrEnum : Terminal_class_attributes_enum.values()) {
                BaseClass bc = Terminal_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    Terminal." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(Terminal) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "Terminal";

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
        ATTR_NAMESPACE_MAP = new Terminal().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("ConductingEquipment", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ConnectivityNode", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ConverterDCSides", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("HasFirstMutualCoupling", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("HasSecondMutualCoupling", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("RegulatingControl", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("RemoteInputSignal", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("SvPowerFlow", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("TieFlow", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("TopologicalNode", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("TransformerEnd", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("phases", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
