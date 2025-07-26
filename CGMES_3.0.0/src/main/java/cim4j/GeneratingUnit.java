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
     * Constructor.
     */
    public GeneratingUnit(String rdfid) {
        super("GeneratingUnit", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GeneratingUnit(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * ControlArea specifications for this generating unit.
     *
     * NOT USED
     */
    private Set<ControlAreaGeneratingUnit> ControlAreaGeneratingUnit = new HashSet<>(); // OneToMany

    private Set<String> ControlAreaGeneratingUnitIdSet = new HashSet<>();

    public Set<ControlAreaGeneratingUnit> getControlAreaGeneratingUnit() {
        return ControlAreaGeneratingUnit;
    }

    public void setControlAreaGeneratingUnit(ControlAreaGeneratingUnit _object_) {
        if (!ControlAreaGeneratingUnit.contains(_object_)) {
            ControlAreaGeneratingUnit.add(_object_);
            _object_.setGeneratingUnit(this);
            ControlAreaGeneratingUnitIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getControlAreaGeneratingUnit(BaseClass _this_) {
        var objs = ((GeneratingUnit) _this_).getControlAreaGeneratingUnit();
        var ids = ((GeneratingUnit) _this_).ControlAreaGeneratingUnitIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setControlAreaGeneratingUnit(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((GeneratingUnit) _this_).ControlAreaGeneratingUnitIdSet.add((String) _value_);
        } else if (_value_ instanceof ControlAreaGeneratingUnit) {
            ((GeneratingUnit) _this_).setControlAreaGeneratingUnit((ControlAreaGeneratingUnit) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ControlAreaGeneratingUnit");
        }
    }

    /**
     * A generating unit may have a gross active power to net active power curve, describing the losses and auxiliary power requirements of the unit.
     *
     * NOT USED
     */
    private Set<GrossToNetActivePowerCurve> GrossToNetActivePowerCurves = new HashSet<>(); // OneToMany

    private Set<String> GrossToNetActivePowerCurvesIdSet = new HashSet<>();

    public Set<GrossToNetActivePowerCurve> getGrossToNetActivePowerCurves() {
        return GrossToNetActivePowerCurves;
    }

    public void setGrossToNetActivePowerCurves(GrossToNetActivePowerCurve _object_) {
        if (!GrossToNetActivePowerCurves.contains(_object_)) {
            GrossToNetActivePowerCurves.add(_object_);
            _object_.setGeneratingUnit(this);
            GrossToNetActivePowerCurvesIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getGrossToNetActivePowerCurves(BaseClass _this_) {
        var objs = ((GeneratingUnit) _this_).getGrossToNetActivePowerCurves();
        var ids = ((GeneratingUnit) _this_).GrossToNetActivePowerCurvesIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setGrossToNetActivePowerCurves(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((GeneratingUnit) _this_).GrossToNetActivePowerCurvesIdSet.add((String) _value_);
        } else if (_value_ instanceof GrossToNetActivePowerCurve) {
            ((GeneratingUnit) _this_).setGrossToNetActivePowerCurves((GrossToNetActivePowerCurve) _value_);
        } else {
            throw new IllegalArgumentException("Object is not GrossToNetActivePowerCurve");
        }
    }

    /**
     * A synchronous machine may operate as a generator and as such becomes a member of a generating unit.
     *
     * NOT USED
     */
    private Set<RotatingMachine> RotatingMachine = new HashSet<>(); // OneToMany

    private Set<String> RotatingMachineIdSet = new HashSet<>();

    public Set<RotatingMachine> getRotatingMachine() {
        return RotatingMachine;
    }

    public void setRotatingMachine(RotatingMachine _object_) {
        if (!RotatingMachine.contains(_object_)) {
            RotatingMachine.add(_object_);
            _object_.setGeneratingUnit(this);
            RotatingMachineIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getRotatingMachine(BaseClass _this_) {
        var objs = ((GeneratingUnit) _this_).getRotatingMachine();
        var ids = ((GeneratingUnit) _this_).RotatingMachineIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setRotatingMachine(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((GeneratingUnit) _this_).RotatingMachineIdSet.add((String) _value_);
        } else if (_value_ instanceof RotatingMachine) {
            ((GeneratingUnit) _this_).setRotatingMachine((RotatingMachine) _value_);
        } else {
            throw new IllegalArgumentException("Object is not RotatingMachine");
        }
    }

    /**
     * The source of controls for a generating unit.  Defines the control status of the generating unit.
     */
    private String genControlSource; // GeneratorControlSource

    public String getGenControlSource() {
        return genControlSource;
    }

    public void setGenControlSource(String _value_) {
        genControlSource = _value_;
    }

    private static Object getGenControlSource(BaseClass _this_) {
        return ((GeneratingUnit) _this_).getGenControlSource();
    }

    private static void setGenControlSource(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((GeneratingUnit) _this_).setGenControlSource((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
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

    private static Object getGovernorSCD(BaseClass _this_) {
        return ((GeneratingUnit) _this_).getGovernorSCD();
    }

    private static void setGovernorSCD(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GeneratingUnit) _this_).setGovernorSCD((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GeneratingUnit) _this_).setGovernorSCD(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Generating unit long term economic participation factor.
     */
    private Float longPF; // Float

    public Float getLongPF() {
        return longPF;
    }

    public void setLongPF(Float _value_) {
        longPF = _value_;
    }

    private static Object getLongPF(BaseClass _this_) {
        return ((GeneratingUnit) _this_).getLongPF();
    }

    private static void setLongPF(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GeneratingUnit) _this_).setLongPF((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GeneratingUnit) _this_).setLongPF(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
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

    private static Object getMaxOperatingP(BaseClass _this_) {
        return ((GeneratingUnit) _this_).getMaxOperatingP();
    }

    private static void setMaxOperatingP(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GeneratingUnit) _this_).setMaxOperatingP((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GeneratingUnit) _this_).setMaxOperatingP(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getMaximumAllowableSpinningReserve(BaseClass _this_) {
        return ((GeneratingUnit) _this_).getMaximumAllowableSpinningReserve();
    }

    private static void setMaximumAllowableSpinningReserve(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GeneratingUnit) _this_).setMaximumAllowableSpinningReserve((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GeneratingUnit) _this_).setMaximumAllowableSpinningReserve(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getMinOperatingP(BaseClass _this_) {
        return ((GeneratingUnit) _this_).getMinOperatingP();
    }

    private static void setMinOperatingP(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GeneratingUnit) _this_).setMinOperatingP((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GeneratingUnit) _this_).setMinOperatingP(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * The nominal power of the generating unit.  Used to give precise meaning to percentage based attributes such as the governor speed change droop (governorSCD attribute). The attribute shall be a positive value equal to or less than RotatingMachine.ratedS.
     */
    private Double nominalP; // ActivePower

    public Double getNominalP() {
        return nominalP;
    }

    public void setNominalP(Double _value_) {
        nominalP = _value_;
    }

    private static Object getNominalP(BaseClass _this_) {
        return ((GeneratingUnit) _this_).getNominalP();
    }

    private static void setNominalP(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GeneratingUnit) _this_).setNominalP((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GeneratingUnit) _this_).setNominalP(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Generating unit economic participation factor.  The sum of the participation factors across generating units does not have to sum to one.  It is used for representing distributed slack participation factor. The attribute shall be a positive value or zero.
     */
    private Float normalPF; // Float

    public Float getNormalPF() {
        return normalPF;
    }

    public void setNormalPF(Float _value_) {
        normalPF = _value_;
    }

    private static Object getNormalPF(BaseClass _this_) {
        return ((GeneratingUnit) _this_).getNormalPF();
    }

    private static void setNormalPF(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GeneratingUnit) _this_).setNormalPF((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GeneratingUnit) _this_).setNormalPF(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * The unit`s gross rated maximum capacity (book value). The attribute shall be a positive value.
     */
    private Double ratedGrossMaxP; // ActivePower

    public Double getRatedGrossMaxP() {
        return ratedGrossMaxP;
    }

    public void setRatedGrossMaxP(Double _value_) {
        ratedGrossMaxP = _value_;
    }

    private static Object getRatedGrossMaxP(BaseClass _this_) {
        return ((GeneratingUnit) _this_).getRatedGrossMaxP();
    }

    private static void setRatedGrossMaxP(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GeneratingUnit) _this_).setRatedGrossMaxP((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GeneratingUnit) _this_).setRatedGrossMaxP(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * The gross rated minimum generation level which the unit can safely operate at while delivering power to the transmission grid. The attribute shall be a positive value.
     */
    private Double ratedGrossMinP; // ActivePower

    public Double getRatedGrossMinP() {
        return ratedGrossMinP;
    }

    public void setRatedGrossMinP(Double _value_) {
        ratedGrossMinP = _value_;
    }

    private static Object getRatedGrossMinP(BaseClass _this_) {
        return ((GeneratingUnit) _this_).getRatedGrossMinP();
    }

    private static void setRatedGrossMinP(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GeneratingUnit) _this_).setRatedGrossMinP((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GeneratingUnit) _this_).setRatedGrossMinP(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * The net rated maximum capacity determined by subtracting the auxiliary power used to operate the internal plant machinery from the rated gross maximum capacity. The attribute shall be a positive value.
     */
    private Double ratedNetMaxP; // ActivePower

    public Double getRatedNetMaxP() {
        return ratedNetMaxP;
    }

    public void setRatedNetMaxP(Double _value_) {
        ratedNetMaxP = _value_;
    }

    private static Object getRatedNetMaxP(BaseClass _this_) {
        return ((GeneratingUnit) _this_).getRatedNetMaxP();
    }

    private static void setRatedNetMaxP(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GeneratingUnit) _this_).setRatedNetMaxP((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GeneratingUnit) _this_).setRatedNetMaxP(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Generating unit short term economic participation factor.
     */
    private Float shortPF; // Float

    public Float getShortPF() {
        return shortPF;
    }

    public void setShortPF(Float _value_) {
        shortPF = _value_;
    }

    private static Object getShortPF(BaseClass _this_) {
        return ((GeneratingUnit) _this_).getShortPF();
    }

    private static void setShortPF(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GeneratingUnit) _this_).setShortPF((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GeneratingUnit) _this_).setShortPF(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
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

    private static Object getStartupCost(BaseClass _this_) {
        return ((GeneratingUnit) _this_).getStartupCost();
    }

    private static void setStartupCost(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GeneratingUnit) _this_).setStartupCost((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GeneratingUnit) _this_).setStartupCost(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time it takes to get the unit on-line, from the time that the prime mover mechanical power is applied.
     */
    private Double startupTime; // Seconds

    public Double getStartupTime() {
        return startupTime;
    }

    public void setStartupTime(Double _value_) {
        startupTime = _value_;
    }

    private static Object getStartupTime(BaseClass _this_) {
        return ((GeneratingUnit) _this_).getStartupTime();
    }

    private static void setStartupTime(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GeneratingUnit) _this_).setStartupTime((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GeneratingUnit) _this_).setStartupTime(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getTotalEfficiency(BaseClass _this_) {
        return ((GeneratingUnit) _this_).getTotalEfficiency();
    }

    private static void setTotalEfficiency(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GeneratingUnit) _this_).setTotalEfficiency((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GeneratingUnit) _this_).setTotalEfficiency(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getVariableCost(BaseClass _this_) {
        return ((GeneratingUnit) _this_).getVariableCost();
    }

    private static void setVariableCost(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GeneratingUnit) _this_).setVariableCost((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GeneratingUnit) _this_).setVariableCost(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GeneratingUnit", attrName));
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
                "GeneratingUnit", attrName, value));
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
            profiles.add(CGMESProfile.EQ);
            map.put("ControlAreaGeneratingUnit", new AttrDetails("GeneratingUnit.ControlAreaGeneratingUnit", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, GeneratingUnit::getControlAreaGeneratingUnit, GeneratingUnit::setControlAreaGeneratingUnit));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("GrossToNetActivePowerCurves", new AttrDetails("GeneratingUnit.GrossToNetActivePowerCurves", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, GeneratingUnit::getGrossToNetActivePowerCurves, GeneratingUnit::setGrossToNetActivePowerCurves));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("RotatingMachine", new AttrDetails("GeneratingUnit.RotatingMachine", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, GeneratingUnit::getRotatingMachine, GeneratingUnit::setRotatingMachine));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("genControlSource", new AttrDetails("GeneratingUnit.genControlSource", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, GeneratingUnit::getGenControlSource, GeneratingUnit::setGenControlSource));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("governorSCD", new AttrDetails("GeneratingUnit.governorSCD", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GeneratingUnit::getGovernorSCD, GeneratingUnit::setGovernorSCD));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("longPF", new AttrDetails("GeneratingUnit.longPF", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GeneratingUnit::getLongPF, GeneratingUnit::setLongPF));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxOperatingP", new AttrDetails("GeneratingUnit.maxOperatingP", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GeneratingUnit::getMaxOperatingP, GeneratingUnit::setMaxOperatingP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maximumAllowableSpinningReserve", new AttrDetails("GeneratingUnit.maximumAllowableSpinningReserve", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GeneratingUnit::getMaximumAllowableSpinningReserve, GeneratingUnit::setMaximumAllowableSpinningReserve));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minOperatingP", new AttrDetails("GeneratingUnit.minOperatingP", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GeneratingUnit::getMinOperatingP, GeneratingUnit::setMinOperatingP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("nominalP", new AttrDetails("GeneratingUnit.nominalP", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GeneratingUnit::getNominalP, GeneratingUnit::setNominalP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("normalPF", new AttrDetails("GeneratingUnit.normalPF", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GeneratingUnit::getNormalPF, GeneratingUnit::setNormalPF));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedGrossMaxP", new AttrDetails("GeneratingUnit.ratedGrossMaxP", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GeneratingUnit::getRatedGrossMaxP, GeneratingUnit::setRatedGrossMaxP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedGrossMinP", new AttrDetails("GeneratingUnit.ratedGrossMinP", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GeneratingUnit::getRatedGrossMinP, GeneratingUnit::setRatedGrossMinP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedNetMaxP", new AttrDetails("GeneratingUnit.ratedNetMaxP", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GeneratingUnit::getRatedNetMaxP, GeneratingUnit::setRatedNetMaxP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("shortPF", new AttrDetails("GeneratingUnit.shortPF", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GeneratingUnit::getShortPF, GeneratingUnit::setShortPF));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("startupCost", new AttrDetails("GeneratingUnit.startupCost", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GeneratingUnit::getStartupCost, GeneratingUnit::setStartupCost));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("startupTime", new AttrDetails("GeneratingUnit.startupTime", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GeneratingUnit::getStartupTime, GeneratingUnit::setStartupTime));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("totalEfficiency", new AttrDetails("GeneratingUnit.totalEfficiency", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GeneratingUnit::getTotalEfficiency, GeneratingUnit::setTotalEfficiency));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("variableCost", new AttrDetails("GeneratingUnit.variableCost", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GeneratingUnit::getVariableCost, GeneratingUnit::setVariableCost));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GeneratingUnit(null).allAttrDetailsMap());
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
