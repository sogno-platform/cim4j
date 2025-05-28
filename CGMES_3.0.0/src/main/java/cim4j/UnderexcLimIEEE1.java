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
 * Type UEL1 model which has a circular limit boundary when plotted in terms of machine reactive power vs. real power output. Reference: IEEE UEL1 421.5-2005, 10.1.
 */
@SuppressWarnings("unused")
public class UnderexcLimIEEE1 extends UnderexcitationLimiterDynamics {

    private static final Logging LOG = Logging.getLogger(UnderexcLimIEEE1.class);

    /**
     * Constructor.
     */
    public UnderexcLimIEEE1(String rdfid) {
        super("UnderexcLimIEEE1", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected UnderexcLimIEEE1(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * UEL centre setting (<i>K</i><i><sub>UC</sub></i>).  Typical value = 1,38.
     */
    private Double kuc; // PU

    public Double getKuc() {
        return kuc;
    }

    public void setKuc(Double _value_) {
        kuc = _value_;
    }

    private static Object getKuc(BaseClass _this_) {
        return ((UnderexcLimIEEE1) _this_).getKuc();
    }

    private static void setKuc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE1) _this_).setKuc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE1) _this_).setKuc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL excitation system stabilizer gain (<i>K</i><i><sub>UF</sub></i>).  Typical value = 3,3.
     */
    private Double kuf; // PU

    public Double getKuf() {
        return kuf;
    }

    public void setKuf(Double _value_) {
        kuf = _value_;
    }

    private static Object getKuf(BaseClass _this_) {
        return ((UnderexcLimIEEE1) _this_).getKuf();
    }

    private static void setKuf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE1) _this_).setKuf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE1) _this_).setKuf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL integral gain (<i>K</i><i><sub>UI</sub></i>).  Typical value = 0.
     */
    private Double kui; // PU

    public Double getKui() {
        return kui;
    }

    public void setKui(Double _value_) {
        kui = _value_;
    }

    private static Object getKui(BaseClass _this_) {
        return ((UnderexcLimIEEE1) _this_).getKui();
    }

    private static void setKui(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE1) _this_).setKui((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE1) _this_).setKui(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL proportional gain (<i>K</i><i><sub>UL</sub></i>).  Typical value = 100.
     */
    private Double kul; // PU

    public Double getKul() {
        return kul;
    }

    public void setKul(Double _value_) {
        kul = _value_;
    }

    private static Object getKul(BaseClass _this_) {
        return ((UnderexcLimIEEE1) _this_).getKul();
    }

    private static void setKul(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE1) _this_).setKul((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE1) _this_).setKul(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL radius setting (<i>K</i><i><sub>UR</sub></i>).  Typical value = 1,95.
     */
    private Double kur; // PU

    public Double getKur() {
        return kur;
    }

    public void setKur(Double _value_) {
        kur = _value_;
    }

    private static Object getKur(BaseClass _this_) {
        return ((UnderexcLimIEEE1) _this_).getKur();
    }

    private static void setKur(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE1) _this_).setKur((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE1) _this_).setKur(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL lead time constant (<i>T</i><i><sub>U1</sub></i>) (&gt;= 0).  Typical value = 0.
     */
    private Double tu1; // Seconds

    public Double getTu1() {
        return tu1;
    }

    public void setTu1(Double _value_) {
        tu1 = _value_;
    }

    private static Object getTu1(BaseClass _this_) {
        return ((UnderexcLimIEEE1) _this_).getTu1();
    }

    private static void setTu1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE1) _this_).setTu1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE1) _this_).setTu1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL lag time constant (<i>T</i><i><sub>U2</sub></i>) (&gt;= 0).  Typical value = 0,05.
     */
    private Double tu2; // Seconds

    public Double getTu2() {
        return tu2;
    }

    public void setTu2(Double _value_) {
        tu2 = _value_;
    }

    private static Object getTu2(BaseClass _this_) {
        return ((UnderexcLimIEEE1) _this_).getTu2();
    }

    private static void setTu2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE1) _this_).setTu2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE1) _this_).setTu2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL lead time constant (<i>T</i><i><sub>U3</sub></i>) (&gt;= 0).  Typical value = 0.
     */
    private Double tu3; // Seconds

    public Double getTu3() {
        return tu3;
    }

    public void setTu3(Double _value_) {
        tu3 = _value_;
    }

    private static Object getTu3(BaseClass _this_) {
        return ((UnderexcLimIEEE1) _this_).getTu3();
    }

    private static void setTu3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE1) _this_).setTu3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE1) _this_).setTu3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL lag time constant (<i>T</i><i><sub>U4</sub></i>) (&gt;= 0).  Typical value = 0.
     */
    private Double tu4; // Seconds

    public Double getTu4() {
        return tu4;
    }

    public void setTu4(Double _value_) {
        tu4 = _value_;
    }

    private static Object getTu4(BaseClass _this_) {
        return ((UnderexcLimIEEE1) _this_).getTu4();
    }

    private static void setTu4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE1) _this_).setTu4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE1) _this_).setTu4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL maximum limit for operating point phasor magnitude (<i>V</i><i><sub>UCMAX</sub></i>).  Typical value = 5,8.
     */
    private Double vucmax; // PU

    public Double getVucmax() {
        return vucmax;
    }

    public void setVucmax(Double _value_) {
        vucmax = _value_;
    }

    private static Object getVucmax(BaseClass _this_) {
        return ((UnderexcLimIEEE1) _this_).getVucmax();
    }

    private static void setVucmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE1) _this_).setVucmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE1) _this_).setVucmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL integrator output maximum limit (<i>V</i><i><sub>UIMAX</sub></i>) (&gt; UnderexcLimIEEE1.vuimin).
     */
    private Double vuimax; // PU

    public Double getVuimax() {
        return vuimax;
    }

    public void setVuimax(Double _value_) {
        vuimax = _value_;
    }

    private static Object getVuimax(BaseClass _this_) {
        return ((UnderexcLimIEEE1) _this_).getVuimax();
    }

    private static void setVuimax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE1) _this_).setVuimax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE1) _this_).setVuimax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL integrator output minimum limit (<i>V</i><i><sub>UIMIN</sub></i>) (&lt; UnderexcLimIEEE1.vuimax).
     */
    private Double vuimin; // PU

    public Double getVuimin() {
        return vuimin;
    }

    public void setVuimin(Double _value_) {
        vuimin = _value_;
    }

    private static Object getVuimin(BaseClass _this_) {
        return ((UnderexcLimIEEE1) _this_).getVuimin();
    }

    private static void setVuimin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE1) _this_).setVuimin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE1) _this_).setVuimin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL output maximum limit (<i>V</i><i><sub>ULMAX</sub></i>) (&gt; UnderexcLimIEEE1.vulmin).  Typical value = 18.
     */
    private Double vulmax; // PU

    public Double getVulmax() {
        return vulmax;
    }

    public void setVulmax(Double _value_) {
        vulmax = _value_;
    }

    private static Object getVulmax(BaseClass _this_) {
        return ((UnderexcLimIEEE1) _this_).getVulmax();
    }

    private static void setVulmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE1) _this_).setVulmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE1) _this_).setVulmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL output minimum limit (<i>V</i><i><sub>ULMIN</sub></i>) (&lt; UnderexcLimIEEE1.vulmax).  Typical value = -18.
     */
    private Double vulmin; // PU

    public Double getVulmin() {
        return vulmin;
    }

    public void setVulmin(Double _value_) {
        vulmin = _value_;
    }

    private static Object getVulmin(BaseClass _this_) {
        return ((UnderexcLimIEEE1) _this_).getVulmin();
    }

    private static void setVulmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE1) _this_).setVulmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE1) _this_).setVulmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL maximum limit for radius phasor magnitude (<i>V</i><i><sub>URMAX</sub></i>).  Typical value = 5,8.
     */
    private Double vurmax; // PU

    public Double getVurmax() {
        return vurmax;
    }

    public void setVurmax(Double _value_) {
        vurmax = _value_;
    }

    private static Object getVurmax(BaseClass _this_) {
        return ((UnderexcLimIEEE1) _this_).getVurmax();
    }

    private static void setVurmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE1) _this_).setVurmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE1) _this_).setVurmax(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "UnderexcLimIEEE1", attrName));
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
                "UnderexcLimIEEE1", attrName, value));
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
            map.put("kuc", new AttrDetails("UnderexcLimIEEE1.kuc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLimIEEE1::getKuc, UnderexcLimIEEE1::setKuc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kuf", new AttrDetails("UnderexcLimIEEE1.kuf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLimIEEE1::getKuf, UnderexcLimIEEE1::setKuf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kui", new AttrDetails("UnderexcLimIEEE1.kui", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLimIEEE1::getKui, UnderexcLimIEEE1::setKui));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kul", new AttrDetails("UnderexcLimIEEE1.kul", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLimIEEE1::getKul, UnderexcLimIEEE1::setKul));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kur", new AttrDetails("UnderexcLimIEEE1.kur", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLimIEEE1::getKur, UnderexcLimIEEE1::setKur));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tu1", new AttrDetails("UnderexcLimIEEE1.tu1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLimIEEE1::getTu1, UnderexcLimIEEE1::setTu1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tu2", new AttrDetails("UnderexcLimIEEE1.tu2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLimIEEE1::getTu2, UnderexcLimIEEE1::setTu2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tu3", new AttrDetails("UnderexcLimIEEE1.tu3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLimIEEE1::getTu3, UnderexcLimIEEE1::setTu3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tu4", new AttrDetails("UnderexcLimIEEE1.tu4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLimIEEE1::getTu4, UnderexcLimIEEE1::setTu4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vucmax", new AttrDetails("UnderexcLimIEEE1.vucmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLimIEEE1::getVucmax, UnderexcLimIEEE1::setVucmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vuimax", new AttrDetails("UnderexcLimIEEE1.vuimax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLimIEEE1::getVuimax, UnderexcLimIEEE1::setVuimax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vuimin", new AttrDetails("UnderexcLimIEEE1.vuimin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLimIEEE1::getVuimin, UnderexcLimIEEE1::setVuimin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vulmax", new AttrDetails("UnderexcLimIEEE1.vulmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLimIEEE1::getVulmax, UnderexcLimIEEE1::setVulmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vulmin", new AttrDetails("UnderexcLimIEEE1.vulmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLimIEEE1::getVulmin, UnderexcLimIEEE1::setVulmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vurmax", new AttrDetails("UnderexcLimIEEE1.vurmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLimIEEE1::getVurmax, UnderexcLimIEEE1::setVurmax));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new UnderexcLimIEEE1(null).allAttrDetailsMap());
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
