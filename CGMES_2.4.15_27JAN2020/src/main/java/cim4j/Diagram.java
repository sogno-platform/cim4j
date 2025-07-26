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
     * Constructor.
     */
    public Diagram(String rdfid) {
        super("Diagram", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected Diagram(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * A diagram is made up of multiple diagram objects.
     *
     * NOT USED
     */
    private Set<DiagramObject> DiagramElements = new HashSet<>(); // OneToMany

    private Set<String> DiagramElementsIdSet = new HashSet<>();

    public Set<DiagramObject> getDiagramElements() {
        return DiagramElements;
    }

    public void setDiagramElements(DiagramObject _object_) {
        if (!DiagramElements.contains(_object_)) {
            DiagramElements.add(_object_);
            _object_.setDiagram(this);
            DiagramElementsIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getDiagramElements(BaseClass _this_) {
        var objs = ((Diagram) _this_).getDiagramElements();
        var ids = ((Diagram) _this_).DiagramElementsIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setDiagramElements(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Diagram) _this_).DiagramElementsIdSet.add((String) _value_);
        } else if (_value_ instanceof DiagramObject) {
            ((Diagram) _this_).setDiagramElements((DiagramObject) _value_);
        } else {
            throw new IllegalArgumentException("Object is not DiagramObject");
        }
    }

    /**
     * A Diagram may have a DiagramStyle.
     */
    private DiagramStyle DiagramStyle; // ManyToOne

    private String DiagramStyleId;

    public DiagramStyle getDiagramStyle() {
        return DiagramStyle;
    }

    public void setDiagramStyle(DiagramStyle _object_) {
        if (DiagramStyle != _object_) {
            DiagramStyle = _object_;
            _object_.setDiagram(this);
            DiagramStyleId = _object_.getRdfid();
        }
    }

    private static Object getDiagramStyle(BaseClass _this_) {
        var obj = ((Diagram) _this_).getDiagramStyle();
        var id = ((Diagram) _this_).DiagramStyleId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setDiagramStyle(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Diagram) _this_).DiagramStyleId = (String) _value_;
        } else if (_value_ instanceof DiagramStyle) {
            ((Diagram) _this_).setDiagramStyle((DiagramStyle) _value_);
        } else {
            throw new IllegalArgumentException("Object is not DiagramStyle");
        }
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

    private static Object getOrientation(BaseClass _this_) {
        return ((Diagram) _this_).getOrientation();
    }

    private static void setOrientation(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Diagram) _this_).setOrientation((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
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

    private static Object getX1InitialView(BaseClass _this_) {
        return ((Diagram) _this_).getX1InitialView();
    }

    private static void setX1InitialView(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Diagram) _this_).setX1InitialView((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Diagram) _this_).setX1InitialView(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getX2InitialView(BaseClass _this_) {
        return ((Diagram) _this_).getX2InitialView();
    }

    private static void setX2InitialView(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Diagram) _this_).setX2InitialView((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Diagram) _this_).setX2InitialView(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getY1InitialView(BaseClass _this_) {
        return ((Diagram) _this_).getY1InitialView();
    }

    private static void setY1InitialView(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Diagram) _this_).setY1InitialView((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Diagram) _this_).setY1InitialView(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getY2InitialView(BaseClass _this_) {
        return ((Diagram) _this_).getY2InitialView();
    }

    private static void setY2InitialView(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Diagram) _this_).setY2InitialView((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Diagram) _this_).setY2InitialView(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "Diagram", attrName));
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
                "Diagram", attrName, value));
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
            map.put("DiagramElements", new AttrDetails("Diagram.DiagramElements", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, Diagram::getDiagramElements, Diagram::setDiagramElements));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("DiagramStyle", new AttrDetails("Diagram.DiagramStyle", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, Diagram::getDiagramStyle, Diagram::setDiagramStyle));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("orientation", new AttrDetails("Diagram.orientation", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, Diagram::getOrientation, Diagram::setOrientation));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("x1InitialView", new AttrDetails("Diagram.x1InitialView", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Diagram::getX1InitialView, Diagram::setX1InitialView));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("x2InitialView", new AttrDetails("Diagram.x2InitialView", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Diagram::getX2InitialView, Diagram::setX2InitialView));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("y1InitialView", new AttrDetails("Diagram.y1InitialView", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Diagram::getY1InitialView, Diagram::setY1InitialView));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            map.put("y2InitialView", new AttrDetails("Diagram.y2InitialView", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Diagram::getY2InitialView, Diagram::setY2InitialView));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new Diagram(null).allAttrDetailsMap());
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
