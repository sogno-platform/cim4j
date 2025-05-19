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
 * A wire or combination of wires, with consistent electrical characteristics, building a single electrical system, used to carry alternating current between points in the power system. For symmetrical, transposed three phase lines, it is sufficient to use attributes of the line segment, which describe impedances and admittances for the entire length of the segment.  Additionally impedances can be computed by using length and associated per length impedances. The BaseVoltage at the two ends of ACLineSegments in a Line shall have the same BaseVoltage.nominalVoltage. However, boundary lines may have slightly different BaseVoltage.nominalVoltages and variation is allowed. Larger voltage difference in general requires use of an equivalent branch.
 */
@SuppressWarnings("unused")
public class ACLineSegment extends Conductor {

    private static final Logging LOG = Logging.getLogger(ACLineSegment.class);

    /**
     * Default constructor.
     */
    public ACLineSegment() {
        setCimType("ACLineSegment");
    }

    /**
     * The clamps connected to the line segment.
     *
     * NOT USED
     */
    private Set<Clamp> Clamp = new HashSet<>(); // OneToMany

    public Set<Clamp> getClamp() {
        return Clamp;
    }

    public void setClamp(BaseClass _object_) {
        if (!(_object_ instanceof Clamp)) {
            throw new IllegalArgumentException("Object is not Clamp");
        }
        if (!Clamp.contains(_object_)) {
            Clamp.add((Clamp) _object_);
            ((Clamp) _object_).setACLineSegment(this);
        }
    }

    public String ClampToString() {
        return getStringFromSet(Clamp);
    }

    /**
     * Cuts applied to the line segment.
     *
     * NOT USED
     */
    private Set<Cut> Cut = new HashSet<>(); // OneToMany

    public Set<Cut> getCut() {
        return Cut;
    }

    public void setCut(BaseClass _object_) {
        if (!(_object_ instanceof Cut)) {
            throw new IllegalArgumentException("Object is not Cut");
        }
        if (!Cut.contains(_object_)) {
            Cut.add((Cut) _object_);
            ((Cut) _object_).setACLineSegment(this);
        }
    }

    public String CutToString() {
        return getStringFromSet(Cut);
    }

    /**
     * Zero sequence shunt (charging) susceptance, uniformly distributed, of the entire line section.
     */
    private Double b0ch; // Susceptance

    public Double getB0ch() {
        return b0ch;
    }

    public void setB0ch(Double _value_) {
        b0ch = _value_;
    }

    public void setB0ch(String _value_) {
        b0ch = getDoubleFromString(_value_);
    }

    public String b0chToString() {
        return b0ch != null ? b0ch.toString() : null;
    }

    /**
     * Positive sequence shunt (charging) susceptance, uniformly distributed, of the entire line section.  This value represents the full charging over the full length of the line.
     */
    private Double bch; // Susceptance

    public Double getBch() {
        return bch;
    }

    public void setBch(Double _value_) {
        bch = _value_;
    }

    public void setBch(String _value_) {
        bch = getDoubleFromString(_value_);
    }

    public String bchToString() {
        return bch != null ? bch.toString() : null;
    }

    /**
     * Zero sequence shunt (charging) conductance, uniformly distributed, of the entire line section.
     */
    private Double g0ch; // Conductance

    public Double getG0ch() {
        return g0ch;
    }

    public void setG0ch(Double _value_) {
        g0ch = _value_;
    }

    public void setG0ch(String _value_) {
        g0ch = getDoubleFromString(_value_);
    }

    public String g0chToString() {
        return g0ch != null ? g0ch.toString() : null;
    }

    /**
     * Positive sequence shunt (charging) conductance, uniformly distributed, of the entire line section.
     */
    private Double gch; // Conductance

    public Double getGch() {
        return gch;
    }

    public void setGch(Double _value_) {
        gch = _value_;
    }

    public void setGch(String _value_) {
        gch = getDoubleFromString(_value_);
    }

    public String gchToString() {
        return gch != null ? gch.toString() : null;
    }

    /**
     * Positive sequence series resistance of the entire line section.
     */
    private Double r; // Resistance

    public Double getR() {
        return r;
    }

