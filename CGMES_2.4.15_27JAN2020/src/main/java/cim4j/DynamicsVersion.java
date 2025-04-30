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
 * Version details.
 */
@SuppressWarnings("unused")
public class DynamicsVersion extends BaseClass {

    private static final Logging LOG = Logging.getLogger(DynamicsVersion.class);

    /**
     * Default constructor.
     */
    public DynamicsVersion() {
        setCimType("DynamicsVersion");
    }

    /**
     * Base UML provided by CIM model manager.
     */
    private String baseUML; // String

    public String getBaseUML() {
        return baseUML;
    }

    public void setBaseUML(String _value_) {
        baseUML = _value_;
    }

    public String baseUMLToString() {
        return baseUML != null ? baseUML.toString() : null;
    }

    /**
     * Profile URI used in the Model Exchange header and defined in IEC standards.  It uniquely identifies the Profile and its version. It is given for information only and to identify the closest IEC profile to which this CGMES profile is based on.
     */
    private String baseURI; // String

    public String getBaseURI() {
        return baseURI;
    }

    public void setBaseURI(String _value_) {
        baseURI = _value_;
    }

    public String baseURIToString() {
        return baseURI != null ? baseURI.toString() : null;
    }

    /**
     * Profile creation date Form is YYYY-MM-DD for example for January 5, 2009 it is 2009-01-05.
     */
    private String date; // Date

    public String getDate() {
        return date;
    }

    public void setDate(String _value_) {
        date = _value_;
    }

    public String dateToString() {
        return date != null ? date.toString() : null;
    }

    /**
     * Difference model URI defined by IEC 61970-552.
     */
    private String differenceModelURI; // String

    public String getDifferenceModelURI() {
        return differenceModelURI;
    }

    public void setDifferenceModelURI(String _value_) {
        differenceModelURI = _value_;
    }

    public String differenceModelURIToString() {
        return differenceModelURI != null ? differenceModelURI.toString() : null;
    }

    /**
     * UML provided by ENTSO-E.
     */
    private String entsoeUML; // String

    public String getEntsoeUML() {
        return entsoeUML;
    }

    public void setEntsoeUML(String _value_) {
        entsoeUML = _value_;
    }

    public String entsoeUMLToString() {
        return entsoeUML != null ? entsoeUML.toString() : null;
    }

    /**
     * Profile URI defined by ENTSO-E and used in the Model Exchange header.  It uniquely identifies the Profile and its version. The last two elements in the URI (http://entsoe.eu/CIM/Dynamics/yy/zzz) indicate major and minor versions where:  - yy - indicates a major version; - zzz - indicates a minor version.
     */
    private String entsoeURI; // String

    public String getEntsoeURI() {
        return entsoeURI;
    }

    public void setEntsoeURI(String _value_) {
        entsoeURI = _value_;
    }

    public String entsoeURIToString() {
        return entsoeURI != null ? entsoeURI.toString() : null;
    }

    /**
     * Model Description URI defined by IEC 61970-552.
     */
    private String modelDescriptionURI; // String

    public String getModelDescriptionURI() {
        return modelDescriptionURI;
    }

    public void setModelDescriptionURI(String _value_) {
        modelDescriptionURI = _value_;
    }

    public String modelDescriptionURIToString() {
        return modelDescriptionURI != null ? modelDescriptionURI.toString() : null;
    }

    /**
     * RDF namespace.
     */
    private String namespaceRDF; // String

    public String getNamespaceRDF() {
        return namespaceRDF;
    }

    public void setNamespaceRDF(String _value_) {
        namespaceRDF = _value_;
    }

    public String namespaceRDFToString() {
        return namespaceRDF != null ? namespaceRDF.toString() : null;
    }

    /**
     * CIM UML namespace.
     */
    private String namespaceUML; // String

    public String getNamespaceUML() {
        return namespaceUML;
    }

    public void setNamespaceUML(String _value_) {
        namespaceUML = _value_;
    }

    public String namespaceUMLToString() {
        return namespaceUML != null ? namespaceUML.toString() : null;
    }

    /**
     * The short name of the profile used in profile documentation.
     */
    private String shortName; // String

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String _value_) {
        shortName = _value_;
    }

    public String shortNameToString() {
        return shortName != null ? shortName.toString() : null;
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
        return getAttribute("DynamicsVersion", attrName);
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
        setAttribute("DynamicsVersion", attrName, objectValue);
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
        setAttribute("DynamicsVersion", attrName, stringValue);
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

    private static final String CLASS_NAMESPACE = "http://entsoe.eu/CIM/SchemaExtension/3/1#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("baseUML", new AttrDetails("DynamicsVersion.baseUML", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("baseURI", new AttrDetails("DynamicsVersion.baseURI", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("date", new AttrDetails("DynamicsVersion.date", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("differenceModelURI", new AttrDetails("DynamicsVersion.differenceModelURI", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("entsoeUML", new AttrDetails("DynamicsVersion.entsoeUML", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("entsoeURI", new AttrDetails("DynamicsVersion.entsoeURI", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("modelDescriptionURI", new AttrDetails("DynamicsVersion.modelDescriptionURI", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("namespaceRDF", new AttrDetails("DynamicsVersion.namespaceRDF", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("namespaceUML", new AttrDetails("DynamicsVersion.namespaceUML", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("shortName", new AttrDetails("DynamicsVersion.shortName", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new DynamicsVersion().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("baseUML", new GetterSetter(this::baseUMLToString, null, this::setBaseUML));
        map.put("baseURI", new GetterSetter(this::baseURIToString, null, this::setBaseURI));
        map.put("date", new GetterSetter(this::dateToString, null, this::setDate));
        map.put("differenceModelURI", new GetterSetter(this::differenceModelURIToString, null, this::setDifferenceModelURI));
        map.put("entsoeUML", new GetterSetter(this::entsoeUMLToString, null, this::setEntsoeUML));
        map.put("entsoeURI", new GetterSetter(this::entsoeURIToString, null, this::setEntsoeURI));
        map.put("modelDescriptionURI", new GetterSetter(this::modelDescriptionURIToString, null, this::setModelDescriptionURI));
        map.put("namespaceRDF", new GetterSetter(this::namespaceRDFToString, null, this::setNamespaceRDF));
        map.put("namespaceUML", new GetterSetter(this::namespaceUMLToString, null, this::setNamespaceUML));
        map.put("shortName", new GetterSetter(this::shortNameToString, null, this::setShortName));
        return map;
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.DY);
        POSSIBLE_PROFILES = Collections.unmodifiableSet(profiles);
    }

    private static final CGMESProfile RECOMMENDED_PROFILE = CGMESProfile.DY;

    private static final Set<CGMESProfile> POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>(POSSIBLE_PROFILES);
        for (var attrDetails : ATTR_DETAILS_MAP.values()) {
            profiles.addAll(attrDetails.profiles);
        }
        POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES = Collections.unmodifiableSet(profiles);
    }
}
