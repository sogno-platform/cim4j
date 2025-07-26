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
 * Set of spatial coordinates that determine a point, defined in the coordinate system specified in 'Location.CoordinateSystem'. Use a single position point instance to desribe a point-oriented location. Use a sequence of position points to describe a line-oriented object (physical location of non-point oriented objects like cables or lines), or area of an object (like a substation or a geographical zone - in this case, have first and last position point with the same values).
 */
@SuppressWarnings("unused")
public class PositionPoint extends BaseClass {

    private static final Logging LOG = Logging.getLogger(PositionPoint.class);

    /**
     * Constructor.
     */
    public PositionPoint(String rdfid) {
        super("PositionPoint", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected PositionPoint(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Location described by this position point.
     */
    private Location Location; // ManyToOne

    private String LocationId;

    public Location getLocation() {
        return Location;
    }

    public void setLocation(Location _object_) {
        if (Location != _object_) {
            Location = _object_;
            _object_.setPositionPoints(this);
            LocationId = _object_.getRdfid();
        }
    }

    private static Object getLocation(BaseClass _this_) {
        var obj = ((PositionPoint) _this_).getLocation();
        var id = ((PositionPoint) _this_).LocationId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setLocation(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((PositionPoint) _this_).LocationId = (String) _value_;
        } else if (_value_ instanceof Location) {
            ((PositionPoint) _this_).setLocation((Location) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Location");
        }
    }

    /**
     * Zero-relative sequence number of this point within a series of points.
     */
    private Integer sequenceNumber; // Integer

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer _value_) {
        sequenceNumber = _value_;
    }

    private static Object getSequenceNumber(BaseClass _this_) {
        return ((PositionPoint) _this_).getSequenceNumber();
    }

    private static void setSequenceNumber(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((PositionPoint) _this_).setSequenceNumber((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((PositionPoint) _this_).setSequenceNumber(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
        }
    }

    /**
     * X axis position.
     */
    private String xPosition; // String

    public String getXPosition() {
        return xPosition;
    }

    public void setXPosition(String _value_) {
        xPosition = _value_;
    }

    private static Object getXPosition(BaseClass _this_) {
        return ((PositionPoint) _this_).getXPosition();
    }

    private static void setXPosition(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((PositionPoint) _this_).setXPosition((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Y axis position.
     */
    private String yPosition; // String

    public String getYPosition() {
        return yPosition;
    }

    public void setYPosition(String _value_) {
        yPosition = _value_;
    }

    private static Object getYPosition(BaseClass _this_) {
        return ((PositionPoint) _this_).getYPosition();
    }

    private static void setYPosition(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((PositionPoint) _this_).setYPosition((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * (if applicable) Z axis position.
     */
    private String zPosition; // String

    public String getZPosition() {
        return zPosition;
    }

    public void setZPosition(String _value_) {
        zPosition = _value_;
    }

    private static Object getZPosition(BaseClass _this_) {
        return ((PositionPoint) _this_).getZPosition();
    }

    private static void setZPosition(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((PositionPoint) _this_).setZPosition((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PositionPoint", attrName));
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
                "PositionPoint", attrName, value));
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
            profiles.add(CGMESProfile.GL);
            map.put("Location", new AttrDetails("PositionPoint.Location", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, PositionPoint::getLocation, PositionPoint::setLocation));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("sequenceNumber", new AttrDetails("PositionPoint.sequenceNumber", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PositionPoint::getSequenceNumber, PositionPoint::setSequenceNumber));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("xPosition", new AttrDetails("PositionPoint.xPosition", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PositionPoint::getXPosition, PositionPoint::setXPosition));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("yPosition", new AttrDetails("PositionPoint.yPosition", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PositionPoint::getYPosition, PositionPoint::setYPosition));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("zPosition", new AttrDetails("PositionPoint.zPosition", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PositionPoint::getZPosition, PositionPoint::setZPosition));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PositionPoint(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.GL);
        POSSIBLE_PROFILES = Collections.unmodifiableSet(profiles);
    }

    private static final CGMESProfile RECOMMENDED_PROFILE = CGMESProfile.GL;

    private static final Set<CGMESProfile> POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>(POSSIBLE_PROFILES);
        for (var attrDetails : ATTR_DETAILS_MAP.values()) {
            profiles.addAll(attrDetails.profiles);
        }
        POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES = Collections.unmodifiableSet(profiles);
    }
}
