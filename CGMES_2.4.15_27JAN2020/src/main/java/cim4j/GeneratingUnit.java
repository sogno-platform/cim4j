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
 * A single or set of synchronous machines for converting mechanical power into alternating-current power. For example, individual machines within a set may be defined for scheduling purposes while a single control signal is derived for the set. In this case there would be a GeneratingUnit for each member of the set and an additional GeneratingUnit corresponding to the set.
 */
@SuppressWarnings("unused")
public class GeneratingUnit extends Equipment {

    private static final Logging LOG = Logging.getLogger(GeneratingUnit.class);

    /**
     * Default constructor.
     */
    public GeneratingUnit() {
        setCimType("GeneratingUnit");
    }

    /**
     * ControlArea specifications for this generating unit.
     *
     * NOT USED
     */
    private Set<ControlAreaGeneratingUnit> ControlAreaGeneratingUnit = new HashSet<>(); // OneToMany

    public Set<ControlAreaGeneratingUnit> getControlAreaGeneratingUnit() {
        return ControlAreaGeneratingUnit;
    }

    public void setControlAreaGeneratingUnit(BaseClass _object_) {
        if (!(_object_ instanceof ControlAreaGeneratingUnit)) {
            throw new IllegalArgumentException("Object is not ControlAreaGeneratingUnit");
        }
        if (!ControlAreaGeneratingUnit.contains(_object_)) {
            ControlAreaGeneratingUnit.add((ControlAreaGeneratingUnit) _object_);
            ((ControlAreaGeneratingUnit) _object_).setGeneratingUnit(this);
        }
    }

    public String ControlAreaGeneratingUnitToString() {
        return getStringFromSet(ControlAreaGeneratingUnit);
    }

    /**
     * A generating unit may have a gross active power to net active power curve, describing the losses and auxiliary power requirements of the unit.
     *
     * NOT USED
     */
    private Set<GrossToNetActivePowerCurve> GrossToNetActivePowerCurves = new HashSet<>(); // OneToMany

    public Set<GrossToNetActivePowerCurve> getGrossToNetActivePowerCurves() {
        return GrossToNetActivePowerCurves;
    }

    public void setGrossToNetActivePowerCurves(BaseClass _object_) {
        if (!(_object_ instanceof GrossToNetActivePowerCurve)) {
            throw new IllegalArgumentException("Object is not GrossToNetActivePowerCurve");
        }
        if (!GrossToNetActivePowerCurves.contains(_object_)) {
            GrossToNetActivePowerCurves.add((GrossToNetActivePowerCurve) _object_);
            ((GrossToNetActivePowerCurve) _object_).setGeneratingUnit(this);
        }
    }

    public String GrossToNetActivePowerCurvesToString() {
        return getStringFromSet(GrossToNetActivePowerCurves);
    }

    /**
     * A synchronous machine may operate as a generator and as such becomes a member of a generating unit.
     *
     * NOT USED
     */
    private Set<RotatingMachine> RotatingMachine = new HashSet<>(); // OneToMany

    public Set<RotatingMachine> getRotatingMachine() {
        return RotatingMachine;
    }

    public void setRotatingMachine(BaseClass _object_) {
        if (!(_object_ instanceof RotatingMachine)) {
            throw new IllegalArgumentException("Object is not RotatingMachine");
        }
        if (!RotatingMachine.contains(_object_)) {
            RotatingMachine.add((RotatingMachine) _object_);
            ((RotatingMachine) _object_).setGeneratingUnit(this);
        }
    }

    public String RotatingMachineToString() {
        return getStringFromSet(RotatingMachine);
    }

    /**
     * The source of controls for a generating unit.
     */
    private String genControlSource; // GeneratorControlSource

    public String getGenControlSource() {
        return genControlSource;
    }

    public void setGenControlSource(String _value_) {
        genControlSource = _value_;
    }

    public String genControlSourceToString() {
        return genControlSource;
    }

