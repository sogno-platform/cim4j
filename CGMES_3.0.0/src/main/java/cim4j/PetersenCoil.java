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
 * A variable impedance device normally used to offset line charging during single line faults in an ungrounded section of network.
 */
@SuppressWarnings("unused")
public class PetersenCoil extends EarthFaultCompensator {

    private static final Logging LOG = Logging.getLogger(PetersenCoil.class);

    /**
     * Default constructor.
     */
    public PetersenCoil() {
        setCimType("PetersenCoil");
    }

    /**
     * The mode of operation of the Petersen coil.
     */
    private String mode; // PetersenCoilModeKind

    public String getMode() {
        return mode;
    }

    public void setMode(String _value_) {
        mode = _value_;
    }

    public String modeToString() {
        return mode;
    }

    /**
     * The nominal voltage for which the coil is designed.
     */
    private Double nominalU; // Voltage

    public Double getNominalU() {
        return nominalU;
    }

    public void setNominalU(Double _value_) {
        nominalU = _value_;
    }

    public void setNominalU(String _value_) {
        nominalU = getDoubleFromString(_value_);
    }

    public String nominalUToString() {
        return nominalU != null ? nominalU.toString() : null;
    }

    /**
     * The offset current that the Petersen coil controller is operating from the resonant point.  This is normally a fixed amount for which the controller is configured and could be positive or negative.  Typically 0 to 60 A depending on voltage and resonance conditions.
     */
    private Double offsetCurrent; // CurrentFlow

    public Double getOffsetCurrent() {
        return offsetCurrent;
    }

    public void setOffsetCurrent(Double _value_) {
        offsetCurrent = _value_;
    }

    public void setOffsetCurrent(String _value_) {
        offsetCurrent = getDoubleFromString(_value_);
    }

    public String offsetCurrentToString() {
        return offsetCurrent != null ? offsetCurrent.toString() : null;
    }

    /**
     * The control current used to control the Petersen coil also known as the position current.  Typically in the range of 20 mA to 200 mA.
     */
    private Double positionCurrent; // CurrentFlow

    public Double getPositionCurrent() {
        return positionCurrent;
    }

    public void setPositionCurrent(Double _value_) {
        positionCurrent = _value_;
    }

    public void setPositionCurrent(String _value_) {
        positionCurrent = getDoubleFromString(_value_);
    }

    public String positionCurrentToString() {
        return positionCurrent != null ? positionCurrent.toString() : null;
    }

    /**
     * The maximum reactance.
     */
    private Double xGroundMax; // Reactance

    public Double getXGroundMax() {
        return xGroundMax;
    }

    public void setXGroundMax(Double _value_) {
        xGroundMax = _value_;
    }

    public void setXGroundMax(String _value_) {
        xGroundMax = getDoubleFromString(_value_);
    }

    public String xGroundMaxToString() {
        return xGroundMax != null ? xGroundMax.toString() : null;
    }

    /**
     * The minimum reactance.
     */
    private Double xGroundMin; // Reactance

    public Double getXGroundMin() {
        return xGroundMin;
    }

    public void setXGroundMin(Double _value_) {
        xGroundMin = _value_;
    }

    public void setXGroundMin(String _value_) {
        xGroundMin = getDoubleFromString(_value_);
    }

    public String xGroundMinToString() {
        return xGroundMin != null ? xGroundMin.toString() : null;
    }

    /**
     * The nominal reactance.  This is the operating point (normally over compensation) that is defined based on the resonance point in the healthy network condition.  The impedance is calculated based on nominal voltage divided by position current.
     */
    private Double xGroundNominal; // Reactance

    public Double getXGroundNominal() {
        return xGroundNominal;
    }

    public void setXGroundNominal(Double _value_) {
        xGroundNominal = _value_;
    }

    public void setXGroundNominal(String _value_) {
        xGroundNominal = getDoubleFromString(_value_);
    }

    public String xGroundNominalToString() {
        return xGroundNominal != null ? xGroundNominal.toString() : null;
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
        return getAttribute("PetersenCoil", attrName);
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
        setAttribute("PetersenCoil", attrName, objectValue);
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
        setAttribute("PetersenCoil", attrName, stringValue);
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
            profiles.add(CGMESProfile.SC);
            map.put("mode", new AttrDetails("PetersenCoil.mode", true, "http://iec.ch/TC57/CIM100#", profiles, false, true));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("nominalU", new AttrDetails("PetersenCoil.nominalU", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("offsetCurrent", new AttrDetails("PetersenCoil.offsetCurrent", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("positionCurrent", new AttrDetails("PetersenCoil.positionCurrent", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("xGroundMax", new AttrDetails("PetersenCoil.xGroundMax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("xGroundMin", new AttrDetails("PetersenCoil.xGroundMin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("xGroundNominal", new AttrDetails("PetersenCoil.xGroundNominal", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PetersenCoil().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("mode", new GetterSetter(this::modeToString, null, this::setMode));
        map.put("nominalU", new GetterSetter(this::nominalUToString, null, this::setNominalU));
        map.put("offsetCurrent", new GetterSetter(this::offsetCurrentToString, null, this::setOffsetCurrent));
        map.put("positionCurrent", new GetterSetter(this::positionCurrentToString, null, this::setPositionCurrent));
        map.put("xGroundMax", new GetterSetter(this::xGroundMaxToString, null, this::setXGroundMax));
        map.put("xGroundMin", new GetterSetter(this::xGroundMinToString, null, this::setXGroundMin));
        map.put("xGroundNominal", new GetterSetter(this::xGroundNominalToString, null, this::setXGroundNominal));
        return map;
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.SC);
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
