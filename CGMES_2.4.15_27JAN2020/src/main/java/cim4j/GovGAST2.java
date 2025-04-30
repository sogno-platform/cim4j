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
 * Gas turbine model.
 */
@SuppressWarnings("unused")
public class GovGAST2 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovGAST2.class);

    /**
     * Default constructor.
     */
    public GovGAST2() {
        setCimType("GovGAST2");
    }

    /**
     * Valve positioner (A).
     */
    private Double a; // Simple_Float

    public Double getA() {
        return a;
    }

    public void setA(Double _value_) {
        a = _value_;
    }

    public void setA(String _value_) {
        a = getDoubleFromString(_value_);
    }

    public String aToString() {
        return a != null ? a.toString() : null;
    }

    /**
     * Exhaust temperature Parameter (Af1).  Unit = per unit temperature.  Based on temperature in degrees C.
     */
    private Double af1; // PU

    public Double getAf1() {
        return af1;
    }

    public void setAf1(Double _value_) {
        af1 = _value_;
    }

    public void setAf1(String _value_) {
        af1 = getDoubleFromString(_value_);
    }

    public String af1ToString() {
        return af1 != null ? af1.toString() : null;
    }

    /**
     * Coefficient equal to 0.5(1-speed) (Af2).
     */
    private Double af2; // PU

    public Double getAf2() {
        return af2;
    }

    public void setAf2(Double _value_) {
        af2 = _value_;
    }

    public void setAf2(String _value_) {
        af2 = getDoubleFromString(_value_);
    }

    public String af2ToString() {
        return af2 != null ? af2.toString() : null;
    }

    /**
     * Valve positioner (B).
     */
    private Double b; // Simple_Float

    public Double getB() {
        return b;
    }

    public void setB(Double _value_) {
        b = _value_;
    }

    public void setB(String _value_) {
        b = getDoubleFromString(_value_);
    }

    public String bToString() {
        return b != null ? b.toString() : null;
    }

    /**
     * (Bf1).  Bf1 = E(1-w) where E (speed sensitivity coefficient) is 0.55 to 0.65 x Tr.  Unit = per unit temperature.  Based on temperature in degrees C.
     */
    private Double bf1; // PU

    public Double getBf1() {
        return bf1;
    }

    public void setBf1(Double _value_) {
        bf1 = _value_;
    }

    public void setBf1(String _value_) {
        bf1 = getDoubleFromString(_value_);
    }

    public String bf1ToString() {
        return bf1 != null ? bf1.toString() : null;
    }

    /**
     * Turbine Torque Coefficient K (depends on heating value of fuel stream in combustion chamber) (Bf2).
     */
    private Double bf2; // PU

    public Double getBf2() {
        return bf2;
    }

    public void setBf2(Double _value_) {
        bf2 = _value_;
    }

    public void setBf2(String _value_) {
        bf2 = getDoubleFromString(_value_);
    }

    public String bf2ToString() {
        return bf2 != null ? bf2.toString() : null;
    }

    /**
     * Valve positioner (C).
     */
    private Double c; // Simple_Float

    public Double getC() {
        return c;
    }

    public void setC(Double _value_) {
        c = _value_;
    }

    public void setC(String _value_) {
        c = getDoubleFromString(_value_);
    }

    public String cToString() {
        return c != null ? c.toString() : null;
    }

    /**
     * Coefficient defining fuel flow where power output is 0% (Cf2).  Synchronous but no output.  Typically 0.23 x K (23% fuel flow).
     */
    private Double cf2; // PU

    public Double getCf2() {
        return cf2;
    }

    public void setCf2(Double _value_) {
        cf2 = _value_;
    }

    public void setCf2(String _value_) {
        cf2 = getDoubleFromString(_value_);
    }

    public String cf2ToString() {
        return cf2 != null ? cf2.toString() : null;
    }

    /**
     * Combustion reaction time delay (Ecr).
     */
    private Double ecr; // Seconds

    public Double getEcr() {
        return ecr;
    }

    public void setEcr(Double _value_) {
        ecr = _value_;
    }

    public void setEcr(String _value_) {
        ecr = getDoubleFromString(_value_);
    }

    public String ecrToString() {
        return ecr != null ? ecr.toString() : null;
    }

    /**
     * Turbine and exhaust delay (Etd).
     */
    private Double etd; // Seconds

    public Double getEtd() {
        return etd;
    }

    public void setEtd(Double _value_) {
        etd = _value_;
    }

    public void setEtd(String _value_) {
        etd = getDoubleFromString(_value_);
    }

    public String etdToString() {
        return etd != null ? etd.toString() : null;
    }

    /**
     * Ratio of Fuel Adjustment (K3).
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
     * Gain of radiation shield (K4).
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
     * Gain of radiation shield (K5).
     */
    private Double k5; // PU

    public Double getK5() {
        return k5;
    }

    public void setK5(Double _value_) {
        k5 = _value_;
    }

    public void setK5(String _value_) {
        k5 = getDoubleFromString(_value_);
    }

    public String k5ToString() {
        return k5 != null ? k5.toString() : null;
    }

    /**
     * Minimum fuel flow (K6).
     */
    private Double k6; // PU

    public Double getK6() {
        return k6;
    }

    public void setK6(Double _value_) {
        k6 = _value_;
    }

    public void setK6(String _value_) {
        k6 = getDoubleFromString(_value_);
    }

    public String k6ToString() {
        return k6 != null ? k6.toString() : null;
    }

    /**
     * Fuel system feedback (Kf).
     */
    private Double kf; // PU

    public Double getKf() {
        return kf;
    }

    public void setKf(Double _value_) {
        kf = _value_;
    }

    public void setKf(String _value_) {
        kf = getDoubleFromString(_value_);
    }

    public String kfToString() {
        return kf != null ? kf.toString() : null;
    }

    /**
     * Base for power values (MWbase) (&gt; 0).  Unit = MW.
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
     * Fuel Control Time Constant (T).
     */
    private Double t; // Seconds

    public Double getT() {
        return t;
    }

    public void setT(Double _value_) {
        t = _value_;
    }

    public void setT(String _value_) {
        t = getDoubleFromString(_value_);
    }

    public String tToString() {
        return t != null ? t.toString() : null;
    }

    /**
     * Radiation shield time constant (T3).
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
     * Thermocouple time constant (T4).
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
     * Temperature control time constant (T5).
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
     * Temperature control (Tc).  Unit = [SYMBOL REMOVED]F or [SYMBOL REMOVED]C depending on constants Af1 and Bf1.
     */
    private Double tc; // Temperature

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
     * Compressor discharge time constant (Tcd).
     */
    private Double tcd; // Seconds

    public Double getTcd() {
        return tcd;
    }

    public void setTcd(Double _value_) {
        tcd = _value_;
    }

    public void setTcd(String _value_) {
        tcd = getDoubleFromString(_value_);
    }

    public String tcdToString() {
        return tcd != null ? tcd.toString() : null;
    }

    /**
     * Fuel system time constant (Tf).
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
     * Maximum Turbine limit (Tmax).
     */
    private Double tmax; // PU

    public Double getTmax() {
        return tmax;
    }

    public void setTmax(Double _value_) {
        tmax = _value_;
    }

    public void setTmax(String _value_) {
        tmax = getDoubleFromString(_value_);
    }

    public String tmaxToString() {
        return tmax != null ? tmax.toString() : null;
    }

    /**
     * Minimum Turbine limit (Tmin).
     */
    private Double tmin; // PU

    public Double getTmin() {
        return tmin;
    }

    public void setTmin(Double _value_) {
        tmin = _value_;
    }

    public void setTmin(String _value_) {
        tmin = getDoubleFromString(_value_);
    }

    public String tminToString() {
        return tmin != null ? tmin.toString() : null;
    }

    /**
     * Rated temperature (Tr).  Unit = [SYMBOL REMOVED]C depending on parameters Af1 and Bf1.
     */
    private Double tr; // Temperature

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
     * Turbine rating (Trate).  Unit = MW.
     */
    private Double trate; // ActivePower

    public Double getTrate() {
        return trate;
    }

    public void setTrate(Double _value_) {
        trate = _value_;
    }

    public void setTrate(String _value_) {
        trate = getDoubleFromString(_value_);
    }

    public String trateToString() {
        return trate != null ? trate.toString() : null;
    }

    /**
     * Temperature controller integration rate (Tt).
     */
    private Double tt; // Seconds

    public Double getTt() {
        return tt;
    }

    public void setTt(Double _value_) {
        tt = _value_;
    }

    public void setTt(String _value_) {
        tt = getDoubleFromString(_value_);
    }

    public String ttToString() {
        return tt != null ? tt.toString() : null;
    }

    /**
     * Governor gain (1/droop) on turbine rating (W).
     */
    private Double w; // PU

    public Double getW() {
        return w;
    }

    public void setW(Double _value_) {
        w = _value_;
    }

    public void setW(String _value_) {
        w = getDoubleFromString(_value_);
    }

    public String wToString() {
        return w != null ? w.toString() : null;
    }

    /**
     * Governor lead time constant (X).
     */
    private Double x; // Seconds

    public Double getX() {
        return x;
    }

    public void setX(Double _value_) {
        x = _value_;
    }

    public void setX(String _value_) {
        x = getDoubleFromString(_value_);
    }

    public String xToString() {
        return x != null ? x.toString() : null;
    }

    /**
     * Governor lag time constant (Y) (&gt;0).
     */
    private Double y; // Seconds

    public Double getY() {
        return y;
    }

    public void setY(Double _value_) {
        y = _value_;
    }

    public void setY(String _value_) {
        y = getDoubleFromString(_value_);
    }

    public String yToString() {
        return y != null ? y.toString() : null;
    }

    /**
     * Governor mode (Z). true = Droop false = ISO.
     */
    private Boolean z; // Boolean

    public Boolean getZ() {
        return z;
    }

    public void setZ(Boolean _value_) {
        z = _value_;
    }

    public void setZ(String _value_) {
        z = getBooleanFromString(_value_);
    }

    public String zToString() {
        return z != null ? z.toString() : null;
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
        return getAttribute("GovGAST2", attrName);
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
        setAttribute("GovGAST2", attrName, objectValue);
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
        setAttribute("GovGAST2", attrName, stringValue);
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
            map.put("a", new AttrDetails("GovGAST2.a", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("af1", new AttrDetails("GovGAST2.af1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("af2", new AttrDetails("GovGAST2.af2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("b", new AttrDetails("GovGAST2.b", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bf1", new AttrDetails("GovGAST2.bf1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bf2", new AttrDetails("GovGAST2.bf2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("c", new AttrDetails("GovGAST2.c", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("cf2", new AttrDetails("GovGAST2.cf2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ecr", new AttrDetails("GovGAST2.ecr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("etd", new AttrDetails("GovGAST2.etd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k3", new AttrDetails("GovGAST2.k3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k4", new AttrDetails("GovGAST2.k4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k5", new AttrDetails("GovGAST2.k5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k6", new AttrDetails("GovGAST2.k6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("GovGAST2.kf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovGAST2.mwbase", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t", new AttrDetails("GovGAST2.t", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("GovGAST2.t3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("GovGAST2.t4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5", new AttrDetails("GovGAST2.t5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("GovGAST2.tc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tcd", new AttrDetails("GovGAST2.tcd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("GovGAST2.tf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tmax", new AttrDetails("GovGAST2.tmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tmin", new AttrDetails("GovGAST2.tmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tr", new AttrDetails("GovGAST2.tr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("trate", new AttrDetails("GovGAST2.trate", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tt", new AttrDetails("GovGAST2.tt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("w", new AttrDetails("GovGAST2.w", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("x", new AttrDetails("GovGAST2.x", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("y", new AttrDetails("GovGAST2.y", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("z", new AttrDetails("GovGAST2.z", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovGAST2().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("a", new GetterSetter(this::aToString, null, this::setA));
        map.put("af1", new GetterSetter(this::af1ToString, null, this::setAf1));
        map.put("af2", new GetterSetter(this::af2ToString, null, this::setAf2));
        map.put("b", new GetterSetter(this::bToString, null, this::setB));
        map.put("bf1", new GetterSetter(this::bf1ToString, null, this::setBf1));
        map.put("bf2", new GetterSetter(this::bf2ToString, null, this::setBf2));
        map.put("c", new GetterSetter(this::cToString, null, this::setC));
        map.put("cf2", new GetterSetter(this::cf2ToString, null, this::setCf2));
        map.put("ecr", new GetterSetter(this::ecrToString, null, this::setEcr));
        map.put("etd", new GetterSetter(this::etdToString, null, this::setEtd));
        map.put("k3", new GetterSetter(this::k3ToString, null, this::setK3));
        map.put("k4", new GetterSetter(this::k4ToString, null, this::setK4));
        map.put("k5", new GetterSetter(this::k5ToString, null, this::setK5));
        map.put("k6", new GetterSetter(this::k6ToString, null, this::setK6));
        map.put("kf", new GetterSetter(this::kfToString, null, this::setKf));
        map.put("mwbase", new GetterSetter(this::mwbaseToString, null, this::setMwbase));
        map.put("t", new GetterSetter(this::tToString, null, this::setT));
        map.put("t3", new GetterSetter(this::t3ToString, null, this::setT3));
        map.put("t4", new GetterSetter(this::t4ToString, null, this::setT4));
        map.put("t5", new GetterSetter(this::t5ToString, null, this::setT5));
        map.put("tc", new GetterSetter(this::tcToString, null, this::setTc));
        map.put("tcd", new GetterSetter(this::tcdToString, null, this::setTcd));
        map.put("tf", new GetterSetter(this::tfToString, null, this::setTf));
        map.put("tmax", new GetterSetter(this::tmaxToString, null, this::setTmax));
        map.put("tmin", new GetterSetter(this::tminToString, null, this::setTmin));
        map.put("tr", new GetterSetter(this::trToString, null, this::setTr));
        map.put("trate", new GetterSetter(this::trateToString, null, this::setTrate));
        map.put("tt", new GetterSetter(this::ttToString, null, this::setTt));
        map.put("w", new GetterSetter(this::wToString, null, this::setW));
        map.put("x", new GetterSetter(this::xToString, null, this::setX));
        map.put("y", new GetterSetter(this::yToString, null, this::setY));
        map.put("z", new GetterSetter(this::zToString, null, this::setZ));
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
