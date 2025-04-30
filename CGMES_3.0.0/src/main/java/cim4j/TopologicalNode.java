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
     * Default constructor.
     */
    public TopologicalNode() {
        setCimType("TopologicalNode");
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

    public void setAngleRefTopologicalIsland(BaseClass _object_) {
        if (!(_object_ instanceof TopologicalIsland)) {
            throw new IllegalArgumentException("Object is not TopologicalIsland");
        }
        if (AngleRefTopologicalIsland != _object_) {
            AngleRefTopologicalIsland = (TopologicalIsland) _object_;
            AngleRefTopologicalIsland.setAngleRefTopologicalNode(this);
        }
    }

    public String AngleRefTopologicalIslandToString() {
        return AngleRefTopologicalIsland != null ? AngleRefTopologicalIsland.getRdfid() : null;
    }

    /**
     * The base voltage of the topological node.
     */
    private BaseVoltage BaseVoltage; // ManyToOne

    public BaseVoltage getBaseVoltage() {
        return BaseVoltage;
    }

    public void setBaseVoltage(BaseClass _object_) {
        if (!(_object_ instanceof BaseVoltage)) {
            throw new IllegalArgumentException("Object is not BaseVoltage");
        }
        if (BaseVoltage != _object_) {
            BaseVoltage = (BaseVoltage) _object_;
            BaseVoltage.setTopologicalNode(this);
        }
    }

    public String BaseVoltageToString() {
        return BaseVoltage != null ? BaseVoltage.getRdfid() : null;
    }

    /**
     * The connectivity node container to which the topological node belongs.
     */
    private ConnectivityNodeContainer ConnectivityNodeContainer; // ManyToOne

    public ConnectivityNodeContainer getConnectivityNodeContainer() {
        return ConnectivityNodeContainer;
    }

    public void setConnectivityNodeContainer(BaseClass _object_) {
        if (!(_object_ instanceof ConnectivityNodeContainer)) {
            throw new IllegalArgumentException("Object is not ConnectivityNodeContainer");
        }
        if (ConnectivityNodeContainer != _object_) {
            ConnectivityNodeContainer = (ConnectivityNodeContainer) _object_;
            ConnectivityNodeContainer.setTopologicalNode(this);
        }
    }

    public String ConnectivityNodeContainerToString() {
        return ConnectivityNodeContainer != null ? ConnectivityNodeContainer.getRdfid() : null;
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

    public void setConnectivityNodes(BaseClass _object_) {
        if (!(_object_ instanceof ConnectivityNode)) {
            throw new IllegalArgumentException("Object is not ConnectivityNode");
        }
        if (!ConnectivityNodes.contains(_object_)) {
            ConnectivityNodes.add((ConnectivityNode) _object_);
            ((ConnectivityNode) _object_).setTopologicalNode(this);
        }
    }

    public String ConnectivityNodesToString() {
        return getStringFromSet(ConnectivityNodes);
    }

    /**
     * The reporting group to which the topological node belongs.
     */
    private ReportingGroup ReportingGroup; // ManyToOne

    public ReportingGroup getReportingGroup() {
        return ReportingGroup;
    }

    public void setReportingGroup(BaseClass _object_) {
        if (!(_object_ instanceof ReportingGroup)) {
            throw new IllegalArgumentException("Object is not ReportingGroup");
        }
        if (ReportingGroup != _object_) {
            ReportingGroup = (ReportingGroup) _object_;
            ReportingGroup.setTopologicalNode(this);
        }
    }

    public String ReportingGroupToString() {
        return ReportingGroup != null ? ReportingGroup.getRdfid() : null;
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

    public void setSvInjection(BaseClass _object_) {
        if (!(_object_ instanceof SvInjection)) {
            throw new IllegalArgumentException("Object is not SvInjection");
        }
        if (SvInjection != _object_) {
            SvInjection = (SvInjection) _object_;
            SvInjection.setTopologicalNode(this);
        }
    }

    public String SvInjectionToString() {
        return SvInjection != null ? SvInjection.getRdfid() : null;
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

    public void setSvVoltage(BaseClass _object_) {
        if (!(_object_ instanceof SvVoltage)) {
            throw new IllegalArgumentException("Object is not SvVoltage");
        }
        if (SvVoltage != _object_) {
            SvVoltage = (SvVoltage) _object_;
            SvVoltage.setTopologicalNode(this);
        }
    }

    public String SvVoltageToString() {
        return SvVoltage != null ? SvVoltage.getRdfid() : null;
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

    public void setTerminal(BaseClass _object_) {
        if (!(_object_ instanceof Terminal)) {
            throw new IllegalArgumentException("Object is not Terminal");
        }
        if (!Terminal.contains(_object_)) {
            Terminal.add((Terminal) _object_);
            ((Terminal) _object_).setTopologicalNode(this);
        }
    }

    public String TerminalToString() {
        return getStringFromSet(Terminal);
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

    public void setTopologicalIsland(BaseClass _object_) {
        if (!(_object_ instanceof TopologicalIsland)) {
            throw new IllegalArgumentException("Object is not TopologicalIsland");
        }
        if (TopologicalIsland != _object_) {
            TopologicalIsland = (TopologicalIsland) _object_;
            TopologicalIsland.setTopologicalNodes(this);
        }
    }

    public String TopologicalIslandToString() {
        return TopologicalIsland != null ? TopologicalIsland.getRdfid() : null;
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
        return getAttribute("TopologicalNode", attrName);
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
        setAttribute("TopologicalNode", attrName, objectValue);
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
        setAttribute("TopologicalNode", attrName, stringValue);
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
            profiles.add(CGMESProfile.SV);
            map.put("AngleRefTopologicalIsland", new AttrDetails("TopologicalNode.AngleRefTopologicalIsland", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP);
            map.put("BaseVoltage", new AttrDetails("TopologicalNode.BaseVoltage", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP);
            map.put("ConnectivityNodeContainer", new AttrDetails("TopologicalNode.ConnectivityNodeContainer", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP);
            map.put("ConnectivityNodes", new AttrDetails("TopologicalNode.ConnectivityNodes", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP);
            map.put("ReportingGroup", new AttrDetails("TopologicalNode.ReportingGroup", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("SvInjection", new AttrDetails("TopologicalNode.SvInjection", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("SvVoltage", new AttrDetails("TopologicalNode.SvVoltage", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP);
            map.put("Terminal", new AttrDetails("TopologicalNode.Terminal", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("TopologicalIsland", new AttrDetails("TopologicalNode.TopologicalIsland", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new TopologicalNode().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("AngleRefTopologicalIsland", new GetterSetter(this::AngleRefTopologicalIslandToString, this::setAngleRefTopologicalIsland, null));
        map.put("BaseVoltage", new GetterSetter(this::BaseVoltageToString, this::setBaseVoltage, null));
        map.put("ConnectivityNodeContainer", new GetterSetter(this::ConnectivityNodeContainerToString, this::setConnectivityNodeContainer, null));
        map.put("ConnectivityNodes", new GetterSetter(this::ConnectivityNodesToString, this::setConnectivityNodes, null));
        map.put("ReportingGroup", new GetterSetter(this::ReportingGroupToString, this::setReportingGroup, null));
        map.put("SvInjection", new GetterSetter(this::SvInjectionToString, this::setSvInjection, null));
        map.put("SvVoltage", new GetterSetter(this::SvVoltageToString, this::setSvVoltage, null));
        map.put("Terminal", new GetterSetter(this::TerminalToString, this::setTerminal, null));
        map.put("TopologicalIsland", new GetterSetter(this::TopologicalIslandToString, this::setTopologicalIsland, null));
        return map;
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
