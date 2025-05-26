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
 * A tap changer that changes the voltage ratio impacting the voltage magnitude but not the phase angle across the transformer.  Angle sign convention (general): Positive value indicates a positive phase shift from the winding where the tap is located to the other winding (for a two-winding transformer).
 */
@SuppressWarnings("unused")
public class RatioTapChanger extends TapChanger {

    private static final Logging LOG = Logging.getLogger(RatioTapChanger.class);

    /**
     * Constructor.
     */
    public RatioTapChanger(String rdfid) {
        super("RatioTapChanger", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected RatioTapChanger(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The tap ratio table for this ratio  tap changer.
     */
    private RatioTapChangerTable RatioTapChangerTable; // ManyToOne

    public RatioTapChangerTable getRatioTapChangerTable() {
        return RatioTapChangerTable;
    }

    public void setRatioTapChangerTable(RatioTapChangerTable _object_) {
        if (RatioTapChangerTable != _object_) {
            RatioTapChangerTable = _object_;
            RatioTapChangerTable.setRatioTapChanger(this);
        }
    }

    private static Object getRatioTapChangerTable(BaseClass _this_) {
        return ((RatioTapChanger) _this_).getRatioTapChangerTable();
    }

    private static void setRatioTapChangerTable(BaseClass _this_, Object _value_) {
        if (_value_ instanceof RatioTapChangerTable) {
            ((RatioTapChanger) _this_).setRatioTapChangerTable((RatioTapChangerTable) _value_);
        } else {
            throw new IllegalArgumentException("Object is not RatioTapChangerTable");
        }
    }

    /**
     * Transformer end to which this ratio tap changer belongs.
     */
    private TransformerEnd TransformerEnd; // OneToOne

    public TransformerEnd getTransformerEnd() {
        return TransformerEnd;
    }

    public void setTransformerEnd(TransformerEnd _object_) {
        if (TransformerEnd != _object_) {
            TransformerEnd = _object_;
            TransformerEnd.setRatioTapChanger(this);
        }
    }

    private static Object getTransformerEnd(BaseClass _this_) {
        return ((RatioTapChanger) _this_).getTransformerEnd();
    }

    private static void setTransformerEnd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof TransformerEnd) {
            ((RatioTapChanger) _this_).setTransformerEnd((TransformerEnd) _value_);
        } else {
            throw new IllegalArgumentException("Object is not TransformerEnd");
        }
    }

    /**
     * Tap step increment, in per cent of rated voltage of the power transformer end, per step position. When the increment is negative, the voltage decreases when the tap step increases.
     */
    private Double stepVoltageIncrement; // PerCent

    public Double getStepVoltageIncrement() {
        return stepVoltageIncrement;
    }

    public void setStepVoltageIncrement(Double _value_) {
        stepVoltageIncrement = _value_;
    }

    private static Object getStepVoltageIncrement(BaseClass _this_) {
        return ((RatioTapChanger) _this_).getStepVoltageIncrement();
    }

    private static void setStepVoltageIncrement(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((RatioTapChanger) _this_).setStepVoltageIncrement((Double) _value_);
        } else if (_value_ instanceof String) {
            ((RatioTapChanger) _this_).setStepVoltageIncrement(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "RatioTapChanger", attrName));
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
                "RatioTapChanger", attrName, value));
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
            map.put("RatioTapChangerTable", new AttrDetails("RatioTapChanger.RatioTapChangerTable", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, RatioTapChanger::getRatioTapChangerTable, RatioTapChanger::setRatioTapChangerTable));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("TransformerEnd", new AttrDetails("RatioTapChanger.TransformerEnd", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, RatioTapChanger::getTransformerEnd, RatioTapChanger::setTransformerEnd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("stepVoltageIncrement", new AttrDetails("RatioTapChanger.stepVoltageIncrement", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, RatioTapChanger::getStepVoltageIncrement, RatioTapChanger::setStepVoltageIncrement));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new RatioTapChanger(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
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
