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
 * This class represents the external network and it is used for IEC 60909 calculations.
 */
@SuppressWarnings("unused")
public class ExternalNetworkInjection extends RegulatingCondEq {

    private static final Logging LOG = Logging.getLogger(ExternalNetworkInjection.class);

    /**
     * Constructor.
     */
    public ExternalNetworkInjection(String rdfid) {
        super("ExternalNetworkInjection", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExternalNetworkInjection(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Power Frequency Bias. This is the change in power injection divided by the change in frequency and negated.  A positive value of the power frequency bias provides additional power injection upon a drop in frequency.
     */
    private Double governorSCD; // ActivePowerPerFrequency

    public Double getGovernorSCD() {
        return governorSCD;
    }

    public void setGovernorSCD(Double _value_) {
        governorSCD = _value_;
    }

    private static Object getGovernorSCD(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).getGovernorSCD();
    }

    private static void setGovernorSCD(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExternalNetworkInjection) _this_).setGovernorSCD((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExternalNetworkInjection) _this_).setGovernorSCD(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Indicates whether initial symmetrical short-circuit current and power have been calculated according to IEC (Ik`).  Used only if short circuit calculations are done according to superposition method.
     */
    private Boolean ikSecond; // Boolean

    public Boolean getIkSecond() {
        return ikSecond;
    }

    public void setIkSecond(Boolean _value_) {
        ikSecond = _value_;
    }

    private static Object getIkSecond(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).getIkSecond();
    }

    private static void setIkSecond(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ExternalNetworkInjection) _this_).setIkSecond((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ExternalNetworkInjection) _this_).setIkSecond(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Maximum initial symmetrical short-circuit currents (Ik` max) in A (Ik` = Sk`/(SQRT(3) Un)). Used for short circuit data exchange according to IEC 60909.
     */
    private Double maxInitialSymShCCurrent; // CurrentFlow

    public Double getMaxInitialSymShCCurrent() {
        return maxInitialSymShCCurrent;
    }

    public void setMaxInitialSymShCCurrent(Double _value_) {
        maxInitialSymShCCurrent = _value_;
    }

    private static Object getMaxInitialSymShCCurrent(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).getMaxInitialSymShCCurrent();
    }

    private static void setMaxInitialSymShCCurrent(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExternalNetworkInjection) _this_).setMaxInitialSymShCCurrent((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExternalNetworkInjection) _this_).setMaxInitialSymShCCurrent(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum active power of the injection.
     */
    private Double maxP; // ActivePower

    public Double getMaxP() {
        return maxP;
    }

    public void setMaxP(Double _value_) {
        maxP = _value_;
    }

    private static Object getMaxP(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).getMaxP();
    }

