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
 * IEEE 421.5-2005 type AC8B model. This model represents a PID voltage regulator with either a brushless exciter or DC exciter. The AVR in this model consists of PID control, with separate constants for the proportional (<i>K</i><i><sub>PR</sub></i>), integral (<i>K</i><i><sub>IR</sub></i>), and derivative (<i>K</i><i><sub>DR</sub></i>) gains. The representation of the brushless exciter (<i>T</i><i><sub>E</sub></i>, <i>K</i><i><sub>E</sub></i>, <i>S</i><i><sub>E</sub></i>, <i>K</i><i><sub>C</sub></i>, <i>K</i><i><sub>D</sub></i>) is similar to the model type AC2A. The type AC8B model can be used to represent static voltage regulators applied to brushless excitation systems. Digitally based voltage regulators feeding DC rotating main exciters can be represented with the AC type AC8B model with the parameters <i>K</i><i><sub>C</sub></i> and <i>K</i><i><sub>D</sub></i> set to 0.  For thyristor power stages fed from the generator terminals, the limits <i>V</i><i><sub>RMAX</sub></i> and <i>V</i><i><sub>RMIN</sub></i><i> </i>should be a function of terminal voltage: V<i><sub>T</sub></i> x <i>V</i><i><sub>RMAX</sub></i><sub> </sub>and <i>V</i><i><sub>T</sub></i> x <i>V</i><i><sub>RMIN</sub></i>. Reference: IEEE 421.5-2005, 6.8.
 */
