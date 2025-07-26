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
 * This is a root class to provide common identification for all classes needing identification and naming attributes.
 */
@SuppressWarnings("unused")
public class IdentifiedObject extends BaseClass {

    private static final Logging LOG = Logging.getLogger(IdentifiedObject.class);

    /**
     * Constructor.
     */
    public IdentifiedObject(String rdfid) {
        super("IdentifiedObject", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected IdentifiedObject(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The domain object to which this diagram object is associated.
     *
     * NOT USED
     */
    private Set<DiagramObject> DiagramObjects = new HashSet<>(); // OneToMany

    private Set<String> DiagramObjectsIdSet = new HashSet<>();

    public Set<DiagramObject> getDiagramObjects() {
        return DiagramObjects;
    }

    public void setDiagramObjects(DiagramObject _object_) {
        if (!DiagramObjects.contains(_object_)) {
            DiagramObjects.add(_object_);
            _object_.setIdentifiedObject(this);
            DiagramObjectsIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getDiagramObjects(BaseClass _this_) {
        var objs = ((IdentifiedObject) _this_).getDiagramObjects();
        var ids = ((IdentifiedObject) _this_).DiagramObjectsIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setDiagramObjects(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((IdentifiedObject) _this_).DiagramObjectsIdSet.add((String) _value_);
        } else if (_value_ instanceof DiagramObject) {
            ((IdentifiedObject) _this_).setDiagramObjects((DiagramObject) _value_);
        } else {
            throw new IllegalArgumentException("Object is not DiagramObject");
        }
    }

    /**
     * The description is a free human readable text describing or naming the object. It may be non unique and may not correlate to a naming hierarchy.
     */
    private String description; // String

    public String getDescription() {
        return description;
    }

    public void setDescription(String _value_) {
        description = _value_;
    }

    private static Object getDescription(BaseClass _this_) {
        return ((IdentifiedObject) _this_).getDescription();
    }

    private static void setDescription(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((IdentifiedObject) _this_).setDescription((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * The attribute is used for an exchange of the EIC code (Energy identification Code). The length of the string is 16 characters as defined by the EIC code. References:
     */
    private String energyIdentCodeEic; // String

    public String getEnergyIdentCodeEic() {
        return energyIdentCodeEic;
    }

    public void setEnergyIdentCodeEic(String _value_) {
        energyIdentCodeEic = _value_;
    }

    private static Object getEnergyIdentCodeEic(BaseClass _this_) {
        return ((IdentifiedObject) _this_).getEnergyIdentCodeEic();
    }

    private static void setEnergyIdentCodeEic(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((IdentifiedObject) _this_).setEnergyIdentCodeEic((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Master resource identifier issued by a model authority. The mRID is globally unique within an exchange context. Global uniqueness is easily achieved by using a UUID,  as specified in RFC 4122, for the mRID.  The use of UUID is strongly recommended. For CIMXML data files in RDF syntax conforming to IEC 61970-552 Edition 1, the mRID is mapped to rdf:ID or rdf:about attributes that identify CIM object elements.
     */
    private String mRID; // String

    public String getMRID() {
        return mRID;
    }

    public void setMRID(String _value_) {
        mRID = _value_;
    }

    private static Object getMRID(BaseClass _this_) {
        return ((IdentifiedObject) _this_).getMRID();
    }

    private static void setMRID(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((IdentifiedObject) _this_).setMRID((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * The name is any free human readable and possibly non unique text naming the object.
     */
    private String name; // String

    public String getName() {
        return name;
    }

    public void setName(String _value_) {
        name = _value_;
    }

    private static Object getName(BaseClass _this_) {
        return ((IdentifiedObject) _this_).getName();
    }

    private static void setName(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((IdentifiedObject) _this_).setName((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * The attribute is used for an exchange of a human readable short name with length of the string 12 characters maximum.
     */
    private String shortName; // String

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String _value_) {
        shortName = _value_;
    }

    private static Object getShortName(BaseClass _this_) {
        return ((IdentifiedObject) _this_).getShortName();
    }

    private static void setShortName(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((IdentifiedObject) _this_).setShortName((String) _value_);
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "IdentifiedObject", attrName));
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
                "IdentifiedObject", attrName, value));
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
            map.put("DiagramObjects", new AttrDetails("IdentifiedObject.DiagramObjects", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, IdentifiedObject::getDiagramObjects, IdentifiedObject::setDiagramObjects));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            profiles.add(CGMESProfile.EQ_BD);
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.TP_BD);
            profiles.add(CGMESProfile.TP);
            map.put("description", new AttrDetails("IdentifiedObject.description", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, IdentifiedObject::getDescription, IdentifiedObject::setDescription));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ_BD);
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.TP_BD);
            profiles.add(CGMESProfile.TP);
            map.put("energyIdentCodeEic", new AttrDetails("IdentifiedObject.energyIdentCodeEic", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false, IdentifiedObject::getEnergyIdentCodeEic, IdentifiedObject::setEnergyIdentCodeEic));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            profiles.add(CGMESProfile.DY);
            profiles.add(CGMESProfile.EQ_BD);
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.GL);
            profiles.add(CGMESProfile.SV);
            profiles.add(CGMESProfile.SSH);
            profiles.add(CGMESProfile.TP_BD);
            profiles.add(CGMESProfile.TP);
            map.put("mRID", new AttrDetails("IdentifiedObject.mRID", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, IdentifiedObject::getMRID, IdentifiedObject::setMRID));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DL);
            profiles.add(CGMESProfile.DY);
            profiles.add(CGMESProfile.EQ_BD);
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.GL);
            profiles.add(CGMESProfile.SV);
            profiles.add(CGMESProfile.SSH);
            profiles.add(CGMESProfile.TP_BD);
            profiles.add(CGMESProfile.TP);
            map.put("name", new AttrDetails("IdentifiedObject.name", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, IdentifiedObject::getName, IdentifiedObject::setName));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ_BD);
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.TP_BD);
            profiles.add(CGMESProfile.TP);
            map.put("shortName", new AttrDetails("IdentifiedObject.shortName", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false, IdentifiedObject::getShortName, IdentifiedObject::setShortName));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new IdentifiedObject(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.DL);
        profiles.add(CGMESProfile.DY);
        profiles.add(CGMESProfile.EQ_BD);
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.GL);
        profiles.add(CGMESProfile.SV);
        profiles.add(CGMESProfile.SSH);
        profiles.add(CGMESProfile.TP_BD);
        profiles.add(CGMESProfile.TP);
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
