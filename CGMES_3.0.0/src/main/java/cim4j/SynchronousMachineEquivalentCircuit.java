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
 * The electrical equations for all variations of the synchronous models are based on the SynchronousEquivalentCircuit diagram for the direct- and quadrature- axes. Equations for conversion between equivalent circuit and time constant reactance forms: <i>Xd</i> = <i>Xad </i>+<i> Xl</i> <i>X'd</i> = <i>Xl</i> + <i>Xad</i> x <i>Xfd</i> / (<i>Xad</i> + <i>Xfd</i>) <i>X"d</i> = <i>Xl</i> + <i>Xad</i> x <i>Xfd</i> x <i>X1d</i> / (<i>Xad</i> x <i>Xfd</i> + <i>Xad</i> x <i>X1d</i> + <i>Xfd</i> x <i>X1d</i>) <i>Xq</i> = <i>Xaq</i> + <i>Xl</i> <i>X'q</i> = <i>Xl</i> + <i>Xaq</i> x <i>X1q</i> / (<i>Xaq</i> + <i>X1q</i>) <i>X"q</i> = <i>Xl</i> + <i>Xaq</i> x <i>X1q</i> x <i>X2q</i> / (<i>Xaq</i> x <i>X1q</i> + <i>Xaq</i> x <i>X2q</i> + <i>X1q</i> x <i>X2q</i>) <i>T'do</i> = (<i>Xad</i> + <i>Xfd</i>) / (<i>omega</i><i><sub>0</sub></i> x <i>Rfd</i>) <i>T"do</i> = (<i>Xad</i> x <i>Xfd</i> + <i>Xad</i> x <i>X1d</i> + <i>Xfd</i> x <i>X1d</i>) / (<i>omega</i><i><sub>0</sub></i> x <i>R1d</i> x (<i>Xad</i> + <i>Xfd</i>) <i>T'qo</i> = (<i>Xaq</i> + <i>X1q</i>) / (<i>omega</i><i><sub>0</sub></i> x <i>R1q</i>) <i>T"qo</i> = (<i>Xaq</i> x <i>X1q</i> + <i>Xaq</i> x <i>X2q</i> + <i>X1q</i> x <i>X2q</i>) / (<i>omega</i><i><sub>0</sub></i> x <i>R2q</i> x (<i>Xaq</i> + <i>X1q</i>) Same equations using CIM attributes from SynchronousMachineTimeConstantReactance class on left of "=" and SynchronousMachineEquivalentCircuit class on right (except as noted): xDirectSync = xad + RotatingMachineDynamics.statorLeakageReactance xDirectTrans = RotatingMachineDynamics.statorLeakageReactance + xad x xfd / (xad + xfd) xDirectSubtrans = RotatingMachineDynamics.statorLeakageReactance + xad x xfd x x1d / (xad x xfd + xad x x1d + xfd x x1d) xQuadSync = xaq + RotatingMachineDynamics.statorLeakageReactance xQuadTrans = RotatingMachineDynamics.statorLeakageReactance + xaq x x1q / (xaq+ x1q) xQuadSubtrans = RotatingMachineDynamics.statorLeakageReactance + xaq x x1q x x2q / (xaq x x1q + xaq x x2q + x1q x x2q)  tpdo = (xad + xfd) / (2 x pi x nominal frequency x rfd) tppdo = (xad x xfd + xad x x1d + xfd x x1d) / (2 x pi x nominal frequency x r1d x (xad + xfd) tpqo = (xaq + x1q) / (2 x pi x nominal frequency x r1q) tppqo = (xaq x x1q + xaq x x2q + x1q x x2q) / (2 x pi x nominal frequency x r2q x (xaq + x1q) These are only valid for a simplified model where "Canay" reactance is zero.
 */
@SuppressWarnings("unused")
public class SynchronousMachineEquivalentCircuit extends SynchronousMachineDetailed {

    private static final Logging LOG = Logging.getLogger(SynchronousMachineEquivalentCircuit.class);

    /**
     * Constructor.
     */
    public SynchronousMachineEquivalentCircuit(String rdfid) {
        super("SynchronousMachineEquivalentCircuit", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected SynchronousMachineEquivalentCircuit(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Direct-axis damper 1 winding resistance.
     */
    private Double r1d; // PU

    public Double getR1d() {
        return r1d;
    }

    public void setR1d(Double _value_) {
        r1d = _value_;
    }

    private static Object getR1d(BaseClass _this_) {
        return ((SynchronousMachineEquivalentCircuit) _this_).getR1d();
    }

    private static void setR1d(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineEquivalentCircuit) _this_).setR1d((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineEquivalentCircuit) _this_).setR1d(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Quadrature-axis damper 1 winding resistance.
     */
    private Double r1q; // PU

    public Double getR1q() {
        return r1q;
    }

    public void setR1q(Double _value_) {
        r1q = _value_;
    }

    private static Object getR1q(BaseClass _this_) {
        return ((SynchronousMachineEquivalentCircuit) _this_).getR1q();
    }

    private static void setR1q(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineEquivalentCircuit) _this_).setR1q((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineEquivalentCircuit) _this_).setR1q(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Quadrature-axis damper 2 winding resistance.
     */
    private Double r2q; // PU

    public Double getR2q() {
        return r2q;
    }

    public void setR2q(Double _value_) {
        r2q = _value_;
    }

    private static Object getR2q(BaseClass _this_) {
        return ((SynchronousMachineEquivalentCircuit) _this_).getR2q();
    }

    private static void setR2q(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineEquivalentCircuit) _this_).setR2q((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineEquivalentCircuit) _this_).setR2q(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Field winding resistance.
     */
    private Double rfd; // PU

    public Double getRfd() {
        return rfd;
    }

    public void setRfd(Double _value_) {
        rfd = _value_;
    }

    private static Object getRfd(BaseClass _this_) {
        return ((SynchronousMachineEquivalentCircuit) _this_).getRfd();
    }

    private static void setRfd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineEquivalentCircuit) _this_).setRfd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineEquivalentCircuit) _this_).setRfd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Direct-axis damper 1 winding leakage reactance.
     */
    private Double x1d; // PU

    public Double getX1d() {
        return x1d;
    }

    public void setX1d(Double _value_) {
        x1d = _value_;
    }

    private static Object getX1d(BaseClass _this_) {
        return ((SynchronousMachineEquivalentCircuit) _this_).getX1d();
    }

    private static void setX1d(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineEquivalentCircuit) _this_).setX1d((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineEquivalentCircuit) _this_).setX1d(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Quadrature-axis damper 1 winding leakage reactance.
     */
    private Double x1q; // PU

    public Double getX1q() {
        return x1q;
    }

    public void setX1q(Double _value_) {
        x1q = _value_;
    }

    private static Object getX1q(BaseClass _this_) {
        return ((SynchronousMachineEquivalentCircuit) _this_).getX1q();
    }

    private static void setX1q(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineEquivalentCircuit) _this_).setX1q((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineEquivalentCircuit) _this_).setX1q(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Quadrature-axis damper 2 winding leakage reactance.
     */
    private Double x2q; // PU

    public Double getX2q() {
        return x2q;
    }

    public void setX2q(Double _value_) {
        x2q = _value_;
    }

    private static Object getX2q(BaseClass _this_) {
        return ((SynchronousMachineEquivalentCircuit) _this_).getX2q();
    }

    private static void setX2q(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineEquivalentCircuit) _this_).setX2q((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineEquivalentCircuit) _this_).setX2q(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Direct-axis mutual reactance.
     */
    private Double xad; // PU

    public Double getXad() {
        return xad;
    }

    public void setXad(Double _value_) {
        xad = _value_;
    }

    private static Object getXad(BaseClass _this_) {
        return ((SynchronousMachineEquivalentCircuit) _this_).getXad();
    }

    private static void setXad(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineEquivalentCircuit) _this_).setXad((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineEquivalentCircuit) _this_).setXad(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Quadrature-axis mutual reactance.
     */
    private Double xaq; // PU

    public Double getXaq() {
        return xaq;
    }

    public void setXaq(Double _value_) {
        xaq = _value_;
    }

    private static Object getXaq(BaseClass _this_) {
        return ((SynchronousMachineEquivalentCircuit) _this_).getXaq();
    }

    private static void setXaq(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineEquivalentCircuit) _this_).setXaq((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineEquivalentCircuit) _this_).setXaq(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Differential mutual (`Canay`) reactance.
     */
    private Double xf1d; // PU

    public Double getXf1d() {
        return xf1d;
    }

    public void setXf1d(Double _value_) {
        xf1d = _value_;
    }

    private static Object getXf1d(BaseClass _this_) {
        return ((SynchronousMachineEquivalentCircuit) _this_).getXf1d();
    }

    private static void setXf1d(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineEquivalentCircuit) _this_).setXf1d((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineEquivalentCircuit) _this_).setXf1d(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Field winding leakage reactance.
     */
    private Double xfd; // PU

    public Double getXfd() {
        return xfd;
    }

    public void setXfd(Double _value_) {
        xfd = _value_;
    }

    private static Object getXfd(BaseClass _this_) {
        return ((SynchronousMachineEquivalentCircuit) _this_).getXfd();
    }

    private static void setXfd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineEquivalentCircuit) _this_).setXfd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineEquivalentCircuit) _this_).setXfd(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "SynchronousMachineEquivalentCircuit", attrName));
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
                "SynchronousMachineEquivalentCircuit", attrName, value));
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
            map.put("r1d", new AttrDetails("SynchronousMachineEquivalentCircuit.r1d", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineEquivalentCircuit::getR1d, SynchronousMachineEquivalentCircuit::setR1d));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("r1q", new AttrDetails("SynchronousMachineEquivalentCircuit.r1q", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineEquivalentCircuit::getR1q, SynchronousMachineEquivalentCircuit::setR1q));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("r2q", new AttrDetails("SynchronousMachineEquivalentCircuit.r2q", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineEquivalentCircuit::getR2q, SynchronousMachineEquivalentCircuit::setR2q));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rfd", new AttrDetails("SynchronousMachineEquivalentCircuit.rfd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineEquivalentCircuit::getRfd, SynchronousMachineEquivalentCircuit::setRfd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("x1d", new AttrDetails("SynchronousMachineEquivalentCircuit.x1d", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineEquivalentCircuit::getX1d, SynchronousMachineEquivalentCircuit::setX1d));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("x1q", new AttrDetails("SynchronousMachineEquivalentCircuit.x1q", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineEquivalentCircuit::getX1q, SynchronousMachineEquivalentCircuit::setX1q));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("x2q", new AttrDetails("SynchronousMachineEquivalentCircuit.x2q", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineEquivalentCircuit::getX2q, SynchronousMachineEquivalentCircuit::setX2q));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xad", new AttrDetails("SynchronousMachineEquivalentCircuit.xad", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineEquivalentCircuit::getXad, SynchronousMachineEquivalentCircuit::setXad));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xaq", new AttrDetails("SynchronousMachineEquivalentCircuit.xaq", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineEquivalentCircuit::getXaq, SynchronousMachineEquivalentCircuit::setXaq));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xf1d", new AttrDetails("SynchronousMachineEquivalentCircuit.xf1d", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineEquivalentCircuit::getXf1d, SynchronousMachineEquivalentCircuit::setXf1d));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xfd", new AttrDetails("SynchronousMachineEquivalentCircuit.xfd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineEquivalentCircuit::getXfd, SynchronousMachineEquivalentCircuit::setXfd));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new SynchronousMachineEquivalentCircuit(null).allAttrDetailsMap());
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
