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
     * Default constructor.
     */
    public WindPitchContPowerIEC() {
        setCimType("WindPitchContPowerIEC");
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

    public void setWindDynamicsLookupTable(BaseClass _object_) {
        if (!(_object_ instanceof WindDynamicsLookupTable)) {
            throw new IllegalArgumentException("Object is not WindDynamicsLookupTable");
        }
        if (!WindDynamicsLookupTable.contains(_object_)) {
            WindDynamicsLookupTable.add((WindDynamicsLookupTable) _object_);
            ((WindDynamicsLookupTable) _object_).setWindPitchContPowerIEC(this);
        }
    }

    public String WindDynamicsLookupTableToString() {
        return getStringFromSet(WindDynamicsLookupTable);
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

    public void setWindGenTurbineType1bIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindGenTurbineType1bIEC)) {
            throw new IllegalArgumentException("Object is not WindGenTurbineType1bIEC");
        }
        if (WindGenTurbineType1bIEC != _object_) {
            WindGenTurbineType1bIEC = (WindGenTurbineType1bIEC) _object_;
            WindGenTurbineType1bIEC.setWindPitchContPowerIEC(this);
        }
    }

    public String WindGenTurbineType1bIECToString() {
        return WindGenTurbineType1bIEC != null ? WindGenTurbineType1bIEC.getRdfid() : null;
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

    public void setWindGenTurbineType2IEC(BaseClass _object_) {
        if (!(_object_ instanceof WindGenTurbineType2IEC)) {
            throw new IllegalArgumentException("Object is not WindGenTurbineType2IEC");
        }
        if (WindGenTurbineType2IEC != _object_) {
            WindGenTurbineType2IEC = (WindGenTurbineType2IEC) _object_;
            WindGenTurbineType2IEC.setWindPitchContPowerIEC(this);
        }
    }

    public String WindGenTurbineType2IECToString() {
        return WindGenTurbineType2IEC != null ? WindGenTurbineType2IEC.getRdfid() : null;
    }

    /**
     * Rate limit for increasing power (&lt;i&gt;dp&lt;/i&gt;&lt;i&gt;&lt;sub&gt;max&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; WindPitchContPowerIEC.dpmin). It is a type-dependent parameter.
     */
    private Double dpmax; // PU

    public Double getDpmax() {
        return dpmax;
    }

    public void setDpmax(Double _value_) {
        dpmax = _value_;
    }

    public void setDpmax(String _value_) {
        dpmax = getDoubleFromString(_value_);
    }

    public String dpmaxToString() {
        return dpmax != null ? dpmax.toString() : null;
    }

    /**
     * Rate limit for decreasing power (&lt;i&gt;dp&lt;/i&gt;&lt;i&gt;&lt;sub&gt;min&lt;/sub&gt;&lt;/i&gt;) (&amp;lt; WindPitchContPowerIEC.dpmax). It is a type-dependent parameter.
     */
    private Double dpmin; // PU

    public Double getDpmin() {
        return dpmin;
    }

    public void setDpmin(Double _value_) {
        dpmin = _value_;
    }

    public void setDpmin(String _value_) {
        dpmin = getDoubleFromString(_value_);
    }

    public String dpminToString() {
        return dpmin != null ? dpmin.toString() : null;
    }

    /**
     * Minimum power setting (&lt;i&gt;p&lt;/i&gt;&lt;i&gt;&lt;sub&gt;min&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double pmin; // PU

    public Double getPmin() {
        return pmin;
    }

    public void setPmin(Double _value_) {
        pmin = _value_;
    }

    public void setPmin(String _value_) {
        pmin = getDoubleFromString(_value_);
    }

    public String pminToString() {
        return pmin != null ? pmin.toString() : null;
    }

    /**
     * If &lt;i&gt;p&lt;/i&gt;&lt;i&gt;&lt;sub&gt;init&lt;/sub&gt;&lt;/i&gt;&lt;sub&gt; &lt;/sub&gt;&amp;lt; &lt;i&gt;p&lt;/i&gt;&lt;i&gt;&lt;sub&gt;set&lt;/sub&gt;&lt;/i&gt;&lt;sub&gt; &lt;/sub&gt;then power will be ramped down to &lt;i&gt;p&lt;/i&gt;&lt;i&gt;&lt;sub&gt;min&lt;/sub&gt;&lt;/i&gt;. It is (&lt;i&gt;p&lt;/i&gt;&lt;i&gt;&lt;sub&gt;set&lt;/sub&gt;&lt;/i&gt;) in the IEC 61400-27-1:2015. It is a type-dependent parameter.
     */
    private Double pset; // PU

    public Double getPset() {
        return pset;
    }

    public void setPset(Double _value_) {
        pset = _value_;
    }

    public void setPset(String _value_) {
        pset = getDoubleFromString(_value_);
    }

    public String psetToString() {
        return pset != null ? pset.toString() : null;
    }

    /**
     * Lag time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;1&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a type-dependent parameter.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    public void setT1(String _value_) {
        t1 = getDoubleFromString(_value_);
    }

    public String t1ToString() {
        return t1 != null ? t1.toString() : null;
    }

    /**
     * Voltage measurement time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;r&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a type-dependent parameter.
     */
    private Double tr; // Seconds

    public Double getTr() {
        return tr;
    }

    public void setTr(Double _value_) {
        tr = _value_;
    }

    public void setTr(String _value_) {
        tr = getDoubleFromString(_value_);
    }

    public String trToString() {
        return tr != null ? tr.toString() : null;
    }

    /**
     * Dip detection threshold (&lt;i&gt;u&lt;/i&gt;&lt;i&gt;&lt;sub&gt;UVRT&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double uuvrt; // PU

    public Double getUuvrt() {
        return uuvrt;
    }

    public void setUuvrt(Double _value_) {
        uuvrt = _value_;
    }

    public void setUuvrt(String _value_) {
        uuvrt = getDoubleFromString(_value_);
    }

    public String uuvrtToString() {
        return uuvrt != null ? uuvrt.toString() : null;
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
        return getAttribute("WindPitchContPowerIEC", attrName);
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
        setAttribute("WindPitchContPowerIEC", attrName, objectValue);
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
        setAttribute("WindPitchContPowerIEC", attrName, stringValue);
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
            profiles.add(CGMESProfile.DY);
            map.put("WindDynamicsLookupTable", new AttrDetails("WindPitchContPowerIEC.WindDynamicsLookupTable", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindGenTurbineType1bIEC", new AttrDetails("WindPitchContPowerIEC.WindGenTurbineType1bIEC", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindGenTurbineType2IEC", new AttrDetails("WindPitchContPowerIEC.WindGenTurbineType2IEC", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dpmax", new AttrDetails("WindPitchContPowerIEC.dpmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dpmin", new AttrDetails("WindPitchContPowerIEC.dpmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmin", new AttrDetails("WindPitchContPowerIEC.pmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pset", new AttrDetails("WindPitchContPowerIEC.pset", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("WindPitchContPowerIEC.t1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tr", new AttrDetails("WindPitchContPowerIEC.tr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uuvrt", new AttrDetails("WindPitchContPowerIEC.uuvrt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindPitchContPowerIEC().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("WindDynamicsLookupTable", new GetterSetter(this::WindDynamicsLookupTableToString, this::setWindDynamicsLookupTable, null));
        map.put("WindGenTurbineType1bIEC", new GetterSetter(this::WindGenTurbineType1bIECToString, this::setWindGenTurbineType1bIEC, null));
        map.put("WindGenTurbineType2IEC", new GetterSetter(this::WindGenTurbineType2IECToString, this::setWindGenTurbineType2IEC, null));
        map.put("dpmax", new GetterSetter(this::dpmaxToString, null, this::setDpmax));
        map.put("dpmin", new GetterSetter(this::dpminToString, null, this::setDpmin));
        map.put("pmin", new GetterSetter(this::pminToString, null, this::setPmin));
        map.put("pset", new GetterSetter(this::psetToString, null, this::setPset));
        map.put("t1", new GetterSetter(this::t1ToString, null, this::setT1));
        map.put("tr", new GetterSetter(this::trToString, null, this::setTr));
        map.put("uuvrt", new GetterSetter(this::uuvrtToString, null, this::setUuvrt));
        return map;
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
