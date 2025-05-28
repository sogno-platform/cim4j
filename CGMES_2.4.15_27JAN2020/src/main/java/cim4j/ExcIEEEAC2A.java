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
 * The class represents IEEE Std 421.5-2005 type AC2A model. The model represents a high initial response field-controlled alternator-rectifier excitation system. The alternator main exciter is used with non-controlled rectifiers. The Type AC2A model is similar to that of Type AC1A except for the inclusion of exciter time constant compensation and exciter field current limiting elements.  Reference: IEEE Standard 421.5-2005 Section 6.2.
 */
@SuppressWarnings("unused")
public class ExcIEEEAC2A extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcIEEEAC2A.class);

    /**
     * Constructor.
     */
    public ExcIEEEAC2A(String rdfid) {
        super("ExcIEEEAC2A", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcIEEEAC2A(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Voltage regulator gain (K).  Typical Value = 400.
     */
    private Double ka; // PU

    public Double getKa() {
        return ka;
    }

    public void setKa(Double _value_) {
        ka = _value_;
    }

    private static Object getKa(BaseClass _this_) {
        return ((ExcIEEEAC2A) _this_).getKa();
    }

    private static void setKa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC2A) _this_).setKa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC2A) _this_).setKa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Second stage regulator gain (K).  Typical Value = 25.
     */
    private Double kb; // PU

    public Double getKb() {
        return kb;
    }

    public void setKb(Double _value_) {
        kb = _value_;
    }

    private static Object getKb(BaseClass _this_) {
        return ((ExcIEEEAC2A) _this_).getKb();
    }

    private static void setKb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC2A) _this_).setKb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC2A) _this_).setKb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rectifier loading factor proportional to commutating reactance (K).  Typical Value = 0.28.
     */
    private Double kc; // PU

    public Double getKc() {
        return kc;
    }

    public void setKc(Double _value_) {
        kc = _value_;
    }

    private static Object getKc(BaseClass _this_) {
        return ((ExcIEEEAC2A) _this_).getKc();
    }

    private static void setKc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC2A) _this_).setKc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC2A) _this_).setKc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Demagnetizing factor, a function of exciter alternator reactances (K).  Typical Value = 0.35.
     */
    private Double kd; // PU

    public Double getKd() {
        return kd;
    }

    public void setKd(Double _value_) {
        kd = _value_;
    }

    private static Object getKd(BaseClass _this_) {
        return ((ExcIEEEAC2A) _this_).getKd();
    }

    private static void setKd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC2A) _this_).setKd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC2A) _this_).setKd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter constant related to self-excited field (K).  Typical Value = 1.
     */
    private Double ke; // PU

    public Double getKe() {
        return ke;
    }

    public void setKe(Double _value_) {
        ke = _value_;
    }

    private static Object getKe(BaseClass _this_) {
        return ((ExcIEEEAC2A) _this_).getKe();
    }

    private static void setKe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC2A) _this_).setKe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC2A) _this_).setKe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Excitation control system stabilizer gains (K).  Typical Value = 0.03.
     */
    private Double kf; // PU

    public Double getKf() {
        return kf;
    }

    public void setKf(Double _value_) {
        kf = _value_;
    }

    private static Object getKf(BaseClass _this_) {
        return ((ExcIEEEAC2A) _this_).getKf();
    }

    private static void setKf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC2A) _this_).setKf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC2A) _this_).setKf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter field current feedback gain (K).  Typical Value = 1.
     */
    private Double kh; // PU

    public Double getKh() {
        return kh;
    }

    public void setKh(Double _value_) {
        kh = _value_;
    }

    private static Object getKh(BaseClass _this_) {
        return ((ExcIEEEAC2A) _this_).getKh();
    }

    private static void setKh(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC2A) _this_).setKh((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC2A) _this_).setKh(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, V, back of commutating reactance (S[V]).  Typical Value = 0.037.
     */
    private Double seve1; // Simple_Float

    public Double getSeve1() {
        return seve1;
    }

    public void setSeve1(Double _value_) {
        seve1 = _value_;
    }

    private static Object getSeve1(BaseClass _this_) {
        return ((ExcIEEEAC2A) _this_).getSeve1();
    }

    private static void setSeve1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC2A) _this_).setSeve1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC2A) _this_).setSeve1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, V, back of commutating reactance (S[V]).  Typical Value = 0.012.
     */
    private Double seve2; // Simple_Float

    public Double getSeve2() {
        return seve2;
    }

    public void setSeve2(Double _value_) {
        seve2 = _value_;
    }

    private static Object getSeve2(BaseClass _this_) {
        return ((ExcIEEEAC2A) _this_).getSeve2();
    }

    private static void setSeve2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC2A) _this_).setSeve2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC2A) _this_).setSeve2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (T).  Typical Value = 0.02.
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((ExcIEEEAC2A) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC2A) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC2A) _this_).setTa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (T).  Typical Value = 0.
     */
    private Double tb; // Seconds

    public Double getTb() {
        return tb;
    }

    public void setTb(Double _value_) {
        tb = _value_;
    }

    private static Object getTb(BaseClass _this_) {
        return ((ExcIEEEAC2A) _this_).getTb();
    }

    private static void setTb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC2A) _this_).setTb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC2A) _this_).setTb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (T).  Typical Value = 0.
     */
    private Double tc; // Seconds

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    private static Object getTc(BaseClass _this_) {
        return ((ExcIEEEAC2A) _this_).getTc();
    }

    private static void setTc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC2A) _this_).setTc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC2A) _this_).setTc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter time constant, integration rate associated with exciter control (T).  Typical Value = 0.6.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    private static Object getTe(BaseClass _this_) {
        return ((ExcIEEEAC2A) _this_).getTe();
    }

    private static void setTe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC2A) _this_).setTe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC2A) _this_).setTe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Excitation control system stabilizer time constant (T).  Typical Value = 1.
     */
    private Double tf; // Seconds

    public Double getTf() {
        return tf;
    }

    public void setTf(Double _value_) {
        tf = _value_;
    }

    private static Object getTf(BaseClass _this_) {
        return ((ExcIEEEAC2A) _this_).getTf();
    }

    private static void setTf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC2A) _this_).setTf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC2A) _this_).setTf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage regulator output (V).  Typical Value = 8.
     */
    private Double vamax; // PU

    public Double getVamax() {
        return vamax;
    }

    public void setVamax(Double _value_) {
        vamax = _value_;
    }

    private static Object getVamax(BaseClass _this_) {
        return ((ExcIEEEAC2A) _this_).getVamax();
    }

    private static void setVamax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC2A) _this_).setVamax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC2A) _this_).setVamax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator output (V).  Typical Value = -8.
     */
    private Double vamin; // PU

    public Double getVamin() {
        return vamin;
    }

    public void setVamin(Double _value_) {
        vamin = _value_;
    }

    private static Object getVamin(BaseClass _this_) {
        return ((ExcIEEEAC2A) _this_).getVamin();
    }

    private static void setVamin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC2A) _this_).setVamin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC2A) _this_).setVamin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (V).  Typical Value = 4.4.
     */
    private Double ve1; // PU

    public Double getVe1() {
        return ve1;
    }

    public void setVe1(Double _value_) {
        ve1 = _value_;
    }

    private static Object getVe1(BaseClass _this_) {
        return ((ExcIEEEAC2A) _this_).getVe1();
    }

    private static void setVe1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC2A) _this_).setVe1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC2A) _this_).setVe1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (V).  Typical Value = 3.3.
     */
    private Double ve2; // PU

    public Double getVe2() {
        return ve2;
    }

    public void setVe2(Double _value_) {
        ve2 = _value_;
    }

    private static Object getVe2(BaseClass _this_) {
        return ((ExcIEEEAC2A) _this_).getVe2();
    }

    private static void setVe2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC2A) _this_).setVe2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC2A) _this_).setVe2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter field current limit reference (V).  Typical Value = 4.4.
     */
    private Double vfemax; // PU

    public Double getVfemax() {
        return vfemax;
    }

    public void setVfemax(Double _value_) {
        vfemax = _value_;
    }

    private static Object getVfemax(BaseClass _this_) {
        return ((ExcIEEEAC2A) _this_).getVfemax();
    }

    private static void setVfemax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC2A) _this_).setVfemax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC2A) _this_).setVfemax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage regulator outputs (V).  Typical Value = 105.
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    private static Object getVrmax(BaseClass _this_) {
        return ((ExcIEEEAC2A) _this_).getVrmax();
    }

    private static void setVrmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC2A) _this_).setVrmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC2A) _this_).setVrmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator outputs (V).  Typical Value = -95.
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    private static Object getVrmin(BaseClass _this_) {
        return ((ExcIEEEAC2A) _this_).getVrmin();
    }

    private static void setVrmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC2A) _this_).setVrmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC2A) _this_).setVrmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcIEEEAC2A", attrName));
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
                "ExcIEEEAC2A", attrName, value));
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
            map.put("ka", new AttrDetails("ExcIEEEAC2A.ka", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC2A::getKa, ExcIEEEAC2A::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kb", new AttrDetails("ExcIEEEAC2A.kb", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC2A::getKb, ExcIEEEAC2A::setKb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("ExcIEEEAC2A.kc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC2A::getKc, ExcIEEEAC2A::setKc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("ExcIEEEAC2A.kd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC2A::getKd, ExcIEEEAC2A::setKd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcIEEEAC2A.ke", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC2A::getKe, ExcIEEEAC2A::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("ExcIEEEAC2A.kf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC2A::getKf, ExcIEEEAC2A::setKf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh", new AttrDetails("ExcIEEEAC2A.kh", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC2A::getKh, ExcIEEEAC2A::setKh));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve1", new AttrDetails("ExcIEEEAC2A.seve1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC2A::getSeve1, ExcIEEEAC2A::setSeve1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve2", new AttrDetails("ExcIEEEAC2A.seve2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC2A::getSeve2, ExcIEEEAC2A::setSeve2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("ExcIEEEAC2A.ta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC2A::getTa, ExcIEEEAC2A::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("ExcIEEEAC2A.tb", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC2A::getTb, ExcIEEEAC2A::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("ExcIEEEAC2A.tc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC2A::getTc, ExcIEEEAC2A::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcIEEEAC2A.te", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC2A::getTe, ExcIEEEAC2A::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("ExcIEEEAC2A.tf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC2A::getTf, ExcIEEEAC2A::setTf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vamax", new AttrDetails("ExcIEEEAC2A.vamax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC2A::getVamax, ExcIEEEAC2A::setVamax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vamin", new AttrDetails("ExcIEEEAC2A.vamin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC2A::getVamin, ExcIEEEAC2A::setVamin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve1", new AttrDetails("ExcIEEEAC2A.ve1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC2A::getVe1, ExcIEEEAC2A::setVe1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve2", new AttrDetails("ExcIEEEAC2A.ve2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC2A::getVe2, ExcIEEEAC2A::setVe2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vfemax", new AttrDetails("ExcIEEEAC2A.vfemax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC2A::getVfemax, ExcIEEEAC2A::setVfemax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcIEEEAC2A.vrmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC2A::getVrmax, ExcIEEEAC2A::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcIEEEAC2A.vrmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC2A::getVrmin, ExcIEEEAC2A::setVrmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcIEEEAC2A(null).allAttrDetailsMap());
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
