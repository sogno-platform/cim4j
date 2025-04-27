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
 * Version details.
 */
public class EquipmentVersion extends BaseClass {

    private static final Logging LOG = Logging.getLogger(EquipmentVersion.class);

    private BaseClass[] EquipmentVersion_class_attributes;
    private BaseClass[] EquipmentVersion_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new EquipmentVersion().getAttributeNamesMap();
    }

    private enum EquipmentVersion_primitive_builder implements PrimitiveBuilder {
        baseUML() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        baseURIcore() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        baseURIoperation() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        baseURIshortCircuit() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        date() {
            public BaseClass construct(java.lang.String value) {
                return new Date(value);
            }
        },
        differenceModelURI() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        entsoeUML() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        entsoeURIcore() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        entsoeURIoperation() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        entsoeURIshortCircuit() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        modelDescriptionURI() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        namespaceRDF() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        namespaceUML() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        shortName() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum EquipmentVersion_class_attributes_enum {
        baseUML,
        baseURIcore,
        baseURIoperation,
        baseURIshortCircuit,
        date,
        differenceModelURI,
        entsoeUML,
        entsoeURIcore,
        entsoeURIoperation,
        entsoeURIshortCircuit,
        modelDescriptionURI,
        namespaceRDF,
        namespaceUML,
        shortName,
        LAST_ENUM
    }

    public EquipmentVersion() {
        EquipmentVersion_primitive_attributes = new BaseClass[EquipmentVersion_primitive_builder.values().length];
        EquipmentVersion_class_attributes = new BaseClass[EquipmentVersion_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new EquipmentVersion();
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

    private void updateAttributeInArray(EquipmentVersion_class_attributes_enum attrEnum, BaseClass value) {
        try {
            EquipmentVersion_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(EquipmentVersion_primitive_builder attrEnum, BaseClass value) {
        try {
            EquipmentVersion_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            EquipmentVersion_class_attributes_enum attrEnum = EquipmentVersion_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated EquipmentVersion, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            EquipmentVersion_primitive_builder attrEnum = EquipmentVersion_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated EquipmentVersion, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            EquipmentVersion_primitive_builder attrEnum = EquipmentVersion_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = EquipmentVersion_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            EquipmentVersion_class_attributes_enum attrEnum = EquipmentVersion_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = EquipmentVersion_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : EquipmentVersion_primitive_builder.values()) {
            if (enumValue != EquipmentVersion_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "EquipmentVersion." + enumValue.name());
            }
        }
        for (var enumValue : EquipmentVersion_class_attributes_enum.values()) {
            if (enumValue != EquipmentVersion_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "EquipmentVersion." + enumValue.name());
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
            for (EquipmentVersion_primitive_builder attrEnum : EquipmentVersion_primitive_builder.values()) {
                BaseClass bc = EquipmentVersion_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    EquipmentVersion." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (EquipmentVersion_class_attributes_enum attrEnum : EquipmentVersion_class_attributes_enum.values()) {
                BaseClass bc = EquipmentVersion_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    EquipmentVersion." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(EquipmentVersion) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "EquipmentVersion";

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

    private static final java.lang.String CLASS_NAMESPACE = "http://entsoe.eu/CIM/SchemaExtension/3/1#";

    private static final Map<java.lang.String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<java.lang.String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<java.lang.String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("baseUML", new AttrDetails("http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("baseURIcore", new AttrDetails("http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("baseURIoperation", new AttrDetails("http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("baseURIshortCircuit", new AttrDetails("http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("date", new AttrDetails("http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("differenceModelURI", new AttrDetails("http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("entsoeUML", new AttrDetails("http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("entsoeURIcore", new AttrDetails("http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("entsoeURIoperation", new AttrDetails("http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("entsoeURIshortCircuit", new AttrDetails("http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("modelDescriptionURI", new AttrDetails("http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("namespaceRDF", new AttrDetails("http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("namespaceUML", new AttrDetails("http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("shortName", new AttrDetails("http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new EquipmentVersion().allAttrDetailsMap());
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
