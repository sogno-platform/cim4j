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
     * Default constructor.
     */
    public RegulatingControl() {
        setCimType("RegulatingControl");
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

    public void setRegulatingCondEq(BaseClass _object_) {
        if (!(_object_ instanceof RegulatingCondEq)) {
            throw new IllegalArgumentException("Object is not RegulatingCondEq");
        }
        if (!RegulatingCondEq.contains(_object_)) {
            RegulatingCondEq.add((RegulatingCondEq) _object_);
            ((RegulatingCondEq) _object_).setRegulatingControl(this);
        }
    }

    public String RegulatingCondEqToString() {
        return getStringFromSet(RegulatingCondEq);
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

    public void setRegulationSchedule(BaseClass _object_) {
        if (!(_object_ instanceof RegulationSchedule)) {
            throw new IllegalArgumentException("Object is not RegulationSchedule");
        }
        if (!RegulationSchedule.contains(_object_)) {
            RegulationSchedule.add((RegulationSchedule) _object_);
            ((RegulationSchedule) _object_).setRegulatingControl(this);
        }
    }

    public String RegulationScheduleToString() {
        return getStringFromSet(RegulationSchedule);
    }

    /**
     * The controls regulating this terminal.
     */
    private Terminal Terminal; // OneToOne

    public Terminal getTerminal() {
        return Terminal;
    }

    public void setTerminal(BaseClass _object_) {
        if (!(_object_ instanceof Terminal)) {
            throw new IllegalArgumentException("Object is not Terminal");
        }
        if (Terminal != _object_) {
            Terminal = (Terminal) _object_;
            Terminal.setRegulatingControl(this);
        }
    }

    public String TerminalToString() {
        return Terminal != null ? Terminal.getRdfid() : null;
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

    public void setDiscrete(String _value_) {
        discrete = getBooleanFromString(_value_);
    }

    public String discreteToString() {
        return discrete != null ? discrete.toString() : null;
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

    public void setEnabled(String _value_) {
        enabled = getBooleanFromString(_value_);
    }

    public String enabledToString() {
        return enabled != null ? enabled.toString() : null;
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

    public String modeToString() {
        return mode;
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

    public void setTargetDeadband(String _value_) {
        targetDeadband = getDoubleFromString(_value_);
    }

    public String targetDeadbandToString() {
        return targetDeadband != null ? targetDeadband.toString() : null;
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

    public void setTargetValue(String _value_) {
        targetValue = getDoubleFromString(_value_);
    }

    public String targetValueToString() {
        return targetValue != null ? targetValue.toString() : null;
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

    public String targetValueUnitMultiplierToString() {
        return targetValueUnitMultiplier;
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
     * Get an attribute value as string.
     *
     * @param attrName The attribute name
     * @return         The attribute value
     */
    @Override
    public String getAttribute(String attrName) {
        return getAttribute("RegulatingControl", attrName);
    }

    @Override
    protected String getAttribute(String className, String attrName) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var getterFunction = classGetterSetterMap.get(attrName).getter;
            return getterFunction.get();
        }
        return super.getAttribute(className, attrName);
    }

    /**
     * Set an attribute value as object (for class and list attributes).
     *
     * @param attrName    The attribute name
     * @param objectValue The attribute value as object
     */
    @Override
    public void setAttribute(String attrName, BaseClass objectValue) {
        setAttribute("RegulatingControl", attrName, objectValue);
    }

    @Override
    protected void setAttribute(String className, String attrName, BaseClass objectValue) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var setterFunction = classGetterSetterMap.get(attrName).objectSetter;
            setterFunction.accept(objectValue);
        } else {
            super.setAttribute(className, attrName, objectValue);
        }
    }

    /**
     * Set an attribute value as string (for primitive (including datatype) and enum attributes).
     *
     * @param attrName    The attribute name
     * @param stringValue The attribute value as string
     */
    @Override
    public void setAttribute(String attrName, String stringValue) {
        setAttribute("RegulatingControl", attrName, stringValue);
    }

    @Override
    protected void setAttribute(String className, String attrName, String stringValue) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var setterFunction = classGetterSetterMap.get(attrName).stringSetter;
            setterFunction.accept(stringValue);
        } else {
            super.setAttribute(className, attrName, stringValue);
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
            map.put("RegulatingCondEq", new AttrDetails("RegulatingControl.RegulatingCondEq", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("RegulationSchedule", new AttrDetails("RegulatingControl.RegulationSchedule", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("Terminal", new AttrDetails("RegulatingControl.Terminal", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("discrete", new AttrDetails("RegulatingControl.discrete", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("enabled", new AttrDetails("RegulatingControl.enabled", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("mode", new AttrDetails("RegulatingControl.mode", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetDeadband", new AttrDetails("RegulatingControl.targetDeadband", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetValue", new AttrDetails("RegulatingControl.targetValue", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetValueUnitMultiplier", new AttrDetails("RegulatingControl.targetValueUnitMultiplier", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new RegulatingControl().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("RegulatingCondEq", new GetterSetter(this::RegulatingCondEqToString, this::setRegulatingCondEq, null));
        map.put("RegulationSchedule", new GetterSetter(this::RegulationScheduleToString, this::setRegulationSchedule, null));
        map.put("Terminal", new GetterSetter(this::TerminalToString, this::setTerminal, null));
        map.put("discrete", new GetterSetter(this::discreteToString, null, this::setDiscrete));
        map.put("enabled", new GetterSetter(this::enabledToString, null, this::setEnabled));
        map.put("mode", new GetterSetter(this::modeToString, null, this::setMode));
        map.put("targetDeadband", new GetterSetter(this::targetDeadbandToString, null, this::setTargetDeadband));
        map.put("targetValue", new GetterSetter(this::targetValueToString, null, this::setTargetValue));
        map.put("targetValueUnitMultiplier", new GetterSetter(this::targetValueUnitMultiplierToString, null, this::setTargetValueUnitMultiplier));
        return map;
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
