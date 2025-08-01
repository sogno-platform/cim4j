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
 * Models the characteristic response of the load demand due to changes in system conditions such as voltage and frequency. This is not related to demand response.  If LoadResponseCharacteristic.exponentModel is True, the voltage exponents are specified and used as to calculate:  Active power component = Pnominal * (Voltage/cim:BaseVoltage.nominalVoltage) ** cim:LoadResponseCharacteristic.pVoltageExponent  Reactive power component = Qnominal * (Voltage/cim:BaseVoltage.nominalVoltage)** cim:LoadResponseCharacteristic.qVoltageExponent  Where  * means "multiply" and ** is "raised to power of".
 */
@SuppressWarnings("unused")
public class LoadResponseCharacteristic extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(LoadResponseCharacteristic.class);

    /**
     * Constructor.
     */
    public LoadResponseCharacteristic(String rdfid) {
        super("LoadResponseCharacteristic", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected LoadResponseCharacteristic(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The set of loads that have the response characteristics.
     *
     * NOT USED
     */
    private Set<EnergyConsumer> EnergyConsumer = new HashSet<>(); // OneToMany

    private Set<String> EnergyConsumerIdSet = new HashSet<>();

    public Set<EnergyConsumer> getEnergyConsumer() {
        return EnergyConsumer;
    }

    public void setEnergyConsumer(EnergyConsumer _object_) {
        if (!EnergyConsumer.contains(_object_)) {
            EnergyConsumer.add(_object_);
            _object_.setLoadResponse(this);
            EnergyConsumerIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getEnergyConsumer(BaseClass _this_) {
        var objs = ((LoadResponseCharacteristic) _this_).getEnergyConsumer();
        var ids = ((LoadResponseCharacteristic) _this_).EnergyConsumerIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setEnergyConsumer(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((LoadResponseCharacteristic) _this_).EnergyConsumerIdSet.add((String) _value_);
        } else if (_value_ instanceof EnergyConsumer) {
            ((LoadResponseCharacteristic) _this_).setEnergyConsumer((EnergyConsumer) _value_);
        } else {
            throw new IllegalArgumentException("Object is not EnergyConsumer");
        }
    }

    /**
     * Indicates the exponential voltage dependency model is to be used.   If false, the coefficient model is to be used. The exponential voltage dependency model consist of the attributes - pVoltageExponent - qVoltageExponent. The coefficient model consist of the attributes - pConstantImpedance - pConstantCurrent - pConstantPower - qConstantImpedance - qConstantCurrent - qConstantPower. The sum of pConstantImpedance, pConstantCurrent and pConstantPower shall equal 1. The sum of qConstantImpedance, qConstantCurrent and qConstantPower shall equal 1.
     */
    private Boolean exponentModel; // Boolean

    public Boolean getExponentModel() {
        return exponentModel;
    }

    public void setExponentModel(Boolean _value_) {
        exponentModel = _value_;
    }

    private static Object getExponentModel(BaseClass _this_) {
        return ((LoadResponseCharacteristic) _this_).getExponentModel();
    }

    private static void setExponentModel(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((LoadResponseCharacteristic) _this_).setExponentModel((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((LoadResponseCharacteristic) _this_).setExponentModel(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Portion of active power load modeled as constant current.
     */
    private Double pConstantCurrent; // Simple_Float

    public Double getPConstantCurrent() {
        return pConstantCurrent;
    }

    public void setPConstantCurrent(Double _value_) {
        pConstantCurrent = _value_;
    }

    private static Object getPConstantCurrent(BaseClass _this_) {
        return ((LoadResponseCharacteristic) _this_).getPConstantCurrent();
    }

    private static void setPConstantCurrent(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadResponseCharacteristic) _this_).setPConstantCurrent((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadResponseCharacteristic) _this_).setPConstantCurrent(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Portion of active power load modeled as constant impedance.
     */
    private Double pConstantImpedance; // Simple_Float

    public Double getPConstantImpedance() {
        return pConstantImpedance;
    }

    public void setPConstantImpedance(Double _value_) {
        pConstantImpedance = _value_;
    }

    private static Object getPConstantImpedance(BaseClass _this_) {
        return ((LoadResponseCharacteristic) _this_).getPConstantImpedance();
    }

    private static void setPConstantImpedance(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadResponseCharacteristic) _this_).setPConstantImpedance((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadResponseCharacteristic) _this_).setPConstantImpedance(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Portion of active power load modeled as constant power.
     */
    private Double pConstantPower; // Simple_Float

    public Double getPConstantPower() {
        return pConstantPower;
    }

    public void setPConstantPower(Double _value_) {
        pConstantPower = _value_;
    }

    private static Object getPConstantPower(BaseClass _this_) {
        return ((LoadResponseCharacteristic) _this_).getPConstantPower();
    }

    private static void setPConstantPower(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadResponseCharacteristic) _this_).setPConstantPower((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadResponseCharacteristic) _this_).setPConstantPower(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exponent of per unit frequency effecting active power.
     */
    private Double pFrequencyExponent; // Simple_Float

    public Double getPFrequencyExponent() {
        return pFrequencyExponent;
    }

    public void setPFrequencyExponent(Double _value_) {
        pFrequencyExponent = _value_;
    }

    private static Object getPFrequencyExponent(BaseClass _this_) {
        return ((LoadResponseCharacteristic) _this_).getPFrequencyExponent();
    }

    private static void setPFrequencyExponent(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadResponseCharacteristic) _this_).setPFrequencyExponent((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadResponseCharacteristic) _this_).setPFrequencyExponent(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exponent of per unit voltage effecting real power.
     */
    private Double pVoltageExponent; // Simple_Float

    public Double getPVoltageExponent() {
        return pVoltageExponent;
    }

    public void setPVoltageExponent(Double _value_) {
        pVoltageExponent = _value_;
    }

    private static Object getPVoltageExponent(BaseClass _this_) {
        return ((LoadResponseCharacteristic) _this_).getPVoltageExponent();
    }

    private static void setPVoltageExponent(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadResponseCharacteristic) _this_).setPVoltageExponent((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadResponseCharacteristic) _this_).setPVoltageExponent(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Portion of reactive power load modeled as constant current.
     */
    private Double qConstantCurrent; // Simple_Float

    public Double getQConstantCurrent() {
        return qConstantCurrent;
    }

    public void setQConstantCurrent(Double _value_) {
        qConstantCurrent = _value_;
    }

    private static Object getQConstantCurrent(BaseClass _this_) {
        return ((LoadResponseCharacteristic) _this_).getQConstantCurrent();
    }

    private static void setQConstantCurrent(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadResponseCharacteristic) _this_).setQConstantCurrent((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadResponseCharacteristic) _this_).setQConstantCurrent(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Portion of reactive power load modeled as constant impedance.
     */
    private Double qConstantImpedance; // Simple_Float

    public Double getQConstantImpedance() {
        return qConstantImpedance;
    }

    public void setQConstantImpedance(Double _value_) {
        qConstantImpedance = _value_;
    }

    private static Object getQConstantImpedance(BaseClass _this_) {
        return ((LoadResponseCharacteristic) _this_).getQConstantImpedance();
    }

    private static void setQConstantImpedance(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadResponseCharacteristic) _this_).setQConstantImpedance((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadResponseCharacteristic) _this_).setQConstantImpedance(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Portion of reactive power load modeled as constant power.
     */
    private Double qConstantPower; // Simple_Float

    public Double getQConstantPower() {
        return qConstantPower;
    }

    public void setQConstantPower(Double _value_) {
        qConstantPower = _value_;
    }

    private static Object getQConstantPower(BaseClass _this_) {
        return ((LoadResponseCharacteristic) _this_).getQConstantPower();
    }

    private static void setQConstantPower(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadResponseCharacteristic) _this_).setQConstantPower((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadResponseCharacteristic) _this_).setQConstantPower(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exponent of per unit frequency effecting reactive power.
     */
    private Double qFrequencyExponent; // Simple_Float

    public Double getQFrequencyExponent() {
        return qFrequencyExponent;
    }

    public void setQFrequencyExponent(Double _value_) {
        qFrequencyExponent = _value_;
    }

    private static Object getQFrequencyExponent(BaseClass _this_) {
        return ((LoadResponseCharacteristic) _this_).getQFrequencyExponent();
    }

    private static void setQFrequencyExponent(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadResponseCharacteristic) _this_).setQFrequencyExponent((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadResponseCharacteristic) _this_).setQFrequencyExponent(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exponent of per unit voltage effecting reactive power.
     */
    private Double qVoltageExponent; // Simple_Float

    public Double getQVoltageExponent() {
        return qVoltageExponent;
    }

    public void setQVoltageExponent(Double _value_) {
        qVoltageExponent = _value_;
    }

    private static Object getQVoltageExponent(BaseClass _this_) {
        return ((LoadResponseCharacteristic) _this_).getQVoltageExponent();
    }

    private static void setQVoltageExponent(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadResponseCharacteristic) _this_).setQVoltageExponent((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadResponseCharacteristic) _this_).setQVoltageExponent(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "LoadResponseCharacteristic", attrName));
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
                "LoadResponseCharacteristic", attrName, value));
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
            map.put("EnergyConsumer", new AttrDetails("LoadResponseCharacteristic.EnergyConsumer", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, LoadResponseCharacteristic::getEnergyConsumer, LoadResponseCharacteristic::setEnergyConsumer));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("exponentModel", new AttrDetails("LoadResponseCharacteristic.exponentModel", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadResponseCharacteristic::getExponentModel, LoadResponseCharacteristic::setExponentModel));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("pConstantCurrent", new AttrDetails("LoadResponseCharacteristic.pConstantCurrent", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadResponseCharacteristic::getPConstantCurrent, LoadResponseCharacteristic::setPConstantCurrent));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("pConstantImpedance", new AttrDetails("LoadResponseCharacteristic.pConstantImpedance", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadResponseCharacteristic::getPConstantImpedance, LoadResponseCharacteristic::setPConstantImpedance));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("pConstantPower", new AttrDetails("LoadResponseCharacteristic.pConstantPower", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadResponseCharacteristic::getPConstantPower, LoadResponseCharacteristic::setPConstantPower));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("pFrequencyExponent", new AttrDetails("LoadResponseCharacteristic.pFrequencyExponent", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadResponseCharacteristic::getPFrequencyExponent, LoadResponseCharacteristic::setPFrequencyExponent));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("pVoltageExponent", new AttrDetails("LoadResponseCharacteristic.pVoltageExponent", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadResponseCharacteristic::getPVoltageExponent, LoadResponseCharacteristic::setPVoltageExponent));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("qConstantCurrent", new AttrDetails("LoadResponseCharacteristic.qConstantCurrent", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadResponseCharacteristic::getQConstantCurrent, LoadResponseCharacteristic::setQConstantCurrent));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("qConstantImpedance", new AttrDetails("LoadResponseCharacteristic.qConstantImpedance", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadResponseCharacteristic::getQConstantImpedance, LoadResponseCharacteristic::setQConstantImpedance));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("qConstantPower", new AttrDetails("LoadResponseCharacteristic.qConstantPower", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadResponseCharacteristic::getQConstantPower, LoadResponseCharacteristic::setQConstantPower));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("qFrequencyExponent", new AttrDetails("LoadResponseCharacteristic.qFrequencyExponent", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadResponseCharacteristic::getQFrequencyExponent, LoadResponseCharacteristic::setQFrequencyExponent));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("qVoltageExponent", new AttrDetails("LoadResponseCharacteristic.qVoltageExponent", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadResponseCharacteristic::getQVoltageExponent, LoadResponseCharacteristic::setQVoltageExponent));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new LoadResponseCharacteristic(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
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
