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
 * IEEE 421.5-2005 type AC6A model. The model represents field-controlled alternator-rectifier excitation systems with system-supplied electronic voltage regulators.  The maximum output of the regulator, <i>V</i><i><sub>R</sub></i>, is a function of terminal voltage, <i>V</i><i><sub>T</sub></i>. The field current limiter included in the original model AC6A remains in the 2005 update. Reference: IEEE 421.5-2005, 6.6.
 */
@SuppressWarnings("unused")
public class ExcIEEEAC6A extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcIEEEAC6A.class);

    /**
     * Constructor.
     */
    public ExcIEEEAC6A(String rdfid) {
        super("ExcIEEEAC6A", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcIEEEAC6A(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Voltage regulator gain (<i>K</i><i><sub>A</sub></i>) (&gt; 0).  Typical value = 536.
     */
    private Double ka; // PU

    public Double getKa() {
        return ka;
    }

    public void setKa(Double _value_) {
        ka = _value_;
    }

    private static Object getKa(BaseClass _this_) {
        return ((ExcIEEEAC6A) _this_).getKa();
    }

    private static void setKa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC6A) _this_).setKa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC6A) _this_).setKa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rectifier loading factor proportional to commutating reactance (<i>K</i><i><sub>C</sub></i>) (&gt;= 0). Typical value = 0,173.
     */
    private Double kc; // PU

    public Double getKc() {
        return kc;
    }

    public void setKc(Double _value_) {
        kc = _value_;
    }

    private static Object getKc(BaseClass _this_) {
        return ((ExcIEEEAC6A) _this_).getKc();
    }

    private static void setKc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC6A) _this_).setKc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC6A) _this_).setKc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Demagnetizing factor, a function of exciter alternator reactances (<i>K</i><i><sub>D</sub></i>) (&gt;= 0).  Typical value = 1,91.
     */
    private Double kd; // PU

    public Double getKd() {
        return kd;
    }

    public void setKd(Double _value_) {
        kd = _value_;
    }

    private static Object getKd(BaseClass _this_) {
        return ((ExcIEEEAC6A) _this_).getKd();
    }

    private static void setKd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC6A) _this_).setKd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC6A) _this_).setKd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter constant related to self-excited field (<i>K</i><i><sub>E</sub></i>).  Typical value = 1,6.
     */
    private Double ke; // PU

    public Double getKe() {
        return ke;
    }

    public void setKe(Double _value_) {
        ke = _value_;
    }

    private static Object getKe(BaseClass _this_) {
        return ((ExcIEEEAC6A) _this_).getKe();
    }

    private static void setKe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC6A) _this_).setKe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC6A) _this_).setKe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter field current limiter gain (<i>K</i><i><sub>H</sub></i>) (&gt;= 0).  Typical value = 92.
     */
    private Double kh; // PU

    public Double getKh() {
        return kh;
    }

    public void setKh(Double _value_) {
        kh = _value_;
    }

    private static Object getKh(BaseClass _this_) {
        return ((ExcIEEEAC6A) _this_).getKh();
    }

    private static void setKh(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC6A) _this_).setKh((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC6A) _this_).setKh(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, <i>V</i><i><sub>E1</sub></i>, back of commutating reactance (<i>S</i><i><sub>E</sub></i><i>[V</i><i><sub>E1</sub></i><i>])</i> (&gt;= 0).  Typical value = 0,214.
     */
    private Float seve1; // Float

    public Float getSeve1() {
        return seve1;
    }

    public void setSeve1(Float _value_) {
        seve1 = _value_;
    }

    private static Object getSeve1(BaseClass _this_) {
        return ((ExcIEEEAC6A) _this_).getSeve1();
    }

    private static void setSeve1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExcIEEEAC6A) _this_).setSeve1((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC6A) _this_).setSeve1(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, <i>V</i><i><sub>E2</sub></i>, back of commutating reactance (<i>S</i><i><sub>E</sub></i><i>[V</i><i><sub>E2</sub></i><i>]</i>) (&gt;= 0).  Typical value = 0,044.
     */
    private Float seve2; // Float

    public Float getSeve2() {
        return seve2;
    }

    public void setSeve2(Float _value_) {
        seve2 = _value_;
    }

    private static Object getSeve2(BaseClass _this_) {
        return ((ExcIEEEAC6A) _this_).getSeve2();
    }

    private static void setSeve2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExcIEEEAC6A) _this_).setSeve2((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC6A) _this_).setSeve2(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Voltage regulator time constant (<i>T</i><i><sub>A</sub></i>) (&gt;= 0).  Typical value = 0,086.
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((ExcIEEEAC6A) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC6A) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC6A) _this_).setTa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (<i>T</i><i><sub>B</sub></i>) (&gt;= 0).  Typical value = 9.
     */
    private Double tb; // Seconds

    public Double getTb() {
        return tb;
    }

    public void setTb(Double _value_) {
        tb = _value_;
    }

    private static Object getTb(BaseClass _this_) {
        return ((ExcIEEEAC6A) _this_).getTb();
    }

    private static void setTb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC6A) _this_).setTb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC6A) _this_).setTb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (<i>T</i><i><sub>C</sub></i>) (&gt;= 0).  Typical value = 3.
     */
    private Double tc; // Seconds

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    private static Object getTc(BaseClass _this_) {
        return ((ExcIEEEAC6A) _this_).getTc();
    }

    private static void setTc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC6A) _this_).setTc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC6A) _this_).setTc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter time constant, integration rate associated with exciter control (<i>T</i><i><sub>E</sub></i>) (&gt; 0).  Typical value = 1.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    private static Object getTe(BaseClass _this_) {
        return ((ExcIEEEAC6A) _this_).getTe();
    }

    private static void setTe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC6A) _this_).setTe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC6A) _this_).setTe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter field current limiter time constant (<i>T</i><i><sub>H</sub></i>) (&gt; 0).  Typical value = 0,08.
     */
    private Double th; // Seconds

    public Double getTh() {
        return th;
    }

    public void setTh(Double _value_) {
        th = _value_;
    }

    private static Object getTh(BaseClass _this_) {
        return ((ExcIEEEAC6A) _this_).getTh();
    }

    private static void setTh(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC6A) _this_).setTh((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC6A) _this_).setTh(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter field current limiter time constant (<i>T</i><i><sub>J</sub></i>) (&gt;= 0).  Typical value = 0,02.
     */
    private Double tj; // Seconds

    public Double getTj() {
        return tj;
    }

    public void setTj(Double _value_) {
        tj = _value_;
    }

    private static Object getTj(BaseClass _this_) {
        return ((ExcIEEEAC6A) _this_).getTj();
    }

    private static void setTj(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC6A) _this_).setTj((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC6A) _this_).setTj(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (<i>T</i><i><sub>K</sub></i>) (&gt;= 0).  Typical value = 0,18.
     */
    private Double tk; // Seconds

    public Double getTk() {
        return tk;
    }

    public void setTk(Double _value_) {
        tk = _value_;
    }

    private static Object getTk(BaseClass _this_) {
        return ((ExcIEEEAC6A) _this_).getTk();
    }

    private static void setTk(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC6A) _this_).setTk((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC6A) _this_).setTk(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage regulator output (<i>V</i><i><sub>AMAX</sub></i>) (&gt; 0).  Typical value = 75.
     */
    private Double vamax; // PU

    public Double getVamax() {
        return vamax;
    }

    public void setVamax(Double _value_) {
        vamax = _value_;
    }

    private static Object getVamax(BaseClass _this_) {
        return ((ExcIEEEAC6A) _this_).getVamax();
    }

    private static void setVamax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC6A) _this_).setVamax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC6A) _this_).setVamax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator output (V<sub>AMIN</sub>) (&lt; 0).  Typical value = -75.
     */
    private Double vamin; // PU

    public Double getVamin() {
        return vamin;
    }

    public void setVamin(Double _value_) {
        vamin = _value_;
    }

    private static Object getVamin(BaseClass _this_) {
        return ((ExcIEEEAC6A) _this_).getVamin();
    }

    private static void setVamin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC6A) _this_).setVamin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC6A) _this_).setVamin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (<i>V</i><i><sub>E1</sub></i>) (&gt; 0).  Typical value = 7,4.
     */
    private Double ve1; // PU

    public Double getVe1() {
        return ve1;
    }

    public void setVe1(Double _value_) {
        ve1 = _value_;
    }

    private static Object getVe1(BaseClass _this_) {
        return ((ExcIEEEAC6A) _this_).getVe1();
    }

    private static void setVe1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC6A) _this_).setVe1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC6A) _this_).setVe1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (<i>V</i><i><sub>E2</sub></i>) (&gt; 0).  Typical value = 5,55.
     */
    private Double ve2; // PU

    public Double getVe2() {
        return ve2;
    }

    public void setVe2(Double _value_) {
        ve2 = _value_;
    }

    private static Object getVe2(BaseClass _this_) {
        return ((ExcIEEEAC6A) _this_).getVe2();
    }

    private static void setVe2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC6A) _this_).setVe2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC6A) _this_).setVe2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter field current limit reference (<i>V</i><i><sub>FELIM</sub></i>) (&gt; 0).  Typical value = 19.
     */
    private Double vfelim; // PU

    public Double getVfelim() {
        return vfelim;
    }

    public void setVfelim(Double _value_) {
        vfelim = _value_;
    }

    private static Object getVfelim(BaseClass _this_) {
        return ((ExcIEEEAC6A) _this_).getVfelim();
    }

    private static void setVfelim(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC6A) _this_).setVfelim((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC6A) _this_).setVfelim(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum field current limiter signal reference (<i>V</i><i><sub>HMAX</sub></i>) (&gt; 0).  Typical value = 75.
     */
    private Double vhmax; // PU

    public Double getVhmax() {
        return vhmax;
    }

    public void setVhmax(Double _value_) {
        vhmax = _value_;
    }

    private static Object getVhmax(BaseClass _this_) {
        return ((ExcIEEEAC6A) _this_).getVhmax();
    }

    private static void setVhmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC6A) _this_).setVhmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC6A) _this_).setVhmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage regulator output (<i>V</i><i><sub>RMAX</sub></i>) (&gt; 0).  Typical value = 44.
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    private static Object getVrmax(BaseClass _this_) {
        return ((ExcIEEEAC6A) _this_).getVrmax();
    }

    private static void setVrmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC6A) _this_).setVrmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC6A) _this_).setVrmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator output (<i>V</i><i><sub>RMIN</sub></i>) (&lt; 0).  Typical value = -36.
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    private static Object getVrmin(BaseClass _this_) {
        return ((ExcIEEEAC6A) _this_).getVrmin();
    }

    private static void setVrmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEAC6A) _this_).setVrmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEAC6A) _this_).setVrmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcIEEEAC6A", attrName));
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
                "ExcIEEEAC6A", attrName, value));
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
            map.put("ka", new AttrDetails("ExcIEEEAC6A.ka", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC6A::getKa, ExcIEEEAC6A::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("ExcIEEEAC6A.kc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC6A::getKc, ExcIEEEAC6A::setKc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("ExcIEEEAC6A.kd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC6A::getKd, ExcIEEEAC6A::setKd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcIEEEAC6A.ke", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC6A::getKe, ExcIEEEAC6A::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh", new AttrDetails("ExcIEEEAC6A.kh", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC6A::getKh, ExcIEEEAC6A::setKh));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve1", new AttrDetails("ExcIEEEAC6A.seve1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC6A::getSeve1, ExcIEEEAC6A::setSeve1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve2", new AttrDetails("ExcIEEEAC6A.seve2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC6A::getSeve2, ExcIEEEAC6A::setSeve2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("ExcIEEEAC6A.ta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC6A::getTa, ExcIEEEAC6A::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("ExcIEEEAC6A.tb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC6A::getTb, ExcIEEEAC6A::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("ExcIEEEAC6A.tc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC6A::getTc, ExcIEEEAC6A::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcIEEEAC6A.te", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC6A::getTe, ExcIEEEAC6A::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th", new AttrDetails("ExcIEEEAC6A.th", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC6A::getTh, ExcIEEEAC6A::setTh));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tj", new AttrDetails("ExcIEEEAC6A.tj", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC6A::getTj, ExcIEEEAC6A::setTj));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tk", new AttrDetails("ExcIEEEAC6A.tk", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC6A::getTk, ExcIEEEAC6A::setTk));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vamax", new AttrDetails("ExcIEEEAC6A.vamax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC6A::getVamax, ExcIEEEAC6A::setVamax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vamin", new AttrDetails("ExcIEEEAC6A.vamin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC6A::getVamin, ExcIEEEAC6A::setVamin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve1", new AttrDetails("ExcIEEEAC6A.ve1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC6A::getVe1, ExcIEEEAC6A::setVe1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve2", new AttrDetails("ExcIEEEAC6A.ve2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC6A::getVe2, ExcIEEEAC6A::setVe2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vfelim", new AttrDetails("ExcIEEEAC6A.vfelim", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC6A::getVfelim, ExcIEEEAC6A::setVfelim));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vhmax", new AttrDetails("ExcIEEEAC6A.vhmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC6A::getVhmax, ExcIEEEAC6A::setVhmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcIEEEAC6A.vrmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC6A::getVrmax, ExcIEEEAC6A::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcIEEEAC6A.vrmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC6A::getVrmin, ExcIEEEAC6A::setVrmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcIEEEAC6A(null).allAttrDetailsMap());
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
