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
 * Italian PSS with three inputs (speed, frequency, power).
 */
@SuppressWarnings("unused")
public class Pss1 extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(Pss1.class);

    /**
     * Constructor.
     */
    public Pss1(String rdfid) {
        super("Pss1", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected Pss1(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Frequency power input gain (<i>K</i><i><sub>F</sub></i>).  Typical value = 5.
     */
    private Float kf; // Float

    public Float getKf() {
        return kf;
    }

    public void setKf(Float _value_) {
        kf = _value_;
    }

    private static Object getKf(BaseClass _this_) {
        return ((Pss1) _this_).getKf();
    }

    private static void setKf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((Pss1) _this_).setKf((Float) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1) _this_).setKf(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Shaft speed power input gain (<i>K</i><i><sub>omega</sub></i>).  Typical value = 0.
     */
    private Float komega; // Float

    public Float getKomega() {
        return komega;
    }

    public void setKomega(Float _value_) {
        komega = _value_;
    }

    private static Object getKomega(BaseClass _this_) {
        return ((Pss1) _this_).getKomega();
    }

    private static void setKomega(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((Pss1) _this_).setKomega((Float) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1) _this_).setKomega(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Electric power input gain (<i>K</i><i><sub>PE</sub></i>).  Typical value = 0,3.
     */
    private Float kpe; // Float

    public Float getKpe() {
        return kpe;
    }

    public void setKpe(Float _value_) {
        kpe = _value_;
    }

    private static Object getKpe(BaseClass _this_) {
        return ((Pss1) _this_).getKpe();
    }

    private static void setKpe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((Pss1) _this_).setKpe((Float) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1) _this_).setKpe(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * PSS gain (<i>Ks</i>).  Typical value = 1.
     */
    private Float ks; // Float

    public Float getKs() {
        return ks;
    }

    public void setKs(Float _value_) {
        ks = _value_;
    }

    private static Object getKs(BaseClass _this_) {
        return ((Pss1) _this_).getKs();
    }

    private static void setKs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((Pss1) _this_).setKs((Float) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1) _this_).setKs(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Minimum power PSS enabling (<i>Pmin</i>).  Typical value = 0,25.
     */
    private Double pmin; // PU

    public Double getPmin() {
        return pmin;
    }

    public void setPmin(Double _value_) {
        pmin = _value_;
    }

    private static Object getPmin(BaseClass _this_) {
        return ((Pss1) _this_).getPmin();
    }

    private static void setPmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1) _this_).setPmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1) _this_).setPmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (<i>T</i><i><sub>10</sub></i>) (&gt;= 0).  Typical value = 0.
     */
    private Double t10; // Seconds

    public Double getT10() {
        return t10;
    }

    public void setT10(Double _value_) {
        t10 = _value_;
    }

    private static Object getT10(BaseClass _this_) {
        return ((Pss1) _this_).getT10();
    }

    private static void setT10(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1) _this_).setT10((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1) _this_).setT10(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Washout (<i>T</i><i><sub>5</sub></i>) (&gt;= 0).  Typical value = 3,5.
     */
    private Double t5; // Seconds

    public Double getT5() {
        return t5;
    }

    public void setT5(Double _value_) {
        t5 = _value_;
    }

    private static Object getT5(BaseClass _this_) {
        return ((Pss1) _this_).getT5();
    }

    private static void setT5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1) _this_).setT5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1) _this_).setT5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter time constant (<i>T</i><i><sub>6</sub></i>) (&gt;= 0).  Typical value = 0.
     */
    private Double t6; // Seconds

    public Double getT6() {
        return t6;
    }

    public void setT6(Double _value_) {
        t6 = _value_;
    }

    private static Object getT6(BaseClass _this_) {
        return ((Pss1) _this_).getT6();
    }

    private static void setT6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1) _this_).setT6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1) _this_).setT6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (<i>T</i><i><sub>7</sub></i>) (&gt;= 0). If = 0, both blocks are bypassed.  Typical value = 0.
     */
    private Double t7; // Seconds

    public Double getT7() {
        return t7;
    }

    public void setT7(Double _value_) {
        t7 = _value_;
    }

    private static Object getT7(BaseClass _this_) {
        return ((Pss1) _this_).getT7();
    }

    private static void setT7(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1) _this_).setT7((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1) _this_).setT7(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (<i>T</i><i><sub>8</sub></i>) (&gt;= 0).  Typical value = 0.
     */
    private Double t8; // Seconds

    public Double getT8() {
        return t8;
    }

    public void setT8(Double _value_) {
        t8 = _value_;
    }

    private static Object getT8(BaseClass _this_) {
        return ((Pss1) _this_).getT8();
    }

    private static void setT8(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1) _this_).setT8((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1) _this_).setT8(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (<i>T</i><i><sub>9</sub></i>) (&gt;= 0).  If = 0, both blocks are bypassed.  Typical value = 0.
     */
    private Double t9; // Seconds

    public Double getT9() {
        return t9;
    }

    public void setT9(Double _value_) {
        t9 = _value_;
    }

    private static Object getT9(BaseClass _this_) {
        return ((Pss1) _this_).getT9();
    }

    private static void setT9(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1) _this_).setT9((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1) _this_).setT9(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Electric power filter time constant (<i>T</i><i><sub>PE</sub></i>) (&gt;= 0).  Typical value = 0,05.
     */
    private Double tpe; // Seconds

    public Double getTpe() {
        return tpe;
    }

    public void setTpe(Double _value_) {
        tpe = _value_;
    }

    private static Object getTpe(BaseClass _this_) {
        return ((Pss1) _this_).getTpe();
    }

    private static void setTpe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1) _this_).setTpe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1) _this_).setTpe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * <font color=`#0f0f0f`>Signal selector (<i>V</i><i><sub>ADAT</sub></i>).</font> <font color=`#0f0f0f`>true = closed (generator power is greater than <i>Pmin</i>)</font> <font color=`#0f0f0f`>false = open (<i>Pe</i> is smaller than <i>Pmin</i>).</font> <font color=`#0f0f0f`>Typical value = true.</font>
     */
    private Boolean vadat; // Boolean

    public Boolean getVadat() {
        return vadat;
    }

    public void setVadat(Boolean _value_) {
        vadat = _value_;
    }

    private static Object getVadat(BaseClass _this_) {
        return ((Pss1) _this_).getVadat();
    }

    private static void setVadat(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Pss1) _this_).setVadat((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1) _this_).setVadat(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Stabilizer output maximum limit (<i>V</i><i><sub>SMN</sub></i>).  Typical value = -0,06.
     */
    private Double vsmn; // PU

    public Double getVsmn() {
        return vsmn;
    }

    public void setVsmn(Double _value_) {
        vsmn = _value_;
    }

    private static Object getVsmn(BaseClass _this_) {
        return ((Pss1) _this_).getVsmn();
    }

    private static void setVsmn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1) _this_).setVsmn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1) _this_).setVsmn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Stabilizer output minimum limit (<i>V</i><i><sub>SMX</sub></i>).  Typical value = 0,06.
     */
    private Double vsmx; // PU

    public Double getVsmx() {
        return vsmx;
    }

    public void setVsmx(Double _value_) {
        vsmx = _value_;
    }

    private static Object getVsmx(BaseClass _this_) {
        return ((Pss1) _this_).getVsmx();
    }

    private static void setVsmx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1) _this_).setVsmx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1) _this_).setVsmx(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "Pss1", attrName));
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
                "Pss1", attrName, value));
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
            map.put("kf", new AttrDetails("Pss1.kf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss1::getKf, Pss1::setKf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("komega", new AttrDetails("Pss1.komega", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss1::getKomega, Pss1::setKomega));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpe", new AttrDetails("Pss1.kpe", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss1::getKpe, Pss1::setKpe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks", new AttrDetails("Pss1.ks", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss1::getKs, Pss1::setKs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmin", new AttrDetails("Pss1.pmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss1::getPmin, Pss1::setPmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t10", new AttrDetails("Pss1.t10", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss1::getT10, Pss1::setT10));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5", new AttrDetails("Pss1.t5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss1::getT5, Pss1::setT5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t6", new AttrDetails("Pss1.t6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss1::getT6, Pss1::setT6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t7", new AttrDetails("Pss1.t7", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss1::getT7, Pss1::setT7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t8", new AttrDetails("Pss1.t8", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss1::getT8, Pss1::setT8));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t9", new AttrDetails("Pss1.t9", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss1::getT9, Pss1::setT9));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpe", new AttrDetails("Pss1.tpe", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss1::getTpe, Pss1::setTpe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vadat", new AttrDetails("Pss1.vadat", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss1::getVadat, Pss1::setVadat));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsmn", new AttrDetails("Pss1.vsmn", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss1::getVsmn, Pss1::setVsmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsmx", new AttrDetails("Pss1.vsmx", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss1::getVsmx, Pss1::setVsmx));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new Pss1(null).allAttrDetailsMap());
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
