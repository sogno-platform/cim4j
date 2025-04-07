/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * This class represents equivalent injections (generation or load).  Voltage regulation is allowed only at the point of connection.
 */
public class EquivalentInjection extends EquivalentEquipment {

    private static final Logging LOG = Logging.getLogger(EquivalentInjection.class);

    private BaseClass[] EquivalentInjection_class_attributes;
    private BaseClass[] EquivalentInjection_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new EquivalentInjection().getAttributeNamesMap();
    }

    private enum EquivalentInjection_primitive_builder implements PrimitiveBuilder {
        maxP() {
            public BaseClass construct(java.lang.String value) {
                return new ActivePower(value);
            }
        },
        maxQ() {
            public BaseClass construct(java.lang.String value) {
                return new ReactivePower(value);
            }
        },
        minP() {
            public BaseClass construct(java.lang.String value) {
                return new ActivePower(value);
            }
        },
        minQ() {
            public BaseClass construct(java.lang.String value) {
                return new ReactivePower(value);
            }
        },
        p() {
            public BaseClass construct(java.lang.String value) {
                return new ActivePower(value);
            }
        },
        q() {
            public BaseClass construct(java.lang.String value) {
                return new ReactivePower(value);
            }
        },
        r() {
            public BaseClass construct(java.lang.String value) {
                return new Resistance(value);
            }
        },
        r0() {
            public BaseClass construct(java.lang.String value) {
                return new Resistance(value);
            }
        },
        r2() {
            public BaseClass construct(java.lang.String value) {
                return new Resistance(value);
            }
        },
        regulationCapability() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        regulationStatus() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        regulationTarget() {
            public BaseClass construct(java.lang.String value) {
                return new Voltage(value);
            }
        },
        x() {
            public BaseClass construct(java.lang.String value) {
                return new Reactance(value);
            }
        },
        x0() {
            public BaseClass construct(java.lang.String value) {
                return new Reactance(value);
            }
        },
        x2() {
            public BaseClass construct(java.lang.String value) {
                return new Reactance(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum EquivalentInjection_class_attributes_enum {
        ReactiveCapabilityCurve,
        maxP,
        maxQ,
        minP,
        minQ,
        p,
        q,
        r,
        r0,
        r2,
        regulationCapability,
        regulationStatus,
        regulationTarget,
        x,
        x0,
        x2,
        LAST_ENUM
    }

    public EquivalentInjection() {
        EquivalentInjection_primitive_attributes = new BaseClass[EquivalentInjection_primitive_builder.values().length];
        EquivalentInjection_class_attributes = new BaseClass[EquivalentInjection_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new EquivalentInjection();
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

    private void updateAttributeInArray(EquivalentInjection_class_attributes_enum attrEnum, BaseClass value) {
        try {
            EquivalentInjection_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(EquivalentInjection_primitive_builder attrEnum, BaseClass value) {
        try {
            EquivalentInjection_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            EquivalentInjection_class_attributes_enum attrEnum = EquivalentInjection_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated EquivalentInjection, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            EquivalentInjection_primitive_builder attrEnum = EquivalentInjection_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated EquivalentInjection, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            EquivalentInjection_primitive_builder attrEnum = EquivalentInjection_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = EquivalentInjection_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            EquivalentInjection_class_attributes_enum attrEnum = EquivalentInjection_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = EquivalentInjection_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : EquivalentInjection_primitive_builder.values()) {
            if (enumValue != EquivalentInjection_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "EquivalentInjection." + enumValue.name());
            }
        }
        for (var enumValue : EquivalentInjection_class_attributes_enum.values()) {
            if (enumValue != EquivalentInjection_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "EquivalentInjection." + enumValue.name());
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
            for (EquivalentInjection_primitive_builder attrEnum : EquivalentInjection_primitive_builder.values()) {
                BaseClass bc = EquivalentInjection_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    EquivalentInjection." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (EquivalentInjection_class_attributes_enum attrEnum : EquivalentInjection_class_attributes_enum.values()) {
                BaseClass bc = EquivalentInjection_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    EquivalentInjection." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(EquivalentInjection) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "EquivalentInjection";

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
        ATTR_NAMESPACE_MAP = new EquivalentInjection().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("ReactiveCapabilityCurve", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("maxP", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("maxQ", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("minP", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("minQ", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("p", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("q", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("r", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("r0", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("r2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("regulationCapability", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("regulationStatus", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("regulationTarget", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("x", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("x0", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("x2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
