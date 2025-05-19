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
 * The class represents the Type UEL2 which has either a straight-line or multi-segment characteristic when plotted in terms of machine reactive power output vs. real power output.  Reference: IEEE UEL2 421.5-2005 Section 10.2.  (Limit characteristic lookup table shown in Figure 10.4 (p 32) of the standard).
 */
@SuppressWarnings("unused")
public class UnderexcLimIEEE2 extends UnderexcitationLimiterDynamics {

    private static final Logging LOG = Logging.getLogger(UnderexcLimIEEE2.class);

    /**
     * Default constructor.
     */
    public UnderexcLimIEEE2() {
        setCimType("UnderexcLimIEEE2");
    }

    /**
     * UEL terminal voltage exponent applied to real power input to UEL limit look-up table (k1).  Typical Value = 2.
     */
    private Double k1; // Simple_Float

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
     * UEL terminal voltage exponent applied to reactive power output from UEL limit look-up table (k2).  Typical Value = 2.
     */
    private Double k2; // Simple_Float

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
     * Gain associated with optional integrator feedback input signal to UEL (K).  Typical Value = 0.
     */
    private Double kfb; // PU

    public Double getKfb() {
        return kfb;
    }

    public void setKfb(Double _value_) {
        kfb = _value_;
    }

    public void setKfb(String _value_) {
        kfb = getDoubleFromString(_value_);
    }

    public String kfbToString() {
        return kfb != null ? kfb.toString() : null;
    }

    /**
     * UEL excitation system stabilizer gain (K).  Typical Value = 0.
     */
    private Double kuf; // PU

    public Double getKuf() {
        return kuf;
    }

    public void setKuf(Double _value_) {
        kuf = _value_;
    }

    public void setKuf(String _value_) {
        kuf = getDoubleFromString(_value_);
    }

    public String kufToString() {
        return kuf != null ? kuf.toString() : null;
    }

    /**
     * UEL integral gain (K).  Typical Value = 0.5.
     */
    private Double kui; // PU

    public Double getKui() {
        return kui;
    }

    public void setKui(Double _value_) {
        kui = _value_;
    }

    public void setKui(String _value_) {
        kui = getDoubleFromString(_value_);
    }

    public String kuiToString() {
        return kui != null ? kui.toString() : null;
    }

    /**
     * UEL proportional gain (K).  Typical Value = 0.8.
     */
    private Double kul; // PU

    public Double getKul() {
        return kul;
    }

    public void setKul(Double _value_) {
        kul = _value_;
    }

    public void setKul(String _value_) {
        kul = getDoubleFromString(_value_);
    }

    public String kulToString() {
        return kul != null ? kul.toString() : null;
    }

    /**
     * Real power values for endpoints (P).  Typical Value = 0.
     */
    private Double p0; // PU

    public Double getP0() {
        return p0;
    }

    public void setP0(Double _value_) {
        p0 = _value_;
    }

    public void setP0(String _value_) {
        p0 = getDoubleFromString(_value_);
    }

    public String p0ToString() {
        return p0 != null ? p0.toString() : null;
    }

    /**
     * Real power values for endpoints (P).  Typical Value = 0.3.
     */
    private Double p1; // PU

    public Double getP1() {
        return p1;
    }

    public void setP1(Double _value_) {
        p1 = _value_;
    }

    public void setP1(String _value_) {
        p1 = getDoubleFromString(_value_);
    }

    public String p1ToString() {
        return p1 != null ? p1.toString() : null;
    }

    /**
     * Real power values for endpoints (P).
     */
    private Double p10; // PU

    public Double getP10() {
        return p10;
    }

    public void setP10(Double _value_) {
        p10 = _value_;
    }

    public void setP10(String _value_) {
        p10 = getDoubleFromString(_value_);
    }

    public String p10ToString() {
        return p10 != null ? p10.toString() : null;
    }

    /**
     * Real power values for endpoints (P).  Typical Value = 0.6.
     */
    private Double p2; // PU

    public Double getP2() {
        return p2;
    }

    public void setP2(Double _value_) {
        p2 = _value_;
    }

    public void setP2(String _value_) {
        p2 = getDoubleFromString(_value_);
    }

    public String p2ToString() {
        return p2 != null ? p2.toString() : null;
    }

    /**
     * Real power values for endpoints (P).  Typical Value = 0.9.
     */
    private Double p3; // PU

    public Double getP3() {
        return p3;
    }

    public void setP3(Double _value_) {
        p3 = _value_;
    }

    public void setP3(String _value_) {
        p3 = getDoubleFromString(_value_);
    }

    public String p3ToString() {
        return p3 != null ? p3.toString() : null;
    }

