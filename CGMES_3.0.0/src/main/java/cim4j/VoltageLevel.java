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
 * A collection of equipment at one common system voltage forming a switchgear. The equipment typically consists of breakers, busbars, instrumentation, control, regulation and protection devices as well as assemblies of all these.
 */
@SuppressWarnings("unused")
public class VoltageLevel extends EquipmentContainer {

    private static final Logging LOG = Logging.getLogger(VoltageLevel.class);

    /**
     * Constructor.
     */
    public VoltageLevel(String rdfid) {
        super("VoltageLevel", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected VoltageLevel(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The base voltage used for all equipment within the voltage level.
     */
    private BaseVoltage BaseVoltage; // ManyToOne

    public BaseVoltage getBaseVoltage() {
        return BaseVoltage;
    }

    public void setBaseVoltage(BaseVoltage _object_) {
        if (BaseVoltage != _object_) {
            BaseVoltage = _object_;
            BaseVoltage.setVoltageLevel(this);
        }
    }

    private static Object getBaseVoltage(BaseClass _this_) {
        return ((VoltageLevel) _this_).getBaseVoltage();
    }

    private static void setBaseVoltage(BaseClass _this_, Object _value_) {
        if (_value_ instanceof BaseVoltage) {
            ((VoltageLevel) _this_).setBaseVoltage((BaseVoltage) _value_);
        } else {
            throw new IllegalArgumentException("Object is not BaseVoltage");
        }
    }

    /**
     * The bays within this voltage level.
     *
     * NOT USED
     */
    private Set<Bay> Bays = new HashSet<>(); // OneToMany

    public Set<Bay> getBays() {
        return Bays;
    }

    public void setBays(Bay _object_) {
        if (!Bays.contains(_object_)) {
            Bays.add(_object_);
            _object_.setVoltageLevel(this);
        }
    }

    private static Object getBays(BaseClass _this_) {
        return ((VoltageLevel) _this_).getBays();
    }

    private static void setBays(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Bay) {
            ((VoltageLevel) _this_).setBays((Bay) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Bay");
        }
    }

    /**
     * The substation of the voltage level.
     */
    private Substation Substation; // ManyToOne

    public Substation getSubstation() {
        return Substation;
    }

    public void setSubstation(Substation _object_) {
        if (Substation != _object_) {
            Substation = _object_;
            Substation.setVoltageLevels(this);
        }
    }

    private static Object getSubstation(BaseClass _this_) {
        return ((VoltageLevel) _this_).getSubstation();
    }

    private static void setSubstation(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Substation) {
            ((VoltageLevel) _this_).setSubstation((Substation) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Substation");
        }
    }

    /**
     * The bus bar`s high voltage limit. The limit applies to all equipment and nodes contained in a given VoltageLevel. It is not required that it is exchanged in pair with lowVoltageLimit. It is preferable to use operational VoltageLimit, which prevails, if present.
     */
    private Double highVoltageLimit; // Voltage

    public Double getHighVoltageLimit() {
        return highVoltageLimit;
    }

    public void setHighVoltageLimit(Double _value_) {
        highVoltageLimit = _value_;
    }

    private static Object getHighVoltageLimit(BaseClass _this_) {
        return ((VoltageLevel) _this_).getHighVoltageLimit();
    }

    private static void setHighVoltageLimit(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((VoltageLevel) _this_).setHighVoltageLimit((Double) _value_);
        } else if (_value_ instanceof String) {
            ((VoltageLevel) _this_).setHighVoltageLimit(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * The bus bar`s low voltage limit. The limit applies to all equipment and nodes contained in a given VoltageLevel. It is not required that it is exchanged in pair with highVoltageLimit. It is preferable to use operational VoltageLimit, which prevails, if present.
     */
    private Double lowVoltageLimit; // Voltage

    public Double getLowVoltageLimit() {
        return lowVoltageLimit;
    }

    public void setLowVoltageLimit(Double _value_) {
        lowVoltageLimit = _value_;
    }

    private static Object getLowVoltageLimit(BaseClass _this_) {
        return ((VoltageLevel) _this_).getLowVoltageLimit();
    }

    private static void setLowVoltageLimit(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((VoltageLevel) _this_).setLowVoltageLimit((Double) _value_);
        } else if (_value_ instanceof String) {
            ((VoltageLevel) _this_).setLowVoltageLimit(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "VoltageLevel", attrName));
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
                "VoltageLevel", attrName, value));
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
            map.put("BaseVoltage", new AttrDetails("VoltageLevel.BaseVoltage", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, VoltageLevel::getBaseVoltage, VoltageLevel::setBaseVoltage));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("Bays", new AttrDetails("VoltageLevel.Bays", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, VoltageLevel::getBays, VoltageLevel::setBays));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("Substation", new AttrDetails("VoltageLevel.Substation", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, VoltageLevel::getSubstation, VoltageLevel::setSubstation));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("highVoltageLimit", new AttrDetails("VoltageLevel.highVoltageLimit", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, VoltageLevel::getHighVoltageLimit, VoltageLevel::setHighVoltageLimit));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("lowVoltageLimit", new AttrDetails("VoltageLevel.lowVoltageLimit", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, VoltageLevel::getLowVoltageLimit, VoltageLevel::setLowVoltageLimit));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new VoltageLevel(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.EQBD);
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
