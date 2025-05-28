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
 * This model can be derived from UnderexcLimIEEE2. The limit characteristic (look -up table) is a single straight-line, the same as UnderexcLimIEEE2 (see Figure 10.4 (p 32), IEEE 421.5-2005 Section 10.2).
 */
@SuppressWarnings("unused")
public class UnderexcLim2Simplified extends UnderexcitationLimiterDynamics {

    private static final Logging LOG = Logging.getLogger(UnderexcLim2Simplified.class);

    /**
     * Constructor.
     */
    public UnderexcLim2Simplified(String rdfid) {
        super("UnderexcLim2Simplified", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected UnderexcLim2Simplified(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Gain Under excitation limiter (Kui).  Typical Value = 0.1.
     */
    private Double kui; // PU

    public Double getKui() {
        return kui;
    }

    public void setKui(Double _value_) {
        kui = _value_;
    }

    private static Object getKui(BaseClass _this_) {
        return ((UnderexcLim2Simplified) _this_).getKui();
    }

    private static void setKui(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLim2Simplified) _this_).setKui((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLim2Simplified) _this_).setKui(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Segment P initial point (P0).  Typical Value = 0.
     */
    private Double p0; // PU

    public Double getP0() {
        return p0;
    }

    public void setP0(Double _value_) {
        p0 = _value_;
    }

    private static Object getP0(BaseClass _this_) {
        return ((UnderexcLim2Simplified) _this_).getP0();
    }

    private static void setP0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLim2Simplified) _this_).setP0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLim2Simplified) _this_).setP0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Segment P end point (P1).  Typical Value = 1.
     */
    private Double p1; // PU

    public Double getP1() {
        return p1;
    }

    public void setP1(Double _value_) {
        p1 = _value_;
    }

    private static Object getP1(BaseClass _this_) {
        return ((UnderexcLim2Simplified) _this_).getP1();
    }

    private static void setP1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLim2Simplified) _this_).setP1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLim2Simplified) _this_).setP1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Segment Q initial point (Q0).  Typical Value = -0.31.
     */
    private Double q0; // PU

    public Double getQ0() {
        return q0;
    }

    public void setQ0(Double _value_) {
        q0 = _value_;
    }

    private static Object getQ0(BaseClass _this_) {
        return ((UnderexcLim2Simplified) _this_).getQ0();
    }

    private static void setQ0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLim2Simplified) _this_).setQ0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLim2Simplified) _this_).setQ0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Segment Q end point (Q1).  Typical Value = -0.1.
     */
    private Double q1; // PU

    public Double getQ1() {
        return q1;
    }

    public void setQ1(Double _value_) {
        q1 = _value_;
    }

    private static Object getQ1(BaseClass _this_) {
        return ((UnderexcLim2Simplified) _this_).getQ1();
    }

    private static void setQ1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLim2Simplified) _this_).setQ1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLim2Simplified) _this_).setQ1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum error signal (V).  Typical Value = 1.
     */
    private Double vuimax; // PU

    public Double getVuimax() {
        return vuimax;
    }

    public void setVuimax(Double _value_) {
        vuimax = _value_;
    }

    private static Object getVuimax(BaseClass _this_) {
        return ((UnderexcLim2Simplified) _this_).getVuimax();
    }

    private static void setVuimax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLim2Simplified) _this_).setVuimax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLim2Simplified) _this_).setVuimax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum error signal (V).  Typical Value = 0.
     */
    private Double vuimin; // PU

    public Double getVuimin() {
        return vuimin;
    }

    public void setVuimin(Double _value_) {
        vuimin = _value_;
    }

    private static Object getVuimin(BaseClass _this_) {
        return ((UnderexcLim2Simplified) _this_).getVuimin();
    }

    private static void setVuimin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLim2Simplified) _this_).setVuimin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLim2Simplified) _this_).setVuimin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "UnderexcLim2Simplified", attrName));
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
                "UnderexcLim2Simplified", attrName, value));
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

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/2013/CIM-schema-cim16#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kui", new AttrDetails("UnderexcLim2Simplified.kui", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLim2Simplified::getKui, UnderexcLim2Simplified::setKui));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p0", new AttrDetails("UnderexcLim2Simplified.p0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLim2Simplified::getP0, UnderexcLim2Simplified::setP0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p1", new AttrDetails("UnderexcLim2Simplified.p1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLim2Simplified::getP1, UnderexcLim2Simplified::setP1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q0", new AttrDetails("UnderexcLim2Simplified.q0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLim2Simplified::getQ0, UnderexcLim2Simplified::setQ0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q1", new AttrDetails("UnderexcLim2Simplified.q1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLim2Simplified::getQ1, UnderexcLim2Simplified::setQ1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vuimax", new AttrDetails("UnderexcLim2Simplified.vuimax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLim2Simplified::getVuimax, UnderexcLim2Simplified::setVuimax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vuimin", new AttrDetails("UnderexcLim2Simplified.vuimin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLim2Simplified::getVuimin, UnderexcLim2Simplified::setVuimin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new UnderexcLim2Simplified(null).allAttrDetailsMap());
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
