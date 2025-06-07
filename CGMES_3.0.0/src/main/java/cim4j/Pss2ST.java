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
public class Pss2ST extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(Pss2ST.class);

    /**
     * Constructor.
     */
    public Pss2ST(String rdfid) {
        super("Pss2ST", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected Pss2ST(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Type of input signal #1 (rotorAngularFrequencyDeviation, busFrequencyDeviation, generatorElectricalPower, generatorAcceleratingPower, busVoltage, or busVoltageDerivative - shall be different than Pss2ST.inputSignal2Type).  Typical value = rotorAngularFrequencyDeviation.
     */
    private String inputSignal1Type; // InputSignalKind

    public String getInputSignal1Type() {
        return inputSignal1Type;
    }

    public void setInputSignal1Type(String _value_) {
        inputSignal1Type = _value_;
    }

    private static Object getInputSignal1Type(BaseClass _this_) {
        return ((Pss2ST) _this_).getInputSignal1Type();
    }

    private static void setInputSignal1Type(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Pss2ST) _this_).setInputSignal1Type((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Type of input signal #2 (rotorAngularFrequencyDeviation, busFrequencyDeviation, generatorElectricalPower, generatorAcceleratingPower, busVoltage, or busVoltageDerivative - shall be different than Pss2ST.inputSignal1Type).  Typical value = busVoltageDerivative.
     */
    private String inputSignal2Type; // InputSignalKind

    public String getInputSignal2Type() {
        return inputSignal2Type;
    }

    public void setInputSignal2Type(String _value_) {
        inputSignal2Type = _value_;
    }

    private static Object getInputSignal2Type(BaseClass _this_) {
        return ((Pss2ST) _this_).getInputSignal2Type();
    }

    private static void setInputSignal2Type(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Pss2ST) _this_).setInputSignal2Type((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Gain (<i>K</i><i><sub>1</sub></i>).
     */
    private Double k1; // PU

    public Double getK1() {
        return k1;
    }

    public void setK1(Double _value_) {
        k1 = _value_;
    }

    private static Object getK1(BaseClass _this_) {
        return ((Pss2ST) _this_).getK1();
    }

    private static void setK1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2ST) _this_).setK1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2ST) _this_).setK1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (<i>K</i><i><sub>2</sub></i>).
     */
    private Double k2; // PU

    public Double getK2() {
        return k2;
    }

    public void setK2(Double _value_) {
        k2 = _value_;
    }

    private static Object getK2(BaseClass _this_) {
        return ((Pss2ST) _this_).getK2();
    }

    private static void setK2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2ST) _this_).setK2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2ST) _this_).setK2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Limiter (<i>L</i><i><sub>SMAX</sub></i>) (&gt; Pss2ST.lsmin).
     */
    private Double lsmax; // PU

    public Double getLsmax() {
        return lsmax;
    }

    public void setLsmax(Double _value_) {
        lsmax = _value_;
    }

    private static Object getLsmax(BaseClass _this_) {
        return ((Pss2ST) _this_).getLsmax();
    }

    private static void setLsmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2ST) _this_).setLsmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2ST) _this_).setLsmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Limiter (<i>L</i><i><sub>SMIN</sub></i>) (&lt; Pss2ST.lsmax).
     */
    private Double lsmin; // PU

    public Double getLsmin() {
        return lsmin;
    }

    public void setLsmin(Double _value_) {
        lsmin = _value_;
    }

    private static Object getLsmin(BaseClass _this_) {
        return ((Pss2ST) _this_).getLsmin();
    }

    private static void setLsmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2ST) _this_).setLsmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2ST) _this_).setLsmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T</i><i><sub>1</sub></i>) (&gt;= 0).
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((Pss2ST) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2ST) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2ST) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T</i><i><sub>10</sub></i>) (&gt;= 0).
     */
    private Double t10; // Seconds

    public Double getT10() {
        return t10;
    }

    public void setT10(Double _value_) {
        t10 = _value_;
    }

    private static Object getT10(BaseClass _this_) {
        return ((Pss2ST) _this_).getT10();
    }

    private static void setT10(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2ST) _this_).setT10((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2ST) _this_).setT10(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T</i><i><sub>2</sub></i>) (&gt;= 0).
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    private static Object getT2(BaseClass _this_) {
        return ((Pss2ST) _this_).getT2();
    }

    private static void setT2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2ST) _this_).setT2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2ST) _this_).setT2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T</i><i><sub>3</sub></i>) (&gt;= 0).
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    private static Object getT3(BaseClass _this_) {
        return ((Pss2ST) _this_).getT3();
    }

    private static void setT3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2ST) _this_).setT3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2ST) _this_).setT3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T</i><i><sub>4</sub></i>) (&gt;= 0).
     */
    private Double t4; // Seconds

    public Double getT4() {
        return t4;
    }

    public void setT4(Double _value_) {
        t4 = _value_;
    }

    private static Object getT4(BaseClass _this_) {
        return ((Pss2ST) _this_).getT4();
    }

    private static void setT4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2ST) _this_).setT4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2ST) _this_).setT4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T</i><i><sub>5</sub></i>) (&gt;= 0).
     */
    private Double t5; // Seconds

    public Double getT5() {
        return t5;
    }

    public void setT5(Double _value_) {
        t5 = _value_;
    }

    private static Object getT5(BaseClass _this_) {
        return ((Pss2ST) _this_).getT5();
    }

    private static void setT5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2ST) _this_).setT5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2ST) _this_).setT5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T</i><i><sub>6</sub></i>) (&gt;= 0).
     */
    private Double t6; // Seconds

    public Double getT6() {
        return t6;
    }

    public void setT6(Double _value_) {
        t6 = _value_;
    }

    private static Object getT6(BaseClass _this_) {
        return ((Pss2ST) _this_).getT6();
    }

    private static void setT6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2ST) _this_).setT6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2ST) _this_).setT6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T</i><i><sub>7</sub></i>) (&gt;= 0).
     */
    private Double t7; // Seconds

    public Double getT7() {
        return t7;
    }

    public void setT7(Double _value_) {
        t7 = _value_;
    }

    private static Object getT7(BaseClass _this_) {
        return ((Pss2ST) _this_).getT7();
    }

    private static void setT7(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2ST) _this_).setT7((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2ST) _this_).setT7(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T</i><i><sub>8</sub></i>) (&gt;= 0).
     */
    private Double t8; // Seconds

    public Double getT8() {
        return t8;
    }

    public void setT8(Double _value_) {
        t8 = _value_;
    }

    private static Object getT8(BaseClass _this_) {
        return ((Pss2ST) _this_).getT8();
    }

    private static void setT8(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2ST) _this_).setT8((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2ST) _this_).setT8(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T</i><i><sub>9</sub></i>) (&gt;= 0).
     */
    private Double t9; // Seconds

    public Double getT9() {
        return t9;
    }

    public void setT9(Double _value_) {
        t9 = _value_;
    }

    private static Object getT9(BaseClass _this_) {
        return ((Pss2ST) _this_).getT9();
    }

    private static void setT9(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2ST) _this_).setT9((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2ST) _this_).setT9(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Cutoff limiter (<i>V</i><i><sub>CL</sub></i>).
     */
    private Double vcl; // PU

    public Double getVcl() {
        return vcl;
    }

    public void setVcl(Double _value_) {
        vcl = _value_;
    }

    private static Object getVcl(BaseClass _this_) {
        return ((Pss2ST) _this_).getVcl();
    }

    private static void setVcl(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2ST) _this_).setVcl((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2ST) _this_).setVcl(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Cutoff limiter (<i>V</i><i><sub>CU</sub></i>).
     */
    private Double vcu; // PU

    public Double getVcu() {
        return vcu;
    }

    public void setVcu(Double _value_) {
        vcu = _value_;
    }

    private static Object getVcu(BaseClass _this_) {
        return ((Pss2ST) _this_).getVcu();
    }

    private static void setVcu(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2ST) _this_).setVcu((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2ST) _this_).setVcu(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "Pss2ST", attrName));
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
                "Pss2ST", attrName, value));
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
            map.put("inputSignal1Type", new AttrDetails("Pss2ST.inputSignal1Type", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, Pss2ST::getInputSignal1Type, Pss2ST::setInputSignal1Type));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("inputSignal2Type", new AttrDetails("Pss2ST.inputSignal2Type", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, Pss2ST::getInputSignal2Type, Pss2ST::setInputSignal2Type));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k1", new AttrDetails("Pss2ST.k1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2ST::getK1, Pss2ST::setK1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k2", new AttrDetails("Pss2ST.k2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2ST::getK2, Pss2ST::setK2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lsmax", new AttrDetails("Pss2ST.lsmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2ST::getLsmax, Pss2ST::setLsmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lsmin", new AttrDetails("Pss2ST.lsmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2ST::getLsmin, Pss2ST::setLsmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("Pss2ST.t1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2ST::getT1, Pss2ST::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t10", new AttrDetails("Pss2ST.t10", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2ST::getT10, Pss2ST::setT10));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("Pss2ST.t2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2ST::getT2, Pss2ST::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("Pss2ST.t3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2ST::getT3, Pss2ST::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("Pss2ST.t4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2ST::getT4, Pss2ST::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5", new AttrDetails("Pss2ST.t5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2ST::getT5, Pss2ST::setT5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t6", new AttrDetails("Pss2ST.t6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2ST::getT6, Pss2ST::setT6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t7", new AttrDetails("Pss2ST.t7", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2ST::getT7, Pss2ST::setT7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t8", new AttrDetails("Pss2ST.t8", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2ST::getT8, Pss2ST::setT8));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t9", new AttrDetails("Pss2ST.t9", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2ST::getT9, Pss2ST::setT9));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vcl", new AttrDetails("Pss2ST.vcl", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2ST::getVcl, Pss2ST::setVcl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vcu", new AttrDetails("Pss2ST.vcu", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2ST::getVcu, Pss2ST::setVcu));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new Pss2ST(null).allAttrDetailsMap());
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
