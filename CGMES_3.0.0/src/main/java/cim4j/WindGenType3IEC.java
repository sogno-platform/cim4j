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
 * Parent class supporting relationships to IEC wind turbines type 3 generator models of IEC type 3A and 3B.
 */
@SuppressWarnings("unused")
public class WindGenType3IEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindGenType3IEC.class);

    /**
     * Constructor.
     */
    public WindGenType3IEC(String rdfid) {
        super("WindGenType3IEC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindGenType3IEC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Wind turbine type 3 model with which this wind generator type 3 is associated.
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
            _object_.setWindGenType3IEC(this);
            WindTurbineType3IECId = _object_.getRdfid();
        }
    }

    private static Object getWindTurbineType3IEC(BaseClass _this_) {
        var obj = ((WindGenType3IEC) _this_).getWindTurbineType3IEC();
        var id = ((WindGenType3IEC) _this_).WindTurbineType3IECId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setWindTurbineType3IEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindGenType3IEC) _this_).WindTurbineType3IECId = (String) _value_;
        } else if (_value_ instanceof WindTurbineType3IEC) {
            ((WindGenType3IEC) _this_).setWindTurbineType3IEC((WindTurbineType3IEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindTurbineType3IEC");
        }
    }

    /**
     * Maximum active current ramp rate (<i>di</i><i><sub>pmax</sub></i>). It is a project-dependent parameter.
     */
    private Double dipmax; // PU

    public Double getDipmax() {
        return dipmax;
    }

    public void setDipmax(Double _value_) {
        dipmax = _value_;
    }

    private static Object getDipmax(BaseClass _this_) {
        return ((WindGenType3IEC) _this_).getDipmax();
    }

    private static void setDipmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindGenType3IEC) _this_).setDipmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindGenType3IEC) _this_).setDipmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum reactive current ramp rate (<i>di</i><i><sub>qmax</sub></i>). It is a project-dependent parameter.
     */
    private Double diqmax; // PU

    public Double getDiqmax() {
        return diqmax;
    }

    public void setDiqmax(Double _value_) {
        diqmax = _value_;
    }

    private static Object getDiqmax(BaseClass _this_) {
        return ((WindGenType3IEC) _this_).getDiqmax();
    }

    private static void setDiqmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindGenType3IEC) _this_).setDiqmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindGenType3IEC) _this_).setDiqmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Electromagnetic transient reactance (<i>x</i><i><sub>S</sub></i>). It is a type-dependent parameter.
     */
    private Double xs; // PU

    public Double getXs() {
        return xs;
    }

    public void setXs(Double _value_) {
        xs = _value_;
    }

    private static Object getXs(BaseClass _this_) {
        return ((WindGenType3IEC) _this_).getXs();
    }

    private static void setXs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindGenType3IEC) _this_).setXs((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindGenType3IEC) _this_).setXs(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindGenType3IEC", attrName));
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
                "WindGenType3IEC", attrName, value));
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
            map.put("WindTurbineType3IEC", new AttrDetails("WindGenType3IEC.WindTurbineType3IEC", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindGenType3IEC::getWindTurbineType3IEC, WindGenType3IEC::setWindTurbineType3IEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dipmax", new AttrDetails("WindGenType3IEC.dipmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindGenType3IEC::getDipmax, WindGenType3IEC::setDipmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("diqmax", new AttrDetails("WindGenType3IEC.diqmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindGenType3IEC::getDiqmax, WindGenType3IEC::setDiqmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xs", new AttrDetails("WindGenType3IEC.xs", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindGenType3IEC::getXs, WindGenType3IEC::setXs));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindGenType3IEC(null).allAttrDetailsMap());
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
