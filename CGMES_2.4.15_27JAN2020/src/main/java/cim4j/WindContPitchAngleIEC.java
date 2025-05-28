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
 * Pitch angle control model.  Reference: IEC Standard 61400-27-1 Section 6.6.5.8.
 */
@SuppressWarnings("unused")
public class WindContPitchAngleIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindContPitchAngleIEC.class);

    /**
     * Constructor.
     */
    public WindContPitchAngleIEC(String rdfid) {
        super("WindContPitchAngleIEC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindContPitchAngleIEC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Wind turbine type 3 model with which this pitch control model is associated.
     *
     * NOT USED
     */
    private WindGenTurbineType3IEC WindGenTurbineType3IEC; // OneToOne

    public WindGenTurbineType3IEC getWindGenTurbineType3IEC() {
        return WindGenTurbineType3IEC;
    }

    public void setWindGenTurbineType3IEC(WindGenTurbineType3IEC _object_) {
        if (WindGenTurbineType3IEC != _object_) {
            WindGenTurbineType3IEC = _object_;
            WindGenTurbineType3IEC.setWindContPitchAngleIEC(this);
        }
    }

    private static Object getWindGenTurbineType3IEC(BaseClass _this_) {
        return ((WindContPitchAngleIEC) _this_).getWindGenTurbineType3IEC();
    }

    private static void setWindGenTurbineType3IEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindGenTurbineType3IEC) {
            ((WindContPitchAngleIEC) _this_).setWindGenTurbineType3IEC((WindGenTurbineType3IEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindGenTurbineType3IEC");
        }
    }

    /**
     * Maximum pitch positive ramp rate (d). It is type dependent parameter. Unit = degrees/sec.
     */
    private Double dthetamax; // Simple_Float

    public Double getDthetamax() {
        return dthetamax;
    }

    public void setDthetamax(Double _value_) {
        dthetamax = _value_;
    }

    private static Object getDthetamax(BaseClass _this_) {
        return ((WindContPitchAngleIEC) _this_).getDthetamax();
    }

    private static void setDthetamax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPitchAngleIEC) _this_).setDthetamax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPitchAngleIEC) _this_).setDthetamax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum pitch negative ramp rate (d). It is type dependent parameter. Unit = degrees/sec.
     */
    private Double dthetamin; // Simple_Float

    public Double getDthetamin() {
        return dthetamin;
    }

    public void setDthetamin(Double _value_) {
        dthetamin = _value_;
    }

    private static Object getDthetamin(BaseClass _this_) {
        return ((WindContPitchAngleIEC) _this_).getDthetamin();
    }

    private static void setDthetamin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPitchAngleIEC) _this_).setDthetamin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPitchAngleIEC) _this_).setDthetamin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Power PI controller integration gain (). It is type dependent parameter.
     */
    private Double kic; // PU

    public Double getKic() {
        return kic;
    }

    public void setKic(Double _value_) {
        kic = _value_;
    }

    private static Object getKic(BaseClass _this_) {
        return ((WindContPitchAngleIEC) _this_).getKic();
    }

    private static void setKic(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPitchAngleIEC) _this_).setKic((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPitchAngleIEC) _this_).setKic(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Speed PI controller integration gain (). It is type dependent parameter.
     */
    private Double kiomega; // PU

    public Double getKiomega() {
        return kiomega;
    }

    public void setKiomega(Double _value_) {
        kiomega = _value_;
    }

    private static Object getKiomega(BaseClass _this_) {
        return ((WindContPitchAngleIEC) _this_).getKiomega();
    }

    private static void setKiomega(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPitchAngleIEC) _this_).setKiomega((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPitchAngleIEC) _this_).setKiomega(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Power PI controller proportional gain (). It is type dependent parameter.
     */
    private Double kpc; // PU

    public Double getKpc() {
        return kpc;
    }

    public void setKpc(Double _value_) {
        kpc = _value_;
    }

    private static Object getKpc(BaseClass _this_) {
        return ((WindContPitchAngleIEC) _this_).getKpc();
    }

    private static void setKpc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPitchAngleIEC) _this_).setKpc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPitchAngleIEC) _this_).setKpc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Speed PI controller proportional gain (). It is type dependent parameter.
     */
    private Double kpomega; // PU

    public Double getKpomega() {
        return kpomega;
    }

    public void setKpomega(Double _value_) {
        kpomega = _value_;
    }

    private static Object getKpomega(BaseClass _this_) {
        return ((WindContPitchAngleIEC) _this_).getKpomega();
    }

    private static void setKpomega(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPitchAngleIEC) _this_).setKpomega((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPitchAngleIEC) _this_).setKpomega(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Pitch cross coupling gain (K). It is type dependent parameter.
     */
    private Double kpx; // PU

    public Double getKpx() {
        return kpx;
    }

    public void setKpx(Double _value_) {
        kpx = _value_;
    }

    private static Object getKpx(BaseClass _this_) {
        return ((WindContPitchAngleIEC) _this_).getKpx();
    }

    private static void setKpx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPitchAngleIEC) _this_).setKpx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPitchAngleIEC) _this_).setKpx(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum pitch angle (). It is type dependent parameter.
     */
    private Double thetamax; // AngleDegrees

    public Double getThetamax() {
        return thetamax;
    }

    public void setThetamax(Double _value_) {
        thetamax = _value_;
    }

    private static Object getThetamax(BaseClass _this_) {
        return ((WindContPitchAngleIEC) _this_).getThetamax();
    }

    private static void setThetamax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPitchAngleIEC) _this_).setThetamax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPitchAngleIEC) _this_).setThetamax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum pitch angle (). It is type dependent parameter.
     */
    private Double thetamin; // AngleDegrees

    public Double getThetamin() {
        return thetamin;
    }

    public void setThetamin(Double _value_) {
        thetamin = _value_;
    }

    private static Object getThetamin(BaseClass _this_) {
        return ((WindContPitchAngleIEC) _this_).getThetamin();
    }

    private static void setThetamin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPitchAngleIEC) _this_).setThetamin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPitchAngleIEC) _this_).setThetamin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Pitch time constant (t). It is type dependent parameter.
     */
    private Double ttheta; // Seconds

    public Double getTtheta() {
        return ttheta;
    }

    public void setTtheta(Double _value_) {
        ttheta = _value_;
    }

    private static Object getTtheta(BaseClass _this_) {
        return ((WindContPitchAngleIEC) _this_).getTtheta();
    }

    private static void setTtheta(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPitchAngleIEC) _this_).setTtheta((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPitchAngleIEC) _this_).setTtheta(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindContPitchAngleIEC", attrName));
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
                "WindContPitchAngleIEC", attrName, value));
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
            map.put("WindGenTurbineType3IEC", new AttrDetails("WindContPitchAngleIEC.WindGenTurbineType3IEC", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindContPitchAngleIEC::getWindGenTurbineType3IEC, WindContPitchAngleIEC::setWindGenTurbineType3IEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dthetamax", new AttrDetails("WindContPitchAngleIEC.dthetamax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPitchAngleIEC::getDthetamax, WindContPitchAngleIEC::setDthetamax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dthetamin", new AttrDetails("WindContPitchAngleIEC.dthetamin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPitchAngleIEC::getDthetamin, WindContPitchAngleIEC::setDthetamin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kic", new AttrDetails("WindContPitchAngleIEC.kic", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPitchAngleIEC::getKic, WindContPitchAngleIEC::setKic));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiomega", new AttrDetails("WindContPitchAngleIEC.kiomega", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPitchAngleIEC::getKiomega, WindContPitchAngleIEC::setKiomega));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpc", new AttrDetails("WindContPitchAngleIEC.kpc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPitchAngleIEC::getKpc, WindContPitchAngleIEC::setKpc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpomega", new AttrDetails("WindContPitchAngleIEC.kpomega", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPitchAngleIEC::getKpomega, WindContPitchAngleIEC::setKpomega));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpx", new AttrDetails("WindContPitchAngleIEC.kpx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPitchAngleIEC::getKpx, WindContPitchAngleIEC::setKpx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("thetamax", new AttrDetails("WindContPitchAngleIEC.thetamax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPitchAngleIEC::getThetamax, WindContPitchAngleIEC::setThetamax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("thetamin", new AttrDetails("WindContPitchAngleIEC.thetamin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPitchAngleIEC::getThetamin, WindContPitchAngleIEC::setThetamin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ttheta", new AttrDetails("WindContPitchAngleIEC.ttheta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPitchAngleIEC::getTtheta, WindContPitchAngleIEC::setTtheta));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindContPitchAngleIEC(null).allAttrDetailsMap());
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
