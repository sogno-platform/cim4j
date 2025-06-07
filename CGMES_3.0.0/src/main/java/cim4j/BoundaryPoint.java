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
 * Designates a connection point at which one or more model authority sets shall connect to. The location of the connection point as well as other properties are agreed between organisations responsible for the interconnection, hence all attributes of the class represent this agreement.  It is primarily used in a boundary model authority set which can contain one or many BoundaryPoint-s among other Equipment-s and their connections.
 */
@SuppressWarnings("unused")
public class BoundaryPoint extends PowerSystemResource {

    private static final Logging LOG = Logging.getLogger(BoundaryPoint.class);

    /**
     * Constructor.
     */
    public BoundaryPoint(String rdfid) {
        super("BoundaryPoint", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected BoundaryPoint(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The connectivity node that is designated as a boundary point.
     */
    private ConnectivityNode ConnectivityNode; // OneToOne

    public ConnectivityNode getConnectivityNode() {
        return ConnectivityNode;
    }

    public void setConnectivityNode(ConnectivityNode _object_) {
        if (ConnectivityNode != _object_) {
            ConnectivityNode = _object_;
            ConnectivityNode.setBoundaryPoint(this);
        }
    }

    private static Object getConnectivityNode(BaseClass _this_) {
        return ((BoundaryPoint) _this_).getConnectivityNode();
    }

    private static void setConnectivityNode(BaseClass _this_, Object _value_) {
        if (_value_ instanceof ConnectivityNode) {
            ((BoundaryPoint) _this_).setConnectivityNode((ConnectivityNode) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ConnectivityNode");
        }
    }

    /**
     * The ISO code of the region which the `From` side of the Boundary point belongs to or it is connected to. The ISO code is a two-character country code as defined by ISO 3166 (http://www.iso.org/iso/country_codes). The length of the string is 2 characters maximum.
     */
    private String fromEndIsoCode; // String

    public String getFromEndIsoCode() {
        return fromEndIsoCode;
    }

    public void setFromEndIsoCode(String _value_) {
        fromEndIsoCode = _value_;
    }

    private static Object getFromEndIsoCode(BaseClass _this_) {
        return ((BoundaryPoint) _this_).getFromEndIsoCode();
    }

    private static void setFromEndIsoCode(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((BoundaryPoint) _this_).setFromEndIsoCode((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * A human readable name with length of the string 64 characters maximum. It covers the following two cases: -if the Boundary point is placed on a tie-line, it is the name (IdentifiedObject.name) of the substation at which the `From` side of the tie-line is connected to. -if the Boundary point is placed in a substation, it is the name (IdentifiedObject.name) of the element (e.g. PowerTransformer, ACLineSegment, Switch, etc.) at which the `From` side of the Boundary point is connected to.
     */
    private String fromEndName; // String

    public String getFromEndName() {
        return fromEndName;
    }

    public void setFromEndName(String _value_) {
        fromEndName = _value_;
    }

    private static Object getFromEndName(BaseClass _this_) {
        return ((BoundaryPoint) _this_).getFromEndName();
    }

    private static void setFromEndName(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((BoundaryPoint) _this_).setFromEndName((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Identifies the name of the transmission system operator, distribution system operator or other entity at which the `From` side of the interconnection is connected to. The length of the string is 64 characters maximum.
     */
    private String fromEndNameTso; // String

    public String getFromEndNameTso() {
        return fromEndNameTso;
    }

    public void setFromEndNameTso(String _value_) {
        fromEndNameTso = _value_;
    }

    private static Object getFromEndNameTso(BaseClass _this_) {
        return ((BoundaryPoint) _this_).getFromEndNameTso();
    }

    private static void setFromEndNameTso(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((BoundaryPoint) _this_).setFromEndNameTso((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * If true, this boundary point is a point of common coupling (PCC) of a direct current (DC) interconnection, otherwise the interconnection is AC (default).
     */
    private Boolean isDirectCurrent; // Boolean

    public Boolean getIsDirectCurrent() {
        return isDirectCurrent;
    }

    public void setIsDirectCurrent(Boolean _value_) {
        isDirectCurrent = _value_;
    }

    private static Object getIsDirectCurrent(BaseClass _this_) {
        return ((BoundaryPoint) _this_).getIsDirectCurrent();
    }

    private static void setIsDirectCurrent(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((BoundaryPoint) _this_).setIsDirectCurrent((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((BoundaryPoint) _this_).setIsDirectCurrent(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * If true, this boundary point is on the interconnection that is excluded from control area interchange calculation and consequently has no related tie flows. Otherwise, the interconnection is included in control area interchange and a TieFlow is required at all sides of the boundary point (default).
     */
    private Boolean isExcludedFromAreaInterchange; // Boolean

    public Boolean getIsExcludedFromAreaInterchange() {
        return isExcludedFromAreaInterchange;
    }

    public void setIsExcludedFromAreaInterchange(Boolean _value_) {
        isExcludedFromAreaInterchange = _value_;
    }

    private static Object getIsExcludedFromAreaInterchange(BaseClass _this_) {
        return ((BoundaryPoint) _this_).getIsExcludedFromAreaInterchange();
    }

    private static void setIsExcludedFromAreaInterchange(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((BoundaryPoint) _this_).setIsExcludedFromAreaInterchange((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((BoundaryPoint) _this_).setIsExcludedFromAreaInterchange(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * The ISO code of the region which the `To` side of the Boundary point belongs to or is connected to. The ISO code is a two-character country code as defined by ISO 3166 (http://www.iso.org/iso/country_codes). The length of the string is 2 characters maximum.
     */
    private String toEndIsoCode; // String

    public String getToEndIsoCode() {
        return toEndIsoCode;
    }

    public void setToEndIsoCode(String _value_) {
        toEndIsoCode = _value_;
    }

    private static Object getToEndIsoCode(BaseClass _this_) {
        return ((BoundaryPoint) _this_).getToEndIsoCode();
    }

    private static void setToEndIsoCode(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((BoundaryPoint) _this_).setToEndIsoCode((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * A human readable name with length of the string 64 characters maximum. It covers the following two cases: -if the Boundary point is placed on a tie-line, it is the name (IdentifiedObject.name) of the substation at which the `To` side of the tie-line is connected to. -if the Boundary point is placed in a substation, it is the name (IdentifiedObject.name) of the element (e.g. PowerTransformer, ACLineSegment, Switch, etc.) at which the `To` side of the Boundary point is connected to.
     */
    private String toEndName; // String

    public String getToEndName() {
        return toEndName;
    }

    public void setToEndName(String _value_) {
        toEndName = _value_;
    }

    private static Object getToEndName(BaseClass _this_) {
        return ((BoundaryPoint) _this_).getToEndName();
    }

    private static void setToEndName(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((BoundaryPoint) _this_).setToEndName((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Identifies the name of the transmission system operator, distribution system operator or other entity at which the `To` side of the interconnection is connected to. The length of the string is 64 characters maximum.
     */
    private String toEndNameTso; // String

    public String getToEndNameTso() {
        return toEndNameTso;
    }

    public void setToEndNameTso(String _value_) {
        toEndNameTso = _value_;
    }

    private static Object getToEndNameTso(BaseClass _this_) {
        return ((BoundaryPoint) _this_).getToEndNameTso();
    }

    private static void setToEndNameTso(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((BoundaryPoint) _this_).setToEndNameTso((String) _value_);
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "BoundaryPoint", attrName));
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
                "BoundaryPoint", attrName, value));
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

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/CIM100-European#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("ConnectivityNode", new AttrDetails("BoundaryPoint.ConnectivityNode", true, "http://iec.ch/TC57/CIM100-European#", profiles, false, false, BoundaryPoint::getConnectivityNode, BoundaryPoint::setConnectivityNode));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("fromEndIsoCode", new AttrDetails("BoundaryPoint.fromEndIsoCode", true, "http://iec.ch/TC57/CIM100-European#", profiles, true, false, BoundaryPoint::getFromEndIsoCode, BoundaryPoint::setFromEndIsoCode));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("fromEndName", new AttrDetails("BoundaryPoint.fromEndName", true, "http://iec.ch/TC57/CIM100-European#", profiles, true, false, BoundaryPoint::getFromEndName, BoundaryPoint::setFromEndName));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("fromEndNameTso", new AttrDetails("BoundaryPoint.fromEndNameTso", true, "http://iec.ch/TC57/CIM100-European#", profiles, true, false, BoundaryPoint::getFromEndNameTso, BoundaryPoint::setFromEndNameTso));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("isDirectCurrent", new AttrDetails("BoundaryPoint.isDirectCurrent", true, "http://iec.ch/TC57/CIM100-European#", profiles, true, false, BoundaryPoint::getIsDirectCurrent, BoundaryPoint::setIsDirectCurrent));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("isExcludedFromAreaInterchange", new AttrDetails("BoundaryPoint.isExcludedFromAreaInterchange", true, "http://iec.ch/TC57/CIM100-European#", profiles, true, false, BoundaryPoint::getIsExcludedFromAreaInterchange, BoundaryPoint::setIsExcludedFromAreaInterchange));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("toEndIsoCode", new AttrDetails("BoundaryPoint.toEndIsoCode", true, "http://iec.ch/TC57/CIM100-European#", profiles, true, false, BoundaryPoint::getToEndIsoCode, BoundaryPoint::setToEndIsoCode));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("toEndName", new AttrDetails("BoundaryPoint.toEndName", true, "http://iec.ch/TC57/CIM100-European#", profiles, true, false, BoundaryPoint::getToEndName, BoundaryPoint::setToEndName));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("toEndNameTso", new AttrDetails("BoundaryPoint.toEndNameTso", true, "http://iec.ch/TC57/CIM100-European#", profiles, true, false, BoundaryPoint::getToEndNameTso, BoundaryPoint::setToEndNameTso));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new BoundaryPoint(null).allAttrDetailsMap());
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
