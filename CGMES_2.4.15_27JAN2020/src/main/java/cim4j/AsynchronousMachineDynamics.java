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
 * Asynchronous machine whose behaviour is described by reference to a standard model expressed in either time constant reactance form or equivalent circuit form
 */
@SuppressWarnings("unused")
public class AsynchronousMachineDynamics extends RotatingMachineDynamics {

    private static final Logging LOG = Logging.getLogger(AsynchronousMachineDynamics.class);

    /**
     * Constructor.
     */
    public AsynchronousMachineDynamics(String rdfid) {
        super("AsynchronousMachineDynamics", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected AsynchronousMachineDynamics(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Asynchronous machine to which this asynchronous machine dynamics model applies.
     */
    private AsynchronousMachine AsynchronousMachine; // OneToOne

    public AsynchronousMachine getAsynchronousMachine() {
        return AsynchronousMachine;
    }

    public void setAsynchronousMachine(AsynchronousMachine _object_) {
        if (AsynchronousMachine != _object_) {
            AsynchronousMachine = _object_;
            AsynchronousMachine.setAsynchronousMachineDynamics(this);
        }
    }

    private static Object getAsynchronousMachine(BaseClass _this_) {
        return ((AsynchronousMachineDynamics) _this_).getAsynchronousMachine();
    }

    private static void setAsynchronousMachine(BaseClass _this_, Object _value_) {
        if (_value_ instanceof AsynchronousMachine) {
            ((AsynchronousMachineDynamics) _this_).setAsynchronousMachine((AsynchronousMachine) _value_);
        } else {
            throw new IllegalArgumentException("Object is not AsynchronousMachine");
        }
    }

    /**
     * Mechanical load model associated with this asynchronous machine model.
     *
     * NOT USED
     */
    private MechanicalLoadDynamics MechanicalLoadDynamics; // OneToOne

    public MechanicalLoadDynamics getMechanicalLoadDynamics() {
        return MechanicalLoadDynamics;
    }

    public void setMechanicalLoadDynamics(MechanicalLoadDynamics _object_) {
        if (MechanicalLoadDynamics != _object_) {
            MechanicalLoadDynamics = _object_;
            MechanicalLoadDynamics.setAsynchronousMachineDynamics(this);
        }
    }

    private static Object getMechanicalLoadDynamics(BaseClass _this_) {
        return ((AsynchronousMachineDynamics) _this_).getMechanicalLoadDynamics();
    }

    private static void setMechanicalLoadDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof MechanicalLoadDynamics) {
            ((AsynchronousMachineDynamics) _this_).setMechanicalLoadDynamics((MechanicalLoadDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not MechanicalLoadDynamics");
        }
    }

    /**
     * Turbine-governor model associated with this asynchronous machine model.
     *
     * NOT USED
     */
    private TurbineGovernorDynamics TurbineGovernorDynamics; // OneToOne

    public TurbineGovernorDynamics getTurbineGovernorDynamics() {
        return TurbineGovernorDynamics;
    }

    public void setTurbineGovernorDynamics(TurbineGovernorDynamics _object_) {
        if (TurbineGovernorDynamics != _object_) {
            TurbineGovernorDynamics = _object_;
            TurbineGovernorDynamics.setAsynchronousMachineDynamics(this);
        }
    }

    private static Object getTurbineGovernorDynamics(BaseClass _this_) {
        return ((AsynchronousMachineDynamics) _this_).getTurbineGovernorDynamics();
    }

    private static void setTurbineGovernorDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof TurbineGovernorDynamics) {
            ((AsynchronousMachineDynamics) _this_).setTurbineGovernorDynamics((TurbineGovernorDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not TurbineGovernorDynamics");
        }
    }

    /**
     * Wind generator type 1 or 2 model associated with this asynchronous machine model.
     *
     * NOT USED
     */
    private WindTurbineType1or2Dynamics WindTurbineType1or2Dynamics; // OneToOne

    public WindTurbineType1or2Dynamics getWindTurbineType1or2Dynamics() {
        return WindTurbineType1or2Dynamics;
    }

    public void setWindTurbineType1or2Dynamics(WindTurbineType1or2Dynamics _object_) {
        if (WindTurbineType1or2Dynamics != _object_) {
            WindTurbineType1or2Dynamics = _object_;
            WindTurbineType1or2Dynamics.setAsynchronousMachineDynamics(this);
        }
    }

    private static Object getWindTurbineType1or2Dynamics(BaseClass _this_) {
        return ((AsynchronousMachineDynamics) _this_).getWindTurbineType1or2Dynamics();
    }

    private static void setWindTurbineType1or2Dynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindTurbineType1or2Dynamics) {
            ((AsynchronousMachineDynamics) _this_).setWindTurbineType1or2Dynamics((WindTurbineType1or2Dynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindTurbineType1or2Dynamics");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "AsynchronousMachineDynamics", attrName));
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
                "AsynchronousMachineDynamics", attrName, value));
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
            map.put("AsynchronousMachine", new AttrDetails("AsynchronousMachineDynamics.AsynchronousMachine", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, AsynchronousMachineDynamics::getAsynchronousMachine, AsynchronousMachineDynamics::setAsynchronousMachine));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("MechanicalLoadDynamics", new AttrDetails("AsynchronousMachineDynamics.MechanicalLoadDynamics", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, AsynchronousMachineDynamics::getMechanicalLoadDynamics, AsynchronousMachineDynamics::setMechanicalLoadDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("TurbineGovernorDynamics", new AttrDetails("AsynchronousMachineDynamics.TurbineGovernorDynamics", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, AsynchronousMachineDynamics::getTurbineGovernorDynamics, AsynchronousMachineDynamics::setTurbineGovernorDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindTurbineType1or2Dynamics", new AttrDetails("AsynchronousMachineDynamics.WindTurbineType1or2Dynamics", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, AsynchronousMachineDynamics::getWindTurbineType1or2Dynamics, AsynchronousMachineDynamics::setWindTurbineType1or2Dynamics));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new AsynchronousMachineDynamics(null).allAttrDetailsMap());
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
