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
 * A power system resource (PSR) can be an item of equipment such as a switch, an equipment container containing many individual items of equipment such as a substation, or an organisational entity such as sub-control area. Power system resources can have measurements associated.
 */
@SuppressWarnings("unused")
public class PowerSystemResource extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(PowerSystemResource.class);

    /**
     * Constructor.
     */
    public PowerSystemResource(String rdfid) {
        super("PowerSystemResource", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected PowerSystemResource(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The controller outputs used to actually govern a regulating device, e.g. the magnetization of a synchronous machine or capacitor bank breaker actuator.
     *
     * NOT USED
     */
    private Set<Control> Controls = new HashSet<>(); // OneToMany

    private Set<String> ControlsIdSet = new HashSet<>();

    public Set<Control> getControls() {
        return Controls;
    }

    public void setControls(Control _object_) {
        if (!Controls.contains(_object_)) {
            Controls.add(_object_);
            _object_.setPowerSystemResource(this);
            ControlsIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getControls(BaseClass _this_) {
        var objs = ((PowerSystemResource) _this_).getControls();
        var ids = ((PowerSystemResource) _this_).ControlsIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setControls(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((PowerSystemResource) _this_).ControlsIdSet.add((String) _value_);
        } else if (_value_ instanceof Control) {
            ((PowerSystemResource) _this_).setControls((Control) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Control");
        }
    }

    /**
     * Location of this power system resource.
     *
     * NOT USED
     */
    private Location Location; // OneToOne

    private String LocationId;

    public Location getLocation() {
        return Location;
    }

    public void setLocation(Location _object_) {
        if (Location != _object_) {
            Location = _object_;
            _object_.setPowerSystemResources(this);
            LocationId = _object_.getRdfid();
        }
    }

    private static Object getLocation(BaseClass _this_) {
        var obj = ((PowerSystemResource) _this_).getLocation();
        var id = ((PowerSystemResource) _this_).LocationId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setLocation(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((PowerSystemResource) _this_).LocationId = (String) _value_;
        } else if (_value_ instanceof Location) {
            ((PowerSystemResource) _this_).setLocation((Location) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Location");
        }
    }

    /**
     * The measurements associated with this power system resource.
     *
     * NOT USED
     */
    private Set<Measurement> Measurements = new HashSet<>(); // OneToMany

    private Set<String> MeasurementsIdSet = new HashSet<>();

    public Set<Measurement> getMeasurements() {
        return Measurements;
    }

    public void setMeasurements(Measurement _object_) {
        if (!Measurements.contains(_object_)) {
            Measurements.add(_object_);
            _object_.setPowerSystemResource(this);
            MeasurementsIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getMeasurements(BaseClass _this_) {
        var objs = ((PowerSystemResource) _this_).getMeasurements();
        var ids = ((PowerSystemResource) _this_).MeasurementsIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setMeasurements(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((PowerSystemResource) _this_).MeasurementsIdSet.add((String) _value_);
        } else if (_value_ instanceof Measurement) {
            ((PowerSystemResource) _this_).setMeasurements((Measurement) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Measurement");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PowerSystemResource", attrName));
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
                "PowerSystemResource", attrName, value));
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
            profiles.add(CGMESProfile.OP);
            map.put("Controls", new AttrDetails("PowerSystemResource.Controls", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, PowerSystemResource::getControls, PowerSystemResource::setControls));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("Location", new AttrDetails("PowerSystemResource.Location", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, PowerSystemResource::getLocation, PowerSystemResource::setLocation));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("Measurements", new AttrDetails("PowerSystemResource.Measurements", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, PowerSystemResource::getMeasurements, PowerSystemResource::setMeasurements));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PowerSystemResource(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.DY);
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.EQBD);
        profiles.add(CGMESProfile.GL);
        profiles.add(CGMESProfile.OP);
        profiles.add(CGMESProfile.SC);
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
