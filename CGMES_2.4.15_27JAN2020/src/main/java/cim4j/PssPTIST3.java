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
 * PTI Microprocessor-Based Stabilizer type 3.
 */
@SuppressWarnings("unused")
public class PssPTIST3 extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssPTIST3.class);

    /**
     * Default constructor.
     */
    public PssPTIST3() {
        setCimType("PssPTIST3");
    }

    /**
     * Filter coefficient (A0).
     */
    private Double a0; // PU

    public Double getA0() {
        return a0;
    }

    public void setA0(Double _value_) {
        a0 = _value_;
    }

    public void setA0(String _value_) {
        a0 = getDoubleFromString(_value_);
    }

    public String a0ToString() {
        return a0 != null ? a0.toString() : null;
    }

    /**
     * Limiter (Al).
     */
    private Double a1; // PU

    public Double getA1() {
        return a1;
    }

    public void setA1(Double _value_) {
        a1 = _value_;
    }

    public void setA1(String _value_) {
        a1 = getDoubleFromString(_value_);
    }

    public String a1ToString() {
        return a1 != null ? a1.toString() : null;
    }

    /**
     * Filter coefficient (A2).
     */
    private Double a2; // PU

    public Double getA2() {
        return a2;
    }

    public void setA2(Double _value_) {
        a2 = _value_;
    }

    public void setA2(String _value_) {
        a2 = getDoubleFromString(_value_);
    }

    public String a2ToString() {
        return a2 != null ? a2.toString() : null;
    }

    /**
     * Filter coefficient (A3).
     */
    private Double a3; // PU

    public Double getA3() {
        return a3;
    }

    public void setA3(Double _value_) {
        a3 = _value_;
    }

    public void setA3(String _value_) {
        a3 = getDoubleFromString(_value_);
    }

    public String a3ToString() {
        return a3 != null ? a3.toString() : null;
    }

    /**
     * Filter coefficient (A4).
     */
    private Double a4; // PU

    public Double getA4() {
        return a4;
    }

    public void setA4(Double _value_) {
        a4 = _value_;
    }

    public void setA4(String _value_) {
        a4 = getDoubleFromString(_value_);
    }

    public String a4ToString() {
        return a4 != null ? a4.toString() : null;
    }

    /**
     * Filter coefficient (A5).
     */
    private Double a5; // PU

    public Double getA5() {
        return a5;
    }

    public void setA5(Double _value_) {
        a5 = _value_;
    }

    public void setA5(String _value_) {
        a5 = getDoubleFromString(_value_);
    }

    public String a5ToString() {
        return a5 != null ? a5.toString() : null;
    }

    /**
     * Limiter (Al).
     */
    private Double al; // PU

    public Double getAl() {
        return al;
    }

    public void setAl(Double _value_) {
        al = _value_;
    }

    public void setAl(String _value_) {
        al = getDoubleFromString(_value_);
    }

    public String alToString() {
        return al != null ? al.toString() : null;
    }

    /**
     * Threshold value above which output averaging will be bypassed (Athres).  Typical Value = 0.005.
     */
    private Double athres; // PU

    public Double getAthres() {
        return athres;
    }

    public void setAthres(Double _value_) {
        athres = _value_;
    }

    public void setAthres(String _value_) {
        athres = getDoubleFromString(_value_);
    }

    public String athresToString() {
        return athres != null ? athres.toString() : null;
    }

    /**
     * Filter coefficient (B0).
     */
    private Double b0; // PU

    public Double getB0() {
        return b0;
    }

    public void setB0(Double _value_) {
        b0 = _value_;
    }

    public void setB0(String _value_) {
        b0 = getDoubleFromString(_value_);
    }

    public String b0ToString() {
        return b0 != null ? b0.toString() : null;
    }

    /**
     * Filter coefficient (B1).
     */
    private Double b1; // PU

    public Double getB1() {
        return b1;
    }

    public void setB1(Double _value_) {
        b1 = _value_;
    }

    public void setB1(String _value_) {
        b1 = getDoubleFromString(_value_);
    }

    public String b1ToString() {
        return b1 != null ? b1.toString() : null;
    }

    /**
     * Filter coefficient (B2).
     */
    private Double b2; // PU

    public Double getB2() {
        return b2;
    }

    public void setB2(Double _value_) {
        b2 = _value_;
    }

    public void setB2(String _value_) {
        b2 = getDoubleFromString(_value_);
    }

    public String b2ToString() {
        return b2 != null ? b2.toString() : null;
    }

    /**
     * Filter coefficient (B3).
     */
    private Double b3; // PU

    public Double getB3() {
        return b3;
    }

    public void setB3(Double _value_) {
        b3 = _value_;
    }

    public void setB3(String _value_) {
        b3 = getDoubleFromString(_value_);
    }

    public String b3ToString() {
        return b3 != null ? b3.toString() : null;
    }

    /**
     * Filter coefficient (B4).
     */
    private Double b4; // PU

    public Double getB4() {
        return b4;
    }

    public void setB4(Double _value_) {
        b4 = _value_;
    }

    public void setB4(String _value_) {
        b4 = getDoubleFromString(_value_);
    }

    public String b4ToString() {
        return b4 != null ? b4.toString() : null;
    }

    /**
     * Filter coefficient (B5).
     */
    private Double b5; // PU

    public Double getB5() {
        return b5;
    }

    public void setB5(Double _value_) {
        b5 = _value_;
    }

    public void setB5(String _value_) {
        b5 = getDoubleFromString(_value_);
    }

    public String b5ToString() {
        return b5 != null ? b5.toString() : null;
    }

    /**
     * Limiter (Dl).
     */
    private Double dl; // PU

    public Double getDl() {
        return dl;
    }

    public void setDl(Double _value_) {
        dl = _value_;
    }

    public void setDl(String _value_) {
        dl = getDoubleFromString(_value_);
    }

    public String dlToString() {
        return dl != null ? dl.toString() : null;
    }

    /**
     * Time step related to activation of controls (0.03 for 50 Hz) (Dtc).  Typical Value = 0.025.
     */
    private Double dtc; // Seconds

    public Double getDtc() {
        return dtc;
    }

    public void setDtc(Double _value_) {
        dtc = _value_;
    }

    public void setDtc(String _value_) {
        dtc = getDoubleFromString(_value_);
    }

    public String dtcToString() {
        return dtc != null ? dtc.toString() : null;
    }

    /**
     * Time step frequency calculation (0.03 for 50 Hz) (Dtf).  Typical Value = 0.025.
     */
    private Double dtf; // Seconds

    public Double getDtf() {
        return dtf;
    }

    public void setDtf(Double _value_) {
        dtf = _value_;
    }

    public void setDtf(String _value_) {
        dtf = getDoubleFromString(_value_);
    }

    public String dtfToString() {
        return dtf != null ? dtf.toString() : null;
    }

    /**
     * Time step active power calculation (0.015 for 50 Hz) (Dtp).  Typical Value = 0.0125.
     */
    private Double dtp; // Seconds

    public Double getDtp() {
        return dtp;
    }

    public void setDtp(Double _value_) {
        dtp = _value_;
    }

    public void setDtp(String _value_) {
        dtp = getDoubleFromString(_value_);
    }

    public String dtpToString() {
        return dtp != null ? dtp.toString() : null;
    }

    /**
     * Digital/analog output switch (Isw). true = produce analog output false = convert to digital output, using tap selection table.
     */
    private Boolean isw; // Boolean

    public Boolean getIsw() {
        return isw;
    }

    public void setIsw(Boolean _value_) {
        isw = _value_;
    }

    public void setIsw(String _value_) {
        isw = getBooleanFromString(_value_);
    }

    public String iswToString() {
        return isw != null ? isw.toString() : null;
    }

    /**
     * Gain (K).  Typical Value = 9.
     */
    private Double k; // PU

    public Double getK() {
        return k;
    }

    public void setK(Double _value_) {
        k = _value_;
    }

    public void setK(String _value_) {
        k = getDoubleFromString(_value_);
    }

    public String kToString() {
        return k != null ? k.toString() : null;
    }

    /**
     * Threshold value (Lthres).
     */
    private Double lthres; // PU

    public Double getLthres() {
        return lthres;
    }

    public void setLthres(Double _value_) {
        lthres = _value_;
    }

    public void setLthres(String _value_) {
        lthres = getDoubleFromString(_value_);
    }

    public String lthresToString() {
        return lthres != null ? lthres.toString() : null;
    }

    /**
     * (M).  M=2*H.  Typical Value = 5.
     */
    private Double m; // PU

    public Double getM() {
        return m;
    }

    public void setM(Double _value_) {
        m = _value_;
    }

    public void setM(String _value_) {
        m = getDoubleFromString(_value_);
    }

    public String mToString() {
        return m != null ? m.toString() : null;
    }

    /**
     * Number of control outputs to average (Nav) (1 &lt;= Nav &lt;= 16).  Typical Value = 4.
     */
    private Double nav; // Simple_Float

    public Double getNav() {
        return nav;
    }

    public void setNav(Double _value_) {
        nav = _value_;
    }

    public void setNav(String _value_) {
        nav = getDoubleFromString(_value_);
    }

    public String navToString() {
        return nav != null ? nav.toString() : null;
    }

    /**
     * Number of counts at limit to active limit function (Ncl) (&gt;0).
     */
    private Double ncl; // Simple_Float

    public Double getNcl() {
        return ncl;
    }

    public void setNcl(Double _value_) {
        ncl = _value_;
    }

    public void setNcl(String _value_) {
        ncl = getDoubleFromString(_value_);
    }

    public String nclToString() {
        return ncl != null ? ncl.toString() : null;
    }

    /**
     * Number of counts until reset after limit function is triggered (Ncr).
     */
    private Double ncr; // Simple_Float

    public Double getNcr() {
        return ncr;
    }

    public void setNcr(Double _value_) {
        ncr = _value_;
    }

    public void setNcr(String _value_) {
        ncr = getDoubleFromString(_value_);
    }

    public String ncrToString() {
        return ncr != null ? ncr.toString() : null;
    }

    /**
     * (Pmin).
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
     * Time constant (T1).  Typical Value = 0.3.
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
     * Time constant (T2).  Typical Value = 1.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    public void setT2(String _value_) {
        t2 = getDoubleFromString(_value_);
    }

    public String t2ToString() {
        return t2 != null ? t2.toString() : null;
    }

    /**
     * Time constant (T3).  Typical Value = 0.2.
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    public void setT3(String _value_) {
        t3 = getDoubleFromString(_value_);
    }

    public String t3ToString() {
        return t3 != null ? t3.toString() : null;
    }

    /**
     * Time constant (T4).  Typical Value = 0.05.
     */
    private Double t4; // Seconds

    public Double getT4() {
        return t4;
    }

    public void setT4(Double _value_) {
        t4 = _value_;
    }

    public void setT4(String _value_) {
        t4 = getDoubleFromString(_value_);
    }

    public String t4ToString() {
        return t4 != null ? t4.toString() : null;
    }

    /**
     * Time constant (T5).
     */
    private Double t5; // Seconds

    public Double getT5() {
        return t5;
    }

    public void setT5(Double _value_) {
        t5 = _value_;
    }

    public void setT5(String _value_) {
        t5 = getDoubleFromString(_value_);
    }

    public String t5ToString() {
        return t5 != null ? t5.toString() : null;
    }

    /**
     * Time constant (T6).
     */
    private Double t6; // Seconds

    public Double getT6() {
        return t6;
    }

    public void setT6(Double _value_) {
        t6 = _value_;
    }

    public void setT6(String _value_) {
        t6 = getDoubleFromString(_value_);
    }

    public String t6ToString() {
        return t6 != null ? t6.toString() : null;
    }

    /**
     * Time constant (Tf).  Typical Value = 0.2.
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
     * Time constant (Tp).  Typical Value = 0.2.
     */
    private Double tp; // Seconds

    public Double getTp() {
        return tp;
    }

    public void setTp(Double _value_) {
        tp = _value_;
    }

    public void setTp(String _value_) {
        tp = getDoubleFromString(_value_);
    }

    public String tpToString() {
        return tp != null ? tp.toString() : null;
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
        return getAttribute("PssPTIST3", attrName);
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
        setAttribute("PssPTIST3", attrName, objectValue);
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
        setAttribute("PssPTIST3", attrName, stringValue);
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
            map.put("a0", new AttrDetails("PssPTIST3.a0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a1", new AttrDetails("PssPTIST3.a1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a2", new AttrDetails("PssPTIST3.a2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a3", new AttrDetails("PssPTIST3.a3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a4", new AttrDetails("PssPTIST3.a4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a5", new AttrDetails("PssPTIST3.a5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("al", new AttrDetails("PssPTIST3.al", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("athres", new AttrDetails("PssPTIST3.athres", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("b0", new AttrDetails("PssPTIST3.b0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("b1", new AttrDetails("PssPTIST3.b1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("b2", new AttrDetails("PssPTIST3.b2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("b3", new AttrDetails("PssPTIST3.b3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("b4", new AttrDetails("PssPTIST3.b4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("b5", new AttrDetails("PssPTIST3.b5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dl", new AttrDetails("PssPTIST3.dl", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dtc", new AttrDetails("PssPTIST3.dtc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dtf", new AttrDetails("PssPTIST3.dtf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dtp", new AttrDetails("PssPTIST3.dtp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("isw", new AttrDetails("PssPTIST3.isw", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k", new AttrDetails("PssPTIST3.k", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lthres", new AttrDetails("PssPTIST3.lthres", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("m", new AttrDetails("PssPTIST3.m", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("nav", new AttrDetails("PssPTIST3.nav", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ncl", new AttrDetails("PssPTIST3.ncl", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ncr", new AttrDetails("PssPTIST3.ncr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmin", new AttrDetails("PssPTIST3.pmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("PssPTIST3.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("PssPTIST3.t2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("PssPTIST3.t3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("PssPTIST3.t4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5", new AttrDetails("PssPTIST3.t5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t6", new AttrDetails("PssPTIST3.t6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("PssPTIST3.tf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tp", new AttrDetails("PssPTIST3.tp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PssPTIST3().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("a0", new GetterSetter(this::a0ToString, null, this::setA0));
        map.put("a1", new GetterSetter(this::a1ToString, null, this::setA1));
        map.put("a2", new GetterSetter(this::a2ToString, null, this::setA2));
        map.put("a3", new GetterSetter(this::a3ToString, null, this::setA3));
        map.put("a4", new GetterSetter(this::a4ToString, null, this::setA4));
        map.put("a5", new GetterSetter(this::a5ToString, null, this::setA5));
        map.put("al", new GetterSetter(this::alToString, null, this::setAl));
        map.put("athres", new GetterSetter(this::athresToString, null, this::setAthres));
        map.put("b0", new GetterSetter(this::b0ToString, null, this::setB0));
        map.put("b1", new GetterSetter(this::b1ToString, null, this::setB1));
        map.put("b2", new GetterSetter(this::b2ToString, null, this::setB2));
        map.put("b3", new GetterSetter(this::b3ToString, null, this::setB3));
        map.put("b4", new GetterSetter(this::b4ToString, null, this::setB4));
        map.put("b5", new GetterSetter(this::b5ToString, null, this::setB5));
        map.put("dl", new GetterSetter(this::dlToString, null, this::setDl));
        map.put("dtc", new GetterSetter(this::dtcToString, null, this::setDtc));
        map.put("dtf", new GetterSetter(this::dtfToString, null, this::setDtf));
        map.put("dtp", new GetterSetter(this::dtpToString, null, this::setDtp));
        map.put("isw", new GetterSetter(this::iswToString, null, this::setIsw));
        map.put("k", new GetterSetter(this::kToString, null, this::setK));
        map.put("lthres", new GetterSetter(this::lthresToString, null, this::setLthres));
        map.put("m", new GetterSetter(this::mToString, null, this::setM));
        map.put("nav", new GetterSetter(this::navToString, null, this::setNav));
        map.put("ncl", new GetterSetter(this::nclToString, null, this::setNcl));
        map.put("ncr", new GetterSetter(this::ncrToString, null, this::setNcr));
        map.put("pmin", new GetterSetter(this::pminToString, null, this::setPmin));
        map.put("t1", new GetterSetter(this::t1ToString, null, this::setT1));
        map.put("t2", new GetterSetter(this::t2ToString, null, this::setT2));
        map.put("t3", new GetterSetter(this::t3ToString, null, this::setT3));
        map.put("t4", new GetterSetter(this::t4ToString, null, this::setT4));
        map.put("t5", new GetterSetter(this::t5ToString, null, this::setT5));
        map.put("t6", new GetterSetter(this::t6ToString, null, this::setT6));
        map.put("tf", new GetterSetter(this::tfToString, null, this::setTf));
        map.put("tp", new GetterSetter(this::tpToString, null, this::setTp));
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
