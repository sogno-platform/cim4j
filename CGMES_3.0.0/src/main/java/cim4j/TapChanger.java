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
 * Mechanism for changing transformer winding tap positions.
 */
@SuppressWarnings("unused")
public class TapChanger extends PowerSystemResource {

    private static final Logging LOG = Logging.getLogger(TapChanger.class);

    /**
     * Default constructor.
     */
    public TapChanger() {
        setCimType("TapChanger");
    }

    /**
     * The tap step state associated with the tap changer.
     *
     * NOT USED
     */
    private SvTapStep SvTapStep; // OneToOne

    public SvTapStep getSvTapStep() {
        return SvTapStep;
    }

    public void setSvTapStep(BaseClass _object_) {
        if (!(_object_ instanceof SvTapStep)) {
            throw new IllegalArgumentException("Object is not SvTapStep");
        }
        if (SvTapStep != _object_) {
            SvTapStep = (SvTapStep) _object_;
            SvTapStep.setTapChanger(this);
        }
    }

    public String SvTapStepToString() {
        return SvTapStep != null ? SvTapStep.getRdfid() : null;
    }

    /**
     * The regulating control scheme in which this tap changer participates.
     */
    private TapChangerControl TapChangerControl; // ManyToOne

    public TapChangerControl getTapChangerControl() {
        return TapChangerControl;
    }

    public void setTapChangerControl(BaseClass _object_) {
        if (!(_object_ instanceof TapChangerControl)) {
            throw new IllegalArgumentException("Object is not TapChangerControl");
        }
        if (TapChangerControl != _object_) {
            TapChangerControl = (TapChangerControl) _object_;
            TapChangerControl.setTapChanger(this);
        }
    }

    public String TapChangerControlToString() {
        return TapChangerControl != null ? TapChangerControl.getRdfid() : null;
    }

    /**
     * A TapChanger can have TapSchedules.
     *
     * NOT USED
     */
    private Set<TapSchedule> TapSchedules = new HashSet<>(); // OneToMany

    public Set<TapSchedule> getTapSchedules() {
        return TapSchedules;
    }

    public void setTapSchedules(BaseClass _object_) {
        if (!(_object_ instanceof TapSchedule)) {
            throw new IllegalArgumentException("Object is not TapSchedule");
        }
        if (!TapSchedules.contains(_object_)) {
            TapSchedules.add((TapSchedule) _object_);
            ((TapSchedule) _object_).setTapChanger(this);
        }
    }

    public String TapSchedulesToString() {
        return getStringFromSet(TapSchedules);
    }

    /**
     * Specifies the regulation status of the equipment.  True is regulating, false is not regulating.
     */
    private Boolean controlEnabled; // Boolean

    public Boolean getControlEnabled() {
        return controlEnabled;
    }

    public void setControlEnabled(Boolean _value_) {
        controlEnabled = _value_;
    }

    public void setControlEnabled(String _value_) {
        controlEnabled = getBooleanFromString(_value_);
    }

    public String controlEnabledToString() {
        return controlEnabled != null ? controlEnabled.toString() : null;
    }

    /**
     * Highest possible tap step position, advance from neutral. The attribute shall be greater than lowStep.
     */
    private Integer highStep; // Integer

    public Integer getHighStep() {
        return highStep;
    }

    public void setHighStep(Integer _value_) {
        highStep = _value_;
    }

    public void setHighStep(String _value_) {
        highStep = getIntegerFromString(_value_);
    }

    public String highStepToString() {
        return highStep != null ? highStep.toString() : null;
    }

    /**
     * Lowest possible tap step position, retard from neutral.
     */
    private Integer lowStep; // Integer

    public Integer getLowStep() {
        return lowStep;
    }

    public void setLowStep(Integer _value_) {
        lowStep = _value_;
    }

    public void setLowStep(String _value_) {
        lowStep = getIntegerFromString(_value_);
    }

    public String lowStepToString() {
        return lowStep != null ? lowStep.toString() : null;
    }

    /**
     * Specifies whether or not a TapChanger has load tap changing capabilities.
     */
    private Boolean ltcFlag; // Boolean

    public Boolean getLtcFlag() {
        return ltcFlag;
    }

    public void setLtcFlag(Boolean _value_) {
        ltcFlag = _value_;
    }

    public void setLtcFlag(String _value_) {
        ltcFlag = getBooleanFromString(_value_);
    }

    public String ltcFlagToString() {
        return ltcFlag != null ? ltcFlag.toString() : null;
    }

    /**
     * The neutral tap step position for this winding. The attribute shall be equal to or greater than lowStep and equal or less than highStep. It is the step position where the voltage is neutralU when the other terminals of the transformer are at the ratedU.  If there are other tap changers on the transformer those taps are kept constant at their neutralStep.
     */
    private Integer neutralStep; // Integer

