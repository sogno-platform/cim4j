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
 * Street details, in the context of address.
 */
@SuppressWarnings("unused")
public class StreetDetail extends BaseClass {

    private static final Logging LOG = Logging.getLogger(StreetDetail.class);

    /**
     * Default constructor.
     */
    public StreetDetail() {
        setCimType("StreetDetail");
    }

    /**
     * First line of a free form address or some additional address information (for example a mail stop).
     */
    private String addressGeneral; // String

    public String getAddressGeneral() {
        return addressGeneral;
    }

    public void setAddressGeneral(String _value_) {
        addressGeneral = _value_;
    }

    public String addressGeneralToString() {
        return addressGeneral != null ? addressGeneral.toString() : null;
    }

    /**
     * (if applicable) Second line of a free form address.
     */
    private String addressGeneral2; // String

    public String getAddressGeneral2() {
        return addressGeneral2;
    }

    public void setAddressGeneral2(String _value_) {
        addressGeneral2 = _value_;
    }

    public String addressGeneral2ToString() {
        return addressGeneral2 != null ? addressGeneral2.toString() : null;
    }

    /**
     * (if applicable) Third line of a free form address.
     */
    private String addressGeneral3; // String

    public String getAddressGeneral3() {
        return addressGeneral3;
    }

    public void setAddressGeneral3(String _value_) {
        addressGeneral3 = _value_;
    }

    public String addressGeneral3ToString() {
        return addressGeneral3 != null ? addressGeneral3.toString() : null;
    }