    /**
     * Real power values for endpoints (P).  Typical Value = 1.02.
     */
    private Double p4; // PU

    public Double getP4() {
        return p4;
    }

    public void setP4(Double _value_) {
        p4 = _value_;
    }

    public void setP4(String _value_) {
        p4 = getDoubleFromString(_value_);
    }

    public String p4ToString() {
        return p4 != null ? p4.toString() : null;
    }

    /**
     * Real power values for endpoints (P).
     */
    private Double p5; // PU

    public Double getP5() {
        return p5;
    }

    public void setP5(Double _value_) {
        p5 = _value_;
    }

    public void setP5(String _value_) {
        p5 = getDoubleFromString(_value_);
    }

    public String p5ToString() {
        return p5 != null ? p5.toString() : null;
    }

    /**
     * Real power values for endpoints (P).
     */
    private Double p6; // PU

    public Double getP6() {
        return p6;
    }

    public void setP6(Double _value_) {
        p6 = _value_;
    }

    public void setP6(String _value_) {
        p6 = getDoubleFromString(_value_);
    }

    public String p6ToString() {
        return p6 != null ? p6.toString() : null;
    }

    /**
     * Real power values for endpoints (P).
     */
    private Double p7; // PU

    public Double getP7() {
        return p7;
    }

    public void setP7(Double _value_) {
        p7 = _value_;
    }

    public void setP7(String _value_) {
        p7 = getDoubleFromString(_value_);
    }

    public String p7ToString() {
        return p7 != null ? p7.toString() : null;
    }

    /**
     * Real power values for endpoints (P).
     */
    private Double p8; // PU

    public Double getP8() {
        return p8;
    }

    public void setP8(Double _value_) {
        p8 = _value_;
    }

    public void setP8(String _value_) {
        p8 = getDoubleFromString(_value_);
    }

    public String p8ToString() {
        return p8 != null ? p8.toString() : null;
    }

    /**
     * Real power values for endpoints (P).
     */
    private Double p9; // PU

    public Double getP9() {
        return p9;
    }

    public void setP9(Double _value_) {
        p9 = _value_;
    }

    public void setP9(String _value_) {
        p9 = getDoubleFromString(_value_);
    }

    public String p9ToString() {
        return p9 != null ? p9.toString() : null;
    }

    /**
     * Reactive power values for endpoints (Q).  Typical Value = -0.31.
     */
    private Double q0; // PU

    public Double getQ0() {
        return q0;
    }

    public void setQ0(Double _value_) {
        q0 = _value_;
    }

    public void setQ0(String _value_) {
        q0 = getDoubleFromString(_value_);
    }

    public String q0ToString() {
        return q0 != null ? q0.toString() : null;
    }

    /**
     * Reactive power values for endpoints (Q).  Typical Value = -0.31.
     */
    private Double q1; // PU

    public Double getQ1() {
        return q1;
    }

    public void setQ1(Double _value_) {
        q1 = _value_;
    }

    public void setQ1(String _value_) {
        q1 = getDoubleFromString(_value_);
    }

    public String q1ToString() {
        return q1 != null ? q1.toString() : null;
    }

    /**
     * Reactive power values for endpoints (Q).
     */
    private Double q10; // PU

    public Double getQ10() {
        return q10;
    }

    public void setQ10(Double _value_) {
        q10 = _value_;
    }

    public void setQ10(String _value_) {
        q10 = getDoubleFromString(_value_);
    }

    public String q10ToString() {
        return q10 != null ? q10.toString() : null;
    }

    /**
     * Reactive power values for endpoints (Q).  Typical Value = -0.28.
     */
    private Double q2; // PU

    public Double getQ2() {
        return q2;
    }

    public void setQ2(Double _value_) {
        q2 = _value_;
    }

    public void setQ2(String _value_) {
        q2 = getDoubleFromString(_value_);
    }

    public String q2ToString() {
        return q2 != null ? q2.toString() : null;
    }

    /**
     * Reactive power values for endpoints (Q).  Typical Value = -0.21.
     */
    private Double q3; // PU

    public Double getQ3() {
        return q3;
    }

    public void setQ3(Double _value_) {
        q3 = _value_;
    }

    public void setQ3(String _value_) {
        q3 = getDoubleFromString(_value_);
    }

    public String q3ToString() {
        return q3 != null ? q3.toString() : null;
    }

    /**
     * Reactive power values for endpoints (Q).  Typical Value = 0.
     */
    private Double q4; // PU

    public Double getQ4() {
        return q4;
    }

    public void setQ4(Double _value_) {
        q4 = _value_;
    }