    /**
     * Governor Speed Changer Droop.   This is the change in generator power output divided by the change in frequency normalized by the nominal power of the generator and the nominal frequency and expressed in percent and negated. A positive value of speed change droop provides additional generator output upon a drop in frequency.
     */
    private Double governorSCD; // PerCent

    public Double getGovernorSCD() {
        return governorSCD;
    }

    public void setGovernorSCD(Double _value_) {
        governorSCD = _value_;
    }

    public void setGovernorSCD(String _value_) {
        governorSCD = getDoubleFromString(_value_);
    }

    public String governorSCDToString() {
        return governorSCD != null ? governorSCD.toString() : null;
    }

    /**
     * Default initial active power  which is used to store a powerflow result for the initial active power for this unit in this network configuration.
     */
    private Double initialP; // ActivePower

    public Double getInitialP() {
        return initialP;
    }

    public void setInitialP(Double _value_) {
        initialP = _value_;
    }

    public void setInitialP(String _value_) {
        initialP = getDoubleFromString(_value_);
    }

    public String initialPToString() {
        return initialP != null ? initialP.toString() : null;
    }

    /**
     * Generating unit long term economic participation factor.
     */
    private Double longPF; // Simple_Float

    public Double getLongPF() {
        return longPF;
    }

    public void setLongPF(Double _value_) {
        longPF = _value_;
    }

    public void setLongPF(String _value_) {
        longPF = getDoubleFromString(_value_);
    }

    public String longPFToString() {
        return longPF != null ? longPF.toString() : null;
    }

    /**
     * This is the maximum operating active power limit the dispatcher can enter for this unit.
     */
    private Double maxOperatingP; // ActivePower

    public Double getMaxOperatingP() {
        return maxOperatingP;
    }

    public void setMaxOperatingP(Double _value_) {
        maxOperatingP = _value_;
    }

    public void setMaxOperatingP(String _value_) {
        maxOperatingP = getDoubleFromString(_value_);
    }

    public String maxOperatingPToString() {
        return maxOperatingP != null ? maxOperatingP.toString() : null;
    }

    /**
     * Maximum allowable spinning reserve. Spinning reserve will never be considered greater than this value regardless of the current operating point.
     */
    private Double maximumAllowableSpinningReserve; // ActivePower

    public Double getMaximumAllowableSpinningReserve() {
        return maximumAllowableSpinningReserve;
    }

    public void setMaximumAllowableSpinningReserve(Double _value_) {
        maximumAllowableSpinningReserve = _value_;
    }

    public void setMaximumAllowableSpinningReserve(String _value_) {
        maximumAllowableSpinningReserve = getDoubleFromString(_value_);
    }

    public String maximumAllowableSpinningReserveToString() {
        return maximumAllowableSpinningReserve != null ? maximumAllowableSpinningReserve.toString() : null;
    }

    /**
     * This is the minimum operating active power limit the dispatcher can enter for this unit.
     */
    private Double minOperatingP; // ActivePower

    public Double getMinOperatingP() {
        return minOperatingP;
    }

    public void setMinOperatingP(Double _value_) {
        minOperatingP = _value_;
    }

    public void setMinOperatingP(String _value_) {
        minOperatingP = getDoubleFromString(_value_);
    }

    public String minOperatingPToString() {
        return minOperatingP != null ? minOperatingP.toString() : null;
    }

    /**
     * The nominal power of the generating unit.  Used to give precise meaning to percentage based attributes such as the governor speed change droop (governorSCD attribute). The attribute shall be a positive value equal or less than RotatingMachine.ratedS.
     */
    private Double nominalP; // ActivePower

    public Double getNominalP() {
        return nominalP;
    }

    public void setNominalP(Double _value_) {
        nominalP = _value_;
    }

    public void setNominalP(String _value_) {
        nominalP = getDoubleFromString(_value_);
    }

    public String nominalPToString() {
        return nominalP != null ? nominalP.toString() : null;
    }

    /**
     * Generating unit economic participation factor.
     */
    private Double normalPF; // Simple_Float

    public Double getNormalPF() {
        return normalPF;
    }

    public void setNormalPF(Double _value_) {
        normalPF = _value_;
    }

