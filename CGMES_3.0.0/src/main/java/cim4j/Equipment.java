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
 * The parts of a power system that are physical devices, electronic or mechanical.
 */
@SuppressWarnings("unused")
public class Equipment extends PowerSystemResource {

    private static final Logging LOG = Logging.getLogger(Equipment.class);

    /**
     * Constructor.
     */
    public Equipment(String rdfid) {
        super("Equipment", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected Equipment(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Container of this equipment.
     */
    private EquipmentContainer EquipmentContainer; // ManyToOne

    public EquipmentContainer getEquipmentContainer() {
        return EquipmentContainer;
    }

    public void setEquipmentContainer(EquipmentContainer _object_) {
        if (EquipmentContainer != _object_) {
            EquipmentContainer = _object_;
            EquipmentContainer.setEquipments(this);
        }
    }

    private static Object getEquipmentContainer(BaseClass _this_) {
        return ((Equipment) _this_).getEquipmentContainer();
    }

    private static void setEquipmentContainer(BaseClass _this_, Object _value_) {
        if (_value_ instanceof EquipmentContainer) {
            ((Equipment) _this_).setEquipmentContainer((EquipmentContainer) _value_);
        } else {
            throw new IllegalArgumentException("Object is not EquipmentContainer");
        }
    }

    /**
     * The operational limit sets associated with this equipment.
     *
     * NOT USED
     */
    private Set<OperationalLimitSet> OperationalLimitSet = new HashSet<>(); // OneToMany

    public Set<OperationalLimitSet> getOperationalLimitSet() {
        return OperationalLimitSet;
    }

    public void setOperationalLimitSet(OperationalLimitSet _object_) {
        if (!OperationalLimitSet.contains(_object_)) {
            OperationalLimitSet.add(_object_);
            _object_.setEquipment(this);
        }
    }

    private static Object getOperationalLimitSet(BaseClass _this_) {
        return ((Equipment) _this_).getOperationalLimitSet();
    }

    private static void setOperationalLimitSet(BaseClass _this_, Object _value_) {
        if (_value_ instanceof OperationalLimitSet) {
            ((Equipment) _this_).setOperationalLimitSet((OperationalLimitSet) _value_);
        } else {
            throw new IllegalArgumentException("Object is not OperationalLimitSet");
        }
    }

    /**
     * The aggregate flag provides an alternative way of representing an aggregated (equivalent) element. It is applicable in cases when the dedicated classes for equivalent equipment do not have all of the attributes necessary to represent the required level of detail.  In case the flag is set to `true` the single instance of equipment represents multiple pieces of equipment that have been modelled together as an aggregate equivalent obtained by a network reduction procedure. Examples would be power transformers or synchronous machines operating in parallel modelled as a single aggregate power transformer or aggregate synchronous machine.   The attribute is not used for EquivalentBranch, EquivalentShunt and EquivalentInjection.
     */
    private Boolean aggregate; // Boolean

    public Boolean getAggregate() {
        return aggregate;
    }

    public void setAggregate(Boolean _value_) {
        aggregate = _value_;
    }

    private static Object getAggregate(BaseClass _this_) {
        return ((Equipment) _this_).getAggregate();
    }

    private static void setAggregate(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Equipment) _this_).setAggregate((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Equipment) _this_).setAggregate(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Specifies the availability of the equipment. True means the equipment is available for topology processing, which determines if the equipment is energized or not. False means that the equipment is treated by network applications as if it is not in the model.
     */
    private Boolean inService; // Boolean

    public Boolean getInService() {
        return inService;
    }

    public void setInService(Boolean _value_) {
        inService = _value_;
    }

    private static Object getInService(BaseClass _this_) {
        return ((Equipment) _this_).getInService();
    }

    private static void setInService(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Equipment) _this_).setInService((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Equipment) _this_).setInService(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Specifies the availability of the equipment under normal operating conditions. True means the equipment is available for topology processing, which determines if the equipment is energized or not. False means that the equipment is treated by network applications as if it is not in the model.
     */
    private Boolean normallyInService; // Boolean

    public Boolean getNormallyInService() {
        return normallyInService;
    }

    public void setNormallyInService(Boolean _value_) {
        normallyInService = _value_;
    }

    private static Object getNormallyInService(BaseClass _this_) {
        return ((Equipment) _this_).getNormallyInService();
    }

    private static void setNormallyInService(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Equipment) _this_).setNormallyInService((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Equipment) _this_).setNormallyInService(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "Equipment", attrName));
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
                "Equipment", attrName, value));
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
            profiles.add(CGMESProfile.EQBD);
            map.put("EquipmentContainer", new AttrDetails("Equipment.EquipmentContainer", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, Equipment::getEquipmentContainer, Equipment::setEquipmentContainer));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("OperationalLimitSet", new AttrDetails("Equipment.OperationalLimitSet", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, Equipment::getOperationalLimitSet, Equipment::setOperationalLimitSet));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("aggregate", new AttrDetails("Equipment.aggregate", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Equipment::getAggregate, Equipment::setAggregate));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("inService", new AttrDetails("Equipment.inService", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Equipment::getInService, Equipment::setInService));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("normallyInService", new AttrDetails("Equipment.normallyInService", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Equipment::getNormallyInService, Equipment::setNormallyInService));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new Equipment(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.DY);
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.EQBD);
        profiles.add(CGMESProfile.SC);
        profiles.add(CGMESProfile.SSH);
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
