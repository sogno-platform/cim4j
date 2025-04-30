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
 * Two-dimensional aerodynamic model.   Reference: IEC 61400-27-1:2015, 5.6.1.3.
 */
@SuppressWarnings("unused")
public class WindAeroTwoDimIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindAeroTwoDimIEC.class);

    /**
     * Default constructor.
     */
    public WindAeroTwoDimIEC() {
        setCimType("WindAeroTwoDimIEC");
    }

    /**
     * Wind turbine type 3 model with which this wind aerodynamic model is associated.
     *
     * NOT USED
     */
    private WindTurbineType3IEC WindTurbineType3IEC; // OneToOne

    public WindTurbineType3IEC getWindTurbineType3IEC() {
        return WindTurbineType3IEC;
    }

    public void setWindTurbineType3IEC(BaseClass _object_) {
        if (!(_object_ instanceof WindTurbineType3IEC)) {
            throw new IllegalArgumentException("Object is not WindTurbineType3IEC");
        }
        if (WindTurbineType3IEC != _object_) {
            WindTurbineType3IEC = (WindTurbineType3IEC) _object_;
            WindTurbineType3IEC.setWindAeroTwoDimIEC(this);
        }
    }

    public String WindTurbineType3IECToString() {
        return WindTurbineType3IEC != null ? WindTurbineType3IEC.getRdfid() : null;
    }

    /**
     * Partial derivative of aerodynamic power with respect to changes in WTR speed (&lt;i&gt;dp&lt;/i&gt;&lt;i&gt;&lt;sub&gt;omega&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double dpomega; // PU

    public Double getDpomega() {
        return dpomega;
    }

    public void setDpomega(Double _value_) {
        dpomega = _value_;
    }

    public void setDpomega(String _value_) {
        dpomega = getDoubleFromString(_value_);
    }

    public String dpomegaToString() {
        return dpomega != null ? dpomega.toString() : null;
    }

    /**
     * Partial derivative of aerodynamic power with respect to changes in pitch angle (&lt;i&gt;dp&lt;/i&gt;&lt;i&gt;&lt;sub&gt;theta&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double dptheta; // PU

    public Double getDptheta() {
        return dptheta;
    }

    public void setDptheta(Double _value_) {
        dptheta = _value_;
    }

    public void setDptheta(String _value_) {
        dptheta = getDoubleFromString(_value_);
    }

    public String dpthetaToString() {
        return dptheta != null ? dptheta.toString() : null;
    }

    /**
     * Partial derivative (&lt;i&gt;dp&lt;/i&gt;&lt;i&gt;&lt;sub&gt;v1&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double dpv1; // PU

    public Double getDpv1() {
        return dpv1;
    }

    public void setDpv1(Double _value_) {
        dpv1 = _value_;
    }

    public void setDpv1(String _value_) {
        dpv1 = getDoubleFromString(_value_);
    }

    public String dpv1ToString() {
        return dpv1 != null ? dpv1.toString() : null;
    }

    /**
     * Rotor speed if the wind turbine is not derated (&lt;i&gt;omega&lt;/i&gt;&lt;i&gt;&lt;sub&gt;0&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double omegazero; // PU

    public Double getOmegazero() {
        return omegazero;
    }

    public void setOmegazero(Double _value_) {
        omegazero = _value_;
    }

    public void setOmegazero(String _value_) {
        omegazero = getDoubleFromString(_value_);
    }

    public String omegazeroToString() {
        return omegazero != null ? omegazero.toString() : null;
    }

    /**
     * Available aerodynamic power (&lt;i&gt;p&lt;/i&gt;&lt;i&gt;&lt;sub&gt;avail&lt;/sub&gt;&lt;/i&gt;&lt;i&gt;)&lt;/i&gt;. It is a case-dependent parameter.
     */
    private Double pavail; // PU

    public Double getPavail() {
        return pavail;
    }

    public void setPavail(Double _value_) {
        pavail = _value_;
    }

    public void setPavail(String _value_) {
        pavail = getDoubleFromString(_value_);
    }

    public String pavailToString() {
        return pavail != null ? pavail.toString() : null;
    }

    /**
     * Blade angle at twice rated wind speed (&lt;i&gt;theta&lt;/i&gt;&lt;i&gt;&lt;sub&gt;v2&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double thetav2; // AngleDegrees

    public Double getThetav2() {
        return thetav2;
    }

    public void setThetav2(Double _value_) {
        thetav2 = _value_;
    }

    public void setThetav2(String _value_) {
        thetav2 = getDoubleFromString(_value_);
    }

    public String thetav2ToString() {
        return thetav2 != null ? thetav2.toString() : null;
    }

    /**
     * Pitch angle if the wind turbine is not derated (&lt;i&gt;theta&lt;/i&gt;&lt;i&gt;&lt;sub&gt;0&lt;/sub&gt;&lt;/i&gt;). It is a case-dependent parameter.
     */
    private Double thetazero; // AngleDegrees

    public Double getThetazero() {
        return thetazero;
    }

    public void setThetazero(Double _value_) {
        thetazero = _value_;
    }

    public void setThetazero(String _value_) {
        thetazero = getDoubleFromString(_value_);
    }

    public String thetazeroToString() {
        return thetazero != null ? thetazero.toString() : null;
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
        return getAttribute("WindAeroTwoDimIEC", attrName);
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
        setAttribute("WindAeroTwoDimIEC", attrName, objectValue);
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
        setAttribute("WindAeroTwoDimIEC", attrName, stringValue);
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
            map.put("WindTurbineType3IEC", new AttrDetails("WindAeroTwoDimIEC.WindTurbineType3IEC", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dpomega", new AttrDetails("WindAeroTwoDimIEC.dpomega", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dptheta", new AttrDetails("WindAeroTwoDimIEC.dptheta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dpv1", new AttrDetails("WindAeroTwoDimIEC.dpv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omegazero", new AttrDetails("WindAeroTwoDimIEC.omegazero", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pavail", new AttrDetails("WindAeroTwoDimIEC.pavail", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("thetav2", new AttrDetails("WindAeroTwoDimIEC.thetav2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("thetazero", new AttrDetails("WindAeroTwoDimIEC.thetazero", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindAeroTwoDimIEC().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("WindTurbineType3IEC", new GetterSetter(this::WindTurbineType3IECToString, this::setWindTurbineType3IEC, null));
        map.put("dpomega", new GetterSetter(this::dpomegaToString, null, this::setDpomega));
        map.put("dptheta", new GetterSetter(this::dpthetaToString, null, this::setDptheta));
        map.put("dpv1", new GetterSetter(this::dpv1ToString, null, this::setDpv1));
        map.put("omegazero", new GetterSetter(this::omegazeroToString, null, this::setOmegazero));
        map.put("pavail", new GetterSetter(this::pavailToString, null, this::setPavail));
        map.put("thetav2", new GetterSetter(this::thetav2ToString, null, this::setThetav2));
        map.put("thetazero", new GetterSetter(this::thetazeroToString, null, this::setThetazero));
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
