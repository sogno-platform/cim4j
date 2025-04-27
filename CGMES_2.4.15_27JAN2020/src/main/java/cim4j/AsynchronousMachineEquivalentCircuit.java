/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The electrical equations of all variations of the asynchronous model are based on the AsynchronousEquivalentCircuit diagram for the direct and quadrature axes, with two equivalent rotor windings in each axis.      =  +   =  +  *  / ( + )  =  +  * *  / ( *  +  *  +  * )  = ( + ) / ( * )  = ( *  +  *  +  * ) / ( *  * (+ ) Same equations using CIM attributes from AsynchronousMachineTimeConstantReactance class on left of = sign and AsynchronousMachineEquivalentCircuit class on right (except as noted): xs = xm + RotatingMachineDynamics.statorLeakageReactance xp = RotatingMachineDynamics.statorLeakageReactance + xm * xlr1 / (xm + xlr1) xpp = RotatingMachineDynamics.statorLeakageReactance + xm * xlr1* xlr2 / (xm * xlr1 + xm * xlr2 + xlr1 * xlr2) tpo = (xm + xlr1) / (2*pi*nominal frequency * rr1) tppo = (xm * xlr1 + xm * xlr2 + xlr1 * xlr2) / (2*pi*nominal frequency * rr2 * (xm + xlr1).
 */
public class AsynchronousMachineEquivalentCircuit extends AsynchronousMachineDynamics {

    private static final Logging LOG = Logging.getLogger(AsynchronousMachineEquivalentCircuit.class);

    private BaseClass[] AsynchronousMachineEquivalentCircuit_class_attributes;
    private BaseClass[] AsynchronousMachineEquivalentCircuit_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new AsynchronousMachineEquivalentCircuit().getAttributeNamesMap();
    }

    private enum AsynchronousMachineEquivalentCircuit_primitive_builder implements PrimitiveBuilder {
        rr1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        rr2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        xlr1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        xlr2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        xm() {
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

    private enum AsynchronousMachineEquivalentCircuit_class_attributes_enum {
        rr1,
        rr2,
        xlr1,
        xlr2,
        xm,
        LAST_ENUM
    }

    public AsynchronousMachineEquivalentCircuit() {
        AsynchronousMachineEquivalentCircuit_primitive_attributes = new BaseClass[AsynchronousMachineEquivalentCircuit_primitive_builder.values().length];
        AsynchronousMachineEquivalentCircuit_class_attributes = new BaseClass[AsynchronousMachineEquivalentCircuit_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new AsynchronousMachineEquivalentCircuit();
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

    private void updateAttributeInArray(AsynchronousMachineEquivalentCircuit_class_attributes_enum attrEnum, BaseClass value) {
        try {
            AsynchronousMachineEquivalentCircuit_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(AsynchronousMachineEquivalentCircuit_primitive_builder attrEnum, BaseClass value) {
        try {
            AsynchronousMachineEquivalentCircuit_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            AsynchronousMachineEquivalentCircuit_class_attributes_enum attrEnum = AsynchronousMachineEquivalentCircuit_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated AsynchronousMachineEquivalentCircuit, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            AsynchronousMachineEquivalentCircuit_primitive_builder attrEnum = AsynchronousMachineEquivalentCircuit_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated AsynchronousMachineEquivalentCircuit, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            AsynchronousMachineEquivalentCircuit_primitive_builder attrEnum = AsynchronousMachineEquivalentCircuit_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = AsynchronousMachineEquivalentCircuit_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            AsynchronousMachineEquivalentCircuit_class_attributes_enum attrEnum = AsynchronousMachineEquivalentCircuit_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = AsynchronousMachineEquivalentCircuit_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : AsynchronousMachineEquivalentCircuit_primitive_builder.values()) {
            if (enumValue != AsynchronousMachineEquivalentCircuit_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "AsynchronousMachineEquivalentCircuit." + enumValue.name());
            }
        }
        for (var enumValue : AsynchronousMachineEquivalentCircuit_class_attributes_enum.values()) {
            if (enumValue != AsynchronousMachineEquivalentCircuit_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "AsynchronousMachineEquivalentCircuit." + enumValue.name());
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
            for (AsynchronousMachineEquivalentCircuit_primitive_builder attrEnum : AsynchronousMachineEquivalentCircuit_primitive_builder.values()) {
                BaseClass bc = AsynchronousMachineEquivalentCircuit_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    AsynchronousMachineEquivalentCircuit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (AsynchronousMachineEquivalentCircuit_class_attributes_enum attrEnum : AsynchronousMachineEquivalentCircuit_class_attributes_enum.values()) {
                BaseClass bc = AsynchronousMachineEquivalentCircuit_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    AsynchronousMachineEquivalentCircuit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(AsynchronousMachineEquivalentCircuit) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "AsynchronousMachineEquivalentCircuit";

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
        ATTR_NAMESPACE_MAP = new AsynchronousMachineEquivalentCircuit().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("rr1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("rr2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("xlr1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("xlr2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("xm", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
