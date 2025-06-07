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
     * Constructor.
     */
    public VsConverter(String rdfid) {
        super("VsConverter", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected VsConverter(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Capability curve of this converter.
     */
    private VsCapabilityCurve CapabilityCurve; // ManyToOne

    public VsCapabilityCurve getCapabilityCurve() {
        return CapabilityCurve;
    }

    public void setCapabilityCurve(VsCapabilityCurve _object_) {
        if (CapabilityCurve != _object_) {
            CapabilityCurve = _object_;
            CapabilityCurve.setVsConverterDCSides(this);
        }
    }

    private static Object getCapabilityCurve(BaseClass _this_) {
        return ((VsConverter) _this_).getCapabilityCurve();
    }

    private static void setCapabilityCurve(BaseClass _this_, Object _value_) {
        if (_value_ instanceof VsCapabilityCurve) {
            ((VsConverter) _this_).setCapabilityCurve((VsCapabilityCurve) _value_);
        } else {
            throw new IllegalArgumentException("Object is not VsCapabilityCurve");
        }
    }

    /**
     * Voltage source converter dynamics model used to describe dynamic behaviour of this converter.
     *
     * NOT USED
     */
    private VSCDynamics VSCDynamics; // OneToOne

    public VSCDynamics getVSCDynamics() {
        return VSCDynamics;
    }

    public void setVSCDynamics(VSCDynamics _object_) {
        if (VSCDynamics != _object_) {
            VSCDynamics = _object_;
            VSCDynamics.setVsConverter(this);
        }
    }

    private static Object getVSCDynamics(BaseClass _this_) {
        return ((VsConverter) _this_).getVSCDynamics();
    }

    private static void setVSCDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof VSCDynamics) {
            ((VsConverter) _this_).setVSCDynamics((VSCDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not VSCDynamics");
        }
    }

    /**
     * Angle between VsConverter.uv and ACDCConverter.uc. It is converter`s state variable used in power flow. The attribute shall be a positive value or zero.
     */
    private Double delta; // AngleDegrees

    public Double getDelta() {
        return delta;
    }

    public void setDelta(Double _value_) {
        delta = _value_;
    }

    private static Object getDelta(BaseClass _this_) {
        return ((VsConverter) _this_).getDelta();
    }

    private static void setDelta(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((VsConverter) _this_).setDelta((Double) _value_);
        } else if (_value_ instanceof String) {
            ((VsConverter) _this_).setDelta(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Droop constant. The pu value is obtained as D [kV/MW] x Sb / Ubdc. The attribute shall be a positive value.
     */
    private Double droop; // PU

    public Double getDroop() {
        return droop;
    }

    public void setDroop(Double _value_) {
        droop = _value_;
    }

    private static Object getDroop(BaseClass _this_) {
        return ((VsConverter) _this_).getDroop();
    }

    private static void setDroop(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((VsConverter) _this_).setDroop((Double) _value_);
        } else if (_value_ instanceof String) {
            ((VsConverter) _this_).setDroop(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Compensation constant. Used to compensate for voltage drop when controlling voltage at a distant bus. The attribute shall be a positive value.
     */
    private Double droopCompensation; // Resistance

    public Double getDroopCompensation() {
        return droopCompensation;
    }

    public void setDroopCompensation(Double _value_) {
        droopCompensation = _value_;
    }

    private static Object getDroopCompensation(BaseClass _this_) {
        return ((VsConverter) _this_).getDroopCompensation();
    }

    private static void setDroopCompensation(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((VsConverter) _this_).setDroopCompensation((Double) _value_);
        } else if (_value_ instanceof String) {
            ((VsConverter) _this_).setDroopCompensation(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * The maximum quotient between the AC converter voltage (Uc) and DC voltage (Ud). A factor typically less than 1. It is converter`s configuration data used in power flow.
     */
    private Float maxModulationIndex; // Float

    public Float getMaxModulationIndex() {
        return maxModulationIndex;
    }

    public void setMaxModulationIndex(Float _value_) {
        maxModulationIndex = _value_;
    }

    private static Object getMaxModulationIndex(BaseClass _this_) {
        return ((VsConverter) _this_).getMaxModulationIndex();
    }

    private static void setMaxModulationIndex(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((VsConverter) _this_).setMaxModulationIndex((Float) _value_);
        } else if (_value_ instanceof String) {
            ((VsConverter) _this_).setMaxModulationIndex(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
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

    private static Object getPPccControl(BaseClass _this_) {
        return ((VsConverter) _this_).getPPccControl();
    }

    private static void setPPccControl(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((VsConverter) _this_).setPPccControl((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Kind of reactive power control.
     */
    private String qPccControl; // VsQpccControlKind

    public String getQPccControl() {
        return qPccControl;
    }

    public void setQPccControl(String _value_) {
        qPccControl = _value_;
    }

    private static Object getQPccControl(BaseClass _this_) {
        return ((VsConverter) _this_).getQPccControl();
    }

    private static void setQPccControl(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((VsConverter) _this_).setQPccControl((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Reactive power sharing factor among parallel converters on Uac control. The attribute shall be a positive value or zero.
     */
    private Double qShare; // PerCent

    public Double getQShare() {
        return qShare;
    }

    public void setQShare(Double _value_) {
        qShare = _value_;
    }

    private static Object getQShare(BaseClass _this_) {
        return ((VsConverter) _this_).getQShare();
    }

    private static void setQShare(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((VsConverter) _this_).setQShare((Double) _value_);
        } else if (_value_ instanceof String) {
            ((VsConverter) _this_).setQShare(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Magnitude of pulse-modulation factor. The attribute shall be a positive value.
     */
    private Float targetPWMfactor; // Float

    public Float getTargetPWMfactor() {
        return targetPWMfactor;
    }

    public void setTargetPWMfactor(Float _value_) {
        targetPWMfactor = _value_;
    }

    private static Object getTargetPWMfactor(BaseClass _this_) {
        return ((VsConverter) _this_).getTargetPWMfactor();
    }

    private static void setTargetPWMfactor(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((VsConverter) _this_).setTargetPWMfactor((Float) _value_);
        } else if (_value_ instanceof String) {
            ((VsConverter) _this_).setTargetPWMfactor(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Phase target at AC side, at point of common coupling. The attribute shall be a positive value.
     */
    private Double targetPhasePcc; // AngleDegrees

    public Double getTargetPhasePcc() {
        return targetPhasePcc;
    }

    public void setTargetPhasePcc(Double _value_) {
        targetPhasePcc = _value_;
    }

    private static Object getTargetPhasePcc(BaseClass _this_) {
        return ((VsConverter) _this_).getTargetPhasePcc();
    }

    private static void setTargetPhasePcc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((VsConverter) _this_).setTargetPhasePcc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((VsConverter) _this_).setTargetPhasePcc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Power factor target at the AC side, at point of common coupling. The attribute shall be a positive value.
     */
    private Float targetPowerFactorPcc; // Float

    public Float getTargetPowerFactorPcc() {
        return targetPowerFactorPcc;
    }

    public void setTargetPowerFactorPcc(Float _value_) {
        targetPowerFactorPcc = _value_;
    }

    private static Object getTargetPowerFactorPcc(BaseClass _this_) {
        return ((VsConverter) _this_).getTargetPowerFactorPcc();
    }

    private static void setTargetPowerFactorPcc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((VsConverter) _this_).setTargetPowerFactorPcc((Float) _value_);
        } else if (_value_ instanceof String) {
            ((VsConverter) _this_).setTargetPowerFactorPcc(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Reactive power injection target in AC grid, at point of common coupling.  Load sign convention is used, i.e. positive sign means flow out from a node.
     */
    private Double targetQpcc; // ReactivePower

    public Double getTargetQpcc() {
        return targetQpcc;
    }

    public void setTargetQpcc(Double _value_) {
        targetQpcc = _value_;
    }

    private static Object getTargetQpcc(BaseClass _this_) {
        return ((VsConverter) _this_).getTargetQpcc();
    }

    private static void setTargetQpcc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((VsConverter) _this_).setTargetQpcc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((VsConverter) _this_).setTargetQpcc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage target in AC grid, at point of common coupling. The attribute shall be a positive value.
     */
    private Double targetUpcc; // Voltage

    public Double getTargetUpcc() {
        return targetUpcc;
    }

    public void setTargetUpcc(Double _value_) {
        targetUpcc = _value_;
    }

    private static Object getTargetUpcc(BaseClass _this_) {
        return ((VsConverter) _this_).getTargetUpcc();
    }

    private static void setTargetUpcc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((VsConverter) _this_).setTargetUpcc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((VsConverter) _this_).setTargetUpcc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Line-to-line voltage on the valve side of the converter transformer. It is converter`s state variable, result from power flow. The attribute shall be a positive value.
     */
    private Double uv; // Voltage

    public Double getUv() {
        return uv;
    }

    public void setUv(Double _value_) {
        uv = _value_;
    }

    private static Object getUv(BaseClass _this_) {
        return ((VsConverter) _this_).getUv();
    }

    private static void setUv(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((VsConverter) _this_).setUv((Double) _value_);
        } else if (_value_ instanceof String) {
            ((VsConverter) _this_).setUv(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "VsConverter", attrName));
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
                "VsConverter", attrName, value));
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
            map.put("CapabilityCurve", new AttrDetails("VsConverter.CapabilityCurve", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, VsConverter::getCapabilityCurve, VsConverter::setCapabilityCurve));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("VSCDynamics", new AttrDetails("VsConverter.VSCDynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, VsConverter::getVSCDynamics, VsConverter::setVSCDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("delta", new AttrDetails("VsConverter.delta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, VsConverter::getDelta, VsConverter::setDelta));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("droop", new AttrDetails("VsConverter.droop", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, VsConverter::getDroop, VsConverter::setDroop));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("droopCompensation", new AttrDetails("VsConverter.droopCompensation", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, VsConverter::getDroopCompensation, VsConverter::setDroopCompensation));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxModulationIndex", new AttrDetails("VsConverter.maxModulationIndex", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, VsConverter::getMaxModulationIndex, VsConverter::setMaxModulationIndex));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("pPccControl", new AttrDetails("VsConverter.pPccControl", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, VsConverter::getPPccControl, VsConverter::setPPccControl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("qPccControl", new AttrDetails("VsConverter.qPccControl", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, VsConverter::getQPccControl, VsConverter::setQPccControl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("qShare", new AttrDetails("VsConverter.qShare", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, VsConverter::getQShare, VsConverter::setQShare));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetPWMfactor", new AttrDetails("VsConverter.targetPWMfactor", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, VsConverter::getTargetPWMfactor, VsConverter::setTargetPWMfactor));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetPhasePcc", new AttrDetails("VsConverter.targetPhasePcc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, VsConverter::getTargetPhasePcc, VsConverter::setTargetPhasePcc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetPowerFactorPcc", new AttrDetails("VsConverter.targetPowerFactorPcc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, VsConverter::getTargetPowerFactorPcc, VsConverter::setTargetPowerFactorPcc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetQpcc", new AttrDetails("VsConverter.targetQpcc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, VsConverter::getTargetQpcc, VsConverter::setTargetQpcc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetUpcc", new AttrDetails("VsConverter.targetUpcc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, VsConverter::getTargetUpcc, VsConverter::setTargetUpcc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("uv", new AttrDetails("VsConverter.uv", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, VsConverter::getUv, VsConverter::setUv));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new VsConverter(null).allAttrDetailsMap());
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
