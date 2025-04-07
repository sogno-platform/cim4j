/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Mechanism for changing transformer winding tap positions.
 */
public class TapChanger extends PowerSystemResource {

    private static final Logging LOG = Logging.getLogger(TapChanger.class);

    private BaseClass[] TapChanger_class_attributes;
    private BaseClass[] TapChanger_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new TapChanger().getAttributeNamesMap();
    }

    private enum TapChanger_primitive_builder implements PrimitiveBuilder {
        controlEnabled() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        highStep() {
            public BaseClass construct(java.lang.String value) {
                return new Integer(value);
            }
        },
        lowStep() {
            public BaseClass construct(java.lang.String value) {
                return new Integer(value);
            }
        },
        ltcFlag() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        neutralStep() {
            public BaseClass construct(java.lang.String value) {
                return new Integer(value);
            }
        },
        neutralU() {
            public BaseClass construct(java.lang.String value) {
                return new Voltage(value);
            }
        },
        normalStep() {
            public BaseClass construct(java.lang.String value) {
                return new Integer(value);
            }
        },
        step() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum TapChanger_class_attributes_enum {
        SvTapStep,
        TapChangerControl,
        TapSchedules,
        controlEnabled,
        highStep,
        lowStep,
        ltcFlag,
        neutralStep,
        neutralU,
        normalStep,
        step,
        LAST_ENUM
    }

    public TapChanger() {
        TapChanger_primitive_attributes = new BaseClass[TapChanger_primitive_builder.values().length];
        TapChanger_class_attributes = new BaseClass[TapChanger_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new TapChanger();
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

    private void updateAttributeInArray(TapChanger_class_attributes_enum attrEnum, BaseClass value) {
        try {
            TapChanger_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(TapChanger_primitive_builder attrEnum, BaseClass value) {
        try {
            TapChanger_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            TapChanger_class_attributes_enum attrEnum = TapChanger_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated TapChanger, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            TapChanger_primitive_builder attrEnum = TapChanger_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated TapChanger, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            TapChanger_primitive_builder attrEnum = TapChanger_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = TapChanger_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            TapChanger_class_attributes_enum attrEnum = TapChanger_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = TapChanger_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : TapChanger_primitive_builder.values()) {
            if (enumValue != TapChanger_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "TapChanger." + enumValue.name());
            }
        }
        for (var enumValue : TapChanger_class_attributes_enum.values()) {
            if (enumValue != TapChanger_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "TapChanger." + enumValue.name());
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
            for (TapChanger_primitive_builder attrEnum : TapChanger_primitive_builder.values()) {
                BaseClass bc = TapChanger_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    TapChanger." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (TapChanger_class_attributes_enum attrEnum : TapChanger_class_attributes_enum.values()) {
                BaseClass bc = TapChanger_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    TapChanger." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(TapChanger) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "TapChanger";

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
        ATTR_NAMESPACE_MAP = new TapChanger().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("SvTapStep", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("TapChangerControl", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("TapSchedules", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("controlEnabled", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("highStep", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("lowStep", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ltcFlag", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("neutralStep", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("neutralU", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("normalStep", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("step", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
