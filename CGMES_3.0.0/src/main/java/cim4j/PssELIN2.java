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
 * Power system stabilizer typically associated with ExcELIN2 (though PssIEEE2B or Pss2B can also be used).
 */
@SuppressWarnings("unused")
public class PssELIN2 extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssELIN2.class);

    /**
     * Default constructor.
     */
    public PssELIN2() {
        setCimType("PssELIN2");
    }

    /**
     * Coefficient (&lt;i&gt;a_PSS&lt;/i&gt;).  Typical value = 0,1.
     */
    private Double apss; // PU

    public Double getApss() {
        return apss;
    }

    public void setApss(Double _value_) {
        apss = _value_;
    }

    public void setApss(String _value_) {
        apss = getDoubleFromString(_value_);
    }

    public String apssToString() {
        return apss != null ? apss.toString() : null;
    }

    /**
     * Gain (&lt;i&gt;Ks1&lt;/i&gt;).  Typical value = 1.
     */
    private Double ks1; // PU

    public Double getKs1() {
        return ks1;
    }

    public void setKs1(Double _value_) {
        ks1 = _value_;
    }

    public void setKs1(String _value_) {
        ks1 = getDoubleFromString(_value_);
    }

    public String ks1ToString() {
        return ks1 != null ? ks1.toString() : null;
    }

    /**
     * Gain (&lt;i&gt;Ks2&lt;/i&gt;).  Typical value = 0,1.
     */
    private Double ks2; // PU

    public Double getKs2() {
        return ks2;
    }

    public void setKs2(Double _value_) {
        ks2 = _value_;
    }

    public void setKs2(String _value_) {
        ks2 = getDoubleFromString(_value_);
    }

    public String ks2ToString() {
        return ks2 != null ? ks2.toString() : null;
    }

    /**
     * Coefficient (&lt;i&gt;p_PSS&lt;/i&gt;) (&amp;gt;= 0 and &amp;lt;= 4).  Typical value = 0,1.
     */
    private Double ppss; // PU

    public Double getPpss() {
        return ppss;
    }

    public void setPpss(Double _value_) {
        ppss = _value_;
    }

    public void setPpss(String _value_) {
        ppss = getDoubleFromString(_value_);
    }

    public String ppssToString() {
        return ppss != null ? ppss.toString() : null;
    }

    /**
     * PSS limiter (&lt;i&gt;psslim&lt;/i&gt;).  Typical value = 0,1.
     */
    private Double psslim; // PU

    public Double getPsslim() {
        return psslim;
    }

    public void setPsslim(Double _value_) {
        psslim = _value_;
    }

    public void setPsslim(String _value_) {
        psslim = getDoubleFromString(_value_);
    }

    public String psslimToString() {
        return psslim != null ? psslim.toString() : null;
    }

    /**
     * Time constant (&lt;i&gt;Ts1&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double ts1; // Seconds

    public Double getTs1() {
        return ts1;
    }

    public void setTs1(Double _value_) {
        ts1 = _value_;
    }

    public void setTs1(String _value_) {
        ts1 = getDoubleFromString(_value_);
    }

    public String ts1ToString() {
        return ts1 != null ? ts1.toString() : null;
    }

    /**
     * Time constant (&lt;i&gt;Ts2&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 1.
     */
    private Double ts2; // Seconds

    public Double getTs2() {
        return ts2;
    }

    public void setTs2(Double _value_) {
        ts2 = _value_;
    }

    public void setTs2(String _value_) {
        ts2 = getDoubleFromString(_value_);
    }

    public String ts2ToString() {
        return ts2 != null ? ts2.toString() : null;
    }

    /**
     * Time constant (&lt;i&gt;Ts3&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 1.
     */
    private Double ts3; // Seconds

    public Double getTs3() {
        return ts3;
    }

    public void setTs3(Double _value_) {
        ts3 = _value_;
    }

    public void setTs3(String _value_) {
        ts3 = getDoubleFromString(_value_);
    }

    public String ts3ToString() {
        return ts3 != null ? ts3.toString() : null;
    }

    /**
     * Time constant (&lt;i&gt;Ts4&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,1.
     */
    private Double ts4; // Seconds

    public Double getTs4() {
        return ts4;
    }

    public void setTs4(Double _value_) {
        ts4 = _value_;
    }

    public void setTs4(String _value_) {
        ts4 = getDoubleFromString(_value_);
    }

    public String ts4ToString() {
        return ts4 != null ? ts4.toString() : null;
    }

    /**
     * Time constant (&lt;i&gt;Ts5&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double ts5; // Seconds

    public Double getTs5() {
        return ts5;
    }

    public void setTs5(Double _value_) {
        ts5 = _value_;
    }

    public void setTs5(String _value_) {
        ts5 = getDoubleFromString(_value_);
    }

    public String ts5ToString() {
        return ts5 != null ? ts5.toString() : null;
    }

    /**
     * Time constant (&lt;i&gt;Ts6&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 1.
     */
    private Double ts6; // Seconds

    public Double getTs6() {
        return ts6;
    }

    public void setTs6(Double _value_) {
        ts6 = _value_;
    }

    public void setTs6(String _value_) {
        ts6 = getDoubleFromString(_value_);
    }

    public String ts6ToString() {
        return ts6 != null ? ts6.toString() : null;
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
        return getAttribute("PssELIN2", attrName);
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
        setAttribute("PssELIN2", attrName, objectValue);
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
        setAttribute("PssELIN2", attrName, stringValue);
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
            map.put("apss", new AttrDetails("PssELIN2.apss", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks1", new AttrDetails("PssELIN2.ks1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks2", new AttrDetails("PssELIN2.ks2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ppss", new AttrDetails("PssELIN2.ppss", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("psslim", new AttrDetails("PssELIN2.psslim", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ts1", new AttrDetails("PssELIN2.ts1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ts2", new AttrDetails("PssELIN2.ts2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ts3", new AttrDetails("PssELIN2.ts3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ts4", new AttrDetails("PssELIN2.ts4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ts5", new AttrDetails("PssELIN2.ts5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ts6", new AttrDetails("PssELIN2.ts6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PssELIN2().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("apss", new GetterSetter(this::apssToString, null, this::setApss));
        map.put("ks1", new GetterSetter(this::ks1ToString, null, this::setKs1));
        map.put("ks2", new GetterSetter(this::ks2ToString, null, this::setKs2));
        map.put("ppss", new GetterSetter(this::ppssToString, null, this::setPpss));
        map.put("psslim", new GetterSetter(this::psslimToString, null, this::setPsslim));
        map.put("ts1", new GetterSetter(this::ts1ToString, null, this::setTs1));
        map.put("ts2", new GetterSetter(this::ts2ToString, null, this::setTs2));
        map.put("ts3", new GetterSetter(this::ts3ToString, null, this::setTs3));
        map.put("ts4", new GetterSetter(this::ts4ToString, null, this::setTs4));
        map.put("ts5", new GetterSetter(this::ts5ToString, null, this::setTs5));
        map.put("ts6", new GetterSetter(this::ts6ToString, null, this::setTs6));
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
