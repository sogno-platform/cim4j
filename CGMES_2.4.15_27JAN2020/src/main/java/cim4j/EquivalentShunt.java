/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents equivalent shunts.
 */
public class EquivalentShunt extends EquivalentEquipment {

    private static final Logging LOG = Logging.getLogger(EquivalentShunt.class);

    private BaseClass[] EquivalentShunt_class_attributes;
    private BaseClass[] EquivalentShunt_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new EquivalentShunt().getAttributeNamesMap();
    }

    private enum EquivalentShunt_primitive_builder implements PrimitiveBuilder {
        b() {
            public BaseClass construct(java.lang.String value) {
                return new Susceptance(value);
            }
        },
        g() {
            public BaseClass construct(java.lang.String value) {
                return new Conductance(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum EquivalentShunt_class_attributes_enum {
        b,
        g,
        LAST_ENUM
    }

    public EquivalentShunt() {
        EquivalentShunt_primitive_attributes = new BaseClass[EquivalentShunt_primitive_builder.values().length];
        EquivalentShunt_class_attributes = new BaseClass[EquivalentShunt_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new EquivalentShunt();
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

    private void updateAttributeInArray(EquivalentShunt_class_attributes_enum attrEnum, BaseClass value) {
        try {
            EquivalentShunt_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(EquivalentShunt_primitive_builder attrEnum, BaseClass value) {
        try {
            EquivalentShunt_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            EquivalentShunt_class_attributes_enum attrEnum = EquivalentShunt_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated EquivalentShunt, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            EquivalentShunt_primitive_builder attrEnum = EquivalentShunt_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated EquivalentShunt, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            EquivalentShunt_primitive_builder attrEnum = EquivalentShunt_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = EquivalentShunt_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            EquivalentShunt_class_attributes_enum attrEnum = EquivalentShunt_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = EquivalentShunt_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : EquivalentShunt_primitive_builder.values()) {
            if (enumValue != EquivalentShunt_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "EquivalentShunt." + enumValue.name());
            }
        }
        for (var enumValue : EquivalentShunt_class_attributes_enum.values()) {
            if (enumValue != EquivalentShunt_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "EquivalentShunt." + enumValue.name());
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
            for (EquivalentShunt_primitive_builder attrEnum : EquivalentShunt_primitive_builder.values()) {
                BaseClass bc = EquivalentShunt_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    EquivalentShunt." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (EquivalentShunt_class_attributes_enum attrEnum : EquivalentShunt_class_attributes_enum.values()) {
                BaseClass bc = EquivalentShunt_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    EquivalentShunt." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(EquivalentShunt) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "EquivalentShunt";

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
        ATTR_NAMESPACE_MAP = new EquivalentShunt().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("b", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("g", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
