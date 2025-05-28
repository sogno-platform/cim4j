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
 * A subset of a geographical region of a power system network model.
 */
@SuppressWarnings("unused")
public class SubGeographicalRegion extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(SubGeographicalRegion.class);

    /**
     * Constructor.
     */
    public SubGeographicalRegion(String rdfid) {
        super("SubGeographicalRegion", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected SubGeographicalRegion(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The DC lines in this sub-geographical region.
     *
     * NOT USED
     */
    private Set<DCLine> DCLines = new HashSet<>(); // OneToMany

    public Set<DCLine> getDCLines() {
        return DCLines;
    }

    public void setDCLines(DCLine _object_) {
        if (!DCLines.contains(_object_)) {
            DCLines.add(_object_);
            _object_.setRegion(this);
        }
    }

    private static Object getDCLines(BaseClass _this_) {
        return ((SubGeographicalRegion) _this_).getDCLines();
    }

    private static void setDCLines(BaseClass _this_, Object _value_) {
        if (_value_ instanceof DCLine) {
            ((SubGeographicalRegion) _this_).setDCLines((DCLine) _value_);
        } else {
            throw new IllegalArgumentException("Object is not DCLine");
        }
    }

    /**
     * The lines within the sub-geographical region.
     *
     * NOT USED
     */
    private Set<Line> Lines = new HashSet<>(); // OneToMany

    public Set<Line> getLines() {
        return Lines;
    }

    public void setLines(Line _object_) {
        if (!Lines.contains(_object_)) {
            Lines.add(_object_);
            _object_.setRegion(this);
        }
    }

    private static Object getLines(BaseClass _this_) {
        return ((SubGeographicalRegion) _this_).getLines();
    }

    private static void setLines(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Line) {
            ((SubGeographicalRegion) _this_).setLines((Line) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Line");
        }
    }

    /**
     * The geographical region which this sub-geographical region is within.
     */
    private GeographicalRegion Region; // ManyToOne

    public GeographicalRegion getRegion() {
        return Region;
    }

    public void setRegion(GeographicalRegion _object_) {
        if (Region != _object_) {
            Region = _object_;
            Region.setRegions(this);
        }
    }

    private static Object getRegion(BaseClass _this_) {
        return ((SubGeographicalRegion) _this_).getRegion();
    }

    private static void setRegion(BaseClass _this_, Object _value_) {
        if (_value_ instanceof GeographicalRegion) {
            ((SubGeographicalRegion) _this_).setRegion((GeographicalRegion) _value_);
        } else {
            throw new IllegalArgumentException("Object is not GeographicalRegion");
        }
    }

    /**
     * The substations in this sub-geographical region.
     *
     * NOT USED
     */
    private Set<Substation> Substations = new HashSet<>(); // OneToMany

    public Set<Substation> getSubstations() {
        return Substations;
    }

    public void setSubstations(Substation _object_) {
        if (!Substations.contains(_object_)) {
            Substations.add(_object_);
            _object_.setRegion(this);
        }
    }

    private static Object getSubstations(BaseClass _this_) {
        return ((SubGeographicalRegion) _this_).getSubstations();
    }

    private static void setSubstations(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Substation) {
            ((SubGeographicalRegion) _this_).setSubstations((Substation) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Substation");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "SubGeographicalRegion", attrName));
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
                "SubGeographicalRegion", attrName, value));
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
            map.put("DCLines", new AttrDetails("SubGeographicalRegion.DCLines", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, SubGeographicalRegion::getDCLines, SubGeographicalRegion::setDCLines));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("Lines", new AttrDetails("SubGeographicalRegion.Lines", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, SubGeographicalRegion::getLines, SubGeographicalRegion::setLines));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("Region", new AttrDetails("SubGeographicalRegion.Region", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, SubGeographicalRegion::getRegion, SubGeographicalRegion::setRegion));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("Substations", new AttrDetails("SubGeographicalRegion.Substations", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, SubGeographicalRegion::getSubstations, SubGeographicalRegion::setSubstations));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new SubGeographicalRegion(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.EQBD);
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
