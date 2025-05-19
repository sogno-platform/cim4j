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
 * Generic user of energy - a  point of consumption on the power system model.
 */
@SuppressWarnings("unused")
public class EnergyConsumer extends ConductingEquipment {

    private static final Logging LOG = Logging.getLogger(EnergyConsumer.class);

    /**
     * Default constructor.
     */
    public EnergyConsumer() {
        setCimType("EnergyConsumer");
    }

    /**
     * Load dynamics model used to describe dynamic behavior of this energy consumer.
     */
    private LoadDynamics LoadDynamics; // ManyToOne

    public LoadDynamics getLoadDynamics() {
        return LoadDynamics;
    }

    public void setLoadDynamics(BaseClass _object_) {
        if (!(_object_ instanceof LoadDynamics)) {
            throw new IllegalArgumentException("Object is not LoadDynamics");
        }
        if (LoadDynamics != _object_) {
            LoadDynamics = (LoadDynamics) _object_;
            LoadDynamics.setEnergyConsumer(this);
        }
    }

    public String LoadDynamicsToString() {
        return LoadDynamics != null ? LoadDynamics.getRdfid() : null;
    }

    /**
     * The load response characteristic of this load.  If missing, this load is assumed to be constant power.
     */
    private LoadResponseCharacteristic LoadResponse; // ManyToOne

    public LoadResponseCharacteristic getLoadResponse() {
        return LoadResponse;
    }

    public void setLoadResponse(BaseClass _object_) {
        if (!(_object_ instanceof LoadResponseCharacteristic)) {
            throw new IllegalArgumentException("Object is not LoadResponseCharacteristic");
        }
        if (LoadResponse != _object_) {
            LoadResponse = (LoadResponseCharacteristic) _object_;
            LoadResponse.setEnergyConsumer(this);
        }
    }

    public String LoadResponseToString() {
        return LoadResponse != null ? LoadResponse.getRdfid() : null;
    }

    /**
     * Active power of the load. Load sign convention is used, i.e. positive sign means flow out from a node. For voltage dependent loads the value is at rated voltage. Starting value for a steady state solution.
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
     * Active power of the load that is a fixed quantity. Load sign convention is used, i.e. positive sign means flow out from a node.
     */
    private Double pfixed; // ActivePower

    public Double getPfixed() {
        return pfixed;
    }

    public void setPfixed(Double _value_) {
        pfixed = _value_;
    }

    public void setPfixed(String _value_) {
        pfixed = getDoubleFromString(_value_);
    }

    public String pfixedToString() {
        return pfixed != null ? pfixed.toString() : null;
    }

    /**
     * Fixed active power as per cent of load group fixed active power. Load sign convention is used, i.e. positive sign means flow out from a node.
     */
    private Double pfixedPct; // PerCent

    public Double getPfixedPct() {
        return pfixedPct;
    }

    public void setPfixedPct(Double _value_) {
        pfixedPct = _value_;
    }

    public void setPfixedPct(String _value_) {
        pfixedPct = getDoubleFromString(_value_);
    }

    public String pfixedPctToString() {
        return pfixedPct != null ? pfixedPct.toString() : null;
    }

    /**
     * Reactive power of the load. Load sign convention is used, i.e. positive sign means flow out from a node. For voltage dependent loads the value is at rated voltage. Starting value for a steady state solution.
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
     * Reactive power of the load that is a fixed quantity. Load sign convention is used, i.e. positive sign means flow out from a node.
     */
    private Double qfixed; // ReactivePower

    public Double getQfixed() {
        return qfixed;
    }

    public void setQfixed(Double _value_) {
        qfixed = _value_;
    }

    public void setQfixed(String _value_) {
        qfixed = getDoubleFromString(_value_);
    }

    public String qfixedToString() {
        return qfixed != null ? qfixed.toString() : null;
    }

    /**
     * Fixed reactive power as per cent of load group fixed reactive power. Load sign convention is used, i.e. positive sign means flow out from a node.
     */
    private Double qfixedPct; // PerCent

    public Double getQfixedPct() {
        return qfixedPct;
    }

    public void setQfixedPct(Double _value_) {
        qfixedPct = _value_;
    }

    public void setQfixedPct(String _value_) {
        qfixedPct = getDoubleFromString(_value_);
    }

    public String qfixedPctToString() {
        return qfixedPct != null ? qfixedPct.toString() : null;
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
        return getAttribute("EnergyConsumer", attrName);
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
        setAttribute("EnergyConsumer", attrName, objectValue);
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
        setAttribute("EnergyConsumer", attrName, stringValue);
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
            profiles.add(CGMESProfile.DY);
            map.put("LoadDynamics", new AttrDetails("EnergyConsumer.LoadDynamics", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("LoadResponse", new AttrDetails("EnergyConsumer.LoadResponse", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("p", new AttrDetails("EnergyConsumer.p", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("pfixed", new AttrDetails("EnergyConsumer.pfixed", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("pfixedPct", new AttrDetails("EnergyConsumer.pfixedPct", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("q", new AttrDetails("EnergyConsumer.q", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("qfixed", new AttrDetails("EnergyConsumer.qfixed", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("qfixedPct", new AttrDetails("EnergyConsumer.qfixedPct", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new EnergyConsumer().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("LoadDynamics", new GetterSetter(this::LoadDynamicsToString, this::setLoadDynamics, null));
        map.put("LoadResponse", new GetterSetter(this::LoadResponseToString, this::setLoadResponse, null));
        map.put("p", new GetterSetter(this::pToString, null, this::setP));
        map.put("pfixed", new GetterSetter(this::pfixedToString, null, this::setPfixed));
        map.put("pfixedPct", new GetterSetter(this::pfixedPctToString, null, this::setPfixedPct));
        map.put("q", new GetterSetter(this::qToString, null, this::setQ));
        map.put("qfixed", new GetterSetter(this::qfixedToString, null, this::setQfixed));
        map.put("qfixedPct", new GetterSetter(this::qfixedPctToString, null, this::setQfixedPct));
        return map;
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.DY);
        profiles.add(CGMESProfile.EQ);
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
