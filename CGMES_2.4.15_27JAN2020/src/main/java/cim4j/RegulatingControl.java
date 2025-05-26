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
 * Specifies a set of equipment that works together to control a power system quantity such as voltage or flow.  Remote bus voltage control is possible by specifying the controlled terminal located at some place remote from the controlling equipment. In case multiple equipment, possibly of different types, control same terminal there must be only one RegulatingControl at that terminal. The most specific subtype of RegulatingControl shall be used in case such equipment participate in the control, e.g. TapChangerControl for tap changers. For flow control  load sign convention is used, i.e. positive sign means flow out from a TopologicalNode (bus) into the conducting equipment.
 */
@SuppressWarnings("unused")
public class RegulatingControl extends PowerSystemResource {

    private static final Logging LOG = Logging.getLogger(RegulatingControl.class);

    /**
     * Constructor.
     */
    public RegulatingControl(String rdfid) {
        super("RegulatingControl", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected RegulatingControl(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The equipment that participates in this regulating control scheme.
     *
     * NOT USED
     */
    private Set<RegulatingCondEq> RegulatingCondEq = new HashSet<>(); // OneToMany

    public Set<RegulatingCondEq> getRegulatingCondEq() {
        return RegulatingCondEq;
    }

    public void setRegulatingCondEq(RegulatingCondEq _object_) {
        if (!RegulatingCondEq.contains(_object_)) {
            RegulatingCondEq.add(_object_);
            _object_.setRegulatingControl(this);
        }
    }

    private static Object getRegulatingCondEq(BaseClass _this_) {
        return ((RegulatingControl) _this_).getRegulatingCondEq();
    }

    private static void setRegulatingCondEq(BaseClass _this_, Object _value_) {
        if (_value_ instanceof RegulatingCondEq) {
            ((RegulatingControl) _this_).setRegulatingCondEq((RegulatingCondEq) _value_);
        } else {
            throw new IllegalArgumentException("Object is not RegulatingCondEq");
        }
    }

    /**
     * Schedule for this Regulating regulating control.
     *
     * NOT USED
     */
    private Set<RegulationSchedule> RegulationSchedule = new HashSet<>(); // OneToMany

    public Set<RegulationSchedule> getRegulationSchedule() {
        return RegulationSchedule;
    }

    public void setRegulationSchedule(RegulationSchedule _object_) {
        if (!RegulationSchedule.contains(_object_)) {
            RegulationSchedule.add(_object_);
            _object_.setRegulatingControl(this);
        }
    }

    private static Object getRegulationSchedule(BaseClass _this_) {
        return ((RegulatingControl) _this_).getRegulationSchedule();
    }

    private static void setRegulationSchedule(BaseClass _this_, Object _value_) {
        if (_value_ instanceof RegulationSchedule) {
            ((RegulatingControl) _this_).setRegulationSchedule((RegulationSchedule) _value_);
        } else {
            throw new IllegalArgumentException("Object is not RegulationSchedule");
        }
    }

    /**
     * The controls regulating this terminal.
     */
    private Terminal Terminal; // OneToOne

    public Terminal getTerminal() {
        return Terminal;
    }

    public void setTerminal(Terminal _object_) {
        if (Terminal != _object_) {
            Terminal = _object_;
            Terminal.setRegulatingControl(this);
        }
    }

    private static Object getTerminal(BaseClass _this_) {
        return ((RegulatingControl) _this_).getTerminal();
    }

    private static void setTerminal(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Terminal) {
            ((RegulatingControl) _this_).setTerminal((Terminal) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Terminal");
        }
    }

    /**
     * The regulation is performed in a discrete mode. This applies to equipment with discrete controls, e.g. tap changers and shunt compensators.
     */
    private Boolean discrete; // Boolean

    public Boolean getDiscrete() {
        return discrete;
    }

    public void setDiscrete(Boolean _value_) {
        discrete = _value_;
    }

    private static Object getDiscrete(BaseClass _this_) {
        return ((RegulatingControl) _this_).getDiscrete();
    }

    private static void setDiscrete(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((RegulatingControl) _this_).setDiscrete((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((RegulatingControl) _this_).setDiscrete(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * The flag tells if regulation is enabled.
     */
    private Boolean enabled; // Boolean

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean _value_) {
        enabled = _value_;
    }

    private static Object getEnabled(BaseClass _this_) {
        return ((RegulatingControl) _this_).getEnabled();
    }

    private static void setEnabled(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((RegulatingControl) _this_).setEnabled((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((RegulatingControl) _this_).setEnabled(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * The regulating control mode presently available.  This specification allows for determining the kind of regulation without need for obtaining the units from a schedule.
     */
    private String mode; // RegulatingControlModeKind

    public String getMode() {
        return mode;
    }

    public void setMode(String _value_) {
        mode = _value_;
    }

    private static Object getMode(BaseClass _this_) {
        return ((RegulatingControl) _this_).getMode();
    }

    private static void setMode(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((RegulatingControl) _this_).setMode((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * This is a deadband used with discrete control to avoid excessive update of controls like tap changers and shunt compensator banks while regulating. The units of those appropriate for the mode.
     */
    private Double targetDeadband; // Simple_Float

    public Double getTargetDeadband() {
        return targetDeadband;
    }

    public void setTargetDeadband(Double _value_) {
        targetDeadband = _value_;
    }

    private static Object getTargetDeadband(BaseClass _this_) {
        return ((RegulatingControl) _this_).getTargetDeadband();
    }

    private static void setTargetDeadband(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((RegulatingControl) _this_).setTargetDeadband((Double) _value_);
        } else if (_value_ instanceof String) {
            ((RegulatingControl) _this_).setTargetDeadband(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * The target value specified for case input.   This value can be used for the target value without the use of schedules. The value has the units appropriate to the mode attribute.
     */
    private Double targetValue; // Simple_Float

    public Double getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(Double _value_) {
        targetValue = _value_;
    }

    private static Object getTargetValue(BaseClass _this_) {
        return ((RegulatingControl) _this_).getTargetValue();
    }

    private static void setTargetValue(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((RegulatingControl) _this_).setTargetValue((Double) _value_);
        } else if (_value_ instanceof String) {
            ((RegulatingControl) _this_).setTargetValue(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Specify the multiplier for used for the targetValue.
     */
    private String targetValueUnitMultiplier; // UnitMultiplier

    public String getTargetValueUnitMultiplier() {
        return targetValueUnitMultiplier;
    }

    public void setTargetValueUnitMultiplier(String _value_) {
        targetValueUnitMultiplier = _value_;
    }

    private static Object getTargetValueUnitMultiplier(BaseClass _this_) {
        return ((RegulatingControl) _this_).getTargetValueUnitMultiplier();
    }

    private static void setTargetValueUnitMultiplier(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((RegulatingControl) _this_).setTargetValueUnitMultiplier((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "RegulatingControl", attrName));
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
                "RegulatingControl", attrName, value));
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
            profiles.add(CGMESProfile.EQ);
            map.put("RegulatingCondEq", new AttrDetails("RegulatingControl.RegulatingCondEq", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, RegulatingControl::getRegulatingCondEq, RegulatingControl::setRegulatingCondEq));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("RegulationSchedule", new AttrDetails("RegulatingControl.RegulationSchedule", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, RegulatingControl::getRegulationSchedule, RegulatingControl::setRegulationSchedule));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("Terminal", new AttrDetails("RegulatingControl.Terminal", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, RegulatingControl::getTerminal, RegulatingControl::setTerminal));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("discrete", new AttrDetails("RegulatingControl.discrete", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, RegulatingControl::getDiscrete, RegulatingControl::setDiscrete));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("enabled", new AttrDetails("RegulatingControl.enabled", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, RegulatingControl::getEnabled, RegulatingControl::setEnabled));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("mode", new AttrDetails("RegulatingControl.mode", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, RegulatingControl::getMode, RegulatingControl::setMode));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetDeadband", new AttrDetails("RegulatingControl.targetDeadband", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, RegulatingControl::getTargetDeadband, RegulatingControl::setTargetDeadband));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetValue", new AttrDetails("RegulatingControl.targetValue", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, RegulatingControl::getTargetValue, RegulatingControl::setTargetValue));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetValueUnitMultiplier", new AttrDetails("RegulatingControl.targetValueUnitMultiplier", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, RegulatingControl::getTargetValueUnitMultiplier, RegulatingControl::setTargetValueUnitMultiplier));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new RegulatingControl(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.SSH);
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
