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
 * The class represents the Type UEL2 which has either a straight-line or multi-segment characteristic when plotted in terms of machine reactive power output vs. real power output.  Reference: IEEE UEL2 421.5-2005 Section 10.2.  (Limit characteristic lookup table shown in Figure 10.4 (p 32) of the standard).
 */
@SuppressWarnings("unused")
public class UnderexcLimIEEE2 extends UnderexcitationLimiterDynamics {

    private static final Logging LOG = Logging.getLogger(UnderexcLimIEEE2.class);

    /**
     * Constructor.
     */
    public UnderexcLimIEEE2(String rdfid) {
        super("UnderexcLimIEEE2", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected UnderexcLimIEEE2(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * UEL terminal voltage exponent applied to real power input to UEL limit look-up table (k1).  Typical Value = 2.
     */
    private Double k1; // Simple_Float

    public Double getK1() {
        return k1;
    }

    public void setK1(Double _value_) {
        k1 = _value_;
    }

    private static Object getK1(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getK1();
    }

    private static void setK1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setK1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setK1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL terminal voltage exponent applied to reactive power output from UEL limit look-up table (k2).  Typical Value = 2.
     */
    private Double k2; // Simple_Float

    public Double getK2() {
        return k2;
    }

    public void setK2(Double _value_) {
        k2 = _value_;
    }

    private static Object getK2(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getK2();
    }

    private static void setK2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setK2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setK2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain associated with optional integrator feedback input signal to UEL (K).  Typical Value = 0.
     */
    private Double kfb; // PU

    public Double getKfb() {
        return kfb;
    }

    public void setKfb(Double _value_) {
        kfb = _value_;
    }

    private static Object getKfb(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getKfb();
    }

    private static void setKfb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setKfb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setKfb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL excitation system stabilizer gain (K).  Typical Value = 0.
     */
    private Double kuf; // PU

    public Double getKuf() {
        return kuf;
    }

    public void setKuf(Double _value_) {
        kuf = _value_;
    }

    private static Object getKuf(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getKuf();
    }

    private static void setKuf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setKuf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setKuf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL integral gain (K).  Typical Value = 0.5.
     */
    private Double kui; // PU

    public Double getKui() {
        return kui;
    }

    public void setKui(Double _value_) {
        kui = _value_;
    }

    private static Object getKui(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getKui();
    }

    private static void setKui(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setKui((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setKui(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL proportional gain (K).  Typical Value = 0.8.
     */
    private Double kul; // PU

    public Double getKul() {
        return kul;
    }

    public void setKul(Double _value_) {
        kul = _value_;
    }

    private static Object getKul(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getKul();
    }

    private static void setKul(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setKul((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setKul(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Real power values for endpoints (P).  Typical Value = 0.
     */
    private Double p0; // PU

    public Double getP0() {
        return p0;
    }

    public void setP0(Double _value_) {
        p0 = _value_;
    }

    private static Object getP0(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getP0();
    }

    private static void setP0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setP0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setP0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Real power values for endpoints (P).  Typical Value = 0.3.
     */
    private Double p1; // PU

    public Double getP1() {
        return p1;
    }

    public void setP1(Double _value_) {
        p1 = _value_;
    }

    private static Object getP1(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getP1();
    }

    private static void setP1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setP1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setP1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Real power values for endpoints (P).
     */
    private Double p10; // PU

    public Double getP10() {
        return p10;
    }

    public void setP10(Double _value_) {
        p10 = _value_;
    }

    private static Object getP10(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getP10();
    }

    private static void setP10(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setP10((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setP10(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Real power values for endpoints (P).  Typical Value = 0.6.
     */
    private Double p2; // PU

    public Double getP2() {
        return p2;
    }

    public void setP2(Double _value_) {
        p2 = _value_;
    }

    private static Object getP2(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getP2();
    }

    private static void setP2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setP2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setP2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Real power values for endpoints (P).  Typical Value = 0.9.
     */
    private Double p3; // PU

    public Double getP3() {
        return p3;
    }

    public void setP3(Double _value_) {
        p3 = _value_;
    }

    private static Object getP3(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getP3();
    }

    private static void setP3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setP3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setP3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Real power values for endpoints (P).  Typical Value = 1.02.
     */
    private Double p4; // PU

    public Double getP4() {
        return p4;
    }

    public void setP4(Double _value_) {
        p4 = _value_;
    }

    private static Object getP4(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getP4();
    }

    private static void setP4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setP4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setP4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Real power values for endpoints (P).
     */
    private Double p5; // PU

    public Double getP5() {
        return p5;
    }

    public void setP5(Double _value_) {
        p5 = _value_;
    }

    private static Object getP5(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getP5();
    }

    private static void setP5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setP5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setP5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Real power values for endpoints (P).
     */
    private Double p6; // PU

    public Double getP6() {
        return p6;
    }

    public void setP6(Double _value_) {
        p6 = _value_;
    }

    private static Object getP6(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getP6();
    }

    private static void setP6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setP6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setP6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Real power values for endpoints (P).
     */
    private Double p7; // PU

    public Double getP7() {
        return p7;
    }

    public void setP7(Double _value_) {
        p7 = _value_;
    }

    private static Object getP7(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getP7();
    }

    private static void setP7(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setP7((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setP7(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Real power values for endpoints (P).
     */
    private Double p8; // PU

    public Double getP8() {
        return p8;
    }

    public void setP8(Double _value_) {
        p8 = _value_;
    }

    private static Object getP8(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getP8();
    }

    private static void setP8(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setP8((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setP8(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Real power values for endpoints (P).
     */
    private Double p9; // PU

    public Double getP9() {
        return p9;
    }

    public void setP9(Double _value_) {
        p9 = _value_;
    }

    private static Object getP9(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getP9();
    }

    private static void setP9(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setP9((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setP9(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive power values for endpoints (Q).  Typical Value = -0.31.
     */
    private Double q0; // PU

    public Double getQ0() {
        return q0;
    }

    public void setQ0(Double _value_) {
        q0 = _value_;
    }

    private static Object getQ0(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getQ0();
    }

    private static void setQ0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setQ0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setQ0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive power values for endpoints (Q).  Typical Value = -0.31.
     */
    private Double q1; // PU

    public Double getQ1() {
        return q1;
    }

    public void setQ1(Double _value_) {
        q1 = _value_;
    }

    private static Object getQ1(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getQ1();
    }

    private static void setQ1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setQ1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setQ1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive power values for endpoints (Q).
     */
    private Double q10; // PU

    public Double getQ10() {
        return q10;
    }

    public void setQ10(Double _value_) {
        q10 = _value_;
    }

    private static Object getQ10(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getQ10();
    }

    private static void setQ10(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setQ10((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setQ10(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive power values for endpoints (Q).  Typical Value = -0.28.
     */
    private Double q2; // PU

    public Double getQ2() {
        return q2;
    }

    public void setQ2(Double _value_) {
        q2 = _value_;
    }

    private static Object getQ2(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getQ2();
    }

    private static void setQ2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setQ2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setQ2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive power values for endpoints (Q).  Typical Value = -0.21.
     */
    private Double q3; // PU

    public Double getQ3() {
        return q3;
    }

    public void setQ3(Double _value_) {
        q3 = _value_;
    }

    private static Object getQ3(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getQ3();
    }

    private static void setQ3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setQ3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setQ3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive power values for endpoints (Q).  Typical Value = 0.
     */
    private Double q4; // PU

    public Double getQ4() {
        return q4;
    }

    public void setQ4(Double _value_) {
        q4 = _value_;
    }

    private static Object getQ4(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getQ4();
    }

    private static void setQ4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setQ4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setQ4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive power values for endpoints (Q).
     */
    private Double q5; // PU

    public Double getQ5() {
        return q5;
    }

    public void setQ5(Double _value_) {
        q5 = _value_;
    }

    private static Object getQ5(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getQ5();
    }

    private static void setQ5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setQ5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setQ5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive power values for endpoints (Q).
     */
    private Double q6; // PU

    public Double getQ6() {
        return q6;
    }

    public void setQ6(Double _value_) {
        q6 = _value_;
    }

    private static Object getQ6(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getQ6();
    }

    private static void setQ6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setQ6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setQ6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive power values for endpoints (Q).
     */
    private Double q7; // PU

    public Double getQ7() {
        return q7;
    }

    public void setQ7(Double _value_) {
        q7 = _value_;
    }

    private static Object getQ7(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getQ7();
    }

    private static void setQ7(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setQ7((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setQ7(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive power values for endpoints (Q).
     */
    private Double q8; // PU

    public Double getQ8() {
        return q8;
    }

    public void setQ8(Double _value_) {
        q8 = _value_;
    }

    private static Object getQ8(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getQ8();
    }

    private static void setQ8(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setQ8((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setQ8(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive power values for endpoints (Q).
     */
    private Double q9; // PU

    public Double getQ9() {
        return q9;
    }

    public void setQ9(Double _value_) {
        q9 = _value_;
    }

    private static Object getQ9(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getQ9();
    }

    private static void setQ9(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setQ9((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setQ9(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL lead time constant (T).  Typical Value = 0.
     */
    private Double tu1; // Seconds

    public Double getTu1() {
        return tu1;
    }

    public void setTu1(Double _value_) {
        tu1 = _value_;
    }

    private static Object getTu1(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getTu1();
    }

    private static void setTu1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setTu1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setTu1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL lag time constant (T).  Typical Value = 0.
     */
    private Double tu2; // Seconds

    public Double getTu2() {
        return tu2;
    }

    public void setTu2(Double _value_) {
        tu2 = _value_;
    }

    private static Object getTu2(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getTu2();
    }

    private static void setTu2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setTu2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setTu2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL lead time constant (T).  Typical Value = 0.
     */
    private Double tu3; // Seconds

    public Double getTu3() {
        return tu3;
    }

    public void setTu3(Double _value_) {
        tu3 = _value_;
    }

    private static Object getTu3(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getTu3();
    }

    private static void setTu3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setTu3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setTu3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL lag time constant (T).  Typical Value = 0.
     */
    private Double tu4; // Seconds

    public Double getTu4() {
        return tu4;
    }

    public void setTu4(Double _value_) {
        tu4 = _value_;
    }

    private static Object getTu4(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getTu4();
    }

    private static void setTu4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setTu4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setTu4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant associated with optional integrator feedback input signal to UEL (T).  Typical Value = 0.
     */
    private Double tul; // Seconds

    public Double getTul() {
        return tul;
    }

    public void setTul(Double _value_) {
        tul = _value_;
    }

    private static Object getTul(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getTul();
    }

    private static void setTul(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setTul((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setTul(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Real power filter time constant (T).  Typical Value = 5.
     */
    private Double tup; // Seconds

    public Double getTup() {
        return tup;
    }

    public void setTup(Double _value_) {
        tup = _value_;
    }

    private static Object getTup(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getTup();
    }

    private static void setTup(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setTup((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setTup(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive power filter time constant (T).  Typical Value = 0.
     */
    private Double tuq; // Seconds

    public Double getTuq() {
        return tuq;
    }

    public void setTuq(Double _value_) {
        tuq = _value_;
    }

    private static Object getTuq(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getTuq();
    }

    private static void setTuq(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setTuq((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setTuq(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage filter time constant (T).  Typical Value = 5.
     */
    private Double tuv; // Seconds

    public Double getTuv() {
        return tuv;
    }

    public void setTuv(Double _value_) {
        tuv = _value_;
    }

    private static Object getTuv(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getTuv();
    }

    private static void setTuv(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setTuv((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setTuv(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL integrator output maximum limit (V).  Typical Value = 0.25.
     */
    private Double vuimax; // PU

    public Double getVuimax() {
        return vuimax;
    }

    public void setVuimax(Double _value_) {
        vuimax = _value_;
    }

    private static Object getVuimax(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getVuimax();
    }

    private static void setVuimax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setVuimax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setVuimax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL integrator output minimum limit (V).  Typical Value = 0.
     */
    private Double vuimin; // PU

    public Double getVuimin() {
        return vuimin;
    }

    public void setVuimin(Double _value_) {
        vuimin = _value_;
    }

    private static Object getVuimin(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getVuimin();
    }

    private static void setVuimin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setVuimin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setVuimin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL output maximum limit (V).  Typical Value = 0.25.
     */
    private Double vulmax; // PU

    public Double getVulmax() {
        return vulmax;
    }

    public void setVulmax(Double _value_) {
        vulmax = _value_;
    }

    private static Object getVulmax(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getVulmax();
    }

    private static void setVulmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setVulmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setVulmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL output minimum limit (V).  Typical Value = 0.
     */
    private Double vulmin; // PU

    public Double getVulmin() {
        return vulmin;
    }

    public void setVulmin(Double _value_) {
        vulmin = _value_;
    }

    private static Object getVulmin(BaseClass _this_) {
        return ((UnderexcLimIEEE2) _this_).getVulmin();
    }

    private static void setVulmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((UnderexcLimIEEE2) _this_).setVulmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((UnderexcLimIEEE2) _this_).setVulmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "UnderexcLimIEEE2", attrName));
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
                "UnderexcLimIEEE2", attrName, value));
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
            map.put("k1", new AttrDetails("UnderexcLimIEEE2.k1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getK1, UnderexcLimIEEE2::setK1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k2", new AttrDetails("UnderexcLimIEEE2.k2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getK2, UnderexcLimIEEE2::setK2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kfb", new AttrDetails("UnderexcLimIEEE2.kfb", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getKfb, UnderexcLimIEEE2::setKfb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kuf", new AttrDetails("UnderexcLimIEEE2.kuf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getKuf, UnderexcLimIEEE2::setKuf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kui", new AttrDetails("UnderexcLimIEEE2.kui", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getKui, UnderexcLimIEEE2::setKui));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kul", new AttrDetails("UnderexcLimIEEE2.kul", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getKul, UnderexcLimIEEE2::setKul));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p0", new AttrDetails("UnderexcLimIEEE2.p0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getP0, UnderexcLimIEEE2::setP0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p1", new AttrDetails("UnderexcLimIEEE2.p1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getP1, UnderexcLimIEEE2::setP1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p10", new AttrDetails("UnderexcLimIEEE2.p10", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getP10, UnderexcLimIEEE2::setP10));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p2", new AttrDetails("UnderexcLimIEEE2.p2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getP2, UnderexcLimIEEE2::setP2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p3", new AttrDetails("UnderexcLimIEEE2.p3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getP3, UnderexcLimIEEE2::setP3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p4", new AttrDetails("UnderexcLimIEEE2.p4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getP4, UnderexcLimIEEE2::setP4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p5", new AttrDetails("UnderexcLimIEEE2.p5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getP5, UnderexcLimIEEE2::setP5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p6", new AttrDetails("UnderexcLimIEEE2.p6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getP6, UnderexcLimIEEE2::setP6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p7", new AttrDetails("UnderexcLimIEEE2.p7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getP7, UnderexcLimIEEE2::setP7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p8", new AttrDetails("UnderexcLimIEEE2.p8", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getP8, UnderexcLimIEEE2::setP8));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p9", new AttrDetails("UnderexcLimIEEE2.p9", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getP9, UnderexcLimIEEE2::setP9));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q0", new AttrDetails("UnderexcLimIEEE2.q0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getQ0, UnderexcLimIEEE2::setQ0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q1", new AttrDetails("UnderexcLimIEEE2.q1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getQ1, UnderexcLimIEEE2::setQ1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q10", new AttrDetails("UnderexcLimIEEE2.q10", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getQ10, UnderexcLimIEEE2::setQ10));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q2", new AttrDetails("UnderexcLimIEEE2.q2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getQ2, UnderexcLimIEEE2::setQ2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q3", new AttrDetails("UnderexcLimIEEE2.q3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getQ3, UnderexcLimIEEE2::setQ3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q4", new AttrDetails("UnderexcLimIEEE2.q4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getQ4, UnderexcLimIEEE2::setQ4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q5", new AttrDetails("UnderexcLimIEEE2.q5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getQ5, UnderexcLimIEEE2::setQ5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q6", new AttrDetails("UnderexcLimIEEE2.q6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getQ6, UnderexcLimIEEE2::setQ6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q7", new AttrDetails("UnderexcLimIEEE2.q7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getQ7, UnderexcLimIEEE2::setQ7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q8", new AttrDetails("UnderexcLimIEEE2.q8", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getQ8, UnderexcLimIEEE2::setQ8));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q9", new AttrDetails("UnderexcLimIEEE2.q9", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getQ9, UnderexcLimIEEE2::setQ9));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tu1", new AttrDetails("UnderexcLimIEEE2.tu1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getTu1, UnderexcLimIEEE2::setTu1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tu2", new AttrDetails("UnderexcLimIEEE2.tu2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getTu2, UnderexcLimIEEE2::setTu2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tu3", new AttrDetails("UnderexcLimIEEE2.tu3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getTu3, UnderexcLimIEEE2::setTu3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tu4", new AttrDetails("UnderexcLimIEEE2.tu4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getTu4, UnderexcLimIEEE2::setTu4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tul", new AttrDetails("UnderexcLimIEEE2.tul", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getTul, UnderexcLimIEEE2::setTul));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tup", new AttrDetails("UnderexcLimIEEE2.tup", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getTup, UnderexcLimIEEE2::setTup));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tuq", new AttrDetails("UnderexcLimIEEE2.tuq", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getTuq, UnderexcLimIEEE2::setTuq));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tuv", new AttrDetails("UnderexcLimIEEE2.tuv", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getTuv, UnderexcLimIEEE2::setTuv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vuimax", new AttrDetails("UnderexcLimIEEE2.vuimax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getVuimax, UnderexcLimIEEE2::setVuimax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vuimin", new AttrDetails("UnderexcLimIEEE2.vuimin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getVuimin, UnderexcLimIEEE2::setVuimin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vulmax", new AttrDetails("UnderexcLimIEEE2.vulmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getVulmax, UnderexcLimIEEE2::setVulmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vulmin", new AttrDetails("UnderexcLimIEEE2.vulmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimIEEE2::getVulmin, UnderexcLimIEEE2::setVulmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new UnderexcLimIEEE2(null).allAttrDetailsMap());
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
