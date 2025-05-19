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
 * The electrical equations for all variations of the synchronous models are based on the SynchronousEquivalentCircuit diagram for the direct and quadrature axes.    =  +   =  +  *  / ( + )  =  +  * *  / ( *  +  *  +  * )  =  +   =  +  *  / (+ )  =  +  **  / ( *  +  *  +  * )  = ( + ) / ( * )  = ( *  +  *  +  * ) / ( *  * ( + )  = ( + ) / ( * )  = ( *  +  *  +  * )/ ( *  * ( + ) Same equations using CIM attributes from SynchronousMachineTimeConstantReactance class on left of = sign and SynchronousMachineEquivalentCircuit class on right (except as noted): xDirectSync = xad + RotatingMachineDynamics.statorLeakageReactance xDirectTrans = RotatingMachineDynamics.statorLeakageReactance + xad * xfd / (xad + xfd) xDirectSubtrans = RotatingMachineDynamics.statorLeakageReactance + xad * xfd * x1d / (xad * xfd + xad * x1d + xfd * x1d) xQuadSync = xaq + RotatingMachineDynamics.statorLeakageReactance xQuadTrans = RotatingMachineDynamics.statorLeakageReactance + xaq * x1q / (xaq+ x1q) xQuadSubtrans = RotatingMachineDynamics.statorLeakageReactance + xaq * x1q* x2q / (xaq * x1q + xaq * x2q + x1q * x2q)  tpdo = (xad + xfd) / (2*pi*nominal frequency * rfd) tppdo = (xad * xfd + xad * x1d + xfd * x1d) / (2*pi*nominal frequency * r1d * (xad + xfd) tpqo = (xaq + x1q) / (2*pi*nominal frequency * r1q) tppqo = (xaq * x1q + xaq * x2q + x1q * x2q)/ (2*pi*nominal frequency * r2q * (xaq + x1q).  Are only valid for a simplified model where "Canay" reactance is zero.
 */
@SuppressWarnings("unused")
public class SynchronousMachineEquivalentCircuit extends SynchronousMachineDetailed {

    private static final Logging LOG = Logging.getLogger(SynchronousMachineEquivalentCircuit.class);

    /**
     * Default constructor.
     */
    public SynchronousMachineEquivalentCircuit() {
        setCimType("SynchronousMachineEquivalentCircuit");
    }

    /**
     * D-axis damper 1 winding resistance.
     */
    private Double r1d; // PU

    public Double getR1d() {
        return r1d;
    }

    public void setR1d(Double _value_) {
        r1d = _value_;
    }

    public void setR1d(String _value_) {
        r1d = getDoubleFromString(_value_);
    }

    public String r1dToString() {
        return r1d != null ? r1d.toString() : null;
    }

    /**
     * Q-axis damper 1 winding resistance.
     */
    private Double r1q; // PU

    public Double getR1q() {
        return r1q;
    }

    public void setR1q(Double _value_) {
        r1q = _value_;
    }

    public void setR1q(String _value_) {
        r1q = getDoubleFromString(_value_);
    }

    public String r1qToString() {
        return r1q != null ? r1q.toString() : null;
    }

    /**
     * Q-axis damper 2 winding resistance.
     */
    private Double r2q; // PU

    public Double getR2q() {
        return r2q;
    }

    public void setR2q(Double _value_) {
        r2q = _value_;
    }

    public void setR2q(String _value_) {
        r2q = getDoubleFromString(_value_);
    }

    public String r2qToString() {
        return r2q != null ? r2q.toString() : null;
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

    public void setRfd(String _value_) {
        rfd = getDoubleFromString(_value_);
    }

    public String rfdToString() {
        return rfd != null ? rfd.toString() : null;
    }

    /**
     * D-axis damper 1 winding leakage reactance.
     */
    private Double x1d; // PU

    public Double getX1d() {
        return x1d;
    }

    public void setX1d(Double _value_) {
        x1d = _value_;
    }

    public void setX1d(String _value_) {
        x1d = getDoubleFromString(_value_);
    }

    public String x1dToString() {
        return x1d != null ? x1d.toString() : null;
    }

    /**
     * Q-axis damper 1 winding leakage reactance.
     */
    private Double x1q; // PU

    public Double getX1q() {
        return x1q;
    }

    public void setX1q(Double _value_) {
        x1q = _value_;
    }

    public void setX1q(String _value_) {
        x1q = getDoubleFromString(_value_);
    }

    public String x1qToString() {
        return x1q != null ? x1q.toString() : null;
    }

    /**
     * Q-axis damper 2 winding leakage reactance.
     */
    private Double x2q; // PU

    public Double getX2q() {
        return x2q;
    }

    public void setX2q(Double _value_) {
        x2q = _value_;
    }

    public void setX2q(String _value_) {
        x2q = getDoubleFromString(_value_);
    }

    public String x2qToString() {
        return x2q != null ? x2q.toString() : null;
    }

    /**
     * D-axis mutual reactance.
     */
    private Double xad; // PU

    public Double getXad() {
        return xad;
    }

    public void setXad(Double _value_) {
        xad = _value_;
    }

    public void setXad(String _value_) {
        xad = getDoubleFromString(_value_);
    }

    public String xadToString() {
        return xad != null ? xad.toString() : null;
    }

    /**
     * Q-axis mutual reactance.
     */
    private Double xaq; // PU

    public Double getXaq() {
        return xaq;
    }

    public void setXaq(Double _value_) {
        xaq = _value_;
    }

    public void setXaq(String _value_) {
        xaq = getDoubleFromString(_value_);
    }

    public String xaqToString() {
        return xaq != null ? xaq.toString() : null;
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

    public void setXf1d(String _value_) {
        xf1d = getDoubleFromString(_value_);
    }

    public String xf1dToString() {
        return xf1d != null ? xf1d.toString() : null;
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

    public void setXfd(String _value_) {
        xfd = getDoubleFromString(_value_);
    }

    public String xfdToString() {
        return xfd != null ? xfd.toString() : null;
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
     * Get an attribute value as string.
     *
     * @param attrName The attribute name
     * @return         The attribute value
     */
    @Override
    public String getAttribute(String attrName) {
        return getAttribute("SynchronousMachineEquivalentCircuit", attrName);
    }

    @Override
    protected String getAttribute(String className, String attrName) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var getterFunction = classGetterSetterMap.get(attrName).getter;
            return getterFunction.get();
        }
        return super.getAttribute(className, attrName);
    }

    /**
     * Set an attribute value as object (for class and list attributes).
     *
     * @param attrName    The attribute name
     * @param objectValue The attribute value as object
     */
    @Override
    public void setAttribute(String attrName, BaseClass objectValue) {
        setAttribute("SynchronousMachineEquivalentCircuit", attrName, objectValue);
    }

    @Override
    protected void setAttribute(String className, String attrName, BaseClass objectValue) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var setterFunction = classGetterSetterMap.get(attrName).objectSetter;
            setterFunction.accept(objectValue);
        } else {
            super.setAttribute(className, attrName, objectValue);
        }
    }

    /**
     * Set an attribute value as string (for primitive (including datatype) and enum attributes).
     *
     * @param attrName    The attribute name
     * @param stringValue The attribute value as string
     */
    @Override
    public void setAttribute(String attrName, String stringValue) {
        setAttribute("SynchronousMachineEquivalentCircuit", attrName, stringValue);
    }

    @Override
    protected void setAttribute(String className, String attrName, String stringValue) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var setterFunction = classGetterSetterMap.get(attrName).stringSetter;
            setterFunction.accept(stringValue);
        } else {
            super.setAttribute(className, attrName, stringValue);
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
            map.put("r1d", new AttrDetails("SynchronousMachineEquivalentCircuit.r1d", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("r1q", new AttrDetails("SynchronousMachineEquivalentCircuit.r1q", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("r2q", new AttrDetails("SynchronousMachineEquivalentCircuit.r2q", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rfd", new AttrDetails("SynchronousMachineEquivalentCircuit.rfd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("x1d", new AttrDetails("SynchronousMachineEquivalentCircuit.x1d", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("x1q", new AttrDetails("SynchronousMachineEquivalentCircuit.x1q", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("x2q", new AttrDetails("SynchronousMachineEquivalentCircuit.x2q", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xad", new AttrDetails("SynchronousMachineEquivalentCircuit.xad", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xaq", new AttrDetails("SynchronousMachineEquivalentCircuit.xaq", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xf1d", new AttrDetails("SynchronousMachineEquivalentCircuit.xf1d", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xfd", new AttrDetails("SynchronousMachineEquivalentCircuit.xfd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new SynchronousMachineEquivalentCircuit().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("r1d", new GetterSetter(this::r1dToString, null, this::setR1d));
        map.put("r1q", new GetterSetter(this::r1qToString, null, this::setR1q));
        map.put("r2q", new GetterSetter(this::r2qToString, null, this::setR2q));
        map.put("rfd", new GetterSetter(this::rfdToString, null, this::setRfd));
        map.put("x1d", new GetterSetter(this::x1dToString, null, this::setX1d));
        map.put("x1q", new GetterSetter(this::x1qToString, null, this::setX1q));
        map.put("x2q", new GetterSetter(this::x2qToString, null, this::setX2q));
        map.put("xad", new GetterSetter(this::xadToString, null, this::setXad));
        map.put("xaq", new GetterSetter(this::xaqToString, null, this::setXaq));
        map.put("xf1d", new GetterSetter(this::xf1dToString, null, this::setXf1d));
        map.put("xfd", new GetterSetter(this::xfdToString, null, this::setXfd));
        return map;
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
