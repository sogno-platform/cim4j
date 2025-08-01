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
 * Excitation system function block whose behaviour is described by reference to a standard model <font color="#0f0f0f">or by definition of a user-defined model.</font>
 */
@SuppressWarnings("unused")
public class ExcitationSystemDynamics extends DynamicsFunctionBlock {

    private static final Logging LOG = Logging.getLogger(ExcitationSystemDynamics.class);

    /**
     * Constructor.
     */
    public ExcitationSystemDynamics(String rdfid) {
        super("ExcitationSystemDynamics", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcitationSystemDynamics(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Discontinuous excitation control model associated with this excitation system model.
     *
     * NOT USED
     */
    private DiscontinuousExcitationControlDynamics DiscontinuousExcitationControlDynamics; // OneToOne

    private String DiscontinuousExcitationControlDynamicsId;

    public DiscontinuousExcitationControlDynamics getDiscontinuousExcitationControlDynamics() {
        return DiscontinuousExcitationControlDynamics;
    }

    public void setDiscontinuousExcitationControlDynamics(DiscontinuousExcitationControlDynamics _object_) {
        if (DiscontinuousExcitationControlDynamics != _object_) {
            DiscontinuousExcitationControlDynamics = _object_;
            _object_.setExcitationSystemDynamics(this);
            DiscontinuousExcitationControlDynamicsId = _object_.getRdfid();
        }
    }

    private static Object getDiscontinuousExcitationControlDynamics(BaseClass _this_) {
        var obj = ((ExcitationSystemDynamics) _this_).getDiscontinuousExcitationControlDynamics();
        var id = ((ExcitationSystemDynamics) _this_).DiscontinuousExcitationControlDynamicsId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setDiscontinuousExcitationControlDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ExcitationSystemDynamics) _this_).DiscontinuousExcitationControlDynamicsId = (String) _value_;
        } else if (_value_ instanceof DiscontinuousExcitationControlDynamics) {
            ((ExcitationSystemDynamics) _this_).setDiscontinuousExcitationControlDynamics((DiscontinuousExcitationControlDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not DiscontinuousExcitationControlDynamics");
        }
    }

    /**
     * Overexcitation limiter model associated with this excitation system model.
     *
     * NOT USED
     */
    private OverexcitationLimiterDynamics OverexcitationLimiterDynamics; // OneToOne

    private String OverexcitationLimiterDynamicsId;

    public OverexcitationLimiterDynamics getOverexcitationLimiterDynamics() {
        return OverexcitationLimiterDynamics;
    }

    public void setOverexcitationLimiterDynamics(OverexcitationLimiterDynamics _object_) {
        if (OverexcitationLimiterDynamics != _object_) {
            OverexcitationLimiterDynamics = _object_;
            _object_.setExcitationSystemDynamics(this);
            OverexcitationLimiterDynamicsId = _object_.getRdfid();
        }
    }

    private static Object getOverexcitationLimiterDynamics(BaseClass _this_) {
        var obj = ((ExcitationSystemDynamics) _this_).getOverexcitationLimiterDynamics();
        var id = ((ExcitationSystemDynamics) _this_).OverexcitationLimiterDynamicsId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setOverexcitationLimiterDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ExcitationSystemDynamics) _this_).OverexcitationLimiterDynamicsId = (String) _value_;
        } else if (_value_ instanceof OverexcitationLimiterDynamics) {
            ((ExcitationSystemDynamics) _this_).setOverexcitationLimiterDynamics((OverexcitationLimiterDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not OverexcitationLimiterDynamics");
        }
    }

    /**
     * Power factor or VAr controller type 1 model associated with this excitation system model.
     *
     * NOT USED
     */
    private PFVArControllerType1Dynamics PFVArControllerType1Dynamics; // OneToOne

    private String PFVArControllerType1DynamicsId;

    public PFVArControllerType1Dynamics getPFVArControllerType1Dynamics() {
        return PFVArControllerType1Dynamics;
    }

    public void setPFVArControllerType1Dynamics(PFVArControllerType1Dynamics _object_) {
        if (PFVArControllerType1Dynamics != _object_) {
            PFVArControllerType1Dynamics = _object_;
            _object_.setExcitationSystemDynamics(this);
            PFVArControllerType1DynamicsId = _object_.getRdfid();
        }
    }

    private static Object getPFVArControllerType1Dynamics(BaseClass _this_) {
        var obj = ((ExcitationSystemDynamics) _this_).getPFVArControllerType1Dynamics();
        var id = ((ExcitationSystemDynamics) _this_).PFVArControllerType1DynamicsId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setPFVArControllerType1Dynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ExcitationSystemDynamics) _this_).PFVArControllerType1DynamicsId = (String) _value_;
        } else if (_value_ instanceof PFVArControllerType1Dynamics) {
            ((ExcitationSystemDynamics) _this_).setPFVArControllerType1Dynamics((PFVArControllerType1Dynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not PFVArControllerType1Dynamics");
        }
    }

    /**
     * Power factor or VAr controller type 2 model associated with this excitation system model.
     *
     * NOT USED
     */
    private PFVArControllerType2Dynamics PFVArControllerType2Dynamics; // OneToOne

    private String PFVArControllerType2DynamicsId;

    public PFVArControllerType2Dynamics getPFVArControllerType2Dynamics() {
        return PFVArControllerType2Dynamics;
    }

    public void setPFVArControllerType2Dynamics(PFVArControllerType2Dynamics _object_) {
        if (PFVArControllerType2Dynamics != _object_) {
            PFVArControllerType2Dynamics = _object_;
            _object_.setExcitationSystemDynamics(this);
            PFVArControllerType2DynamicsId = _object_.getRdfid();
        }
    }

    private static Object getPFVArControllerType2Dynamics(BaseClass _this_) {
        var obj = ((ExcitationSystemDynamics) _this_).getPFVArControllerType2Dynamics();
        var id = ((ExcitationSystemDynamics) _this_).PFVArControllerType2DynamicsId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setPFVArControllerType2Dynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ExcitationSystemDynamics) _this_).PFVArControllerType2DynamicsId = (String) _value_;
        } else if (_value_ instanceof PFVArControllerType2Dynamics) {
            ((ExcitationSystemDynamics) _this_).setPFVArControllerType2Dynamics((PFVArControllerType2Dynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not PFVArControllerType2Dynamics");
        }
    }

    /**
     * Power system stabilizer model associated with this excitation system model.
     *
     * NOT USED
     */
    private PowerSystemStabilizerDynamics PowerSystemStabilizerDynamics; // OneToOne

    private String PowerSystemStabilizerDynamicsId;

    public PowerSystemStabilizerDynamics getPowerSystemStabilizerDynamics() {
        return PowerSystemStabilizerDynamics;
    }

    public void setPowerSystemStabilizerDynamics(PowerSystemStabilizerDynamics _object_) {
        if (PowerSystemStabilizerDynamics != _object_) {
            PowerSystemStabilizerDynamics = _object_;
            _object_.setExcitationSystemDynamics(this);
            PowerSystemStabilizerDynamicsId = _object_.getRdfid();
        }
    }

    private static Object getPowerSystemStabilizerDynamics(BaseClass _this_) {
        var obj = ((ExcitationSystemDynamics) _this_).getPowerSystemStabilizerDynamics();
        var id = ((ExcitationSystemDynamics) _this_).PowerSystemStabilizerDynamicsId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setPowerSystemStabilizerDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ExcitationSystemDynamics) _this_).PowerSystemStabilizerDynamicsId = (String) _value_;
        } else if (_value_ instanceof PowerSystemStabilizerDynamics) {
            ((ExcitationSystemDynamics) _this_).setPowerSystemStabilizerDynamics((PowerSystemStabilizerDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not PowerSystemStabilizerDynamics");
        }
    }

    /**
     * Synchronous machine model with which this excitation system model is associated.
     */
    private SynchronousMachineDynamics SynchronousMachineDynamics; // OneToOne

    private String SynchronousMachineDynamicsId;

    public SynchronousMachineDynamics getSynchronousMachineDynamics() {
        return SynchronousMachineDynamics;
    }

    public void setSynchronousMachineDynamics(SynchronousMachineDynamics _object_) {
        if (SynchronousMachineDynamics != _object_) {
            SynchronousMachineDynamics = _object_;
            _object_.setExcitationSystemDynamics(this);
            SynchronousMachineDynamicsId = _object_.getRdfid();
        }
    }

    private static Object getSynchronousMachineDynamics(BaseClass _this_) {
        var obj = ((ExcitationSystemDynamics) _this_).getSynchronousMachineDynamics();
        var id = ((ExcitationSystemDynamics) _this_).SynchronousMachineDynamicsId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setSynchronousMachineDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ExcitationSystemDynamics) _this_).SynchronousMachineDynamicsId = (String) _value_;
        } else if (_value_ instanceof SynchronousMachineDynamics) {
            ((ExcitationSystemDynamics) _this_).setSynchronousMachineDynamics((SynchronousMachineDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not SynchronousMachineDynamics");
        }
    }

    /**
     * Undrexcitation limiter model associated with this excitation system model.
     *
     * NOT USED
     */
    private UnderexcitationLimiterDynamics UnderexcitationLimiterDynamics; // OneToOne

    private String UnderexcitationLimiterDynamicsId;

    public UnderexcitationLimiterDynamics getUnderexcitationLimiterDynamics() {
        return UnderexcitationLimiterDynamics;
    }

    public void setUnderexcitationLimiterDynamics(UnderexcitationLimiterDynamics _object_) {
        if (UnderexcitationLimiterDynamics != _object_) {
            UnderexcitationLimiterDynamics = _object_;
            _object_.setExcitationSystemDynamics(this);
            UnderexcitationLimiterDynamicsId = _object_.getRdfid();
        }
    }

    private static Object getUnderexcitationLimiterDynamics(BaseClass _this_) {
        var obj = ((ExcitationSystemDynamics) _this_).getUnderexcitationLimiterDynamics();
        var id = ((ExcitationSystemDynamics) _this_).UnderexcitationLimiterDynamicsId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setUnderexcitationLimiterDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ExcitationSystemDynamics) _this_).UnderexcitationLimiterDynamicsId = (String) _value_;
        } else if (_value_ instanceof UnderexcitationLimiterDynamics) {
            ((ExcitationSystemDynamics) _this_).setUnderexcitationLimiterDynamics((UnderexcitationLimiterDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not UnderexcitationLimiterDynamics");
        }
    }

    /**
     * Voltage compensator model associated with this excitation system model.
     *
     * NOT USED
     */
    private VoltageCompensatorDynamics VoltageCompensatorDynamics; // OneToOne

    private String VoltageCompensatorDynamicsId;

    public VoltageCompensatorDynamics getVoltageCompensatorDynamics() {
        return VoltageCompensatorDynamics;
    }

    public void setVoltageCompensatorDynamics(VoltageCompensatorDynamics _object_) {
        if (VoltageCompensatorDynamics != _object_) {
            VoltageCompensatorDynamics = _object_;
            _object_.setExcitationSystemDynamics(this);
            VoltageCompensatorDynamicsId = _object_.getRdfid();
        }
    }

    private static Object getVoltageCompensatorDynamics(BaseClass _this_) {
        var obj = ((ExcitationSystemDynamics) _this_).getVoltageCompensatorDynamics();
        var id = ((ExcitationSystemDynamics) _this_).VoltageCompensatorDynamicsId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setVoltageCompensatorDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ExcitationSystemDynamics) _this_).VoltageCompensatorDynamicsId = (String) _value_;
        } else if (_value_ instanceof VoltageCompensatorDynamics) {
            ((ExcitationSystemDynamics) _this_).setVoltageCompensatorDynamics((VoltageCompensatorDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not VoltageCompensatorDynamics");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcitationSystemDynamics", attrName));
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
                "ExcitationSystemDynamics", attrName, value));
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
            map.put("DiscontinuousExcitationControlDynamics", new AttrDetails("ExcitationSystemDynamics.DiscontinuousExcitationControlDynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, ExcitationSystemDynamics::getDiscontinuousExcitationControlDynamics, ExcitationSystemDynamics::setDiscontinuousExcitationControlDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("OverexcitationLimiterDynamics", new AttrDetails("ExcitationSystemDynamics.OverexcitationLimiterDynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, ExcitationSystemDynamics::getOverexcitationLimiterDynamics, ExcitationSystemDynamics::setOverexcitationLimiterDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("PFVArControllerType1Dynamics", new AttrDetails("ExcitationSystemDynamics.PFVArControllerType1Dynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, ExcitationSystemDynamics::getPFVArControllerType1Dynamics, ExcitationSystemDynamics::setPFVArControllerType1Dynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("PFVArControllerType2Dynamics", new AttrDetails("ExcitationSystemDynamics.PFVArControllerType2Dynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, ExcitationSystemDynamics::getPFVArControllerType2Dynamics, ExcitationSystemDynamics::setPFVArControllerType2Dynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("PowerSystemStabilizerDynamics", new AttrDetails("ExcitationSystemDynamics.PowerSystemStabilizerDynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, ExcitationSystemDynamics::getPowerSystemStabilizerDynamics, ExcitationSystemDynamics::setPowerSystemStabilizerDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("SynchronousMachineDynamics", new AttrDetails("ExcitationSystemDynamics.SynchronousMachineDynamics", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ExcitationSystemDynamics::getSynchronousMachineDynamics, ExcitationSystemDynamics::setSynchronousMachineDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("UnderexcitationLimiterDynamics", new AttrDetails("ExcitationSystemDynamics.UnderexcitationLimiterDynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, ExcitationSystemDynamics::getUnderexcitationLimiterDynamics, ExcitationSystemDynamics::setUnderexcitationLimiterDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("VoltageCompensatorDynamics", new AttrDetails("ExcitationSystemDynamics.VoltageCompensatorDynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, ExcitationSystemDynamics::getVoltageCompensatorDynamics, ExcitationSystemDynamics::setVoltageCompensatorDynamics));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcitationSystemDynamics(null).allAttrDetailsMap());
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
