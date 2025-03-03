/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * These load models (known also as generic non-linear dynamic (GNLD) load models) can be used in mid-term and long-term voltage stability simulations (i.e., to study voltage collapse), as they can replace a more detailed representation of aggregate load, including induction motors, thermostatically controlled and static loads.
 */
public class LoadGenericNonLinear extends LoadDynamics {

    private static final Logging LOG = Logging.getLogger(LoadGenericNonLinear.class);

    private BaseClass[] LoadGenericNonLinear_class_attributes;
    private BaseClass[] LoadGenericNonLinear_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new LoadGenericNonLinear().getAttributeNamesMap();
    }

    private enum LoadGenericNonLinear_primitive_builder implements PrimitiveBuilder {
        bs() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        bt() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        genericNonLinearLoadModelType() {
            public BaseClass construct(java.lang.String value) {
                return new GenericNonLinearLoadModelKind(value);
            }
        },
        ls() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        lt() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        pt() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        qt() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        tp() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tq() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum LoadGenericNonLinear_class_attributes_enum {
        bs,
        bt,
        genericNonLinearLoadModelType,
        ls,
        lt,
        pt,
        qt,
        tp,
        tq,
        LAST_ENUM
    }

    public LoadGenericNonLinear() {
        LoadGenericNonLinear_primitive_attributes = new BaseClass[LoadGenericNonLinear_primitive_builder.values().length];
        LoadGenericNonLinear_class_attributes = new BaseClass[LoadGenericNonLinear_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new LoadGenericNonLinear();
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

    private void updateAttributeInArray(LoadGenericNonLinear_class_attributes_enum attrEnum, BaseClass value) {
        try {
            LoadGenericNonLinear_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(LoadGenericNonLinear_primitive_builder attrEnum, BaseClass value) {
        try {
            LoadGenericNonLinear_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            LoadGenericNonLinear_class_attributes_enum attrEnum = LoadGenericNonLinear_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated LoadGenericNonLinear, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            LoadGenericNonLinear_primitive_builder attrEnum = LoadGenericNonLinear_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated LoadGenericNonLinear, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            LoadGenericNonLinear_primitive_builder attrEnum = LoadGenericNonLinear_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = LoadGenericNonLinear_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            LoadGenericNonLinear_class_attributes_enum attrEnum = LoadGenericNonLinear_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = LoadGenericNonLinear_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : LoadGenericNonLinear_primitive_builder.values()) {
            if (enumValue != LoadGenericNonLinear_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "LoadGenericNonLinear." + enumValue.name());
            }
        }
        for (var enumValue : LoadGenericNonLinear_class_attributes_enum.values()) {
            if (enumValue != LoadGenericNonLinear_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "LoadGenericNonLinear." + enumValue.name());
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
            for (LoadGenericNonLinear_primitive_builder attrEnum : LoadGenericNonLinear_primitive_builder.values()) {
                BaseClass bc = LoadGenericNonLinear_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    LoadGenericNonLinear." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (LoadGenericNonLinear_class_attributes_enum attrEnum : LoadGenericNonLinear_class_attributes_enum.values()) {
                BaseClass bc = LoadGenericNonLinear_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    LoadGenericNonLinear." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(LoadGenericNonLinear) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "LoadGenericNonLinear";

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
        ATTR_NAMESPACE_MAP = new LoadGenericNonLinear().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("bs", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("bt", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("genericNonLinearLoadModelType", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ls", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("lt", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pt", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("qt", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tq", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
