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
 * The current state for a measurement. A state value is an instance of a measurement from a specific source. Measurements can be associated with many state values, each representing a different source for the measurement.
 */
@SuppressWarnings("unused")
public class MeasurementValue extends IOPoint {

    private static final Logging LOG = Logging.getLogger(MeasurementValue.class);

    /**
     * Constructor.
     */
    public MeasurementValue(String rdfid) {
        super("MeasurementValue", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected MeasurementValue(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * A MeasurementValue has a MeasurementValueQuality associated with it.
     *
     * NOT USED
     */
    private MeasurementValueQuality MeasurementValueQuality; // OneToOne

    private String MeasurementValueQualityId;

    public MeasurementValueQuality getMeasurementValueQuality() {
        return MeasurementValueQuality;
    }

    public void setMeasurementValueQuality(MeasurementValueQuality _object_) {
        if (MeasurementValueQuality != _object_) {
            MeasurementValueQuality = _object_;
            _object_.setMeasurementValue(this);
            MeasurementValueQualityId = _object_.getRdfid();
        }
    }

    private static Object getMeasurementValueQuality(BaseClass _this_) {
        var obj = ((MeasurementValue) _this_).getMeasurementValueQuality();
        var id = ((MeasurementValue) _this_).MeasurementValueQualityId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setMeasurementValueQuality(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((MeasurementValue) _this_).MeasurementValueQualityId = (String) _value_;
        } else if (_value_ instanceof MeasurementValueQuality) {
            ((MeasurementValue) _this_).setMeasurementValueQuality((MeasurementValueQuality) _value_);
        } else {
            throw new IllegalArgumentException("Object is not MeasurementValueQuality");
        }
    }

    /**
     * A reference to the type of source that updates the MeasurementValue, e.g. SCADA, CCLink, manual, etc. User conventions for the names of sources are contained in the introduction to IEC 61970-301.
     */
    private MeasurementValueSource MeasurementValueSource; // ManyToOne

    private String MeasurementValueSourceId;

    public MeasurementValueSource getMeasurementValueSource() {
        return MeasurementValueSource;
    }

    public void setMeasurementValueSource(MeasurementValueSource _object_) {
        if (MeasurementValueSource != _object_) {
            MeasurementValueSource = _object_;
            _object_.setMeasurementValues(this);
            MeasurementValueSourceId = _object_.getRdfid();
        }
    }

    private static Object getMeasurementValueSource(BaseClass _this_) {
        var obj = ((MeasurementValue) _this_).getMeasurementValueSource();
        var id = ((MeasurementValue) _this_).MeasurementValueSourceId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setMeasurementValueSource(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((MeasurementValue) _this_).MeasurementValueSourceId = (String) _value_;
        } else if (_value_ instanceof MeasurementValueSource) {
            ((MeasurementValue) _this_).setMeasurementValueSource((MeasurementValueSource) _value_);
        } else {
            throw new IllegalArgumentException("Object is not MeasurementValueSource");
        }
    }

    /**
     * The limit, expressed as a percentage of the sensor maximum, that errors will not exceed when the sensor is used under  reference conditions.
     */
    private Double sensorAccuracy; // PerCent

    public Double getSensorAccuracy() {
        return sensorAccuracy;
    }

    public void setSensorAccuracy(Double _value_) {
        sensorAccuracy = _value_;
    }

    private static Object getSensorAccuracy(BaseClass _this_) {
        return ((MeasurementValue) _this_).getSensorAccuracy();
    }

    private static void setSensorAccuracy(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((MeasurementValue) _this_).setSensorAccuracy((Double) _value_);
        } else if (_value_ instanceof String) {
            ((MeasurementValue) _this_).setSensorAccuracy(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * The time when the value was last updated.
     */
    private String timeStamp; // DateTime

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String _value_) {
        timeStamp = _value_;
    }

    private static Object getTimeStamp(BaseClass _this_) {
        return ((MeasurementValue) _this_).getTimeStamp();
    }

    private static void setTimeStamp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((MeasurementValue) _this_).setTimeStamp((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "MeasurementValue", attrName));
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
                "MeasurementValue", attrName, value));
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
            profiles.add(CGMESProfile.OP);
            map.put("MeasurementValueQuality", new AttrDetails("MeasurementValue.MeasurementValueQuality", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, MeasurementValue::getMeasurementValueQuality, MeasurementValue::setMeasurementValueQuality));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("MeasurementValueSource", new AttrDetails("MeasurementValue.MeasurementValueSource", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, MeasurementValue::getMeasurementValueSource, MeasurementValue::setMeasurementValueSource));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("sensorAccuracy", new AttrDetails("MeasurementValue.sensorAccuracy", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, MeasurementValue::getSensorAccuracy, MeasurementValue::setSensorAccuracy));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("timeStamp", new AttrDetails("MeasurementValue.timeStamp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, MeasurementValue::getTimeStamp, MeasurementValue::setTimeStamp));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new MeasurementValue(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.OP);
        POSSIBLE_PROFILES = Collections.unmodifiableSet(profiles);
    }

    private static final CGMESProfile RECOMMENDED_PROFILE = CGMESProfile.OP;

    private static final Set<CGMESProfile> POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>(POSSIBLE_PROFILES);
        for (var attrDetails : ATTR_DETAILS_MAP.values()) {
            profiles.addAll(attrDetails.profiles);
        }
        POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES = Collections.unmodifiableSet(profiles);
    }
}
