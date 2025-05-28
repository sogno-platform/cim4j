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
 * A generic device designed to close, or open, or both, one or more electric circuits.  All switches are two terminal devices including grounding switches. The ACDCTerminal.connected at the two sides of the switch shall not be considered for assessing switch connectivity, i.e. only Switch.open, .normalOpen and .locked are relevant.
 */
@SuppressWarnings("unused")
public class Switch extends ConductingEquipment {

    private static final Logging LOG = Logging.getLogger(Switch.class);

    /**
     * Constructor.
     */
    public Switch(String rdfid) {
        super("Switch", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected Switch(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The switch state associated with the switch.
     *
     * NOT USED
     */
    private Set<SvSwitch> SvSwitch = new HashSet<>(); // OneToMany

    public Set<SvSwitch> getSvSwitch() {
        return SvSwitch;
    }

    public void setSvSwitch(SvSwitch _object_) {
        if (!SvSwitch.contains(_object_)) {
            SvSwitch.add(_object_);
            _object_.setSwitch(this);
        }
    }

    private static Object getSvSwitch(BaseClass _this_) {
        return ((Switch) _this_).getSvSwitch();
    }

    private static void setSvSwitch(BaseClass _this_, Object _value_) {
        if (_value_ instanceof SvSwitch) {
            ((Switch) _this_).setSvSwitch((SvSwitch) _value_);
        } else {
            throw new IllegalArgumentException("Object is not SvSwitch");
        }
    }

    /**
     * A Switch can be associated with SwitchSchedules.
     *
     * NOT USED
     */
    private Set<SwitchSchedule> SwitchSchedules = new HashSet<>(); // OneToMany

    public Set<SwitchSchedule> getSwitchSchedules() {
        return SwitchSchedules;
    }

    public void setSwitchSchedules(SwitchSchedule _object_) {
        if (!SwitchSchedules.contains(_object_)) {
            SwitchSchedules.add(_object_);
            _object_.setSwitch(this);
        }
    }

    private static Object getSwitchSchedules(BaseClass _this_) {
        return ((Switch) _this_).getSwitchSchedules();
    }

    private static void setSwitchSchedules(BaseClass _this_, Object _value_) {
        if (_value_ instanceof SwitchSchedule) {
            ((Switch) _this_).setSwitchSchedules((SwitchSchedule) _value_);
        } else {
            throw new IllegalArgumentException("Object is not SwitchSchedule");
        }
    }

    /**
     * If true, the switch is locked. The resulting switch state is a combination of locked and Switch.open attributes as follows: <ul> 	<li>locked=true and Switch.open=true. The resulting state is open and locked;</li> 	<li>locked=false and Switch.open=true. The resulting state is open;</li> 	<li>locked=false and Switch.open=false. The resulting state is closed.</li> </ul>
     */
    private Boolean locked; // Boolean

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean _value_) {
        locked = _value_;
    }

    private static Object getLocked(BaseClass _this_) {
        return ((Switch) _this_).getLocked();
    }

    private static void setLocked(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Switch) _this_).setLocked((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Switch) _this_).setLocked(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * The attribute is used in cases when no Measurement for the status value is present. If the Switch has a status measurement the Discrete.normalValue is expected to match with the Switch.normalOpen.
     */
    private Boolean normalOpen; // Boolean

    public Boolean getNormalOpen() {
        return normalOpen;
    }

    public void setNormalOpen(Boolean _value_) {
        normalOpen = _value_;
    }

    private static Object getNormalOpen(BaseClass _this_) {
        return ((Switch) _this_).getNormalOpen();
    }

    private static void setNormalOpen(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Switch) _this_).setNormalOpen((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Switch) _this_).setNormalOpen(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * The attribute tells if the switch is considered open when used as input to topology processing.
     */
    private Boolean open; // Boolean

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean _value_) {
        open = _value_;
    }

    private static Object getOpen(BaseClass _this_) {
        return ((Switch) _this_).getOpen();
    }

    private static void setOpen(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Switch) _this_).setOpen((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Switch) _this_).setOpen(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * The maximum continuous current carrying capacity in amps governed by the device material and construction. The attribute shall be a positive value.
     */
    private Double ratedCurrent; // CurrentFlow

    public Double getRatedCurrent() {
        return ratedCurrent;
    }

    public void setRatedCurrent(Double _value_) {
        ratedCurrent = _value_;
    }

    private static Object getRatedCurrent(BaseClass _this_) {
        return ((Switch) _this_).getRatedCurrent();
    }

    private static void setRatedCurrent(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Switch) _this_).setRatedCurrent((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Switch) _this_).setRatedCurrent(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Branch is retained in the topological solution.  The flow through retained switches will normally be calculated in power flow.
     */
    private Boolean retained; // Boolean

    public Boolean getRetained() {
        return retained;
    }

    public void setRetained(Boolean _value_) {
        retained = _value_;
    }

    private static Object getRetained(BaseClass _this_) {
        return ((Switch) _this_).getRetained();
    }

    private static void setRetained(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Switch) _this_).setRetained((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Switch) _this_).setRetained(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "Switch", attrName));
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
                "Switch", attrName, value));
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
            profiles.add(CGMESProfile.SV);
            map.put("SvSwitch", new AttrDetails("Switch.SvSwitch", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, Switch::getSvSwitch, Switch::setSvSwitch));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("SwitchSchedules", new AttrDetails("Switch.SwitchSchedules", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, Switch::getSwitchSchedules, Switch::setSwitchSchedules));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("locked", new AttrDetails("Switch.locked", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Switch::getLocked, Switch::setLocked));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("normalOpen", new AttrDetails("Switch.normalOpen", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Switch::getNormalOpen, Switch::setNormalOpen));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("open", new AttrDetails("Switch.open", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Switch::getOpen, Switch::setOpen));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedCurrent", new AttrDetails("Switch.ratedCurrent", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Switch::getRatedCurrent, Switch::setRatedCurrent));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("retained", new AttrDetails("Switch.retained", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Switch::getRetained, Switch::setRetained));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new Switch(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.SSH);
        profiles.add(CGMESProfile.SV);
        POSSIBLE_PROFILES = Collections.unmodifiableSet(profiles);
    }

    private static final CGMESProfile RECOMMENDED_PROFILE = CGMESProfile.EQ;

    private static final Set<CGMESProfile> POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>(POSSIBLE_PROFILES);
        for (var attrDetails : ATTR_DETAILS_MAP.values()) {
            profiles.addAll(attrDetails.profiles);
        }
        POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES = Collections.unmodifiableSet(profiles);
    }
}
