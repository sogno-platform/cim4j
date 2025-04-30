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
 * The class represents equivalent branches.
 */
@SuppressWarnings("unused")
public class EquivalentBranch extends EquivalentEquipment {

    private static final Logging LOG = Logging.getLogger(EquivalentBranch.class);

    /**
     * Default constructor.
     */
    public EquivalentBranch() {
        setCimType("EquivalentBranch");
    }

    /**
     * Negative sequence series resistance from terminal sequence  1 to terminal sequence 2. Used for short circuit data exchange according to IEC 60909 EquivalentBranch is a result of network reduction prior to the data exchange
     */
    private Double negativeR12; // Resistance

    public Double getNegativeR12() {
        return negativeR12;
    }

    public void setNegativeR12(Double _value_) {
        negativeR12 = _value_;
    }

    public void setNegativeR12(String _value_) {
        negativeR12 = getDoubleFromString(_value_);
    }

    public String negativeR12ToString() {
        return negativeR12 != null ? negativeR12.toString() : null;
    }

    /**
     * Negative sequence series resistance from terminal sequence 2 to terminal sequence 1. Used for short circuit data exchange according to IEC 60909 EquivalentBranch is a result of network reduction prior to the data exchange
     */
    private Double negativeR21; // Resistance

    public Double getNegativeR21() {
        return negativeR21;
    }

    public void setNegativeR21(Double _value_) {
        negativeR21 = _value_;
    }

    public void setNegativeR21(String _value_) {
        negativeR21 = getDoubleFromString(_value_);
    }

    public String negativeR21ToString() {
        return negativeR21 != null ? negativeR21.toString() : null;
    }

    /**
     * Negative sequence series reactance from terminal sequence  1 to terminal sequence 2. Used for short circuit data exchange according to IEC 60909 Usage : EquivalentBranch is a result of network reduction prior to the data exchange
     */
    private Double negativeX12; // Reactance

    public Double getNegativeX12() {
        return negativeX12;
    }

    public void setNegativeX12(Double _value_) {
        negativeX12 = _value_;
    }

    public void setNegativeX12(String _value_) {
        negativeX12 = getDoubleFromString(_value_);
    }

    public String negativeX12ToString() {
        return negativeX12 != null ? negativeX12.toString() : null;
    }

    /**
     * Negative sequence series reactance from terminal sequence 2 to terminal sequence 1. Used for short circuit data exchange according to IEC 60909. Usage: EquivalentBranch is a result of network reduction prior to the data exchange
     */
    private Double negativeX21; // Reactance

    public Double getNegativeX21() {
        return negativeX21;
    }

    public void setNegativeX21(Double _value_) {
        negativeX21 = _value_;
    }

    public void setNegativeX21(String _value_) {
        negativeX21 = getDoubleFromString(_value_);
    }

    public String negativeX21ToString() {
        return negativeX21 != null ? negativeX21.toString() : null;
    }

    /**
     * Positive sequence series resistance from terminal sequence  1 to terminal sequence 2 . Used for short circuit data exchange according to IEC 60909.  EquivalentBranch is a result of network reduction prior to the data exchange.
     */
    private Double positiveR12; // Resistance

    public Double getPositiveR12() {
        return positiveR12;
    }

    public void setPositiveR12(Double _value_) {
        positiveR12 = _value_;
    }

    public void setPositiveR12(String _value_) {
        positiveR12 = getDoubleFromString(_value_);
    }

    public String positiveR12ToString() {
        return positiveR12 != null ? positiveR12.toString() : null;
    }

    /**
     * Positive sequence series resistance from terminal sequence 2 to terminal sequence 1. Used for short circuit data exchange according to IEC 60909 EquivalentBranch is a result of network reduction prior to the data exchange
     */
    private Double positiveR21; // Resistance

    public Double getPositiveR21() {
        return positiveR21;
    }

    public void setPositiveR21(Double _value_) {
        positiveR21 = _value_;
    }

    public void setPositiveR21(String _value_) {
        positiveR21 = getDoubleFromString(_value_);
    }

    public String positiveR21ToString() {
        return positiveR21 != null ? positiveR21.toString() : null;
    }

    /**
     * Positive sequence series reactance from terminal sequence  1 to terminal sequence 2. Used for short circuit data exchange according to IEC 60909 Usage : EquivalentBranch is a result of network reduction prior to the data exchange
     */
    private Double positiveX12; // Reactance

