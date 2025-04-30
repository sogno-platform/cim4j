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
     * Default constructor.
     */
    public RotatingMachineDynamics() {
        setCimType("RotatingMachineDynamics");
    }

    /**
     * Damping torque coefficient (&lt;i&gt;D&lt;/i&gt;) (&amp;gt;= 0).  A proportionality constant that, when multiplied by the angular velocity of the rotor poles with respect to the magnetic field (frequency), results in the damping torque.  This value is often zero when the sources of damping torques (generator damper windings, load damping effects, etc.) are modelled in detail.  Typical value = 0.
     */
    private Float damping; // Float

    public Float getDamping() {
        return damping;
    }

    public void setDamping(Float _value_) {
        damping = _value_;
    }

    public void setDamping(String _value_) {
        damping = getFloatFromString(_value_);
    }

    public String dampingToString() {
        return damping != null ? damping.toString() : null;
    }

    /**
     * Inertia constant of generator or motor and mechanical load (&lt;i&gt;H&lt;/i&gt;) (&amp;gt; 0).  This is the specification for the stored energy in the rotating mass when operating at rated speed.  For a generator, this includes the generator plus all other elements (turbine, exciter) on the same shaft and has units of MW x s.  For a motor, it includes the motor plus its mechanical load. Conventional units are PU on the generator MVA base, usually expressed as MW x s / MVA or just s. This value is used in the accelerating power reference frame for operator training simulator solutions.  Typical value = 3.
     */
    private Double inertia; // Seconds

    public Double getInertia() {
        return inertia;
    }

    public void setInertia(Double _value_) {
        inertia = _value_;
    }

    public void setInertia(String _value_) {
        inertia = getDoubleFromString(_value_);
    }

    public String inertiaToString() {
        return inertia != null ? inertia.toString() : null;
    }

    /**
     * Saturation factor at rated terminal voltage (&lt;i&gt;S1&lt;/i&gt;) (&amp;gt;= 0).  Not used by simplified model.  Defined by defined by &lt;i&gt;S&lt;/i&gt;(&lt;i&gt;E1&lt;/i&gt;) in the SynchronousMachineSaturationParameters diagram.  Typical value = 0,02.
     */
    private Float saturationFactor; // Float

    public Float getSaturationFactor() {
        return saturationFactor;
    }

    public void setSaturationFactor(Float _value_) {
        saturationFactor = _value_;
    }

    public void setSaturationFactor(String _value_) {
        saturationFactor = getFloatFromString(_value_);
    }

    public String saturationFactorToString() {
        return saturationFactor != null ? saturationFactor.toString() : null;
    }

    /**
     * Saturation factor at 120% of rated terminal voltage (&lt;i&gt;S12&lt;/i&gt;) (&amp;gt;= RotatingMachineDynamics.saturationFactor). Not used by the simplified model, defined by &lt;i&gt;S&lt;/i&gt;(&lt;i&gt;E2&lt;/i&gt;) in the SynchronousMachineSaturationParameters diagram.  Typical value = 0,12.
     */
    private Float saturationFactor120; // Float

    public Float getSaturationFactor120() {
        return saturationFactor120;
    }

    public void setSaturationFactor120(Float _value_) {
        saturationFactor120 = _value_;
    }

    public void setSaturationFactor120(String _value_) {
        saturationFactor120 = getFloatFromString(_value_);
    }

    public String saturationFactor120ToString() {
        return saturationFactor120 != null ? saturationFactor120.toString() : null;
    }

    /**
     * Stator leakage reactance (&lt;i&gt;Xl&lt;/i&gt;) (&amp;gt;= 0). Typical value = 0,15.
     */
    private Double statorLeakageReactance; // PU

    public Double getStatorLeakageReactance() {
        return statorLeakageReactance;
    }

    public void setStatorLeakageReactance(Double _value_) {
        statorLeakageReactance = _value_;
    }

    public void setStatorLeakageReactance(String _value_) {
        statorLeakageReactance = getDoubleFromString(_value_);
    }

    public String statorLeakageReactanceToString() {
        return statorLeakageReactance != null ? statorLeakageReactance.toString() : null;
    }

    /**
     * Stator (armature) resistance (&lt;i&gt;Rs&lt;/i&gt;) (&amp;gt;= 0). Typical value = 0,005.
     */
    private Double statorResistance; // PU

    public Double getStatorResistance() {
        return statorResistance;
    }

    public void setStatorResistance(Double _value_) {
        statorResistance = _value_;
    }

    public void setStatorResistance(String _value_) {
        statorResistance = getDoubleFromString(_value_);
    }

    public String statorResistanceToString() {
        return statorResistance != null ? statorResistance.toString() : null;
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
     * Get an attribute value as string.
     *
     * @param attrName The attribute name
     * @return         The attribute value
     */
    @Override
    public String getAttribute(String attrName) {
        return getAttribute("RotatingMachineDynamics", attrName);
    }

    @Override
    protected String getAttribute(String className, String attrName) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var getterFunction = classGetterSetterMap.get(attrName).getter;
            return getterFunction.get();
        }
        return super.getAttribute(className, attrName);
    }

    /**
     * Set an attribute value as object (for class and list attributes).
     *
     * @param attrName    The attribute name
     * @param objectValue The attribute value as object
     */
    @Override
    public void setAttribute(String attrName, BaseClass objectValue) {
        setAttribute("RotatingMachineDynamics", attrName, objectValue);
    }

    @Override
    protected void setAttribute(String className, String attrName, BaseClass objectValue) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var setterFunction = classGetterSetterMap.get(attrName).objectSetter;
            setterFunction.accept(objectValue);
        } else {
            super.setAttribute(className, attrName, objectValue);
        }
    }

    /**
     * Set an attribute value as string (for primitive (including datatype) and enum attributes).
     *
     * @param attrName    The attribute name
     * @param stringValue The attribute value as string
     */
    @Override
    public void setAttribute(String attrName, String stringValue) {
        setAttribute("RotatingMachineDynamics", attrName, stringValue);
    }

    @Override
    protected void setAttribute(String className, String attrName, String stringValue) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var setterFunction = classGetterSetterMap.get(attrName).stringSetter;
            setterFunction.accept(stringValue);
        } else {
            super.setAttribute(className, attrName, stringValue);
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
            map.put("damping", new AttrDetails("RotatingMachineDynamics.damping", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("inertia", new AttrDetails("RotatingMachineDynamics.inertia", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("saturationFactor", new AttrDetails("RotatingMachineDynamics.saturationFactor", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("saturationFactor120", new AttrDetails("RotatingMachineDynamics.saturationFactor120", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("statorLeakageReactance", new AttrDetails("RotatingMachineDynamics.statorLeakageReactance", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("statorResistance", new AttrDetails("RotatingMachineDynamics.statorResistance", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new RotatingMachineDynamics().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("damping", new GetterSetter(this::dampingToString, null, this::setDamping));
        map.put("inertia", new GetterSetter(this::inertiaToString, null, this::setInertia));
        map.put("saturationFactor", new GetterSetter(this::saturationFactorToString, null, this::setSaturationFactor));
        map.put("saturationFactor120", new GetterSetter(this::saturationFactor120ToString, null, this::setSaturationFactor120));
        map.put("statorLeakageReactance", new GetterSetter(this::statorLeakageReactanceToString, null, this::setStatorLeakageReactance));
        map.put("statorResistance", new GetterSetter(this::statorResistanceToString, null, this::setStatorResistance));
        return map;
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
