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
 * Type UEL2 underexcitation limiter which has either a straight-line or multi-segment characteristic when plotted in terms of machine reactive power output vs. real power output. Reference: IEEE UEL2 421.5-2005, 10.2  (limit characteristic lookup table shown in Figure 10.4 (p 32)).
 */
public class UnderexcLimIEEE2 extends UnderexcitationLimiterDynamics {

    private static final Logging LOG = Logging.getLogger(UnderexcLimIEEE2.class);

    private BaseClass[] UnderexcLimIEEE2_class_attributes;
    private BaseClass[] UnderexcLimIEEE2_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new UnderexcLimIEEE2().getAttributeNamesMap();
    }

    private enum UnderexcLimIEEE2_primitive_builder implements PrimitiveBuilder {
        k1() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        k2() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        kfb() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kuf() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kui() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kul() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        p0() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        p1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        p10() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        p2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        p3() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        p4() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        p5() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        p6() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        p7() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        p8() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        p9() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        q0() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        q1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        q10() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        q2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        q3() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        q4() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        q5() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        q6() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        q7() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        q8() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        q9() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        tu1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tu2() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tu3() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tu4() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tul() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tup() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tuq() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tuv() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        vuimax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vuimin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vulmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vulmin() {
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

    private enum UnderexcLimIEEE2_class_attributes_enum {
        k1,
        k2,
        kfb,
        kuf,
        kui,
        kul,
        p0,
        p1,
        p10,
        p2,
        p3,
        p4,
        p5,
        p6,
        p7,
        p8,
        p9,
        q0,
        q1,
        q10,
        q2,
        q3,
        q4,
        q5,
        q6,
        q7,
        q8,
        q9,
        tu1,
        tu2,
        tu3,
        tu4,
        tul,
        tup,
        tuq,
        tuv,
        vuimax,
        vuimin,
        vulmax,
        vulmin,
        LAST_ENUM
    }

    public UnderexcLimIEEE2() {
        UnderexcLimIEEE2_primitive_attributes = new BaseClass[UnderexcLimIEEE2_primitive_builder.values().length];
        UnderexcLimIEEE2_class_attributes = new BaseClass[UnderexcLimIEEE2_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new UnderexcLimIEEE2();
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

    private void updateAttributeInArray(UnderexcLimIEEE2_class_attributes_enum attrEnum, BaseClass value) {
        try {
            UnderexcLimIEEE2_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(UnderexcLimIEEE2_primitive_builder attrEnum, BaseClass value) {
        try {
            UnderexcLimIEEE2_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            UnderexcLimIEEE2_class_attributes_enum attrEnum = UnderexcLimIEEE2_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated UnderexcLimIEEE2, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            UnderexcLimIEEE2_primitive_builder attrEnum = UnderexcLimIEEE2_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated UnderexcLimIEEE2, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            UnderexcLimIEEE2_primitive_builder attrEnum = UnderexcLimIEEE2_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = UnderexcLimIEEE2_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            UnderexcLimIEEE2_class_attributes_enum attrEnum = UnderexcLimIEEE2_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = UnderexcLimIEEE2_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : UnderexcLimIEEE2_primitive_builder.values()) {
            if (enumValue != UnderexcLimIEEE2_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "UnderexcLimIEEE2." + enumValue.name());
            }
        }
        for (var enumValue : UnderexcLimIEEE2_class_attributes_enum.values()) {
            if (enumValue != UnderexcLimIEEE2_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "UnderexcLimIEEE2." + enumValue.name());
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
            for (UnderexcLimIEEE2_primitive_builder attrEnum : UnderexcLimIEEE2_primitive_builder.values()) {
                BaseClass bc = UnderexcLimIEEE2_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    UnderexcLimIEEE2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (UnderexcLimIEEE2_class_attributes_enum attrEnum : UnderexcLimIEEE2_class_attributes_enum.values()) {
                BaseClass bc = UnderexcLimIEEE2_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    UnderexcLimIEEE2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(UnderexcLimIEEE2) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "UnderexcLimIEEE2";

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
            profiles.add(CGMESProfile.DY);
            map.put("k1", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k2", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kfb", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kuf", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kui", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kul", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p0", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p1", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p10", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p2", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p3", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p4", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p5", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p6", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p7", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p8", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p9", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q0", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q1", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q10", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q2", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q3", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q4", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q5", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q6", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q7", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q8", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q9", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tu1", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tu2", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tu3", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tu4", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tul", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tup", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tuq", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tuv", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vuimax", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vuimin", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vulmax", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vulmin", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new UnderexcLimIEEE2().allAttrDetailsMap());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.DY);
        POSSIBLE_PROFILES = Collections.unmodifiableSet(profiles);
    }

    private static final CGMESProfile RECOMMENDED_PROFILE = CGMESProfile.DY;

    private static final Set<CGMESProfile> POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>(POSSIBLE_PROFILES);
        for (var attrDetails : ATTR_DETAILS_MAP.values()) {
            profiles.addAll(attrDetails.profiles);
        }
        POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES = Collections.unmodifiableSet(profiles);
    }
}
