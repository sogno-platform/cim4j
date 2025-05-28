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
 * Steam turbine governor model, based on the GovSteamIEEE1 model  (with optional deadband and nonlinear valve gain added).
 */
@SuppressWarnings("unused")
public class GovSteam1 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovSteam1.class);

    /**
     * Constructor.
     */
    public GovSteam1(String rdfid) {
        super("GovSteam1", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovSteam1(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Intentional deadband width (db1).  Unit = Hz.  Typical Value = 0.
     */
    private Double db1; // Frequency

    public Double getDb1() {
        return db1;
    }

    public void setDb1(Double _value_) {
        db1 = _value_;
    }

    private static Object getDb1(BaseClass _this_) {
        return ((GovSteam1) _this_).getDb1();
    }

    private static void setDb1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setDb1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setDb1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Unintentional deadband (db2).  Unit = MW.  Typical Value = 0.
     */
    private Double db2; // ActivePower

    public Double getDb2() {
        return db2;
    }

    public void setDb2(Double _value_) {
        db2 = _value_;
    }

    private static Object getDb2(BaseClass _this_) {
        return ((GovSteam1) _this_).getDb2();
    }

    private static void setDb2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setDb2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setDb2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intentional db hysteresis (eps).  Unit = Hz.  Typical Value = 0.
     */
    private Double eps; // Frequency

    public Double getEps() {
        return eps;
    }

    public void setEps(Double _value_) {
        eps = _value_;
    }

    private static Object getEps(BaseClass _this_) {
        return ((GovSteam1) _this_).getEps();
    }

    private static void setEps(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setEps((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setEps(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain valve position point 1 (GV1).  Typical Value = 0.
     */
    private Double gv1; // PU

    public Double getGv1() {
        return gv1;
    }

    public void setGv1(Double _value_) {
        gv1 = _value_;
    }

    private static Object getGv1(BaseClass _this_) {
        return ((GovSteam1) _this_).getGv1();
    }

    private static void setGv1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setGv1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setGv1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain valve position point 2 (GV2).  Typical Value = 0.4.
     */
    private Double gv2; // PU

    public Double getGv2() {
        return gv2;
    }

    public void setGv2(Double _value_) {
        gv2 = _value_;
    }

    private static Object getGv2(BaseClass _this_) {
        return ((GovSteam1) _this_).getGv2();
    }

    private static void setGv2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setGv2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setGv2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain valve position point 3 (GV3).  Typical Value = 0.5.
     */
    private Double gv3; // PU

    public Double getGv3() {
        return gv3;
    }

    public void setGv3(Double _value_) {
        gv3 = _value_;
    }

    private static Object getGv3(BaseClass _this_) {
        return ((GovSteam1) _this_).getGv3();
    }

    private static void setGv3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setGv3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setGv3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain valve position point 4 (GV4).  Typical Value = 0.6.
     */
    private Double gv4; // PU

    public Double getGv4() {
        return gv4;
    }

    public void setGv4(Double _value_) {
        gv4 = _value_;
    }

    private static Object getGv4(BaseClass _this_) {
        return ((GovSteam1) _this_).getGv4();
    }

    private static void setGv4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setGv4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setGv4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain valve position point 5 (GV5).  Typical Value = 1.
     */
    private Double gv5; // PU

    public Double getGv5() {
        return gv5;
    }

    public void setGv5(Double _value_) {
        gv5 = _value_;
    }

    private static Object getGv5(BaseClass _this_) {
        return ((GovSteam1) _this_).getGv5();
    }

    private static void setGv5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setGv5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setGv5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain valve position point 6 (GV6).  Typical Value = 0.
     */
    private Double gv6; // PU

    public Double getGv6() {
        return gv6;
    }

    public void setGv6(Double _value_) {
        gv6 = _value_;
    }

    private static Object getGv6(BaseClass _this_) {
        return ((GovSteam1) _this_).getGv6();
    }

    private static void setGv6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setGv6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setGv6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Governor gain (reciprocal of droop) (K) (>0).  Typical Value = 25.
     */
    private Double k; // PU

    public Double getK() {
        return k;
    }

    public void setK(Double _value_) {
        k = _value_;
    }

    private static Object getK(BaseClass _this_) {
        return ((GovSteam1) _this_).getK();
    }

    private static void setK(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setK((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setK(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of HP shaft power after first boiler pass (K1).  Typical Value = 0.2.
     */
    private Double k1; // Simple_Float

    public Double getK1() {
        return k1;
    }

    public void setK1(Double _value_) {
        k1 = _value_;
    }

    private static Object getK1(BaseClass _this_) {
        return ((GovSteam1) _this_).getK1();
    }

    private static void setK1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setK1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setK1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of LP shaft power after first boiler pass (K2).  Typical Value = 0.
     */
    private Double k2; // Simple_Float

    public Double getK2() {
        return k2;
    }

    public void setK2(Double _value_) {
        k2 = _value_;
    }

    private static Object getK2(BaseClass _this_) {
        return ((GovSteam1) _this_).getK2();
    }

    private static void setK2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setK2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setK2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of HP shaft power after second boiler pass (K3).  Typical Value = 0.3.
     */
    private Double k3; // Simple_Float

    public Double getK3() {
        return k3;
    }

    public void setK3(Double _value_) {
        k3 = _value_;
    }

    private static Object getK3(BaseClass _this_) {
        return ((GovSteam1) _this_).getK3();
    }

    private static void setK3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setK3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setK3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of LP shaft power after second boiler pass (K4).  Typical Value = 0.
     */
    private Double k4; // Simple_Float

    public Double getK4() {
        return k4;
    }

    public void setK4(Double _value_) {
        k4 = _value_;
    }

    private static Object getK4(BaseClass _this_) {
        return ((GovSteam1) _this_).getK4();
    }

    private static void setK4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setK4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setK4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of HP shaft power after third boiler pass (K5).  Typical Value = 0.5.
     */
    private Double k5; // Simple_Float

    public Double getK5() {
        return k5;
    }

    public void setK5(Double _value_) {
        k5 = _value_;
    }

    private static Object getK5(BaseClass _this_) {
        return ((GovSteam1) _this_).getK5();
    }

    private static void setK5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setK5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setK5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of LP shaft power after third boiler pass (K6).  Typical Value = 0.
     */
    private Double k6; // Simple_Float

    public Double getK6() {
        return k6;
    }

    public void setK6(Double _value_) {
        k6 = _value_;
    }

    private static Object getK6(BaseClass _this_) {
        return ((GovSteam1) _this_).getK6();
    }

    private static void setK6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setK6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setK6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of HP shaft power after fourth boiler pass (K7).  Typical Value = 0.
     */
    private Double k7; // Simple_Float

    public Double getK7() {
        return k7;
    }

    public void setK7(Double _value_) {
        k7 = _value_;
    }

    private static Object getK7(BaseClass _this_) {
        return ((GovSteam1) _this_).getK7();
    }

    private static void setK7(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setK7((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setK7(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of LP shaft power after fourth boiler pass (K8).  Typical Value = 0.
     */
    private Double k8; // Simple_Float

    public Double getK8() {
        return k8;
    }

    public void setK8(Double _value_) {
        k8 = _value_;
    }

    private static Object getK8(BaseClass _this_) {
        return ((GovSteam1) _this_).getK8();
    }

    private static void setK8(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setK8((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setK8(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Base for power values (MWbase) (>0).  Unit = MW.
     */
    private Double mwbase; // ActivePower

    public Double getMwbase() {
        return mwbase;
    }

    public void setMwbase(Double _value_) {
        mwbase = _value_;
    }

    private static Object getMwbase(BaseClass _this_) {
        return ((GovSteam1) _this_).getMwbase();
    }

    private static void setMwbase(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setMwbase((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setMwbase(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain power value point 1 (Pgv1).  Typical Value = 0.
     */
    private Double pgv1; // PU

    public Double getPgv1() {
        return pgv1;
    }

    public void setPgv1(Double _value_) {
        pgv1 = _value_;
    }

    private static Object getPgv1(BaseClass _this_) {
        return ((GovSteam1) _this_).getPgv1();
    }

    private static void setPgv1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setPgv1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setPgv1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain power value point 2 (Pgv2).  Typical Value = 0.75.
     */
    private Double pgv2; // PU

    public Double getPgv2() {
        return pgv2;
    }

    public void setPgv2(Double _value_) {
        pgv2 = _value_;
    }

    private static Object getPgv2(BaseClass _this_) {
        return ((GovSteam1) _this_).getPgv2();
    }

    private static void setPgv2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setPgv2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setPgv2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain power value point 3 (Pgv3).  Typical Value = 0.91.
     */
    private Double pgv3; // PU

    public Double getPgv3() {
        return pgv3;
    }

    public void setPgv3(Double _value_) {
        pgv3 = _value_;
    }

    private static Object getPgv3(BaseClass _this_) {
        return ((GovSteam1) _this_).getPgv3();
    }

    private static void setPgv3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setPgv3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setPgv3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain power value point 4 (Pgv4).  Typical Value = 0.98.
     */
    private Double pgv4; // PU

    public Double getPgv4() {
        return pgv4;
    }

    public void setPgv4(Double _value_) {
        pgv4 = _value_;
    }

    private static Object getPgv4(BaseClass _this_) {
        return ((GovSteam1) _this_).getPgv4();
    }

    private static void setPgv4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setPgv4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setPgv4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain power value point 5 (Pgv5).  Typical Value = 1.
     */
    private Double pgv5; // PU

    public Double getPgv5() {
        return pgv5;
    }

    public void setPgv5(Double _value_) {
        pgv5 = _value_;
    }

    private static Object getPgv5(BaseClass _this_) {
        return ((GovSteam1) _this_).getPgv5();
    }

    private static void setPgv5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setPgv5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setPgv5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain power value point 6 (Pgv6).  Typical Value = 0.
     */
    private Double pgv6; // PU

    public Double getPgv6() {
        return pgv6;
    }

    public void setPgv6(Double _value_) {
        pgv6 = _value_;
    }

    private static Object getPgv6(BaseClass _this_) {
        return ((GovSteam1) _this_).getPgv6();
    }

    private static void setPgv6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setPgv6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setPgv6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum valve opening (Pmax) (> Pmin).  Typical Value = 1.
     */
    private Double pmax; // PU

    public Double getPmax() {
        return pmax;
    }

    public void setPmax(Double _value_) {
        pmax = _value_;
    }

    private static Object getPmax(BaseClass _this_) {
        return ((GovSteam1) _this_).getPmax();
    }

    private static void setPmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setPmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setPmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum valve opening (Pmin) (>=0).  Typical Value = 0.
     */
    private Double pmin; // PU

    public Double getPmin() {
        return pmin;
    }

    public void setPmin(Double _value_) {
        pmin = _value_;
    }

    private static Object getPmin(BaseClass _this_) {
        return ((GovSteam1) _this_).getPmin();
    }

    private static void setPmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setPmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setPmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intentional deadband indicator. true = intentional deadband is applied false = intentional deadband is not applied. Typical Value = true.
     */
    private Boolean sdb1; // Boolean

    public Boolean getSdb1() {
        return sdb1;
    }

    public void setSdb1(Boolean _value_) {
        sdb1 = _value_;
    }

    private static Object getSdb1(BaseClass _this_) {
        return ((GovSteam1) _this_).getSdb1();
    }

    private static void setSdb1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((GovSteam1) _this_).setSdb1((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setSdb1(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Unintentional deadband location. true = intentional deadband is applied before point `A` false = intentional deadband is applied after point `A`. Typical Value = true.
     */
    private Boolean sdb2; // Boolean

    public Boolean getSdb2() {
        return sdb2;
    }

    public void setSdb2(Boolean _value_) {
        sdb2 = _value_;
    }

    private static Object getSdb2(BaseClass _this_) {
        return ((GovSteam1) _this_).getSdb2();
    }

    private static void setSdb2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((GovSteam1) _this_).setSdb2((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setSdb2(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Governor lag time constant (T1).  Typical Value = 0.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((GovSteam1) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Governor lead time constant (T2).  Typical Value = 0.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    private static Object getT2(BaseClass _this_) {
        return ((GovSteam1) _this_).getT2();
    }

    private static void setT2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setT2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setT2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Valve positioner time constant (T3(>0).  Typical Value = 0.1.
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    private static Object getT3(BaseClass _this_) {
        return ((GovSteam1) _this_).getT3();
    }

    private static void setT3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setT3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setT3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Inlet piping/steam bowl time constant (T4).  Typical Value = 0.3.
     */
    private Double t4; // Seconds

    public Double getT4() {
        return t4;
    }

    public void setT4(Double _value_) {
        t4 = _value_;
    }

    private static Object getT4(BaseClass _this_) {
        return ((GovSteam1) _this_).getT4();
    }

    private static void setT4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setT4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setT4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant of second boiler pass (T5).  Typical Value = 5.
     */
    private Double t5; // Seconds

    public Double getT5() {
        return t5;
    }

    public void setT5(Double _value_) {
        t5 = _value_;
    }

    private static Object getT5(BaseClass _this_) {
        return ((GovSteam1) _this_).getT5();
    }

    private static void setT5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setT5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setT5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant of third boiler pass (T6).  Typical Value = 0.5.
     */
    private Double t6; // Seconds

    public Double getT6() {
        return t6;
    }

    public void setT6(Double _value_) {
        t6 = _value_;
    }

    private static Object getT6(BaseClass _this_) {
        return ((GovSteam1) _this_).getT6();
    }

    private static void setT6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setT6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setT6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant of fourth boiler pass (T7).  Typical Value = 0.
     */
    private Double t7; // Seconds

    public Double getT7() {
        return t7;
    }

    public void setT7(Double _value_) {
        t7 = _value_;
    }

    private static Object getT7(BaseClass _this_) {
        return ((GovSteam1) _this_).getT7();
    }

    private static void setT7(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setT7((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setT7(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum valve closing velocity (Uc) (<0).  Unit = PU/sec.  Typical Value = -10.
     */
    private Double uc; // Simple_Float

    public Double getUc() {
        return uc;
    }

    public void setUc(Double _value_) {
        uc = _value_;
    }

    private static Object getUc(BaseClass _this_) {
        return ((GovSteam1) _this_).getUc();
    }

    private static void setUc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setUc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setUc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum valve opening velocity (Uo) (>0).  Unit = PU/sec.  Typical Value = 1.
     */
    private Double uo; // Simple_Float

    public Double getUo() {
        return uo;
    }

    public void setUo(Double _value_) {
        uo = _value_;
    }

    private static Object getUo(BaseClass _this_) {
        return ((GovSteam1) _this_).getUo();
    }

    private static void setUo(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteam1) _this_).setUo((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setUo(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear valve characteristic. true = nonlinear valve characteristic is used false = nonlinear valve characteristic is not used. Typical Value = true.
     */
    private Boolean valve; // Boolean

    public Boolean getValve() {
        return valve;
    }

    public void setValve(Boolean _value_) {
        valve = _value_;
    }

    private static Object getValve(BaseClass _this_) {
        return ((GovSteam1) _this_).getValve();
    }

    private static void setValve(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((GovSteam1) _this_).setValve((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteam1) _this_).setValve(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovSteam1", attrName));
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
                "GovSteam1", attrName, value));
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
            map.put("db1", new AttrDetails("GovSteam1.db1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getDb1, GovSteam1::setDb1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db2", new AttrDetails("GovSteam1.db2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getDb2, GovSteam1::setDb2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eps", new AttrDetails("GovSteam1.eps", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getEps, GovSteam1::setEps));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv1", new AttrDetails("GovSteam1.gv1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getGv1, GovSteam1::setGv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv2", new AttrDetails("GovSteam1.gv2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getGv2, GovSteam1::setGv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv3", new AttrDetails("GovSteam1.gv3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getGv3, GovSteam1::setGv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv4", new AttrDetails("GovSteam1.gv4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getGv4, GovSteam1::setGv4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv5", new AttrDetails("GovSteam1.gv5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getGv5, GovSteam1::setGv5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv6", new AttrDetails("GovSteam1.gv6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getGv6, GovSteam1::setGv6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k", new AttrDetails("GovSteam1.k", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getK, GovSteam1::setK));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k1", new AttrDetails("GovSteam1.k1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getK1, GovSteam1::setK1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k2", new AttrDetails("GovSteam1.k2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getK2, GovSteam1::setK2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k3", new AttrDetails("GovSteam1.k3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getK3, GovSteam1::setK3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k4", new AttrDetails("GovSteam1.k4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getK4, GovSteam1::setK4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k5", new AttrDetails("GovSteam1.k5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getK5, GovSteam1::setK5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k6", new AttrDetails("GovSteam1.k6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getK6, GovSteam1::setK6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k7", new AttrDetails("GovSteam1.k7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getK7, GovSteam1::setK7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k8", new AttrDetails("GovSteam1.k8", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getK8, GovSteam1::setK8));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovSteam1.mwbase", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getMwbase, GovSteam1::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv1", new AttrDetails("GovSteam1.pgv1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getPgv1, GovSteam1::setPgv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv2", new AttrDetails("GovSteam1.pgv2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getPgv2, GovSteam1::setPgv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv3", new AttrDetails("GovSteam1.pgv3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getPgv3, GovSteam1::setPgv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv4", new AttrDetails("GovSteam1.pgv4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getPgv4, GovSteam1::setPgv4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv5", new AttrDetails("GovSteam1.pgv5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getPgv5, GovSteam1::setPgv5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv6", new AttrDetails("GovSteam1.pgv6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getPgv6, GovSteam1::setPgv6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmax", new AttrDetails("GovSteam1.pmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getPmax, GovSteam1::setPmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmin", new AttrDetails("GovSteam1.pmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getPmin, GovSteam1::setPmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("sdb1", new AttrDetails("GovSteam1.sdb1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getSdb1, GovSteam1::setSdb1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("sdb2", new AttrDetails("GovSteam1.sdb2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getSdb2, GovSteam1::setSdb2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("GovSteam1.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getT1, GovSteam1::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("GovSteam1.t2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getT2, GovSteam1::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("GovSteam1.t3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getT3, GovSteam1::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("GovSteam1.t4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getT4, GovSteam1::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5", new AttrDetails("GovSteam1.t5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getT5, GovSteam1::setT5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t6", new AttrDetails("GovSteam1.t6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getT6, GovSteam1::setT6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t7", new AttrDetails("GovSteam1.t7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getT7, GovSteam1::setT7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uc", new AttrDetails("GovSteam1.uc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getUc, GovSteam1::setUc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uo", new AttrDetails("GovSteam1.uo", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getUo, GovSteam1::setUo));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("valve", new AttrDetails("GovSteam1.valve", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::getValve, GovSteam1::setValve));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovSteam1(null).allAttrDetailsMap());
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
