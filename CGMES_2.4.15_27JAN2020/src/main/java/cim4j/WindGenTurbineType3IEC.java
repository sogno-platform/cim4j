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
 * Generator model for wind turbines of IEC type 3A and 3B.
 */
@SuppressWarnings("unused")
public class WindGenTurbineType3IEC extends WindTurbineType3or4IEC {

    private static final Logging LOG = Logging.getLogger(WindGenTurbineType3IEC.class);

    /**
     * Constructor.
     */
    public WindGenTurbineType3IEC(String rdfid) {
        super("WindGenTurbineType3IEC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindGenTurbineType3IEC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Wind aerodynamic model associated with this wind generator type 3 model.
     */
    private WindAeroLinearIEC WindAeroLinearIEC; // OneToOne

    public WindAeroLinearIEC getWindAeroLinearIEC() {
        return WindAeroLinearIEC;
    }

    public void setWindAeroLinearIEC(WindAeroLinearIEC _object_) {
        if (WindAeroLinearIEC != _object_) {
            WindAeroLinearIEC = _object_;
            WindAeroLinearIEC.setWindGenTurbineType3IEC(this);
        }
    }

    private static Object getWindAeroLinearIEC(BaseClass _this_) {
        return ((WindGenTurbineType3IEC) _this_).getWindAeroLinearIEC();
    }

    private static void setWindAeroLinearIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindAeroLinearIEC) {
            ((WindGenTurbineType3IEC) _this_).setWindAeroLinearIEC((WindAeroLinearIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindAeroLinearIEC");
        }
    }

    /**
     * Wind control P type 3 model associated with this wind turbine type 3 model.
     */
    private WindContPType3IEC WindContPType3IEC; // OneToOne

    public WindContPType3IEC getWindContPType3IEC() {
        return WindContPType3IEC;
    }

    public void setWindContPType3IEC(WindContPType3IEC _object_) {
        if (WindContPType3IEC != _object_) {
            WindContPType3IEC = _object_;
            WindContPType3IEC.setWindGenTurbineType3IEC(this);
        }
    }

    private static Object getWindContPType3IEC(BaseClass _this_) {
        return ((WindGenTurbineType3IEC) _this_).getWindContPType3IEC();
    }

    private static void setWindContPType3IEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindContPType3IEC) {
            ((WindGenTurbineType3IEC) _this_).setWindContPType3IEC((WindContPType3IEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindContPType3IEC");
        }
    }

    /**
     * Wind control pitch angle model associated with this wind turbine type 3.
     */
    private WindContPitchAngleIEC WindContPitchAngleIEC; // OneToOne

    public WindContPitchAngleIEC getWindContPitchAngleIEC() {
        return WindContPitchAngleIEC;
    }

    public void setWindContPitchAngleIEC(WindContPitchAngleIEC _object_) {
        if (WindContPitchAngleIEC != _object_) {
            WindContPitchAngleIEC = _object_;
            WindContPitchAngleIEC.setWindGenTurbineType3IEC(this);
        }
    }

    private static Object getWindContPitchAngleIEC(BaseClass _this_) {
        return ((WindGenTurbineType3IEC) _this_).getWindContPitchAngleIEC();
    }

    private static void setWindContPitchAngleIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindContPitchAngleIEC) {
            ((WindGenTurbineType3IEC) _this_).setWindContPitchAngleIEC((WindContPitchAngleIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindContPitchAngleIEC");
        }
    }

    /**
     * Wind mechanical model associated with this wind turbine Type 3 model.
     */
    private WindMechIEC WindMechIEC; // OneToOne

    public WindMechIEC getWindMechIEC() {
        return WindMechIEC;
    }

    public void setWindMechIEC(WindMechIEC _object_) {
        if (WindMechIEC != _object_) {
            WindMechIEC = _object_;
            WindMechIEC.setWindGenTurbineType3IEC(this);
        }
    }

    private static Object getWindMechIEC(BaseClass _this_) {
        return ((WindGenTurbineType3IEC) _this_).getWindMechIEC();
    }

    private static void setWindMechIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindMechIEC) {
            ((WindGenTurbineType3IEC) _this_).setWindMechIEC((WindMechIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindMechIEC");
        }
    }

    /**
     * Maximum active current ramp rate (di). It is project dependent parameter.
     */
    private Double dipmax; // PU

    public Double getDipmax() {
        return dipmax;
    }

    public void setDipmax(Double _value_) {
        dipmax = _value_;
    }

    private static Object getDipmax(BaseClass _this_) {
        return ((WindGenTurbineType3IEC) _this_).getDipmax();
    }

    private static void setDipmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindGenTurbineType3IEC) _this_).setDipmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindGenTurbineType3IEC) _this_).setDipmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum reactive current ramp rate (di). It is project dependent parameter.
     */
    private Double diqmax; // PU

    public Double getDiqmax() {
        return diqmax;
    }

    public void setDiqmax(Double _value_) {
        diqmax = _value_;
    }

    private static Object getDiqmax(BaseClass _this_) {
        return ((WindGenTurbineType3IEC) _this_).getDiqmax();
    }

    private static void setDiqmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindGenTurbineType3IEC) _this_).setDiqmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindGenTurbineType3IEC) _this_).setDiqmax(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindGenTurbineType3IEC", attrName));
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
                "WindGenTurbineType3IEC", attrName, value));
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
            map.put("WindAeroLinearIEC", new AttrDetails("WindGenTurbineType3IEC.WindAeroLinearIEC", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindGenTurbineType3IEC::getWindAeroLinearIEC, WindGenTurbineType3IEC::setWindAeroLinearIEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindContPType3IEC", new AttrDetails("WindGenTurbineType3IEC.WindContPType3IEC", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindGenTurbineType3IEC::getWindContPType3IEC, WindGenTurbineType3IEC::setWindContPType3IEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindContPitchAngleIEC", new AttrDetails("WindGenTurbineType3IEC.WindContPitchAngleIEC", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindGenTurbineType3IEC::getWindContPitchAngleIEC, WindGenTurbineType3IEC::setWindContPitchAngleIEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindMechIEC", new AttrDetails("WindGenTurbineType3IEC.WindMechIEC", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindGenTurbineType3IEC::getWindMechIEC, WindGenTurbineType3IEC::setWindMechIEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dipmax", new AttrDetails("WindGenTurbineType3IEC.dipmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindGenTurbineType3IEC::getDipmax, WindGenTurbineType3IEC::setDipmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("diqmax", new AttrDetails("WindGenTurbineType3IEC.diqmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindGenTurbineType3IEC::getDiqmax, WindGenTurbineType3IEC::setDiqmax));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindGenTurbineType3IEC(null).allAttrDetailsMap());
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
