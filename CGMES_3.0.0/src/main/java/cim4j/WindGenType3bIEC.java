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
 * IEC type 3B generator set model. Reference: IEC 61400-27-1:2015, 5.6.3.3.
 */
@SuppressWarnings("unused")
public class WindGenType3bIEC extends WindGenType3IEC {

    private static final Logging LOG = Logging.getLogger(WindGenType3bIEC.class);

    /**
     * Constructor.
     */
    public WindGenType3bIEC(String rdfid) {
        super("WindGenType3bIEC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindGenType3bIEC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The wind dynamics lookup table associated with this generator type 3B model.
     *
     * NOT USED
     */
    private Set<WindDynamicsLookupTable> WindDynamicsLookupTable = new HashSet<>(); // OneToMany

    private Set<String> WindDynamicsLookupTableIdSet = new HashSet<>();

    public Set<WindDynamicsLookupTable> getWindDynamicsLookupTable() {
        return WindDynamicsLookupTable;
    }

    public void setWindDynamicsLookupTable(WindDynamicsLookupTable _object_) {
        if (!WindDynamicsLookupTable.contains(_object_)) {
            WindDynamicsLookupTable.add(_object_);
            _object_.setWindGenType3bIEC(this);
            WindDynamicsLookupTableIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getWindDynamicsLookupTable(BaseClass _this_) {
        var objs = ((WindGenType3bIEC) _this_).getWindDynamicsLookupTable();
        var ids = ((WindGenType3bIEC) _this_).WindDynamicsLookupTableIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setWindDynamicsLookupTable(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindGenType3bIEC) _this_).WindDynamicsLookupTableIdSet.add((String) _value_);
        } else if (_value_ instanceof WindDynamicsLookupTable) {
            ((WindGenType3bIEC) _this_).setWindDynamicsLookupTable((WindDynamicsLookupTable) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindDynamicsLookupTable");
        }
    }

    /**
     * Crowbar control mode (<i>M</i><i><sub>WTcwp</sub></i>). It is a case-dependent parameter. true = 1 in the IEC model false = 0 in the IEC model.
     */
    private Boolean mwtcwp; // Boolean

    public Boolean getMwtcwp() {
        return mwtcwp;
    }

    public void setMwtcwp(Boolean _value_) {
        mwtcwp = _value_;
    }

    private static Object getMwtcwp(BaseClass _this_) {
        return ((WindGenType3bIEC) _this_).getMwtcwp();
    }

    private static void setMwtcwp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((WindGenType3bIEC) _this_).setMwtcwp((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((WindGenType3bIEC) _this_).setMwtcwp(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Current generation time constant (<i>T</i><i><sub>g</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     */
    private Double tg; // Seconds

    public Double getTg() {
        return tg;
    }

    public void setTg(Double _value_) {
        tg = _value_;
    }

    private static Object getTg(BaseClass _this_) {
        return ((WindGenType3bIEC) _this_).getTg();
    }

    private static void setTg(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindGenType3bIEC) _this_).setTg((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindGenType3bIEC) _this_).setTg(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant for crowbar washout filter (<i>T</i><i><sub>wo</sub></i>) (&gt;= 0). It is a case-dependent parameter.
     */
    private Double two; // Seconds

    public Double getTwo() {
        return two;
    }

    public void setTwo(Double _value_) {
        two = _value_;
    }

    private static Object getTwo(BaseClass _this_) {
        return ((WindGenType3bIEC) _this_).getTwo();
    }

    private static void setTwo(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindGenType3bIEC) _this_).setTwo((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindGenType3bIEC) _this_).setTwo(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindGenType3bIEC", attrName));
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
                "WindGenType3bIEC", attrName, value));
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
            map.put("WindDynamicsLookupTable", new AttrDetails("WindGenType3bIEC.WindDynamicsLookupTable", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindGenType3bIEC::getWindDynamicsLookupTable, WindGenType3bIEC::setWindDynamicsLookupTable));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwtcwp", new AttrDetails("WindGenType3bIEC.mwtcwp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindGenType3bIEC::getMwtcwp, WindGenType3bIEC::setMwtcwp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tg", new AttrDetails("WindGenType3bIEC.tg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindGenType3bIEC::getTg, WindGenType3bIEC::setTg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("two", new AttrDetails("WindGenType3bIEC.two", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindGenType3bIEC::getTwo, WindGenType3bIEC::setTwo));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindGenType3bIEC(null).allAttrDetailsMap());
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
