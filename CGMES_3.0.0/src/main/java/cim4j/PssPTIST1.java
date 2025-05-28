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
 * PTI microprocessor-based stabilizer type 1.
 */
@SuppressWarnings("unused")
public class PssPTIST1 extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssPTIST1.class);

    /**
     * Constructor.
     */
    public PssPTIST1(String rdfid) {
        super("PssPTIST1", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected PssPTIST1(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Time step related to activation of controls (<i>deltatc</i>) (&gt;= 0).  Typical value = 0,025.
     */
    private Double dtc; // Seconds

    public Double getDtc() {
        return dtc;
    }

    public void setDtc(Double _value_) {
        dtc = _value_;
    }

    private static Object getDtc(BaseClass _this_) {
        return ((PssPTIST1) _this_).getDtc();
    }

    private static void setDtc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST1) _this_).setDtc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST1) _this_).setDtc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time step frequency calculation (<i>deltatf</i>) (&gt;= 0).  Typical value = 0,025.
     */
    private Double dtf; // Seconds

    public Double getDtf() {
        return dtf;
    }

    public void setDtf(Double _value_) {
        dtf = _value_;
    }

    private static Object getDtf(BaseClass _this_) {
        return ((PssPTIST1) _this_).getDtf();
    }

    private static void setDtf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST1) _this_).setDtf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST1) _this_).setDtf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time step active power calculation (<i>deltatp</i>) (&gt;= 0).  Typical value = 0,0125.
     */
    private Double dtp; // Seconds

    public Double getDtp() {
        return dtp;
    }

    public void setDtp(Double _value_) {
        dtp = _value_;
    }

    private static Object getDtp(BaseClass _this_) {
        return ((PssPTIST1) _this_).getDtp();
    }

    private static void setDtp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST1) _this_).setDtp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST1) _this_).setDtp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (<i>K</i>).  Typical value = 9.
     */
    private Double k; // PU

    public Double getK() {
        return k;
    }

    public void setK(Double _value_) {
        k = _value_;
    }

    private static Object getK(BaseClass _this_) {
        return ((PssPTIST1) _this_).getK();
    }

    private static void setK(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST1) _this_).setK((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST1) _this_).setK(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * (<i>M</i>).  <i>M </i>= 2 x <i>H</i>.  Typical value = 5.
     */
    private Double m; // PU

    public Double getM() {
        return m;
    }

    public void setM(Double _value_) {
        m = _value_;
    }

    private static Object getM(BaseClass _this_) {
        return ((PssPTIST1) _this_).getM();
    }

    private static void setM(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST1) _this_).setM((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST1) _this_).setM(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T1</i>) (&gt;= 0).  Typical value = 0,3.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((PssPTIST1) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST1) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST1) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T2</i>) (&gt;= 0).  Typical value = 1.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    private static Object getT2(BaseClass _this_) {
        return ((PssPTIST1) _this_).getT2();
    }

    private static void setT2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST1) _this_).setT2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST1) _this_).setT2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T3</i>) (&gt;= 0).  Typical value = 0,2.
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    private static Object getT3(BaseClass _this_) {
        return ((PssPTIST1) _this_).getT3();
    }

    private static void setT3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST1) _this_).setT3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST1) _this_).setT3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T4</i>) (&gt;= 0).  Typical value = 0,05.
     */
    private Double t4; // Seconds

    public Double getT4() {
        return t4;
    }

    public void setT4(Double _value_) {
        t4 = _value_;
    }

    private static Object getT4(BaseClass _this_) {
        return ((PssPTIST1) _this_).getT4();
    }

    private static void setT4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST1) _this_).setT4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST1) _this_).setT4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>Tf</i>) (&gt;= 0).  Typical value = 0,2.
     */
    private Double tf; // Seconds

    public Double getTf() {
        return tf;
    }

    public void setTf(Double _value_) {
        tf = _value_;
    }

    private static Object getTf(BaseClass _this_) {
        return ((PssPTIST1) _this_).getTf();
    }

    private static void setTf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST1) _this_).setTf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST1) _this_).setTf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>Tp</i>) (&gt;= 0).  Typical value = 0,2.
     */
    private Double tp; // Seconds

    public Double getTp() {
        return tp;
    }

    public void setTp(Double _value_) {
        tp = _value_;
    }

    private static Object getTp(BaseClass _this_) {
        return ((PssPTIST1) _this_).getTp();
    }

    private static void setTp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST1) _this_).setTp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST1) _this_).setTp(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PssPTIST1", attrName));
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
                "PssPTIST1", attrName, value));
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
            map.put("dtc", new AttrDetails("PssPTIST1.dtc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssPTIST1::getDtc, PssPTIST1::setDtc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dtf", new AttrDetails("PssPTIST1.dtf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssPTIST1::getDtf, PssPTIST1::setDtf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dtp", new AttrDetails("PssPTIST1.dtp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssPTIST1::getDtp, PssPTIST1::setDtp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k", new AttrDetails("PssPTIST1.k", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssPTIST1::getK, PssPTIST1::setK));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("m", new AttrDetails("PssPTIST1.m", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssPTIST1::getM, PssPTIST1::setM));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("PssPTIST1.t1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssPTIST1::getT1, PssPTIST1::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("PssPTIST1.t2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssPTIST1::getT2, PssPTIST1::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("PssPTIST1.t3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssPTIST1::getT3, PssPTIST1::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("PssPTIST1.t4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssPTIST1::getT4, PssPTIST1::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("PssPTIST1.tf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssPTIST1::getTf, PssPTIST1::setTf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tp", new AttrDetails("PssPTIST1.tp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssPTIST1::getTp, PssPTIST1::setTp));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PssPTIST1(null).allAttrDetailsMap());
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
