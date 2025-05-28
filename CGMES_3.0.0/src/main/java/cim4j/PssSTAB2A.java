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
 * Power system stabilizer part of an ABB excitation system. [Footnote: ABB excitation systems are an example of suitable products available commercially. This information is given for the convenience of users of this document and does not constitute an endorsement by IEC of these products.]
 */
@SuppressWarnings("unused")
public class PssSTAB2A extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssSTAB2A.class);

    /**
     * Constructor.
     */
    public PssSTAB2A(String rdfid) {
        super("PssSTAB2A", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected PssSTAB2A(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Stabilizer output limiter (<i>H</i><i><sub>LIM</sub></i>).  Typical value = 0,5.
     */
    private Double hlim; // PU

    public Double getHlim() {
        return hlim;
    }

    public void setHlim(Double _value_) {
        hlim = _value_;
    }

    private static Object getHlim(BaseClass _this_) {
        return ((PssSTAB2A) _this_).getHlim();
    }

    private static void setHlim(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSTAB2A) _this_).setHlim((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSTAB2A) _this_).setHlim(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (<i>K2</i>).  Typical value = 1,0.
     */
    private Double k2; // PU

    public Double getK2() {
        return k2;
    }

    public void setK2(Double _value_) {
        k2 = _value_;
    }

    private static Object getK2(BaseClass _this_) {
        return ((PssSTAB2A) _this_).getK2();
    }

    private static void setK2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSTAB2A) _this_).setK2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSTAB2A) _this_).setK2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (<i>K3</i>).  Typical value = 0,25.
     */
    private Double k3; // PU

    public Double getK3() {
        return k3;
    }

    public void setK3(Double _value_) {
        k3 = _value_;
    }

    private static Object getK3(BaseClass _this_) {
        return ((PssSTAB2A) _this_).getK3();
    }

    private static void setK3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSTAB2A) _this_).setK3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSTAB2A) _this_).setK3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (<i>K4</i>).  Typical value = 0,075.
     */
    private Double k4; // PU

    public Double getK4() {
        return k4;
    }

    public void setK4(Double _value_) {
        k4 = _value_;
    }

    private static Object getK4(BaseClass _this_) {
        return ((PssSTAB2A) _this_).getK4();
    }

    private static void setK4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSTAB2A) _this_).setK4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSTAB2A) _this_).setK4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (<i>K5</i>).  Typical value = 2,5.
     */
    private Double k5; // PU

    public Double getK5() {
        return k5;
    }

    public void setK5(Double _value_) {
        k5 = _value_;
    }

    private static Object getK5(BaseClass _this_) {
        return ((PssSTAB2A) _this_).getK5();
    }

    private static void setK5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSTAB2A) _this_).setK5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSTAB2A) _this_).setK5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T2</i>).  Typical value = 4,0.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    private static Object getT2(BaseClass _this_) {
        return ((PssSTAB2A) _this_).getT2();
    }

    private static void setT2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSTAB2A) _this_).setT2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSTAB2A) _this_).setT2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T3</i>).  Typical value = 2,0.
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    private static Object getT3(BaseClass _this_) {
        return ((PssSTAB2A) _this_).getT3();
    }

    private static void setT3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSTAB2A) _this_).setT3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSTAB2A) _this_).setT3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T5</i>).  Typical value = 4,5.
     */
    private Double t5; // Seconds

    public Double getT5() {
        return t5;
    }

    public void setT5(Double _value_) {
        t5 = _value_;
    }

    private static Object getT5(BaseClass _this_) {
        return ((PssSTAB2A) _this_).getT5();
    }

    private static void setT5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSTAB2A) _this_).setT5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSTAB2A) _this_).setT5(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PssSTAB2A", attrName));
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
                "PssSTAB2A", attrName, value));
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
            profiles.add(CGMESProfile.DY);
            map.put("hlim", new AttrDetails("PssSTAB2A.hlim", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssSTAB2A::getHlim, PssSTAB2A::setHlim));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k2", new AttrDetails("PssSTAB2A.k2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssSTAB2A::getK2, PssSTAB2A::setK2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k3", new AttrDetails("PssSTAB2A.k3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssSTAB2A::getK3, PssSTAB2A::setK3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k4", new AttrDetails("PssSTAB2A.k4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssSTAB2A::getK4, PssSTAB2A::setK4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k5", new AttrDetails("PssSTAB2A.k5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssSTAB2A::getK5, PssSTAB2A::setK5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("PssSTAB2A.t2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssSTAB2A::getT2, PssSTAB2A::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("PssSTAB2A.t3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssSTAB2A::getT3, PssSTAB2A::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5", new AttrDetails("PssSTAB2A.t5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssSTAB2A::getT5, PssSTAB2A::setT5));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PssSTAB2A(null).allAttrDetailsMap());
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
