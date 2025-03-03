/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A Measurement represents any measured, calculated or non-measured non-calculated quantity. Any piece of equipment may contain Measurements, e.g. a substation may have temperature measurements and door open indications, a transformer may have oil temperature and tank pressure measurements, a bay may contain a number of power flow measurements and a Breaker may contain a switch status measurement.  The PSR - Measurement association is intended to capture this use of Measurement and is included in the naming hierarchy based on EquipmentContainer. The naming hierarchy typically has Measurements as leafs, e.g. Substation-VoltageLevel-Bay-Switch-Measurement. Some Measurements represent quantities related to a particular sensor location in the network, e.g. a voltage transformer (PT) at a busbar or a current transformer (CT) at the bar between a breaker and an isolator. The sensing position is not captured in the PSR - Measurement association. Instead it is captured by the Measurement - Terminal association that is used to define the sensing location in the network topology. The location is defined by the connection of the Terminal to ConductingEquipment.  If both a Terminal and PSR are associated, and the PSR is of type ConductingEquipment, the associated Terminal should belong to that ConductingEquipment instance. When the sensor location is needed both Measurement-PSR and Measurement-Terminal are used. The Measurement-Terminal association is never used alone.
 */
public class Measurement extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(Measurement.class);

    private BaseClass[] Measurement_class_attributes;
    private BaseClass[] Measurement_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new Measurement().getAttributeNamesMap();
    }

    private enum Measurement_primitive_builder implements PrimitiveBuilder {
        measurementType() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        phases() {
            public BaseClass construct(java.lang.String value) {
                return new PhaseCode(value);
            }
        },
        unitMultiplier() {
            public BaseClass construct(java.lang.String value) {
                return new UnitMultiplier(value);
            }
        },
        unitSymbol() {
            public BaseClass construct(java.lang.String value) {
                return new UnitSymbol(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum Measurement_class_attributes_enum {
        PowerSystemResource,
        Terminal,
        measurementType,
        phases,
        unitMultiplier,
        unitSymbol,
        LAST_ENUM
    }

    public Measurement() {
        Measurement_primitive_attributes = new BaseClass[Measurement_primitive_builder.values().length];
        Measurement_class_attributes = new BaseClass[Measurement_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new Measurement();
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

    private void updateAttributeInArray(Measurement_class_attributes_enum attrEnum, BaseClass value) {
        try {
            Measurement_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(Measurement_primitive_builder attrEnum, BaseClass value) {
        try {
            Measurement_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            Measurement_class_attributes_enum attrEnum = Measurement_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated Measurement, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            Measurement_primitive_builder attrEnum = Measurement_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated Measurement, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            Measurement_primitive_builder attrEnum = Measurement_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = Measurement_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            Measurement_class_attributes_enum attrEnum = Measurement_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = Measurement_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : Measurement_primitive_builder.values()) {
            if (enumValue != Measurement_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "Measurement." + enumValue.name());
            }
        }
        for (var enumValue : Measurement_class_attributes_enum.values()) {
            if (enumValue != Measurement_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "Measurement." + enumValue.name());
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
            for (Measurement_primitive_builder attrEnum : Measurement_primitive_builder.values()) {
                BaseClass bc = Measurement_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    Measurement." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (Measurement_class_attributes_enum attrEnum : Measurement_class_attributes_enum.values()) {
                BaseClass bc = Measurement_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    Measurement." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(Measurement) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "Measurement";

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
        ATTR_NAMESPACE_MAP = new Measurement().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("PowerSystemResource", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("Terminal", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("measurementType", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("phases", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("unitMultiplier", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("unitSymbol", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
