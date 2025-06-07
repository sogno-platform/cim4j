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
 * Modified IEEE AC2A alternator-supplied rectifier excitation system with different field current limit.
 */
@SuppressWarnings("unused")
public class ExcAC2A extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcAC2A.class);

    /**
     * Constructor.
     */
    public ExcAC2A(String rdfid) {
        super("ExcAC2A", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcAC2A(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Indicates if HV gate is active (<i>HVgate</i>). true = gate is used false = gate is not used. Typical value = true.
     */
    private Boolean hvgate; // Boolean

    public Boolean getHvgate() {
        return hvgate;
    }

    public void setHvgate(Boolean _value_) {
        hvgate = _value_;
    }

    private static Object getHvgate(BaseClass _this_) {
        return ((ExcAC2A) _this_).getHvgate();
    }

    private static void setHvgate(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ExcAC2A) _this_).setHvgate((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setHvgate(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Voltage regulator gain (<i>Ka</i>) (&gt; 0).  Typical value = 400.
     */
    private Double ka; // PU

    public Double getKa() {
        return ka;
    }

    public void setKa(Double _value_) {
        ka = _value_;
    }

    private static Object getKa(BaseClass _this_) {
        return ((ExcAC2A) _this_).getKa();
    }

    private static void setKa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setKa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setKa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Second stage regulator gain (<i>Kb</i>) (&gt; 0).  Exciter field current controller gain.  Typical value = 25.
     */
    private Double kb; // PU

    public Double getKb() {
        return kb;
    }

    public void setKb(Double _value_) {
        kb = _value_;
    }

    private static Object getKb(BaseClass _this_) {
        return ((ExcAC2A) _this_).getKb();
    }

    private static void setKb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setKb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setKb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Second stage regulator gain (<i>Kb1</i>). It is exciter field current controller gain used as alternative to <i>Kb</i> to represent a variant of the ExcAC2A model.  Typical value = 25.
     */
    private Double kb1; // PU

    public Double getKb1() {
        return kb1;
    }

    public void setKb1(Double _value_) {
        kb1 = _value_;
    }

    private static Object getKb1(BaseClass _this_) {
        return ((ExcAC2A) _this_).getKb1();
    }

    private static void setKb1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setKb1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setKb1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rectifier loading factor proportional to commutating reactance (<i>Kc</i>) (&gt;= 0).  Typical value = 0,28.
     */
    private Double kc; // PU

    public Double getKc() {
        return kc;
    }

    public void setKc(Double _value_) {
        kc = _value_;
    }

    private static Object getKc(BaseClass _this_) {
        return ((ExcAC2A) _this_).getKc();
    }

    private static void setKc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setKc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setKc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Demagnetizing factor, a function of exciter alternator reactances (<i>Kd</i>) (&gt;= 0).  Typical value = 0,35.
     */
    private Double kd; // PU

    public Double getKd() {
        return kd;
    }

    public void setKd(Double _value_) {
        kd = _value_;
    }

    private static Object getKd(BaseClass _this_) {
        return ((ExcAC2A) _this_).getKd();
    }

    private static void setKd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setKd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setKd(getDoubleFromString((String) _value_));
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
        return ((ExcAC2A) _this_).getKe();
    }

    private static void setKe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setKe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setKe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Excitation control system stabilizer gains (<i>Kf</i>) (&gt;= 0).  Typical value = 0,03.
     */
    private Double kf; // PU

    public Double getKf() {
        return kf;
    }

    public void setKf(Double _value_) {
        kf = _value_;
    }

    private static Object getKf(BaseClass _this_) {
        return ((ExcAC2A) _this_).getKf();
    }

    private static void setKf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setKf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setKf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter field current feedback gain (<i>Kh</i>) (&gt;= 0).  Typical value = 1.
     */
    private Double kh; // PU

    public Double getKh() {
        return kh;
    }

    public void setKh(Double _value_) {
        kh = _value_;
    }

    private static Object getKh(BaseClass _this_) {
        return ((ExcAC2A) _this_).getKh();
    }

    private static void setKh(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setKh((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setKh(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter field current limiter gain (<i>Kl</i>).  Typical value = 10.
     */
    private Double kl; // PU

    public Double getKl() {
        return kl;
    }

    public void setKl(Double _value_) {
        kl = _value_;
    }

    private static Object getKl(BaseClass _this_) {
        return ((ExcAC2A) _this_).getKl();
    }

    private static void setKl(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setKl((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setKl(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Coefficient to allow different usage of the model (<i>Kl1</i>).  Typical value = 1.
     */
    private Double kl1; // PU

    public Double getKl1() {
        return kl1;
    }

    public void setKl1(Double _value_) {
        kl1 = _value_;
    }

    private static Object getKl1(BaseClass _this_) {
        return ((ExcAC2A) _this_).getKl1();
    }

    private static void setKl1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setKl1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setKl1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Coefficient to allow different usage of the model-speed coefficient (<i>Ks</i>) (&gt;= 0).  Typical value = 0.
     */
    private Double ks; // PU

    public Double getKs() {
        return ks;
    }

    public void setKs(Double _value_) {
        ks = _value_;
    }

    private static Object getKs(BaseClass _this_) {
        return ((ExcAC2A) _this_).getKs();
    }

    private static void setKs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setKs((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setKs(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Indicates if LV gate is active (<i>LVgate</i>). true = gate is used false = gate is not used. Typical value = true.
     */
    private Boolean lvgate; // Boolean

    public Boolean getLvgate() {
        return lvgate;
    }

    public void setLvgate(Boolean _value_) {
        lvgate = _value_;
    }

    private static Object getLvgate(BaseClass _this_) {
        return ((ExcAC2A) _this_).getLvgate();
    }

    private static void setLvgate(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ExcAC2A) _this_).setLvgate((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setLvgate(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, <i>Ve</i><i><sub>1</sub></i>, back of commutating reactance (<i>Se[Ve</i><i><sub>1</sub></i><i>]</i>) (&gt;= 0).  Typical value = 0,037.
     */
    private Float seve1; // Float

    public Float getSeve1() {
        return seve1;
    }

    public void setSeve1(Float _value_) {
        seve1 = _value_;
    }

    private static Object getSeve1(BaseClass _this_) {
        return ((ExcAC2A) _this_).getSeve1();
    }

    private static void setSeve1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExcAC2A) _this_).setSeve1((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setSeve1(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, <i>Ve</i><i><sub>2</sub></i>, back of commutating reactance (<i>Se[Ve</i><i><sub>2</sub></i><i>]</i>) (&gt;= 0).  Typical value = 0,012.
     */
    private Float seve2; // Float

    public Float getSeve2() {
        return seve2;
    }

    public void setSeve2(Float _value_) {
        seve2 = _value_;
    }

    private static Object getSeve2(BaseClass _this_) {
        return ((ExcAC2A) _this_).getSeve2();
    }

    private static void setSeve2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExcAC2A) _this_).setSeve2((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setSeve2(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Voltage regulator time constant (<i>Ta</i>) (&gt; 0).  Typical value = 0,02.
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((ExcAC2A) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setTa(getDoubleFromString((String) _value_));
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
        return ((ExcAC2A) _this_).getTb();
    }

    private static void setTb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setTb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setTb(getDoubleFromString((String) _value_));
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
        return ((ExcAC2A) _this_).getTc();
    }

    private static void setTc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setTc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setTc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter time constant, integration rate associated with exciter control (<i>Te</i>) (&gt; 0).  Typical value = 0,6.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    private static Object getTe(BaseClass _this_) {
        return ((ExcAC2A) _this_).getTe();
    }

    private static void setTe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setTe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setTe(getDoubleFromString((String) _value_));
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
        return ((ExcAC2A) _this_).getTf();
    }

    private static void setTf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setTf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setTf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage regulator output (<i>Vamax</i>) (&gt; 0).  Typical value = 8.
     */
    private Double vamax; // PU

    public Double getVamax() {
        return vamax;
    }

    public void setVamax(Double _value_) {
        vamax = _value_;
    }

    private static Object getVamax(BaseClass _this_) {
        return ((ExcAC2A) _this_).getVamax();
    }

    private static void setVamax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setVamax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setVamax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator output (<i>Vamin</i>) (&lt; 0).  Typical value = -8.
     */
    private Double vamin; // PU

    public Double getVamin() {
        return vamin;
    }

    public void setVamin(Double _value_) {
        vamin = _value_;
    }

    private static Object getVamin(BaseClass _this_) {
        return ((ExcAC2A) _this_).getVamin();
    }

    private static void setVamin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setVamin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setVamin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (<i>Ve</i><i><sub>1</sub></i>) (&gt; 0).  Typical value = 4,4.
     */
    private Double ve1; // PU

    public Double getVe1() {
        return ve1;
    }

    public void setVe1(Double _value_) {
        ve1 = _value_;
    }

    private static Object getVe1(BaseClass _this_) {
        return ((ExcAC2A) _this_).getVe1();
    }

    private static void setVe1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setVe1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setVe1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (<i>Ve</i><i><sub>2</sub></i>) (&gt; 0).  Typical value = 3,3.
     */
    private Double ve2; // PU

    public Double getVe2() {
        return ve2;
    }

    public void setVe2(Double _value_) {
        ve2 = _value_;
    }

    private static Object getVe2(BaseClass _this_) {
        return ((ExcAC2A) _this_).getVe2();
    }

    private static void setVe2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setVe2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setVe2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter field current limit reference (<i>Vfemax</i>) (&gt;= 0).  Typical value = 4,4.
     */
    private Double vfemax; // PU

    public Double getVfemax() {
        return vfemax;
    }

    public void setVfemax(Double _value_) {
        vfemax = _value_;
    }

    private static Object getVfemax(BaseClass _this_) {
        return ((ExcAC2A) _this_).getVfemax();
    }

    private static void setVfemax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setVfemax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setVfemax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum exciter field current (<i>Vlr</i>) (&gt; 0).  Typical value = 4,4.
     */
    private Double vlr; // PU

    public Double getVlr() {
        return vlr;
    }

    public void setVlr(Double _value_) {
        vlr = _value_;
    }

    private static Object getVlr(BaseClass _this_) {
        return ((ExcAC2A) _this_).getVlr();
    }

    private static void setVlr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setVlr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setVlr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage regulator outputs (<i>Vrmax</i>) (&gt; 0).  Typical value = 105.
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    private static Object getVrmax(BaseClass _this_) {
        return ((ExcAC2A) _this_).getVrmax();
    }

    private static void setVrmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setVrmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setVrmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator outputs (<i>Vrmin</i>) (&lt; 0).  Typical value = -95.
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    private static Object getVrmin(BaseClass _this_) {
        return ((ExcAC2A) _this_).getVrmin();
    }

    private static void setVrmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC2A) _this_).setVrmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC2A) _this_).setVrmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcAC2A", attrName));
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
                "ExcAC2A", attrName, value));
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
            map.put("hvgate", new AttrDetails("ExcAC2A.hvgate", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getHvgate, ExcAC2A::setHvgate));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("ExcAC2A.ka", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getKa, ExcAC2A::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kb", new AttrDetails("ExcAC2A.kb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getKb, ExcAC2A::setKb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kb1", new AttrDetails("ExcAC2A.kb1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getKb1, ExcAC2A::setKb1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("ExcAC2A.kc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getKc, ExcAC2A::setKc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("ExcAC2A.kd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getKd, ExcAC2A::setKd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcAC2A.ke", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getKe, ExcAC2A::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("ExcAC2A.kf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getKf, ExcAC2A::setKf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh", new AttrDetails("ExcAC2A.kh", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getKh, ExcAC2A::setKh));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl", new AttrDetails("ExcAC2A.kl", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getKl, ExcAC2A::setKl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl1", new AttrDetails("ExcAC2A.kl1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getKl1, ExcAC2A::setKl1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks", new AttrDetails("ExcAC2A.ks", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getKs, ExcAC2A::setKs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lvgate", new AttrDetails("ExcAC2A.lvgate", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getLvgate, ExcAC2A::setLvgate));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve1", new AttrDetails("ExcAC2A.seve1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getSeve1, ExcAC2A::setSeve1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve2", new AttrDetails("ExcAC2A.seve2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getSeve2, ExcAC2A::setSeve2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("ExcAC2A.ta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getTa, ExcAC2A::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("ExcAC2A.tb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getTb, ExcAC2A::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("ExcAC2A.tc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getTc, ExcAC2A::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcAC2A.te", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getTe, ExcAC2A::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("ExcAC2A.tf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getTf, ExcAC2A::setTf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vamax", new AttrDetails("ExcAC2A.vamax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getVamax, ExcAC2A::setVamax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vamin", new AttrDetails("ExcAC2A.vamin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getVamin, ExcAC2A::setVamin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve1", new AttrDetails("ExcAC2A.ve1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getVe1, ExcAC2A::setVe1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve2", new AttrDetails("ExcAC2A.ve2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getVe2, ExcAC2A::setVe2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vfemax", new AttrDetails("ExcAC2A.vfemax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getVfemax, ExcAC2A::setVfemax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vlr", new AttrDetails("ExcAC2A.vlr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getVlr, ExcAC2A::setVlr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcAC2A.vrmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getVrmax, ExcAC2A::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcAC2A.vrmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::getVrmin, ExcAC2A::setVrmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcAC2A(null).allAttrDetailsMap());
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
