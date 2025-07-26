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
 * A shunt capacitor or reactor or switchable bank of shunt capacitors or reactors. A section of a shunt compensator is an individual capacitor or reactor. A negative value for bPerSection indicates that the compensator is a reactor. ShuntCompensator is a single terminal device.  Ground is implied.
 */
@SuppressWarnings("unused")
public class ShuntCompensator extends RegulatingCondEq {

    private static final Logging LOG = Logging.getLogger(ShuntCompensator.class);

    /**
     * Constructor.
     */
    public ShuntCompensator(String rdfid) {
        super("ShuntCompensator", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ShuntCompensator(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The state for the number of shunt compensator sections in service.
     *
     * NOT USED
     */
    private SvShuntCompensatorSections SvShuntCompensatorSections; // OneToOne

    private String SvShuntCompensatorSectionsId;

    public SvShuntCompensatorSections getSvShuntCompensatorSections() {
        return SvShuntCompensatorSections;
    }

    public void setSvShuntCompensatorSections(SvShuntCompensatorSections _object_) {
        if (SvShuntCompensatorSections != _object_) {
            SvShuntCompensatorSections = _object_;
            _object_.setShuntCompensator(this);
            SvShuntCompensatorSectionsId = _object_.getRdfid();
        }
    }

    private static Object getSvShuntCompensatorSections(BaseClass _this_) {
        var obj = ((ShuntCompensator) _this_).getSvShuntCompensatorSections();
        var id = ((ShuntCompensator) _this_).SvShuntCompensatorSectionsId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setSvShuntCompensatorSections(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ShuntCompensator) _this_).SvShuntCompensatorSectionsId = (String) _value_;
        } else if (_value_ instanceof SvShuntCompensatorSections) {
            ((ShuntCompensator) _this_).setSvShuntCompensatorSections((SvShuntCompensatorSections) _value_);
        } else {
            throw new IllegalArgumentException("Object is not SvShuntCompensatorSections");
        }
    }

    /**
     * An automatic voltage regulation delay (AVRDelay) which is the time delay from a change in voltage to when the capacitor is allowed to change state. This filters out temporary changes in voltage.
     */
    private Double aVRDelay; // Seconds

    public Double getAVRDelay() {
        return aVRDelay;
    }

    public void setAVRDelay(Double _value_) {
        aVRDelay = _value_;
    }

    private static Object getAVRDelay(BaseClass _this_) {
        return ((ShuntCompensator) _this_).getAVRDelay();
    }

    private static void setAVRDelay(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ShuntCompensator) _this_).setAVRDelay((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ShuntCompensator) _this_).setAVRDelay(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Used for Yn and Zn connections. True if the neutral is solidly grounded.
     */
    private Boolean grounded; // Boolean

    public Boolean getGrounded() {
        return grounded;
    }

    public void setGrounded(Boolean _value_) {
        grounded = _value_;
    }

    private static Object getGrounded(BaseClass _this_) {
        return ((ShuntCompensator) _this_).getGrounded();
    }

    private static void setGrounded(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ShuntCompensator) _this_).setGrounded((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ShuntCompensator) _this_).setGrounded(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * The maximum number of sections that may be switched in.
     */
    private Integer maximumSections; // Integer

    public Integer getMaximumSections() {
        return maximumSections;
    }

    public void setMaximumSections(Integer _value_) {
        maximumSections = _value_;
    }

    private static Object getMaximumSections(BaseClass _this_) {
        return ((ShuntCompensator) _this_).getMaximumSections();
    }

    private static void setMaximumSections(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((ShuntCompensator) _this_).setMaximumSections((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((ShuntCompensator) _this_).setMaximumSections(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
        }
    }

    /**
     * The voltage at which the nominal reactive power may be calculated. This should normally be within 10% of the voltage at which the capacitor is connected to the network.
     */
    private Double nomU; // Voltage

    public Double getNomU() {
        return nomU;
    }

    public void setNomU(Double _value_) {
        nomU = _value_;
    }

    private static Object getNomU(BaseClass _this_) {
        return ((ShuntCompensator) _this_).getNomU();
    }

    private static void setNomU(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ShuntCompensator) _this_).setNomU((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ShuntCompensator) _this_).setNomU(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * The normal number of sections switched in. The value shall be between zero and ShuntCompensator.maximumSections.
     */
    private Integer normalSections; // Integer

    public Integer getNormalSections() {
        return normalSections;
    }

    public void setNormalSections(Integer _value_) {
        normalSections = _value_;
    }

    private static Object getNormalSections(BaseClass _this_) {
        return ((ShuntCompensator) _this_).getNormalSections();
    }

    private static void setNormalSections(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((ShuntCompensator) _this_).setNormalSections((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((ShuntCompensator) _this_).setNormalSections(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
        }
    }

    /**
     * Shunt compensator sections in use. Starting value for steady state solution. The attribute shall be a positive value or zero. Non integer values are allowed to support continuous variables. The reasons for continuous value are to support study cases where no discrete shunt compensators has yet been designed, a solutions where a narrow voltage band force the sections to oscillate or accommodate for a continuous solution as input.  For LinearShuntConpensator the value shall be between zero and ShuntCompensator.maximumSections. At value zero the shunt compensator conductance and admittance is zero. Linear interpolation of conductance and admittance between the previous and next integer section is applied in case of non-integer values. For NonlinearShuntCompensator-s shall only be set to one of the NonlinearShuntCompenstorPoint.sectionNumber. There is no interpolation between NonlinearShuntCompenstorPoint-s.
     */
    private Float sections; // Float

    public Float getSections() {
        return sections;
    }

    public void setSections(Float _value_) {
        sections = _value_;
    }

    private static Object getSections(BaseClass _this_) {
        return ((ShuntCompensator) _this_).getSections();
    }

    private static void setSections(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ShuntCompensator) _this_).setSections((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ShuntCompensator) _this_).setSections(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Voltage sensitivity required for the device to regulate the bus voltage, in voltage/reactive power.
     */
    private Double voltageSensitivity; // VoltagePerReactivePower

    public Double getVoltageSensitivity() {
        return voltageSensitivity;
    }

    public void setVoltageSensitivity(Double _value_) {
        voltageSensitivity = _value_;
    }

    private static Object getVoltageSensitivity(BaseClass _this_) {
        return ((ShuntCompensator) _this_).getVoltageSensitivity();
    }

    private static void setVoltageSensitivity(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ShuntCompensator) _this_).setVoltageSensitivity((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ShuntCompensator) _this_).setVoltageSensitivity(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ShuntCompensator", attrName));
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
                "ShuntCompensator", attrName, value));
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
            profiles.add(CGMESProfile.SV);
            map.put("SvShuntCompensatorSections", new AttrDetails("ShuntCompensator.SvShuntCompensatorSections", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, ShuntCompensator::getSvShuntCompensatorSections, ShuntCompensator::setSvShuntCompensatorSections));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("aVRDelay", new AttrDetails("ShuntCompensator.aVRDelay", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ShuntCompensator::getAVRDelay, ShuntCompensator::setAVRDelay));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("grounded", new AttrDetails("ShuntCompensator.grounded", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ShuntCompensator::getGrounded, ShuntCompensator::setGrounded));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maximumSections", new AttrDetails("ShuntCompensator.maximumSections", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ShuntCompensator::getMaximumSections, ShuntCompensator::setMaximumSections));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("nomU", new AttrDetails("ShuntCompensator.nomU", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ShuntCompensator::getNomU, ShuntCompensator::setNomU));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("normalSections", new AttrDetails("ShuntCompensator.normalSections", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ShuntCompensator::getNormalSections, ShuntCompensator::setNormalSections));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("sections", new AttrDetails("ShuntCompensator.sections", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ShuntCompensator::getSections, ShuntCompensator::setSections));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("voltageSensitivity", new AttrDetails("ShuntCompensator.voltageSensitivity", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ShuntCompensator::getVoltageSensitivity, ShuntCompensator::setVoltageSensitivity));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ShuntCompensator(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.SC);
        profiles.add(CGMESProfile.SSH);
        profiles.add(CGMESProfile.SV);
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
