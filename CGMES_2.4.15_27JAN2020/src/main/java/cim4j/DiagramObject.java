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
     * Default constructor.
     */
    public DiagramObject() {
        setCimType("DiagramObject");
    }

    /**
     * A diagram object is part of a diagram.
     */
    private Diagram Diagram; // ManyToOne

    public Diagram getDiagram() {
        return Diagram;
    }

    public void setDiagram(BaseClass _object_) {
        if (!(_object_ instanceof Diagram)) {
            throw new IllegalArgumentException("Object is not Diagram");
        }
        if (Diagram != _object_) {
            Diagram = (Diagram) _object_;
            Diagram.setDiagramElements(this);
        }
    }

    public String DiagramToString() {
        return Diagram != null ? Diagram.getRdfid() : null;
    }

    /**
     * A diagram object can have 0 or more points to reflect its layout position, routing (for polylines) or boundary (for polygons).
     *
     * NOT USED
     */
    private Set<DiagramObjectPoint> DiagramObjectPoints = new HashSet<>(); // OneToMany

    public Set<DiagramObjectPoint> getDiagramObjectPoints() {
        return DiagramObjectPoints;
    }

    public void setDiagramObjectPoints(BaseClass _object_) {
        if (!(_object_ instanceof DiagramObjectPoint)) {
            throw new IllegalArgumentException("Object is not DiagramObjectPoint");
        }
        if (!DiagramObjectPoints.contains(_object_)) {
            DiagramObjectPoints.add((DiagramObjectPoint) _object_);
            ((DiagramObjectPoint) _object_).setDiagramObject(this);
        }
    }

    public String DiagramObjectPointsToString() {
        return getStringFromSet(DiagramObjectPoints);
    }

    /**
     * A diagram object has a style associated that provides a reference for the style used in the originating system.
     */
    private DiagramObjectStyle DiagramObjectStyle; // ManyToOne

    public DiagramObjectStyle getDiagramObjectStyle() {
        return DiagramObjectStyle;
    }

    public void setDiagramObjectStyle(BaseClass _object_) {
        if (!(_object_ instanceof DiagramObjectStyle)) {
            throw new IllegalArgumentException("Object is not DiagramObjectStyle");
        }
        if (DiagramObjectStyle != _object_) {
            DiagramObjectStyle = (DiagramObjectStyle) _object_;
            DiagramObjectStyle.setStyledObjects(this);
        }
    }

    public String DiagramObjectStyleToString() {
        return DiagramObjectStyle != null ? DiagramObjectStyle.getRdfid() : null;
    }

    /**
     * The diagram objects that are associated with the domain object.
     */
    private IdentifiedObject IdentifiedObject; // ManyToOne

    public IdentifiedObject getIdentifiedObject() {
        return IdentifiedObject;
    }

    public void setIdentifiedObject(BaseClass _object_) {
        if (!(_object_ instanceof IdentifiedObject)) {
            throw new IllegalArgumentException("Object is not IdentifiedObject");
        }
        if (IdentifiedObject != _object_) {
            IdentifiedObject = (IdentifiedObject) _object_;
            IdentifiedObject.setDiagramObjects(this);
        }
    }

    public String IdentifiedObjectToString() {
        return IdentifiedObject != null ? IdentifiedObject.getRdfid() : null;
    }

    /**
     * A diagram object can be part of multiple visibility layers.
     *
     * NOT USED
     */
    private Set<VisibilityLayer> VisibilityLayers = new HashSet<>(); // OneToMany

    public Set<VisibilityLayer> getVisibilityLayers() {
        return VisibilityLayers;
    }

    public void setVisibilityLayers(BaseClass _object_) {
        if (!(_object_ instanceof VisibilityLayer)) {
            throw new IllegalArgumentException("Object is not VisibilityLayer");
        }
        if (!VisibilityLayers.contains(_object_)) {
            VisibilityLayers.add((VisibilityLayer) _object_);
            ((VisibilityLayer) _object_).setVisibleObjects(this);
        }
    }

    public String VisibilityLayersToString() {
        return getStringFromSet(VisibilityLayers);
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

    public void setDrawingOrder(String _value_) {
        drawingOrder = getIntegerFromString(_value_);
    }

    public String drawingOrderToString() {
        return drawingOrder != null ? drawingOrder.toString() : null;
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

    public void setIsPolygon(String _value_) {
        isPolygon = getBooleanFromString(_value_);
    }

    public String isPolygonToString() {
        return isPolygon != null ? isPolygon.toString() : null;
    }

    /**
     * The offset in the X direction. This is used for defining the offset from centre for rendering an icon (the default is that a single point specifies the centre of the icon).  The offset is in per-unit with 0 indicating there is no offset from the horizontal centre of the icon.  -0.5 indicates it is offset by 50% to the left and 0.5 indicates an offset of 50% to the right.
     */
    private Double offsetX; // Simple_Float

    public Double getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(Double _value_) {
        offsetX = _value_;
    }

    public void setOffsetX(String _value_) {
        offsetX = getDoubleFromString(_value_);
    }

    public String offsetXToString() {
        return offsetX != null ? offsetX.toString() : null;
    }

    /**
     * The offset in the Y direction. This is used for defining the offset from centre for rendering an icon (the default is that a single point specifies the centre of the icon).  The offset is in per-unit with 0 indicating there is no offset from the vertical centre of the icon.  The offset direction is dependent on the orientation of the diagram, with -0.5 and 0.5 indicating an offset of +/- 50% on the vertical axis.
     */
    private Double offsetY; // Simple_Float

    public Double getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(Double _value_) {
        offsetY = _value_;
    }

    public void setOffsetY(String _value_) {
        offsetY = getDoubleFromString(_value_);
    }

    public String offsetYToString() {
        return offsetY != null ? offsetY.toString() : null;
    }

    /**
     * Sets the angle of rotation of the diagram object.  Zero degrees is pointing to the top of the diagram.  Rotation is clockwise.
     */
    private Double rotation; // AngleDegrees

    public Double getRotation() {
        return rotation;
    }

    public void setRotation(Double _value_) {
        rotation = _value_;
    }

    public void setRotation(String _value_) {
        rotation = getDoubleFromString(_value_);
    }

    public String rotationToString() {
        return rotation != null ? rotation.toString() : null;
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
        return getAttribute("DiagramObject", attrName);
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
        setAttribute("DiagramObject", attrName, objectValue);
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
        setAttribute("DiagramObject", attrName, stringValue);
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

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/2013/CIM-schema-cim16#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("Diagram", new AttrDetails("DiagramObject.Diagram", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("DiagramObjectPoints", new AttrDetails("DiagramObject.DiagramObjectPoints", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("DiagramObjectStyle", new AttrDetails("DiagramObject.DiagramObjectStyle", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("IdentifiedObject", new AttrDetails("DiagramObject.IdentifiedObject", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("VisibilityLayers", new AttrDetails("DiagramObject.VisibilityLayers", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("drawingOrder", new AttrDetails("DiagramObject.drawingOrder", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("isPolygon", new AttrDetails("DiagramObject.isPolygon", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("offsetX", new AttrDetails("DiagramObject.offsetX", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("offsetY", new AttrDetails("DiagramObject.offsetY", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("rotation", new AttrDetails("DiagramObject.rotation", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new DiagramObject().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("Diagram", new GetterSetter(this::DiagramToString, this::setDiagram, null));
        map.put("DiagramObjectPoints", new GetterSetter(this::DiagramObjectPointsToString, this::setDiagramObjectPoints, null));
        map.put("DiagramObjectStyle", new GetterSetter(this::DiagramObjectStyleToString, this::setDiagramObjectStyle, null));
        map.put("IdentifiedObject", new GetterSetter(this::IdentifiedObjectToString, this::setIdentifiedObject, null));
        map.put("VisibilityLayers", new GetterSetter(this::VisibilityLayersToString, this::setVisibilityLayers, null));
        map.put("drawingOrder", new GetterSetter(this::drawingOrderToString, null, this::setDrawingOrder));
        map.put("isPolygon", new GetterSetter(this::isPolygonToString, null, this::setIsPolygon));
        map.put("offsetX", new GetterSetter(this::offsetXToString, null, this::setOffsetX));
        map.put("offsetY", new GetterSetter(this::offsetYToString, null, this::setOffsetY));
        map.put("rotation", new GetterSetter(this::rotationToString, null, this::setRotation));
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
