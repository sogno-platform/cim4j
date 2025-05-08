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
 * Frequency and active power controller model. Reference: IEC 61400-27-1:2015, Annex D.
 */
public class WindPlantFreqPcontrolIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindPlantFreqPcontrolIEC.class);

    private BaseClass[] WindPlantFreqPcontrolIEC_class_attributes;
    private BaseClass[] WindPlantFreqPcontrolIEC_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new WindPlantFreqPcontrolIEC().getAttributeNamesMap();
    }

    private enum WindPlantFreqPcontrolIEC_primitive_builder implements PrimitiveBuilder {
        dprefmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        dprefmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        dpwprefmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        dpwprefmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kiwpp() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        kiwppmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kiwppmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kpwpp() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        kwppref() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        prefmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        prefmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        tpft() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tpfv() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        twpffiltp() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        twppfiltp() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum WindPlantFreqPcontrolIEC_class_attributes_enum {
        WindDynamicsLookupTable,
        WindPlantIEC,
        dprefmax,
        dprefmin,
        dpwprefmax,
        dpwprefmin,
        kiwpp,
        kiwppmax,
        kiwppmin,
        kpwpp,
        kwppref,
        prefmax,
        prefmin,
        tpft,
        tpfv,
        twpffiltp,
        twppfiltp,
        LAST_ENUM
    }

    public WindPlantFreqPcontrolIEC() {
        WindPlantFreqPcontrolIEC_primitive_attributes = new BaseClass[WindPlantFreqPcontrolIEC_primitive_builder.values().length];
        WindPlantFreqPcontrolIEC_class_attributes = new BaseClass[WindPlantFreqPcontrolIEC_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new WindPlantFreqPcontrolIEC();
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

    private void updateAttributeInArray(WindPlantFreqPcontrolIEC_class_attributes_enum attrEnum, BaseClass value) {
        try {
            WindPlantFreqPcontrolIEC_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(WindPlantFreqPcontrolIEC_primitive_builder attrEnum, BaseClass value) {
        try {
            WindPlantFreqPcontrolIEC_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            WindPlantFreqPcontrolIEC_class_attributes_enum attrEnum = WindPlantFreqPcontrolIEC_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated WindPlantFreqPcontrolIEC, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            WindPlantFreqPcontrolIEC_primitive_builder attrEnum = WindPlantFreqPcontrolIEC_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated WindPlantFreqPcontrolIEC, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            WindPlantFreqPcontrolIEC_primitive_builder attrEnum = WindPlantFreqPcontrolIEC_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindPlantFreqPcontrolIEC_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            WindPlantFreqPcontrolIEC_class_attributes_enum attrEnum = WindPlantFreqPcontrolIEC_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindPlantFreqPcontrolIEC_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : WindPlantFreqPcontrolIEC_primitive_builder.values()) {
            if (enumValue != WindPlantFreqPcontrolIEC_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindPlantFreqPcontrolIEC." + enumValue.name());
            }
        }
        for (var enumValue : WindPlantFreqPcontrolIEC_class_attributes_enum.values()) {
            if (enumValue != WindPlantFreqPcontrolIEC_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindPlantFreqPcontrolIEC." + enumValue.name());
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
            for (WindPlantFreqPcontrolIEC_primitive_builder attrEnum : WindPlantFreqPcontrolIEC_primitive_builder.values()) {
                BaseClass bc = WindPlantFreqPcontrolIEC_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindPlantFreqPcontrolIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (WindPlantFreqPcontrolIEC_class_attributes_enum attrEnum : WindPlantFreqPcontrolIEC_class_attributes_enum.values()) {
                BaseClass bc = WindPlantFreqPcontrolIEC_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindPlantFreqPcontrolIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(WindPlantFreqPcontrolIEC) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "WindPlantFreqPcontrolIEC";

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
            map.put("WindDynamicsLookupTable", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindPlantIEC", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dprefmax", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dprefmin", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dpwprefmax", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dpwprefmin", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiwpp", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiwppmax", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiwppmin", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpwpp", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kwppref", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("prefmax", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("prefmin", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpft", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpfv", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twpffiltp", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twppfiltp", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindPlantFreqPcontrolIEC().allAttrDetailsMap());
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
