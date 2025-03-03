/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A shunt capacitor or reactor or switchable bank of shunt capacitors or reactors. A section of a shunt compensator is an individual capacitor or reactor.  A negative value for reactivePerSection indicates that the compensator is a reactor. ShuntCompensator is a single terminal device.  Ground is implied.
 */
public class ShuntCompensator extends RegulatingCondEq {

    private static final Logging LOG = Logging.getLogger(ShuntCompensator.class);

    private BaseClass[] ShuntCompensator_class_attributes;
    private BaseClass[] ShuntCompensator_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new ShuntCompensator().getAttributeNamesMap();
    }

    private enum ShuntCompensator_primitive_builder implements PrimitiveBuilder {
        aVRDelay() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        grounded() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        maximumSections() {
            public BaseClass construct(java.lang.String value) {
                return new Integer(value);
            }
        },
        nomU() {
            public BaseClass construct(java.lang.String value) {
                return new Voltage(value);
            }
        },
        normalSections() {
            public BaseClass construct(java.lang.String value) {
                return new Integer(value);
            }
        },
        sections() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        switchOnCount() {
            public BaseClass construct(java.lang.String value) {
                return new Integer(value);
            }
        },
        switchOnDate() {
            public BaseClass construct(java.lang.String value) {
                return new DateTime(value);
            }
        },
        voltageSensitivity() {
            public BaseClass construct(java.lang.String value) {
                return new VoltagePerReactivePower(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum ShuntCompensator_class_attributes_enum {
        SvShuntCompensatorSections,
        aVRDelay,
        grounded,
        maximumSections,
        nomU,
        normalSections,
        sections,
        switchOnCount,
        switchOnDate,
        voltageSensitivity,
        LAST_ENUM
    }

    public ShuntCompensator() {
        ShuntCompensator_primitive_attributes = new BaseClass[ShuntCompensator_primitive_builder.values().length];
        ShuntCompensator_class_attributes = new BaseClass[ShuntCompensator_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new ShuntCompensator();
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

    private void updateAttributeInArray(ShuntCompensator_class_attributes_enum attrEnum, BaseClass value) {
        try {
            ShuntCompensator_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(ShuntCompensator_primitive_builder attrEnum, BaseClass value) {
        try {
            ShuntCompensator_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            ShuntCompensator_class_attributes_enum attrEnum = ShuntCompensator_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated ShuntCompensator, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            ShuntCompensator_primitive_builder attrEnum = ShuntCompensator_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated ShuntCompensator, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            ShuntCompensator_primitive_builder attrEnum = ShuntCompensator_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ShuntCompensator_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            ShuntCompensator_class_attributes_enum attrEnum = ShuntCompensator_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ShuntCompensator_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : ShuntCompensator_primitive_builder.values()) {
            if (enumValue != ShuntCompensator_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ShuntCompensator." + enumValue.name());
            }
        }
        for (var enumValue : ShuntCompensator_class_attributes_enum.values()) {
            if (enumValue != ShuntCompensator_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ShuntCompensator." + enumValue.name());
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
            for (ShuntCompensator_primitive_builder attrEnum : ShuntCompensator_primitive_builder.values()) {
                BaseClass bc = ShuntCompensator_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ShuntCompensator." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (ShuntCompensator_class_attributes_enum attrEnum : ShuntCompensator_class_attributes_enum.values()) {
                BaseClass bc = ShuntCompensator_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ShuntCompensator." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(ShuntCompensator) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "ShuntCompensator";

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
        ATTR_NAMESPACE_MAP = new ShuntCompensator().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("SvShuntCompensatorSections", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("aVRDelay", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("grounded", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("maximumSections", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("nomU", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("normalSections", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("sections", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("switchOnCount", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("switchOnDate", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("voltageSensitivity", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
