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
     * Default constructor.
     */
    public LoadComposite() {
        setCimType("LoadComposite");
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

    public void setEpfd(String _value_) {
        epfd = getDoubleFromString(_value_);
    }

    public String epfdToString() {
        return epfd != null ? epfd.toString() : null;
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

    public void setEpfs(String _value_) {
        epfs = getDoubleFromString(_value_);
    }

    public String epfsToString() {
        return epfs != null ? epfs.toString() : null;
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

    public void setEpvd(String _value_) {
        epvd = getDoubleFromString(_value_);
    }

    public String epvdToString() {
        return epvd != null ? epvd.toString() : null;
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

    public void setEpvs(String _value_) {
        epvs = getDoubleFromString(_value_);
    }

    public String epvsToString() {
        return epvs != null ? epvs.toString() : null;
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

    public void setEqfd(String _value_) {
        eqfd = getDoubleFromString(_value_);
    }

    public String eqfdToString() {
        return eqfd != null ? eqfd.toString() : null;
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

    public void setEqfs(String _value_) {
        eqfs = getDoubleFromString(_value_);
    }

    public String eqfsToString() {
        return eqfs != null ? eqfs.toString() : null;
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

    public void setEqvd(String _value_) {
        eqvd = getDoubleFromString(_value_);
    }

    public String eqvdToString() {
        return eqvd != null ? eqvd.toString() : null;
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

    public void setEqvs(String _value_) {
        eqvs = getDoubleFromString(_value_);
    }

    public String eqvsToString() {
        return eqvs != null ? eqvs.toString() : null;
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

    public void setH(String _value_) {
        h = getDoubleFromString(_value_);
    }

    public String hToString() {
        return h != null ? h.toString() : null;
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

    public void setLfrac(String _value_) {
        lfrac = getDoubleFromString(_value_);
    }

    public String lfracToString() {
        return lfrac != null ? lfrac.toString() : null;
    }

    /**
     * Fraction of constant-power load to be represented by this motor model (Pfrac) (&gt;=0.0 and &lt;=1.0).  Typical Value = 0.5.
     */
    private Double pfrac; // Simple_Float

    public Double getPfrac() {
        return pfrac;
    }

    public void setPfrac(Double _value_) {
        pfrac = _value_;
    }

    public void setPfrac(String _value_) {
        pfrac = getDoubleFromString(_value_);
    }

    public String pfracToString() {
        return pfrac != null ? pfrac.toString() : null;
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
     * Get an attribute value as string.
     *
     * @param attrName The attribute name
     * @return         The attribute value
     */
    @Override
    public String getAttribute(String attrName) {
        return getAttribute("LoadComposite", attrName);
    }

    @Override
    protected String getAttribute(String className, String attrName) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var getterFunction = classGetterSetterMap.get(attrName).getter;
            return getterFunction.get();
        }
        return super.getAttribute(className, attrName);
    }

    /**
     * Set an attribute value as object (for class and list attributes).
     *
     * @param attrName    The attribute name
     * @param objectValue The attribute value as object
     */
    @Override
    public void setAttribute(String attrName, BaseClass objectValue) {
        setAttribute("LoadComposite", attrName, objectValue);
    }

    @Override
    protected void setAttribute(String className, String attrName, BaseClass objectValue) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var setterFunction = classGetterSetterMap.get(attrName).objectSetter;
            setterFunction.accept(objectValue);
        } else {
            super.setAttribute(className, attrName, objectValue);
        }
    }

    /**
     * Set an attribute value as string (for primitive (including datatype) and enum attributes).
     *
     * @param attrName    The attribute name
     * @param stringValue The attribute value as string
     */
    @Override
    public void setAttribute(String attrName, String stringValue) {
        setAttribute("LoadComposite", attrName, stringValue);
    }

    @Override
    protected void setAttribute(String className, String attrName, String stringValue) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var setterFunction = classGetterSetterMap.get(attrName).stringSetter;
            setterFunction.accept(stringValue);
        } else {
            super.setAttribute(className, attrName, stringValue);
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
            map.put("epfd", new AttrDetails("LoadComposite.epfd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("epfs", new AttrDetails("LoadComposite.epfs", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("epvd", new AttrDetails("LoadComposite.epvd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("epvs", new AttrDetails("LoadComposite.epvs", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eqfd", new AttrDetails("LoadComposite.eqfd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eqfs", new AttrDetails("LoadComposite.eqfs", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eqvd", new AttrDetails("LoadComposite.eqvd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eqvs", new AttrDetails("LoadComposite.eqvs", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("h", new AttrDetails("LoadComposite.h", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lfrac", new AttrDetails("LoadComposite.lfrac", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pfrac", new AttrDetails("LoadComposite.pfrac", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new LoadComposite().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("epfd", new GetterSetter(this::epfdToString, null, this::setEpfd));
        map.put("epfs", new GetterSetter(this::epfsToString, null, this::setEpfs));
        map.put("epvd", new GetterSetter(this::epvdToString, null, this::setEpvd));
        map.put("epvs", new GetterSetter(this::epvsToString, null, this::setEpvs));
        map.put("eqfd", new GetterSetter(this::eqfdToString, null, this::setEqfd));
        map.put("eqfs", new GetterSetter(this::eqfsToString, null, this::setEqfs));
        map.put("eqvd", new GetterSetter(this::eqvdToString, null, this::setEqvd));
        map.put("eqvs", new GetterSetter(this::eqvsToString, null, this::setEqvs));
        map.put("h", new GetterSetter(this::hToString, null, this::setH));
        map.put("lfrac", new GetterSetter(this::lfracToString, null, this::setLfrac));
        map.put("pfrac", new GetterSetter(this::pfracToString, null, this::setPfrac));
        return map;
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
