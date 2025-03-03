/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents IEEE Std 421.5-2005 type AC5A model. The model represents a simplified model for brushless excitation systems. The regulator is supplied from a source, such as a permanent magnet generator, which is not affected by system disturbances.  Unlike other ac models, this model uses loaded rather than open circuit exciter saturation data in the same way as it is used for the dc models.  Because the model has been widely implemented by the industry, it is sometimes used to represent other types of systems when either detailed data for them are not available or simplified models are required.   Reference: IEEE Standard 421.5-2005 Section 6.5.
 */
public class ExcIEEEAC5A extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcIEEEAC5A.class);

    private BaseClass[] ExcIEEEAC5A_class_attributes;
    private BaseClass[] ExcIEEEAC5A_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new ExcIEEEAC5A().getAttributeNamesMap();
    }

    private enum ExcIEEEAC5A_primitive_builder implements PrimitiveBuilder {
        efd1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        efd2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ka() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ke() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kf() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        seefd1() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        seefd2() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        ta() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        te() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tf1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tf2() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tf3() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        vrmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vrmin() {
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

    private enum ExcIEEEAC5A_class_attributes_enum {
        efd1,
        efd2,
        ka,
        ke,
        kf,
        seefd1,
        seefd2,
        ta,
        te,
        tf1,
        tf2,
        tf3,
        vrmax,
        vrmin,
        LAST_ENUM
    }

    public ExcIEEEAC5A() {
        ExcIEEEAC5A_primitive_attributes = new BaseClass[ExcIEEEAC5A_primitive_builder.values().length];
        ExcIEEEAC5A_class_attributes = new BaseClass[ExcIEEEAC5A_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new ExcIEEEAC5A();
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

    private void updateAttributeInArray(ExcIEEEAC5A_class_attributes_enum attrEnum, BaseClass value) {
        try {
            ExcIEEEAC5A_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(ExcIEEEAC5A_primitive_builder attrEnum, BaseClass value) {
        try {
            ExcIEEEAC5A_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            ExcIEEEAC5A_class_attributes_enum attrEnum = ExcIEEEAC5A_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated ExcIEEEAC5A, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            ExcIEEEAC5A_primitive_builder attrEnum = ExcIEEEAC5A_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated ExcIEEEAC5A, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            ExcIEEEAC5A_primitive_builder attrEnum = ExcIEEEAC5A_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcIEEEAC5A_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            ExcIEEEAC5A_class_attributes_enum attrEnum = ExcIEEEAC5A_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcIEEEAC5A_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : ExcIEEEAC5A_primitive_builder.values()) {
            if (enumValue != ExcIEEEAC5A_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcIEEEAC5A." + enumValue.name());
            }
        }
        for (var enumValue : ExcIEEEAC5A_class_attributes_enum.values()) {
            if (enumValue != ExcIEEEAC5A_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcIEEEAC5A." + enumValue.name());
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
            for (ExcIEEEAC5A_primitive_builder attrEnum : ExcIEEEAC5A_primitive_builder.values()) {
                BaseClass bc = ExcIEEEAC5A_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcIEEEAC5A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (ExcIEEEAC5A_class_attributes_enum attrEnum : ExcIEEEAC5A_class_attributes_enum.values()) {
                BaseClass bc = ExcIEEEAC5A_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcIEEEAC5A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(ExcIEEEAC5A) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "ExcIEEEAC5A";

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
        ATTR_NAMESPACE_MAP = new ExcIEEEAC5A().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("efd1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("efd2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ka", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ke", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kf", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("seefd1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("seefd2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ta", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("te", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tf1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tf2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tf3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
