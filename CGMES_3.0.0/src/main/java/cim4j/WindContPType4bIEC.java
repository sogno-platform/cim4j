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
 * P control model type 4B. Reference: IEC 61400-27-1:2015, 5.6.5.6.
 */
@SuppressWarnings("unused")
public class WindContPType4bIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindContPType4bIEC.class);

    /**
     * Default constructor.
     */
    public WindContPType4bIEC() {
        setCimType("WindContPType4bIEC");
    }

    /**
     * Wind turbine type 4B model with which this wind control P type 4B model is associated.
     *
     * NOT USED
     */
    private WindTurbineType4bIEC WindTurbineType4bIEC; // OneToOne

    public WindTurbineType4bIEC getWindTurbineType4bIEC() {
        return WindTurbineType4bIEC;
    }

    public void setWindTurbineType4bIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindTurbineType4bIEC)) {
            throw new IllegalArgumentException("Object is not WindTurbineType4bIEC");
        }
        if (WindTurbineType4bIEC != _object_) {
            WindTurbineType4bIEC = (WindTurbineType4bIEC) _object_;
            WindTurbineType4bIEC.setWindContPType4bIEC(this);
        }
    }

    public String WindTurbineType4bIECToString() {
        return WindTurbineType4bIEC != null ? WindTurbineType4bIEC.getRdfid() : null;
    }

    /**
     * Maximum wind turbine power ramp rate (&lt;i&gt;dp&lt;/i&gt;&lt;i&gt;&lt;sub&gt;maxp4B&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter.
     */
    private Double dpmaxp4b; // PU

    public Double getDpmaxp4b() {
        return dpmaxp4b;
    }

    public void setDpmaxp4b(Double _value_) {
        dpmaxp4b = _value_;
    }

    public void setDpmaxp4b(String _value_) {
        dpmaxp4b = getDoubleFromString(_value_);
    }

    public String dpmaxp4bToString() {
        return dpmaxp4b != null ? dpmaxp4b.toString() : null;
    }

    /**
     * Time constant in aerodynamic power response (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;paero&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a type-dependent parameter.
     */
    private Double tpaero; // Seconds

    public Double getTpaero() {
        return tpaero;
    }

    public void setTpaero(Double _value_) {
        tpaero = _value_;
    }

    public void setTpaero(String _value_) {
        tpaero = getDoubleFromString(_value_);
    }

    public String tpaeroToString() {
        return tpaero != null ? tpaero.toString() : null;
    }

    /**
     * Time constant in power order lag (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;pordp4B&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a type-dependent parameter.
     */
    private Double tpordp4b; // Seconds

    public Double getTpordp4b() {
        return tpordp4b;
    }

    public void setTpordp4b(Double _value_) {
        tpordp4b = _value_;
    }

    public void setTpordp4b(String _value_) {
        tpordp4b = getDoubleFromString(_value_);
    }

    public String tpordp4bToString() {
        return tpordp4b != null ? tpordp4b.toString() : null;
    }

    /**
     * Voltage measurement filter time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;ufiltp4B&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a type-dependent parameter.
     */
    private Double tufiltp4b; // Seconds

    public Double getTufiltp4b() {
        return tufiltp4b;
    }

    public void setTufiltp4b(Double _value_) {
        tufiltp4b = _value_;
    }

    public void setTufiltp4b(String _value_) {
        tufiltp4b = getDoubleFromString(_value_);
    }

    public String tufiltp4bToString() {
        return tufiltp4b != null ? tufiltp4b.toString() : null;
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
        return getAttribute("WindContPType4bIEC", attrName);
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
        setAttribute("WindContPType4bIEC", attrName, objectValue);
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
        setAttribute("WindContPType4bIEC", attrName, stringValue);
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
            map.put("WindTurbineType4bIEC", new AttrDetails("WindContPType4bIEC.WindTurbineType4bIEC", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dpmaxp4b", new AttrDetails("WindContPType4bIEC.dpmaxp4b", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpaero", new AttrDetails("WindContPType4bIEC.tpaero", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpordp4b", new AttrDetails("WindContPType4bIEC.tpordp4b", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tufiltp4b", new AttrDetails("WindContPType4bIEC.tufiltp4b", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindContPType4bIEC().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("WindTurbineType4bIEC", new GetterSetter(this::WindTurbineType4bIECToString, this::setWindTurbineType4bIEC, null));
        map.put("dpmaxp4b", new GetterSetter(this::dpmaxp4bToString, null, this::setDpmaxp4b));
        map.put("tpaero", new GetterSetter(this::tpaeroToString, null, this::setTpaero));
        map.put("tpordp4b", new GetterSetter(this::tpordp4bToString, null, this::setTpordp4b));
        map.put("tufiltp4b", new GetterSetter(this::tufiltp4bToString, null, this::setTufiltp4b));
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
