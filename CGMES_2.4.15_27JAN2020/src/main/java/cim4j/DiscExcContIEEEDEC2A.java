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
 * The class represents IEEE Type DEC2A model for the discontinuous excitation control. This system provides transient excitation boosting via an open-loop control as initiated by a trigger signal generated remotely.  Reference: IEEE Standard 421.5-2005 Section 12.3.
 */
@SuppressWarnings("unused")
public class DiscExcContIEEEDEC2A extends DiscontinuousExcitationControlDynamics {

    private static final Logging LOG = Logging.getLogger(DiscExcContIEEEDEC2A.class);

    /**
     * Constructor.
     */
    public DiscExcContIEEEDEC2A(String rdfid) {
        super("DiscExcContIEEEDEC2A", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected DiscExcContIEEEDEC2A(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Discontinuous controller time constant ().
     */
    private Double td1; // Seconds

    public Double getTd1() {
        return td1;
    }

    public void setTd1(Double _value_) {
        td1 = _value_;
    }

    private static Object getTd1(BaseClass _this_) {
        return ((DiscExcContIEEEDEC2A) _this_).getTd1();
    }

    private static void setTd1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC2A) _this_).setTd1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC2A) _this_).setTd1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Discontinuous controller washout time constant ().
     */
    private Double td2; // Seconds

    public Double getTd2() {
        return td2;
    }

    public void setTd2(Double _value_) {
        td2 = _value_;
    }

    private static Object getTd2(BaseClass _this_) {
        return ((DiscExcContIEEEDEC2A) _this_).getTd2();
    }

    private static void setTd2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC2A) _this_).setTd2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC2A) _this_).setTd2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Limiter ().
     */
    private Double vdmax; // PU

    public Double getVdmax() {
        return vdmax;
    }

    public void setVdmax(Double _value_) {
        vdmax = _value_;
    }

    private static Object getVdmax(BaseClass _this_) {
        return ((DiscExcContIEEEDEC2A) _this_).getVdmax();
    }

    private static void setVdmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC2A) _this_).setVdmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC2A) _this_).setVdmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Limiter ().
     */
    private Double vdmin; // PU

    public Double getVdmin() {
        return vdmin;
    }

    public void setVdmin(Double _value_) {
        vdmin = _value_;
    }

    private static Object getVdmin(BaseClass _this_) {
        return ((DiscExcContIEEEDEC2A) _this_).getVdmin();
    }

    private static void setVdmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC2A) _this_).setVdmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC2A) _this_).setVdmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Discontinuous controller input reference ().
     */
    private Double vk; // PU

    public Double getVk() {
        return vk;
    }

    public void setVk(Double _value_) {
        vk = _value_;
    }

    private static Object getVk(BaseClass _this_) {
        return ((DiscExcContIEEEDEC2A) _this_).getVk();
    }

    private static void setVk(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC2A) _this_).setVk((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC2A) _this_).setVk(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "DiscExcContIEEEDEC2A", attrName));
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
                "DiscExcContIEEEDEC2A", attrName, value));
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
            profiles.add(CGMESProfile.DY);
            map.put("td1", new AttrDetails("DiscExcContIEEEDEC2A.td1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, DiscExcContIEEEDEC2A::getTd1, DiscExcContIEEEDEC2A::setTd1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("td2", new AttrDetails("DiscExcContIEEEDEC2A.td2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, DiscExcContIEEEDEC2A::getTd2, DiscExcContIEEEDEC2A::setTd2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vdmax", new AttrDetails("DiscExcContIEEEDEC2A.vdmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, DiscExcContIEEEDEC2A::getVdmax, DiscExcContIEEEDEC2A::setVdmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vdmin", new AttrDetails("DiscExcContIEEEDEC2A.vdmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, DiscExcContIEEEDEC2A::getVdmin, DiscExcContIEEEDEC2A::setVdmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vk", new AttrDetails("DiscExcContIEEEDEC2A.vk", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, DiscExcContIEEEDEC2A::getVk, DiscExcContIEEEDEC2A::setVk));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new DiscExcContIEEEDEC2A(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
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
