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
 * Discontinuous excitation control function block whose behaviour is described by reference to a standard model .
 */
@SuppressWarnings("unused")
public class DiscontinuousExcitationControlDynamics extends DynamicsFunctionBlock {

    private static final Logging LOG = Logging.getLogger(DiscontinuousExcitationControlDynamics.class);

    /**
     * Constructor.
     */
    public DiscontinuousExcitationControlDynamics(String rdfid) {
        super("DiscontinuousExcitationControlDynamics", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected DiscontinuousExcitationControlDynamics(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Excitation system model with which this discontinuous excitation control model is associated.
     */
    private ExcitationSystemDynamics ExcitationSystemDynamics; // OneToOne

    private String ExcitationSystemDynamicsId;

    public ExcitationSystemDynamics getExcitationSystemDynamics() {
        return ExcitationSystemDynamics;
    }

    public void setExcitationSystemDynamics(ExcitationSystemDynamics _object_) {
        if (ExcitationSystemDynamics != _object_) {
            ExcitationSystemDynamics = _object_;
            _object_.setDiscontinuousExcitationControlDynamics(this);
            ExcitationSystemDynamicsId = _object_.getRdfid();
        }
    }

    private static Object getExcitationSystemDynamics(BaseClass _this_) {
        var obj = ((DiscontinuousExcitationControlDynamics) _this_).getExcitationSystemDynamics();
        var id = ((DiscontinuousExcitationControlDynamics) _this_).ExcitationSystemDynamicsId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setExcitationSystemDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((DiscontinuousExcitationControlDynamics) _this_).ExcitationSystemDynamicsId = (String) _value_;
        } else if (_value_ instanceof ExcitationSystemDynamics) {
            ((DiscontinuousExcitationControlDynamics) _this_).setExcitationSystemDynamics((ExcitationSystemDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ExcitationSystemDynamics");
        }
    }

    /**
     * Remote input signal used by this discontinuous excitation control system model.
     *
     * NOT USED
     */
    private RemoteInputSignal RemoteInputSignal; // OneToOne

    private String RemoteInputSignalId;

    public RemoteInputSignal getRemoteInputSignal() {
        return RemoteInputSignal;
    }

    public void setRemoteInputSignal(RemoteInputSignal _object_) {
        if (RemoteInputSignal != _object_) {
            RemoteInputSignal = _object_;
            _object_.setDiscontinuousExcitationControlDynamics(this);
            RemoteInputSignalId = _object_.getRdfid();
        }
    }

    private static Object getRemoteInputSignal(BaseClass _this_) {
        var obj = ((DiscontinuousExcitationControlDynamics) _this_).getRemoteInputSignal();
        var id = ((DiscontinuousExcitationControlDynamics) _this_).RemoteInputSignalId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setRemoteInputSignal(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((DiscontinuousExcitationControlDynamics) _this_).RemoteInputSignalId = (String) _value_;
        } else if (_value_ instanceof RemoteInputSignal) {
            ((DiscontinuousExcitationControlDynamics) _this_).setRemoteInputSignal((RemoteInputSignal) _value_);
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "DiscontinuousExcitationControlDynamics", attrName));
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
                "DiscontinuousExcitationControlDynamics", attrName, value));
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
            map.put("ExcitationSystemDynamics", new AttrDetails("DiscontinuousExcitationControlDynamics.ExcitationSystemDynamics", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, DiscontinuousExcitationControlDynamics::getExcitationSystemDynamics, DiscontinuousExcitationControlDynamics::setExcitationSystemDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("RemoteInputSignal", new AttrDetails("DiscontinuousExcitationControlDynamics.RemoteInputSignal", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, DiscontinuousExcitationControlDynamics::getRemoteInputSignal, DiscontinuousExcitationControlDynamics::setRemoteInputSignal));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new DiscontinuousExcitationControlDynamics(null).allAttrDetailsMap());
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