    public void setQ4(String _value_) {
        q4 = getDoubleFromString(_value_);
    }

    public String q4ToString() {
        return q4 != null ? q4.toString() : null;
    }

    /**
     * Reactive power values for endpoints (Q).
     */
    private Double q5; // PU

    public Double getQ5() {
        return q5;
    }

    public void setQ5(Double _value_) {
        q5 = _value_;
    }

    public void setQ5(String _value_) {
        q5 = getDoubleFromString(_value_);
    }

    public String q5ToString() {
        return q5 != null ? q5.toString() : null;
    }

    /**
     * Reactive power values for endpoints (Q).
     */
    private Double q6; // PU

    public Double getQ6() {
        return q6;
    }

    public void setQ6(Double _value_) {
        q6 = _value_;
    }

    public void setQ6(String _value_) {
        q6 = getDoubleFromString(_value_);
    }

    public String q6ToString() {
        return q6 != null ? q6.toString() : null;
    }

    /**
     * Reactive power values for endpoints (Q).
     */
    private Double q7; // PU

    public Double getQ7() {
        return q7;
    }

    public void setQ7(Double _value_) {
        q7 = _value_;
    }

    public void setQ7(String _value_) {
        q7 = getDoubleFromString(_value_);
    }

    public String q7ToString() {
        return q7 != null ? q7.toString() : null;
    }

    /**
     * Reactive power values for endpoints (Q).
     */
    private Double q8; // PU

    public Double getQ8() {
        return q8;
    }

    public void setQ8(Double _value_) {
        q8 = _value_;
    }

    public void setQ8(String _value_) {
        q8 = getDoubleFromString(_value_);
    }

    public String q8ToString() {
        return q8 != null ? q8.toString() : null;
    }

    /**
     * Reactive power values for endpoints (Q).
     */
    private Double q9; // PU

    public Double getQ9() {
        return q9;
    }

    public void setQ9(Double _value_) {
        q9 = _value_;
    }

    public void setQ9(String _value_) {
        q9 = getDoubleFromString(_value_);
    }

    public String q9ToString() {
        return q9 != null ? q9.toString() : null;
    }

    /**
     * UEL lead time constant (T).  Typical Value = 0.
     */
    private Double tu1; // Seconds

    public Double getTu1() {
        return tu1;
    }

    public void setTu1(Double _value_) {
        tu1 = _value_;
    }

    public void setTu1(String _value_) {
        tu1 = getDoubleFromString(_value_);
    }

    public String tu1ToString() {
        return tu1 != null ? tu1.toString() : null;
    }

    /**
     * UEL lag time constant (T).  Typical Value = 0.
     */
    private Double tu2; // Seconds

    public Double getTu2() {
        return tu2;
    }

    public void setTu2(Double _value_) {
        tu2 = _value_;
    }

    public void setTu2(String _value_) {
        tu2 = getDoubleFromString(_value_);
    }

    public String tu2ToString() {
        return tu2 != null ? tu2.toString() : null;
    }

    /**
     * UEL lead time constant (T).  Typical Value = 0.
     */
    private Double tu3; // Seconds

    public Double getTu3() {
        return tu3;
    }

    public void setTu3(Double _value_) {
        tu3 = _value_;
    }

    public void setTu3(String _value_) {
        tu3 = getDoubleFromString(_value_);
    }

    public String tu3ToString() {
        return tu3 != null ? tu3.toString() : null;
    }

    /**
     * UEL lag time constant (T).  Typical Value = 0.
     */
    private Double tu4; // Seconds

    public Double getTu4() {
        return tu4;
    }

    public void setTu4(Double _value_) {
        tu4 = _value_;
    }

    public void setTu4(String _value_) {
        tu4 = getDoubleFromString(_value_);
    }

    public String tu4ToString() {
        return tu4 != null ? tu4.toString() : null;
    }

    /**
     * Time constant associated with optional integrator feedback input signal to UEL (T).  Typical Value = 0.
     */
    private Double tul; // Seconds

    public Double getTul() {
        return tul;
    }

    public void setTul(Double _value_) {
        tul = _value_;
    }

    public void setTul(String _value_) {
        tul = getDoubleFromString(_value_);
    }

    public String tulToString() {
        return tul != null ? tul.toString() : null;
    }

    /**
     * Real power filter time constant (T).  Typical Value = 5.
     */
    private Double tup; // Seconds

    public Double getTup() {
        return tup;
    }

    public void setTup(Double _value_) {
        tup = _value_;
    }

    public void setTup(String _value_) {
        tup = getDoubleFromString(_value_);
    }

