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
 * An electromechanical device that operates with shaft rotating synchronously with the network. It is a single machine operating either as a generator or synchronous condenser or pump.
 */
@SuppressWarnings("unused")
public class SynchronousMachine extends RotatingMachine {

    private static final Logging LOG = Logging.getLogger(SynchronousMachine.class);

    /**
     * Default constructor.
     */
    public SynchronousMachine() {
        setCimType("SynchronousMachine");
    }

    /**
     * The default reactive capability curve for use by a synchronous machine.
     */
    private ReactiveCapabilityCurve InitialReactiveCapabilityCurve; // ManyToOne

    public ReactiveCapabilityCurve getInitialReactiveCapabilityCurve() {
        return InitialReactiveCapabilityCurve;
    }

    public void setInitialReactiveCapabilityCurve(BaseClass _object_) {
        if (!(_object_ instanceof ReactiveCapabilityCurve)) {
            throw new IllegalArgumentException("Object is not ReactiveCapabilityCurve");
        }
        if (InitialReactiveCapabilityCurve != _object_) {
            InitialReactiveCapabilityCurve = (ReactiveCapabilityCurve) _object_;
            InitialReactiveCapabilityCurve.setInitiallyUsedBySynchronousMachines(this);
        }
    }

    public String InitialReactiveCapabilityCurveToString() {
        return InitialReactiveCapabilityCurve != null ? InitialReactiveCapabilityCurve.getRdfid() : null;
    }

    /**
     * Synchronous machine dynamics model used to describe dynamic behaviour of this synchronous machine.
     *
     * NOT USED
     */
    private SynchronousMachineDynamics SynchronousMachineDynamics; // OneToOne

    public SynchronousMachineDynamics getSynchronousMachineDynamics() {
        return SynchronousMachineDynamics;
    }

    public void setSynchronousMachineDynamics(BaseClass _object_) {
        if (!(_object_ instanceof SynchronousMachineDynamics)) {
            throw new IllegalArgumentException("Object is not SynchronousMachineDynamics");
        }
        if (SynchronousMachineDynamics != _object_) {
            SynchronousMachineDynamics = (SynchronousMachineDynamics) _object_;
            SynchronousMachineDynamics.setSynchronousMachine(this);
        }
    }

    public String SynchronousMachineDynamicsToString() {
        return SynchronousMachineDynamics != null ? SynchronousMachineDynamics.getRdfid() : null;
    }

    /**
     * Indicates whether or not the generator is earthed. Used for short circuit data exchange according to IEC 60909.
     */
    private Boolean earthing; // Boolean

    public Boolean getEarthing() {
        return earthing;
    }

    public void setEarthing(Boolean _value_) {
        earthing = _value_;
    }

    public void setEarthing(String _value_) {
        earthing = getBooleanFromString(_value_);
    }

    public String earthingToString() {
        return earthing != null ? earthing.toString() : null;
    }

    /**
     * Generator star point earthing resistance (Re). Used for short circuit data exchange according to IEC 60909.
     */
    private Double earthingStarPointR; // Resistance

    public Double getEarthingStarPointR() {
        return earthingStarPointR;
    }

    public void setEarthingStarPointR(Double _value_) {
        earthingStarPointR = _value_;
    }

    public void setEarthingStarPointR(String _value_) {
        earthingStarPointR = getDoubleFromString(_value_);
    }

    public String earthingStarPointRToString() {
        return earthingStarPointR != null ? earthingStarPointR.toString() : null;
    }

    /**
     * Generator star point earthing reactance (Xe). Used for short circuit data exchange according to IEC 60909.
     */
    private Double earthingStarPointX; // Reactance

    public Double getEarthingStarPointX() {
        return earthingStarPointX;
    }

    public void setEarthingStarPointX(Double _value_) {
        earthingStarPointX = _value_;
    }

    public void setEarthingStarPointX(String _value_) {
        earthingStarPointX = getDoubleFromString(_value_);
    }

    public String earthingStarPointXToString() {
        return earthingStarPointX != null ? earthingStarPointX.toString() : null;
    }

    /**
     * Steady-state short-circuit current (in A for the profile) of generator with compound excitation during 3-phase short circuit. - Ikk=0: Generator with no compound excitation. - Ikk&amp;lt;&amp;gt;0: Generator with compound excitation. Ikk is used to calculate the minimum steady-state short-circuit current for generators with compound excitation. (4.6.1.2 in IEC 60909-0:2001). Used only for single fed short circuit on a generator. (4.3.4.2. in IEC 60909-0:2001).
     */
    private Double ikk; // CurrentFlow

