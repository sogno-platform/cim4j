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
 * PID governor and turbine.
 */
@SuppressWarnings("unused")
public class GovHydroPID extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydroPID.class);

    /**
     * Default constructor.
     */
    public GovHydroPID() {
        setCimType("GovHydroPID");
    }

    /**
     * Turbine numerator multiplier (&lt;i&gt;Aturb&lt;/i&gt;) (see parameter detail 3).  Typical value -1.
     */
    private Double aturb; // PU

    public Double getAturb() {
        return aturb;
    }

    public void setAturb(Double _value_) {
        aturb = _value_;
    }

    public void setAturb(String _value_) {
        aturb = getDoubleFromString(_value_);
    }

    public String aturbToString() {
        return aturb != null ? aturb.toString() : null;
    }

    /**
     * Turbine denominator multiplier (&lt;i&gt;Bturb&lt;/i&gt;) (see parameter detail 3).  Typical value = 0,5.
     */
    private Double bturb; // PU

    public Double getBturb() {
        return bturb;
    }

    public void setBturb(Double _value_) {
        bturb = _value_;
    }

    public void setBturb(String _value_) {
        bturb = getDoubleFromString(_value_);
    }

    public String bturbToString() {
        return bturb != null ? bturb.toString() : null;
    }

    /**
     * Intentional dead-band width (&lt;i&gt;db1&lt;/i&gt;).  Unit = Hz.  Typical value = 0.
     */
    private Double db1; // Frequency

    public Double getDb1() {
        return db1;
    }

    public void setDb1(Double _value_) {
        db1 = _value_;
    }

    public void setDb1(String _value_) {
        db1 = getDoubleFromString(_value_);
    }

    public String db1ToString() {
        return db1 != null ? db1.toString() : null;
    }

    /**
     * Unintentional dead-band (&lt;i&gt;db2&lt;/i&gt;).  Unit = MW.  Typical value = 0.
     */
    private Double db2; // ActivePower

    public Double getDb2() {
        return db2;
    }

    public void setDb2(Double _value_) {
        db2 = _value_;
    }

    public void setDb2(String _value_) {
        db2 = getDoubleFromString(_value_);
    }

    public String db2ToString() {
        return db2 != null ? db2.toString() : null;
    }

    /**
     * Intentional db hysteresis (&lt;i&gt;eps&lt;/i&gt;).  Unit = Hz.  Typical value = 0.
     */
    private Double eps; // Frequency

    public Double getEps() {
        return eps;
    }

    public void setEps(Double _value_) {
        eps = _value_;
    }

    public void setEps(String _value_) {
        eps = getDoubleFromString(_value_);
    }

    public String epsToString() {
        return eps != null ? eps.toString() : null;
    }

    /**
     * Nonlinear gain point 1, PU gv (&lt;i&gt;Gv1&lt;/i&gt;).  Typical value = 0.
     */
    private Double gv1; // PU

    public Double getGv1() {
        return gv1;
    }

    public void setGv1(Double _value_) {
        gv1 = _value_;
    }

    public void setGv1(String _value_) {
        gv1 = getDoubleFromString(_value_);
    }

    public String gv1ToString() {
        return gv1 != null ? gv1.toString() : null;
    }

    /**
     * Nonlinear gain point 2, PU gv (&lt;i&gt;Gv2&lt;/i&gt;).  Typical value = 0.
     */
    private Double gv2; // PU

    public Double getGv2() {
        return gv2;
    }

    public void setGv2(Double _value_) {
        gv2 = _value_;
    }

    public void setGv2(String _value_) {
        gv2 = getDoubleFromString(_value_);
    }

    public String gv2ToString() {
        return gv2 != null ? gv2.toString() : null;
    }

    /**
     * Nonlinear gain point 3, PU gv (&lt;i&gt;Gv3&lt;/i&gt;).  Typical value = 0.
     */
    private Double gv3; // PU

    public Double getGv3() {
        return gv3;
    }

    public void setGv3(Double _value_) {
        gv3 = _value_;
    }

    public void setGv3(String _value_) {
        gv3 = getDoubleFromString(_value_);
    }

    public String gv3ToString() {
        return gv3 != null ? gv3.toString() : null;
    }

    /**
     * Nonlinear gain point 4, PU gv (&lt;i&gt;Gv4&lt;/i&gt;).  Typical value = 0.
     */
    private Double gv4; // PU

    public Double getGv4() {
        return gv4;
    }

    public void setGv4(Double _value_) {
        gv4 = _value_;
    }

    public void setGv4(String _value_) {
        gv4 = getDoubleFromString(_value_);
    }

    public String gv4ToString() {
        return gv4 != null ? gv4.toString() : null;
    }

    /**
     * Nonlinear gain point 5, PU gv (&lt;i&gt;Gv5&lt;/i&gt;).  Typical value = 0.
     */
    private Double gv5; // PU

    public Double getGv5() {
        return gv5;
    }

    public void setGv5(Double _value_) {
        gv5 = _value_;
    }

    public void setGv5(String _value_) {
        gv5 = getDoubleFromString(_value_);
    }

    public String gv5ToString() {
        return gv5 != null ? gv5.toString() : null;
    }

    /**
     * Nonlinear gain point 6, PU gv (&lt;i&gt;Gv6&lt;/i&gt;).  Typical value = 0.
     */
    private Double gv6; // PU

    public Double getGv6() {
        return gv6;
    }

    public void setGv6(Double _value_) {
        gv6 = _value_;
    }

    public void setGv6(String _value_) {
        gv6 = getDoubleFromString(_value_);
    }

    public String gv6ToString() {
        return gv6 != null ? gv6.toString() : null;
    }

    /**
     * Input signal switch (&lt;i&gt;Flag&lt;/i&gt;).  true = &lt;i&gt;Pe&lt;/i&gt; input is used false = feedback is received from &lt;i&gt;CV&lt;/i&gt;. &lt;i&gt;Flag&lt;/i&gt; is normally dependent on &lt;i&gt;Tt&lt;/i&gt;.  If &lt;i&gt;Tt &lt;/i&gt;is zero, &lt;i&gt;Flag&lt;/i&gt; is set to false. If &lt;i&gt;Tt&lt;/i&gt; is not zero, &lt;i&gt;Flag&lt;/i&gt; is set to true.   Typical value = true.
     */
    private Boolean inputSignal; // Boolean

    public Boolean getInputSignal() {
        return inputSignal;
    }

    public void setInputSignal(Boolean _value_) {
        inputSignal = _value_;
    }

    public void setInputSignal(String _value_) {
        inputSignal = getBooleanFromString(_value_);
    }

    public String inputSignalToString() {
        return inputSignal != null ? inputSignal.toString() : null;
    }

    /**
     * Derivative gain (&lt;i&gt;Kd&lt;/i&gt;).  Typical value = 1,11.
     */
    private Double kd; // PU

    public Double getKd() {
        return kd;
    }

    public void setKd(Double _value_) {
        kd = _value_;
    }

    public void setKd(String _value_) {
        kd = getDoubleFromString(_value_);
    }

    public String kdToString() {
        return kd != null ? kd.toString() : null;
    }

    /**
     * Gate servo gain (&lt;i&gt;Kg&lt;/i&gt;).  Typical value = 2,5.
     */
    private Double kg; // PU

    public Double getKg() {
        return kg;
    }

    public void setKg(Double _value_) {
        kg = _value_;
    }

    public void setKg(String _value_) {
        kg = getDoubleFromString(_value_);
    }

    public String kgToString() {
        return kg != null ? kg.toString() : null;
    }

    /**
     * Integral gain (&lt;i&gt;Ki&lt;/i&gt;).  Typical value = 0,36.
     */
    private Double ki; // PU

    public Double getKi() {
        return ki;
    }

    public void setKi(Double _value_) {
        ki = _value_;
    }

    public void setKi(String _value_) {
        ki = getDoubleFromString(_value_);
    }

    public String kiToString() {
        return ki != null ? ki.toString() : null;
    }

    /**
     * Proportional gain (&lt;i&gt;Kp&lt;/i&gt;).  Typical value = 0,1.
     */
    private Double kp; // PU

    public Double getKp() {
        return kp;
    }

    public void setKp(Double _value_) {
        kp = _value_;
    }

    public void setKp(String _value_) {
        kp = getDoubleFromString(_value_);
    }

    public String kpToString() {
        return kp != null ? kp.toString() : null;
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
     * Nonlinear gain point 1, PU power (&lt;i&gt;Pgv1&lt;/i&gt;).  Typical value = 0.
     */
    private Double pgv1; // PU

    public Double getPgv1() {
        return pgv1;
    }

    public void setPgv1(Double _value_) {
        pgv1 = _value_;
    }

    public void setPgv1(String _value_) {
        pgv1 = getDoubleFromString(_value_);
    }

    public String pgv1ToString() {
        return pgv1 != null ? pgv1.toString() : null;
    }

    /**
     * Nonlinear gain point 2, PU power (&lt;i&gt;Pgv2&lt;/i&gt;).  Typical value = 0.
     */
    private Double pgv2; // PU

    public Double getPgv2() {
        return pgv2;
    }

    public void setPgv2(Double _value_) {
        pgv2 = _value_;
    }

    public void setPgv2(String _value_) {
        pgv2 = getDoubleFromString(_value_);
    }

    public String pgv2ToString() {
        return pgv2 != null ? pgv2.toString() : null;
    }

    /**
     * Nonlinear gain point 3, PU power (&lt;i&gt;Pgv3&lt;/i&gt;).  Typical value = 0.
     */
    private Double pgv3; // PU

    public Double getPgv3() {
        return pgv3;
    }

    public void setPgv3(Double _value_) {
        pgv3 = _value_;
    }

    public void setPgv3(String _value_) {
        pgv3 = getDoubleFromString(_value_);
    }

    public String pgv3ToString() {
        return pgv3 != null ? pgv3.toString() : null;
    }

    /**
     * Nonlinear gain point 4, PU power (&lt;i&gt;Pgv4&lt;/i&gt;).  Typical value = 0.
     */
    private Double pgv4; // PU

    public Double getPgv4() {
        return pgv4;
    }

    public void setPgv4(Double _value_) {
        pgv4 = _value_;
    }

    public void setPgv4(String _value_) {
        pgv4 = getDoubleFromString(_value_);
    }

    public String pgv4ToString() {
        return pgv4 != null ? pgv4.toString() : null;
    }

    /**
     * Nonlinear gain point 5, PU power (&lt;i&gt;Pgv5&lt;/i&gt;).  Typical value = 0.
     */
    private Double pgv5; // PU

    public Double getPgv5() {
        return pgv5;
    }

    public void setPgv5(Double _value_) {
        pgv5 = _value_;
    }

    public void setPgv5(String _value_) {
        pgv5 = getDoubleFromString(_value_);
    }

    public String pgv5ToString() {
        return pgv5 != null ? pgv5.toString() : null;
    }

    /**
     * Nonlinear gain point 6, PU power (&lt;i&gt;Pgv6&lt;/i&gt;).  Typical value = 0.
     */
    private Double pgv6; // PU

    public Double getPgv6() {
        return pgv6;
    }

    public void setPgv6(Double _value_) {
        pgv6 = _value_;
    }

    public void setPgv6(String _value_) {
        pgv6 = getDoubleFromString(_value_);
    }

    public String pgv6ToString() {
        return pgv6 != null ? pgv6.toString() : null;
    }

    /**
     * Maximum gate opening, PU of MWbase (&lt;i&gt;Pmax&lt;/i&gt;) (&amp;gt; GovHydroPID.pmin).  Typical value = 1.
     */
    private Double pmax; // PU

    public Double getPmax() {
        return pmax;
    }

    public void setPmax(Double _value_) {
        pmax = _value_;
    }

    public void setPmax(String _value_) {
        pmax = getDoubleFromString(_value_);
    }

    public String pmaxToString() {
        return pmax != null ? pmax.toString() : null;
    }

    /**
     * Minimum gate opening, PU of MWbase (&lt;i&gt;Pmin&lt;/i&gt;) (&amp;lt; GovHydroPID.pmax).  Typical value = 0.
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
     * Steady state droop (&lt;i&gt;R&lt;/i&gt;).  Typical value = 0,05.
     */
    private Double r; // PU

    public Double getR() {
        return r;
    }

    public void setR(Double _value_) {
        r = _value_;
    }

    public void setR(String _value_) {
        r = getDoubleFromString(_value_);
    }

    public String rToString() {
        return r != null ? r.toString() : null;
    }

    /**
     * Input filter time constant (&lt;i&gt;Td&lt;/i&gt;) (&amp;gt;= 0).  If = 0, block is bypassed.  Typical value = 0.
     */
    private Double td; // Seconds

    public Double getTd() {
        return td;
    }

    public void setTd(Double _value_) {
        td = _value_;
    }

    public void setTd(String _value_) {
        td = getDoubleFromString(_value_);
    }

    public String tdToString() {
        return td != null ? td.toString() : null;
    }

    /**
     * Washout time constant (&lt;i&gt;Tf&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,1.
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
     * Gate servo time constant (&lt;i&gt;Tp&lt;/i&gt;) (&amp;gt;= 0).  If = 0, block is bypassed.  Typical value = 0,35.
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
     * Power feedback time constant (&lt;i&gt;Tt&lt;/i&gt;) (&amp;gt;= 0).  If = 0, block is bypassed.  Typical value = 0,02.
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
     * Turbine time constant (&lt;i&gt;Tturb&lt;/i&gt;) (&amp;gt;= 0). See Parameter detail 3.  Typical value = 0,8.
     */
    private Double tturb; // Seconds

    public Double getTturb() {
        return tturb;
    }

    public void setTturb(Double _value_) {
        tturb = _value_;
    }

    public void setTturb(String _value_) {
        tturb = getDoubleFromString(_value_);
    }

    public String tturbToString() {
        return tturb != null ? tturb.toString() : null;
    }

    /**
     * Maximum gate closing velocity (&lt;i&gt;Velcl&lt;/i&gt;).  Unit = PU / s.  Typical value = -0,14.
     */
    private Float velcl; // Float

    public Float getVelcl() {
        return velcl;
    }

    public void setVelcl(Float _value_) {
        velcl = _value_;
    }

    public void setVelcl(String _value_) {
        velcl = getFloatFromString(_value_);
    }

    public String velclToString() {
        return velcl != null ? velcl.toString() : null;
    }

    /**
     * Maximum gate opening velocity (&lt;i&gt;Velop&lt;/i&gt;).  Unit = PU / s.  Typical value = 0,09.
     */
    private Float velop; // Float

    public Float getVelop() {
        return velop;
    }

    public void setVelop(Float _value_) {
        velop = _value_;
    }

    public void setVelop(String _value_) {
        velop = getFloatFromString(_value_);
    }

    public String velopToString() {
        return velop != null ? velop.toString() : null;
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
        return getAttribute("GovHydroPID", attrName);
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
        setAttribute("GovHydroPID", attrName, objectValue);
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
        setAttribute("GovHydroPID", attrName, stringValue);
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
            map.put("aturb", new AttrDetails("GovHydroPID.aturb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bturb", new AttrDetails("GovHydroPID.bturb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db1", new AttrDetails("GovHydroPID.db1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db2", new AttrDetails("GovHydroPID.db2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eps", new AttrDetails("GovHydroPID.eps", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv1", new AttrDetails("GovHydroPID.gv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv2", new AttrDetails("GovHydroPID.gv2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv3", new AttrDetails("GovHydroPID.gv3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv4", new AttrDetails("GovHydroPID.gv4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv5", new AttrDetails("GovHydroPID.gv5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv6", new AttrDetails("GovHydroPID.gv6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("inputSignal", new AttrDetails("GovHydroPID.inputSignal", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("GovHydroPID.kd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kg", new AttrDetails("GovHydroPID.kg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("GovHydroPID.ki", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("GovHydroPID.kp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovHydroPID.mwbase", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv1", new AttrDetails("GovHydroPID.pgv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv2", new AttrDetails("GovHydroPID.pgv2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv3", new AttrDetails("GovHydroPID.pgv3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv4", new AttrDetails("GovHydroPID.pgv4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv5", new AttrDetails("GovHydroPID.pgv5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv6", new AttrDetails("GovHydroPID.pgv6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmax", new AttrDetails("GovHydroPID.pmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmin", new AttrDetails("GovHydroPID.pmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("r", new AttrDetails("GovHydroPID.r", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("td", new AttrDetails("GovHydroPID.td", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("GovHydroPID.tf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tp", new AttrDetails("GovHydroPID.tp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tt", new AttrDetails("GovHydroPID.tt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tturb", new AttrDetails("GovHydroPID.tturb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("velcl", new AttrDetails("GovHydroPID.velcl", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("velop", new AttrDetails("GovHydroPID.velop", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovHydroPID().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("aturb", new GetterSetter(this::aturbToString, null, this::setAturb));
        map.put("bturb", new GetterSetter(this::bturbToString, null, this::setBturb));
        map.put("db1", new GetterSetter(this::db1ToString, null, this::setDb1));
        map.put("db2", new GetterSetter(this::db2ToString, null, this::setDb2));
        map.put("eps", new GetterSetter(this::epsToString, null, this::setEps));
        map.put("gv1", new GetterSetter(this::gv1ToString, null, this::setGv1));
        map.put("gv2", new GetterSetter(this::gv2ToString, null, this::setGv2));
        map.put("gv3", new GetterSetter(this::gv3ToString, null, this::setGv3));
        map.put("gv4", new GetterSetter(this::gv4ToString, null, this::setGv4));
        map.put("gv5", new GetterSetter(this::gv5ToString, null, this::setGv5));
        map.put("gv6", new GetterSetter(this::gv6ToString, null, this::setGv6));
        map.put("inputSignal", new GetterSetter(this::inputSignalToString, null, this::setInputSignal));
        map.put("kd", new GetterSetter(this::kdToString, null, this::setKd));
        map.put("kg", new GetterSetter(this::kgToString, null, this::setKg));
        map.put("ki", new GetterSetter(this::kiToString, null, this::setKi));
        map.put("kp", new GetterSetter(this::kpToString, null, this::setKp));
        map.put("mwbase", new GetterSetter(this::mwbaseToString, null, this::setMwbase));
        map.put("pgv1", new GetterSetter(this::pgv1ToString, null, this::setPgv1));
        map.put("pgv2", new GetterSetter(this::pgv2ToString, null, this::setPgv2));
        map.put("pgv3", new GetterSetter(this::pgv3ToString, null, this::setPgv3));
        map.put("pgv4", new GetterSetter(this::pgv4ToString, null, this::setPgv4));
        map.put("pgv5", new GetterSetter(this::pgv5ToString, null, this::setPgv5));
        map.put("pgv6", new GetterSetter(this::pgv6ToString, null, this::setPgv6));
        map.put("pmax", new GetterSetter(this::pmaxToString, null, this::setPmax));
        map.put("pmin", new GetterSetter(this::pminToString, null, this::setPmin));
        map.put("r", new GetterSetter(this::rToString, null, this::setR));
        map.put("td", new GetterSetter(this::tdToString, null, this::setTd));
        map.put("tf", new GetterSetter(this::tfToString, null, this::setTf));
        map.put("tp", new GetterSetter(this::tpToString, null, this::setTp));
        map.put("tt", new GetterSetter(this::ttToString, null, this::setTt));
        map.put("tturb", new GetterSetter(this::tturbToString, null, this::setTturb));
        map.put("velcl", new GetterSetter(this::velclToString, null, this::setVelcl));
        map.put("velop", new GetterSetter(this::velopToString, null, this::setVelop));
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
