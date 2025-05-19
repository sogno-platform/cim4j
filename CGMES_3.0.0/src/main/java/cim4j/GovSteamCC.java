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
 * Cross compound turbine governor.  Unlike tandem compound units, cross compound units are not on the same shaft.
 */
@SuppressWarnings("unused")
public class GovSteamCC extends CrossCompoundTurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovSteamCC.class);

    /**
     * Default constructor.
     */
    public GovSteamCC() {
        setCimType("GovSteamCC");
    }

    /**
     * HP damping factor (&lt;i&gt;Dhp&lt;/i&gt;).  Typical value = 0.
     */
    private Double dhp; // PU

    public Double getDhp() {
        return dhp;
    }

    public void setDhp(Double _value_) {
        dhp = _value_;
    }

    public void setDhp(String _value_) {
        dhp = getDoubleFromString(_value_);
    }

    public String dhpToString() {
        return dhp != null ? dhp.toString() : null;
    }

    /**
     * LP damping factor (&lt;i&gt;Dlp&lt;/i&gt;).  Typical value = 0.
     */
    private Double dlp; // PU

    public Double getDlp() {
        return dlp;
    }

    public void setDlp(Double _value_) {
        dlp = _value_;
    }

    public void setDlp(String _value_) {
        dlp = getDoubleFromString(_value_);
    }

    public String dlpToString() {
        return dlp != null ? dlp.toString() : null;
    }

    /**
     * Fraction of HP power ahead of reheater (&lt;i&gt;Fhp&lt;/i&gt;).  Typical value = 0,3.
     */
    private Double fhp; // PU

    public Double getFhp() {
        return fhp;
    }

    public void setFhp(Double _value_) {
        fhp = _value_;
    }

    public void setFhp(String _value_) {
        fhp = getDoubleFromString(_value_);
    }

    public String fhpToString() {
        return fhp != null ? fhp.toString() : null;
    }

    /**
     * Fraction of LP power ahead of reheater (&lt;i&gt;Flp&lt;/i&gt;).  Typical value = 0,7.
     */
    private Double flp; // PU

    public Double getFlp() {
        return flp;
    }

    public void setFlp(Double _value_) {
        flp = _value_;
    }

    public void setFlp(String _value_) {
        flp = getDoubleFromString(_value_);
    }

    public String flpToString() {
        return flp != null ? flp.toString() : null;
    }

    /**
     * Base for power values (&lt;i&gt;MWbase&lt;/i&gt;) (&amp;gt; 0).  Unit = MW.
     */
    private Double mwbase; // ActivePower

    public Double getMwbase() {
        return mwbase;
    }

    public void setMwbase(Double _value_) {
        mwbase = _value_;
    }

    public void setMwbase(String _value_) {
        mwbase = getDoubleFromString(_value_);
    }

    public String mwbaseToString() {
        return mwbase != null ? mwbase.toString() : null;
    }

    /**
     * Maximum HP value position (&lt;i&gt;Pmaxhp&lt;/i&gt;).  Typical value = 1.
     */
    private Double pmaxhp; // PU

    public Double getPmaxhp() {
        return pmaxhp;
    }

    public void setPmaxhp(Double _value_) {
        pmaxhp = _value_;
    }

    public void setPmaxhp(String _value_) {
        pmaxhp = getDoubleFromString(_value_);
    }

    public String pmaxhpToString() {
        return pmaxhp != null ? pmaxhp.toString() : null;
    }

    /**
     * Maximum LP value position (&lt;i&gt;Pmaxlp&lt;/i&gt;).  Typical value = 1.
     */
    private Double pmaxlp; // PU

    public Double getPmaxlp() {
        return pmaxlp;
    }

    public void setPmaxlp(Double _value_) {
        pmaxlp = _value_;
    }

    public void setPmaxlp(String _value_) {
        pmaxlp = getDoubleFromString(_value_);
    }

    public String pmaxlpToString() {
        return pmaxlp != null ? pmaxlp.toString() : null;
    }

    /**
     * HP governor droop (&lt;i&gt;Rhp&lt;/i&gt;) (&amp;gt; 0).  Typical value = 0,05.
     */
    private Double rhp; // PU

    public Double getRhp() {
        return rhp;
    }

    public void setRhp(Double _value_) {
        rhp = _value_;
    }

    public void setRhp(String _value_) {
        rhp = getDoubleFromString(_value_);
    }

    public String rhpToString() {
        return rhp != null ? rhp.toString() : null;
    }

    /**
     * LP governor droop (&lt;i&gt;Rlp&lt;/i&gt;) (&amp;gt; 0).  Typical value = 0,05.
     */
    private Double rlp; // PU

    public Double getRlp() {
        return rlp;
    }

    public void setRlp(Double _value_) {
        rlp = _value_;
    }

    public void setRlp(String _value_) {
        rlp = getDoubleFromString(_value_);
    }

    public String rlpToString() {
        return rlp != null ? rlp.toString() : null;
    }

    /**
     * HP governor time constant (&lt;i&gt;T1hp&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,1.
     */
    private Double t1hp; // Seconds

    public Double getT1hp() {
        return t1hp;
    }

    public void setT1hp(Double _value_) {
        t1hp = _value_;
    }

    public void setT1hp(String _value_) {
        t1hp = getDoubleFromString(_value_);
    }

    public String t1hpToString() {
        return t1hp != null ? t1hp.toString() : null;
    }

    /**
     * LP governor time constant (&lt;i&gt;T1lp&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,1.
     */
    private Double t1lp; // Seconds

    public Double getT1lp() {
        return t1lp;
    }

    public void setT1lp(Double _value_) {
        t1lp = _value_;
    }

    public void setT1lp(String _value_) {
        t1lp = getDoubleFromString(_value_);
    }

    public String t1lpToString() {
        return t1lp != null ? t1lp.toString() : null;
    }

    /**
     * HP turbine time constant (&lt;i&gt;T3hp&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,1.
     */
    private Double t3hp; // Seconds

    public Double getT3hp() {
        return t3hp;
    }

    public void setT3hp(Double _value_) {
        t3hp = _value_;
    }

    public void setT3hp(String _value_) {
        t3hp = getDoubleFromString(_value_);
    }

    public String t3hpToString() {
        return t3hp != null ? t3hp.toString() : null;
    }

    /**
     * LP turbine time constant (&lt;i&gt;T3lp&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,1.
     */
    private Double t3lp; // Seconds

    public Double getT3lp() {
        return t3lp;
    }

    public void setT3lp(Double _value_) {
        t3lp = _value_;
    }

    public void setT3lp(String _value_) {
        t3lp = getDoubleFromString(_value_);
    }

    public String t3lpToString() {
        return t3lp != null ? t3lp.toString() : null;
    }

    /**
     * HP turbine time constant (&lt;i&gt;T4hp&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,1.
     */
    private Double t4hp; // Seconds

    public Double getT4hp() {
        return t4hp;
    }

    public void setT4hp(Double _value_) {
        t4hp = _value_;
    }

    public void setT4hp(String _value_) {
        t4hp = getDoubleFromString(_value_);
    }

    public String t4hpToString() {
        return t4hp != null ? t4hp.toString() : null;
    }

    /**
     * LP turbine time constant (&lt;i&gt;T4lp&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,1.
     */
    private Double t4lp; // Seconds

    public Double getT4lp() {
        return t4lp;
    }

    public void setT4lp(Double _value_) {
        t4lp = _value_;
    }

    public void setT4lp(String _value_) {
        t4lp = getDoubleFromString(_value_);
    }

    public String t4lpToString() {
        return t4lp != null ? t4lp.toString() : null;
    }

    /**
     * HP reheater time constant (&lt;i&gt;T5hp&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 10.
     */
    private Double t5hp; // Seconds

    public Double getT5hp() {
        return t5hp;
    }

    public void setT5hp(Double _value_) {
        t5hp = _value_;
    }

    public void setT5hp(String _value_) {
        t5hp = getDoubleFromString(_value_);
    }

    public String t5hpToString() {
        return t5hp != null ? t5hp.toString() : null;
    }

    /**
     * LP reheater time constant (&lt;i&gt;T5lp&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 10.
     */
    private Double t5lp; // Seconds

    public Double getT5lp() {
        return t5lp;
    }

    public void setT5lp(Double _value_) {
        t5lp = _value_;
    }

    public void setT5lp(String _value_) {
        t5lp = getDoubleFromString(_value_);
    }

    public String t5lpToString() {
        return t5lp != null ? t5lp.toString() : null;
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
        return getAttribute("GovSteamCC", attrName);
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
        setAttribute("GovSteamCC", attrName, objectValue);
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
        setAttribute("GovSteamCC", attrName, stringValue);
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
            map.put("dhp", new AttrDetails("GovSteamCC.dhp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dlp", new AttrDetails("GovSteamCC.dlp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fhp", new AttrDetails("GovSteamCC.fhp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("flp", new AttrDetails("GovSteamCC.flp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovSteamCC.mwbase", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmaxhp", new AttrDetails("GovSteamCC.pmaxhp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmaxlp", new AttrDetails("GovSteamCC.pmaxlp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rhp", new AttrDetails("GovSteamCC.rhp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rlp", new AttrDetails("GovSteamCC.rlp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1hp", new AttrDetails("GovSteamCC.t1hp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1lp", new AttrDetails("GovSteamCC.t1lp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3hp", new AttrDetails("GovSteamCC.t3hp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3lp", new AttrDetails("GovSteamCC.t3lp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4hp", new AttrDetails("GovSteamCC.t4hp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4lp", new AttrDetails("GovSteamCC.t4lp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5hp", new AttrDetails("GovSteamCC.t5hp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5lp", new AttrDetails("GovSteamCC.t5lp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovSteamCC().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("dhp", new GetterSetter(this::dhpToString, null, this::setDhp));
        map.put("dlp", new GetterSetter(this::dlpToString, null, this::setDlp));
        map.put("fhp", new GetterSetter(this::fhpToString, null, this::setFhp));
        map.put("flp", new GetterSetter(this::flpToString, null, this::setFlp));
        map.put("mwbase", new GetterSetter(this::mwbaseToString, null, this::setMwbase));
        map.put("pmaxhp", new GetterSetter(this::pmaxhpToString, null, this::setPmaxhp));
        map.put("pmaxlp", new GetterSetter(this::pmaxlpToString, null, this::setPmaxlp));
        map.put("rhp", new GetterSetter(this::rhpToString, null, this::setRhp));
        map.put("rlp", new GetterSetter(this::rlpToString, null, this::setRlp));
        map.put("t1hp", new GetterSetter(this::t1hpToString, null, this::setT1hp));
        map.put("t1lp", new GetterSetter(this::t1lpToString, null, this::setT1lp));
        map.put("t3hp", new GetterSetter(this::t3hpToString, null, this::setT3hp));
        map.put("t3lp", new GetterSetter(this::t3lpToString, null, this::setT3lp));
        map.put("t4hp", new GetterSetter(this::t4hpToString, null, this::setT4hp));
        map.put("t4lp", new GetterSetter(this::t4lpToString, null, this::setT4lp));
        map.put("t5hp", new GetterSetter(this::t5hpToString, null, this::setT5hp));
        map.put("t5lp", new GetterSetter(this::t5lpToString, null, this::setT5lp));
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
