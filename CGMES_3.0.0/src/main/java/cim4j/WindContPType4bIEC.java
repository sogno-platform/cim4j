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
     * Constructor.
     */
    public WindContPType4bIEC(String rdfid) {
        super("WindContPType4bIEC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindContPType4bIEC(String cimType, String rdfid) {
        super(cimType, rdfid);
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

    public void setWindTurbineType4bIEC(WindTurbineType4bIEC _object_) {
        if (WindTurbineType4bIEC != _object_) {
            WindTurbineType4bIEC = _object_;
            WindTurbineType4bIEC.setWindContPType4bIEC(this);
        }
    }

    private static Object getWindTurbineType4bIEC(BaseClass _this_) {
        return ((WindContPType4bIEC) _this_).getWindTurbineType4bIEC();
    }

    private static void setWindTurbineType4bIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindTurbineType4bIEC) {
            ((WindContPType4bIEC) _this_).setWindTurbineType4bIEC((WindTurbineType4bIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindTurbineType4bIEC");
        }
    }

    /**
     * Maximum wind turbine power ramp rate (<i>dp</i><i><sub>maxp4B</sub></i>). It is a project-dependent parameter.
     */
    private Double dpmaxp4b; // PU

    public Double getDpmaxp4b() {
        return dpmaxp4b;
    }

    public void setDpmaxp4b(Double _value_) {
        dpmaxp4b = _value_;
    }

    private static Object getDpmaxp4b(BaseClass _this_) {
        return ((WindContPType4bIEC) _this_).getDpmaxp4b();
    }

    private static void setDpmaxp4b(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType4bIEC) _this_).setDpmaxp4b((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType4bIEC) _this_).setDpmaxp4b(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant in aerodynamic power response (<i>T</i><i><sub>paero</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     */
    private Double tpaero; // Seconds

    public Double getTpaero() {
        return tpaero;
    }

    public void setTpaero(Double _value_) {
        tpaero = _value_;
    }

    private static Object getTpaero(BaseClass _this_) {
        return ((WindContPType4bIEC) _this_).getTpaero();
    }

    private static void setTpaero(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType4bIEC) _this_).setTpaero((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType4bIEC) _this_).setTpaero(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant in power order lag (<i>T</i><i><sub>pordp4B</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     */
    private Double tpordp4b; // Seconds

    public Double getTpordp4b() {
        return tpordp4b;
    }

    public void setTpordp4b(Double _value_) {
        tpordp4b = _value_;
    }

    private static Object getTpordp4b(BaseClass _this_) {
        return ((WindContPType4bIEC) _this_).getTpordp4b();
    }

    private static void setTpordp4b(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType4bIEC) _this_).setTpordp4b((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType4bIEC) _this_).setTpordp4b(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage measurement filter time constant (<i>T</i><i><sub>ufiltp4B</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     */
    private Double tufiltp4b; // Seconds

    public Double getTufiltp4b() {
        return tufiltp4b;
    }

    public void setTufiltp4b(Double _value_) {
        tufiltp4b = _value_;
    }

    private static Object getTufiltp4b(BaseClass _this_) {
        return ((WindContPType4bIEC) _this_).getTufiltp4b();
    }

    private static void setTufiltp4b(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType4bIEC) _this_).setTufiltp4b((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType4bIEC) _this_).setTufiltp4b(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindContPType4bIEC", attrName));
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
                "WindContPType4bIEC", attrName, value));
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
            map.put("WindTurbineType4bIEC", new AttrDetails("WindContPType4bIEC.WindTurbineType4bIEC", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindContPType4bIEC::getWindTurbineType4bIEC, WindContPType4bIEC::setWindTurbineType4bIEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dpmaxp4b", new AttrDetails("WindContPType4bIEC.dpmaxp4b", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType4bIEC::getDpmaxp4b, WindContPType4bIEC::setDpmaxp4b));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpaero", new AttrDetails("WindContPType4bIEC.tpaero", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType4bIEC::getTpaero, WindContPType4bIEC::setTpaero));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpordp4b", new AttrDetails("WindContPType4bIEC.tpordp4b", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType4bIEC::getTpordp4b, WindContPType4bIEC::setTpordp4b));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tufiltp4b", new AttrDetails("WindContPType4bIEC.tufiltp4b", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType4bIEC::getTufiltp4b, WindContPType4bIEC::setTufiltp4b));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindContPType4bIEC(null).allAttrDetailsMap());
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
