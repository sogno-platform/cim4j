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
 * An electromechanical device that operates with shaft rotating synchronously with the network. It is a single machine operating either as a generator or synchronous condenser or pump.
 */
public class SynchronousMachine extends RotatingMachine {

    private static final Logging LOG = Logging.getLogger(SynchronousMachine.class);

    private BaseClass[] SynchronousMachine_class_attributes;
    private BaseClass[] SynchronousMachine_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new SynchronousMachine().getAttributeNamesMap();
    }

    private enum SynchronousMachine_primitive_builder implements PrimitiveBuilder {
        earthing() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        earthingStarPointR() {
            public BaseClass construct(java.lang.String value) {
                return new Resistance(value);
            }
        },
        earthingStarPointX() {
            public BaseClass construct(java.lang.String value) {
                return new Reactance(value);
            }
        },
        ikk() {
            public BaseClass construct(java.lang.String value) {
                return new CurrentFlow(value);
            }
        },
        maxQ() {
            public BaseClass construct(java.lang.String value) {
                return new ReactivePower(value);
            }
        },
        minQ() {
            public BaseClass construct(java.lang.String value) {
                return new ReactivePower(value);
            }
        },
        mu() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        operatingMode() {
            public BaseClass construct(java.lang.String value) {
                return new SynchronousMachineOperatingMode(value);
            }
        },
        qPercent() {
            public BaseClass construct(java.lang.String value) {
                return new PerCent(value);
            }
        },
        r() {
            public BaseClass construct(java.lang.String value) {
                return new Resistance(value);
            }
        },
        r0() {
            public BaseClass construct(java.lang.String value) {
                return new Resistance(value);
            }
        },
        r2() {
            public BaseClass construct(java.lang.String value) {
                return new Resistance(value);
            }
        },
        referencePriority() {
            public BaseClass construct(java.lang.String value) {
                return new Integer(value);
            }
        },
        satDirectSubtransX() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        satDirectSyncX() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        satDirectTransX() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        shortCircuitRotorType() {
            public BaseClass construct(java.lang.String value) {
                return new ShortCircuitRotorKind(value);
            }
        },
        type() {
            public BaseClass construct(java.lang.String value) {
                return new SynchronousMachineKind(value);
            }
        },
        voltageRegulationRange() {
            public BaseClass construct(java.lang.String value) {
                return new PerCent(value);
            }
        },
        x0() {
            public BaseClass construct(java.lang.String value) {
                return new Reactance(value);
            }
        },
        x2() {
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

    private enum SynchronousMachine_class_attributes_enum {
        InitialReactiveCapabilityCurve,
        SynchronousMachineDynamics,
        earthing,
        earthingStarPointR,
        earthingStarPointX,
        ikk,
        maxQ,
        minQ,
        mu,
        operatingMode,
        qPercent,
        r,
        r0,
        r2,
        referencePriority,
        satDirectSubtransX,
        satDirectSyncX,
        satDirectTransX,
        shortCircuitRotorType,
        type,
        voltageRegulationRange,
        x0,
        x2,
        LAST_ENUM
    }

    public SynchronousMachine() {
        SynchronousMachine_primitive_attributes = new BaseClass[SynchronousMachine_primitive_builder.values().length];
        SynchronousMachine_class_attributes = new BaseClass[SynchronousMachine_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new SynchronousMachine();
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

    private void updateAttributeInArray(SynchronousMachine_class_attributes_enum attrEnum, BaseClass value) {
        try {
            SynchronousMachine_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(SynchronousMachine_primitive_builder attrEnum, BaseClass value) {
        try {
            SynchronousMachine_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            SynchronousMachine_class_attributes_enum attrEnum = SynchronousMachine_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated SynchronousMachine, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            SynchronousMachine_primitive_builder attrEnum = SynchronousMachine_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated SynchronousMachine, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            SynchronousMachine_primitive_builder attrEnum = SynchronousMachine_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = SynchronousMachine_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            SynchronousMachine_class_attributes_enum attrEnum = SynchronousMachine_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = SynchronousMachine_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : SynchronousMachine_primitive_builder.values()) {
            if (enumValue != SynchronousMachine_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "SynchronousMachine." + enumValue.name());
            }
        }
        for (var enumValue : SynchronousMachine_class_attributes_enum.values()) {
            if (enumValue != SynchronousMachine_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "SynchronousMachine." + enumValue.name());
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
            for (SynchronousMachine_primitive_builder attrEnum : SynchronousMachine_primitive_builder.values()) {
                BaseClass bc = SynchronousMachine_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    SynchronousMachine." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (SynchronousMachine_class_attributes_enum attrEnum : SynchronousMachine_class_attributes_enum.values()) {
                BaseClass bc = SynchronousMachine_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    SynchronousMachine." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(SynchronousMachine) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "SynchronousMachine";

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
            map.put("InitialReactiveCapabilityCurve", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("SynchronousMachineDynamics", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("earthing", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("earthingStarPointR", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("earthingStarPointX", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("ikk", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxQ", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minQ", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("mu", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("operatingMode", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("qPercent", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("r", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("r0", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("r2", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("referencePriority", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("satDirectSubtransX", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("satDirectSyncX", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("satDirectTransX", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("shortCircuitRotorType", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("type", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("voltageRegulationRange", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("x0", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("x2", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new SynchronousMachine().allAttrDetailsMap());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.DY);
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.SC);
        profiles.add(CGMESProfile.SSH);
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
