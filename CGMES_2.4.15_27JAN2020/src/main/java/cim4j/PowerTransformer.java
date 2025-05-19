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
 * An electrical device consisting of  two or more coupled windings, with or without a magnetic core, for introducing mutual coupling between electric circuits. Transformers can be used to control voltage and phase shift (active power flow). A power transformer may be composed of separate transformer tanks that need not be identical. A power transformer can be modeled with or without tanks and is intended for use in both balanced and unbalanced representations.   A power transformer typically has two terminals, but may have one (grounding), three or more terminals. The inherited association ConductingEquipment.BaseVoltage should not be used.  The association from TransformerEnd to BaseVoltage should be used instead.
 */
@SuppressWarnings("unused")
public class PowerTransformer extends ConductingEquipment {

    private static final Logging LOG = Logging.getLogger(PowerTransformer.class);

    /**
     * Default constructor.
     */
    public PowerTransformer() {
        setCimType("PowerTransformer");
    }

    /**
     * The power transformer of this power transformer end.
     *
     * NOT USED
     */
    private Set<PowerTransformerEnd> PowerTransformerEnd = new HashSet<>(); // OneToMany

    public Set<PowerTransformerEnd> getPowerTransformerEnd() {
        return PowerTransformerEnd;
    }

    public void setPowerTransformerEnd(BaseClass _object_) {
        if (!(_object_ instanceof PowerTransformerEnd)) {
            throw new IllegalArgumentException("Object is not PowerTransformerEnd");
        }
        if (!PowerTransformerEnd.contains(_object_)) {
            PowerTransformerEnd.add((PowerTransformerEnd) _object_);
            ((PowerTransformerEnd) _object_).setPowerTransformer(this);
        }
    }

    public String PowerTransformerEndToString() {
        return getStringFromSet(PowerTransformerEnd);
    }

    /**
     * The highest operating current (Ib in the IEC 60909-0) before short circuit (depends on network configuration and relevant reliability philosophy). It is used for calculation of the impedance correction factor KT defined in IEC 60909-0.
     */
    private Double beforeShCircuitHighestOperatingCurrent; // CurrentFlow

    public Double getBeforeShCircuitHighestOperatingCurrent() {
        return beforeShCircuitHighestOperatingCurrent;
    }

    public void setBeforeShCircuitHighestOperatingCurrent(Double _value_) {
        beforeShCircuitHighestOperatingCurrent = _value_;
    }

    public void setBeforeShCircuitHighestOperatingCurrent(String _value_) {
        beforeShCircuitHighestOperatingCurrent = getDoubleFromString(_value_);
    }

    public String beforeShCircuitHighestOperatingCurrentToString() {
        return beforeShCircuitHighestOperatingCurrent != null ? beforeShCircuitHighestOperatingCurrent.toString() : null;
    }

    /**
     * The highest operating voltage (Ub in the IEC 60909-0) before short circuit. It is used for calculation of the impedance correction factor KT defined in IEC 60909-0. This is worst case voltage on the low side winding (Section 3.7.1 in the standard). Used to define operating conditions.
     */
    private Double beforeShCircuitHighestOperatingVoltage; // Voltage

    public Double getBeforeShCircuitHighestOperatingVoltage() {
        return beforeShCircuitHighestOperatingVoltage;
    }

    public void setBeforeShCircuitHighestOperatingVoltage(Double _value_) {
        beforeShCircuitHighestOperatingVoltage = _value_;
    }

    public void setBeforeShCircuitHighestOperatingVoltage(String _value_) {
        beforeShCircuitHighestOperatingVoltage = getDoubleFromString(_value_);
    }

    public String beforeShCircuitHighestOperatingVoltageToString() {
        return beforeShCircuitHighestOperatingVoltage != null ? beforeShCircuitHighestOperatingVoltage.toString() : null;
    }

    /**
     * The angle of power factor before short circuit (phib in the IEC 60909-0). It is used for calculation of the impedance correction factor KT defined in IEC 60909-0. This is the worst case power factor. Used to define operating conditions.
     */
    private Double beforeShortCircuitAnglePf; // AngleDegrees

    public Double getBeforeShortCircuitAnglePf() {
        return beforeShortCircuitAnglePf;
    }

    public void setBeforeShortCircuitAnglePf(Double _value_) {
        beforeShortCircuitAnglePf = _value_;
    }

    public void setBeforeShortCircuitAnglePf(String _value_) {
        beforeShortCircuitAnglePf = getDoubleFromString(_value_);
    }

