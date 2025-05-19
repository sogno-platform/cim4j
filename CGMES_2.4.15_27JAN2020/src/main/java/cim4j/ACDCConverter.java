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
     * Default constructor.
     */
    public ACDCConverter() {
        setCimType("ACDCConverter");
    }

    /**
     *
     * NOT USED
     */
    private Set<ACDCConverterDCTerminal> DCTerminals = new HashSet<>(); // OneToMany

    public Set<ACDCConverterDCTerminal> getDCTerminals() {
        return DCTerminals;
    }

    public void setDCTerminals(BaseClass _object_) {
        if (!(_object_ instanceof ACDCConverterDCTerminal)) {
            throw new IllegalArgumentException("Object is not ACDCConverterDCTerminal");
        }
        if (!DCTerminals.contains(_object_)) {
            DCTerminals.add((ACDCConverterDCTerminal) _object_);
            ((ACDCConverterDCTerminal) _object_).setDCConductingEquipment(this);
        }
    }

    public String DCTerminalsToString() {
        return getStringFromSet(DCTerminals);
    }

    /**
     * All converters` DC sides linked to this point of common coupling terminal.
     */
    private Terminal PccTerminal; // ManyToOne

    public Terminal getPccTerminal() {
        return PccTerminal;
    }

    public void setPccTerminal(BaseClass _object_) {
        if (!(_object_ instanceof Terminal)) {
            throw new IllegalArgumentException("Object is not Terminal");
        }
        if (PccTerminal != _object_) {
            PccTerminal = (Terminal) _object_;
            PccTerminal.setConverterDCSides(this);
        }
    }

    public String PccTerminalToString() {
        return PccTerminal != null ? PccTerminal.getRdfid() : null;
    }

    /**
     * Base apparent power of the converter pole.
     */
    private Double baseS; // ApparentPower

    public Double getBaseS() {
        return baseS;
    }

    public void setBaseS(Double _value_) {
        baseS = _value_;
    }

    public void setBaseS(String _value_) {
        baseS = getDoubleFromString(_value_);
    }

    public String baseSToString() {
        return baseS != null ? baseS.toString() : null;
    }

    /**
     * Converter DC current, also called Id. Converter state variable, result from power flow.
     */
    private Double idc; // CurrentFlow

    public Double getIdc() {
        return idc;
    }

    public void setIdc(Double _value_) {
        idc = _value_;
    }

    public void setIdc(String _value_) {
        idc = getDoubleFromString(_value_);
    }

    public String idcToString() {
        return idc != null ? idc.toString() : null;
    }

    /**
     * Active power loss in pole at no power transfer. Converter configuration data used in power flow.
     */
    private Double idleLoss; // ActivePower

    public Double getIdleLoss() {
        return idleLoss;
    }

    public void setIdleLoss(Double _value_) {
        idleLoss = _value_;
    }

    public void setIdleLoss(String _value_) {
        idleLoss = getDoubleFromString(_value_);
    }

    public String idleLossToString() {
        return idleLoss != null ? idleLoss.toString() : null;
    }

    /**
     * The maximum voltage on the DC side at which the converter should operate. Converter configuration data used in power flow.
     */
    private Double maxUdc; // Voltage

    public Double getMaxUdc() {
        return maxUdc;
    }

    public void setMaxUdc(Double _value_) {
        maxUdc = _value_;
    }

    public void setMaxUdc(String _value_) {
        maxUdc = getDoubleFromString(_value_);
    }

    public String maxUdcToString() {
        return maxUdc != null ? maxUdc.toString() : null;
    }

    /**
     * Min allowed converter DC voltage. Converter configuration data used in power flow.
     */
    private Double minUdc; // Voltage

    public Double getMinUdc() {
        return minUdc;
    }

    public void setMinUdc(Double _value_) {
        minUdc = _value_;
    }

    public void setMinUdc(String _value_) {
        minUdc = getDoubleFromString(_value_);
    }

    public String minUdcToString() {
        return minUdc != null ? minUdc.toString() : null;
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

    public void setNumberOfValves(String _value_) {
        numberOfValves = getIntegerFromString(_value_);
    }

    public String numberOfValvesToString() {
        return numberOfValves != null ? numberOfValves.toString() : null;
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

    public void setP(String _value_) {
        p = getDoubleFromString(_value_);
    }

    public String pToString() {
        return p != null ? p.toString() : null;
    }

    /**
     * The active power loss at a DC Pole  = idleLoss + switchingLoss*|Idc| + resitiveLoss*Idc^2 For lossless operation Pdc=Pac For rectifier operation with losses Pdc=Pac-lossP For inverter operation with losses Pdc=Pac+lossP Converter state variable used in power flow.
     */
    private Double poleLossP; // ActivePower

    public Double getPoleLossP() {
        return poleLossP;
    }

    public void setPoleLossP(Double _value_) {
        poleLossP = _value_;
    }

    public void setPoleLossP(String _value_) {
        poleLossP = getDoubleFromString(_value_);
    }

    public String poleLossPToString() {
        return poleLossP != null ? poleLossP.toString() : null;
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

    public void setQ(String _value_) {
        q = getDoubleFromString(_value_);
    }

    public String qToString() {
        return q != null ? q.toString() : null;
    }

    /**
     * Rated converter DC voltage, also called UdN. Converter configuration data used in power flow.
     */
    private Double ratedUdc; // Voltage

    public Double getRatedUdc() {
        return ratedUdc;
    }

    public void setRatedUdc(Double _value_) {
        ratedUdc = _value_;
    }

    public void setRatedUdc(String _value_) {
        ratedUdc = getDoubleFromString(_value_);
    }

    public String ratedUdcToString() {
        return ratedUdc != null ? ratedUdc.toString() : null;
    }

    /**
     * Converter configuration data used in power flow. Refer to poleLossP.
     */
    private Double resistiveLoss; // Resistance

    public Double getResistiveLoss() {
        return resistiveLoss;
    }

    public void setResistiveLoss(Double _value_) {
        resistiveLoss = _value_;
    }

    public void setResistiveLoss(String _value_) {
        resistiveLoss = getDoubleFromString(_value_);
    }

    public String resistiveLossToString() {
        return resistiveLoss != null ? resistiveLoss.toString() : null;
    }

    /**
     * Switching losses, relative to the base apparent power `baseS`. Refer to poleLossP.
     */
    private Double switchingLoss; // ActivePowerPerCurrentFlow

    public Double getSwitchingLoss() {
        return switchingLoss;
    }

    public void setSwitchingLoss(Double _value_) {
        switchingLoss = _value_;
    }

    public void setSwitchingLoss(String _value_) {
        switchingLoss = getDoubleFromString(_value_);
    }

    public String switchingLossToString() {
        return switchingLoss != null ? switchingLoss.toString() : null;
    }

    /**
     * Real power injection target in AC grid, at point of common coupling.
     */
    private Double targetPpcc; // ActivePower

    public Double getTargetPpcc() {
        return targetPpcc;
    }

    public void setTargetPpcc(Double _value_) {
        targetPpcc = _value_;
    }

    public void setTargetPpcc(String _value_) {
        targetPpcc = getDoubleFromString(_value_);
    }

    public String targetPpccToString() {
        return targetPpcc != null ? targetPpcc.toString() : null;
    }

    /**
     * Target value for DC voltage magnitude.
     */
    private Double targetUdc; // Voltage

    public Double getTargetUdc() {
        return targetUdc;
    }

    public void setTargetUdc(Double _value_) {
        targetUdc = _value_;
    }

    public void setTargetUdc(String _value_) {
        targetUdc = getDoubleFromString(_value_);
    }

    public String targetUdcToString() {
        return targetUdc != null ? targetUdc.toString() : null;
    }

    /**
     * Converter voltage, the voltage at the AC side of the bridge. Converter state variable, result from power flow.
     */
    private Double uc; // Voltage

    public Double getUc() {
        return uc;
    }

    public void setUc(Double _value_) {
        uc = _value_;
    }

    public void setUc(String _value_) {
        uc = getDoubleFromString(_value_);
    }

    public String ucToString() {
        return uc != null ? uc.toString() : null;
    }

    /**
     * Converter voltage at the DC side, also called Ud. Converter state variable, result from power flow.
     */
    private Double udc; // Voltage

    public Double getUdc() {
        return udc;
    }

    public void setUdc(Double _value_) {
        udc = _value_;
    }

    public void setUdc(String _value_) {
        udc = getDoubleFromString(_value_);
    }

    public String udcToString() {
        return udc != null ? udc.toString() : null;
    }

    /**
     * Valve threshold voltage. Forward voltage drop when the valve is conducting. Used in loss calculations, i.e. the switchLoss depend on numberOfValves * valveU0.
     */
    private Double valveU0; // Voltage

    public Double getValveU0() {
        return valveU0;
    }

    public void setValveU0(Double _value_) {
        valveU0 = _value_;
    }

    public void setValveU0(String _value_) {
        valveU0 = getDoubleFromString(_value_);
    }

    public String valveU0ToString() {
        return valveU0 != null ? valveU0.toString() : null;
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
        return getAttribute("ACDCConverter", attrName);
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
        setAttribute("ACDCConverter", attrName, objectValue);
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
        setAttribute("ACDCConverter", attrName, stringValue);
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
            profiles.add(CGMESProfile.EQ);
            map.put("DCTerminals", new AttrDetails("ACDCConverter.DCTerminals", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("PccTerminal", new AttrDetails("ACDCConverter.PccTerminal", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("baseS", new AttrDetails("ACDCConverter.baseS", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("idc", new AttrDetails("ACDCConverter.idc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("idleLoss", new AttrDetails("ACDCConverter.idleLoss", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxUdc", new AttrDetails("ACDCConverter.maxUdc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minUdc", new AttrDetails("ACDCConverter.minUdc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("numberOfValves", new AttrDetails("ACDCConverter.numberOfValves", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("p", new AttrDetails("ACDCConverter.p", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("poleLossP", new AttrDetails("ACDCConverter.poleLossP", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("q", new AttrDetails("ACDCConverter.q", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedUdc", new AttrDetails("ACDCConverter.ratedUdc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("resistiveLoss", new AttrDetails("ACDCConverter.resistiveLoss", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("switchingLoss", new AttrDetails("ACDCConverter.switchingLoss", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetPpcc", new AttrDetails("ACDCConverter.targetPpcc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetUdc", new AttrDetails("ACDCConverter.targetUdc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("uc", new AttrDetails("ACDCConverter.uc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("udc", new AttrDetails("ACDCConverter.udc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("valveU0", new AttrDetails("ACDCConverter.valveU0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ACDCConverter().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("DCTerminals", new GetterSetter(this::DCTerminalsToString, this::setDCTerminals, null));
        map.put("PccTerminal", new GetterSetter(this::PccTerminalToString, this::setPccTerminal, null));
        map.put("baseS", new GetterSetter(this::baseSToString, null, this::setBaseS));
        map.put("idc", new GetterSetter(this::idcToString, null, this::setIdc));
        map.put("idleLoss", new GetterSetter(this::idleLossToString, null, this::setIdleLoss));
        map.put("maxUdc", new GetterSetter(this::maxUdcToString, null, this::setMaxUdc));
        map.put("minUdc", new GetterSetter(this::minUdcToString, null, this::setMinUdc));
        map.put("numberOfValves", new GetterSetter(this::numberOfValvesToString, null, this::setNumberOfValves));
        map.put("p", new GetterSetter(this::pToString, null, this::setP));
        map.put("poleLossP", new GetterSetter(this::poleLossPToString, null, this::setPoleLossP));
        map.put("q", new GetterSetter(this::qToString, null, this::setQ));
        map.put("ratedUdc", new GetterSetter(this::ratedUdcToString, null, this::setRatedUdc));
        map.put("resistiveLoss", new GetterSetter(this::resistiveLossToString, null, this::setResistiveLoss));
        map.put("switchingLoss", new GetterSetter(this::switchingLossToString, null, this::setSwitchingLoss));
        map.put("targetPpcc", new GetterSetter(this::targetPpccToString, null, this::setTargetPpcc));
        map.put("targetUdc", new GetterSetter(this::targetUdcToString, null, this::setTargetUdc));
        map.put("uc", new GetterSetter(this::ucToString, null, this::setUc));
        map.put("udc", new GetterSetter(this::udcToString, null, this::setUdc));
        map.put("valveU0", new GetterSetter(this::valveU0ToString, null, this::setValveU0));
        return map;
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.SV);
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
