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
 * Detailed hydro unit - Francis model.  This model can be used to represent three types of governors. A schematic of the hydraulic system of detailed hydro unit models, such as Francis and Pelton, is provided in the DetailedHydroModelHydraulicSystem diagram.
 */
public class GovHydroFrancis extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydroFrancis.class);

    private BaseClass[] GovHydroFrancis_class_attributes;
    private BaseClass[] GovHydroFrancis_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new GovHydroFrancis().getAttributeNamesMap();
    }

    private enum GovHydroFrancis_primitive_builder implements PrimitiveBuilder {
        am() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        av0() {
            public BaseClass construct(java.lang.String value) {
                return new Area(value);
            }
        },
        av1() {
            public BaseClass construct(java.lang.String value) {
                return new Area(value);
            }
        },
        bp() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        db1() {
            public BaseClass construct(java.lang.String value) {
                return new Frequency(value);
            }
        },
        etamax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        governorControl() {
            public BaseClass construct(java.lang.String value) {
                return new FrancisGovernorControlKind(value);
            }
        },
        h1() {
            public BaseClass construct(java.lang.String value) {
                return new Length(value);
            }
        },
        h2() {
            public BaseClass construct(java.lang.String value) {
                return new Length(value);
            }
        },
        hn() {
            public BaseClass construct(java.lang.String value) {
                return new Length(value);
            }
        },
        kc() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kg() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kt() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        qc0() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        qn() {
            public BaseClass construct(java.lang.String value) {
                return new VolumeFlowRate(value);
            }
        },
        ta() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        td() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ts() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        twnc() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        twng() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tx() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        va() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        valvmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        valvmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vc() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        waterTunnelSurgeChamberSimulation() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        zsfc() {
            public BaseClass construct(java.lang.String value) {
                return new Length(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum GovHydroFrancis_class_attributes_enum {
        am,
        av0,
        av1,
        bp,
        db1,
        etamax,
        governorControl,
        h1,
        h2,
        hn,
        kc,
        kg,
        kt,
        qc0,
        qn,
        ta,
        td,
        ts,
        twnc,
        twng,
        tx,
        va,
        valvmax,
        valvmin,
        vc,
        waterTunnelSurgeChamberSimulation,
        zsfc,
        LAST_ENUM
    }

    public GovHydroFrancis() {
        GovHydroFrancis_primitive_attributes = new BaseClass[GovHydroFrancis_primitive_builder.values().length];
        GovHydroFrancis_class_attributes = new BaseClass[GovHydroFrancis_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new GovHydroFrancis();
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

    private void updateAttributeInArray(GovHydroFrancis_class_attributes_enum attrEnum, BaseClass value) {
        try {
            GovHydroFrancis_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(GovHydroFrancis_primitive_builder attrEnum, BaseClass value) {
        try {
            GovHydroFrancis_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            GovHydroFrancis_class_attributes_enum attrEnum = GovHydroFrancis_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated GovHydroFrancis, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            GovHydroFrancis_primitive_builder attrEnum = GovHydroFrancis_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated GovHydroFrancis, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            GovHydroFrancis_primitive_builder attrEnum = GovHydroFrancis_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GovHydroFrancis_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            GovHydroFrancis_class_attributes_enum attrEnum = GovHydroFrancis_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GovHydroFrancis_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : GovHydroFrancis_primitive_builder.values()) {
            if (enumValue != GovHydroFrancis_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GovHydroFrancis." + enumValue.name());
            }
        }
        for (var enumValue : GovHydroFrancis_class_attributes_enum.values()) {
            if (enumValue != GovHydroFrancis_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GovHydroFrancis." + enumValue.name());
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
            for (GovHydroFrancis_primitive_builder attrEnum : GovHydroFrancis_primitive_builder.values()) {
                BaseClass bc = GovHydroFrancis_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GovHydroFrancis." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (GovHydroFrancis_class_attributes_enum attrEnum : GovHydroFrancis_class_attributes_enum.values()) {
                BaseClass bc = GovHydroFrancis_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GovHydroFrancis." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(GovHydroFrancis) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "GovHydroFrancis";

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
            map.put("am", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("av0", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("av1", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bp", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db1", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("etamax", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("governorControl", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("h1", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("h2", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("hn", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kg", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kt", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qc0", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qn", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("td", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ts", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twnc", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twng", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tx", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("va", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("valvmax", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("valvmin", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vc", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("waterTunnelSurgeChamberSimulation", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("zsfc", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovHydroFrancis().allAttrDetailsMap());
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
