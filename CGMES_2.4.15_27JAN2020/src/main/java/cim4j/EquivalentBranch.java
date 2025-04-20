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
 * The class represents equivalent branches.
 */
public class EquivalentBranch extends EquivalentEquipment {

    private static final Logging LOG = Logging.getLogger(EquivalentBranch.class);

    private BaseClass[] EquivalentBranch_class_attributes;
    private BaseClass[] EquivalentBranch_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new EquivalentBranch().getAttributeNamesMap();
    }

    private enum EquivalentBranch_primitive_builder implements PrimitiveBuilder {
        negativeR12() {
            public BaseClass construct(java.lang.String value) {
                return new Resistance(value);
            }
        },
        negativeR21() {
            public BaseClass construct(java.lang.String value) {
                return new Resistance(value);
            }
        },
        negativeX12() {
            public BaseClass construct(java.lang.String value) {
                return new Reactance(value);
            }
        },
        negativeX21() {
            public BaseClass construct(java.lang.String value) {
                return new Reactance(value);
            }
        },
        positiveR12() {
            public BaseClass construct(java.lang.String value) {
                return new Resistance(value);
            }
        },
        positiveR21() {
            public BaseClass construct(java.lang.String value) {
                return new Resistance(value);
            }
        },
        positiveX12() {
            public BaseClass construct(java.lang.String value) {
                return new Reactance(value);
            }
        },
        positiveX21() {
            public BaseClass construct(java.lang.String value) {
                return new Reactance(value);
            }
        },
        r() {
            public BaseClass construct(java.lang.String value) {
                return new Resistance(value);
            }
        },
        r21() {
            public BaseClass construct(java.lang.String value) {
                return new Resistance(value);
            }
        },
        x() {
            public BaseClass construct(java.lang.String value) {
                return new Reactance(value);
            }
        },
        x21() {
            public BaseClass construct(java.lang.String value) {
                return new Reactance(value);
            }
        },
        zeroR12() {
            public BaseClass construct(java.lang.String value) {
                return new Resistance(value);
            }
        },
        zeroR21() {
            public BaseClass construct(java.lang.String value) {
                return new Resistance(value);
            }
        },
        zeroX12() {
            public BaseClass construct(java.lang.String value) {
                return new Reactance(value);
            }
        },
        zeroX21() {
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

    private enum EquivalentBranch_class_attributes_enum {
        negativeR12,
        negativeR21,
        negativeX12,
        negativeX21,
        positiveR12,
        positiveR21,
        positiveX12,
        positiveX21,
        r,
        r21,
        x,
        x21,
        zeroR12,
        zeroR21,
        zeroX12,
        zeroX21,
        LAST_ENUM
    }

    public EquivalentBranch() {
        EquivalentBranch_primitive_attributes = new BaseClass[EquivalentBranch_primitive_builder.values().length];
        EquivalentBranch_class_attributes = new BaseClass[EquivalentBranch_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new EquivalentBranch();
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

    private void updateAttributeInArray(EquivalentBranch_class_attributes_enum attrEnum, BaseClass value) {
        try {
            EquivalentBranch_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(EquivalentBranch_primitive_builder attrEnum, BaseClass value) {
        try {
            EquivalentBranch_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            EquivalentBranch_class_attributes_enum attrEnum = EquivalentBranch_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated EquivalentBranch, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            EquivalentBranch_primitive_builder attrEnum = EquivalentBranch_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated EquivalentBranch, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            EquivalentBranch_primitive_builder attrEnum = EquivalentBranch_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = EquivalentBranch_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            EquivalentBranch_class_attributes_enum attrEnum = EquivalentBranch_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = EquivalentBranch_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : EquivalentBranch_primitive_builder.values()) {
            if (enumValue != EquivalentBranch_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "EquivalentBranch." + enumValue.name());
            }
        }
        for (var enumValue : EquivalentBranch_class_attributes_enum.values()) {
            if (enumValue != EquivalentBranch_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "EquivalentBranch." + enumValue.name());
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
            for (EquivalentBranch_primitive_builder attrEnum : EquivalentBranch_primitive_builder.values()) {
                BaseClass bc = EquivalentBranch_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    EquivalentBranch." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (EquivalentBranch_class_attributes_enum attrEnum : EquivalentBranch_class_attributes_enum.values()) {
                BaseClass bc = EquivalentBranch_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    EquivalentBranch." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(EquivalentBranch) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "EquivalentBranch";

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
            profiles.add(CGMESProfile.EQ);
            map.put("negativeR12", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("negativeR21", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("negativeX12", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("negativeX21", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("positiveR12", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("positiveR21", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("positiveX12", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("positiveX21", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r21", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x21", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("zeroR12", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("zeroR21", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("zeroX12", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("zeroX21", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new EquivalentBranch().allAttrDetailsMap());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
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
