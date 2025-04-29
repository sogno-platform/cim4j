/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * A PowerTransformerEnd is associated with each Terminal of a PowerTransformer. The impedance values r, r0, x, and x0 of a PowerTransformerEnd represents a star equivalent as follows. 1) for a two Terminal PowerTransformer the high voltage (TransformerEnd.endNumber=1) PowerTransformerEnd has non zero values on r, r0, x, and x0 while the low voltage (TransformerEnd.endNumber=2) PowerTransformerEnd has zero values for r, r0, x, and x0.  Parameters are always provided, even if the PowerTransformerEnds have the same rated voltage.  In this case, the parameters are provided at the PowerTransformerEnd which has TransformerEnd.endNumber equal to 1. 2) for a three Terminal PowerTransformer the three PowerTransformerEnds represent a star equivalent with each leg in the star represented by r, r0, x, and x0 values. 3) For a three Terminal transformer each PowerTransformerEnd shall have g, g0, b and b0 values corresponding to the no load losses distributed on the three PowerTransformerEnds. The total no load loss shunt impedances may also be placed at one of the PowerTransformerEnds, preferably the end numbered 1, having the shunt values on end 1.  This is the preferred way. 4) for a PowerTransformer with more than three Terminals the PowerTransformerEnd impedance values cannot be used. Instead use the TransformerMeshImpedance or split the transformer into multiple PowerTransformers. Each PowerTransformerEnd must be contained by a PowerTransformer. Because a PowerTransformerEnd (or any other object) can not be contained by more than one parent, a PowerTransformerEnd can not have an association to an EquipmentContainer (Substation, VoltageLevel, etc).
 */
public class PowerTransformerEnd extends TransformerEnd {

    private static final Logging LOG = Logging.getLogger(PowerTransformerEnd.class);