    public Double getIkk() {
        return ikk;
    }

    public void setIkk(Double _value_) {
        ikk = _value_;
    }

    public void setIkk(String _value_) {
        ikk = getDoubleFromString(_value_);
    }

    public String ikkToString() {
        return ikk != null ? ikk.toString() : null;
    }

    /**
     * Maximum reactive power limit. This is the maximum (nameplate) limit for the unit.
     */
    private Double maxQ; // ReactivePower

    public Double getMaxQ() {
        return maxQ;
    }

    public void setMaxQ(Double _value_) {
        maxQ = _value_;
    }

    public void setMaxQ(String _value_) {
        maxQ = getDoubleFromString(_value_);
    }

    public String maxQToString() {
        return maxQ != null ? maxQ.toString() : null;
    }

    /**
     * Minimum reactive power limit for the unit.
     */
    private Double minQ; // ReactivePower

    public Double getMinQ() {
        return minQ;
    }

    public void setMinQ(Double _value_) {
        minQ = _value_;
    }

    public void setMinQ(String _value_) {
        minQ = getDoubleFromString(_value_);
    }

    public String minQToString() {
        return minQ != null ? minQ.toString() : null;
    }

    /**
     * Factor to calculate the breaking current (Section 4.5.2.1 in IEC 60909-0). Used only for single fed short circuit on a generator (Section 4.3.4.2. in IEC 60909-0).
     */
    private Float mu; // Float

    public Float getMu() {
        return mu;
    }

    public void setMu(Float _value_) {
        mu = _value_;
    }

    public void setMu(String _value_) {
        mu = getFloatFromString(_value_);
    }

    public String muToString() {
        return mu != null ? mu.toString() : null;
    }

    /**
     * Current mode of operation.
     */
    private String operatingMode; // SynchronousMachineOperatingMode

    public String getOperatingMode() {
        return operatingMode;
    }

    public void setOperatingMode(String _value_) {
        operatingMode = _value_;
    }

    public String operatingModeToString() {
        return operatingMode;
    }

    /**
     * Part of the coordinated reactive control that comes from this machine. The attribute is used as a participation factor not necessarily summing up to 100% for the participating devices in the control.
     */
    private Double qPercent; // PerCent

    public Double getQPercent() {
        return qPercent;
    }

    public void setQPercent(Double _value_) {
        qPercent = _value_;
    }

    public void setQPercent(String _value_) {
        qPercent = getDoubleFromString(_value_);
    }

    public String qPercentToString() {
        return qPercent != null ? qPercent.toString() : null;
    }

    /**
     * Equivalent resistance (RG) of generator. RG is considered for the calculation of all currents, except for the calculation of the peak current ip. Used for short circuit data exchange according to IEC 60909.
     */
    private Double r; // Resistance

    public Double getR() {
        return r;
    }

    public void setR(Double _value_) {
        r = _value_;
    }

    public void setR(String _value_) {
        r = getDoubleFromString(_value_);
    }

    public String rToString() {
        return r != null ? r.toString() : null;
    }

    /**
     * Zero sequence resistance of the synchronous machine.
     */
    private Double r0; // Resistance

    public Double getR0() {
        return r0;
    }

    public void setR0(Double _value_) {
        r0 = _value_;
    }

    public void setR0(String _value_) {
        r0 = getDoubleFromString(_value_);
    }

    public String r0ToString() {
        return r0 != null ? r0.toString() : null;
    }

    /**
     * Negative sequence resistance.
     */
    private Double r2; // Resistance

    public Double getR2() {
        return r2;
    }

    public void setR2(Double _value_) {
        r2 = _value_;
    }

    public void setR2(String _value_) {
        r2 = getDoubleFromString(_value_);
    }

    public String r2ToString() {
        return r2 != null ? r2.toString() : null;
    }

    /**
     * Priority of unit for use as powerflow voltage phase angle reference bus selection. 0 = don t care (default) 1 = highest priority. 2 is less than 1 and so on.
     */
    private Integer referencePriority; // Integer

    public Integer getReferencePriority() {
        return referencePriority;
    }

    public void setReferencePriority(Integer _value_) {
        referencePriority = _value_;
    }

    public void setReferencePriority(String _value_) {
        referencePriority = getIntegerFromString(_value_);
    }

    public String referencePriorityToString() {
        return referencePriority != null ? referencePriority.toString() : null;
    }

