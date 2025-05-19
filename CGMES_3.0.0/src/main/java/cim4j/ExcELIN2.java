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
 * Detailed excitation system ELIN (VATECH).  This model represents an all-static excitation system. A PI voltage controller establishes a desired field current set point for a proportional current controller. The integrator of the PI controller has a follow-up input to match its signal to the present field current.  Power system stabilizer models used in conjunction with this excitation system model: PssELIN2, PssIEEE2B, Pss2B.
 */
@SuppressWarnings("unused")
public class ExcELIN2 extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcELIN2.class);

    /**
     * Default constructor.
     */
    public ExcELIN2() {
        setCimType("ExcELIN2");
    }

    /**
     * Gain (&lt;i&gt;Efdbas&lt;/i&gt;).  Typical value = 0,1.
     */
    private Double efdbas; // PU

    public Double getEfdbas() {
        return efdbas;
    }

    public void setEfdbas(Double _value_) {
        efdbas = _value_;
    }

    public void setEfdbas(String _value_) {
        efdbas = getDoubleFromString(_value_);
    }

    public String efdbasToString() {
        return efdbas != null ? efdbas.toString() : null;
    }

    /**
     * Limiter (&lt;i&gt;I&lt;/i&gt;&lt;i&gt;&lt;sub&gt;efmax&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; ExcELIN2.iefmin).  Typical value = 1.
     */
    private Double iefmax; // PU

    public Double getIefmax() {
        return iefmax;
    }

    public void setIefmax(Double _value_) {
        iefmax = _value_;
    }

    public void setIefmax(String _value_) {
        iefmax = getDoubleFromString(_value_);
    }

    public String iefmaxToString() {
        return iefmax != null ? iefmax.toString() : null;
    }

    /**
     * Minimum open circuit excitation voltage (&lt;i&gt;I&lt;/i&gt;&lt;i&gt;&lt;sub&gt;efmax2&lt;/sub&gt;&lt;/i&gt;).  Typical value = -5.
     */
    private Double iefmax2; // PU

    public Double getIefmax2() {
        return iefmax2;
    }

    public void setIefmax2(Double _value_) {
        iefmax2 = _value_;
    }

    public void setIefmax2(String _value_) {
        iefmax2 = getDoubleFromString(_value_);
    }

    public String iefmax2ToString() {
        return iefmax2 != null ? iefmax2.toString() : null;
    }

    /**
     * Limiter (&lt;i&gt;I&lt;/i&gt;&lt;i&gt;&lt;sub&gt;efmin&lt;/sub&gt;&lt;/i&gt;) (&amp;lt; ExcELIN2.iefmax).  Typical value = 1.
     */
    private Double iefmin; // PU

    public Double getIefmin() {
        return iefmin;
    }

    public void setIefmin(Double _value_) {
        iefmin = _value_;
    }

    public void setIefmin(String _value_) {
        iefmin = getDoubleFromString(_value_);
    }

    public String iefminToString() {
        return iefmin != null ? iefmin.toString() : null;
    }

    /**
     * Voltage regulator input gain (&lt;i&gt;K1&lt;/i&gt;).  Typical value = 0.
     */
    private Double k1; // PU

    public Double getK1() {
        return k1;
    }

    public void setK1(Double _value_) {
        k1 = _value_;
    }

    public void setK1(String _value_) {
        k1 = getDoubleFromString(_value_);
    }

    public String k1ToString() {
        return k1 != null ? k1.toString() : null;
    }

    /**
     * Voltage regulator input limit (&lt;i&gt;K1ec&lt;/i&gt;).  Typical value = 2.
     */
    private Double k1ec; // PU

    public Double getK1ec() {
        return k1ec;
    }

    public void setK1ec(Double _value_) {
        k1ec = _value_;
    }

    public void setK1ec(String _value_) {
        k1ec = getDoubleFromString(_value_);
    }

    public String k1ecToString() {
        return k1ec != null ? k1ec.toString() : null;
    }

    /**
     * Gain (&lt;i&gt;K2&lt;/i&gt;).  Typical value = 5.
     */
    private Double k2; // PU

    public Double getK2() {
        return k2;
    }

    public void setK2(Double _value_) {
        k2 = _value_;
    }

    public void setK2(String _value_) {
        k2 = getDoubleFromString(_value_);
    }

    public String k2ToString() {
        return k2 != null ? k2.toString() : null;
    }

    /**
     * Gain (&lt;i&gt;K3&lt;/i&gt;).  Typical value = 0,1.
     */
    private Double k3; // PU

    public Double getK3() {
        return k3;
    }

    public void setK3(Double _value_) {
        k3 = _value_;
    }

    public void setK3(String _value_) {
        k3 = getDoubleFromString(_value_);
    }

    public String k3ToString() {
        return k3 != null ? k3.toString() : null;
    }

    /**
     * Gain (&lt;i&gt;K4&lt;/i&gt;).  Typical value = 0.
     */
    private Double k4; // PU

    public Double getK4() {
        return k4;
    }

    public void setK4(Double _value_) {
        k4 = _value_;
    }

    public void setK4(String _value_) {
        k4 = getDoubleFromString(_value_);
    }

    public String k4ToString() {
        return k4 != null ? k4.toString() : null;
    }

    /**
     * Voltage controller derivative gain (&lt;i&gt;Kd1&lt;/i&gt;).  Typical value = 34,5.
     */
    private Double kd1; // PU

    public Double getKd1() {
        return kd1;
    }

    public void setKd1(Double _value_) {
        kd1 = _value_;
    }

    public void setKd1(String _value_) {
        kd1 = getDoubleFromString(_value_);
    }

    public String kd1ToString() {
        return kd1 != null ? kd1.toString() : null;
    }

    /**
     * Gain (&lt;i&gt;Ke2&lt;/i&gt;).  Typical value = 0,1.
     */
    private Double ke2; // PU

    public Double getKe2() {
        return ke2;
    }

    public void setKe2(Double _value_) {
        ke2 = _value_;
    }

    public void setKe2(String _value_) {
        ke2 = getDoubleFromString(_value_);
    }

    public String ke2ToString() {
        return ke2 != null ? ke2.toString() : null;
    }

    /**
     * Gain (&lt;i&gt;Ketb&lt;/i&gt;).  Typical value = 0,06.
     */
    private Double ketb; // PU

    public Double getKetb() {
        return ketb;
    }

    public void setKetb(Double _value_) {
        ketb = _value_;
    }

    public void setKetb(String _value_) {
        ketb = getDoubleFromString(_value_);
    }

    public String ketbToString() {
        return ketb != null ? ketb.toString() : null;
    }

    /**
     * Controller follow up gain (&lt;i&gt;PID1max&lt;/i&gt;).  Typical value = 2.
     */
    private Double pid1max; // PU

    public Double getPid1max() {
        return pid1max;
    }

    public void setPid1max(Double _value_) {
        pid1max = _value_;
    }

    public void setPid1max(String _value_) {
        pid1max = getDoubleFromString(_value_);
    }

    public String pid1maxToString() {
        return pid1max != null ? pid1max.toString() : null;
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, &lt;i&gt;Ve&lt;/i&gt;&lt;i&gt;&lt;sub&gt;1&lt;/sub&gt;&lt;/i&gt;, back of commutating reactance (&lt;i&gt;Se[Ve&lt;/i&gt;&lt;i&gt;&lt;sub&gt;1&lt;/sub&gt;&lt;/i&gt;&lt;i&gt;]&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double seve1; // PU

    public Double getSeve1() {
        return seve1;
    }

    public void setSeve1(Double _value_) {
        seve1 = _value_;
    }

    public void setSeve1(String _value_) {
        seve1 = getDoubleFromString(_value_);
    }

    public String seve1ToString() {
        return seve1 != null ? seve1.toString() : null;
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, &lt;i&gt;Ve&lt;/i&gt;&lt;i&gt;&lt;sub&gt;2&lt;/sub&gt;&lt;/i&gt;, back of commutating reactance (&lt;i&gt;Se[Ve&lt;/i&gt;&lt;i&gt;&lt;sub&gt;2&lt;/sub&gt;&lt;/i&gt;&lt;i&gt;]&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 1.
     */
    private Double seve2; // PU

    public Double getSeve2() {
        return seve2;
    }

    public void setSeve2(Double _value_) {
        seve2 = _value_;
    }

    public void setSeve2(String _value_) {
        seve2 = getDoubleFromString(_value_);
    }

    public String seve2ToString() {
        return seve2 != null ? seve2.toString() : null;
    }

    /**
     * Voltage controller derivative washout time constant (&lt;i&gt;Tb1&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 12,45.
     */
    private Double tb1; // Seconds

    public Double getTb1() {
        return tb1;
    }

    public void setTb1(Double _value_) {
        tb1 = _value_;
    }

    public void setTb1(String _value_) {
        tb1 = getDoubleFromString(_value_);
    }

    public String tb1ToString() {
        return tb1 != null ? tb1.toString() : null;
    }

    /**
     * Time constant (&lt;i&gt;Te&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
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
     * Time Constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;e2&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 1.
     */
    private Double te2; // Seconds

    public Double getTe2() {
        return te2;
    }

    public void setTe2(Double _value_) {
        te2 = _value_;
    }

    public void setTe2(String _value_) {
        te2 = getDoubleFromString(_value_);
    }

    public String te2ToString() {
        return te2 != null ? te2.toString() : null;
    }

    /**
     * Controller follow up deadband (&lt;i&gt;Ti1&lt;/i&gt;).  Typical value = 0.
     */
    private Double ti1; // PU

    public Double getTi1() {
        return ti1;
    }

    public void setTi1(Double _value_) {
        ti1 = _value_;
    }

    public void setTi1(String _value_) {
        ti1 = getDoubleFromString(_value_);
    }

    public String ti1ToString() {
        return ti1 != null ? ti1.toString() : null;
    }

    /**
     * Time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;i3&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 3.
     */
    private Double ti3; // Seconds

    public Double getTi3() {
        return ti3;
    }

    public void setTi3(Double _value_) {
        ti3 = _value_;
    }

    public void setTi3(String _value_) {
        ti3 = getDoubleFromString(_value_);
    }

    public String ti3ToString() {
        return ti3 != null ? ti3.toString() : null;
    }

    /**
     * Time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;i4&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double ti4; // Seconds

    public Double getTi4() {
        return ti4;
    }

    public void setTi4(Double _value_) {
        ti4 = _value_;
    }

    public void setTi4(String _value_) {
        ti4 = getDoubleFromString(_value_);
    }

    public String ti4ToString() {
        return ti4 != null ? ti4.toString() : null;
    }

    /**
     * Time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;r4&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 1.
     */
    private Double tr4; // Seconds

    public Double getTr4() {
        return tr4;
    }

    public void setTr4(Double _value_) {
        tr4 = _value_;
    }

    public void setTr4(String _value_) {
        tr4 = getDoubleFromString(_value_);
    }

    public String tr4ToString() {
        return tr4 != null ? tr4.toString() : null;
    }

    /**
     * Limiter (&lt;i&gt;Upmax&lt;/i&gt;) (&amp;gt; ExcELIN2.upmin).  Typical value = 3.
     */
    private Double upmax; // PU

    public Double getUpmax() {
        return upmax;
    }

    public void setUpmax(Double _value_) {
        upmax = _value_;
    }

    public void setUpmax(String _value_) {
        upmax = getDoubleFromString(_value_);
    }

    public String upmaxToString() {
        return upmax != null ? upmax.toString() : null;
    }

    /**
     * Limiter (&lt;i&gt;Upmin&lt;/i&gt;) (&amp;lt; ExcELIN2.upmax).  Typical value = 0.
     */
    private Double upmin; // PU

    public Double getUpmin() {
        return upmin;
    }

    public void setUpmin(Double _value_) {
        upmin = _value_;
    }

    public void setUpmin(String _value_) {
        upmin = getDoubleFromString(_value_);
    }

    public String upminToString() {
        return upmin != null ? upmin.toString() : null;
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (&lt;i&gt;Ve&lt;/i&gt;&lt;i&gt;&lt;sub&gt;1&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; 0).  Typical value = 3.
     */
    private Double ve1; // PU

    public Double getVe1() {
        return ve1;
    }

    public void setVe1(Double _value_) {
        ve1 = _value_;
    }

    public void setVe1(String _value_) {
        ve1 = getDoubleFromString(_value_);
    }

    public String ve1ToString() {
        return ve1 != null ? ve1.toString() : null;
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (&lt;i&gt;Ve&lt;/i&gt;&lt;i&gt;&lt;sub&gt;2&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; 0).  Typical value = 0.
     */
    private Double ve2; // PU

    public Double getVe2() {
        return ve2;
    }

    public void setVe2(Double _value_) {
        ve2 = _value_;
    }

    public void setVe2(String _value_) {
        ve2 = getDoubleFromString(_value_);
    }

    public String ve2ToString() {
        return ve2 != null ? ve2.toString() : null;
    }

    /**
     * Excitation transformer effective reactance (&lt;i&gt;Xp&lt;/i&gt;).  Typical value = 1.
     */
    private Double xp; // PU

    public Double getXp() {
        return xp;
    }

    public void setXp(Double _value_) {
        xp = _value_;
    }

    public void setXp(String _value_) {
        xp = getDoubleFromString(_value_);
    }

    public String xpToString() {
        return xp != null ? xp.toString() : null;
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
        return getAttribute("ExcELIN2", attrName);
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
        setAttribute("ExcELIN2", attrName, objectValue);
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
        setAttribute("ExcELIN2", attrName, stringValue);
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
            map.put("efdbas", new AttrDetails("ExcELIN2.efdbas", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("iefmax", new AttrDetails("ExcELIN2.iefmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("iefmax2", new AttrDetails("ExcELIN2.iefmax2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("iefmin", new AttrDetails("ExcELIN2.iefmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k1", new AttrDetails("ExcELIN2.k1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k1ec", new AttrDetails("ExcELIN2.k1ec", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k2", new AttrDetails("ExcELIN2.k2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k3", new AttrDetails("ExcELIN2.k3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k4", new AttrDetails("ExcELIN2.k4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd1", new AttrDetails("ExcELIN2.kd1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke2", new AttrDetails("ExcELIN2.ke2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ketb", new AttrDetails("ExcELIN2.ketb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pid1max", new AttrDetails("ExcELIN2.pid1max", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve1", new AttrDetails("ExcELIN2.seve1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve2", new AttrDetails("ExcELIN2.seve2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb1", new AttrDetails("ExcELIN2.tb1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcELIN2.te", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te2", new AttrDetails("ExcELIN2.te2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti1", new AttrDetails("ExcELIN2.ti1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti3", new AttrDetails("ExcELIN2.ti3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti4", new AttrDetails("ExcELIN2.ti4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tr4", new AttrDetails("ExcELIN2.tr4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("upmax", new AttrDetails("ExcELIN2.upmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("upmin", new AttrDetails("ExcELIN2.upmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve1", new AttrDetails("ExcELIN2.ve1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve2", new AttrDetails("ExcELIN2.ve2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xp", new AttrDetails("ExcELIN2.xp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcELIN2().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("efdbas", new GetterSetter(this::efdbasToString, null, this::setEfdbas));
        map.put("iefmax", new GetterSetter(this::iefmaxToString, null, this::setIefmax));
        map.put("iefmax2", new GetterSetter(this::iefmax2ToString, null, this::setIefmax2));
        map.put("iefmin", new GetterSetter(this::iefminToString, null, this::setIefmin));
        map.put("k1", new GetterSetter(this::k1ToString, null, this::setK1));
        map.put("k1ec", new GetterSetter(this::k1ecToString, null, this::setK1ec));
        map.put("k2", new GetterSetter(this::k2ToString, null, this::setK2));
        map.put("k3", new GetterSetter(this::k3ToString, null, this::setK3));
        map.put("k4", new GetterSetter(this::k4ToString, null, this::setK4));
        map.put("kd1", new GetterSetter(this::kd1ToString, null, this::setKd1));
        map.put("ke2", new GetterSetter(this::ke2ToString, null, this::setKe2));
        map.put("ketb", new GetterSetter(this::ketbToString, null, this::setKetb));
        map.put("pid1max", new GetterSetter(this::pid1maxToString, null, this::setPid1max));
        map.put("seve1", new GetterSetter(this::seve1ToString, null, this::setSeve1));
        map.put("seve2", new GetterSetter(this::seve2ToString, null, this::setSeve2));
        map.put("tb1", new GetterSetter(this::tb1ToString, null, this::setTb1));
        map.put("te", new GetterSetter(this::teToString, null, this::setTe));
        map.put("te2", new GetterSetter(this::te2ToString, null, this::setTe2));
        map.put("ti1", new GetterSetter(this::ti1ToString, null, this::setTi1));
        map.put("ti3", new GetterSetter(this::ti3ToString, null, this::setTi3));
        map.put("ti4", new GetterSetter(this::ti4ToString, null, this::setTi4));
        map.put("tr4", new GetterSetter(this::tr4ToString, null, this::setTr4));
        map.put("upmax", new GetterSetter(this::upmaxToString, null, this::setUpmax));
        map.put("upmin", new GetterSetter(this::upminToString, null, this::setUpmin));
        map.put("ve1", new GetterSetter(this::ve1ToString, null, this::setVe1));
        map.put("ve2", new GetterSetter(this::ve2ToString, null, this::setVe2));
        map.put("xp", new GetterSetter(this::xpToString, null, this::setXp));
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
