/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A conductor, or group of conductors, with negligible impedance, that serve to connect other conducting equipment within a single substation.  Voltage measurements are typically obtained from VoltageTransformers that are connected to busbar sections. A bus bar section may have many physical terminals but for analysis is modelled with exactly one logical terminal.
 */
public class BusbarSection extends Connector {

    private static final Logging LOG = Logging.getLogger(BusbarSection.class);

    private BaseClass[] BusbarSection_class_attributes;
    private BaseClass[] BusbarSection_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new BusbarSection().getAttributeNamesMap();
    }

    private enum BusbarSection_primitive_builder implements PrimitiveBuilder {
        ipMax() {
            public BaseClass construct(java.lang.String value) {
                return new CurrentFlow(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum BusbarSection_class_attributes_enum {
        ipMax,
        LAST_ENUM
    }

    public BusbarSection() {
        BusbarSection_primitive_attributes = new BaseClass[BusbarSection_primitive_builder.values().length];
        BusbarSection_class_attributes = new BaseClass[BusbarSection_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new BusbarSection();
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

    private void updateAttributeInArray(BusbarSection_class_attributes_enum attrEnum, BaseClass value) {
        try {
            BusbarSection_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(BusbarSection_primitive_builder attrEnum, BaseClass value) {
        try {
            BusbarSection_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            BusbarSection_class_attributes_enum attrEnum = BusbarSection_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated BusbarSection, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            BusbarSection_primitive_builder attrEnum = BusbarSection_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated BusbarSection, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            BusbarSection_primitive_builder attrEnum = BusbarSection_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = BusbarSection_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            BusbarSection_class_attributes_enum attrEnum = BusbarSection_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = BusbarSection_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : BusbarSection_primitive_builder.values()) {
            if (enumValue != BusbarSection_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "BusbarSection." + enumValue.name());
            }
        }
        for (var enumValue : BusbarSection_class_attributes_enum.values()) {
            if (enumValue != BusbarSection_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "BusbarSection." + enumValue.name());
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
            for (BusbarSection_primitive_builder attrEnum : BusbarSection_primitive_builder.values()) {
                BaseClass bc = BusbarSection_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    BusbarSection." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (BusbarSection_class_attributes_enum attrEnum : BusbarSection_class_attributes_enum.values()) {
                BaseClass bc = BusbarSection_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    BusbarSection." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(BusbarSection) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "BusbarSection";

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
        ATTR_NAMESPACE_MAP = new BusbarSection().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("ipMax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
