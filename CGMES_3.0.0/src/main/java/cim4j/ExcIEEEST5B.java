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
 * IEEE 421.5-2005 type ST5B model. The type ST5B excitation system is a variation of the type ST1A model, with alternative overexcitation and underexcitation inputs and additional limits. The block diagram in the IEEE 421.5 standard has input signal <i>Vc </i>and does not indicate the summation point with <i>Vref</i>. The implementation of the ExcIEEEST5B shall consider summation point with <i>Vref</i>. Reference: IEEE 421.5-2005, 7.5.
 */
@SuppressWarnings("unused")
public class ExcIEEEST5B extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcIEEEST5B.class);

    /**
     * Constructor.
     */
    public ExcIEEEST5B(String rdfid) {
        super("ExcIEEEST5B", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcIEEEST5B(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Rectifier regulation factor (<i>K</i><i><sub>C</sub></i>) (&gt;= 0).  Typical value = 0,004.
     */
    private Double kc; // PU

    public Double getKc() {
        return kc;
    }

    public void setKc(Double _value_) {
        kc = _value_;
    }

    private static Object getKc(BaseClass _this_) {
        return ((ExcIEEEST5B) _this_).getKc();
    }

    private static void setKc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST5B) _this_).setKc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST5B) _this_).setKc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Regulator gain (<i>K</i><i><sub>R</sub></i>) (&gt; 0).  Typical value = 200.
     */
    private Double kr; // PU

    public Double getKr() {
        return kr;
    }

    public void setKr(Double _value_) {
        kr = _value_;
    }

    private static Object getKr(BaseClass _this_) {
        return ((ExcIEEEST5B) _this_).getKr();
    }

    private static void setKr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST5B) _this_).setKr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST5B) _this_).setKr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Firing circuit time constant (<i>T1</i>) (&gt;= 0).  Typical value = 0,004.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((ExcIEEEST5B) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST5B) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST5B) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Regulator lag time constant (<i>T</i><i><sub>B1</sub></i>) (&gt;= 0).  Typical value = 6.
     */
    private Double tb1; // Seconds

    public Double getTb1() {
        return tb1;
    }

    public void setTb1(Double _value_) {
        tb1 = _value_;
    }

    private static Object getTb1(BaseClass _this_) {
        return ((ExcIEEEST5B) _this_).getTb1();
    }

    private static void setTb1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST5B) _this_).setTb1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST5B) _this_).setTb1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Regulator lag time constant (<i>T</i><i><sub>B2</sub></i>) (&gt;= 0).  Typical value = 0,01.
     */
    private Double tb2; // Seconds

    public Double getTb2() {
        return tb2;
    }

    public void setTb2(Double _value_) {
        tb2 = _value_;
    }

    private static Object getTb2(BaseClass _this_) {
        return ((ExcIEEEST5B) _this_).getTb2();
    }

    private static void setTb2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST5B) _this_).setTb2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST5B) _this_).setTb2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Regulator lead time constant (<i>T</i><i><sub>C1</sub></i>) (&gt;= 0).  Typical value = 0,8.
     */
    private Double tc1; // Seconds

    public Double getTc1() {
        return tc1;
    }

    public void setTc1(Double _value_) {
        tc1 = _value_;
    }

    private static Object getTc1(BaseClass _this_) {
        return ((ExcIEEEST5B) _this_).getTc1();
    }

    private static void setTc1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST5B) _this_).setTc1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST5B) _this_).setTc1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Regulator lead time constant (<i>T</i><i><sub>C2</sub></i>) (&gt;= 0).  Typical value = 0,08.
     */
    private Double tc2; // Seconds

    public Double getTc2() {
        return tc2;
    }

    public void setTc2(Double _value_) {
        tc2 = _value_;
    }

    private static Object getTc2(BaseClass _this_) {
        return ((ExcIEEEST5B) _this_).getTc2();
    }

    private static void setTc2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST5B) _this_).setTc2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST5B) _this_).setTc2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * OEL lag time constant (<i>T</i><i><sub>OB1</sub></i>) (&gt;= 0).  Typical value = 2.
     */
    private Double tob1; // Seconds

    public Double getTob1() {
        return tob1;
    }

    public void setTob1(Double _value_) {
        tob1 = _value_;
    }

    private static Object getTob1(BaseClass _this_) {
        return ((ExcIEEEST5B) _this_).getTob1();
    }

    private static void setTob1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST5B) _this_).setTob1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST5B) _this_).setTob1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * OEL lag time constant (<i>T</i><i><sub>OB2</sub></i>) (&gt;= 0).  Typical value = 0,08.
     */
    private Double tob2; // Seconds

    public Double getTob2() {
        return tob2;
    }

    public void setTob2(Double _value_) {
        tob2 = _value_;
    }

    private static Object getTob2(BaseClass _this_) {
        return ((ExcIEEEST5B) _this_).getTob2();
    }

    private static void setTob2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST5B) _this_).setTob2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST5B) _this_).setTob2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * OEL lead time constant (<i>T</i><i><sub>OC1</sub></i>) (&gt;= 0).  Typical value = 0,1.
     */
    private Double toc1; // Seconds

    public Double getToc1() {
        return toc1;
    }

    public void setToc1(Double _value_) {
        toc1 = _value_;
    }

    private static Object getToc1(BaseClass _this_) {
        return ((ExcIEEEST5B) _this_).getToc1();
    }

    private static void setToc1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST5B) _this_).setToc1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST5B) _this_).setToc1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * OEL lead time constant (<i>T</i><i><sub>OC2</sub></i>) (&gt;= 0).  Typical value = 0,08.
     */
    private Double toc2; // Seconds

    public Double getToc2() {
        return toc2;
    }

    public void setToc2(Double _value_) {
        toc2 = _value_;
    }

    private static Object getToc2(BaseClass _this_) {
        return ((ExcIEEEST5B) _this_).getToc2();
    }

    private static void setToc2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST5B) _this_).setToc2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST5B) _this_).setToc2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL lag time constant (<i>T</i><i><sub>UB1</sub></i>) (&gt;= 0).  Typical value = 10.
     */
    private Double tub1; // Seconds

    public Double getTub1() {
        return tub1;
    }

    public void setTub1(Double _value_) {
        tub1 = _value_;
    }

    private static Object getTub1(BaseClass _this_) {
        return ((ExcIEEEST5B) _this_).getTub1();
    }

    private static void setTub1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST5B) _this_).setTub1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST5B) _this_).setTub1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL lag time constant (<i>T</i><i><sub>UB2</sub></i>) (&gt;= 0).  Typical value = 0,05.
     */
    private Double tub2; // Seconds

    public Double getTub2() {
        return tub2;
    }

    public void setTub2(Double _value_) {
        tub2 = _value_;
    }

    private static Object getTub2(BaseClass _this_) {
        return ((ExcIEEEST5B) _this_).getTub2();
    }

    private static void setTub2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST5B) _this_).setTub2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST5B) _this_).setTub2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL lead time constant (<i>T</i><i><sub>UC1</sub></i>) (&gt;= 0).  Typical value = 2.
     */
    private Double tuc1; // Seconds

    public Double getTuc1() {
        return tuc1;
    }

    public void setTuc1(Double _value_) {
        tuc1 = _value_;
    }

    private static Object getTuc1(BaseClass _this_) {
        return ((ExcIEEEST5B) _this_).getTuc1();
    }

    private static void setTuc1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST5B) _this_).setTuc1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST5B) _this_).setTuc1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL lead time constant (<i>T</i><i><sub>UC2</sub></i>) (&gt;= 0).  Typical value = 0,1.
     */
    private Double tuc2; // Seconds

    public Double getTuc2() {
        return tuc2;
    }

    public void setTuc2(Double _value_) {
        tuc2 = _value_;
    }

    private static Object getTuc2(BaseClass _this_) {
        return ((ExcIEEEST5B) _this_).getTuc2();
    }

    private static void setTuc2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST5B) _this_).setTuc2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST5B) _this_).setTuc2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage regulator output (<i>V</i><i><sub>RMAX</sub></i>) (&gt; 0).  Typical value = 5.
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    private static Object getVrmax(BaseClass _this_) {
        return ((ExcIEEEST5B) _this_).getVrmax();
    }

    private static void setVrmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST5B) _this_).setVrmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST5B) _this_).setVrmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator output (<i>V</i><i><sub>RMIN</sub></i>) (&lt; 0).  Typical value = -4.
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    private static Object getVrmin(BaseClass _this_) {
        return ((ExcIEEEST5B) _this_).getVrmin();
    }

    private static void setVrmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST5B) _this_).setVrmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST5B) _this_).setVrmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcIEEEST5B", attrName));
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
                "ExcIEEEST5B", attrName, value));
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
            map.put("kc", new AttrDetails("ExcIEEEST5B.kc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST5B::getKc, ExcIEEEST5B::setKc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kr", new AttrDetails("ExcIEEEST5B.kr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST5B::getKr, ExcIEEEST5B::setKr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("ExcIEEEST5B.t1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST5B::getT1, ExcIEEEST5B::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb1", new AttrDetails("ExcIEEEST5B.tb1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST5B::getTb1, ExcIEEEST5B::setTb1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb2", new AttrDetails("ExcIEEEST5B.tb2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST5B::getTb2, ExcIEEEST5B::setTb2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc1", new AttrDetails("ExcIEEEST5B.tc1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST5B::getTc1, ExcIEEEST5B::setTc1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc2", new AttrDetails("ExcIEEEST5B.tc2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST5B::getTc2, ExcIEEEST5B::setTc2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tob1", new AttrDetails("ExcIEEEST5B.tob1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST5B::getTob1, ExcIEEEST5B::setTob1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tob2", new AttrDetails("ExcIEEEST5B.tob2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST5B::getTob2, ExcIEEEST5B::setTob2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("toc1", new AttrDetails("ExcIEEEST5B.toc1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST5B::getToc1, ExcIEEEST5B::setToc1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("toc2", new AttrDetails("ExcIEEEST5B.toc2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST5B::getToc2, ExcIEEEST5B::setToc2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tub1", new AttrDetails("ExcIEEEST5B.tub1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST5B::getTub1, ExcIEEEST5B::setTub1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tub2", new AttrDetails("ExcIEEEST5B.tub2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST5B::getTub2, ExcIEEEST5B::setTub2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tuc1", new AttrDetails("ExcIEEEST5B.tuc1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST5B::getTuc1, ExcIEEEST5B::setTuc1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tuc2", new AttrDetails("ExcIEEEST5B.tuc2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST5B::getTuc2, ExcIEEEST5B::setTuc2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcIEEEST5B.vrmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST5B::getVrmax, ExcIEEEST5B::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcIEEEST5B.vrmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST5B::getVrmin, ExcIEEEST5B::setVrmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcIEEEST5B(null).allAttrDetailsMap());
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
