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
 * IEEE 421.5-2005 type PSS3B power system stabilizer model. The PSS model PSS3B has dual inputs of electrical power and rotor angular frequency deviation. The signals are used to derive an equivalent mechanical power signal. This model has 2 input signals. They have the following fixed types (expressed in terms of InputSignalKind values): the first one is of rotorAngleFrequencyDeviation type and the second one is of generatorElectricalPower type. Reference: IEEE 3B 421.5-2005, 8.3.
 */
@SuppressWarnings("unused")
public class PssIEEE3B extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssIEEE3B.class);

    /**
     * Constructor.
     */
    public PssIEEE3B(String rdfid) {
        super("PssIEEE3B", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected PssIEEE3B(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Notch filter parameter (<i>A1</i>).  Typical value = 0,359.
     */
    private Double a1; // PU

    public Double getA1() {
        return a1;
    }

    public void setA1(Double _value_) {
        a1 = _value_;
    }

    private static Object getA1(BaseClass _this_) {
        return ((PssIEEE3B) _this_).getA1();
    }

    private static void setA1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE3B) _this_).setA1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE3B) _this_).setA1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Notch filter parameter (<i>A2</i>).  Typical value = 0,586.
     */
    private Double a2; // PU

    public Double getA2() {
        return a2;
    }

    public void setA2(Double _value_) {
        a2 = _value_;
    }

    private static Object getA2(BaseClass _this_) {
        return ((PssIEEE3B) _this_).getA2();
    }

    private static void setA2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE3B) _this_).setA2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE3B) _this_).setA2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Notch filter parameter (<i>A3</i>).  Typical value = 0,429.
     */
    private Double a3; // PU

    public Double getA3() {
        return a3;
    }

    public void setA3(Double _value_) {
        a3 = _value_;
    }

    private static Object getA3(BaseClass _this_) {
        return ((PssIEEE3B) _this_).getA3();
    }

    private static void setA3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE3B) _this_).setA3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE3B) _this_).setA3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Notch filter parameter (<i>A4</i>).  Typical value = 0,564.
     */
    private Double a4; // PU

    public Double getA4() {
        return a4;
    }

    public void setA4(Double _value_) {
        a4 = _value_;
    }

    private static Object getA4(BaseClass _this_) {
        return ((PssIEEE3B) _this_).getA4();
    }

    private static void setA4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE3B) _this_).setA4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE3B) _this_).setA4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Notch filter parameter (<i>A5</i>).  Typical value = 0,001.
     */
    private Double a5; // PU

    public Double getA5() {
        return a5;
    }

    public void setA5(Double _value_) {
        a5 = _value_;
    }

    private static Object getA5(BaseClass _this_) {
        return ((PssIEEE3B) _this_).getA5();
    }

    private static void setA5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE3B) _this_).setA5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE3B) _this_).setA5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Notch filter parameter (<i>A6</i>).  Typical value = 0.
     */
    private Double a6; // PU

    public Double getA6() {
        return a6;
    }

    public void setA6(Double _value_) {
        a6 = _value_;
    }

    private static Object getA6(BaseClass _this_) {
        return ((PssIEEE3B) _this_).getA6();
    }

    private static void setA6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE3B) _this_).setA6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE3B) _this_).setA6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Notch filter parameter (<i>A7</i>).  Typical value = 0,031.
     */
    private Double a7; // PU

    public Double getA7() {
        return a7;
    }

    public void setA7(Double _value_) {
        a7 = _value_;
    }

    private static Object getA7(BaseClass _this_) {
        return ((PssIEEE3B) _this_).getA7();
    }

    private static void setA7(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE3B) _this_).setA7((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE3B) _this_).setA7(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Notch filter parameter (<i>A8</i>).  Typical value = 0.
     */
    private Double a8; // PU

    public Double getA8() {
        return a8;
    }

    public void setA8(Double _value_) {
        a8 = _value_;
    }

    private static Object getA8(BaseClass _this_) {
        return ((PssIEEE3B) _this_).getA8();
    }

    private static void setA8(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE3B) _this_).setA8((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE3B) _this_).setA8(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain on signal # 1 (<i>Ks1</i>).  Typical value = -0,602.
     */
    private Double ks1; // PU

    public Double getKs1() {
        return ks1;
    }

    public void setKs1(Double _value_) {
        ks1 = _value_;
    }

    private static Object getKs1(BaseClass _this_) {
        return ((PssIEEE3B) _this_).getKs1();
    }

    private static void setKs1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE3B) _this_).setKs1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE3B) _this_).setKs1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain on signal # 2 (<i>Ks2</i>).  Typical value = 30,12.
     */
    private Double ks2; // PU

    public Double getKs2() {
        return ks2;
    }

    public void setKs2(Double _value_) {
        ks2 = _value_;
    }

    private static Object getKs2(BaseClass _this_) {
        return ((PssIEEE3B) _this_).getKs2();
    }

    private static void setKs2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE3B) _this_).setKs2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE3B) _this_).setKs2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Transducer time constant (<i>T1</i>) (&gt;= 0).  Typical value = 0,012.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((PssIEEE3B) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE3B) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE3B) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Transducer time constant (<i>T2</i>) (&gt;= 0).  Typical value = 0,012.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    private static Object getT2(BaseClass _this_) {
        return ((PssIEEE3B) _this_).getT2();
    }

    private static void setT2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE3B) _this_).setT2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE3B) _this_).setT2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Washout time constant (<i>Tw1</i>) (&gt;= 0).  Typical value = 0,3.
     */
    private Double tw1; // Seconds

    public Double getTw1() {
        return tw1;
    }

    public void setTw1(Double _value_) {
        tw1 = _value_;
    }

    private static Object getTw1(BaseClass _this_) {
        return ((PssIEEE3B) _this_).getTw1();
    }

    private static void setTw1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE3B) _this_).setTw1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE3B) _this_).setTw1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Washout time constant (<i>Tw2</i>) (&gt;= 0).  Typical value = 0,3.
     */
    private Double tw2; // Seconds

    public Double getTw2() {
        return tw2;
    }

    public void setTw2(Double _value_) {
        tw2 = _value_;
    }

    private static Object getTw2(BaseClass _this_) {
        return ((PssIEEE3B) _this_).getTw2();
    }

    private static void setTw2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE3B) _this_).setTw2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE3B) _this_).setTw2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Washout time constant (<i>Tw3</i>) (&gt;= 0).  Typical value = 0,6.
     */
    private Double tw3; // Seconds

    public Double getTw3() {
        return tw3;
    }

    public void setTw3(Double _value_) {
        tw3 = _value_;
    }

    private static Object getTw3(BaseClass _this_) {
        return ((PssIEEE3B) _this_).getTw3();
    }

    private static void setTw3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE3B) _this_).setTw3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE3B) _this_).setTw3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Stabilizer output maximum limit (<i>Vstmax</i>) (&gt; PssIEEE3B.vstmin).  Typical value = 0,1.
     */
    private Double vstmax; // PU

    public Double getVstmax() {
        return vstmax;
    }

    public void setVstmax(Double _value_) {
        vstmax = _value_;
    }

    private static Object getVstmax(BaseClass _this_) {
        return ((PssIEEE3B) _this_).getVstmax();
    }

    private static void setVstmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE3B) _this_).setVstmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE3B) _this_).setVstmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Stabilizer output minimum limit (<i>Vstmin</i>) (&lt; PssIEEE3B.vstmax).  Typical value = -0,1.
     */
    private Double vstmin; // PU

    public Double getVstmin() {
        return vstmin;
    }

    public void setVstmin(Double _value_) {
        vstmin = _value_;
    }

    private static Object getVstmin(BaseClass _this_) {
        return ((PssIEEE3B) _this_).getVstmin();
    }

    private static void setVstmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE3B) _this_).setVstmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE3B) _this_).setVstmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PssIEEE3B", attrName));
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
                "PssIEEE3B", attrName, value));
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
            map.put("a1", new AttrDetails("PssIEEE3B.a1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE3B::getA1, PssIEEE3B::setA1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a2", new AttrDetails("PssIEEE3B.a2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE3B::getA2, PssIEEE3B::setA2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a3", new AttrDetails("PssIEEE3B.a3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE3B::getA3, PssIEEE3B::setA3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a4", new AttrDetails("PssIEEE3B.a4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE3B::getA4, PssIEEE3B::setA4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a5", new AttrDetails("PssIEEE3B.a5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE3B::getA5, PssIEEE3B::setA5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a6", new AttrDetails("PssIEEE3B.a6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE3B::getA6, PssIEEE3B::setA6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a7", new AttrDetails("PssIEEE3B.a7", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE3B::getA7, PssIEEE3B::setA7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a8", new AttrDetails("PssIEEE3B.a8", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE3B::getA8, PssIEEE3B::setA8));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks1", new AttrDetails("PssIEEE3B.ks1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE3B::getKs1, PssIEEE3B::setKs1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks2", new AttrDetails("PssIEEE3B.ks2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE3B::getKs2, PssIEEE3B::setKs2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("PssIEEE3B.t1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE3B::getT1, PssIEEE3B::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("PssIEEE3B.t2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE3B::getT2, PssIEEE3B::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw1", new AttrDetails("PssIEEE3B.tw1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE3B::getTw1, PssIEEE3B::setTw1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw2", new AttrDetails("PssIEEE3B.tw2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE3B::getTw2, PssIEEE3B::setTw2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw3", new AttrDetails("PssIEEE3B.tw3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE3B::getTw3, PssIEEE3B::setTw3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vstmax", new AttrDetails("PssIEEE3B.vstmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE3B::getVstmax, PssIEEE3B::setVstmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vstmin", new AttrDetails("PssIEEE3B.vstmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE3B::getVstmin, PssIEEE3B::setVstmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PssIEEE3B(null).allAttrDetailsMap());
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
