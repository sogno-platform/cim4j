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
     * Constructor.
     */
    public Terminal(String rdfid) {
        super("Terminal", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected Terminal(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The conducting equipment of the terminal.  Conducting equipment have  terminals that may be connected to other conducting equipment terminals via connectivity nodes or topological nodes.
     */
    private ConductingEquipment ConductingEquipment; // ManyToOne

    public ConductingEquipment getConductingEquipment() {
        return ConductingEquipment;
    }

    public void setConductingEquipment(ConductingEquipment _object_) {
        if (ConductingEquipment != _object_) {
            ConductingEquipment = _object_;
            ConductingEquipment.setTerminals(this);
        }
    }

    private static Object getConductingEquipment(BaseClass _this_) {
        return ((Terminal) _this_).getConductingEquipment();
    }

    private static void setConductingEquipment(BaseClass _this_, Object _value_) {
        if (_value_ instanceof ConductingEquipment) {
            ((Terminal) _this_).setConductingEquipment((ConductingEquipment) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ConductingEquipment");
        }
    }

    /**
     * Terminals interconnected with zero impedance at a this connectivity node.
     */
    private ConnectivityNode ConnectivityNode; // ManyToOne

    public ConnectivityNode getConnectivityNode() {
        return ConnectivityNode;
    }

    public void setConnectivityNode(ConnectivityNode _object_) {
        if (ConnectivityNode != _object_) {
            ConnectivityNode = _object_;
            ConnectivityNode.setTerminals(this);
        }
    }

    private static Object getConnectivityNode(BaseClass _this_) {
        return ((Terminal) _this_).getConnectivityNode();
    }

    private static void setConnectivityNode(BaseClass _this_, Object _value_) {
        if (_value_ instanceof ConnectivityNode) {
            ((Terminal) _this_).setConnectivityNode((ConnectivityNode) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ConnectivityNode");
        }
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

    public void setConverterDCSides(ACDCConverter _object_) {
        if (!ConverterDCSides.contains(_object_)) {
            ConverterDCSides.add(_object_);
            _object_.setPccTerminal(this);
        }
    }

    private static Object getConverterDCSides(BaseClass _this_) {
        return ((Terminal) _this_).getConverterDCSides();
    }

    private static void setConverterDCSides(BaseClass _this_, Object _value_) {
        if (_value_ instanceof ACDCConverter) {
            ((Terminal) _this_).setConverterDCSides((ACDCConverter) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ACDCConverter");
        }
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

    public void setHasFirstMutualCoupling(MutualCoupling _object_) {
        if (!HasFirstMutualCoupling.contains(_object_)) {
            HasFirstMutualCoupling.add(_object_);
            _object_.setFirst_Terminal(this);
        }
    }

    private static Object getHasFirstMutualCoupling(BaseClass _this_) {
        return ((Terminal) _this_).getHasFirstMutualCoupling();
    }

    private static void setHasFirstMutualCoupling(BaseClass _this_, Object _value_) {
        if (_value_ instanceof MutualCoupling) {
            ((Terminal) _this_).setHasFirstMutualCoupling((MutualCoupling) _value_);
        } else {
            throw new IllegalArgumentException("Object is not MutualCoupling");
        }
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

    public void setHasSecondMutualCoupling(MutualCoupling _object_) {
        if (!HasSecondMutualCoupling.contains(_object_)) {
            HasSecondMutualCoupling.add(_object_);
            _object_.setSecond_Terminal(this);
        }
    }

    private static Object getHasSecondMutualCoupling(BaseClass _this_) {
        return ((Terminal) _this_).getHasSecondMutualCoupling();
    }

    private static void setHasSecondMutualCoupling(BaseClass _this_, Object _value_) {
        if (_value_ instanceof MutualCoupling) {
            ((Terminal) _this_).setHasSecondMutualCoupling((MutualCoupling) _value_);
        } else {
            throw new IllegalArgumentException("Object is not MutualCoupling");
        }
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

    public void setRegulatingControl(RegulatingControl _object_) {
        if (RegulatingControl != _object_) {
            RegulatingControl = _object_;
            RegulatingControl.setTerminal(this);
        }
    }

    private static Object getRegulatingControl(BaseClass _this_) {
        return ((Terminal) _this_).getRegulatingControl();
    }

    private static void setRegulatingControl(BaseClass _this_, Object _value_) {
        if (_value_ instanceof RegulatingControl) {
            ((Terminal) _this_).setRegulatingControl((RegulatingControl) _value_);
        } else {
            throw new IllegalArgumentException("Object is not RegulatingControl");
        }
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

    public void setRemoteInputSignal(RemoteInputSignal _object_) {
        if (!RemoteInputSignal.contains(_object_)) {
            RemoteInputSignal.add(_object_);
            _object_.setTerminal(this);
        }
    }

    private static Object getRemoteInputSignal(BaseClass _this_) {
        return ((Terminal) _this_).getRemoteInputSignal();
    }

    private static void setRemoteInputSignal(BaseClass _this_, Object _value_) {
        if (_value_ instanceof RemoteInputSignal) {
            ((Terminal) _this_).setRemoteInputSignal((RemoteInputSignal) _value_);
        } else {
            throw new IllegalArgumentException("Object is not RemoteInputSignal");
        }
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

    public void setSvPowerFlow(SvPowerFlow _object_) {
        if (SvPowerFlow != _object_) {
            SvPowerFlow = _object_;
            SvPowerFlow.setTerminal(this);
        }
    }

    private static Object getSvPowerFlow(BaseClass _this_) {
        return ((Terminal) _this_).getSvPowerFlow();
    }

    private static void setSvPowerFlow(BaseClass _this_, Object _value_) {
        if (_value_ instanceof SvPowerFlow) {
            ((Terminal) _this_).setSvPowerFlow((SvPowerFlow) _value_);
        } else {
            throw new IllegalArgumentException("Object is not SvPowerFlow");
        }
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

    public void setTieFlow(TieFlow _object_) {
        if (!TieFlow.contains(_object_)) {
            TieFlow.add(_object_);
            _object_.setTerminal(this);
        }
    }

    private static Object getTieFlow(BaseClass _this_) {
        return ((Terminal) _this_).getTieFlow();
    }

    private static void setTieFlow(BaseClass _this_, Object _value_) {
        if (_value_ instanceof TieFlow) {
            ((Terminal) _this_).setTieFlow((TieFlow) _value_);
        } else {
            throw new IllegalArgumentException("Object is not TieFlow");
        }
    }

    /**
     * The terminals associated with the topological node.   This can be used as an alternative to the connectivity node path to terminal, thus making it unneccesary to model connectivity nodes in some cases.   Note that if connectivity nodes are in the model, this association would probably not be used as an input specification.
     */
    private TopologicalNode TopologicalNode; // ManyToOne

    public TopologicalNode getTopologicalNode() {
        return TopologicalNode;
    }

    public void setTopologicalNode(TopologicalNode _object_) {
        if (TopologicalNode != _object_) {
            TopologicalNode = _object_;
            TopologicalNode.setTerminal(this);
        }
    }

    private static Object getTopologicalNode(BaseClass _this_) {
        return ((Terminal) _this_).getTopologicalNode();
    }

    private static void setTopologicalNode(BaseClass _this_, Object _value_) {
        if (_value_ instanceof TopologicalNode) {
            ((Terminal) _this_).setTopologicalNode((TopologicalNode) _value_);
        } else {
            throw new IllegalArgumentException("Object is not TopologicalNode");
        }
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

    public void setTransformerEnd(TransformerEnd _object_) {
        if (!TransformerEnd.contains(_object_)) {
            TransformerEnd.add(_object_);
            _object_.setTerminal(this);
        }
    }

    private static Object getTransformerEnd(BaseClass _this_) {
        return ((Terminal) _this_).getTransformerEnd();
    }

    private static void setTransformerEnd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof TransformerEnd) {
            ((Terminal) _this_).setTransformerEnd((TransformerEnd) _value_);
        } else {
            throw new IllegalArgumentException("Object is not TransformerEnd");
        }
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

    private static Object getPhases(BaseClass _this_) {
        return ((Terminal) _this_).getPhases();
    }

    private static void setPhases(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Terminal) _this_).setPhases((String) _value_);
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "Terminal", attrName));
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
                "Terminal", attrName, value));
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
            map.put("ConductingEquipment", new AttrDetails("Terminal.ConductingEquipment", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, Terminal::getConductingEquipment, Terminal::setConductingEquipment));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ConnectivityNode", new AttrDetails("Terminal.ConnectivityNode", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, Terminal::getConnectivityNode, Terminal::setConnectivityNode));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ConverterDCSides", new AttrDetails("Terminal.ConverterDCSides", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, Terminal::getConverterDCSides, Terminal::setConverterDCSides));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("HasFirstMutualCoupling", new AttrDetails("Terminal.HasFirstMutualCoupling", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, Terminal::getHasFirstMutualCoupling, Terminal::setHasFirstMutualCoupling));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("HasSecondMutualCoupling", new AttrDetails("Terminal.HasSecondMutualCoupling", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, Terminal::getHasSecondMutualCoupling, Terminal::setHasSecondMutualCoupling));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("RegulatingControl", new AttrDetails("Terminal.RegulatingControl", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, Terminal::getRegulatingControl, Terminal::setRegulatingControl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("RemoteInputSignal", new AttrDetails("Terminal.RemoteInputSignal", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, Terminal::getRemoteInputSignal, Terminal::setRemoteInputSignal));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("SvPowerFlow", new AttrDetails("Terminal.SvPowerFlow", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, Terminal::getSvPowerFlow, Terminal::setSvPowerFlow));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("TieFlow", new AttrDetails("Terminal.TieFlow", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, Terminal::getTieFlow, Terminal::setTieFlow));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP);
            map.put("TopologicalNode", new AttrDetails("Terminal.TopologicalNode", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, Terminal::getTopologicalNode, Terminal::setTopologicalNode));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("TransformerEnd", new AttrDetails("Terminal.TransformerEnd", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, Terminal::getTransformerEnd, Terminal::setTransformerEnd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("phases", new AttrDetails("Terminal.phases", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, Terminal::getPhases, Terminal::setPhases));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new Terminal(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
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
