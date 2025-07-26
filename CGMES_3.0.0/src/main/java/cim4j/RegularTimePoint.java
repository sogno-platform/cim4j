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
 * Time point for a schedule where the time between the consecutive points is constant.
 */
@SuppressWarnings("unused")
public class RegularTimePoint extends BaseClass {

    private static final Logging LOG = Logging.getLogger(RegularTimePoint.class);

    /**
     * Constructor.
     */
    public RegularTimePoint(String rdfid) {
        super("RegularTimePoint", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected RegularTimePoint(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Regular interval schedule containing this time point.
     */
    private RegularIntervalSchedule IntervalSchedule; // ManyToOne

    private String IntervalScheduleId;

    public RegularIntervalSchedule getIntervalSchedule() {
        return IntervalSchedule;
    }

    public void setIntervalSchedule(RegularIntervalSchedule _object_) {
        if (IntervalSchedule != _object_) {
            IntervalSchedule = _object_;
            _object_.setTimePoints(this);
            IntervalScheduleId = _object_.getRdfid();
        }
    }

    private static Object getIntervalSchedule(BaseClass _this_) {
        var obj = ((RegularTimePoint) _this_).getIntervalSchedule();
        var id = ((RegularTimePoint) _this_).IntervalScheduleId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setIntervalSchedule(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((RegularTimePoint) _this_).IntervalScheduleId = (String) _value_;
        } else if (_value_ instanceof RegularIntervalSchedule) {
            ((RegularTimePoint) _this_).setIntervalSchedule((RegularIntervalSchedule) _value_);
        } else {
            throw new IllegalArgumentException("Object is not RegularIntervalSchedule");
        }
    }

    /**
     * The position of the regular time point in the sequence. Note that time points don`t have to be sequential, i.e. time points may be omitted. The actual time for a RegularTimePoint is computed by multiplying the associated regular interval schedule`s time step with the regular time point sequence number and adding the associated schedules start time. To specify values for the start time, use sequence number 0.  The sequence number cannot be negative.
     */
    private Integer sequenceNumber; // Integer

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer _value_) {
        sequenceNumber = _value_;
    }

    private static Object getSequenceNumber(BaseClass _this_) {
        return ((RegularTimePoint) _this_).getSequenceNumber();
    }

    private static void setSequenceNumber(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((RegularTimePoint) _this_).setSequenceNumber((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((RegularTimePoint) _this_).setSequenceNumber(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
        }
    }

    /**
     * The first value at the time. The meaning of the value is defined by the derived type of the associated schedule.
     */
    private Float value1; // Float

    public Float getValue1() {
        return value1;
    }

    public void setValue1(Float _value_) {
        value1 = _value_;
    }

    private static Object getValue1(BaseClass _this_) {
        return ((RegularTimePoint) _this_).getValue1();
    }

    private static void setValue1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((RegularTimePoint) _this_).setValue1((Float) _value_);
        } else if (_value_ instanceof String) {
            ((RegularTimePoint) _this_).setValue1(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * The second value at the time. The meaning of the value is defined by the derived type of the associated schedule.
     */
    private Float value2; // Float

    public Float getValue2() {
        return value2;
    }

    public void setValue2(Float _value_) {
        value2 = _value_;
    }

    private static Object getValue2(BaseClass _this_) {
        return ((RegularTimePoint) _this_).getValue2();
    }

    private static void setValue2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((RegularTimePoint) _this_).setValue2((Float) _value_);
        } else if (_value_ instanceof String) {
            ((RegularTimePoint) _this_).setValue2(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "RegularTimePoint", attrName));
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
                "RegularTimePoint", attrName, value));
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
            map.put("IntervalSchedule", new AttrDetails("RegularTimePoint.IntervalSchedule", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, RegularTimePoint::getIntervalSchedule, RegularTimePoint::setIntervalSchedule));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("sequenceNumber", new AttrDetails("RegularTimePoint.sequenceNumber", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, RegularTimePoint::getSequenceNumber, RegularTimePoint::setSequenceNumber));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("value1", new AttrDetails("RegularTimePoint.value1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, RegularTimePoint::getValue1, RegularTimePoint::setValue1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("value2", new AttrDetails("RegularTimePoint.value2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, RegularTimePoint::getValue2, RegularTimePoint::setValue2));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new RegularTimePoint(null).allAttrDetailsMap());
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
