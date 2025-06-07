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
 * Supports connection to a terminal associated with a remote bus from which an input signal of a specific type is coming.
 */
@SuppressWarnings("unused")
public class RemoteInputSignal extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(RemoteInputSignal.class);

    /**
     * Constructor.
     */
    public RemoteInputSignal(String rdfid) {
        super("RemoteInputSignal", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected RemoteInputSignal(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Discontinuous excitation control model using this remote input signal.
     */
    private DiscontinuousExcitationControlDynamics DiscontinuousExcitationControlDynamics; // OneToOne

    public DiscontinuousExcitationControlDynamics getDiscontinuousExcitationControlDynamics() {
        return DiscontinuousExcitationControlDynamics;
    }

    public void setDiscontinuousExcitationControlDynamics(DiscontinuousExcitationControlDynamics _object_) {
        if (DiscontinuousExcitationControlDynamics != _object_) {
            DiscontinuousExcitationControlDynamics = _object_;
            DiscontinuousExcitationControlDynamics.setRemoteInputSignal(this);
        }
    }

    private static Object getDiscontinuousExcitationControlDynamics(BaseClass _this_) {
        return ((RemoteInputSignal) _this_).getDiscontinuousExcitationControlDynamics();
    }

    private static void setDiscontinuousExcitationControlDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof DiscontinuousExcitationControlDynamics) {
            ((RemoteInputSignal) _this_).setDiscontinuousExcitationControlDynamics((DiscontinuousExcitationControlDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not DiscontinuousExcitationControlDynamics");
        }
    }

    /**
     * Power Factor or VAr controller Type I model using this remote input signal.
     */
    private PFVArControllerType1Dynamics PFVArControllerType1Dynamics; // OneToOne

    public PFVArControllerType1Dynamics getPFVArControllerType1Dynamics() {
        return PFVArControllerType1Dynamics;
    }

    public void setPFVArControllerType1Dynamics(PFVArControllerType1Dynamics _object_) {
        if (PFVArControllerType1Dynamics != _object_) {
            PFVArControllerType1Dynamics = _object_;
            PFVArControllerType1Dynamics.setRemoteInputSignal(this);
        }
    }

    private static Object getPFVArControllerType1Dynamics(BaseClass _this_) {
        return ((RemoteInputSignal) _this_).getPFVArControllerType1Dynamics();
    }

    private static void setPFVArControllerType1Dynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof PFVArControllerType1Dynamics) {
            ((RemoteInputSignal) _this_).setPFVArControllerType1Dynamics((PFVArControllerType1Dynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not PFVArControllerType1Dynamics");
        }
    }

    /**
     * Power system stabilizer model using this remote input signal.
     */
    private PowerSystemStabilizerDynamics PowerSystemStabilizerDynamics; // ManyToOne

    public PowerSystemStabilizerDynamics getPowerSystemStabilizerDynamics() {
        return PowerSystemStabilizerDynamics;
    }

    public void setPowerSystemStabilizerDynamics(PowerSystemStabilizerDynamics _object_) {
        if (PowerSystemStabilizerDynamics != _object_) {
            PowerSystemStabilizerDynamics = _object_;
            PowerSystemStabilizerDynamics.setRemoteInputSignal(this);
        }
    }

    private static Object getPowerSystemStabilizerDynamics(BaseClass _this_) {
        return ((RemoteInputSignal) _this_).getPowerSystemStabilizerDynamics();
    }

    private static void setPowerSystemStabilizerDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof PowerSystemStabilizerDynamics) {
            ((RemoteInputSignal) _this_).setPowerSystemStabilizerDynamics((PowerSystemStabilizerDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not PowerSystemStabilizerDynamics");
        }
    }

    /**
     * Remote terminal with which this input signal is associated.
     */
    private Terminal Terminal; // ManyToOne

    public Terminal getTerminal() {
        return Terminal;
    }

    public void setTerminal(Terminal _object_) {
        if (Terminal != _object_) {
            Terminal = _object_;
            Terminal.setRemoteInputSignal(this);
        }
    }

    private static Object getTerminal(BaseClass _this_) {
        return ((RemoteInputSignal) _this_).getTerminal();
    }

    private static void setTerminal(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Terminal) {
            ((RemoteInputSignal) _this_).setTerminal((Terminal) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Terminal");
        }
    }

    /**
     * Underexcitation limiter model using this remote input signal.
     */
    private UnderexcitationLimiterDynamics UnderexcitationLimiterDynamics; // OneToOne

    public UnderexcitationLimiterDynamics getUnderexcitationLimiterDynamics() {
        return UnderexcitationLimiterDynamics;
    }

    public void setUnderexcitationLimiterDynamics(UnderexcitationLimiterDynamics _object_) {
        if (UnderexcitationLimiterDynamics != _object_) {
            UnderexcitationLimiterDynamics = _object_;
            UnderexcitationLimiterDynamics.setRemoteInputSignal(this);
        }
    }

    private static Object getUnderexcitationLimiterDynamics(BaseClass _this_) {
        return ((RemoteInputSignal) _this_).getUnderexcitationLimiterDynamics();
    }

    private static void setUnderexcitationLimiterDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof UnderexcitationLimiterDynamics) {
            ((RemoteInputSignal) _this_).setUnderexcitationLimiterDynamics((UnderexcitationLimiterDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not UnderexcitationLimiterDynamics");
        }
    }

    /**
     * Voltage compensator model using this remote input signal.
     */
    private VoltageCompensatorDynamics VoltageCompensatorDynamics; // OneToOne

    public VoltageCompensatorDynamics getVoltageCompensatorDynamics() {
        return VoltageCompensatorDynamics;
    }

    public void setVoltageCompensatorDynamics(VoltageCompensatorDynamics _object_) {
        if (VoltageCompensatorDynamics != _object_) {
            VoltageCompensatorDynamics = _object_;
            VoltageCompensatorDynamics.setRemoteInputSignal(this);
        }
    }

    private static Object getVoltageCompensatorDynamics(BaseClass _this_) {
        return ((RemoteInputSignal) _this_).getVoltageCompensatorDynamics();
    }

    private static void setVoltageCompensatorDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof VoltageCompensatorDynamics) {
            ((RemoteInputSignal) _this_).setVoltageCompensatorDynamics((VoltageCompensatorDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not VoltageCompensatorDynamics");
        }
    }

    /**
     * The remote signal with which this power plant is associated.
     *
     * NOT USED
     */
    private WindPlantDynamics WindPlantDynamics; // OneToOne

    public WindPlantDynamics getWindPlantDynamics() {
        return WindPlantDynamics;
    }

    public void setWindPlantDynamics(WindPlantDynamics _object_) {
        if (WindPlantDynamics != _object_) {
            WindPlantDynamics = _object_;
            WindPlantDynamics.setRemoteInputSignal(this);
        }
    }

    private static Object getWindPlantDynamics(BaseClass _this_) {
        return ((RemoteInputSignal) _this_).getWindPlantDynamics();
    }

    private static void setWindPlantDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindPlantDynamics) {
            ((RemoteInputSignal) _this_).setWindPlantDynamics((WindPlantDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindPlantDynamics");
        }
    }

    /**
     * Wind generator Type 1 or Type 2 model using this remote input signal.
     *
     * NOT USED
     */
    private WindTurbineType1or2Dynamics WindTurbineType1or2Dynamics; // OneToOne

    public WindTurbineType1or2Dynamics getWindTurbineType1or2Dynamics() {
        return WindTurbineType1or2Dynamics;
    }

    public void setWindTurbineType1or2Dynamics(WindTurbineType1or2Dynamics _object_) {
        if (WindTurbineType1or2Dynamics != _object_) {
            WindTurbineType1or2Dynamics = _object_;
            WindTurbineType1or2Dynamics.setRemoteInputSignal(this);
        }
    }

    private static Object getWindTurbineType1or2Dynamics(BaseClass _this_) {
        return ((RemoteInputSignal) _this_).getWindTurbineType1or2Dynamics();
    }

    private static void setWindTurbineType1or2Dynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindTurbineType1or2Dynamics) {
            ((RemoteInputSignal) _this_).setWindTurbineType1or2Dynamics((WindTurbineType1or2Dynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindTurbineType1or2Dynamics");
        }
    }

    /**
     * Remote input signal used by these wind turbine Type 3 or 4 models.
     *
     * NOT USED
     */
    private WindTurbineType3or4Dynamics WindTurbineType3or4Dynamics; // OneToOne

    public WindTurbineType3or4Dynamics getWindTurbineType3or4Dynamics() {
        return WindTurbineType3or4Dynamics;
    }

    public void setWindTurbineType3or4Dynamics(WindTurbineType3or4Dynamics _object_) {
        if (WindTurbineType3or4Dynamics != _object_) {
            WindTurbineType3or4Dynamics = _object_;
            WindTurbineType3or4Dynamics.setRemoteInputSignal(this);
        }
    }

    private static Object getWindTurbineType3or4Dynamics(BaseClass _this_) {
        return ((RemoteInputSignal) _this_).getWindTurbineType3or4Dynamics();
    }

    private static void setWindTurbineType3or4Dynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindTurbineType3or4Dynamics) {
            ((RemoteInputSignal) _this_).setWindTurbineType3or4Dynamics((WindTurbineType3or4Dynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindTurbineType3or4Dynamics");
        }
    }

    /**
     * Type of input signal.
     */
    private String remoteSignalType; // RemoteSignalKind

    public String getRemoteSignalType() {
        return remoteSignalType;
    }

    public void setRemoteSignalType(String _value_) {
        remoteSignalType = _value_;
    }

    private static Object getRemoteSignalType(BaseClass _this_) {
        return ((RemoteInputSignal) _this_).getRemoteSignalType();
    }

    private static void setRemoteSignalType(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((RemoteInputSignal) _this_).setRemoteSignalType((String) _value_);
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "RemoteInputSignal", attrName));
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
                "RemoteInputSignal", attrName, value));
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
            profiles.add(CGMESProfile.DY);
            map.put("DiscontinuousExcitationControlDynamics", new AttrDetails("RemoteInputSignal.DiscontinuousExcitationControlDynamics", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, RemoteInputSignal::getDiscontinuousExcitationControlDynamics, RemoteInputSignal::setDiscontinuousExcitationControlDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("PFVArControllerType1Dynamics", new AttrDetails("RemoteInputSignal.PFVArControllerType1Dynamics", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, RemoteInputSignal::getPFVArControllerType1Dynamics, RemoteInputSignal::setPFVArControllerType1Dynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("PowerSystemStabilizerDynamics", new AttrDetails("RemoteInputSignal.PowerSystemStabilizerDynamics", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, RemoteInputSignal::getPowerSystemStabilizerDynamics, RemoteInputSignal::setPowerSystemStabilizerDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("Terminal", new AttrDetails("RemoteInputSignal.Terminal", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, RemoteInputSignal::getTerminal, RemoteInputSignal::setTerminal));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("UnderexcitationLimiterDynamics", new AttrDetails("RemoteInputSignal.UnderexcitationLimiterDynamics", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, RemoteInputSignal::getUnderexcitationLimiterDynamics, RemoteInputSignal::setUnderexcitationLimiterDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("VoltageCompensatorDynamics", new AttrDetails("RemoteInputSignal.VoltageCompensatorDynamics", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, RemoteInputSignal::getVoltageCompensatorDynamics, RemoteInputSignal::setVoltageCompensatorDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindPlantDynamics", new AttrDetails("RemoteInputSignal.WindPlantDynamics", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, RemoteInputSignal::getWindPlantDynamics, RemoteInputSignal::setWindPlantDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindTurbineType1or2Dynamics", new AttrDetails("RemoteInputSignal.WindTurbineType1or2Dynamics", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, RemoteInputSignal::getWindTurbineType1or2Dynamics, RemoteInputSignal::setWindTurbineType1or2Dynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindTurbineType3or4Dynamics", new AttrDetails("RemoteInputSignal.WindTurbineType3or4Dynamics", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, RemoteInputSignal::getWindTurbineType3or4Dynamics, RemoteInputSignal::setWindTurbineType3or4Dynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("remoteSignalType", new AttrDetails("RemoteInputSignal.remoteSignalType", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, RemoteInputSignal::getRemoteSignalType, RemoteInputSignal::setRemoteSignalType));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new RemoteInputSignal(null).allAttrDetailsMap());
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
