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
 * An object that defines one or more points in a given space. This object can be associated with anything that specializes IdentifiedObject. For single line diagrams such objects typically include such items as analog values, breakers, disconnectors, power transformers, and transmission lines.
 */
@SuppressWarnings("unused")
public class DiagramObject extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(DiagramObject.class);

    /**
     * Constructor.
     */
    public DiagramObject(String rdfid) {
        super("DiagramObject", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected DiagramObject(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * A diagram object is part of a diagram.
     */
    private Diagram Diagram; // ManyToOne

    private String DiagramId;

    public Diagram getDiagram() {
        return Diagram;
    }

    public void setDiagram(Diagram _object_) {
        if (Diagram != _object_) {
            Diagram = _object_;
            _object_.setDiagramElements(this);
            DiagramId = _object_.getRdfid();
        }
    }

    private static Object getDiagram(BaseClass _this_) {
        var obj = ((DiagramObject) _this_).getDiagram();
        var id = ((DiagramObject) _this_).DiagramId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setDiagram(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((DiagramObject) _this_).DiagramId = (String) _value_;
        } else if (_value_ instanceof Diagram) {
            ((DiagramObject) _this_).setDiagram((Diagram) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Diagram");
        }
    }

    /**
     * A diagram object can have 0 or more points to reflect its layout position, routing (for polylines) or boundary (for polygons).
     *
     * NOT USED
     */
    private Set<DiagramObjectPoint> DiagramObjectPoints = new HashSet<>(); // OneToMany

    private Set<String> DiagramObjectPointsIdSet = new HashSet<>();

    public Set<DiagramObjectPoint> getDiagramObjectPoints() {
        return DiagramObjectPoints;
    }

    public void setDiagramObjectPoints(DiagramObjectPoint _object_) {
        if (!DiagramObjectPoints.contains(_object_)) {
            DiagramObjectPoints.add(_object_);
            _object_.setDiagramObject(this);
            DiagramObjectPointsIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getDiagramObjectPoints(BaseClass _this_) {
        var objs = ((DiagramObject) _this_).getDiagramObjectPoints();
        var ids = ((DiagramObject) _this_).DiagramObjectPointsIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setDiagramObjectPoints(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((DiagramObject) _this_).DiagramObjectPointsIdSet.add((String) _value_);
        } else if (_value_ instanceof DiagramObjectPoint) {
            ((DiagramObject) _this_).setDiagramObjectPoints((DiagramObjectPoint) _value_);
        } else {
            throw new IllegalArgumentException("Object is not DiagramObjectPoint");
        }
    }

    /**
     * A diagram object has a style associated that provides a reference for the style used in the originating system.
     */
    private DiagramObjectStyle DiagramObjectStyle; // ManyToOne

    private String DiagramObjectStyleId;

    public DiagramObjectStyle getDiagramObjectStyle() {
        return DiagramObjectStyle;
    }

    public void setDiagramObjectStyle(DiagramObjectStyle _object_) {
        if (DiagramObjectStyle != _object_) {
            DiagramObjectStyle = _object_;
            _object_.setStyledObjects(this);
            DiagramObjectStyleId = _object_.getRdfid();
        }
    }

    private static Object getDiagramObjectStyle(BaseClass _this_) {
        var obj = ((DiagramObject) _this_).getDiagramObjectStyle();
        var id = ((DiagramObject) _this_).DiagramObjectStyleId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setDiagramObjectStyle(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((DiagramObject) _this_).DiagramObjectStyleId = (String) _value_;
        } else if (_value_ instanceof DiagramObjectStyle) {
            ((DiagramObject) _this_).setDiagramObjectStyle((DiagramObjectStyle) _value_);
        } else {
            throw new IllegalArgumentException("Object is not DiagramObjectStyle");
        }
    }

    /**
     * The domain object to which this diagram object is associated.
     */
    private IdentifiedObject IdentifiedObject; // ManyToOne

    private String IdentifiedObjectId;

    public IdentifiedObject getIdentifiedObject() {
        return IdentifiedObject;
    }

    public void setIdentifiedObject(IdentifiedObject _object_) {
        if (IdentifiedObject != _object_) {
            IdentifiedObject = _object_;
            _object_.setDiagramObjects(this);
            IdentifiedObjectId = _object_.getRdfid();
        }
    }

    private static Object getIdentifiedObject(BaseClass _this_) {
        var obj = ((DiagramObject) _this_).getIdentifiedObject();
        var id = ((DiagramObject) _this_).IdentifiedObjectId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setIdentifiedObject(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((DiagramObject) _this_).IdentifiedObjectId = (String) _value_;
        } else if (_value_ instanceof IdentifiedObject) {
            ((DiagramObject) _this_).setIdentifiedObject((IdentifiedObject) _value_);
        } else {
            throw new IllegalArgumentException("Object is not IdentifiedObject");
        }
    }

    /**
     * A diagram object can be part of multiple visibility layers.
     *
     * NOT USED
     */
    private Set<VisibilityLayer> VisibilityLayers = new HashSet<>(); // OneToMany

    private Set<String> VisibilityLayersIdSet = new HashSet<>();

    public Set<VisibilityLayer> getVisibilityLayers() {
        return VisibilityLayers;
    }

    public void setVisibilityLayers(VisibilityLayer _object_) {
        if (!VisibilityLayers.contains(_object_)) {
            VisibilityLayers.add(_object_);
            _object_.setVisibleObjects(this);
            VisibilityLayersIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getVisibilityLayers(BaseClass _this_) {
        var objs = ((DiagramObject) _this_).getVisibilityLayers();
        var ids = ((DiagramObject) _this_).VisibilityLayersIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setVisibilityLayers(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((DiagramObject) _this_).VisibilityLayersIdSet.add((String) _value_);
        } else if (_value_ instanceof VisibilityLayer) {
            ((DiagramObject) _this_).setVisibilityLayers((VisibilityLayer) _value_);
        } else {
            throw new IllegalArgumentException("Object is not VisibilityLayer");
        }
    }

    /**
     * The drawing order of this element. The higher the number, the later the element is drawn in sequence. This is used to ensure that elements that overlap are rendered in the correct order.
     */
    private Integer drawingOrder; // Integer

    public Integer getDrawingOrder() {
        return drawingOrder;
    }

    public void setDrawingOrder(Integer _value_) {
        drawingOrder = _value_;
    }

    private static Object getDrawingOrder(BaseClass _this_) {
        return ((DiagramObject) _this_).getDrawingOrder();
    }

    private static void setDrawingOrder(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((DiagramObject) _this_).setDrawingOrder((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((DiagramObject) _this_).setDrawingOrder(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
        }
    }

    /**
     * Defines whether or not the diagram objects points define the boundaries of a polygon or the routing of a polyline. If this value is true then a receiving application should consider the first and last points to be connected.
     */
    private Boolean isPolygon; // Boolean

    public Boolean getIsPolygon() {
        return isPolygon;
    }

    public void setIsPolygon(Boolean _value_) {
        isPolygon = _value_;
    }

    private static Object getIsPolygon(BaseClass _this_) {
        return ((DiagramObject) _this_).getIsPolygon();
    }

    private static void setIsPolygon(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((DiagramObject) _this_).setIsPolygon((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((DiagramObject) _this_).setIsPolygon(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * The offset in the X direction. This is used for defining the offset from centre for rendering an icon (the default is that a single point specifies the centre of the icon).  The offset is in per-unit with 0 indicating there is no offset from the horizontal centre of the icon.  -0.5 indicates it is offset by 50% to the left and 0.5 indicates an offset of 50% to the right.
     */
    private Float offsetX; // Float

    public Float getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(Float _value_) {
        offsetX = _value_;
    }

    private static Object getOffsetX(BaseClass _this_) {
        return ((DiagramObject) _this_).getOffsetX();
    }

    private static void setOffsetX(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((DiagramObject) _this_).setOffsetX((Float) _value_);
        } else if (_value_ instanceof String) {
            ((DiagramObject) _this_).setOffsetX(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * The offset in the Y direction. This is used for defining the offset from centre for rendering an icon (the default is that a single point specifies the centre of the icon).  The offset is in per-unit with 0 indicating there is no offset from the vertical centre of the icon.  The offset direction is dependent on the orientation of the diagram, with -0.5 and 0.5 indicating an offset of +/- 50% on the vertical axis.
     */
    private Float offsetY; // Float

    public Float getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(Float _value_) {
        offsetY = _value_;
    }

    private static Object getOffsetY(BaseClass _this_) {
        return ((DiagramObject) _this_).getOffsetY();
    }

    private static void setOffsetY(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((DiagramObject) _this_).setOffsetY((Float) _value_);
        } else if (_value_ instanceof String) {
            ((DiagramObject) _this_).setOffsetY(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Sets the angle of rotation of the diagram object.  Zero degrees is pointing to the top of the diagram.  Rotation is clockwise.  DiagramObject.rotation=0 has the following meaning: The connection point of an element which has one terminal is pointing to the top side of the diagram. The connection point `From side` of an element which has more than one terminal is pointing to the top side of the diagram. DiagramObject.rotation=90 has the following meaning: The connection point of an element which has one terminal is pointing to the right hand side of the diagram. The connection point `From side` of an element which has more than one terminal is pointing to the right hand side of the diagram.
     */
    private Double rotation; // AngleDegrees

    public Double getRotation() {
        return rotation;
    }

    public void setRotation(Double _value_) {
        rotation = _value_;
    }

    private static Object getRotation(BaseClass _this_) {
        return ((DiagramObject) _this_).getRotation();
    }

    private static void setRotation(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiagramObject) _this_).setRotation((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiagramObject) _this_).setRotation(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "DiagramObject", attrName));
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
                "DiagramObject", attrName, value));
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
            map.put("Diagram", new AttrDetails("DiagramObject.Diagram", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, DiagramObject::getDiagram, DiagramObject::setDiagram));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("DiagramObjectPoints", new AttrDetails("DiagramObject.DiagramObjectPoints", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, DiagramObject::getDiagramObjectPoints, DiagramObject::setDiagramObjectPoints));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("DiagramObjectStyle", new AttrDetails("DiagramObject.DiagramObjectStyle", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, DiagramObject::getDiagramObjectStyle, DiagramObject::setDiagramObjectStyle));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("IdentifiedObject", new AttrDetails("DiagramObject.IdentifiedObject", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, DiagramObject::getIdentifiedObject, DiagramObject::setIdentifiedObject));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("VisibilityLayers", new AttrDetails("DiagramObject.VisibilityLayers", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, DiagramObject::getVisibilityLayers, DiagramObject::setVisibilityLayers));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("drawingOrder", new AttrDetails("DiagramObject.drawingOrder", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiagramObject::getDrawingOrder, DiagramObject::setDrawingOrder));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("isPolygon", new AttrDetails("DiagramObject.isPolygon", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiagramObject::getIsPolygon, DiagramObject::setIsPolygon));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("offsetX", new AttrDetails("DiagramObject.offsetX", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiagramObject::getOffsetX, DiagramObject::setOffsetX));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("offsetY", new AttrDetails("DiagramObject.offsetY", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiagramObject::getOffsetY, DiagramObject::setOffsetY));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("rotation", new AttrDetails("DiagramObject.rotation", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiagramObject::getRotation, DiagramObject::setRotation));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new DiagramObject(null).allAttrDetailsMap());
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
