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
 * This models combines static load and induction motor load effects. The dynamics of the motor are simplified by linearizing the induction machine equations.
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
     * Active load-frequency dependence index (dynamic) (Epfd).  Typical Value = 1.5.
     */
    private Double epfd; // Simple_Float

    public Double getEpfd() {
        return epfd;
    }

    public void setEpfd(Double _value_) {
        epfd = _value_;
    }

    private static Object getEpfd(BaseClass _this_) {
        return ((LoadComposite) _this_).getEpfd();
    }

    private static void setEpfd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadComposite) _this_).setEpfd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadComposite) _this_).setEpfd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Active load-frequency dependence index (static) (Epfs).  Typical Value = 1.5.
     */
    private Double epfs; // Simple_Float

    public Double getEpfs() {
        return epfs;
    }

    public void setEpfs(Double _value_) {
        epfs = _value_;
    }

    private static Object getEpfs(BaseClass _this_) {
        return ((LoadComposite) _this_).getEpfs();
    }

    private static void setEpfs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadComposite) _this_).setEpfs((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadComposite) _this_).setEpfs(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Active load-voltage dependence index (dynamic) (Epvd).  Typical Value = 0.7.
     */
    private Double epvd; // Simple_Float

    public Double getEpvd() {
        return epvd;
    }

    public void setEpvd(Double _value_) {
        epvd = _value_;
    }

    private static Object getEpvd(BaseClass _this_) {
        return ((LoadComposite) _this_).getEpvd();
    }

    private static void setEpvd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadComposite) _this_).setEpvd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadComposite) _this_).setEpvd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Active load-voltage dependence index (static) (Epvs).  Typical Value = 0.7.
     */
    private Double epvs; // Simple_Float

    public Double getEpvs() {
        return epvs;
    }

    public void setEpvs(Double _value_) {
        epvs = _value_;
    }

    private static Object getEpvs(BaseClass _this_) {
        return ((LoadComposite) _this_).getEpvs();
    }

    private static void setEpvs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadComposite) _this_).setEpvs((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadComposite) _this_).setEpvs(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive load-frequency dependence index (dynamic) (Eqfd).  Typical Value = 0.
     */
    private Double eqfd; // Simple_Float

    public Double getEqfd() {
        return eqfd;
    }

    public void setEqfd(Double _value_) {
        eqfd = _value_;
    }

    private static Object getEqfd(BaseClass _this_) {
        return ((LoadComposite) _this_).getEqfd();
    }

    private static void setEqfd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadComposite) _this_).setEqfd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadComposite) _this_).setEqfd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive load-frequency dependence index (static) (Eqfs).  Typical Value = 0.
     */
    private Double eqfs; // Simple_Float

    public Double getEqfs() {
        return eqfs;
    }

    public void setEqfs(Double _value_) {
        eqfs = _value_;
    }

    private static Object getEqfs(BaseClass _this_) {
        return ((LoadComposite) _this_).getEqfs();
    }

    private static void setEqfs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadComposite) _this_).setEqfs((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadComposite) _this_).setEqfs(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive load-voltage dependence index (dynamic) (Eqvd).  Typical Value = 2.
     */
    private Double eqvd; // Simple_Float

    public Double getEqvd() {
        return eqvd;
    }

    public void setEqvd(Double _value_) {
        eqvd = _value_;
    }

    private static Object getEqvd(BaseClass _this_) {
        return ((LoadComposite) _this_).getEqvd();
    }

    private static void setEqvd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadComposite) _this_).setEqvd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadComposite) _this_).setEqvd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive load-voltage dependence index (static) (Eqvs).  Typical Value = 2.
     */
    private Double eqvs; // Simple_Float

    public Double getEqvs() {
        return eqvs;
    }

    public void setEqvs(Double _value_) {
        eqvs = _value_;
    }

    private static Object getEqvs(BaseClass _this_) {
        return ((LoadComposite) _this_).getEqvs();
    }

    private static void setEqvs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadComposite) _this_).setEqvs((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadComposite) _this_).setEqvs(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Inertia constant (H).  Typical Value = 2.5.
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
     * Loading factor - ratio of initial P to motor MVA base (Lfrac).  Typical Value = 0.8.
     */
    private Double lfrac; // Simple_Float

    public Double getLfrac() {
        return lfrac;
    }

    public void setLfrac(Double _value_) {
        lfrac = _value_;
    }

    private static Object getLfrac(BaseClass _this_) {
        return ((LoadComposite) _this_).getLfrac();
    }

    private static void setLfrac(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadComposite) _this_).setLfrac((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadComposite) _this_).setLfrac(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of constant-power load to be represented by this motor model (Pfrac) (>=0.0 and <=1.0).  Typical Value = 0.5.
     */
    private Double pfrac; // Simple_Float

    public Double getPfrac() {
        return pfrac;
    }

    public void setPfrac(Double _value_) {
        pfrac = _value_;
    }

    private static Object getPfrac(BaseClass _this_) {
        return ((LoadComposite) _this_).getPfrac();
    }

    private static void setPfrac(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadComposite) _this_).setPfrac((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadComposite) _this_).setPfrac(getDoubleFromString((String) _value_));
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

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/2013/CIM-schema-cim16#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("epfd", new AttrDetails("LoadComposite.epfd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadComposite::getEpfd, LoadComposite::setEpfd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("epfs", new AttrDetails("LoadComposite.epfs", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadComposite::getEpfs, LoadComposite::setEpfs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("epvd", new AttrDetails("LoadComposite.epvd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadComposite::getEpvd, LoadComposite::setEpvd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("epvs", new AttrDetails("LoadComposite.epvs", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadComposite::getEpvs, LoadComposite::setEpvs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eqfd", new AttrDetails("LoadComposite.eqfd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadComposite::getEqfd, LoadComposite::setEqfd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eqfs", new AttrDetails("LoadComposite.eqfs", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadComposite::getEqfs, LoadComposite::setEqfs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eqvd", new AttrDetails("LoadComposite.eqvd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadComposite::getEqvd, LoadComposite::setEqvd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eqvs", new AttrDetails("LoadComposite.eqvs", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadComposite::getEqvs, LoadComposite::setEqvs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("h", new AttrDetails("LoadComposite.h", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadComposite::getH, LoadComposite::setH));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lfrac", new AttrDetails("LoadComposite.lfrac", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadComposite::getLfrac, LoadComposite::setLfrac));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pfrac", new AttrDetails("LoadComposite.pfrac", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadComposite::getPfrac, LoadComposite::setPfrac));
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
