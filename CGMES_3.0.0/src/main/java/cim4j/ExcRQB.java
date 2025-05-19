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
 * Excitation system type RQB (four-loop regulator, r?gulateur quatre boucles, developed in France) primarily used in nuclear or thermal generating units. This excitation system shall be always used together with power system stabilizer type PssRQB.
 */
@SuppressWarnings("unused")
public class ExcRQB extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcRQB.class);

    /**
     * Default constructor.
     */
    public ExcRQB() {
        setCimType("ExcRQB");
    }

    /**
     * Voltage reference input gain (&lt;i&gt;Ki0&lt;/i&gt;).  Typical value = 12,7.
     */
    private Float ki0; // Float

    public Float getKi0() {
        return ki0;
    }

    public void setKi0(Float _value_) {
        ki0 = _value_;
    }

    public void setKi0(String _value_) {
        ki0 = getFloatFromString(_value_);
    }

    public String ki0ToString() {
        return ki0 != null ? ki0.toString() : null;
    }

    /**
     * Voltage input gain (&lt;i&gt;Ki1&lt;/i&gt;).  Typical value = -16,8.
     */
    private Float ki1; // Float

    public Float getKi1() {
        return ki1;
    }

    public void setKi1(Float _value_) {
        ki1 = _value_;
    }

    public void setKi1(String _value_) {
        ki1 = getFloatFromString(_value_);
    }

    public String ki1ToString() {
        return ki1 != null ? ki1.toString() : null;
    }

    /**
     * OEL input gain (&lt;i&gt;KLIR&lt;/i&gt;).  Typical value = 12,13.
     */
    private Float klir; // Float

    public Float getKlir() {
        return klir;
    }

    public void setKlir(Float _value_) {
        klir = _value_;
    }

    public void setKlir(String _value_) {
        klir = getFloatFromString(_value_);
    }

    public String klirToString() {
        return klir != null ? klir.toString() : null;
    }

    /**
     * Limiter gain (&lt;i&gt;KLUS&lt;/i&gt;).  Typical value = 50.
     */
    private Float klus; // Float

    public Float getKlus() {
        return klus;
    }

    public void setKlus(Float _value_) {
        klus = _value_;
    }

    public void setKlus(String _value_) {
        klus = getFloatFromString(_value_);
    }

    public String klusToString() {
        return klus != null ? klus.toString() : null;
    }

    /**
     * Integrator limiter (&lt;i&gt;LSAT&lt;/i&gt;).  Typical value = 5,73.
     */
    private Double lsat; // PU

    public Double getLsat() {
        return lsat;
    }

    public void setLsat(Double _value_) {
        lsat = _value_;
    }

    public void setLsat(String _value_) {
        lsat = getDoubleFromString(_value_);
    }

    public String lsatToString() {
        return lsat != null ? lsat.toString() : null;
    }

    /**
     * Setpoint (&lt;i&gt;LUS&lt;/i&gt;).  Typical value = 0,12.
     */
    private Double lus; // PU

    public Double getLus() {
        return lus;
    }

    public void setLus(Double _value_) {
        lus = _value_;
    }

    public void setLus(String _value_) {
        lus = getDoubleFromString(_value_);
    }

    public String lusToString() {
        return lus != null ? lus.toString() : null;
    }

    /**
     * Voltage input time constant (&lt;i&gt;MESU&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,02.
     */
    private Double mesu; // Seconds

    public Double getMesu() {
        return mesu;
    }

    public void setMesu(Double _value_) {
        mesu = _value_;
    }

    public void setMesu(String _value_) {
        mesu = getDoubleFromString(_value_);
    }

    public String mesuToString() {
        return mesu != null ? mesu.toString() : null;
    }

    /**
     * Input time constant (&lt;i&gt;T4M&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 5.
     */
    private Double t4m; // Seconds

    public Double getT4m() {
        return t4m;
    }

    public void setT4m(Double _value_) {
        t4m = _value_;
    }

    public void setT4m(String _value_) {
        t4m = getDoubleFromString(_value_);
    }

    public String t4mToString() {
        return t4m != null ? t4m.toString() : null;
    }

    /**
     * Lead lag time constant (&lt;i&gt;TC&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,02.
     */
    private Double tc; // Seconds

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    public void setTc(String _value_) {
        tc = getDoubleFromString(_value_);
    }

    public String tcToString() {
        return tc != null ? tc.toString() : null;
    }

    /**
     * Lead lag time constant (&lt;i&gt;TE&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,22.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    public void setTe(String _value_) {
        te = getDoubleFromString(_value_);
    }

    public String teToString() {
        return te != null ? te.toString() : null;
    }

    /**
     * Exciter time constant (&lt;i&gt;TF&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,01.
     */
    private Double tf; // Seconds

    public Double getTf() {
        return tf;
    }

    public void setTf(Double _value_) {
        tf = _value_;
    }

    public void setTf(String _value_) {
        tf = getDoubleFromString(_value_);
    }

    public String tfToString() {
        return tf != null ? tf.toString() : null;
    }

    /**
     * Maximum voltage reference limit (&lt;i&gt;UCMAX&lt;/i&gt;) (&amp;gt; ExcRQB.ucmin).  Typical value = 1,1.
     */
    private Double ucmax; // PU

    public Double getUcmax() {
        return ucmax;
    }

    public void setUcmax(Double _value_) {
        ucmax = _value_;
    }

    public void setUcmax(String _value_) {
        ucmax = getDoubleFromString(_value_);
    }

    public String ucmaxToString() {
        return ucmax != null ? ucmax.toString() : null;
    }

    /**
     * Minimum voltage reference limit (&lt;i&gt;UCMIN&lt;/i&gt;) (&amp;lt; ExcRQB.ucmax).  Typical value = 0,9.
     */
    private Double ucmin; // PU

    public Double getUcmin() {
        return ucmin;
    }

    public void setUcmin(Double _value_) {
        ucmin = _value_;
    }

    public void setUcmin(String _value_) {
        ucmin = getDoubleFromString(_value_);
    }

    public String ucminToString() {
        return ucmin != null ? ucmin.toString() : null;
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
        return getAttribute("ExcRQB", attrName);
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
        setAttribute("ExcRQB", attrName, objectValue);
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
        setAttribute("ExcRQB", attrName, stringValue);
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
            map.put("ki0", new AttrDetails("ExcRQB.ki0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki1", new AttrDetails("ExcRQB.ki1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("klir", new AttrDetails("ExcRQB.klir", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("klus", new AttrDetails("ExcRQB.klus", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lsat", new AttrDetails("ExcRQB.lsat", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lus", new AttrDetails("ExcRQB.lus", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mesu", new AttrDetails("ExcRQB.mesu", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4m", new AttrDetails("ExcRQB.t4m", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("ExcRQB.tc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcRQB.te", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("ExcRQB.tf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ucmax", new AttrDetails("ExcRQB.ucmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ucmin", new AttrDetails("ExcRQB.ucmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcRQB().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("ki0", new GetterSetter(this::ki0ToString, null, this::setKi0));
        map.put("ki1", new GetterSetter(this::ki1ToString, null, this::setKi1));
        map.put("klir", new GetterSetter(this::klirToString, null, this::setKlir));
        map.put("klus", new GetterSetter(this::klusToString, null, this::setKlus));
        map.put("lsat", new GetterSetter(this::lsatToString, null, this::setLsat));
        map.put("lus", new GetterSetter(this::lusToString, null, this::setLus));
        map.put("mesu", new GetterSetter(this::mesuToString, null, this::setMesu));
        map.put("t4m", new GetterSetter(this::t4mToString, null, this::setT4m));
        map.put("tc", new GetterSetter(this::tcToString, null, this::setTc));
        map.put("te", new GetterSetter(this::teToString, null, this::setTe));
        map.put("tf", new GetterSetter(this::tfToString, null, this::setTf));
        map.put("ucmax", new GetterSetter(this::ucmaxToString, null, this::setUcmax));
        map.put("ucmin", new GetterSetter(this::ucminToString, null, this::setUcmin));
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