    public Double getPositiveX12() {
        return positiveX12;
    }

    public void setPositiveX12(Double _value_) {
        positiveX12 = _value_;
    }

    public void setPositiveX12(String _value_) {
        positiveX12 = getDoubleFromString(_value_);
    }

    public String positiveX12ToString() {
        return positiveX12 != null ? positiveX12.toString() : null;
    }

    /**
     * Positive sequence series reactance from terminal sequence 2 to terminal sequence 1. Used for short circuit data exchange according to IEC 60909 Usage : EquivalentBranch is a result of network reduction prior to the data exchange
     */
    private Double positiveX21; // Reactance

    public Double getPositiveX21() {
        return positiveX21;
    }

    public void setPositiveX21(Double _value_) {
        positiveX21 = _value_;
    }

    public void setPositiveX21(String _value_) {
        positiveX21 = getDoubleFromString(_value_);
    }

    public String positiveX21ToString() {
        return positiveX21 != null ? positiveX21.toString() : null;
    }

    /**
     * Positive sequence series resistance of the reduced branch.
     */
    private Double r; // Resistance

    public Double getR() {
        return r;
    }

    public void setR(Double _value_) {
        r = _value_;
    }

    public void setR(String _value_) {
        r = getDoubleFromString(_value_);
    }

    public String rToString() {
        return r != null ? r.toString() : null;
    }

    /**
     * Resistance from terminal sequence 2 to terminal sequence 1 .Used for steady state power flow. This attribute is optional and represent unbalanced network such as off-nominal phase shifter. If only EquivalentBranch.r is given, then EquivalentBranch.r21 is assumed equal to EquivalentBranch.r. Usage rule : EquivalentBranch is a result of network reduction prior to the data exchange.
     */
    private Double r21; // Resistance

    public Double getR21() {
        return r21;
    }

    public void setR21(Double _value_) {
        r21 = _value_;
    }

    public void setR21(String _value_) {
        r21 = getDoubleFromString(_value_);
    }

    public String r21ToString() {
        return r21 != null ? r21.toString() : null;
    }

    /**
     * Positive sequence series reactance of the reduced branch.
     */
    private Double x; // Reactance

    public Double getX() {
        return x;
    }

    public void setX(Double _value_) {
        x = _value_;
    }

    public void setX(String _value_) {
        x = getDoubleFromString(_value_);
    }

    public String xToString() {
        return x != null ? x.toString() : null;
    }

    /**
     * Reactance from terminal sequence 2 to terminal sequence 1 .Used for steady state power flow. This attribute is optional and represent unbalanced network such as off-nominal phase shifter. If only EquivalentBranch.x is given, then EquivalentBranch.x21 is assumed equal to EquivalentBranch.x. Usage rule : EquivalentBranch is a result of network reduction prior to the data exchange.
     */
    private Double x21; // Reactance

    public Double getX21() {
        return x21;
    }

    public void setX21(Double _value_) {
        x21 = _value_;
    }

    public void setX21(String _value_) {
        x21 = getDoubleFromString(_value_);
    }

    public String x21ToString() {
        return x21 != null ? x21.toString() : null;
    }

    /**
     * Zero sequence series resistance from terminal sequence  1 to terminal sequence 2. Used for short circuit data exchange according to IEC 60909 EquivalentBranch is a result of network reduction prior to the data exchange
     */
    private Double zeroR12; // Resistance

    public Double getZeroR12() {
        return zeroR12;
    }

    public void setZeroR12(Double _value_) {
        zeroR12 = _value_;
    }

    public void setZeroR12(String _value_) {
        zeroR12 = getDoubleFromString(_value_);
    }

    public String zeroR12ToString() {
        return zeroR12 != null ? zeroR12.toString() : null;
    }

    /**
     * Zero sequence series resistance from terminal sequence  2 to terminal sequence 1. Used for short circuit data exchange according to IEC 60909 Usage : EquivalentBranch is a result of network reduction prior to the data exchange
     */
    private Double zeroR21; // Resistance

    public Double getZeroR21() {
        return zeroR21;
    }

    public void setZeroR21(Double _value_) {
        zeroR21 = _value_;
    }

    public void setZeroR21(String _value_) {
        zeroR21 = getDoubleFromString(_value_);
    }

