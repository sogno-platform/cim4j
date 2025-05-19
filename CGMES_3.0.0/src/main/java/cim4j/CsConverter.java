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
 * DC side of the current source converter (CSC). The firing angle controls the dc voltage at the converter, both for rectifier and inverter. The difference between the dc voltages of the rectifier and inverter determines the dc current. The extinction angle is used to limit the dc voltage at the inverter, if needed, and is not used in active power control. The firing angle, transformer tap position and number of connected filters are the primary means to control a current source dc line. Higher level controls are built on top, e.g. dc voltage, dc current and active power. From a steady state perspective it is sufficient to specify the wanted active power transfer (ACDCConverter.targetPpcc) and the control functions will set the dc voltage, dc current, firing angle, transformer tap position and number of connected filters to meet this. Therefore attributes targetAlpha and targetGamma are not applicable in this case. The reactive power consumed by the converter is a function of the firing angle, transformer tap position and number of connected filter, which can be approximated with half of the active power. The losses is a function of the dc voltage and dc current. The attributes minAlpha and maxAlpha define the range of firing angles for rectifier operation between which no discrete tap changer action takes place. The range is typically 10-18 degrees. The attributes minGamma and maxGamma define the range of extinction angles for inverter operation between which no discrete tap changer action takes place. The range is typically 17-20 degrees.
 */
@SuppressWarnings("unused")
public class CsConverter extends ACDCConverter {

    private static final Logging LOG = Logging.getLogger(CsConverter.class);

    /**
     * Default constructor.
     */
    public CsConverter() {
        setCimType("CsConverter");
    }

    /**
     * Current source converter dynamics model used to describe dynamic behaviour of this converter.
     *
     * NOT USED
     */
    private CSCDynamics CSCDynamics; // OneToOne

    public CSCDynamics getCSCDynamics() {
        return CSCDynamics;
    }

    public void setCSCDynamics(BaseClass _object_) {
        if (!(_object_ instanceof CSCDynamics)) {
            throw new IllegalArgumentException("Object is not CSCDynamics");
        }
        if (CSCDynamics != _object_) {
            CSCDynamics = (CSCDynamics) _object_;
            CSCDynamics.setCSConverter(this);
        }
    }

    public String CSCDynamicsToString() {
        return CSCDynamics != null ? CSCDynamics.getRdfid() : null;
    }

    /**
     * Firing angle that determines the dc voltage at the converter dc terminal. Typical value between 10 degrees and 18 degrees for a rectifier. It is converter`s state variable, result from power flow. The attribute shall be a positive value.
     */
    private Double alpha; // AngleDegrees

    public Double getAlpha() {
        return alpha;
    }

    public void setAlpha(Double _value_) {
        alpha = _value_;
    }

    public void setAlpha(String _value_) {
        alpha = getDoubleFromString(_value_);
    }

    public String alphaToString() {
        return alpha != null ? alpha.toString() : null;
    }

    /**
     * Extinction angle. It is used to limit the dc voltage at the inverter if needed. Typical value between 17 degrees and 20 degrees for an inverter. It is converter`s state variable, result from power flow. The attribute shall be a positive value.
     */
    private Double gamma; // AngleDegrees

    public Double getGamma() {
        return gamma;
    }

    public void setGamma(Double _value_) {
        gamma = _value_;
    }

    public void setGamma(String _value_) {
        gamma = getDoubleFromString(_value_);
    }

    public String gammaToString() {
        return gamma != null ? gamma.toString() : null;
    }

    /**
     * Maximum firing angle. It is converter`s configuration data used in power flow. The attribute shall be a positive value.
     */
    private Double maxAlpha; // AngleDegrees

    public Double getMaxAlpha() {
        return maxAlpha;
    }

    public void setMaxAlpha(Double _value_) {
        maxAlpha = _value_;
    }

    public void setMaxAlpha(String _value_) {
        maxAlpha = getDoubleFromString(_value_);
    }

    public String maxAlphaToString() {
        return maxAlpha != null ? maxAlpha.toString() : null;
    }

    /**
     * Maximum extinction angle. It is converter`s configuration data used in power flow. The attribute shall be a positive value.
     */
    private Double maxGamma; // AngleDegrees

