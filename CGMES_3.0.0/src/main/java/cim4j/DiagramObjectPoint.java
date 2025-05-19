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
 * A point in a given space defined by 3 coordinates and associated to a diagram object.  The coordinates may be positive or negative as the origin does not have to be in the corner of a diagram.
 */
@SuppressWarnings("unused")
public class DiagramObjectPoint extends BaseClass {

    private static final Logging LOG = Logging.getLogger(DiagramObjectPoint.class);

    /**
     * Default constructor.
     */
    public DiagramObjectPoint() {
        setCimType("DiagramObjectPoint");
    }

    /**
     * The diagram object with which the points are associated.
     */
    private DiagramObject DiagramObject; // ManyToOne

    public DiagramObject getDiagramObject() {
        return DiagramObject;
    }

    public void setDiagramObject(BaseClass _object_) {
        if (!(_object_ instanceof DiagramObject)) {
            throw new IllegalArgumentException("Object is not DiagramObject");
        }
        if (DiagramObject != _object_) {
            DiagramObject = (DiagramObject) _object_;
            DiagramObject.setDiagramObjectPoints(this);
        }
    }

    public String DiagramObjectToString() {
        return DiagramObject != null ? DiagramObject.getRdfid() : null;
    }

    /**
     * The `glue` point to which this point is associated.
     */
    private DiagramObjectGluePoint DiagramObjectGluePoint; // ManyToOne

    public DiagramObjectGluePoint getDiagramObjectGluePoint() {
        return DiagramObjectGluePoint;
    }

    public void setDiagramObjectGluePoint(BaseClass _object_) {
        if (!(_object_ instanceof DiagramObjectGluePoint)) {
            throw new IllegalArgumentException("Object is not DiagramObjectGluePoint");
        }
        if (DiagramObjectGluePoint != _object_) {
            DiagramObjectGluePoint = (DiagramObjectGluePoint) _object_;
            DiagramObjectGluePoint.setDiagramObjectPoints(this);
        }
    }

    public String DiagramObjectGluePointToString() {
        return DiagramObjectGluePoint != null ? DiagramObjectGluePoint.getRdfid() : null;
    }

    /**
     * The sequence position of the point, used for defining the order of points for diagram objects acting as a polyline or polygon with more than one point. The attribute shall be a positive value.
     */
    private Integer sequenceNumber; // Integer

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer _value_) {
        sequenceNumber = _value_;
    }

    public void setSequenceNumber(String _value_) {
        sequenceNumber = getIntegerFromString(_value_);
    }

    public String sequenceNumberToString() {
        return sequenceNumber != null ? sequenceNumber.toString() : null;
    }

    /**
     * The X coordinate of this point.
     */
    private Float xPosition; // Float

    public Float getXPosition() {
        return xPosition;
    }

    public void setXPosition(Float _value_) {
        xPosition = _value_;
    }

    public void setXPosition(String _value_) {
        xPosition = getFloatFromString(_value_);
    }

    public String xPositionToString() {
        return xPosition != null ? xPosition.toString() : null;
    }

    /**
     * The Y coordinate of this point.
     */
    private Float yPosition; // Float

    public Float getYPosition() {
        return yPosition;
    }

    public void setYPosition(Float _value_) {
        yPosition = _value_;
    }

    public void setYPosition(String _value_) {
        yPosition = getFloatFromString(_value_);
    }

    public String yPositionToString() {
        return yPosition != null ? yPosition.toString() : null;
    }

    /**
     * The Z coordinate of this point.
     */
    private Float zPosition; // Float

    public Float getZPosition() {
        return zPosition;
    }

    public void setZPosition(Float _value_) {
        zPosition = _value_;
    }

    public void setZPosition(String _value_) {
        zPosition = getFloatFromString(_value_);
    }

    public String zPositionToString() {
        return zPosition != null ? zPosition.toString() : null;
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
        return getAttribute("DiagramObjectPoint", attrName);
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
        setAttribute("DiagramObjectPoint", attrName, objectValue);
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
        setAttribute("DiagramObjectPoint", attrName, stringValue);
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

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/CIM100#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("DiagramObject", new AttrDetails("DiagramObjectPoint.DiagramObject", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("DiagramObjectGluePoint", new AttrDetails("DiagramObjectPoint.DiagramObjectGluePoint", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("sequenceNumber", new AttrDetails("DiagramObjectPoint.sequenceNumber", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("xPosition", new AttrDetails("DiagramObjectPoint.xPosition", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("yPosition", new AttrDetails("DiagramObjectPoint.yPosition", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("zPosition", new AttrDetails("DiagramObjectPoint.zPosition", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new DiagramObjectPoint().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("DiagramObject", new GetterSetter(this::DiagramObjectToString, this::setDiagramObject, null));
        map.put("DiagramObjectGluePoint", new GetterSetter(this::DiagramObjectGluePointToString, this::setDiagramObjectGluePoint, null));
        map.put("sequenceNumber", new GetterSetter(this::sequenceNumberToString, null, this::setSequenceNumber));
        map.put("xPosition", new GetterSetter(this::xPositionToString, null, this::setXPosition));
        map.put("yPosition", new GetterSetter(this::yPositionToString, null, this::setYPosition));
        map.put("zPosition", new GetterSetter(this::zPositionToString, null, this::setZPosition));
        return map;
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.DL);
        POSSIBLE_PROFILES = Collections.unmodifiableSet(profiles);
    }

    private static final CGMESProfile RECOMMENDED_PROFILE = CGMESProfile.DL;

    private static final Set<CGMESProfile> POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>(POSSIBLE_PROFILES);
        for (var attrDetails : ATTR_DETAILS_MAP.values()) {
            profiles.addAll(attrDetails.profiles);
        }
        POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES = Collections.unmodifiableSet(profiles);
    }
}
