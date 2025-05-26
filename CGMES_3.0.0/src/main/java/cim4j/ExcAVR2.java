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
 * Italian excitation system corresponding to IEEE (1968) type 2 model. It represents an alternator and rotating diodes and electromechanic voltage regulators.
 */
@SuppressWarnings("unused")
public class ExcAVR2 extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcAVR2.class);

    /**
     * Constructor.
     */
    public ExcAVR2(String rdfid) {
        super("ExcAVR2", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcAVR2(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Field voltage value 1 (<i>E</i><i><sub>1</sub></i>).  Typical value = 4,18.
     */
    private Double e1; // PU

    public Double getE1() {
        return e1;
    }

    public void setE1(Double _value_) {
        e1 = _value_;
    }

    private static Object getE1(BaseClass _this_) {
        return ((ExcAVR2) _this_).getE1();
    }

    private static void setE1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR2) _this_).setE1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR2) _this_).setE1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Field voltage value 2 (<i>E</i><i><sub>2</sub></i>).  Typical value = 3,14.
     */
    private Double e2; // PU

    public Double getE2() {
        return e2;
    }

    public void setE2(Double _value_) {
        e2 = _value_;
    }

    private static Object getE2(BaseClass _this_) {
        return ((ExcAVR2) _this_).getE2();
    }

    private static void setE2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR2) _this_).setE2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR2) _this_).setE2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * AVR gain (<i>K</i><i><sub>A</sub></i>).  Typical value = 500.
     */
    private Float ka; // Float

    public Float getKa() {
        return ka;
    }

    public void setKa(Float _value_) {
        ka = _value_;
    }

    private static Object getKa(BaseClass _this_) {
        return ((ExcAVR2) _this_).getKa();
    }

    private static void setKa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExcAVR2) _this_).setKa((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR2) _this_).setKa(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Rate feedback gain (<i>K</i><i><sub>F</sub></i>).  Typical value = 0,12.
     */
    private Float kf; // Float

    public Float getKf() {
        return kf;
    }

    public void setKf(Float _value_) {
        kf = _value_;
    }

    private static Object getKf(BaseClass _this_) {
        return ((ExcAVR2) _this_).getKf();
    }

    private static void setKf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExcAVR2) _this_).setKf((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR2) _this_).setKf(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Saturation factor at <i>E</i><i><sub>1</sub></i> (<i>S[E</i><i><sub>1</sub></i><i>]</i>).  Typical value = 0.1.
     */
    private Float se1; // Float

    public Float getSe1() {
        return se1;
    }

    public void setSe1(Float _value_) {
        se1 = _value_;
    }

    private static Object getSe1(BaseClass _this_) {
        return ((ExcAVR2) _this_).getSe1();
    }

    private static void setSe1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExcAVR2) _this_).setSe1((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR2) _this_).setSe1(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Saturation factor at <i>E</i><i><sub>2</sub></i> (<i>S[E</i><i><sub>2</sub></i><i>]</i>).  Typical value = 0,03.
     */
    private Float se2; // Float

    public Float getSe2() {
        return se2;
    }

    public void setSe2(Float _value_) {
        se2 = _value_;
    }

    private static Object getSe2(BaseClass _this_) {
        return ((ExcAVR2) _this_).getSe2();
    }

    private static void setSe2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExcAVR2) _this_).setSe2((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR2) _this_).setSe2(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * AVR time constant (<i>T</i><i><sub>A</sub></i>) (&gt;= 0).  Typical value = 0,02.
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((ExcAVR2) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR2) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR2) _this_).setTa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * AVR time constant (<i>T</i><i><sub>B</sub></i>) (&gt;= 0).  Typical value = 0.
     */
    private Double tb; // Seconds

    public Double getTb() {
        return tb;
    }

    public void setTb(Double _value_) {
        tb = _value_;
    }

    private static Object getTb(BaseClass _this_) {
        return ((ExcAVR2) _this_).getTb();
    }

    private static void setTb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR2) _this_).setTb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR2) _this_).setTb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter time constant (<i>T</i><i><sub>E</sub></i>) (&gt;= 0).  Typical value = 1.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    private static Object getTe(BaseClass _this_) {
        return ((ExcAVR2) _this_).getTe();
    }

    private static void setTe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR2) _this_).setTe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR2) _this_).setTe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rate feedback time constant (<i>T</i><i><sub>F1</sub></i>) (&gt;= 0).  Typical value = 1.
     */
    private Double tf1; // Seconds

    public Double getTf1() {
        return tf1;
    }

    public void setTf1(Double _value_) {
        tf1 = _value_;
    }

    private static Object getTf1(BaseClass _this_) {
        return ((ExcAVR2) _this_).getTf1();
    }

    private static void setTf1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR2) _this_).setTf1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR2) _this_).setTf1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rate feedback time constant (<i>T</i><i><sub>F2</sub></i>) (&gt;= 0).  Typical value = 1.
     */
    private Double tf2; // Seconds

    public Double getTf2() {
        return tf2;
    }

    public void setTf2(Double _value_) {
        tf2 = _value_;
    }

    private static Object getTf2(BaseClass _this_) {
        return ((ExcAVR2) _this_).getTf2();
    }

    private static void setTf2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR2) _this_).setTf2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR2) _this_).setTf2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum AVR output (<i>V</i><i><sub>RMN</sub></i>).  Typical value = -6.
     */
    private Double vrmn; // PU

    public Double getVrmn() {
        return vrmn;
    }

    public void setVrmn(Double _value_) {
        vrmn = _value_;
    }

    private static Object getVrmn(BaseClass _this_) {
        return ((ExcAVR2) _this_).getVrmn();
    }

    private static void setVrmn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR2) _this_).setVrmn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR2) _this_).setVrmn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum AVR output (<i>V</i><i><sub>RMX</sub></i>).  Typical value = 7.
     */
    private Double vrmx; // PU

    public Double getVrmx() {
        return vrmx;
    }

    public void setVrmx(Double _value_) {
        vrmx = _value_;
    }

    private static Object getVrmx(BaseClass _this_) {
        return ((ExcAVR2) _this_).getVrmx();
    }

    private static void setVrmx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR2) _this_).setVrmx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR2) _this_).setVrmx(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcAVR2", attrName));
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
                "ExcAVR2", attrName, value));
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
            map.put("e1", new AttrDetails("ExcAVR2.e1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAVR2::getE1, ExcAVR2::setE1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("e2", new AttrDetails("ExcAVR2.e2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAVR2::getE2, ExcAVR2::setE2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("ExcAVR2.ka", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAVR2::getKa, ExcAVR2::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("ExcAVR2.kf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAVR2::getKf, ExcAVR2::setKf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("se1", new AttrDetails("ExcAVR2.se1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAVR2::getSe1, ExcAVR2::setSe1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("se2", new AttrDetails("ExcAVR2.se2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAVR2::getSe2, ExcAVR2::setSe2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("ExcAVR2.ta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAVR2::getTa, ExcAVR2::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("ExcAVR2.tb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAVR2::getTb, ExcAVR2::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcAVR2.te", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAVR2::getTe, ExcAVR2::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf1", new AttrDetails("ExcAVR2.tf1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAVR2::getTf1, ExcAVR2::setTf1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf2", new AttrDetails("ExcAVR2.tf2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAVR2::getTf2, ExcAVR2::setTf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmn", new AttrDetails("ExcAVR2.vrmn", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAVR2::getVrmn, ExcAVR2::setVrmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmx", new AttrDetails("ExcAVR2.vrmx", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAVR2::getVrmx, ExcAVR2::setVrmx));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcAVR2(null).allAttrDetailsMap());
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
