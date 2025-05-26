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
 * Parent class supporting relationships to IEC wind turbines type 3 including their control models.
 */
@SuppressWarnings("unused")
public class WindTurbineType3IEC extends WindTurbineType3or4IEC {

    private static final Logging LOG = Logging.getLogger(WindTurbineType3IEC.class);

    /**
     * Constructor.
     */
    public WindTurbineType3IEC(String rdfid) {
        super("WindTurbineType3IEC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindTurbineType3IEC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Wind aerodynamic model associated with this wind generator type 3 model.
     */
    private WindAeroOneDimIEC WindAeroOneDimIEC; // OneToOne

    public WindAeroOneDimIEC getWindAeroOneDimIEC() {
        return WindAeroOneDimIEC;
    }

    public void setWindAeroOneDimIEC(WindAeroOneDimIEC _object_) {
        if (WindAeroOneDimIEC != _object_) {
            WindAeroOneDimIEC = _object_;
            WindAeroOneDimIEC.setWindTurbineType3IEC(this);
        }
    }

    private static Object getWindAeroOneDimIEC(BaseClass _this_) {
        return ((WindTurbineType3IEC) _this_).getWindAeroOneDimIEC();
    }

    private static void setWindAeroOneDimIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindAeroOneDimIEC) {
            ((WindTurbineType3IEC) _this_).setWindAeroOneDimIEC((WindAeroOneDimIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindAeroOneDimIEC");
        }
    }

    /**
     * Wind aerodynamic model associated with this wind turbine type 3 model.
     */
    private WindAeroTwoDimIEC WindAeroTwoDimIEC; // OneToOne

    public WindAeroTwoDimIEC getWindAeroTwoDimIEC() {
        return WindAeroTwoDimIEC;
    }

    public void setWindAeroTwoDimIEC(WindAeroTwoDimIEC _object_) {
        if (WindAeroTwoDimIEC != _object_) {
            WindAeroTwoDimIEC = _object_;
            WindAeroTwoDimIEC.setWindTurbineType3IEC(this);
        }
    }

    private static Object getWindAeroTwoDimIEC(BaseClass _this_) {
        return ((WindTurbineType3IEC) _this_).getWindAeroTwoDimIEC();
    }

    private static void setWindAeroTwoDimIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindAeroTwoDimIEC) {
            ((WindTurbineType3IEC) _this_).setWindAeroTwoDimIEC((WindAeroTwoDimIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindAeroTwoDimIEC");
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
            WindContPType3IEC.setWindTurbineType3IEC(this);
        }
    }

    private static Object getWindContPType3IEC(BaseClass _this_) {
        return ((WindTurbineType3IEC) _this_).getWindContPType3IEC();
    }

    private static void setWindContPType3IEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindContPType3IEC) {
            ((WindTurbineType3IEC) _this_).setWindContPType3IEC((WindContPType3IEC) _value_);
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
            WindContPitchAngleIEC.setWindTurbineType3IEC(this);
        }
    }

    private static Object getWindContPitchAngleIEC(BaseClass _this_) {
        return ((WindTurbineType3IEC) _this_).getWindContPitchAngleIEC();
    }

    private static void setWindContPitchAngleIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindContPitchAngleIEC) {
            ((WindTurbineType3IEC) _this_).setWindContPitchAngleIEC((WindContPitchAngleIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindContPitchAngleIEC");
        }
    }

    /**
     * Wind generator type 3 model associated with this wind turbine type 3 model.
     */
    private WindGenType3IEC WindGenType3IEC; // OneToOne

    public WindGenType3IEC getWindGenType3IEC() {
        return WindGenType3IEC;
    }

    public void setWindGenType3IEC(WindGenType3IEC _object_) {
        if (WindGenType3IEC != _object_) {
            WindGenType3IEC = _object_;
            WindGenType3IEC.setWindTurbineType3IEC(this);
        }
    }

    private static Object getWindGenType3IEC(BaseClass _this_) {
        return ((WindTurbineType3IEC) _this_).getWindGenType3IEC();
    }

    private static void setWindGenType3IEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindGenType3IEC) {
            ((WindTurbineType3IEC) _this_).setWindGenType3IEC((WindGenType3IEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindGenType3IEC");
        }
    }

    /**
     * Wind mechanical model associated with this wind turbine type 3 model.
     */
    private WindMechIEC WindMechIEC; // OneToOne

    public WindMechIEC getWindMechIEC() {
        return WindMechIEC;
    }

    public void setWindMechIEC(WindMechIEC _object_) {
        if (WindMechIEC != _object_) {
            WindMechIEC = _object_;
            WindMechIEC.setWindTurbineType3IEC(this);
        }
    }

    private static Object getWindMechIEC(BaseClass _this_) {
        return ((WindTurbineType3IEC) _this_).getWindMechIEC();
    }

    private static void setWindMechIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindMechIEC) {
            ((WindTurbineType3IEC) _this_).setWindMechIEC((WindMechIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindMechIEC");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindTurbineType3IEC", attrName));
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
                "WindTurbineType3IEC", attrName, value));
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
            map.put("WindAeroOneDimIEC", new AttrDetails("WindTurbineType3IEC.WindAeroOneDimIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindTurbineType3IEC::getWindAeroOneDimIEC, WindTurbineType3IEC::setWindAeroOneDimIEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindAeroTwoDimIEC", new AttrDetails("WindTurbineType3IEC.WindAeroTwoDimIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindTurbineType3IEC::getWindAeroTwoDimIEC, WindTurbineType3IEC::setWindAeroTwoDimIEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindContPType3IEC", new AttrDetails("WindTurbineType3IEC.WindContPType3IEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindTurbineType3IEC::getWindContPType3IEC, WindTurbineType3IEC::setWindContPType3IEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindContPitchAngleIEC", new AttrDetails("WindTurbineType3IEC.WindContPitchAngleIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindTurbineType3IEC::getWindContPitchAngleIEC, WindTurbineType3IEC::setWindContPitchAngleIEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindGenType3IEC", new AttrDetails("WindTurbineType3IEC.WindGenType3IEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindTurbineType3IEC::getWindGenType3IEC, WindTurbineType3IEC::setWindGenType3IEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindMechIEC", new AttrDetails("WindTurbineType3IEC.WindMechIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindTurbineType3IEC::getWindMechIEC, WindTurbineType3IEC::setWindMechIEC));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindTurbineType3IEC(null).allAttrDetailsMap());
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