    public String zeroR21ToString() {
        return zeroR21 != null ? zeroR21.toString() : null;
    }

    /**
     * Zero sequence series reactance from terminal sequence  1 to terminal sequence 2. Used for short circuit data exchange according to IEC 60909 Usage : EquivalentBranch is a result of network reduction prior to the data exchange
     */
    private Double zeroX12; // Reactance

    public Double getZeroX12() {
        return zeroX12;
    }

    public void setZeroX12(Double _value_) {
        zeroX12 = _value_;
    }

    public void setZeroX12(String _value_) {
        zeroX12 = getDoubleFromString(_value_);
    }

    public String zeroX12ToString() {
        return zeroX12 != null ? zeroX12.toString() : null;
    }

    /**
     * Zero sequence series reactance from terminal sequence 2 to terminal sequence 1. Used for short circuit data exchange according to IEC 60909 Usage : EquivalentBranch is a result of network reduction prior to the data exchange
     */
    private Double zeroX21; // Reactance

    public Double getZeroX21() {
        return zeroX21;
    }

    public void setZeroX21(Double _value_) {
        zeroX21 = _value_;
    }

    public void setZeroX21(String _value_) {
        zeroX21 = getDoubleFromString(_value_);
    }

    public String zeroX21ToString() {
        return zeroX21 != null ? zeroX21.toString() : null;
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
        return getAttribute("EquivalentBranch", attrName);
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
        setAttribute("EquivalentBranch", attrName, objectValue);
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
        setAttribute("EquivalentBranch", attrName, stringValue);
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
            map.put("negativeR12", new AttrDetails("EquivalentBranch.negativeR12", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("negativeR21", new AttrDetails("EquivalentBranch.negativeR21", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("negativeX12", new AttrDetails("EquivalentBranch.negativeX12", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("negativeX21", new AttrDetails("EquivalentBranch.negativeX21", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("positiveR12", new AttrDetails("EquivalentBranch.positiveR12", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("positiveR21", new AttrDetails("EquivalentBranch.positiveR21", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("positiveX12", new AttrDetails("EquivalentBranch.positiveX12", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("positiveX21", new AttrDetails("EquivalentBranch.positiveX21", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r", new AttrDetails("EquivalentBranch.r", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r21", new AttrDetails("EquivalentBranch.r21", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x", new AttrDetails("EquivalentBranch.x", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x21", new AttrDetails("EquivalentBranch.x21", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("zeroR12", new AttrDetails("EquivalentBranch.zeroR12", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("zeroR21", new AttrDetails("EquivalentBranch.zeroR21", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("zeroX12", new AttrDetails("EquivalentBranch.zeroX12", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("zeroX21", new AttrDetails("EquivalentBranch.zeroX21", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new EquivalentBranch().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("negativeR12", new GetterSetter(this::negativeR12ToString, null, this::setNegativeR12));
        map.put("negativeR21", new GetterSetter(this::negativeR21ToString, null, this::setNegativeR21));
        map.put("negativeX12", new GetterSetter(this::negativeX12ToString, null, this::setNegativeX12));
        map.put("negativeX21", new GetterSetter(this::negativeX21ToString, null, this::setNegativeX21));
        map.put("positiveR12", new GetterSetter(this::positiveR12ToString, null, this::setPositiveR12));
        map.put("positiveR21", new GetterSetter(this::positiveR21ToString, null, this::setPositiveR21));
        map.put("positiveX12", new GetterSetter(this::positiveX12ToString, null, this::setPositiveX12));
        map.put("positiveX21", new GetterSetter(this::positiveX21ToString, null, this::setPositiveX21));
        map.put("r", new GetterSetter(this::rToString, null, this::setR));
        map.put("r21", new GetterSetter(this::r21ToString, null, this::setR21));
        map.put("x", new GetterSetter(this::xToString, null, this::setX));
        map.put("x21", new GetterSetter(this::x21ToString, null, this::setX21));
        map.put("zeroR12", new GetterSetter(this::zeroR12ToString, null, this::setZeroR12));
        map.put("zeroR21", new GetterSetter(this::zeroR21ToString, null, this::setZeroR21));
        map.put("zeroX12", new GetterSetter(this::zeroX12ToString, null, this::setZeroX12));
        map.put("zeroX21", new GetterSetter(this::zeroX21ToString, null, this::setZeroX21));
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
