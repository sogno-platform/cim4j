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
 * A unit with valves for three phases, together with unit control equipment, essential protective and switching devices, DC storage capacitors, phase reactors and auxiliaries, if any, used for conversion.
 */
@SuppressWarnings("unused")
public class ACDCConverter extends ConductingEquipment {

    private static final Logging LOG = Logging.getLogger(ACDCConverter.class);

    /**
     * Constructor.
     */
    public ACDCConverter(String rdfid) {
        super("ACDCConverter", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ACDCConverter(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * A DC converter have DC converter terminals. A converter has two DC converter terminals.
     *
     * NOT USED
     */
    private Set<ACDCConverterDCTerminal> DCTerminals = new HashSet<>(); // OneToMany

    public Set<ACDCConverterDCTerminal> getDCTerminals() {
        return DCTerminals;
    }

    public void setDCTerminals(ACDCConverterDCTerminal _object_) {
        if (!DCTerminals.contains(_object_)) {
            DCTerminals.add(_object_);
            _object_.setDCConductingEquipment(this);
        }
    }

    private static Object getDCTerminals(BaseClass _this_) {
        return ((ACDCConverter) _this_).getDCTerminals();
    }

    private static void setDCTerminals(BaseClass _this_, Object _value_) {
        if (_value_ instanceof ACDCConverterDCTerminal) {
            ((ACDCConverter) _this_).setDCTerminals((ACDCConverterDCTerminal) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ACDCConverterDCTerminal");
        }
    }

    /**
     * Point of common coupling terminal for this converter DC side. It is typically the terminal on the power transformer (or switch) closest to the AC network.
     */
    private Terminal PccTerminal; // ManyToOne

    public Terminal getPccTerminal() {
        return PccTerminal;
    }

    public void setPccTerminal(Terminal _object_) {
        if (PccTerminal != _object_) {
            PccTerminal = _object_;
            PccTerminal.setConverterDCSides(this);
        }
    }

    private static Object getPccTerminal(BaseClass _this_) {
        return ((ACDCConverter) _this_).getPccTerminal();
    }

    private static void setPccTerminal(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Terminal) {
            ((ACDCConverter) _this_).setPccTerminal((Terminal) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Terminal");
        }
    }

    /**
     * Base apparent power of the converter pole. The attribute shall be a positive value.
     */
    private Double baseS; // ApparentPower

    public Double getBaseS() {
        return baseS;
    }

    public void setBaseS(Double _value_) {
        baseS = _value_;
    }

    private static Object getBaseS(BaseClass _this_) {
        return ((ACDCConverter) _this_).getBaseS();
    }

    private static void setBaseS(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACDCConverter) _this_).setBaseS((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACDCConverter) _this_).setBaseS(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Converter DC current, also called Id. It is converter`s state variable, result from power flow.
     */
    private Double idc; // CurrentFlow

    public Double getIdc() {
        return idc;
    }

    public void setIdc(Double _value_) {
        idc = _value_;
    }

    private static Object getIdc(BaseClass _this_) {
        return ((ACDCConverter) _this_).getIdc();
    }

    private static void setIdc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACDCConverter) _this_).setIdc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACDCConverter) _this_).setIdc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Active power loss in pole at no power transfer. It is converter`s configuration data used in power flow. The attribute shall be a positive value.
     */
    private Double idleLoss; // ActivePower

    public Double getIdleLoss() {
        return idleLoss;
    }

    public void setIdleLoss(Double _value_) {
        idleLoss = _value_;
    }

    private static Object getIdleLoss(BaseClass _this_) {
        return ((ACDCConverter) _this_).getIdleLoss();
    }

    private static void setIdleLoss(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACDCConverter) _this_).setIdleLoss((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACDCConverter) _this_).setIdleLoss(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum active power limit. The value is overwritten by values of VsCapabilityCurve, if present.
     */
    private Double maxP; // ActivePower

    public Double getMaxP() {
        return maxP;
    }

    public void setMaxP(Double _value_) {
        maxP = _value_;
    }

    private static Object getMaxP(BaseClass _this_) {
        return ((ACDCConverter) _this_).getMaxP();
    }

    private static void setMaxP(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACDCConverter) _this_).setMaxP((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACDCConverter) _this_).setMaxP(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * The maximum voltage on the DC side at which the converter should operate. It is converter`s configuration data used in power flow. The attribute shall be a positive value.
     */
    private Double maxUdc; // Voltage

    public Double getMaxUdc() {
        return maxUdc;
    }

    public void setMaxUdc(Double _value_) {
        maxUdc = _value_;
    }

    private static Object getMaxUdc(BaseClass _this_) {
        return ((ACDCConverter) _this_).getMaxUdc();
    }

    private static void setMaxUdc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACDCConverter) _this_).setMaxUdc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACDCConverter) _this_).setMaxUdc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum active power limit. The value is overwritten by values of VsCapabilityCurve, if present.
     */
    private Double minP; // ActivePower

    public Double getMinP() {
        return minP;
    }

    public void setMinP(Double _value_) {
        minP = _value_;
    }

    private static Object getMinP(BaseClass _this_) {
        return ((ACDCConverter) _this_).getMinP();
    }

    private static void setMinP(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACDCConverter) _this_).setMinP((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACDCConverter) _this_).setMinP(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * The minimum voltage on the DC side at which the converter should operate. It is converter`s configuration data used in power flow. The attribute shall be a positive value.
     */
    private Double minUdc; // Voltage

    public Double getMinUdc() {
        return minUdc;
    }

    public void setMinUdc(Double _value_) {
        minUdc = _value_;
    }

    private static Object getMinUdc(BaseClass _this_) {
        return ((ACDCConverter) _this_).getMinUdc();
    }

    private static void setMinUdc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACDCConverter) _this_).setMinUdc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACDCConverter) _this_).setMinUdc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Number of valves in the converter. Used in loss calculations.
     */
    private Integer numberOfValves; // Integer

