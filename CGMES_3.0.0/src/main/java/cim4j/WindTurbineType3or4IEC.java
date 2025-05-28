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
 * Parent class supporting relationships to IEC wind turbines type 3 and type 4 including their control models.
 */
@SuppressWarnings("unused")
public class WindTurbineType3or4IEC extends WindTurbineType3or4Dynamics {

    private static final Logging LOG = Logging.getLogger(WindTurbineType3or4IEC.class);

    /**
     * Constructor.
     */
    public WindTurbineType3or4IEC(String rdfid) {
        super("WindTurbineType3or4IEC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindTurbineType3or4IEC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Wind control Q model associated with this wind turbine type 3 or type 4 model.
     */
    private WindContQIEC WIndContQIEC; // OneToOne

    public WindContQIEC getWIndContQIEC() {
        return WIndContQIEC;
    }

    public void setWIndContQIEC(WindContQIEC _object_) {
        if (WIndContQIEC != _object_) {
            WIndContQIEC = _object_;
            WIndContQIEC.setWindTurbineType3or4IEC(this);
        }
    }

    private static Object getWIndContQIEC(BaseClass _this_) {
        return ((WindTurbineType3or4IEC) _this_).getWIndContQIEC();
    }

    private static void setWIndContQIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindContQIEC) {
            ((WindTurbineType3or4IEC) _this_).setWIndContQIEC((WindContQIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindContQIEC");
        }
    }

    /**
     * Wind control current limitation model associated with this wind turbine type 3 or type 4 model.
     */
    private WindContCurrLimIEC WindContCurrLimIEC; // OneToOne

    public WindContCurrLimIEC getWindContCurrLimIEC() {
        return WindContCurrLimIEC;
    }

    public void setWindContCurrLimIEC(WindContCurrLimIEC _object_) {
        if (WindContCurrLimIEC != _object_) {
            WindContCurrLimIEC = _object_;
            WindContCurrLimIEC.setWindTurbineType3or4IEC(this);
        }
    }

    private static Object getWindContCurrLimIEC(BaseClass _this_) {
        return ((WindTurbineType3or4IEC) _this_).getWindContCurrLimIEC();
    }

    private static void setWindContCurrLimIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindContCurrLimIEC) {
            ((WindTurbineType3or4IEC) _this_).setWindContCurrLimIEC((WindContCurrLimIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindContCurrLimIEC");
        }
    }

    /**
     * Constant Q limitation model associated with this wind generator type 3 or type 4 model.
     */
    private WindContQLimIEC WindContQLimIEC; // OneToOne

    public WindContQLimIEC getWindContQLimIEC() {
        return WindContQLimIEC;
    }

    public void setWindContQLimIEC(WindContQLimIEC _object_) {
        if (WindContQLimIEC != _object_) {
            WindContQLimIEC = _object_;
            WindContQLimIEC.setWindTurbineType3or4IEC(this);
        }
    }

    private static Object getWindContQLimIEC(BaseClass _this_) {
        return ((WindTurbineType3or4IEC) _this_).getWindContQLimIEC();
    }

    private static void setWindContQLimIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindContQLimIEC) {
            ((WindTurbineType3or4IEC) _this_).setWindContQLimIEC((WindContQLimIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindContQLimIEC");
        }
    }

    /**
     * QP and QU limitation model associated with this wind generator type 3 or type 4 model.
     */
    private WindContQPQULimIEC WindContQPQULimIEC; // OneToOne

    public WindContQPQULimIEC getWindContQPQULimIEC() {
        return WindContQPQULimIEC;
    }

    public void setWindContQPQULimIEC(WindContQPQULimIEC _object_) {
        if (WindContQPQULimIEC != _object_) {
            WindContQPQULimIEC = _object_;
            WindContQPQULimIEC.setWindTurbineType3or4IEC(this);
        }
    }

    private static Object getWindContQPQULimIEC(BaseClass _this_) {
        return ((WindTurbineType3or4IEC) _this_).getWindContQPQULimIEC();
    }

    private static void setWindContQPQULimIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindContQPQULimIEC) {
            ((WindTurbineType3or4IEC) _this_).setWindContQPQULimIEC((WindContQPQULimIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindContQPQULimIEC");
        }
    }

    /**
     * Wind turbune protection model associated with this wind generator type 3 or type 4 model.
     */
    private WindProtectionIEC WindProtectionIEC; // OneToOne

    public WindProtectionIEC getWindProtectionIEC() {
        return WindProtectionIEC;
    }

    public void setWindProtectionIEC(WindProtectionIEC _object_) {
        if (WindProtectionIEC != _object_) {
            WindProtectionIEC = _object_;
            WindProtectionIEC.setWindTurbineType3or4IEC(this);
        }
    }

    private static Object getWindProtectionIEC(BaseClass _this_) {
        return ((WindTurbineType3or4IEC) _this_).getWindProtectionIEC();
    }

    private static void setWindProtectionIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindProtectionIEC) {
            ((WindTurbineType3or4IEC) _this_).setWindProtectionIEC((WindProtectionIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindProtectionIEC");
        }
    }

    /**
     * Reference frame rotation model associated with this wind turbine type 3 or type 4 model.
     */
    private WindRefFrameRotIEC WindRefFrameRotIEC; // OneToOne

    public WindRefFrameRotIEC getWindRefFrameRotIEC() {
        return WindRefFrameRotIEC;
    }

    public void setWindRefFrameRotIEC(WindRefFrameRotIEC _object_) {
        if (WindRefFrameRotIEC != _object_) {
            WindRefFrameRotIEC = _object_;
            WindRefFrameRotIEC.setWindTurbineType3or4IEC(this);
        }
    }

    private static Object getWindRefFrameRotIEC(BaseClass _this_) {
        return ((WindTurbineType3or4IEC) _this_).getWindRefFrameRotIEC();
    }

    private static void setWindRefFrameRotIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindRefFrameRotIEC) {
            ((WindTurbineType3or4IEC) _this_).setWindRefFrameRotIEC((WindRefFrameRotIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindRefFrameRotIEC");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindTurbineType3or4IEC", attrName));
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
                "WindTurbineType3or4IEC", attrName, value));
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
            map.put("WIndContQIEC", new AttrDetails("WindTurbineType3or4IEC.WIndContQIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindTurbineType3or4IEC::getWIndContQIEC, WindTurbineType3or4IEC::setWIndContQIEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindContCurrLimIEC", new AttrDetails("WindTurbineType3or4IEC.WindContCurrLimIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindTurbineType3or4IEC::getWindContCurrLimIEC, WindTurbineType3or4IEC::setWindContCurrLimIEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindContQLimIEC", new AttrDetails("WindTurbineType3or4IEC.WindContQLimIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindTurbineType3or4IEC::getWindContQLimIEC, WindTurbineType3or4IEC::setWindContQLimIEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindContQPQULimIEC", new AttrDetails("WindTurbineType3or4IEC.WindContQPQULimIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindTurbineType3or4IEC::getWindContQPQULimIEC, WindTurbineType3or4IEC::setWindContQPQULimIEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindProtectionIEC", new AttrDetails("WindTurbineType3or4IEC.WindProtectionIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindTurbineType3or4IEC::getWindProtectionIEC, WindTurbineType3or4IEC::setWindProtectionIEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindRefFrameRotIEC", new AttrDetails("WindTurbineType3or4IEC.WindRefFrameRotIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindTurbineType3or4IEC::getWindRefFrameRotIEC, WindTurbineType3or4IEC::setWindRefFrameRotIEC));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindTurbineType3or4IEC(null).allAttrDetailsMap());
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
