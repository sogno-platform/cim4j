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
 * An AC electrical connection point to a piece of conducting equipment. Terminals are connected at physical connection points called connectivity nodes.
 */
@SuppressWarnings("unused")
public class Terminal extends ACDCTerminal {

    private static final Logging LOG = Logging.getLogger(Terminal.class);

    /**
     * Default constructor.
     */
    public Terminal() {
        setCimType("Terminal");
    }

    /**
     * The conducting equipment of the terminal.  Conducting equipment have  terminals that may be connected to other conducting equipment terminals via connectivity nodes or topological nodes.
     */
    private ConductingEquipment ConductingEquipment; // ManyToOne

    public ConductingEquipment getConductingEquipment() {
        return ConductingEquipment;
    }

    public void setConductingEquipment(BaseClass _object_) {
        if (!(_object_ instanceof ConductingEquipment)) {
            throw new IllegalArgumentException("Object is not ConductingEquipment");
        }
        if (ConductingEquipment != _object_) {
            ConductingEquipment = (ConductingEquipment) _object_;
            ConductingEquipment.setTerminals(this);
        }
    }

    public String ConductingEquipmentToString() {
        return ConductingEquipment != null ? ConductingEquipment.getRdfid() : null;
    }

    /**
     * Terminals interconnected with zero impedance at a this connectivity node.
     */
    private ConnectivityNode ConnectivityNode; // ManyToOne

    public ConnectivityNode getConnectivityNode() {
        return ConnectivityNode;
    }

    public void setConnectivityNode(BaseClass _object_) {
        if (!(_object_ instanceof ConnectivityNode)) {
            throw new IllegalArgumentException("Object is not ConnectivityNode");
        }
        if (ConnectivityNode != _object_) {
            ConnectivityNode = (ConnectivityNode) _object_;
            ConnectivityNode.setTerminals(this);
        }
    }

    public String ConnectivityNodeToString() {
        return ConnectivityNode != null ? ConnectivityNode.getRdfid() : null;
    }

    /**
     * Point of common coupling terminal for this converter DC side. It is typically the terminal on the power transformer (or switch) closest to the AC network. The power flow measurement must be the sum of all flows into the transformer.
     *
     * NOT USED
     */
    private Set<ACDCConverter> ConverterDCSides = new HashSet<>(); // OneToMany

    public Set<ACDCConverter> getConverterDCSides() {
        return ConverterDCSides;
    }

    public void setConverterDCSides(BaseClass _object_) {
        if (!(_object_ instanceof ACDCConverter)) {
            throw new IllegalArgumentException("Object is not ACDCConverter");
        }
        if (!ConverterDCSides.contains(_object_)) {
            ConverterDCSides.add((ACDCConverter) _object_);
            ((ACDCConverter) _object_).setPccTerminal(this);
        }
    }

    public String ConverterDCSidesToString() {
        return getStringFromSet(ConverterDCSides);
    }

    /**
     * Mutual couplings associated with the branch as the first branch.
     *
     * NOT USED
     */
    private Set<MutualCoupling> HasFirstMutualCoupling = new HashSet<>(); // OneToMany

    public Set<MutualCoupling> getHasFirstMutualCoupling() {
        return HasFirstMutualCoupling;
    }

    public void setHasFirstMutualCoupling(BaseClass _object_) {
        if (!(_object_ instanceof MutualCoupling)) {
            throw new IllegalArgumentException("Object is not MutualCoupling");
        }
        if (!HasFirstMutualCoupling.contains(_object_)) {
            HasFirstMutualCoupling.add((MutualCoupling) _object_);
            ((MutualCoupling) _object_).setFirst_Terminal(this);
        }
    }

    public String HasFirstMutualCouplingToString() {
        return getStringFromSet(HasFirstMutualCoupling);
    }

    /**
     * Mutual couplings with the branch associated as the first branch.
     *
     * NOT USED
     */
    private Set<MutualCoupling> HasSecondMutualCoupling = new HashSet<>(); // OneToMany

    public Set<MutualCoupling> getHasSecondMutualCoupling() {
        return HasSecondMutualCoupling;
    }

