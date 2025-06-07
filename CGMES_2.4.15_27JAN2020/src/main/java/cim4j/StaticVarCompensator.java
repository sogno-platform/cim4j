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
 * A facility for providing variable and controllable shunt reactive power. The SVC typically consists of a stepdown transformer, filter, thyristor-controlled reactor, and thyristor-switched capacitor arms.  The SVC may operate in fixed MVar output mode or in voltage control mode. When in voltage control mode, the output of the SVC will be proportional to the deviation of voltage at the controlled bus from the voltage setpoint.  The SVC characteristic slope defines the proportion.  If the voltage at the controlled bus is equal to the voltage setpoint, the SVC MVar output is zero.
 */
@SuppressWarnings("unused")
public class StaticVarCompensator extends RegulatingCondEq {

    private static final Logging LOG = Logging.getLogger(StaticVarCompensator.class);

    /**
     * Constructor.
     */
    public StaticVarCompensator(String rdfid) {
        super("StaticVarCompensator", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected StaticVarCompensator(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Maximum available capacitive reactance.
     */
    private Double capacitiveRating; // Reactance

    public Double getCapacitiveRating() {
        return capacitiveRating;
    }

    public void setCapacitiveRating(Double _value_) {
        capacitiveRating = _value_;
    }

    private static Object getCapacitiveRating(BaseClass _this_) {
        return ((StaticVarCompensator) _this_).getCapacitiveRating();
    }

    private static void setCapacitiveRating(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((StaticVarCompensator) _this_).setCapacitiveRating((Double) _value_);
        } else if (_value_ instanceof String) {
            ((StaticVarCompensator) _this_).setCapacitiveRating(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum available inductive reactance.
     */
    private Double inductiveRating; // Reactance

    public Double getInductiveRating() {
        return inductiveRating;
    }

    public void setInductiveRating(Double _value_) {
        inductiveRating = _value_;
    }

    private static Object getInductiveRating(BaseClass _this_) {
        return ((StaticVarCompensator) _this_).getInductiveRating();
    }

    private static void setInductiveRating(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((StaticVarCompensator) _this_).setInductiveRating((Double) _value_);
        } else if (_value_ instanceof String) {
            ((StaticVarCompensator) _this_).setInductiveRating(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive power injection. Load sign convention is used, i.e. positive sign means flow out from a node. Starting value for a steady state solution.
     */
    private Double q; // ReactivePower

    public Double getQ() {
        return q;
    }

    public void setQ(Double _value_) {
        q = _value_;
    }

    private static Object getQ(BaseClass _this_) {
        return ((StaticVarCompensator) _this_).getQ();
    }

    private static void setQ(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((StaticVarCompensator) _this_).setQ((Double) _value_);
        } else if (_value_ instanceof String) {
            ((StaticVarCompensator) _this_).setQ(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * SVC control mode.
     */
    private String sVCControlMode; // SVCControlMode

    public String getSVCControlMode() {
        return sVCControlMode;
    }

    public void setSVCControlMode(String _value_) {
        sVCControlMode = _value_;
    }

    private static Object getSVCControlMode(BaseClass _this_) {
        return ((StaticVarCompensator) _this_).getSVCControlMode();
    }

    private static void setSVCControlMode(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((StaticVarCompensator) _this_).setSVCControlMode((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * The characteristics slope of an SVC defines how the reactive power output changes in proportion to the difference between the regulated bus voltage and the voltage setpoint.
     */
    private Double slope; // VoltagePerReactivePower

    public Double getSlope() {
        return slope;
    }

    public void setSlope(Double _value_) {
        slope = _value_;
    }

    private static Object getSlope(BaseClass _this_) {
        return ((StaticVarCompensator) _this_).getSlope();
    }

    private static void setSlope(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((StaticVarCompensator) _this_).setSlope((Double) _value_);
        } else if (_value_ instanceof String) {
            ((StaticVarCompensator) _this_).setSlope(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * The reactive power output of the SVC is proportional to the difference between the voltage at the regulated bus and the voltage setpoint.  When the regulated bus voltage is equal to the voltage setpoint, the reactive power output is zero.
     */
    private Double voltageSetPoint; // Voltage

    public Double getVoltageSetPoint() {
        return voltageSetPoint;
    }

    public void setVoltageSetPoint(Double _value_) {
        voltageSetPoint = _value_;
    }

    private static Object getVoltageSetPoint(BaseClass _this_) {
        return ((StaticVarCompensator) _this_).getVoltageSetPoint();
    }

    private static void setVoltageSetPoint(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((StaticVarCompensator) _this_).setVoltageSetPoint((Double) _value_);
        } else if (_value_ instanceof String) {
            ((StaticVarCompensator) _this_).setVoltageSetPoint(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "StaticVarCompensator", attrName));
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
                "StaticVarCompensator", attrName, value));
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
            profiles.add(CGMESProfile.EQ);
            map.put("capacitiveRating", new AttrDetails("StaticVarCompensator.capacitiveRating", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, StaticVarCompensator::getCapacitiveRating, StaticVarCompensator::setCapacitiveRating));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("inductiveRating", new AttrDetails("StaticVarCompensator.inductiveRating", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, StaticVarCompensator::getInductiveRating, StaticVarCompensator::setInductiveRating));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("q", new AttrDetails("StaticVarCompensator.q", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, StaticVarCompensator::getQ, StaticVarCompensator::setQ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("sVCControlMode", new AttrDetails("StaticVarCompensator.sVCControlMode", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, StaticVarCompensator::getSVCControlMode, StaticVarCompensator::setSVCControlMode));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("slope", new AttrDetails("StaticVarCompensator.slope", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, StaticVarCompensator::getSlope, StaticVarCompensator::setSlope));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("voltageSetPoint", new AttrDetails("StaticVarCompensator.voltageSetPoint", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, StaticVarCompensator::getVoltageSetPoint, StaticVarCompensator::setVoltageSetPoint));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new StaticVarCompensator(null).allAttrDetailsMap());
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
