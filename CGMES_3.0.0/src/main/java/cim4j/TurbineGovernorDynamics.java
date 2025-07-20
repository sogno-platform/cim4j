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
 * Turbine-governor function block whose behaviour is described by reference to a standard model <font color="#0f0f0f">or by definition of a user-defined model.</font>
 */
@SuppressWarnings("unused")
public class TurbineGovernorDynamics extends DynamicsFunctionBlock {

    private static final Logging LOG = Logging.getLogger(TurbineGovernorDynamics.class);

    /**
     * Constructor.
     */
    public TurbineGovernorDynamics(String rdfid) {
        super("TurbineGovernorDynamics", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected TurbineGovernorDynamics(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Asynchronous machine model with which this turbine-governor model is associated. TurbineGovernorDynamics shall have either an association to SynchronousMachineDynamics or to AsynchronousMachineDynamics.
     */
    private AsynchronousMachineDynamics AsynchronousMachineDynamics; // OneToOne

    private String AsynchronousMachineDynamicsId;

    public AsynchronousMachineDynamics getAsynchronousMachineDynamics() {
        return AsynchronousMachineDynamics;
    }

    public void setAsynchronousMachineDynamics(AsynchronousMachineDynamics _object_) {
        if (AsynchronousMachineDynamics != _object_) {
            AsynchronousMachineDynamics = _object_;
            _object_.setTurbineGovernorDynamics(this);
            AsynchronousMachineDynamicsId = _object_.getRdfid();
        }
    }

    private static Object getAsynchronousMachineDynamics(BaseClass _this_) {
        var obj = ((TurbineGovernorDynamics) _this_).getAsynchronousMachineDynamics();
        var id = ((TurbineGovernorDynamics) _this_).AsynchronousMachineDynamicsId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setAsynchronousMachineDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((TurbineGovernorDynamics) _this_).AsynchronousMachineDynamicsId = (String) _value_;
        } else if (_value_ instanceof AsynchronousMachineDynamics) {
            ((TurbineGovernorDynamics) _this_).setAsynchronousMachineDynamics((AsynchronousMachineDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not AsynchronousMachineDynamics");
        }
    }

    /**
     * Synchronous machine model with which this turbine-governor model is associated. TurbineGovernorDynamics shall have either an association to SynchronousMachineDynamics or to AsynchronousMachineDynamics.
     */
    private SynchronousMachineDynamics SynchronousMachineDynamics; // ManyToOne

    private String SynchronousMachineDynamicsId;

    public SynchronousMachineDynamics getSynchronousMachineDynamics() {
        return SynchronousMachineDynamics;
    }

    public void setSynchronousMachineDynamics(SynchronousMachineDynamics _object_) {
        if (SynchronousMachineDynamics != _object_) {
            SynchronousMachineDynamics = _object_;
            _object_.setTurbineGovernorDynamics(this);
            SynchronousMachineDynamicsId = _object_.getRdfid();
        }
    }

    private static Object getSynchronousMachineDynamics(BaseClass _this_) {
        var obj = ((TurbineGovernorDynamics) _this_).getSynchronousMachineDynamics();
        var id = ((TurbineGovernorDynamics) _this_).SynchronousMachineDynamicsId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setSynchronousMachineDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((TurbineGovernorDynamics) _this_).SynchronousMachineDynamicsId = (String) _value_;
        } else if (_value_ instanceof SynchronousMachineDynamics) {
            ((TurbineGovernorDynamics) _this_).setSynchronousMachineDynamics((SynchronousMachineDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not SynchronousMachineDynamics");
        }
    }

    /**
     * Turbine load controller providing input to this turbine-governor.
     *
     * NOT USED
     */
    private TurbineLoadControllerDynamics TurbineLoadControllerDynamics; // OneToOne

    private String TurbineLoadControllerDynamicsId;

    public TurbineLoadControllerDynamics getTurbineLoadControllerDynamics() {
        return TurbineLoadControllerDynamics;
    }

    public void setTurbineLoadControllerDynamics(TurbineLoadControllerDynamics _object_) {
        if (TurbineLoadControllerDynamics != _object_) {
            TurbineLoadControllerDynamics = _object_;
            _object_.setTurbineGovernorDynamics(this);
            TurbineLoadControllerDynamicsId = _object_.getRdfid();
        }
    }

    private static Object getTurbineLoadControllerDynamics(BaseClass _this_) {
        var obj = ((TurbineGovernorDynamics) _this_).getTurbineLoadControllerDynamics();
        var id = ((TurbineGovernorDynamics) _this_).TurbineLoadControllerDynamicsId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setTurbineLoadControllerDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((TurbineGovernorDynamics) _this_).TurbineLoadControllerDynamicsId = (String) _value_;
        } else if (_value_ instanceof TurbineLoadControllerDynamics) {
            ((TurbineGovernorDynamics) _this_).setTurbineLoadControllerDynamics((TurbineLoadControllerDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not TurbineLoadControllerDynamics");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "TurbineGovernorDynamics", attrName));
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
                "TurbineGovernorDynamics", attrName, value));
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
            map.put("AsynchronousMachineDynamics", new AttrDetails("TurbineGovernorDynamics.AsynchronousMachineDynamics", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, TurbineGovernorDynamics::getAsynchronousMachineDynamics, TurbineGovernorDynamics::setAsynchronousMachineDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("SynchronousMachineDynamics", new AttrDetails("TurbineGovernorDynamics.SynchronousMachineDynamics", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, TurbineGovernorDynamics::getSynchronousMachineDynamics, TurbineGovernorDynamics::setSynchronousMachineDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("TurbineLoadControllerDynamics", new AttrDetails("TurbineGovernorDynamics.TurbineLoadControllerDynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, TurbineGovernorDynamics::getTurbineLoadControllerDynamics, TurbineGovernorDynamics::setTurbineLoadControllerDynamics));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new TurbineGovernorDynamics(null).allAttrDetailsMap());
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
