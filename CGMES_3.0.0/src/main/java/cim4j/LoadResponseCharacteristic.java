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
 * Models the characteristic response of the load demand due to changes in system conditions such as voltage and frequency. It is not related to demand response. If LoadResponseCharacteristic.exponentModel is True, the exponential voltage or frequency dependent models are specified and used as to calculate active and reactive power components of the load model. The equations to calculate active and reactive power components of the load model are internal to the power flow calculation, hence they use different quantities depending on the use case of the data exchange.  The equations for exponential voltage dependent load model injected power are:  pInjection= Pnominal* (Voltage/cim:BaseVoltage.nominalVoltage) ** cim:LoadResponseCharacteristic.pVoltageExponent qInjection= Qnominal* (Voltage/cim:BaseVoltage.nominalVoltage) ** cim:LoadResponseCharacteristic.qVoltageExponent Where:  1) * means "multiply" and ** is "raised to power of"; 2) Pnominal and Qnominal represent the active power and reactive power at nominal voltage as any load described by the voltage exponential model shall be given at nominal voltage.  This means that EnergyConsumer.p and EnergyConsumer.q  are at nominal voltage. 3) After power flow is solved:  -pInjection and qInjection correspond to SvPowerflow.p and SvPowerflow.q respectively.   - Voltage corresponds to SvVoltage.v at the TopologicalNode where the load is connected.
 */
