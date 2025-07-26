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
     * The auxiliary equipment connected to the terminal.
     *
     * NOT USED
     */
    private Set<AuxiliaryEquipment> AuxiliaryEquipment = new HashSet<>(); // OneToMany

    private Set<String> AuxiliaryEquipmentIdSet = new HashSet<>();

    public Set<AuxiliaryEquipment> getAuxiliaryEquipment() {
        return AuxiliaryEquipment;
    }

    public void setAuxiliaryEquipment(AuxiliaryEquipment _object_) {
        if (!AuxiliaryEquipment.contains(_object_)) {
            AuxiliaryEquipment.add(_object_);
            _object_.setTerminal(this);
            AuxiliaryEquipmentIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getAuxiliaryEquipment(BaseClass _this_) {
        var objs = ((Terminal) _this_).getAuxiliaryEquipment();
        var ids = ((Terminal) _this_).AuxiliaryEquipmentIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setAuxiliaryEquipment(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Terminal) _this_).AuxiliaryEquipmentIdSet.add((String) _value_);
        } else if (_value_ instanceof AuxiliaryEquipment) {
            ((Terminal) _this_).setAuxiliaryEquipment((AuxiliaryEquipment) _value_);
        } else {
            throw new IllegalArgumentException("Object is not AuxiliaryEquipment");
        }
    }

    /**
     * The conducting equipment of the terminal.  Conducting equipment have  terminals that may be connected to other conducting equipment terminals via connectivity nodes or topological nodes.
     */
    private ConductingEquipment ConductingEquipment; // ManyToOne

    private String ConductingEquipmentId;

    public ConductingEquipment getConductingEquipment() {
        return ConductingEquipment;
    }

    public void setConductingEquipment(ConductingEquipment _object_) {
        if (ConductingEquipment != _object_) {
            ConductingEquipment = _object_;
            _object_.setTerminals(this);
            ConductingEquipmentId = _object_.getRdfid();
        }
    }

    private static Object getConductingEquipment(BaseClass _this_) {
        var obj = ((Terminal) _this_).getConductingEquipment();
        var id = ((Terminal) _this_).ConductingEquipmentId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setConductingEquipment(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Terminal) _this_).ConductingEquipmentId = (String) _value_;
        } else if (_value_ instanceof ConductingEquipment) {
            ((Terminal) _this_).setConductingEquipment((ConductingEquipment) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ConductingEquipment");
        }
    }

    /**
     * The connectivity node to which this terminal connects with zero impedance.
     */
    private ConnectivityNode ConnectivityNode; // ManyToOne

    private String ConnectivityNodeId;

    public ConnectivityNode getConnectivityNode() {
        return ConnectivityNode;
    }

    public void setConnectivityNode(ConnectivityNode _object_) {
        if (ConnectivityNode != _object_) {
            ConnectivityNode = _object_;
            _object_.setTerminals(this);
            ConnectivityNodeId = _object_.getRdfid();
        }
    }

    private static Object getConnectivityNode(BaseClass _this_) {
        var obj = ((Terminal) _this_).getConnectivityNode();
        var id = ((Terminal) _this_).ConnectivityNodeId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setConnectivityNode(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Terminal) _this_).ConnectivityNodeId = (String) _value_;
        } else if (_value_ instanceof ConnectivityNode) {
            ((Terminal) _this_).setConnectivityNode((ConnectivityNode) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ConnectivityNode");
        }
    }

    /**
     * All converters` DC sides linked to this point of common coupling terminal.
     *
     * NOT USED
     */
    private Set<ACDCConverter> ConverterDCSides = new HashSet<>(); // OneToMany

    private Set<String> ConverterDCSidesIdSet = new HashSet<>();

    public Set<ACDCConverter> getConverterDCSides() {
        return ConverterDCSides;
    }

    public void setConverterDCSides(ACDCConverter _object_) {
        if (!ConverterDCSides.contains(_object_)) {
            ConverterDCSides.add(_object_);
            _object_.setPccTerminal(this);
            ConverterDCSidesIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getConverterDCSides(BaseClass _this_) {
        var objs = ((Terminal) _this_).getConverterDCSides();
        var ids = ((Terminal) _this_).ConverterDCSidesIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setConverterDCSides(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Terminal) _this_).ConverterDCSidesIdSet.add((String) _value_);
        } else if (_value_ instanceof ACDCConverter) {
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

    private Set<String> HasFirstMutualCouplingIdSet = new HashSet<>();

    public Set<MutualCoupling> getHasFirstMutualCoupling() {
        return HasFirstMutualCoupling;
    }

    public void setHasFirstMutualCoupling(MutualCoupling _object_) {
        if (!HasFirstMutualCoupling.contains(_object_)) {
            HasFirstMutualCoupling.add(_object_);
            _object_.setFirst_Terminal(this);
            HasFirstMutualCouplingIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getHasFirstMutualCoupling(BaseClass _this_) {
        var objs = ((Terminal) _this_).getHasFirstMutualCoupling();
        var ids = ((Terminal) _this_).HasFirstMutualCouplingIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setHasFirstMutualCoupling(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Terminal) _this_).HasFirstMutualCouplingIdSet.add((String) _value_);
        } else if (_value_ instanceof MutualCoupling) {
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

    private Set<String> HasSecondMutualCouplingIdSet = new HashSet<>();

    public Set<MutualCoupling> getHasSecondMutualCoupling() {
        return HasSecondMutualCoupling;
    }

    public void setHasSecondMutualCoupling(MutualCoupling _object_) {
        if (!HasSecondMutualCoupling.contains(_object_)) {
            HasSecondMutualCoupling.add(_object_);
            _object_.setSecond_Terminal(this);
            HasSecondMutualCouplingIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getHasSecondMutualCoupling(BaseClass _this_) {
        var objs = ((Terminal) _this_).getHasSecondMutualCoupling();
        var ids = ((Terminal) _this_).HasSecondMutualCouplingIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setHasSecondMutualCoupling(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Terminal) _this_).HasSecondMutualCouplingIdSet.add((String) _value_);
        } else if (_value_ instanceof MutualCoupling) {
            ((Terminal) _this_).setHasSecondMutualCoupling((MutualCoupling) _value_);
        } else {
            throw new IllegalArgumentException("Object is not MutualCoupling");
        }
    }

    /**
     * The controls regulating this terminal.
     *
     * NOT USED
     */
    private Set<RegulatingControl> RegulatingControl = new HashSet<>(); // OneToMany

    private Set<String> RegulatingControlIdSet = new HashSet<>();

    public Set<RegulatingControl> getRegulatingControl() {
        return RegulatingControl;
    }

    public void setRegulatingControl(RegulatingControl _object_) {
        if (!RegulatingControl.contains(_object_)) {
            RegulatingControl.add(_object_);
            _object_.setTerminal(this);
            RegulatingControlIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getRegulatingControl(BaseClass _this_) {
        var objs = ((Terminal) _this_).getRegulatingControl();
        var ids = ((Terminal) _this_).RegulatingControlIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setRegulatingControl(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Terminal) _this_).RegulatingControlIdSet.add((String) _value_);
        } else if (_value_ instanceof RegulatingControl) {
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

    private Set<String> RemoteInputSignalIdSet = new HashSet<>();

    public Set<RemoteInputSignal> getRemoteInputSignal() {
        return RemoteInputSignal;
    }

    public void setRemoteInputSignal(RemoteInputSignal _object_) {
        if (!RemoteInputSignal.contains(_object_)) {
            RemoteInputSignal.add(_object_);
            _object_.setTerminal(this);
            RemoteInputSignalIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getRemoteInputSignal(BaseClass _this_) {
        var objs = ((Terminal) _this_).getRemoteInputSignal();
        var ids = ((Terminal) _this_).RemoteInputSignalIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setRemoteInputSignal(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Terminal) _this_).RemoteInputSignalIdSet.add((String) _value_);
        } else if (_value_ instanceof RemoteInputSignal) {
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

    private String SvPowerFlowId;

    public SvPowerFlow getSvPowerFlow() {
        return SvPowerFlow;
    }

    public void setSvPowerFlow(SvPowerFlow _object_) {
        if (SvPowerFlow != _object_) {
            SvPowerFlow = _object_;
            _object_.setTerminal(this);
            SvPowerFlowId = _object_.getRdfid();
        }
    }

    private static Object getSvPowerFlow(BaseClass _this_) {
        var obj = ((Terminal) _this_).getSvPowerFlow();
        var id = ((Terminal) _this_).SvPowerFlowId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setSvPowerFlow(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Terminal) _this_).SvPowerFlowId = (String) _value_;
        } else if (_value_ instanceof SvPowerFlow) {
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

    private Set<String> TieFlowIdSet = new HashSet<>();

    public Set<TieFlow> getTieFlow() {
        return TieFlow;
    }

    public void setTieFlow(TieFlow _object_) {
        if (!TieFlow.contains(_object_)) {
            TieFlow.add(_object_);
            _object_.setTerminal(this);
            TieFlowIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getTieFlow(BaseClass _this_) {
        var objs = ((Terminal) _this_).getTieFlow();
        var ids = ((Terminal) _this_).TieFlowIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setTieFlow(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Terminal) _this_).TieFlowIdSet.add((String) _value_);
        } else if (_value_ instanceof TieFlow) {
            ((Terminal) _this_).setTieFlow((TieFlow) _value_);
        } else {
            throw new IllegalArgumentException("Object is not TieFlow");
        }
    }

    /**
     * The topological node associated with the terminal.   This can be used as an alternative to the connectivity node path to topological node, thus making it unnecessary to model connectivity nodes in some cases.   Note that the if connectivity nodes are in the model, this association would probably not be used as an input specification.
     */
    private TopologicalNode TopologicalNode; // ManyToOne

    private String TopologicalNodeId;

    public TopologicalNode getTopologicalNode() {
        return TopologicalNode;
    }

    public void setTopologicalNode(TopologicalNode _object_) {
        if (TopologicalNode != _object_) {
            TopologicalNode = _object_;
            _object_.setTerminal(this);
            TopologicalNodeId = _object_.getRdfid();
        }
    }

    private static Object getTopologicalNode(BaseClass _this_) {
        var obj = ((Terminal) _this_).getTopologicalNode();
        var id = ((Terminal) _this_).TopologicalNodeId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setTopologicalNode(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Terminal) _this_).TopologicalNodeId = (String) _value_;
        } else if (_value_ instanceof TopologicalNode) {
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

    private Set<String> TransformerEndIdSet = new HashSet<>();

    public Set<TransformerEnd> getTransformerEnd() {
        return TransformerEnd;
    }

    public void setTransformerEnd(TransformerEnd _object_) {
        if (!TransformerEnd.contains(_object_)) {
            TransformerEnd.add(_object_);
            _object_.setTerminal(this);
            TransformerEndIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getTransformerEnd(BaseClass _this_) {
        var objs = ((Terminal) _this_).getTransformerEnd();
        var ids = ((Terminal) _this_).TransformerEndIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setTransformerEnd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Terminal) _this_).TransformerEndIdSet.add((String) _value_);
        } else if (_value_ instanceof TransformerEnd) {
            ((Terminal) _this_).setTransformerEnd((TransformerEnd) _value_);
        } else {
            throw new IllegalArgumentException("Object is not TransformerEnd");
        }
    }

    /**
     * Represents the normal network phasing condition. If the attribute is missing, three phases (ABC) shall be assumed, except for terminals of grounding classes (specializations of EarthFaultCompensator, GroundDisconnector, and Ground) which will be assumed to be N. Therefore, phase code ABCN is explicitly declared when needed, e.g. for star point grounding equipment. The phase code on terminals connecting same ConnectivityNode or same TopologicalNode as well as for equipment between two terminals shall be consistent.
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

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/CIM100#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("AuxiliaryEquipment", new AttrDetails("Terminal.AuxiliaryEquipment", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, Terminal::getAuxiliaryEquipment, Terminal::setAuxiliaryEquipment));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("ConductingEquipment", new AttrDetails("Terminal.ConductingEquipment", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, Terminal::getConductingEquipment, Terminal::setConductingEquipment));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("ConnectivityNode", new AttrDetails("Terminal.ConnectivityNode", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, Terminal::getConnectivityNode, Terminal::setConnectivityNode));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ConverterDCSides", new AttrDetails("Terminal.ConverterDCSides", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, Terminal::getConverterDCSides, Terminal::setConverterDCSides));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("HasFirstMutualCoupling", new AttrDetails("Terminal.HasFirstMutualCoupling", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, Terminal::getHasFirstMutualCoupling, Terminal::setHasFirstMutualCoupling));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("HasSecondMutualCoupling", new AttrDetails("Terminal.HasSecondMutualCoupling", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, Terminal::getHasSecondMutualCoupling, Terminal::setHasSecondMutualCoupling));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("RegulatingControl", new AttrDetails("Terminal.RegulatingControl", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, Terminal::getRegulatingControl, Terminal::setRegulatingControl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("RemoteInputSignal", new AttrDetails("Terminal.RemoteInputSignal", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, Terminal::getRemoteInputSignal, Terminal::setRemoteInputSignal));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("SvPowerFlow", new AttrDetails("Terminal.SvPowerFlow", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, Terminal::getSvPowerFlow, Terminal::setSvPowerFlow));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("TieFlow", new AttrDetails("Terminal.TieFlow", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, Terminal::getTieFlow, Terminal::setTieFlow));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP);
            map.put("TopologicalNode", new AttrDetails("Terminal.TopologicalNode", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, Terminal::getTopologicalNode, Terminal::setTopologicalNode));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("TransformerEnd", new AttrDetails("Terminal.TransformerEnd", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, Terminal::getTransformerEnd, Terminal::setTransformerEnd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("phases", new AttrDetails("Terminal.phases", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, Terminal::getPhases, Terminal::setPhases));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new Terminal(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.DY);
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.EQBD);
        profiles.add(CGMESProfile.OP);
        profiles.add(CGMESProfile.SC);
        profiles.add(CGMESProfile.SSH);
        profiles.add(CGMESProfile.SV);
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
