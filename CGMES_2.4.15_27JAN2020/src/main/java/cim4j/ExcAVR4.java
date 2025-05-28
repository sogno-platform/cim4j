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
 * Italian excitation system. It represents static exciter and electric voltage regulator.
 */
@SuppressWarnings("unused")
public class ExcAVR4 extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcAVR4.class);

    /**
     * Constructor.
     */
    public ExcAVR4(String rdfid) {
        super("ExcAVR4", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcAVR4(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * AVR output voltage dependency selector (Imul). true = selector is connected false = selector is not connected. Typical Value = true.
     */
    private Boolean imul; // Boolean

    public Boolean getImul() {
        return imul;
    }

    public void setImul(Boolean _value_) {
        imul = _value_;
    }

    private static Object getImul(BaseClass _this_) {
        return ((ExcAVR4) _this_).getImul();
    }

    private static void setImul(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ExcAVR4) _this_).setImul((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR4) _this_).setImul(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * AVR gain (K).  Typical Value = 300.
     */
    private Double ka; // Simple_Float

    public Double getKa() {
        return ka;
    }

    public void setKa(Double _value_) {
        ka = _value_;
    }

    private static Object getKa(BaseClass _this_) {
        return ((ExcAVR4) _this_).getKa();
    }

    private static void setKa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR4) _this_).setKa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR4) _this_).setKa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter gain (K).  Typical Value = 1.
     */
    private Double ke; // Simple_Float

    public Double getKe() {
        return ke;
    }

    public void setKe(Double _value_) {
        ke = _value_;
    }

    private static Object getKe(BaseClass _this_) {
        return ((ExcAVR4) _this_).getKe();
    }

    private static void setKe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR4) _this_).setKe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR4) _this_).setKe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter internal reactance (K).  Typical Value = 0.
     */
    private Double kif; // Simple_Float

    public Double getKif() {
        return kif;
    }

    public void setKif(Double _value_) {
        kif = _value_;
    }

    private static Object getKif(BaseClass _this_) {
        return ((ExcAVR4) _this_).getKif();
    }

    private static void setKif(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR4) _this_).setKif((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR4) _this_).setKif(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * AVR time constant (T).  Typical Value = 4.8.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((ExcAVR4) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR4) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR4) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter current feedback time constant (T).  Typical Value = 60.
     */
    private Double t1if; // Seconds

    public Double getT1if() {
        return t1if;
    }

    public void setT1if(Double _value_) {
        t1if = _value_;
    }

    private static Object getT1if(BaseClass _this_) {
        return ((ExcAVR4) _this_).getT1if();
    }

    private static void setT1if(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR4) _this_).setT1if((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR4) _this_).setT1if(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * AVR time constant (T).  Typical Value = 1.5.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    private static Object getT2(BaseClass _this_) {
        return ((ExcAVR4) _this_).getT2();
    }

    private static void setT2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR4) _this_).setT2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR4) _this_).setT2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * AVR time constant (T).  Typical Value = 0.
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    private static Object getT3(BaseClass _this_) {
        return ((ExcAVR4) _this_).getT3();
    }

    private static void setT3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR4) _this_).setT3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR4) _this_).setT3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * AVR time constant (T).  Typical Value = 0.
     */
    private Double t4; // Seconds

    public Double getT4() {
        return t4;
    }

    public void setT4(Double _value_) {
        t4 = _value_;
    }

    private static Object getT4(BaseClass _this_) {
        return ((ExcAVR4) _this_).getT4();
    }

    private static void setT4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR4) _this_).setT4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR4) _this_).setT4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter current feedback time constant (T).  Typical Value = 0.
     */
    private Double tif; // Seconds

    public Double getTif() {
        return tif;
    }

    public void setTif(Double _value_) {
        tif = _value_;
    }

    private static Object getTif(BaseClass _this_) {
        return ((ExcAVR4) _this_).getTif();
    }

    private static void setTif(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR4) _this_).setTif((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR4) _this_).setTif(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum exciter output (V).  Typical Value = 0.
     */
    private Double vfmn; // PU

    public Double getVfmn() {
        return vfmn;
    }

    public void setVfmn(Double _value_) {
        vfmn = _value_;
    }

    private static Object getVfmn(BaseClass _this_) {
        return ((ExcAVR4) _this_).getVfmn();
    }

    private static void setVfmn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR4) _this_).setVfmn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR4) _this_).setVfmn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum exciter output (V).  Typical Value = 5.
     */
    private Double vfmx; // PU

    public Double getVfmx() {
        return vfmx;
    }

    public void setVfmx(Double _value_) {
        vfmx = _value_;
    }

    private static Object getVfmx(BaseClass _this_) {
        return ((ExcAVR4) _this_).getVfmx();
    }

    private static void setVfmx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR4) _this_).setVfmx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR4) _this_).setVfmx(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum AVR output (V).  Typical Value = 0.
     */
    private Double vrmn; // PU

    public Double getVrmn() {
        return vrmn;
    }

    public void setVrmn(Double _value_) {
        vrmn = _value_;
    }

    private static Object getVrmn(BaseClass _this_) {
        return ((ExcAVR4) _this_).getVrmn();
    }

    private static void setVrmn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR4) _this_).setVrmn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR4) _this_).setVrmn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum AVR output (V).  Typical Value = 5.
     */
    private Double vrmx; // PU

    public Double getVrmx() {
        return vrmx;
    }

    public void setVrmx(Double _value_) {
        vrmx = _value_;
    }

    private static Object getVrmx(BaseClass _this_) {
        return ((ExcAVR4) _this_).getVrmx();
    }

    private static void setVrmx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAVR4) _this_).setVrmx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAVR4) _this_).setVrmx(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcAVR4", attrName));
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
                "ExcAVR4", attrName, value));
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
            map.put("imul", new AttrDetails("ExcAVR4.imul", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR4::getImul, ExcAVR4::setImul));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("ExcAVR4.ka", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR4::getKa, ExcAVR4::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcAVR4.ke", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR4::getKe, ExcAVR4::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kif", new AttrDetails("ExcAVR4.kif", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR4::getKif, ExcAVR4::setKif));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("ExcAVR4.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR4::getT1, ExcAVR4::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1if", new AttrDetails("ExcAVR4.t1if", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR4::getT1if, ExcAVR4::setT1if));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("ExcAVR4.t2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR4::getT2, ExcAVR4::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("ExcAVR4.t3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR4::getT3, ExcAVR4::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("ExcAVR4.t4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR4::getT4, ExcAVR4::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tif", new AttrDetails("ExcAVR4.tif", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR4::getTif, ExcAVR4::setTif));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vfmn", new AttrDetails("ExcAVR4.vfmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR4::getVfmn, ExcAVR4::setVfmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vfmx", new AttrDetails("ExcAVR4.vfmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR4::getVfmx, ExcAVR4::setVfmx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmn", new AttrDetails("ExcAVR4.vrmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR4::getVrmn, ExcAVR4::setVrmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmx", new AttrDetails("ExcAVR4.vrmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAVR4::getVrmx, ExcAVR4::setVrmx));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcAVR4(null).allAttrDetailsMap());
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
