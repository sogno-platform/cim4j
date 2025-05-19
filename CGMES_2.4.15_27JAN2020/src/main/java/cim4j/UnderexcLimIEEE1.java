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
 * The class represents the Type UEL1 model which has a circular limit boundary when plotted in terms of machine reactive power vs. real power output.  Reference: IEEE UEL1 421.5-2005 Section 10.1.
 */
@SuppressWarnings("unused")
public class UnderexcLimIEEE1 extends UnderexcitationLimiterDynamics {

    private static final Logging LOG = Logging.getLogger(UnderexcLimIEEE1.class);

    /**
     * Default constructor.
     */
    public UnderexcLimIEEE1() {
        setCimType("UnderexcLimIEEE1");
    }

    /**
     * UEL center setting (K).  Typical Value = 1.38.
     */
    private Double kuc; // PU

    public Double getKuc() {
        return kuc;
    }

    public void setKuc(Double _value_) {
        kuc = _value_;
    }

    public void setKuc(String _value_) {
        kuc = getDoubleFromString(_value_);
    }

    public String kucToString() {
        return kuc != null ? kuc.toString() : null;
    }

    /**
     * UEL excitation system stabilizer gain (K).  Typical Value = 3.3.
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
     * UEL integral gain (K).  Typical Value = 0.
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
     * UEL proportional gain (K).  Typical Value = 100.
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
     * UEL radius setting (K).  Typical Value = 1.95.
     */
    private Double kur; // PU

    public Double getKur() {
        return kur;
    }

    public void setKur(Double _value_) {
        kur = _value_;
    }

    public void setKur(String _value_) {
        kur = getDoubleFromString(_value_);
    }

    public String kurToString() {
        return kur != null ? kur.toString() : null;
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
     * UEL lag time constant (T).  Typical Value = 0.05.
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
     * UEL maximum limit for operating point phasor magnitude (V).  Typical Value = 5.8.
     */
    private Double vucmax; // PU

    public Double getVucmax() {
        return vucmax;
    }

    public void setVucmax(Double _value_) {
        vucmax = _value_;
    }

    public void setVucmax(String _value_) {
        vucmax = getDoubleFromString(_value_);
    }

    public String vucmaxToString() {
        return vucmax != null ? vucmax.toString() : null;
    }

    /**
     * UEL integrator output maximum limit (V).
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
     * UEL integrator output minimum limit (V).
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
     * UEL output maximum limit (V).  Typical Value = 18.
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
     * UEL output minimum limit (V).  Typical Value = -18.
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
     * UEL maximum limit for radius phasor magnitude (V).  Typical Value = 5.8.
     */
    private Double vurmax; // PU

    public Double getVurmax() {
        return vurmax;
    }

    public void setVurmax(Double _value_) {
        vurmax = _value_;
    }

    public void setVurmax(String _value_) {
        vurmax = getDoubleFromString(_value_);
    }

    public String vurmaxToString() {
        return vurmax != null ? vurmax.toString() : null;
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
        return getAttribute("UnderexcLimIEEE1", attrName);
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
        setAttribute("UnderexcLimIEEE1", attrName, objectValue);
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
        setAttribute("UnderexcLimIEEE1", attrName, stringValue);
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
            map.put("kuc", new AttrDetails("UnderexcLimIEEE1.kuc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kuf", new AttrDetails("UnderexcLimIEEE1.kuf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kui", new AttrDetails("UnderexcLimIEEE1.kui", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kul", new AttrDetails("UnderexcLimIEEE1.kul", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kur", new AttrDetails("UnderexcLimIEEE1.kur", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tu1", new AttrDetails("UnderexcLimIEEE1.tu1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tu2", new AttrDetails("UnderexcLimIEEE1.tu2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tu3", new AttrDetails("UnderexcLimIEEE1.tu3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tu4", new AttrDetails("UnderexcLimIEEE1.tu4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vucmax", new AttrDetails("UnderexcLimIEEE1.vucmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vuimax", new AttrDetails("UnderexcLimIEEE1.vuimax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vuimin", new AttrDetails("UnderexcLimIEEE1.vuimin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vulmax", new AttrDetails("UnderexcLimIEEE1.vulmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vulmin", new AttrDetails("UnderexcLimIEEE1.vulmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vurmax", new AttrDetails("UnderexcLimIEEE1.vurmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new UnderexcLimIEEE1().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("kuc", new GetterSetter(this::kucToString, null, this::setKuc));
        map.put("kuf", new GetterSetter(this::kufToString, null, this::setKuf));
        map.put("kui", new GetterSetter(this::kuiToString, null, this::setKui));
        map.put("kul", new GetterSetter(this::kulToString, null, this::setKul));
        map.put("kur", new GetterSetter(this::kurToString, null, this::setKur));
        map.put("tu1", new GetterSetter(this::tu1ToString, null, this::setTu1));
        map.put("tu2", new GetterSetter(this::tu2ToString, null, this::setTu2));
        map.put("tu3", new GetterSetter(this::tu3ToString, null, this::setTu3));
        map.put("tu4", new GetterSetter(this::tu4ToString, null, this::setTu4));
        map.put("vucmax", new GetterSetter(this::vucmaxToString, null, this::setVucmax));
        map.put("vuimax", new GetterSetter(this::vuimaxToString, null, this::setVuimax));
        map.put("vuimin", new GetterSetter(this::vuiminToString, null, this::setVuimin));
        map.put("vulmax", new GetterSetter(this::vulmaxToString, null, this::setVulmax));
        map.put("vulmin", new GetterSetter(this::vulminToString, null, this::setVulmin));
        map.put("vurmax", new GetterSetter(this::vurmaxToString, null, this::setVurmax));
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
