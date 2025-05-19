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
 * The class represents IEEE Std 421.5-2005 type PSS3B power system stabilizer model. The PSS model PSS3B has dual inputs of electrical power and rotor angular frequency deviation. The signals are used to derive an equivalent mechanical power signal.  Reference: IEEE 3B 421.5-2005 Section 8.3.
 */
@SuppressWarnings("unused")
public class PssIEEE3B extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssIEEE3B.class);

    /**
     * Default constructor.
     */
    public PssIEEE3B() {
        setCimType("PssIEEE3B");
    }

    /**
     * Notch filter parameter (A1).  Typical Value = 0.359.
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
     * Notch filter parameter (A2).  Typical Value = 0.586.
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
     * Notch filter parameter (A3).  Typical Value = 0.429.
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
     * Notch filter parameter (A4).  Typical Value = 0.564.
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
     * Notch filter parameter (A5).  Typical Value = 0.001.
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
     * Notch filter parameter (A6).  Typical Value = 0.
     */
    private Double a6; // PU

    public Double getA6() {
        return a6;
    }

    public void setA6(Double _value_) {
        a6 = _value_;
    }

    public void setA6(String _value_) {
        a6 = getDoubleFromString(_value_);
    }

    public String a6ToString() {
        return a6 != null ? a6.toString() : null;
    }

    /**
     * Notch filter parameter (A7).  Typical Value = 0.031.
     */
    private Double a7; // PU

    public Double getA7() {
        return a7;
    }

    public void setA7(Double _value_) {
        a7 = _value_;
    }

    public void setA7(String _value_) {
        a7 = getDoubleFromString(_value_);
    }

    public String a7ToString() {
        return a7 != null ? a7.toString() : null;
    }

    /**
     * Notch filter parameter (A8).  Typical Value = 0.
     */
    private Double a8; // PU

    public Double getA8() {
        return a8;
    }

    public void setA8(Double _value_) {
        a8 = _value_;
    }

    public void setA8(String _value_) {
        a8 = getDoubleFromString(_value_);
    }

    public String a8ToString() {
        return a8 != null ? a8.toString() : null;
    }

    /**
     * Type of input signal #1.  Typical Value = generatorElectricalPower.
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
     * Type of input signal #2.  Typical Value = rotorSpeed.
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
     * Gain on signal # 1 (Ks1).  Typical Value = -0.602.
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
     * Gain on signal # 2 (Ks2).  Typical Value = 30.12.
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
     * Transducer time constant (T1).  Typical Value = 0.012.
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
     * Transducer time constant (T2).  Typical Value = 0.012.
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
     * Washout time constant (Tw1).  Typical Value = 0.3.
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
     * Washout time constant (Tw2).  Typical Value = 0.3.
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
     * Washout time constant (Tw3).  Typical Value = 0.6.
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
        return getAttribute("PssIEEE3B", attrName);
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
        setAttribute("PssIEEE3B", attrName, objectValue);
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
        setAttribute("PssIEEE3B", attrName, stringValue);
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
            map.put("a1", new AttrDetails("PssIEEE3B.a1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a2", new AttrDetails("PssIEEE3B.a2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a3", new AttrDetails("PssIEEE3B.a3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a4", new AttrDetails("PssIEEE3B.a4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a5", new AttrDetails("PssIEEE3B.a5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a6", new AttrDetails("PssIEEE3B.a6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a7", new AttrDetails("PssIEEE3B.a7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a8", new AttrDetails("PssIEEE3B.a8", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("inputSignal1Type", new AttrDetails("PssIEEE3B.inputSignal1Type", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("inputSignal2Type", new AttrDetails("PssIEEE3B.inputSignal2Type", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks1", new AttrDetails("PssIEEE3B.ks1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks2", new AttrDetails("PssIEEE3B.ks2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("PssIEEE3B.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("PssIEEE3B.t2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw1", new AttrDetails("PssIEEE3B.tw1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw2", new AttrDetails("PssIEEE3B.tw2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw3", new AttrDetails("PssIEEE3B.tw3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vstmax", new AttrDetails("PssIEEE3B.vstmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vstmin", new AttrDetails("PssIEEE3B.vstmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PssIEEE3B().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("a1", new GetterSetter(this::a1ToString, null, this::setA1));
        map.put("a2", new GetterSetter(this::a2ToString, null, this::setA2));
        map.put("a3", new GetterSetter(this::a3ToString, null, this::setA3));
        map.put("a4", new GetterSetter(this::a4ToString, null, this::setA4));
        map.put("a5", new GetterSetter(this::a5ToString, null, this::setA5));
        map.put("a6", new GetterSetter(this::a6ToString, null, this::setA6));
        map.put("a7", new GetterSetter(this::a7ToString, null, this::setA7));
        map.put("a8", new GetterSetter(this::a8ToString, null, this::setA8));
        map.put("inputSignal1Type", new GetterSetter(this::inputSignal1TypeToString, null, this::setInputSignal1Type));
        map.put("inputSignal2Type", new GetterSetter(this::inputSignal2TypeToString, null, this::setInputSignal2Type));
        map.put("ks1", new GetterSetter(this::ks1ToString, null, this::setKs1));
        map.put("ks2", new GetterSetter(this::ks2ToString, null, this::setKs2));
        map.put("t1", new GetterSetter(this::t1ToString, null, this::setT1));
        map.put("t2", new GetterSetter(this::t2ToString, null, this::setT2));
        map.put("tw1", new GetterSetter(this::tw1ToString, null, this::setTw1));
        map.put("tw2", new GetterSetter(this::tw2ToString, null, this::setTw2));
        map.put("tw3", new GetterSetter(this::tw3ToString, null, this::setTw3));
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
