/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * All synchronous machine detailed types use a subset of the same data parameters and input/output variables.   The several variations differ in the following ways:   It is not necessary for each simulation tool to have separate models for each of the model types.  The same model can often be used for several types by alternative logic within the model.  Also, differences in saturation representation may not result in significant model performance differences so model substitutions are often acceptable.
 */
public class SynchronousMachineDetailed extends SynchronousMachineDynamics {

    private static final Logging LOG = Logging.getLogger(SynchronousMachineDetailed.class);

    private BaseClass[] SynchronousMachineDetailed_class_attributes;
    private BaseClass[] SynchronousMachineDetailed_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new SynchronousMachineDetailed().getAttributeNamesMap();
    }

    private enum SynchronousMachineDetailed_primitive_builder implements PrimitiveBuilder {
        efdBaseRatio() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        ifdBaseType() {
            public BaseClass construct(java.lang.String value) {
                return new IfdBaseKind(value);
            }
        },
        ifdBaseValue() {
            public BaseClass construct(java.lang.String value) {
                return new CurrentFlow(value);
            }
        },
        saturationFactor120QAxis() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        saturationFactorQAxis() {
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

    private enum SynchronousMachineDetailed_class_attributes_enum {
        efdBaseRatio,
        ifdBaseType,
        ifdBaseValue,
        saturationFactor120QAxis,
        saturationFactorQAxis,
        LAST_ENUM
    }

    public SynchronousMachineDetailed() {
        SynchronousMachineDetailed_primitive_attributes = new BaseClass[SynchronousMachineDetailed_primitive_builder.values().length];
        SynchronousMachineDetailed_class_attributes = new BaseClass[SynchronousMachineDetailed_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new SynchronousMachineDetailed();
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

    private void updateAttributeInArray(SynchronousMachineDetailed_class_attributes_enum attrEnum, BaseClass value) {
        try {
            SynchronousMachineDetailed_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(SynchronousMachineDetailed_primitive_builder attrEnum, BaseClass value) {
        try {
            SynchronousMachineDetailed_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            SynchronousMachineDetailed_class_attributes_enum attrEnum = SynchronousMachineDetailed_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated SynchronousMachineDetailed, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            SynchronousMachineDetailed_primitive_builder attrEnum = SynchronousMachineDetailed_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated SynchronousMachineDetailed, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            SynchronousMachineDetailed_primitive_builder attrEnum = SynchronousMachineDetailed_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = SynchronousMachineDetailed_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            SynchronousMachineDetailed_class_attributes_enum attrEnum = SynchronousMachineDetailed_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = SynchronousMachineDetailed_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : SynchronousMachineDetailed_primitive_builder.values()) {
            if (enumValue != SynchronousMachineDetailed_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "SynchronousMachineDetailed." + enumValue.name());
            }
        }
        for (var enumValue : SynchronousMachineDetailed_class_attributes_enum.values()) {
            if (enumValue != SynchronousMachineDetailed_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "SynchronousMachineDetailed." + enumValue.name());
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
            for (SynchronousMachineDetailed_primitive_builder attrEnum : SynchronousMachineDetailed_primitive_builder.values()) {
                BaseClass bc = SynchronousMachineDetailed_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    SynchronousMachineDetailed." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (SynchronousMachineDetailed_class_attributes_enum attrEnum : SynchronousMachineDetailed_class_attributes_enum.values()) {
                BaseClass bc = SynchronousMachineDetailed_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    SynchronousMachineDetailed." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(SynchronousMachineDetailed) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "SynchronousMachineDetailed";

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
        ATTR_NAMESPACE_MAP = new SynchronousMachineDetailed().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("efdBaseRatio", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ifdBaseType", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ifdBaseValue", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("saturationFactor120QAxis", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("saturationFactorQAxis", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