@SuppressWarnings("unused")
public class LoadResponseCharacteristic extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(LoadResponseCharacteristic.class);

    /**
     * Default constructor.
     */
    public LoadResponseCharacteristic() {
        setCimType("LoadResponseCharacteristic");
    }

    /**
     * The set of loads that have the response characteristics.
     *
     * NOT USED
     */
    private Set<EnergyConsumer> EnergyConsumer = new HashSet<>(); // OneToMany

    public Set<EnergyConsumer> getEnergyConsumer() {
        return EnergyConsumer;
    }

    public void setEnergyConsumer(BaseClass _object_) {
        if (!(_object_ instanceof EnergyConsumer)) {
            throw new IllegalArgumentException("Object is not EnergyConsumer");
        }
        if (!EnergyConsumer.contains(_object_)) {
            EnergyConsumer.add((EnergyConsumer) _object_);
            ((EnergyConsumer) _object_).setLoadResponse(this);
        }
    }

    public String EnergyConsumerToString() {
        return getStringFromSet(EnergyConsumer);
    }

    /**
     * Indicates the exponential voltage dependency model is to be used. If false, the coefficient model is to be used. The exponential voltage dependency model consist of the attributes: - pVoltageExponent - qVoltageExponent - pFrequencyExponent - qFrequencyExponent. The coefficient model consist of the attributes: - pConstantImpedance - pConstantCurrent - pConstantPower - qConstantImpedance - qConstantCurrent - qConstantPower. The sum of pConstantImpedance, pConstantCurrent and pConstantPower shall equal 1. The sum of qConstantImpedance, qConstantCurrent and qConstantPower shall equal 1.
     */
    private Boolean exponentModel; // Boolean

    public Boolean getExponentModel() {
        return exponentModel;
    }

    public void setExponentModel(Boolean _value_) {
        exponentModel = _value_;
    }

    public void setExponentModel(String _value_) {
        exponentModel = getBooleanFromString(_value_);
    }

    public String exponentModelToString() {
        return exponentModel != null ? exponentModel.toString() : null;
    }

    /**
     * Portion of active power load modelled as constant current.
     */
    private Float pConstantCurrent; // Float

    public Float getPConstantCurrent() {
        return pConstantCurrent;
    }

    public void setPConstantCurrent(Float _value_) {
        pConstantCurrent = _value_;
    }

    public void setPConstantCurrent(String _value_) {
        pConstantCurrent = getFloatFromString(_value_);
    }

    public String pConstantCurrentToString() {
        return pConstantCurrent != null ? pConstantCurrent.toString() : null;
    }

    /**
     * Portion of active power load modelled as constant impedance.
     */
    private Float pConstantImpedance; // Float

    public Float getPConstantImpedance() {
        return pConstantImpedance;
    }

    public void setPConstantImpedance(Float _value_) {
        pConstantImpedance = _value_;
    }

    public void setPConstantImpedance(String _value_) {
        pConstantImpedance = getFloatFromString(_value_);
    }

    public String pConstantImpedanceToString() {
        return pConstantImpedance != null ? pConstantImpedance.toString() : null;
    }

    /**
     * Portion of active power load modelled as constant power.
     */
    private Float pConstantPower; // Float

    public Float getPConstantPower() {
        return pConstantPower;
    }

    public void setPConstantPower(Float _value_) {
        pConstantPower = _value_;
    }

    public void setPConstantPower(String _value_) {
        pConstantPower = getFloatFromString(_value_);
    }

    public String pConstantPowerToString() {
        return pConstantPower != null ? pConstantPower.toString() : null;
    }

    /**
     * Exponent of per unit frequency effecting active power.
     */
    private Float pFrequencyExponent; // Float

    public Float getPFrequencyExponent() {
        return pFrequencyExponent;
    }

    public void setPFrequencyExponent(Float _value_) {
        pFrequencyExponent = _value_;
    }

    public void setPFrequencyExponent(String _value_) {
        pFrequencyExponent = getFloatFromString(_value_);
    }

    public String pFrequencyExponentToString() {
        return pFrequencyExponent != null ? pFrequencyExponent.toString() : null;
    }

    /**
     * Exponent of per unit voltage effecting real power.
     */
    private Float pVoltageExponent; // Float

    public Float getPVoltageExponent() {
        return pVoltageExponent;
    }

    public void setPVoltageExponent(Float _value_) {
        pVoltageExponent = _value_;
    }

    public void setPVoltageExponent(String _value_) {
        pVoltageExponent = getFloatFromString(_value_);
    }

    public String pVoltageExponentToString() {
        return pVoltageExponent != null ? pVoltageExponent.toString() : null;
    }

    /**
     * Portion of reactive power load modelled as constant current.
     */
    private Float qConstantCurrent; // Float

    public Float getQConstantCurrent() {
        return qConstantCurrent;
    }

    public void setQConstantCurrent(Float _value_) {
        qConstantCurrent = _value_;
    }

    public void setQConstantCurrent(String _value_) {
        qConstantCurrent = getFloatFromString(_value_);
    }

    public String qConstantCurrentToString() {
        return qConstantCurrent != null ? qConstantCurrent.toString() : null;
    }

    /**
     * Portion of reactive power load modelled as constant impedance.
     */
    private Float qConstantImpedance; // Float

    public Float getQConstantImpedance() {
        return qConstantImpedance;
    }

    public void setQConstantImpedance(Float _value_) {
        qConstantImpedance = _value_;
    }

    public void setQConstantImpedance(String _value_) {
        qConstantImpedance = getFloatFromString(_value_);
    }

    public String qConstantImpedanceToString() {
        return qConstantImpedance != null ? qConstantImpedance.toString() : null;
    }

    /**
     * Portion of reactive power load modelled as constant power.
     */
    private Float qConstantPower; // Float

    public Float getQConstantPower() {
        return qConstantPower;
    }

    public void setQConstantPower(Float _value_) {
        qConstantPower = _value_;
    }

    public void setQConstantPower(String _value_) {
        qConstantPower = getFloatFromString(_value_);
    }

    public String qConstantPowerToString() {
        return qConstantPower != null ? qConstantPower.toString() : null;
    }

    /**
     * Exponent of per unit frequency effecting reactive power.
     */
    private Float qFrequencyExponent; // Float

    public Float getQFrequencyExponent() {
        return qFrequencyExponent;
    }

    public void setQFrequencyExponent(Float _value_) {
        qFrequencyExponent = _value_;
    }

    public void setQFrequencyExponent(String _value_) {
        qFrequencyExponent = getFloatFromString(_value_);
    }

    public String qFrequencyExponentToString() {
        return qFrequencyExponent != null ? qFrequencyExponent.toString() : null;
    }

    /**
     * Exponent of per unit voltage effecting reactive power.
     */
    private Float qVoltageExponent; // Float

    public Float getQVoltageExponent() {
        return qVoltageExponent;
    }

    public void setQVoltageExponent(Float _value_) {
        qVoltageExponent = _value_;
    }

    public void setQVoltageExponent(String _value_) {
        qVoltageExponent = getFloatFromString(_value_);
    }

    public String qVoltageExponentToString() {
        return qVoltageExponent != null ? qVoltageExponent.toString() : null;
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
        return getAttribute("LoadResponseCharacteristic", attrName);
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
        setAttribute("LoadResponseCharacteristic", attrName, objectValue);
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
        setAttribute("LoadResponseCharacteristic", attrName, stringValue);
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
            map.put("EnergyConsumer", new AttrDetails("LoadResponseCharacteristic.EnergyConsumer", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("exponentModel", new AttrDetails("LoadResponseCharacteristic.exponentModel", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("pConstantCurrent", new AttrDetails("LoadResponseCharacteristic.pConstantCurrent", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("pConstantImpedance", new AttrDetails("LoadResponseCharacteristic.pConstantImpedance", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("pConstantPower", new AttrDetails("LoadResponseCharacteristic.pConstantPower", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("pFrequencyExponent", new AttrDetails("LoadResponseCharacteristic.pFrequencyExponent", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("pVoltageExponent", new AttrDetails("LoadResponseCharacteristic.pVoltageExponent", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("qConstantCurrent", new AttrDetails("LoadResponseCharacteristic.qConstantCurrent", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("qConstantImpedance", new AttrDetails("LoadResponseCharacteristic.qConstantImpedance", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("qConstantPower", new AttrDetails("LoadResponseCharacteristic.qConstantPower", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("qFrequencyExponent", new AttrDetails("LoadResponseCharacteristic.qFrequencyExponent", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("qVoltageExponent", new AttrDetails("LoadResponseCharacteristic.qVoltageExponent", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new LoadResponseCharacteristic().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("EnergyConsumer", new GetterSetter(this::EnergyConsumerToString, this::setEnergyConsumer, null));
        map.put("exponentModel", new GetterSetter(this::exponentModelToString, null, this::setExponentModel));
        map.put("pConstantCurrent", new GetterSetter(this::pConstantCurrentToString, null, this::setPConstantCurrent));
        map.put("pConstantImpedance", new GetterSetter(this::pConstantImpedanceToString, null, this::setPConstantImpedance));
        map.put("pConstantPower", new GetterSetter(this::pConstantPowerToString, null, this::setPConstantPower));
        map.put("pFrequencyExponent", new GetterSetter(this::pFrequencyExponentToString, null, this::setPFrequencyExponent));
        map.put("pVoltageExponent", new GetterSetter(this::pVoltageExponentToString, null, this::setPVoltageExponent));
        map.put("qConstantCurrent", new GetterSetter(this::qConstantCurrentToString, null, this::setQConstantCurrent));
        map.put("qConstantImpedance", new GetterSetter(this::qConstantImpedanceToString, null, this::setQConstantImpedance));
        map.put("qConstantPower", new GetterSetter(this::qConstantPowerToString, null, this::setQConstantPower));
        map.put("qFrequencyExponent", new GetterSetter(this::qFrequencyExponentToString, null, this::setQFrequencyExponent));
        map.put("qVoltageExponent", new GetterSetter(this::qVoltageExponentToString, null, this::setQVoltageExponent));
        return map;
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
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