    public void setNormalPF(String _value_) {
        normalPF = getDoubleFromString(_value_);
    }

    public String normalPFToString() {
        return normalPF != null ? normalPF.toString() : null;
    }

    /**
     * The unit`s gross rated maximum capacity (book value).
     */
    private Double ratedGrossMaxP; // ActivePower

    public Double getRatedGrossMaxP() {
        return ratedGrossMaxP;
    }

    public void setRatedGrossMaxP(Double _value_) {
        ratedGrossMaxP = _value_;
    }

    public void setRatedGrossMaxP(String _value_) {
        ratedGrossMaxP = getDoubleFromString(_value_);
    }

    public String ratedGrossMaxPToString() {
        return ratedGrossMaxP != null ? ratedGrossMaxP.toString() : null;
    }

    /**
     * The gross rated minimum generation level which the unit can safely operate at while delivering power to the transmission grid.
     */
    private Double ratedGrossMinP; // ActivePower

    public Double getRatedGrossMinP() {
        return ratedGrossMinP;
    }

    public void setRatedGrossMinP(Double _value_) {
        ratedGrossMinP = _value_;
    }

    public void setRatedGrossMinP(String _value_) {
        ratedGrossMinP = getDoubleFromString(_value_);
    }

    public String ratedGrossMinPToString() {
        return ratedGrossMinP != null ? ratedGrossMinP.toString() : null;
    }

    /**
     * The net rated maximum capacity determined by subtracting the auxiliary power used to operate the internal plant machinery from the rated gross maximum capacity.
     */
    private Double ratedNetMaxP; // ActivePower

    public Double getRatedNetMaxP() {
        return ratedNetMaxP;
    }

    public void setRatedNetMaxP(Double _value_) {
        ratedNetMaxP = _value_;
    }

    public void setRatedNetMaxP(String _value_) {
        ratedNetMaxP = getDoubleFromString(_value_);
    }

    public String ratedNetMaxPToString() {
        return ratedNetMaxP != null ? ratedNetMaxP.toString() : null;
    }

    /**
     * Generating unit short term economic participation factor.
     */
    private Double shortPF; // Simple_Float

    public Double getShortPF() {
        return shortPF;
    }

    public void setShortPF(Double _value_) {
        shortPF = _value_;
    }

    public void setShortPF(String _value_) {
        shortPF = getDoubleFromString(_value_);
    }

    public String shortPFToString() {
        return shortPF != null ? shortPF.toString() : null;
    }

    /**
     * The initial startup cost incurred for each start of the GeneratingUnit.
     */
    private Double startupCost; // Money

    public Double getStartupCost() {
        return startupCost;
    }

    public void setStartupCost(Double _value_) {
        startupCost = _value_;
    }

    public void setStartupCost(String _value_) {
        startupCost = getDoubleFromString(_value_);
    }

    public String startupCostToString() {
        return startupCost != null ? startupCost.toString() : null;
    }

    /**
     * The efficiency of the unit in converting the fuel into electrical energy.
     */
    private Double totalEfficiency; // PerCent

    public Double getTotalEfficiency() {
        return totalEfficiency;
    }

    public void setTotalEfficiency(Double _value_) {
        totalEfficiency = _value_;
    }

    public void setTotalEfficiency(String _value_) {
        totalEfficiency = getDoubleFromString(_value_);
    }

    public String totalEfficiencyToString() {
        return totalEfficiency != null ? totalEfficiency.toString() : null;
    }

    /**
     * The variable cost component of production per unit of ActivePower.
     */
    private Double variableCost; // Money

    public Double getVariableCost() {
        return variableCost;
    }

    public void setVariableCost(Double _value_) {
        variableCost = _value_;
    }

    public void setVariableCost(String _value_) {
        variableCost = getDoubleFromString(_value_);
    }

