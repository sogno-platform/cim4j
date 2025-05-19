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
 * The grid protection model includes protection against over- and under-voltage, and against over- and under-frequency. Reference: IEC 61400-27-1:2015, 5.6.6.
 */
@SuppressWarnings("unused")
public class WindProtectionIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindProtectionIEC.class);

    /**
     * Default constructor.
     */
    public WindProtectionIEC() {
        setCimType("WindProtectionIEC");
    }

    /**
     * The wind dynamics lookup table associated with this grid protection model.
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
            ((WindDynamicsLookupTable) _object_).setWindProtectionIEC(this);
        }
    }

    public String WindDynamicsLookupTableToString() {
        return getStringFromSet(WindDynamicsLookupTable);
    }

    /**
     * Wind generator type 1 or type 2 model with which this wind turbine protection model is associated.
     *
     * NOT USED
     */
    private WindTurbineType1or2IEC WindTurbineType1or2IEC; // OneToOne

    public WindTurbineType1or2IEC getWindTurbineType1or2IEC() {
        return WindTurbineType1or2IEC;
    }

    public void setWindTurbineType1or2IEC(BaseClass _object_) {
        if (!(_object_ instanceof WindTurbineType1or2IEC)) {
            throw new IllegalArgumentException("Object is not WindTurbineType1or2IEC");
        }
        if (WindTurbineType1or2IEC != _object_) {
            WindTurbineType1or2IEC = (WindTurbineType1or2IEC) _object_;
            WindTurbineType1or2IEC.setWindProtectionIEC(this);
        }
    }

    public String WindTurbineType1or2IECToString() {
        return WindTurbineType1or2IEC != null ? WindTurbineType1or2IEC.getRdfid() : null;
    }

    /**
     * Wind generator type 3 or type 4 model with which this wind turbine protection model is associated.
     *
     * NOT USED
     */
    private WindTurbineType3or4IEC WindTurbineType3or4IEC; // OneToOne

    public WindTurbineType3or4IEC getWindTurbineType3or4IEC() {
        return WindTurbineType3or4IEC;
    }

    public void setWindTurbineType3or4IEC(BaseClass _object_) {
        if (!(_object_ instanceof WindTurbineType3or4IEC)) {
            throw new IllegalArgumentException("Object is not WindTurbineType3or4IEC");
        }
        if (WindTurbineType3or4IEC != _object_) {
            WindTurbineType3or4IEC = (WindTurbineType3or4IEC) _object_;
            WindTurbineType3or4IEC.setWindProtectionIEC(this);
        }
    }

    public String WindTurbineType3or4IECToString() {
        return WindTurbineType3or4IEC != null ? WindTurbineType3or4IEC.getRdfid() : null;
    }

    /**
     * Maximum rate of change of frequency (&lt;i&gt;dF&lt;/i&gt;&lt;i&gt;&lt;sub&gt;max&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double dfimax; // PU

    public Double getDfimax() {
        return dfimax;
    }

    public void setDfimax(Double _value_) {
        dfimax = _value_;
    }

    public void setDfimax(String _value_) {
        dfimax = getDoubleFromString(_value_);
    }

    public String dfimaxToString() {
        return dfimax != null ? dfimax.toString() : null;
    }

    /**
     * Wind turbine over frequency protection activation threshold (&lt;i&gt;f&lt;/i&gt;&lt;i&gt;&lt;sub&gt;over&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter.
     */
    private Double fover; // PU

    public Double getFover() {
        return fover;
    }

    public void setFover(Double _value_) {
        fover = _value_;
    }

    public void setFover(String _value_) {
        fover = getDoubleFromString(_value_);
    }

    public String foverToString() {
        return fover != null ? fover.toString() : null;
    }

    /**
     * Wind turbine under frequency protection activation threshold (&lt;i&gt;f&lt;/i&gt;&lt;i&gt;&lt;sub&gt;under&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter.
     */
    private Double funder; // PU

    public Double getFunder() {
        return funder;
    }

    public void setFunder(Double _value_) {
        funder = _value_;
    }

    public void setFunder(String _value_) {
        funder = getDoubleFromString(_value_);
    }

    public String funderToString() {
        return funder != null ? funder.toString() : null;
    }

    /**
     * Zero crossing measurement mode (&lt;i&gt;Mzc&lt;/i&gt;).  It is a type-dependent parameter.  true = WT protection system uses zero crossings to detect frequency (1 in the IEC model) false = WT protection system does not use zero crossings to detect frequency (0 in the IEC model).
     */
    private Boolean mzc; // Boolean

    public Boolean getMzc() {
        return mzc;
    }

    public void setMzc(Boolean _value_) {
        mzc = _value_;
    }

    public void setMzc(String _value_) {
        mzc = getBooleanFromString(_value_);
    }

    public String mzcToString() {
        return mzc != null ? mzc.toString() : null;
    }

    /**
     * Time interval of moving average window (&lt;i&gt;TfMA&lt;/i&gt;) (&amp;gt;= 0).  It is a type-dependent parameter.
     */
    private Double tfma; // Seconds

    public Double getTfma() {
        return tfma;
    }

    public void setTfma(Double _value_) {
        tfma = _value_;
    }

    public void setTfma(String _value_) {
        tfma = getDoubleFromString(_value_);
    }

    public String tfmaToString() {
        return tfma != null ? tfma.toString() : null;
    }

    /**
     * Wind turbine over voltage protection activation threshold (&lt;i&gt;u&lt;/i&gt;&lt;i&gt;&lt;sub&gt;over&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter.
     */
    private Double uover; // PU

    public Double getUover() {
        return uover;
    }

    public void setUover(Double _value_) {
        uover = _value_;
    }

    public void setUover(String _value_) {
        uover = getDoubleFromString(_value_);
    }

    public String uoverToString() {
        return uover != null ? uover.toString() : null;
    }

    /**
     * Wind turbine under voltage protection activation threshold (&lt;i&gt;u&lt;/i&gt;&lt;i&gt;&lt;sub&gt;under&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter.
     */
    private Double uunder; // PU

    public Double getUunder() {
        return uunder;
    }

    public void setUunder(Double _value_) {
        uunder = _value_;
    }

    public void setUunder(String _value_) {
        uunder = getDoubleFromString(_value_);
    }

    public String uunderToString() {
        return uunder != null ? uunder.toString() : null;
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
        return getAttribute("WindProtectionIEC", attrName);
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
        setAttribute("WindProtectionIEC", attrName, objectValue);
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
        setAttribute("WindProtectionIEC", attrName, stringValue);
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
            map.put("WindDynamicsLookupTable", new AttrDetails("WindProtectionIEC.WindDynamicsLookupTable", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindTurbineType1or2IEC", new AttrDetails("WindProtectionIEC.WindTurbineType1or2IEC", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindTurbineType3or4IEC", new AttrDetails("WindProtectionIEC.WindTurbineType3or4IEC", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dfimax", new AttrDetails("WindProtectionIEC.dfimax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fover", new AttrDetails("WindProtectionIEC.fover", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("funder", new AttrDetails("WindProtectionIEC.funder", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mzc", new AttrDetails("WindProtectionIEC.mzc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tfma", new AttrDetails("WindProtectionIEC.tfma", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uover", new AttrDetails("WindProtectionIEC.uover", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uunder", new AttrDetails("WindProtectionIEC.uunder", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindProtectionIEC().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("WindDynamicsLookupTable", new GetterSetter(this::WindDynamicsLookupTableToString, this::setWindDynamicsLookupTable, null));
        map.put("WindTurbineType1or2IEC", new GetterSetter(this::WindTurbineType1or2IECToString, this::setWindTurbineType1or2IEC, null));
        map.put("WindTurbineType3or4IEC", new GetterSetter(this::WindTurbineType3or4IECToString, this::setWindTurbineType3or4IEC, null));
        map.put("dfimax", new GetterSetter(this::dfimaxToString, null, this::setDfimax));
        map.put("fover", new GetterSetter(this::foverToString, null, this::setFover));
        map.put("funder", new GetterSetter(this::funderToString, null, this::setFunder));
        map.put("mzc", new GetterSetter(this::mzcToString, null, this::setMzc));
        map.put("tfma", new GetterSetter(this::tfmaToString, null, this::setTfma));
        map.put("uover", new GetterSetter(this::uoverToString, null, this::setUover));
        map.put("uunder", new GetterSetter(this::uunderToString, null, this::setUunder));
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
