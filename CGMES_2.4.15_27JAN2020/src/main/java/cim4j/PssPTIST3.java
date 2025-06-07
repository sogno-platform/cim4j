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
 * PTI Microprocessor-Based Stabilizer type 3.
 */
@SuppressWarnings("unused")
public class PssPTIST3 extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssPTIST3.class);

    /**
     * Constructor.
     */
    public PssPTIST3(String rdfid) {
        super("PssPTIST3", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected PssPTIST3(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Filter coefficient (A0).
     */
    private Double a0; // PU

    public Double getA0() {
        return a0;
    }

    public void setA0(Double _value_) {
        a0 = _value_;
    }

    private static Object getA0(BaseClass _this_) {
        return ((PssPTIST3) _this_).getA0();
    }

    private static void setA0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setA0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setA0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Limiter (Al).
     */
    private Double a1; // PU

    public Double getA1() {
        return a1;
    }

    public void setA1(Double _value_) {
        a1 = _value_;
    }

    private static Object getA1(BaseClass _this_) {
        return ((PssPTIST3) _this_).getA1();
    }

    private static void setA1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setA1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setA1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter coefficient (A2).
     */
    private Double a2; // PU

    public Double getA2() {
        return a2;
    }

    public void setA2(Double _value_) {
        a2 = _value_;
    }

    private static Object getA2(BaseClass _this_) {
        return ((PssPTIST3) _this_).getA2();
    }

    private static void setA2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setA2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setA2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter coefficient (A3).
     */
    private Double a3; // PU

    public Double getA3() {
        return a3;
    }

    public void setA3(Double _value_) {
        a3 = _value_;
    }

    private static Object getA3(BaseClass _this_) {
        return ((PssPTIST3) _this_).getA3();
    }

    private static void setA3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setA3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setA3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter coefficient (A4).
     */
    private Double a4; // PU

    public Double getA4() {
        return a4;
    }

    public void setA4(Double _value_) {
        a4 = _value_;
    }

    private static Object getA4(BaseClass _this_) {
        return ((PssPTIST3) _this_).getA4();
    }

    private static void setA4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setA4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setA4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter coefficient (A5).
     */
    private Double a5; // PU

    public Double getA5() {
        return a5;
    }

    public void setA5(Double _value_) {
        a5 = _value_;
    }

    private static Object getA5(BaseClass _this_) {
        return ((PssPTIST3) _this_).getA5();
    }

    private static void setA5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setA5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setA5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Limiter (Al).
     */
    private Double al; // PU

    public Double getAl() {
        return al;
    }

    public void setAl(Double _value_) {
        al = _value_;
    }

    private static Object getAl(BaseClass _this_) {
        return ((PssPTIST3) _this_).getAl();
    }

    private static void setAl(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setAl((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setAl(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Threshold value above which output averaging will be bypassed (Athres).  Typical Value = 0.005.
     */
    private Double athres; // PU

    public Double getAthres() {
        return athres;
    }

    public void setAthres(Double _value_) {
        athres = _value_;
    }

    private static Object getAthres(BaseClass _this_) {
        return ((PssPTIST3) _this_).getAthres();
    }

    private static void setAthres(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setAthres((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setAthres(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter coefficient (B0).
     */
    private Double b0; // PU

    public Double getB0() {
        return b0;
    }

    public void setB0(Double _value_) {
        b0 = _value_;
    }

    private static Object getB0(BaseClass _this_) {
        return ((PssPTIST3) _this_).getB0();
    }

    private static void setB0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setB0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setB0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter coefficient (B1).
     */
    private Double b1; // PU

    public Double getB1() {
        return b1;
    }

    public void setB1(Double _value_) {
        b1 = _value_;
    }

    private static Object getB1(BaseClass _this_) {
        return ((PssPTIST3) _this_).getB1();
    }

    private static void setB1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setB1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setB1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter coefficient (B2).
     */
    private Double b2; // PU

    public Double getB2() {
        return b2;
    }

    public void setB2(Double _value_) {
        b2 = _value_;
    }

    private static Object getB2(BaseClass _this_) {
        return ((PssPTIST3) _this_).getB2();
    }

    private static void setB2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setB2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setB2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter coefficient (B3).
     */
    private Double b3; // PU

    public Double getB3() {
        return b3;
    }

    public void setB3(Double _value_) {
        b3 = _value_;
    }

    private static Object getB3(BaseClass _this_) {
        return ((PssPTIST3) _this_).getB3();
    }

    private static void setB3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setB3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setB3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter coefficient (B4).
     */
    private Double b4; // PU

    public Double getB4() {
        return b4;
    }

    public void setB4(Double _value_) {
        b4 = _value_;
    }

    private static Object getB4(BaseClass _this_) {
        return ((PssPTIST3) _this_).getB4();
    }

    private static void setB4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setB4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setB4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter coefficient (B5).
     */
    private Double b5; // PU

    public Double getB5() {
        return b5;
    }

    public void setB5(Double _value_) {
        b5 = _value_;
    }

    private static Object getB5(BaseClass _this_) {
        return ((PssPTIST3) _this_).getB5();
    }

    private static void setB5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setB5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setB5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Limiter (Dl).
     */
    private Double dl; // PU

    public Double getDl() {
        return dl;
    }

    public void setDl(Double _value_) {
        dl = _value_;
    }

    private static Object getDl(BaseClass _this_) {
        return ((PssPTIST3) _this_).getDl();
    }

    private static void setDl(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setDl((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setDl(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time step related to activation of controls (0.03 for 50 Hz) (Dtc).  Typical Value = 0.025.
     */
    private Double dtc; // Seconds

    public Double getDtc() {
        return dtc;
    }

    public void setDtc(Double _value_) {
        dtc = _value_;
    }

    private static Object getDtc(BaseClass _this_) {
        return ((PssPTIST3) _this_).getDtc();
    }

    private static void setDtc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setDtc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setDtc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time step frequency calculation (0.03 for 50 Hz) (Dtf).  Typical Value = 0.025.
     */
    private Double dtf; // Seconds

    public Double getDtf() {
        return dtf;
    }

    public void setDtf(Double _value_) {
        dtf = _value_;
    }

    private static Object getDtf(BaseClass _this_) {
        return ((PssPTIST3) _this_).getDtf();
    }

    private static void setDtf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setDtf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setDtf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time step active power calculation (0.015 for 50 Hz) (Dtp).  Typical Value = 0.0125.
     */
    private Double dtp; // Seconds

    public Double getDtp() {
        return dtp;
    }

    public void setDtp(Double _value_) {
        dtp = _value_;
    }

    private static Object getDtp(BaseClass _this_) {
        return ((PssPTIST3) _this_).getDtp();
    }

    private static void setDtp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setDtp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setDtp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Digital/analog output switch (Isw). true = produce analog output false = convert to digital output, using tap selection table.
     */
    private Boolean isw; // Boolean

    public Boolean getIsw() {
        return isw;
    }

    public void setIsw(Boolean _value_) {
        isw = _value_;
    }

    private static Object getIsw(BaseClass _this_) {
        return ((PssPTIST3) _this_).getIsw();
    }

    private static void setIsw(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((PssPTIST3) _this_).setIsw((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setIsw(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Gain (K).  Typical Value = 9.
     */
    private Double k; // PU

    public Double getK() {
        return k;
    }

    public void setK(Double _value_) {
        k = _value_;
    }

    private static Object getK(BaseClass _this_) {
        return ((PssPTIST3) _this_).getK();
    }

    private static void setK(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setK((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setK(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Threshold value (Lthres).
     */
    private Double lthres; // PU

    public Double getLthres() {
        return lthres;
    }

    public void setLthres(Double _value_) {
        lthres = _value_;
    }

    private static Object getLthres(BaseClass _this_) {
        return ((PssPTIST3) _this_).getLthres();
    }

    private static void setLthres(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setLthres((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setLthres(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * (M).  M=2*H.  Typical Value = 5.
     */
    private Double m; // PU

    public Double getM() {
        return m;
    }

    public void setM(Double _value_) {
        m = _value_;
    }

    private static Object getM(BaseClass _this_) {
        return ((PssPTIST3) _this_).getM();
    }

    private static void setM(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setM((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setM(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Number of control outputs to average (Nav) (1 <= Nav <= 16).  Typical Value = 4.
     */
    private Double nav; // Simple_Float

    public Double getNav() {
        return nav;
    }

    public void setNav(Double _value_) {
        nav = _value_;
    }

    private static Object getNav(BaseClass _this_) {
        return ((PssPTIST3) _this_).getNav();
    }

    private static void setNav(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setNav((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setNav(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Number of counts at limit to active limit function (Ncl) (>0).
     */
    private Double ncl; // Simple_Float

    public Double getNcl() {
        return ncl;
    }

    public void setNcl(Double _value_) {
        ncl = _value_;
    }

    private static Object getNcl(BaseClass _this_) {
        return ((PssPTIST3) _this_).getNcl();
    }

    private static void setNcl(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setNcl((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setNcl(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Number of counts until reset after limit function is triggered (Ncr).
     */
    private Double ncr; // Simple_Float

    public Double getNcr() {
        return ncr;
    }

    public void setNcr(Double _value_) {
        ncr = _value_;
    }

    private static Object getNcr(BaseClass _this_) {
        return ((PssPTIST3) _this_).getNcr();
    }

    private static void setNcr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setNcr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setNcr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * (Pmin).
     */
    private Double pmin; // PU

    public Double getPmin() {
        return pmin;
    }

    public void setPmin(Double _value_) {
        pmin = _value_;
    }

    private static Object getPmin(BaseClass _this_) {
        return ((PssPTIST3) _this_).getPmin();
    }

    private static void setPmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setPmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setPmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (T1).  Typical Value = 0.3.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((PssPTIST3) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (T2).  Typical Value = 1.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    private static Object getT2(BaseClass _this_) {
        return ((PssPTIST3) _this_).getT2();
    }

    private static void setT2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setT2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setT2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (T3).  Typical Value = 0.2.
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    private static Object getT3(BaseClass _this_) {
        return ((PssPTIST3) _this_).getT3();
    }

    private static void setT3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setT3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setT3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (T4).  Typical Value = 0.05.
     */
    private Double t4; // Seconds

    public Double getT4() {
        return t4;
    }

    public void setT4(Double _value_) {
        t4 = _value_;
    }

    private static Object getT4(BaseClass _this_) {
        return ((PssPTIST3) _this_).getT4();
    }

    private static void setT4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setT4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setT4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (T5).
     */
    private Double t5; // Seconds

    public Double getT5() {
        return t5;
    }

    public void setT5(Double _value_) {
        t5 = _value_;
    }

    private static Object getT5(BaseClass _this_) {
        return ((PssPTIST3) _this_).getT5();
    }

    private static void setT5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setT5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setT5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (T6).
     */
    private Double t6; // Seconds

    public Double getT6() {
        return t6;
    }

    public void setT6(Double _value_) {
        t6 = _value_;
    }

    private static Object getT6(BaseClass _this_) {
        return ((PssPTIST3) _this_).getT6();
    }

    private static void setT6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setT6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setT6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (Tf).  Typical Value = 0.2.
     */
    private Double tf; // Seconds

    public Double getTf() {
        return tf;
    }

    public void setTf(Double _value_) {
        tf = _value_;
    }

    private static Object getTf(BaseClass _this_) {
        return ((PssPTIST3) _this_).getTf();
    }

    private static void setTf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setTf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setTf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (Tp).  Typical Value = 0.2.
     */
    private Double tp; // Seconds

    public Double getTp() {
        return tp;
    }

    public void setTp(Double _value_) {
        tp = _value_;
    }

    private static Object getTp(BaseClass _this_) {
        return ((PssPTIST3) _this_).getTp();
    }

    private static void setTp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssPTIST3) _this_).setTp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssPTIST3) _this_).setTp(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PssPTIST3", attrName));
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
                "PssPTIST3", attrName, value));
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
            map.put("a0", new AttrDetails("PssPTIST3.a0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getA0, PssPTIST3::setA0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a1", new AttrDetails("PssPTIST3.a1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getA1, PssPTIST3::setA1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a2", new AttrDetails("PssPTIST3.a2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getA2, PssPTIST3::setA2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a3", new AttrDetails("PssPTIST3.a3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getA3, PssPTIST3::setA3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a4", new AttrDetails("PssPTIST3.a4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getA4, PssPTIST3::setA4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("a5", new AttrDetails("PssPTIST3.a5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getA5, PssPTIST3::setA5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("al", new AttrDetails("PssPTIST3.al", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getAl, PssPTIST3::setAl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("athres", new AttrDetails("PssPTIST3.athres", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getAthres, PssPTIST3::setAthres));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("b0", new AttrDetails("PssPTIST3.b0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getB0, PssPTIST3::setB0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("b1", new AttrDetails("PssPTIST3.b1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getB1, PssPTIST3::setB1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("b2", new AttrDetails("PssPTIST3.b2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getB2, PssPTIST3::setB2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("b3", new AttrDetails("PssPTIST3.b3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getB3, PssPTIST3::setB3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("b4", new AttrDetails("PssPTIST3.b4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getB4, PssPTIST3::setB4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("b5", new AttrDetails("PssPTIST3.b5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getB5, PssPTIST3::setB5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dl", new AttrDetails("PssPTIST3.dl", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getDl, PssPTIST3::setDl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dtc", new AttrDetails("PssPTIST3.dtc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getDtc, PssPTIST3::setDtc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dtf", new AttrDetails("PssPTIST3.dtf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getDtf, PssPTIST3::setDtf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dtp", new AttrDetails("PssPTIST3.dtp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getDtp, PssPTIST3::setDtp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("isw", new AttrDetails("PssPTIST3.isw", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getIsw, PssPTIST3::setIsw));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k", new AttrDetails("PssPTIST3.k", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getK, PssPTIST3::setK));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lthres", new AttrDetails("PssPTIST3.lthres", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getLthres, PssPTIST3::setLthres));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("m", new AttrDetails("PssPTIST3.m", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getM, PssPTIST3::setM));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("nav", new AttrDetails("PssPTIST3.nav", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getNav, PssPTIST3::setNav));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ncl", new AttrDetails("PssPTIST3.ncl", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getNcl, PssPTIST3::setNcl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ncr", new AttrDetails("PssPTIST3.ncr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getNcr, PssPTIST3::setNcr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmin", new AttrDetails("PssPTIST3.pmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getPmin, PssPTIST3::setPmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("PssPTIST3.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getT1, PssPTIST3::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("PssPTIST3.t2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getT2, PssPTIST3::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("PssPTIST3.t3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getT3, PssPTIST3::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("PssPTIST3.t4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getT4, PssPTIST3::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5", new AttrDetails("PssPTIST3.t5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getT5, PssPTIST3::setT5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t6", new AttrDetails("PssPTIST3.t6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getT6, PssPTIST3::setT6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("PssPTIST3.tf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getTf, PssPTIST3::setTf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tp", new AttrDetails("PssPTIST3.tp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssPTIST3::getTp, PssPTIST3::setTp));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PssPTIST3(null).allAttrDetailsMap());
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
