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
 * Modified IEEE AC3A alternator-supplied rectifier excitation system with different field current limit.
 */
@SuppressWarnings("unused")
public class ExcAC3A extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcAC3A.class);

    /**
     * Constructor.
     */
    public ExcAC3A(String rdfid) {
        super("ExcAC3A", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcAC3A(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Value of <i>Efd </i>at which feedback gain changes (<i>Efdn</i>) (&gt; 0).  Typical value = 2,36.
     */
    private Double efdn; // PU

    public Double getEfdn() {
        return efdn;
    }

    public void setEfdn(Double _value_) {
        efdn = _value_;
    }

    private static Object getEfdn(BaseClass _this_) {
        return ((ExcAC3A) _this_).getEfdn();
    }

    private static void setEfdn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setEfdn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setEfdn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator gain (<i>Ka</i>) (&gt; 0).  Typical value = 45,62.
     */
    private Double ka; // Seconds

    public Double getKa() {
        return ka;
    }

    public void setKa(Double _value_) {
        ka = _value_;
    }

    private static Object getKa(BaseClass _this_) {
        return ((ExcAC3A) _this_).getKa();
    }

    private static void setKa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setKa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setKa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rectifier loading factor proportional to commutating reactance (<i>Kc</i>) (&gt;= 0).  Typical value = 0,104.
     */
    private Double kc; // PU

    public Double getKc() {
        return kc;
    }

    public void setKc(Double _value_) {
        kc = _value_;
    }

    private static Object getKc(BaseClass _this_) {
        return ((ExcAC3A) _this_).getKc();
    }

    private static void setKc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setKc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setKc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Demagnetizing factor, a function of exciter alternator reactances (<i>Kd</i>) (&gt;= 0).  Typical value = 0,499.
     */
    private Double kd; // PU

    public Double getKd() {
        return kd;
    }

    public void setKd(Double _value_) {
        kd = _value_;
    }

    private static Object getKd(BaseClass _this_) {
        return ((ExcAC3A) _this_).getKd();
    }

    private static void setKd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setKd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setKd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter constant related to self-excited field (<i>Ke</i>).  Typical value = 1.
     */
    private Double ke; // PU

    public Double getKe() {
        return ke;
    }

    public void setKe(Double _value_) {
        ke = _value_;
    }

    private static Object getKe(BaseClass _this_) {
        return ((ExcAC3A) _this_).getKe();
    }

    private static void setKe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setKe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setKe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Excitation control system stabilizer gains (<i>Kf</i>) (&gt;= 0).  Typical value = 0,143.
     */
    private Double kf; // PU

    public Double getKf() {
        return kf;
    }

    public void setKf(Double _value_) {
        kf = _value_;
    }

    private static Object getKf(BaseClass _this_) {
        return ((ExcAC3A) _this_).getKf();
    }

    private static void setKf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setKf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setKf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Coefficient to allow different usage of the model (<i>Kf1</i>).  Typical value = 1.
     */
    private Double kf1; // PU

    public Double getKf1() {
        return kf1;
    }

    public void setKf1(Double _value_) {
        kf1 = _value_;
    }

    private static Object getKf1(BaseClass _this_) {
        return ((ExcAC3A) _this_).getKf1();
    }

    private static void setKf1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setKf1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setKf1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Coefficient to allow different usage of the model (<i>Kf2</i>).  Typical value = 0.
     */
    private Double kf2; // PU

    public Double getKf2() {
        return kf2;
    }

    public void setKf2(Double _value_) {
        kf2 = _value_;
    }

    private static Object getKf2(BaseClass _this_) {
        return ((ExcAC3A) _this_).getKf2();
    }

    private static void setKf2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setKf2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setKf2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain used in the minimum field voltage limiter loop (<i>Klv</i>).  Typical value = 0,194.
     */
    private Double klv; // PU

    public Double getKlv() {
        return klv;
    }

    public void setKlv(Double _value_) {
        klv = _value_;
    }

    private static Object getKlv(BaseClass _this_) {
        return ((ExcAC3A) _this_).getKlv();
    }

    private static void setKlv(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setKlv((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setKlv(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Excitation control system stabilizer gain (<i>Kn</i>) (&gt;= 0).  Typical value =0,05.
     */
    private Double kn; // PU

    public Double getKn() {
        return kn;
    }

    public void setKn(Double _value_) {
        kn = _value_;
    }

    private static Object getKn(BaseClass _this_) {
        return ((ExcAC3A) _this_).getKn();
    }

    private static void setKn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setKn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setKn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Constant associated with regulator and alternator field power supply (<i>Kr</i>) (&gt; 0).  Typical value =3,77.
     */
    private Double kr; // PU

    public Double getKr() {
        return kr;
    }

    public void setKr(Double _value_) {
        kr = _value_;
    }

    private static Object getKr(BaseClass _this_) {
        return ((ExcAC3A) _this_).getKr();
    }

    private static void setKr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setKr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setKr(getDoubleFromString((String) _value_));
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
        return ((ExcAC3A) _this_).getKs();
    }

    private static void setKs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setKs((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setKs(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, <i>Ve</i><i><sub>1</sub></i>, back of commutating reactance (<i>Se[Ve</i><i><sub>1</sub></i><i>]</i>) (&gt;= 0).  Typical value = 1,143.
     */
    private Float seve1; // Float

    public Float getSeve1() {
        return seve1;
    }

    public void setSeve1(Float _value_) {
        seve1 = _value_;
    }

    private static Object getSeve1(BaseClass _this_) {
        return ((ExcAC3A) _this_).getSeve1();
    }

    private static void setSeve1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExcAC3A) _this_).setSeve1((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setSeve1(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, <i>Ve</i><i><sub>2</sub></i>, back of commutating reactance (<i>Se[Ve</i><i><sub>2</sub></i><i>]</i>) (&gt;= 0).  Typical value = 0,1.
     */
    private Float seve2; // Float

    public Float getSeve2() {
        return seve2;
    }

    public void setSeve2(Float _value_) {
        seve2 = _value_;
    }

    private static Object getSeve2(BaseClass _this_) {
        return ((ExcAC3A) _this_).getSeve2();
    }

    private static void setSeve2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExcAC3A) _this_).setSeve2((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setSeve2(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Voltage regulator time constant (<i>Ta</i>) (&gt; 0).  Typical value = 0,013.
     */
    private Double ta; // PU

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((ExcAC3A) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setTa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (<i>Tb</i>) (&gt;= 0).  Typical value = 0.
     */
    private Double tb; // Seconds

    public Double getTb() {
        return tb;
    }

    public void setTb(Double _value_) {
        tb = _value_;
    }

    private static Object getTb(BaseClass _this_) {
        return ((ExcAC3A) _this_).getTb();
    }

    private static void setTb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setTb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setTb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (<i>Tc</i>) (&gt;= 0).  Typical value = 0.
     */
    private Double tc; // Seconds

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    private static Object getTc(BaseClass _this_) {
        return ((ExcAC3A) _this_).getTc();
    }

    private static void setTc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setTc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setTc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter time constant, integration rate associated with exciter control (<i>Te</i>) (&gt; 0).  Typical value = 1,17.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    private static Object getTe(BaseClass _this_) {
        return ((ExcAC3A) _this_).getTe();
    }

    private static void setTe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setTe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setTe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Excitation control system stabilizer time constant (<i>Tf</i>) (&gt; 0).  Typical value = 1.
     */
    private Double tf; // Seconds

    public Double getTf() {
        return tf;
    }

    public void setTf(Double _value_) {
        tf = _value_;
    }

    private static Object getTf(BaseClass _this_) {
        return ((ExcAC3A) _this_).getTf();
    }

    private static void setTf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setTf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setTf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage regulator output (<i>Vamax</i>) (&gt; 0).  Typical value = 1.
     */
    private Double vamax; // PU

    public Double getVamax() {
        return vamax;
    }

    public void setVamax(Double _value_) {
        vamax = _value_;
    }

    private static Object getVamax(BaseClass _this_) {
        return ((ExcAC3A) _this_).getVamax();
    }

    private static void setVamax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setVamax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setVamax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator output (<i>Vamin</i>) (&lt; 0).  Typical value = -0,95.
     */
    private Double vamin; // PU

    public Double getVamin() {
        return vamin;
    }

    public void setVamin(Double _value_) {
        vamin = _value_;
    }

    private static Object getVamin(BaseClass _this_) {
        return ((ExcAC3A) _this_).getVamin();
    }

    private static void setVamin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setVamin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setVamin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (<i>Ve</i><i><sub>1</sub></i>) (&gt; 0).  Typical value = 6.24.
     */
    private Double ve1; // PU

    public Double getVe1() {
        return ve1;
    }

    public void setVe1(Double _value_) {
        ve1 = _value_;
    }

    private static Object getVe1(BaseClass _this_) {
        return ((ExcAC3A) _this_).getVe1();
    }

    private static void setVe1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setVe1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setVe1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (<i>Ve</i><i><sub>2</sub></i>) (&gt; 0).  Typical value = 4,68.
     */
    private Double ve2; // PU

    public Double getVe2() {
        return ve2;
    }

    public void setVe2(Double _value_) {
        ve2 = _value_;
    }

    private static Object getVe2(BaseClass _this_) {
        return ((ExcAC3A) _this_).getVe2();
    }

    private static void setVe2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setVe2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setVe2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum exciter voltage output (<i>Vemin</i>) (&lt;= 0).  Typical value = 0.
     */
    private Double vemin; // PU

    public Double getVemin() {
        return vemin;
    }

    public void setVemin(Double _value_) {
        vemin = _value_;
    }

    private static Object getVemin(BaseClass _this_) {
        return ((ExcAC3A) _this_).getVemin();
    }

    private static void setVemin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setVemin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setVemin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter field current limit reference (<i>Vfemax</i>) (&gt;= 0).  Typical value = 16.
     */
    private Double vfemax; // PU

    public Double getVfemax() {
        return vfemax;
    }

    public void setVfemax(Double _value_) {
        vfemax = _value_;
    }

    private static Object getVfemax(BaseClass _this_) {
        return ((ExcAC3A) _this_).getVfemax();
    }

    private static void setVfemax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setVfemax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setVfemax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Field voltage used in the minimum field voltage limiter loop (<i>Vlv</i>).  Typical value = 0,79.
     */
    private Double vlv; // PU

    public Double getVlv() {
        return vlv;
    }

    public void setVlv(Double _value_) {
        vlv = _value_;
    }

    private static Object getVlv(BaseClass _this_) {
        return ((ExcAC3A) _this_).getVlv();
    }

    private static void setVlv(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC3A) _this_).setVlv((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC3A) _this_).setVlv(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcAC3A", attrName));
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
                "ExcAC3A", attrName, value));
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
            map.put("efdn", new AttrDetails("ExcAC3A.efdn", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getEfdn, ExcAC3A::setEfdn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("ExcAC3A.ka", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getKa, ExcAC3A::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("ExcAC3A.kc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getKc, ExcAC3A::setKc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("ExcAC3A.kd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getKd, ExcAC3A::setKd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcAC3A.ke", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getKe, ExcAC3A::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("ExcAC3A.kf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getKf, ExcAC3A::setKf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf1", new AttrDetails("ExcAC3A.kf1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getKf1, ExcAC3A::setKf1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf2", new AttrDetails("ExcAC3A.kf2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getKf2, ExcAC3A::setKf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("klv", new AttrDetails("ExcAC3A.klv", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getKlv, ExcAC3A::setKlv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kn", new AttrDetails("ExcAC3A.kn", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getKn, ExcAC3A::setKn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kr", new AttrDetails("ExcAC3A.kr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getKr, ExcAC3A::setKr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks", new AttrDetails("ExcAC3A.ks", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getKs, ExcAC3A::setKs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve1", new AttrDetails("ExcAC3A.seve1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getSeve1, ExcAC3A::setSeve1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve2", new AttrDetails("ExcAC3A.seve2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getSeve2, ExcAC3A::setSeve2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("ExcAC3A.ta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getTa, ExcAC3A::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("ExcAC3A.tb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getTb, ExcAC3A::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("ExcAC3A.tc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getTc, ExcAC3A::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcAC3A.te", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getTe, ExcAC3A::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("ExcAC3A.tf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getTf, ExcAC3A::setTf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vamax", new AttrDetails("ExcAC3A.vamax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getVamax, ExcAC3A::setVamax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vamin", new AttrDetails("ExcAC3A.vamin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getVamin, ExcAC3A::setVamin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve1", new AttrDetails("ExcAC3A.ve1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getVe1, ExcAC3A::setVe1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve2", new AttrDetails("ExcAC3A.ve2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getVe2, ExcAC3A::setVe2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vemin", new AttrDetails("ExcAC3A.vemin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getVemin, ExcAC3A::setVemin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vfemax", new AttrDetails("ExcAC3A.vfemax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getVfemax, ExcAC3A::setVfemax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vlv", new AttrDetails("ExcAC3A.vlv", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC3A::getVlv, ExcAC3A::setVlv));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcAC3A(null).allAttrDetailsMap());
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
