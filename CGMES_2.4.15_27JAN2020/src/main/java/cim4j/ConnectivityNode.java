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
     * Default constructor.
     */
    public ConnectivityNode() {
        setCimType("ConnectivityNode");
    }

    /**
     * Container of this connectivity node.
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
            ConnectivityNodeContainer.setConnectivityNodes(this);
        }
    }

    public String ConnectivityNodeContainerToString() {
        return ConnectivityNodeContainer != null ? ConnectivityNodeContainer.getRdfid() : null;
    }

    /**
     * The connectivity node to which this terminal connects with zero impedance.
     *
     * NOT USED
     */
    private Set<Terminal> Terminals = new HashSet<>(); // OneToMany

    public Set<Terminal> getTerminals() {
        return Terminals;
    }

    public void setTerminals(BaseClass _object_) {
        if (!(_object_ instanceof Terminal)) {
            throw new IllegalArgumentException("Object is not Terminal");
        }
        if (!Terminals.contains(_object_)) {
            Terminals.add((Terminal) _object_);
            ((Terminal) _object_).setConnectivityNode(this);
        }
    }

    public String TerminalsToString() {
        return getStringFromSet(Terminals);
    }

    /**
     * The topological node to which this connectivity node is assigned.  May depend on the current state of switches in the network.
     */
    private TopologicalNode TopologicalNode; // ManyToOne

    public TopologicalNode getTopologicalNode() {
        return TopologicalNode;
    }

    public void setTopologicalNode(BaseClass _object_) {
        if (!(_object_ instanceof TopologicalNode)) {
            throw new IllegalArgumentException("Object is not TopologicalNode");
        }
        if (TopologicalNode != _object_) {
            TopologicalNode = (TopologicalNode) _object_;
            TopologicalNode.setConnectivityNodes(this);
        }
    }

    public String TopologicalNodeToString() {
        return TopologicalNode != null ? TopologicalNode.getRdfid() : null;
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

    public void setBoundaryPoint(String _value_) {
        boundaryPoint = getBooleanFromString(_value_);
    }

    public String boundaryPointToString() {
        return boundaryPoint != null ? boundaryPoint.toString() : null;
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

    public String fromEndIsoCodeToString() {
        return fromEndIsoCode != null ? fromEndIsoCode.toString() : null;
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

    public String fromEndNameToString() {
        return fromEndName != null ? fromEndName.toString() : null;
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

    public String fromEndNameTsoToString() {
        return fromEndNameTso != null ? fromEndNameTso.toString() : null;
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

    public String toEndIsoCodeToString() {
        return toEndIsoCode != null ? toEndIsoCode.toString() : null;
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

    public String toEndNameToString() {
        return toEndName != null ? toEndName.toString() : null;
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

    public String toEndNameTsoToString() {
        return toEndNameTso != null ? toEndNameTso.toString() : null;
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
        return getAttribute("ConnectivityNode", attrName);
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
        setAttribute("ConnectivityNode", attrName, objectValue);
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
        setAttribute("ConnectivityNode", attrName, stringValue);
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
            profiles.add(CGMESProfile.EQ_BD);
            profiles.add(CGMESProfile.EQ);
            map.put("ConnectivityNodeContainer", new AttrDetails("ConnectivityNode.ConnectivityNodeContainer", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("Terminals", new AttrDetails("ConnectivityNode.Terminals", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP_BD);
            profiles.add(CGMESProfile.TP);
            map.put("TopologicalNode", new AttrDetails("ConnectivityNode.TopologicalNode", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ_BD);
            map.put("boundaryPoint", new AttrDetails("ConnectivityNode.boundaryPoint", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ_BD);
            map.put("fromEndIsoCode", new AttrDetails("ConnectivityNode.fromEndIsoCode", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ_BD);
            map.put("fromEndName", new AttrDetails("ConnectivityNode.fromEndName", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ_BD);
            map.put("fromEndNameTso", new AttrDetails("ConnectivityNode.fromEndNameTso", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ_BD);
            map.put("toEndIsoCode", new AttrDetails("ConnectivityNode.toEndIsoCode", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ_BD);
            map.put("toEndName", new AttrDetails("ConnectivityNode.toEndName", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ_BD);
            map.put("toEndNameTso", new AttrDetails("ConnectivityNode.toEndNameTso", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ConnectivityNode().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("ConnectivityNodeContainer", new GetterSetter(this::ConnectivityNodeContainerToString, this::setConnectivityNodeContainer, null));
        map.put("Terminals", new GetterSetter(this::TerminalsToString, this::setTerminals, null));
        map.put("TopologicalNode", new GetterSetter(this::TopologicalNodeToString, this::setTopologicalNode, null));
        map.put("boundaryPoint", new GetterSetter(this::boundaryPointToString, null, this::setBoundaryPoint));
        map.put("fromEndIsoCode", new GetterSetter(this::fromEndIsoCodeToString, null, this::setFromEndIsoCode));
        map.put("fromEndName", new GetterSetter(this::fromEndNameToString, null, this::setFromEndName));
        map.put("fromEndNameTso", new GetterSetter(this::fromEndNameTsoToString, null, this::setFromEndNameTso));
        map.put("toEndIsoCode", new GetterSetter(this::toEndIsoCodeToString, null, this::setToEndIsoCode));
        map.put("toEndName", new GetterSetter(this::toEndNameToString, null, this::setToEndName));
        map.put("toEndNameTso", new GetterSetter(this::toEndNameTsoToString, null, this::setToEndNameTso));
        return map;
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
