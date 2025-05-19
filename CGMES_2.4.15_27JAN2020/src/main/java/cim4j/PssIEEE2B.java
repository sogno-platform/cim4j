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
 * The class represents IEEE Std 421.5-2005 type PSS2B power system stabilizer model. This stabilizer model is designed to represent a variety of dual-input stabilizers, which normally use combinations of power and speed or frequency to derive the stabilizing signal.  Reference: IEEE 2B 421.5-2005 Section 8.2.
 */
@SuppressWarnings("unused")
public class PssIEEE2B extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssIEEE2B.class);

    /**
     * Default constructor.
     */
    public PssIEEE2B() {
        setCimType("PssIEEE2B");
    }

    /**
     * Type of input signal #1.  Typical Value = rotorSpeed.
     */
    private String inputSignal1Type; // InputSignalKind

    public String getInputSignal1Type() {
        return inputSignal1Type;
    }

    public void setInputSignal1Type(String _value_) {
        inputSignal1Type = _value_;
    }

    public String inputSignal1TypeToString() {
        return inputSignal1Type;
    }

    /**
     * Type of input signal #2.  Typical Value = generatorElectricalPower.
     */
    private String inputSignal2Type; // InputSignalKind

    public String getInputSignal2Type() {
        return inputSignal2Type;
    }

    public void setInputSignal2Type(String _value_) {
        inputSignal2Type = _value_;
    }

    public String inputSignal2TypeToString() {
        return inputSignal2Type;
    }

    /**
     * Stabilizer gain (Ks1).  Typical Value = 12.
     */
    private Double ks1; // PU

    public Double getKs1() {
        return ks1;
    }

    public void setKs1(Double _value_) {
        ks1 = _value_;
    }

    public void setKs1(String _value_) {
        ks1 = getDoubleFromString(_value_);
    }

    public String ks1ToString() {
        return ks1 != null ? ks1.toString() : null;
    }

    /**
     * Gain on signal #2 (Ks2).  Typical Value = 0.2.
     */
    private Double ks2; // PU

    public Double getKs2() {
        return ks2;
    }

    public void setKs2(Double _value_) {
        ks2 = _value_;
    }

    public void setKs2(String _value_) {
        ks2 = getDoubleFromString(_value_);
    }

    public String ks2ToString() {
        return ks2 != null ? ks2.toString() : null;
    }

    /**
     * Gain on signal #2 input before ramp-tracking filter (Ks3).  Typical Value = 1.
     */
    private Double ks3; // PU

    public Double getKs3() {
        return ks3;
    }

    public void setKs3(Double _value_) {
        ks3 = _value_;
    }

    public void setKs3(String _value_) {
        ks3 = getDoubleFromString(_value_);
    }

    public String ks3ToString() {
        return ks3 != null ? ks3.toString() : null;
    }

    /**
     * Denominator order of ramp tracking filter (M).  Typical Value = 5.
     */
    private Integer m; // Integer

    public Integer getM() {
        return m;
    }

    public void setM(Integer _value_) {
        m = _value_;
    }

    public void setM(String _value_) {
        m = getIntegerFromString(_value_);
    }

    public String mToString() {
        return m != null ? m.toString() : null;
    }

    /**
     * Order of ramp tracking filter (N).  Typical Value = 1.
     */
    private Integer n; // Integer

    public Integer getN() {
        return n;
    }

    public void setN(Integer _value_) {
        n = _value_;
    }

    public void setN(String _value_) {
        n = getIntegerFromString(_value_);
    }

    public String nToString() {
        return n != null ? n.toString() : null;
    }

    /**
     * Lead/lag time constant (T1).  Typical Value = 0.12.
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
     * Lead/lag time constant (T10).  Typical Value = 0.
     */
    private Double t10; // Seconds

    public Double getT10() {
        return t10;
    }

    public void setT10(Double _value_) {
        t10 = _value_;
    }

    public void setT10(String _value_) {
        t10 = getDoubleFromString(_value_);
    }

    public String t10ToString() {
        return t10 != null ? t10.toString() : null;
    }

    /**
     * Lead/lag time constant (T11).  Typical Value = 0.
     */
    private Double t11; // Seconds

    public Double getT11() {
        return t11;
    }

    public void setT11(Double _value_) {
        t11 = _value_;
    }

    public void setT11(String _value_) {
        t11 = getDoubleFromString(_value_);
    }

    public String t11ToString() {
        return t11 != null ? t11.toString() : null;
    }

    /**
     * Lead/lag time constant (T2).  Typical Value = 0.02.
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
     * Lead/lag time constant (T3).  Typical Value = 0.3.
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
     * Lead/lag time constant (T4).  Typical Value = 0.02.
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
     * Time constant on signal #1 (T6).  Typical Value = 0.
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
     * Time constant on signal #2 (T7).  Typical Value = 2.
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
     * Lead of ramp tracking filter (T8).  Typical Value = 0.2.
     */
    private Double t8; // Seconds

    public Double getT8() {
        return t8;
    }

    public void setT8(Double _value_) {
        t8 = _value_;
    }

    public void setT8(String _value_) {
        t8 = getDoubleFromString(_value_);
    }

    public String t8ToString() {
        return t8 != null ? t8.toString() : null;
    }

    /**
     * Lag of ramp tracking filter (T9).  Typical Value = 0.1.
     */
    private Double t9; // Seconds

    public Double getT9() {
        return t9;
    }

    public void setT9(Double _value_) {
        t9 = _value_;
    }

    public void setT9(String _value_) {
        t9 = getDoubleFromString(_value_);
    }

    public String t9ToString() {
        return t9 != null ? t9.toString() : null;
    }

    /**
     * First washout on signal #1 (Tw1).  Typical Value = 2.
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
     * Second washout on signal #1 (Tw2).  Typical Value = 2.
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
     * First washout on signal #2 (Tw3).  Typical Value = 2.
     */
    private Double tw3; // Seconds

    public Double getTw3() {
        return tw3;
    }

    public void setTw3(Double _value_) {
        tw3 = _value_;
    }

    public void setTw3(String _value_) {
        tw3 = getDoubleFromString(_value_);
    }

    public String tw3ToString() {
        return tw3 != null ? tw3.toString() : null;
    }

    /**
     * Second washout on signal #2 (Tw4).  Typical Value = 0.
     */
    private Double tw4; // Seconds

    public Double getTw4() {
        return tw4;
    }

    public void setTw4(Double _value_) {
        tw4 = _value_;
    }

    public void setTw4(String _value_) {
        tw4 = getDoubleFromString(_value_);
    }

    public String tw4ToString() {
        return tw4 != null ? tw4.toString() : null;
    }

    /**
     * Input signal #1 max limit (Vsi1max).  Typical Value = 2.
     */
    private Double vsi1max; // PU

    public Double getVsi1max() {
        return vsi1max;
    }

    public void setVsi1max(Double _value_) {
        vsi1max = _value_;
    }

    public void setVsi1max(String _value_) {
        vsi1max = getDoubleFromString(_value_);
    }

    public String vsi1maxToString() {
        return vsi1max != null ? vsi1max.toString() : null;
    }

    /**
     * Input signal #1 min limit (Vsi1min).  Typical Value = -2.
     */
    private Double vsi1min; // PU

    public Double getVsi1min() {
        return vsi1min;
    }

    public void setVsi1min(Double _value_) {
        vsi1min = _value_;
    }

    public void setVsi1min(String _value_) {
        vsi1min = getDoubleFromString(_value_);
    }

    public String vsi1minToString() {
        return vsi1min != null ? vsi1min.toString() : null;
    }

    /**
     * Input signal #2 max limit (Vsi2max).  Typical Value = 2.
     */
    private Double vsi2max; // PU

    public Double getVsi2max() {
        return vsi2max;
    }

    public void setVsi2max(Double _value_) {
        vsi2max = _value_;
    }

    public void setVsi2max(String _value_) {
        vsi2max = getDoubleFromString(_value_);
    }

    public String vsi2maxToString() {
        return vsi2max != null ? vsi2max.toString() : null;
    }

    /**
     * Input signal #2 min limit (Vsi2min).  Typical Value = -2.
     */
    private Double vsi2min; // PU

    public Double getVsi2min() {
        return vsi2min;
    }

    public void setVsi2min(Double _value_) {
        vsi2min = _value_;
    }

    public void setVsi2min(String _value_) {
        vsi2min = getDoubleFromString(_value_);
    }

    public String vsi2minToString() {
        return vsi2min != null ? vsi2min.toString() : null;
    }

    /**
     * Stabilizer output max limit (Vstmax).  Typical Value = 0.1.
     */
    private Double vstmax; // PU

    public Double getVstmax() {
        return vstmax;
    }

    public void setVstmax(Double _value_) {
        vstmax = _value_;
    }

    public void setVstmax(String _value_) {
        vstmax = getDoubleFromString(_value_);
    }

    public String vstmaxToString() {
        return vstmax != null ? vstmax.toString() : null;
    }

    /**
     * Stabilizer output min limit (Vstmin).  Typical Value = -0.1.
     */
    private Double vstmin; // PU

    public Double getVstmin() {
        return vstmin;
    }

    public void setVstmin(Double _value_) {
        vstmin = _value_;
    }

    public void setVstmin(String _value_) {
        vstmin = getDoubleFromString(_value_);
    }

    public String vstminToString() {
        return vstmin != null ? vstmin.toString() : null;
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
        return getAttribute("PssIEEE2B", attrName);
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
        setAttribute("PssIEEE2B", attrName, objectValue);
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
        setAttribute("PssIEEE2B", attrName, stringValue);
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
            map.put("inputSignal1Type", new AttrDetails("PssIEEE2B.inputSignal1Type", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("inputSignal2Type", new AttrDetails("PssIEEE2B.inputSignal2Type", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks1", new AttrDetails("PssIEEE2B.ks1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks2", new AttrDetails("PssIEEE2B.ks2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks3", new AttrDetails("PssIEEE2B.ks3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("m", new AttrDetails("PssIEEE2B.m", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("n", new AttrDetails("PssIEEE2B.n", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("PssIEEE2B.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t10", new AttrDetails("PssIEEE2B.t10", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t11", new AttrDetails("PssIEEE2B.t11", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("PssIEEE2B.t2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("PssIEEE2B.t3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("PssIEEE2B.t4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t6", new AttrDetails("PssIEEE2B.t6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t7", new AttrDetails("PssIEEE2B.t7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t8", new AttrDetails("PssIEEE2B.t8", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t9", new AttrDetails("PssIEEE2B.t9", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw1", new AttrDetails("PssIEEE2B.tw1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw2", new AttrDetails("PssIEEE2B.tw2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw3", new AttrDetails("PssIEEE2B.tw3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw4", new AttrDetails("PssIEEE2B.tw4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsi1max", new AttrDetails("PssIEEE2B.vsi1max", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsi1min", new AttrDetails("PssIEEE2B.vsi1min", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsi2max", new AttrDetails("PssIEEE2B.vsi2max", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsi2min", new AttrDetails("PssIEEE2B.vsi2min", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vstmax", new AttrDetails("PssIEEE2B.vstmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vstmin", new AttrDetails("PssIEEE2B.vstmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PssIEEE2B().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("inputSignal1Type", new GetterSetter(this::inputSignal1TypeToString, null, this::setInputSignal1Type));
        map.put("inputSignal2Type", new GetterSetter(this::inputSignal2TypeToString, null, this::setInputSignal2Type));
        map.put("ks1", new GetterSetter(this::ks1ToString, null, this::setKs1));
        map.put("ks2", new GetterSetter(this::ks2ToString, null, this::setKs2));
        map.put("ks3", new GetterSetter(this::ks3ToString, null, this::setKs3));
        map.put("m", new GetterSetter(this::mToString, null, this::setM));
        map.put("n", new GetterSetter(this::nToString, null, this::setN));
        map.put("t1", new GetterSetter(this::t1ToString, null, this::setT1));
        map.put("t10", new GetterSetter(this::t10ToString, null, this::setT10));
        map.put("t11", new GetterSetter(this::t11ToString, null, this::setT11));
        map.put("t2", new GetterSetter(this::t2ToString, null, this::setT2));
        map.put("t3", new GetterSetter(this::t3ToString, null, this::setT3));
        map.put("t4", new GetterSetter(this::t4ToString, null, this::setT4));
        map.put("t6", new GetterSetter(this::t6ToString, null, this::setT6));
        map.put("t7", new GetterSetter(this::t7ToString, null, this::setT7));
        map.put("t8", new GetterSetter(this::t8ToString, null, this::setT8));
        map.put("t9", new GetterSetter(this::t9ToString, null, this::setT9));
        map.put("tw1", new GetterSetter(this::tw1ToString, null, this::setTw1));
        map.put("tw2", new GetterSetter(this::tw2ToString, null, this::setTw2));
        map.put("tw3", new GetterSetter(this::tw3ToString, null, this::setTw3));
        map.put("tw4", new GetterSetter(this::tw4ToString, null, this::setTw4));
        map.put("vsi1max", new GetterSetter(this::vsi1maxToString, null, this::setVsi1max));
        map.put("vsi1min", new GetterSetter(this::vsi1minToString, null, this::setVsi1min));
        map.put("vsi2max", new GetterSetter(this::vsi2maxToString, null, this::setVsi2max));
        map.put("vsi2min", new GetterSetter(this::vsi2minToString, null, this::setVsi2min));
        map.put("vstmax", new GetterSetter(this::vstmaxToString, null, this::setVstmax));
        map.put("vstmin", new GetterSetter(this::vstminToString, null, this::setVstmin));
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
