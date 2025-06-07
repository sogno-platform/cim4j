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
 * Modified single shaft gas turbine.
 */
@SuppressWarnings("unused")
public class GovGAST1 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovGAST1.class);

    /**
     * Constructor.
     */
    public GovGAST1(String rdfid) {
        super("GovGAST1", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovGAST1(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Turbine power time constant numerator scale factor (<i>a</i>).  Typical value = 0,8.
     */
    private Float a; // Float

    public Float getA() {
        return a;
    }

    public void setA(Float _value_) {
        a = _value_;
    }

    private static Object getA(BaseClass _this_) {
        return ((GovGAST1) _this_).getA();
    }

    private static void setA(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovGAST1) _this_).setA((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setA(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Turbine power time constant denominator scale factor (<i>b</i>) (&gt;0).  Typical value = 1.
     */
    private Float b; // Float

    public Float getB() {
        return b;
    }

    public void setB(Float _value_) {
        b = _value_;
    }

    private static Object getB(BaseClass _this_) {
        return ((GovGAST1) _this_).getB();
    }

    private static void setB(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovGAST1) _this_).setB((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setB(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Intentional dead-band width (<i>db1</i>).  Unit = Hz.  Typical value = 0.
     */
    private Double db1; // Frequency

    public Double getDb1() {
        return db1;
    }

    public void setDb1(Double _value_) {
        db1 = _value_;
    }

    private static Object getDb1(BaseClass _this_) {
        return ((GovGAST1) _this_).getDb1();
    }

    private static void setDb1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setDb1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setDb1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Unintentional dead-band (<i>db2</i>).  Unit = MW.  Typical value = 0.
     */
    private Double db2; // ActivePower

    public Double getDb2() {
        return db2;
    }

    public void setDb2(Double _value_) {
        db2 = _value_;
    }

    private static Object getDb2(BaseClass _this_) {
        return ((GovGAST1) _this_).getDb2();
    }

    private static void setDb2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setDb2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setDb2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intentional db hysteresis (<i>eps</i>).  Unit = Hz.  Typical value = 0.
     */
    private Double eps; // Frequency

    public Double getEps() {
        return eps;
    }

    public void setEps(Double _value_) {
        eps = _value_;
    }

    private static Object getEps(BaseClass _this_) {
        return ((GovGAST1) _this_).getEps();
    }

    private static void setEps(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setEps((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setEps(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fuel flow at zero power output (<i>Fidle</i>).  Typical value = 0,18.
     */
    private Double fidle; // PU

    public Double getFidle() {
        return fidle;
    }

    public void setFidle(Double _value_) {
        fidle = _value_;
    }

    private static Object getFidle(BaseClass _this_) {
        return ((GovGAST1) _this_).getFidle();
    }

    private static void setFidle(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setFidle((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setFidle(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 1, PU gv (<i>Gv1</i>).  Typical value = 0.
     */
    private Double gv1; // PU

    public Double getGv1() {
        return gv1;
    }

    public void setGv1(Double _value_) {
        gv1 = _value_;
    }

    private static Object getGv1(BaseClass _this_) {
        return ((GovGAST1) _this_).getGv1();
    }

    private static void setGv1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setGv1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setGv1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 2,PU gv (<i>Gv2</i>).  Typical value = 0.
     */
    private Double gv2; // PU

    public Double getGv2() {
        return gv2;
    }

    public void setGv2(Double _value_) {
        gv2 = _value_;
    }

    private static Object getGv2(BaseClass _this_) {
        return ((GovGAST1) _this_).getGv2();
    }

    private static void setGv2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setGv2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setGv2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 3, PU gv (<i>Gv3</i>).  Typical value = 0.
     */
    private Double gv3; // PU

    public Double getGv3() {
        return gv3;
    }

    public void setGv3(Double _value_) {
        gv3 = _value_;
    }

    private static Object getGv3(BaseClass _this_) {
        return ((GovGAST1) _this_).getGv3();
    }

    private static void setGv3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setGv3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setGv3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 4, PU gv (<i>Gv4</i>).  Typical value = 0.
     */
    private Double gv4; // PU

    public Double getGv4() {
        return gv4;
    }

    public void setGv4(Double _value_) {
        gv4 = _value_;
    }

    private static Object getGv4(BaseClass _this_) {
        return ((GovGAST1) _this_).getGv4();
    }

    private static void setGv4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setGv4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setGv4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 5, PU gv (<i>Gv5</i>).  Typical value = 0.
     */
    private Double gv5; // PU

    public Double getGv5() {
        return gv5;
    }

    public void setGv5(Double _value_) {
        gv5 = _value_;
    }

    private static Object getGv5(BaseClass _this_) {
        return ((GovGAST1) _this_).getGv5();
    }

    private static void setGv5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setGv5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setGv5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 6, PU gv (<i>Gv6</i>).  Typical value = 0.
     */
    private Double gv6; // PU

    public Double getGv6() {
        return gv6;
    }

    public void setGv6(Double _value_) {
        gv6 = _value_;
    }

    private static Object getGv6(BaseClass _this_) {
        return ((GovGAST1) _this_).getGv6();
    }

    private static void setGv6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setGv6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setGv6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Governor gain (<i>Ka</i>).  Typical value = 0.
     */
    private Double ka; // PU

    public Double getKa() {
        return ka;
    }

    public void setKa(Double _value_) {
        ka = _value_;
    }

    private static Object getKa(BaseClass _this_) {
        return ((GovGAST1) _this_).getKa();
    }

    private static void setKa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setKa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setKa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Temperature limiter gain (<i>Kt</i>).  Typical value = 3.
     */
    private Double kt; // PU

    public Double getKt() {
        return kt;
    }

    public void setKt(Double _value_) {
        kt = _value_;
    }

    private static Object getKt(BaseClass _this_) {
        return ((GovGAST1) _this_).getKt();
    }

    private static void setKt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setKt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setKt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Ambient temperature load limit (<i>Lmax</i>).  <i>Lmax</i> is the turbine power output corresponding to the limiting exhaust gas temperature.  Typical value = 1.
     */
    private Double lmax; // PU

    public Double getLmax() {
        return lmax;
    }

    public void setLmax(Double _value_) {
        lmax = _value_;
    }

    private static Object getLmax(BaseClass _this_) {
        return ((GovGAST1) _this_).getLmax();
    }

    private static void setLmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setLmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setLmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Valve position change allowed at fast rate (<i>Loadinc</i>).  Typical value = 0,05.
     */
    private Double loadinc; // PU

    public Double getLoadinc() {
        return loadinc;
    }

    public void setLoadinc(Double _value_) {
        loadinc = _value_;
    }

    private static Object getLoadinc(BaseClass _this_) {
        return ((GovGAST1) _this_).getLoadinc();
    }

    private static void setLoadinc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setLoadinc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setLoadinc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum long term fuel valve opening rate (<i>Ltrate</i>).  Typical value = 0,02.
     */
    private Float ltrate; // Float

    public Float getLtrate() {
        return ltrate;
    }

    public void setLtrate(Float _value_) {
        ltrate = _value_;
    }

    private static Object getLtrate(BaseClass _this_) {
        return ((GovGAST1) _this_).getLtrate();
    }

    private static void setLtrate(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovGAST1) _this_).setLtrate((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setLtrate(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Base for power values (<i>MWbase</i>) (&gt; 0).  Unit = MW.
     */
    private Double mwbase; // ActivePower

    public Double getMwbase() {
        return mwbase;
    }

    public void setMwbase(Double _value_) {
        mwbase = _value_;
    }

    private static Object getMwbase(BaseClass _this_) {
        return ((GovGAST1) _this_).getMwbase();
    }

    private static void setMwbase(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setMwbase((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setMwbase(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 1, PU power (<i>Pgv1</i>).  Typical value = 0.
     */
    private Double pgv1; // PU

    public Double getPgv1() {
        return pgv1;
    }

    public void setPgv1(Double _value_) {
        pgv1 = _value_;
    }

    private static Object getPgv1(BaseClass _this_) {
        return ((GovGAST1) _this_).getPgv1();
    }

    private static void setPgv1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setPgv1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setPgv1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 2, PU power (<i>Pgv2</i>).  Typical value = 0.
     */
    private Double pgv2; // PU

    public Double getPgv2() {
        return pgv2;
    }

    public void setPgv2(Double _value_) {
        pgv2 = _value_;
    }

    private static Object getPgv2(BaseClass _this_) {
        return ((GovGAST1) _this_).getPgv2();
    }

    private static void setPgv2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setPgv2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setPgv2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 3, PU power (<i>Pgv3</i>).  Typical value = 0.
     */
    private Double pgv3; // PU

    public Double getPgv3() {
        return pgv3;
    }

    public void setPgv3(Double _value_) {
        pgv3 = _value_;
    }

    private static Object getPgv3(BaseClass _this_) {
        return ((GovGAST1) _this_).getPgv3();
    }

    private static void setPgv3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setPgv3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setPgv3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 4, PU power (<i>Pgv4</i>).  Typical value = 0.
     */
    private Double pgv4; // PU

    public Double getPgv4() {
        return pgv4;
    }

    public void setPgv4(Double _value_) {
        pgv4 = _value_;
    }

    private static Object getPgv4(BaseClass _this_) {
        return ((GovGAST1) _this_).getPgv4();
    }

    private static void setPgv4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setPgv4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setPgv4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 5, PU power (<i>Pgv5</i>).  Typical value = 0.
     */
    private Double pgv5; // PU

    public Double getPgv5() {
        return pgv5;
    }

    public void setPgv5(Double _value_) {
        pgv5 = _value_;
    }

    private static Object getPgv5(BaseClass _this_) {
        return ((GovGAST1) _this_).getPgv5();
    }

    private static void setPgv5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setPgv5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setPgv5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 6, PU power (<i>Pgv6</i>).  Typical value = 0.
     */
    private Double pgv6; // PU

    public Double getPgv6() {
        return pgv6;
    }

    public void setPgv6(Double _value_) {
        pgv6 = _value_;
    }

    private static Object getPgv6(BaseClass _this_) {
        return ((GovGAST1) _this_).getPgv6();
    }

    private static void setPgv6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setPgv6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setPgv6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Permanent droop (<i>R</i>) (&gt;0).  Typical value = 0,04.
     */
    private Double r; // PU

    public Double getR() {
        return r;
    }

    public void setR(Double _value_) {
        r = _value_;
    }

    private static Object getR(BaseClass _this_) {
        return ((GovGAST1) _this_).getR();
    }

    private static void setR(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setR((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setR(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum fuel valve opening rate (<i>Rmax</i>).  Unit = PU / s.  Typical value = 1.
     */
    private Float rmax; // Float

    public Float getRmax() {
        return rmax;
    }

    public void setRmax(Float _value_) {
        rmax = _value_;
    }

    private static Object getRmax(BaseClass _this_) {
        return ((GovGAST1) _this_).getRmax();
    }

    private static void setRmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovGAST1) _this_).setRmax((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setRmax(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Governor mechanism time constant (<i>T1</i>) (&gt;= 0).  <i>T1</i> represents the natural valve positioning time constant of the governor for small disturbances, as seen when rate limiting is not in effect.  Typical value = 0,5.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((GovGAST1) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Turbine power time constant (<i>T2</i>) (&gt;= 0). <i>T2</i> represents delay due to internal energy storage of the gas turbine engine. <i>T2</i> can be used to give a rough approximation to the delay associated with acceleration of the compressor spool of a multi-shaft engine, or with the compressibility of gas in the plenum of the free power turbine of an aero-derivative unit, for example.  Typical value = 0,5.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    private static Object getT2(BaseClass _this_) {
        return ((GovGAST1) _this_).getT2();
    }

    private static void setT2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setT2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setT2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Turbine exhaust temperature time constant (<i>T3</i>) (&gt;= 0).  <i>T3</i> represents delay in the exhaust temperature and load limiting system. Typical value = 3.
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    private static Object getT3(BaseClass _this_) {
        return ((GovGAST1) _this_).getT3();
    }

    private static void setT3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setT3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setT3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Governor lead time constant (<i>T4</i>) (&gt;= 0).  Typical value = 0.
     */
    private Double t4; // Seconds

    public Double getT4() {
        return t4;
    }

    public void setT4(Double _value_) {
        t4 = _value_;
    }

    private static Object getT4(BaseClass _this_) {
        return ((GovGAST1) _this_).getT4();
    }

    private static void setT4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setT4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setT4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Governor lag time constant (<i>T5</i>) (&gt;= 0).  If = 0, entire gain and lead-lag block is bypassed.  Typical value = 0.
     */
    private Double t5; // Seconds

    public Double getT5() {
        return t5;
    }

    public void setT5(Double _value_) {
        t5 = _value_;
    }

    private static Object getT5(BaseClass _this_) {
        return ((GovGAST1) _this_).getT5();
    }

    private static void setT5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setT5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setT5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Valve position averaging time constant (<i>Tltr</i>) (&gt;= 0).  Typical value = 10.
     */
    private Double tltr; // Seconds

    public Double getTltr() {
        return tltr;
    }

    public void setTltr(Double _value_) {
        tltr = _value_;
    }

    private static Object getTltr(BaseClass _this_) {
        return ((GovGAST1) _this_).getTltr();
    }

    private static void setTltr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setTltr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setTltr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum turbine power, PU of MWbase (<i>Vmax</i>) (&gt; GovGAST1.vmin).  Typical value = 1.
     */
    private Double vmax; // PU

    public Double getVmax() {
        return vmax;
    }

    public void setVmax(Double _value_) {
        vmax = _value_;
    }

    private static Object getVmax(BaseClass _this_) {
        return ((GovGAST1) _this_).getVmax();
    }

    private static void setVmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setVmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setVmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum turbine power, PU of MWbase (<i>Vmin</i>) (&lt; GovGAST1.vmax).  Typical value = 0.
     */
    private Double vmin; // PU

    public Double getVmin() {
        return vmin;
    }

    public void setVmin(Double _value_) {
        vmin = _value_;
    }

    private static Object getVmin(BaseClass _this_) {
        return ((GovGAST1) _this_).getVmin();
    }

    private static void setVmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST1) _this_).setVmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST1) _this_).setVmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovGAST1", attrName));
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
                "GovGAST1", attrName, value));
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
            map.put("a", new AttrDetails("GovGAST1.a", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getA, GovGAST1::setA));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("b", new AttrDetails("GovGAST1.b", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getB, GovGAST1::setB));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db1", new AttrDetails("GovGAST1.db1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getDb1, GovGAST1::setDb1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db2", new AttrDetails("GovGAST1.db2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getDb2, GovGAST1::setDb2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eps", new AttrDetails("GovGAST1.eps", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getEps, GovGAST1::setEps));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fidle", new AttrDetails("GovGAST1.fidle", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getFidle, GovGAST1::setFidle));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv1", new AttrDetails("GovGAST1.gv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getGv1, GovGAST1::setGv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv2", new AttrDetails("GovGAST1.gv2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getGv2, GovGAST1::setGv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv3", new AttrDetails("GovGAST1.gv3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getGv3, GovGAST1::setGv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv4", new AttrDetails("GovGAST1.gv4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getGv4, GovGAST1::setGv4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv5", new AttrDetails("GovGAST1.gv5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getGv5, GovGAST1::setGv5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv6", new AttrDetails("GovGAST1.gv6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getGv6, GovGAST1::setGv6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("GovGAST1.ka", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getKa, GovGAST1::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kt", new AttrDetails("GovGAST1.kt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getKt, GovGAST1::setKt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lmax", new AttrDetails("GovGAST1.lmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getLmax, GovGAST1::setLmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("loadinc", new AttrDetails("GovGAST1.loadinc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getLoadinc, GovGAST1::setLoadinc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ltrate", new AttrDetails("GovGAST1.ltrate", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getLtrate, GovGAST1::setLtrate));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovGAST1.mwbase", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getMwbase, GovGAST1::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv1", new AttrDetails("GovGAST1.pgv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getPgv1, GovGAST1::setPgv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv2", new AttrDetails("GovGAST1.pgv2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getPgv2, GovGAST1::setPgv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv3", new AttrDetails("GovGAST1.pgv3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getPgv3, GovGAST1::setPgv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv4", new AttrDetails("GovGAST1.pgv4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getPgv4, GovGAST1::setPgv4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv5", new AttrDetails("GovGAST1.pgv5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getPgv5, GovGAST1::setPgv5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv6", new AttrDetails("GovGAST1.pgv6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getPgv6, GovGAST1::setPgv6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("r", new AttrDetails("GovGAST1.r", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getR, GovGAST1::setR));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rmax", new AttrDetails("GovGAST1.rmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getRmax, GovGAST1::setRmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("GovGAST1.t1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getT1, GovGAST1::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("GovGAST1.t2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getT2, GovGAST1::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("GovGAST1.t3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getT3, GovGAST1::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("GovGAST1.t4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getT4, GovGAST1::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5", new AttrDetails("GovGAST1.t5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getT5, GovGAST1::setT5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tltr", new AttrDetails("GovGAST1.tltr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getTltr, GovGAST1::setTltr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmax", new AttrDetails("GovGAST1.vmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getVmax, GovGAST1::setVmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmin", new AttrDetails("GovGAST1.vmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST1::getVmin, GovGAST1::setVmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovGAST1(null).allAttrDetailsMap());
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
