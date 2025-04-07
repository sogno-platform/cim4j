/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * DC side of the voltage source converter (VSC).
 */
public class VsConverter extends ACDCConverter {

    private static final Logging LOG = Logging.getLogger(VsConverter.class);

    private BaseClass[] VsConverter_class_attributes;
    private BaseClass[] VsConverter_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new VsConverter().getAttributeNamesMap();
    }

    private enum VsConverter_primitive_builder implements PrimitiveBuilder {
        delta() {
            public BaseClass construct(java.lang.String value) {
                return new AngleDegrees(value);
            }
        },
        droop() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        droopCompensation() {
            public BaseClass construct(java.lang.String value) {
                return new Resistance(value);
            }
        },
        maxModulationIndex() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        maxValveCurrent() {
            public BaseClass construct(java.lang.String value) {
                return new CurrentFlow(value);
            }
        },
        pPccControl() {
            public BaseClass construct(java.lang.String value) {
                return new VsPpccControlKind(value);
            }
        },
        qPccControl() {
            public BaseClass construct(java.lang.String value) {
                return new VsQpccControlKind(value);
            }
        },
        qShare() {
            public BaseClass construct(java.lang.String value) {
                return new PerCent(value);
            }
        },
        targetQpcc() {
            public BaseClass construct(java.lang.String value) {
                return new ReactivePower(value);
            }
        },
        targetUpcc() {
            public BaseClass construct(java.lang.String value) {
                return new Voltage(value);
            }
        },
        uf() {
            public BaseClass construct(java.lang.String value) {
                return new Voltage(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum VsConverter_class_attributes_enum {
        CapabilityCurve,
        delta,
        droop,
        droopCompensation,
        maxModulationIndex,
        maxValveCurrent,
        pPccControl,
        qPccControl,
        qShare,
        targetQpcc,
        targetUpcc,
        uf,
        LAST_ENUM
    }

    public VsConverter() {
        VsConverter_primitive_attributes = new BaseClass[VsConverter_primitive_builder.values().length];
        VsConverter_class_attributes = new BaseClass[VsConverter_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new VsConverter();
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

    private void updateAttributeInArray(VsConverter_class_attributes_enum attrEnum, BaseClass value) {
        try {
            VsConverter_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(VsConverter_primitive_builder attrEnum, BaseClass value) {
        try {
            VsConverter_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            VsConverter_class_attributes_enum attrEnum = VsConverter_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated VsConverter, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            VsConverter_primitive_builder attrEnum = VsConverter_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated VsConverter, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            VsConverter_primitive_builder attrEnum = VsConverter_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = VsConverter_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            VsConverter_class_attributes_enum attrEnum = VsConverter_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = VsConverter_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : VsConverter_primitive_builder.values()) {
            if (enumValue != VsConverter_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "VsConverter." + enumValue.name());
            }
        }
        for (var enumValue : VsConverter_class_attributes_enum.values()) {
            if (enumValue != VsConverter_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "VsConverter." + enumValue.name());
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
            for (VsConverter_primitive_builder attrEnum : VsConverter_primitive_builder.values()) {
                BaseClass bc = VsConverter_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    VsConverter." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (VsConverter_class_attributes_enum attrEnum : VsConverter_class_attributes_enum.values()) {
                BaseClass bc = VsConverter_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    VsConverter." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(VsConverter) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "VsConverter";

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
        ATTR_NAMESPACE_MAP = new VsConverter().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("CapabilityCurve", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("delta", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("droop", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("droopCompensation", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("maxModulationIndex", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("maxValveCurrent", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pPccControl", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("qPccControl", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("qShare", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("targetQpcc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("targetUpcc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("uf", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
