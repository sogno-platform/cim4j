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
 * The place, scene, or point of something where someone or something has been, is, and/or will be at a given moment in time. It can be defined with one or more position points (coordinates) in a given coordinate system.
 */
@SuppressWarnings("unused")
public class Location extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(Location.class);

    /**
     * Constructor.
     */
    public Location(String rdfid) {
        super("Location", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected Location(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Coordinate system used to describe position points of this location.
     */
    private CoordinateSystem CoordinateSystem; // ManyToOne

    private String CoordinateSystemId;

    public CoordinateSystem getCoordinateSystem() {
        return CoordinateSystem;
    }

    public void setCoordinateSystem(CoordinateSystem _object_) {
        if (CoordinateSystem != _object_) {
            CoordinateSystem = _object_;
            _object_.setLocations(this);
            CoordinateSystemId = _object_.getRdfid();
        }
    }

    private static Object getCoordinateSystem(BaseClass _this_) {
        var obj = ((Location) _this_).getCoordinateSystem();
        var id = ((Location) _this_).CoordinateSystemId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setCoordinateSystem(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Location) _this_).CoordinateSystemId = (String) _value_;
        } else if (_value_ instanceof CoordinateSystem) {
            ((Location) _this_).setCoordinateSystem((CoordinateSystem) _value_);
        } else {
            throw new IllegalArgumentException("Object is not CoordinateSystem");
        }
    }

    /**
     * Sequence of position points describing this location, expressed in coordinate system `Location.CoordinateSystem`.
     *
     * NOT USED
     */
    private Set<PositionPoint> PositionPoints = new HashSet<>(); // OneToMany

    private Set<String> PositionPointsIdSet = new HashSet<>();

    public Set<PositionPoint> getPositionPoints() {
        return PositionPoints;
    }

    public void setPositionPoints(PositionPoint _object_) {
        if (!PositionPoints.contains(_object_)) {
            PositionPoints.add(_object_);
            _object_.setLocation(this);
            PositionPointsIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getPositionPoints(BaseClass _this_) {
        var objs = ((Location) _this_).getPositionPoints();
        var ids = ((Location) _this_).PositionPointsIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setPositionPoints(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Location) _this_).PositionPointsIdSet.add((String) _value_);
        } else if (_value_ instanceof PositionPoint) {
            ((Location) _this_).setPositionPoints((PositionPoint) _value_);
        } else {
            throw new IllegalArgumentException("Object is not PositionPoint");
        }
    }

    /**
     * All power system resources at this location.
     */
    private PowerSystemResource PowerSystemResources; // OneToOne

    private String PowerSystemResourcesId;

    public PowerSystemResource getPowerSystemResources() {
        return PowerSystemResources;
    }

    public void setPowerSystemResources(PowerSystemResource _object_) {
        if (PowerSystemResources != _object_) {
            PowerSystemResources = _object_;
            _object_.setLocation(this);
            PowerSystemResourcesId = _object_.getRdfid();
        }
    }

    private static Object getPowerSystemResources(BaseClass _this_) {
        var obj = ((Location) _this_).getPowerSystemResources();
        var id = ((Location) _this_).PowerSystemResourcesId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setPowerSystemResources(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Location) _this_).PowerSystemResourcesId = (String) _value_;
        } else if (_value_ instanceof PowerSystemResource) {
            ((Location) _this_).setPowerSystemResources((PowerSystemResource) _value_);
        } else {
            throw new IllegalArgumentException("Object is not PowerSystemResource");
        }
    }

    /**
     * Main address of the location.
     */
    private StreetAddress mainAddress; // OneToOne

    private String mainAddressId;

    public StreetAddress getMainAddress() {
        return mainAddress;
    }

    public void setMainAddress(StreetAddress _object_) {
        if (mainAddress != _object_) {
            mainAddress = _object_;
            mainAddressId = _object_.getRdfid();
        }
    }

    private static Object getMainAddress(BaseClass _this_) {
        var obj = ((Location) _this_).getMainAddress();
        var id = ((Location) _this_).mainAddressId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setMainAddress(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Location) _this_).mainAddressId = (String) _value_;
        } else if (_value_ instanceof StreetAddress) {
            ((Location) _this_).setMainAddress((StreetAddress) _value_);
        } else {
            throw new IllegalArgumentException("Object is not StreetAddress");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "Location", attrName));
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
                "Location", attrName, value));
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
            profiles.add(CGMESProfile.GL);
            map.put("CoordinateSystem", new AttrDetails("Location.CoordinateSystem", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, Location::getCoordinateSystem, Location::setCoordinateSystem));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("PositionPoints", new AttrDetails("Location.PositionPoints", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, Location::getPositionPoints, Location::setPositionPoints));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("PowerSystemResources", new AttrDetails("Location.PowerSystemResources", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, Location::getPowerSystemResources, Location::setPowerSystemResources));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("mainAddress", new AttrDetails("Location.mainAddress", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, Location::getMainAddress, Location::setMainAddress));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new Location(null).allAttrDetailsMap());
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
