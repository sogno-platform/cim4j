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
 * Steam turbine governor, based on the GovSteamIEEE1 (with optional deadband and nonlinear valve gain added).
 */
@SuppressWarnings("unused")
public class GovSteam1 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovSteam1.class);

    /**
     * Default constructor.
     */
    public GovSteam1() {
        setCimType("GovSteam1");
    }

    /**
     * Intentional deadband width (&lt;i&gt;db1&lt;/i&gt;).  Unit = Hz.  Typical value = 0.
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
     * Unintentional deadband (&lt;i&gt;db2&lt;/i&gt;).  Unit = MW.  Typical value = 0.
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
     * Nonlinear gain valve position point 1 (&lt;i&gt;GV1&lt;/i&gt;).  Typical value = 0.
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
     * Nonlinear gain valve position point 2 (&lt;i&gt;GV2&lt;/i&gt;).  Typical value = 0,4.
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
     * Nonlinear gain valve position point 3 (&lt;i&gt;GV3&lt;/i&gt;).  Typical value = 0,5.
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
     * Nonlinear gain valve position point 4 (&lt;i&gt;GV4&lt;/i&gt;).  Typical value = 0,6.
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
     * Nonlinear gain valve position point 5 (&lt;i&gt;GV5&lt;/i&gt;).  Typical value = 1.
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
     * Nonlinear gain valve position point 6 (&lt;i&gt;GV6&lt;/i&gt;).  Typical value = 0.
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
     * Governor gain (reciprocal of droop) (&lt;i&gt;K&lt;/i&gt;) (&amp;gt; 0).  Typical value = 25.
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
     * Fraction of HP shaft power after first boiler pass (&lt;i&gt;K1&lt;/i&gt;).  Typical value = 0,2.
     */
    private Float k1; // Float

    public Float getK1() {
        return k1;
    }

    public void setK1(Float _value_) {
        k1 = _value_;
    }

    public void setK1(String _value_) {
        k1 = getFloatFromString(_value_);
    }

    public String k1ToString() {
        return k1 != null ? k1.toString() : null;
    }

    /**
     * Fraction of LP shaft power after first boiler pass (&lt;i&gt;K2&lt;/i&gt;).  Typical value = 0.
     */
    private Float k2; // Float

    public Float getK2() {
        return k2;
    }

    public void setK2(Float _value_) {
        k2 = _value_;
    }

    public void setK2(String _value_) {
        k2 = getFloatFromString(_value_);
    }

    public String k2ToString() {
        return k2 != null ? k2.toString() : null;
    }

    /**
     * Fraction of HP shaft power after second boiler pass (&lt;i&gt;K3&lt;/i&gt;).  Typical value = 0,3.
     */
    private Float k3; // Float

    public Float getK3() {
        return k3;
    }

    public void setK3(Float _value_) {
        k3 = _value_;
    }

    public void setK3(String _value_) {
        k3 = getFloatFromString(_value_);
    }

    public String k3ToString() {
        return k3 != null ? k3.toString() : null;
    }

    /**
     * Fraction of LP shaft power after second boiler pass (&lt;i&gt;K4&lt;/i&gt;).  Typical value = 0.
     */
    private Float k4; // Float

    public Float getK4() {
        return k4;
    }

    public void setK4(Float _value_) {
        k4 = _value_;
    }

    public void setK4(String _value_) {
        k4 = getFloatFromString(_value_);
    }

    public String k4ToString() {
        return k4 != null ? k4.toString() : null;
    }

    /**
     * Fraction of HP shaft power after third boiler pass (&lt;i&gt;K5&lt;/i&gt;).  Typical value = 0,5.
     */
    private Float k5; // Float

    public Float getK5() {
        return k5;
    }

    public void setK5(Float _value_) {
        k5 = _value_;
    }

    public void setK5(String _value_) {
        k5 = getFloatFromString(_value_);
    }

    public String k5ToString() {
        return k5 != null ? k5.toString() : null;
    }

    /**
     * Fraction of LP shaft power after third boiler pass (&lt;i&gt;K6&lt;/i&gt;).  Typical value = 0.
     */
    private Float k6; // Float

    public Float getK6() {
        return k6;
    }

    public void setK6(Float _value_) {
        k6 = _value_;
    }

    public void setK6(String _value_) {
        k6 = getFloatFromString(_value_);
    }

    public String k6ToString() {
        return k6 != null ? k6.toString() : null;
    }

    /**
     * Fraction of HP shaft power after fourth boiler pass (&lt;i&gt;K7&lt;/i&gt;).  Typical value = 0.
     */
    private Float k7; // Float

    public Float getK7() {
        return k7;
    }

    public void setK7(Float _value_) {
        k7 = _value_;
    }

    public void setK7(String _value_) {
        k7 = getFloatFromString(_value_);
    }

    public String k7ToString() {
        return k7 != null ? k7.toString() : null;
    }

    /**
     * Fraction of LP shaft power after fourth boiler pass (&lt;i&gt;K8&lt;/i&gt;).  Typical value = 0.
     */
    private Float k8; // Float

    public Float getK8() {
        return k8;
    }

    public void setK8(Float _value_) {
        k8 = _value_;
    }

    public void setK8(String _value_) {
        k8 = getFloatFromString(_value_);
    }

    public String k8ToString() {
        return k8 != null ? k8.toString() : null;
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
     * Nonlinear gain power value point 1 (&lt;i&gt;Pgv1&lt;/i&gt;).  Typical value = 0.
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
     * Nonlinear gain power value point 2 (&lt;i&gt;Pgv2&lt;/i&gt;).  Typical value = 0,75.
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
     * Nonlinear gain power value point 3 (&lt;i&gt;Pgv3&lt;/i&gt;).  Typical value = 0,91.
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
     * Nonlinear gain power value point 4 (&lt;i&gt;Pgv4&lt;/i&gt;).  Typical value = 0,98.
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
     * Nonlinear gain power value point 5 (&lt;i&gt;Pgv5&lt;/i&gt;).  Typical value = 1.
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
     * Nonlinear gain power value point 6 (&lt;i&gt;Pgv6&lt;/i&gt;).  Typical value = 0.
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
     * Maximum valve opening (&lt;i&gt;Pmax&lt;/i&gt;) (&amp;gt; GovSteam1.pmin).  Typical value = 1.
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
     * Minimum valve opening (&lt;i&gt;Pmin&lt;/i&gt;) (&amp;gt;= 0 and &amp;lt; GovSteam1.pmax).  Typical value = 0.
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
     * Intentional deadband indicator. true = intentional deadband is applied false = intentional deadband is not applied. Typical value = true.
     */
    private Boolean sdb1; // Boolean

    public Boolean getSdb1() {
        return sdb1;
    }

    public void setSdb1(Boolean _value_) {
        sdb1 = _value_;
    }

    public void setSdb1(String _value_) {
        sdb1 = getBooleanFromString(_value_);
    }

    public String sdb1ToString() {
        return sdb1 != null ? sdb1.toString() : null;
    }

    /**
     * Unintentional deadband location. true = intentional deadband is applied before point `A` false = intentional deadband is applied after point `A`. Typical value = true.
     */
    private Boolean sdb2; // Boolean

    public Boolean getSdb2() {
        return sdb2;
    }

    public void setSdb2(Boolean _value_) {
        sdb2 = _value_;
    }

    public void setSdb2(String _value_) {
        sdb2 = getBooleanFromString(_value_);
    }

    public String sdb2ToString() {
        return sdb2 != null ? sdb2.toString() : null;
    }

    /**
     * Governor lag time constant (&lt;i&gt;T1&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
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
     * Governor lead time constant (&lt;i&gt;T2&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
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
     * Valve positioner time constant (&lt;i&gt;T3) &lt;/i&gt;(&amp;gt; 0).  Typical value = 0,1.
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
     * Inlet piping/steam bowl time constant (&lt;i&gt;T4&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,3.
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
     * Time constant of second boiler pass (&lt;i&gt;T5&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 5.
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
     * Time constant of third boiler pass (&lt;i&gt;T6&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,5.
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
     * Time constant of fourth boiler pass (&lt;i&gt;T7&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double t7; // Seconds

    public Double getT7() {
        return t7;
    }

    public void setT7(Double _value_) {
        t7 = _value_;
    }

    public void setT7(String _value_) {
        t7 = getDoubleFromString(_value_);
    }

    public String t7ToString() {
        return t7 != null ? t7.toString() : null;
    }

    /**
     * Maximum valve closing velocity (&lt;i&gt;Uc&lt;/i&gt;) (&amp;lt; 0).  Unit = PU / s.  Typical value = -10.
     */
    private Float uc; // Float

    public Float getUc() {
        return uc;
    }

    public void setUc(Float _value_) {
        uc = _value_;
    }

    public void setUc(String _value_) {
        uc = getFloatFromString(_value_);
    }

    public String ucToString() {
        return uc != null ? uc.toString() : null;
    }

    /**
     * Maximum valve opening velocity (&lt;i&gt;Uo&lt;/i&gt;) (&amp;gt; 0).  Unit = PU / s.  Typical value = 1.
     */
    private Float uo; // Float

    public Float getUo() {
        return uo;
    }

    public void setUo(Float _value_) {
        uo = _value_;
    }

    public void setUo(String _value_) {
        uo = getFloatFromString(_value_);
    }

    public String uoToString() {
        return uo != null ? uo.toString() : null;
    }

    /**
     * Nonlinear valve characteristic. true = nonlinear valve characteristic is used false = nonlinear valve characteristic is not used. Typical value = true.
     */
    private Boolean valve; // Boolean

    public Boolean getValve() {
        return valve;
    }

    public void setValve(Boolean _value_) {
        valve = _value_;
    }

    public void setValve(String _value_) {
        valve = getBooleanFromString(_value_);
    }

    public String valveToString() {
        return valve != null ? valve.toString() : null;
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
        return getAttribute("GovSteam1", attrName);
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
        setAttribute("GovSteam1", attrName, objectValue);
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
        setAttribute("GovSteam1", attrName, stringValue);
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
            map.put("db1", new AttrDetails("GovSteam1.db1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db2", new AttrDetails("GovSteam1.db2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eps", new AttrDetails("GovSteam1.eps", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv1", new AttrDetails("GovSteam1.gv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv2", new AttrDetails("GovSteam1.gv2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv3", new AttrDetails("GovSteam1.gv3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv4", new AttrDetails("GovSteam1.gv4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv5", new AttrDetails("GovSteam1.gv5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv6", new AttrDetails("GovSteam1.gv6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k", new AttrDetails("GovSteam1.k", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k1", new AttrDetails("GovSteam1.k1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k2", new AttrDetails("GovSteam1.k2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k3", new AttrDetails("GovSteam1.k3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k4", new AttrDetails("GovSteam1.k4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k5", new AttrDetails("GovSteam1.k5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k6", new AttrDetails("GovSteam1.k6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k7", new AttrDetails("GovSteam1.k7", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k8", new AttrDetails("GovSteam1.k8", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovSteam1.mwbase", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv1", new AttrDetails("GovSteam1.pgv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv2", new AttrDetails("GovSteam1.pgv2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv3", new AttrDetails("GovSteam1.pgv3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv4", new AttrDetails("GovSteam1.pgv4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv5", new AttrDetails("GovSteam1.pgv5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv6", new AttrDetails("GovSteam1.pgv6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmax", new AttrDetails("GovSteam1.pmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmin", new AttrDetails("GovSteam1.pmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("sdb1", new AttrDetails("GovSteam1.sdb1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("sdb2", new AttrDetails("GovSteam1.sdb2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("GovSteam1.t1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("GovSteam1.t2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("GovSteam1.t3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("GovSteam1.t4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5", new AttrDetails("GovSteam1.t5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t6", new AttrDetails("GovSteam1.t6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t7", new AttrDetails("GovSteam1.t7", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uc", new AttrDetails("GovSteam1.uc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uo", new AttrDetails("GovSteam1.uo", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("valve", new AttrDetails("GovSteam1.valve", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovSteam1().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("db1", new GetterSetter(this::db1ToString, null, this::setDb1));
        map.put("db2", new GetterSetter(this::db2ToString, null, this::setDb2));
        map.put("eps", new GetterSetter(this::epsToString, null, this::setEps));
        map.put("gv1", new GetterSetter(this::gv1ToString, null, this::setGv1));
        map.put("gv2", new GetterSetter(this::gv2ToString, null, this::setGv2));
        map.put("gv3", new GetterSetter(this::gv3ToString, null, this::setGv3));
        map.put("gv4", new GetterSetter(this::gv4ToString, null, this::setGv4));
        map.put("gv5", new GetterSetter(this::gv5ToString, null, this::setGv5));
        map.put("gv6", new GetterSetter(this::gv6ToString, null, this::setGv6));
        map.put("k", new GetterSetter(this::kToString, null, this::setK));
        map.put("k1", new GetterSetter(this::k1ToString, null, this::setK1));
        map.put("k2", new GetterSetter(this::k2ToString, null, this::setK2));
        map.put("k3", new GetterSetter(this::k3ToString, null, this::setK3));
        map.put("k4", new GetterSetter(this::k4ToString, null, this::setK4));
        map.put("k5", new GetterSetter(this::k5ToString, null, this::setK5));
        map.put("k6", new GetterSetter(this::k6ToString, null, this::setK6));
        map.put("k7", new GetterSetter(this::k7ToString, null, this::setK7));
        map.put("k8", new GetterSetter(this::k8ToString, null, this::setK8));
        map.put("mwbase", new GetterSetter(this::mwbaseToString, null, this::setMwbase));
        map.put("pgv1", new GetterSetter(this::pgv1ToString, null, this::setPgv1));
        map.put("pgv2", new GetterSetter(this::pgv2ToString, null, this::setPgv2));
        map.put("pgv3", new GetterSetter(this::pgv3ToString, null, this::setPgv3));
        map.put("pgv4", new GetterSetter(this::pgv4ToString, null, this::setPgv4));
        map.put("pgv5", new GetterSetter(this::pgv5ToString, null, this::setPgv5));
        map.put("pgv6", new GetterSetter(this::pgv6ToString, null, this::setPgv6));
        map.put("pmax", new GetterSetter(this::pmaxToString, null, this::setPmax));
        map.put("pmin", new GetterSetter(this::pminToString, null, this::setPmin));
        map.put("sdb1", new GetterSetter(this::sdb1ToString, null, this::setSdb1));
        map.put("sdb2", new GetterSetter(this::sdb2ToString, null, this::setSdb2));
        map.put("t1", new GetterSetter(this::t1ToString, null, this::setT1));
        map.put("t2", new GetterSetter(this::t2ToString, null, this::setT2));
        map.put("t3", new GetterSetter(this::t3ToString, null, this::setT3));
        map.put("t4", new GetterSetter(this::t4ToString, null, this::setT4));
        map.put("t5", new GetterSetter(this::t5ToString, null, this::setT5));
        map.put("t6", new GetterSetter(this::t6ToString, null, this::setT6));
        map.put("t7", new GetterSetter(this::t7ToString, null, this::setT7));
        map.put("uc", new GetterSetter(this::ucToString, null, this::setUc));
        map.put("uo", new GetterSetter(this::uoToString, null, this::setUo));
        map.put("valve", new GetterSetter(this::valveToString, null, this::setValve));
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
