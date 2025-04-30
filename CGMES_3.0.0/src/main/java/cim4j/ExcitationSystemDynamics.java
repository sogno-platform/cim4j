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
     * Default constructor.
     */
    public ExcitationSystemDynamics() {
        setCimType("ExcitationSystemDynamics");
    }

    /**
     * Discontinuous excitation control model associated with this excitation system model.
     *
     * NOT USED
     */
    private DiscontinuousExcitationControlDynamics DiscontinuousExcitationControlDynamics; // OneToOne

    public DiscontinuousExcitationControlDynamics getDiscontinuousExcitationControlDynamics() {
        return DiscontinuousExcitationControlDynamics;
    }

    public void setDiscontinuousExcitationControlDynamics(BaseClass _object_) {
        if (!(_object_ instanceof DiscontinuousExcitationControlDynamics)) {
            throw new IllegalArgumentException("Object is not DiscontinuousExcitationControlDynamics");
        }
        if (DiscontinuousExcitationControlDynamics != _object_) {
            DiscontinuousExcitationControlDynamics = (DiscontinuousExcitationControlDynamics) _object_;
            DiscontinuousExcitationControlDynamics.setExcitationSystemDynamics(this);
        }
    }

    public String DiscontinuousExcitationControlDynamicsToString() {
        return DiscontinuousExcitationControlDynamics != null ? DiscontinuousExcitationControlDynamics.getRdfid() : null;
    }

    /**
     * Overexcitation limiter model associated with this excitation system model.
     *
     * NOT USED
     */
    private OverexcitationLimiterDynamics OverexcitationLimiterDynamics; // OneToOne

    public OverexcitationLimiterDynamics getOverexcitationLimiterDynamics() {
        return OverexcitationLimiterDynamics;
    }

    public void setOverexcitationLimiterDynamics(BaseClass _object_) {
        if (!(_object_ instanceof OverexcitationLimiterDynamics)) {
            throw new IllegalArgumentException("Object is not OverexcitationLimiterDynamics");
        }
        if (OverexcitationLimiterDynamics != _object_) {
            OverexcitationLimiterDynamics = (OverexcitationLimiterDynamics) _object_;
            OverexcitationLimiterDynamics.setExcitationSystemDynamics(this);
        }
    }

    public String OverexcitationLimiterDynamicsToString() {
        return OverexcitationLimiterDynamics != null ? OverexcitationLimiterDynamics.getRdfid() : null;
    }

    /**
     * Power factor or VAr controller type 1 model associated with this excitation system model.
     *
     * NOT USED
     */
    private PFVArControllerType1Dynamics PFVArControllerType1Dynamics; // OneToOne

    public PFVArControllerType1Dynamics getPFVArControllerType1Dynamics() {
        return PFVArControllerType1Dynamics;
    }

    public void setPFVArControllerType1Dynamics(BaseClass _object_) {
        if (!(_object_ instanceof PFVArControllerType1Dynamics)) {
            throw new IllegalArgumentException("Object is not PFVArControllerType1Dynamics");
        }
        if (PFVArControllerType1Dynamics != _object_) {
            PFVArControllerType1Dynamics = (PFVArControllerType1Dynamics) _object_;
            PFVArControllerType1Dynamics.setExcitationSystemDynamics(this);
        }
    }

    public String PFVArControllerType1DynamicsToString() {
        return PFVArControllerType1Dynamics != null ? PFVArControllerType1Dynamics.getRdfid() : null;
    }

    /**
     * Power factor or VAr controller type 2 model associated with this excitation system model.
     *
     * NOT USED
     */
    private PFVArControllerType2Dynamics PFVArControllerType2Dynamics; // OneToOne

    public PFVArControllerType2Dynamics getPFVArControllerType2Dynamics() {
        return PFVArControllerType2Dynamics;
    }

    public void setPFVArControllerType2Dynamics(BaseClass _object_) {
        if (!(_object_ instanceof PFVArControllerType2Dynamics)) {
            throw new IllegalArgumentException("Object is not PFVArControllerType2Dynamics");
        }
        if (PFVArControllerType2Dynamics != _object_) {
            PFVArControllerType2Dynamics = (PFVArControllerType2Dynamics) _object_;
            PFVArControllerType2Dynamics.setExcitationSystemDynamics(this);
        }
    }

    public String PFVArControllerType2DynamicsToString() {
        return PFVArControllerType2Dynamics != null ? PFVArControllerType2Dynamics.getRdfid() : null;
    }

    /**
     * Power system stabilizer model associated with this excitation system model.
     *
     * NOT USED
     */
    private PowerSystemStabilizerDynamics PowerSystemStabilizerDynamics; // OneToOne

    public PowerSystemStabilizerDynamics getPowerSystemStabilizerDynamics() {
        return PowerSystemStabilizerDynamics;
    }

    public void setPowerSystemStabilizerDynamics(BaseClass _object_) {
        if (!(_object_ instanceof PowerSystemStabilizerDynamics)) {
            throw new IllegalArgumentException("Object is not PowerSystemStabilizerDynamics");
        }
        if (PowerSystemStabilizerDynamics != _object_) {
            PowerSystemStabilizerDynamics = (PowerSystemStabilizerDynamics) _object_;
            PowerSystemStabilizerDynamics.setExcitationSystemDynamics(this);
        }
    }

    public String PowerSystemStabilizerDynamicsToString() {
        return PowerSystemStabilizerDynamics != null ? PowerSystemStabilizerDynamics.getRdfid() : null;
    }

    /**
     * Synchronous machine model with which this excitation system model is associated.
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
            SynchronousMachineDynamics.setExcitationSystemDynamics(this);
        }
    }

    public String SynchronousMachineDynamicsToString() {
        return SynchronousMachineDynamics != null ? SynchronousMachineDynamics.getRdfid() : null;
    }

    /**
     * Undrexcitation limiter model associated with this excitation system model.
     *
     * NOT USED
     */
    private UnderexcitationLimiterDynamics UnderexcitationLimiterDynamics; // OneToOne

    public UnderexcitationLimiterDynamics getUnderexcitationLimiterDynamics() {
        return UnderexcitationLimiterDynamics;
    }

    public void setUnderexcitationLimiterDynamics(BaseClass _object_) {
        if (!(_object_ instanceof UnderexcitationLimiterDynamics)) {
            throw new IllegalArgumentException("Object is not UnderexcitationLimiterDynamics");
        }
        if (UnderexcitationLimiterDynamics != _object_) {
            UnderexcitationLimiterDynamics = (UnderexcitationLimiterDynamics) _object_;
            UnderexcitationLimiterDynamics.setExcitationSystemDynamics(this);
        }
    }

    public String UnderexcitationLimiterDynamicsToString() {
        return UnderexcitationLimiterDynamics != null ? UnderexcitationLimiterDynamics.getRdfid() : null;
    }

    /**
     * Voltage compensator model associated with this excitation system model.
     *
     * NOT USED
     */
    private VoltageCompensatorDynamics VoltageCompensatorDynamics; // OneToOne

    public VoltageCompensatorDynamics getVoltageCompensatorDynamics() {
        return VoltageCompensatorDynamics;
    }

    public void setVoltageCompensatorDynamics(BaseClass _object_) {
        if (!(_object_ instanceof VoltageCompensatorDynamics)) {
            throw new IllegalArgumentException("Object is not VoltageCompensatorDynamics");
        }
        if (VoltageCompensatorDynamics != _object_) {
            VoltageCompensatorDynamics = (VoltageCompensatorDynamics) _object_;
            VoltageCompensatorDynamics.setExcitationSystemDynamics(this);
        }
    }

    public String VoltageCompensatorDynamicsToString() {
        return VoltageCompensatorDynamics != null ? VoltageCompensatorDynamics.getRdfid() : null;
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
        return getAttribute("ExcitationSystemDynamics", attrName);
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
        setAttribute("ExcitationSystemDynamics", attrName, objectValue);
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
        setAttribute("ExcitationSystemDynamics", attrName, stringValue);
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
            profiles.add(CGMESProfile.DY);
            map.put("DiscontinuousExcitationControlDynamics", new AttrDetails("ExcitationSystemDynamics.DiscontinuousExcitationControlDynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("OverexcitationLimiterDynamics", new AttrDetails("ExcitationSystemDynamics.OverexcitationLimiterDynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("PFVArControllerType1Dynamics", new AttrDetails("ExcitationSystemDynamics.PFVArControllerType1Dynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("PFVArControllerType2Dynamics", new AttrDetails("ExcitationSystemDynamics.PFVArControllerType2Dynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("PowerSystemStabilizerDynamics", new AttrDetails("ExcitationSystemDynamics.PowerSystemStabilizerDynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("SynchronousMachineDynamics", new AttrDetails("ExcitationSystemDynamics.SynchronousMachineDynamics", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("UnderexcitationLimiterDynamics", new AttrDetails("ExcitationSystemDynamics.UnderexcitationLimiterDynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("VoltageCompensatorDynamics", new AttrDetails("ExcitationSystemDynamics.VoltageCompensatorDynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcitationSystemDynamics().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("DiscontinuousExcitationControlDynamics", new GetterSetter(this::DiscontinuousExcitationControlDynamicsToString, this::setDiscontinuousExcitationControlDynamics, null));
        map.put("OverexcitationLimiterDynamics", new GetterSetter(this::OverexcitationLimiterDynamicsToString, this::setOverexcitationLimiterDynamics, null));
        map.put("PFVArControllerType1Dynamics", new GetterSetter(this::PFVArControllerType1DynamicsToString, this::setPFVArControllerType1Dynamics, null));
        map.put("PFVArControllerType2Dynamics", new GetterSetter(this::PFVArControllerType2DynamicsToString, this::setPFVArControllerType2Dynamics, null));
        map.put("PowerSystemStabilizerDynamics", new GetterSetter(this::PowerSystemStabilizerDynamicsToString, this::setPowerSystemStabilizerDynamics, null));
        map.put("SynchronousMachineDynamics", new GetterSetter(this::SynchronousMachineDynamicsToString, this::setSynchronousMachineDynamics, null));
        map.put("UnderexcitationLimiterDynamics", new GetterSetter(this::UnderexcitationLimiterDynamicsToString, this::setUnderexcitationLimiterDynamics, null));
        map.put("VoltageCompensatorDynamics", new GetterSetter(this::VoltageCompensatorDynamicsToString, this::setVoltageCompensatorDynamics, null));
        return map;
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
