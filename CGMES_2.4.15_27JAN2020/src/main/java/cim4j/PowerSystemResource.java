/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A power system resource can be an item of equipment such as a switch, an equipment container containing many individual items of equipment such as a substation, or an organisational entity such as sub-control area. Power system resources can have measurements associated.
 */
public class PowerSystemResource extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(PowerSystemResource.class);

    private BaseClass[] PowerSystemResource_class_attributes;
    private BaseClass[] PowerSystemResource_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new PowerSystemResource().getAttributeNamesMap();
    }

    private enum PowerSystemResource_primitive_builder implements PrimitiveBuilder {
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum PowerSystemResource_class_attributes_enum {
        Controls,
        Location,
        Measurements,
        LAST_ENUM
    }

    public PowerSystemResource() {
        PowerSystemResource_primitive_attributes = new BaseClass[PowerSystemResource_primitive_builder.values().length];
        PowerSystemResource_class_attributes = new BaseClass[PowerSystemResource_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new PowerSystemResource();
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

    private void updateAttributeInArray(PowerSystemResource_class_attributes_enum attrEnum, BaseClass value) {
        try {
            PowerSystemResource_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(PowerSystemResource_primitive_builder attrEnum, BaseClass value) {
        try {
            PowerSystemResource_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            PowerSystemResource_class_attributes_enum attrEnum = PowerSystemResource_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated PowerSystemResource, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            PowerSystemResource_primitive_builder attrEnum = PowerSystemResource_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated PowerSystemResource, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            PowerSystemResource_primitive_builder attrEnum = PowerSystemResource_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PowerSystemResource_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            PowerSystemResource_class_attributes_enum attrEnum = PowerSystemResource_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PowerSystemResource_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : PowerSystemResource_primitive_builder.values()) {
            if (enumValue != PowerSystemResource_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PowerSystemResource." + enumValue.name());
            }
        }
        for (var enumValue : PowerSystemResource_class_attributes_enum.values()) {
            if (enumValue != PowerSystemResource_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PowerSystemResource." + enumValue.name());
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
            for (PowerSystemResource_primitive_builder attrEnum : PowerSystemResource_primitive_builder.values()) {
                BaseClass bc = PowerSystemResource_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PowerSystemResource." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (PowerSystemResource_class_attributes_enum attrEnum : PowerSystemResource_class_attributes_enum.values()) {
                BaseClass bc = PowerSystemResource_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PowerSystemResource." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(PowerSystemResource) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "PowerSystemResource";

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
        ATTR_NAMESPACE_MAP = new PowerSystemResource().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("Controls", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("Location", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("Measurements", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
