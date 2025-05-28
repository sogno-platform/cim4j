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

    public TopologicalIsland getAngleRefTopologicalIsland() {
        return AngleRefTopologicalIsland;
    }

    public void setAngleRefTopologicalIsland(TopologicalIsland _object_) {
        if (AngleRefTopologicalIsland != _object_) {
            AngleRefTopologicalIsland = _object_;
            AngleRefTopologicalIsland.setAngleRefTopologicalNode(this);
        }
    }

    private static Object getAngleRefTopologicalIsland(BaseClass _this_) {
        return ((TopologicalNode) _this_).getAngleRefTopologicalIsland();
    }

    private static void setAngleRefTopologicalIsland(BaseClass _this_, Object _value_) {
        if (_value_ instanceof TopologicalIsland) {
            ((TopologicalNode) _this_).setAngleRefTopologicalIsland((TopologicalIsland) _value_);
        } else {
            throw new IllegalArgumentException("Object is not TopologicalIsland");
        }
    }

    /**
     * The base voltage of the topological node.
     */
    private BaseVoltage BaseVoltage; // ManyToOne

    public BaseVoltage getBaseVoltage() {
        return BaseVoltage;
    }

    public void setBaseVoltage(BaseVoltage _object_) {
        if (BaseVoltage != _object_) {
            BaseVoltage = _object_;
            BaseVoltage.setTopologicalNode(this);
        }
    }

    private static Object getBaseVoltage(BaseClass _this_) {
        return ((TopologicalNode) _this_).getBaseVoltage();
    }

    private static void setBaseVoltage(BaseClass _this_, Object _value_) {
        if (_value_ instanceof BaseVoltage) {
            ((TopologicalNode) _this_).setBaseVoltage((BaseVoltage) _value_);
        } else {
            throw new IllegalArgumentException("Object is not BaseVoltage");
        }
    }

    /**
     * The connectivity node container to which the topological node belongs.
     */
    private ConnectivityNodeContainer ConnectivityNodeContainer; // ManyToOne

    public ConnectivityNodeContainer getConnectivityNodeContainer() {
        return ConnectivityNodeContainer;
    }

    public void setConnectivityNodeContainer(ConnectivityNodeContainer _object_) {
        if (ConnectivityNodeContainer != _object_) {
            ConnectivityNodeContainer = _object_;
            ConnectivityNodeContainer.setTopologicalNode(this);
        }
    }

    private static Object getConnectivityNodeContainer(BaseClass _this_) {
        return ((TopologicalNode) _this_).getConnectivityNodeContainer();
    }

    private static void setConnectivityNodeContainer(BaseClass _this_, Object _value_) {
        if (_value_ instanceof ConnectivityNodeContainer) {
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

    public Set<ConnectivityNode> getConnectivityNodes() {
        return ConnectivityNodes;
    }

    public void setConnectivityNodes(ConnectivityNode _object_) {
        if (!ConnectivityNodes.contains(_object_)) {
            ConnectivityNodes.add(_object_);
            _object_.setTopologicalNode(this);
        }
    }

    private static Object getConnectivityNodes(BaseClass _this_) {
        return ((TopologicalNode) _this_).getConnectivityNodes();
    }

    private static void setConnectivityNodes(BaseClass _this_, Object _value_) {
        if (_value_ instanceof ConnectivityNode) {
            ((TopologicalNode) _this_).setConnectivityNodes((ConnectivityNode) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ConnectivityNode");
        }
    }

    /**
     * The reporting group to which the topological node belongs.
     */
    private ReportingGroup ReportingGroup; // ManyToOne

    public ReportingGroup getReportingGroup() {
        return ReportingGroup;
    }

    public void setReportingGroup(ReportingGroup _object_) {
        if (ReportingGroup != _object_) {
            ReportingGroup = _object_;
            ReportingGroup.setTopologicalNode(this);
        }
    }

    private static Object getReportingGroup(BaseClass _this_) {
        return ((TopologicalNode) _this_).getReportingGroup();
    }

    private static void setReportingGroup(BaseClass _this_, Object _value_) {
        if (_value_ instanceof ReportingGroup) {
            ((TopologicalNode) _this_).setReportingGroup((ReportingGroup) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ReportingGroup");
        }
    }

    /**
     * The injection flows state variables associated with the topological node.
     *
     * NOT USED
     */
    private SvInjection SvInjection; // OneToOne

    public SvInjection getSvInjection() {
        return SvInjection;
    }

    public void setSvInjection(SvInjection _object_) {
        if (SvInjection != _object_) {
            SvInjection = _object_;
            SvInjection.setTopologicalNode(this);
        }
    }

    private static Object getSvInjection(BaseClass _this_) {
        return ((TopologicalNode) _this_).getSvInjection();
    }

    private static void setSvInjection(BaseClass _this_, Object _value_) {
        if (_value_ instanceof SvInjection) {
            ((TopologicalNode) _this_).setSvInjection((SvInjection) _value_);
        } else {
            throw new IllegalArgumentException("Object is not SvInjection");
        }
    }

    /**
     * The state voltage associated with the topological node.
     *
     * NOT USED
     */
    private SvVoltage SvVoltage; // OneToOne

    public SvVoltage getSvVoltage() {
        return SvVoltage;
    }

    public void setSvVoltage(SvVoltage _object_) {
        if (SvVoltage != _object_) {
            SvVoltage = _object_;
            SvVoltage.setTopologicalNode(this);
        }
    }

    private static Object getSvVoltage(BaseClass _this_) {
        return ((TopologicalNode) _this_).getSvVoltage();
    }

    private static void setSvVoltage(BaseClass _this_, Object _value_) {
        if (_value_ instanceof SvVoltage) {
            ((TopologicalNode) _this_).setSvVoltage((SvVoltage) _value_);
        } else {
            throw new IllegalArgumentException("Object is not SvVoltage");
        }
    }

    /**
     * The terminals associated with the topological node.   This can be used as an alternative to the connectivity node path to terminal, thus making it unnecessary to model connectivity nodes in some cases.   Note that if connectivity nodes are in the model, this association would probably not be used as an input specification.
     *
     * NOT USED
     */
    private Set<Terminal> Terminal = new HashSet<>(); // OneToMany

    public Set<Terminal> getTerminal() {
        return Terminal;
    }

    public void setTerminal(Terminal _object_) {
        if (!Terminal.contains(_object_)) {
            Terminal.add(_object_);
            _object_.setTopologicalNode(this);
        }
    }

    private static Object getTerminal(BaseClass _this_) {
        return ((TopologicalNode) _this_).getTerminal();
    }

    private static void setTerminal(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Terminal) {
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

    public TopologicalIsland getTopologicalIsland() {
        return TopologicalIsland;
    }

    public void setTopologicalIsland(TopologicalIsland _object_) {
        if (TopologicalIsland != _object_) {
            TopologicalIsland = _object_;
            TopologicalIsland.setTopologicalNodes(this);
        }
    }

    private static Object getTopologicalIsland(BaseClass _this_) {
        return ((TopologicalNode) _this_).getTopologicalIsland();
    }

    private static void setTopologicalIsland(BaseClass _this_, Object _value_) {
        if (_value_ instanceof TopologicalIsland) {
            ((TopologicalNode) _this_).setTopologicalIsland((TopologicalIsland) _value_);
        } else {
            throw new IllegalArgumentException("Object is not TopologicalIsland");
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

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/CIM100#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("AngleRefTopologicalIsland", new AttrDetails("TopologicalNode.AngleRefTopologicalIsland", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, TopologicalNode::getAngleRefTopologicalIsland, TopologicalNode::setAngleRefTopologicalIsland));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP);
            map.put("BaseVoltage", new AttrDetails("TopologicalNode.BaseVoltage", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, TopologicalNode::getBaseVoltage, TopologicalNode::setBaseVoltage));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP);
            map.put("ConnectivityNodeContainer", new AttrDetails("TopologicalNode.ConnectivityNodeContainer", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, TopologicalNode::getConnectivityNodeContainer, TopologicalNode::setConnectivityNodeContainer));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP);
            map.put("ConnectivityNodes", new AttrDetails("TopologicalNode.ConnectivityNodes", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, TopologicalNode::getConnectivityNodes, TopologicalNode::setConnectivityNodes));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP);
            map.put("ReportingGroup", new AttrDetails("TopologicalNode.ReportingGroup", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, TopologicalNode::getReportingGroup, TopologicalNode::setReportingGroup));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("SvInjection", new AttrDetails("TopologicalNode.SvInjection", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, TopologicalNode::getSvInjection, TopologicalNode::setSvInjection));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("SvVoltage", new AttrDetails("TopologicalNode.SvVoltage", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, TopologicalNode::getSvVoltage, TopologicalNode::setSvVoltage));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP);
            map.put("Terminal", new AttrDetails("TopologicalNode.Terminal", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, TopologicalNode::getTerminal, TopologicalNode::setTerminal));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("TopologicalIsland", new AttrDetails("TopologicalNode.TopologicalIsland", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, TopologicalNode::getTopologicalIsland, TopologicalNode::setTopologicalIsland));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new TopologicalNode(null).allAttrDetailsMap());
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
