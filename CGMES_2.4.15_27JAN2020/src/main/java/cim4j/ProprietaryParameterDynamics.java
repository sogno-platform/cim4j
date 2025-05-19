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
 * Supports definition of one or more parameters of several different datatypes for use by proprietary user-defined models.  NOTE: This class does not inherit from IdentifiedObject since it is not intended that a single instance of it be referenced by more than one proprietary user-defined model instance.
 */
@SuppressWarnings("unused")
public class ProprietaryParameterDynamics extends BaseClass {

    private static final Logging LOG = Logging.getLogger(ProprietaryParameterDynamics.class);

    /**
     * Default constructor.
     */
    public ProprietaryParameterDynamics() {
        setCimType("ProprietaryParameterDynamics");
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private AsynchronousMachineUserDefined AsynchronousMachineUserDefined; // ManyToOne

    public AsynchronousMachineUserDefined getAsynchronousMachineUserDefined() {
        return AsynchronousMachineUserDefined;
    }

    public void setAsynchronousMachineUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof AsynchronousMachineUserDefined)) {
            throw new IllegalArgumentException("Object is not AsynchronousMachineUserDefined");
        }
        if (AsynchronousMachineUserDefined != _object_) {
            AsynchronousMachineUserDefined = (AsynchronousMachineUserDefined) _object_;
            AsynchronousMachineUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String AsynchronousMachineUserDefinedToString() {
        return AsynchronousMachineUserDefined != null ? AsynchronousMachineUserDefined.getRdfid() : null;
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private DiscontinuousExcitationControlUserDefined DiscontinuousExcitationControlUserDefined; // ManyToOne

    public DiscontinuousExcitationControlUserDefined getDiscontinuousExcitationControlUserDefined() {
        return DiscontinuousExcitationControlUserDefined;
    }

    public void setDiscontinuousExcitationControlUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof DiscontinuousExcitationControlUserDefined)) {
            throw new IllegalArgumentException("Object is not DiscontinuousExcitationControlUserDefined");
        }
        if (DiscontinuousExcitationControlUserDefined != _object_) {
            DiscontinuousExcitationControlUserDefined = (DiscontinuousExcitationControlUserDefined) _object_;
            DiscontinuousExcitationControlUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String DiscontinuousExcitationControlUserDefinedToString() {
        return DiscontinuousExcitationControlUserDefined != null ? DiscontinuousExcitationControlUserDefined.getRdfid() : null;
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private ExcitationSystemUserDefined ExcitationSystemUserDefined; // ManyToOne

    public ExcitationSystemUserDefined getExcitationSystemUserDefined() {
        return ExcitationSystemUserDefined;
    }

    public void setExcitationSystemUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof ExcitationSystemUserDefined)) {
            throw new IllegalArgumentException("Object is not ExcitationSystemUserDefined");
        }
        if (ExcitationSystemUserDefined != _object_) {
            ExcitationSystemUserDefined = (ExcitationSystemUserDefined) _object_;
            ExcitationSystemUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String ExcitationSystemUserDefinedToString() {
        return ExcitationSystemUserDefined != null ? ExcitationSystemUserDefined.getRdfid() : null;
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private LoadUserDefined LoadUserDefined; // ManyToOne

    public LoadUserDefined getLoadUserDefined() {
        return LoadUserDefined;
    }

    public void setLoadUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof LoadUserDefined)) {
            throw new IllegalArgumentException("Object is not LoadUserDefined");
        }
        if (LoadUserDefined != _object_) {
            LoadUserDefined = (LoadUserDefined) _object_;
            LoadUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String LoadUserDefinedToString() {
        return LoadUserDefined != null ? LoadUserDefined.getRdfid() : null;
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private MechanicalLoadUserDefined MechanicalLoadUserDefined; // ManyToOne

    public MechanicalLoadUserDefined getMechanicalLoadUserDefined() {
        return MechanicalLoadUserDefined;
    }

    public void setMechanicalLoadUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof MechanicalLoadUserDefined)) {
            throw new IllegalArgumentException("Object is not MechanicalLoadUserDefined");
        }
        if (MechanicalLoadUserDefined != _object_) {
            MechanicalLoadUserDefined = (MechanicalLoadUserDefined) _object_;
            MechanicalLoadUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String MechanicalLoadUserDefinedToString() {
        return MechanicalLoadUserDefined != null ? MechanicalLoadUserDefined.getRdfid() : null;
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private OverexcitationLimiterUserDefined OverexcitationLimiterUserDefined; // ManyToOne

    public OverexcitationLimiterUserDefined getOverexcitationLimiterUserDefined() {
        return OverexcitationLimiterUserDefined;
    }

    public void setOverexcitationLimiterUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof OverexcitationLimiterUserDefined)) {
            throw new IllegalArgumentException("Object is not OverexcitationLimiterUserDefined");
        }
        if (OverexcitationLimiterUserDefined != _object_) {
            OverexcitationLimiterUserDefined = (OverexcitationLimiterUserDefined) _object_;
            OverexcitationLimiterUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String OverexcitationLimiterUserDefinedToString() {
        return OverexcitationLimiterUserDefined != null ? OverexcitationLimiterUserDefined.getRdfid() : null;
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private PFVArControllerType1UserDefined PFVArControllerType1UserDefined; // ManyToOne

    public PFVArControllerType1UserDefined getPFVArControllerType1UserDefined() {
        return PFVArControllerType1UserDefined;
    }

    public void setPFVArControllerType1UserDefined(BaseClass _object_) {
        if (!(_object_ instanceof PFVArControllerType1UserDefined)) {
            throw new IllegalArgumentException("Object is not PFVArControllerType1UserDefined");
        }
        if (PFVArControllerType1UserDefined != _object_) {
            PFVArControllerType1UserDefined = (PFVArControllerType1UserDefined) _object_;
            PFVArControllerType1UserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String PFVArControllerType1UserDefinedToString() {
        return PFVArControllerType1UserDefined != null ? PFVArControllerType1UserDefined.getRdfid() : null;
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private PFVArControllerType2UserDefined PFVArControllerType2UserDefined; // ManyToOne

    public PFVArControllerType2UserDefined getPFVArControllerType2UserDefined() {
        return PFVArControllerType2UserDefined;
    }

    public void setPFVArControllerType2UserDefined(BaseClass _object_) {
        if (!(_object_ instanceof PFVArControllerType2UserDefined)) {
            throw new IllegalArgumentException("Object is not PFVArControllerType2UserDefined");
        }
        if (PFVArControllerType2UserDefined != _object_) {
            PFVArControllerType2UserDefined = (PFVArControllerType2UserDefined) _object_;
            PFVArControllerType2UserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String PFVArControllerType2UserDefinedToString() {
        return PFVArControllerType2UserDefined != null ? PFVArControllerType2UserDefined.getRdfid() : null;
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private PowerSystemStabilizerUserDefined PowerSystemStabilizerUserDefined; // ManyToOne

    public PowerSystemStabilizerUserDefined getPowerSystemStabilizerUserDefined() {
        return PowerSystemStabilizerUserDefined;
    }

    public void setPowerSystemStabilizerUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof PowerSystemStabilizerUserDefined)) {
            throw new IllegalArgumentException("Object is not PowerSystemStabilizerUserDefined");
        }
        if (PowerSystemStabilizerUserDefined != _object_) {
            PowerSystemStabilizerUserDefined = (PowerSystemStabilizerUserDefined) _object_;
            PowerSystemStabilizerUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String PowerSystemStabilizerUserDefinedToString() {
        return PowerSystemStabilizerUserDefined != null ? PowerSystemStabilizerUserDefined.getRdfid() : null;
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private SynchronousMachineUserDefined SynchronousMachineUserDefined; // ManyToOne

    public SynchronousMachineUserDefined getSynchronousMachineUserDefined() {
        return SynchronousMachineUserDefined;
    }

    public void setSynchronousMachineUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof SynchronousMachineUserDefined)) {
            throw new IllegalArgumentException("Object is not SynchronousMachineUserDefined");
        }
        if (SynchronousMachineUserDefined != _object_) {
            SynchronousMachineUserDefined = (SynchronousMachineUserDefined) _object_;
            SynchronousMachineUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String SynchronousMachineUserDefinedToString() {
        return SynchronousMachineUserDefined != null ? SynchronousMachineUserDefined.getRdfid() : null;
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private TurbineGovernorUserDefined TurbineGovernorUserDefined; // ManyToOne

    public TurbineGovernorUserDefined getTurbineGovernorUserDefined() {
        return TurbineGovernorUserDefined;
    }

    public void setTurbineGovernorUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof TurbineGovernorUserDefined)) {
            throw new IllegalArgumentException("Object is not TurbineGovernorUserDefined");
        }
        if (TurbineGovernorUserDefined != _object_) {
            TurbineGovernorUserDefined = (TurbineGovernorUserDefined) _object_;
            TurbineGovernorUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String TurbineGovernorUserDefinedToString() {
        return TurbineGovernorUserDefined != null ? TurbineGovernorUserDefined.getRdfid() : null;
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private TurbineLoadControllerUserDefined TurbineLoadControllerUserDefined; // ManyToOne

    public TurbineLoadControllerUserDefined getTurbineLoadControllerUserDefined() {
        return TurbineLoadControllerUserDefined;
    }

    public void setTurbineLoadControllerUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof TurbineLoadControllerUserDefined)) {
            throw new IllegalArgumentException("Object is not TurbineLoadControllerUserDefined");
        }
        if (TurbineLoadControllerUserDefined != _object_) {
            TurbineLoadControllerUserDefined = (TurbineLoadControllerUserDefined) _object_;
            TurbineLoadControllerUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String TurbineLoadControllerUserDefinedToString() {
        return TurbineLoadControllerUserDefined != null ? TurbineLoadControllerUserDefined.getRdfid() : null;
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private UnderexcitationLimiterUserDefined UnderexcitationLimiterUserDefined; // ManyToOne

    public UnderexcitationLimiterUserDefined getUnderexcitationLimiterUserDefined() {
        return UnderexcitationLimiterUserDefined;
    }

    public void setUnderexcitationLimiterUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof UnderexcitationLimiterUserDefined)) {
            throw new IllegalArgumentException("Object is not UnderexcitationLimiterUserDefined");
        }
        if (UnderexcitationLimiterUserDefined != _object_) {
            UnderexcitationLimiterUserDefined = (UnderexcitationLimiterUserDefined) _object_;
            UnderexcitationLimiterUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String UnderexcitationLimiterUserDefinedToString() {
        return UnderexcitationLimiterUserDefined != null ? UnderexcitationLimiterUserDefined.getRdfid() : null;
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private VoltageAdjusterUserDefined VoltageAdjusterUserDefined; // ManyToOne

    public VoltageAdjusterUserDefined getVoltageAdjusterUserDefined() {
        return VoltageAdjusterUserDefined;
    }

    public void setVoltageAdjusterUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof VoltageAdjusterUserDefined)) {
            throw new IllegalArgumentException("Object is not VoltageAdjusterUserDefined");
        }
        if (VoltageAdjusterUserDefined != _object_) {
            VoltageAdjusterUserDefined = (VoltageAdjusterUserDefined) _object_;
            VoltageAdjusterUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String VoltageAdjusterUserDefinedToString() {
        return VoltageAdjusterUserDefined != null ? VoltageAdjusterUserDefined.getRdfid() : null;
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private VoltageCompensatorUserDefined VoltageCompensatorUserDefined; // ManyToOne

    public VoltageCompensatorUserDefined getVoltageCompensatorUserDefined() {
        return VoltageCompensatorUserDefined;
    }

    public void setVoltageCompensatorUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof VoltageCompensatorUserDefined)) {
            throw new IllegalArgumentException("Object is not VoltageCompensatorUserDefined");
        }
        if (VoltageCompensatorUserDefined != _object_) {
            VoltageCompensatorUserDefined = (VoltageCompensatorUserDefined) _object_;
            VoltageCompensatorUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String VoltageCompensatorUserDefinedToString() {
        return VoltageCompensatorUserDefined != null ? VoltageCompensatorUserDefined.getRdfid() : null;
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private WindPlantUserDefined WindPlantUserDefined; // ManyToOne

    public WindPlantUserDefined getWindPlantUserDefined() {
        return WindPlantUserDefined;
    }

    public void setWindPlantUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof WindPlantUserDefined)) {
            throw new IllegalArgumentException("Object is not WindPlantUserDefined");
        }
        if (WindPlantUserDefined != _object_) {
            WindPlantUserDefined = (WindPlantUserDefined) _object_;
            WindPlantUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String WindPlantUserDefinedToString() {
        return WindPlantUserDefined != null ? WindPlantUserDefined.getRdfid() : null;
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private WindType1or2UserDefined WindType1or2UserDefined; // ManyToOne

    public WindType1or2UserDefined getWindType1or2UserDefined() {
        return WindType1or2UserDefined;
    }

    public void setWindType1or2UserDefined(BaseClass _object_) {
        if (!(_object_ instanceof WindType1or2UserDefined)) {
            throw new IllegalArgumentException("Object is not WindType1or2UserDefined");
        }
        if (WindType1or2UserDefined != _object_) {
            WindType1or2UserDefined = (WindType1or2UserDefined) _object_;
            WindType1or2UserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String WindType1or2UserDefinedToString() {
        return WindType1or2UserDefined != null ? WindType1or2UserDefined.getRdfid() : null;
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private WindType3or4UserDefined WindType3or4UserDefined; // ManyToOne

    public WindType3or4UserDefined getWindType3or4UserDefined() {
        return WindType3or4UserDefined;
    }

    public void setWindType3or4UserDefined(BaseClass _object_) {
        if (!(_object_ instanceof WindType3or4UserDefined)) {
            throw new IllegalArgumentException("Object is not WindType3or4UserDefined");
        }
        if (WindType3or4UserDefined != _object_) {
            WindType3or4UserDefined = (WindType3or4UserDefined) _object_;
            WindType3or4UserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String WindType3or4UserDefinedToString() {
        return WindType3or4UserDefined != null ? WindType3or4UserDefined.getRdfid() : null;
    }

    /**
     * Used for boolean parameter value. If this attribute is populated, integerParameterValue and floatParameterValue will not be.
     */
    private Boolean booleanParameterValue; // Boolean

    public Boolean getBooleanParameterValue() {
        return booleanParameterValue;
    }

    public void setBooleanParameterValue(Boolean _value_) {
        booleanParameterValue = _value_;
    }

    public void setBooleanParameterValue(String _value_) {
        booleanParameterValue = getBooleanFromString(_value_);
    }

    public String booleanParameterValueToString() {
        return booleanParameterValue != null ? booleanParameterValue.toString() : null;
    }

    /**
     * Used for floating point parameter value.  If this attribute is populated, booleanParameterValue and integerParameterValue will not be.
     */
    private Double floatParameterValue; // Simple_Float

    public Double getFloatParameterValue() {
        return floatParameterValue;
    }

    public void setFloatParameterValue(Double _value_) {
        floatParameterValue = _value_;
    }

    public void setFloatParameterValue(String _value_) {
        floatParameterValue = getDoubleFromString(_value_);
    }

    public String floatParameterValueToString() {
        return floatParameterValue != null ? floatParameterValue.toString() : null;
    }

    /**
     * Used for integer parameter value.  If this attribute is populated, booleanParameterValue and floatParameterValue will not be.
     */
    private Integer integerParameterValue; // Integer

    public Integer getIntegerParameterValue() {
        return integerParameterValue;
    }

    public void setIntegerParameterValue(Integer _value_) {
        integerParameterValue = _value_;
    }

    public void setIntegerParameterValue(String _value_) {
        integerParameterValue = getIntegerFromString(_value_);
    }

    public String integerParameterValueToString() {
        return integerParameterValue != null ? integerParameterValue.toString() : null;
    }

    /**
     * Sequence number of the parameter among the set of parameters associated with the related proprietary user-defined model.
     */
    private Integer parameterNumber; // Integer

    public Integer getParameterNumber() {
        return parameterNumber;
    }

    public void setParameterNumber(Integer _value_) {
        parameterNumber = _value_;
    }

    public void setParameterNumber(String _value_) {
        parameterNumber = getIntegerFromString(_value_);
    }

    public String parameterNumberToString() {
        return parameterNumber != null ? parameterNumber.toString() : null;
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
        return getAttribute("ProprietaryParameterDynamics", attrName);
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
        setAttribute("ProprietaryParameterDynamics", attrName, objectValue);
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
        setAttribute("ProprietaryParameterDynamics", attrName, stringValue);
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
            profiles.add(CGMESProfile.DY);
            map.put("AsynchronousMachineUserDefined", new AttrDetails("ProprietaryParameterDynamics.AsynchronousMachineUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("DiscontinuousExcitationControlUserDefined", new AttrDetails("ProprietaryParameterDynamics.DiscontinuousExcitationControlUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ExcitationSystemUserDefined", new AttrDetails("ProprietaryParameterDynamics.ExcitationSystemUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("LoadUserDefined", new AttrDetails("ProprietaryParameterDynamics.LoadUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("MechanicalLoadUserDefined", new AttrDetails("ProprietaryParameterDynamics.MechanicalLoadUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("OverexcitationLimiterUserDefined", new AttrDetails("ProprietaryParameterDynamics.OverexcitationLimiterUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("PFVArControllerType1UserDefined", new AttrDetails("ProprietaryParameterDynamics.PFVArControllerType1UserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("PFVArControllerType2UserDefined", new AttrDetails("ProprietaryParameterDynamics.PFVArControllerType2UserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("PowerSystemStabilizerUserDefined", new AttrDetails("ProprietaryParameterDynamics.PowerSystemStabilizerUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("SynchronousMachineUserDefined", new AttrDetails("ProprietaryParameterDynamics.SynchronousMachineUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("TurbineGovernorUserDefined", new AttrDetails("ProprietaryParameterDynamics.TurbineGovernorUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("TurbineLoadControllerUserDefined", new AttrDetails("ProprietaryParameterDynamics.TurbineLoadControllerUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("UnderexcitationLimiterUserDefined", new AttrDetails("ProprietaryParameterDynamics.UnderexcitationLimiterUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("VoltageAdjusterUserDefined", new AttrDetails("ProprietaryParameterDynamics.VoltageAdjusterUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("VoltageCompensatorUserDefined", new AttrDetails("ProprietaryParameterDynamics.VoltageCompensatorUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindPlantUserDefined", new AttrDetails("ProprietaryParameterDynamics.WindPlantUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindType1or2UserDefined", new AttrDetails("ProprietaryParameterDynamics.WindType1or2UserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindType3or4UserDefined", new AttrDetails("ProprietaryParameterDynamics.WindType3or4UserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("booleanParameterValue", new AttrDetails("ProprietaryParameterDynamics.booleanParameterValue", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("floatParameterValue", new AttrDetails("ProprietaryParameterDynamics.floatParameterValue", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("integerParameterValue", new AttrDetails("ProprietaryParameterDynamics.integerParameterValue", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("parameterNumber", new AttrDetails("ProprietaryParameterDynamics.parameterNumber", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ProprietaryParameterDynamics().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("AsynchronousMachineUserDefined", new GetterSetter(this::AsynchronousMachineUserDefinedToString, this::setAsynchronousMachineUserDefined, null));
        map.put("DiscontinuousExcitationControlUserDefined", new GetterSetter(this::DiscontinuousExcitationControlUserDefinedToString, this::setDiscontinuousExcitationControlUserDefined, null));
        map.put("ExcitationSystemUserDefined", new GetterSetter(this::ExcitationSystemUserDefinedToString, this::setExcitationSystemUserDefined, null));
        map.put("LoadUserDefined", new GetterSetter(this::LoadUserDefinedToString, this::setLoadUserDefined, null));
        map.put("MechanicalLoadUserDefined", new GetterSetter(this::MechanicalLoadUserDefinedToString, this::setMechanicalLoadUserDefined, null));
        map.put("OverexcitationLimiterUserDefined", new GetterSetter(this::OverexcitationLimiterUserDefinedToString, this::setOverexcitationLimiterUserDefined, null));
        map.put("PFVArControllerType1UserDefined", new GetterSetter(this::PFVArControllerType1UserDefinedToString, this::setPFVArControllerType1UserDefined, null));
        map.put("PFVArControllerType2UserDefined", new GetterSetter(this::PFVArControllerType2UserDefinedToString, this::setPFVArControllerType2UserDefined, null));
        map.put("PowerSystemStabilizerUserDefined", new GetterSetter(this::PowerSystemStabilizerUserDefinedToString, this::setPowerSystemStabilizerUserDefined, null));
        map.put("SynchronousMachineUserDefined", new GetterSetter(this::SynchronousMachineUserDefinedToString, this::setSynchronousMachineUserDefined, null));
        map.put("TurbineGovernorUserDefined", new GetterSetter(this::TurbineGovernorUserDefinedToString, this::setTurbineGovernorUserDefined, null));
        map.put("TurbineLoadControllerUserDefined", new GetterSetter(this::TurbineLoadControllerUserDefinedToString, this::setTurbineLoadControllerUserDefined, null));
        map.put("UnderexcitationLimiterUserDefined", new GetterSetter(this::UnderexcitationLimiterUserDefinedToString, this::setUnderexcitationLimiterUserDefined, null));
        map.put("VoltageAdjusterUserDefined", new GetterSetter(this::VoltageAdjusterUserDefinedToString, this::setVoltageAdjusterUserDefined, null));
        map.put("VoltageCompensatorUserDefined", new GetterSetter(this::VoltageCompensatorUserDefinedToString, this::setVoltageCompensatorUserDefined, null));
        map.put("WindPlantUserDefined", new GetterSetter(this::WindPlantUserDefinedToString, this::setWindPlantUserDefined, null));
        map.put("WindType1or2UserDefined", new GetterSetter(this::WindType1or2UserDefinedToString, this::setWindType1or2UserDefined, null));
        map.put("WindType3or4UserDefined", new GetterSetter(this::WindType3or4UserDefinedToString, this::setWindType3or4UserDefined, null));
        map.put("booleanParameterValue", new GetterSetter(this::booleanParameterValueToString, null, this::setBooleanParameterValue));
        map.put("floatParameterValue", new GetterSetter(this::floatParameterValueToString, null, this::setFloatParameterValue));
        map.put("integerParameterValue", new GetterSetter(this::integerParameterValueToString, null, this::setIntegerParameterValue));
        map.put("parameterNumber", new GetterSetter(this::parameterNumberToString, null, this::setParameterNumber));
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
