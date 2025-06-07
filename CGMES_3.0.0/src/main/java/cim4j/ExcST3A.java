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
 * Modified IEEE ST3A static excitation system with added speed multiplier.
 */
@SuppressWarnings("unused")
public class ExcST3A extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcST3A.class);

    /**
     * Constructor.
     */
    public ExcST3A(String rdfid) {
        super("ExcST3A", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcST3A(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Maximum AVR output (<i>Efdmax</i>) (&gt;= 0).  Typical value = 6,9.
     */
    private Double efdmax; // PU

    public Double getEfdmax() {
        return efdmax;
    }

    public void setEfdmax(Double _value_) {
        efdmax = _value_;
    }

    private static Object getEfdmax(BaseClass _this_) {
        return ((ExcST3A) _this_).getEfdmax();
    }

    private static void setEfdmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST3A) _this_).setEfdmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST3A) _this_).setEfdmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rectifier loading factor proportional to commutating reactance (<i>Kc</i>) (&gt;= 0). Typical value = 1,1.
     */
    private Double kc; // PU

    public Double getKc() {
        return kc;
    }

    public void setKc(Double _value_) {
        kc = _value_;
    }

    private static Object getKc(BaseClass _this_) {
        return ((ExcST3A) _this_).getKc();
    }

    private static void setKc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST3A) _this_).setKc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST3A) _this_).setKc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Feedback gain constant of the inner loop field regulator (<i>Kg</i>) (&gt;= 0).  Typical value = 1.
     */
    private Double kg; // PU

    public Double getKg() {
        return kg;
    }

    public void setKg(Double _value_) {
        kg = _value_;
    }

    private static Object getKg(BaseClass _this_) {
        return ((ExcST3A) _this_).getKg();
    }

    private static void setKg(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST3A) _this_).setKg((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST3A) _this_).setKg(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Potential circuit gain coefficient (<i>K</i><i><sub>i</sub></i>) (&gt;= 0).  Typical value = 4,83.
     */
    private Double ki; // PU

    public Double getKi() {
        return ki;
    }

    public void setKi(Double _value_) {
        ki = _value_;
    }

    private static Object getKi(BaseClass _this_) {
        return ((ExcST3A) _this_).getKi();
    }

    private static void setKi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST3A) _this_).setKi((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST3A) _this_).setKi(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * AVR gain (<i>Kj</i>) (&gt; 0).  Typical value = 200.
     */
    private Double kj; // PU

    public Double getKj() {
        return kj;
    }

    public void setKj(Double _value_) {
        kj = _value_;
    }

    private static Object getKj(BaseClass _this_) {
        return ((ExcST3A) _this_).getKj();
    }

    private static void setKj(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST3A) _this_).setKj((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST3A) _this_).setKj(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Forward gain constant of the inner loop field regulator (<i>Km</i>) (&gt; 0).  Typical value = 7,04.
     */
    private Double km; // PU

    public Double getKm() {
        return km;
    }

    public void setKm(Double _value_) {
        km = _value_;
    }

    private static Object getKm(BaseClass _this_) {
        return ((ExcST3A) _this_).getKm();
    }

    private static void setKm(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST3A) _this_).setKm((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST3A) _this_).setKm(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Potential source gain (<i>K</i><i><sub>p</sub></i>) (&gt; 0).  Typical value = 4,37.
     */
    private Double kp; // PU

    public Double getKp() {
        return kp;
    }

    public void setKp(Double _value_) {
        kp = _value_;
    }

    private static Object getKp(BaseClass _this_) {
        return ((ExcST3A) _this_).getKp();
    }

    private static void setKp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST3A) _this_).setKp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST3A) _this_).setKp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Coefficient to allow different usage of the model-speed coefficient (<i>Ks</i>).  Typical value = 0.
     */
    private Double ks; // PU

    public Double getKs() {
        return ks;
    }

    public void setKs(Double _value_) {
        ks = _value_;
    }

    private static Object getKs(BaseClass _this_) {
        return ((ExcST3A) _this_).getKs();
    }

    private static void setKs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST3A) _this_).setKs((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST3A) _this_).setKs(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Coefficient to allow different usage of the model-speed coefficient (<i>Ks1</i>).  Typical value = 0.
     */
    private Double ks1; // PU

    public Double getKs1() {
        return ks1;
    }

    public void setKs1(Double _value_) {
        ks1 = _value_;
    }

    private static Object getKs1(BaseClass _this_) {
        return ((ExcST3A) _this_).getKs1();
    }

    private static void setKs1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST3A) _this_).setKs1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST3A) _this_).setKs1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (<i>Tb</i>) (&gt;= 0).  Typical value = 6,67.
     */
    private Double tb; // Seconds

    public Double getTb() {
        return tb;
    }

    public void setTb(Double _value_) {
        tb = _value_;
    }

    private static Object getTb(BaseClass _this_) {
        return ((ExcST3A) _this_).getTb();
    }

    private static void setTb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST3A) _this_).setTb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST3A) _this_).setTb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (<i>Tc</i>) (&gt;= 0).  Typical value = 1.
     */
    private Double tc; // Seconds

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    private static Object getTc(BaseClass _this_) {
        return ((ExcST3A) _this_).getTc();
    }

    private static void setTc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST3A) _this_).setTc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST3A) _this_).setTc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Potential circuit phase angle (<i>theta</i><i><sub>p</sub></i>).  Typical value = 20.
     */
    private Double thetap; // AngleDegrees

    public Double getThetap() {
        return thetap;
    }

    public void setThetap(Double _value_) {
        thetap = _value_;
    }

    private static Object getThetap(BaseClass _this_) {
        return ((ExcST3A) _this_).getThetap();
    }

    private static void setThetap(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST3A) _this_).setThetap((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST3A) _this_).setThetap(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Forward time constant of inner loop field regulator (<i>Tm</i>) (&gt; 0).  Typical value = 1.
     */
    private Double tm; // Seconds

    public Double getTm() {
        return tm;
    }

    public void setTm(Double _value_) {
        tm = _value_;
    }

    private static Object getTm(BaseClass _this_) {
        return ((ExcST3A) _this_).getTm();
    }

    private static void setTm(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST3A) _this_).setTm((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST3A) _this_).setTm(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum excitation voltage (<i>Vbmax</i>) (&gt; 0).  Typical value = 8,63.
     */
    private Double vbmax; // PU

    public Double getVbmax() {
        return vbmax;
    }

    public void setVbmax(Double _value_) {
        vbmax = _value_;
    }

    private static Object getVbmax(BaseClass _this_) {
        return ((ExcST3A) _this_).getVbmax();
    }

    private static void setVbmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST3A) _this_).setVbmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST3A) _this_).setVbmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum inner loop feedback voltage (<i>Vgmax</i>) (&gt;= 0).  Typical value = 6,53.
     */
    private Double vgmax; // PU

    public Double getVgmax() {
        return vgmax;
    }

    public void setVgmax(Double _value_) {
        vgmax = _value_;
    }

    private static Object getVgmax(BaseClass _this_) {
        return ((ExcST3A) _this_).getVgmax();
    }

    private static void setVgmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST3A) _this_).setVgmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST3A) _this_).setVgmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage regulator input limit (<i>Vimax</i>) (&gt; 0).  Typical value = 0,2.
     */
    private Double vimax; // PU

    public Double getVimax() {
        return vimax;
    }

    public void setVimax(Double _value_) {
        vimax = _value_;
    }

    private static Object getVimax(BaseClass _this_) {
        return ((ExcST3A) _this_).getVimax();
    }

    private static void setVimax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST3A) _this_).setVimax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST3A) _this_).setVimax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator input limit (<i>Vimin</i>) (&lt; 0).  Typical value = -0,2.
     */
    private Double vimin; // PU

    public Double getVimin() {
        return vimin;
    }

    public void setVimin(Double _value_) {
        vimin = _value_;
    }

    private static Object getVimin(BaseClass _this_) {
        return ((ExcST3A) _this_).getVimin();
    }

    private static void setVimin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST3A) _this_).setVimin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST3A) _this_).setVimin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage regulator output (<i>Vrmax</i>) (&gt; 0).  Typical value = 1.
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    private static Object getVrmax(BaseClass _this_) {
        return ((ExcST3A) _this_).getVrmax();
    }

    private static void setVrmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST3A) _this_).setVrmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST3A) _this_).setVrmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator output (<i>Vrmin</i>) (&lt; 0).  Typical value = -1.
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    private static Object getVrmin(BaseClass _this_) {
        return ((ExcST3A) _this_).getVrmin();
    }

    private static void setVrmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST3A) _this_).setVrmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST3A) _this_).setVrmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactance associated with potential source (<i>Xl</i>) (&gt;= 0).  Typical value = 0,09.
     */
    private Double xl; // PU

    public Double getXl() {
        return xl;
    }

    public void setXl(Double _value_) {
        xl = _value_;
    }

    private static Object getXl(BaseClass _this_) {
        return ((ExcST3A) _this_).getXl();
    }

    private static void setXl(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST3A) _this_).setXl((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST3A) _this_).setXl(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcST3A", attrName));
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
                "ExcST3A", attrName, value));
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
            map.put("efdmax", new AttrDetails("ExcST3A.efdmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST3A::getEfdmax, ExcST3A::setEfdmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("ExcST3A.kc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST3A::getKc, ExcST3A::setKc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kg", new AttrDetails("ExcST3A.kg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST3A::getKg, ExcST3A::setKg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("ExcST3A.ki", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST3A::getKi, ExcST3A::setKi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kj", new AttrDetails("ExcST3A.kj", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST3A::getKj, ExcST3A::setKj));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("km", new AttrDetails("ExcST3A.km", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST3A::getKm, ExcST3A::setKm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("ExcST3A.kp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST3A::getKp, ExcST3A::setKp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks", new AttrDetails("ExcST3A.ks", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST3A::getKs, ExcST3A::setKs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks1", new AttrDetails("ExcST3A.ks1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST3A::getKs1, ExcST3A::setKs1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("ExcST3A.tb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST3A::getTb, ExcST3A::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("ExcST3A.tc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST3A::getTc, ExcST3A::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("thetap", new AttrDetails("ExcST3A.thetap", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST3A::getThetap, ExcST3A::setThetap));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tm", new AttrDetails("ExcST3A.tm", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST3A::getTm, ExcST3A::setTm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vbmax", new AttrDetails("ExcST3A.vbmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST3A::getVbmax, ExcST3A::setVbmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vgmax", new AttrDetails("ExcST3A.vgmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST3A::getVgmax, ExcST3A::setVgmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimax", new AttrDetails("ExcST3A.vimax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST3A::getVimax, ExcST3A::setVimax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimin", new AttrDetails("ExcST3A.vimin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST3A::getVimin, ExcST3A::setVimin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcST3A.vrmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST3A::getVrmax, ExcST3A::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcST3A.vrmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST3A::getVrmin, ExcST3A::setVrmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xl", new AttrDetails("ExcST3A.xl", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST3A::getXl, ExcST3A::setXl));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcST3A(null).allAttrDetailsMap());
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
