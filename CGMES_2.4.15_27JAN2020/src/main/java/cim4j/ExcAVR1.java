/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Italian excitation system corresponding to IEEE (1968) Type 1 Model. It represents exciter dynamo and electromechanical regulator.
 */
public class ExcAVR1 extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcAVR1.class);

    private BaseClass[] ExcAVR1_class_attributes;
    private BaseClass[] ExcAVR1_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new ExcAVR1().getAttributeNamesMap();
    }

    private enum ExcAVR1_primitive_builder implements PrimitiveBuilder {
        e1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        e2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ka() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kf() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        se1() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        se2() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        ta() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tb() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        te() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tf() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        vrmn() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vrmx() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum ExcAVR1_class_attributes_enum {
        e1,
        e2,
        ka,
        kf,
        se1,
        se2,
        ta,
        tb,
        te,
        tf,
        vrmn,
        vrmx,
        LAST_ENUM
    }

    public ExcAVR1() {
        ExcAVR1_primitive_attributes = new BaseClass[ExcAVR1_primitive_builder.values().length];
        ExcAVR1_class_attributes = new BaseClass[ExcAVR1_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new ExcAVR1();
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

    private void updateAttributeInArray(ExcAVR1_class_attributes_enum attrEnum, BaseClass value) {
        try {
            ExcAVR1_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(ExcAVR1_primitive_builder attrEnum, BaseClass value) {
        try {
            ExcAVR1_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            ExcAVR1_class_attributes_enum attrEnum = ExcAVR1_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated ExcAVR1, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            ExcAVR1_primitive_builder attrEnum = ExcAVR1_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated ExcAVR1, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            ExcAVR1_primitive_builder attrEnum = ExcAVR1_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcAVR1_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            ExcAVR1_class_attributes_enum attrEnum = ExcAVR1_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcAVR1_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : ExcAVR1_primitive_builder.values()) {
            if (enumValue != ExcAVR1_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcAVR1." + enumValue.name());
            }
        }
        for (var enumValue : ExcAVR1_class_attributes_enum.values()) {
            if (enumValue != ExcAVR1_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcAVR1." + enumValue.name());
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
            for (ExcAVR1_primitive_builder attrEnum : ExcAVR1_primitive_builder.values()) {
                BaseClass bc = ExcAVR1_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcAVR1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (ExcAVR1_class_attributes_enum attrEnum : ExcAVR1_class_attributes_enum.values()) {
                BaseClass bc = ExcAVR1_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcAVR1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(ExcAVR1) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "ExcAVR1";

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
        ATTR_NAMESPACE_MAP = new ExcAVR1().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("e1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("e2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ka", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kf", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("se1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("se2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ta", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tb", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("te", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tf", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmn", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmx", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
