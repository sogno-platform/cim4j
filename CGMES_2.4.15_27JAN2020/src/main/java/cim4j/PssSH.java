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
 * Model for Siemens "H infinity" power system stabilizer with generator electrical power input.
 */
@SuppressWarnings("unused")
public class PssSH extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssSH.class);

    /**
     * Constructor.
     */
    public PssSH(String rdfid) {
        super("PssSH", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected PssSH(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Main gain (K).  Typical Value = 1.
     */
    private Double k; // PU

    public Double getK() {
        return k;
    }

    public void setK(Double _value_) {
        k = _value_;
    }

    private static Object getK(BaseClass _this_) {
        return ((PssSH) _this_).getK();
    }

    private static void setK(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSH) _this_).setK((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSH) _this_).setK(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain 0 (K0).  Typical Value = 0.012.
     */
    private Double k0; // PU

    public Double getK0() {
        return k0;
    }

    public void setK0(Double _value_) {
        k0 = _value_;
    }

    private static Object getK0(BaseClass _this_) {
        return ((PssSH) _this_).getK0();
    }

    private static void setK0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSH) _this_).setK0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSH) _this_).setK0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain 1 (K1).  Typical Value = 0.488.
     */
    private Double k1; // PU

    public Double getK1() {
        return k1;
    }

    public void setK1(Double _value_) {
        k1 = _value_;
    }

    private static Object getK1(BaseClass _this_) {
        return ((PssSH) _this_).getK1();
    }

    private static void setK1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSH) _this_).setK1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSH) _this_).setK1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain 2 (K2).  Typical Value = 0.064.
     */
    private Double k2; // PU

    public Double getK2() {
        return k2;
    }

    public void setK2(Double _value_) {
        k2 = _value_;
    }

    private static Object getK2(BaseClass _this_) {
        return ((PssSH) _this_).getK2();
    }

    private static void setK2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSH) _this_).setK2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSH) _this_).setK2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain 3 (K3).  Typical Value = 0.224.
     */
    private Double k3; // PU

    public Double getK3() {
        return k3;
    }

    public void setK3(Double _value_) {
        k3 = _value_;
    }

    private static Object getK3(BaseClass _this_) {
        return ((PssSH) _this_).getK3();
    }

    private static void setK3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSH) _this_).setK3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSH) _this_).setK3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain 4 (K4).  Typical Value = 0.1.
     */
    private Double k4; // PU

    public Double getK4() {
        return k4;
    }

    public void setK4(Double _value_) {
        k4 = _value_;
    }

    private static Object getK4(BaseClass _this_) {
        return ((PssSH) _this_).getK4();
    }

    private static void setK4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSH) _this_).setK4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSH) _this_).setK4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant 1 (T1).  Typical Value = 0.076.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((PssSH) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSH) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSH) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant 2 (T2).  Typical Value = 0.086.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    private static Object getT2(BaseClass _this_) {
        return ((PssSH) _this_).getT2();
    }

    private static void setT2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSH) _this_).setT2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSH) _this_).setT2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant 3 (T3).   Typical Value = 1.068.
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    private static Object getT3(BaseClass _this_) {
        return ((PssSH) _this_).getT3();
    }

    private static void setT3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSH) _this_).setT3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSH) _this_).setT3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant 4 (T4).  Typical Value = 1.913.
     */
    private Double t4; // Seconds

    public Double getT4() {
        return t4;
    }

    public void setT4(Double _value_) {
        t4 = _value_;
    }

    private static Object getT4(BaseClass _this_) {
        return ((PssSH) _this_).getT4();
    }

    private static void setT4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSH) _this_).setT4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSH) _this_).setT4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Input time constant (Td).  Typical Value = 10.
     */
    private Double td; // Seconds

    public Double getTd() {
        return td;
    }

    public void setTd(Double _value_) {
        td = _value_;
    }

    private static Object getTd(BaseClass _this_) {
        return ((PssSH) _this_).getTd();
    }

    private static void setTd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSH) _this_).setTd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSH) _this_).setTd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Output maximum limit (Vsmax).  Typical Value = 0.1.
     */
    private Double vsmax; // PU

    public Double getVsmax() {
        return vsmax;
    }

    public void setVsmax(Double _value_) {
        vsmax = _value_;
    }

    private static Object getVsmax(BaseClass _this_) {
        return ((PssSH) _this_).getVsmax();
    }

    private static void setVsmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSH) _this_).setVsmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSH) _this_).setVsmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Output minimum limit (Vsmin).  Typical Value = -0.1.
     */
    private Double vsmin; // PU

    public Double getVsmin() {
        return vsmin;
    }

    public void setVsmin(Double _value_) {
        vsmin = _value_;
    }

    private static Object getVsmin(BaseClass _this_) {
        return ((PssSH) _this_).getVsmin();
    }

    private static void setVsmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSH) _this_).setVsmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSH) _this_).setVsmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PssSH", attrName));
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
                "PssSH", attrName, value));
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
            map.put("k", new AttrDetails("PssSH.k", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::getK, PssSH::setK));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k0", new AttrDetails("PssSH.k0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::getK0, PssSH::setK0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k1", new AttrDetails("PssSH.k1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::getK1, PssSH::setK1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k2", new AttrDetails("PssSH.k2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::getK2, PssSH::setK2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k3", new AttrDetails("PssSH.k3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::getK3, PssSH::setK3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k4", new AttrDetails("PssSH.k4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::getK4, PssSH::setK4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("PssSH.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::getT1, PssSH::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("PssSH.t2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::getT2, PssSH::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("PssSH.t3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::getT3, PssSH::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("PssSH.t4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::getT4, PssSH::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("td", new AttrDetails("PssSH.td", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::getTd, PssSH::setTd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsmax", new AttrDetails("PssSH.vsmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::getVsmax, PssSH::setVsmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsmin", new AttrDetails("PssSH.vsmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::getVsmin, PssSH::setVsmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PssSH(null).allAttrDetailsMap());
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
