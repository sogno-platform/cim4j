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
 * Italian excitation system. It represents static field voltage or excitation current feedback excitation system.
 */
@SuppressWarnings("unused")
public class ExcANS extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcANS.class);

    /**
     * Constructor.
     */
    public ExcANS(String rdfid) {
        super("ExcANS", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcANS(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Governor Control Flag (BLINT).  0 = lead-lag regulator 1 = proportional integral regulator. Typical Value = 0.
     */
    private Integer blint; // Integer

    public Integer getBlint() {
        return blint;
    }

    public void setBlint(Integer _value_) {
        blint = _value_;
    }

    private static Object getBlint(BaseClass _this_) {
        return ((ExcANS) _this_).getBlint();
    }

    private static void setBlint(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((ExcANS) _this_).setBlint((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((ExcANS) _this_).setBlint(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
        }
    }

    /**
     * Minimum exciter current (I).  Typical Value = -5.2.
     */
    private Double ifmn; // PU

    public Double getIfmn() {
        return ifmn;
    }

    public void setIfmn(Double _value_) {
        ifmn = _value_;
    }

    private static Object getIfmn(BaseClass _this_) {
        return ((ExcANS) _this_).getIfmn();
    }

    private static void setIfmn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcANS) _this_).setIfmn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcANS) _this_).setIfmn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum exciter current (I).  Typical Value = 6.5.
     */
    private Double ifmx; // PU

    public Double getIfmx() {
        return ifmx;
    }

    public void setIfmx(Double _value_) {
        ifmx = _value_;
    }

    private static Object getIfmx(BaseClass _this_) {
        return ((ExcANS) _this_).getIfmx();
    }

    private static void setIfmx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcANS) _this_).setIfmx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcANS) _this_).setIfmx(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter gain (K).  Typical Value = 20.
     */
    private Double k2; // Simple_Float

    public Double getK2() {
        return k2;
    }

    public void setK2(Double _value_) {
        k2 = _value_;
    }

    private static Object getK2(BaseClass _this_) {
        return ((ExcANS) _this_).getK2();
    }

    private static void setK2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcANS) _this_).setK2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcANS) _this_).setK2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * AVR gain (K).  Typical Value = 1000.
     */
    private Double k3; // Simple_Float

    public Double getK3() {
        return k3;
    }

    public void setK3(Double _value_) {
        k3 = _value_;
    }

    private static Object getK3(BaseClass _this_) {
        return ((ExcANS) _this_).getK3();
    }

    private static void setK3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcANS) _this_).setK3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcANS) _this_).setK3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Ceiling factor (K).  Typical Value = 1.
     */
    private Double kce; // Simple_Float

    public Double getKce() {
        return kce;
    }

    public void setKce(Double _value_) {
        kce = _value_;
    }

    private static Object getKce(BaseClass _this_) {
        return ((ExcANS) _this_).getKce();
    }

    private static void setKce(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcANS) _this_).setKce((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcANS) _this_).setKce(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Feedback enabling (K).  0 = Open loop control 1 = Closed loop control. Typical Value = 1.
     */
    private Integer krvecc; // Integer

    public Integer getKrvecc() {
        return krvecc;
    }

    public void setKrvecc(Integer _value_) {
        krvecc = _value_;
    }

    private static Object getKrvecc(BaseClass _this_) {
        return ((ExcANS) _this_).getKrvecc();
    }

    private static void setKrvecc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((ExcANS) _this_).setKrvecc((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((ExcANS) _this_).setKrvecc(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
        }
    }

    /**
     * Rate feedback signal flag (K).  0 = output voltage of the exciter 1 = exciter field current. Typical Value = 0.
     */
    private Integer kvfif; // Integer

    public Integer getKvfif() {
        return kvfif;
    }

    public void setKvfif(Integer _value_) {
        kvfif = _value_;
    }

    private static Object getKvfif(BaseClass _this_) {
        return ((ExcANS) _this_).getKvfif();
    }

    private static void setKvfif(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((ExcANS) _this_).setKvfif((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((ExcANS) _this_).setKvfif(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
        }
    }

    /**
     * Time constant (T).  Typical Value = 20.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((ExcANS) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcANS) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcANS) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (T).  Typical Value = 0.05.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    private static Object getT2(BaseClass _this_) {
        return ((ExcANS) _this_).getT2();
    }

    private static void setT2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcANS) _this_).setT2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcANS) _this_).setT2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (T).  Typical Value = 1.6.
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    private static Object getT3(BaseClass _this_) {
        return ((ExcANS) _this_).getT3();
    }

    private static void setT3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcANS) _this_).setT3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcANS) _this_).setT3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter time constant (T).  Typical Value = 0.04.
     */
    private Double tb; // Seconds

    public Double getTb() {
        return tb;
    }

    public void setTb(Double _value_) {
        tb = _value_;
    }

    private static Object getTb(BaseClass _this_) {
        return ((ExcANS) _this_).getTb();
    }

    private static void setTb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcANS) _this_).setTb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcANS) _this_).setTb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum AVR output (V).  Typical Value = -5.2.
     */
    private Double vrmn; // PU

    public Double getVrmn() {
        return vrmn;
    }

    public void setVrmn(Double _value_) {
        vrmn = _value_;
    }

    private static Object getVrmn(BaseClass _this_) {
        return ((ExcANS) _this_).getVrmn();
    }

    private static void setVrmn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcANS) _this_).setVrmn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcANS) _this_).setVrmn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum AVR output (V).  Typical Value = 6.5.
     */
    private Double vrmx; // PU

    public Double getVrmx() {
        return vrmx;
    }

    public void setVrmx(Double _value_) {
        vrmx = _value_;
    }

    private static Object getVrmx(BaseClass _this_) {
        return ((ExcANS) _this_).getVrmx();
    }

    private static void setVrmx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcANS) _this_).setVrmx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcANS) _this_).setVrmx(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcANS", attrName));
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
                "ExcANS", attrName, value));
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
            map.put("blint", new AttrDetails("ExcANS.blint", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::getBlint, ExcANS::setBlint));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ifmn", new AttrDetails("ExcANS.ifmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::getIfmn, ExcANS::setIfmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ifmx", new AttrDetails("ExcANS.ifmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::getIfmx, ExcANS::setIfmx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k2", new AttrDetails("ExcANS.k2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::getK2, ExcANS::setK2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k3", new AttrDetails("ExcANS.k3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::getK3, ExcANS::setK3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kce", new AttrDetails("ExcANS.kce", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::getKce, ExcANS::setKce));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("krvecc", new AttrDetails("ExcANS.krvecc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::getKrvecc, ExcANS::setKrvecc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kvfif", new AttrDetails("ExcANS.kvfif", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::getKvfif, ExcANS::setKvfif));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("ExcANS.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::getT1, ExcANS::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("ExcANS.t2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::getT2, ExcANS::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("ExcANS.t3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::getT3, ExcANS::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("ExcANS.tb", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::getTb, ExcANS::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmn", new AttrDetails("ExcANS.vrmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::getVrmn, ExcANS::setVrmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmx", new AttrDetails("ExcANS.vrmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::getVrmx, ExcANS::setVrmx));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcANS(null).allAttrDetailsMap());
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