    public Integer getNumberOfValves() {
        return numberOfValves;
    }

    public void setNumberOfValves(Integer _value_) {
        numberOfValves = _value_;
    }

    private static Object getNumberOfValves(BaseClass _this_) {
        return ((ACDCConverter) _this_).getNumberOfValves();
    }

    private static void setNumberOfValves(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((ACDCConverter) _this_).setNumberOfValves((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((ACDCConverter) _this_).setNumberOfValves(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
        }
    }

    /**
     * Active power at the point of common coupling. Load sign convention is used, i.e. positive sign means flow out from a node. Starting value for a steady state solution in the case a simplified power flow model is used.
     */
    private Double p; // ActivePower

    public Double getP() {
        return p;
    }

    public void setP(Double _value_) {
        p = _value_;
    }

    private static Object getP(BaseClass _this_) {
        return ((ACDCConverter) _this_).getP();
    }

    private static void setP(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACDCConverter) _this_).setP((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACDCConverter) _this_).setP(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * The active power loss at a DC Pole  = idleLoss + switchingLoss*|Idc| + resitiveLoss*Idc^2. For lossless operation Pdc=Pac. For rectifier operation with losses Pdc=Pac-lossP. For inverter operation with losses Pdc=Pac+lossP. It is converter`s state variable used in power flow. The attribute shall be a positive value.
     */
    private Double poleLossP; // ActivePower

    public Double getPoleLossP() {
        return poleLossP;
    }

    public void setPoleLossP(Double _value_) {
        poleLossP = _value_;
    }

    private static Object getPoleLossP(BaseClass _this_) {
        return ((ACDCConverter) _this_).getPoleLossP();
    }

    private static void setPoleLossP(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACDCConverter) _this_).setPoleLossP((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACDCConverter) _this_).setPoleLossP(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive power at the point of common coupling. Load sign convention is used, i.e. positive sign means flow out from a node. Starting value for a steady state solution in the case a simplified power flow model is used.
     */
    private Double q; // ReactivePower

    public Double getQ() {
        return q;
    }

    public void setQ(Double _value_) {
        q = _value_;
    }

    private static Object getQ(BaseClass _this_) {
        return ((ACDCConverter) _this_).getQ();
    }

    private static void setQ(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACDCConverter) _this_).setQ((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACDCConverter) _this_).setQ(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rated converter DC voltage, also called UdN. The attribute shall be a positive value. It is converter`s configuration data used in power flow. For instance a bipolar HVDC link with value  200 kV has a 400kV difference between the dc lines.
     */
    private Double ratedUdc; // Voltage

    public Double getRatedUdc() {
        return ratedUdc;
    }

    public void setRatedUdc(Double _value_) {
        ratedUdc = _value_;
    }

    private static Object getRatedUdc(BaseClass _this_) {
        return ((ACDCConverter) _this_).getRatedUdc();
    }

    private static void setRatedUdc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACDCConverter) _this_).setRatedUdc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACDCConverter) _this_).setRatedUdc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * It is converter`s configuration data used in power flow. Refer to poleLossP. The attribute shall be a positive value.
     */
    private Double resistiveLoss; // Resistance

    public Double getResistiveLoss() {
        return resistiveLoss;
    }

    public void setResistiveLoss(Double _value_) {
        resistiveLoss = _value_;
    }

    private static Object getResistiveLoss(BaseClass _this_) {
        return ((ACDCConverter) _this_).getResistiveLoss();
    }

    private static void setResistiveLoss(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACDCConverter) _this_).setResistiveLoss((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACDCConverter) _this_).setResistiveLoss(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Switching losses, relative to the base apparent power `baseS`. Refer to poleLossP. The attribute shall be a positive value.
     */
    private Double switchingLoss; // ActivePowerPerCurrentFlow

    public Double getSwitchingLoss() {
        return switchingLoss;
    }

    public void setSwitchingLoss(Double _value_) {
        switchingLoss = _value_;
    }

    private static Object getSwitchingLoss(BaseClass _this_) {
        return ((ACDCConverter) _this_).getSwitchingLoss();
    }

    private static void setSwitchingLoss(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACDCConverter) _this_).setSwitchingLoss((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACDCConverter) _this_).setSwitchingLoss(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Real power injection target in AC grid, at point of common coupling.  Load sign convention is used, i.e. positive sign means flow out from a node.
     */
    private Double targetPpcc; // ActivePower

    public Double getTargetPpcc() {
        return targetPpcc;
    }

    public void setTargetPpcc(Double _value_) {
        targetPpcc = _value_;
    }

    private static Object getTargetPpcc(BaseClass _this_) {
        return ((ACDCConverter) _this_).getTargetPpcc();
    }

    private static void setTargetPpcc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACDCConverter) _this_).setTargetPpcc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACDCConverter) _this_).setTargetPpcc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Target value for DC voltage magnitude. The attribute shall be a positive value.
     */
    private Double targetUdc; // Voltage

    public Double getTargetUdc() {
        return targetUdc;
    }

    public void setTargetUdc(Double _value_) {
        targetUdc = _value_;
    }

    private static Object getTargetUdc(BaseClass _this_) {
        return ((ACDCConverter) _this_).getTargetUdc();
    }

    private static void setTargetUdc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACDCConverter) _this_).setTargetUdc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACDCConverter) _this_).setTargetUdc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Line-to-line converter voltage, the voltage at the AC side of the valve. It is converter`s state variable, result from power flow. The attribute shall be a positive value.
     */
    private Double uc; // Voltage

    public Double getUc() {
        return uc;
    }

    public void setUc(Double _value_) {
        uc = _value_;
    }

    private static Object getUc(BaseClass _this_) {
        return ((ACDCConverter) _this_).getUc();
    }

    private static void setUc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACDCConverter) _this_).setUc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACDCConverter) _this_).setUc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Converter voltage at the DC side, also called Ud. It is converter`s state variable, result from power flow. The attribute shall be a positive value.
     */
    private Double udc; // Voltage

    public Double getUdc() {
        return udc;
    }

    public void setUdc(Double _value_) {
        udc = _value_;
    }

    private static Object getUdc(BaseClass _this_) {
        return ((ACDCConverter) _this_).getUdc();
    }

    private static void setUdc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACDCConverter) _this_).setUdc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACDCConverter) _this_).setUdc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Valve threshold voltage, also called Uvalve. Forward voltage drop when the valve is conducting. Used in loss calculations, i.e. the switchLoss depend on numberOfValves * valveU0.
     */
    private Double valveU0; // Voltage

    public Double getValveU0() {
        return valveU0;
    }

    public void setValveU0(Double _value_) {
        valveU0 = _value_;
    }

    private static Object getValveU0(BaseClass _this_) {
        return ((ACDCConverter) _this_).getValveU0();
    }

    private static void setValveU0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ACDCConverter) _this_).setValveU0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ACDCConverter) _this_).setValveU0(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ACDCConverter", attrName));
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
                "ACDCConverter", attrName, value));
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
            map.put("DCTerminals", new AttrDetails("ACDCConverter.DCTerminals", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, ACDCConverter::getDCTerminals, ACDCConverter::setDCTerminals));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("PccTerminal", new AttrDetails("ACDCConverter.PccTerminal", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ACDCConverter::getPccTerminal, ACDCConverter::setPccTerminal));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("baseS", new AttrDetails("ACDCConverter.baseS", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACDCConverter::getBaseS, ACDCConverter::setBaseS));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("idc", new AttrDetails("ACDCConverter.idc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACDCConverter::getIdc, ACDCConverter::setIdc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("idleLoss", new AttrDetails("ACDCConverter.idleLoss", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACDCConverter::getIdleLoss, ACDCConverter::setIdleLoss));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxP", new AttrDetails("ACDCConverter.maxP", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACDCConverter::getMaxP, ACDCConverter::setMaxP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxUdc", new AttrDetails("ACDCConverter.maxUdc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACDCConverter::getMaxUdc, ACDCConverter::setMaxUdc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minP", new AttrDetails("ACDCConverter.minP", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACDCConverter::getMinP, ACDCConverter::setMinP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minUdc", new AttrDetails("ACDCConverter.minUdc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACDCConverter::getMinUdc, ACDCConverter::setMinUdc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("numberOfValves", new AttrDetails("ACDCConverter.numberOfValves", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACDCConverter::getNumberOfValves, ACDCConverter::setNumberOfValves));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("p", new AttrDetails("ACDCConverter.p", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACDCConverter::getP, ACDCConverter::setP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("poleLossP", new AttrDetails("ACDCConverter.poleLossP", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACDCConverter::getPoleLossP, ACDCConverter::setPoleLossP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("q", new AttrDetails("ACDCConverter.q", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACDCConverter::getQ, ACDCConverter::setQ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedUdc", new AttrDetails("ACDCConverter.ratedUdc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACDCConverter::getRatedUdc, ACDCConverter::setRatedUdc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("resistiveLoss", new AttrDetails("ACDCConverter.resistiveLoss", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACDCConverter::getResistiveLoss, ACDCConverter::setResistiveLoss));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("switchingLoss", new AttrDetails("ACDCConverter.switchingLoss", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACDCConverter::getSwitchingLoss, ACDCConverter::setSwitchingLoss));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetPpcc", new AttrDetails("ACDCConverter.targetPpcc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACDCConverter::getTargetPpcc, ACDCConverter::setTargetPpcc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetUdc", new AttrDetails("ACDCConverter.targetUdc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACDCConverter::getTargetUdc, ACDCConverter::setTargetUdc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("uc", new AttrDetails("ACDCConverter.uc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACDCConverter::getUc, ACDCConverter::setUc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("udc", new AttrDetails("ACDCConverter.udc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACDCConverter::getUdc, ACDCConverter::setUdc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("valveU0", new AttrDetails("ACDCConverter.valveU0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ACDCConverter::getValveU0, ACDCConverter::setValveU0));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ACDCConverter(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.DY);
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.SSH);
        profiles.add(CGMESProfile.SV);
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