    public String tupToString() {
        return tup != null ? tup.toString() : null;
    }

    /**
     * Reactive power filter time constant (T).  Typical Value = 0.
     */
    private Double tuq; // Seconds

    public Double getTuq() {
        return tuq;
    }

    public void setTuq(Double _value_) {
        tuq = _value_;
    }

    public void setTuq(String _value_) {
        tuq = getDoubleFromString(_value_);
    }

    public String tuqToString() {
        return tuq != null ? tuq.toString() : null;
    }

    /**
     * Voltage filter time constant (T).  Typical Value = 5.
     */
    private Double tuv; // Seconds

    public Double getTuv() {
        return tuv;
    }

    public void setTuv(Double _value_) {
        tuv = _value_;
    }

    public void setTuv(String _value_) {
        tuv = getDoubleFromString(_value_);
    }

    public String tuvToString() {
        return tuv != null ? tuv.toString() : null;
    }

    /**
     * UEL integrator output maximum limit (V).  Typical Value = 0.25.
     */
    private Double vuimax; // PU

    public Double getVuimax() {
        return vuimax;
    }

    public void setVuimax(Double _value_) {
        vuimax = _value_;
    }

    public void setVuimax(String _value_) {
        vuimax = getDoubleFromString(_value_);
    }

    public String vuimaxToString() {
        return vuimax != null ? vuimax.toString() : null;
    }

    /**
     * UEL integrator output minimum limit (V).  Typical Value = 0.
     */
    private Double vuimin; // PU

    public Double getVuimin() {
        return vuimin;
    }

    public void setVuimin(Double _value_) {
        vuimin = _value_;
    }

    public void setVuimin(String _value_) {
        vuimin = getDoubleFromString(_value_);
    }

    public String vuiminToString() {
        return vuimin != null ? vuimin.toString() : null;
    }

    /**
     * UEL output maximum limit (V).  Typical Value = 0.25.
     */
    private Double vulmax; // PU

    public Double getVulmax() {
        return vulmax;
    }

    public void setVulmax(Double _value_) {
        vulmax = _value_;
    }

    public void setVulmax(String _value_) {
        vulmax = getDoubleFromString(_value_);
    }

    public String vulmaxToString() {
        return vulmax != null ? vulmax.toString() : null;
    }

    /**
     * UEL output minimum limit (V).  Typical Value = 0.
     */
    private Double vulmin; // PU

    public Double getVulmin() {
        return vulmin;
    }

    public void setVulmin(Double _value_) {
        vulmin = _value_;
    }

    public void setVulmin(String _value_) {
        vulmin = getDoubleFromString(_value_);
    }

