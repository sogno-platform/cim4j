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
 * DC bus.
 */
@SuppressWarnings("unused")
public class DCTopologicalNode extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(DCTopologicalNode.class);

    /**
     * Constructor.
     */
    public DCTopologicalNode(String rdfid) {
        super("DCTopologicalNode", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected DCTopologicalNode(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The connectivity node container to which the topological node belongs.
     */
    private DCEquipmentContainer DCEquipmentContainer; // ManyToOne

    public DCEquipmentContainer getDCEquipmentContainer() {
        return DCEquipmentContainer;
    }

    public void setDCEquipmentContainer(DCEquipmentContainer _object_) {
        if (DCEquipmentContainer != _object_) {
            DCEquipmentContainer = _object_;
            DCEquipmentContainer.setDCTopologicalNode(this);
        }
    }

    private static Object getDCEquipmentContainer(BaseClass _this_) {
        return ((DCTopologicalNode) _this_).getDCEquipmentContainer();
    }

    private static void setDCEquipmentContainer(BaseClass _this_, Object _value_) {
        if (_value_ instanceof DCEquipmentContainer) {
            ((DCTopologicalNode) _this_).setDCEquipmentContainer((DCEquipmentContainer) _value_);
        } else {
            throw new IllegalArgumentException("Object is not DCEquipmentContainer");
        }
    }

    /**
     * The DC connectivity nodes combined together to form this DC topological node.  May depend on the current state of switches in the network.
     *
     * NOT USED
     */
    private Set<DCNode> DCNodes = new HashSet<>(); // OneToMany

    public Set<DCNode> getDCNodes() {
        return DCNodes;
    }

    public void setDCNodes(DCNode _object_) {
        if (!DCNodes.contains(_object_)) {
            DCNodes.add(_object_);
            _object_.setDCTopologicalNode(this);
        }
    }

    private static Object getDCNodes(BaseClass _this_) {
        return ((DCTopologicalNode) _this_).getDCNodes();
    }

    private static void setDCNodes(BaseClass _this_, Object _value_) {
        if (_value_ instanceof DCNode) {
            ((DCTopologicalNode) _this_).setDCNodes((DCNode) _value_);
        } else {
            throw new IllegalArgumentException("Object is not DCNode");
        }
    }

    /**
     * See association end TopologicalNode.Terminal.
     *
     * NOT USED
     */
    private Set<DCBaseTerminal> DCTerminals = new HashSet<>(); // OneToMany

    public Set<DCBaseTerminal> getDCTerminals() {
        return DCTerminals;
    }

    public void setDCTerminals(DCBaseTerminal _object_) {
        if (!DCTerminals.contains(_object_)) {
            DCTerminals.add(_object_);
            _object_.setDCTopologicalNode(this);
        }
    }

    private static Object getDCTerminals(BaseClass _this_) {
        return ((DCTopologicalNode) _this_).getDCTerminals();
    }

    private static void setDCTerminals(BaseClass _this_, Object _value_) {
        if (_value_ instanceof DCBaseTerminal) {
            ((DCTopologicalNode) _this_).setDCTerminals((DCBaseTerminal) _value_);
        } else {
            throw new IllegalArgumentException("Object is not DCBaseTerminal");
        }
    }

    /**
     * A DC topological node belongs to a DC topological island.
     *
     * NOT USED
     */
    private DCTopologicalIsland DCTopologicalIsland; // ManyToOne

    public DCTopologicalIsland getDCTopologicalIsland() {
        return DCTopologicalIsland;
    }

    public void setDCTopologicalIsland(DCTopologicalIsland _object_) {
        if (DCTopologicalIsland != _object_) {
            DCTopologicalIsland = _object_;
            DCTopologicalIsland.setDCTopologicalNodes(this);
        }
    }

    private static Object getDCTopologicalIsland(BaseClass _this_) {
        return ((DCTopologicalNode) _this_).getDCTopologicalIsland();
    }

    private static void setDCTopologicalIsland(BaseClass _this_, Object _value_) {
        if (_value_ instanceof DCTopologicalIsland) {
            ((DCTopologicalNode) _this_).setDCTopologicalIsland((DCTopologicalIsland) _value_);
        } else {
            throw new IllegalArgumentException("Object is not DCTopologicalIsland");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "DCTopologicalNode", attrName));
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
                "DCTopologicalNode", attrName, value));
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
            profiles.add(CGMESProfile.TP);
            map.put("DCEquipmentContainer", new AttrDetails("DCTopologicalNode.DCEquipmentContainer", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, DCTopologicalNode::getDCEquipmentContainer, DCTopologicalNode::setDCEquipmentContainer));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP);
            map.put("DCNodes", new AttrDetails("DCTopologicalNode.DCNodes", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, DCTopologicalNode::getDCNodes, DCTopologicalNode::setDCNodes));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP);
            map.put("DCTerminals", new AttrDetails("DCTopologicalNode.DCTerminals", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, DCTopologicalNode::getDCTerminals, DCTopologicalNode::setDCTerminals));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("DCTopologicalIsland", new AttrDetails("DCTopologicalNode.DCTopologicalIsland", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, DCTopologicalNode::getDCTopologicalIsland, DCTopologicalNode::setDCTopologicalIsland));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new DCTopologicalNode(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.SV);
        profiles.add(CGMESProfile.TP);
        POSSIBLE_PROFILES = Collections.unmodifiableSet(profiles);
    }

    private static final CGMESProfile RECOMMENDED_PROFILE = CGMESProfile.TP;

    private static final Set<CGMESProfile> POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>(POSSIBLE_PROFILES);
        for (var attrDetails : ATTR_DETAILS_MAP.values()) {
            profiles.addAll(attrDetails.profiles);
        }
        POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES = Collections.unmodifiableSet(profiles);
    }
}