    /**
     * (if applicable) In certain cases the physical location of the place of interest does not have a direct point of entry from the street, but may be located inside a larger structure such as a building, complex, office block, apartment, etc.
     */
    private String buildingName; // String

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String _value_) {
        buildingName = _value_;
    }

    public String buildingNameToString() {
        return buildingName != null ? buildingName.toString() : null;
    }

    /**
     * (if applicable) Utilities often make use of external reference systems, such as those of the town-planner`s department or surveyor general`s mapping system, that allocate global reference codes to streets.
     */
    private String code; // String

    public String getCode() {
        return code;
    }

    public void setCode(String _value_) {
        code = _value_;
    }

    public String codeToString() {
        return code != null ? code.toString() : null;
    }

    /**
     * The identification by name or number, expressed as text, of the floor in the building as part of this address.
     */
    private String floorIdentification; // String

    public String getFloorIdentification() {
        return floorIdentification;
    }

    public void setFloorIdentification(String _value_) {
        floorIdentification = _value_;
    }

    public String floorIdentificationToString() {
        return floorIdentification != null ? floorIdentification.toString() : null;
    }

    /**
     * Name of the street.
     */
    private String name; // String

    public String getName() {
        return name;
    }

    public void setName(String _value_) {
        name = _value_;
    }

    public String nameToString() {
        return name != null ? name.toString() : null;
    }

    /**
     * Designator of the specific location on the street.
     */
    private String number; // String

    public String getNumber() {
        return number;
    }

    public void setNumber(String _value_) {
        number = _value_;
    }

    public String numberToString() {
        return number != null ? number.toString() : null;
    }

    /**
     * Prefix to the street name. For example: North, South, East, West.
     */
    private String prefix; // String

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String _value_) {
        prefix = _value_;
    }

    public String prefixToString() {
        return prefix != null ? prefix.toString() : null;
    }

    /**
     * Suffix to the street name. For example: North, South, East, West.
     */
    private String suffix; // String

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String _value_) {
        suffix = _value_;
    }

    public String suffixToString() {
        return suffix != null ? suffix.toString() : null;
    }

    /**
     * Number of the apartment or suite.
     */
    private String suiteNumber; // String

    public String getSuiteNumber() {
        return suiteNumber;
    }

    public void setSuiteNumber(String _value_) {
        suiteNumber = _value_;
    }

    public String suiteNumberToString() {
        return suiteNumber != null ? suiteNumber.toString() : null;
    }

    /**
     * Type of street. Examples include: street, circle, boulevard, avenue, road, drive, etc.
     */
    private String type; // String

    public String getType() {
        return type;
    }

    public void setType(String _value_) {
        type = _value_;
    }

    public String typeToString() {
        return type != null ? type.toString() : null;
    }

    /**
     * True if this street is within the legal geographical boundaries of the specified town (default).
     */
    private Boolean withinTownLimits; // Boolean

    public Boolean getWithinTownLimits() {
        return withinTownLimits;
    }

    public void setWithinTownLimits(Boolean _value_) {
        withinTownLimits = _value_;
    }

    public void setWithinTownLimits(String _value_) {
        withinTownLimits = getBooleanFromString(_value_);
    }

    public String withinTownLimitsToString() {
        return withinTownLimits != null ? withinTownLimits.toString() : null;
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
        return getAttribute("StreetDetail", attrName);
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
        setAttribute("StreetDetail", attrName, objectValue);
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
        setAttribute("StreetDetail", attrName, stringValue);
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
            profiles.add(CGMESProfile.GL);
            map.put("addressGeneral", new AttrDetails("StreetDetail.addressGeneral", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("addressGeneral2", new AttrDetails("StreetDetail.addressGeneral2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("addressGeneral3", new AttrDetails("StreetDetail.addressGeneral3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("buildingName", new AttrDetails("StreetDetail.buildingName", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("code", new AttrDetails("StreetDetail.code", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("floorIdentification", new AttrDetails("StreetDetail.floorIdentification", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("name", new AttrDetails("StreetDetail.name", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("number", new AttrDetails("StreetDetail.number", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("prefix", new AttrDetails("StreetDetail.prefix", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("suffix", new AttrDetails("StreetDetail.suffix", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("suiteNumber", new AttrDetails("StreetDetail.suiteNumber", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("type", new AttrDetails("StreetDetail.type", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("withinTownLimits", new AttrDetails("StreetDetail.withinTownLimits", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new StreetDetail().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("addressGeneral", new GetterSetter(this::addressGeneralToString, null, this::setAddressGeneral));
        map.put("addressGeneral2", new GetterSetter(this::addressGeneral2ToString, null, this::setAddressGeneral2));
        map.put("addressGeneral3", new GetterSetter(this::addressGeneral3ToString, null, this::setAddressGeneral3));
        map.put("buildingName", new GetterSetter(this::buildingNameToString, null, this::setBuildingName));
        map.put("code", new GetterSetter(this::codeToString, null, this::setCode));
        map.put("floorIdentification", new GetterSetter(this::floorIdentificationToString, null, this::setFloorIdentification));
        map.put("name", new GetterSetter(this::nameToString, null, this::setName));
        map.put("number", new GetterSetter(this::numberToString, null, this::setNumber));
        map.put("prefix", new GetterSetter(this::prefixToString, null, this::setPrefix));
        map.put("suffix", new GetterSetter(this::suffixToString, null, this::setSuffix));
        map.put("suiteNumber", new GetterSetter(this::suiteNumberToString, null, this::setSuiteNumber));
        map.put("type", new GetterSetter(this::typeToString, null, this::setType));
        map.put("withinTownLimits", new GetterSetter(this::withinTownLimitsToString, null, this::setWithinTownLimits));
        return map;
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.GL);
        POSSIBLE_PROFILES = Collections.unmodifiableSet(profiles);
    }

    private static final CGMESProfile RECOMMENDED_PROFILE = CGMESProfile.GL;

    private static final Set<CGMESProfile> POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>(POSSIBLE_PROFILES);
        for (var attrDetails : ATTR_DETAILS_MAP.values()) {
            profiles.addAll(attrDetails.profiles);
        }
        POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES = Collections.unmodifiableSet(profiles);
    }
}