    public Double getMaxGamma() {
        return maxGamma;
    }

    public void setMaxGamma(Double _value_) {
        maxGamma = _value_;
    }

    public void setMaxGamma(String _value_) {
        maxGamma = getDoubleFromString(_value_);
    }

    public String maxGammaToString() {
        return maxGamma != null ? maxGamma.toString() : null;
    }

    /**
     * The maximum direct current (Id) on the DC side at which the converter should operate. It is converter`s configuration data use in power flow. The attribute shall be a positive value.
     */
    private Double maxIdc; // CurrentFlow

    public Double getMaxIdc() {
        return maxIdc;
    }

    public void setMaxIdc(Double _value_) {
        maxIdc = _value_;
    }

    public void setMaxIdc(String _value_) {
        maxIdc = getDoubleFromString(_value_);
    }

    public String maxIdcToString() {
        return maxIdc != null ? maxIdc.toString() : null;
    }

    /**
     * Minimum firing angle. It is converter`s configuration data used in power flow. The attribute shall be a positive value.
     */
    private Double minAlpha; // AngleDegrees

    public Double getMinAlpha() {
        return minAlpha;
    }

    public void setMinAlpha(Double _value_) {
        minAlpha = _value_;
    }

    public void setMinAlpha(String _value_) {
        minAlpha = getDoubleFromString(_value_);
    }

    public String minAlphaToString() {
        return minAlpha != null ? minAlpha.toString() : null;
    }

    /**
     * Minimum extinction angle. It is converter`s configuration data used in power flow. The attribute shall be a positive value.
     */
    private Double minGamma; // AngleDegrees

    public Double getMinGamma() {
        return minGamma;
    }

    public void setMinGamma(Double _value_) {
        minGamma = _value_;
    }

    public void setMinGamma(String _value_) {
        minGamma = getDoubleFromString(_value_);
    }

    public String minGammaToString() {
        return minGamma != null ? minGamma.toString() : null;
    }

    /**
     * The minimum direct current (Id) on the DC side at which the converter should operate. It is converter`s configuration data used in power flow. The attribute shall be a positive value.
     */
    private Double minIdc; // CurrentFlow

    public Double getMinIdc() {
        return minIdc;
    }

    public void setMinIdc(Double _value_) {
        minIdc = _value_;
    }

    public void setMinIdc(String _value_) {
        minIdc = getDoubleFromString(_value_);
    }

    public String minIdcToString() {
        return minIdc != null ? minIdc.toString() : null;
    }

    /**
     * Indicates whether the DC pole is operating as an inverter or as a rectifier. It is converter`s control variable used in power flow.
     */
    private String operatingMode; // CsOperatingModeKind

    public String getOperatingMode() {
        return operatingMode;
    }

    public void setOperatingMode(String _value_) {
        operatingMode = _value_;
    }

    public String operatingModeToString() {
        return operatingMode;
    }

    /**
     * Kind of active power control.
     */
    private String pPccControl; // CsPpccControlKind

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
     * Rated converter DC current, also called IdN. The attribute shall be a positive value. It is converter`s configuration data used in power flow.
     */
    private Double ratedIdc; // CurrentFlow

    public Double getRatedIdc() {
        return ratedIdc;
    }

    public void setRatedIdc(Double _value_) {
        ratedIdc = _value_;
    }

    public void setRatedIdc(String _value_) {
        ratedIdc = getDoubleFromString(_value_);
    }

    public String ratedIdcToString() {
        return ratedIdc != null ? ratedIdc.toString() : null;
    }

    /**
     * Target firing angle. It is converter`s control variable used in power flow. It is only applicable for rectifier if continuous tap changer control is used. Allowed values are within the range minAlpha&amp;lt;=targetAlpha&amp;lt;=maxAlpha. The attribute shall be a positive value.
     */
    private Double targetAlpha; // AngleDegrees

    public Double getTargetAlpha() {
        return targetAlpha;
    }

    public void setTargetAlpha(Double _value_) {
        targetAlpha = _value_;
    }

    public void setTargetAlpha(String _value_) {
        targetAlpha = getDoubleFromString(_value_);
    }

