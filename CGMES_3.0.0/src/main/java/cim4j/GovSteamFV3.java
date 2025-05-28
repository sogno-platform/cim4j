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
 * Simplified GovSteamIEEE1 steam turbine governor with Prmax limit and fast valving.
 */
@SuppressWarnings("unused")
public class GovSteamFV3 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovSteamFV3.class);

    /**
     * Constructor.
     */
    public GovSteamFV3(String rdfid) {
        super("GovSteamFV3", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovSteamFV3(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Nonlinear gain valve position point 1 (<i>GV1</i>).  Typical value = 0.
     */
    private Double gv1; // PU

    public Double getGv1() {
        return gv1;
    }

    public void setGv1(Double _value_) {
        gv1 = _value_;
    }

    private static Object getGv1(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getGv1();
    }

    private static void setGv1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setGv1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setGv1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain valve position point 2 (<i>GV2</i>).  Typical value = 0,4.
     */
    private Double gv2; // PU

    public Double getGv2() {
        return gv2;
    }

    public void setGv2(Double _value_) {
        gv2 = _value_;
    }

    private static Object getGv2(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getGv2();
    }

    private static void setGv2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setGv2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setGv2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain valve position point 3 (<i>GV3</i>).  Typical value = 0,5.
     */
    private Double gv3; // PU

    public Double getGv3() {
        return gv3;
    }

    public void setGv3(Double _value_) {
        gv3 = _value_;
    }

    private static Object getGv3(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getGv3();
    }

    private static void setGv3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setGv3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setGv3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain valve position point 4 (<i>GV4</i>).  Typical value = 0,6.
     */
    private Double gv4; // PU

    public Double getGv4() {
        return gv4;
    }

    public void setGv4(Double _value_) {
        gv4 = _value_;
    }

    private static Object getGv4(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getGv4();
    }

    private static void setGv4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setGv4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setGv4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain valve position point 5 (<i>GV5</i>).  Typical value = 1.
     */
    private Double gv5; // PU

    public Double getGv5() {
        return gv5;
    }

    public void setGv5(Double _value_) {
        gv5 = _value_;
    }

    private static Object getGv5(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getGv5();
    }

    private static void setGv5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setGv5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setGv5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain valve position point 6 (<i>GV6</i>).  Typical value = 0.
     */
    private Double gv6; // PU

    public Double getGv6() {
        return gv6;
    }

    public void setGv6(Double _value_) {
        gv6 = _value_;
    }

    private static Object getGv6(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getGv6();
    }

    private static void setGv6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setGv6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setGv6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Governor gain, (reciprocal of droop) (<i>K</i>).  Typical value = 20.
     */
    private Double k; // PU

    public Double getK() {
        return k;
    }

    public void setK(Double _value_) {
        k = _value_;
    }

    private static Object getK(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getK();
    }

    private static void setK(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setK((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setK(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of turbine power developed after first boiler pass (<i>K1</i>).  Typical value = 0,2.
     */
    private Double k1; // PU

    public Double getK1() {
        return k1;
    }

    public void setK1(Double _value_) {
        k1 = _value_;
    }

    private static Object getK1(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getK1();
    }

    private static void setK1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setK1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setK1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of turbine power developed after second boiler pass (<i>K2</i>).  Typical value = 0,2.
     */
    private Double k2; // PU

    public Double getK2() {
        return k2;
    }

    public void setK2(Double _value_) {
        k2 = _value_;
    }

    private static Object getK2(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getK2();
    }

    private static void setK2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setK2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setK2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of hp turbine power developed after crossover or third boiler pass (<i>K3</i>). Typical value = 0,6.
     */
    private Double k3; // PU

    public Double getK3() {
        return k3;
    }

    public void setK3(Double _value_) {
        k3 = _value_;
    }

    private static Object getK3(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getK3();
    }

    private static void setK3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setK3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setK3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
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
        return ((GovSteamFV3) _this_).getMwbase();
    }

    private static void setMwbase(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setMwbase((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setMwbase(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain power value point 1 (<i>Pgv1</i>).  Typical value = 0.
     */
    private Double pgv1; // PU

    public Double getPgv1() {
        return pgv1;
    }

    public void setPgv1(Double _value_) {
        pgv1 = _value_;
    }

    private static Object getPgv1(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getPgv1();
    }

    private static void setPgv1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setPgv1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setPgv1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain power value point 2 (<i>Pgv2</i>).  Typical value = 0,75.
     */
    private Double pgv2; // PU

    public Double getPgv2() {
        return pgv2;
    }

    public void setPgv2(Double _value_) {
        pgv2 = _value_;
    }

    private static Object getPgv2(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getPgv2();
    }

    private static void setPgv2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setPgv2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setPgv2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain power value point 3 (<i>Pgv3</i>).  Typical value = 0,91.
     */
    private Double pgv3; // PU

    public Double getPgv3() {
        return pgv3;
    }

    public void setPgv3(Double _value_) {
        pgv3 = _value_;
    }

    private static Object getPgv3(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getPgv3();
    }

    private static void setPgv3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setPgv3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setPgv3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain power value point 4 (<i>Pgv4</i>).  Typical value = 0,98.
     */
    private Double pgv4; // PU

    public Double getPgv4() {
        return pgv4;
    }

    public void setPgv4(Double _value_) {
        pgv4 = _value_;
    }

    private static Object getPgv4(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getPgv4();
    }

    private static void setPgv4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setPgv4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setPgv4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain power value point 5 (<i>Pgv5</i>).  Typical value = 1.
     */
    private Double pgv5; // PU

    public Double getPgv5() {
        return pgv5;
    }

    public void setPgv5(Double _value_) {
        pgv5 = _value_;
    }

    private static Object getPgv5(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getPgv5();
    }

    private static void setPgv5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setPgv5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setPgv5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain power value point 6 (<i>Pgv6</i>).  Typical value = 0.
     */
    private Double pgv6; // PU

    public Double getPgv6() {
        return pgv6;
    }

    public void setPgv6(Double _value_) {
        pgv6 = _value_;
    }

    private static Object getPgv6(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getPgv6();
    }

    private static void setPgv6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setPgv6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setPgv6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum valve opening, PU of <i>MWbase</i> (<i>Pmax</i>) (&gt; GovSteamFV3.pmin).  Typical value = 1.
     */
    private Double pmax; // PU

    public Double getPmax() {
        return pmax;
    }

    public void setPmax(Double _value_) {
        pmax = _value_;
    }

    private static Object getPmax(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getPmax();
    }

    private static void setPmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setPmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setPmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum valve opening, PU of <i>MWbase</i> (<i>Pmin</i>) (&lt; GovSteamFV3.pmax).  Typical value = 0.
     */
    private Double pmin; // PU

    public Double getPmin() {
        return pmin;
    }

    public void setPmin(Double _value_) {
        pmin = _value_;
    }

    private static Object getPmin(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getPmin();
    }

    private static void setPmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setPmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setPmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Max. pressure in reheater (<i>Prmax</i>).  Typical value = 1.
     */
    private Double prmax; // PU

    public Double getPrmax() {
        return prmax;
    }

    public void setPrmax(Double _value_) {
        prmax = _value_;
    }

    private static Object getPrmax(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getPrmax();
    }

    private static void setPrmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setPrmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setPrmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Governor lead time constant (<i>T1</i>) (&gt;= 0).  Typical value = 0.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Governor lag time constant (<i>T2</i>) (&gt;= 0).  Typical value = 0.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    private static Object getT2(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getT2();
    }

    private static void setT2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setT2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setT2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Valve positioner time constant (<i>T3</i>) (&gt; 0).  Typical value = 0.
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    private static Object getT3(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getT3();
    }

    private static void setT3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setT3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setT3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Inlet piping/steam bowl time constant (<i>T4</i>) (&gt;= 0).  Typical value = 0,2.
     */
    private Double t4; // Seconds

    public Double getT4() {
        return t4;
    }

    public void setT4(Double _value_) {
        t4 = _value_;
    }

    private static Object getT4(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getT4();
    }

    private static void setT4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setT4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setT4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant of second boiler pass (i.e. reheater) (<i>T5</i>) (&gt; 0 if fast valving is used, otherwise &gt;= 0).  Typical value = 0,5.
     */
    private Double t5; // Seconds

    public Double getT5() {
        return t5;
    }

    public void setT5(Double _value_) {
        t5 = _value_;
    }

    private static Object getT5(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getT5();
    }

    private static void setT5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setT5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setT5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant of crossover or third boiler pass (<i>T6</i>) (&gt;= 0).  Typical value = 10.
     */
    private Double t6; // Seconds

    public Double getT6() {
        return t6;
    }

    public void setT6(Double _value_) {
        t6 = _value_;
    }

    private static Object getT6(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getT6();
    }

    private static void setT6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setT6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setT6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time to close intercept valve (IV) (<i>Ta</i>) (&gt;= 0).  Typical value = 0,97.
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setTa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time until IV starts to reopen (<i>Tb</i>) (&gt;= 0).  Typical value = 0,98.
     */
    private Double tb; // Seconds

    public Double getTb() {
        return tb;
    }

    public void setTb(Double _value_) {
        tb = _value_;
    }

    private static Object getTb(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getTb();
    }

    private static void setTb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setTb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setTb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time until IV is fully open (<i>Tc</i>) (&gt;= 0).  Typical value = 0,99.
     */
    private Double tc; // Seconds

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    private static Object getTc(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getTc();
    }

    private static void setTc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV3) _this_).setTc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setTc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum valve closing velocity (<i>Uc</i>).  Unit = PU / s.  Typical value = -1.
     */
    private Float uc; // Float

    public Float getUc() {
        return uc;
    }

    public void setUc(Float _value_) {
        uc = _value_;
    }

    private static Object getUc(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getUc();
    }

    private static void setUc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovSteamFV3) _this_).setUc((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setUc(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Maximum valve opening velocity (<i>Uo</i>).  Unit = PU / s.  Typical value = 0,1.
     */
    private Float uo; // Float

    public Float getUo() {
        return uo;
    }

    public void setUo(Float _value_) {
        uo = _value_;
    }

    private static Object getUo(BaseClass _this_) {
        return ((GovSteamFV3) _this_).getUo();
    }

    private static void setUo(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovSteamFV3) _this_).setUo((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV3) _this_).setUo(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovSteamFV3", attrName));
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
                "GovSteamFV3", attrName, value));
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
            map.put("gv1", new AttrDetails("GovSteamFV3.gv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getGv1, GovSteamFV3::setGv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv2", new AttrDetails("GovSteamFV3.gv2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getGv2, GovSteamFV3::setGv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv3", new AttrDetails("GovSteamFV3.gv3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getGv3, GovSteamFV3::setGv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv4", new AttrDetails("GovSteamFV3.gv4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getGv4, GovSteamFV3::setGv4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv5", new AttrDetails("GovSteamFV3.gv5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getGv5, GovSteamFV3::setGv5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv6", new AttrDetails("GovSteamFV3.gv6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getGv6, GovSteamFV3::setGv6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k", new AttrDetails("GovSteamFV3.k", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getK, GovSteamFV3::setK));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k1", new AttrDetails("GovSteamFV3.k1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getK1, GovSteamFV3::setK1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k2", new AttrDetails("GovSteamFV3.k2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getK2, GovSteamFV3::setK2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k3", new AttrDetails("GovSteamFV3.k3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getK3, GovSteamFV3::setK3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovSteamFV3.mwbase", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getMwbase, GovSteamFV3::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv1", new AttrDetails("GovSteamFV3.pgv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getPgv1, GovSteamFV3::setPgv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv2", new AttrDetails("GovSteamFV3.pgv2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getPgv2, GovSteamFV3::setPgv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv3", new AttrDetails("GovSteamFV3.pgv3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getPgv3, GovSteamFV3::setPgv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv4", new AttrDetails("GovSteamFV3.pgv4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getPgv4, GovSteamFV3::setPgv4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv5", new AttrDetails("GovSteamFV3.pgv5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getPgv5, GovSteamFV3::setPgv5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv6", new AttrDetails("GovSteamFV3.pgv6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getPgv6, GovSteamFV3::setPgv6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmax", new AttrDetails("GovSteamFV3.pmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getPmax, GovSteamFV3::setPmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmin", new AttrDetails("GovSteamFV3.pmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getPmin, GovSteamFV3::setPmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("prmax", new AttrDetails("GovSteamFV3.prmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getPrmax, GovSteamFV3::setPrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("GovSteamFV3.t1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getT1, GovSteamFV3::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("GovSteamFV3.t2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getT2, GovSteamFV3::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("GovSteamFV3.t3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getT3, GovSteamFV3::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("GovSteamFV3.t4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getT4, GovSteamFV3::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5", new AttrDetails("GovSteamFV3.t5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getT5, GovSteamFV3::setT5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t6", new AttrDetails("GovSteamFV3.t6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getT6, GovSteamFV3::setT6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("GovSteamFV3.ta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getTa, GovSteamFV3::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("GovSteamFV3.tb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getTb, GovSteamFV3::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("GovSteamFV3.tc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getTc, GovSteamFV3::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uc", new AttrDetails("GovSteamFV3.uc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getUc, GovSteamFV3::setUc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uo", new AttrDetails("GovSteamFV3.uo", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::getUo, GovSteamFV3::setUo));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovSteamFV3(null).allAttrDetailsMap());
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
