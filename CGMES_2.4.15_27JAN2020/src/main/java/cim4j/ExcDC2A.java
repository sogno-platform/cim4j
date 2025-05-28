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
 * Modified IEEE DC2A direct current commutator exciters with speed input, one more leg block in feedback loop and without underexcitation limiters (UEL) inputs.  DC type 2 excitation system model with added speed multiplier, added lead-lag, and voltage-dependent limits.
 */
@SuppressWarnings("unused")
public class ExcDC2A extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcDC2A.class);

    /**
     * Constructor.
     */
    public ExcDC2A(String rdfid) {
        super("ExcDC2A", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcDC2A(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Exciter voltage at which exciter saturation is defined (Efd1).  Typical Value = 3.05.
     */
    private Double efd1; // PU

    public Double getEfd1() {
        return efd1;
    }

    public void setEfd1(Double _value_) {
        efd1 = _value_;
    }

    private static Object getEfd1(BaseClass _this_) {
        return ((ExcDC2A) _this_).getEfd1();
    }

    private static void setEfd1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC2A) _this_).setEfd1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC2A) _this_).setEfd1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter voltage at which exciter saturation is defined (Efd2).  Typical Value = 2.29.
     */
    private Double efd2; // PU

    public Double getEfd2() {
        return efd2;
    }

    public void setEfd2(Double _value_) {
        efd2 = _value_;
    }

    private static Object getEfd2(BaseClass _this_) {
        return ((ExcDC2A) _this_).getEfd2();
    }

    private static void setEfd2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC2A) _this_).setEfd2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC2A) _this_).setEfd2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * (exclim).  IEEE standard is ambiguous about lower limit on exciter output. true = a lower limit of zero is applied to integrator output false = a lower limit of zero is not applied to integrator output. Typical Value = true.
     */
    private Boolean exclim; // Boolean

    public Boolean getExclim() {
        return exclim;
    }

    public void setExclim(Boolean _value_) {
        exclim = _value_;
    }

    private static Object getExclim(BaseClass _this_) {
        return ((ExcDC2A) _this_).getExclim();
    }

    private static void setExclim(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ExcDC2A) _this_).setExclim((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC2A) _this_).setExclim(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Voltage regulator gain (Ka).  Typical Value = 300.
     */
    private Double ka; // PU

    public Double getKa() {
        return ka;
    }

    public void setKa(Double _value_) {
        ka = _value_;
    }

    private static Object getKa(BaseClass _this_) {
        return ((ExcDC2A) _this_).getKa();
    }

    private static void setKa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC2A) _this_).setKa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC2A) _this_).setKa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter constant related to self-excited field (Ke).  If Ke is entered as zero, the model calculates an effective value of Ke such that the initial condition value of Vr is zero. The zero value of Ke is not changed.  If Ke is entered as non-zero, its value is used directly, without change.  Typical Value = 1.
     */
    private Double ke; // PU

    public Double getKe() {
        return ke;
    }

    public void setKe(Double _value_) {
        ke = _value_;
    }

    private static Object getKe(BaseClass _this_) {
        return ((ExcDC2A) _this_).getKe();
    }

    private static void setKe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC2A) _this_).setKe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC2A) _this_).setKe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Excitation control system stabilizer gain (Kf).  Typical Value = 0.1.
     */
    private Double kf; // PU

    public Double getKf() {
        return kf;
    }

    public void setKf(Double _value_) {
        kf = _value_;
    }

    private static Object getKf(BaseClass _this_) {
        return ((ExcDC2A) _this_).getKf();
    }

    private static void setKf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC2A) _this_).setKf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC2A) _this_).setKf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Coefficient to allow different usage of the model-speed coefficient (Ks).  Typical Value = 0.
     */
    private Double ks; // PU

    public Double getKs() {
        return ks;
    }

    public void setKs(Double _value_) {
        ks = _value_;
    }

    private static Object getKs(BaseClass _this_) {
        return ((ExcDC2A) _this_).getKs();
    }

    private static void setKs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC2A) _this_).setKs((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC2A) _this_).setKs(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, Efd1 (Se[Eefd1]).  Typical Value = 0.279.
     */
    private Double seefd1; // Simple_Float

    public Double getSeefd1() {
        return seefd1;
    }

    public void setSeefd1(Double _value_) {
        seefd1 = _value_;
    }

    private static Object getSeefd1(BaseClass _this_) {
        return ((ExcDC2A) _this_).getSeefd1();
    }

    private static void setSeefd1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC2A) _this_).setSeefd1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC2A) _this_).setSeefd1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, Efd2 (Se[Efd2]).  Typical Value = 0.117.
     */
    private Double seefd2; // Simple_Float

    public Double getSeefd2() {
        return seefd2;
    }

    public void setSeefd2(Double _value_) {
        seefd2 = _value_;
    }

    private static Object getSeefd2(BaseClass _this_) {
        return ((ExcDC2A) _this_).getSeefd2();
    }

    private static void setSeefd2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC2A) _this_).setSeefd2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC2A) _this_).setSeefd2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (Ta).  Typical Value = 0.01.
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((ExcDC2A) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC2A) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC2A) _this_).setTa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (Tb).  Typical Value = 0.
     */
    private Double tb; // Seconds

    public Double getTb() {
        return tb;
    }

    public void setTb(Double _value_) {
        tb = _value_;
    }

    private static Object getTb(BaseClass _this_) {
        return ((ExcDC2A) _this_).getTb();
    }

    private static void setTb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC2A) _this_).setTb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC2A) _this_).setTb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (Tc).  Typical Value = 0.
     */
    private Double tc; // Seconds

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    private static Object getTc(BaseClass _this_) {
        return ((ExcDC2A) _this_).getTc();
    }

    private static void setTc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC2A) _this_).setTc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC2A) _this_).setTc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter time constant, integration rate associated with exciter control (Te).  Typical Value = 1.33.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    private static Object getTe(BaseClass _this_) {
        return ((ExcDC2A) _this_).getTe();
    }

    private static void setTe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC2A) _this_).setTe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC2A) _this_).setTe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Excitation control system stabilizer time constant (Tf).  Typical Value = 0.675.
     */
    private Double tf; // Seconds

    public Double getTf() {
        return tf;
    }

    public void setTf(Double _value_) {
        tf = _value_;
    }

    private static Object getTf(BaseClass _this_) {
        return ((ExcDC2A) _this_).getTf();
    }

    private static void setTf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC2A) _this_).setTf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC2A) _this_).setTf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Excitation control system stabilizer time constant (Tf1).  Typical Value = 0.
     */
    private Double tf1; // Seconds

    public Double getTf1() {
        return tf1;
    }

    public void setTf1(Double _value_) {
        tf1 = _value_;
    }

    private static Object getTf1(BaseClass _this_) {
        return ((ExcDC2A) _this_).getTf1();
    }

    private static void setTf1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC2A) _this_).setTf1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC2A) _this_).setTf1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage regulator output (Vrmax).  Typical Value = 4.95.
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    private static Object getVrmax(BaseClass _this_) {
        return ((ExcDC2A) _this_).getVrmax();
    }

    private static void setVrmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC2A) _this_).setVrmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC2A) _this_).setVrmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator output (Vrmin).  Typical Value = -4.9.
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    private static Object getVrmin(BaseClass _this_) {
        return ((ExcDC2A) _this_).getVrmin();
    }

    private static void setVrmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC2A) _this_).setVrmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC2A) _this_).setVrmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * (Vtlim). true = limiter at the block [Ka/(1+sTa)] is dependent on Vt  false = limiter at the block is not dependent on Vt. Typical Value = true.
     */
    private Boolean vtlim; // Boolean

    public Boolean getVtlim() {
        return vtlim;
    }

    public void setVtlim(Boolean _value_) {
        vtlim = _value_;
    }

    private static Object getVtlim(BaseClass _this_) {
        return ((ExcDC2A) _this_).getVtlim();
    }

    private static void setVtlim(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ExcDC2A) _this_).setVtlim((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC2A) _this_).setVtlim(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcDC2A", attrName));
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
                "ExcDC2A", attrName, value));
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
            map.put("efd1", new AttrDetails("ExcDC2A.efd1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC2A::getEfd1, ExcDC2A::setEfd1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efd2", new AttrDetails("ExcDC2A.efd2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC2A::getEfd2, ExcDC2A::setEfd2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("exclim", new AttrDetails("ExcDC2A.exclim", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC2A::getExclim, ExcDC2A::setExclim));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("ExcDC2A.ka", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC2A::getKa, ExcDC2A::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcDC2A.ke", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC2A::getKe, ExcDC2A::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("ExcDC2A.kf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC2A::getKf, ExcDC2A::setKf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks", new AttrDetails("ExcDC2A.ks", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC2A::getKs, ExcDC2A::setKs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seefd1", new AttrDetails("ExcDC2A.seefd1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC2A::getSeefd1, ExcDC2A::setSeefd1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seefd2", new AttrDetails("ExcDC2A.seefd2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC2A::getSeefd2, ExcDC2A::setSeefd2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("ExcDC2A.ta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC2A::getTa, ExcDC2A::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("ExcDC2A.tb", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC2A::getTb, ExcDC2A::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("ExcDC2A.tc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC2A::getTc, ExcDC2A::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcDC2A.te", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC2A::getTe, ExcDC2A::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("ExcDC2A.tf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC2A::getTf, ExcDC2A::setTf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf1", new AttrDetails("ExcDC2A.tf1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC2A::getTf1, ExcDC2A::setTf1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcDC2A.vrmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC2A::getVrmax, ExcDC2A::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcDC2A.vrmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC2A::getVrmin, ExcDC2A::setVrmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vtlim", new AttrDetails("ExcDC2A.vtlim", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC2A::getVtlim, ExcDC2A::setVtlim));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcDC2A(null).allAttrDetailsMap());
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
