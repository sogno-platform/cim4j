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
 * For a detailed substation model a topological node is a set of connectivity nodes that, in the current network state, are connected together through any type of closed switches, including  jumpers. Topological nodes change as the current network state changes (i.e., switches, breakers, etc. change state). For a planning model, switch statuses are not used to form topological nodes. Instead they are manually created or deleted in a model builder tool. Topological nodes maintained this way are also called "busses".
 */
@SuppressWarnings("unused")
public class TopologicalNode extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(TopologicalNode.class);

    /**
     * Constructor.
     */
    public TopologicalNode(String rdfid) {
        super("TopologicalNode", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected TopologicalNode(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The island for which the node is an angle reference.   Normally there is one angle reference node for each island.
     *
     * NOT USED
     */
    private TopologicalIsland AngleRefTopologicalIsland; // OneToOne

    private String AngleRefTopologicalIslandId;

    public TopologicalIsland getAngleRefTopologicalIsland() {
        return AngleRefTopologicalIsland;
    }

    public void setAngleRefTopologicalIsland(TopologicalIsland _object_) {
        if (AngleRefTopologicalIsland != _object_) {
            AngleRefTopologicalIsland = _object_;
            _object_.setAngleRefTopologicalNode(this);
            AngleRefTopologicalIslandId = _object_.getRdfid();
        }
    }

    private static Object getAngleRefTopologicalIsland(BaseClass _this_) {
        var obj = ((TopologicalNode) _this_).getAngleRefTopologicalIsland();
        var id = ((TopologicalNode) _this_).AngleRefTopologicalIslandId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setAngleRefTopologicalIsland(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((TopologicalNode) _this_).AngleRefTopologicalIslandId = (String) _value_;
        } else if (_value_ instanceof TopologicalIsland) {
            ((TopologicalNode) _this_).setAngleRefTopologicalIsland((TopologicalIsland) _value_);
        } else {
            throw new IllegalArgumentException("Object is not TopologicalIsland");
        }
    }

    /**
     * The base voltage of the topologocial node.
     */
    private BaseVoltage BaseVoltage; // ManyToOne

    private String BaseVoltageId;

    public BaseVoltage getBaseVoltage() {
        return BaseVoltage;
    }

    public void setBaseVoltage(BaseVoltage _object_) {
        if (BaseVoltage != _object_) {
            BaseVoltage = _object_;
            _object_.setTopologicalNode(this);
            BaseVoltageId = _object_.getRdfid();
        }
    }

    private static Object getBaseVoltage(BaseClass _this_) {
        var obj = ((TopologicalNode) _this_).getBaseVoltage();
        var id = ((TopologicalNode) _this_).BaseVoltageId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setBaseVoltage(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((TopologicalNode) _this_).BaseVoltageId = (String) _value_;
        } else if (_value_ instanceof BaseVoltage) {
            ((TopologicalNode) _this_).setBaseVoltage((BaseVoltage) _value_);
        } else {
            throw new IllegalArgumentException("Object is not BaseVoltage");
        }
    }

    /**
     * The connectivity node container to which the toplogical node belongs.
     */
    private ConnectivityNodeContainer ConnectivityNodeContainer; // ManyToOne

    private String ConnectivityNodeContainerId;

    public ConnectivityNodeContainer getConnectivityNodeContainer() {
        return ConnectivityNodeContainer;
    }

    public void setConnectivityNodeContainer(ConnectivityNodeContainer _object_) {
        if (ConnectivityNodeContainer != _object_) {
            ConnectivityNodeContainer = _object_;
            _object_.setTopologicalNode(this);
            ConnectivityNodeContainerId = _object_.getRdfid();
        }
    }

    private static Object getConnectivityNodeContainer(BaseClass _this_) {
        var obj = ((TopologicalNode) _this_).getConnectivityNodeContainer();
        var id = ((TopologicalNode) _this_).ConnectivityNodeContainerId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setConnectivityNodeContainer(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((TopologicalNode) _this_).ConnectivityNodeContainerId = (String) _value_;
        } else if (_value_ instanceof ConnectivityNodeContainer) {
            ((TopologicalNode) _this_).setConnectivityNodeContainer((ConnectivityNodeContainer) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ConnectivityNodeContainer");
        }
    }

    /**
     * The connectivity nodes combine together to form this topological node.  May depend on the current state of switches in the network.
     *
     * NOT USED
     */
    private Set<ConnectivityNode> ConnectivityNodes = new HashSet<>(); // OneToMany

    private Set<String> ConnectivityNodesIdSet = new HashSet<>();

    public Set<ConnectivityNode> getConnectivityNodes() {
        return ConnectivityNodes;
    }

    public void setConnectivityNodes(ConnectivityNode _object_) {
        if (!ConnectivityNodes.contains(_object_)) {
            ConnectivityNodes.add(_object_);
            _object_.setTopologicalNode(this);
            ConnectivityNodesIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getConnectivityNodes(BaseClass _this_) {
        var objs = ((TopologicalNode) _this_).getConnectivityNodes();
        var ids = ((TopologicalNode) _this_).ConnectivityNodesIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setConnectivityNodes(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((TopologicalNode) _this_).ConnectivityNodesIdSet.add((String) _value_);
        } else if (_value_ instanceof ConnectivityNode) {
            ((TopologicalNode) _this_).setConnectivityNodes((ConnectivityNode) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ConnectivityNode");
        }
    }

    /**
     * The topological nodes that belong to the reporting group.
     */
    private ReportingGroup ReportingGroup; // ManyToOne

    private String ReportingGroupId;

    public ReportingGroup getReportingGroup() {
        return ReportingGroup;
    }

    public void setReportingGroup(ReportingGroup _object_) {
        if (ReportingGroup != _object_) {
            ReportingGroup = _object_;
            _object_.setTopologicalNode(this);
            ReportingGroupId = _object_.getRdfid();
        }
    }

    private static Object getReportingGroup(BaseClass _this_) {
        var obj = ((TopologicalNode) _this_).getReportingGroup();
        var id = ((TopologicalNode) _this_).ReportingGroupId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setReportingGroup(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((TopologicalNode) _this_).ReportingGroupId = (String) _value_;
        } else if (_value_ instanceof ReportingGroup) {
            ((TopologicalNode) _this_).setReportingGroup((ReportingGroup) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ReportingGroup");
        }
    }

    /**
     * The topological node associated with the flow injection state variable.
     *
     * NOT USED
     */
    private SvInjection SvInjection; // OneToOne

    private String SvInjectionId;

    public SvInjection getSvInjection() {
        return SvInjection;
    }

    public void setSvInjection(SvInjection _object_) {
        if (SvInjection != _object_) {
            SvInjection = _object_;
            _object_.setTopologicalNode(this);
            SvInjectionId = _object_.getRdfid();
        }
    }

    private static Object getSvInjection(BaseClass _this_) {
        var obj = ((TopologicalNode) _this_).getSvInjection();
        var id = ((TopologicalNode) _this_).SvInjectionId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setSvInjection(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((TopologicalNode) _this_).SvInjectionId = (String) _value_;
        } else if (_value_ instanceof SvInjection) {
            ((TopologicalNode) _this_).setSvInjection((SvInjection) _value_);
        } else {
            throw new IllegalArgumentException("Object is not SvInjection");
        }
    }

    /**
     * The topological node associated with the voltage state.
     *
     * NOT USED
     */
    private SvVoltage SvVoltage; // OneToOne

    private String SvVoltageId;

    public SvVoltage getSvVoltage() {
        return SvVoltage;
    }

    public void setSvVoltage(SvVoltage _object_) {
        if (SvVoltage != _object_) {
            SvVoltage = _object_;
            _object_.setTopologicalNode(this);
            SvVoltageId = _object_.getRdfid();
        }
    }

    private static Object getSvVoltage(BaseClass _this_) {
        var obj = ((TopologicalNode) _this_).getSvVoltage();
        var id = ((TopologicalNode) _this_).SvVoltageId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setSvVoltage(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((TopologicalNode) _this_).SvVoltageId = (String) _value_;
        } else if (_value_ instanceof SvVoltage) {
            ((TopologicalNode) _this_).setSvVoltage((SvVoltage) _value_);
        } else {
            throw new IllegalArgumentException("Object is not SvVoltage");
        }
    }

    /**
     * The topological node associated with the terminal.   This can be used as an alternative to the connectivity node path to topological node, thus making it unneccesary to model connectivity nodes in some cases.   Note that the if connectivity nodes are in the model, this association would probably not be used as an input specification.
     *
     * NOT USED
     */
    private Set<Terminal> Terminal = new HashSet<>(); // OneToMany

    private Set<String> TerminalIdSet = new HashSet<>();

    public Set<Terminal> getTerminal() {
        return Terminal;
    }

    public void setTerminal(Terminal _object_) {
        if (!Terminal.contains(_object_)) {
            Terminal.add(_object_);
            _object_.setTopologicalNode(this);
            TerminalIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getTerminal(BaseClass _this_) {
        var objs = ((TopologicalNode) _this_).getTerminal();
        var ids = ((TopologicalNode) _this_).TerminalIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setTerminal(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((TopologicalNode) _this_).TerminalIdSet.add((String) _value_);
        } else if (_value_ instanceof Terminal) {
            ((TopologicalNode) _this_).setTerminal((Terminal) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Terminal");
        }
    }

    /**
     * A topological node belongs to a topological island.
     *
     * NOT USED
     */
    private TopologicalIsland TopologicalIsland; // ManyToOne

    private String TopologicalIslandId;

    public TopologicalIsland getTopologicalIsland() {
        return TopologicalIsland;
    }

    public void setTopologicalIsland(TopologicalIsland _object_) {
        if (TopologicalIsland != _object_) {
            TopologicalIsland = _object_;
            _object_.setTopologicalNodes(this);
            TopologicalIslandId = _object_.getRdfid();
        }
    }

    private static Object getTopologicalIsland(BaseClass _this_) {
        var obj = ((TopologicalNode) _this_).getTopologicalIsland();
        var id = ((TopologicalNode) _this_).TopologicalIslandId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setTopologicalIsland(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((TopologicalNode) _this_).TopologicalIslandId = (String) _value_;
        } else if (_value_ instanceof TopologicalIsland) {
            ((TopologicalNode) _this_).setTopologicalIsland((TopologicalIsland) _value_);
        } else {
            throw new IllegalArgumentException("Object is not TopologicalIsland");
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
        return ((TopologicalNode) _this_).getBoundaryPoint();
    }

    private static void setBoundaryPoint(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((TopologicalNode) _this_).setBoundaryPoint((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((TopologicalNode) _this_).setBoundaryPoint(getBooleanFromString((String) _value_));
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
        return ((TopologicalNode) _this_).getFromEndIsoCode();
    }

    private static void setFromEndIsoCode(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((TopologicalNode) _this_).setFromEndIsoCode((String) _value_);
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
        return ((TopologicalNode) _this_).getFromEndName();
    }

    private static void setFromEndName(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((TopologicalNode) _this_).setFromEndName((String) _value_);
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
        return ((TopologicalNode) _this_).getFromEndNameTso();
    }

    private static void setFromEndNameTso(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((TopologicalNode) _this_).setFromEndNameTso((String) _value_);
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
        return ((TopologicalNode) _this_).getToEndIsoCode();
    }

    private static void setToEndIsoCode(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((TopologicalNode) _this_).setToEndIsoCode((String) _value_);
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
        return ((TopologicalNode) _this_).getToEndName();
    }

    private static void setToEndName(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((TopologicalNode) _this_).setToEndName((String) _value_);
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
        return ((TopologicalNode) _this_).getToEndNameTso();
    }

    private static void setToEndNameTso(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((TopologicalNode) _this_).setToEndNameTso((String) _value_);
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "TopologicalNode", attrName));
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
                "TopologicalNode", attrName, value));
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
            profiles.add(CGMESProfile.SV);
            map.put("AngleRefTopologicalIsland", new AttrDetails("TopologicalNode.AngleRefTopologicalIsland", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, TopologicalNode::getAngleRefTopologicalIsland, TopologicalNode::setAngleRefTopologicalIsland));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP_BD);
            profiles.add(CGMESProfile.TP);
            map.put("BaseVoltage", new AttrDetails("TopologicalNode.BaseVoltage", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, TopologicalNode::getBaseVoltage, TopologicalNode::setBaseVoltage));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP_BD);
            profiles.add(CGMESProfile.TP);
            map.put("ConnectivityNodeContainer", new AttrDetails("TopologicalNode.ConnectivityNodeContainer", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, TopologicalNode::getConnectivityNodeContainer, TopologicalNode::setConnectivityNodeContainer));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP_BD);
            profiles.add(CGMESProfile.TP);
            map.put("ConnectivityNodes", new AttrDetails("TopologicalNode.ConnectivityNodes", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, TopologicalNode::getConnectivityNodes, TopologicalNode::setConnectivityNodes));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP);
            map.put("ReportingGroup", new AttrDetails("TopologicalNode.ReportingGroup", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, TopologicalNode::getReportingGroup, TopologicalNode::setReportingGroup));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("SvInjection", new AttrDetails("TopologicalNode.SvInjection", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, TopologicalNode::getSvInjection, TopologicalNode::setSvInjection));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("SvVoltage", new AttrDetails("TopologicalNode.SvVoltage", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, TopologicalNode::getSvVoltage, TopologicalNode::setSvVoltage));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP);
            map.put("Terminal", new AttrDetails("TopologicalNode.Terminal", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, TopologicalNode::getTerminal, TopologicalNode::setTerminal));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("TopologicalIsland", new AttrDetails("TopologicalNode.TopologicalIsland", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, TopologicalNode::getTopologicalIsland, TopologicalNode::setTopologicalIsland));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP_BD);
            map.put("boundaryPoint", new AttrDetails("TopologicalNode.boundaryPoint", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false, TopologicalNode::getBoundaryPoint, TopologicalNode::setBoundaryPoint));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP_BD);
            map.put("fromEndIsoCode", new AttrDetails("TopologicalNode.fromEndIsoCode", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false, TopologicalNode::getFromEndIsoCode, TopologicalNode::setFromEndIsoCode));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP_BD);
            map.put("fromEndName", new AttrDetails("TopologicalNode.fromEndName", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false, TopologicalNode::getFromEndName, TopologicalNode::setFromEndName));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP_BD);
            map.put("fromEndNameTso", new AttrDetails("TopologicalNode.fromEndNameTso", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false, TopologicalNode::getFromEndNameTso, TopologicalNode::setFromEndNameTso));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP_BD);
            map.put("toEndIsoCode", new AttrDetails("TopologicalNode.toEndIsoCode", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false, TopologicalNode::getToEndIsoCode, TopologicalNode::setToEndIsoCode));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP_BD);
            map.put("toEndName", new AttrDetails("TopologicalNode.toEndName", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false, TopologicalNode::getToEndName, TopologicalNode::setToEndName));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP_BD);
            map.put("toEndNameTso", new AttrDetails("TopologicalNode.toEndNameTso", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false, TopologicalNode::getToEndNameTso, TopologicalNode::setToEndNameTso));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new TopologicalNode(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.SV);
        profiles.add(CGMESProfile.TP_BD);
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