    public Integer getNeutralStep() {
        return neutralStep;
    }

    public void setNeutralStep(Integer _value_) {
        neutralStep = _value_;
    }

    public void setNeutralStep(String _value_) {
        neutralStep = getIntegerFromString(_value_);
    }

    public String neutralStepToString() {
        return neutralStep != null ? neutralStep.toString() : null;
    }

    /**
     * Voltage at which the winding operates at the neutral tap setting. It is the voltage at the terminal of the PowerTransformerEnd associated with the tap changer when all tap changers on the transformer are at their neutralStep position.  Normally neutralU of the tap changer is the same as ratedU of the PowerTransformerEnd, but it can differ in special cases such as when the tapping mechanism is separate from the winding more common on lower voltage transformers. This attribute is not relevant for PhaseTapChangerAsymmetrical, PhaseTapChangerSymmetrical and PhaseTapChangerLinear.
     */
    private Double neutralU; // Voltage

    public Double getNeutralU() {
        return neutralU;
    }

    public void setNeutralU(Double _value_) {
        neutralU = _value_;
    }

    public void setNeutralU(String _value_) {
        neutralU = getDoubleFromString(_value_);
    }

    public String neutralUToString() {
        return neutralU != null ? neutralU.toString() : null;
    }

    /**
     * The tap step position used in `normal` network operation for this winding. For a `Fixed` tap changer indicates the current physical tap setting. The attribute shall be equal to or greater than lowStep and equal to or less than highStep.
     */
    private Integer normalStep; // Integer

    public Integer getNormalStep() {
        return normalStep;
    }

    public void setNormalStep(Integer _value_) {
        normalStep = _value_;
    }

    public void setNormalStep(String _value_) {
        normalStep = getIntegerFromString(_value_);
    }

    public String normalStepToString() {
        return normalStep != null ? normalStep.toString() : null;
    }

    /**
     * Tap changer position. Starting step for a steady state solution. Non integer values are allowed to support continuous tap variables. The reasons for continuous value are to support study cases where no discrete tap changer has yet been designed, a solution where a narrow voltage band forces the tap step to oscillate or to accommodate for a continuous solution as input. The attribute shall be equal to or greater than lowStep and equal to or less than highStep.
     */
    private Float step; // Float

    public Float getStep() {
        return step;
    }

    public void setStep(Float _value_) {
        step = _value_;
    }

    public void setStep(String _value_) {
        step = getFloatFromString(_value_);
    }

    public String stepToString() {
        return step != null ? step.toString() : null;
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
        return getAttribute("TapChanger", attrName);
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
        setAttribute("TapChanger", attrName, objectValue);
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
        setAttribute("TapChanger", attrName, stringValue);
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

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/CIM100#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("SvTapStep", new AttrDetails("TapChanger.SvTapStep", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("TapChangerControl", new AttrDetails("TapChanger.TapChangerControl", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("TapSchedules", new AttrDetails("TapChanger.TapSchedules", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("controlEnabled", new AttrDetails("TapChanger.controlEnabled", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("highStep", new AttrDetails("TapChanger.highStep", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("lowStep", new AttrDetails("TapChanger.lowStep", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ltcFlag", new AttrDetails("TapChanger.ltcFlag", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("neutralStep", new AttrDetails("TapChanger.neutralStep", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("neutralU", new AttrDetails("TapChanger.neutralU", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("normalStep", new AttrDetails("TapChanger.normalStep", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("step", new AttrDetails("TapChanger.step", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new TapChanger().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("SvTapStep", new GetterSetter(this::SvTapStepToString, this::setSvTapStep, null));
        map.put("TapChangerControl", new GetterSetter(this::TapChangerControlToString, this::setTapChangerControl, null));
        map.put("TapSchedules", new GetterSetter(this::TapSchedulesToString, this::setTapSchedules, null));
        map.put("controlEnabled", new GetterSetter(this::controlEnabledToString, null, this::setControlEnabled));
        map.put("highStep", new GetterSetter(this::highStepToString, null, this::setHighStep));
        map.put("lowStep", new GetterSetter(this::lowStepToString, null, this::setLowStep));
        map.put("ltcFlag", new GetterSetter(this::ltcFlagToString, null, this::setLtcFlag));
        map.put("neutralStep", new GetterSetter(this::neutralStepToString, null, this::setNeutralStep));
        map.put("neutralU", new GetterSetter(this::neutralUToString, null, this::setNeutralU));
        map.put("normalStep", new GetterSetter(this::normalStepToString, null, this::setNormalStep));
        map.put("step", new GetterSetter(this::stepToString, null, this::setStep));
        return map;
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
