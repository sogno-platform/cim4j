/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A single or set of synchronous machines for converting mechanical power into alternating-current power. For example, individual machines within a set may be defined for scheduling purposes while a single control signal is derived for the set. In this case there would be a GeneratingUnit for each member of the set and an additional GeneratingUnit corresponding to the set.
 */
public class GeneratingUnit extends Equipment {

    private static final Logging LOG = Logging.getLogger(GeneratingUnit.class);

    private BaseClass[] GeneratingUnit_class_attributes;
    private BaseClass[] GeneratingUnit_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new GeneratingUnit().getAttributeNamesMap();
    }

    private enum GeneratingUnit_primitive_builder implements PrimitiveBuilder {
        genControlSource() {
            public BaseClass construct(java.lang.String value) {
                return new GeneratorControlSource(value);
            }
        },
        governorSCD() {
            public BaseClass construct(java.lang.String value) {
                return new PerCent(value);
            }
        },
        initialP() {
            public BaseClass construct(java.lang.String value) {
                return new ActivePower(value);
            }
        },
        longPF() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        maxOperatingP() {
            public BaseClass construct(java.lang.String value) {
                return new ActivePower(value);
            }
        },
        maximumAllowableSpinningReserve() {
            public BaseClass construct(java.lang.String value) {
                return new ActivePower(value);
            }
        },
        minOperatingP() {
            public BaseClass construct(java.lang.String value) {
                return new ActivePower(value);
            }
        },
        nominalP() {
            public BaseClass construct(java.lang.String value) {
                return new ActivePower(value);
            }
        },
        normalPF() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        ratedGrossMaxP() {
            public BaseClass construct(java.lang.String value) {
                return new ActivePower(value);
            }
        },
        ratedGrossMinP() {
            public BaseClass construct(java.lang.String value) {
                return new ActivePower(value);
            }
        },
        ratedNetMaxP() {
            public BaseClass construct(java.lang.String value) {
                return new ActivePower(value);
            }
        },
        shortPF() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        startupCost() {
            public BaseClass construct(java.lang.String value) {
                return new Money(value);
            }
        },
        totalEfficiency() {
            public BaseClass construct(java.lang.String value) {
                return new PerCent(value);
            }
        },
        variableCost() {
            public BaseClass construct(java.lang.String value) {
                return new Money(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum GeneratingUnit_class_attributes_enum {
        ControlAreaGeneratingUnit,
        GrossToNetActivePowerCurves,
        RotatingMachine,
        genControlSource,
        governorSCD,
        initialP,
        longPF,
        maxOperatingP,
        maximumAllowableSpinningReserve,
        minOperatingP,
        nominalP,
        normalPF,
        ratedGrossMaxP,
        ratedGrossMinP,
        ratedNetMaxP,
        shortPF,
        startupCost,
        totalEfficiency,
        variableCost,
        LAST_ENUM
    }

    public GeneratingUnit() {
        GeneratingUnit_primitive_attributes = new BaseClass[GeneratingUnit_primitive_builder.values().length];
        GeneratingUnit_class_attributes = new BaseClass[GeneratingUnit_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new GeneratingUnit();
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

    private void updateAttributeInArray(GeneratingUnit_class_attributes_enum attrEnum, BaseClass value) {
        try {
            GeneratingUnit_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(GeneratingUnit_primitive_builder attrEnum, BaseClass value) {
        try {
            GeneratingUnit_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            GeneratingUnit_class_attributes_enum attrEnum = GeneratingUnit_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated GeneratingUnit, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            GeneratingUnit_primitive_builder attrEnum = GeneratingUnit_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated GeneratingUnit, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            GeneratingUnit_primitive_builder attrEnum = GeneratingUnit_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GeneratingUnit_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            GeneratingUnit_class_attributes_enum attrEnum = GeneratingUnit_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GeneratingUnit_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : GeneratingUnit_primitive_builder.values()) {
            if (enumValue != GeneratingUnit_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GeneratingUnit." + enumValue.name());
            }
        }
        for (var enumValue : GeneratingUnit_class_attributes_enum.values()) {
            if (enumValue != GeneratingUnit_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GeneratingUnit." + enumValue.name());
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
            for (GeneratingUnit_primitive_builder attrEnum : GeneratingUnit_primitive_builder.values()) {
                BaseClass bc = GeneratingUnit_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GeneratingUnit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (GeneratingUnit_class_attributes_enum attrEnum : GeneratingUnit_class_attributes_enum.values()) {
                BaseClass bc = GeneratingUnit_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GeneratingUnit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(GeneratingUnit) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "GeneratingUnit";

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
        ATTR_NAMESPACE_MAP = new GeneratingUnit().allAttrNamespaceMap();
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
            Map.entry("GrossToNetActivePowerCurves", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("RotatingMachine", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("genControlSource", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("governorSCD", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("initialP", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("longPF", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("maxOperatingP", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("maximumAllowableSpinningReserve", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("minOperatingP", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("nominalP", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("normalPF", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ratedGrossMaxP", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ratedGrossMinP", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ratedNetMaxP", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("shortPF", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("startupCost", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("totalEfficiency", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("variableCost", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
