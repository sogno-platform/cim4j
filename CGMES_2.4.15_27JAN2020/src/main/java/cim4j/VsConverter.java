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
 * DC side of the voltage source converter (VSC).
 */
@SuppressWarnings("unused")
public class VsConverter extends ACDCConverter {

    private static final Logging LOG = Logging.getLogger(VsConverter.class);

    /**
     * Default constructor.
     */
    public VsConverter() {
        setCimType("VsConverter");
    }

    /**
     * All converters with this capability curve.
     */
    private VsCapabilityCurve CapabilityCurve; // ManyToOne

    public VsCapabilityCurve getCapabilityCurve() {
        return CapabilityCurve;
    }

    public void setCapabilityCurve(BaseClass _object_) {
        if (!(_object_ instanceof VsCapabilityCurve)) {
            throw new IllegalArgumentException("Object is not VsCapabilityCurve");
        }
        if (CapabilityCurve != _object_) {
            CapabilityCurve = (VsCapabilityCurve) _object_;
            CapabilityCurve.setVsConverterDCSides(this);
        }
    }

    public String CapabilityCurveToString() {
        return CapabilityCurve != null ? CapabilityCurve.getRdfid() : null;
    }

    /**
     * Angle between uf and uc. Converter state variable used in power flow.
     */
    private Double delta; // AngleDegrees

    public Double getDelta() {
        return delta;
    }

    public void setDelta(Double _value_) {
        delta = _value_;
    }

    public void setDelta(String _value_) {
        delta = getDoubleFromString(_value_);
    }

    public String deltaToString() {
        return delta != null ? delta.toString() : null;
    }

    /**
     * Droop constant; pu value is obtained as D [kV^2 / MW] x Sb / Ubdc^2.
     */
    private Double droop; // PU

    public Double getDroop() {
        return droop;
    }

    public void setDroop(Double _value_) {
        droop = _value_;
    }

    public void setDroop(String _value_) {
        droop = getDoubleFromString(_value_);
    }

    public String droopToString() {
        return droop != null ? droop.toString() : null;
    }

    /**
     * Compensation (resistance) constant. Used to compensate for voltage drop when controlling voltage at a distant bus.
     */
    private Double droopCompensation; // Resistance

    public Double getDroopCompensation() {
        return droopCompensation;
    }

    public void setDroopCompensation(Double _value_) {
        droopCompensation = _value_;
    }

    public void setDroopCompensation(String _value_) {
        droopCompensation = getDoubleFromString(_value_);
    }

    public String droopCompensationToString() {
        return droopCompensation != null ? droopCompensation.toString() : null;
    }

    /**
     * The max quotient between the AC converter voltage (Uc) and DC voltage (Ud). A factor typically less than 1. VSC configuration data used in power flow.
     */
    private Double maxModulationIndex; // Simple_Float

    public Double getMaxModulationIndex() {
        return maxModulationIndex;
    }

    public void setMaxModulationIndex(Double _value_) {
        maxModulationIndex = _value_;
    }

    public void setMaxModulationIndex(String _value_) {
        maxModulationIndex = getDoubleFromString(_value_);
    }

    public String maxModulationIndexToString() {
        return maxModulationIndex != null ? maxModulationIndex.toString() : null;
    }

    /**
     * The maximum current through a valve. This current limit is the basis for calculating the capability diagram. VSC  configuration data.
     */
    private Double maxValveCurrent; // CurrentFlow

    public Double getMaxValveCurrent() {
        return maxValveCurrent;
    }

    public void setMaxValveCurrent(Double _value_) {
        maxValveCurrent = _value_;
    }

    public void setMaxValveCurrent(String _value_) {
        maxValveCurrent = getDoubleFromString(_value_);
    }

    public String maxValveCurrentToString() {
        return maxValveCurrent != null ? maxValveCurrent.toString() : null;
    }

    /**
     * Kind of control of real power and/or DC voltage.
     */
    private String pPccControl; // VsPpccControlKind

    public String getPPccControl() {
        return pPccControl;
    }

    public void setPPccControl(String _value_) {
        pPccControl = _value_;
    }

    public String pPccControlToString() {
        return pPccControl;
    }

    /**
     */
    private String qPccControl; // VsQpccControlKind

    public String getQPccControl() {
        return qPccControl;
    }

