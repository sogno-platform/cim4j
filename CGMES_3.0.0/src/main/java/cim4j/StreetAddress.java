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
 * General purpose street and postal address information.
 */
@SuppressWarnings("unused")
public class StreetAddress extends BaseClass {

    private static final Logging LOG = Logging.getLogger(StreetAddress.class);

    /**
     * Constructor.
     */
    public StreetAddress(String rdfid) {
        super("StreetAddress", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected StreetAddress(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The language in which the address is specified, using ISO 639-1 two digit language code.
     */
    private String language; // String

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String _value_) {
        language = _value_;
    }

    private static Object getLanguage(BaseClass _this_) {
        return ((StreetAddress) _this_).getLanguage();
    }

    private static void setLanguage(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((StreetAddress) _this_).setLanguage((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Post office box.
     */
    private String poBox; // String

    public String getPoBox() {
        return poBox;
    }

    public void setPoBox(String _value_) {
        poBox = _value_;
    }

    private static Object getPoBox(BaseClass _this_) {
        return ((StreetAddress) _this_).getPoBox();
    }

    private static void setPoBox(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((StreetAddress) _this_).setPoBox((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Postal code for the address.
     */
    private String postalCode; // String

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String _value_) {
        postalCode = _value_;
    }

    private static Object getPostalCode(BaseClass _this_) {
        return ((StreetAddress) _this_).getPostalCode();
    }

    private static void setPostalCode(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((StreetAddress) _this_).setPostalCode((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Status of this address.
     */
    private Status status; // OneToOne

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status _object_) {
        if (status != _object_) {
            status = _object_;
        }
    }

    private static Object getStatus(BaseClass _this_) {
        return ((StreetAddress) _this_).getStatus();
    }

    private static void setStatus(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Status) {
            ((StreetAddress) _this_).setStatus((Status) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Status");
        }
    }

    /**
     * Street detail.
     */
    private StreetDetail streetDetail; // OneToOne

    public StreetDetail getStreetDetail() {
        return streetDetail;
    }

    public void setStreetDetail(StreetDetail _object_) {
        if (streetDetail != _object_) {
            streetDetail = _object_;
        }
    }

    private static Object getStreetDetail(BaseClass _this_) {
        return ((StreetAddress) _this_).getStreetDetail();
    }

    private static void setStreetDetail(BaseClass _this_, Object _value_) {
        if (_value_ instanceof StreetDetail) {
            ((StreetAddress) _this_).setStreetDetail((StreetDetail) _value_);
        } else {
            throw new IllegalArgumentException("Object is not StreetDetail");
        }
    }

    /**
     * Town detail.
     */
    private TownDetail townDetail; // OneToOne

    public TownDetail getTownDetail() {
        return townDetail;
    }

    public void setTownDetail(TownDetail _object_) {
        if (townDetail != _object_) {
            townDetail = _object_;
        }
    }

    private static Object getTownDetail(BaseClass _this_) {
        return ((StreetAddress) _this_).getTownDetail();
    }

    private static void setTownDetail(BaseClass _this_, Object _value_) {
        if (_value_ instanceof TownDetail) {
            ((StreetAddress) _this_).setTownDetail((TownDetail) _value_);
        } else {
            throw new IllegalArgumentException("Object is not TownDetail");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "StreetAddress", attrName));
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
                "StreetAddress", attrName, value));
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
            map.put("language", new AttrDetails("StreetAddress.language", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, StreetAddress::getLanguage, StreetAddress::setLanguage));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("poBox", new AttrDetails("StreetAddress.poBox", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, StreetAddress::getPoBox, StreetAddress::setPoBox));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("postalCode", new AttrDetails("StreetAddress.postalCode", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, StreetAddress::getPostalCode, StreetAddress::setPostalCode));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("status", new AttrDetails("StreetAddress.status", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, StreetAddress::getStatus, StreetAddress::setStatus));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("streetDetail", new AttrDetails("StreetAddress.streetDetail", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, StreetAddress::getStreetDetail, StreetAddress::setStreetDetail));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("townDetail", new AttrDetails("StreetAddress.townDetail", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, StreetAddress::getTownDetail, StreetAddress::setTownDetail));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new StreetAddress(null).allAttrDetailsMap());
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