    /**
     * Direct-axis subtransient reactance saturated, also known as Xd`sat.
     */
    private Double satDirectSubtransX; // PU

    public Double getSatDirectSubtransX() {
        return satDirectSubtransX;
    }

    public void setSatDirectSubtransX(Double _value_) {
        satDirectSubtransX = _value_;
    }

    public void setSatDirectSubtransX(String _value_) {
        satDirectSubtransX = getDoubleFromString(_value_);
    }

    public String satDirectSubtransXToString() {
        return satDirectSubtransX != null ? satDirectSubtransX.toString() : null;
    }

    /**
     * Direct-axes saturated synchronous reactance (xdsat); reciprocal of short-circuit ration. Used for short circuit data exchange, only for single fed short circuit on a generator. (4.3.4.2. in IEC 60909-0:2001).
     */
    private Double satDirectSyncX; // PU

    public Double getSatDirectSyncX() {
        return satDirectSyncX;
    }

    public void setSatDirectSyncX(Double _value_) {
        satDirectSyncX = _value_;
    }

    public void setSatDirectSyncX(String _value_) {
        satDirectSyncX = getDoubleFromString(_value_);
    }

    public String satDirectSyncXToString() {
        return satDirectSyncX != null ? satDirectSyncX.toString() : null;
    }

    /**
     * Saturated Direct-axis transient reactance. The attribute is primarily used for short circuit calculations according to ANSI.
     */
    private Double satDirectTransX; // PU

    public Double getSatDirectTransX() {
        return satDirectTransX;
    }

    public void setSatDirectTransX(Double _value_) {
        satDirectTransX = _value_;
    }

    public void setSatDirectTransX(String _value_) {
        satDirectTransX = getDoubleFromString(_value_);
    }

    public String satDirectTransXToString() {
        return satDirectTransX != null ? satDirectTransX.toString() : null;
    }

    /**
     * Type of rotor, used by short circuit applications, only for single fed short circuit according to IEC 60909.
     */
    private String shortCircuitRotorType; // ShortCircuitRotorKind

    public String getShortCircuitRotorType() {
        return shortCircuitRotorType;
    }

    public void setShortCircuitRotorType(String _value_) {
        shortCircuitRotorType = _value_;
    }

    public String shortCircuitRotorTypeToString() {
        return shortCircuitRotorType;
    }

    /**
     * Modes that this synchronous machine can operate in.
     */
    private String type; // SynchronousMachineKind

    public String getType() {
        return type;
    }

    public void setType(String _value_) {
        type = _value_;
    }

    public String typeToString() {
        return type;
    }

    /**
     * Range of generator voltage regulation (PG in IEC 60909-0) used for calculation of the impedance correction factor KG defined in IEC 60909-0. This attribute is used to describe the operating voltage of the generating unit.
     */
    private Double voltageRegulationRange; // PerCent

    public Double getVoltageRegulationRange() {
        return voltageRegulationRange;
    }

    public void setVoltageRegulationRange(Double _value_) {
        voltageRegulationRange = _value_;
    }

    public void setVoltageRegulationRange(String _value_) {
        voltageRegulationRange = getDoubleFromString(_value_);
    }

    public String voltageRegulationRangeToString() {
        return voltageRegulationRange != null ? voltageRegulationRange.toString() : null;
    }

    /**
     * Zero sequence reactance of the synchronous machine.
     */
    private Double x0; // Reactance

    public Double getX0() {
        return x0;
    }

    public void setX0(Double _value_) {
        x0 = _value_;
    }

    public void setX0(String _value_) {
        x0 = getDoubleFromString(_value_);
    }

    public String x0ToString() {
        return x0 != null ? x0.toString() : null;
    }

    /**
     * Negative sequence reactance.
     */
    private Double x2; // Reactance

    public Double getX2() {
        return x2;
    }

    public void setX2(Double _value_) {
        x2 = _value_;
    }

    public void setX2(String _value_) {
        x2 = getDoubleFromString(_value_);
    }

