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
     * Constructor.
     */
    public WindAeroTwoDimIEC(String rdfid) {
        super("WindAeroTwoDimIEC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindAeroTwoDimIEC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Wind turbine type 3 model with which this wind aerodynamic model is associated.
     *
     * NOT USED
     */
    private WindTurbineType3IEC WindTurbineType3IEC; // OneToOne

    private String WindTurbineType3IECId;

    public WindTurbineType3IEC getWindTurbineType3IEC() {
        return WindTurbineType3IEC;
    }

    public void setWindTurbineType3IEC(WindTurbineType3IEC _object_) {
        if (WindTurbineType3IEC != _object_) {
            WindTurbineType3IEC = _object_;
            _object_.setWindAeroTwoDimIEC(this);
            WindTurbineType3IECId = _object_.getRdfid();
        }
    }

    private static Object getWindTurbineType3IEC(BaseClass _this_) {
        var obj = ((WindAeroTwoDimIEC) _this_).getWindTurbineType3IEC();
        var id = ((WindAeroTwoDimIEC) _this_).WindTurbineType3IECId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setWindTurbineType3IEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindAeroTwoDimIEC) _this_).WindTurbineType3IECId = (String) _value_;
        } else if (_value_ instanceof WindTurbineType3IEC) {
            ((WindAeroTwoDimIEC) _this_).setWindTurbineType3IEC((WindTurbineType3IEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindTurbineType3IEC");
        }
    }

    /**
     * Partial derivative of aerodynamic power with respect to changes in WTR speed (<i>dp</i><i><sub>omega</sub></i>). It is a type-dependent parameter.
     */
    private Double dpomega; // PU

    public Double getDpomega() {
        return dpomega;
    }

    public void setDpomega(Double _value_) {
        dpomega = _value_;
    }

    private static Object getDpomega(BaseClass _this_) {
        return ((WindAeroTwoDimIEC) _this_).getDpomega();
    }

    private static void setDpomega(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindAeroTwoDimIEC) _this_).setDpomega((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindAeroTwoDimIEC) _this_).setDpomega(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Partial derivative of aerodynamic power with respect to changes in pitch angle (<i>dp</i><i><sub>theta</sub></i>). It is a type-dependent parameter.
     */
    private Double dptheta; // PU

    public Double getDptheta() {
        return dptheta;
    }

    public void setDptheta(Double _value_) {
        dptheta = _value_;
    }

    private static Object getDptheta(BaseClass _this_) {
        return ((WindAeroTwoDimIEC) _this_).getDptheta();
    }

    private static void setDptheta(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindAeroTwoDimIEC) _this_).setDptheta((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindAeroTwoDimIEC) _this_).setDptheta(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Partial derivative (<i>dp</i><i><sub>v1</sub></i>). It is a type-dependent parameter.
     */
    private Double dpv1; // PU

    public Double getDpv1() {
        return dpv1;
    }

    public void setDpv1(Double _value_) {
        dpv1 = _value_;
    }

    private static Object getDpv1(BaseClass _this_) {
        return ((WindAeroTwoDimIEC) _this_).getDpv1();
    }

    private static void setDpv1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindAeroTwoDimIEC) _this_).setDpv1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindAeroTwoDimIEC) _this_).setDpv1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rotor speed if the wind turbine is not derated (<i>omega</i><i><sub>0</sub></i>). It is a type-dependent parameter.
     */
    private Double omegazero; // PU

    public Double getOmegazero() {
        return omegazero;
    }

    public void setOmegazero(Double _value_) {
        omegazero = _value_;
    }

    private static Object getOmegazero(BaseClass _this_) {
        return ((WindAeroTwoDimIEC) _this_).getOmegazero();
    }

    private static void setOmegazero(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindAeroTwoDimIEC) _this_).setOmegazero((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindAeroTwoDimIEC) _this_).setOmegazero(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Available aerodynamic power (<i>p</i><i><sub>avail</sub></i><i>)</i>. It is a case-dependent parameter.
     */
    private Double pavail; // PU

    public Double getPavail() {
        return pavail;
    }

    public void setPavail(Double _value_) {
        pavail = _value_;
    }

    private static Object getPavail(BaseClass _this_) {
        return ((WindAeroTwoDimIEC) _this_).getPavail();
    }

    private static void setPavail(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindAeroTwoDimIEC) _this_).setPavail((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindAeroTwoDimIEC) _this_).setPavail(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Blade angle at twice rated wind speed (<i>theta</i><i><sub>v2</sub></i>). It is a type-dependent parameter.
     */
    private Double thetav2; // AngleDegrees

    public Double getThetav2() {
        return thetav2;
    }

    public void setThetav2(Double _value_) {
        thetav2 = _value_;
    }

    private static Object getThetav2(BaseClass _this_) {
        return ((WindAeroTwoDimIEC) _this_).getThetav2();
    }

    private static void setThetav2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindAeroTwoDimIEC) _this_).setThetav2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindAeroTwoDimIEC) _this_).setThetav2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Pitch angle if the wind turbine is not derated (<i>theta</i><i><sub>0</sub></i>). It is a case-dependent parameter.
     */
    private Double thetazero; // AngleDegrees

    public Double getThetazero() {
        return thetazero;
    }

    public void setThetazero(Double _value_) {
        thetazero = _value_;
    }

    private static Object getThetazero(BaseClass _this_) {
        return ((WindAeroTwoDimIEC) _this_).getThetazero();
    }

    private static void setThetazero(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindAeroTwoDimIEC) _this_).setThetazero((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindAeroTwoDimIEC) _this_).setThetazero(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindAeroTwoDimIEC", attrName));
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
                "WindAeroTwoDimIEC", attrName, value));
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
            map.put("WindTurbineType3IEC", new AttrDetails("WindAeroTwoDimIEC.WindTurbineType3IEC", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindAeroTwoDimIEC::getWindTurbineType3IEC, WindAeroTwoDimIEC::setWindTurbineType3IEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dpomega", new AttrDetails("WindAeroTwoDimIEC.dpomega", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindAeroTwoDimIEC::getDpomega, WindAeroTwoDimIEC::setDpomega));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dptheta", new AttrDetails("WindAeroTwoDimIEC.dptheta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindAeroTwoDimIEC::getDptheta, WindAeroTwoDimIEC::setDptheta));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dpv1", new AttrDetails("WindAeroTwoDimIEC.dpv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindAeroTwoDimIEC::getDpv1, WindAeroTwoDimIEC::setDpv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omegazero", new AttrDetails("WindAeroTwoDimIEC.omegazero", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindAeroTwoDimIEC::getOmegazero, WindAeroTwoDimIEC::setOmegazero));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pavail", new AttrDetails("WindAeroTwoDimIEC.pavail", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindAeroTwoDimIEC::getPavail, WindAeroTwoDimIEC::setPavail));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("thetav2", new AttrDetails("WindAeroTwoDimIEC.thetav2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindAeroTwoDimIEC::getThetav2, WindAeroTwoDimIEC::setThetav2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("thetazero", new AttrDetails("WindAeroTwoDimIEC.thetazero", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindAeroTwoDimIEC::getThetazero, WindAeroTwoDimIEC::setThetazero));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindAeroTwoDimIEC(null).allAttrDetailsMap());
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
