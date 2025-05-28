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
 * Abstract parent class for all synchronous and asynchronous machine standard models.
 */
@SuppressWarnings("unused")
public class RotatingMachineDynamics extends DynamicsFunctionBlock {

    private static final Logging LOG = Logging.getLogger(RotatingMachineDynamics.class);

    /**
     * Constructor.
     */
    public RotatingMachineDynamics(String rdfid) {
        super("RotatingMachineDynamics", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected RotatingMachineDynamics(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Damping torque coefficient (<i>D</i>) (&gt;= 0).  A proportionality constant that, when multiplied by the angular velocity of the rotor poles with respect to the magnetic field (frequency), results in the damping torque.  This value is often zero when the sources of damping torques (generator damper windings, load damping effects, etc.) are modelled in detail.  Typical value = 0.
     */
    private Float damping; // Float

    public Float getDamping() {
        return damping;
    }

    public void setDamping(Float _value_) {
        damping = _value_;
    }

    private static Object getDamping(BaseClass _this_) {
        return ((RotatingMachineDynamics) _this_).getDamping();
    }

    private static void setDamping(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((RotatingMachineDynamics) _this_).setDamping((Float) _value_);
        } else if (_value_ instanceof String) {
            ((RotatingMachineDynamics) _this_).setDamping(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Inertia constant of generator or motor and mechanical load (<i>H</i>) (&gt; 0).  This is the specification for the stored energy in the rotating mass when operating at rated speed.  For a generator, this includes the generator plus all other elements (turbine, exciter) on the same shaft and has units of MW x s.  For a motor, it includes the motor plus its mechanical load. Conventional units are PU on the generator MVA base, usually expressed as MW x s / MVA or just s. This value is used in the accelerating power reference frame for operator training simulator solutions.  Typical value = 3.
     */
    private Double inertia; // Seconds

    public Double getInertia() {
        return inertia;
    }

    public void setInertia(Double _value_) {
        inertia = _value_;
    }

    private static Object getInertia(BaseClass _this_) {
        return ((RotatingMachineDynamics) _this_).getInertia();
    }

    private static void setInertia(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((RotatingMachineDynamics) _this_).setInertia((Double) _value_);
        } else if (_value_ instanceof String) {
            ((RotatingMachineDynamics) _this_).setInertia(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Saturation factor at rated terminal voltage (<i>S1</i>) (&gt;= 0).  Not used by simplified model.  Defined by defined by <i>S</i>(<i>E1</i>) in the SynchronousMachineSaturationParameters diagram.  Typical value = 0,02.
     */
    private Float saturationFactor; // Float

    public Float getSaturationFactor() {
        return saturationFactor;
    }

    public void setSaturationFactor(Float _value_) {
        saturationFactor = _value_;
    }

    private static Object getSaturationFactor(BaseClass _this_) {
        return ((RotatingMachineDynamics) _this_).getSaturationFactor();
    }

    private static void setSaturationFactor(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((RotatingMachineDynamics) _this_).setSaturationFactor((Float) _value_);
        } else if (_value_ instanceof String) {
            ((RotatingMachineDynamics) _this_).setSaturationFactor(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Saturation factor at 120% of rated terminal voltage (<i>S12</i>) (&gt;= RotatingMachineDynamics.saturationFactor). Not used by the simplified model, defined by <i>S</i>(<i>E2</i>) in the SynchronousMachineSaturationParameters diagram.  Typical value = 0,12.
     */
    private Float saturationFactor120; // Float

    public Float getSaturationFactor120() {
        return saturationFactor120;
    }

    public void setSaturationFactor120(Float _value_) {
        saturationFactor120 = _value_;
    }

    private static Object getSaturationFactor120(BaseClass _this_) {
        return ((RotatingMachineDynamics) _this_).getSaturationFactor120();
    }

    private static void setSaturationFactor120(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((RotatingMachineDynamics) _this_).setSaturationFactor120((Float) _value_);
        } else if (_value_ instanceof String) {
            ((RotatingMachineDynamics) _this_).setSaturationFactor120(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Stator leakage reactance (<i>Xl</i>) (&gt;= 0). Typical value = 0,15.
     */
    private Double statorLeakageReactance; // PU

    public Double getStatorLeakageReactance() {
        return statorLeakageReactance;
    }

    public void setStatorLeakageReactance(Double _value_) {
        statorLeakageReactance = _value_;
    }

    private static Object getStatorLeakageReactance(BaseClass _this_) {
        return ((RotatingMachineDynamics) _this_).getStatorLeakageReactance();
    }

    private static void setStatorLeakageReactance(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((RotatingMachineDynamics) _this_).setStatorLeakageReactance((Double) _value_);
        } else if (_value_ instanceof String) {
            ((RotatingMachineDynamics) _this_).setStatorLeakageReactance(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Stator (armature) resistance (<i>Rs</i>) (&gt;= 0). Typical value = 0,005.
     */
    private Double statorResistance; // PU

    public Double getStatorResistance() {
        return statorResistance;
    }

    public void setStatorResistance(Double _value_) {
        statorResistance = _value_;
    }

    private static Object getStatorResistance(BaseClass _this_) {
        return ((RotatingMachineDynamics) _this_).getStatorResistance();
    }

    private static void setStatorResistance(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((RotatingMachineDynamics) _this_).setStatorResistance((Double) _value_);
        } else if (_value_ instanceof String) {
            ((RotatingMachineDynamics) _this_).setStatorResistance(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "RotatingMachineDynamics", attrName));
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
                "RotatingMachineDynamics", attrName, value));
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
            profiles.add(CGMESProfile.DY);
            map.put("damping", new AttrDetails("RotatingMachineDynamics.damping", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, RotatingMachineDynamics::getDamping, RotatingMachineDynamics::setDamping));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("inertia", new AttrDetails("RotatingMachineDynamics.inertia", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, RotatingMachineDynamics::getInertia, RotatingMachineDynamics::setInertia));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("saturationFactor", new AttrDetails("RotatingMachineDynamics.saturationFactor", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, RotatingMachineDynamics::getSaturationFactor, RotatingMachineDynamics::setSaturationFactor));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("saturationFactor120", new AttrDetails("RotatingMachineDynamics.saturationFactor120", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, RotatingMachineDynamics::getSaturationFactor120, RotatingMachineDynamics::setSaturationFactor120));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("statorLeakageReactance", new AttrDetails("RotatingMachineDynamics.statorLeakageReactance", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, RotatingMachineDynamics::getStatorLeakageReactance, RotatingMachineDynamics::setStatorLeakageReactance));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("statorResistance", new AttrDetails("RotatingMachineDynamics.statorResistance", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, RotatingMachineDynamics::getStatorResistance, RotatingMachineDynamics::setStatorResistance));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new RotatingMachineDynamics(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
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
