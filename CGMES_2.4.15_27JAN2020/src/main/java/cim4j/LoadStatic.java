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
 * General static load model representing the sensitivity of the real and reactive power consumed by the load to the amplitude and frequency of the bus voltage.
 */
@SuppressWarnings("unused")
public class LoadStatic extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(LoadStatic.class);

    /**
     * Default constructor.
     */
    public LoadStatic() {
        setCimType("LoadStatic");
    }

    /**
     * Aggregate load to which this aggregate static load belongs.
     */
    private LoadAggregate LoadAggregate; // OneToOne

    public LoadAggregate getLoadAggregate() {
        return LoadAggregate;
    }

    public void setLoadAggregate(BaseClass _object_) {
        if (!(_object_ instanceof LoadAggregate)) {
            throw new IllegalArgumentException("Object is not LoadAggregate");
        }
        if (LoadAggregate != _object_) {
            LoadAggregate = (LoadAggregate) _object_;
            LoadAggregate.setLoadStatic(this);
        }
    }

    public String LoadAggregateToString() {
        return LoadAggregate != null ? LoadAggregate.getRdfid() : null;
    }

    /**
     * First term voltage exponent for active power (Ep1).  Used only when .staticLoadModelType = exponential.
     */
    private Double ep1; // Simple_Float

    public Double getEp1() {
        return ep1;
    }

    public void setEp1(Double _value_) {
        ep1 = _value_;
    }

    public void setEp1(String _value_) {
        ep1 = getDoubleFromString(_value_);
    }

    public String ep1ToString() {
        return ep1 != null ? ep1.toString() : null;
    }

    /**
     * Second term voltage exponent for active power (Ep2).  Used only when .staticLoadModelType = exponential.
     */
    private Double ep2; // Simple_Float

    public Double getEp2() {
        return ep2;
    }

    public void setEp2(Double _value_) {
        ep2 = _value_;
    }

    public void setEp2(String _value_) {
        ep2 = getDoubleFromString(_value_);
    }

    public String ep2ToString() {
        return ep2 != null ? ep2.toString() : null;
    }

    /**
     * Third term voltage exponent for active power (Ep3).  Used only when .staticLoadModelType = exponential.
     */
    private Double ep3; // Simple_Float

    public Double getEp3() {
        return ep3;
    }

    public void setEp3(Double _value_) {
        ep3 = _value_;
    }

    public void setEp3(String _value_) {
        ep3 = getDoubleFromString(_value_);
    }

    public String ep3ToString() {
        return ep3 != null ? ep3.toString() : null;
    }

    /**
     * First term voltage exponent for reactive power (Eq1).  Used only when .staticLoadModelType = exponential.
     */
    private Double eq1; // Simple_Float

    public Double getEq1() {
        return eq1;
    }

    public void setEq1(Double _value_) {
        eq1 = _value_;
    }

    public void setEq1(String _value_) {
        eq1 = getDoubleFromString(_value_);
    }

    public String eq1ToString() {
        return eq1 != null ? eq1.toString() : null;
    }

    /**
     * Second term voltage exponent for reactive power (Eq2).  Used only when .staticLoadModelType = exponential.
     */
    private Double eq2; // Simple_Float

    public Double getEq2() {
        return eq2;
    }

    public void setEq2(Double _value_) {
        eq2 = _value_;
    }

    public void setEq2(String _value_) {
        eq2 = getDoubleFromString(_value_);
    }

    public String eq2ToString() {
        return eq2 != null ? eq2.toString() : null;
    }

    /**
     * Third term voltage exponent for reactive power (Eq3).  Used only when .staticLoadModelType = exponential.
     */
    private Double eq3; // Simple_Float

    public Double getEq3() {
        return eq3;
    }

    public void setEq3(Double _value_) {
        eq3 = _value_;
    }

    public void setEq3(String _value_) {
        eq3 = getDoubleFromString(_value_);
    }

    public String eq3ToString() {
        return eq3 != null ? eq3.toString() : null;
    }

    /**
     * First term voltage coefficient for active power (Kp1).  Not used when .staticLoadModelType = constantZ.
     */
    private Double kp1; // Simple_Float

    public Double getKp1() {
        return kp1;
    }

    public void setKp1(Double _value_) {
        kp1 = _value_;
    }

    public void setKp1(String _value_) {
        kp1 = getDoubleFromString(_value_);
    }

    public String kp1ToString() {
        return kp1 != null ? kp1.toString() : null;
    }

    /**
     * Second term voltage coefficient for active power (Kp2).  Not used when .staticLoadModelType = constantZ.
     */
    private Double kp2; // Simple_Float

    public Double getKp2() {
        return kp2;
    }

    public void setKp2(Double _value_) {
        kp2 = _value_;
    }

    public void setKp2(String _value_) {
        kp2 = getDoubleFromString(_value_);
    }

    public String kp2ToString() {
        return kp2 != null ? kp2.toString() : null;
    }

    /**
     * Third term voltage coefficient for active power (Kp3).  Not used when .staticLoadModelType = constantZ.
     */
    private Double kp3; // Simple_Float

    public Double getKp3() {
        return kp3;
    }

    public void setKp3(Double _value_) {
        kp3 = _value_;
    }

    public void setKp3(String _value_) {
        kp3 = getDoubleFromString(_value_);
    }

    public String kp3ToString() {
        return kp3 != null ? kp3.toString() : null;
    }

    /**
     * Frequency coefficient for active power (Kp4).  Must be non-zero when .staticLoadModelType = ZIP2.  Not used for all other values of .staticLoadModelType.
     */
    private Double kp4; // Simple_Float

    public Double getKp4() {
        return kp4;
    }

    public void setKp4(Double _value_) {
        kp4 = _value_;
    }

    public void setKp4(String _value_) {
        kp4 = getDoubleFromString(_value_);
    }

    public String kp4ToString() {
        return kp4 != null ? kp4.toString() : null;
    }

    /**
     * Frequency deviation coefficient for active power (Kpf).  Not used when .staticLoadModelType = constantZ.
     */
    private Double kpf; // Simple_Float

    public Double getKpf() {
        return kpf;
    }

    public void setKpf(Double _value_) {
        kpf = _value_;
    }

    public void setKpf(String _value_) {
        kpf = getDoubleFromString(_value_);
    }

    public String kpfToString() {
        return kpf != null ? kpf.toString() : null;
    }

    /**
     * First term voltage coefficient for reactive power (Kq1).  Not used when .staticLoadModelType = constantZ.
     */
    private Double kq1; // Simple_Float

    public Double getKq1() {
        return kq1;
    }

    public void setKq1(Double _value_) {
        kq1 = _value_;
    }

    public void setKq1(String _value_) {
        kq1 = getDoubleFromString(_value_);
    }

    public String kq1ToString() {
        return kq1 != null ? kq1.toString() : null;
    }

    /**
     * Second term voltage coefficient for reactive power (Kq2).  Not used when .staticLoadModelType = constantZ.
     */
    private Double kq2; // Simple_Float

    public Double getKq2() {
        return kq2;
    }

    public void setKq2(Double _value_) {
        kq2 = _value_;
    }

    public void setKq2(String _value_) {
        kq2 = getDoubleFromString(_value_);
    }

    public String kq2ToString() {
        return kq2 != null ? kq2.toString() : null;
    }

    /**
     * Third term voltage coefficient for reactive power (Kq3).  Not used when .staticLoadModelType = constantZ.
     */
    private Double kq3; // Simple_Float

    public Double getKq3() {
        return kq3;
    }

    public void setKq3(Double _value_) {
        kq3 = _value_;
    }

    public void setKq3(String _value_) {
        kq3 = getDoubleFromString(_value_);
    }

    public String kq3ToString() {
        return kq3 != null ? kq3.toString() : null;
    }

    /**
     * Frequency coefficient for reactive power (Kq4).  Must be non-zero when .staticLoadModelType = ZIP2.  Not used for all other values of .staticLoadModelType.
     */
    private Double kq4; // Simple_Float

    public Double getKq4() {
        return kq4;
    }

    public void setKq4(Double _value_) {
        kq4 = _value_;
    }

    public void setKq4(String _value_) {
        kq4 = getDoubleFromString(_value_);
    }

    public String kq4ToString() {
        return kq4 != null ? kq4.toString() : null;
    }

    /**
     * Frequency deviation coefficient for reactive power (Kqf).  Not used when .staticLoadModelType = constantZ.
     */
    private Double kqf; // Simple_Float

    public Double getKqf() {
        return kqf;
    }

    public void setKqf(Double _value_) {
        kqf = _value_;
    }

    public void setKqf(String _value_) {
        kqf = getDoubleFromString(_value_);
    }

    public String kqfToString() {
        return kqf != null ? kqf.toString() : null;
    }

    /**
     * Type of static load model.  Typical Value = constantZ.
     */
    private String staticLoadModelType; // StaticLoadModelKind

    public String getStaticLoadModelType() {
        return staticLoadModelType;
    }

    public void setStaticLoadModelType(String _value_) {
        staticLoadModelType = _value_;
    }

    public String staticLoadModelTypeToString() {
        return staticLoadModelType;
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
        return getAttribute("LoadStatic", attrName);
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
        setAttribute("LoadStatic", attrName, objectValue);
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
        setAttribute("LoadStatic", attrName, stringValue);
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
            map.put("LoadAggregate", new AttrDetails("LoadStatic.LoadAggregate", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ep1", new AttrDetails("LoadStatic.ep1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ep2", new AttrDetails("LoadStatic.ep2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ep3", new AttrDetails("LoadStatic.ep3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eq1", new AttrDetails("LoadStatic.eq1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eq2", new AttrDetails("LoadStatic.eq2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eq3", new AttrDetails("LoadStatic.eq3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp1", new AttrDetails("LoadStatic.kp1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp2", new AttrDetails("LoadStatic.kp2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp3", new AttrDetails("LoadStatic.kp3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp4", new AttrDetails("LoadStatic.kp4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpf", new AttrDetails("LoadStatic.kpf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kq1", new AttrDetails("LoadStatic.kq1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kq2", new AttrDetails("LoadStatic.kq2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kq3", new AttrDetails("LoadStatic.kq3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kq4", new AttrDetails("LoadStatic.kq4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kqf", new AttrDetails("LoadStatic.kqf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("staticLoadModelType", new AttrDetails("LoadStatic.staticLoadModelType", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new LoadStatic().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("LoadAggregate", new GetterSetter(this::LoadAggregateToString, this::setLoadAggregate, null));
        map.put("ep1", new GetterSetter(this::ep1ToString, null, this::setEp1));
        map.put("ep2", new GetterSetter(this::ep2ToString, null, this::setEp2));
        map.put("ep3", new GetterSetter(this::ep3ToString, null, this::setEp3));
        map.put("eq1", new GetterSetter(this::eq1ToString, null, this::setEq1));
        map.put("eq2", new GetterSetter(this::eq2ToString, null, this::setEq2));
        map.put("eq3", new GetterSetter(this::eq3ToString, null, this::setEq3));
        map.put("kp1", new GetterSetter(this::kp1ToString, null, this::setKp1));
        map.put("kp2", new GetterSetter(this::kp2ToString, null, this::setKp2));
        map.put("kp3", new GetterSetter(this::kp3ToString, null, this::setKp3));
        map.put("kp4", new GetterSetter(this::kp4ToString, null, this::setKp4));
        map.put("kpf", new GetterSetter(this::kpfToString, null, this::setKpf));
        map.put("kq1", new GetterSetter(this::kq1ToString, null, this::setKq1));
        map.put("kq2", new GetterSetter(this::kq2ToString, null, this::setKq2));
        map.put("kq3", new GetterSetter(this::kq3ToString, null, this::setKq3));
        map.put("kq4", new GetterSetter(this::kq4ToString, null, this::setKq4));
        map.put("kqf", new GetterSetter(this::kqfToString, null, this::setKqf));
        map.put("staticLoadModelType", new GetterSetter(this::staticLoadModelTypeToString, null, this::setStaticLoadModelType));
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
