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
 * A wire or combination of wires not insulated from one another, with consistent electrical characteristics, used to carry direct current between points in the DC region of the power system.
 */
@SuppressWarnings("unused")
public class DCLineSegment extends DCConductingEquipment {

    private static final Logging LOG = Logging.getLogger(DCLineSegment.class);

    /**
     * Constructor.
     */
    public DCLineSegment(String rdfid) {
        super("DCLineSegment", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected DCLineSegment(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Capacitance of the DC line segment. Significant for cables only.
     */
    private Double capacitance; // Capacitance

    public Double getCapacitance() {
        return capacitance;
    }

    public void setCapacitance(Double _value_) {
        capacitance = _value_;
    }

    private static Object getCapacitance(BaseClass _this_) {
        return ((DCLineSegment) _this_).getCapacitance();
    }

    private static void setCapacitance(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DCLineSegment) _this_).setCapacitance((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DCLineSegment) _this_).setCapacitance(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Inductance of the DC line segment. Negligible compared with DCSeriesDevice used for smoothing.
     */
    private Double inductance; // Inductance

    public Double getInductance() {
        return inductance;
    }

    public void setInductance(Double _value_) {
        inductance = _value_;
    }

    private static Object getInductance(BaseClass _this_) {
        return ((DCLineSegment) _this_).getInductance();
    }

    private static void setInductance(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DCLineSegment) _this_).setInductance((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DCLineSegment) _this_).setInductance(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Segment length for calculating line section capabilities.
     */
    private Double length; // Length

    public Double getLength() {
        return length;
    }

    public void setLength(Double _value_) {
        length = _value_;
    }

    private static Object getLength(BaseClass _this_) {
        return ((DCLineSegment) _this_).getLength();
    }

    private static void setLength(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DCLineSegment) _this_).setLength((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DCLineSegment) _this_).setLength(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Resistance of the DC line segment.
     */
    private Double resistance; // Resistance

    public Double getResistance() {
        return resistance;
    }

    public void setResistance(Double _value_) {
        resistance = _value_;
    }

    private static Object getResistance(BaseClass _this_) {
        return ((DCLineSegment) _this_).getResistance();
    }

    private static void setResistance(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DCLineSegment) _this_).setResistance((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DCLineSegment) _this_).setResistance(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "DCLineSegment", attrName));
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
                "DCLineSegment", attrName, value));
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
            map.put("capacitance", new AttrDetails("DCLineSegment.capacitance", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DCLineSegment::getCapacitance, DCLineSegment::setCapacitance));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("inductance", new AttrDetails("DCLineSegment.inductance", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DCLineSegment::getInductance, DCLineSegment::setInductance));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("length", new AttrDetails("DCLineSegment.length", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DCLineSegment::getLength, DCLineSegment::setLength));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("resistance", new AttrDetails("DCLineSegment.resistance", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DCLineSegment::getResistance, DCLineSegment::setResistance));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new DCLineSegment(null).allAttrDetailsMap());
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
