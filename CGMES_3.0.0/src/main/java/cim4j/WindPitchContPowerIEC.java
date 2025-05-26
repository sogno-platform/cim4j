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
 * Pitch control power model. Reference: IEC 61400-27-1:2015, 5.6.5.1.
 */
@SuppressWarnings("unused")
public class WindPitchContPowerIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindPitchContPowerIEC.class);

    /**
     * Constructor.
     */
    public WindPitchContPowerIEC(String rdfid) {
        super("WindPitchContPowerIEC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindPitchContPowerIEC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The wind dynamics lookup table associated with this pitch control power model.
     *
     * NOT USED
     */
    private Set<WindDynamicsLookupTable> WindDynamicsLookupTable = new HashSet<>(); // OneToMany

    public Set<WindDynamicsLookupTable> getWindDynamicsLookupTable() {
        return WindDynamicsLookupTable;
    }

    public void setWindDynamicsLookupTable(WindDynamicsLookupTable _object_) {
        if (!WindDynamicsLookupTable.contains(_object_)) {
            WindDynamicsLookupTable.add(_object_);
            _object_.setWindPitchContPowerIEC(this);
        }
    }

    private static Object getWindDynamicsLookupTable(BaseClass _this_) {
        return ((WindPitchContPowerIEC) _this_).getWindDynamicsLookupTable();
    }

    private static void setWindDynamicsLookupTable(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindDynamicsLookupTable) {
            ((WindPitchContPowerIEC) _this_).setWindDynamicsLookupTable((WindDynamicsLookupTable) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindDynamicsLookupTable");
        }
    }

    /**
     * Wind turbine type 1B model with which this pitch control power model is associated.
     *
     * NOT USED
     */
    private WindGenTurbineType1bIEC WindGenTurbineType1bIEC; // OneToOne

    public WindGenTurbineType1bIEC getWindGenTurbineType1bIEC() {
        return WindGenTurbineType1bIEC;
    }

    public void setWindGenTurbineType1bIEC(WindGenTurbineType1bIEC _object_) {
        if (WindGenTurbineType1bIEC != _object_) {
            WindGenTurbineType1bIEC = _object_;
            WindGenTurbineType1bIEC.setWindPitchContPowerIEC(this);
        }
    }

    private static Object getWindGenTurbineType1bIEC(BaseClass _this_) {
        return ((WindPitchContPowerIEC) _this_).getWindGenTurbineType1bIEC();
    }

    private static void setWindGenTurbineType1bIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindGenTurbineType1bIEC) {
            ((WindPitchContPowerIEC) _this_).setWindGenTurbineType1bIEC((WindGenTurbineType1bIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindGenTurbineType1bIEC");
        }
    }

    /**
     * Wind turbine type 2 model with which this pitch control power model is associated.
     *
     * NOT USED
     */
    private WindGenTurbineType2IEC WindGenTurbineType2IEC; // OneToOne

    public WindGenTurbineType2IEC getWindGenTurbineType2IEC() {
        return WindGenTurbineType2IEC;
    }

    public void setWindGenTurbineType2IEC(WindGenTurbineType2IEC _object_) {
        if (WindGenTurbineType2IEC != _object_) {
            WindGenTurbineType2IEC = _object_;
            WindGenTurbineType2IEC.setWindPitchContPowerIEC(this);
        }
    }

    private static Object getWindGenTurbineType2IEC(BaseClass _this_) {
        return ((WindPitchContPowerIEC) _this_).getWindGenTurbineType2IEC();
    }

    private static void setWindGenTurbineType2IEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindGenTurbineType2IEC) {
            ((WindPitchContPowerIEC) _this_).setWindGenTurbineType2IEC((WindGenTurbineType2IEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindGenTurbineType2IEC");
        }
    }

    /**
     * Rate limit for increasing power (<i>dp</i><i><sub>max</sub></i>) (&gt; WindPitchContPowerIEC.dpmin). It is a type-dependent parameter.
     */
    private Double dpmax; // PU

    public Double getDpmax() {
        return dpmax;
    }

    public void setDpmax(Double _value_) {
        dpmax = _value_;
    }

    private static Object getDpmax(BaseClass _this_) {
        return ((WindPitchContPowerIEC) _this_).getDpmax();
    }

    private static void setDpmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPitchContPowerIEC) _this_).setDpmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPitchContPowerIEC) _this_).setDpmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rate limit for decreasing power (<i>dp</i><i><sub>min</sub></i>) (&lt; WindPitchContPowerIEC.dpmax). It is a type-dependent parameter.
     */
    private Double dpmin; // PU

    public Double getDpmin() {
        return dpmin;
    }

    public void setDpmin(Double _value_) {
        dpmin = _value_;
    }

    private static Object getDpmin(BaseClass _this_) {
        return ((WindPitchContPowerIEC) _this_).getDpmin();
    }

    private static void setDpmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPitchContPowerIEC) _this_).setDpmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPitchContPowerIEC) _this_).setDpmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum power setting (<i>p</i><i><sub>min</sub></i>). It is a type-dependent parameter.
     */
    private Double pmin; // PU

    public Double getPmin() {
        return pmin;
    }

    public void setPmin(Double _value_) {
        pmin = _value_;
    }

    private static Object getPmin(BaseClass _this_) {
        return ((WindPitchContPowerIEC) _this_).getPmin();
    }

    private static void setPmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPitchContPowerIEC) _this_).setPmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPitchContPowerIEC) _this_).setPmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * If <i>p</i><i><sub>init</sub></i><sub> </sub>&lt; <i>p</i><i><sub>set</sub></i><sub> </sub>then power will be ramped down to <i>p</i><i><sub>min</sub></i>. It is (<i>p</i><i><sub>set</sub></i>) in the IEC 61400-27-1:2015. It is a type-dependent parameter.
     */
    private Double pset; // PU

    public Double getPset() {
        return pset;
    }

    public void setPset(Double _value_) {
        pset = _value_;
    }

    private static Object getPset(BaseClass _this_) {
        return ((WindPitchContPowerIEC) _this_).getPset();
    }

    private static void setPset(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPitchContPowerIEC) _this_).setPset((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPitchContPowerIEC) _this_).setPset(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lag time constant (<i>T</i><i><sub>1</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((WindPitchContPowerIEC) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPitchContPowerIEC) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPitchContPowerIEC) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage measurement time constant (<i>T</i><i><sub>r</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     */
    private Double tr; // Seconds

    public Double getTr() {
        return tr;
    }

    public void setTr(Double _value_) {
        tr = _value_;
    }

    private static Object getTr(BaseClass _this_) {
        return ((WindPitchContPowerIEC) _this_).getTr();
    }

    private static void setTr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPitchContPowerIEC) _this_).setTr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPitchContPowerIEC) _this_).setTr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Dip detection threshold (<i>u</i><i><sub>UVRT</sub></i>). It is a type-dependent parameter.
     */
    private Double uuvrt; // PU

    public Double getUuvrt() {
        return uuvrt;
    }

    public void setUuvrt(Double _value_) {
        uuvrt = _value_;
    }

    private static Object getUuvrt(BaseClass _this_) {
        return ((WindPitchContPowerIEC) _this_).getUuvrt();
    }

    private static void setUuvrt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPitchContPowerIEC) _this_).setUuvrt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPitchContPowerIEC) _this_).setUuvrt(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindPitchContPowerIEC", attrName));
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
                "WindPitchContPowerIEC", attrName, value));
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
            map.put("WindDynamicsLookupTable", new AttrDetails("WindPitchContPowerIEC.WindDynamicsLookupTable", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindPitchContPowerIEC::getWindDynamicsLookupTable, WindPitchContPowerIEC::setWindDynamicsLookupTable));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindGenTurbineType1bIEC", new AttrDetails("WindPitchContPowerIEC.WindGenTurbineType1bIEC", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindPitchContPowerIEC::getWindGenTurbineType1bIEC, WindPitchContPowerIEC::setWindGenTurbineType1bIEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindGenTurbineType2IEC", new AttrDetails("WindPitchContPowerIEC.WindGenTurbineType2IEC", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindPitchContPowerIEC::getWindGenTurbineType2IEC, WindPitchContPowerIEC::setWindGenTurbineType2IEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dpmax", new AttrDetails("WindPitchContPowerIEC.dpmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPitchContPowerIEC::getDpmax, WindPitchContPowerIEC::setDpmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dpmin", new AttrDetails("WindPitchContPowerIEC.dpmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPitchContPowerIEC::getDpmin, WindPitchContPowerIEC::setDpmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmin", new AttrDetails("WindPitchContPowerIEC.pmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPitchContPowerIEC::getPmin, WindPitchContPowerIEC::setPmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pset", new AttrDetails("WindPitchContPowerIEC.pset", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPitchContPowerIEC::getPset, WindPitchContPowerIEC::setPset));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("WindPitchContPowerIEC.t1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPitchContPowerIEC::getT1, WindPitchContPowerIEC::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tr", new AttrDetails("WindPitchContPowerIEC.tr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPitchContPowerIEC::getTr, WindPitchContPowerIEC::setTr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uuvrt", new AttrDetails("WindPitchContPowerIEC.uuvrt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPitchContPowerIEC::getUuvrt, WindPitchContPowerIEC::setUuvrt));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindPitchContPowerIEC(null).allAttrDetailsMap());
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
