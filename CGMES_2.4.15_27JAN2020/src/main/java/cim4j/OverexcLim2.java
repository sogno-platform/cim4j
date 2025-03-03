/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Different from LimIEEEOEL, LimOEL2 has a fixed pickup threshold and reduces the excitation set-point by mean of non-windup integral regulator. Irated is the rated machine excitation current (calculated from nameplate conditions: V, P, CosPhi).
 */
public class OverexcLim2 extends OverexcitationLimiterDynamics {

    private static final Logging LOG = Logging.getLogger(OverexcLim2.class);

    private BaseClass[] OverexcLim2_class_attributes;
    private BaseClass[] OverexcLim2_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new OverexcLim2().getAttributeNamesMap();
    }

    private enum OverexcLim2_primitive_builder implements PrimitiveBuilder {
        ifdlim() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        koi() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        voimax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        voimin() {
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

    private enum OverexcLim2_class_attributes_enum {
        ifdlim,
        koi,
        voimax,
        voimin,
        LAST_ENUM
    }

    public OverexcLim2() {
        OverexcLim2_primitive_attributes = new BaseClass[OverexcLim2_primitive_builder.values().length];
        OverexcLim2_class_attributes = new BaseClass[OverexcLim2_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new OverexcLim2();
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

    private void updateAttributeInArray(OverexcLim2_class_attributes_enum attrEnum, BaseClass value) {
        try {
            OverexcLim2_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(OverexcLim2_primitive_builder attrEnum, BaseClass value) {
        try {
            OverexcLim2_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            OverexcLim2_class_attributes_enum attrEnum = OverexcLim2_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated OverexcLim2, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            OverexcLim2_primitive_builder attrEnum = OverexcLim2_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated OverexcLim2, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            OverexcLim2_primitive_builder attrEnum = OverexcLim2_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = OverexcLim2_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            OverexcLim2_class_attributes_enum attrEnum = OverexcLim2_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = OverexcLim2_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : OverexcLim2_primitive_builder.values()) {
            if (enumValue != OverexcLim2_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "OverexcLim2." + enumValue.name());
            }
        }
        for (var enumValue : OverexcLim2_class_attributes_enum.values()) {
            if (enumValue != OverexcLim2_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "OverexcLim2." + enumValue.name());
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
            for (OverexcLim2_primitive_builder attrEnum : OverexcLim2_primitive_builder.values()) {
                BaseClass bc = OverexcLim2_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    OverexcLim2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (OverexcLim2_class_attributes_enum attrEnum : OverexcLim2_class_attributes_enum.values()) {
                BaseClass bc = OverexcLim2_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    OverexcLim2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(OverexcLim2) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "OverexcLim2";

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
        ATTR_NAMESPACE_MAP = new OverexcLim2().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("ifdlim", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("koi", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("voimax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("voimin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