    public void setQPccControl(String _value_) {
        qPccControl = _value_;
    }

    public String qPccControlToString() {
        return qPccControl;
    }

    /**
     * Reactive power sharing factor among parallel converters on Uac control.
     */
    private Double qShare; // PerCent

    public Double getQShare() {
        return qShare;
    }

    public void setQShare(Double _value_) {
        qShare = _value_;
    }

    public void setQShare(String _value_) {
        qShare = getDoubleFromString(_value_);
    }

    public String qShareToString() {
        return qShare != null ? qShare.toString() : null;
    }

    /**
     * Reactive power injection target in AC grid, at point of common coupling.
     */
    private Double targetQpcc; // ReactivePower

    public Double getTargetQpcc() {
        return targetQpcc;
    }

    public void setTargetQpcc(Double _value_) {
        targetQpcc = _value_;
    }

    public void setTargetQpcc(String _value_) {
        targetQpcc = getDoubleFromString(_value_);
    }

    public String targetQpccToString() {
        return targetQpcc != null ? targetQpcc.toString() : null;
    }

    /**
     * Voltage target in AC grid, at point of common coupling.
     */
    private Double targetUpcc; // Voltage

    public Double getTargetUpcc() {
        return targetUpcc;
    }

    public void setTargetUpcc(Double _value_) {
        targetUpcc = _value_;
    }

    public void setTargetUpcc(String _value_) {
        targetUpcc = getDoubleFromString(_value_);
    }

    public String targetUpccToString() {
        return targetUpcc != null ? targetUpcc.toString() : null;
    }

    /**
     * Filter bus voltage. Converter state variable, result from power flow.
     */
    private Double uf; // Voltage

    public Double getUf() {
        return uf;
    }

    public void setUf(Double _value_) {
        uf = _value_;
    }

    public void setUf(String _value_) {
        uf = getDoubleFromString(_value_);
    }

    public String ufToString() {
        return uf != null ? uf.toString() : null;
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
        return getAttribute("VsConverter", attrName);
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
        setAttribute("VsConverter", attrName, objectValue);
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
        setAttribute("VsConverter", attrName, stringValue);
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
            map.put("CapabilityCurve", new AttrDetails("VsConverter.CapabilityCurve", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("delta", new AttrDetails("VsConverter.delta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("droop", new AttrDetails("VsConverter.droop", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("droopCompensation", new AttrDetails("VsConverter.droopCompensation", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxModulationIndex", new AttrDetails("VsConverter.maxModulationIndex", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxValveCurrent", new AttrDetails("VsConverter.maxValveCurrent", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("pPccControl", new AttrDetails("VsConverter.pPccControl", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("qPccControl", new AttrDetails("VsConverter.qPccControl", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("qShare", new AttrDetails("VsConverter.qShare", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetQpcc", new AttrDetails("VsConverter.targetQpcc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetUpcc", new AttrDetails("VsConverter.targetUpcc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("uf", new AttrDetails("VsConverter.uf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new VsConverter().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("CapabilityCurve", new GetterSetter(this::CapabilityCurveToString, this::setCapabilityCurve, null));
        map.put("delta", new GetterSetter(this::deltaToString, null, this::setDelta));
        map.put("droop", new GetterSetter(this::droopToString, null, this::setDroop));
        map.put("droopCompensation", new GetterSetter(this::droopCompensationToString, null, this::setDroopCompensation));
        map.put("maxModulationIndex", new GetterSetter(this::maxModulationIndexToString, null, this::setMaxModulationIndex));
        map.put("maxValveCurrent", new GetterSetter(this::maxValveCurrentToString, null, this::setMaxValveCurrent));
        map.put("pPccControl", new GetterSetter(this::pPccControlToString, null, this::setPPccControl));
        map.put("qPccControl", new GetterSetter(this::qPccControlToString, null, this::setQPccControl));
        map.put("qShare", new GetterSetter(this::qShareToString, null, this::setQShare));
        map.put("targetQpcc", new GetterSetter(this::targetQpccToString, null, this::setTargetQpcc));
        map.put("targetUpcc", new GetterSetter(this::targetUpccToString, null, this::setTargetUpcc));
        map.put("uf", new GetterSetter(this::ufToString, null, this::setUf));
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
