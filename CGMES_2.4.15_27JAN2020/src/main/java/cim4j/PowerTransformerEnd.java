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
 * A PowerTransformerEnd is associated with each Terminal of a PowerTransformer. The impedance values r, r0, x, and x0 of a PowerTransformerEnd represents a star equivalent as follows 1) for a two Terminal PowerTransformer the high voltage PowerTransformerEnd has non zero values on r, r0, x, and x0 while the low voltage PowerTransformerEnd has zero values for r, r0, x, and x0. 2) for a three Terminal PowerTransformer the three PowerTransformerEnds represents a star equivalent with each leg in the star represented by r, r0, x, and x0 values. 3) for a PowerTransformer with more than three Terminals the PowerTransformerEnd impedance values cannot be used. Instead use the TransformerMeshImpedance or split the transformer into multiple PowerTransformers.
 */
@SuppressWarnings("unused")
public class PowerTransformerEnd extends TransformerEnd {

    private static final Logging LOG = Logging.getLogger(PowerTransformerEnd.class);

    /**
     * Constructor.
     */
    public PowerTransformerEnd(String rdfid) {
        super("PowerTransformerEnd", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected PowerTransformerEnd(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The ends of this power transformer.
     */
    private PowerTransformer PowerTransformer; // ManyToOne

    public PowerTransformer getPowerTransformer() {
        return PowerTransformer;
    }

    public void setPowerTransformer(PowerTransformer _object_) {
        if (PowerTransformer != _object_) {
            PowerTransformer = _object_;
            PowerTransformer.setPowerTransformerEnd(this);
        }
    }

    private static Object getPowerTransformer(BaseClass _this_) {
        return ((PowerTransformerEnd) _this_).getPowerTransformer();
    }

    private static void setPowerTransformer(BaseClass _this_, Object _value_) {
        if (_value_ instanceof PowerTransformer) {
            ((PowerTransformerEnd) _this_).setPowerTransformer((PowerTransformer) _value_);
        } else {
            throw new IllegalArgumentException("Object is not PowerTransformer");
        }
    }

    /**
     * Magnetizing branch susceptance (B mag).  The value can be positive or negative.
     */
    private Double b; // Susceptance

    public Double getB() {
        return b;
    }

    public void setB(Double _value_) {
        b = _value_;
    }

    private static Object getB(BaseClass _this_) {
        return ((PowerTransformerEnd) _this_).getB();
    }

    private static void setB(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PowerTransformerEnd) _this_).setB((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PowerTransformerEnd) _this_).setB(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Zero sequence magnetizing branch susceptance.
     */
    private Double b0; // Susceptance

    public Double getB0() {
        return b0;
    }

    public void setB0(Double _value_) {
        b0 = _value_;
    }

    private static Object getB0(BaseClass _this_) {
        return ((PowerTransformerEnd) _this_).getB0();
    }

    private static void setB0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PowerTransformerEnd) _this_).setB0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PowerTransformerEnd) _this_).setB0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Kind of connection.
     */
    private String connectionKind; // WindingConnection

    public String getConnectionKind() {
        return connectionKind;
    }

    public void setConnectionKind(String _value_) {
        connectionKind = _value_;
    }

    private static Object getConnectionKind(BaseClass _this_) {
        return ((PowerTransformerEnd) _this_).getConnectionKind();
    }

    private static void setConnectionKind(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((PowerTransformerEnd) _this_).setConnectionKind((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Magnetizing branch conductance.
     */
    private Double g; // Conductance

    public Double getG() {
        return g;
    }

    public void setG(Double _value_) {
        g = _value_;
    }

    private static Object getG(BaseClass _this_) {
        return ((PowerTransformerEnd) _this_).getG();
    }

    private static void setG(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PowerTransformerEnd) _this_).setG((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PowerTransformerEnd) _this_).setG(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Zero sequence magnetizing branch conductance (star-model).
     */
    private Double g0; // Conductance

    public Double getG0() {
        return g0;
    }

    public void setG0(Double _value_) {
        g0 = _value_;
    }

    private static Object getG0(BaseClass _this_) {
        return ((PowerTransformerEnd) _this_).getG0();
    }

    private static void setG0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PowerTransformerEnd) _this_).setG0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PowerTransformerEnd) _this_).setG0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Terminal voltage phase angle displacement where 360 degrees are represented with clock hours. The valid values are 0 to 11. For example, for the secondary side end of a transformer with vector group code of `Dyn11`, specify the connection kind as wye with neutral and specify the phase angle of the clock as 11.  The clock value of the transformer end number specified as 1, is assumed to be zero.  Note the transformer end number is not assumed to be the same as the terminal sequence number.
     */
    private Integer phaseAngleClock; // Integer

    public Integer getPhaseAngleClock() {
        return phaseAngleClock;
    }

    public void setPhaseAngleClock(Integer _value_) {
        phaseAngleClock = _value_;
    }

    private static Object getPhaseAngleClock(BaseClass _this_) {
        return ((PowerTransformerEnd) _this_).getPhaseAngleClock();
    }

    private static void setPhaseAngleClock(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((PowerTransformerEnd) _this_).setPhaseAngleClock((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((PowerTransformerEnd) _this_).setPhaseAngleClock(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
        }
    }

    /**
     * Resistance (star-model) of the transformer end. The attribute shall be equal or greater than zero for non-equivalent transformers.
     */
    private Double r; // Resistance

    public Double getR() {
        return r;
    }

    public void setR(Double _value_) {
        r = _value_;
    }

    private static Object getR(BaseClass _this_) {
        return ((PowerTransformerEnd) _this_).getR();
    }

    private static void setR(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PowerTransformerEnd) _this_).setR((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PowerTransformerEnd) _this_).setR(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Zero sequence series resistance (star-model) of the transformer end.
     */
    private Double r0; // Resistance

    public Double getR0() {
        return r0;
    }

    public void setR0(Double _value_) {
        r0 = _value_;
    }

    private static Object getR0(BaseClass _this_) {
        return ((PowerTransformerEnd) _this_).getR0();
    }

    private static void setR0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PowerTransformerEnd) _this_).setR0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PowerTransformerEnd) _this_).setR0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Normal apparent power rating. The attribute shall be a positive value. For a two-winding transformer the values for the high and low voltage sides shall be identical.
     */
    private Double ratedS; // ApparentPower

    public Double getRatedS() {
        return ratedS;
    }

    public void setRatedS(Double _value_) {
        ratedS = _value_;
    }

    private static Object getRatedS(BaseClass _this_) {
        return ((PowerTransformerEnd) _this_).getRatedS();
    }

    private static void setRatedS(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PowerTransformerEnd) _this_).setRatedS((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PowerTransformerEnd) _this_).setRatedS(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rated voltage: phase-phase for three-phase windings, and either phase-phase or phase-neutral for single-phase windings. A high voltage side, as given by TransformerEnd.endNumber, shall have a ratedU that is greater or equal than ratedU for the lower voltage sides.
     */
    private Double ratedU; // Voltage

    public Double getRatedU() {
        return ratedU;
    }

    public void setRatedU(Double _value_) {
        ratedU = _value_;
    }

    private static Object getRatedU(BaseClass _this_) {
        return ((PowerTransformerEnd) _this_).getRatedU();
    }

    private static void setRatedU(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PowerTransformerEnd) _this_).setRatedU((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PowerTransformerEnd) _this_).setRatedU(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Positive sequence series reactance (star-model) of the transformer end.
     */
    private Double x; // Reactance

    public Double getX() {
        return x;
    }

    public void setX(Double _value_) {
        x = _value_;
    }

    private static Object getX(BaseClass _this_) {
        return ((PowerTransformerEnd) _this_).getX();
    }

    private static void setX(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PowerTransformerEnd) _this_).setX((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PowerTransformerEnd) _this_).setX(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Zero sequence series reactance of the transformer end.
     */
    private Double x0; // Reactance

    public Double getX0() {
        return x0;
    }

    public void setX0(Double _value_) {
        x0 = _value_;
    }

    private static Object getX0(BaseClass _this_) {
        return ((PowerTransformerEnd) _this_).getX0();
    }

    private static void setX0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PowerTransformerEnd) _this_).setX0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PowerTransformerEnd) _this_).setX0(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PowerTransformerEnd", attrName));
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
                "PowerTransformerEnd", attrName, value));
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
            map.put("PowerTransformer", new AttrDetails("PowerTransformerEnd.PowerTransformer", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, PowerTransformerEnd::getPowerTransformer, PowerTransformerEnd::setPowerTransformer));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("b", new AttrDetails("PowerTransformerEnd.b", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PowerTransformerEnd::getB, PowerTransformerEnd::setB));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("b0", new AttrDetails("PowerTransformerEnd.b0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PowerTransformerEnd::getB0, PowerTransformerEnd::setB0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("connectionKind", new AttrDetails("PowerTransformerEnd.connectionKind", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, PowerTransformerEnd::getConnectionKind, PowerTransformerEnd::setConnectionKind));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("g", new AttrDetails("PowerTransformerEnd.g", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PowerTransformerEnd::getG, PowerTransformerEnd::setG));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("g0", new AttrDetails("PowerTransformerEnd.g0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PowerTransformerEnd::getG0, PowerTransformerEnd::setG0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("phaseAngleClock", new AttrDetails("PowerTransformerEnd.phaseAngleClock", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PowerTransformerEnd::getPhaseAngleClock, PowerTransformerEnd::setPhaseAngleClock));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r", new AttrDetails("PowerTransformerEnd.r", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PowerTransformerEnd::getR, PowerTransformerEnd::setR));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r0", new AttrDetails("PowerTransformerEnd.r0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PowerTransformerEnd::getR0, PowerTransformerEnd::setR0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedS", new AttrDetails("PowerTransformerEnd.ratedS", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PowerTransformerEnd::getRatedS, PowerTransformerEnd::setRatedS));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedU", new AttrDetails("PowerTransformerEnd.ratedU", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PowerTransformerEnd::getRatedU, PowerTransformerEnd::setRatedU));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x", new AttrDetails("PowerTransformerEnd.x", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PowerTransformerEnd::getX, PowerTransformerEnd::setX));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x0", new AttrDetails("PowerTransformerEnd.x0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PowerTransformerEnd::getX0, PowerTransformerEnd::setX0));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PowerTransformerEnd(null).allAttrDetailsMap());
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
