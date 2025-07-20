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
 * Synchronous machine whose behaviour is described by reference to a standard model expressed in one of the following forms: - simplified (or classical), where a group of generators or motors is not modelled in detail; - detailed, in equivalent circuit form; - detailed, in time constant reactance form; or <font color="#0f0f0f">- by definition of a user-defined model.</font> <font color="#0f0f0f">It is a common practice to represent small generators by a negative load rather than by a dynamic generator model when performing dynamics simulations. In this case, a SynchronousMachine in the static model is not represented by anything in the dynamics model, instead it is treated as an ordinary load.</font> <font color="#0f0f0f">Parameter details:</font> <ol> 	<li><font color="#0f0f0f">Synchronous machine parameters such as <i>Xl, Xd, Xp</i> etc. are actually used as inductances in the models,</font> but are commonly referred to as reactances since, at nominal frequency, the PU values are the same. However, some references use the symbol <i>L</i> instead of <i>X</i>.</li> </ol>
 */
@SuppressWarnings("unused")
public class SynchronousMachineDynamics extends RotatingMachineDynamics {

    private static final Logging LOG = Logging.getLogger(SynchronousMachineDynamics.class);

    /**
     * Constructor.
     */
    public SynchronousMachineDynamics(String rdfid) {
        super("SynchronousMachineDynamics", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected SynchronousMachineDynamics(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The cross-compound turbine governor with which this high-pressure synchronous machine is associated.
     *
     * NOT USED
     */
    private CrossCompoundTurbineGovernorDynamics CrossCompoundTurbineGovernorDyanmics; // OneToOne

    private String CrossCompoundTurbineGovernorDyanmicsId;

    public CrossCompoundTurbineGovernorDynamics getCrossCompoundTurbineGovernorDyanmics() {
        return CrossCompoundTurbineGovernorDyanmics;
    }

    public void setCrossCompoundTurbineGovernorDyanmics(CrossCompoundTurbineGovernorDynamics _object_) {
        if (CrossCompoundTurbineGovernorDyanmics != _object_) {
            CrossCompoundTurbineGovernorDyanmics = _object_;
            _object_.setHighPressureSynchronousMachineDynamics(this);
            CrossCompoundTurbineGovernorDyanmicsId = _object_.getRdfid();
        }
    }

    private static Object getCrossCompoundTurbineGovernorDyanmics(BaseClass _this_) {
        var obj = ((SynchronousMachineDynamics) _this_).getCrossCompoundTurbineGovernorDyanmics();
        var id = ((SynchronousMachineDynamics) _this_).CrossCompoundTurbineGovernorDyanmicsId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setCrossCompoundTurbineGovernorDyanmics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((SynchronousMachineDynamics) _this_).CrossCompoundTurbineGovernorDyanmicsId = (String) _value_;
        } else if (_value_ instanceof CrossCompoundTurbineGovernorDynamics) {
            ((SynchronousMachineDynamics) _this_).setCrossCompoundTurbineGovernorDyanmics((CrossCompoundTurbineGovernorDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not CrossCompoundTurbineGovernorDynamics");
        }
    }

    /**
     * The cross-compound turbine governor with which this low-pressure synchronous machine is associated.
     *
     * NOT USED
     */
    private CrossCompoundTurbineGovernorDynamics CrossCompoundTurbineGovernorDynamics; // OneToOne

    private String CrossCompoundTurbineGovernorDynamicsId;

    public CrossCompoundTurbineGovernorDynamics getCrossCompoundTurbineGovernorDynamics() {
        return CrossCompoundTurbineGovernorDynamics;
    }

    public void setCrossCompoundTurbineGovernorDynamics(CrossCompoundTurbineGovernorDynamics _object_) {
        if (CrossCompoundTurbineGovernorDynamics != _object_) {
            CrossCompoundTurbineGovernorDynamics = _object_;
            _object_.setLowPressureSynchronousMachineDynamics(this);
            CrossCompoundTurbineGovernorDynamicsId = _object_.getRdfid();
        }
    }

    private static Object getCrossCompoundTurbineGovernorDynamics(BaseClass _this_) {
        var obj = ((SynchronousMachineDynamics) _this_).getCrossCompoundTurbineGovernorDynamics();
        var id = ((SynchronousMachineDynamics) _this_).CrossCompoundTurbineGovernorDynamicsId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setCrossCompoundTurbineGovernorDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((SynchronousMachineDynamics) _this_).CrossCompoundTurbineGovernorDynamicsId = (String) _value_;
        } else if (_value_ instanceof CrossCompoundTurbineGovernorDynamics) {
            ((SynchronousMachineDynamics) _this_).setCrossCompoundTurbineGovernorDynamics((CrossCompoundTurbineGovernorDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not CrossCompoundTurbineGovernorDynamics");
        }
    }

    /**
     * Excitation system model associated with this synchronous machine model.
     *
     * NOT USED
     */
    private ExcitationSystemDynamics ExcitationSystemDynamics; // OneToOne

    private String ExcitationSystemDynamicsId;

    public ExcitationSystemDynamics getExcitationSystemDynamics() {
        return ExcitationSystemDynamics;
    }

    public void setExcitationSystemDynamics(ExcitationSystemDynamics _object_) {
        if (ExcitationSystemDynamics != _object_) {
            ExcitationSystemDynamics = _object_;
            _object_.setSynchronousMachineDynamics(this);
            ExcitationSystemDynamicsId = _object_.getRdfid();
        }
    }

    private static Object getExcitationSystemDynamics(BaseClass _this_) {
        var obj = ((SynchronousMachineDynamics) _this_).getExcitationSystemDynamics();
        var id = ((SynchronousMachineDynamics) _this_).ExcitationSystemDynamicsId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setExcitationSystemDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((SynchronousMachineDynamics) _this_).ExcitationSystemDynamicsId = (String) _value_;
        } else if (_value_ instanceof ExcitationSystemDynamics) {
            ((SynchronousMachineDynamics) _this_).setExcitationSystemDynamics((ExcitationSystemDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ExcitationSystemDynamics");
        }
    }

    /**
     * Compensation of voltage compensator`s generator for current flow out of this  generator.
     *
     * NOT USED
     */
    private Set<GenICompensationForGenJ> GenICompensationForGenJ = new HashSet<>(); // OneToMany

    private Set<String> GenICompensationForGenJIdSet = new HashSet<>();

    public Set<GenICompensationForGenJ> getGenICompensationForGenJ() {
        return GenICompensationForGenJ;
    }

    public void setGenICompensationForGenJ(GenICompensationForGenJ _object_) {
        if (!GenICompensationForGenJ.contains(_object_)) {
            GenICompensationForGenJ.add(_object_);
            _object_.setSynchronousMachineDynamics(this);
            GenICompensationForGenJIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getGenICompensationForGenJ(BaseClass _this_) {
        var objs = ((SynchronousMachineDynamics) _this_).getGenICompensationForGenJ();
        var ids = ((SynchronousMachineDynamics) _this_).GenICompensationForGenJIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setGenICompensationForGenJ(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((SynchronousMachineDynamics) _this_).GenICompensationForGenJIdSet.add((String) _value_);
        } else if (_value_ instanceof GenICompensationForGenJ) {
            ((SynchronousMachineDynamics) _this_).setGenICompensationForGenJ((GenICompensationForGenJ) _value_);
        } else {
            throw new IllegalArgumentException("Object is not GenICompensationForGenJ");
        }
    }

    /**
     * Mechanical load model associated with this synchronous machine model.
     *
     * NOT USED
     */
    private MechanicalLoadDynamics MechanicalLoadDynamics; // OneToOne

    private String MechanicalLoadDynamicsId;

    public MechanicalLoadDynamics getMechanicalLoadDynamics() {
        return MechanicalLoadDynamics;
    }

    public void setMechanicalLoadDynamics(MechanicalLoadDynamics _object_) {
        if (MechanicalLoadDynamics != _object_) {
            MechanicalLoadDynamics = _object_;
            _object_.setSynchronousMachineDynamics(this);
            MechanicalLoadDynamicsId = _object_.getRdfid();
        }
    }

    private static Object getMechanicalLoadDynamics(BaseClass _this_) {
        var obj = ((SynchronousMachineDynamics) _this_).getMechanicalLoadDynamics();
        var id = ((SynchronousMachineDynamics) _this_).MechanicalLoadDynamicsId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setMechanicalLoadDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((SynchronousMachineDynamics) _this_).MechanicalLoadDynamicsId = (String) _value_;
        } else if (_value_ instanceof MechanicalLoadDynamics) {
            ((SynchronousMachineDynamics) _this_).setMechanicalLoadDynamics((MechanicalLoadDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not MechanicalLoadDynamics");
        }
    }

    /**
     * Synchronous machine to which synchronous machine dynamics model applies.
     */
    private SynchronousMachine SynchronousMachine; // OneToOne

    private String SynchronousMachineId;

    public SynchronousMachine getSynchronousMachine() {
        return SynchronousMachine;
    }

    public void setSynchronousMachine(SynchronousMachine _object_) {
        if (SynchronousMachine != _object_) {
            SynchronousMachine = _object_;
            _object_.setSynchronousMachineDynamics(this);
            SynchronousMachineId = _object_.getRdfid();
        }
    }

    private static Object getSynchronousMachine(BaseClass _this_) {
        var obj = ((SynchronousMachineDynamics) _this_).getSynchronousMachine();
        var id = ((SynchronousMachineDynamics) _this_).SynchronousMachineId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setSynchronousMachine(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((SynchronousMachineDynamics) _this_).SynchronousMachineId = (String) _value_;
        } else if (_value_ instanceof SynchronousMachine) {
            ((SynchronousMachineDynamics) _this_).setSynchronousMachine((SynchronousMachine) _value_);
        } else {
            throw new IllegalArgumentException("Object is not SynchronousMachine");
        }
    }

    /**
     * Turbine-governor model associated with this synchronous machine model. Multiplicity of greater than one is intended to support hydro units that have multiple turbines on one generator.
     *
     * NOT USED
     */
    private Set<TurbineGovernorDynamics> TurbineGovernorDynamics = new HashSet<>(); // OneToMany

    private Set<String> TurbineGovernorDynamicsIdSet = new HashSet<>();

    public Set<TurbineGovernorDynamics> getTurbineGovernorDynamics() {
        return TurbineGovernorDynamics;
    }

    public void setTurbineGovernorDynamics(TurbineGovernorDynamics _object_) {
        if (!TurbineGovernorDynamics.contains(_object_)) {
            TurbineGovernorDynamics.add(_object_);
            _object_.setSynchronousMachineDynamics(this);
            TurbineGovernorDynamicsIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getTurbineGovernorDynamics(BaseClass _this_) {
        var objs = ((SynchronousMachineDynamics) _this_).getTurbineGovernorDynamics();
        var ids = ((SynchronousMachineDynamics) _this_).TurbineGovernorDynamicsIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setTurbineGovernorDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((SynchronousMachineDynamics) _this_).TurbineGovernorDynamicsIdSet.add((String) _value_);
        } else if (_value_ instanceof TurbineGovernorDynamics) {
            ((SynchronousMachineDynamics) _this_).setTurbineGovernorDynamics((TurbineGovernorDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not TurbineGovernorDynamics");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "SynchronousMachineDynamics", attrName));
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
                "SynchronousMachineDynamics", attrName, value));
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
            profiles.add(CGMESProfile.DY);
            map.put("CrossCompoundTurbineGovernorDyanmics", new AttrDetails("SynchronousMachineDynamics.CrossCompoundTurbineGovernorDyanmics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, SynchronousMachineDynamics::getCrossCompoundTurbineGovernorDyanmics, SynchronousMachineDynamics::setCrossCompoundTurbineGovernorDyanmics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("CrossCompoundTurbineGovernorDynamics", new AttrDetails("SynchronousMachineDynamics.CrossCompoundTurbineGovernorDynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, SynchronousMachineDynamics::getCrossCompoundTurbineGovernorDynamics, SynchronousMachineDynamics::setCrossCompoundTurbineGovernorDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ExcitationSystemDynamics", new AttrDetails("SynchronousMachineDynamics.ExcitationSystemDynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, SynchronousMachineDynamics::getExcitationSystemDynamics, SynchronousMachineDynamics::setExcitationSystemDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("GenICompensationForGenJ", new AttrDetails("SynchronousMachineDynamics.GenICompensationForGenJ", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, SynchronousMachineDynamics::getGenICompensationForGenJ, SynchronousMachineDynamics::setGenICompensationForGenJ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("MechanicalLoadDynamics", new AttrDetails("SynchronousMachineDynamics.MechanicalLoadDynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, SynchronousMachineDynamics::getMechanicalLoadDynamics, SynchronousMachineDynamics::setMechanicalLoadDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("SynchronousMachine", new AttrDetails("SynchronousMachineDynamics.SynchronousMachine", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, SynchronousMachineDynamics::getSynchronousMachine, SynchronousMachineDynamics::setSynchronousMachine));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("TurbineGovernorDynamics", new AttrDetails("SynchronousMachineDynamics.TurbineGovernorDynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, SynchronousMachineDynamics::getTurbineGovernorDynamics, SynchronousMachineDynamics::setTurbineGovernorDynamics));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new SynchronousMachineDynamics(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.DY);
        POSSIBLE_PROFILES = Collections.unmodifiableSet(profiles);
    }

    private static final CGMESProfile RECOMMENDED_PROFILE = CGMESProfile.DY;

    private static final Set<CGMESProfile> POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>(POSSIBLE_PROFILES);
        for (var attrDetails : ATTR_DETAILS_MAP.values()) {
            profiles.addAll(attrDetails.profiles);
        }
        POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES = Collections.unmodifiableSet(profiles);
    }
}
