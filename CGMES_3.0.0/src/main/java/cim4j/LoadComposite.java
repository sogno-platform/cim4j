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
 * Combined static load and induction motor load effects. The dynamics of the motor are simplified by linearizing the induction machine equations.
 */
@SuppressWarnings("unused")
public class LoadComposite extends LoadDynamics {

    private static final Logging LOG = Logging.getLogger(LoadComposite.class);

    /**
     * Constructor.
     */
    public LoadComposite(String rdfid) {
        super("LoadComposite", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected LoadComposite(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Active load-frequency dependence index (dynamic) (<i>Epfd</i>).  Typical value = 1,5.
     */
    private Float epfd; // Float

    public Float getEpfd() {
        return epfd;
    }

    public void setEpfd(Float _value_) {
        epfd = _value_;
    }

    private static Object getEpfd(BaseClass _this_) {
        return ((LoadComposite) _this_).getEpfd();
    }

    private static void setEpfd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((LoadComposite) _this_).setEpfd((Float) _value_);
        } else if (_value_ instanceof String) {
            ((LoadComposite) _this_).setEpfd(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Active load-frequency dependence index (static) (<i>Epfs</i>).  Typical value = 1,5.
     */
    private Float epfs; // Float

    public Float getEpfs() {
        return epfs;
    }

    public void setEpfs(Float _value_) {
        epfs = _value_;
    }

    private static Object getEpfs(BaseClass _this_) {
        return ((LoadComposite) _this_).getEpfs();
    }

    private static void setEpfs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((LoadComposite) _this_).setEpfs((Float) _value_);
        } else if (_value_ instanceof String) {
            ((LoadComposite) _this_).setEpfs(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Active load-voltage dependence index (dynamic) (<i>Epvd</i>).  Typical value = 0,7.
     */
    private Float epvd; // Float

    public Float getEpvd() {
        return epvd;
    }

    public void setEpvd(Float _value_) {
        epvd = _value_;
    }

    private static Object getEpvd(BaseClass _this_) {
        return ((LoadComposite) _this_).getEpvd();
    }

    private static void setEpvd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((LoadComposite) _this_).setEpvd((Float) _value_);
        } else if (_value_ instanceof String) {
            ((LoadComposite) _this_).setEpvd(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Active load-voltage dependence index (static) (<i>Epvs</i>).  Typical value = 0,7.
     */
    private Float epvs; // Float

    public Float getEpvs() {
        return epvs;
    }

    public void setEpvs(Float _value_) {
        epvs = _value_;
    }

    private static Object getEpvs(BaseClass _this_) {
        return ((LoadComposite) _this_).getEpvs();
    }

    private static void setEpvs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((LoadComposite) _this_).setEpvs((Float) _value_);
        } else if (_value_ instanceof String) {
            ((LoadComposite) _this_).setEpvs(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Reactive load-frequency dependence index (dynamic) (<i>Eqfd</i>).  Typical value = 0.
     */
    private Float eqfd; // Float

    public Float getEqfd() {
        return eqfd;
    }

    public void setEqfd(Float _value_) {
        eqfd = _value_;
    }

    private static Object getEqfd(BaseClass _this_) {
        return ((LoadComposite) _this_).getEqfd();
    }

    private static void setEqfd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((LoadComposite) _this_).setEqfd((Float) _value_);
        } else if (_value_ instanceof String) {
            ((LoadComposite) _this_).setEqfd(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Reactive load-frequency dependence index (static) (<i>Eqfs</i>).  Typical value = 0.
     */
    private Float eqfs; // Float

    public Float getEqfs() {
        return eqfs;
    }

    public void setEqfs(Float _value_) {
        eqfs = _value_;
    }

    private static Object getEqfs(BaseClass _this_) {
        return ((LoadComposite) _this_).getEqfs();
    }

    private static void setEqfs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((LoadComposite) _this_).setEqfs((Float) _value_);
        } else if (_value_ instanceof String) {
            ((LoadComposite) _this_).setEqfs(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Reactive load-voltage dependence index (dynamic) (<i>Eqvd</i>).  Typical value = 2.
     */
    private Float eqvd; // Float

    public Float getEqvd() {
        return eqvd;
    }

    public void setEqvd(Float _value_) {
        eqvd = _value_;
    }

    private static Object getEqvd(BaseClass _this_) {
        return ((LoadComposite) _this_).getEqvd();
    }

    private static void setEqvd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((LoadComposite) _this_).setEqvd((Float) _value_);
        } else if (_value_ instanceof String) {
            ((LoadComposite) _this_).setEqvd(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Reactive load-voltage dependence index (static) (<i>Eqvs</i>).  Typical value = 2.
     */
    private Float eqvs; // Float

    public Float getEqvs() {
        return eqvs;
    }

    public void setEqvs(Float _value_) {
        eqvs = _value_;
    }

    private static Object getEqvs(BaseClass _this_) {
        return ((LoadComposite) _this_).getEqvs();
    }

    private static void setEqvs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((LoadComposite) _this_).setEqvs((Float) _value_);
        } else if (_value_ instanceof String) {
            ((LoadComposite) _this_).setEqvs(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Inertia constant (<i>H</i>) (&gt;= 0).  Typical value = 2,5.
     */
    private Double h; // Seconds

    public Double getH() {
        return h;
    }

    public void setH(Double _value_) {
        h = _value_;
    }

    private static Object getH(BaseClass _this_) {
        return ((LoadComposite) _this_).getH();
    }

    private static void setH(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadComposite) _this_).setH((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadComposite) _this_).setH(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Loading factor (<i>L</i><i><sub>fac</sub></i>). The ratio of initial <i>P</i> to motor MVA base.  Typical value = 0,8.
     */
    private Float lfac; // Float

    public Float getLfac() {
        return lfac;
    }

    public void setLfac(Float _value_) {
        lfac = _value_;
    }

    private static Object getLfac(BaseClass _this_) {
        return ((LoadComposite) _this_).getLfac();
    }

    private static void setLfac(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((LoadComposite) _this_).setLfac((Float) _value_);
        } else if (_value_ instanceof String) {
            ((LoadComposite) _this_).setLfac(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Fraction of constant-power load to be represented by this motor model (<i>P</i><i><sub>FRAC</sub></i>) (&gt;= 0,0 and &lt;= 1,0).  Typical value = 0,5.
     */
    private Float pfrac; // Float

    public Float getPfrac() {
        return pfrac;
    }

    public void setPfrac(Float _value_) {
        pfrac = _value_;
    }

    private static Object getPfrac(BaseClass _this_) {
        return ((LoadComposite) _this_).getPfrac();
    }

    private static void setPfrac(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((LoadComposite) _this_).setPfrac((Float) _value_);
        } else if (_value_ instanceof String) {
            ((LoadComposite) _this_).setPfrac(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "LoadComposite", attrName));
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
                "LoadComposite", attrName, value));
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
            map.put("epfd", new AttrDetails("LoadComposite.epfd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadComposite::getEpfd, LoadComposite::setEpfd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("epfs", new AttrDetails("LoadComposite.epfs", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadComposite::getEpfs, LoadComposite::setEpfs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("epvd", new AttrDetails("LoadComposite.epvd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadComposite::getEpvd, LoadComposite::setEpvd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("epvs", new AttrDetails("LoadComposite.epvs", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadComposite::getEpvs, LoadComposite::setEpvs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eqfd", new AttrDetails("LoadComposite.eqfd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadComposite::getEqfd, LoadComposite::setEqfd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eqfs", new AttrDetails("LoadComposite.eqfs", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadComposite::getEqfs, LoadComposite::setEqfs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eqvd", new AttrDetails("LoadComposite.eqvd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadComposite::getEqvd, LoadComposite::setEqvd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eqvs", new AttrDetails("LoadComposite.eqvs", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadComposite::getEqvs, LoadComposite::setEqvs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("h", new AttrDetails("LoadComposite.h", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadComposite::getH, LoadComposite::setH));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lfac", new AttrDetails("LoadComposite.lfac", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadComposite::getLfac, LoadComposite::setLfac));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pfrac", new AttrDetails("LoadComposite.pfrac", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadComposite::getPfrac, LoadComposite::setPfrac));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new LoadComposite(null).allAttrDetailsMap());
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
