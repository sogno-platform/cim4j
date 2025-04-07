/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * P control model Type 3.  Reference: IEC Standard 61400-27-1 Section 6.6.5.3.
 */
public class WindContPType3IEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindContPType3IEC.class);

    private BaseClass[] WindContPType3IEC_class_attributes;
    private BaseClass[] WindContPType3IEC_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new WindContPType3IEC().getAttributeNamesMap();
    }

    private enum WindContPType3IEC_primitive_builder implements PrimitiveBuilder {
        dpmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        dtrisemaxlvrt() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kdtd() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kip() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kpp() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        mplvrt() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        omegaoffset() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pdtdmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        rramp() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        tdvs() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        temin() {
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
        tpord() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        tufilt() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tuscale() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        twref() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        udvs() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        updip() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        wdtd() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        zeta() {
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

    private enum WindContPType3IEC_class_attributes_enum {
        WindDynamicsLookupTable,
        WindGenTurbineType3IEC,
        dpmax,
        dtrisemaxlvrt,
        kdtd,
        kip,
        kpp,
        mplvrt,
        omegaoffset,
        pdtdmax,
        rramp,
        tdvs,
        temin,
        tomegafilt,
        tpfilt,
        tpord,
        tufilt,
        tuscale,
        twref,
        udvs,
        updip,
        wdtd,
        zeta,
        LAST_ENUM
    }

    public WindContPType3IEC() {
        WindContPType3IEC_primitive_attributes = new BaseClass[WindContPType3IEC_primitive_builder.values().length];
        WindContPType3IEC_class_attributes = new BaseClass[WindContPType3IEC_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new WindContPType3IEC();
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

    private void updateAttributeInArray(WindContPType3IEC_class_attributes_enum attrEnum, BaseClass value) {
        try {
            WindContPType3IEC_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(WindContPType3IEC_primitive_builder attrEnum, BaseClass value) {
        try {
            WindContPType3IEC_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            WindContPType3IEC_class_attributes_enum attrEnum = WindContPType3IEC_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated WindContPType3IEC, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            WindContPType3IEC_primitive_builder attrEnum = WindContPType3IEC_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated WindContPType3IEC, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            WindContPType3IEC_primitive_builder attrEnum = WindContPType3IEC_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindContPType3IEC_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            WindContPType3IEC_class_attributes_enum attrEnum = WindContPType3IEC_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindContPType3IEC_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : WindContPType3IEC_primitive_builder.values()) {
            if (enumValue != WindContPType3IEC_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindContPType3IEC." + enumValue.name());
            }
        }
        for (var enumValue : WindContPType3IEC_class_attributes_enum.values()) {
            if (enumValue != WindContPType3IEC_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindContPType3IEC." + enumValue.name());
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
            for (WindContPType3IEC_primitive_builder attrEnum : WindContPType3IEC_primitive_builder.values()) {
                BaseClass bc = WindContPType3IEC_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindContPType3IEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (WindContPType3IEC_class_attributes_enum attrEnum : WindContPType3IEC_class_attributes_enum.values()) {
                BaseClass bc = WindContPType3IEC_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindContPType3IEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(WindContPType3IEC) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "WindContPType3IEC";

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
        ATTR_NAMESPACE_MAP = new WindContPType3IEC().allAttrNamespaceMap();
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
            Map.entry("WindGenTurbineType3IEC", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("dpmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("dtrisemaxlvrt", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kdtd", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kip", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kpp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("mplvrt", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("omegaoffset", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pdtdmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("rramp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tdvs", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("temin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tomegafilt", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tpfilt", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tpord", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tufilt", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tuscale", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("twref", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("udvs", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("updip", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("wdtd", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("zeta", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
