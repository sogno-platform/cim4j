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
 * Parameter details: <ol> 	<li>If <i>X'' </i>=<i> X'</i>, a single cage (one equivalent rotor winding per axis) is modelled.</li> 	<li>The "<i>p</i>" in the attribute names is a substitution for a "prime" in the usual parameter notation, e.g. <i>tpo</i> refers to <i>T'o</i>.</li> </ol> The parameters used for models expressed in time constant reactance form include: - RotatingMachine.ratedS (<i>MVAbase</i>); - RotatingMachineDynamics.damping (<i>D</i>); - RotatingMachineDynamics.inertia (<i>H</i>); - RotatingMachineDynamics.saturationFactor (<i>S1</i>); - RotatingMachineDynamics.saturationFactor120 (<i>S12</i>); - RotatingMachineDynamics.statorLeakageReactance (<i>Xl</i>); - RotatingMachineDynamics.statorResistance (<i>Rs</i>); - .xs (<i>Xs</i>); - .xp (<i>X'</i>); - .xpp (<i>X''</i>); - .tpo (<i>T'o</i>); - .tppo (<i>T''o</i>).
 */
@SuppressWarnings("unused")
public class AsynchronousMachineTimeConstantReactance extends AsynchronousMachineDynamics {

    private static final Logging LOG = Logging.getLogger(AsynchronousMachineTimeConstantReactance.class);

    /**
     * Default constructor.
     */
    public AsynchronousMachineTimeConstantReactance() {
        setCimType("AsynchronousMachineTimeConstantReactance");
    }

    /**
     * Transient rotor time constant (&lt;i&gt;T`o&lt;/i&gt;) (&amp;gt; AsynchronousMachineTimeConstantReactance.tppo).  Typical value = 5.
     */
    private Double tpo; // Seconds

    public Double getTpo() {
        return tpo;
    }

    public void setTpo(Double _value_) {
        tpo = _value_;
    }

    public void setTpo(String _value_) {
        tpo = getDoubleFromString(_value_);
    }

    public String tpoToString() {
        return tpo != null ? tpo.toString() : null;
    }

    /**
     * Subtransient rotor time constant (&lt;i&gt;T``o&lt;/i&gt;) (&amp;gt; 0).  Typical value = 0,03.
     */
    private Double tppo; // Seconds

    public Double getTppo() {
        return tppo;
    }

    public void setTppo(Double _value_) {
        tppo = _value_;
    }

    public void setTppo(String _value_) {
        tppo = getDoubleFromString(_value_);
    }

    public String tppoToString() {
        return tppo != null ? tppo.toString() : null;
    }

    /**
     * Transient reactance (unsaturated) (&lt;i&gt;X`&lt;/i&gt;) (&amp;gt;= AsynchronousMachineTimeConstantReactance.xpp).  Typical value = 0,5.
     */
    private Double xp; // PU

    public Double getXp() {
        return xp;
    }

    public void setXp(Double _value_) {
        xp = _value_;
    }

    public void setXp(String _value_) {
        xp = getDoubleFromString(_value_);
    }

    public String xpToString() {
        return xp != null ? xp.toString() : null;
    }

    /**
     * Subtransient reactance (unsaturated) (&lt;i&gt;X``&lt;/i&gt;) (&amp;gt; RotatingMachineDynamics.statorLeakageReactance).  Typical value = 0,2.
     */
    private Double xpp; // PU

    public Double getXpp() {
        return xpp;
    }

    public void setXpp(Double _value_) {
        xpp = _value_;
    }

    public void setXpp(String _value_) {
        xpp = getDoubleFromString(_value_);
    }

    public String xppToString() {
        return xpp != null ? xpp.toString() : null;
    }

    /**
     * Synchronous reactance (&lt;i&gt;Xs&lt;/i&gt;) (&amp;gt;= AsynchronousMachineTimeConstantReactance.xp).  Typical value = 1,8.
     */
    private Double xs; // PU

    public Double getXs() {
        return xs;
    }

    public void setXs(Double _value_) {
        xs = _value_;
    }

    public void setXs(String _value_) {
        xs = getDoubleFromString(_value_);
    }

    public String xsToString() {
        return xs != null ? xs.toString() : null;
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
        return getAttribute("AsynchronousMachineTimeConstantReactance", attrName);
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
        setAttribute("AsynchronousMachineTimeConstantReactance", attrName, objectValue);
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
        setAttribute("AsynchronousMachineTimeConstantReactance", attrName, stringValue);
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

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/CIM100#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpo", new AttrDetails("AsynchronousMachineTimeConstantReactance.tpo", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tppo", new AttrDetails("AsynchronousMachineTimeConstantReactance.tppo", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xp", new AttrDetails("AsynchronousMachineTimeConstantReactance.xp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xpp", new AttrDetails("AsynchronousMachineTimeConstantReactance.xpp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xs", new AttrDetails("AsynchronousMachineTimeConstantReactance.xs", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new AsynchronousMachineTimeConstantReactance().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("tpo", new GetterSetter(this::tpoToString, null, this::setTpo));
        map.put("tppo", new GetterSetter(this::tppoToString, null, this::setTppo));
        map.put("xp", new GetterSetter(this::xpToString, null, this::setXp));
        map.put("xpp", new GetterSetter(this::xppToString, null, this::setXpp));
        map.put("xs", new GetterSetter(this::xsToString, null, this::setXs));
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
