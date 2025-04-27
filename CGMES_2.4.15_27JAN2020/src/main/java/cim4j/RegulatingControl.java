/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Specifies a set of equipment that works together to control a power system quantity such as voltage or flow.  Remote bus voltage control is possible by specifying the controlled terminal located at some place remote from the controlling equipment. In case multiple equipment, possibly of different types, control same terminal there must be only one RegulatingControl at that terminal. The most specific subtype of RegulatingControl shall be used in case such equipment participate in the control, e.g. TapChangerControl for tap changers. For flow control  load sign convention is used, i.e. positive sign means flow out from a TopologicalNode (bus) into the conducting equipment.
 */
public class RegulatingControl extends PowerSystemResource {

    private static final Logging LOG = Logging.getLogger(RegulatingControl.class);

    private BaseClass[] RegulatingControl_class_attributes;
    private BaseClass[] RegulatingControl_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new RegulatingControl().getAttributeNamesMap();
    }

    private enum RegulatingControl_primitive_builder implements PrimitiveBuilder {
        discrete() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        enabled() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        mode() {
            public BaseClass construct(java.lang.String value) {
                return new RegulatingControlModeKind(value);
            }
        },
        targetDeadband() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        targetValue() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        targetValueUnitMultiplier() {
            public BaseClass construct(java.lang.String value) {
                return new UnitMultiplier(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum RegulatingControl_class_attributes_enum {
        RegulatingCondEq,
        RegulationSchedule,
        Terminal,
        discrete,
        enabled,
        mode,
        targetDeadband,
        targetValue,
        targetValueUnitMultiplier,
        LAST_ENUM
    }

    public RegulatingControl() {
        RegulatingControl_primitive_attributes = new BaseClass[RegulatingControl_primitive_builder.values().length];
        RegulatingControl_class_attributes = new BaseClass[RegulatingControl_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new RegulatingControl();
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

    private void updateAttributeInArray(RegulatingControl_class_attributes_enum attrEnum, BaseClass value) {
        try {
            RegulatingControl_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(RegulatingControl_primitive_builder attrEnum, BaseClass value) {
        try {
            RegulatingControl_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            RegulatingControl_class_attributes_enum attrEnum = RegulatingControl_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated RegulatingControl, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            RegulatingControl_primitive_builder attrEnum = RegulatingControl_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated RegulatingControl, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            RegulatingControl_primitive_builder attrEnum = RegulatingControl_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = RegulatingControl_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            RegulatingControl_class_attributes_enum attrEnum = RegulatingControl_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = RegulatingControl_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : RegulatingControl_primitive_builder.values()) {
            if (enumValue != RegulatingControl_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "RegulatingControl." + enumValue.name());
            }
        }
        for (var enumValue : RegulatingControl_class_attributes_enum.values()) {
            if (enumValue != RegulatingControl_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "RegulatingControl." + enumValue.name());
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
            for (RegulatingControl_primitive_builder attrEnum : RegulatingControl_primitive_builder.values()) {
                BaseClass bc = RegulatingControl_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    RegulatingControl." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (RegulatingControl_class_attributes_enum attrEnum : RegulatingControl_class_attributes_enum.values()) {
                BaseClass bc = RegulatingControl_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    RegulatingControl." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(RegulatingControl) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "RegulatingControl";

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
        ATTR_NAMESPACE_MAP = new RegulatingControl().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("RegulatingCondEq", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("RegulationSchedule", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("Terminal", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("discrete", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("enabled", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("mode", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("targetDeadband", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("targetValue", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("targetValueUnitMultiplier", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
