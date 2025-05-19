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
 * Pitch angle control model. Reference: IEC 61400-27-1:2015, 5.6.5.2.
 */
@SuppressWarnings("unused")
public class WindContPitchAngleIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindContPitchAngleIEC.class);

    /**
     * Default constructor.
     */
    public WindContPitchAngleIEC() {
        setCimType("WindContPitchAngleIEC");
    }

    /**
     * Wind turbine type 3 model with which this pitch control model is associated.
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
            WindTurbineType3IEC.setWindContPitchAngleIEC(this);
        }
    }

    public String WindTurbineType3IECToString() {
        return WindTurbineType3IEC != null ? WindTurbineType3IEC.getRdfid() : null;
    }

    /**
     * Maximum pitch positive ramp rate (&lt;i&gt;dtheta&lt;/i&gt;&lt;i&gt;&lt;sub&gt;max&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; WindContPitchAngleIEC.dthetamin). It is a type-dependent parameter. Unit = degrees / s.
     */
    private Float dthetamax; // Float

    public Float getDthetamax() {
        return dthetamax;
    }

    public void setDthetamax(Float _value_) {
        dthetamax = _value_;
    }

    public void setDthetamax(String _value_) {
        dthetamax = getFloatFromString(_value_);
    }

    public String dthetamaxToString() {
        return dthetamax != null ? dthetamax.toString() : null;
    }

    /**
     * Maximum pitch negative ramp rate (&lt;i&gt;dtheta&lt;/i&gt;&lt;i&gt;&lt;sub&gt;min&lt;/sub&gt;&lt;/i&gt;&lt;i&gt;)&lt;/i&gt; (&amp;lt; WindContPitchAngleIEC.dthetamax). It is a type-dependent parameter. Unit = degrees / s.
     */
    private Float dthetamin; // Float

    public Float getDthetamin() {
        return dthetamin;
    }

    public void setDthetamin(Float _value_) {
        dthetamin = _value_;
    }

    public void setDthetamin(String _value_) {
        dthetamin = getFloatFromString(_value_);
    }

    public String dthetaminToString() {
        return dthetamin != null ? dthetamin.toString() : null;
    }

    /**
     * Power PI controller integration gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;Ic&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double kic; // PU

    public Double getKic() {
        return kic;
    }

    public void setKic(Double _value_) {
        kic = _value_;
    }

    public void setKic(String _value_) {
        kic = getDoubleFromString(_value_);
    }

    public String kicToString() {
        return kic != null ? kic.toString() : null;
    }

    /**
     * Speed PI controller integration gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;Iomega&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double kiomega; // PU

    public Double getKiomega() {
        return kiomega;
    }

    public void setKiomega(Double _value_) {
        kiomega = _value_;
    }

    public void setKiomega(String _value_) {
        kiomega = getDoubleFromString(_value_);
    }

    public String kiomegaToString() {
        return kiomega != null ? kiomega.toString() : null;
    }

    /**
     * Power PI controller proportional gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;Pc&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double kpc; // PU

    public Double getKpc() {
        return kpc;
    }

    public void setKpc(Double _value_) {
        kpc = _value_;
    }

    public void setKpc(String _value_) {
        kpc = getDoubleFromString(_value_);
    }

    public String kpcToString() {
        return kpc != null ? kpc.toString() : null;
    }

    /**
     * Speed PI controller proportional gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;Pomega&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double kpomega; // PU

    public Double getKpomega() {
        return kpomega;
    }

    public void setKpomega(Double _value_) {
        kpomega = _value_;
    }

    public void setKpomega(String _value_) {
        kpomega = getDoubleFromString(_value_);
    }

    public String kpomegaToString() {
        return kpomega != null ? kpomega.toString() : null;
    }

    /**
     * Pitch cross coupling gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;PX&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double kpx; // PU

    public Double getKpx() {
        return kpx;
    }

    public void setKpx(Double _value_) {
        kpx = _value_;
    }

    public void setKpx(String _value_) {
        kpx = getDoubleFromString(_value_);
    }

    public String kpxToString() {
        return kpx != null ? kpx.toString() : null;
    }

    /**
     * Maximum pitch angle (&lt;i&gt;theta&lt;/i&gt;&lt;i&gt;&lt;sub&gt;max&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; WindContPitchAngleIEC.thetamin). It is a type-dependent parameter.
     */
    private Double thetamax; // AngleDegrees

    public Double getThetamax() {
        return thetamax;
    }

    public void setThetamax(Double _value_) {
        thetamax = _value_;
    }

    public void setThetamax(String _value_) {
        thetamax = getDoubleFromString(_value_);
    }

    public String thetamaxToString() {
        return thetamax != null ? thetamax.toString() : null;
    }

    /**
     * Minimum pitch angle (&lt;i&gt;theta&lt;/i&gt;&lt;i&gt;&lt;sub&gt;min&lt;/sub&gt;&lt;/i&gt;) (&amp;lt; WindContPitchAngleIEC.thetamax). It is a type-dependent parameter.
     */
    private Double thetamin; // AngleDegrees

    public Double getThetamin() {
        return thetamin;
    }

    public void setThetamin(Double _value_) {
        thetamin = _value_;
    }

    public void setThetamin(String _value_) {
        thetamin = getDoubleFromString(_value_);
    }

    public String thetaminToString() {
        return thetamin != null ? thetamin.toString() : null;
    }

    /**
     * Pitch time constant (&lt;i&gt;ttheta&lt;/i&gt;) (&amp;gt;= 0). It is a type-dependent parameter.
     */
    private Double ttheta; // Seconds

    public Double getTtheta() {
        return ttheta;
    }

    public void setTtheta(Double _value_) {
        ttheta = _value_;
    }

    public void setTtheta(String _value_) {
        ttheta = getDoubleFromString(_value_);
    }

    public String tthetaToString() {
        return ttheta != null ? ttheta.toString() : null;
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
        return getAttribute("WindContPitchAngleIEC", attrName);
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
        setAttribute("WindContPitchAngleIEC", attrName, objectValue);
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
        setAttribute("WindContPitchAngleIEC", attrName, stringValue);
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
            map.put("WindTurbineType3IEC", new AttrDetails("WindContPitchAngleIEC.WindTurbineType3IEC", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dthetamax", new AttrDetails("WindContPitchAngleIEC.dthetamax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dthetamin", new AttrDetails("WindContPitchAngleIEC.dthetamin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kic", new AttrDetails("WindContPitchAngleIEC.kic", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiomega", new AttrDetails("WindContPitchAngleIEC.kiomega", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpc", new AttrDetails("WindContPitchAngleIEC.kpc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpomega", new AttrDetails("WindContPitchAngleIEC.kpomega", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpx", new AttrDetails("WindContPitchAngleIEC.kpx", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("thetamax", new AttrDetails("WindContPitchAngleIEC.thetamax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("thetamin", new AttrDetails("WindContPitchAngleIEC.thetamin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ttheta", new AttrDetails("WindContPitchAngleIEC.ttheta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindContPitchAngleIEC().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("WindTurbineType3IEC", new GetterSetter(this::WindTurbineType3IECToString, this::setWindTurbineType3IEC, null));
        map.put("dthetamax", new GetterSetter(this::dthetamaxToString, null, this::setDthetamax));
        map.put("dthetamin", new GetterSetter(this::dthetaminToString, null, this::setDthetamin));
        map.put("kic", new GetterSetter(this::kicToString, null, this::setKic));
        map.put("kiomega", new GetterSetter(this::kiomegaToString, null, this::setKiomega));
        map.put("kpc", new GetterSetter(this::kpcToString, null, this::setKpc));
        map.put("kpomega", new GetterSetter(this::kpomegaToString, null, this::setKpomega));
        map.put("kpx", new GetterSetter(this::kpxToString, null, this::setKpx));
        map.put("thetamax", new GetterSetter(this::thetamaxToString, null, this::setThetamax));
        map.put("thetamin", new GetterSetter(this::thetaminToString, null, this::setThetamin));
        map.put("ttheta", new GetterSetter(this::tthetaToString, null, this::setTtheta));
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
