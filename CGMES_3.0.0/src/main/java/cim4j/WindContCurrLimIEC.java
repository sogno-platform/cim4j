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
 * Current limitation model.  The current limitation model combines the physical limits and the control limits. Reference: IEC 61400-27-1:2015, 5.6.5.8.
 */
@SuppressWarnings("unused")
public class WindContCurrLimIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindContCurrLimIEC.class);

    /**
     * Default constructor.
     */
    public WindContCurrLimIEC() {
        setCimType("WindContCurrLimIEC");
    }

    /**
     * The wind dynamics lookup table associated with this current control limitation model.
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
            ((WindDynamicsLookupTable) _object_).setWindContCurrLimIEC(this);
        }
    }

    public String WindDynamicsLookupTableToString() {
        return getStringFromSet(WindDynamicsLookupTable);
    }

    /**
     * Wind turbine type 3 or type 4 model with which this wind control current limitation model is associated.
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
            WindTurbineType3or4IEC.setWindContCurrLimIEC(this);
        }
    }

    public String WindTurbineType3or4IECToString() {
        return WindTurbineType3or4IEC != null ? WindTurbineType3or4IEC.getRdfid() : null;
    }

    /**
     * Maximum continuous current at the wind turbine terminals (&lt;i&gt;i&lt;/i&gt;&lt;i&gt;&lt;sub&gt;max&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double imax; // PU

    public Double getImax() {
        return imax;
    }

    public void setImax(Double _value_) {
        imax = _value_;
    }

    public void setImax(String _value_) {
        imax = getDoubleFromString(_value_);
    }

    public String imaxToString() {
        return imax != null ? imax.toString() : null;
    }

    /**
     * Maximum current during voltage dip at the wind turbine terminals (&lt;i&gt;i&lt;/i&gt;&lt;i&gt;&lt;sub&gt;maxdip&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter.
     */
    private Double imaxdip; // PU

    public Double getImaxdip() {
        return imaxdip;
    }

    public void setImaxdip(Double _value_) {
        imaxdip = _value_;
    }

    public void setImaxdip(String _value_) {
        imaxdip = getDoubleFromString(_value_);
    }

    public String imaxdipToString() {
        return imaxdip != null ? imaxdip.toString() : null;
    }

    /**
     * Partial derivative of reactive current limit (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;pqu&lt;/sub&gt;&lt;/i&gt;) versus voltage. It is a type-dependent parameter.
     */
    private Double kpqu; // PU

    public Double getKpqu() {
        return kpqu;
    }

    public void setKpqu(Double _value_) {
        kpqu = _value_;
    }

    public void setKpqu(String _value_) {
        kpqu = getDoubleFromString(_value_);
    }

    public String kpquToString() {
        return kpqu != null ? kpqu.toString() : null;
    }

    /**
     * Limitation of type 3 stator current (&lt;i&gt;M&lt;/i&gt;&lt;i&gt;&lt;sub&gt;DFSLim&lt;/sub&gt;&lt;/i&gt;). &lt;i&gt;M&lt;/i&gt;&lt;i&gt;&lt;sub&gt;DFSLim&lt;/sub&gt;&lt;/i&gt;&lt;sub&gt; &lt;/sub&gt;= 1 for wind turbines type 4. It is a type-dependent parameter. false= total current limitation (0 in the IEC model) true=stator current limitation (1 in the IEC model).
     */
    private Boolean mdfslim; // Boolean

    public Boolean getMdfslim() {
        return mdfslim;
    }

    public void setMdfslim(Boolean _value_) {
        mdfslim = _value_;
    }

    public void setMdfslim(String _value_) {
        mdfslim = getBooleanFromString(_value_);
    }

    public String mdfslimToString() {
        return mdfslim != null ? mdfslim.toString() : null;
    }

    /**
     * Prioritisation of Q control during UVRT (&lt;i&gt;M&lt;/i&gt;&lt;i&gt;&lt;sub&gt;qpri&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter. true = reactive power priority (1 in the IEC model) false = active power priority (0 in the IEC model).
     */
    private Boolean mqpri; // Boolean

    public Boolean getMqpri() {
        return mqpri;
    }

    public void setMqpri(Boolean _value_) {
        mqpri = _value_;
    }

    public void setMqpri(String _value_) {
        mqpri = getBooleanFromString(_value_);
    }

    public String mqpriToString() {
        return mqpri != null ? mqpri.toString() : null;
    }

    /**
     * Voltage measurement filter time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;ufiltcl&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a type-dependent parameter.
     */
    private Double tufiltcl; // Seconds

    public Double getTufiltcl() {
        return tufiltcl;
    }

    public void setTufiltcl(Double _value_) {
        tufiltcl = _value_;
    }

    public void setTufiltcl(String _value_) {
        tufiltcl = getDoubleFromString(_value_);
    }

    public String tufiltclToString() {
        return tufiltcl != null ? tufiltcl.toString() : null;
    }

    /**
     * Wind turbine voltage in the operation point where zero reactive current can be delivered (&lt;i&gt;u&lt;/i&gt;&lt;i&gt;&lt;sub&gt;pqumax&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double upqumax; // PU

    public Double getUpqumax() {
        return upqumax;
    }

    public void setUpqumax(Double _value_) {
        upqumax = _value_;
    }

    public void setUpqumax(String _value_) {
        upqumax = getDoubleFromString(_value_);
    }

    public String upqumaxToString() {
        return upqumax != null ? upqumax.toString() : null;
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
        return getAttribute("WindContCurrLimIEC", attrName);
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
        setAttribute("WindContCurrLimIEC", attrName, objectValue);
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
        setAttribute("WindContCurrLimIEC", attrName, stringValue);
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
            map.put("WindDynamicsLookupTable", new AttrDetails("WindContCurrLimIEC.WindDynamicsLookupTable", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindTurbineType3or4IEC", new AttrDetails("WindContCurrLimIEC.WindTurbineType3or4IEC", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("imax", new AttrDetails("WindContCurrLimIEC.imax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("imaxdip", new AttrDetails("WindContCurrLimIEC.imaxdip", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpqu", new AttrDetails("WindContCurrLimIEC.kpqu", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mdfslim", new AttrDetails("WindContCurrLimIEC.mdfslim", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mqpri", new AttrDetails("WindContCurrLimIEC.mqpri", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tufiltcl", new AttrDetails("WindContCurrLimIEC.tufiltcl", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("upqumax", new AttrDetails("WindContCurrLimIEC.upqumax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindContCurrLimIEC().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("WindDynamicsLookupTable", new GetterSetter(this::WindDynamicsLookupTableToString, this::setWindDynamicsLookupTable, null));
        map.put("WindTurbineType3or4IEC", new GetterSetter(this::WindTurbineType3or4IECToString, this::setWindTurbineType3or4IEC, null));
        map.put("imax", new GetterSetter(this::imaxToString, null, this::setImax));
        map.put("imaxdip", new GetterSetter(this::imaxdipToString, null, this::setImaxdip));
        map.put("kpqu", new GetterSetter(this::kpquToString, null, this::setKpqu));
        map.put("mdfslim", new GetterSetter(this::mdfslimToString, null, this::setMdfslim));
        map.put("mqpri", new GetterSetter(this::mqpriToString, null, this::setMqpri));
        map.put("tufiltcl", new GetterSetter(this::tufiltclToString, null, this::setTufiltcl));
        map.put("upqumax", new GetterSetter(this::upqumaxToString, null, this::setUpqumax));
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
