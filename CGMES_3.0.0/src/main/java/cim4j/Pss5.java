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
 * Detailed Italian PSS.
 */
@SuppressWarnings("unused")
public class Pss5 extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(Pss5.class);

    /**
     * Default constructor.
     */
    public Pss5() {
        setCimType("Pss5");
    }

    /**
     * Selector for second washout enabling (&lt;i&gt;C&lt;/i&gt;&lt;i&gt;&lt;sub&gt;TW2&lt;/sub&gt;&lt;/i&gt;). true = second washout filter is bypassed false = second washout filter in use. Typical value = true.
     */
    private Boolean ctw2; // Boolean

    public Boolean getCtw2() {
        return ctw2;
    }

    public void setCtw2(Boolean _value_) {
        ctw2 = _value_;
    }

    public void setCtw2(String _value_) {
        ctw2 = getBooleanFromString(_value_);
    }

    public String ctw2ToString() {
        return ctw2 != null ? ctw2.toString() : null;
    }

    /**
     * Stabilizer output deadband (&lt;i&gt;DEADBAND&lt;/i&gt;).  Typical value = 0.
     */
    private Double deadband; // PU

    public Double getDeadband() {
        return deadband;
    }

    public void setDeadband(Double _value_) {
        deadband = _value_;
    }

    public void setDeadband(String _value_) {
        deadband = getDoubleFromString(_value_);
    }

    public String deadbandToString() {
        return deadband != null ? deadband.toString() : null;
    }

    /**
     * Selector for frequency/shaft speed input (&lt;i&gt;isFreq&lt;/i&gt;). true = speed (same meaning as InputSignaKind.rotorSpeed) false = frequency (same meaning as InputSignalKind.busFrequency). Typical value = true (same meaning as InputSignalKind.rotorSpeed).
     */
    private Boolean isfreq; // Boolean

    public Boolean getIsfreq() {
        return isfreq;
    }

    public void setIsfreq(Boolean _value_) {
        isfreq = _value_;
    }

    public void setIsfreq(String _value_) {
        isfreq = getBooleanFromString(_value_);
    }

    public String isfreqToString() {
        return isfreq != null ? isfreq.toString() : null;
    }

    /**
     * Frequency/shaft speed input gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;F&lt;/sub&gt;&lt;/i&gt;).  Typical value = 5.
     */
    private Float kf; // Float

    public Float getKf() {
        return kf;
    }

    public void setKf(Float _value_) {
        kf = _value_;
    }

    public void setKf(String _value_) {
        kf = getFloatFromString(_value_);
    }

    public String kfToString() {
        return kf != null ? kf.toString() : null;
    }

    /**
     * Electric power input gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;PE&lt;/sub&gt;&lt;/i&gt;).  Typical value = 0,3.
     */
    private Float kpe; // Float

    public Float getKpe() {
        return kpe;
    }

    public void setKpe(Float _value_) {
        kpe = _value_;
    }

    public void setKpe(String _value_) {
        kpe = getFloatFromString(_value_);
    }

    public String kpeToString() {
        return kpe != null ? kpe.toString() : null;
    }

    /**
     * PSS gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;PSS&lt;/sub&gt;&lt;/i&gt;).  Typical value = 1.
     */
    private Float kpss; // Float

    public Float getKpss() {
        return kpss;
    }

    public void setKpss(Float _value_) {
        kpss = _value_;
    }

    public void setKpss(String _value_) {
        kpss = getFloatFromString(_value_);
    }

    public String kpssToString() {
        return kpss != null ? kpss.toString() : null;
    }

    /**
     * Minimum power PSS enabling (&lt;i&gt;Pmin&lt;/i&gt;).  Typical value = 0,25.
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
     * Lead/lag time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L1&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double tl1; // Seconds

    public Double getTl1() {
        return tl1;
    }

    public void setTl1(Double _value_) {
        tl1 = _value_;
    }

    public void setTl1(String _value_) {
        tl1 = getDoubleFromString(_value_);
    }

    public String tl1ToString() {
        return tl1 != null ? tl1.toString() : null;
    }

    /**
     * Lead/lag time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L2&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  If = 0, both blocks are bypassed.  Typical value = 0.
     */
    private Double tl2; // Seconds

    public Double getTl2() {
        return tl2;
    }

    public void setTl2(Double _value_) {
        tl2 = _value_;
    }

    public void setTl2(String _value_) {
        tl2 = getDoubleFromString(_value_);
    }

    public String tl2ToString() {
        return tl2 != null ? tl2.toString() : null;
    }

    /**
     * Lead/lag time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L3&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double tl3; // Seconds

    public Double getTl3() {
        return tl3;
    }

    public void setTl3(Double _value_) {
        tl3 = _value_;
    }

    public void setTl3(String _value_) {
        tl3 = getDoubleFromString(_value_);
    }

    public String tl3ToString() {
        return tl3 != null ? tl3.toString() : null;
    }

    /**
     * Lead/lag time constant (T&lt;sub&gt;L4&lt;/sub&gt;) (&amp;gt;= 0).  If = 0, both blocks are bypassed.  Typical value = 0.
     */
    private Double tl4; // Seconds

    public Double getTl4() {
        return tl4;
    }

    public void setTl4(Double _value_) {
        tl4 = _value_;
    }

    public void setTl4(String _value_) {
        tl4 = getDoubleFromString(_value_);
    }

    public String tl4ToString() {
        return tl4 != null ? tl4.toString() : null;
    }

    /**
     * Electric power filter time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;PE&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,05.
     */
    private Double tpe; // Seconds

    public Double getTpe() {
        return tpe;
    }

    public void setTpe(Double _value_) {
        tpe = _value_;
    }

    public void setTpe(String _value_) {
        tpe = getDoubleFromString(_value_);
    }

    public String tpeToString() {
        return tpe != null ? tpe.toString() : null;
    }

    /**
     * First washout (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;W1&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 3,5.
     */
    private Double tw1; // Seconds

    public Double getTw1() {
        return tw1;
    }

    public void setTw1(Double _value_) {
        tw1 = _value_;
    }

    public void setTw1(String _value_) {
        tw1 = getDoubleFromString(_value_);
    }

    public String tw1ToString() {
        return tw1 != null ? tw1.toString() : null;
    }

    /**
     * Second washout (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;W2&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double tw2; // Seconds

    public Double getTw2() {
        return tw2;
    }

    public void setTw2(Double _value_) {
        tw2 = _value_;
    }

    public void setTw2(String _value_) {
        tw2 = getDoubleFromString(_value_);
    }

    public String tw2ToString() {
        return tw2 != null ? tw2.toString() : null;
    }

    /**
     * &lt;font color=`#0f0f0f`&gt;Signal selector (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;adAtt&lt;/sub&gt;&lt;/i&gt;).&lt;/font&gt; &lt;font color=`#0f0f0f`&gt;true = closed (generator power is greater than &lt;i&gt;Pmin&lt;/i&gt;)&lt;/font&gt; &lt;font color=`#0f0f0f`&gt;false = open (&lt;i&gt;Pe&lt;/i&gt; is smaller than &lt;i&gt;Pmin&lt;/i&gt;).&lt;/font&gt; &lt;font color=`#0f0f0f`&gt;Typical value = true.&lt;/font&gt;
     */
    private Boolean vadat; // Boolean

    public Boolean getVadat() {
        return vadat;
    }

    public void setVadat(Boolean _value_) {
        vadat = _value_;
    }

    public void setVadat(String _value_) {
        vadat = getBooleanFromString(_value_);
    }

    public String vadatToString() {
        return vadat != null ? vadat.toString() : null;
    }

    /**
     * Stabilizer output maximum limit (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;SMN&lt;/sub&gt;&lt;/i&gt;).  Typical value = -0,1.
     */
    private Double vsmn; // PU

    public Double getVsmn() {
        return vsmn;
    }

    public void setVsmn(Double _value_) {
        vsmn = _value_;
    }

    public void setVsmn(String _value_) {
        vsmn = getDoubleFromString(_value_);
    }

    public String vsmnToString() {
        return vsmn != null ? vsmn.toString() : null;
    }

    /**
     * Stabilizer output minimum limit (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;SMX&lt;/sub&gt;&lt;/i&gt;).  Typical value = 0,1.
     */
    private Double vsmx; // PU

    public Double getVsmx() {
        return vsmx;
    }

    public void setVsmx(Double _value_) {
        vsmx = _value_;
    }

    public void setVsmx(String _value_) {
        vsmx = getDoubleFromString(_value_);
    }

    public String vsmxToString() {
        return vsmx != null ? vsmx.toString() : null;
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
        return getAttribute("Pss5", attrName);
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
        setAttribute("Pss5", attrName, objectValue);
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
        setAttribute("Pss5", attrName, stringValue);
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
            map.put("ctw2", new AttrDetails("Pss5.ctw2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("deadband", new AttrDetails("Pss5.deadband", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("isfreq", new AttrDetails("Pss5.isfreq", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("Pss5.kf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpe", new AttrDetails("Pss5.kpe", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpss", new AttrDetails("Pss5.kpss", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmin", new AttrDetails("Pss5.pmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl1", new AttrDetails("Pss5.tl1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl2", new AttrDetails("Pss5.tl2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl3", new AttrDetails("Pss5.tl3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl4", new AttrDetails("Pss5.tl4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpe", new AttrDetails("Pss5.tpe", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw1", new AttrDetails("Pss5.tw1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw2", new AttrDetails("Pss5.tw2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vadat", new AttrDetails("Pss5.vadat", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsmn", new AttrDetails("Pss5.vsmn", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsmx", new AttrDetails("Pss5.vsmx", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new Pss5().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("ctw2", new GetterSetter(this::ctw2ToString, null, this::setCtw2));
        map.put("deadband", new GetterSetter(this::deadbandToString, null, this::setDeadband));
        map.put("isfreq", new GetterSetter(this::isfreqToString, null, this::setIsfreq));
        map.put("kf", new GetterSetter(this::kfToString, null, this::setKf));
        map.put("kpe", new GetterSetter(this::kpeToString, null, this::setKpe));
        map.put("kpss", new GetterSetter(this::kpssToString, null, this::setKpss));
        map.put("pmin", new GetterSetter(this::pminToString, null, this::setPmin));
        map.put("tl1", new GetterSetter(this::tl1ToString, null, this::setTl1));
        map.put("tl2", new GetterSetter(this::tl2ToString, null, this::setTl2));
        map.put("tl3", new GetterSetter(this::tl3ToString, null, this::setTl3));
        map.put("tl4", new GetterSetter(this::tl4ToString, null, this::setTl4));
        map.put("tpe", new GetterSetter(this::tpeToString, null, this::setTpe));
        map.put("tw1", new GetterSetter(this::tw1ToString, null, this::setTw1));
        map.put("tw2", new GetterSetter(this::tw2ToString, null, this::setTw2));
        map.put("vadat", new GetterSetter(this::vadatToString, null, this::setVadat));
        map.put("vsmn", new GetterSetter(this::vsmnToString, null, this::setVsmn));
        map.put("vsmx", new GetterSetter(this::vsmxToString, null, this::setVsmx));
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