    public void setHasSecondMutualCoupling(BaseClass _object_) {
        if (!(_object_ instanceof MutualCoupling)) {
            throw new IllegalArgumentException("Object is not MutualCoupling");
        }
        if (!HasSecondMutualCoupling.contains(_object_)) {
            HasSecondMutualCoupling.add((MutualCoupling) _object_);
            ((MutualCoupling) _object_).setSecond_Terminal(this);
        }
    }

    public String HasSecondMutualCouplingToString() {
        return getStringFromSet(HasSecondMutualCoupling);
    }

    /**
     * The terminal associated with this regulating control.  The terminal is associated instead of a node, since the terminal could connect into either a topological node (bus in bus-branch model) or a connectivity node (detailed switch model).  Sometimes it is useful to model regulation at a terminal of a bus bar object since the bus bar can be present in both a bus-branch model or a model with switch detail.
     *
     * NOT USED
     */
    private RegulatingControl RegulatingControl; // OneToOne

    public RegulatingControl getRegulatingControl() {
        return RegulatingControl;
    }

    public void setRegulatingControl(BaseClass _object_) {
        if (!(_object_ instanceof RegulatingControl)) {
            throw new IllegalArgumentException("Object is not RegulatingControl");
        }
        if (RegulatingControl != _object_) {
            RegulatingControl = (RegulatingControl) _object_;
            RegulatingControl.setTerminal(this);
        }
    }

    public String RegulatingControlToString() {
        return RegulatingControl != null ? RegulatingControl.getRdfid() : null;
    }

    /**
     * Input signal coming from this terminal.
     *
     * NOT USED
     */
    private Set<RemoteInputSignal> RemoteInputSignal = new HashSet<>(); // OneToMany

    public Set<RemoteInputSignal> getRemoteInputSignal() {
        return RemoteInputSignal;
    }

    public void setRemoteInputSignal(BaseClass _object_) {
        if (!(_object_ instanceof RemoteInputSignal)) {
            throw new IllegalArgumentException("Object is not RemoteInputSignal");
        }
        if (!RemoteInputSignal.contains(_object_)) {
            RemoteInputSignal.add((RemoteInputSignal) _object_);
            ((RemoteInputSignal) _object_).setTerminal(this);
        }
    }

    public String RemoteInputSignalToString() {
        return getStringFromSet(RemoteInputSignal);
    }

    /**
     * The power flow state variable associated with the terminal.
     *
     * NOT USED
     */
    private SvPowerFlow SvPowerFlow; // OneToOne

    public SvPowerFlow getSvPowerFlow() {
        return SvPowerFlow;
    }

    public void setSvPowerFlow(BaseClass _object_) {
        if (!(_object_ instanceof SvPowerFlow)) {
            throw new IllegalArgumentException("Object is not SvPowerFlow");
        }
        if (SvPowerFlow != _object_) {
            SvPowerFlow = (SvPowerFlow) _object_;
            SvPowerFlow.setTerminal(this);
        }
    }

    public String SvPowerFlowToString() {
        return SvPowerFlow != null ? SvPowerFlow.getRdfid() : null;
    }

    /**
     * The control area tie flows to which this terminal associates.
     *
     * NOT USED
     */
    private Set<TieFlow> TieFlow = new HashSet<>(); // OneToMany

    public Set<TieFlow> getTieFlow() {
        return TieFlow;
    }

    public void setTieFlow(BaseClass _object_) {
        if (!(_object_ instanceof TieFlow)) {
            throw new IllegalArgumentException("Object is not TieFlow");
        }
        if (!TieFlow.contains(_object_)) {
            TieFlow.add((TieFlow) _object_);
            ((TieFlow) _object_).setTerminal(this);
        }
    }

    public String TieFlowToString() {
        return getStringFromSet(TieFlow);
    }

    /**
     * The terminals associated with the topological node.   This can be used as an alternative to the connectivity node path to terminal, thus making it unneccesary to model connectivity nodes in some cases.   Note that if connectivity nodes are in the model, this association would probably not be used as an input specification.
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
            TopologicalNode.setTerminal(this);
        }
    }

    public String TopologicalNodeToString() {
        return TopologicalNode != null ? TopologicalNode.getRdfid() : null;
    }

    /**
     * All transformer ends connected at this terminal.
     *
     * NOT USED
     */
    private Set<TransformerEnd> TransformerEnd = new HashSet<>(); // OneToMany

