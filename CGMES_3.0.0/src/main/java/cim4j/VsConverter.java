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
 * DC side of the voltage source converter (VSC).
 */
public class VsConverter extends ACDCConverter {

    private static final Logging LOG = Logging.getLogger(VsConverter.class);

    private BaseClass[] VsConverter_class_attributes;
    private BaseClass[] VsConverter_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new VsConverter().getAttributeNamesMap();
    }

    private enum VsConverter_primitive_builder implements PrimitiveBuilder {
        delta() {
            public BaseClass construct(java.lang.String value) {
                return new AngleDegrees(value);
            }
        },
        droop() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        droopCompensation() {
            public BaseClass construct(java.lang.String value) {
                return new Resistance(value);
            }
        },
        maxModulationIndex() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        pPccControl() {
            public BaseClass construct(java.lang.String value) {
                return new VsPpccControlKind(value);
            }
        },
        qPccControl() {
            public BaseClass construct(java.lang.String value) {
                return new VsQpccControlKind(value);
            }
        },
        qShare() {
            public BaseClass construct(java.lang.String value) {
                return new PerCent(value);
            }
        },
        targetPWMfactor() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        targetPhasePcc() {
            public BaseClass construct(java.lang.String value) {
                return new AngleDegrees(value);
            }
        },
        targetPowerFactorPcc() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        targetQpcc() {
            public BaseClass construct(java.lang.String value) {
                return new ReactivePower(value);
            }
        },
        targetUpcc() {
            public BaseClass construct(java.lang.String value) {
                return new Voltage(value);
            }
        },
        uv() {
            public BaseClass construct(java.lang.String value) {
                return new Voltage(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum VsConverter_class_attributes_enum {
        CapabilityCurve,
        VSCDynamics,
        delta,
        droop,
        droopCompensation,
        maxModulationIndex,
        pPccControl,
        qPccControl,
        qShare,
        targetPWMfactor,
        targetPhasePcc,
        targetPowerFactorPcc,
        targetQpcc,
        targetUpcc,
        uv,
        LAST_ENUM
    }

    public VsConverter() {
        VsConverter_primitive_attributes = new BaseClass[VsConverter_primitive_builder.values().length];
        VsConverter_class_attributes = new BaseClass[VsConverter_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new VsConverter();
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

    private void updateAttributeInArray(VsConverter_class_attributes_enum attrEnum, BaseClass value) {
        try {
            VsConverter_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(VsConverter_primitive_builder attrEnum, BaseClass value) {
        try {
            VsConverter_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            VsConverter_class_attributes_enum attrEnum = VsConverter_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated VsConverter, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            VsConverter_primitive_builder attrEnum = VsConverter_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated VsConverter, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            VsConverter_primitive_builder attrEnum = VsConverter_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = VsConverter_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            VsConverter_class_attributes_enum attrEnum = VsConverter_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = VsConverter_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : VsConverter_primitive_builder.values()) {
            if (enumValue != VsConverter_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "VsConverter." + enumValue.name());
            }
        }
        for (var enumValue : VsConverter_class_attributes_enum.values()) {
            if (enumValue != VsConverter_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "VsConverter." + enumValue.name());
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
            for (VsConverter_primitive_builder attrEnum : VsConverter_primitive_builder.values()) {
                BaseClass bc = VsConverter_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    VsConverter." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (VsConverter_class_attributes_enum attrEnum : VsConverter_class_attributes_enum.values()) {
                BaseClass bc = VsConverter_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    VsConverter." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(VsConverter) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "VsConverter";

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
            map.put("CapabilityCurve", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("VSCDynamics", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("delta", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("droop", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("droopCompensation", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxModulationIndex", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("pPccControl", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("qPccControl", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("qShare", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetPWMfactor", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetPhasePcc", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetPowerFactorPcc", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetQpcc", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetUpcc", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("uv", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new VsConverter().allAttrDetailsMap());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.DY);
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.SSH);
        profiles.add(CGMESProfile.SV);
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
