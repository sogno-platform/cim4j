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
 * Field Voltage or Current overexcitation limiter designed to protect the generator field of an AC machine with automatic excitation control from overheating due to prolonged overexcitation.
 */
@SuppressWarnings("unused")
public class OverexcLimX2 extends OverexcitationLimiterDynamics {

    private static final Logging LOG = Logging.getLogger(OverexcLimX2.class);

    /**
     * Constructor.
     */
    public OverexcLimX2(String rdfid) {
        super("OverexcLimX2", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected OverexcLimX2(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Low voltage or current point on the inverse time characteristic (EFD).  Typical Value = 1.1.
     */
    private Double efd1; // PU

    public Double getEfd1() {
        return efd1;
    }

    public void setEfd1(Double _value_) {
        efd1 = _value_;
    }

    private static Object getEfd1(BaseClass _this_) {
        return ((OverexcLimX2) _this_).getEfd1();
    }

    private static void setEfd1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((OverexcLimX2) _this_).setEfd1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((OverexcLimX2) _this_).setEfd1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Mid voltage or current point on the inverse time characteristic (EFD).  Typical Value = 1.2.
     */
    private Double efd2; // PU

    public Double getEfd2() {
        return efd2;
    }

    public void setEfd2(Double _value_) {
        efd2 = _value_;
    }

    private static Object getEfd2(BaseClass _this_) {
        return ((OverexcLimX2) _this_).getEfd2();
    }

    private static void setEfd2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((OverexcLimX2) _this_).setEfd2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((OverexcLimX2) _this_).setEfd2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * High voltage or current point on the inverse time characteristic (EFD).  Typical Value = 1.5.
     */
    private Double efd3; // PU

    public Double getEfd3() {
        return efd3;
    }

    public void setEfd3(Double _value_) {
        efd3 = _value_;
    }

    private static Object getEfd3(BaseClass _this_) {
        return ((OverexcLimX2) _this_).getEfd3();
    }

    private static void setEfd3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((OverexcLimX2) _this_).setEfd3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((OverexcLimX2) _this_).setEfd3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Desired field voltage if m=F or field current if m=T (EFD).  Typical Value = 1.
     */
    private Double efddes; // PU

    public Double getEfddes() {
        return efddes;
    }

    public void setEfddes(Double _value_) {
        efddes = _value_;
    }

    private static Object getEfddes(BaseClass _this_) {
        return ((OverexcLimX2) _this_).getEfddes();
    }

    private static void setEfddes(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((OverexcLimX2) _this_).setEfddes((Double) _value_);
        } else if (_value_ instanceof String) {
            ((OverexcLimX2) _this_).setEfddes(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rated field voltage if m=F or field current if m=T (EFD).  Typical Value = 1.05.
     */
    private Double efdrated; // PU

    public Double getEfdrated() {
        return efdrated;
    }

    public void setEfdrated(Double _value_) {
        efdrated = _value_;
    }

    private static Object getEfdrated(BaseClass _this_) {
        return ((OverexcLimX2) _this_).getEfdrated();
    }

    private static void setEfdrated(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((OverexcLimX2) _this_).setEfdrated((Double) _value_);
        } else if (_value_ instanceof String) {
            ((OverexcLimX2) _this_).setEfdrated(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (K).  Typical Value = 0.002.
     */
    private Double kmx; // PU

    public Double getKmx() {
        return kmx;
    }

    public void setKmx(Double _value_) {
        kmx = _value_;
    }

    private static Object getKmx(BaseClass _this_) {
        return ((OverexcLimX2) _this_).getKmx();
    }

    private static void setKmx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((OverexcLimX2) _this_).setKmx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((OverexcLimX2) _this_).setKmx(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * (m). true = IFD limiting false = EFD limiting.
     */
    private Boolean m; // Boolean

    public Boolean getM() {
        return m;
    }

    public void setM(Boolean _value_) {
        m = _value_;
    }

    private static Object getM(BaseClass _this_) {
        return ((OverexcLimX2) _this_).getM();
    }

    private static void setM(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((OverexcLimX2) _this_).setM((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((OverexcLimX2) _this_).setM(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Time to trip the exciter at the low voltage or current point on the inverse time characteristic (TIME).  Typical Value = 120.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((OverexcLimX2) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((OverexcLimX2) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((OverexcLimX2) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time to trip the exciter at the mid voltage or current point on the inverse time characteristic (TIME).  Typical Value = 40.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    private static Object getT2(BaseClass _this_) {
        return ((OverexcLimX2) _this_).getT2();
    }

    private static void setT2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((OverexcLimX2) _this_).setT2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((OverexcLimX2) _this_).setT2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time to trip the exciter at the high voltage or current point on the inverse time characteristic (TIME).  Typical Value = 15.
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    private static Object getT3(BaseClass _this_) {
        return ((OverexcLimX2) _this_).getT3();
    }

    private static void setT3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((OverexcLimX2) _this_).setT3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((OverexcLimX2) _this_).setT3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low voltage limit (V) (>0).
     */
    private Double vlow; // PU

    public Double getVlow() {
        return vlow;
    }

    public void setVlow(Double _value_) {
        vlow = _value_;
    }

    private static Object getVlow(BaseClass _this_) {
        return ((OverexcLimX2) _this_).getVlow();
    }

    private static void setVlow(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((OverexcLimX2) _this_).setVlow((Double) _value_);
        } else if (_value_ instanceof String) {
            ((OverexcLimX2) _this_).setVlow(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "OverexcLimX2", attrName));
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
                "OverexcLimX2", attrName, value));
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
            map.put("efd1", new AttrDetails("OverexcLimX2.efd1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, OverexcLimX2::getEfd1, OverexcLimX2::setEfd1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efd2", new AttrDetails("OverexcLimX2.efd2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, OverexcLimX2::getEfd2, OverexcLimX2::setEfd2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efd3", new AttrDetails("OverexcLimX2.efd3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, OverexcLimX2::getEfd3, OverexcLimX2::setEfd3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efddes", new AttrDetails("OverexcLimX2.efddes", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, OverexcLimX2::getEfddes, OverexcLimX2::setEfddes));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efdrated", new AttrDetails("OverexcLimX2.efdrated", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, OverexcLimX2::getEfdrated, OverexcLimX2::setEfdrated));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kmx", new AttrDetails("OverexcLimX2.kmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, OverexcLimX2::getKmx, OverexcLimX2::setKmx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("m", new AttrDetails("OverexcLimX2.m", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, OverexcLimX2::getM, OverexcLimX2::setM));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("OverexcLimX2.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, OverexcLimX2::getT1, OverexcLimX2::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("OverexcLimX2.t2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, OverexcLimX2::getT2, OverexcLimX2::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("OverexcLimX2.t3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, OverexcLimX2::getT3, OverexcLimX2::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vlow", new AttrDetails("OverexcLimX2.vlow", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, OverexcLimX2::getVlow, OverexcLimX2::setVlow));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new OverexcLimX2(null).allAttrDetailsMap());
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