    public String beforeShortCircuitAnglePfToString() {
        return beforeShortCircuitAnglePf != null ? beforeShortCircuitAnglePf.toString() : null;
    }

    /**
     * The minimum operating voltage (uQmin in the IEC 60909-0) at the high voltage side (Q side) of the unit transformer of the power station unit. A value well established from long-term operating experience of the system. It is used for calculation of the impedance correction factor KG defined in IEC 60909-0
     */
    private Double highSideMinOperatingU; // Voltage

    public Double getHighSideMinOperatingU() {
        return highSideMinOperatingU;
    }

    public void setHighSideMinOperatingU(Double _value_) {
        highSideMinOperatingU = _value_;
    }

    public void setHighSideMinOperatingU(String _value_) {
        highSideMinOperatingU = getDoubleFromString(_value_);
    }

    public String highSideMinOperatingUToString() {
        return highSideMinOperatingU != null ? highSideMinOperatingU.toString() : null;
    }

    /**
     * Indicates whether the machine is part of a power station unit. Used for short circuit data exchange according to IEC 60909
     */
    private Boolean isPartOfGeneratorUnit; // Boolean

    public Boolean getIsPartOfGeneratorUnit() {
        return isPartOfGeneratorUnit;
    }

    public void setIsPartOfGeneratorUnit(Boolean _value_) {
        isPartOfGeneratorUnit = _value_;
    }

    public void setIsPartOfGeneratorUnit(String _value_) {
        isPartOfGeneratorUnit = getBooleanFromString(_value_);
    }

    public String isPartOfGeneratorUnitToString() {
        return isPartOfGeneratorUnit != null ? isPartOfGeneratorUnit.toString() : null;
    }

    /**
     * It is used to define if the data (other attributes related to short circuit data exchange) defines long term operational conditions or not. Used for short circuit data exchange according to IEC 60909.
     */
    private Boolean operationalValuesConsidered; // Boolean

    public Boolean getOperationalValuesConsidered() {
        return operationalValuesConsidered;
    }

    public void setOperationalValuesConsidered(Boolean _value_) {
        operationalValuesConsidered = _value_;
    }

    public void setOperationalValuesConsidered(String _value_) {
        operationalValuesConsidered = getBooleanFromString(_value_);
    }

    public String operationalValuesConsideredToString() {
        return operationalValuesConsidered != null ? operationalValuesConsidered.toString() : null;
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
        return getAttribute("PowerTransformer", attrName);
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
        setAttribute("PowerTransformer", attrName, objectValue);
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
        setAttribute("PowerTransformer", attrName, stringValue);
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
            map.put("PowerTransformerEnd", new AttrDetails("PowerTransformer.PowerTransformerEnd", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("beforeShCircuitHighestOperatingCurrent", new AttrDetails("PowerTransformer.beforeShCircuitHighestOperatingCurrent", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("beforeShCircuitHighestOperatingVoltage", new AttrDetails("PowerTransformer.beforeShCircuitHighestOperatingVoltage", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("beforeShortCircuitAnglePf", new AttrDetails("PowerTransformer.beforeShortCircuitAnglePf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("highSideMinOperatingU", new AttrDetails("PowerTransformer.highSideMinOperatingU", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("isPartOfGeneratorUnit", new AttrDetails("PowerTransformer.isPartOfGeneratorUnit", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("operationalValuesConsidered", new AttrDetails("PowerTransformer.operationalValuesConsidered", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PowerTransformer().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("PowerTransformerEnd", new GetterSetter(this::PowerTransformerEndToString, this::setPowerTransformerEnd, null));
        map.put("beforeShCircuitHighestOperatingCurrent", new GetterSetter(this::beforeShCircuitHighestOperatingCurrentToString, null, this::setBeforeShCircuitHighestOperatingCurrent));
        map.put("beforeShCircuitHighestOperatingVoltage", new GetterSetter(this::beforeShCircuitHighestOperatingVoltageToString, null, this::setBeforeShCircuitHighestOperatingVoltage));
        map.put("beforeShortCircuitAnglePf", new GetterSetter(this::beforeShortCircuitAnglePfToString, null, this::setBeforeShortCircuitAnglePf));
        map.put("highSideMinOperatingU", new GetterSetter(this::highSideMinOperatingUToString, null, this::setHighSideMinOperatingU));
        map.put("isPartOfGeneratorUnit", new GetterSetter(this::isPartOfGeneratorUnitToString, null, this::setIsPartOfGeneratorUnit));
        map.put("operationalValuesConsidered", new GetterSetter(this::operationalValuesConsideredToString, null, this::setOperationalValuesConsidered));
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
