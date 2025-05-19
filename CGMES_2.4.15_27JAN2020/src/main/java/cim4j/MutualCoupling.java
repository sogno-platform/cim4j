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
 * This class represents the zero sequence line mutual coupling.
 */
@SuppressWarnings("unused")
public class MutualCoupling extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(MutualCoupling.class);

    /**
     * Default constructor.
     */
    public MutualCoupling() {
        setCimType("MutualCoupling");
    }

    /**
     * The starting terminal for the calculation of distances along the first branch of the mutual coupling.  Normally MutualCoupling would only be used for terminals of AC line segments.  The first and second terminals of a mutual coupling should point to different AC line segments.
     */
    private Terminal First_Terminal; // ManyToOne

    public Terminal getFirst_Terminal() {
        return First_Terminal;
    }

    public void setFirst_Terminal(BaseClass _object_) {
        if (!(_object_ instanceof Terminal)) {
            throw new IllegalArgumentException("Object is not Terminal");
        }
        if (First_Terminal != _object_) {
            First_Terminal = (Terminal) _object_;
            First_Terminal.setHasFirstMutualCoupling(this);
        }
    }

    public String First_TerminalToString() {
        return First_Terminal != null ? First_Terminal.getRdfid() : null;
    }

    /**
     * The starting terminal for the calculation of distances along the second branch of the mutual coupling.
     */
    private Terminal Second_Terminal; // ManyToOne

    public Terminal getSecond_Terminal() {
        return Second_Terminal;
    }

    public void setSecond_Terminal(BaseClass _object_) {
        if (!(_object_ instanceof Terminal)) {
            throw new IllegalArgumentException("Object is not Terminal");
        }
        if (Second_Terminal != _object_) {
            Second_Terminal = (Terminal) _object_;
            Second_Terminal.setHasSecondMutualCoupling(this);
        }
    }

    public String Second_TerminalToString() {
        return Second_Terminal != null ? Second_Terminal.getRdfid() : null;
    }

    /**
     * Zero sequence mutual coupling shunt (charging) susceptance, uniformly distributed, of the entire line section.
     */
    private Double b0ch; // Susceptance

    public Double getB0ch() {
        return b0ch;
    }

    public void setB0ch(Double _value_) {
        b0ch = _value_;
    }

    public void setB0ch(String _value_) {
        b0ch = getDoubleFromString(_value_);
    }

    public String b0chToString() {
        return b0ch != null ? b0ch.toString() : null;
    }

    /**
     * Distance to the start of the coupled region from the first line`s terminal having sequence number equal to 1.
     */
    private Double distance11; // Length

    public Double getDistance11() {
        return distance11;
    }

    public void setDistance11(Double _value_) {
        distance11 = _value_;
    }

    public void setDistance11(String _value_) {
        distance11 = getDoubleFromString(_value_);
    }

    public String distance11ToString() {
        return distance11 != null ? distance11.toString() : null;
    }

    /**
     * Distance to the end of the coupled region from the first line`s terminal with sequence number equal to 1.
     */
    private Double distance12; // Length

    public Double getDistance12() {
        return distance12;
    }

    public void setDistance12(Double _value_) {
        distance12 = _value_;
    }

    public void setDistance12(String _value_) {
        distance12 = getDoubleFromString(_value_);
    }

    public String distance12ToString() {
        return distance12 != null ? distance12.toString() : null;
    }

    /**
     * Distance to the start of coupled region from the second line`s terminal with sequence number equal to 1.
     */
    private Double distance21; // Length

    public Double getDistance21() {
        return distance21;
    }

    public void setDistance21(Double _value_) {
        distance21 = _value_;
    }

    public void setDistance21(String _value_) {
        distance21 = getDoubleFromString(_value_);
    }

    public String distance21ToString() {
        return distance21 != null ? distance21.toString() : null;
    }

    /**
     * Distance to the end of coupled region from the second line`s terminal with sequence number equal to 1.
     */
    private Double distance22; // Length

    public Double getDistance22() {
        return distance22;
    }

    public void setDistance22(Double _value_) {
        distance22 = _value_;
    }

    public void setDistance22(String _value_) {
        distance22 = getDoubleFromString(_value_);
    }

    public String distance22ToString() {
        return distance22 != null ? distance22.toString() : null;
    }

    /**
     * Zero sequence mutual coupling shunt (charging) conductance, uniformly distributed, of the entire line section.
     */
    private Double g0ch; // Conductance

    public Double getG0ch() {
        return g0ch;
    }

    public void setG0ch(Double _value_) {
        g0ch = _value_;
    }

    public void setG0ch(String _value_) {
        g0ch = getDoubleFromString(_value_);
    }

    public String g0chToString() {
        return g0ch != null ? g0ch.toString() : null;
    }

    /**
     * Zero sequence branch-to-branch mutual impedance coupling, resistance.
     */
    private Double r0; // Resistance

    public Double getR0() {
        return r0;
    }

    public void setR0(Double _value_) {
        r0 = _value_;
    }

    public void setR0(String _value_) {
        r0 = getDoubleFromString(_value_);
    }

    public String r0ToString() {
        return r0 != null ? r0.toString() : null;
    }

    /**
     * Zero sequence branch-to-branch mutual impedance coupling, reactance.
     */
    private Double x0; // Reactance

    public Double getX0() {
        return x0;
    }

    public void setX0(Double _value_) {
        x0 = _value_;
    }

    public void setX0(String _value_) {
        x0 = getDoubleFromString(_value_);
    }

    public String x0ToString() {
        return x0 != null ? x0.toString() : null;
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
        return getAttribute("MutualCoupling", attrName);
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
        setAttribute("MutualCoupling", attrName, objectValue);
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
        setAttribute("MutualCoupling", attrName, stringValue);
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
            profiles.add(CGMESProfile.EQ);
            map.put("First_Terminal", new AttrDetails("MutualCoupling.First_Terminal", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("Second_Terminal", new AttrDetails("MutualCoupling.Second_Terminal", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("b0ch", new AttrDetails("MutualCoupling.b0ch", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("distance11", new AttrDetails("MutualCoupling.distance11", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("distance12", new AttrDetails("MutualCoupling.distance12", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("distance21", new AttrDetails("MutualCoupling.distance21", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("distance22", new AttrDetails("MutualCoupling.distance22", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("g0ch", new AttrDetails("MutualCoupling.g0ch", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r0", new AttrDetails("MutualCoupling.r0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x0", new AttrDetails("MutualCoupling.x0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new MutualCoupling().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("First_Terminal", new GetterSetter(this::First_TerminalToString, this::setFirst_Terminal, null));
        map.put("Second_Terminal", new GetterSetter(this::Second_TerminalToString, this::setSecond_Terminal, null));
        map.put("b0ch", new GetterSetter(this::b0chToString, null, this::setB0ch));
        map.put("distance11", new GetterSetter(this::distance11ToString, null, this::setDistance11));
        map.put("distance12", new GetterSetter(this::distance12ToString, null, this::setDistance12));
        map.put("distance21", new GetterSetter(this::distance21ToString, null, this::setDistance21));
        map.put("distance22", new GetterSetter(this::distance22ToString, null, this::setDistance22));
        map.put("g0ch", new GetterSetter(this::g0chToString, null, this::setG0ch));
        map.put("r0", new GetterSetter(this::r0ToString, null, this::setR0));
        map.put("x0", new GetterSetter(this::x0ToString, null, this::setX0));
        return map;
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
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