    private BaseClass[] PowerTransformerEnd_class_attributes;
    private BaseClass[] PowerTransformerEnd_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new PowerTransformerEnd().getAttributeNamesMap();
    }

    private enum PowerTransformerEnd_primitive_builder implements PrimitiveBuilder {
        b() {
            public BaseClass construct(java.lang.String value) {
                return new Susceptance(value);
            }
        },
        b0() {
            public BaseClass construct(java.lang.String value) {
                return new Susceptance(value);
            }
        },
        connectionKind() {
            public BaseClass construct(java.lang.String value) {
                return new WindingConnection(value);
            }
        },
        g() {
            public BaseClass construct(java.lang.String value) {
                return new Conductance(value);
            }
        },
        g0() {
            public BaseClass construct(java.lang.String value) {
                return new Conductance(value);
            }
        },
        phaseAngleClock() {
            public BaseClass construct(java.lang.String value) {
                return new Integer(value);
            }
        },
        r() {
            public BaseClass construct(java.lang.String value) {
                return new Resistance(value);
            }
        },
        r0() {
            public BaseClass construct(java.lang.String value) {
                return new Resistance(value);
            }
        },
        ratedS() {
            public BaseClass construct(java.lang.String value) {
                return new ApparentPower(value);
            }
        },
        ratedU() {
            public BaseClass construct(java.lang.String value) {
                return new Voltage(value);
            }
        },
        x() {
            public BaseClass construct(java.lang.String value) {
                return new Reactance(value);
            }
        },
        x0() {
            public BaseClass construct(java.lang.String value) {
                return new Reactance(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum PowerTransformerEnd_class_attributes_enum {
        PowerTransformer,
        b,
        b0,
        connectionKind,
        g,
        g0,
        phaseAngleClock,
        r,
        r0,
        ratedS,
        ratedU,
        x,
        x0,
        LAST_ENUM
    }

    public PowerTransformerEnd() {
        PowerTransformerEnd_primitive_attributes = new BaseClass[PowerTransformerEnd_primitive_builder.values().length];
        PowerTransformerEnd_class_attributes = new BaseClass[PowerTransformerEnd_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new PowerTransformerEnd();
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

    private void updateAttributeInArray(PowerTransformerEnd_class_attributes_enum attrEnum, BaseClass value) {
        try {
            PowerTransformerEnd_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(PowerTransformerEnd_primitive_builder attrEnum, BaseClass value) {
        try {
            PowerTransformerEnd_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            PowerTransformerEnd_class_attributes_enum attrEnum = PowerTransformerEnd_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated PowerTransformerEnd, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            PowerTransformerEnd_primitive_builder attrEnum = PowerTransformerEnd_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated PowerTransformerEnd, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            PowerTransformerEnd_primitive_builder attrEnum = PowerTransformerEnd_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PowerTransformerEnd_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            PowerTransformerEnd_class_attributes_enum attrEnum = PowerTransformerEnd_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PowerTransformerEnd_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : PowerTransformerEnd_primitive_builder.values()) {
            if (enumValue != PowerTransformerEnd_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PowerTransformerEnd." + enumValue.name());
            }
        }
        for (var enumValue : PowerTransformerEnd_class_attributes_enum.values()) {
            if (enumValue != PowerTransformerEnd_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PowerTransformerEnd." + enumValue.name());
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
            for (PowerTransformerEnd_primitive_builder attrEnum : PowerTransformerEnd_primitive_builder.values()) {
                BaseClass bc = PowerTransformerEnd_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PowerTransformerEnd." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (PowerTransformerEnd_class_attributes_enum attrEnum : PowerTransformerEnd_class_attributes_enum.values()) {
                BaseClass bc = PowerTransformerEnd_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PowerTransformerEnd." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(PowerTransformerEnd) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "PowerTransformerEnd";

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
        return CLASS_NAMESPACE;
    }

    /**
     * Get the namespace URL of an attribute (also for inherited attributes).
     *
     * @return The namespace URL
     */
    @Override
    public java.lang.String getAttributeNamespaceUrl(java.lang.String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) ? ATTR_DETAILS_MAP.get(attrName).nameSpace : null;
    }

    @Override
    protected Map<java.lang.String, AttrDetails> allAttrDetailsMap() {
        Map<java.lang.String, AttrDetails> map = new LinkedHashMap<>(CLASS_ATTR_DETAILS_MAP);
        map.putAll(super.allAttrDetailsMap());
        return map;
    }

    /**
     * A resource can be used by multiple profiles. This is the set of profiles
     * where this element can be found.
     *
     * @return All possible profiles for an object of this class
     */
    @Override
    public Set<CGMESProfile> getPossibleProfiles() {
        return POSSIBLE_PROFILES;
    }

    /**
     * This is the profile with most of the attributes.
     * It should be used to write the data to as few as possible files.
     *
     * @return The recommended profiles for an object of this class
     */
    @Override
    public CGMESProfile getRecommendedProfile() {
        return RECOMMENDED_PROFILE;
    }

    /**
     * Get the possible profiles of an attribute (also for inherited attributes).
     *
     * @return All possible profiles for an attribute
     */
    @Override
    public Set<CGMESProfile> getPossibleAttributeProfiles(java.lang.String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) ? ATTR_DETAILS_MAP.get(attrName).profiles : null;
    }

    /**
     * Get the possible profiles for an object of this class including the possible
     * profiles of all direct or inherited attributes.
     *
     * A resource can be used by multiple profiles. This is the set of profiles
     * where this element or an attribute of this element can be found.
     *
     * @return All possible profiles for an object of this class and its attributes
     */
    @Override
    public Set<CGMESProfile> getPossibleProfilesIncludingAttributes() {
        return POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    }

    /**
     * Private infos.
     */

    private static final java.lang.String CLASS_NAMESPACE = "http://iec.ch/TC57/CIM100#";

    private static final Map<java.lang.String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<java.lang.String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<java.lang.String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("PowerTransformer", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("b", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("b0", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("connectionKind", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("g", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("g0", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("phaseAngleClock", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("r0", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedS", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedU", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("x0", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PowerTransformerEnd().allAttrDetailsMap());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.SC);
        POSSIBLE_PROFILES = Collections.unmodifiableSet(profiles);
    }

    private static final CGMESProfile RECOMMENDED_PROFILE = CGMESProfile.EQ;

    private static final Set<CGMESProfile> POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>(POSSIBLE_PROFILES);
        for (var attrDetails : ATTR_DETAILS_MAP.values()) {
            profiles.addAll(attrDetails.profiles);
        }
        POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES = Collections.unmodifiableSet(profiles);
    }
}
