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
 * <font color="#0f0f0f">Allis-Chalmers minimum excitation limiter.</font>
 */
@SuppressWarnings("unused")
public class UnderexcLimX1 extends UnderexcitationLimiterDynamics {

    private static final Logging LOG = Logging.getLogger(UnderexcLimX1.class);

    /**
     * Constructor.
     */
    public UnderexcLimX1(String rdfid) {
        super("UnderexcLimX1", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected UnderexcLimX1(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Minimum excitation limit slope (<i>K</i>) (&gt; 0).
     */
    private Double k; // PU

    public Double getK() {
        return k;
    }

    public void setK(Double _value_) {
        k = _value_;
    }

    private static Object getK(BaseClass _this_) {
        return ((UnderexcLimX1) _this_).getK();
    }

    private static void setK(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimX1) _this_).setK((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimX1) _this_).setK(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Differential gain (<i>K</i><i><sub>F2</sub></i>).
     */
    private Double kf2; // PU

    public Double getKf2() {
        return kf2;
    }

    public void setKf2(Double _value_) {
        kf2 = _value_;
    }

    private static Object getKf2(BaseClass _this_) {
        return ((UnderexcLimX1) _this_).getKf2();
    }

    private static void setKf2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimX1) _this_).setKf2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimX1) _this_).setKf2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum excitation limit gain (<i>K</i><i><sub>M</sub></i>).
     */
    private Double km; // PU

    public Double getKm() {
        return km;
    }

    public void setKm(Double _value_) {
        km = _value_;
    }

    private static Object getKm(BaseClass _this_) {
        return ((UnderexcLimX1) _this_).getKm();
    }

    private static void setKm(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimX1) _this_).setKm((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimX1) _this_).setKm(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum excitation limit value (<i>MELMAX</i>).
     */
    private Double melmax; // PU

    public Double getMelmax() {
        return melmax;
    }

    public void setMelmax(Double _value_) {
        melmax = _value_;
    }

    private static Object getMelmax(BaseClass _this_) {
        return ((UnderexcLimX1) _this_).getMelmax();
    }

    private static void setMelmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimX1) _this_).setMelmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimX1) _this_).setMelmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Differential time constant (<i>T</i><i><sub>F2</sub></i>) (&gt;= 0).
     */
    private Double tf2; // Seconds

    public Double getTf2() {
        return tf2;
    }

    public void setTf2(Double _value_) {
        tf2 = _value_;
    }

    private static Object getTf2(BaseClass _this_) {
        return ((UnderexcLimX1) _this_).getTf2();
    }

    private static void setTf2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimX1) _this_).setTf2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimX1) _this_).setTf2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum excitation limit time constant (<i>T</i><i><sub>M</sub></i>) (&gt;= 0).
     */
    private Double tm; // Seconds

    public Double getTm() {
        return tm;
    }

    public void setTm(Double _value_) {
        tm = _value_;
    }

    private static Object getTm(BaseClass _this_) {
        return ((UnderexcLimX1) _this_).getTm();
    }

    private static void setTm(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimX1) _this_).setTm((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimX1) _this_).setTm(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "UnderexcLimX1", attrName));
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
                "UnderexcLimX1", attrName, value));
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
            map.put("k", new AttrDetails("UnderexcLimX1.k", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLimX1::getK, UnderexcLimX1::setK));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf2", new AttrDetails("UnderexcLimX1.kf2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLimX1::getKf2, UnderexcLimX1::setKf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("km", new AttrDetails("UnderexcLimX1.km", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLimX1::getKm, UnderexcLimX1::setKm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("melmax", new AttrDetails("UnderexcLimX1.melmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLimX1::getMelmax, UnderexcLimX1::setMelmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf2", new AttrDetails("UnderexcLimX1.tf2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLimX1::getTf2, UnderexcLimX1::setTf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tm", new AttrDetails("UnderexcLimX1.tm", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLimX1::getTm, UnderexcLimX1::setTm));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new UnderexcLimX1(null).allAttrDetailsMap());
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
