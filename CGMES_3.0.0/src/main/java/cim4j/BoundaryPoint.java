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
     * Default constructor.
     */
    public BoundaryPoint() {
        setCimType("BoundaryPoint");
    }

    /**
     * The connectivity node that is designated as a boundary point.
     */
    private ConnectivityNode ConnectivityNode; // OneToOne

    public ConnectivityNode getConnectivityNode() {
        return ConnectivityNode;
    }

    public void setConnectivityNode(BaseClass _object_) {
        if (!(_object_ instanceof ConnectivityNode)) {
            throw new IllegalArgumentException("Object is not ConnectivityNode");
        }
        if (ConnectivityNode != _object_) {
            ConnectivityNode = (ConnectivityNode) _object_;
            ConnectivityNode.setBoundaryPoint(this);
        }
    }

    public String ConnectivityNodeToString() {
        return ConnectivityNode != null ? ConnectivityNode.getRdfid() : null;
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

    public String fromEndIsoCodeToString() {
        return fromEndIsoCode != null ? fromEndIsoCode.toString() : null;
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

    public String fromEndNameToString() {
        return fromEndName != null ? fromEndName.toString() : null;
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

    public String fromEndNameTsoToString() {
        return fromEndNameTso != null ? fromEndNameTso.toString() : null;
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

    public void setIsDirectCurrent(String _value_) {
        isDirectCurrent = getBooleanFromString(_value_);
    }

    public String isDirectCurrentToString() {
        return isDirectCurrent != null ? isDirectCurrent.toString() : null;
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

    public void setIsExcludedFromAreaInterchange(String _value_) {
        isExcludedFromAreaInterchange = getBooleanFromString(_value_);
    }

    public String isExcludedFromAreaInterchangeToString() {
        return isExcludedFromAreaInterchange != null ? isExcludedFromAreaInterchange.toString() : null;
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

    public String toEndIsoCodeToString() {
        return toEndIsoCode != null ? toEndIsoCode.toString() : null;
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

    public String toEndNameToString() {
        return toEndName != null ? toEndName.toString() : null;
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

    public String toEndNameTsoToString() {
        return toEndNameTso != null ? toEndNameTso.toString() : null;
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
        return getAttribute("BoundaryPoint", attrName);
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
        setAttribute("BoundaryPoint", attrName, objectValue);
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
        setAttribute("BoundaryPoint", attrName, stringValue);
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
            map.put("ConnectivityNode", new AttrDetails("BoundaryPoint.ConnectivityNode", true, "http://iec.ch/TC57/CIM100-European#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("fromEndIsoCode", new AttrDetails("BoundaryPoint.fromEndIsoCode", true, "http://iec.ch/TC57/CIM100-European#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("fromEndName", new AttrDetails("BoundaryPoint.fromEndName", true, "http://iec.ch/TC57/CIM100-European#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("fromEndNameTso", new AttrDetails("BoundaryPoint.fromEndNameTso", true, "http://iec.ch/TC57/CIM100-European#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("isDirectCurrent", new AttrDetails("BoundaryPoint.isDirectCurrent", true, "http://iec.ch/TC57/CIM100-European#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("isExcludedFromAreaInterchange", new AttrDetails("BoundaryPoint.isExcludedFromAreaInterchange", true, "http://iec.ch/TC57/CIM100-European#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("toEndIsoCode", new AttrDetails("BoundaryPoint.toEndIsoCode", true, "http://iec.ch/TC57/CIM100-European#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("toEndName", new AttrDetails("BoundaryPoint.toEndName", true, "http://iec.ch/TC57/CIM100-European#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("toEndNameTso", new AttrDetails("BoundaryPoint.toEndNameTso", true, "http://iec.ch/TC57/CIM100-European#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new BoundaryPoint().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("ConnectivityNode", new GetterSetter(this::ConnectivityNodeToString, this::setConnectivityNode, null));
        map.put("fromEndIsoCode", new GetterSetter(this::fromEndIsoCodeToString, null, this::setFromEndIsoCode));
        map.put("fromEndName", new GetterSetter(this::fromEndNameToString, null, this::setFromEndName));
        map.put("fromEndNameTso", new GetterSetter(this::fromEndNameTsoToString, null, this::setFromEndNameTso));
        map.put("isDirectCurrent", new GetterSetter(this::isDirectCurrentToString, null, this::setIsDirectCurrent));
        map.put("isExcludedFromAreaInterchange", new GetterSetter(this::isExcludedFromAreaInterchangeToString, null, this::setIsExcludedFromAreaInterchange));
        map.put("toEndIsoCode", new GetterSetter(this::toEndIsoCodeToString, null, this::setToEndIsoCode));
        map.put("toEndName", new GetterSetter(this::toEndNameToString, null, this::setToEndName));
        map.put("toEndNameTso", new GetterSetter(this::toEndNameTsoToString, null, this::setToEndNameTso));
        return map;
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
