/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Supports definition of one or more parameters of several different datatypes for use by proprietary user-defined models.  NOTE: This class does not inherit from IdentifiedObject since it is not intended that a single instance of it be referenced by more than one proprietary user-defined model instance.
 */
public class ProprietaryParameterDynamics extends BaseClass {

    private static final Logging LOG = Logging.getLogger(ProprietaryParameterDynamics.class);

    private BaseClass[] ProprietaryParameterDynamics_class_attributes;
    private BaseClass[] ProprietaryParameterDynamics_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new ProprietaryParameterDynamics().getAttributeNamesMap();
    }

    private enum ProprietaryParameterDynamics_primitive_builder implements PrimitiveBuilder {
        booleanParameterValue() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        floatParameterValue() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        integerParameterValue() {
            public BaseClass construct(java.lang.String value) {
                return new Integer(value);
            }
        },
        parameterNumber() {
            public BaseClass construct(java.lang.String value) {
                return new Integer(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum ProprietaryParameterDynamics_class_attributes_enum {
        AsynchronousMachineUserDefined,
        DiscontinuousExcitationControlUserDefined,
        ExcitationSystemUserDefined,
        LoadUserDefined,
        MechanicalLoadUserDefined,
        OverexcitationLimiterUserDefined,
        PFVArControllerType1UserDefined,
        PFVArControllerType2UserDefined,
        PowerSystemStabilizerUserDefined,
        SynchronousMachineUserDefined,
        TurbineGovernorUserDefined,
        TurbineLoadControllerUserDefined,
        UnderexcitationLimiterUserDefined,
        VoltageAdjusterUserDefined,
        VoltageCompensatorUserDefined,
        WindPlantUserDefined,
        WindType1or2UserDefined,
        WindType3or4UserDefined,
        booleanParameterValue,
        floatParameterValue,
        integerParameterValue,
        parameterNumber,
        LAST_ENUM
    }

    public ProprietaryParameterDynamics() {
        ProprietaryParameterDynamics_primitive_attributes = new BaseClass[ProprietaryParameterDynamics_primitive_builder.values().length];
        ProprietaryParameterDynamics_class_attributes = new BaseClass[ProprietaryParameterDynamics_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new ProprietaryParameterDynamics();
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

    private void updateAttributeInArray(ProprietaryParameterDynamics_class_attributes_enum attrEnum, BaseClass value) {
        try {
            ProprietaryParameterDynamics_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(ProprietaryParameterDynamics_primitive_builder attrEnum, BaseClass value) {
        try {
            ProprietaryParameterDynamics_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            ProprietaryParameterDynamics_class_attributes_enum attrEnum = ProprietaryParameterDynamics_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated ProprietaryParameterDynamics, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            ProprietaryParameterDynamics_primitive_builder attrEnum = ProprietaryParameterDynamics_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated ProprietaryParameterDynamics, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            ProprietaryParameterDynamics_primitive_builder attrEnum = ProprietaryParameterDynamics_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ProprietaryParameterDynamics_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            ProprietaryParameterDynamics_class_attributes_enum attrEnum = ProprietaryParameterDynamics_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ProprietaryParameterDynamics_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : ProprietaryParameterDynamics_primitive_builder.values()) {
            if (enumValue != ProprietaryParameterDynamics_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ProprietaryParameterDynamics." + enumValue.name());
            }
        }
        for (var enumValue : ProprietaryParameterDynamics_class_attributes_enum.values()) {
            if (enumValue != ProprietaryParameterDynamics_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ProprietaryParameterDynamics." + enumValue.name());
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
            for (ProprietaryParameterDynamics_primitive_builder attrEnum : ProprietaryParameterDynamics_primitive_builder.values()) {
                BaseClass bc = ProprietaryParameterDynamics_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ProprietaryParameterDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (ProprietaryParameterDynamics_class_attributes_enum attrEnum : ProprietaryParameterDynamics_class_attributes_enum.values()) {
                BaseClass bc = ProprietaryParameterDynamics_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ProprietaryParameterDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(ProprietaryParameterDynamics) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "ProprietaryParameterDynamics";

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
        ATTR_NAMESPACE_MAP = new ProprietaryParameterDynamics().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("AsynchronousMachineUserDefined", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("DiscontinuousExcitationControlUserDefined", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ExcitationSystemUserDefined", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LoadUserDefined", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("MechanicalLoadUserDefined", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("OverexcitationLimiterUserDefined", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("PFVArControllerType1UserDefined", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("PFVArControllerType2UserDefined", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("PowerSystemStabilizerUserDefined", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("SynchronousMachineUserDefined", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("TurbineGovernorUserDefined", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("TurbineLoadControllerUserDefined", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("UnderexcitationLimiterUserDefined", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("VoltageAdjusterUserDefined", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("VoltageCompensatorUserDefined", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("WindPlantUserDefined", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("WindType1or2UserDefined", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("WindType3or4UserDefined", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("booleanParameterValue", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("floatParameterValue", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("integerParameterValue", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("parameterNumber", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
