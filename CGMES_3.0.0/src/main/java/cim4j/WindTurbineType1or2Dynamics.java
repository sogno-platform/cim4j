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
 * Parent class supporting relationships to wind turbines type 1 and type 2 and their control models.  Generator model for wind turbine of type 1 or type 2 is a standard asynchronous generator model.
 */
@SuppressWarnings("unused")
public class WindTurbineType1or2Dynamics extends DynamicsFunctionBlock {

    private static final Logging LOG = Logging.getLogger(WindTurbineType1or2Dynamics.class);

    /**
     * Constructor.
     */
    public WindTurbineType1or2Dynamics(String rdfid) {
        super("WindTurbineType1or2Dynamics", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindTurbineType1or2Dynamics(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Asynchronous machine model with which this wind generator type 1 or type 2 model is associated.
     */
    private AsynchronousMachineDynamics AsynchronousMachineDynamics; // OneToOne

    public AsynchronousMachineDynamics getAsynchronousMachineDynamics() {
        return AsynchronousMachineDynamics;
    }

    public void setAsynchronousMachineDynamics(AsynchronousMachineDynamics _object_) {
        if (AsynchronousMachineDynamics != _object_) {
            AsynchronousMachineDynamics = _object_;
            AsynchronousMachineDynamics.setWindTurbineType1or2Dynamics(this);
        }
    }

    private static Object getAsynchronousMachineDynamics(BaseClass _this_) {
        return ((WindTurbineType1or2Dynamics) _this_).getAsynchronousMachineDynamics();
    }

    private static void setAsynchronousMachineDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof AsynchronousMachineDynamics) {
            ((WindTurbineType1or2Dynamics) _this_).setAsynchronousMachineDynamics((AsynchronousMachineDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not AsynchronousMachineDynamics");
        }
    }

    /**
     * Remote input signal used by this wind generator type 1 or type 2 model.
     */
    private RemoteInputSignal RemoteInputSignal; // OneToOne

    public RemoteInputSignal getRemoteInputSignal() {
        return RemoteInputSignal;
    }

    public void setRemoteInputSignal(RemoteInputSignal _object_) {
        if (RemoteInputSignal != _object_) {
            RemoteInputSignal = _object_;
            RemoteInputSignal.setWindTurbineType1or2Dynamics(this);
        }
    }

    private static Object getRemoteInputSignal(BaseClass _this_) {
        return ((WindTurbineType1or2Dynamics) _this_).getRemoteInputSignal();
    }

    private static void setRemoteInputSignal(BaseClass _this_, Object _value_) {
        if (_value_ instanceof RemoteInputSignal) {
            ((WindTurbineType1or2Dynamics) _this_).setRemoteInputSignal((RemoteInputSignal) _value_);
        } else {
            throw new IllegalArgumentException("Object is not RemoteInputSignal");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindTurbineType1or2Dynamics", attrName));
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
                "WindTurbineType1or2Dynamics", attrName, value));
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
            map.put("AsynchronousMachineDynamics", new AttrDetails("WindTurbineType1or2Dynamics.AsynchronousMachineDynamics", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindTurbineType1or2Dynamics::getAsynchronousMachineDynamics, WindTurbineType1or2Dynamics::setAsynchronousMachineDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("RemoteInputSignal", new AttrDetails("WindTurbineType1or2Dynamics.RemoteInputSignal", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindTurbineType1or2Dynamics::getRemoteInputSignal, WindTurbineType1or2Dynamics::setRemoteInputSignal));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindTurbineType1or2Dynamics(null).allAttrDetailsMap());
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