    public Set<TransformerEnd> getTransformerEnd() {
        return TransformerEnd;
    }

    public void setTransformerEnd(BaseClass _object_) {
        if (!(_object_ instanceof TransformerEnd)) {
            throw new IllegalArgumentException("Object is not TransformerEnd");
        }
        if (!TransformerEnd.contains(_object_)) {
            TransformerEnd.add((TransformerEnd) _object_);
            ((TransformerEnd) _object_).setTerminal(this);
        }
    }

    public String TransformerEndToString() {
        return getStringFromSet(TransformerEnd);
    }

    /**
     * Represents the normal network phasing condition. If the attribute is missing three phases (ABC or ABCN) shall be assumed.
     */
    private String phases; // PhaseCode

    public String getPhases() {
        return phases;
    }

    public void setPhases(String _value_) {
        phases = _value_;
    }

    public String phasesToString() {
        return phases;
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
        return getAttribute("Terminal", attrName);
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
        setAttribute("Terminal", attrName, objectValue);
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
        setAttribute("Terminal", attrName, stringValue);
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
            profiles.add(CGMESProfile.EQ_BD);
            profiles.add(CGMESProfile.EQ);
            map.put("ConductingEquipment", new AttrDetails("Terminal.ConductingEquipment", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ConnectivityNode", new AttrDetails("Terminal.ConnectivityNode", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ConverterDCSides", new AttrDetails("Terminal.ConverterDCSides", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("HasFirstMutualCoupling", new AttrDetails("Terminal.HasFirstMutualCoupling", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("HasSecondMutualCoupling", new AttrDetails("Terminal.HasSecondMutualCoupling", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("RegulatingControl", new AttrDetails("Terminal.RegulatingControl", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("RemoteInputSignal", new AttrDetails("Terminal.RemoteInputSignal", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("SvPowerFlow", new AttrDetails("Terminal.SvPowerFlow", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("TieFlow", new AttrDetails("Terminal.TieFlow", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP);
            map.put("TopologicalNode", new AttrDetails("Terminal.TopologicalNode", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("TransformerEnd", new AttrDetails("Terminal.TransformerEnd", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("phases", new AttrDetails("Terminal.phases", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new Terminal().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("ConductingEquipment", new GetterSetter(this::ConductingEquipmentToString, this::setConductingEquipment, null));
        map.put("ConnectivityNode", new GetterSetter(this::ConnectivityNodeToString, this::setConnectivityNode, null));
        map.put("ConverterDCSides", new GetterSetter(this::ConverterDCSidesToString, this::setConverterDCSides, null));
        map.put("HasFirstMutualCoupling", new GetterSetter(this::HasFirstMutualCouplingToString, this::setHasFirstMutualCoupling, null));
        map.put("HasSecondMutualCoupling", new GetterSetter(this::HasSecondMutualCouplingToString, this::setHasSecondMutualCoupling, null));
        map.put("RegulatingControl", new GetterSetter(this::RegulatingControlToString, this::setRegulatingControl, null));
        map.put("RemoteInputSignal", new GetterSetter(this::RemoteInputSignalToString, this::setRemoteInputSignal, null));
        map.put("SvPowerFlow", new GetterSetter(this::SvPowerFlowToString, this::setSvPowerFlow, null));
        map.put("TieFlow", new GetterSetter(this::TieFlowToString, this::setTieFlow, null));
        map.put("TopologicalNode", new GetterSetter(this::TopologicalNodeToString, this::setTopologicalNode, null));
        map.put("TransformerEnd", new GetterSetter(this::TransformerEndToString, this::setTransformerEnd, null));
        map.put("phases", new GetterSetter(this::phasesToString, null, this::setPhases));
        return map;
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.DY);
        profiles.add(CGMESProfile.EQ_BD);
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.SV);
        profiles.add(CGMESProfile.SSH);
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
