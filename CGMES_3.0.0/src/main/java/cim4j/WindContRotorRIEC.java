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
 * Rotor resistance control model. Reference: IEC 61400-27-1:2015, 5.6.5.3.
 */
@SuppressWarnings("unused")
public class WindContRotorRIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindContRotorRIEC.class);

    /**
     * Default constructor.
     */
    public WindContRotorRIEC() {
        setCimType("WindContRotorRIEC");
    }

    /**
     * The wind dynamics lookup table associated with this rotor resistance control model.
     *
     * NOT USED
     */
    private Set<WindDynamicsLookupTable> WindDynamicsLookupTable = new HashSet<>(); // OneToMany

    public Set<WindDynamicsLookupTable> getWindDynamicsLookupTable() {
        return WindDynamicsLookupTable;
    }

    public void setWindDynamicsLookupTable(BaseClass _object_) {
        if (!(_object_ instanceof WindDynamicsLookupTable)) {
            throw new IllegalArgumentException("Object is not WindDynamicsLookupTable");
        }
        if (!WindDynamicsLookupTable.contains(_object_)) {
            WindDynamicsLookupTable.add((WindDynamicsLookupTable) _object_);
            ((WindDynamicsLookupTable) _object_).setWindContRotorRIEC(this);
        }
    }

    public String WindDynamicsLookupTableToString() {
        return getStringFromSet(WindDynamicsLookupTable);
    }

    /**
     * Wind turbine type 2 model with whitch this wind control rotor resistance model is associated.
     *
     * NOT USED
     */
    private WindGenTurbineType2IEC WindGenTurbineType2IEC; // OneToOne

    public WindGenTurbineType2IEC getWindGenTurbineType2IEC() {
        return WindGenTurbineType2IEC;
    }

    public void setWindGenTurbineType2IEC(BaseClass _object_) {
        if (!(_object_ instanceof WindGenTurbineType2IEC)) {
            throw new IllegalArgumentException("Object is not WindGenTurbineType2IEC");
        }
        if (WindGenTurbineType2IEC != _object_) {
            WindGenTurbineType2IEC = (WindGenTurbineType2IEC) _object_;
            WindGenTurbineType2IEC.setWindContRotorRIEC(this);
        }
    }

    public String WindGenTurbineType2IECToString() {
        return WindGenTurbineType2IEC != null ? WindGenTurbineType2IEC.getRdfid() : null;
    }

    /**
     * Integral gain in rotor resistance PI controller (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;Irr&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double kirr; // PU

    public Double getKirr() {
        return kirr;
    }

    public void setKirr(Double _value_) {
        kirr = _value_;
    }

    public void setKirr(String _value_) {
        kirr = getDoubleFromString(_value_);
    }

    public String kirrToString() {
        return kirr != null ? kirr.toString() : null;
    }

    /**
     * Filter gain for generator speed measurement (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;omegafilt&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Float komegafilt; // Float

    public Float getKomegafilt() {
        return komegafilt;
    }

    public void setKomegafilt(Float _value_) {
        komegafilt = _value_;
    }

    public void setKomegafilt(String _value_) {
        komegafilt = getFloatFromString(_value_);
    }

    public String komegafiltToString() {
        return komegafilt != null ? komegafilt.toString() : null;
    }

    /**
     * Filter gain for power measurement (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;pfilt&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Float kpfilt; // Float

    public Float getKpfilt() {
        return kpfilt;
    }

    public void setKpfilt(Float _value_) {
        kpfilt = _value_;
    }

    public void setKpfilt(String _value_) {
        kpfilt = getFloatFromString(_value_);
    }

    public String kpfiltToString() {
        return kpfilt != null ? kpfilt.toString() : null;
    }

    /**
     * Proportional gain in rotor resistance PI controller (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;Prr&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double kprr; // PU

    public Double getKprr() {
        return kprr;
    }

    public void setKprr(Double _value_) {
        kprr = _value_;
    }

    public void setKprr(String _value_) {
        kprr = getDoubleFromString(_value_);
    }

    public String kprrToString() {
        return kprr != null ? kprr.toString() : null;
    }

    /**
     * Maximum rotor resistance (&lt;i&gt;r&lt;/i&gt;&lt;i&gt;&lt;sub&gt;max&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; WindContRotorRIEC.rmin). It is a type-dependent parameter.
     */
    private Double rmax; // PU

    public Double getRmax() {
        return rmax;
    }

    public void setRmax(Double _value_) {
        rmax = _value_;
    }

    public void setRmax(String _value_) {
        rmax = getDoubleFromString(_value_);
    }

    public String rmaxToString() {
        return rmax != null ? rmax.toString() : null;
    }

    /**
     * Minimum rotor resistance (&lt;i&gt;r&lt;/i&gt;&lt;i&gt;&lt;sub&gt;min&lt;/sub&gt;&lt;/i&gt;) (&amp;lt; WindContRotorRIEC.rmax). It is a type-dependent parameter.
     */
    private Double rmin; // PU

    public Double getRmin() {
        return rmin;
    }

    public void setRmin(Double _value_) {
        rmin = _value_;
    }

    public void setRmin(String _value_) {
        rmin = getDoubleFromString(_value_);
    }

    public String rminToString() {
        return rmin != null ? rmin.toString() : null;
    }

    /**
     * Filter time constant for generator speed measurement (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;omegafiltrr&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a type-dependent parameter.
     */
    private Double tomegafiltrr; // Seconds

    public Double getTomegafiltrr() {
        return tomegafiltrr;
    }

    public void setTomegafiltrr(Double _value_) {
        tomegafiltrr = _value_;
    }

    public void setTomegafiltrr(String _value_) {
        tomegafiltrr = getDoubleFromString(_value_);
    }

    public String tomegafiltrrToString() {
        return tomegafiltrr != null ? tomegafiltrr.toString() : null;
    }

    /**
     * Filter time constant for power measurement (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;pfiltrr&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a type-dependent parameter.
     */
    private Double tpfiltrr; // Seconds

    public Double getTpfiltrr() {
        return tpfiltrr;
    }

    public void setTpfiltrr(Double _value_) {
        tpfiltrr = _value_;
    }

    public void setTpfiltrr(String _value_) {
        tpfiltrr = getDoubleFromString(_value_);
    }

    public String tpfiltrrToString() {
        return tpfiltrr != null ? tpfiltrr.toString() : null;
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
        return getAttribute("WindContRotorRIEC", attrName);
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
        setAttribute("WindContRotorRIEC", attrName, objectValue);
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
        setAttribute("WindContRotorRIEC", attrName, stringValue);
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

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/CIM100#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindDynamicsLookupTable", new AttrDetails("WindContRotorRIEC.WindDynamicsLookupTable", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindGenTurbineType2IEC", new AttrDetails("WindContRotorRIEC.WindGenTurbineType2IEC", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kirr", new AttrDetails("WindContRotorRIEC.kirr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("komegafilt", new AttrDetails("WindContRotorRIEC.komegafilt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpfilt", new AttrDetails("WindContRotorRIEC.kpfilt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kprr", new AttrDetails("WindContRotorRIEC.kprr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rmax", new AttrDetails("WindContRotorRIEC.rmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rmin", new AttrDetails("WindContRotorRIEC.rmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tomegafiltrr", new AttrDetails("WindContRotorRIEC.tomegafiltrr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpfiltrr", new AttrDetails("WindContRotorRIEC.tpfiltrr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindContRotorRIEC().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("WindDynamicsLookupTable", new GetterSetter(this::WindDynamicsLookupTableToString, this::setWindDynamicsLookupTable, null));
        map.put("WindGenTurbineType2IEC", new GetterSetter(this::WindGenTurbineType2IECToString, this::setWindGenTurbineType2IEC, null));
        map.put("kirr", new GetterSetter(this::kirrToString, null, this::setKirr));
        map.put("komegafilt", new GetterSetter(this::komegafiltToString, null, this::setKomegafilt));
        map.put("kpfilt", new GetterSetter(this::kpfiltToString, null, this::setKpfilt));
        map.put("kprr", new GetterSetter(this::kprrToString, null, this::setKprr));
        map.put("rmax", new GetterSetter(this::rmaxToString, null, this::setRmax));
        map.put("rmin", new GetterSetter(this::rminToString, null, this::setRmin));
        map.put("tomegafiltrr", new GetterSetter(this::tomegafiltrrToString, null, this::setTomegafiltrr));
        map.put("tpfiltrr", new GetterSetter(this::tpfiltrrToString, null, this::setTpfiltrr));
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
