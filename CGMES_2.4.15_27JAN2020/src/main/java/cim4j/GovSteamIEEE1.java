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
 * IEEE steam turbine governor model.  Ref
 */
@SuppressWarnings("unused")
public class GovSteamIEEE1 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovSteamIEEE1.class);

    /**
     * Constructor.
     */
    public GovSteamIEEE1(String rdfid) {
        super("GovSteamIEEE1", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovSteamIEEE1(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Governor gain (reciprocal of droop) (K) (> 0).  Typical Value = 25.
     */
    private Double k; // PU

    public Double getK() {
        return k;
    }

    public void setK(Double _value_) {
        k = _value_;
    }

    private static Object getK(BaseClass _this_) {
        return ((GovSteamIEEE1) _this_).getK();
    }

    private static void setK(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamIEEE1) _this_).setK((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamIEEE1) _this_).setK(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of HP shaft power after first boiler pass (K1).  Typical Value = 0.2.
     */
    private Double k1; // Simple_Float

    public Double getK1() {
        return k1;
    }

    public void setK1(Double _value_) {
        k1 = _value_;
    }

    private static Object getK1(BaseClass _this_) {
        return ((GovSteamIEEE1) _this_).getK1();
    }

    private static void setK1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamIEEE1) _this_).setK1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamIEEE1) _this_).setK1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of LP shaft power after first boiler pass (K2).  Typical Value = 0.
     */
    private Double k2; // Simple_Float

    public Double getK2() {
        return k2;
    }

    public void setK2(Double _value_) {
        k2 = _value_;
    }

    private static Object getK2(BaseClass _this_) {
        return ((GovSteamIEEE1) _this_).getK2();
    }

    private static void setK2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamIEEE1) _this_).setK2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamIEEE1) _this_).setK2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of HP shaft power after second boiler pass (K3).  Typical Value = 0.3.
     */
    private Double k3; // Simple_Float

    public Double getK3() {
        return k3;
    }

    public void setK3(Double _value_) {
        k3 = _value_;
    }

    private static Object getK3(BaseClass _this_) {
        return ((GovSteamIEEE1) _this_).getK3();
    }

    private static void setK3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamIEEE1) _this_).setK3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamIEEE1) _this_).setK3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of LP shaft power after second boiler pass (K4).  Typical Value = 0.
     */
    private Double k4; // Simple_Float

    public Double getK4() {
        return k4;
    }

    public void setK4(Double _value_) {
        k4 = _value_;
    }

    private static Object getK4(BaseClass _this_) {
        return ((GovSteamIEEE1) _this_).getK4();
    }

    private static void setK4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamIEEE1) _this_).setK4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamIEEE1) _this_).setK4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of HP shaft power after third boiler pass (K5).  Typical Value = 0.5.
     */
    private Double k5; // Simple_Float

    public Double getK5() {
        return k5;
    }

    public void setK5(Double _value_) {
        k5 = _value_;
    }

    private static Object getK5(BaseClass _this_) {
        return ((GovSteamIEEE1) _this_).getK5();
    }

    private static void setK5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamIEEE1) _this_).setK5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamIEEE1) _this_).setK5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of LP shaft power after third boiler pass (K6).  Typical Value = 0.
     */
    private Double k6; // Simple_Float

    public Double getK6() {
        return k6;
    }

    public void setK6(Double _value_) {
        k6 = _value_;
    }

    private static Object getK6(BaseClass _this_) {
        return ((GovSteamIEEE1) _this_).getK6();
    }

    private static void setK6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamIEEE1) _this_).setK6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamIEEE1) _this_).setK6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of HP shaft power after fourth boiler pass (K7).  Typical Value = 0.
     */
    private Double k7; // Simple_Float

    public Double getK7() {
        return k7;
    }

    public void setK7(Double _value_) {
        k7 = _value_;
    }

    private static Object getK7(BaseClass _this_) {
        return ((GovSteamIEEE1) _this_).getK7();
    }

    private static void setK7(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamIEEE1) _this_).setK7((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamIEEE1) _this_).setK7(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of LP shaft power after fourth boiler pass (K8).  Typical Value = 0.
     */
    private Double k8; // Simple_Float

    public Double getK8() {
        return k8;
    }

    public void setK8(Double _value_) {
        k8 = _value_;
    }

    private static Object getK8(BaseClass _this_) {
        return ((GovSteamIEEE1) _this_).getK8();
    }

    private static void setK8(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamIEEE1) _this_).setK8((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamIEEE1) _this_).setK8(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Base for power values (MWbase) (> 0)
     */
    private Double mwbase; // ActivePower

    public Double getMwbase() {
        return mwbase;
    }

    public void setMwbase(Double _value_) {
        mwbase = _value_;
    }

    private static Object getMwbase(BaseClass _this_) {
        return ((GovSteamIEEE1) _this_).getMwbase();
    }

    private static void setMwbase(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamIEEE1) _this_).setMwbase((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamIEEE1) _this_).setMwbase(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum valve opening (Pmax) (> Pmin).  Typical Value = 1.
     */
    private Double pmax; // PU

    public Double getPmax() {
        return pmax;
    }

    public void setPmax(Double _value_) {
        pmax = _value_;
    }

    private static Object getPmax(BaseClass _this_) {
        return ((GovSteamIEEE1) _this_).getPmax();
    }

    private static void setPmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamIEEE1) _this_).setPmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamIEEE1) _this_).setPmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum valve opening (Pmin) (>= 0).  Typical Value = 0.
     */
    private Double pmin; // PU

    public Double getPmin() {
        return pmin;
    }

    public void setPmin(Double _value_) {
        pmin = _value_;
    }

    private static Object getPmin(BaseClass _this_) {
        return ((GovSteamIEEE1) _this_).getPmin();
    }

    private static void setPmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamIEEE1) _this_).setPmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamIEEE1) _this_).setPmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Governor lag time constant (T1).  Typical Value = 0.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((GovSteamIEEE1) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamIEEE1) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamIEEE1) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Governor lead time constant (T2).  Typical Value = 0.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    private static Object getT2(BaseClass _this_) {
        return ((GovSteamIEEE1) _this_).getT2();
    }

    private static void setT2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamIEEE1) _this_).setT2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamIEEE1) _this_).setT2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Valve positioner time constant (T3) (> 0).  Typical Value = 0.1.
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    private static Object getT3(BaseClass _this_) {
        return ((GovSteamIEEE1) _this_).getT3();
    }

    private static void setT3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamIEEE1) _this_).setT3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamIEEE1) _this_).setT3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Inlet piping/steam bowl time constant (T4).  Typical Value = 0.3.
     */
    private Double t4; // Seconds

    public Double getT4() {
        return t4;
    }

    public void setT4(Double _value_) {
        t4 = _value_;
    }

    private static Object getT4(BaseClass _this_) {
        return ((GovSteamIEEE1) _this_).getT4();
    }

    private static void setT4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamIEEE1) _this_).setT4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamIEEE1) _this_).setT4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant of second boiler pass (T5).  Typical Value = 5.
     */
    private Double t5; // Seconds

    public Double getT5() {
        return t5;
    }

    public void setT5(Double _value_) {
        t5 = _value_;
    }

    private static Object getT5(BaseClass _this_) {
        return ((GovSteamIEEE1) _this_).getT5();
    }

    private static void setT5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamIEEE1) _this_).setT5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamIEEE1) _this_).setT5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant of third boiler pass (T6).  Typical Value = 0.5.
     */
    private Double t6; // Seconds

    public Double getT6() {
        return t6;
    }

    public void setT6(Double _value_) {
        t6 = _value_;
    }

    private static Object getT6(BaseClass _this_) {
        return ((GovSteamIEEE1) _this_).getT6();
    }

    private static void setT6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamIEEE1) _this_).setT6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamIEEE1) _this_).setT6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant of fourth boiler pass (T7).  Typical Value = 0.
     */
    private Double t7; // Seconds

    public Double getT7() {
        return t7;
    }

    public void setT7(Double _value_) {
        t7 = _value_;
    }

    private static Object getT7(BaseClass _this_) {
        return ((GovSteamIEEE1) _this_).getT7();
    }

    private static void setT7(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamIEEE1) _this_).setT7((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamIEEE1) _this_).setT7(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum valve closing velocity (Uc) (< 0).  Unit = PU/sec.  Typical Value = -10.
     */
    private Double uc; // Simple_Float

    public Double getUc() {
        return uc;
    }

    public void setUc(Double _value_) {
        uc = _value_;
    }

    private static Object getUc(BaseClass _this_) {
        return ((GovSteamIEEE1) _this_).getUc();
    }

    private static void setUc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamIEEE1) _this_).setUc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamIEEE1) _this_).setUc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum valve opening velocity (Uo) (> 0).  Unit = PU/sec.  Typical Value = 1.
     */
    private Double uo; // Simple_Float

    public Double getUo() {
        return uo;
    }

    public void setUo(Double _value_) {
        uo = _value_;
    }

    private static Object getUo(BaseClass _this_) {
        return ((GovSteamIEEE1) _this_).getUo();
    }

    private static void setUo(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamIEEE1) _this_).setUo((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamIEEE1) _this_).setUo(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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
     * Get an attribute value.
     *
     * @param attrName The attribute name
     * @return         The attribute value
     */
    @Override
    public Object getAttribute(String attrName) {
        if (ATTR_DETAILS_MAP.containsKey(attrName)) {
            var getterFunction = ATTR_DETAILS_MAP.get(attrName).getter;
            return getterFunction.apply(this);
        }
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovSteamIEEE1", attrName));
        return "";
    }

    /**
     * Set an attribute value.
     *
     * @param attrName The attribute name
     * @param value    The attribute value
     */
    @Override
    public void setAttribute(String attrName, Object value) {
        if (ATTR_DETAILS_MAP.containsKey(attrName)) {
            var setterFunction = ATTR_DETAILS_MAP.get(attrName).setter;
            setterFunction.accept(this, value);
        } else {
            LOG.error(String.format("No-one knows what to do with attribute %s.%s and value %s",
                "GovSteamIEEE1", attrName, value));
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
            map.put("k", new AttrDetails("GovSteamIEEE1.k", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamIEEE1::getK, GovSteamIEEE1::setK));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k1", new AttrDetails("GovSteamIEEE1.k1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamIEEE1::getK1, GovSteamIEEE1::setK1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k2", new AttrDetails("GovSteamIEEE1.k2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamIEEE1::getK2, GovSteamIEEE1::setK2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k3", new AttrDetails("GovSteamIEEE1.k3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamIEEE1::getK3, GovSteamIEEE1::setK3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k4", new AttrDetails("GovSteamIEEE1.k4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamIEEE1::getK4, GovSteamIEEE1::setK4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k5", new AttrDetails("GovSteamIEEE1.k5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamIEEE1::getK5, GovSteamIEEE1::setK5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k6", new AttrDetails("GovSteamIEEE1.k6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamIEEE1::getK6, GovSteamIEEE1::setK6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k7", new AttrDetails("GovSteamIEEE1.k7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamIEEE1::getK7, GovSteamIEEE1::setK7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k8", new AttrDetails("GovSteamIEEE1.k8", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamIEEE1::getK8, GovSteamIEEE1::setK8));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovSteamIEEE1.mwbase", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamIEEE1::getMwbase, GovSteamIEEE1::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmax", new AttrDetails("GovSteamIEEE1.pmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamIEEE1::getPmax, GovSteamIEEE1::setPmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmin", new AttrDetails("GovSteamIEEE1.pmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamIEEE1::getPmin, GovSteamIEEE1::setPmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("GovSteamIEEE1.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamIEEE1::getT1, GovSteamIEEE1::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("GovSteamIEEE1.t2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamIEEE1::getT2, GovSteamIEEE1::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("GovSteamIEEE1.t3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamIEEE1::getT3, GovSteamIEEE1::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("GovSteamIEEE1.t4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamIEEE1::getT4, GovSteamIEEE1::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5", new AttrDetails("GovSteamIEEE1.t5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamIEEE1::getT5, GovSteamIEEE1::setT5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t6", new AttrDetails("GovSteamIEEE1.t6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamIEEE1::getT6, GovSteamIEEE1::setT6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t7", new AttrDetails("GovSteamIEEE1.t7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamIEEE1::getT7, GovSteamIEEE1::setT7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uc", new AttrDetails("GovSteamIEEE1.uc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamIEEE1::getUc, GovSteamIEEE1::setUc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uo", new AttrDetails("GovSteamIEEE1.uo", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamIEEE1::getUo, GovSteamIEEE1::setUo));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovSteamIEEE1(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
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
