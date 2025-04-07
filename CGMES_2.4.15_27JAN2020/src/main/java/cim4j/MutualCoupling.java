/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * This class represents the zero sequence line mutual coupling.
 */
public class MutualCoupling extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(MutualCoupling.class);

    private BaseClass[] MutualCoupling_class_attributes;
    private BaseClass[] MutualCoupling_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new MutualCoupling().getAttributeNamesMap();
    }

    private enum MutualCoupling_primitive_builder implements PrimitiveBuilder {
        b0ch() {
            public BaseClass construct(java.lang.String value) {
                return new Susceptance(value);
            }
        },
        distance11() {
            public BaseClass construct(java.lang.String value) {
                return new Length(value);
            }
        },
        distance12() {
            public BaseClass construct(java.lang.String value) {
                return new Length(value);
            }
        },
        distance21() {
            public BaseClass construct(java.lang.String value) {
                return new Length(value);
            }
        },
        distance22() {
            public BaseClass construct(java.lang.String value) {
                return new Length(value);
            }
        },
        g0ch() {
            public BaseClass construct(java.lang.String value) {
                return new Conductance(value);
            }
        },
        r0() {
            public BaseClass construct(java.lang.String value) {
                return new Resistance(value);
            }
        },
        x0() {
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

    private enum MutualCoupling_class_attributes_enum {
        First_Terminal,
        Second_Terminal,
        b0ch,
        distance11,
        distance12,
        distance21,
        distance22,
        g0ch,
        r0,
        x0,
        LAST_ENUM
    }

    public MutualCoupling() {
        MutualCoupling_primitive_attributes = new BaseClass[MutualCoupling_primitive_builder.values().length];
        MutualCoupling_class_attributes = new BaseClass[MutualCoupling_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new MutualCoupling();
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

    private void updateAttributeInArray(MutualCoupling_class_attributes_enum attrEnum, BaseClass value) {
        try {
            MutualCoupling_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(MutualCoupling_primitive_builder attrEnum, BaseClass value) {
        try {
            MutualCoupling_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            MutualCoupling_class_attributes_enum attrEnum = MutualCoupling_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated MutualCoupling, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            MutualCoupling_primitive_builder attrEnum = MutualCoupling_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated MutualCoupling, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            MutualCoupling_primitive_builder attrEnum = MutualCoupling_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = MutualCoupling_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            MutualCoupling_class_attributes_enum attrEnum = MutualCoupling_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = MutualCoupling_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : MutualCoupling_primitive_builder.values()) {
            if (enumValue != MutualCoupling_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "MutualCoupling." + enumValue.name());
            }
        }
        for (var enumValue : MutualCoupling_class_attributes_enum.values()) {
            if (enumValue != MutualCoupling_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "MutualCoupling." + enumValue.name());
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
            for (MutualCoupling_primitive_builder attrEnum : MutualCoupling_primitive_builder.values()) {
                BaseClass bc = MutualCoupling_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    MutualCoupling." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (MutualCoupling_class_attributes_enum attrEnum : MutualCoupling_class_attributes_enum.values()) {
                BaseClass bc = MutualCoupling_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    MutualCoupling." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(MutualCoupling) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "MutualCoupling";

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
        ATTR_NAMESPACE_MAP = new MutualCoupling().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("First_Terminal", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("Second_Terminal", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("b0ch", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("distance11", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("distance12", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("distance21", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("distance22", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("g0ch", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("r0", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("x0", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
