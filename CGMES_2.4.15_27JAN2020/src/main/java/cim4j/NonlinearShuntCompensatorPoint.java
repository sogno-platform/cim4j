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
 * A non linear shunt compensator bank or section admittance value.
 */
@SuppressWarnings("unused")
public class NonlinearShuntCompensatorPoint extends BaseClass {

    private static final Logging LOG = Logging.getLogger(NonlinearShuntCompensatorPoint.class);

    /**
     * Constructor.
     */
    public NonlinearShuntCompensatorPoint(String rdfid) {
        super("NonlinearShuntCompensatorPoint", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected NonlinearShuntCompensatorPoint(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Non-linear shunt compensator owning this point.
     */
    private NonlinearShuntCompensator NonlinearShuntCompensator; // ManyToOne

    private String NonlinearShuntCompensatorId;

    public NonlinearShuntCompensator getNonlinearShuntCompensator() {
        return NonlinearShuntCompensator;
    }

    public void setNonlinearShuntCompensator(NonlinearShuntCompensator _object_) {
        if (NonlinearShuntCompensator != _object_) {
            NonlinearShuntCompensator = _object_;
            _object_.setNonlinearShuntCompensatorPoints(this);
            NonlinearShuntCompensatorId = _object_.getRdfid();
        }
    }

    private static Object getNonlinearShuntCompensator(BaseClass _this_) {
        var obj = ((NonlinearShuntCompensatorPoint) _this_).getNonlinearShuntCompensator();
        var id = ((NonlinearShuntCompensatorPoint) _this_).NonlinearShuntCompensatorId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setNonlinearShuntCompensator(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((NonlinearShuntCompensatorPoint) _this_).NonlinearShuntCompensatorId = (String) _value_;
        } else if (_value_ instanceof NonlinearShuntCompensator) {
            ((NonlinearShuntCompensatorPoint) _this_).setNonlinearShuntCompensator((NonlinearShuntCompensator) _value_);
        } else {
            throw new IllegalArgumentException("Object is not NonlinearShuntCompensator");
        }
    }

    /**
     * Positive sequence shunt (charging) susceptance per section
     */
    private Double b; // Susceptance

    public Double getB() {
        return b;
    }

    public void setB(Double _value_) {
        b = _value_;
    }

    private static Object getB(BaseClass _this_) {
        return ((NonlinearShuntCompensatorPoint) _this_).getB();
    }

    private static void setB(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((NonlinearShuntCompensatorPoint) _this_).setB((Double) _value_);
        } else if (_value_ instanceof String) {
            ((NonlinearShuntCompensatorPoint) _this_).setB(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Zero sequence shunt (charging) susceptance per section
     */
    private Double b0; // Susceptance

    public Double getB0() {
        return b0;
    }

    public void setB0(Double _value_) {
        b0 = _value_;
    }

    private static Object getB0(BaseClass _this_) {
        return ((NonlinearShuntCompensatorPoint) _this_).getB0();
    }

    private static void setB0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((NonlinearShuntCompensatorPoint) _this_).setB0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((NonlinearShuntCompensatorPoint) _this_).setB0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Positive sequence shunt (charging) conductance per section
     */
    private Double g; // Conductance

    public Double getG() {
        return g;
    }

    public void setG(Double _value_) {
        g = _value_;
    }

    private static Object getG(BaseClass _this_) {
        return ((NonlinearShuntCompensatorPoint) _this_).getG();
    }

    private static void setG(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((NonlinearShuntCompensatorPoint) _this_).setG((Double) _value_);
        } else if (_value_ instanceof String) {
            ((NonlinearShuntCompensatorPoint) _this_).setG(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Zero sequence shunt (charging) conductance per section
     */
    private Double g0; // Conductance

    public Double getG0() {
        return g0;
    }

    public void setG0(Double _value_) {
        g0 = _value_;
    }

    private static Object getG0(BaseClass _this_) {
        return ((NonlinearShuntCompensatorPoint) _this_).getG0();
    }

    private static void setG0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((NonlinearShuntCompensatorPoint) _this_).setG0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((NonlinearShuntCompensatorPoint) _this_).setG0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * The number of the section.
     */
    private Integer sectionNumber; // Integer

    public Integer getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(Integer _value_) {
        sectionNumber = _value_;
    }

    private static Object getSectionNumber(BaseClass _this_) {
        return ((NonlinearShuntCompensatorPoint) _this_).getSectionNumber();
    }

    private static void setSectionNumber(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((NonlinearShuntCompensatorPoint) _this_).setSectionNumber((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((NonlinearShuntCompensatorPoint) _this_).setSectionNumber(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "NonlinearShuntCompensatorPoint", attrName));
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
                "NonlinearShuntCompensatorPoint", attrName, value));
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
            profiles.add(CGMESProfile.EQ);
            map.put("NonlinearShuntCompensator", new AttrDetails("NonlinearShuntCompensatorPoint.NonlinearShuntCompensator", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, NonlinearShuntCompensatorPoint::getNonlinearShuntCompensator, NonlinearShuntCompensatorPoint::setNonlinearShuntCompensator));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("b", new AttrDetails("NonlinearShuntCompensatorPoint.b", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, NonlinearShuntCompensatorPoint::getB, NonlinearShuntCompensatorPoint::setB));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("b0", new AttrDetails("NonlinearShuntCompensatorPoint.b0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, NonlinearShuntCompensatorPoint::getB0, NonlinearShuntCompensatorPoint::setB0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("g", new AttrDetails("NonlinearShuntCompensatorPoint.g", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, NonlinearShuntCompensatorPoint::getG, NonlinearShuntCompensatorPoint::setG));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("g0", new AttrDetails("NonlinearShuntCompensatorPoint.g0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, NonlinearShuntCompensatorPoint::getG0, NonlinearShuntCompensatorPoint::setG0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("sectionNumber", new AttrDetails("NonlinearShuntCompensatorPoint.sectionNumber", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, NonlinearShuntCompensatorPoint::getSectionNumber, NonlinearShuntCompensatorPoint::setSectionNumber));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new NonlinearShuntCompensatorPoint(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
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
