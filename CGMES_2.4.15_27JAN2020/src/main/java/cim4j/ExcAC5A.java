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
 * Modified IEEE AC5A alternator-supplied rectifier excitation system with different minimum controller output.
 */
@SuppressWarnings("unused")
public class ExcAC5A extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcAC5A.class);

    /**
     * Constructor.
     */
    public ExcAC5A(String rdfid) {
        super("ExcAC5A", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcAC5A(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Coefficient to allow different usage of the model (a).  Typical Value = 1.
     */
    private Double a; // Simple_Float

    public Double getA() {
        return a;
    }

    public void setA(Double _value_) {
        a = _value_;
    }

    private static Object getA(BaseClass _this_) {
        return ((ExcAC5A) _this_).getA();
    }

    private static void setA(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC5A) _this_).setA((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC5A) _this_).setA(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter voltage at which exciter saturation is defined (Efd1).  Typical Value = 5.6.
     */
    private Double efd1; // PU

    public Double getEfd1() {
        return efd1;
    }

    public void setEfd1(Double _value_) {
        efd1 = _value_;
    }

    private static Object getEfd1(BaseClass _this_) {
        return ((ExcAC5A) _this_).getEfd1();
    }

    private static void setEfd1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC5A) _this_).setEfd1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC5A) _this_).setEfd1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter voltage at which exciter saturation is defined (Efd2).  Typical Value = 4.2.
     */
    private Double efd2; // PU

    public Double getEfd2() {
        return efd2;
    }

    public void setEfd2(Double _value_) {
        efd2 = _value_;
    }

    private static Object getEfd2(BaseClass _this_) {
        return ((ExcAC5A) _this_).getEfd2();
    }

    private static void setEfd2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC5A) _this_).setEfd2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC5A) _this_).setEfd2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator gain (Ka).  Typical Value = 400.
     */
    private Double ka; // PU

    public Double getKa() {
        return ka;
    }

    public void setKa(Double _value_) {
        ka = _value_;
    }

    private static Object getKa(BaseClass _this_) {
        return ((ExcAC5A) _this_).getKa();
    }

    private static void setKa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC5A) _this_).setKa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC5A) _this_).setKa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter constant related to self-excited field (Ke).  Typical Value = 1.
     */
    private Double ke; // PU

    public Double getKe() {
        return ke;
    }

    public void setKe(Double _value_) {
        ke = _value_;
    }

    private static Object getKe(BaseClass _this_) {
        return ((ExcAC5A) _this_).getKe();
    }

    private static void setKe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC5A) _this_).setKe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC5A) _this_).setKe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Excitation control system stabilizer gains (Kf).  Typical Value = 0.03.
     */
    private Double kf; // PU

    public Double getKf() {
        return kf;
    }

    public void setKf(Double _value_) {
        kf = _value_;
    }

    private static Object getKf(BaseClass _this_) {
        return ((ExcAC5A) _this_).getKf();
    }

    private static void setKf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC5A) _this_).setKf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC5A) _this_).setKf(getDoubleFromString((String) _value_));
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
        return ((ExcAC5A) _this_).getKs();
    }

    private static void setKs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC5A) _this_).setKs((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC5A) _this_).setKs(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, Efd1 (S[Efd1]).  Typical Value = 0.86.
     */
    private Double seefd1; // Simple_Float

    public Double getSeefd1() {
        return seefd1;
    }

    public void setSeefd1(Double _value_) {
        seefd1 = _value_;
    }

    private static Object getSeefd1(BaseClass _this_) {
        return ((ExcAC5A) _this_).getSeefd1();
    }

    private static void setSeefd1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC5A) _this_).setSeefd1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC5A) _this_).setSeefd1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, Efd2 (S[Efd2]).  Typical Value = 0.5.
     */
    private Double seefd2; // Simple_Float

    public Double getSeefd2() {
        return seefd2;
    }

    public void setSeefd2(Double _value_) {
        seefd2 = _value_;
    }

    private static Object getSeefd2(BaseClass _this_) {
        return ((ExcAC5A) _this_).getSeefd2();
    }

    private static void setSeefd2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC5A) _this_).setSeefd2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC5A) _this_).setSeefd2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (Ta).  Typical Value = 0.02.
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((ExcAC5A) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC5A) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC5A) _this_).setTa(getDoubleFromString((String) _value_));
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
        return ((ExcAC5A) _this_).getTb();
    }

    private static void setTb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC5A) _this_).setTb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC5A) _this_).setTb(getDoubleFromString((String) _value_));
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
        return ((ExcAC5A) _this_).getTc();
    }

    private static void setTc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC5A) _this_).setTc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC5A) _this_).setTc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter time constant, integration rate associated with exciter control (Te).  Typical Value = 0.8.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    private static Object getTe(BaseClass _this_) {
        return ((ExcAC5A) _this_).getTe();
    }

    private static void setTe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC5A) _this_).setTe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC5A) _this_).setTe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Excitation control system stabilizer time constant (Tf1).  Typical Value  = 1.
     */
    private Double tf1; // Seconds

    public Double getTf1() {
        return tf1;
    }

    public void setTf1(Double _value_) {
        tf1 = _value_;
    }

    private static Object getTf1(BaseClass _this_) {
        return ((ExcAC5A) _this_).getTf1();
    }

    private static void setTf1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC5A) _this_).setTf1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC5A) _this_).setTf1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Excitation control system stabilizer time constant (Tf2).  Typical Value = 0.8.
     */
    private Double tf2; // Seconds

    public Double getTf2() {
        return tf2;
    }

    public void setTf2(Double _value_) {
        tf2 = _value_;
    }

    private static Object getTf2(BaseClass _this_) {
        return ((ExcAC5A) _this_).getTf2();
    }

    private static void setTf2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC5A) _this_).setTf2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC5A) _this_).setTf2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Excitation control system stabilizer time constant (Tf3).  Typical Value = 0.
     */
    private Double tf3; // Seconds

    public Double getTf3() {
        return tf3;
    }

    public void setTf3(Double _value_) {
        tf3 = _value_;
    }

    private static Object getTf3(BaseClass _this_) {
        return ((ExcAC5A) _this_).getTf3();
    }

    private static void setTf3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC5A) _this_).setTf3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC5A) _this_).setTf3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage regulator output (Vrmax).  Typical Value = 7.3.
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    private static Object getVrmax(BaseClass _this_) {
        return ((ExcAC5A) _this_).getVrmax();
    }

    private static void setVrmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC5A) _this_).setVrmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC5A) _this_).setVrmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator output (Vrmin).  Typical Value =-7.3.
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    private static Object getVrmin(BaseClass _this_) {
        return ((ExcAC5A) _this_).getVrmin();
    }

    private static void setVrmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC5A) _this_).setVrmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC5A) _this_).setVrmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcAC5A", attrName));
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
                "ExcAC5A", attrName, value));
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
            map.put("a", new AttrDetails("ExcAC5A.a", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC5A::getA, ExcAC5A::setA));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efd1", new AttrDetails("ExcAC5A.efd1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC5A::getEfd1, ExcAC5A::setEfd1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efd2", new AttrDetails("ExcAC5A.efd2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC5A::getEfd2, ExcAC5A::setEfd2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("ExcAC5A.ka", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC5A::getKa, ExcAC5A::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcAC5A.ke", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC5A::getKe, ExcAC5A::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("ExcAC5A.kf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC5A::getKf, ExcAC5A::setKf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks", new AttrDetails("ExcAC5A.ks", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC5A::getKs, ExcAC5A::setKs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seefd1", new AttrDetails("ExcAC5A.seefd1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC5A::getSeefd1, ExcAC5A::setSeefd1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seefd2", new AttrDetails("ExcAC5A.seefd2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC5A::getSeefd2, ExcAC5A::setSeefd2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("ExcAC5A.ta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC5A::getTa, ExcAC5A::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("ExcAC5A.tb", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC5A::getTb, ExcAC5A::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("ExcAC5A.tc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC5A::getTc, ExcAC5A::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcAC5A.te", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC5A::getTe, ExcAC5A::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf1", new AttrDetails("ExcAC5A.tf1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC5A::getTf1, ExcAC5A::setTf1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf2", new AttrDetails("ExcAC5A.tf2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC5A::getTf2, ExcAC5A::setTf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf3", new AttrDetails("ExcAC5A.tf3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC5A::getTf3, ExcAC5A::setTf3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcAC5A.vrmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC5A::getVrmax, ExcAC5A::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcAC5A.vrmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC5A::getVrmin, ExcAC5A::setVrmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcAC5A(null).allAttrDetailsMap());
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
