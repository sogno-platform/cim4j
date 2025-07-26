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
 * This class represents equivalent injections (generation or load).  Voltage regulation is allowed only at the point of connection.
 */
@SuppressWarnings("unused")
public class EquivalentInjection extends EquivalentEquipment {

    private static final Logging LOG = Logging.getLogger(EquivalentInjection.class);

    /**
     * Constructor.
     */
    public EquivalentInjection(String rdfid) {
        super("EquivalentInjection", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected EquivalentInjection(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The equivalent injection using this reactive capability curve.
     */
    private ReactiveCapabilityCurve ReactiveCapabilityCurve; // ManyToOne

    private String ReactiveCapabilityCurveId;

    public ReactiveCapabilityCurve getReactiveCapabilityCurve() {
        return ReactiveCapabilityCurve;
    }

    public void setReactiveCapabilityCurve(ReactiveCapabilityCurve _object_) {
        if (ReactiveCapabilityCurve != _object_) {
            ReactiveCapabilityCurve = _object_;
            _object_.setEquivalentInjection(this);
            ReactiveCapabilityCurveId = _object_.getRdfid();
        }
    }

    private static Object getReactiveCapabilityCurve(BaseClass _this_) {
        var obj = ((EquivalentInjection) _this_).getReactiveCapabilityCurve();
        var id = ((EquivalentInjection) _this_).ReactiveCapabilityCurveId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setReactiveCapabilityCurve(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((EquivalentInjection) _this_).ReactiveCapabilityCurveId = (String) _value_;
        } else if (_value_ instanceof ReactiveCapabilityCurve) {
            ((EquivalentInjection) _this_).setReactiveCapabilityCurve((ReactiveCapabilityCurve) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ReactiveCapabilityCurve");
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
        return ((EquivalentInjection) _this_).getMaxP();
    }

    private static void setMaxP(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentInjection) _this_).setMaxP((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentInjection) _this_).setMaxP(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Used for modeling of infeed for load flow exchange. Not used for short circuit modeling.  If maxQ and minQ are not used ReactiveCapabilityCurve can be used.
     */
    private Double maxQ; // ReactivePower

    public Double getMaxQ() {
        return maxQ;
    }

    public void setMaxQ(Double _value_) {
        maxQ = _value_;
    }

    private static Object getMaxQ(BaseClass _this_) {
        return ((EquivalentInjection) _this_).getMaxQ();
    }

    private static void setMaxQ(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentInjection) _this_).setMaxQ((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentInjection) _this_).setMaxQ(getDoubleFromString((String) _value_));
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
        return ((EquivalentInjection) _this_).getMinP();
    }

    private static void setMinP(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentInjection) _this_).setMinP((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentInjection) _this_).setMinP(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Used for modeling of infeed for load flow exchange. Not used for short circuit modeling.  If maxQ and minQ are not used ReactiveCapabilityCurve can be used.
     */
    private Double minQ; // ReactivePower

    public Double getMinQ() {
        return minQ;
    }

    public void setMinQ(Double _value_) {
        minQ = _value_;
    }

    private static Object getMinQ(BaseClass _this_) {
        return ((EquivalentInjection) _this_).getMinQ();
    }

    private static void setMinQ(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentInjection) _this_).setMinQ((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentInjection) _this_).setMinQ(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Equivalent active power injection. Load sign convention is used, i.e. positive sign means flow out from a node. Starting value for steady state solutions.
     */
    private Double p; // ActivePower

    public Double getP() {
        return p;
    }

    public void setP(Double _value_) {
        p = _value_;
    }

    private static Object getP(BaseClass _this_) {
        return ((EquivalentInjection) _this_).getP();
    }

    private static void setP(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentInjection) _this_).setP((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentInjection) _this_).setP(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Equivalent reactive power injection. Load sign convention is used, i.e. positive sign means flow out from a node. Starting value for steady state solutions.
     */
    private Double q; // ReactivePower

    public Double getQ() {
        return q;
    }

    public void setQ(Double _value_) {
        q = _value_;
    }

    private static Object getQ(BaseClass _this_) {
        return ((EquivalentInjection) _this_).getQ();
    }

    private static void setQ(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentInjection) _this_).setQ((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentInjection) _this_).setQ(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Positive sequence resistance. Used to represent Extended-Ward (IEC 60909). Usage : Extended-Ward is a result of network reduction prior to the data exchange.
     */
    private Double r; // Resistance

    public Double getR() {
        return r;
    }

    public void setR(Double _value_) {
        r = _value_;
    }

    private static Object getR(BaseClass _this_) {
        return ((EquivalentInjection) _this_).getR();
    }

    private static void setR(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentInjection) _this_).setR((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentInjection) _this_).setR(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Zero sequence resistance. Used to represent Extended-Ward (IEC 60909). Usage : Extended-Ward is a result of network reduction prior to the data exchange.
     */
    private Double r0; // Resistance

    public Double getR0() {
        return r0;
    }

    public void setR0(Double _value_) {
        r0 = _value_;
    }

    private static Object getR0(BaseClass _this_) {
        return ((EquivalentInjection) _this_).getR0();
    }

    private static void setR0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentInjection) _this_).setR0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentInjection) _this_).setR0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Negative sequence resistance. Used to represent Extended-Ward (IEC 60909). Usage : Extended-Ward is a result of network reduction prior to the data exchange.
     */
    private Double r2; // Resistance

    public Double getR2() {
        return r2;
    }

    public void setR2(Double _value_) {
        r2 = _value_;
    }

    private static Object getR2(BaseClass _this_) {
        return ((EquivalentInjection) _this_).getR2();
    }

    private static void setR2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentInjection) _this_).setR2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentInjection) _this_).setR2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Specifies whether or not the EquivalentInjection has the capability to regulate the local voltage.
     */
    private Boolean regulationCapability; // Boolean

    public Boolean getRegulationCapability() {
        return regulationCapability;
    }

    public void setRegulationCapability(Boolean _value_) {
        regulationCapability = _value_;
    }

    private static Object getRegulationCapability(BaseClass _this_) {
        return ((EquivalentInjection) _this_).getRegulationCapability();
    }

    private static void setRegulationCapability(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((EquivalentInjection) _this_).setRegulationCapability((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentInjection) _this_).setRegulationCapability(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Specifies the default regulation status of the EquivalentInjection.  True is regulating.  False is not regulating.
     */
    private Boolean regulationStatus; // Boolean

    public Boolean getRegulationStatus() {
        return regulationStatus;
    }

    public void setRegulationStatus(Boolean _value_) {
        regulationStatus = _value_;
    }

    private static Object getRegulationStatus(BaseClass _this_) {
        return ((EquivalentInjection) _this_).getRegulationStatus();
    }

    private static void setRegulationStatus(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((EquivalentInjection) _this_).setRegulationStatus((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentInjection) _this_).setRegulationStatus(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * The target voltage for voltage regulation.
     */
    private Double regulationTarget; // Voltage

    public Double getRegulationTarget() {
        return regulationTarget;
    }

    public void setRegulationTarget(Double _value_) {
        regulationTarget = _value_;
    }

    private static Object getRegulationTarget(BaseClass _this_) {
        return ((EquivalentInjection) _this_).getRegulationTarget();
    }

    private static void setRegulationTarget(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentInjection) _this_).setRegulationTarget((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentInjection) _this_).setRegulationTarget(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Positive sequence reactance. Used to represent Extended-Ward (IEC 60909). Usage : Extended-Ward is a result of network reduction prior to the data exchange.
     */
    private Double x; // Reactance

    public Double getX() {
        return x;
    }

    public void setX(Double _value_) {
        x = _value_;
    }

    private static Object getX(BaseClass _this_) {
        return ((EquivalentInjection) _this_).getX();
    }

    private static void setX(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentInjection) _this_).setX((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentInjection) _this_).setX(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Zero sequence reactance. Used to represent Extended-Ward (IEC 60909). Usage : Extended-Ward is a result of network reduction prior to the data exchange.
     */
    private Double x0; // Reactance

    public Double getX0() {
        return x0;
    }

    public void setX0(Double _value_) {
        x0 = _value_;
    }

    private static Object getX0(BaseClass _this_) {
        return ((EquivalentInjection) _this_).getX0();
    }

    private static void setX0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentInjection) _this_).setX0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentInjection) _this_).setX0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Negative sequence reactance. Used to represent Extended-Ward (IEC 60909). Usage : Extended-Ward is a result of network reduction prior to the data exchange.
     */
    private Double x2; // Reactance

    public Double getX2() {
        return x2;
    }

    public void setX2(Double _value_) {
        x2 = _value_;
    }

    private static Object getX2(BaseClass _this_) {
        return ((EquivalentInjection) _this_).getX2();
    }

    private static void setX2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentInjection) _this_).setX2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentInjection) _this_).setX2(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "EquivalentInjection", attrName));
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
                "EquivalentInjection", attrName, value));
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
            map.put("ReactiveCapabilityCurve", new AttrDetails("EquivalentInjection.ReactiveCapabilityCurve", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, EquivalentInjection::getReactiveCapabilityCurve, EquivalentInjection::setReactiveCapabilityCurve));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxP", new AttrDetails("EquivalentInjection.maxP", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::getMaxP, EquivalentInjection::setMaxP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxQ", new AttrDetails("EquivalentInjection.maxQ", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::getMaxQ, EquivalentInjection::setMaxQ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minP", new AttrDetails("EquivalentInjection.minP", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::getMinP, EquivalentInjection::setMinP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minQ", new AttrDetails("EquivalentInjection.minQ", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::getMinQ, EquivalentInjection::setMinQ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("p", new AttrDetails("EquivalentInjection.p", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::getP, EquivalentInjection::setP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("q", new AttrDetails("EquivalentInjection.q", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::getQ, EquivalentInjection::setQ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r", new AttrDetails("EquivalentInjection.r", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::getR, EquivalentInjection::setR));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r0", new AttrDetails("EquivalentInjection.r0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::getR0, EquivalentInjection::setR0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r2", new AttrDetails("EquivalentInjection.r2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::getR2, EquivalentInjection::setR2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("regulationCapability", new AttrDetails("EquivalentInjection.regulationCapability", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::getRegulationCapability, EquivalentInjection::setRegulationCapability));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("regulationStatus", new AttrDetails("EquivalentInjection.regulationStatus", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::getRegulationStatus, EquivalentInjection::setRegulationStatus));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("regulationTarget", new AttrDetails("EquivalentInjection.regulationTarget", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::getRegulationTarget, EquivalentInjection::setRegulationTarget));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x", new AttrDetails("EquivalentInjection.x", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::getX, EquivalentInjection::setX));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x0", new AttrDetails("EquivalentInjection.x0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::getX0, EquivalentInjection::setX0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x2", new AttrDetails("EquivalentInjection.x2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::getX2, EquivalentInjection::setX2));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new EquivalentInjection(null).allAttrDetailsMap());
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
