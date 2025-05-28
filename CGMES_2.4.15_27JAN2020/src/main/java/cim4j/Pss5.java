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
 * Italian PSS - Detailed PSS.
 */
@SuppressWarnings("unused")
public class Pss5 extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(Pss5.class);

    /**
     * Constructor.
     */
    public Pss5(String rdfid) {
        super("Pss5", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected Pss5(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Selector for Second washout enabling (C). true = second washout filter is bypassed false = second washout filter in use. Typical Value = true.
     */
    private Boolean ctw2; // Boolean

    public Boolean getCtw2() {
        return ctw2;
    }

    public void setCtw2(Boolean _value_) {
        ctw2 = _value_;
    }

    private static Object getCtw2(BaseClass _this_) {
        return ((Pss5) _this_).getCtw2();
    }

    private static void setCtw2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Pss5) _this_).setCtw2((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Pss5) _this_).setCtw2(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Stabilizer output dead band (DeadBand).  Typical Value = 0.
     */
    private Double deadband; // PU

    public Double getDeadband() {
        return deadband;
    }

    public void setDeadband(Double _value_) {
        deadband = _value_;
    }

    private static Object getDeadband(BaseClass _this_) {
        return ((Pss5) _this_).getDeadband();
    }

    private static void setDeadband(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss5) _this_).setDeadband((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss5) _this_).setDeadband(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Selector for Frequency/shaft speed input (IsFreq). true = speed false = frequency. Typical Value = true.
     */
    private Boolean isfreq; // Boolean

    public Boolean getIsfreq() {
        return isfreq;
    }

    public void setIsfreq(Boolean _value_) {
        isfreq = _value_;
    }

    private static Object getIsfreq(BaseClass _this_) {
        return ((Pss5) _this_).getIsfreq();
    }

    private static void setIsfreq(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Pss5) _this_).setIsfreq((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Pss5) _this_).setIsfreq(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Frequency/shaft speed input gain (K).  Typical Value = 5.
     */
    private Double kf; // Simple_Float

    public Double getKf() {
        return kf;
    }

    public void setKf(Double _value_) {
        kf = _value_;
    }

    private static Object getKf(BaseClass _this_) {
        return ((Pss5) _this_).getKf();
    }

    private static void setKf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss5) _this_).setKf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss5) _this_).setKf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Electric power input gain (K).  Typical Value = 0.3.
     */
    private Double kpe; // Simple_Float

    public Double getKpe() {
        return kpe;
    }

    public void setKpe(Double _value_) {
        kpe = _value_;
    }

    private static Object getKpe(BaseClass _this_) {
        return ((Pss5) _this_).getKpe();
    }

    private static void setKpe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss5) _this_).setKpe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss5) _this_).setKpe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * PSS gain (K).  Typical Value = 1.
     */
    private Double kpss; // Simple_Float

    public Double getKpss() {
        return kpss;
    }

    public void setKpss(Double _value_) {
        kpss = _value_;
    }

    private static Object getKpss(BaseClass _this_) {
        return ((Pss5) _this_).getKpss();
    }

    private static void setKpss(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss5) _this_).setKpss((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss5) _this_).setKpss(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum power PSS enabling (P).  Typical Value = 0.25.
     */
    private Double pmm; // PU

    public Double getPmm() {
        return pmm;
    }

    public void setPmm(Double _value_) {
        pmm = _value_;
    }

    private static Object getPmm(BaseClass _this_) {
        return ((Pss5) _this_).getPmm();
    }

    private static void setPmm(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss5) _this_).setPmm((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss5) _this_).setPmm(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (T).  Typical Value = 0.
     */
    private Double tl1; // Seconds

    public Double getTl1() {
        return tl1;
    }

    public void setTl1(Double _value_) {
        tl1 = _value_;
    }

    private static Object getTl1(BaseClass _this_) {
        return ((Pss5) _this_).getTl1();
    }

    private static void setTl1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss5) _this_).setTl1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss5) _this_).setTl1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (T).  Typical Value = 0.
     */
    private Double tl2; // Seconds

    public Double getTl2() {
        return tl2;
    }

    public void setTl2(Double _value_) {
        tl2 = _value_;
    }

    private static Object getTl2(BaseClass _this_) {
        return ((Pss5) _this_).getTl2();
    }

    private static void setTl2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss5) _this_).setTl2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss5) _this_).setTl2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (T).  Typical Value = 0.
     */
    private Double tl3; // Seconds

    public Double getTl3() {
        return tl3;
    }

    public void setTl3(Double _value_) {
        tl3 = _value_;
    }

    private static Object getTl3(BaseClass _this_) {
        return ((Pss5) _this_).getTl3();
    }

    private static void setTl3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss5) _this_).setTl3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss5) _this_).setTl3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (T).  Typical Value = 0.
     */
    private Double tl4; // Seconds

    public Double getTl4() {
        return tl4;
    }

    public void setTl4(Double _value_) {
        tl4 = _value_;
    }

    private static Object getTl4(BaseClass _this_) {
        return ((Pss5) _this_).getTl4();
    }

    private static void setTl4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss5) _this_).setTl4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss5) _this_).setTl4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Electric power filter time constant (T).  Typical Value = 0.05.
     */
    private Double tpe; // Seconds

    public Double getTpe() {
        return tpe;
    }

    public void setTpe(Double _value_) {
        tpe = _value_;
    }

    private static Object getTpe(BaseClass _this_) {
        return ((Pss5) _this_).getTpe();
    }

    private static void setTpe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss5) _this_).setTpe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss5) _this_).setTpe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * First WashOut (T).  Typical Value = 3.5.
     */
    private Double tw1; // Seconds

    public Double getTw1() {
        return tw1;
    }

    public void setTw1(Double _value_) {
        tw1 = _value_;
    }

    private static Object getTw1(BaseClass _this_) {
        return ((Pss5) _this_).getTw1();
    }

    private static void setTw1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss5) _this_).setTw1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss5) _this_).setTw1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Second WashOut (T).  Typical Value = 0.
     */
    private Double tw2; // Seconds

    public Double getTw2() {
        return tw2;
    }

    public void setTw2(Double _value_) {
        tw2 = _value_;
    }

    private static Object getTw2(BaseClass _this_) {
        return ((Pss5) _this_).getTw2();
    }

    private static void setTw2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss5) _this_).setTw2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss5) _this_).setTw2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     */
    private Boolean vadat; // Boolean

    public Boolean getVadat() {
        return vadat;
    }

    public void setVadat(Boolean _value_) {
        vadat = _value_;
    }

    private static Object getVadat(BaseClass _this_) {
        return ((Pss5) _this_).getVadat();
    }

    private static void setVadat(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Pss5) _this_).setVadat((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Pss5) _this_).setVadat(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Stabilizer output max limit (V).  Typical Value = -0.1.
     */
    private Double vsmn; // PU

    public Double getVsmn() {
        return vsmn;
    }

    public void setVsmn(Double _value_) {
        vsmn = _value_;
    }

    private static Object getVsmn(BaseClass _this_) {
        return ((Pss5) _this_).getVsmn();
    }

    private static void setVsmn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss5) _this_).setVsmn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss5) _this_).setVsmn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Stabilizer output min limit (V).  Typical Value = 0.1.
     */
    private Double vsmx; // PU

    public Double getVsmx() {
        return vsmx;
    }

    public void setVsmx(Double _value_) {
        vsmx = _value_;
    }

    private static Object getVsmx(BaseClass _this_) {
        return ((Pss5) _this_).getVsmx();
    }

    private static void setVsmx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss5) _this_).setVsmx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss5) _this_).setVsmx(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "Pss5", attrName));
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
                "Pss5", attrName, value));
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
            map.put("ctw2", new AttrDetails("Pss5.ctw2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss5::getCtw2, Pss5::setCtw2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("deadband", new AttrDetails("Pss5.deadband", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss5::getDeadband, Pss5::setDeadband));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("isfreq", new AttrDetails("Pss5.isfreq", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss5::getIsfreq, Pss5::setIsfreq));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("Pss5.kf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss5::getKf, Pss5::setKf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpe", new AttrDetails("Pss5.kpe", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss5::getKpe, Pss5::setKpe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpss", new AttrDetails("Pss5.kpss", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss5::getKpss, Pss5::setKpss));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmm", new AttrDetails("Pss5.pmm", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss5::getPmm, Pss5::setPmm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl1", new AttrDetails("Pss5.tl1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss5::getTl1, Pss5::setTl1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl2", new AttrDetails("Pss5.tl2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss5::getTl2, Pss5::setTl2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl3", new AttrDetails("Pss5.tl3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss5::getTl3, Pss5::setTl3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl4", new AttrDetails("Pss5.tl4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss5::getTl4, Pss5::setTl4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpe", new AttrDetails("Pss5.tpe", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss5::getTpe, Pss5::setTpe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw1", new AttrDetails("Pss5.tw1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss5::getTw1, Pss5::setTw1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw2", new AttrDetails("Pss5.tw2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss5::getTw2, Pss5::setTw2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vadat", new AttrDetails("Pss5.vadat", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss5::getVadat, Pss5::setVadat));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsmn", new AttrDetails("Pss5.vsmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss5::getVsmn, Pss5::setVsmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsmx", new AttrDetails("Pss5.vsmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss5::getVsmx, Pss5::setVsmx));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new Pss5(null).allAttrDetailsMap());
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
