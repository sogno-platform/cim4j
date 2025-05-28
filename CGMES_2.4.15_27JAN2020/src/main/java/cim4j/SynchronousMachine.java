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
     * Constructor.
     */
    public SynchronousMachine(String rdfid) {
        super("SynchronousMachine", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected SynchronousMachine(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Synchronous machines using this curve as default.
     */
    private ReactiveCapabilityCurve InitialReactiveCapabilityCurve; // ManyToOne

    public ReactiveCapabilityCurve getInitialReactiveCapabilityCurve() {
        return InitialReactiveCapabilityCurve;
    }

    public void setInitialReactiveCapabilityCurve(ReactiveCapabilityCurve _object_) {
        if (InitialReactiveCapabilityCurve != _object_) {
            InitialReactiveCapabilityCurve = _object_;
            InitialReactiveCapabilityCurve.setInitiallyUsedBySynchronousMachines(this);
        }
    }

    private static Object getInitialReactiveCapabilityCurve(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getInitialReactiveCapabilityCurve();
    }

    private static void setInitialReactiveCapabilityCurve(BaseClass _this_, Object _value_) {
        if (_value_ instanceof ReactiveCapabilityCurve) {
            ((SynchronousMachine) _this_).setInitialReactiveCapabilityCurve((ReactiveCapabilityCurve) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ReactiveCapabilityCurve");
        }
    }

    /**
     * Synchronous machine dynamics model used to describe dynamic behavior of this synchronous machine.
     *
     * NOT USED
     */
    private SynchronousMachineDynamics SynchronousMachineDynamics; // OneToOne

    public SynchronousMachineDynamics getSynchronousMachineDynamics() {
        return SynchronousMachineDynamics;
    }

    public void setSynchronousMachineDynamics(SynchronousMachineDynamics _object_) {
        if (SynchronousMachineDynamics != _object_) {
            SynchronousMachineDynamics = _object_;
            SynchronousMachineDynamics.setSynchronousMachine(this);
        }
    }

    private static Object getSynchronousMachineDynamics(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getSynchronousMachineDynamics();
    }

    private static void setSynchronousMachineDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof SynchronousMachineDynamics) {
            ((SynchronousMachine) _this_).setSynchronousMachineDynamics((SynchronousMachineDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not SynchronousMachineDynamics");
        }
    }

    /**
     * Indicates whether or not the generator is earthed. Used for short circuit data exchange according to IEC 60909
     */
    private Boolean earthing; // Boolean

    public Boolean getEarthing() {
        return earthing;
    }

    public void setEarthing(Boolean _value_) {
        earthing = _value_;
    }

    private static Object getEarthing(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getEarthing();
    }

    private static void setEarthing(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((SynchronousMachine) _this_).setEarthing((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachine) _this_).setEarthing(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Generator star point earthing resistance (Re). Used for short circuit data exchange according to IEC 60909
     */
    private Double earthingStarPointR; // Resistance

    public Double getEarthingStarPointR() {
        return earthingStarPointR;
    }

    public void setEarthingStarPointR(Double _value_) {
        earthingStarPointR = _value_;
    }

    private static Object getEarthingStarPointR(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getEarthingStarPointR();
    }

    private static void setEarthingStarPointR(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachine) _this_).setEarthingStarPointR((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachine) _this_).setEarthingStarPointR(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Generator star point earthing reactance (Xe). Used for short circuit data exchange according to IEC 60909
     */
    private Double earthingStarPointX; // Reactance

    public Double getEarthingStarPointX() {
        return earthingStarPointX;
    }

    public void setEarthingStarPointX(Double _value_) {
        earthingStarPointX = _value_;
    }

    private static Object getEarthingStarPointX(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getEarthingStarPointX();
    }

    private static void setEarthingStarPointX(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachine) _this_).setEarthingStarPointX((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachine) _this_).setEarthingStarPointX(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Steady-state short-circuit current (in A for the profile) of generator with compound excitation during 3-phase short circuit. - Ikk=0: Generator with no compound excitation. - Ikk?0: Generator with compound excitation. Ikk is used to calculate the minimum steady-state short-circuit current for generators with compound excitation (Section 4.6.1.2 in the IEC 60909-0) Used only for single fed short circuit on a generator. (Section 4.3.4.2. in the IEC 60909-0)
     */
    private Double ikk; // CurrentFlow

    public Double getIkk() {
        return ikk;
    }

    public void setIkk(Double _value_) {
        ikk = _value_;
    }

    private static Object getIkk(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getIkk();
    }

    private static void setIkk(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachine) _this_).setIkk((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachine) _this_).setIkk(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getMaxQ(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getMaxQ();
    }

    private static void setMaxQ(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachine) _this_).setMaxQ((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachine) _this_).setMaxQ(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getMinQ(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getMinQ();
    }

    private static void setMinQ(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachine) _this_).setMinQ((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachine) _this_).setMinQ(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Factor to calculate the breaking current (Section 4.5.2.1 in the IEC 60909-0). Used only for single fed short circuit on a generator (Section 4.3.4.2. in the IEC 60909-0).
     */
    private Double mu; // Simple_Float

    public Double getMu() {
        return mu;
    }

    public void setMu(Double _value_) {
        mu = _value_;
    }

    private static Object getMu(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getMu();
    }

    private static void setMu(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachine) _this_).setMu((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachine) _this_).setMu(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getOperatingMode(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getOperatingMode();
    }

    private static void setOperatingMode(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((SynchronousMachine) _this_).setOperatingMode((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Percent of the coordinated reactive control that comes from this machine.
     */
    private Double qPercent; // PerCent

    public Double getQPercent() {
        return qPercent;
    }

    public void setQPercent(Double _value_) {
        qPercent = _value_;
    }

    private static Object getQPercent(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getQPercent();
    }

    private static void setQPercent(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachine) _this_).setQPercent((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachine) _this_).setQPercent(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Equivalent resistance (RG) of generator. RG is considered for the calculation of all currents, except for the calculation of the peak current ip. Used for short circuit data exchange according to IEC 60909
     */
    private Double r; // Resistance

    public Double getR() {
        return r;
    }

    public void setR(Double _value_) {
        r = _value_;
    }

    private static Object getR(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getR();
    }

    private static void setR(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachine) _this_).setR((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachine) _this_).setR(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Zero sequence resistance of the synchronous machine.
     */
    private Double r0; // PU

    public Double getR0() {
        return r0;
    }

    public void setR0(Double _value_) {
        r0 = _value_;
    }

    private static Object getR0(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getR0();
    }

    private static void setR0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachine) _this_).setR0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachine) _this_).setR0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Negative sequence resistance.
     */
    private Double r2; // PU

    public Double getR2() {
        return r2;
    }

    public void setR2(Double _value_) {
        r2 = _value_;
    }

    private static Object getR2(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getR2();
    }

    private static void setR2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachine) _this_).setR2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachine) _this_).setR2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getReferencePriority(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getReferencePriority();
    }

    private static void setReferencePriority(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((SynchronousMachine) _this_).setReferencePriority((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachine) _this_).setReferencePriority(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
        }
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

    private static Object getSatDirectSubtransX(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getSatDirectSubtransX();
    }

    private static void setSatDirectSubtransX(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachine) _this_).setSatDirectSubtransX((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachine) _this_).setSatDirectSubtransX(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Direct-axes saturated synchronous reactance (xdsat); reciprocal of short-circuit ration. Used for short circuit data exchange, only for single fed short circuit on a generator. (Section 4.3.4.2. in the IEC 60909-0).
     */
    private Double satDirectSyncX; // PU

    public Double getSatDirectSyncX() {
        return satDirectSyncX;
    }

    public void setSatDirectSyncX(Double _value_) {
        satDirectSyncX = _value_;
    }

    private static Object getSatDirectSyncX(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getSatDirectSyncX();
    }

    private static void setSatDirectSyncX(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachine) _this_).setSatDirectSyncX((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachine) _this_).setSatDirectSyncX(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getSatDirectTransX(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getSatDirectTransX();
    }

    private static void setSatDirectTransX(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachine) _this_).setSatDirectTransX((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachine) _this_).setSatDirectTransX(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getShortCircuitRotorType(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getShortCircuitRotorType();
    }

    private static void setShortCircuitRotorType(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((SynchronousMachine) _this_).setShortCircuitRotorType((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
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

    private static Object getType(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getType();
    }

    private static void setType(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((SynchronousMachine) _this_).setType((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Range of generator voltage regulation (PG in the IEC 60909-0) used for calculation of the impedance correction factor KG defined in IEC 60909-0 This attribute is used to describe the operating voltage of the generating unit.
     */
    private Double voltageRegulationRange; // PerCent

    public Double getVoltageRegulationRange() {
        return voltageRegulationRange;
    }

    public void setVoltageRegulationRange(Double _value_) {
        voltageRegulationRange = _value_;
    }

    private static Object getVoltageRegulationRange(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getVoltageRegulationRange();
    }

    private static void setVoltageRegulationRange(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachine) _this_).setVoltageRegulationRange((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachine) _this_).setVoltageRegulationRange(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Zero sequence reactance of the synchronous machine.
     */
    private Double x0; // PU

    public Double getX0() {
        return x0;
    }

    public void setX0(Double _value_) {
        x0 = _value_;
    }

    private static Object getX0(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getX0();
    }

    private static void setX0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachine) _this_).setX0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachine) _this_).setX0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Negative sequence reactance.
     */
    private Double x2; // PU

    public Double getX2() {
        return x2;
    }

    public void setX2(Double _value_) {
        x2 = _value_;
    }

    private static Object getX2(BaseClass _this_) {
        return ((SynchronousMachine) _this_).getX2();
    }

    private static void setX2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachine) _this_).setX2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachine) _this_).setX2(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "SynchronousMachine", attrName));
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
                "SynchronousMachine", attrName, value));
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
            map.put("InitialReactiveCapabilityCurve", new AttrDetails("SynchronousMachine.InitialReactiveCapabilityCurve", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, SynchronousMachine::getInitialReactiveCapabilityCurve, SynchronousMachine::setInitialReactiveCapabilityCurve));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("SynchronousMachineDynamics", new AttrDetails("SynchronousMachine.SynchronousMachineDynamics", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, SynchronousMachine::getSynchronousMachineDynamics, SynchronousMachine::setSynchronousMachineDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("earthing", new AttrDetails("SynchronousMachine.earthing", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachine::getEarthing, SynchronousMachine::setEarthing));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("earthingStarPointR", new AttrDetails("SynchronousMachine.earthingStarPointR", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachine::getEarthingStarPointR, SynchronousMachine::setEarthingStarPointR));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("earthingStarPointX", new AttrDetails("SynchronousMachine.earthingStarPointX", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachine::getEarthingStarPointX, SynchronousMachine::setEarthingStarPointX));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ikk", new AttrDetails("SynchronousMachine.ikk", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachine::getIkk, SynchronousMachine::setIkk));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxQ", new AttrDetails("SynchronousMachine.maxQ", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachine::getMaxQ, SynchronousMachine::setMaxQ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minQ", new AttrDetails("SynchronousMachine.minQ", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachine::getMinQ, SynchronousMachine::setMinQ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("mu", new AttrDetails("SynchronousMachine.mu", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachine::getMu, SynchronousMachine::setMu));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("operatingMode", new AttrDetails("SynchronousMachine.operatingMode", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, SynchronousMachine::getOperatingMode, SynchronousMachine::setOperatingMode));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("qPercent", new AttrDetails("SynchronousMachine.qPercent", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachine::getQPercent, SynchronousMachine::setQPercent));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r", new AttrDetails("SynchronousMachine.r", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachine::getR, SynchronousMachine::setR));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r0", new AttrDetails("SynchronousMachine.r0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachine::getR0, SynchronousMachine::setR0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r2", new AttrDetails("SynchronousMachine.r2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachine::getR2, SynchronousMachine::setR2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("referencePriority", new AttrDetails("SynchronousMachine.referencePriority", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachine::getReferencePriority, SynchronousMachine::setReferencePriority));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("satDirectSubtransX", new AttrDetails("SynchronousMachine.satDirectSubtransX", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachine::getSatDirectSubtransX, SynchronousMachine::setSatDirectSubtransX));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("satDirectSyncX", new AttrDetails("SynchronousMachine.satDirectSyncX", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachine::getSatDirectSyncX, SynchronousMachine::setSatDirectSyncX));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("satDirectTransX", new AttrDetails("SynchronousMachine.satDirectTransX", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachine::getSatDirectTransX, SynchronousMachine::setSatDirectTransX));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("shortCircuitRotorType", new AttrDetails("SynchronousMachine.shortCircuitRotorType", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, SynchronousMachine::getShortCircuitRotorType, SynchronousMachine::setShortCircuitRotorType));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("type", new AttrDetails("SynchronousMachine.type", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, SynchronousMachine::getType, SynchronousMachine::setType));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("voltageRegulationRange", new AttrDetails("SynchronousMachine.voltageRegulationRange", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachine::getVoltageRegulationRange, SynchronousMachine::setVoltageRegulationRange));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x0", new AttrDetails("SynchronousMachine.x0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachine::getX0, SynchronousMachine::setX0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x2", new AttrDetails("SynchronousMachine.x2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachine::getX2, SynchronousMachine::setX2));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new SynchronousMachine(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.DY);
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