    public String vulminToString() {
        return vulmin != null ? vulmin.toString() : null;
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
        return getAttribute("UnderexcLimIEEE2", attrName);
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
        setAttribute("UnderexcLimIEEE2", attrName, objectValue);
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
        setAttribute("UnderexcLimIEEE2", attrName, stringValue);
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

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/2013/CIM-schema-cim16#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k1", new AttrDetails("UnderexcLimIEEE2.k1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k2", new AttrDetails("UnderexcLimIEEE2.k2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kfb", new AttrDetails("UnderexcLimIEEE2.kfb", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kuf", new AttrDetails("UnderexcLimIEEE2.kuf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kui", new AttrDetails("UnderexcLimIEEE2.kui", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kul", new AttrDetails("UnderexcLimIEEE2.kul", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p0", new AttrDetails("UnderexcLimIEEE2.p0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p1", new AttrDetails("UnderexcLimIEEE2.p1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p10", new AttrDetails("UnderexcLimIEEE2.p10", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p2", new AttrDetails("UnderexcLimIEEE2.p2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p3", new AttrDetails("UnderexcLimIEEE2.p3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p4", new AttrDetails("UnderexcLimIEEE2.p4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p5", new AttrDetails("UnderexcLimIEEE2.p5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p6", new AttrDetails("UnderexcLimIEEE2.p6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p7", new AttrDetails("UnderexcLimIEEE2.p7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p8", new AttrDetails("UnderexcLimIEEE2.p8", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p9", new AttrDetails("UnderexcLimIEEE2.p9", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q0", new AttrDetails("UnderexcLimIEEE2.q0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q1", new AttrDetails("UnderexcLimIEEE2.q1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q10", new AttrDetails("UnderexcLimIEEE2.q10", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q2", new AttrDetails("UnderexcLimIEEE2.q2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q3", new AttrDetails("UnderexcLimIEEE2.q3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q4", new AttrDetails("UnderexcLimIEEE2.q4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q5", new AttrDetails("UnderexcLimIEEE2.q5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q6", new AttrDetails("UnderexcLimIEEE2.q6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q7", new AttrDetails("UnderexcLimIEEE2.q7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q8", new AttrDetails("UnderexcLimIEEE2.q8", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q9", new AttrDetails("UnderexcLimIEEE2.q9", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tu1", new AttrDetails("UnderexcLimIEEE2.tu1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tu2", new AttrDetails("UnderexcLimIEEE2.tu2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tu3", new AttrDetails("UnderexcLimIEEE2.tu3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tu4", new AttrDetails("UnderexcLimIEEE2.tu4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tul", new AttrDetails("UnderexcLimIEEE2.tul", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tup", new AttrDetails("UnderexcLimIEEE2.tup", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tuq", new AttrDetails("UnderexcLimIEEE2.tuq", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tuv", new AttrDetails("UnderexcLimIEEE2.tuv", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vuimax", new AttrDetails("UnderexcLimIEEE2.vuimax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vuimin", new AttrDetails("UnderexcLimIEEE2.vuimin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vulmax", new AttrDetails("UnderexcLimIEEE2.vulmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vulmin", new AttrDetails("UnderexcLimIEEE2.vulmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new UnderexcLimIEEE2().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("k1", new GetterSetter(this::k1ToString, null, this::setK1));
        map.put("k2", new GetterSetter(this::k2ToString, null, this::setK2));
        map.put("kfb", new GetterSetter(this::kfbToString, null, this::setKfb));
        map.put("kuf", new GetterSetter(this::kufToString, null, this::setKuf));
        map.put("kui", new GetterSetter(this::kuiToString, null, this::setKui));
        map.put("kul", new GetterSetter(this::kulToString, null, this::setKul));
        map.put("p0", new GetterSetter(this::p0ToString, null, this::setP0));
        map.put("p1", new GetterSetter(this::p1ToString, null, this::setP1));
        map.put("p10", new GetterSetter(this::p10ToString, null, this::setP10));
        map.put("p2", new GetterSetter(this::p2ToString, null, this::setP2));
        map.put("p3", new GetterSetter(this::p3ToString, null, this::setP3));
        map.put("p4", new GetterSetter(this::p4ToString, null, this::setP4));
        map.put("p5", new GetterSetter(this::p5ToString, null, this::setP5));
        map.put("p6", new GetterSetter(this::p6ToString, null, this::setP6));
        map.put("p7", new GetterSetter(this::p7ToString, null, this::setP7));
        map.put("p8", new GetterSetter(this::p8ToString, null, this::setP8));
        map.put("p9", new GetterSetter(this::p9ToString, null, this::setP9));
        map.put("q0", new GetterSetter(this::q0ToString, null, this::setQ0));
        map.put("q1", new GetterSetter(this::q1ToString, null, this::setQ1));
        map.put("q10", new GetterSetter(this::q10ToString, null, this::setQ10));
        map.put("q2", new GetterSetter(this::q2ToString, null, this::setQ2));
        map.put("q3", new GetterSetter(this::q3ToString, null, this::setQ3));
        map.put("q4", new GetterSetter(this::q4ToString, null, this::setQ4));
        map.put("q5", new GetterSetter(this::q5ToString, null, this::setQ5));
        map.put("q6", new GetterSetter(this::q6ToString, null, this::setQ6));
        map.put("q7", new GetterSetter(this::q7ToString, null, this::setQ7));
        map.put("q8", new GetterSetter(this::q8ToString, null, this::setQ8));
        map.put("q9", new GetterSetter(this::q9ToString, null, this::setQ9));
        map.put("tu1", new GetterSetter(this::tu1ToString, null, this::setTu1));
        map.put("tu2", new GetterSetter(this::tu2ToString, null, this::setTu2));
        map.put("tu3", new GetterSetter(this::tu3ToString, null, this::setTu3));
        map.put("tu4", new GetterSetter(this::tu4ToString, null, this::setTu4));
        map.put("tul", new GetterSetter(this::tulToString, null, this::setTul));
        map.put("tup", new GetterSetter(this::tupToString, null, this::setTup));
        map.put("tuq", new GetterSetter(this::tuqToString, null, this::setTuq));
        map.put("tuv", new GetterSetter(this::tuvToString, null, this::setTuv));
        map.put("vuimax", new GetterSetter(this::vuimaxToString, null, this::setVuimax));
        map.put("vuimin", new GetterSetter(this::vuiminToString, null, this::setVuimin));
        map.put("vulmax", new GetterSetter(this::vulmaxToString, null, this::setVulmax));
        map.put("vulmin", new GetterSetter(this::vulminToString, null, this::setVulmin));
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
