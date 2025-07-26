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
     * Constructor.
     */
    public LoadStatic(String rdfid) {
        super("LoadStatic", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected LoadStatic(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Aggregate load to which this aggregate static load belongs.
     */
    private LoadAggregate LoadAggregate; // OneToOne

    private String LoadAggregateId;

    public LoadAggregate getLoadAggregate() {
        return LoadAggregate;
    }

    public void setLoadAggregate(LoadAggregate _object_) {
        if (LoadAggregate != _object_) {
            LoadAggregate = _object_;
            _object_.setLoadStatic(this);
            LoadAggregateId = _object_.getRdfid();
        }
    }

    private static Object getLoadAggregate(BaseClass _this_) {
        var obj = ((LoadStatic) _this_).getLoadAggregate();
        var id = ((LoadStatic) _this_).LoadAggregateId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setLoadAggregate(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((LoadStatic) _this_).LoadAggregateId = (String) _value_;
        } else if (_value_ instanceof LoadAggregate) {
            ((LoadStatic) _this_).setLoadAggregate((LoadAggregate) _value_);
        } else {
            throw new IllegalArgumentException("Object is not LoadAggregate");
        }
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

    private static Object getEp1(BaseClass _this_) {
        return ((LoadStatic) _this_).getEp1();
    }

    private static void setEp1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadStatic) _this_).setEp1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadStatic) _this_).setEp1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getEp2(BaseClass _this_) {
        return ((LoadStatic) _this_).getEp2();
    }

    private static void setEp2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadStatic) _this_).setEp2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadStatic) _this_).setEp2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getEp3(BaseClass _this_) {
        return ((LoadStatic) _this_).getEp3();
    }

    private static void setEp3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadStatic) _this_).setEp3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadStatic) _this_).setEp3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getEq1(BaseClass _this_) {
        return ((LoadStatic) _this_).getEq1();
    }

    private static void setEq1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadStatic) _this_).setEq1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadStatic) _this_).setEq1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getEq2(BaseClass _this_) {
        return ((LoadStatic) _this_).getEq2();
    }

    private static void setEq2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadStatic) _this_).setEq2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadStatic) _this_).setEq2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getEq3(BaseClass _this_) {
        return ((LoadStatic) _this_).getEq3();
    }

    private static void setEq3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadStatic) _this_).setEq3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadStatic) _this_).setEq3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getKp1(BaseClass _this_) {
        return ((LoadStatic) _this_).getKp1();
    }

    private static void setKp1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadStatic) _this_).setKp1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadStatic) _this_).setKp1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getKp2(BaseClass _this_) {
        return ((LoadStatic) _this_).getKp2();
    }

    private static void setKp2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadStatic) _this_).setKp2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadStatic) _this_).setKp2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getKp3(BaseClass _this_) {
        return ((LoadStatic) _this_).getKp3();
    }

    private static void setKp3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadStatic) _this_).setKp3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadStatic) _this_).setKp3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getKp4(BaseClass _this_) {
        return ((LoadStatic) _this_).getKp4();
    }

    private static void setKp4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadStatic) _this_).setKp4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadStatic) _this_).setKp4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getKpf(BaseClass _this_) {
        return ((LoadStatic) _this_).getKpf();
    }

    private static void setKpf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadStatic) _this_).setKpf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadStatic) _this_).setKpf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getKq1(BaseClass _this_) {
        return ((LoadStatic) _this_).getKq1();
    }

    private static void setKq1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadStatic) _this_).setKq1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadStatic) _this_).setKq1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getKq2(BaseClass _this_) {
        return ((LoadStatic) _this_).getKq2();
    }

    private static void setKq2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadStatic) _this_).setKq2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadStatic) _this_).setKq2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getKq3(BaseClass _this_) {
        return ((LoadStatic) _this_).getKq3();
    }

    private static void setKq3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadStatic) _this_).setKq3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadStatic) _this_).setKq3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getKq4(BaseClass _this_) {
        return ((LoadStatic) _this_).getKq4();
    }

    private static void setKq4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadStatic) _this_).setKq4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadStatic) _this_).setKq4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getKqf(BaseClass _this_) {
        return ((LoadStatic) _this_).getKqf();
    }

    private static void setKqf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadStatic) _this_).setKqf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadStatic) _this_).setKqf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getStaticLoadModelType(BaseClass _this_) {
        return ((LoadStatic) _this_).getStaticLoadModelType();
    }

    private static void setStaticLoadModelType(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((LoadStatic) _this_).setStaticLoadModelType((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "LoadStatic", attrName));
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
                "LoadStatic", attrName, value));
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
            map.put("LoadAggregate", new AttrDetails("LoadStatic.LoadAggregate", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, LoadStatic::getLoadAggregate, LoadStatic::setLoadAggregate));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ep1", new AttrDetails("LoadStatic.ep1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadStatic::getEp1, LoadStatic::setEp1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ep2", new AttrDetails("LoadStatic.ep2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadStatic::getEp2, LoadStatic::setEp2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ep3", new AttrDetails("LoadStatic.ep3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadStatic::getEp3, LoadStatic::setEp3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eq1", new AttrDetails("LoadStatic.eq1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadStatic::getEq1, LoadStatic::setEq1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eq2", new AttrDetails("LoadStatic.eq2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadStatic::getEq2, LoadStatic::setEq2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eq3", new AttrDetails("LoadStatic.eq3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadStatic::getEq3, LoadStatic::setEq3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp1", new AttrDetails("LoadStatic.kp1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadStatic::getKp1, LoadStatic::setKp1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp2", new AttrDetails("LoadStatic.kp2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadStatic::getKp2, LoadStatic::setKp2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp3", new AttrDetails("LoadStatic.kp3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadStatic::getKp3, LoadStatic::setKp3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp4", new AttrDetails("LoadStatic.kp4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadStatic::getKp4, LoadStatic::setKp4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpf", new AttrDetails("LoadStatic.kpf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadStatic::getKpf, LoadStatic::setKpf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kq1", new AttrDetails("LoadStatic.kq1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadStatic::getKq1, LoadStatic::setKq1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kq2", new AttrDetails("LoadStatic.kq2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadStatic::getKq2, LoadStatic::setKq2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kq3", new AttrDetails("LoadStatic.kq3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadStatic::getKq3, LoadStatic::setKq3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kq4", new AttrDetails("LoadStatic.kq4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadStatic::getKq4, LoadStatic::setKq4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kqf", new AttrDetails("LoadStatic.kqf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadStatic::getKqf, LoadStatic::setKqf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("staticLoadModelType", new AttrDetails("LoadStatic.staticLoadModelType", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, LoadStatic::getStaticLoadModelType, LoadStatic::setStaticLoadModelType));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new LoadStatic(null).allAttrDetailsMap());
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
