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
 * General static load model representing the sensitivity of the real and reactive power consumed by the load to the amplitude and frequency of the bus voltage.
 */
public class LoadStatic extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(LoadStatic.class);

    private BaseClass[] LoadStatic_class_attributes;
    private BaseClass[] LoadStatic_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new LoadStatic().getAttributeNamesMap();
    }

    private enum LoadStatic_primitive_builder implements PrimitiveBuilder {
        ep1() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        ep2() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        ep3() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        eq1() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        eq2() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        eq3() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kp1() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kp2() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kp3() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kp4() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kpf() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kq1() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kq2() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kq3() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kq4() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kqf() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        staticLoadModelType() {
            public BaseClass construct(java.lang.String value) {
                return new StaticLoadModelKind(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum LoadStatic_class_attributes_enum {
        LoadAggregate,
        ep1,
        ep2,
        ep3,
        eq1,
        eq2,
        eq3,
        kp1,
        kp2,
        kp3,
        kp4,
        kpf,
        kq1,
        kq2,
        kq3,
        kq4,
        kqf,
        staticLoadModelType,
        LAST_ENUM
    }

    public LoadStatic() {
        LoadStatic_primitive_attributes = new BaseClass[LoadStatic_primitive_builder.values().length];
        LoadStatic_class_attributes = new BaseClass[LoadStatic_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new LoadStatic();
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

    private void updateAttributeInArray(LoadStatic_class_attributes_enum attrEnum, BaseClass value) {
        try {
            LoadStatic_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(LoadStatic_primitive_builder attrEnum, BaseClass value) {
        try {
            LoadStatic_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            LoadStatic_class_attributes_enum attrEnum = LoadStatic_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated LoadStatic, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            LoadStatic_primitive_builder attrEnum = LoadStatic_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated LoadStatic, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            LoadStatic_primitive_builder attrEnum = LoadStatic_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = LoadStatic_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            LoadStatic_class_attributes_enum attrEnum = LoadStatic_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = LoadStatic_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : LoadStatic_primitive_builder.values()) {
            if (enumValue != LoadStatic_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "LoadStatic." + enumValue.name());
            }
        }
        for (var enumValue : LoadStatic_class_attributes_enum.values()) {
            if (enumValue != LoadStatic_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "LoadStatic." + enumValue.name());
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
            for (LoadStatic_primitive_builder attrEnum : LoadStatic_primitive_builder.values()) {
                BaseClass bc = LoadStatic_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    LoadStatic." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (LoadStatic_class_attributes_enum attrEnum : LoadStatic_class_attributes_enum.values()) {
                BaseClass bc = LoadStatic_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    LoadStatic." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(LoadStatic) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "LoadStatic";

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
            map.put("LoadAggregate", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ep1", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ep2", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ep3", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eq1", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eq2", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eq3", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp1", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp2", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp3", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp4", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpf", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kq1", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kq2", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kq3", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kq4", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kqf", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("staticLoadModelType", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new LoadStatic().allAttrDetailsMap());
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
