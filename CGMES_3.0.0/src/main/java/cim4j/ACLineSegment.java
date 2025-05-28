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
     * Constructor.
     */
    public ACLineSegment(String rdfid) {
        super("ACLineSegment", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ACLineSegment(String cimType, String rdfid) {
        super(cimType, rdfid);
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

    public void setClamp(Clamp _object_) {
        if (!Clamp.contains(_object_)) {
            Clamp.add(_object_);
            _object_.setACLineSegment(this);
        }
    }

    private static Object getClamp(BaseClass _this_) {
        return ((ACLineSegment) _this_).getClamp();
    }

    private static void setClamp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Clamp) {
            ((ACLineSegment) _this_).setClamp((Clamp) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Clamp");
        }
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

    public void setCut(Cut _object_) {
        if (!Cut.contains(_object_)) {
            Cut.add(_object_);
            _object_.setACLineSegment(this);
        }
    }

    private static Object getCut(BaseClass _this_) {
        return ((ACLineSegment) _this_).getCut();
    }

    private static void setCut(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Cut) {
            ((ACLineSegment) _this_).setCut((Cut) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Cut");
        }
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

    private static Object getB0ch(BaseClass _this_) {
        return ((ACLineSegment) _this_).getB0ch();
    }

    private static void setB0ch(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACLineSegment) _this_).setB0ch((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACLineSegment) _this_).setB0ch(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getBch(BaseClass _this_) {
        return ((ACLineSegment) _this_).getBch();
    }

    private static void setBch(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACLineSegment) _this_).setBch((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACLineSegment) _this_).setBch(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getG0ch(BaseClass _this_) {
        return ((ACLineSegment) _this_).getG0ch();
    }

    private static void setG0ch(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACLineSegment) _this_).setG0ch((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACLineSegment) _this_).setG0ch(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getGch(BaseClass _this_) {
        return ((ACLineSegment) _this_).getGch();
    }

    private static void setGch(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACLineSegment) _this_).setGch((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACLineSegment) _this_).setGch(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getR(BaseClass _this_) {
        return ((ACLineSegment) _this_).getR();
    }

    private static void setR(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACLineSegment) _this_).setR((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACLineSegment) _this_).setR(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getR0(BaseClass _this_) {
        return ((ACLineSegment) _this_).getR0();
    }

    private static void setR0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACLineSegment) _this_).setR0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACLineSegment) _this_).setR0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getShortCircuitEndTemperature(BaseClass _this_) {
        return ((ACLineSegment) _this_).getShortCircuitEndTemperature();
    }

    private static void setShortCircuitEndTemperature(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACLineSegment) _this_).setShortCircuitEndTemperature((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACLineSegment) _this_).setShortCircuitEndTemperature(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getX(BaseClass _this_) {
        return ((ACLineSegment) _this_).getX();
    }

    private static void setX(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACLineSegment) _this_).setX((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACLineSegment) _this_).setX(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getX0(BaseClass _this_) {
        return ((ACLineSegment) _this_).getX0();
    }

    private static void setX0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACLineSegment) _this_).setX0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACLineSegment) _this_).setX0(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ACLineSegment", attrName));
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
                "ACLineSegment", attrName, value));
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
            map.put("Clamp", new AttrDetails("ACLineSegment.Clamp", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, ACLineSegment::getClamp, ACLineSegment::setClamp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("Cut", new AttrDetails("ACLineSegment.Cut", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, ACLineSegment::getCut, ACLineSegment::setCut));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("b0ch", new AttrDetails("ACLineSegment.b0ch", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACLineSegment::getB0ch, ACLineSegment::setB0ch));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("bch", new AttrDetails("ACLineSegment.bch", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACLineSegment::getBch, ACLineSegment::setBch));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("g0ch", new AttrDetails("ACLineSegment.g0ch", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACLineSegment::getG0ch, ACLineSegment::setG0ch));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("gch", new AttrDetails("ACLineSegment.gch", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACLineSegment::getGch, ACLineSegment::setGch));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r", new AttrDetails("ACLineSegment.r", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACLineSegment::getR, ACLineSegment::setR));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("r0", new AttrDetails("ACLineSegment.r0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACLineSegment::getR0, ACLineSegment::setR0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("shortCircuitEndTemperature", new AttrDetails("ACLineSegment.shortCircuitEndTemperature", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACLineSegment::getShortCircuitEndTemperature, ACLineSegment::setShortCircuitEndTemperature));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x", new AttrDetails("ACLineSegment.x", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACLineSegment::getX, ACLineSegment::setX));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("x0", new AttrDetails("ACLineSegment.x0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACLineSegment::getX0, ACLineSegment::setX0));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ACLineSegment(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
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