    public String targetAlphaToString() {
        return targetAlpha != null ? targetAlpha.toString() : null;
    }

    /**
     * Target extinction angle. It is converter`s control variable used in power flow. It is only applicable for inverter if continuous tap changer control is used. Allowed values are within the range minGamma&amp;lt;=targetGamma&amp;lt;=maxGamma. The attribute shall be a positive value.
     */
    private Double targetGamma; // AngleDegrees

    public Double getTargetGamma() {
        return targetGamma;
    }

    public void setTargetGamma(Double _value_) {
        targetGamma = _value_;
    }

    public void setTargetGamma(String _value_) {
        targetGamma = getDoubleFromString(_value_);
    }

    public String targetGammaToString() {
        return targetGamma != null ? targetGamma.toString() : null;
    }

    /**
     * DC current target value. It is converter`s control variable used in power flow. The attribute shall be a positive value.
     */
    private Double targetIdc; // CurrentFlow

    public Double getTargetIdc() {
        return targetIdc;
    }

    public void setTargetIdc(Double _value_) {
        targetIdc = _value_;
    }

    public void setTargetIdc(String _value_) {
        targetIdc = getDoubleFromString(_value_);
    }

    public String targetIdcToString() {
        return targetIdc != null ? targetIdc.toString() : null;
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
        return getAttribute("CsConverter", attrName);
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
        setAttribute("CsConverter", attrName, objectValue);
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
        setAttribute("CsConverter", attrName, stringValue);
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
            map.put("CSCDynamics", new AttrDetails("CsConverter.CSCDynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("alpha", new AttrDetails("CsConverter.alpha", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("gamma", new AttrDetails("CsConverter.gamma", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxAlpha", new AttrDetails("CsConverter.maxAlpha", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxGamma", new AttrDetails("CsConverter.maxGamma", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxIdc", new AttrDetails("CsConverter.maxIdc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minAlpha", new AttrDetails("CsConverter.minAlpha", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minGamma", new AttrDetails("CsConverter.minGamma", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minIdc", new AttrDetails("CsConverter.minIdc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("operatingMode", new AttrDetails("CsConverter.operatingMode", true, "http://iec.ch/TC57/CIM100#", profiles, false, true));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("pPccControl", new AttrDetails("CsConverter.pPccControl", true, "http://iec.ch/TC57/CIM100#", profiles, false, true));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedIdc", new AttrDetails("CsConverter.ratedIdc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetAlpha", new AttrDetails("CsConverter.targetAlpha", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetGamma", new AttrDetails("CsConverter.targetGamma", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetIdc", new AttrDetails("CsConverter.targetIdc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new CsConverter().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("CSCDynamics", new GetterSetter(this::CSCDynamicsToString, this::setCSCDynamics, null));
        map.put("alpha", new GetterSetter(this::alphaToString, null, this::setAlpha));
        map.put("gamma", new GetterSetter(this::gammaToString, null, this::setGamma));
        map.put("maxAlpha", new GetterSetter(this::maxAlphaToString, null, this::setMaxAlpha));
        map.put("maxGamma", new GetterSetter(this::maxGammaToString, null, this::setMaxGamma));
        map.put("maxIdc", new GetterSetter(this::maxIdcToString, null, this::setMaxIdc));
        map.put("minAlpha", new GetterSetter(this::minAlphaToString, null, this::setMinAlpha));
        map.put("minGamma", new GetterSetter(this::minGammaToString, null, this::setMinGamma));
        map.put("minIdc", new GetterSetter(this::minIdcToString, null, this::setMinIdc));
        map.put("operatingMode", new GetterSetter(this::operatingModeToString, null, this::setOperatingMode));
        map.put("pPccControl", new GetterSetter(this::pPccControlToString, null, this::setPPccControl));
        map.put("ratedIdc", new GetterSetter(this::ratedIdcToString, null, this::setRatedIdc));
        map.put("targetAlpha", new GetterSetter(this::targetAlphaToString, null, this::setTargetAlpha));
        map.put("targetGamma", new GetterSetter(this::targetGammaToString, null, this::setTargetGamma));
        map.put("targetIdc", new GetterSetter(this::targetIdcToString, null, this::setTargetIdc));
        return map;
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
