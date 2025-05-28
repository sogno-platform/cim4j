/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * A rotating machine which may be used as a generator or motor.
 */
@SuppressWarnings("unused")
public class RotatingMachine extends RegulatingCondEq {

    private static final Logging LOG = Logging.getLogger(RotatingMachine.class);

    /**
     * Constructor.
     */
    public RotatingMachine(String rdfid) {
        super("RotatingMachine", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected RotatingMachine(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * A synchronous machine may operate as a generator and as such becomes a member of a generating unit.
     */
    private GeneratingUnit GeneratingUnit; // ManyToOne

    public GeneratingUnit getGeneratingUnit() {
        return GeneratingUnit;
    }

    public void setGeneratingUnit(GeneratingUnit _object_) {
        if (GeneratingUnit != _object_) {
            GeneratingUnit = _object_;
            GeneratingUnit.setRotatingMachine(this);
        }
    }

    private static Object getGeneratingUnit(BaseClass _this_) {
        return ((RotatingMachine) _this_).getGeneratingUnit();
    }

    private static void setGeneratingUnit(BaseClass _this_, Object _value_) {
        if (_value_ instanceof GeneratingUnit) {
            ((RotatingMachine) _this_).setGeneratingUnit((GeneratingUnit) _value_);
        } else {
            throw new IllegalArgumentException("Object is not GeneratingUnit");
        }
    }

    /**
     * The synchronous machine drives the turbine which moves the water from a low elevation to a higher elevation. The direction of machine rotation for pumping may or may not be the same as for generating.
     *
     * NOT USED
     */
    private HydroPump HydroPump; // OneToOne

    public HydroPump getHydroPump() {
        return HydroPump;
    }

    public void setHydroPump(HydroPump _object_) {
        if (HydroPump != _object_) {
            HydroPump = _object_;
            HydroPump.setRotatingMachine(this);
        }
    }

    private static Object getHydroPump(BaseClass _this_) {
        return ((RotatingMachine) _this_).getHydroPump();
    }

    private static void setHydroPump(BaseClass _this_, Object _value_) {
        if (_value_ instanceof HydroPump) {
            ((RotatingMachine) _this_).setHydroPump((HydroPump) _value_);
        } else {
            throw new IllegalArgumentException("Object is not HydroPump");
        }
    }

    /**
     * Active power injection. Load sign convention is used, i.e. positive sign means flow out from a node. Starting value for a steady state solution.
     */
    private Double p; // ActivePower

    public Double getP() {
        return p;
    }

    public void setP(Double _value_) {
        p = _value_;
    }

    private static Object getP(BaseClass _this_) {
        return ((RotatingMachine) _this_).getP();
    }

    private static void setP(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((RotatingMachine) _this_).setP((Double) _value_);
        } else if (_value_ instanceof String) {
            ((RotatingMachine) _this_).setP(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive power injection. Load sign convention is used, i.e. positive sign means flow out from a node. Starting value for a steady state solution.
     */
    private Double q; // ReactivePower

    public Double getQ() {
        return q;
    }

    public void setQ(Double _value_) {
        q = _value_;
    }

    private static Object getQ(BaseClass _this_) {
        return ((RotatingMachine) _this_).getQ();
    }

    private static void setQ(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((RotatingMachine) _this_).setQ((Double) _value_);
        } else if (_value_ instanceof String) {
            ((RotatingMachine) _this_).setQ(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Power factor (nameplate data). It is primarily used for short circuit data exchange according to IEC 60909. The attribute cannot be a negative value.
     */
    private Float ratedPowerFactor; // Float

    public Float getRatedPowerFactor() {
        return ratedPowerFactor;
    }

    public void setRatedPowerFactor(Float _value_) {
        ratedPowerFactor = _value_;
    }

    private static Object getRatedPowerFactor(BaseClass _this_) {
        return ((RotatingMachine) _this_).getRatedPowerFactor();
    }

    private static void setRatedPowerFactor(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((RotatingMachine) _this_).setRatedPowerFactor((Float) _value_);
        } else if (_value_ instanceof String) {
            ((RotatingMachine) _this_).setRatedPowerFactor(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Nameplate apparent power rating for the unit. The attribute shall have a positive value.
     */
    private Double ratedS; // ApparentPower

    public Double getRatedS() {
        return ratedS;
    }

    public void setRatedS(Double _value_) {
        ratedS = _value_;
    }

    private static Object getRatedS(BaseClass _this_) {
        return ((RotatingMachine) _this_).getRatedS();
    }

    private static void setRatedS(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((RotatingMachine) _this_).setRatedS((Double) _value_);
        } else if (_value_ instanceof String) {
            ((RotatingMachine) _this_).setRatedS(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rated voltage (nameplate data, Ur in IEC 60909-0). It is primarily used for short circuit data exchange according to IEC 60909. The attribute shall be a positive value.
     */
    private Double ratedU; // Voltage

    public Double getRatedU() {
        return ratedU;
    }

    public void setRatedU(Double _value_) {
        ratedU = _value_;
    }

    private static Object getRatedU(BaseClass _this_) {
        return ((RotatingMachine) _this_).getRatedU();
    }

    private static void setRatedU(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((RotatingMachine) _this_).setRatedU((Double) _value_);
        } else if (_value_ instanceof String) {
            ((RotatingMachine) _this_).setRatedU(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Get a list of all attribute names of the CIM type.
     *
     * The list includes all inherited attributes. The attribute name is only the
     * last part of the full name (without the class name).
     *
     * @return All attributes of the CIM type
     */
    @Override
    public List<String> getAttributeNames() {
        return ATTR_NAMES_LIST;
    }

    @Override
    protected Map<String, AttrDetails> allAttrDetailsMap() {
        Map<String, AttrDetails> map = new LinkedHashMap<>(CLASS_ATTR_DETAILS_MAP);
        map.putAll(super.allAttrDetailsMap());
        return map;
    }

    /**
     * Get the full name of an attribute.
     *
     * The full name is "<class_name>.<attribute_name>".
     *
     * @param attrName The attribute name
     * @return         The full name
     */
    @Override
    public String getAttributeFullName(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) ? ATTR_DETAILS_MAP.get(attrName).fullName : null;
    }

    /**
     * Get an attribute value.
     *
     * @param attrName The attribute name
     * @return         The attribute value
     */
    @Override
    public Object getAttribute(String attrName) {
        if (ATTR_DETAILS_MAP.containsKey(attrName)) {
            var getterFunction = ATTR_DETAILS_MAP.get(attrName).getter;
            return getterFunction.apply(this);
        }
        LOG.error(String.format("No-one knows an attribute %s.%s", "RotatingMachine", attrName));
        return "";
    }

    /**
     * Set an attribute value.
     *
     * @param attrName The attribute name
     * @param value    The attribute value
     */
    @Override
    public void setAttribute(String attrName, Object value) {
        if (ATTR_DETAILS_MAP.containsKey(attrName)) {
            var setterFunction = ATTR_DETAILS_MAP.get(attrName).setter;
            setterFunction.accept(this, value);
        } else {
            LOG.error(String.format("No-one knows what to do with attribute %s.%s and value %s",
                "RotatingMachine", attrName, value));
        }
    }

    /**
     * Check if the attribute is a primitive attribute.
     *
     * This includes datatype_attributes.
     *
     * @param attrName The attribute name
     * @return         Is it a primitive attribute?
     */
    @Override
    public boolean isPrimitiveAttribute(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) && ATTR_DETAILS_MAP.get(attrName).isPrimitive;
    }

    /**
     * Check if the attribute is an enum attribute.
     *
     * @param attrName The attribute name
     * @return         Is it an enum attribute?
     */
    @Override
    public boolean isEnumAttribute(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) && ATTR_DETAILS_MAP.get(attrName).isEnum;
    }

    /**
     * Check if the attribute is used.
     *
     * Some attributes are declared as unused in the CGMES definition. In most cases
     * these are list attributes, i.e. lists of links to other CIM objects. But
     * there are some exceptions, e.g. the list of ToplogicalNodes in
     * TopologicalIsland.
     *
     * @param attrName The attribute name
     * @return         Is the attribute used?
     */
    @Override
    public boolean isUsedAttribute(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) && ATTR_DETAILS_MAP.get(attrName).isUsed;
    }

    /**
     * Get the namespace URL of an object of this class.
     *
     * @return The namespace URL
     */
    @Override
    public String getClassNamespaceUrl() {
        return CLASS_NAMESPACE;
    }

    /**
     * Get the namespace URL of an attribute (also for inherited attributes).
     *
     * @return The namespace URL
     */
    @Override
    public String getAttributeNamespaceUrl(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) ? ATTR_DETAILS_MAP.get(attrName).nameSpace : null;
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
    public Set<CGMESProfile> getPossibleAttributeProfiles(String attrName) {
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

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/CIM100#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("GeneratingUnit", new AttrDetails("RotatingMachine.GeneratingUnit", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, RotatingMachine::getGeneratingUnit, RotatingMachine::setGeneratingUnit));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("HydroPump", new AttrDetails("RotatingMachine.HydroPump", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, RotatingMachine::getHydroPump, RotatingMachine::setHydroPump));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("p", new AttrDetails("RotatingMachine.p", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, RotatingMachine::getP, RotatingMachine::setP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("q", new AttrDetails("RotatingMachine.q", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, RotatingMachine::getQ, RotatingMachine::setQ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedPowerFactor", new AttrDetails("RotatingMachine.ratedPowerFactor", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, RotatingMachine::getRatedPowerFactor, RotatingMachine::setRatedPowerFactor));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedS", new AttrDetails("RotatingMachine.ratedS", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, RotatingMachine::getRatedS, RotatingMachine::setRatedS));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedU", new AttrDetails("RotatingMachine.ratedU", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, RotatingMachine::getRatedU, RotatingMachine::setRatedU));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new RotatingMachine(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
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
