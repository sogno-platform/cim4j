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
 * Street details, in the context of address.
 */
public class StreetDetail extends BaseClass {

    private static final Logging LOG = Logging.getLogger(StreetDetail.class);

    private BaseClass[] StreetDetail_class_attributes;
    private BaseClass[] StreetDetail_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new StreetDetail().getAttributeNamesMap();
    }

    private enum StreetDetail_primitive_builder implements PrimitiveBuilder {
        addressGeneral() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        addressGeneral2() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        addressGeneral3() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        buildingName() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        code() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        floorIdentification() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        name() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        number() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        prefix() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        suffix() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        suiteNumber() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        type() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        withinTownLimits() {
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

    private enum StreetDetail_class_attributes_enum {
        addressGeneral,
        addressGeneral2,
        addressGeneral3,
        buildingName,
        code,
        floorIdentification,
        name,
        number,
        prefix,
        suffix,
        suiteNumber,
        type,
        withinTownLimits,
        LAST_ENUM
    }

    public StreetDetail() {
        StreetDetail_primitive_attributes = new BaseClass[StreetDetail_primitive_builder.values().length];
        StreetDetail_class_attributes = new BaseClass[StreetDetail_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new StreetDetail();
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

    private void updateAttributeInArray(StreetDetail_class_attributes_enum attrEnum, BaseClass value) {
        try {
            StreetDetail_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(StreetDetail_primitive_builder attrEnum, BaseClass value) {
        try {
            StreetDetail_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            StreetDetail_class_attributes_enum attrEnum = StreetDetail_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated StreetDetail, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            StreetDetail_primitive_builder attrEnum = StreetDetail_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated StreetDetail, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            StreetDetail_primitive_builder attrEnum = StreetDetail_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = StreetDetail_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            StreetDetail_class_attributes_enum attrEnum = StreetDetail_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = StreetDetail_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : StreetDetail_primitive_builder.values()) {
            if (enumValue != StreetDetail_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "StreetDetail." + enumValue.name());
            }
        }
        for (var enumValue : StreetDetail_class_attributes_enum.values()) {
            if (enumValue != StreetDetail_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "StreetDetail." + enumValue.name());
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
            for (StreetDetail_primitive_builder attrEnum : StreetDetail_primitive_builder.values()) {
                BaseClass bc = StreetDetail_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    StreetDetail." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (StreetDetail_class_attributes_enum attrEnum : StreetDetail_class_attributes_enum.values()) {
                BaseClass bc = StreetDetail_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    StreetDetail." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(StreetDetail) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "StreetDetail";

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
            profiles.add(CGMESProfile.GL);
            map.put("addressGeneral", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("addressGeneral2", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("addressGeneral3", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("buildingName", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("code", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("floorIdentification", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("name", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("number", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("prefix", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("suffix", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("suiteNumber", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("type", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("withinTownLimits", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new StreetDetail().allAttrDetailsMap());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.GL);
        POSSIBLE_PROFILES = Collections.unmodifiableSet(profiles);
    }

    private static final CGMESProfile RECOMMENDED_PROFILE = CGMESProfile.GL;

    private static final Set<CGMESProfile> POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>(POSSIBLE_PROFILES);
        for (var attrDetails : ATTR_DETAILS_MAP.values()) {
            profiles.addAll(attrDetails.profiles);
        }
        POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES = Collections.unmodifiableSet(profiles);
    }
}
