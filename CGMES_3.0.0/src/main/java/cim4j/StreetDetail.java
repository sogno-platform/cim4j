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
     * Constructor.
     */
    public StreetDetail(String rdfid) {
        super("StreetDetail", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected StreetDetail(String cimType, String rdfid) {
        super(cimType, rdfid);
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

    private static Object getAddressGeneral(BaseClass _this_) {
        return ((StreetDetail) _this_).getAddressGeneral();
    }

    private static void setAddressGeneral(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((StreetDetail) _this_).setAddressGeneral((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
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

    private static Object getAddressGeneral2(BaseClass _this_) {
        return ((StreetDetail) _this_).getAddressGeneral2();
    }

    private static void setAddressGeneral2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((StreetDetail) _this_).setAddressGeneral2((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
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

    private static Object getAddressGeneral3(BaseClass _this_) {
        return ((StreetDetail) _this_).getAddressGeneral3();
    }

    private static void setAddressGeneral3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((StreetDetail) _this_).setAddressGeneral3((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
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

    private static Object getBuildingName(BaseClass _this_) {
        return ((StreetDetail) _this_).getBuildingName();
    }

    private static void setBuildingName(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((StreetDetail) _this_).setBuildingName((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
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

    private static Object getCode(BaseClass _this_) {
        return ((StreetDetail) _this_).getCode();
    }

    private static void setCode(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((StreetDetail) _this_).setCode((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
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

    private static Object getFloorIdentification(BaseClass _this_) {
        return ((StreetDetail) _this_).getFloorIdentification();
    }

    private static void setFloorIdentification(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((StreetDetail) _this_).setFloorIdentification((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
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

    private static Object getName(BaseClass _this_) {
        return ((StreetDetail) _this_).getName();
    }

    private static void setName(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((StreetDetail) _this_).setName((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
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

    private static Object getNumber(BaseClass _this_) {
        return ((StreetDetail) _this_).getNumber();
    }

    private static void setNumber(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((StreetDetail) _this_).setNumber((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
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

    private static Object getPrefix(BaseClass _this_) {
        return ((StreetDetail) _this_).getPrefix();
    }

    private static void setPrefix(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((StreetDetail) _this_).setPrefix((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
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

    private static Object getSuffix(BaseClass _this_) {
        return ((StreetDetail) _this_).getSuffix();
    }

    private static void setSuffix(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((StreetDetail) _this_).setSuffix((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
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

    private static Object getSuiteNumber(BaseClass _this_) {
        return ((StreetDetail) _this_).getSuiteNumber();
    }

    private static void setSuiteNumber(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((StreetDetail) _this_).setSuiteNumber((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
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

    private static Object getType(BaseClass _this_) {
        return ((StreetDetail) _this_).getType();
    }

    private static void setType(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((StreetDetail) _this_).setType((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
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

    private static Object getWithinTownLimits(BaseClass _this_) {
        return ((StreetDetail) _this_).getWithinTownLimits();
    }

    private static void setWithinTownLimits(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((StreetDetail) _this_).setWithinTownLimits((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((StreetDetail) _this_).setWithinTownLimits(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "StreetDetail", attrName));
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
                "StreetDetail", attrName, value));
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
            map.put("addressGeneral", new AttrDetails("StreetDetail.addressGeneral", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, StreetDetail::getAddressGeneral, StreetDetail::setAddressGeneral));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("addressGeneral2", new AttrDetails("StreetDetail.addressGeneral2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, StreetDetail::getAddressGeneral2, StreetDetail::setAddressGeneral2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("addressGeneral3", new AttrDetails("StreetDetail.addressGeneral3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, StreetDetail::getAddressGeneral3, StreetDetail::setAddressGeneral3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("buildingName", new AttrDetails("StreetDetail.buildingName", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, StreetDetail::getBuildingName, StreetDetail::setBuildingName));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("code", new AttrDetails("StreetDetail.code", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, StreetDetail::getCode, StreetDetail::setCode));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("floorIdentification", new AttrDetails("StreetDetail.floorIdentification", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, StreetDetail::getFloorIdentification, StreetDetail::setFloorIdentification));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("name", new AttrDetails("StreetDetail.name", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, StreetDetail::getName, StreetDetail::setName));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("number", new AttrDetails("StreetDetail.number", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, StreetDetail::getNumber, StreetDetail::setNumber));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("prefix", new AttrDetails("StreetDetail.prefix", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, StreetDetail::getPrefix, StreetDetail::setPrefix));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("suffix", new AttrDetails("StreetDetail.suffix", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, StreetDetail::getSuffix, StreetDetail::setSuffix));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("suiteNumber", new AttrDetails("StreetDetail.suiteNumber", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, StreetDetail::getSuiteNumber, StreetDetail::setSuiteNumber));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("type", new AttrDetails("StreetDetail.type", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, StreetDetail::getType, StreetDetail::setType));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("withinTownLimits", new AttrDetails("StreetDetail.withinTownLimits", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, StreetDetail::getWithinTownLimits, StreetDetail::setWithinTownLimits));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new StreetDetail(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
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
