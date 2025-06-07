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
     * Constructor.
     */
    public BaseVoltage(String rdfid) {
        super("BaseVoltage", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected BaseVoltage(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Base voltage of this conducting equipment.  Use only when there is no voltage level container used and only one base voltage applies.  For example, not used for transformers.
     *
     * NOT USED
     */
    private Set<ConductingEquipment> ConductingEquipment = new HashSet<>(); // OneToMany

    public Set<ConductingEquipment> getConductingEquipment() {
        return ConductingEquipment;
    }

    public void setConductingEquipment(ConductingEquipment _object_) {
        if (!ConductingEquipment.contains(_object_)) {
            ConductingEquipment.add(_object_);
            _object_.setBaseVoltage(this);
        }
    }

    private static Object getConductingEquipment(BaseClass _this_) {
        return ((BaseVoltage) _this_).getConductingEquipment();
    }

    private static void setConductingEquipment(BaseClass _this_, Object _value_) {
        if (_value_ instanceof ConductingEquipment) {
            ((BaseVoltage) _this_).setConductingEquipment((ConductingEquipment) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ConductingEquipment");
        }
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

    public void setTopologicalNode(TopologicalNode _object_) {
        if (!TopologicalNode.contains(_object_)) {
            TopologicalNode.add(_object_);
            _object_.setBaseVoltage(this);
        }
    }

    private static Object getTopologicalNode(BaseClass _this_) {
        return ((BaseVoltage) _this_).getTopologicalNode();
    }

    private static void setTopologicalNode(BaseClass _this_, Object _value_) {
        if (_value_ instanceof TopologicalNode) {
            ((BaseVoltage) _this_).setTopologicalNode((TopologicalNode) _value_);
        } else {
            throw new IllegalArgumentException("Object is not TopologicalNode");
        }
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

    public void setTransformerEnds(TransformerEnd _object_) {
        if (!TransformerEnds.contains(_object_)) {
            TransformerEnds.add(_object_);
            _object_.setBaseVoltage(this);
        }
    }

    private static Object getTransformerEnds(BaseClass _this_) {
        return ((BaseVoltage) _this_).getTransformerEnds();
    }

    private static void setTransformerEnds(BaseClass _this_, Object _value_) {
        if (_value_ instanceof TransformerEnd) {
            ((BaseVoltage) _this_).setTransformerEnds((TransformerEnd) _value_);
        } else {
            throw new IllegalArgumentException("Object is not TransformerEnd");
        }
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

    public void setVoltageLevel(VoltageLevel _object_) {
        if (!VoltageLevel.contains(_object_)) {
            VoltageLevel.add(_object_);
            _object_.setBaseVoltage(this);
        }
    }

    private static Object getVoltageLevel(BaseClass _this_) {
        return ((BaseVoltage) _this_).getVoltageLevel();
    }

    private static void setVoltageLevel(BaseClass _this_, Object _value_) {
        if (_value_ instanceof VoltageLevel) {
            ((BaseVoltage) _this_).setVoltageLevel((VoltageLevel) _value_);
        } else {
            throw new IllegalArgumentException("Object is not VoltageLevel");
        }
    }

    /**
     * The power system resource`s base voltage.
     */
    private Double nominalVoltage; // Voltage

    public Double getNominalVoltage() {
        return nominalVoltage;
    }

    public void setNominalVoltage(Double _value_) {
        nominalVoltage = _value_;
    }

    private static Object getNominalVoltage(BaseClass _this_) {
        return ((BaseVoltage) _this_).getNominalVoltage();
    }

    private static void setNominalVoltage(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((BaseVoltage) _this_).setNominalVoltage((Double) _value_);
        } else if (_value_ instanceof String) {
            ((BaseVoltage) _this_).setNominalVoltage(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "BaseVoltage", attrName));
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
                "BaseVoltage", attrName, value));
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
            map.put("ConductingEquipment", new AttrDetails("BaseVoltage.ConductingEquipment", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, BaseVoltage::getConductingEquipment, BaseVoltage::setConductingEquipment));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP_BD);
            profiles.add(CGMESProfile.TP);
            map.put("TopologicalNode", new AttrDetails("BaseVoltage.TopologicalNode", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, BaseVoltage::getTopologicalNode, BaseVoltage::setTopologicalNode));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("TransformerEnds", new AttrDetails("BaseVoltage.TransformerEnds", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, BaseVoltage::getTransformerEnds, BaseVoltage::setTransformerEnds));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("VoltageLevel", new AttrDetails("BaseVoltage.VoltageLevel", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, BaseVoltage::getVoltageLevel, BaseVoltage::setVoltageLevel));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ_BD);
            profiles.add(CGMESProfile.EQ);
            map.put("nominalVoltage", new AttrDetails("BaseVoltage.nominalVoltage", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, BaseVoltage::getNominalVoltage, BaseVoltage::setNominalVoltage));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new BaseVoltage(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ_BD);
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.TP_BD);
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
