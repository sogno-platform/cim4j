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
 * The schedule has time points where the time between them is constant.
 */
@SuppressWarnings("unused")
public class RegularIntervalSchedule extends BasicIntervalSchedule {

    private static final Logging LOG = Logging.getLogger(RegularIntervalSchedule.class);

    /**
     * Constructor.
     */
    public RegularIntervalSchedule(String rdfid) {
        super("RegularIntervalSchedule", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected RegularIntervalSchedule(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The regular interval time point data values that define this schedule.
     *
     * NOT USED
     */
    private Set<RegularTimePoint> TimePoints = new HashSet<>(); // OneToMany

    public Set<RegularTimePoint> getTimePoints() {
        return TimePoints;
    }

    public void setTimePoints(RegularTimePoint _object_) {
        if (!TimePoints.contains(_object_)) {
            TimePoints.add(_object_);
            _object_.setIntervalSchedule(this);
        }
    }

    private static Object getTimePoints(BaseClass _this_) {
        return ((RegularIntervalSchedule) _this_).getTimePoints();
    }

    private static void setTimePoints(BaseClass _this_, Object _value_) {
        if (_value_ instanceof RegularTimePoint) {
            ((RegularIntervalSchedule) _this_).setTimePoints((RegularTimePoint) _value_);
        } else {
            throw new IllegalArgumentException("Object is not RegularTimePoint");
        }
    }

    /**
     * The time for the last time point.
     */
    private String endTime; // DateTime

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String _value_) {
        endTime = _value_;
    }

    private static Object getEndTime(BaseClass _this_) {
        return ((RegularIntervalSchedule) _this_).getEndTime();
    }

    private static void setEndTime(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((RegularIntervalSchedule) _this_).setEndTime((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * The time between each pair of subsequent regular time points in sequence order.
     */
    private Double timeStep; // Seconds

    public Double getTimeStep() {
        return timeStep;
    }

    public void setTimeStep(Double _value_) {
        timeStep = _value_;
    }

    private static Object getTimeStep(BaseClass _this_) {
        return ((RegularIntervalSchedule) _this_).getTimeStep();
    }

    private static void setTimeStep(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((RegularIntervalSchedule) _this_).setTimeStep((Double) _value_);
        } else if (_value_ instanceof String) {
            ((RegularIntervalSchedule) _this_).setTimeStep(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "RegularIntervalSchedule", attrName));
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
                "RegularIntervalSchedule", attrName, value));
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
            map.put("TimePoints", new AttrDetails("RegularIntervalSchedule.TimePoints", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, RegularIntervalSchedule::getTimePoints, RegularIntervalSchedule::setTimePoints));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("endTime", new AttrDetails("RegularIntervalSchedule.endTime", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, RegularIntervalSchedule::getEndTime, RegularIntervalSchedule::setEndTime));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("timeStep", new AttrDetails("RegularIntervalSchedule.timeStep", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, RegularIntervalSchedule::getTimeStep, RegularIntervalSchedule::setTimeStep));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new RegularIntervalSchedule(null).allAttrDetailsMap());
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