    public void setR(Double _value_) {
        r = _value_;
    }

    public void setR(String _value_) {
        r = getDoubleFromString(_value_);
    }

    public String rToString() {
        return r != null ? r.toString() : null;
    }

    /**
     * Zero sequence series resistance of the entire line section.
     */
    private Double r0; // Resistance

    public Double getR0() {
        return r0;
    }

    public void setR0(Double _value_) {
        r0 = _value_;
    }

    public void setR0(String _value_) {
        r0 = getDoubleFromString(_value_);
    }

    public String r0ToString() {
        return r0 != null ? r0.toString() : null;
    }

    /**
     * Maximum permitted temperature at the end of SC for the calculation of minimum short-circuit currents. Used for short circuit data exchange according to IEC 60909.
     */
    private Double shortCircuitEndTemperature; // Temperature

    public Double getShortCircuitEndTemperature() {
        return shortCircuitEndTemperature;
    }

    public void setShortCircuitEndTemperature(Double _value_) {
        shortCircuitEndTemperature = _value_;
    }

    public void setShortCircuitEndTemperature(String _value_) {
        shortCircuitEndTemperature = getDoubleFromString(_value_);
    }

    public String shortCircuitEndTemperatureToString() {
        return shortCircuitEndTemperature != null ? shortCircuitEndTemperature.toString() : null;
    }

    /**
     * Positive sequence series reactance of the entire line section.
     */
    private Double x; // Reactance

    public Double getX() {
        return x;
    }

    public void setX(Double _value_) {
        x = _value_;
    }

    public void setX(String _value_) {
        x = getDoubleFromString(_value_);
    }

    public String xToString() {
        return x != null ? x.toString() : null;
    }

    /**
     * Zero sequence series reactance of the entire line section.
     */
    private Double x0; // Reactance

    public Double getX0() {
        return x0;
    }

    public void setX0(Double _value_) {
        x0 = _value_;
    }

    public void setX0(String _value_) {
        x0 = getDoubleFromString(_value_);
    }

    public String x0ToString() {
        return x0 != null ? x0.toString() : null;
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
        return getAttribute("ACLineSegment", attrName);
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
        setAttribute("ACLineSegment", attrName, objectValue);
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
        setAttribute("ACLineSegment", attrName, stringValue);
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
            profiles.add(CGMESProfile.EQ);
            map.put("Clamp", new AttrDetails("ACLineSegment.Clamp", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("Cut", new AttrDetails("ACLineSegment.Cut", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("b0ch", new AttrDetails("ACLineSegment.b0ch", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("bch", new AttrDetails("ACLineSegment.bch", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("g0ch", new AttrDetails("ACLineSegment.g0ch", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("gch", new AttrDetails("ACLineSegment.gch", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r", new AttrDetails("ACLineSegment.r", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("r0", new AttrDetails("ACLineSegment.r0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("shortCircuitEndTemperature", new AttrDetails("ACLineSegment.shortCircuitEndTemperature", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x", new AttrDetails("ACLineSegment.x", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("x0", new AttrDetails("ACLineSegment.x0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ACLineSegment().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("Clamp", new GetterSetter(this::ClampToString, this::setClamp, null));
        map.put("Cut", new GetterSetter(this::CutToString, this::setCut, null));
        map.put("b0ch", new GetterSetter(this::b0chToString, null, this::setB0ch));
        map.put("bch", new GetterSetter(this::bchToString, null, this::setBch));
        map.put("g0ch", new GetterSetter(this::g0chToString, null, this::setG0ch));
        map.put("gch", new GetterSetter(this::gchToString, null, this::setGch));
        map.put("r", new GetterSetter(this::rToString, null, this::setR));
        map.put("r0", new GetterSetter(this::r0ToString, null, this::setR0));
        map.put("shortCircuitEndTemperature", new GetterSetter(this::shortCircuitEndTemperatureToString, null, this::setShortCircuitEndTemperature));
        map.put("x", new GetterSetter(this::xToString, null, this::setX));
        map.put("x0", new GetterSetter(this::x0ToString, null, this::setX0));
        return map;
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.SC);
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
