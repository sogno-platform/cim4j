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
 * Accumulator represents an accumulated (counted) Measurement, e.g. an energy value.
 */
@SuppressWarnings("unused")
public class Accumulator extends Measurement {

    private static final Logging LOG = Logging.getLogger(Accumulator.class);

    /**
     * Constructor.
     */
    public Accumulator(String rdfid) {
        super("Accumulator", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected Accumulator(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Measurement to which this value is connected.
     *
     * NOT USED
     */
    private Set<AccumulatorValue> AccumulatorValues = new HashSet<>(); // OneToMany

    private Set<String> AccumulatorValuesIdSet = new HashSet<>();

    public Set<AccumulatorValue> getAccumulatorValues() {
        return AccumulatorValues;
    }

    public void setAccumulatorValues(AccumulatorValue _object_) {
        if (!AccumulatorValues.contains(_object_)) {
            AccumulatorValues.add(_object_);
            _object_.setAccumulator(this);
            AccumulatorValuesIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getAccumulatorValues(BaseClass _this_) {
        var objs = ((Accumulator) _this_).getAccumulatorValues();
        var ids = ((Accumulator) _this_).AccumulatorValuesIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setAccumulatorValues(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Accumulator) _this_).AccumulatorValuesIdSet.add((String) _value_);
        } else if (_value_ instanceof AccumulatorValue) {
            ((Accumulator) _this_).setAccumulatorValues((AccumulatorValue) _value_);
        } else {
            throw new IllegalArgumentException("Object is not AccumulatorValue");
        }
    }

    /**
     * The Measurements using the LimitSet.
     *
     * NOT USED
     */
    private Set<AccumulatorLimitSet> LimitSets = new HashSet<>(); // OneToMany

    private Set<String> LimitSetsIdSet = new HashSet<>();

    public Set<AccumulatorLimitSet> getLimitSets() {
        return LimitSets;
    }

    public void setLimitSets(AccumulatorLimitSet _object_) {
        if (!LimitSets.contains(_object_)) {
            LimitSets.add(_object_);
            _object_.setMeasurements(this);
            LimitSetsIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getLimitSets(BaseClass _this_) {
        var objs = ((Accumulator) _this_).getLimitSets();
        var ids = ((Accumulator) _this_).LimitSetsIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setLimitSets(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Accumulator) _this_).LimitSetsIdSet.add((String) _value_);
        } else if (_value_ instanceof AccumulatorLimitSet) {
            ((Accumulator) _this_).setLimitSets((AccumulatorLimitSet) _value_);
        } else {
            throw new IllegalArgumentException("Object is not AccumulatorLimitSet");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "Accumulator", attrName));
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
                "Accumulator", attrName, value));
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
            map.put("AccumulatorValues", new AttrDetails("Accumulator.AccumulatorValues", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, Accumulator::getAccumulatorValues, Accumulator::setAccumulatorValues));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("LimitSets", new AttrDetails("Accumulator.LimitSets", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, Accumulator::getLimitSets, Accumulator::setLimitSets));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new Accumulator(null).allAttrDetailsMap());
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
