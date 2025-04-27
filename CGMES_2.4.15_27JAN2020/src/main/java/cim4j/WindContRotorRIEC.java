/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Rotor resistance control model.  Reference: IEC Standard 61400-27-1 Section 6.6.5.2.
 */
public class WindContRotorRIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindContRotorRIEC.class);

    private BaseClass[] WindContRotorRIEC_class_attributes;
    private BaseClass[] WindContRotorRIEC_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new WindContRotorRIEC().getAttributeNamesMap();
    }

    private enum WindContRotorRIEC_primitive_builder implements PrimitiveBuilder {
        kirr() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        komegafilt() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kpfilt() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kprr() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        rmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        rmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        tomegafilt() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tpfilt() {
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

    private enum WindContRotorRIEC_class_attributes_enum {
        WindDynamicsLookupTable,
        WindGenTurbineType2IEC,
        kirr,
        komegafilt,
        kpfilt,
        kprr,
        rmax,
        rmin,
        tomegafilt,
        tpfilt,
        LAST_ENUM
    }

    public WindContRotorRIEC() {
        WindContRotorRIEC_primitive_attributes = new BaseClass[WindContRotorRIEC_primitive_builder.values().length];
        WindContRotorRIEC_class_attributes = new BaseClass[WindContRotorRIEC_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new WindContRotorRIEC();
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

    private void updateAttributeInArray(WindContRotorRIEC_class_attributes_enum attrEnum, BaseClass value) {
        try {
            WindContRotorRIEC_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(WindContRotorRIEC_primitive_builder attrEnum, BaseClass value) {
        try {
            WindContRotorRIEC_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            WindContRotorRIEC_class_attributes_enum attrEnum = WindContRotorRIEC_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated WindContRotorRIEC, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            WindContRotorRIEC_primitive_builder attrEnum = WindContRotorRIEC_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated WindContRotorRIEC, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            WindContRotorRIEC_primitive_builder attrEnum = WindContRotorRIEC_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindContRotorRIEC_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            WindContRotorRIEC_class_attributes_enum attrEnum = WindContRotorRIEC_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindContRotorRIEC_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : WindContRotorRIEC_primitive_builder.values()) {
            if (enumValue != WindContRotorRIEC_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindContRotorRIEC." + enumValue.name());
            }
        }
        for (var enumValue : WindContRotorRIEC_class_attributes_enum.values()) {
            if (enumValue != WindContRotorRIEC_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindContRotorRIEC." + enumValue.name());
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
            for (WindContRotorRIEC_primitive_builder attrEnum : WindContRotorRIEC_primitive_builder.values()) {
                BaseClass bc = WindContRotorRIEC_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindContRotorRIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (WindContRotorRIEC_class_attributes_enum attrEnum : WindContRotorRIEC_class_attributes_enum.values()) {
                BaseClass bc = WindContRotorRIEC_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindContRotorRIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(WindContRotorRIEC) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "WindContRotorRIEC";

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
        ATTR_NAMESPACE_MAP = new WindContRotorRIEC().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("WindDynamicsLookupTable", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("WindGenTurbineType2IEC", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kirr", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("komegafilt", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kpfilt", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kprr", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("rmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("rmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tomegafilt", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tpfilt", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
