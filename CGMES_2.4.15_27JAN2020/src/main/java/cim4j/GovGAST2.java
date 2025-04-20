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
 * Gas turbine model.
 */
public class GovGAST2 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovGAST2.class);

    private BaseClass[] GovGAST2_class_attributes;
    private BaseClass[] GovGAST2_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new GovGAST2().getAttributeNamesMap();
    }

    private enum GovGAST2_primitive_builder implements PrimitiveBuilder {
        a() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        af1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        af2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        b() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        bf1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        bf2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        c() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        cf2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ecr() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        etd() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        k3() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        k4() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        k5() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        k6() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kf() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        mwbase() {
            public BaseClass construct(java.lang.String value) {
                return new ActivePower(value);
            }
        },
        t() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        t3() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        t4() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        t5() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tc() {
            public BaseClass construct(java.lang.String value) {
                return new Temperature(value);
            }
        },
        tcd() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tf() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        tmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        tr() {
            public BaseClass construct(java.lang.String value) {
                return new Temperature(value);
            }
        },
        trate() {
            public BaseClass construct(java.lang.String value) {
                return new ActivePower(value);
            }
        },
        tt() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        w() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        x() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        y() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        z() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum GovGAST2_class_attributes_enum {
        a,
        af1,
        af2,
        b,
        bf1,
        bf2,
        c,
        cf2,
        ecr,
        etd,
        k3,
        k4,
        k5,
        k6,
        kf,
        mwbase,
        t,
        t3,
        t4,
        t5,
        tc,
        tcd,
        tf,
        tmax,
        tmin,
        tr,
        trate,
        tt,
        w,
        x,
        y,
        z,
        LAST_ENUM
    }

    public GovGAST2() {
        GovGAST2_primitive_attributes = new BaseClass[GovGAST2_primitive_builder.values().length];
        GovGAST2_class_attributes = new BaseClass[GovGAST2_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new GovGAST2();
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

    private void updateAttributeInArray(GovGAST2_class_attributes_enum attrEnum, BaseClass value) {
        try {
            GovGAST2_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(GovGAST2_primitive_builder attrEnum, BaseClass value) {
        try {
            GovGAST2_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            GovGAST2_class_attributes_enum attrEnum = GovGAST2_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated GovGAST2, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            GovGAST2_primitive_builder attrEnum = GovGAST2_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated GovGAST2, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            GovGAST2_primitive_builder attrEnum = GovGAST2_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GovGAST2_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            GovGAST2_class_attributes_enum attrEnum = GovGAST2_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GovGAST2_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : GovGAST2_primitive_builder.values()) {
            if (enumValue != GovGAST2_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GovGAST2." + enumValue.name());
            }
        }
        for (var enumValue : GovGAST2_class_attributes_enum.values()) {
            if (enumValue != GovGAST2_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GovGAST2." + enumValue.name());
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
            for (GovGAST2_primitive_builder attrEnum : GovGAST2_primitive_builder.values()) {
                BaseClass bc = GovGAST2_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GovGAST2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (GovGAST2_class_attributes_enum attrEnum : GovGAST2_class_attributes_enum.values()) {
                BaseClass bc = GovGAST2_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GovGAST2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(GovGAST2) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "GovGAST2";

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

    private static final java.lang.String CLASS_NAMESPACE = "http://iec.ch/TC57/2013/CIM-schema-cim16#";

    private static final Map<java.lang.String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<java.lang.String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<java.lang.String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("af1", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("af2", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("b", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bf1", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bf2", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("c", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("cf2", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ecr", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("etd", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k3", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k4", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k5", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k6", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tcd", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tmax", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tmin", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tr", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("trate", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tt", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("w", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("x", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("y", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("z", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovGAST2().allAttrDetailsMap());
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
