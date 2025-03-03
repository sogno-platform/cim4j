/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Pitch control emulator model.  Reference: IEC Standard 61400-27-1 Section 6.6.5.1.
 */
public class WindPitchContEmulIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindPitchContEmulIEC.class);

    private BaseClass[] WindPitchContEmulIEC_class_attributes;
    private BaseClass[] WindPitchContEmulIEC_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new WindPitchContEmulIEC().getAttributeNamesMap();
    }

    private enum WindPitchContEmulIEC_primitive_builder implements PrimitiveBuilder {
        kdroop() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kipce() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        komegaaero() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kppce() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        omegaref() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pimax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pimin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        t1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        t2() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tpe() {
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

    private enum WindPitchContEmulIEC_class_attributes_enum {
        WindGenTurbineType2IEC,
        kdroop,
        kipce,
        komegaaero,
        kppce,
        omegaref,
        pimax,
        pimin,
        t1,
        t2,
        tpe,
        LAST_ENUM
    }

    public WindPitchContEmulIEC() {
        WindPitchContEmulIEC_primitive_attributes = new BaseClass[WindPitchContEmulIEC_primitive_builder.values().length];
        WindPitchContEmulIEC_class_attributes = new BaseClass[WindPitchContEmulIEC_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new WindPitchContEmulIEC();
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

    private void updateAttributeInArray(WindPitchContEmulIEC_class_attributes_enum attrEnum, BaseClass value) {
        try {
            WindPitchContEmulIEC_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(WindPitchContEmulIEC_primitive_builder attrEnum, BaseClass value) {
        try {
            WindPitchContEmulIEC_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            WindPitchContEmulIEC_class_attributes_enum attrEnum = WindPitchContEmulIEC_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated WindPitchContEmulIEC, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            WindPitchContEmulIEC_primitive_builder attrEnum = WindPitchContEmulIEC_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated WindPitchContEmulIEC, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            WindPitchContEmulIEC_primitive_builder attrEnum = WindPitchContEmulIEC_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindPitchContEmulIEC_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            WindPitchContEmulIEC_class_attributes_enum attrEnum = WindPitchContEmulIEC_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindPitchContEmulIEC_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : WindPitchContEmulIEC_primitive_builder.values()) {
            if (enumValue != WindPitchContEmulIEC_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindPitchContEmulIEC." + enumValue.name());
            }
        }
        for (var enumValue : WindPitchContEmulIEC_class_attributes_enum.values()) {
            if (enumValue != WindPitchContEmulIEC_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindPitchContEmulIEC." + enumValue.name());
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
            for (WindPitchContEmulIEC_primitive_builder attrEnum : WindPitchContEmulIEC_primitive_builder.values()) {
                BaseClass bc = WindPitchContEmulIEC_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindPitchContEmulIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (WindPitchContEmulIEC_class_attributes_enum attrEnum : WindPitchContEmulIEC_class_attributes_enum.values()) {
                BaseClass bc = WindPitchContEmulIEC_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindPitchContEmulIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(WindPitchContEmulIEC) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "WindPitchContEmulIEC";

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
        ATTR_NAMESPACE_MAP = new WindPitchContEmulIEC().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("WindGenTurbineType2IEC", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kdroop", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kipce", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("komegaaero", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kppce", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("omegaref", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pimax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pimin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tpe", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
