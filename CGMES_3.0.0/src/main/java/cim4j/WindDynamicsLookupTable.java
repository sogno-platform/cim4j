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
 * Look up table for the purpose of wind standard models.
 */
@SuppressWarnings("unused")
public class WindDynamicsLookupTable extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindDynamicsLookupTable.class);

    /**
     * Default constructor.
     */
    public WindDynamicsLookupTable() {
        setCimType("WindDynamicsLookupTable");
    }

    /**
     * The current control limitation model with which this wind dynamics lookup table is associated.
     */
    private WindContCurrLimIEC WindContCurrLimIEC; // ManyToOne

    public WindContCurrLimIEC getWindContCurrLimIEC() {
        return WindContCurrLimIEC;
    }

    public void setWindContCurrLimIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindContCurrLimIEC)) {
            throw new IllegalArgumentException("Object is not WindContCurrLimIEC");
        }
        if (WindContCurrLimIEC != _object_) {
            WindContCurrLimIEC = (WindContCurrLimIEC) _object_;
            WindContCurrLimIEC.setWindDynamicsLookupTable(this);
        }
    }

    public String WindContCurrLimIECToString() {
        return WindContCurrLimIEC != null ? WindContCurrLimIEC.getRdfid() : null;
    }

    /**
     * The P control type 3 model with which this wind dynamics lookup table is associated.
     */
    private WindContPType3IEC WindContPType3IEC; // ManyToOne

    public WindContPType3IEC getWindContPType3IEC() {
        return WindContPType3IEC;
    }

    public void setWindContPType3IEC(BaseClass _object_) {
        if (!(_object_ instanceof WindContPType3IEC)) {
            throw new IllegalArgumentException("Object is not WindContPType3IEC");
        }
        if (WindContPType3IEC != _object_) {
            WindContPType3IEC = (WindContPType3IEC) _object_;
            WindContPType3IEC.setWindDynamicsLookupTable(this);
        }
    }

    public String WindContPType3IECToString() {
        return WindContPType3IEC != null ? WindContPType3IEC.getRdfid() : null;
    }

    /**
     * The QP and QU limitation model with which this wind dynamics lookup table is associated.
     */
    private WindContQPQULimIEC WindContQPQULimIEC; // ManyToOne

    public WindContQPQULimIEC getWindContQPQULimIEC() {
        return WindContQPQULimIEC;
    }

    public void setWindContQPQULimIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindContQPQULimIEC)) {
            throw new IllegalArgumentException("Object is not WindContQPQULimIEC");
        }
        if (WindContQPQULimIEC != _object_) {
            WindContQPQULimIEC = (WindContQPQULimIEC) _object_;
            WindContQPQULimIEC.setWindDynamicsLookupTable(this);
        }
    }

    public String WindContQPQULimIECToString() {
        return WindContQPQULimIEC != null ? WindContQPQULimIEC.getRdfid() : null;
    }

    /**
     * The rotor resistance control model with which this wind dynamics lookup table is associated.
     */
    private WindContRotorRIEC WindContRotorRIEC; // ManyToOne

    public WindContRotorRIEC getWindContRotorRIEC() {
        return WindContRotorRIEC;
    }

    public void setWindContRotorRIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindContRotorRIEC)) {
            throw new IllegalArgumentException("Object is not WindContRotorRIEC");
        }
        if (WindContRotorRIEC != _object_) {
            WindContRotorRIEC = (WindContRotorRIEC) _object_;
            WindContRotorRIEC.setWindDynamicsLookupTable(this);
        }
    }

    public String WindContRotorRIECToString() {
        return WindContRotorRIEC != null ? WindContRotorRIEC.getRdfid() : null;
    }

    /**
     * The generator type 3B model with which this wind dynamics lookup table is associated.
     */
    private WindGenType3bIEC WindGenType3bIEC; // ManyToOne

    public WindGenType3bIEC getWindGenType3bIEC() {
        return WindGenType3bIEC;
    }

    public void setWindGenType3bIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindGenType3bIEC)) {
            throw new IllegalArgumentException("Object is not WindGenType3bIEC");
        }
        if (WindGenType3bIEC != _object_) {
            WindGenType3bIEC = (WindGenType3bIEC) _object_;
            WindGenType3bIEC.setWindDynamicsLookupTable(this);
        }
    }

    public String WindGenType3bIECToString() {
        return WindGenType3bIEC != null ? WindGenType3bIEC.getRdfid() : null;
    }

    /**
     * The pitch control power model with which this wind dynamics lookup table is associated.
     */
    private WindPitchContPowerIEC WindPitchContPowerIEC; // ManyToOne

    public WindPitchContPowerIEC getWindPitchContPowerIEC() {
        return WindPitchContPowerIEC;
    }

    public void setWindPitchContPowerIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindPitchContPowerIEC)) {
            throw new IllegalArgumentException("Object is not WindPitchContPowerIEC");
        }
        if (WindPitchContPowerIEC != _object_) {
            WindPitchContPowerIEC = (WindPitchContPowerIEC) _object_;
            WindPitchContPowerIEC.setWindDynamicsLookupTable(this);
        }
    }

    public String WindPitchContPowerIECToString() {
        return WindPitchContPowerIEC != null ? WindPitchContPowerIEC.getRdfid() : null;
    }

    /**
     * The frequency and active power wind plant control model with which this wind dynamics lookup table is associated.
     */
    private WindPlantFreqPcontrolIEC WindPlantFreqPcontrolIEC; // ManyToOne

    public WindPlantFreqPcontrolIEC getWindPlantFreqPcontrolIEC() {
        return WindPlantFreqPcontrolIEC;
    }

    public void setWindPlantFreqPcontrolIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindPlantFreqPcontrolIEC)) {
            throw new IllegalArgumentException("Object is not WindPlantFreqPcontrolIEC");
        }
        if (WindPlantFreqPcontrolIEC != _object_) {
            WindPlantFreqPcontrolIEC = (WindPlantFreqPcontrolIEC) _object_;
            WindPlantFreqPcontrolIEC.setWindDynamicsLookupTable(this);
        }
    }

    public String WindPlantFreqPcontrolIECToString() {
        return WindPlantFreqPcontrolIEC != null ? WindPlantFreqPcontrolIEC.getRdfid() : null;
    }

    /**
     * The voltage and reactive power wind plant control model with which this wind dynamics lookup table is associated.
     */
    private WindPlantReactiveControlIEC WindPlantReactiveControlIEC; // ManyToOne

    public WindPlantReactiveControlIEC getWindPlantReactiveControlIEC() {
        return WindPlantReactiveControlIEC;
    }

    public void setWindPlantReactiveControlIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindPlantReactiveControlIEC)) {
            throw new IllegalArgumentException("Object is not WindPlantReactiveControlIEC");
        }
        if (WindPlantReactiveControlIEC != _object_) {
            WindPlantReactiveControlIEC = (WindPlantReactiveControlIEC) _object_;
            WindPlantReactiveControlIEC.setWindDynamicsLookupTable(this);
        }
    }

    public String WindPlantReactiveControlIECToString() {
        return WindPlantReactiveControlIEC != null ? WindPlantReactiveControlIEC.getRdfid() : null;
    }

    /**
     * The grid protection model with which this wind dynamics lookup table is associated.
     */
    private WindProtectionIEC WindProtectionIEC; // ManyToOne

    public WindProtectionIEC getWindProtectionIEC() {
        return WindProtectionIEC;
    }

    public void setWindProtectionIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindProtectionIEC)) {
            throw new IllegalArgumentException("Object is not WindProtectionIEC");
        }
        if (WindProtectionIEC != _object_) {
            WindProtectionIEC = (WindProtectionIEC) _object_;
            WindProtectionIEC.setWindDynamicsLookupTable(this);
        }
    }

    public String WindProtectionIECToString() {
        return WindProtectionIEC != null ? WindProtectionIEC.getRdfid() : null;
    }

    /**
     * Input value (&lt;i&gt;x&lt;/i&gt;) for the lookup table function.
     */
    private Float input; // Float

    public Float getInput() {
        return input;
    }

    public void setInput(Float _value_) {
        input = _value_;
    }

    public void setInput(String _value_) {
        input = getFloatFromString(_value_);
    }

    public String inputToString() {
        return input != null ? input.toString() : null;
    }

    /**
     * Type of the lookup table function.
     */
    private String lookupTableFunctionType; // WindLookupTableFunctionKind

    public String getLookupTableFunctionType() {
        return lookupTableFunctionType;
    }

    public void setLookupTableFunctionType(String _value_) {
        lookupTableFunctionType = _value_;
    }

    public String lookupTableFunctionTypeToString() {
        return lookupTableFunctionType;
    }

    /**
     * Output value (&lt;i&gt;y&lt;/i&gt;) for the lookup table function.
     */
    private Float output; // Float

    public Float getOutput() {
        return output;
    }

    public void setOutput(Float _value_) {
        output = _value_;
    }

    public void setOutput(String _value_) {
        output = getFloatFromString(_value_);
    }

    public String outputToString() {
        return output != null ? output.toString() : null;
    }

    /**
     * Sequence numbers of the pairs of the input (&lt;i&gt;x&lt;/i&gt;) and the output (&lt;i&gt;y&lt;/i&gt;) of the lookup table function.
     */
    private Integer sequence; // Integer

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer _value_) {
        sequence = _value_;
    }

    public void setSequence(String _value_) {
        sequence = getIntegerFromString(_value_);
    }

    public String sequenceToString() {
        return sequence != null ? sequence.toString() : null;
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
        return getAttribute("WindDynamicsLookupTable", attrName);
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
        setAttribute("WindDynamicsLookupTable", attrName, objectValue);
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
        setAttribute("WindDynamicsLookupTable", attrName, stringValue);
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
            map.put("WindContCurrLimIEC", new AttrDetails("WindDynamicsLookupTable.WindContCurrLimIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindContPType3IEC", new AttrDetails("WindDynamicsLookupTable.WindContPType3IEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindContQPQULimIEC", new AttrDetails("WindDynamicsLookupTable.WindContQPQULimIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindContRotorRIEC", new AttrDetails("WindDynamicsLookupTable.WindContRotorRIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindGenType3bIEC", new AttrDetails("WindDynamicsLookupTable.WindGenType3bIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindPitchContPowerIEC", new AttrDetails("WindDynamicsLookupTable.WindPitchContPowerIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindPlantFreqPcontrolIEC", new AttrDetails("WindDynamicsLookupTable.WindPlantFreqPcontrolIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindPlantReactiveControlIEC", new AttrDetails("WindDynamicsLookupTable.WindPlantReactiveControlIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindProtectionIEC", new AttrDetails("WindDynamicsLookupTable.WindProtectionIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("input", new AttrDetails("WindDynamicsLookupTable.input", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lookupTableFunctionType", new AttrDetails("WindDynamicsLookupTable.lookupTableFunctionType", true, "http://iec.ch/TC57/CIM100#", profiles, false, true));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("output", new AttrDetails("WindDynamicsLookupTable.output", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("sequence", new AttrDetails("WindDynamicsLookupTable.sequence", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindDynamicsLookupTable().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("WindContCurrLimIEC", new GetterSetter(this::WindContCurrLimIECToString, this::setWindContCurrLimIEC, null));
        map.put("WindContPType3IEC", new GetterSetter(this::WindContPType3IECToString, this::setWindContPType3IEC, null));
        map.put("WindContQPQULimIEC", new GetterSetter(this::WindContQPQULimIECToString, this::setWindContQPQULimIEC, null));
        map.put("WindContRotorRIEC", new GetterSetter(this::WindContRotorRIECToString, this::setWindContRotorRIEC, null));
        map.put("WindGenType3bIEC", new GetterSetter(this::WindGenType3bIECToString, this::setWindGenType3bIEC, null));
        map.put("WindPitchContPowerIEC", new GetterSetter(this::WindPitchContPowerIECToString, this::setWindPitchContPowerIEC, null));
        map.put("WindPlantFreqPcontrolIEC", new GetterSetter(this::WindPlantFreqPcontrolIECToString, this::setWindPlantFreqPcontrolIEC, null));
        map.put("WindPlantReactiveControlIEC", new GetterSetter(this::WindPlantReactiveControlIECToString, this::setWindPlantReactiveControlIEC, null));
        map.put("WindProtectionIEC", new GetterSetter(this::WindProtectionIECToString, this::setWindProtectionIEC, null));
        map.put("input", new GetterSetter(this::inputToString, null, this::setInput));
        map.put("lookupTableFunctionType", new GetterSetter(this::lookupTableFunctionTypeToString, null, this::setLookupTableFunctionType));
        map.put("output", new GetterSetter(this::outputToString, null, this::setOutput));
        map.put("sequence", new GetterSetter(this::sequenceToString, null, this::setSequence));
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
