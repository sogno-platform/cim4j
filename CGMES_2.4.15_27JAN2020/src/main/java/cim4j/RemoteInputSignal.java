/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Supports connection to a terminal associated with a remote bus from which an input signal of a specific type is coming.
 */
public class RemoteInputSignal extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(RemoteInputSignal.class);

    private BaseClass[] RemoteInputSignal_class_attributes;
    private BaseClass[] RemoteInputSignal_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new RemoteInputSignal().getAttributeNamesMap();
    }

    private enum RemoteInputSignal_primitive_builder implements PrimitiveBuilder {
        remoteSignalType() {
            public BaseClass construct(java.lang.String value) {
                return new RemoteSignalKind(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum RemoteInputSignal_class_attributes_enum {
        DiscontinuousExcitationControlDynamics,
        PFVArControllerType1Dynamics,
        PowerSystemStabilizerDynamics,
        Terminal,
        UnderexcitationLimiterDynamics,
        VoltageCompensatorDynamics,
        WindPlantDynamics,
        WindTurbineType1or2Dynamics,
        WindTurbineType3or4Dynamics,
        remoteSignalType,
        LAST_ENUM
    }

    public RemoteInputSignal() {
        RemoteInputSignal_primitive_attributes = new BaseClass[RemoteInputSignal_primitive_builder.values().length];
        RemoteInputSignal_class_attributes = new BaseClass[RemoteInputSignal_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new RemoteInputSignal();
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

    private void updateAttributeInArray(RemoteInputSignal_class_attributes_enum attrEnum, BaseClass value) {
        try {
            RemoteInputSignal_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(RemoteInputSignal_primitive_builder attrEnum, BaseClass value) {
        try {
            RemoteInputSignal_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            RemoteInputSignal_class_attributes_enum attrEnum = RemoteInputSignal_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated RemoteInputSignal, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            RemoteInputSignal_primitive_builder attrEnum = RemoteInputSignal_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated RemoteInputSignal, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            RemoteInputSignal_primitive_builder attrEnum = RemoteInputSignal_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = RemoteInputSignal_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            RemoteInputSignal_class_attributes_enum attrEnum = RemoteInputSignal_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = RemoteInputSignal_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : RemoteInputSignal_primitive_builder.values()) {
            if (enumValue != RemoteInputSignal_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "RemoteInputSignal." + enumValue.name());
            }
        }
        for (var enumValue : RemoteInputSignal_class_attributes_enum.values()) {
            if (enumValue != RemoteInputSignal_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "RemoteInputSignal." + enumValue.name());
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
            for (RemoteInputSignal_primitive_builder attrEnum : RemoteInputSignal_primitive_builder.values()) {
                BaseClass bc = RemoteInputSignal_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    RemoteInputSignal." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (RemoteInputSignal_class_attributes_enum attrEnum : RemoteInputSignal_class_attributes_enum.values()) {
                BaseClass bc = RemoteInputSignal_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    RemoteInputSignal." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(RemoteInputSignal) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "RemoteInputSignal";

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
        ATTR_NAMESPACE_MAP = new RemoteInputSignal().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("DiscontinuousExcitationControlDynamics", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("PFVArControllerType1Dynamics", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("PowerSystemStabilizerDynamics", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("Terminal", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("UnderexcitationLimiterDynamics", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("VoltageCompensatorDynamics", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("WindPlantDynamics", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("WindTurbineType1or2Dynamics", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("WindTurbineType3or4Dynamics", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("remoteSignalType", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
