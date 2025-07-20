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
 * Connectivity nodes are points where terminals of AC conducting equipment are connected together with zero impedance.
 */
@SuppressWarnings("unused")
public class ConnectivityNode extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(ConnectivityNode.class);

    /**
     * Constructor.
     */
    public ConnectivityNode(String rdfid) {
        super("ConnectivityNode", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ConnectivityNode(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Container of this connectivity node.
     */
    private ConnectivityNodeContainer ConnectivityNodeContainer; // ManyToOne

    private String ConnectivityNodeContainerId;

    public ConnectivityNodeContainer getConnectivityNodeContainer() {
        return ConnectivityNodeContainer;
    }

    public void setConnectivityNodeContainer(ConnectivityNodeContainer _object_) {
        if (ConnectivityNodeContainer != _object_) {
            ConnectivityNodeContainer = _object_;
            _object_.setConnectivityNodes(this);
            ConnectivityNodeContainerId = _object_.getRdfid();
        }
    }

    private static Object getConnectivityNodeContainer(BaseClass _this_) {
        var obj = ((ConnectivityNode) _this_).getConnectivityNodeContainer();
        var id = ((ConnectivityNode) _this_).ConnectivityNodeContainerId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setConnectivityNodeContainer(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ConnectivityNode) _this_).ConnectivityNodeContainerId = (String) _value_;
        } else if (_value_ instanceof ConnectivityNodeContainer) {
            ((ConnectivityNode) _this_).setConnectivityNodeContainer((ConnectivityNodeContainer) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ConnectivityNodeContainer");
        }
    }

    /**
     * The connectivity node to which this terminal connects with zero impedance.
     *
     * NOT USED
     */
    private Set<Terminal> Terminals = new HashSet<>(); // OneToMany

    private Set<String> TerminalsIdSet = new HashSet<>();

    public Set<Terminal> getTerminals() {
        return Terminals;
    }

    public void setTerminals(Terminal _object_) {
        if (!Terminals.contains(_object_)) {
            Terminals.add(_object_);
            _object_.setConnectivityNode(this);
            TerminalsIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getTerminals(BaseClass _this_) {
        var objs = ((ConnectivityNode) _this_).getTerminals();
        var ids = ((ConnectivityNode) _this_).TerminalsIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setTerminals(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ConnectivityNode) _this_).TerminalsIdSet.add((String) _value_);
        } else if (_value_ instanceof Terminal) {
            ((ConnectivityNode) _this_).setTerminals((Terminal) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Terminal");
        }
    }

    /**
     * The topological node to which this connectivity node is assigned.  May depend on the current state of switches in the network.
     */
    private TopologicalNode TopologicalNode; // ManyToOne

    private String TopologicalNodeId;

    public TopologicalNode getTopologicalNode() {
        return TopologicalNode;
    }

    public void setTopologicalNode(TopologicalNode _object_) {
        if (TopologicalNode != _object_) {
            TopologicalNode = _object_;
            _object_.setConnectivityNodes(this);
            TopologicalNodeId = _object_.getRdfid();
        }
    }

    private static Object getTopologicalNode(BaseClass _this_) {
        var obj = ((ConnectivityNode) _this_).getTopologicalNode();
        var id = ((ConnectivityNode) _this_).TopologicalNodeId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setTopologicalNode(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ConnectivityNode) _this_).TopologicalNodeId = (String) _value_;
        } else if (_value_ instanceof TopologicalNode) {
            ((ConnectivityNode) _this_).setTopologicalNode((TopologicalNode) _value_);
        } else {
            throw new IllegalArgumentException("Object is not TopologicalNode");
        }
    }

    /**
     * Identifies if a node is a BoundaryPoint. If boundaryPoint=true the ConnectivityNode or the TopologicalNode represents a BoundaryPoint.
     */
    private Boolean boundaryPoint; // Boolean

    public Boolean getBoundaryPoint() {
        return boundaryPoint;
    }

    public void setBoundaryPoint(Boolean _value_) {
        boundaryPoint = _value_;
    }

    private static Object getBoundaryPoint(BaseClass _this_) {
        return ((ConnectivityNode) _this_).getBoundaryPoint();
    }

    private static void setBoundaryPoint(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ConnectivityNode) _this_).setBoundaryPoint((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ConnectivityNode) _this_).setBoundaryPoint(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * The attribute is used for an exchange of the ISO code of the region to which the `From` side of the Boundary point belongs to or it is connected to. The ISO code is two characters country code as defined by ISO 3166 (). The length of the string is 2 characters maximum. The attribute is a required for the Boundary Model Authority Set where this attribute is used only for the TopologicalNode in the Boundary Topology profile and ConnectivityNode in the Boundary Equipment profile.
     */
    private String fromEndIsoCode; // String

    public String getFromEndIsoCode() {
        return fromEndIsoCode;
    }

    public void setFromEndIsoCode(String _value_) {
        fromEndIsoCode = _value_;
    }

    private static Object getFromEndIsoCode(BaseClass _this_) {
        return ((ConnectivityNode) _this_).getFromEndIsoCode();
    }

    private static void setFromEndIsoCode(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ConnectivityNode) _this_).setFromEndIsoCode((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * The attribute is used for an exchange of a human readable name with length of the string 32 characters maximum. The attribute covers two cases:  The attribute is required for the Boundary Model Authority Set where it is used only for the TopologicalNode in the Boundary Topology profile and ConnectivityNode in the Boundary Equipment profile.
     */
    private String fromEndName; // String

    public String getFromEndName() {
        return fromEndName;
    }

    public void setFromEndName(String _value_) {
        fromEndName = _value_;
    }

    private static Object getFromEndName(BaseClass _this_) {
        return ((ConnectivityNode) _this_).getFromEndName();
    }

    private static void setFromEndName(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ConnectivityNode) _this_).setFromEndName((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * The attribute is used for an exchange of the name of the TSO to which the `From` side of the Boundary point belongs to or it is connected to. The length of the string is 32 characters maximum. The attribute is required for the Boundary Model Authority Set where it is used only for the TopologicalNode in the Boundary Topology profile and ConnectivityNode in the Boundary Equipment profile.
     */
    private String fromEndNameTso; // String

    public String getFromEndNameTso() {
        return fromEndNameTso;
    }

    public void setFromEndNameTso(String _value_) {
        fromEndNameTso = _value_;
    }

    private static Object getFromEndNameTso(BaseClass _this_) {
        return ((ConnectivityNode) _this_).getFromEndNameTso();
    }

    private static void setFromEndNameTso(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ConnectivityNode) _this_).setFromEndNameTso((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * The attribute is used for an exchange of the ISO code of the region to which the `To` side of the Boundary point belongs to or it is connected to. The ISO code is two characters country code as defined by ISO 3166 (). The length of the string is 2 characters maximum. The attribute is a required for the Boundary Model Authority Set where this attribute is used only for the TopologicalNode in the Boundary Topology profile and ConnectivityNode in the Boundary Equipment profile.
     */
    private String toEndIsoCode; // String

    public String getToEndIsoCode() {
        return toEndIsoCode;
    }

    public void setToEndIsoCode(String _value_) {
        toEndIsoCode = _value_;
    }

    private static Object getToEndIsoCode(BaseClass _this_) {
        return ((ConnectivityNode) _this_).getToEndIsoCode();
    }

    private static void setToEndIsoCode(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ConnectivityNode) _this_).setToEndIsoCode((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * The attribute is used for an exchange of a human readable name with length of the string 32 characters maximum. The attribute covers two cases:  The attribute is required for the Boundary Model Authority Set where it is used only for the TopologicalNode in the Boundary Topology profile and ConnectivityNode in the Boundary Equipment profile.
     */
    private String toEndName; // String

    public String getToEndName() {
        return toEndName;
    }

    public void setToEndName(String _value_) {
        toEndName = _value_;
    }

    private static Object getToEndName(BaseClass _this_) {
        return ((ConnectivityNode) _this_).getToEndName();
    }

    private static void setToEndName(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ConnectivityNode) _this_).setToEndName((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * The attribute is used for an exchange of the name of the TSO to which the `To` side of the Boundary point belongs to or it is connected to. The length of the string is 32 characters maximum. The attribute is required for the Boundary Model Authority Set where it is used only for the TopologicalNode in the Boundary Topology profile and ConnectivityNode in the Boundary Equipment profile.
     */
    private String toEndNameTso; // String

    public String getToEndNameTso() {
        return toEndNameTso;
    }

    public void setToEndNameTso(String _value_) {
        toEndNameTso = _value_;
    }

    private static Object getToEndNameTso(BaseClass _this_) {
        return ((ConnectivityNode) _this_).getToEndNameTso();
    }

    private static void setToEndNameTso(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ConnectivityNode) _this_).setToEndNameTso((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ConnectivityNode", attrName));
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
                "ConnectivityNode", attrName, value));
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
            profiles.add(CGMESProfile.EQ_BD);
            profiles.add(CGMESProfile.EQ);
            map.put("ConnectivityNodeContainer", new AttrDetails("ConnectivityNode.ConnectivityNodeContainer", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ConnectivityNode::getConnectivityNodeContainer, ConnectivityNode::setConnectivityNodeContainer));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("Terminals", new AttrDetails("ConnectivityNode.Terminals", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ConnectivityNode::getTerminals, ConnectivityNode::setTerminals));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP_BD);
            profiles.add(CGMESProfile.TP);
            map.put("TopologicalNode", new AttrDetails("ConnectivityNode.TopologicalNode", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ConnectivityNode::getTopologicalNode, ConnectivityNode::setTopologicalNode));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ_BD);
            map.put("boundaryPoint", new AttrDetails("ConnectivityNode.boundaryPoint", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false, ConnectivityNode::getBoundaryPoint, ConnectivityNode::setBoundaryPoint));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ_BD);
            map.put("fromEndIsoCode", new AttrDetails("ConnectivityNode.fromEndIsoCode", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false, ConnectivityNode::getFromEndIsoCode, ConnectivityNode::setFromEndIsoCode));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ_BD);
            map.put("fromEndName", new AttrDetails("ConnectivityNode.fromEndName", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false, ConnectivityNode::getFromEndName, ConnectivityNode::setFromEndName));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ_BD);
            map.put("fromEndNameTso", new AttrDetails("ConnectivityNode.fromEndNameTso", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false, ConnectivityNode::getFromEndNameTso, ConnectivityNode::setFromEndNameTso));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ_BD);
            map.put("toEndIsoCode", new AttrDetails("ConnectivityNode.toEndIsoCode", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false, ConnectivityNode::getToEndIsoCode, ConnectivityNode::setToEndIsoCode));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ_BD);
            map.put("toEndName", new AttrDetails("ConnectivityNode.toEndName", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false, ConnectivityNode::getToEndName, ConnectivityNode::setToEndName));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ_BD);
            map.put("toEndNameTso", new AttrDetails("ConnectivityNode.toEndNameTso", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false, ConnectivityNode::getToEndNameTso, ConnectivityNode::setToEndNameTso));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ConnectivityNode(null).allAttrDetailsMap());
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