    public String variableCostToString() {
        return variableCost != null ? variableCost.toString() : null;
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
        return getAttribute("GeneratingUnit", attrName);
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
        setAttribute("GeneratingUnit", attrName, objectValue);
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
        setAttribute("GeneratingUnit", attrName, stringValue);
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
            map.put("ControlAreaGeneratingUnit", new AttrDetails("GeneratingUnit.ControlAreaGeneratingUnit", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("GrossToNetActivePowerCurves", new AttrDetails("GeneratingUnit.GrossToNetActivePowerCurves", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("RotatingMachine", new AttrDetails("GeneratingUnit.RotatingMachine", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("genControlSource", new AttrDetails("GeneratingUnit.genControlSource", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("governorSCD", new AttrDetails("GeneratingUnit.governorSCD", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("initialP", new AttrDetails("GeneratingUnit.initialP", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("longPF", new AttrDetails("GeneratingUnit.longPF", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxOperatingP", new AttrDetails("GeneratingUnit.maxOperatingP", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maximumAllowableSpinningReserve", new AttrDetails("GeneratingUnit.maximumAllowableSpinningReserve", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minOperatingP", new AttrDetails("GeneratingUnit.minOperatingP", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("nominalP", new AttrDetails("GeneratingUnit.nominalP", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("normalPF", new AttrDetails("GeneratingUnit.normalPF", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedGrossMaxP", new AttrDetails("GeneratingUnit.ratedGrossMaxP", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedGrossMinP", new AttrDetails("GeneratingUnit.ratedGrossMinP", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedNetMaxP", new AttrDetails("GeneratingUnit.ratedNetMaxP", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("shortPF", new AttrDetails("GeneratingUnit.shortPF", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("startupCost", new AttrDetails("GeneratingUnit.startupCost", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("totalEfficiency", new AttrDetails("GeneratingUnit.totalEfficiency", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("variableCost", new AttrDetails("GeneratingUnit.variableCost", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GeneratingUnit().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("ControlAreaGeneratingUnit", new GetterSetter(this::ControlAreaGeneratingUnitToString, this::setControlAreaGeneratingUnit, null));
        map.put("GrossToNetActivePowerCurves", new GetterSetter(this::GrossToNetActivePowerCurvesToString, this::setGrossToNetActivePowerCurves, null));
        map.put("RotatingMachine", new GetterSetter(this::RotatingMachineToString, this::setRotatingMachine, null));
        map.put("genControlSource", new GetterSetter(this::genControlSourceToString, null, this::setGenControlSource));
        map.put("governorSCD", new GetterSetter(this::governorSCDToString, null, this::setGovernorSCD));
        map.put("initialP", new GetterSetter(this::initialPToString, null, this::setInitialP));
        map.put("longPF", new GetterSetter(this::longPFToString, null, this::setLongPF));
        map.put("maxOperatingP", new GetterSetter(this::maxOperatingPToString, null, this::setMaxOperatingP));
        map.put("maximumAllowableSpinningReserve", new GetterSetter(this::maximumAllowableSpinningReserveToString, null, this::setMaximumAllowableSpinningReserve));
        map.put("minOperatingP", new GetterSetter(this::minOperatingPToString, null, this::setMinOperatingP));
        map.put("nominalP", new GetterSetter(this::nominalPToString, null, this::setNominalP));
        map.put("normalPF", new GetterSetter(this::normalPFToString, null, this::setNormalPF));
        map.put("ratedGrossMaxP", new GetterSetter(this::ratedGrossMaxPToString, null, this::setRatedGrossMaxP));
        map.put("ratedGrossMinP", new GetterSetter(this::ratedGrossMinPToString, null, this::setRatedGrossMinP));
        map.put("ratedNetMaxP", new GetterSetter(this::ratedNetMaxPToString, null, this::setRatedNetMaxP));
        map.put("shortPF", new GetterSetter(this::shortPFToString, null, this::setShortPF));
        map.put("startupCost", new GetterSetter(this::startupCostToString, null, this::setStartupCost));
        map.put("totalEfficiency", new GetterSetter(this::totalEfficiencyToString, null, this::setTotalEfficiency));
        map.put("variableCost", new GetterSetter(this::variableCostToString, null, this::setVariableCost));
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
