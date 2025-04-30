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
 * The class represents IEEE Std 421.5-2005 type ST5B model. The Type ST5B excitation system is a variation of the Type ST1A model, with alternative overexcitation and underexcitation inputs and additional limits.  Reference: IEEE Standard 421.5-2005 Section 7.5.   Note: the block diagram in the IEEE 421.5 standard has input signal Vc and does not indicate the summation point with Vref. The implementation of the ExcIEEEST5B shall consider summation point with Vref.
 */
@SuppressWarnings("unused")
public class ExcIEEEST5B extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcIEEEST5B.class);

    /**
     * Default constructor.
     */
    public ExcIEEEST5B() {
        setCimType("ExcIEEEST5B");
    }

    /**
     * Rectifier regulation factor (K).  Typical Value = 0.004.
     */
    private Double kc; // PU

    public Double getKc() {
        return kc;
    }

    public void setKc(Double _value_) {
        kc = _value_;
    }

    public void setKc(String _value_) {
        kc = getDoubleFromString(_value_);
    }

    public String kcToString() {
        return kc != null ? kc.toString() : null;
    }

    /**
     * Regulator gain (K).  Typical Value = 200.
     */
    private Double kr; // PU

    public Double getKr() {
        return kr;
    }

    public void setKr(Double _value_) {
        kr = _value_;
    }

    public void setKr(String _value_) {
        kr = getDoubleFromString(_value_);
    }

    public String krToString() {
        return kr != null ? kr.toString() : null;
    }

    /**
     * Firing circuit time constant (T1).  Typical Value = 0.004.
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
     * Regulator lag time constant (T).  Typical Value = 6.
     */
    private Double tb1; // Seconds

    public Double getTb1() {
        return tb1;
    }

    public void setTb1(Double _value_) {
        tb1 = _value_;
    }

    public void setTb1(String _value_) {
        tb1 = getDoubleFromString(_value_);
    }

    public String tb1ToString() {
        return tb1 != null ? tb1.toString() : null;
    }

    /**
     * Regulator lag time constant (T).  Typical Value = 0.01.
     */
    private Double tb2; // Seconds

    public Double getTb2() {
        return tb2;
    }

    public void setTb2(Double _value_) {
        tb2 = _value_;
    }

    public void setTb2(String _value_) {
        tb2 = getDoubleFromString(_value_);
    }

    public String tb2ToString() {
        return tb2 != null ? tb2.toString() : null;
    }

    /**
     * Regulator lead time constant (T).  Typical Value = 0.8.
     */
    private Double tc1; // Seconds

    public Double getTc1() {
        return tc1;
    }

    public void setTc1(Double _value_) {
        tc1 = _value_;
    }

    public void setTc1(String _value_) {
        tc1 = getDoubleFromString(_value_);
    }

    public String tc1ToString() {
        return tc1 != null ? tc1.toString() : null;
    }

    /**
     * Regulator lead time constant (T).  Typical Value = 0.08.
     */
    private Double tc2; // Seconds

    public Double getTc2() {
        return tc2;
    }

    public void setTc2(Double _value_) {
        tc2 = _value_;
    }

    public void setTc2(String _value_) {
        tc2 = getDoubleFromString(_value_);
    }

    public String tc2ToString() {
        return tc2 != null ? tc2.toString() : null;
    }

    /**
     * OEL lag time constant (T).  Typical Value = 2.
     */
    private Double tob1; // Seconds

    public Double getTob1() {
        return tob1;
    }

    public void setTob1(Double _value_) {
        tob1 = _value_;
    }

    public void setTob1(String _value_) {
        tob1 = getDoubleFromString(_value_);
    }

    public String tob1ToString() {
        return tob1 != null ? tob1.toString() : null;
    }

    /**
     * OEL lag time constant (T).  Typical Value = 0.08.
     */
    private Double tob2; // Seconds

    public Double getTob2() {
        return tob2;
    }

    public void setTob2(Double _value_) {
        tob2 = _value_;
    }

    public void setTob2(String _value_) {
        tob2 = getDoubleFromString(_value_);
    }

    public String tob2ToString() {
        return tob2 != null ? tob2.toString() : null;
    }

    /**
     * OEL lead time constant (T).  Typical Value = 0.1.
     */
    private Double toc1; // Seconds

    public Double getToc1() {
        return toc1;
    }

    public void setToc1(Double _value_) {
        toc1 = _value_;
    }

    public void setToc1(String _value_) {
        toc1 = getDoubleFromString(_value_);
    }

    public String toc1ToString() {
        return toc1 != null ? toc1.toString() : null;
    }

    /**
     * OEL lead time constant (T).  Typical Value = 0.08.
     */
    private Double toc2; // Seconds

    public Double getToc2() {
        return toc2;
    }

    public void setToc2(Double _value_) {
        toc2 = _value_;
    }

    public void setToc2(String _value_) {
        toc2 = getDoubleFromString(_value_);
    }

    public String toc2ToString() {
        return toc2 != null ? toc2.toString() : null;
    }

    /**
     * UEL lag time constant (T).  Typical Value = 10.
     */
    private Double tub1; // Seconds

    public Double getTub1() {
        return tub1;
    }

    public void setTub1(Double _value_) {
        tub1 = _value_;
    }

    public void setTub1(String _value_) {
        tub1 = getDoubleFromString(_value_);
    }

    public String tub1ToString() {
        return tub1 != null ? tub1.toString() : null;
    }

    /**
     * UEL lag time constant (T).  Typical Value = 0.05.
     */
    private Double tub2; // Seconds

    public Double getTub2() {
        return tub2;
    }

    public void setTub2(Double _value_) {
        tub2 = _value_;
    }

    public void setTub2(String _value_) {
        tub2 = getDoubleFromString(_value_);
    }

    public String tub2ToString() {
        return tub2 != null ? tub2.toString() : null;
    }

    /**
     * UEL lead time constant (T).  Typical Value = 2.
     */
    private Double tuc1; // Seconds

    public Double getTuc1() {
        return tuc1;
    }

    public void setTuc1(Double _value_) {
        tuc1 = _value_;
    }

    public void setTuc1(String _value_) {
        tuc1 = getDoubleFromString(_value_);
    }

    public String tuc1ToString() {
        return tuc1 != null ? tuc1.toString() : null;
    }

    /**
     * UEL lead time constant (T).  Typical Value = 0.1.
     */
    private Double tuc2; // Seconds

    public Double getTuc2() {
        return tuc2;
    }

    public void setTuc2(Double _value_) {
        tuc2 = _value_;
    }

    public void setTuc2(String _value_) {
        tuc2 = getDoubleFromString(_value_);
    }

    public String tuc2ToString() {
        return tuc2 != null ? tuc2.toString() : null;
    }

    /**
     * Maximum voltage regulator output (V).  Typical Value = 5.
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    public void setVrmax(String _value_) {
        vrmax = getDoubleFromString(_value_);
    }

    public String vrmaxToString() {
        return vrmax != null ? vrmax.toString() : null;
    }

    /**
     * Minimum voltage regulator output (V).  Typical Value = -4.
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    public void setVrmin(String _value_) {
        vrmin = getDoubleFromString(_value_);
    }

    public String vrminToString() {
        return vrmin != null ? vrmin.toString() : null;
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
        return getAttribute("ExcIEEEST5B", attrName);
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
        setAttribute("ExcIEEEST5B", attrName, objectValue);
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
        setAttribute("ExcIEEEST5B", attrName, stringValue);
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
            map.put("kc", new AttrDetails("ExcIEEEST5B.kc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kr", new AttrDetails("ExcIEEEST5B.kr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("ExcIEEEST5B.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb1", new AttrDetails("ExcIEEEST5B.tb1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb2", new AttrDetails("ExcIEEEST5B.tb2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc1", new AttrDetails("ExcIEEEST5B.tc1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc2", new AttrDetails("ExcIEEEST5B.tc2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tob1", new AttrDetails("ExcIEEEST5B.tob1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tob2", new AttrDetails("ExcIEEEST5B.tob2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("toc1", new AttrDetails("ExcIEEEST5B.toc1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("toc2", new AttrDetails("ExcIEEEST5B.toc2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tub1", new AttrDetails("ExcIEEEST5B.tub1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tub2", new AttrDetails("ExcIEEEST5B.tub2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tuc1", new AttrDetails("ExcIEEEST5B.tuc1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tuc2", new AttrDetails("ExcIEEEST5B.tuc2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcIEEEST5B.vrmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcIEEEST5B.vrmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcIEEEST5B().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("kc", new GetterSetter(this::kcToString, null, this::setKc));
        map.put("kr", new GetterSetter(this::krToString, null, this::setKr));
        map.put("t1", new GetterSetter(this::t1ToString, null, this::setT1));
        map.put("tb1", new GetterSetter(this::tb1ToString, null, this::setTb1));
        map.put("tb2", new GetterSetter(this::tb2ToString, null, this::setTb2));
        map.put("tc1", new GetterSetter(this::tc1ToString, null, this::setTc1));
        map.put("tc2", new GetterSetter(this::tc2ToString, null, this::setTc2));
        map.put("tob1", new GetterSetter(this::tob1ToString, null, this::setTob1));
        map.put("tob2", new GetterSetter(this::tob2ToString, null, this::setTob2));
        map.put("toc1", new GetterSetter(this::toc1ToString, null, this::setToc1));
        map.put("toc2", new GetterSetter(this::toc2ToString, null, this::setToc2));
        map.put("tub1", new GetterSetter(this::tub1ToString, null, this::setTub1));
        map.put("tub2", new GetterSetter(this::tub2ToString, null, this::setTub2));
        map.put("tuc1", new GetterSetter(this::tuc1ToString, null, this::setTuc1));
        map.put("tuc2", new GetterSetter(this::tuc2ToString, null, this::setTuc2));
        map.put("vrmax", new GetterSetter(this::vrmaxToString, null, this::setVrmax));
        map.put("vrmin", new GetterSetter(this::vrminToString, null, this::setVrmin));
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