@SuppressWarnings("unused")
public class ExcIEEEAC8B extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcIEEEAC8B.class);

    /**
     * Constructor.
     */
    public ExcIEEEAC8B(String rdfid) {
        super("ExcIEEEAC8B", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcIEEEAC8B(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Voltage regulator gain (<i>K</i><i><sub>A</sub></i>) (&gt; 0).  Typical value = 1.
     */
    private Double ka; // PU

    public Double getKa() {
        return ka;
    }

    public void setKa(Double _value_) {
        ka = _value_;
    }

    private static Object getKa(BaseClass _this_) {
        return ((ExcIEEEAC8B) _this_).getKa();
    }

    private static void setKa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC8B) _this_).setKa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC8B) _this_).setKa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rectifier loading factor proportional to commutating reactance (<i>K</i><i><sub>C</sub></i>) (&gt;= 0). Typical value = 0,55.
     */
    private Double kc; // PU

    public Double getKc() {
        return kc;
    }

    public void setKc(Double _value_) {
        kc = _value_;
    }

    private static Object getKc(BaseClass _this_) {
        return ((ExcIEEEAC8B) _this_).getKc();
    }

    private static void setKc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC8B) _this_).setKc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC8B) _this_).setKc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Demagnetizing factor, a function of exciter alternator reactances (<i>K</i><i><sub>D</sub></i>) (&gt;= 0).  Typical value = 1,1.
     */
    private Double kd; // PU

    public Double getKd() {
        return kd;
    }

    public void setKd(Double _value_) {
        kd = _value_;
    }

    private static Object getKd(BaseClass _this_) {
        return ((ExcIEEEAC8B) _this_).getKd();
    }

    private static void setKd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC8B) _this_).setKd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC8B) _this_).setKd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator derivative gain (<i>K</i><i><sub>DR</sub></i>) (&gt;= 0).  Typical value = 10.
     */
    private Double kdr; // PU

    public Double getKdr() {
        return kdr;
    }

    public void setKdr(Double _value_) {
        kdr = _value_;
    }

    private static Object getKdr(BaseClass _this_) {
        return ((ExcIEEEAC8B) _this_).getKdr();
    }

    private static void setKdr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC8B) _this_).setKdr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC8B) _this_).setKdr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter constant related to self-excited field (<i>K</i><i><sub>E</sub></i>).  Typical value = 1.
     */
    private Double ke; // PU

    public Double getKe() {
        return ke;
    }

    public void setKe(Double _value_) {
        ke = _value_;
    }

    private static Object getKe(BaseClass _this_) {
        return ((ExcIEEEAC8B) _this_).getKe();
    }

    private static void setKe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC8B) _this_).setKe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC8B) _this_).setKe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator integral gain (<i>K</i><i><sub>IR</sub></i>) (&gt;= 0).  Typical value = 5.
     */
    private Double kir; // PU

    public Double getKir() {
        return kir;
    }

    public void setKir(Double _value_) {
        kir = _value_;
    }

    private static Object getKir(BaseClass _this_) {
        return ((ExcIEEEAC8B) _this_).getKir();
    }

    private static void setKir(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC8B) _this_).setKir((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC8B) _this_).setKir(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator proportional gain (<i>K</i><i><sub>PR</sub></i>) (&gt; 0 if ExcIEEEAC8B.kir = 0).  Typical value = 80.
     */
    private Double kpr; // PU

    public Double getKpr() {
        return kpr;
    }

    public void setKpr(Double _value_) {
        kpr = _value_;
    }

    private static Object getKpr(BaseClass _this_) {
        return ((ExcIEEEAC8B) _this_).getKpr();
    }

    private static void setKpr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC8B) _this_).setKpr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC8B) _this_).setKpr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, <i>V</i><i><sub>E1</sub></i>, back of commutating reactance (<i>S</i><i><sub>E</sub></i><i>[V</i><i><sub>E1</sub></i><i>]</i>) (&gt;= 0).  Typical value = 0,3.
     */
    private Float seve1; // Float

    public Float getSeve1() {
        return seve1;
    }

    public void setSeve1(Float _value_) {
        seve1 = _value_;
    }

    private static Object getSeve1(BaseClass _this_) {
        return ((ExcIEEEAC8B) _this_).getSeve1();
    }

    private static void setSeve1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExcIEEEAC8B) _this_).setSeve1((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC8B) _this_).setSeve1(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, <i>V</i><i><sub>E2</sub></i>, back of commutating reactance (<i>S</i><i><sub>E</sub></i><i>[V</i><i><sub>E2</sub></i><i>]</i>) (&gt;= 0).  Typical value = 3.
     */
    private Float seve2; // Float

    public Float getSeve2() {
        return seve2;
    }

    public void setSeve2(Float _value_) {
        seve2 = _value_;
    }

    private static Object getSeve2(BaseClass _this_) {
        return ((ExcIEEEAC8B) _this_).getSeve2();
    }

    private static void setSeve2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExcIEEEAC8B) _this_).setSeve2((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC8B) _this_).setSeve2(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Voltage regulator time constant (<i>T</i><i><sub>A</sub></i>) (&gt;= 0).  Typical value = 0.
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((ExcIEEEAC8B) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC8B) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC8B) _this_).setTa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lag time constant (<i>T</i><i><sub>DR</sub></i>) (&gt; 0).  Typical value = 0,1.
     */
    private Double tdr; // Seconds

    public Double getTdr() {
        return tdr;
    }

    public void setTdr(Double _value_) {
        tdr = _value_;
    }

    private static Object getTdr(BaseClass _this_) {
        return ((ExcIEEEAC8B) _this_).getTdr();
    }

    private static void setTdr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC8B) _this_).setTdr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC8B) _this_).setTdr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter time constant, integration rate associated with exciter control (<i>T</i><i><sub>E</sub></i>) (&gt; 0).  Typical value = 1,2.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    private static Object getTe(BaseClass _this_) {
        return ((ExcIEEEAC8B) _this_).getTe();
    }

    private static void setTe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC8B) _this_).setTe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC8B) _this_).setTe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (<i>V</i><i><sub>E1</sub></i>) (&gt; 0).  Typical value = 6,5.
     */
    private Double ve1; // PU

    public Double getVe1() {
        return ve1;
    }

    public void setVe1(Double _value_) {
        ve1 = _value_;
    }

    private static Object getVe1(BaseClass _this_) {
        return ((ExcIEEEAC8B) _this_).getVe1();
    }

    private static void setVe1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC8B) _this_).setVe1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC8B) _this_).setVe1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (<i>V</i><i><sub>E2</sub></i>) (&gt; 0).  Typical value = 9.
     */
    private Double ve2; // PU

    public Double getVe2() {
        return ve2;
    }

    public void setVe2(Double _value_) {
        ve2 = _value_;
    }

    private static Object getVe2(BaseClass _this_) {
        return ((ExcIEEEAC8B) _this_).getVe2();
    }

    private static void setVe2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC8B) _this_).setVe2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC8B) _this_).setVe2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum exciter voltage output (<i>V</i><i><sub>EMIN</sub></i>) (&lt;= 0).  Typical value = 0.
     */
    private Double vemin; // PU

    public Double getVemin() {
        return vemin;
    }

    public void setVemin(Double _value_) {
        vemin = _value_;
    }

    private static Object getVemin(BaseClass _this_) {
        return ((ExcIEEEAC8B) _this_).getVemin();
    }

    private static void setVemin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC8B) _this_).setVemin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC8B) _this_).setVemin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter field current limit reference (<i>V</i><i><sub>FEMAX</sub></i>).  Typical value = 6.
     */
    private Double vfemax; // PU

    public Double getVfemax() {
        return vfemax;
    }

    public void setVfemax(Double _value_) {
        vfemax = _value_;
    }

    private static Object getVfemax(BaseClass _this_) {
        return ((ExcIEEEAC8B) _this_).getVfemax();
    }

    private static void setVfemax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC8B) _this_).setVfemax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC8B) _this_).setVfemax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage regulator output (<i>V</i><i><sub>RMAX</sub></i>) (&gt; 0).  Typical value = 35.
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    private static Object getVrmax(BaseClass _this_) {
        return ((ExcIEEEAC8B) _this_).getVrmax();
    }

    private static void setVrmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC8B) _this_).setVrmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC8B) _this_).setVrmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator output (<i>V</i><i><sub>RMIN</sub></i>) (&lt;= 0).  Typical value = 0.
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    private static Object getVrmin(BaseClass _this_) {
        return ((ExcIEEEAC8B) _this_).getVrmin();
    }

    private static void setVrmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC8B) _this_).setVrmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC8B) _this_).setVrmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcIEEEAC8B", attrName));
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
                "ExcIEEEAC8B", attrName, value));
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
            map.put("ka", new AttrDetails("ExcIEEEAC8B.ka", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC8B::getKa, ExcIEEEAC8B::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("ExcIEEEAC8B.kc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC8B::getKc, ExcIEEEAC8B::setKc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("ExcIEEEAC8B.kd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC8B::getKd, ExcIEEEAC8B::setKd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kdr", new AttrDetails("ExcIEEEAC8B.kdr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC8B::getKdr, ExcIEEEAC8B::setKdr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcIEEEAC8B.ke", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC8B::getKe, ExcIEEEAC8B::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kir", new AttrDetails("ExcIEEEAC8B.kir", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC8B::getKir, ExcIEEEAC8B::setKir));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpr", new AttrDetails("ExcIEEEAC8B.kpr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC8B::getKpr, ExcIEEEAC8B::setKpr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve1", new AttrDetails("ExcIEEEAC8B.seve1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC8B::getSeve1, ExcIEEEAC8B::setSeve1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve2", new AttrDetails("ExcIEEEAC8B.seve2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC8B::getSeve2, ExcIEEEAC8B::setSeve2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("ExcIEEEAC8B.ta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC8B::getTa, ExcIEEEAC8B::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tdr", new AttrDetails("ExcIEEEAC8B.tdr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC8B::getTdr, ExcIEEEAC8B::setTdr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcIEEEAC8B.te", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC8B::getTe, ExcIEEEAC8B::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve1", new AttrDetails("ExcIEEEAC8B.ve1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC8B::getVe1, ExcIEEEAC8B::setVe1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve2", new AttrDetails("ExcIEEEAC8B.ve2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC8B::getVe2, ExcIEEEAC8B::setVe2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vemin", new AttrDetails("ExcIEEEAC8B.vemin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC8B::getVemin, ExcIEEEAC8B::setVemin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vfemax", new AttrDetails("ExcIEEEAC8B.vfemax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC8B::getVfemax, ExcIEEEAC8B::setVfemax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcIEEEAC8B.vrmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC8B::getVrmax, ExcIEEEAC8B::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcIEEEAC8B.vrmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC8B::getVrmin, ExcIEEEAC8B::setVrmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcIEEEAC8B(null).allAttrDetailsMap());
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