    private static void setMaxP(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExternalNetworkInjection) _this_).setMaxP((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExternalNetworkInjection) _this_).setMaxP(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum reactive power limit. It is used for modelling of infeed for load flow exchange and not for short circuit modelling.
     */
    private Double maxQ; // ReactivePower

    public Double getMaxQ() {
        return maxQ;
    }

    public void setMaxQ(Double _value_) {
        maxQ = _value_;
    }

    private static Object getMaxQ(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).getMaxQ();
    }

    private static void setMaxQ(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExternalNetworkInjection) _this_).setMaxQ((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExternalNetworkInjection) _this_).setMaxQ(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum ratio of zero sequence resistance of Network Feeder to its zero sequence reactance (R(0)/X(0) max). Used for short circuit data exchange according to IEC 60909.
     */
    private Float maxR0ToX0Ratio; // Float

    public Float getMaxR0ToX0Ratio() {
        return maxR0ToX0Ratio;
    }

    public void setMaxR0ToX0Ratio(Float _value_) {
        maxR0ToX0Ratio = _value_;
    }

    private static Object getMaxR0ToX0Ratio(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).getMaxR0ToX0Ratio();
    }

    private static void setMaxR0ToX0Ratio(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExternalNetworkInjection) _this_).setMaxR0ToX0Ratio((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExternalNetworkInjection) _this_).setMaxR0ToX0Ratio(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Maximum ratio of positive sequence resistance of Network Feeder to its positive sequence reactance (R(1)/X(1) max). Used for short circuit data exchange according to IEC 60909.
     */
    private Float maxR1ToX1Ratio; // Float

    public Float getMaxR1ToX1Ratio() {
        return maxR1ToX1Ratio;
    }

    public void setMaxR1ToX1Ratio(Float _value_) {
        maxR1ToX1Ratio = _value_;
    }

    private static Object getMaxR1ToX1Ratio(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).getMaxR1ToX1Ratio();
    }

    private static void setMaxR1ToX1Ratio(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExternalNetworkInjection) _this_).setMaxR1ToX1Ratio((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExternalNetworkInjection) _this_).setMaxR1ToX1Ratio(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Maximum ratio of zero sequence impedance to its positive sequence impedance (Z(0)/Z(1) max). Used for short circuit data exchange according to IEC 60909.
     */
    private Float maxZ0ToZ1Ratio; // Float

    public Float getMaxZ0ToZ1Ratio() {
        return maxZ0ToZ1Ratio;
    }

    public void setMaxZ0ToZ1Ratio(Float _value_) {
        maxZ0ToZ1Ratio = _value_;
    }

    private static Object getMaxZ0ToZ1Ratio(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).getMaxZ0ToZ1Ratio();
    }

    private static void setMaxZ0ToZ1Ratio(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExternalNetworkInjection) _this_).setMaxZ0ToZ1Ratio((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExternalNetworkInjection) _this_).setMaxZ0ToZ1Ratio(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Minimum initial symmetrical short-circuit currents (Ik` min) in A (Ik` = Sk`/(SQRT(3) Un)). Used for short circuit data exchange according to IEC 60909.
     */
    private Double minInitialSymShCCurrent; // CurrentFlow

    public Double getMinInitialSymShCCurrent() {
        return minInitialSymShCCurrent;
    }

    public void setMinInitialSymShCCurrent(Double _value_) {
        minInitialSymShCCurrent = _value_;
    }

    private static Object getMinInitialSymShCCurrent(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).getMinInitialSymShCCurrent();
    }

    private static void setMinInitialSymShCCurrent(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExternalNetworkInjection) _this_).setMinInitialSymShCCurrent((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExternalNetworkInjection) _this_).setMinInitialSymShCCurrent(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum active power of the injection.
     */
    private Double minP; // ActivePower

    public Double getMinP() {
        return minP;
    }

    public void setMinP(Double _value_) {
        minP = _value_;
    }

    private static Object getMinP(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).getMinP();
    }

    private static void setMinP(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExternalNetworkInjection) _this_).setMinP((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExternalNetworkInjection) _this_).setMinP(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum reactive power limit. It is used for modelling of infeed for load flow exchange and not for short circuit modelling.
     */
    private Double minQ; // ReactivePower

    public Double getMinQ() {
        return minQ;
    }

    public void setMinQ(Double _value_) {
        minQ = _value_;
    }

    private static Object getMinQ(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).getMinQ();
    }

    private static void setMinQ(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExternalNetworkInjection) _this_).setMinQ((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExternalNetworkInjection) _this_).setMinQ(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Indicates whether initial symmetrical short-circuit current and power have been calculated according to IEC (Ik`). Used for short circuit data exchange according to IEC 6090.
     */
    private Float minR0ToX0Ratio; // Float

    public Float getMinR0ToX0Ratio() {
        return minR0ToX0Ratio;
    }

    public void setMinR0ToX0Ratio(Float _value_) {
        minR0ToX0Ratio = _value_;
    }

    private static Object getMinR0ToX0Ratio(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).getMinR0ToX0Ratio();
    }

    private static void setMinR0ToX0Ratio(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExternalNetworkInjection) _this_).setMinR0ToX0Ratio((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExternalNetworkInjection) _this_).setMinR0ToX0Ratio(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Minimum ratio of positive sequence resistance of Network Feeder to its positive sequence reactance (R(1)/X(1) min). Used for short circuit data exchange according to IEC 60909.
     */
    private Float minR1ToX1Ratio; // Float

    public Float getMinR1ToX1Ratio() {
        return minR1ToX1Ratio;
    }

    public void setMinR1ToX1Ratio(Float _value_) {
        minR1ToX1Ratio = _value_;
    }

    private static Object getMinR1ToX1Ratio(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).getMinR1ToX1Ratio();
    }

    private static void setMinR1ToX1Ratio(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExternalNetworkInjection) _this_).setMinR1ToX1Ratio((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExternalNetworkInjection) _this_).setMinR1ToX1Ratio(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Minimum ratio of zero sequence impedance to its positive sequence impedance (Z(0)/Z(1) min). Used for short circuit data exchange according to IEC 60909.
     */
    private Float minZ0ToZ1Ratio; // Float

    public Float getMinZ0ToZ1Ratio() {
        return minZ0ToZ1Ratio;
    }

    public void setMinZ0ToZ1Ratio(Float _value_) {
        minZ0ToZ1Ratio = _value_;
    }

    private static Object getMinZ0ToZ1Ratio(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).getMinZ0ToZ1Ratio();
    }

    private static void setMinZ0ToZ1Ratio(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExternalNetworkInjection) _this_).setMinZ0ToZ1Ratio((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExternalNetworkInjection) _this_).setMinZ0ToZ1Ratio(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Active power injection. Load sign convention is used, i.e. positive sign means flow out from a node. Starting value for steady state solutions.
     */
    private Double p; // ActivePower

    public Double getP() {
        return p;
    }

    public void setP(Double _value_) {
        p = _value_;
    }

    private static Object getP(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).getP();
    }

    private static void setP(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExternalNetworkInjection) _this_).setP((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExternalNetworkInjection) _this_).setP(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive power injection. Load sign convention is used, i.e. positive sign means flow out from a node. Starting value for steady state solutions.
     */
    private Double q; // ReactivePower

    public Double getQ() {
        return q;
    }

    public void setQ(Double _value_) {
        q = _value_;
    }

    private static Object getQ(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).getQ();
    }

    private static void setQ(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExternalNetworkInjection) _this_).setQ((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExternalNetworkInjection) _this_).setQ(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Priority of unit for use as powerflow voltage phase angle reference bus selection. 0 = don t care (default) 1 = highest priority. 2 is less than 1 and so on.
     */
    private Integer referencePriority; // Integer

    public Integer getReferencePriority() {
        return referencePriority;
    }

    public void setReferencePriority(Integer _value_) {
        referencePriority = _value_;
    }

    private static Object getReferencePriority(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).getReferencePriority();
    }

    private static void setReferencePriority(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((ExternalNetworkInjection) _this_).setReferencePriority((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((ExternalNetworkInjection) _this_).setReferencePriority(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
        }
    }

    /**
     * Voltage factor in pu, which was used to calculate short-circuit current Ik` and power Sk`.  Used only if short circuit calculations are done according to superposition method.
     */
    private Double voltageFactor; // PU

    public Double getVoltageFactor() {
        return voltageFactor;
    }

    public void setVoltageFactor(Double _value_) {
        voltageFactor = _value_;
    }

    private static Object getVoltageFactor(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).getVoltageFactor();
    }

    private static void setVoltageFactor(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExternalNetworkInjection) _this_).setVoltageFactor((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExternalNetworkInjection) _this_).setVoltageFactor(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExternalNetworkInjection", attrName));
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
                "ExternalNetworkInjection", attrName, value));
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
            map.put("governorSCD", new AttrDetails("ExternalNetworkInjection.governorSCD", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::getGovernorSCD, ExternalNetworkInjection::setGovernorSCD));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("ikSecond", new AttrDetails("ExternalNetworkInjection.ikSecond", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::getIkSecond, ExternalNetworkInjection::setIkSecond));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("maxInitialSymShCCurrent", new AttrDetails("ExternalNetworkInjection.maxInitialSymShCCurrent", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::getMaxInitialSymShCCurrent, ExternalNetworkInjection::setMaxInitialSymShCCurrent));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxP", new AttrDetails("ExternalNetworkInjection.maxP", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::getMaxP, ExternalNetworkInjection::setMaxP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxQ", new AttrDetails("ExternalNetworkInjection.maxQ", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::getMaxQ, ExternalNetworkInjection::setMaxQ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("maxR0ToX0Ratio", new AttrDetails("ExternalNetworkInjection.maxR0ToX0Ratio", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::getMaxR0ToX0Ratio, ExternalNetworkInjection::setMaxR0ToX0Ratio));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("maxR1ToX1Ratio", new AttrDetails("ExternalNetworkInjection.maxR1ToX1Ratio", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::getMaxR1ToX1Ratio, ExternalNetworkInjection::setMaxR1ToX1Ratio));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("maxZ0ToZ1Ratio", new AttrDetails("ExternalNetworkInjection.maxZ0ToZ1Ratio", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::getMaxZ0ToZ1Ratio, ExternalNetworkInjection::setMaxZ0ToZ1Ratio));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("minInitialSymShCCurrent", new AttrDetails("ExternalNetworkInjection.minInitialSymShCCurrent", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::getMinInitialSymShCCurrent, ExternalNetworkInjection::setMinInitialSymShCCurrent));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minP", new AttrDetails("ExternalNetworkInjection.minP", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::getMinP, ExternalNetworkInjection::setMinP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minQ", new AttrDetails("ExternalNetworkInjection.minQ", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::getMinQ, ExternalNetworkInjection::setMinQ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("minR0ToX0Ratio", new AttrDetails("ExternalNetworkInjection.minR0ToX0Ratio", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::getMinR0ToX0Ratio, ExternalNetworkInjection::setMinR0ToX0Ratio));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("minR1ToX1Ratio", new AttrDetails("ExternalNetworkInjection.minR1ToX1Ratio", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::getMinR1ToX1Ratio, ExternalNetworkInjection::setMinR1ToX1Ratio));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("minZ0ToZ1Ratio", new AttrDetails("ExternalNetworkInjection.minZ0ToZ1Ratio", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::getMinZ0ToZ1Ratio, ExternalNetworkInjection::setMinZ0ToZ1Ratio));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("p", new AttrDetails("ExternalNetworkInjection.p", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::getP, ExternalNetworkInjection::setP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("q", new AttrDetails("ExternalNetworkInjection.q", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::getQ, ExternalNetworkInjection::setQ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("referencePriority", new AttrDetails("ExternalNetworkInjection.referencePriority", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::getReferencePriority, ExternalNetworkInjection::setReferencePriority));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("voltageFactor", new AttrDetails("ExternalNetworkInjection.voltageFactor", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::getVoltageFactor, ExternalNetworkInjection::setVoltageFactor));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExternalNetworkInjection(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
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