    public String x2ToString() {
        return x2 != null ? x2.toString() : null;
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
        return getAttribute("SynchronousMachine", attrName);
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
        setAttribute("SynchronousMachine", attrName, objectValue);
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
        setAttribute("SynchronousMachine", attrName, stringValue);
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
            profiles.add(CGMESProfile.EQ);
            map.put("InitialReactiveCapabilityCurve", new AttrDetails("SynchronousMachine.InitialReactiveCapabilityCurve", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("SynchronousMachineDynamics", new AttrDetails("SynchronousMachine.SynchronousMachineDynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("earthing", new AttrDetails("SynchronousMachine.earthing", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("earthingStarPointR", new AttrDetails("SynchronousMachine.earthingStarPointR", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("earthingStarPointX", new AttrDetails("SynchronousMachine.earthingStarPointX", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("ikk", new AttrDetails("SynchronousMachine.ikk", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxQ", new AttrDetails("SynchronousMachine.maxQ", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minQ", new AttrDetails("SynchronousMachine.minQ", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("mu", new AttrDetails("SynchronousMachine.mu", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("operatingMode", new AttrDetails("SynchronousMachine.operatingMode", true, "http://iec.ch/TC57/CIM100#", profiles, false, true));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("qPercent", new AttrDetails("SynchronousMachine.qPercent", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("r", new AttrDetails("SynchronousMachine.r", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("r0", new AttrDetails("SynchronousMachine.r0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("r2", new AttrDetails("SynchronousMachine.r2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("referencePriority", new AttrDetails("SynchronousMachine.referencePriority", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("satDirectSubtransX", new AttrDetails("SynchronousMachine.satDirectSubtransX", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("satDirectSyncX", new AttrDetails("SynchronousMachine.satDirectSyncX", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("satDirectTransX", new AttrDetails("SynchronousMachine.satDirectTransX", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("shortCircuitRotorType", new AttrDetails("SynchronousMachine.shortCircuitRotorType", true, "http://iec.ch/TC57/CIM100#", profiles, false, true));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("type", new AttrDetails("SynchronousMachine.type", true, "http://iec.ch/TC57/CIM100#", profiles, false, true));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("voltageRegulationRange", new AttrDetails("SynchronousMachine.voltageRegulationRange", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("x0", new AttrDetails("SynchronousMachine.x0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("x2", new AttrDetails("SynchronousMachine.x2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new SynchronousMachine().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("InitialReactiveCapabilityCurve", new GetterSetter(this::InitialReactiveCapabilityCurveToString, this::setInitialReactiveCapabilityCurve, null));
        map.put("SynchronousMachineDynamics", new GetterSetter(this::SynchronousMachineDynamicsToString, this::setSynchronousMachineDynamics, null));
        map.put("earthing", new GetterSetter(this::earthingToString, null, this::setEarthing));
        map.put("earthingStarPointR", new GetterSetter(this::earthingStarPointRToString, null, this::setEarthingStarPointR));
        map.put("earthingStarPointX", new GetterSetter(this::earthingStarPointXToString, null, this::setEarthingStarPointX));
        map.put("ikk", new GetterSetter(this::ikkToString, null, this::setIkk));
        map.put("maxQ", new GetterSetter(this::maxQToString, null, this::setMaxQ));
        map.put("minQ", new GetterSetter(this::minQToString, null, this::setMinQ));
        map.put("mu", new GetterSetter(this::muToString, null, this::setMu));
        map.put("operatingMode", new GetterSetter(this::operatingModeToString, null, this::setOperatingMode));
        map.put("qPercent", new GetterSetter(this::qPercentToString, null, this::setQPercent));
        map.put("r", new GetterSetter(this::rToString, null, this::setR));
        map.put("r0", new GetterSetter(this::r0ToString, null, this::setR0));
        map.put("r2", new GetterSetter(this::r2ToString, null, this::setR2));
        map.put("referencePriority", new GetterSetter(this::referencePriorityToString, null, this::setReferencePriority));
        map.put("satDirectSubtransX", new GetterSetter(this::satDirectSubtransXToString, null, this::setSatDirectSubtransX));
        map.put("satDirectSyncX", new GetterSetter(this::satDirectSyncXToString, null, this::setSatDirectSyncX));
        map.put("satDirectTransX", new GetterSetter(this::satDirectTransXToString, null, this::setSatDirectTransX));
        map.put("shortCircuitRotorType", new GetterSetter(this::shortCircuitRotorTypeToString, null, this::setShortCircuitRotorType));
        map.put("type", new GetterSetter(this::typeToString, null, this::setType));
        map.put("voltageRegulationRange", new GetterSetter(this::voltageRegulationRangeToString, null, this::setVoltageRegulationRange));
        map.put("x0", new GetterSetter(this::x0ToString, null, this::setX0));
        map.put("x2", new GetterSetter(this::x2ToString, null, this::setX2));
        return map;
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.DY);
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.SC);
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
