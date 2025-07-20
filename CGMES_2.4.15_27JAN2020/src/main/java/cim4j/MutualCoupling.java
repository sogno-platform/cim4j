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
     * Constructor.
     */
    public MutualCoupling(String rdfid) {
        super("MutualCoupling", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected MutualCoupling(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The starting terminal for the calculation of distances along the first branch of the mutual coupling.  Normally MutualCoupling would only be used for terminals of AC line segments.  The first and second terminals of a mutual coupling should point to different AC line segments.
     */
    private Terminal First_Terminal; // ManyToOne

    private String First_TerminalId;

    public Terminal getFirst_Terminal() {
        return First_Terminal;
    }

    public void setFirst_Terminal(Terminal _object_) {
        if (First_Terminal != _object_) {
            First_Terminal = _object_;
            _object_.setHasFirstMutualCoupling(this);
            First_TerminalId = _object_.getRdfid();
        }
    }

    private static Object getFirst_Terminal(BaseClass _this_) {
        var obj = ((MutualCoupling) _this_).getFirst_Terminal();
        var id = ((MutualCoupling) _this_).First_TerminalId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setFirst_Terminal(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((MutualCoupling) _this_).First_TerminalId = (String) _value_;
        } else if (_value_ instanceof Terminal) {
            ((MutualCoupling) _this_).setFirst_Terminal((Terminal) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Terminal");
        }
    }

    /**
     * The starting terminal for the calculation of distances along the second branch of the mutual coupling.
     */
    private Terminal Second_Terminal; // ManyToOne

    private String Second_TerminalId;

    public Terminal getSecond_Terminal() {
        return Second_Terminal;
    }

    public void setSecond_Terminal(Terminal _object_) {
        if (Second_Terminal != _object_) {
            Second_Terminal = _object_;
            _object_.setHasSecondMutualCoupling(this);
            Second_TerminalId = _object_.getRdfid();
        }
    }

    private static Object getSecond_Terminal(BaseClass _this_) {
        var obj = ((MutualCoupling) _this_).getSecond_Terminal();
        var id = ((MutualCoupling) _this_).Second_TerminalId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setSecond_Terminal(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((MutualCoupling) _this_).Second_TerminalId = (String) _value_;
        } else if (_value_ instanceof Terminal) {
            ((MutualCoupling) _this_).setSecond_Terminal((Terminal) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Terminal");
        }
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

    private static Object getB0ch(BaseClass _this_) {
        return ((MutualCoupling) _this_).getB0ch();
    }

    private static void setB0ch(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((MutualCoupling) _this_).setB0ch((Double) _value_);
        } else if (_value_ instanceof String) {
            ((MutualCoupling) _this_).setB0ch(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getDistance11(BaseClass _this_) {
        return ((MutualCoupling) _this_).getDistance11();
    }

    private static void setDistance11(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((MutualCoupling) _this_).setDistance11((Double) _value_);
        } else if (_value_ instanceof String) {
            ((MutualCoupling) _this_).setDistance11(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getDistance12(BaseClass _this_) {
        return ((MutualCoupling) _this_).getDistance12();
    }

    private static void setDistance12(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((MutualCoupling) _this_).setDistance12((Double) _value_);
        } else if (_value_ instanceof String) {
            ((MutualCoupling) _this_).setDistance12(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getDistance21(BaseClass _this_) {
        return ((MutualCoupling) _this_).getDistance21();
    }

    private static void setDistance21(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((MutualCoupling) _this_).setDistance21((Double) _value_);
        } else if (_value_ instanceof String) {
            ((MutualCoupling) _this_).setDistance21(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getDistance22(BaseClass _this_) {
        return ((MutualCoupling) _this_).getDistance22();
    }

    private static void setDistance22(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((MutualCoupling) _this_).setDistance22((Double) _value_);
        } else if (_value_ instanceof String) {
            ((MutualCoupling) _this_).setDistance22(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getG0ch(BaseClass _this_) {
        return ((MutualCoupling) _this_).getG0ch();
    }

    private static void setG0ch(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((MutualCoupling) _this_).setG0ch((Double) _value_);
        } else if (_value_ instanceof String) {
            ((MutualCoupling) _this_).setG0ch(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getR0(BaseClass _this_) {
        return ((MutualCoupling) _this_).getR0();
    }

    private static void setR0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((MutualCoupling) _this_).setR0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((MutualCoupling) _this_).setR0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getX0(BaseClass _this_) {
        return ((MutualCoupling) _this_).getX0();
    }

    private static void setX0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((MutualCoupling) _this_).setX0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((MutualCoupling) _this_).setX0(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "MutualCoupling", attrName));
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
                "MutualCoupling", attrName, value));
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
            map.put("First_Terminal", new AttrDetails("MutualCoupling.First_Terminal", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, MutualCoupling::getFirst_Terminal, MutualCoupling::setFirst_Terminal));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("Second_Terminal", new AttrDetails("MutualCoupling.Second_Terminal", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, MutualCoupling::getSecond_Terminal, MutualCoupling::setSecond_Terminal));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("b0ch", new AttrDetails("MutualCoupling.b0ch", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, MutualCoupling::getB0ch, MutualCoupling::setB0ch));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("distance11", new AttrDetails("MutualCoupling.distance11", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, MutualCoupling::getDistance11, MutualCoupling::setDistance11));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("distance12", new AttrDetails("MutualCoupling.distance12", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, MutualCoupling::getDistance12, MutualCoupling::setDistance12));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("distance21", new AttrDetails("MutualCoupling.distance21", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, MutualCoupling::getDistance21, MutualCoupling::setDistance21));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("distance22", new AttrDetails("MutualCoupling.distance22", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, MutualCoupling::getDistance22, MutualCoupling::setDistance22));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("g0ch", new AttrDetails("MutualCoupling.g0ch", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, MutualCoupling::getG0ch, MutualCoupling::setG0ch));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r0", new AttrDetails("MutualCoupling.r0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, MutualCoupling::getR0, MutualCoupling::setR0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x0", new AttrDetails("MutualCoupling.x0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, MutualCoupling::getX0, MutualCoupling::setX0));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new MutualCoupling(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
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
