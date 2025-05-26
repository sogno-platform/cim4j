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
 * A rotating machine whose shaft rotates asynchronously with the electrical field.  Also known as an induction machine with no external connection to the rotor windings, e.g. squirrel-cage induction machine.
 */
@SuppressWarnings("unused")
public class AsynchronousMachine extends RotatingMachine {

    private static final Logging LOG = Logging.getLogger(AsynchronousMachine.class);

    /**
     * Constructor.
     */
    public AsynchronousMachine(String rdfid) {
        super("AsynchronousMachine", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected AsynchronousMachine(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Asynchronous machine dynamics model used to describe dynamic behaviour of this asynchronous machine.
     *
     * NOT USED
     */
    private AsynchronousMachineDynamics AsynchronousMachineDynamics; // OneToOne

    public AsynchronousMachineDynamics getAsynchronousMachineDynamics() {
        return AsynchronousMachineDynamics;
    }

    public void setAsynchronousMachineDynamics(AsynchronousMachineDynamics _object_) {
        if (AsynchronousMachineDynamics != _object_) {
            AsynchronousMachineDynamics = _object_;
            AsynchronousMachineDynamics.setAsynchronousMachine(this);
        }
    }

    private static Object getAsynchronousMachineDynamics(BaseClass _this_) {
        return ((AsynchronousMachine) _this_).getAsynchronousMachineDynamics();
    }

    private static void setAsynchronousMachineDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof AsynchronousMachineDynamics) {
            ((AsynchronousMachine) _this_).setAsynchronousMachineDynamics((AsynchronousMachineDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not AsynchronousMachineDynamics");
        }
    }

    /**
     * Indicates the type of Asynchronous Machine (motor or generator).
     */
    private String asynchronousMachineType; // AsynchronousMachineKind

    public String getAsynchronousMachineType() {
        return asynchronousMachineType;
    }

    public void setAsynchronousMachineType(String _value_) {
        asynchronousMachineType = _value_;
    }

    private static Object getAsynchronousMachineType(BaseClass _this_) {
        return ((AsynchronousMachine) _this_).getAsynchronousMachineType();
    }

    private static void setAsynchronousMachineType(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((AsynchronousMachine) _this_).setAsynchronousMachineType((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Indicates whether the machine is a converter fed drive. Used for short circuit data exchange according to IEC 60909.
     */
    private Boolean converterFedDrive; // Boolean

    public Boolean getConverterFedDrive() {
        return converterFedDrive;
    }

    public void setConverterFedDrive(Boolean _value_) {
        converterFedDrive = _value_;
    }

    private static Object getConverterFedDrive(BaseClass _this_) {
        return ((AsynchronousMachine) _this_).getConverterFedDrive();
    }

    private static void setConverterFedDrive(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((AsynchronousMachine) _this_).setConverterFedDrive((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((AsynchronousMachine) _this_).setConverterFedDrive(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Efficiency of the asynchronous machine at nominal operation as a percentage. Indicator for converter drive motors. Used for short circuit data exchange according to IEC 60909.
     */
    private Double efficiency; // PerCent

    public Double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(Double _value_) {
        efficiency = _value_;
    }

    private static Object getEfficiency(BaseClass _this_) {
        return ((AsynchronousMachine) _this_).getEfficiency();
    }

    private static void setEfficiency(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((AsynchronousMachine) _this_).setEfficiency((Double) _value_);
        } else if (_value_ instanceof String) {
            ((AsynchronousMachine) _this_).setEfficiency(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Ratio of locked-rotor current to the rated current of the motor (Ia/Ir). Used for short circuit data exchange according to IEC 60909.
     */
    private Float iaIrRatio; // Float

    public Float getIaIrRatio() {
        return iaIrRatio;
    }

    public void setIaIrRatio(Float _value_) {
        iaIrRatio = _value_;
    }

    private static Object getIaIrRatio(BaseClass _this_) {
        return ((AsynchronousMachine) _this_).getIaIrRatio();
    }

    private static void setIaIrRatio(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((AsynchronousMachine) _this_).setIaIrRatio((Float) _value_);
        } else if (_value_ instanceof String) {
            ((AsynchronousMachine) _this_).setIaIrRatio(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Nameplate data indicates if the machine is 50 Hz or 60 Hz.
     */
    private Double nominalFrequency; // Frequency

    public Double getNominalFrequency() {
        return nominalFrequency;
    }

    public void setNominalFrequency(Double _value_) {
        nominalFrequency = _value_;
    }

    private static Object getNominalFrequency(BaseClass _this_) {
        return ((AsynchronousMachine) _this_).getNominalFrequency();
    }

    private static void setNominalFrequency(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((AsynchronousMachine) _this_).setNominalFrequency((Double) _value_);
        } else if (_value_ instanceof String) {
            ((AsynchronousMachine) _this_).setNominalFrequency(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nameplate data.  Depends on the slip and number of pole pairs.
     */
    private Double nominalSpeed; // RotationSpeed

    public Double getNominalSpeed() {
        return nominalSpeed;
    }

    public void setNominalSpeed(Double _value_) {
        nominalSpeed = _value_;
    }

    private static Object getNominalSpeed(BaseClass _this_) {
        return ((AsynchronousMachine) _this_).getNominalSpeed();
    }

    private static void setNominalSpeed(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((AsynchronousMachine) _this_).setNominalSpeed((Double) _value_);
        } else if (_value_ instanceof String) {
            ((AsynchronousMachine) _this_).setNominalSpeed(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Number of pole pairs of stator. Used for short circuit data exchange according to IEC 60909.
     */
    private Integer polePairNumber; // Integer

    public Integer getPolePairNumber() {
        return polePairNumber;
    }

    public void setPolePairNumber(Integer _value_) {
        polePairNumber = _value_;
    }

    private static Object getPolePairNumber(BaseClass _this_) {
        return ((AsynchronousMachine) _this_).getPolePairNumber();
    }

    private static void setPolePairNumber(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((AsynchronousMachine) _this_).setPolePairNumber((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((AsynchronousMachine) _this_).setPolePairNumber(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
        }
    }

    /**
     * Rated mechanical power (Pr in IEC 60909-0). Used for short circuit data exchange according to IEC 60909.
     */
    private Double ratedMechanicalPower; // ActivePower

    public Double getRatedMechanicalPower() {
        return ratedMechanicalPower;
    }

    public void setRatedMechanicalPower(Double _value_) {
        ratedMechanicalPower = _value_;
    }

    private static Object getRatedMechanicalPower(BaseClass _this_) {
        return ((AsynchronousMachine) _this_).getRatedMechanicalPower();
    }

    private static void setRatedMechanicalPower(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((AsynchronousMachine) _this_).setRatedMechanicalPower((Double) _value_);
        } else if (_value_ instanceof String) {
            ((AsynchronousMachine) _this_).setRatedMechanicalPower(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Indicates for converter drive motors if the power can be reversible. Used for short circuit data exchange according to IEC 60909.
     */
    private Boolean reversible; // Boolean

    public Boolean getReversible() {
        return reversible;
    }

    public void setReversible(Boolean _value_) {
        reversible = _value_;
    }

    private static Object getReversible(BaseClass _this_) {
        return ((AsynchronousMachine) _this_).getReversible();
    }

    private static void setReversible(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((AsynchronousMachine) _this_).setReversible((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((AsynchronousMachine) _this_).setReversible(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Locked rotor ratio (R/X). Used for short circuit data exchange according to IEC 60909.
     */
    private Float rxLockedRotorRatio; // Float

    public Float getRxLockedRotorRatio() {
        return rxLockedRotorRatio;
    }

    public void setRxLockedRotorRatio(Float _value_) {
        rxLockedRotorRatio = _value_;
    }

    private static Object getRxLockedRotorRatio(BaseClass _this_) {
        return ((AsynchronousMachine) _this_).getRxLockedRotorRatio();
    }

    private static void setRxLockedRotorRatio(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((AsynchronousMachine) _this_).setRxLockedRotorRatio((Float) _value_);
        } else if (_value_ instanceof String) {
            ((AsynchronousMachine) _this_).setRxLockedRotorRatio(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "AsynchronousMachine", attrName));
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
                "AsynchronousMachine", attrName, value));
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
            map.put("AsynchronousMachineDynamics", new AttrDetails("AsynchronousMachine.AsynchronousMachineDynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, AsynchronousMachine::getAsynchronousMachineDynamics, AsynchronousMachine::setAsynchronousMachineDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("asynchronousMachineType", new AttrDetails("AsynchronousMachine.asynchronousMachineType", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, AsynchronousMachine::getAsynchronousMachineType, AsynchronousMachine::setAsynchronousMachineType));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("converterFedDrive", new AttrDetails("AsynchronousMachine.converterFedDrive", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, AsynchronousMachine::getConverterFedDrive, AsynchronousMachine::setConverterFedDrive));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("efficiency", new AttrDetails("AsynchronousMachine.efficiency", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, AsynchronousMachine::getEfficiency, AsynchronousMachine::setEfficiency));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("iaIrRatio", new AttrDetails("AsynchronousMachine.iaIrRatio", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, AsynchronousMachine::getIaIrRatio, AsynchronousMachine::setIaIrRatio));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("nominalFrequency", new AttrDetails("AsynchronousMachine.nominalFrequency", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, AsynchronousMachine::getNominalFrequency, AsynchronousMachine::setNominalFrequency));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("nominalSpeed", new AttrDetails("AsynchronousMachine.nominalSpeed", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, AsynchronousMachine::getNominalSpeed, AsynchronousMachine::setNominalSpeed));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("polePairNumber", new AttrDetails("AsynchronousMachine.polePairNumber", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, AsynchronousMachine::getPolePairNumber, AsynchronousMachine::setPolePairNumber));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("ratedMechanicalPower", new AttrDetails("AsynchronousMachine.ratedMechanicalPower", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, AsynchronousMachine::getRatedMechanicalPower, AsynchronousMachine::setRatedMechanicalPower));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("reversible", new AttrDetails("AsynchronousMachine.reversible", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, AsynchronousMachine::getReversible, AsynchronousMachine::setReversible));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("rxLockedRotorRatio", new AttrDetails("AsynchronousMachine.rxLockedRotorRatio", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, AsynchronousMachine::getRxLockedRotorRatio, AsynchronousMachine::setRxLockedRotorRatio));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new AsynchronousMachine(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
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
