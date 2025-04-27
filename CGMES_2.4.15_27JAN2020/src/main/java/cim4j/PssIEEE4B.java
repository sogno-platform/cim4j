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
 * The class represents IEEE Std 421.5-2005 type PSS2B power system stabilizer model. The PSS4B model represents a structure based on multiple working frequency bands. Three separate bands, respectively dedicated to the low-, intermediate- and high-frequency modes of oscillations, are used in this delta-omega (speed input) PSS.  Reference: IEEE 4B 421.5-2005 Section 8.4.
 */
public class PssIEEE4B extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssIEEE4B.class);

    private BaseClass[] PssIEEE4B_class_attributes;
    private BaseClass[] PssIEEE4B_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new PssIEEE4B().getAttributeNamesMap();
    }

    private enum PssIEEE4B_primitive_builder implements PrimitiveBuilder {
        bwh1() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        bwh2() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        bwl1() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        bwl2() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kh() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kh1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kh11() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kh17() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kh2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ki() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ki1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ki11() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ki17() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ki2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kl() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kl1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kl11() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kl17() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kl2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        omeganh1() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        omeganh2() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        omeganl1() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        omeganl2() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        th1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        th10() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        th11() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        th12() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        th2() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        th3() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        th4() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        th5() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        th6() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        th7() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        th8() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        th9() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti10() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti11() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti12() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti2() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti3() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti4() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti5() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti6() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti7() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti8() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti9() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl10() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl11() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl12() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl2() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl3() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl4() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl5() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl6() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl7() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl8() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl9() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        vhmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vhmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vimax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vimin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vlmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vlmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vstmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vstmin() {
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

    private enum PssIEEE4B_class_attributes_enum {
        bwh1,
        bwh2,
        bwl1,
        bwl2,
        kh,
        kh1,
        kh11,
        kh17,
        kh2,
        ki,
        ki1,
        ki11,
        ki17,
        ki2,
        kl,
        kl1,
        kl11,
        kl17,
        kl2,
        omeganh1,
        omeganh2,
        omeganl1,
        omeganl2,
        th1,
        th10,
        th11,
        th12,
        th2,
        th3,
        th4,
        th5,
        th6,
        th7,
        th8,
        th9,
        ti1,
        ti10,
        ti11,
        ti12,
        ti2,
        ti3,
        ti4,
        ti5,
        ti6,
        ti7,
        ti8,
        ti9,
        tl1,
        tl10,
        tl11,
        tl12,
        tl2,
        tl3,
        tl4,
        tl5,
        tl6,
        tl7,
        tl8,
        tl9,
        vhmax,
        vhmin,
        vimax,
        vimin,
        vlmax,
        vlmin,
        vstmax,
        vstmin,
        LAST_ENUM
    }

    public PssIEEE4B() {
        PssIEEE4B_primitive_attributes = new BaseClass[PssIEEE4B_primitive_builder.values().length];
        PssIEEE4B_class_attributes = new BaseClass[PssIEEE4B_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new PssIEEE4B();
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

    private void updateAttributeInArray(PssIEEE4B_class_attributes_enum attrEnum, BaseClass value) {
        try {
            PssIEEE4B_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(PssIEEE4B_primitive_builder attrEnum, BaseClass value) {
        try {
            PssIEEE4B_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            PssIEEE4B_class_attributes_enum attrEnum = PssIEEE4B_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated PssIEEE4B, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            PssIEEE4B_primitive_builder attrEnum = PssIEEE4B_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated PssIEEE4B, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            PssIEEE4B_primitive_builder attrEnum = PssIEEE4B_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PssIEEE4B_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            PssIEEE4B_class_attributes_enum attrEnum = PssIEEE4B_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PssIEEE4B_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : PssIEEE4B_primitive_builder.values()) {
            if (enumValue != PssIEEE4B_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PssIEEE4B." + enumValue.name());
            }
        }
        for (var enumValue : PssIEEE4B_class_attributes_enum.values()) {
            if (enumValue != PssIEEE4B_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PssIEEE4B." + enumValue.name());
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
            for (PssIEEE4B_primitive_builder attrEnum : PssIEEE4B_primitive_builder.values()) {
                BaseClass bc = PssIEEE4B_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PssIEEE4B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (PssIEEE4B_class_attributes_enum attrEnum : PssIEEE4B_class_attributes_enum.values()) {
                BaseClass bc = PssIEEE4B_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PssIEEE4B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(PssIEEE4B) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "PssIEEE4B";

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
            map.put("bwh1", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bwh2", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bwl1", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bwl2", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh1", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh11", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh17", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh2", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki1", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki11", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki17", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki2", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl1", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl11", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl17", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl2", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omeganh1", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omeganh2", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omeganl1", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omeganl2", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th1", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th10", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th11", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th12", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th2", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th3", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th4", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th5", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th6", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th7", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th8", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th9", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti1", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti10", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti11", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti12", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti2", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti3", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti4", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti5", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti6", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti7", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti8", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti9", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl1", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl10", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl11", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl12", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl2", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl3", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl4", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl5", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl6", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl7", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl8", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl9", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vhmax", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vhmin", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimax", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimin", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vlmax", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vlmin", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vstmax", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vstmin", new AttrDetails("http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PssIEEE4B().allAttrDetailsMap());
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
