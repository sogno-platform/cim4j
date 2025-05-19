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
 * The diagram being exchanged.  The coordinate system is a standard Cartesian coordinate system and the orientation attribute defines the orientation.
 */
@SuppressWarnings("unused")
public class Diagram extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(Diagram.class);

    /**
     * Default constructor.
     */
    public Diagram() {
        setCimType("Diagram");
    }

    /**
     * A diagram is made up of multiple diagram objects.
     *
     * NOT USED
     */
    private Set<DiagramObject> DiagramElements = new HashSet<>(); // OneToMany

    public Set<DiagramObject> getDiagramElements() {
        return DiagramElements;
    }

    public void setDiagramElements(BaseClass _object_) {
        if (!(_object_ instanceof DiagramObject)) {
            throw new IllegalArgumentException("Object is not DiagramObject");
        }
        if (!DiagramElements.contains(_object_)) {
            DiagramElements.add((DiagramObject) _object_);
            ((DiagramObject) _object_).setDiagram(this);
        }
    }

    public String DiagramElementsToString() {
        return getStringFromSet(DiagramElements);
    }

    /**
     * A Diagram may have a DiagramStyle.
     */
    private DiagramStyle DiagramStyle; // ManyToOne

    public DiagramStyle getDiagramStyle() {
        return DiagramStyle;
    }

    public void setDiagramStyle(BaseClass _object_) {
        if (!(_object_ instanceof DiagramStyle)) {
            throw new IllegalArgumentException("Object is not DiagramStyle");
        }
        if (DiagramStyle != _object_) {
            DiagramStyle = (DiagramStyle) _object_;
            DiagramStyle.setDiagram(this);
        }
    }

    public String DiagramStyleToString() {
        return DiagramStyle != null ? DiagramStyle.getRdfid() : null;
    }

    /**
     * Coordinate system orientation of the diagram.
     */
    private String orientation; // OrientationKind

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String _value_) {
        orientation = _value_;
    }

    public String orientationToString() {
        return orientation;
    }

    /**
     * X coordinate of the first corner of the initial view.
     */
    private Double x1InitialView; // Simple_Float

    public Double getX1InitialView() {
        return x1InitialView;
    }

    public void setX1InitialView(Double _value_) {
        x1InitialView = _value_;
    }

    public void setX1InitialView(String _value_) {
        x1InitialView = getDoubleFromString(_value_);
    }

    public String x1InitialViewToString() {
        return x1InitialView != null ? x1InitialView.toString() : null;
    }

    /**
     * X coordinate of the second corner of the initial view.
     */
    private Double x2InitialView; // Simple_Float

    public Double getX2InitialView() {
        return x2InitialView;
    }

    public void setX2InitialView(Double _value_) {
        x2InitialView = _value_;
    }

    public void setX2InitialView(String _value_) {
        x2InitialView = getDoubleFromString(_value_);
    }

    public String x2InitialViewToString() {
        return x2InitialView != null ? x2InitialView.toString() : null;
    }

    /**
     * Y coordinate of the first corner of the initial view.
     */
    private Double y1InitialView; // Simple_Float

    public Double getY1InitialView() {
        return y1InitialView;
    }

    public void setY1InitialView(Double _value_) {
        y1InitialView = _value_;
    }

    public void setY1InitialView(String _value_) {
        y1InitialView = getDoubleFromString(_value_);
    }

    public String y1InitialViewToString() {
        return y1InitialView != null ? y1InitialView.toString() : null;
    }

    /**
     * Y coordinate of the second corner of the initial view.
     */
    private Double y2InitialView; // Simple_Float

    public Double getY2InitialView() {
        return y2InitialView;
    }

    public void setY2InitialView(Double _value_) {
        y2InitialView = _value_;
    }

    public void setY2InitialView(String _value_) {
        y2InitialView = getDoubleFromString(_value_);
    }

    public String y2InitialViewToString() {
        return y2InitialView != null ? y2InitialView.toString() : null;
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
        return getAttribute("Diagram", attrName);
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
        setAttribute("Diagram", attrName, objectValue);
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
        setAttribute("Diagram", attrName, stringValue);
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
            map.put("DiagramElements", new AttrDetails("Diagram.DiagramElements", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("DiagramStyle", new AttrDetails("Diagram.DiagramStyle", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("orientation", new AttrDetails("Diagram.orientation", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("x1InitialView", new AttrDetails("Diagram.x1InitialView", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("x2InitialView", new AttrDetails("Diagram.x2InitialView", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("y1InitialView", new AttrDetails("Diagram.y1InitialView", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("y2InitialView", new AttrDetails("Diagram.y2InitialView", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new Diagram().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("DiagramElements", new GetterSetter(this::DiagramElementsToString, this::setDiagramElements, null));
        map.put("DiagramStyle", new GetterSetter(this::DiagramStyleToString, this::setDiagramStyle, null));
        map.put("orientation", new GetterSetter(this::orientationToString, null, this::setOrientation));
        map.put("x1InitialView", new GetterSetter(this::x1InitialViewToString, null, this::setX1InitialView));
        map.put("x2InitialView", new GetterSetter(this::x2InitialViewToString, null, this::setX2InitialView));
        map.put("y1InitialView", new GetterSetter(this::y1InitialViewToString, null, this::setY1InitialView));
        map.put("y2InitialView", new GetterSetter(this::y2InitialViewToString, null, this::setY2InitialView));
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
