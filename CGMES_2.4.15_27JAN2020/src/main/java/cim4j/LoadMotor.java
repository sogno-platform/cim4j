/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Aggregate induction motor load. This model  is used to represent a fraction of an ordinary load as "induction motor load".  It allows load that is treated as ordinary constant power in power flow analysis to be represented by an induction motor in dynamic simulation.  If  = 0. or  = , or  = 0.,  only one cage is represented. Magnetic saturation is not modelled. Either a "one-cage" or "two-cage" model of the induction machine can be modelled. Magnetic saturation is not modelled.  This model is intended for representation of aggregations of many motors dispersed through a load represented at a high voltage bus but where there is no information on the characteristics of individual motors.  This model treats a fraction of the constant power part of a load as a motor. During initialisation, the initial power drawn by the motor is set equal to  times the constant  part of the static load.  The remainder of the load is left as static load.  The reactive power demand of the motor is calculated during initialisation as a function of voltage at the load bus. This reactive power demand may be less than or greater than the constant  component of the load.  If the motor's reactive demand is greater than the constant  component of the load, the model inserts a shunt capacitor at the terminal of the motor to bring its reactive demand down to equal the constant  reactive load.   If a motor model and a static load model are both present for a load, the motor  is assumed to be subtracted from the power flow constant  load before the static load model is applied.  The remainder of the load, if any, is then represented by the static load model.
 */
public class LoadMotor extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(LoadMotor.class);

    private BaseClass[] LoadMotor_class_attributes;
    private BaseClass[] LoadMotor_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new LoadMotor().getAttributeNamesMap();
    }

    private enum LoadMotor_primitive_builder implements PrimitiveBuilder {
        d() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        h() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        lfac() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        lp() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        lpp() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ls() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pfrac() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        ra() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        tbkr() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tpo() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tppo() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tv() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        vt() {
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

    private enum LoadMotor_class_attributes_enum {
        LoadAggregate,
        d,
        h,
        lfac,
        lp,
        lpp,
        ls,
        pfrac,
        ra,
        tbkr,
        tpo,
        tppo,
        tv,
        vt,
        LAST_ENUM
    }

    public LoadMotor() {
        LoadMotor_primitive_attributes = new BaseClass[LoadMotor_primitive_builder.values().length];
        LoadMotor_class_attributes = new BaseClass[LoadMotor_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new LoadMotor();
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

    private void updateAttributeInArray(LoadMotor_class_attributes_enum attrEnum, BaseClass value) {
        try {
            LoadMotor_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(LoadMotor_primitive_builder attrEnum, BaseClass value) {
        try {
            LoadMotor_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            LoadMotor_class_attributes_enum attrEnum = LoadMotor_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated LoadMotor, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            LoadMotor_primitive_builder attrEnum = LoadMotor_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated LoadMotor, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            LoadMotor_primitive_builder attrEnum = LoadMotor_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = LoadMotor_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            LoadMotor_class_attributes_enum attrEnum = LoadMotor_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = LoadMotor_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : LoadMotor_primitive_builder.values()) {
            if (enumValue != LoadMotor_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "LoadMotor." + enumValue.name());
            }
        }
        for (var enumValue : LoadMotor_class_attributes_enum.values()) {
            if (enumValue != LoadMotor_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "LoadMotor." + enumValue.name());
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
            for (LoadMotor_primitive_builder attrEnum : LoadMotor_primitive_builder.values()) {
                BaseClass bc = LoadMotor_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    LoadMotor." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (LoadMotor_class_attributes_enum attrEnum : LoadMotor_class_attributes_enum.values()) {
                BaseClass bc = LoadMotor_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    LoadMotor." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(LoadMotor) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "LoadMotor";

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
        ATTR_NAMESPACE_MAP = new LoadMotor().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("LoadAggregate", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("d", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("h", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("lfac", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("lp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("lpp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ls", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pfrac", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ra", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tbkr", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tpo", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tppo", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tv", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vt", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
