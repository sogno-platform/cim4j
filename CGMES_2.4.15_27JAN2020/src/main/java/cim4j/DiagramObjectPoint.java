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
     * Constructor.
     */
    public DiagramObjectPoint(String rdfid) {
        super("DiagramObjectPoint", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected DiagramObjectPoint(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The diagram object with which the points are associated.
     */
    private DiagramObject DiagramObject; // ManyToOne

    public DiagramObject getDiagramObject() {
        return DiagramObject;
    }

    public void setDiagramObject(DiagramObject _object_) {
        if (DiagramObject != _object_) {
            DiagramObject = _object_;
            DiagramObject.setDiagramObjectPoints(this);
        }
    }

    private static Object getDiagramObject(BaseClass _this_) {
        return ((DiagramObjectPoint) _this_).getDiagramObject();
    }

    private static void setDiagramObject(BaseClass _this_, Object _value_) {
        if (_value_ instanceof DiagramObject) {
            ((DiagramObjectPoint) _this_).setDiagramObject((DiagramObject) _value_);
        } else {
            throw new IllegalArgumentException("Object is not DiagramObject");
        }
    }

    /**
     * A diagram object glue point is associated with 2 or more object points that are considered to be `glued` together.
     */
    private DiagramObjectGluePoint DiagramObjectGluePoint; // ManyToOne

    public DiagramObjectGluePoint getDiagramObjectGluePoint() {
        return DiagramObjectGluePoint;
    }

    public void setDiagramObjectGluePoint(DiagramObjectGluePoint _object_) {
        if (DiagramObjectGluePoint != _object_) {
            DiagramObjectGluePoint = _object_;
            DiagramObjectGluePoint.setDiagramObjectPoints(this);
        }
    }

    private static Object getDiagramObjectGluePoint(BaseClass _this_) {
        return ((DiagramObjectPoint) _this_).getDiagramObjectGluePoint();
    }

    private static void setDiagramObjectGluePoint(BaseClass _this_, Object _value_) {
        if (_value_ instanceof DiagramObjectGluePoint) {
            ((DiagramObjectPoint) _this_).setDiagramObjectGluePoint((DiagramObjectGluePoint) _value_);
        } else {
            throw new IllegalArgumentException("Object is not DiagramObjectGluePoint");
        }
    }

    /**
     * The sequence position of the point, used for defining the order of points for diagram objects acting as a polyline or polygon with more than one point.
     */
    private Integer sequenceNumber; // Integer

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer _value_) {
        sequenceNumber = _value_;
    }

    private static Object getSequenceNumber(BaseClass _this_) {
        return ((DiagramObjectPoint) _this_).getSequenceNumber();
    }

    private static void setSequenceNumber(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((DiagramObjectPoint) _this_).setSequenceNumber((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((DiagramObjectPoint) _this_).setSequenceNumber(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
        }
    }

    /**
     * The X coordinate of this point.
     */
    private Double xPosition; // Simple_Float

    public Double getXPosition() {
        return xPosition;
    }

    public void setXPosition(Double _value_) {
        xPosition = _value_;
    }

    private static Object getXPosition(BaseClass _this_) {
        return ((DiagramObjectPoint) _this_).getXPosition();
    }

    private static void setXPosition(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiagramObjectPoint) _this_).setXPosition((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiagramObjectPoint) _this_).setXPosition(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * The Y coordinate of this point.
     */
    private Double yPosition; // Simple_Float

    public Double getYPosition() {
        return yPosition;
    }

    public void setYPosition(Double _value_) {
        yPosition = _value_;
    }

    private static Object getYPosition(BaseClass _this_) {
        return ((DiagramObjectPoint) _this_).getYPosition();
    }

    private static void setYPosition(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiagramObjectPoint) _this_).setYPosition((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiagramObjectPoint) _this_).setYPosition(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * The Z coordinate of this point.
     */
    private Double zPosition; // Simple_Float

    public Double getZPosition() {
        return zPosition;
    }

    public void setZPosition(Double _value_) {
        zPosition = _value_;
    }

    private static Object getZPosition(BaseClass _this_) {
        return ((DiagramObjectPoint) _this_).getZPosition();
    }

    private static void setZPosition(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiagramObjectPoint) _this_).setZPosition((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiagramObjectPoint) _this_).setZPosition(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "DiagramObjectPoint", attrName));
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
                "DiagramObjectPoint", attrName, value));
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
            profiles.add(CGMESProfile.DL);
            map.put("DiagramObject", new AttrDetails("DiagramObjectPoint.DiagramObject", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, DiagramObjectPoint::getDiagramObject, DiagramObjectPoint::setDiagramObject));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("DiagramObjectGluePoint", new AttrDetails("DiagramObjectPoint.DiagramObjectGluePoint", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, DiagramObjectPoint::getDiagramObjectGluePoint, DiagramObjectPoint::setDiagramObjectGluePoint));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("sequenceNumber", new AttrDetails("DiagramObjectPoint.sequenceNumber", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, DiagramObjectPoint::getSequenceNumber, DiagramObjectPoint::setSequenceNumber));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("xPosition", new AttrDetails("DiagramObjectPoint.xPosition", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, DiagramObjectPoint::getXPosition, DiagramObjectPoint::setXPosition));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("yPosition", new AttrDetails("DiagramObjectPoint.yPosition", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, DiagramObjectPoint::getYPosition, DiagramObjectPoint::setYPosition));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("zPosition", new AttrDetails("DiagramObjectPoint.zPosition", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, DiagramObjectPoint::getZPosition, DiagramObjectPoint::setZPosition));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new DiagramObjectPoint(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
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
