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
 * IVO excitation system.
 */
@SuppressWarnings("unused")
public class ExcAVR7 extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcAVR7.class);

    /**
     * Constructor.
     */
    public ExcAVR7(String rdfid) {
        super("ExcAVR7", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcAVR7(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Lead coefficient (A1).  Typical Value = 0.5.
     */
    private Double a1; // PU

    public Double getA1() {
        return a1;
    }

    public void setA1(Double _value_) {
        a1 = _value_;
    }

    private static Object getA1(BaseClass _this_) {
        return ((ExcAVR7) _this_).getA1();
    }

    private static void setA1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR7) _this_).setA1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR7) _this_).setA1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lag coefficient (A2).  Typical Value = 0.5.
     */
    private Double a2; // PU

    public Double getA2() {
        return a2;
    }

    public void setA2(Double _value_) {
        a2 = _value_;
    }

    private static Object getA2(BaseClass _this_) {
        return ((ExcAVR7) _this_).getA2();
    }

    private static void setA2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR7) _this_).setA2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR7) _this_).setA2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead coefficient (A3).  Typical Value = 0.5.
     */
    private Double a3; // PU

    public Double getA3() {
        return a3;
    }

    public void setA3(Double _value_) {
        a3 = _value_;
    }

    private static Object getA3(BaseClass _this_) {
        return ((ExcAVR7) _this_).getA3();
    }

    private static void setA3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR7) _this_).setA3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR7) _this_).setA3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lag coefficient (A4).  Typical Value = 0.5.
     */
    private Double a4; // PU

    public Double getA4() {
        return a4;
    }

    public void setA4(Double _value_) {
        a4 = _value_;
    }

    private static Object getA4(BaseClass _this_) {
        return ((ExcAVR7) _this_).getA4();
    }

    private static void setA4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR7) _this_).setA4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR7) _this_).setA4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead coefficient (A5).  Typical Value = 0.5.
     */
    private Double a5; // PU

    public Double getA5() {
        return a5;
    }

    public void setA5(Double _value_) {
        a5 = _value_;
    }

    private static Object getA5(BaseClass _this_) {
        return ((ExcAVR7) _this_).getA5();
    }

    private static void setA5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR7) _this_).setA5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR7) _this_).setA5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lag coefficient (A6).  Typical Value = 0.5.
     */
    private Double a6; // PU

    public Double getA6() {
        return a6;
    }

    public void setA6(Double _value_) {
        a6 = _value_;
    }

    private static Object getA6(BaseClass _this_) {
        return ((ExcAVR7) _this_).getA6();
    }

    private static void setA6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR7) _this_).setA6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR7) _this_).setA6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (K1).  Typical Value = 1.
     */
    private Double k1; // PU

    public Double getK1() {
        return k1;
    }

    public void setK1(Double _value_) {
        k1 = _value_;
    }

    private static Object getK1(BaseClass _this_) {
        return ((ExcAVR7) _this_).getK1();
    }

    private static void setK1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR7) _this_).setK1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR7) _this_).setK1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (K3).  Typical Value = 3.
     */
    private Double k3; // PU

    public Double getK3() {
        return k3;
    }

    public void setK3(Double _value_) {
        k3 = _value_;
    }

    private static Object getK3(BaseClass _this_) {
        return ((ExcAVR7) _this_).getK3();
    }

    private static void setK3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR7) _this_).setK3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR7) _this_).setK3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (K5).  Typical Value = 1.
     */
    private Double k5; // PU

    public Double getK5() {
        return k5;
    }

    public void setK5(Double _value_) {
        k5 = _value_;
    }

    private static Object getK5(BaseClass _this_) {
        return ((ExcAVR7) _this_).getK5();
    }

    private static void setK5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR7) _this_).setK5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR7) _this_).setK5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead time constant (T1).  Typical Value = 0.05.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((ExcAVR7) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR7) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR7) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lag time constant (T2).  Typical Value = 0.1.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    private static Object getT2(BaseClass _this_) {
        return ((ExcAVR7) _this_).getT2();
    }

    private static void setT2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR7) _this_).setT2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR7) _this_).setT2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead time constant (T3).  Typical Value = 0.1.
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    private static Object getT3(BaseClass _this_) {
        return ((ExcAVR7) _this_).getT3();
    }

    private static void setT3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR7) _this_).setT3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR7) _this_).setT3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lag time constant (T4).  Typical Value = 0.1.
     */
    private Double t4; // Seconds

    public Double getT4() {
        return t4;
    }

    public void setT4(Double _value_) {
        t4 = _value_;
    }

    private static Object getT4(BaseClass _this_) {
        return ((ExcAVR7) _this_).getT4();
    }

    private static void setT4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR7) _this_).setT4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR7) _this_).setT4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead time constant (T5).  Typical Value = 0.1.
     */
    private Double t5; // Seconds

    public Double getT5() {
        return t5;
    }

    public void setT5(Double _value_) {
        t5 = _value_;
    }

    private static Object getT5(BaseClass _this_) {
        return ((ExcAVR7) _this_).getT5();
    }

    private static void setT5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR7) _this_).setT5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR7) _this_).setT5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lag time constant (T6).  Typical Value = 0.1.
     */
    private Double t6; // Seconds

    public Double getT6() {
        return t6;
    }

    public void setT6(Double _value_) {
        t6 = _value_;
    }

    private static Object getT6(BaseClass _this_) {
        return ((ExcAVR7) _this_).getT6();
    }

    private static void setT6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR7) _this_).setT6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR7) _this_).setT6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead-lag max. limit (Vmax1).  Typical Value = 5.
     */
    private Double vmax1; // PU

    public Double getVmax1() {
        return vmax1;
    }

    public void setVmax1(Double _value_) {
        vmax1 = _value_;
    }

    private static Object getVmax1(BaseClass _this_) {
        return ((ExcAVR7) _this_).getVmax1();
    }

    private static void setVmax1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR7) _this_).setVmax1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR7) _this_).setVmax1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead-lag max. limit (Vmax3).  Typical Value = 5.
     */
    private Double vmax3; // PU

    public Double getVmax3() {
        return vmax3;
    }

    public void setVmax3(Double _value_) {
        vmax3 = _value_;
    }

    private static Object getVmax3(BaseClass _this_) {
        return ((ExcAVR7) _this_).getVmax3();
    }

    private static void setVmax3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR7) _this_).setVmax3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR7) _this_).setVmax3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead-lag max. limit (Vmax5).  Typical Value = 5.
     */
    private Double vmax5; // PU

    public Double getVmax5() {
        return vmax5;
    }

    public void setVmax5(Double _value_) {
        vmax5 = _value_;
    }

    private static Object getVmax5(BaseClass _this_) {
        return ((ExcAVR7) _this_).getVmax5();
    }

    private static void setVmax5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR7) _this_).setVmax5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR7) _this_).setVmax5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead-lag min. limit (Vmin1).  Typical Value = -5.
     */
    private Double vmin1; // PU

    public Double getVmin1() {
        return vmin1;
    }

    public void setVmin1(Double _value_) {
        vmin1 = _value_;
    }

    private static Object getVmin1(BaseClass _this_) {
        return ((ExcAVR7) _this_).getVmin1();
    }

    private static void setVmin1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR7) _this_).setVmin1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR7) _this_).setVmin1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead-lag min. limit (Vmin3).  Typical Value = -5.
     */
    private Double vmin3; // PU

    public Double getVmin3() {
        return vmin3;
    }

    public void setVmin3(Double _value_) {
        vmin3 = _value_;
    }

    private static Object getVmin3(BaseClass _this_) {
        return ((ExcAVR7) _this_).getVmin3();
    }

    private static void setVmin3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR7) _this_).setVmin3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR7) _this_).setVmin3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead-lag min. limit (Vmin5).  Typical Value = -2.
     */
    private Double vmin5; // PU

    public Double getVmin5() {
        return vmin5;
    }

    public void setVmin5(Double _value_) {
        vmin5 = _value_;
    }

    private static Object getVmin5(BaseClass _this_) {
        return ((ExcAVR7) _this_).getVmin5();
    }

    private static void setVmin5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR7) _this_).setVmin5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR7) _this_).setVmin5(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcAVR7", attrName));
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
                "ExcAVR7", attrName, value));
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
            map.put("a1", new AttrDetails("ExcAVR7.a1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR7::getA1, ExcAVR7::setA1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a2", new AttrDetails("ExcAVR7.a2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR7::getA2, ExcAVR7::setA2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a3", new AttrDetails("ExcAVR7.a3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR7::getA3, ExcAVR7::setA3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a4", new AttrDetails("ExcAVR7.a4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR7::getA4, ExcAVR7::setA4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a5", new AttrDetails("ExcAVR7.a5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR7::getA5, ExcAVR7::setA5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a6", new AttrDetails("ExcAVR7.a6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR7::getA6, ExcAVR7::setA6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k1", new AttrDetails("ExcAVR7.k1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR7::getK1, ExcAVR7::setK1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k3", new AttrDetails("ExcAVR7.k3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR7::getK3, ExcAVR7::setK3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k5", new AttrDetails("ExcAVR7.k5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR7::getK5, ExcAVR7::setK5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("ExcAVR7.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR7::getT1, ExcAVR7::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("ExcAVR7.t2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR7::getT2, ExcAVR7::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("ExcAVR7.t3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR7::getT3, ExcAVR7::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("ExcAVR7.t4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR7::getT4, ExcAVR7::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5", new AttrDetails("ExcAVR7.t5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR7::getT5, ExcAVR7::setT5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t6", new AttrDetails("ExcAVR7.t6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR7::getT6, ExcAVR7::setT6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmax1", new AttrDetails("ExcAVR7.vmax1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR7::getVmax1, ExcAVR7::setVmax1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmax3", new AttrDetails("ExcAVR7.vmax3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR7::getVmax3, ExcAVR7::setVmax3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmax5", new AttrDetails("ExcAVR7.vmax5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR7::getVmax5, ExcAVR7::setVmax5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmin1", new AttrDetails("ExcAVR7.vmin1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR7::getVmin1, ExcAVR7::setVmin1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmin3", new AttrDetails("ExcAVR7.vmin3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR7::getVmin3, ExcAVR7::setVmin3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmin5", new AttrDetails("ExcAVR7.vmin5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR7::getVmin5, ExcAVR7::setVmin5));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcAVR7(null).allAttrDetailsMap());
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
