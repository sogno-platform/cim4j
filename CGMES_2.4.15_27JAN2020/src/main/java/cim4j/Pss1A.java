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
 * Single input power system stabilizer. It is a modified version in order to allow representation of various vendors' implementations on PSS type 1A.
 */
@SuppressWarnings("unused")
public class Pss1A extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(Pss1A.class);

    /**
     * Constructor.
     */
    public Pss1A(String rdfid) {
        super("Pss1A", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected Pss1A(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Notch filter parameter (A1).
     */
    private Double a1; // PU

    public Double getA1() {
        return a1;
    }

    public void setA1(Double _value_) {
        a1 = _value_;
    }

    private static Object getA1(BaseClass _this_) {
        return ((Pss1A) _this_).getA1();
    }

    private static void setA1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1A) _this_).setA1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1A) _this_).setA1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Notch filter parameter (A2).
     */
    private Double a2; // PU

    public Double getA2() {
        return a2;
    }

    public void setA2(Double _value_) {
        a2 = _value_;
    }

    private static Object getA2(BaseClass _this_) {
        return ((Pss1A) _this_).getA2();
    }

    private static void setA2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1A) _this_).setA2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1A) _this_).setA2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Notch filter parameter (A3).
     */
    private Double a3; // PU

    public Double getA3() {
        return a3;
    }

    public void setA3(Double _value_) {
        a3 = _value_;
    }

    private static Object getA3(BaseClass _this_) {
        return ((Pss1A) _this_).getA3();
    }

    private static void setA3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1A) _this_).setA3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1A) _this_).setA3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Notch filter parameter (A4).
     */
    private Double a4; // PU

    public Double getA4() {
        return a4;
    }

    public void setA4(Double _value_) {
        a4 = _value_;
    }

    private static Object getA4(BaseClass _this_) {
        return ((Pss1A) _this_).getA4();
    }

    private static void setA4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1A) _this_).setA4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1A) _this_).setA4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Notch filter parameter (A5).
     */
    private Double a5; // PU

    public Double getA5() {
        return a5;
    }

    public void setA5(Double _value_) {
        a5 = _value_;
    }

    private static Object getA5(BaseClass _this_) {
        return ((Pss1A) _this_).getA5();
    }

    private static void setA5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1A) _this_).setA5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1A) _this_).setA5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Notch filter parameter (A6).
     */
    private Double a6; // PU

    public Double getA6() {
        return a6;
    }

    public void setA6(Double _value_) {
        a6 = _value_;
    }

    private static Object getA6(BaseClass _this_) {
        return ((Pss1A) _this_).getA6();
    }

    private static void setA6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1A) _this_).setA6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1A) _this_).setA6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Notch filter parameter (A7).
     */
    private Double a7; // PU

    public Double getA7() {
        return a7;
    }

    public void setA7(Double _value_) {
        a7 = _value_;
    }

    private static Object getA7(BaseClass _this_) {
        return ((Pss1A) _this_).getA7();
    }

    private static void setA7(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1A) _this_).setA7((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1A) _this_).setA7(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Notch filter parameter (A8).
     */
    private Double a8; // PU

    public Double getA8() {
        return a8;
    }

    public void setA8(Double _value_) {
        a8 = _value_;
    }

    private static Object getA8(BaseClass _this_) {
        return ((Pss1A) _this_).getA8();
    }

    private static void setA8(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1A) _this_).setA8((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1A) _this_).setA8(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Type of input signal.
     */
    private String inputSignalType; // InputSignalKind

    public String getInputSignalType() {
        return inputSignalType;
    }

    public void setInputSignalType(String _value_) {
        inputSignalType = _value_;
    }

    private static Object getInputSignalType(BaseClass _this_) {
        return ((Pss1A) _this_).getInputSignalType();
    }

    private static void setInputSignalType(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Pss1A) _this_).setInputSignalType((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Selector (Kd).  true = e used false = e not used.
     */
    private Boolean kd; // Boolean

    public Boolean getKd() {
        return kd;
    }

    public void setKd(Boolean _value_) {
        kd = _value_;
    }

    private static Object getKd(BaseClass _this_) {
        return ((Pss1A) _this_).getKd();
    }

    private static void setKd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Pss1A) _this_).setKd((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1A) _this_).setKd(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Stabilizer gain (Ks).
     */
    private Double ks; // PU

    public Double getKs() {
        return ks;
    }

    public void setKs(Double _value_) {
        ks = _value_;
    }

    private static Object getKs(BaseClass _this_) {
        return ((Pss1A) _this_).getKs();
    }

    private static void setKs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1A) _this_).setKs((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1A) _this_).setKs(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (T1).
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((Pss1A) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1A) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1A) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (T2).
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    private static Object getT2(BaseClass _this_) {
        return ((Pss1A) _this_).getT2();
    }

    private static void setT2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1A) _this_).setT2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1A) _this_).setT2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (T3).
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    private static Object getT3(BaseClass _this_) {
        return ((Pss1A) _this_).getT3();
    }

    private static void setT3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1A) _this_).setT3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1A) _this_).setT3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (T4).
     */
    private Double t4; // Seconds

    public Double getT4() {
        return t4;
    }

    public void setT4(Double _value_) {
        t4 = _value_;
    }

    private static Object getT4(BaseClass _this_) {
        return ((Pss1A) _this_).getT4();
    }

    private static void setT4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1A) _this_).setT4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1A) _this_).setT4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Washout time constant (T5).
     */
    private Double t5; // Seconds

    public Double getT5() {
        return t5;
    }

    public void setT5(Double _value_) {
        t5 = _value_;
    }

    private static Object getT5(BaseClass _this_) {
        return ((Pss1A) _this_).getT5();
    }

    private static void setT5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1A) _this_).setT5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1A) _this_).setT5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Transducer time constant (T6).
     */
    private Double t6; // Seconds

    public Double getT6() {
        return t6;
    }

    public void setT6(Double _value_) {
        t6 = _value_;
    }

    private static Object getT6(BaseClass _this_) {
        return ((Pss1A) _this_).getT6();
    }

    private static void setT6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1A) _this_).setT6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1A) _this_).setT6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (Tdelay).
     */
    private Double tdelay; // Seconds

    public Double getTdelay() {
        return tdelay;
    }

    public void setTdelay(Double _value_) {
        tdelay = _value_;
    }

    private static Object getTdelay(BaseClass _this_) {
        return ((Pss1A) _this_).getTdelay();
    }

    private static void setTdelay(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1A) _this_).setTdelay((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1A) _this_).setTdelay(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Stabilizer input cutoff threshold (Vcl).
     */
    private Double vcl; // PU

    public Double getVcl() {
        return vcl;
    }

    public void setVcl(Double _value_) {
        vcl = _value_;
    }

    private static Object getVcl(BaseClass _this_) {
        return ((Pss1A) _this_).getVcl();
    }

    private static void setVcl(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1A) _this_).setVcl((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1A) _this_).setVcl(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Stabilizer input cutoff threshold (Vcu).
     */
    private Double vcu; // PU

    public Double getVcu() {
        return vcu;
    }

    public void setVcu(Double _value_) {
        vcu = _value_;
    }

    private static Object getVcu(BaseClass _this_) {
        return ((Pss1A) _this_).getVcu();
    }

    private static void setVcu(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1A) _this_).setVcu((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1A) _this_).setVcu(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum stabilizer output (Vrmax).
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    private static Object getVrmax(BaseClass _this_) {
        return ((Pss1A) _this_).getVrmax();
    }

    private static void setVrmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1A) _this_).setVrmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1A) _this_).setVrmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum stabilizer output (Vrmin).
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    private static Object getVrmin(BaseClass _this_) {
        return ((Pss1A) _this_).getVrmin();
    }

    private static void setVrmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss1A) _this_).setVrmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss1A) _this_).setVrmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "Pss1A", attrName));
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
                "Pss1A", attrName, value));
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
            map.put("a1", new AttrDetails("Pss1A.a1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss1A::getA1, Pss1A::setA1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a2", new AttrDetails("Pss1A.a2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss1A::getA2, Pss1A::setA2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a3", new AttrDetails("Pss1A.a3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss1A::getA3, Pss1A::setA3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a4", new AttrDetails("Pss1A.a4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss1A::getA4, Pss1A::setA4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a5", new AttrDetails("Pss1A.a5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss1A::getA5, Pss1A::setA5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a6", new AttrDetails("Pss1A.a6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss1A::getA6, Pss1A::setA6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a7", new AttrDetails("Pss1A.a7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss1A::getA7, Pss1A::setA7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a8", new AttrDetails("Pss1A.a8", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss1A::getA8, Pss1A::setA8));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("inputSignalType", new AttrDetails("Pss1A.inputSignalType", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, Pss1A::getInputSignalType, Pss1A::setInputSignalType));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("Pss1A.kd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss1A::getKd, Pss1A::setKd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks", new AttrDetails("Pss1A.ks", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss1A::getKs, Pss1A::setKs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("Pss1A.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss1A::getT1, Pss1A::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("Pss1A.t2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss1A::getT2, Pss1A::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("Pss1A.t3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss1A::getT3, Pss1A::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("Pss1A.t4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss1A::getT4, Pss1A::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5", new AttrDetails("Pss1A.t5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss1A::getT5, Pss1A::setT5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t6", new AttrDetails("Pss1A.t6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss1A::getT6, Pss1A::setT6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tdelay", new AttrDetails("Pss1A.tdelay", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss1A::getTdelay, Pss1A::setTdelay));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vcl", new AttrDetails("Pss1A.vcl", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss1A::getVcl, Pss1A::setVcl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vcu", new AttrDetails("Pss1A.vcu", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss1A::getVcu, Pss1A::setVcu));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("Pss1A.vrmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss1A::getVrmax, Pss1A::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("Pss1A.vrmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Pss1A::getVrmin, Pss1A::setVrmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new Pss1A(null).allAttrDetailsMap());
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
