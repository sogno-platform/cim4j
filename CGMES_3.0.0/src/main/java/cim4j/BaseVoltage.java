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
 * Defines a system base voltage which is referenced.
 */
@SuppressWarnings("unused")
public class BaseVoltage extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(BaseVoltage.class);

    /**
     * Default constructor.
     */
    public BaseVoltage() {
        setCimType("BaseVoltage");
    }

    /**
     * All conducting equipment with this base voltage.  Use only when there is no voltage level container used and only one base voltage applies.  For example, not used for transformers.
     *
     * NOT USED
     */
    private Set<ConductingEquipment> ConductingEquipment = new HashSet<>(); // OneToMany

    public Set<ConductingEquipment> getConductingEquipment() {
        return ConductingEquipment;
    }

    public void setConductingEquipment(BaseClass _object_) {
        if (!(_object_ instanceof ConductingEquipment)) {
            throw new IllegalArgumentException("Object is not ConductingEquipment");
        }
        if (!ConductingEquipment.contains(_object_)) {
            ConductingEquipment.add((ConductingEquipment) _object_);
            ((ConductingEquipment) _object_).setBaseVoltage(this);
        }
    }

    public String ConductingEquipmentToString() {
        return getStringFromSet(ConductingEquipment);
    }

    /**
     * The topological nodes at the base voltage.
     *
     * NOT USED
     */
    private Set<TopologicalNode> TopologicalNode = new HashSet<>(); // OneToMany

    public Set<TopologicalNode> getTopologicalNode() {
        return TopologicalNode;
    }

    public void setTopologicalNode(BaseClass _object_) {
        if (!(_object_ instanceof TopologicalNode)) {
            throw new IllegalArgumentException("Object is not TopologicalNode");
        }
        if (!TopologicalNode.contains(_object_)) {
            TopologicalNode.add((TopologicalNode) _object_);
            ((TopologicalNode) _object_).setBaseVoltage(this);
        }
    }

    public String TopologicalNodeToString() {
        return getStringFromSet(TopologicalNode);
    }

    /**
     * Transformer ends at the base voltage.  This is essential for PU calculation.
     *
     * NOT USED
     */
    private Set<TransformerEnd> TransformerEnds = new HashSet<>(); // OneToMany

    public Set<TransformerEnd> getTransformerEnds() {
        return TransformerEnds;
    }

    public void setTransformerEnds(BaseClass _object_) {
        if (!(_object_ instanceof TransformerEnd)) {
            throw new IllegalArgumentException("Object is not TransformerEnd");
        }
        if (!TransformerEnds.contains(_object_)) {
            TransformerEnds.add((TransformerEnd) _object_);
            ((TransformerEnd) _object_).setBaseVoltage(this);
        }
    }

    public String TransformerEndsToString() {
        return getStringFromSet(TransformerEnds);
    }

    /**
     * The voltage levels having this base voltage.
     *
     * NOT USED
     */
    private Set<VoltageLevel> VoltageLevel = new HashSet<>(); // OneToMany

    public Set<VoltageLevel> getVoltageLevel() {
        return VoltageLevel;
    }

    public void setVoltageLevel(BaseClass _object_) {
        if (!(_object_ instanceof VoltageLevel)) {
            throw new IllegalArgumentException("Object is not VoltageLevel");
        }
        if (!VoltageLevel.contains(_object_)) {
            VoltageLevel.add((VoltageLevel) _object_);
            ((VoltageLevel) _object_).setBaseVoltage(this);
        }
    }

    public String VoltageLevelToString() {
        return getStringFromSet(VoltageLevel);
    }

    /**
     * The power system resource`s base voltage.  Shall be a positive value and not zero.
     */
    private Double nominalVoltage; // Voltage

    public Double getNominalVoltage() {
        return nominalVoltage;
    }

    public void setNominalVoltage(Double _value_) {
        nominalVoltage = _value_;
    }

    public void setNominalVoltage(String _value_) {
        nominalVoltage = getDoubleFromString(_value_);
    }

    public String nominalVoltageToString() {
        return nominalVoltage != null ? nominalVoltage.toString() : null;
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
        return getAttribute("BaseVoltage", attrName);
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
        setAttribute("BaseVoltage", attrName, objectValue);
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
        setAttribute("BaseVoltage", attrName, stringValue);
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
            profiles.add(CGMESProfile.EQ);
            map.put("ConductingEquipment", new AttrDetails("BaseVoltage.ConductingEquipment", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP);
            map.put("TopologicalNode", new AttrDetails("BaseVoltage.TopologicalNode", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("TransformerEnds", new AttrDetails("BaseVoltage.TransformerEnds", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("VoltageLevel", new AttrDetails("BaseVoltage.VoltageLevel", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("nominalVoltage", new AttrDetails("BaseVoltage.nominalVoltage", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new BaseVoltage().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("ConductingEquipment", new GetterSetter(this::ConductingEquipmentToString, this::setConductingEquipment, null));
        map.put("TopologicalNode", new GetterSetter(this::TopologicalNodeToString, this::setTopologicalNode, null));
        map.put("TransformerEnds", new GetterSetter(this::TransformerEndsToString, this::setTransformerEnds, null));
        map.put("VoltageLevel", new GetterSetter(this::VoltageLevelToString, this::setVoltageLevel, null));
        map.put("nominalVoltage", new GetterSetter(this::nominalVoltageToString, null, this::setNominalVoltage));
        return map;
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.EQBD);
        profiles.add(CGMESProfile.TP);
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
