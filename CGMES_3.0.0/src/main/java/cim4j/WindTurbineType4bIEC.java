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
 * Wind turbine IEC type 4B. Reference: IEC 61400-27-1:2015, 5.5.5.3.
 */
@SuppressWarnings("unused")
public class WindTurbineType4bIEC extends WindTurbineType4IEC {

    private static final Logging LOG = Logging.getLogger(WindTurbineType4bIEC.class);

    /**
     * Constructor.
     */
    public WindTurbineType4bIEC(String rdfid) {
        super("WindTurbineType4bIEC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindTurbineType4bIEC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Wind control P type 4B model associated with this wind turbine type 4B model.
     */
    private WindContPType4bIEC WindContPType4bIEC; // OneToOne

    public WindContPType4bIEC getWindContPType4bIEC() {
        return WindContPType4bIEC;
    }

    public void setWindContPType4bIEC(WindContPType4bIEC _object_) {
        if (WindContPType4bIEC != _object_) {
            WindContPType4bIEC = _object_;
            WindContPType4bIEC.setWindTurbineType4bIEC(this);
        }
    }

    private static Object getWindContPType4bIEC(BaseClass _this_) {
        return ((WindTurbineType4bIEC) _this_).getWindContPType4bIEC();
    }

    private static void setWindContPType4bIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindContPType4bIEC) {
            ((WindTurbineType4bIEC) _this_).setWindContPType4bIEC((WindContPType4bIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindContPType4bIEC");
        }
    }

    /**
     * Wind generator type 4 model associated with this wind turbine type 4B model.
     */
    private WindGenType4IEC WindGenType4IEC; // OneToOne

    public WindGenType4IEC getWindGenType4IEC() {
        return WindGenType4IEC;
    }

    public void setWindGenType4IEC(WindGenType4IEC _object_) {
        if (WindGenType4IEC != _object_) {
            WindGenType4IEC = _object_;
            WindGenType4IEC.setWindTurbineType4bIEC(this);
        }
    }

    private static Object getWindGenType4IEC(BaseClass _this_) {
        return ((WindTurbineType4bIEC) _this_).getWindGenType4IEC();
    }

    private static void setWindGenType4IEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindGenType4IEC) {
            ((WindTurbineType4bIEC) _this_).setWindGenType4IEC((WindGenType4IEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindGenType4IEC");
        }
    }

    /**
     * Wind mechanical model associated with this wind turbine type 4B model.
     */
    private WindMechIEC WindMechIEC; // OneToOne

    public WindMechIEC getWindMechIEC() {
        return WindMechIEC;
    }

    public void setWindMechIEC(WindMechIEC _object_) {
        if (WindMechIEC != _object_) {
            WindMechIEC = _object_;
            WindMechIEC.setWindTurbineType4bIEC(this);
        }
    }

    private static Object getWindMechIEC(BaseClass _this_) {
        return ((WindTurbineType4bIEC) _this_).getWindMechIEC();
    }

    private static void setWindMechIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindMechIEC) {
            ((WindTurbineType4bIEC) _this_).setWindMechIEC((WindMechIEC) _value_);
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindTurbineType4bIEC", attrName));
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
                "WindTurbineType4bIEC", attrName, value));
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
            map.put("WindContPType4bIEC", new AttrDetails("WindTurbineType4bIEC.WindContPType4bIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindTurbineType4bIEC::getWindContPType4bIEC, WindTurbineType4bIEC::setWindContPType4bIEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindGenType4IEC", new AttrDetails("WindTurbineType4bIEC.WindGenType4IEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindTurbineType4bIEC::getWindGenType4IEC, WindTurbineType4bIEC::setWindGenType4IEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindMechIEC", new AttrDetails("WindTurbineType4bIEC.WindMechIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindTurbineType4bIEC::getWindMechIEC, WindTurbineType4bIEC::setWindMechIEC));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindTurbineType4bIEC(null).allAttrDetailsMap());
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
