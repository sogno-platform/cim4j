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
 * European governor model.
 */
@SuppressWarnings("unused")
public class GovSteamBB extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovSteamBB.class);

    /**
     * Constructor.
     */
    public GovSteamBB(String rdfid) {
        super("GovSteamBB", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovSteamBB(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Frequency deadband (<i>f</i><i><sub>cut</sub></i>) (&gt;= 0).  Typical value = 0,002.
     */
    private Double fcut; // PU

    public Double getFcut() {
        return fcut;
    }

    public void setFcut(Double _value_) {
        fcut = _value_;
    }

    private static Object getFcut(BaseClass _this_) {
        return ((GovSteamBB) _this_).getFcut();
    }

    private static void setFcut(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamBB) _this_).setFcut((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamBB) _this_).setFcut(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (<i>K2</i>).  Typical value = 0,75.
     */
    private Double k2; // PU

    public Double getK2() {
        return k2;
    }

    public void setK2(Double _value_) {
        k2 = _value_;
    }

    private static Object getK2(BaseClass _this_) {
        return ((GovSteamBB) _this_).getK2();
    }

    private static void setK2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamBB) _this_).setK2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamBB) _this_).setK2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (<i>K3</i>).  Typical value = 0,5.
     */
    private Double k3; // PU

    public Double getK3() {
        return k3;
    }

    public void setK3(Double _value_) {
        k3 = _value_;
    }

    private static Object getK3(BaseClass _this_) {
        return ((GovSteamBB) _this_).getK3();
    }

    private static void setK3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamBB) _this_).setK3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamBB) _this_).setK3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (<i>Kd</i>).  Typical value = 1,0.
     */
    private Double kd; // PU

    public Double getKd() {
        return kd;
    }

    public void setKd(Double _value_) {
        kd = _value_;
    }

    private static Object getKd(BaseClass _this_) {
        return ((GovSteamBB) _this_).getKd();
    }

    private static void setKd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamBB) _this_).setKd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamBB) _this_).setKd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (<i>Kg</i>).  Typical value = 1,0.
     */
    private Double kg; // PU

    public Double getKg() {
        return kg;
    }

    public void setKg(Double _value_) {
        kg = _value_;
    }

    private static Object getKg(BaseClass _this_) {
        return ((GovSteamBB) _this_).getKg();
    }

    private static void setKg(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamBB) _this_).setKg((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamBB) _this_).setKg(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (<i>Kls</i>) (&gt; 0).  Typical value = 0,1.
     */
    private Double kls; // PU

    public Double getKls() {
        return kls;
    }

    public void setKls(Double _value_) {
        kls = _value_;
    }

    private static Object getKls(BaseClass _this_) {
        return ((GovSteamBB) _this_).getKls();
    }

    private static void setKls(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamBB) _this_).setKls((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamBB) _this_).setKls(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (<i>Kp</i>).  Typical value = 1,0.
     */
    private Double kp; // PU

    public Double getKp() {
        return kp;
    }

    public void setKp(Double _value_) {
        kp = _value_;
    }

    private static Object getKp(BaseClass _this_) {
        return ((GovSteamBB) _this_).getKp();
    }

    private static void setKp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamBB) _this_).setKp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamBB) _this_).setKp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (<i>Ks</i>).  Typical value = 21,0.
     */
    private Double ks; // PU

    public Double getKs() {
        return ks;
    }

    public void setKs(Double _value_) {
        ks = _value_;
    }

    private static Object getKs(BaseClass _this_) {
        return ((GovSteamBB) _this_).getKs();
    }

    private static void setKs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamBB) _this_).setKs((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamBB) _this_).setKs(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Electric power input selection (Peflag).   true = electric power input false = feedback signal. Typical value = false.
     */
    private Boolean peflag; // Boolean

    public Boolean getPeflag() {
        return peflag;
    }

    public void setPeflag(Boolean _value_) {
        peflag = _value_;
    }

    private static Object getPeflag(BaseClass _this_) {
        return ((GovSteamBB) _this_).getPeflag();
    }

    private static void setPeflag(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((GovSteamBB) _this_).setPeflag((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamBB) _this_).setPeflag(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * High power limit (<i>Pmax</i>) (&gt; GovSteamBB.pmin).  Typical value = 1,0.
     */
    private Double pmax; // PU

    public Double getPmax() {
        return pmax;
    }

    public void setPmax(Double _value_) {
        pmax = _value_;
    }

    private static Object getPmax(BaseClass _this_) {
        return ((GovSteamBB) _this_).getPmax();
    }

    private static void setPmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamBB) _this_).setPmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamBB) _this_).setPmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low power limit (<i>Pmin</i>) (&lt; GovSteamBB.pmax).  Typical value = 0.
     */
    private Double pmin; // PU

    public Double getPmin() {
        return pmin;
    }

    public void setPmin(Double _value_) {
        pmin = _value_;
    }

    private static Object getPmin(BaseClass _this_) {
        return ((GovSteamBB) _this_).getPmin();
    }

    private static void setPmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamBB) _this_).setPmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamBB) _this_).setPmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T1</i>).  Typical value = 0,05.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((GovSteamBB) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamBB) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamBB) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T4</i>).  Typical value = 0,15.
     */
    private Double t4; // Seconds

    public Double getT4() {
        return t4;
    }

    public void setT4(Double _value_) {
        t4 = _value_;
    }

    private static Object getT4(BaseClass _this_) {
        return ((GovSteamBB) _this_).getT4();
    }

    private static void setT4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamBB) _this_).setT4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamBB) _this_).setT4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T5</i>).  Typical value = 12,0.
     */
    private Double t5; // Seconds

    public Double getT5() {
        return t5;
    }

    public void setT5(Double _value_) {
        t5 = _value_;
    }

    private static Object getT5(BaseClass _this_) {
        return ((GovSteamBB) _this_).getT5();
    }

    private static void setT5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamBB) _this_).setT5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamBB) _this_).setT5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T6</i>).  Typical value = 0,75.
     */
    private Double t6; // Seconds

    public Double getT6() {
        return t6;
    }

    public void setT6(Double _value_) {
        t6 = _value_;
    }

    private static Object getT6(BaseClass _this_) {
        return ((GovSteamBB) _this_).getT6();
    }

    private static void setT6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamBB) _this_).setT6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamBB) _this_).setT6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>Td</i>) (&gt; 0).  Typical value = 1,0.
     */
    private Double td; // Seconds

    public Double getTd() {
        return td;
    }

    public void setTd(Double _value_) {
        td = _value_;
    }

    private static Object getTd(BaseClass _this_) {
        return ((GovSteamBB) _this_).getTd();
    }

    private static void setTd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamBB) _this_).setTd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamBB) _this_).setTd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>Tn</i>) (&gt; 0).  Typical value = 1,0.
     */
    private Double tn; // Seconds

    public Double getTn() {
        return tn;
    }

    public void setTn(Double _value_) {
        tn = _value_;
    }

    private static Object getTn(BaseClass _this_) {
        return ((GovSteamBB) _this_).getTn();
    }

    private static void setTn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamBB) _this_).setTn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamBB) _this_).setTn(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovSteamBB", attrName));
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
                "GovSteamBB", attrName, value));
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
            map.put("fcut", new AttrDetails("GovSteamBB.fcut", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamBB::getFcut, GovSteamBB::setFcut));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k2", new AttrDetails("GovSteamBB.k2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamBB::getK2, GovSteamBB::setK2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k3", new AttrDetails("GovSteamBB.k3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamBB::getK3, GovSteamBB::setK3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("GovSteamBB.kd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamBB::getKd, GovSteamBB::setKd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kg", new AttrDetails("GovSteamBB.kg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamBB::getKg, GovSteamBB::setKg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kls", new AttrDetails("GovSteamBB.kls", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamBB::getKls, GovSteamBB::setKls));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("GovSteamBB.kp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamBB::getKp, GovSteamBB::setKp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks", new AttrDetails("GovSteamBB.ks", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamBB::getKs, GovSteamBB::setKs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("peflag", new AttrDetails("GovSteamBB.peflag", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamBB::getPeflag, GovSteamBB::setPeflag));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmax", new AttrDetails("GovSteamBB.pmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamBB::getPmax, GovSteamBB::setPmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmin", new AttrDetails("GovSteamBB.pmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamBB::getPmin, GovSteamBB::setPmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("GovSteamBB.t1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamBB::getT1, GovSteamBB::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("GovSteamBB.t4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamBB::getT4, GovSteamBB::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5", new AttrDetails("GovSteamBB.t5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamBB::getT5, GovSteamBB::setT5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t6", new AttrDetails("GovSteamBB.t6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamBB::getT6, GovSteamBB::setT6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("td", new AttrDetails("GovSteamBB.td", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamBB::getTd, GovSteamBB::setTd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tn", new AttrDetails("GovSteamBB.tn", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamBB::getTn, GovSteamBB::setTn));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovSteamBB(null).allAttrDetailsMap());
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
