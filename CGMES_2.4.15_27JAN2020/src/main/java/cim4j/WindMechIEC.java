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
 * Two mass model.  Reference: IEC Standard 61400-27-1 Section 6.6.2.1.
 */
@SuppressWarnings("unused")
public class WindMechIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindMechIEC.class);

    /**
     * Constructor.
     */
    public WindMechIEC(String rdfid) {
        super("WindMechIEC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindMechIEC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Wind turbine Type 3 model with which this wind mechanical model is associated.
     *
     * NOT USED
     */
    private WindGenTurbineType3IEC WindGenTurbineType3IEC; // OneToOne

    private String WindGenTurbineType3IECId;

    public WindGenTurbineType3IEC getWindGenTurbineType3IEC() {
        return WindGenTurbineType3IEC;
    }

    public void setWindGenTurbineType3IEC(WindGenTurbineType3IEC _object_) {
        if (WindGenTurbineType3IEC != _object_) {
            WindGenTurbineType3IEC = _object_;
            _object_.setWindMechIEC(this);
            WindGenTurbineType3IECId = _object_.getRdfid();
        }
    }

    private static Object getWindGenTurbineType3IEC(BaseClass _this_) {
        var obj = ((WindMechIEC) _this_).getWindGenTurbineType3IEC();
        var id = ((WindMechIEC) _this_).WindGenTurbineType3IECId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setWindGenTurbineType3IEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindMechIEC) _this_).WindGenTurbineType3IECId = (String) _value_;
        } else if (_value_ instanceof WindGenTurbineType3IEC) {
            ((WindMechIEC) _this_).setWindGenTurbineType3IEC((WindGenTurbineType3IEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindGenTurbineType3IEC");
        }
    }

    /**
     * Wind generator type 1 or 2 model with which this wind mechanical model is associated.
     *
     * NOT USED
     */
    private WindTurbineType1or2IEC WindTurbineType1or2IEC; // OneToOne

    private String WindTurbineType1or2IECId;

    public WindTurbineType1or2IEC getWindTurbineType1or2IEC() {
        return WindTurbineType1or2IEC;
    }

    public void setWindTurbineType1or2IEC(WindTurbineType1or2IEC _object_) {
        if (WindTurbineType1or2IEC != _object_) {
            WindTurbineType1or2IEC = _object_;
            _object_.setWindMechIEC(this);
            WindTurbineType1or2IECId = _object_.getRdfid();
        }
    }

    private static Object getWindTurbineType1or2IEC(BaseClass _this_) {
        var obj = ((WindMechIEC) _this_).getWindTurbineType1or2IEC();
        var id = ((WindMechIEC) _this_).WindTurbineType1or2IECId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setWindTurbineType1or2IEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindMechIEC) _this_).WindTurbineType1or2IECId = (String) _value_;
        } else if (_value_ instanceof WindTurbineType1or2IEC) {
            ((WindMechIEC) _this_).setWindTurbineType1or2IEC((WindTurbineType1or2IEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindTurbineType1or2IEC");
        }
    }

    /**
     * Wind turbine type 4B model with which this wind mechanical model is associated.
     *
     * NOT USED
     */
    private WindTurbineType4bIEC WindTurbineType4bIEC; // OneToOne

    private String WindTurbineType4bIECId;

    public WindTurbineType4bIEC getWindTurbineType4bIEC() {
        return WindTurbineType4bIEC;
    }

    public void setWindTurbineType4bIEC(WindTurbineType4bIEC _object_) {
        if (WindTurbineType4bIEC != _object_) {
            WindTurbineType4bIEC = _object_;
            _object_.setWindMechIEC(this);
            WindTurbineType4bIECId = _object_.getRdfid();
        }
    }

    private static Object getWindTurbineType4bIEC(BaseClass _this_) {
        var obj = ((WindMechIEC) _this_).getWindTurbineType4bIEC();
        var id = ((WindMechIEC) _this_).WindTurbineType4bIECId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setWindTurbineType4bIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindMechIEC) _this_).WindTurbineType4bIECId = (String) _value_;
        } else if (_value_ instanceof WindTurbineType4bIEC) {
            ((WindMechIEC) _this_).setWindTurbineType4bIEC((WindTurbineType4bIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindTurbineType4bIEC");
        }
    }

    /**
     * Drive train damping (. It is type dependent parameter.
     */
    private Double cdrt; // PU

    public Double getCdrt() {
        return cdrt;
    }

    public void setCdrt(Double _value_) {
        cdrt = _value_;
    }

    private static Object getCdrt(BaseClass _this_) {
        return ((WindMechIEC) _this_).getCdrt();
    }

    private static void setCdrt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindMechIEC) _this_).setCdrt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindMechIEC) _this_).setCdrt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Inertia constant of generator (). It is type dependent parameter.
     */
    private Double hgen; // Seconds

    public Double getHgen() {
        return hgen;
    }

    public void setHgen(Double _value_) {
        hgen = _value_;
    }

    private static Object getHgen(BaseClass _this_) {
        return ((WindMechIEC) _this_).getHgen();
    }

    private static void setHgen(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindMechIEC) _this_).setHgen((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindMechIEC) _this_).setHgen(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Inertia constant of wind turbine rotor (). It is type dependent parameter.
     */
    private Double hwtr; // Seconds

    public Double getHwtr() {
        return hwtr;
    }

    public void setHwtr(Double _value_) {
        hwtr = _value_;
    }

    private static Object getHwtr(BaseClass _this_) {
        return ((WindMechIEC) _this_).getHwtr();
    }

    private static void setHwtr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindMechIEC) _this_).setHwtr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindMechIEC) _this_).setHwtr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Drive train stiffness (). It is type dependent parameter.
     */
    private Double kdrt; // PU

    public Double getKdrt() {
        return kdrt;
    }

    public void setKdrt(Double _value_) {
        kdrt = _value_;
    }

    private static Object getKdrt(BaseClass _this_) {
        return ((WindMechIEC) _this_).getKdrt();
    }

    private static void setKdrt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindMechIEC) _this_).setKdrt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindMechIEC) _this_).setKdrt(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindMechIEC", attrName));
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
                "WindMechIEC", attrName, value));
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
            map.put("WindGenTurbineType3IEC", new AttrDetails("WindMechIEC.WindGenTurbineType3IEC", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindMechIEC::getWindGenTurbineType3IEC, WindMechIEC::setWindGenTurbineType3IEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindTurbineType1or2IEC", new AttrDetails("WindMechIEC.WindTurbineType1or2IEC", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindMechIEC::getWindTurbineType1or2IEC, WindMechIEC::setWindTurbineType1or2IEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindTurbineType4bIEC", new AttrDetails("WindMechIEC.WindTurbineType4bIEC", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindMechIEC::getWindTurbineType4bIEC, WindMechIEC::setWindTurbineType4bIEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("cdrt", new AttrDetails("WindMechIEC.cdrt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindMechIEC::getCdrt, WindMechIEC::setCdrt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("hgen", new AttrDetails("WindMechIEC.hgen", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindMechIEC::getHgen, WindMechIEC::setHgen));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("hwtr", new AttrDetails("WindMechIEC.hwtr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindMechIEC::getHwtr, WindMechIEC::setHwtr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kdrt", new AttrDetails("WindMechIEC.kdrt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindMechIEC::getKdrt, WindMechIEC::setKdrt));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindMechIEC(null).allAttrDetailsMap());
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
