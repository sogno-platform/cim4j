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
 * Modified IEEE DC3A direct current commutator exciter with speed input, and deadband.  DC old type 4.
 */
@SuppressWarnings("unused")
public class ExcDC3A extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcDC3A.class);

    /**
     * Constructor.
     */
    public ExcDC3A(String rdfid) {
        super("ExcDC3A", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcDC3A(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Exciter voltage at which exciter saturation is defined (<i>Efd</i><i><sub>1</sub></i>) (&gt; 0).  Typical value = 2,6.
     */
    private Double efd1; // PU

    public Double getEfd1() {
        return efd1;
    }

    public void setEfd1(Double _value_) {
        efd1 = _value_;
    }

    private static Object getEfd1(BaseClass _this_) {
        return ((ExcDC3A) _this_).getEfd1();
    }

    private static void setEfd1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A) _this_).setEfd1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A) _this_).setEfd1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter voltage at which exciter saturation is defined (<i>Efd</i><i><sub>2</sub></i>) (&gt; 0).  Typical value = 3,45.
     */
    private Double efd2; // PU

    public Double getEfd2() {
        return efd2;
    }

    public void setEfd2(Double _value_) {
        efd2 = _value_;
    }

    private static Object getEfd2(BaseClass _this_) {
        return ((ExcDC3A) _this_).getEfd2();
    }

    private static void setEfd2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A) _this_).setEfd2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A) _this_).setEfd2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * (<i>Efdlim</i>). true = exciter output limiter is active false = exciter output limiter not active. Typical value = true.
     */
    private Boolean efdlim; // Boolean

    public Boolean getEfdlim() {
        return efdlim;
    }

    public void setEfdlim(Boolean _value_) {
        efdlim = _value_;
    }

    private static Object getEfdlim(BaseClass _this_) {
        return ((ExcDC3A) _this_).getEfdlim();
    }

    private static void setEfdlim(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ExcDC3A) _this_).setEfdlim((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A) _this_).setEfdlim(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Maximum voltage exciter output limiter (<i>Efdmax</i>) (&gt; ExcDC3A.efdmin).  Typical value = 99.
     */
    private Double efdmax; // PU

    public Double getEfdmax() {
        return efdmax;
    }

    public void setEfdmax(Double _value_) {
        efdmax = _value_;
    }

    private static Object getEfdmax(BaseClass _this_) {
        return ((ExcDC3A) _this_).getEfdmax();
    }

    private static void setEfdmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A) _this_).setEfdmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A) _this_).setEfdmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage exciter output limiter (<i>Efdmin</i>) (&lt; ExcDC3A.efdmax).  Typical value = -99.
     */
    private Double efdmin; // PU

    public Double getEfdmin() {
        return efdmin;
    }

    public void setEfdmin(Double _value_) {
        efdmin = _value_;
    }

    private static Object getEfdmin(BaseClass _this_) {
        return ((ExcDC3A) _this_).getEfdmin();
    }

    private static void setEfdmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A) _this_).setEfdmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A) _this_).setEfdmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * (<i>exclim</i>).  IEEE standard is ambiguous about lower limit on exciter output. true = a lower limit of zero is applied to integrator output false = a lower limit of zero not applied to integrator output. Typical value = true.
     */
    private Boolean exclim; // Boolean

    public Boolean getExclim() {
        return exclim;
    }

    public void setExclim(Boolean _value_) {
        exclim = _value_;
    }

    private static Object getExclim(BaseClass _this_) {
        return ((ExcDC3A) _this_).getExclim();
    }

    private static void setExclim(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ExcDC3A) _this_).setExclim((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A) _this_).setExclim(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Exciter constant related to self-excited field (<i>Ke</i>).  Typical value = 1.
     */
    private Double ke; // PU

    public Double getKe() {
        return ke;
    }

    public void setKe(Double _value_) {
        ke = _value_;
    }

    private static Object getKe(BaseClass _this_) {
        return ((ExcDC3A) _this_).getKe();
    }

    private static void setKe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A) _this_).setKe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A) _this_).setKe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Deadband (<i>Kr</i>).  Typical value = 0.
     */
    private Double kr; // PU

    public Double getKr() {
        return kr;
    }

    public void setKr(Double _value_) {
        kr = _value_;
    }

    private static Object getKr(BaseClass _this_) {
        return ((ExcDC3A) _this_).getKr();
    }

    private static void setKr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A) _this_).setKr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A) _this_).setKr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Coefficient to allow different usage of the model-speed coefficient (<i>Ks</i>).  Typical value = 0.
     */
    private Double ks; // PU

    public Double getKs() {
        return ks;
    }

    public void setKs(Double _value_) {
        ks = _value_;
    }

    private static Object getKs(BaseClass _this_) {
        return ((ExcDC3A) _this_).getKs();
    }

    private static void setKs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A) _this_).setKs((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A) _this_).setKs(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fast raise/lower contact setting (<i>Kv</i>) (&gt; 0).  Typical value = 0,05.
     */
    private Double kv; // PU

    public Double getKv() {
        return kv;
    }

    public void setKv(Double _value_) {
        kv = _value_;
    }

    private static Object getKv(BaseClass _this_) {
        return ((ExcDC3A) _this_).getKv();
    }

    private static void setKv(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A) _this_).setKv((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A) _this_).setKv(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, <i>Efd</i><i><sub>1</sub></i> (<i>Se[Efd</i><i><sub>1</sub></i><i>]</i>) (&gt;= 0).  Typical value = 0,1.
     */
    private Float seefd1; // Float

    public Float getSeefd1() {
        return seefd1;
    }

    public void setSeefd1(Float _value_) {
        seefd1 = _value_;
    }

    private static Object getSeefd1(BaseClass _this_) {
        return ((ExcDC3A) _this_).getSeefd1();
    }

    private static void setSeefd1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExcDC3A) _this_).setSeefd1((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A) _this_).setSeefd1(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, <i>Efd</i><i><sub>2</sub></i> (<i>Se[Efd</i><i><sub>2</sub></i><i>]</i>) (&gt;= 0).  Typical value = 0,35.
     */
    private Float seefd2; // Float

    public Float getSeefd2() {
        return seefd2;
    }

    public void setSeefd2(Float _value_) {
        seefd2 = _value_;
    }

    private static Object getSeefd2(BaseClass _this_) {
        return ((ExcDC3A) _this_).getSeefd2();
    }

    private static void setSeefd2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExcDC3A) _this_).setSeefd2((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A) _this_).setSeefd2(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Exciter time constant, integration rate associated with exciter control (<i>Te</i>) (&gt; 0).  Typical value = 1,83.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    private static Object getTe(BaseClass _this_) {
        return ((ExcDC3A) _this_).getTe();
    }

    private static void setTe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A) _this_).setTe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A) _this_).setTe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rheostat travel time (<i>Trh</i>) (&gt; 0).  Typical value = 20.
     */
    private Double trh; // Seconds

    public Double getTrh() {
        return trh;
    }

    public void setTrh(Double _value_) {
        trh = _value_;
    }

    private static Object getTrh(BaseClass _this_) {
        return ((ExcDC3A) _this_).getTrh();
    }

    private static void setTrh(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A) _this_).setTrh((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A) _this_).setTrh(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage regulator output (<i>Vrmax</i>) (&gt; 0).  Typical value = 5.
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    private static Object getVrmax(BaseClass _this_) {
        return ((ExcDC3A) _this_).getVrmax();
    }

    private static void setVrmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A) _this_).setVrmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A) _this_).setVrmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator output (<i>Vrmin</i>) (&lt;= 0).  Typical value = 0.
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    private static Object getVrmin(BaseClass _this_) {
        return ((ExcDC3A) _this_).getVrmin();
    }

    private static void setVrmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A) _this_).setVrmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A) _this_).setVrmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcDC3A", attrName));
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
                "ExcDC3A", attrName, value));
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
            map.put("efd1", new AttrDetails("ExcDC3A.efd1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::getEfd1, ExcDC3A::setEfd1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efd2", new AttrDetails("ExcDC3A.efd2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::getEfd2, ExcDC3A::setEfd2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efdlim", new AttrDetails("ExcDC3A.efdlim", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::getEfdlim, ExcDC3A::setEfdlim));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efdmax", new AttrDetails("ExcDC3A.efdmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::getEfdmax, ExcDC3A::setEfdmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efdmin", new AttrDetails("ExcDC3A.efdmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::getEfdmin, ExcDC3A::setEfdmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("exclim", new AttrDetails("ExcDC3A.exclim", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::getExclim, ExcDC3A::setExclim));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcDC3A.ke", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::getKe, ExcDC3A::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kr", new AttrDetails("ExcDC3A.kr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::getKr, ExcDC3A::setKr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks", new AttrDetails("ExcDC3A.ks", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::getKs, ExcDC3A::setKs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kv", new AttrDetails("ExcDC3A.kv", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::getKv, ExcDC3A::setKv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seefd1", new AttrDetails("ExcDC3A.seefd1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::getSeefd1, ExcDC3A::setSeefd1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seefd2", new AttrDetails("ExcDC3A.seefd2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::getSeefd2, ExcDC3A::setSeefd2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcDC3A.te", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::getTe, ExcDC3A::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("trh", new AttrDetails("ExcDC3A.trh", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::getTrh, ExcDC3A::setTrh));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcDC3A.vrmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::getVrmax, ExcDC3A::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcDC3A.vrmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::getVrmin, ExcDC3A::setVrmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcDC3A(null).allAttrDetailsMap());
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
