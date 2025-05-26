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
 * Modified IEEE PSS2B.  Extra lead/lag (or rate) block added at end (up to 4 lead/lags total).
 */
@SuppressWarnings("unused")
public class Pss2B extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(Pss2B.class);

    /**
     * Constructor.
     */
    public Pss2B(String rdfid) {
        super("Pss2B", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected Pss2B(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Numerator constant (<i>a</i>).  Typical value = 1.
     */
    private Float a; // Float

    public Float getA() {
        return a;
    }

    public void setA(Float _value_) {
        a = _value_;
    }

    private static Object getA(BaseClass _this_) {
        return ((Pss2B) _this_).getA();
    }

    private static void setA(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((Pss2B) _this_).setA((Float) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setA(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Stabilizer gain (<i>Ks1</i>).  Typical value = 12.
     */
    private Double ks1; // PU

    public Double getKs1() {
        return ks1;
    }

    public void setKs1(Double _value_) {
        ks1 = _value_;
    }

    private static Object getKs1(BaseClass _this_) {
        return ((Pss2B) _this_).getKs1();
    }

    private static void setKs1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setKs1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setKs1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain on signal #2 (<i>Ks2</i>).  Typical value = 0,2.
     */
    private Double ks2; // PU

    public Double getKs2() {
        return ks2;
    }

    public void setKs2(Double _value_) {
        ks2 = _value_;
    }

    private static Object getKs2(BaseClass _this_) {
        return ((Pss2B) _this_).getKs2();
    }

    private static void setKs2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setKs2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setKs2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain on signal #2 input before ramp-tracking filter (<i>Ks3</i>).  Typical value = 1.
     */
    private Double ks3; // PU

    public Double getKs3() {
        return ks3;
    }

    public void setKs3(Double _value_) {
        ks3 = _value_;
    }

    private static Object getKs3(BaseClass _this_) {
        return ((Pss2B) _this_).getKs3();
    }

    private static void setKs3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setKs3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setKs3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain on signal #2 input after ramp-tracking filter (<i>Ks4</i>).  Typical value = 1.
     */
    private Double ks4; // PU

    public Double getKs4() {
        return ks4;
    }

    public void setKs4(Double _value_) {
        ks4 = _value_;
    }

    private static Object getKs4(BaseClass _this_) {
        return ((Pss2B) _this_).getKs4();
    }

    private static void setKs4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setKs4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setKs4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Denominator order of ramp tracking filter (<i>m</i>).  Typical value = 5.
     */
    private Integer m; // Integer

    public Integer getM() {
        return m;
    }

    public void setM(Integer _value_) {
        m = _value_;
    }

    private static Object getM(BaseClass _this_) {
        return ((Pss2B) _this_).getM();
    }

    private static void setM(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((Pss2B) _this_).setM((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setM(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
        }
    }

    /**
     * Order of ramp tracking filter (<i>n</i>).  Typical value = 1.
     */
    private Integer n; // Integer

    public Integer getN() {
        return n;
    }

    public void setN(Integer _value_) {
        n = _value_;
    }

    private static Object getN(BaseClass _this_) {
        return ((Pss2B) _this_).getN();
    }

    private static void setN(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((Pss2B) _this_).setN((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setN(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
        }
    }

    /**
     * Lead/lag time constant (<i>T</i><i><sub>1</sub></i>) (&gt;= 0).  Typical value = 0,12.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((Pss2B) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (<i>T</i><i><sub>10</sub></i>) (&gt;= 0).  Typical value = 0.
     */
    private Double t10; // Seconds

    public Double getT10() {
        return t10;
    }

    public void setT10(Double _value_) {
        t10 = _value_;
    }

    private static Object getT10(BaseClass _this_) {
        return ((Pss2B) _this_).getT10();
    }

    private static void setT10(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setT10((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setT10(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (<i>T</i><i><sub>11</sub></i>) (&gt;= 0).  Typical value = 0.
     */
    private Double t11; // Seconds

    public Double getT11() {
        return t11;
    }

    public void setT11(Double _value_) {
        t11 = _value_;
    }

    private static Object getT11(BaseClass _this_) {
        return ((Pss2B) _this_).getT11();
    }

    private static void setT11(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setT11((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setT11(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (<i>T</i><i><sub>2</sub></i>) (&gt;= 0).  Typical value = 0,02.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    private static Object getT2(BaseClass _this_) {
        return ((Pss2B) _this_).getT2();
    }

    private static void setT2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setT2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setT2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (<i>T</i><i><sub>3</sub></i>) (&gt;= 0).  Typical value = 0,3.
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    private static Object getT3(BaseClass _this_) {
        return ((Pss2B) _this_).getT3();
    }

    private static void setT3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setT3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setT3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (<i>T</i><i><sub>4</sub></i>) (&gt;= 0).  Typical value = 0,02.
     */
    private Double t4; // Seconds

    public Double getT4() {
        return t4;
    }

    public void setT4(Double _value_) {
        t4 = _value_;
    }

    private static Object getT4(BaseClass _this_) {
        return ((Pss2B) _this_).getT4();
    }

    private static void setT4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setT4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setT4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant on signal #1 (<i>T</i><i><sub>6</sub></i>) (&gt;= 0).  Typical value = 0.
     */
    private Double t6; // Seconds

    public Double getT6() {
        return t6;
    }

    public void setT6(Double _value_) {
        t6 = _value_;
    }

    private static Object getT6(BaseClass _this_) {
        return ((Pss2B) _this_).getT6();
    }

    private static void setT6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setT6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setT6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant on signal #2 (<i>T</i><i><sub>7</sub></i>) (&gt;= 0).  Typical value = 2.
     */
    private Double t7; // Seconds

    public Double getT7() {
        return t7;
    }

    public void setT7(Double _value_) {
        t7 = _value_;
    }

    private static Object getT7(BaseClass _this_) {
        return ((Pss2B) _this_).getT7();
    }

    private static void setT7(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setT7((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setT7(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead of ramp tracking filter (<i>T</i><i><sub>8</sub></i>) (&gt;= 0).  Typical value = 0,2.
     */
    private Double t8; // Seconds

    public Double getT8() {
        return t8;
    }

    public void setT8(Double _value_) {
        t8 = _value_;
    }

    private static Object getT8(BaseClass _this_) {
        return ((Pss2B) _this_).getT8();
    }

    private static void setT8(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setT8((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setT8(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lag of ramp tracking filter (<i>T</i><i><sub>9</sub></i>) (&gt;= 0).  Typical value = 0,1.
     */
    private Double t9; // Seconds

    public Double getT9() {
        return t9;
    }

    public void setT9(Double _value_) {
        t9 = _value_;
    }

    private static Object getT9(BaseClass _this_) {
        return ((Pss2B) _this_).getT9();
    }

    private static void setT9(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setT9((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setT9(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead constant (<i>T</i><i><sub>a</sub></i>) (&gt;= 0).  Typical value = 0.
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((Pss2B) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setTa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lag time constant (<i>T</i><i><sub>b</sub></i>) (&gt;= 0).  Typical value = 0.
     */
    private Double tb; // Seconds

    public Double getTb() {
        return tb;
    }

    public void setTb(Double _value_) {
        tb = _value_;
    }

    private static Object getTb(BaseClass _this_) {
        return ((Pss2B) _this_).getTb();
    }

    private static void setTb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setTb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setTb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * First washout on signal #1 (<i>T</i><i><sub>w1</sub></i>) (&gt;= 0).  Typical value = 2.
     */
    private Double tw1; // Seconds

    public Double getTw1() {
        return tw1;
    }

    public void setTw1(Double _value_) {
        tw1 = _value_;
    }

    private static Object getTw1(BaseClass _this_) {
        return ((Pss2B) _this_).getTw1();
    }

    private static void setTw1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setTw1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setTw1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Second washout on signal #1 (<i>T</i><i><sub>w2</sub></i>) (&gt;= 0).  Typical value = 2.
     */
    private Double tw2; // Seconds

    public Double getTw2() {
        return tw2;
    }

    public void setTw2(Double _value_) {
        tw2 = _value_;
    }

    private static Object getTw2(BaseClass _this_) {
        return ((Pss2B) _this_).getTw2();
    }

    private static void setTw2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setTw2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setTw2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * First washout on signal #2 (<i>T</i><i><sub>w3</sub></i>) (&gt;= 0).  Typical value = 2.
     */
    private Double tw3; // Seconds

    public Double getTw3() {
        return tw3;
    }

    public void setTw3(Double _value_) {
        tw3 = _value_;
    }

    private static Object getTw3(BaseClass _this_) {
        return ((Pss2B) _this_).getTw3();
    }

    private static void setTw3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setTw3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setTw3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Second washout on signal #2 (<i>T</i><i><sub>w4</sub></i>) (&gt;= 0).  Typical value = 0.
     */
    private Double tw4; // Seconds

    public Double getTw4() {
        return tw4;
    }

    public void setTw4(Double _value_) {
        tw4 = _value_;
    }

    private static Object getTw4(BaseClass _this_) {
        return ((Pss2B) _this_).getTw4();
    }

    private static void setTw4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setTw4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setTw4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Input signal #1 maximum limit (<i>Vsi1max</i>) (&gt; Pss2B.vsi1min).  Typical value = 2.
     */
    private Double vsi1max; // PU

    public Double getVsi1max() {
        return vsi1max;
    }

    public void setVsi1max(Double _value_) {
        vsi1max = _value_;
    }

    private static Object getVsi1max(BaseClass _this_) {
        return ((Pss2B) _this_).getVsi1max();
    }

    private static void setVsi1max(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setVsi1max((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setVsi1max(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Input signal #1 minimum limit (<i>Vsi1min</i>) (&lt; Pss2B.vsi1max).  Typical value = -2.
     */
    private Double vsi1min; // PU

    public Double getVsi1min() {
        return vsi1min;
    }

    public void setVsi1min(Double _value_) {
        vsi1min = _value_;
    }

    private static Object getVsi1min(BaseClass _this_) {
        return ((Pss2B) _this_).getVsi1min();
    }

    private static void setVsi1min(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setVsi1min((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setVsi1min(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Input signal #2 maximum limit (<i>Vsi2max</i>) (&gt; Pss2B.vsi2min).  Typical value = 2.
     */
    private Double vsi2max; // PU

    public Double getVsi2max() {
        return vsi2max;
    }

    public void setVsi2max(Double _value_) {
        vsi2max = _value_;
    }

    private static Object getVsi2max(BaseClass _this_) {
        return ((Pss2B) _this_).getVsi2max();
    }

    private static void setVsi2max(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setVsi2max((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setVsi2max(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Input signal #2 minimum limit (<i>Vsi2min</i>) (&lt; Pss2B.vsi2max).  Typical value = -2.
     */
    private Double vsi2min; // PU

    public Double getVsi2min() {
        return vsi2min;
    }

    public void setVsi2min(Double _value_) {
        vsi2min = _value_;
    }

    private static Object getVsi2min(BaseClass _this_) {
        return ((Pss2B) _this_).getVsi2min();
    }

    private static void setVsi2min(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setVsi2min((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setVsi2min(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Stabilizer output maximum limit (<i>Vstmax</i>) (&gt; Pss2B.vstmin).  Typical value = 0,1.
     */
    private Double vstmax; // PU

    public Double getVstmax() {
        return vstmax;
    }

    public void setVstmax(Double _value_) {
        vstmax = _value_;
    }

    private static Object getVstmax(BaseClass _this_) {
        return ((Pss2B) _this_).getVstmax();
    }

    private static void setVstmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setVstmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setVstmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Stabilizer output minimum limit (<i>Vstmin</i>) (&lt; Pss2B.vstmax).  Typical value = -0,1.
     */
    private Double vstmin; // PU

    public Double getVstmin() {
        return vstmin;
    }

    public void setVstmin(Double _value_) {
        vstmin = _value_;
    }

    private static Object getVstmin(BaseClass _this_) {
        return ((Pss2B) _this_).getVstmin();
    }

    private static void setVstmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((Pss2B) _this_).setVstmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((Pss2B) _this_).setVstmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "Pss2B", attrName));
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
                "Pss2B", attrName, value));
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
            map.put("a", new AttrDetails("Pss2B.a", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getA, Pss2B::setA));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks1", new AttrDetails("Pss2B.ks1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getKs1, Pss2B::setKs1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks2", new AttrDetails("Pss2B.ks2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getKs2, Pss2B::setKs2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks3", new AttrDetails("Pss2B.ks3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getKs3, Pss2B::setKs3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks4", new AttrDetails("Pss2B.ks4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getKs4, Pss2B::setKs4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("m", new AttrDetails("Pss2B.m", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getM, Pss2B::setM));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("n", new AttrDetails("Pss2B.n", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getN, Pss2B::setN));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("Pss2B.t1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getT1, Pss2B::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t10", new AttrDetails("Pss2B.t10", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getT10, Pss2B::setT10));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t11", new AttrDetails("Pss2B.t11", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getT11, Pss2B::setT11));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("Pss2B.t2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getT2, Pss2B::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("Pss2B.t3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getT3, Pss2B::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("Pss2B.t4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getT4, Pss2B::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t6", new AttrDetails("Pss2B.t6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getT6, Pss2B::setT6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t7", new AttrDetails("Pss2B.t7", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getT7, Pss2B::setT7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t8", new AttrDetails("Pss2B.t8", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getT8, Pss2B::setT8));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t9", new AttrDetails("Pss2B.t9", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getT9, Pss2B::setT9));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("Pss2B.ta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getTa, Pss2B::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("Pss2B.tb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getTb, Pss2B::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw1", new AttrDetails("Pss2B.tw1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getTw1, Pss2B::setTw1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw2", new AttrDetails("Pss2B.tw2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getTw2, Pss2B::setTw2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw3", new AttrDetails("Pss2B.tw3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getTw3, Pss2B::setTw3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw4", new AttrDetails("Pss2B.tw4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getTw4, Pss2B::setTw4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsi1max", new AttrDetails("Pss2B.vsi1max", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getVsi1max, Pss2B::setVsi1max));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsi1min", new AttrDetails("Pss2B.vsi1min", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getVsi1min, Pss2B::setVsi1min));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsi2max", new AttrDetails("Pss2B.vsi2max", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getVsi2max, Pss2B::setVsi2max));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsi2min", new AttrDetails("Pss2B.vsi2min", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getVsi2min, Pss2B::setVsi2min));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vstmax", new AttrDetails("Pss2B.vstmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getVstmax, Pss2B::setVstmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vstmin", new AttrDetails("Pss2B.vstmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Pss2B::getVstmin, Pss2B::setVstmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new Pss2B(null).allAttrDetailsMap());
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
