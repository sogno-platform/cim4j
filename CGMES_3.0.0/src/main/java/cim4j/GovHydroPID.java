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
 * PID governor and turbine.
 */
@SuppressWarnings("unused")
public class GovHydroPID extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydroPID.class);

    /**
     * Constructor.
     */
    public GovHydroPID(String rdfid) {
        super("GovHydroPID", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovHydroPID(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Turbine numerator multiplier (<i>Aturb</i>) (see parameter detail 3).  Typical value -1.
     */
    private Double aturb; // PU

    public Double getAturb() {
        return aturb;
    }

    public void setAturb(Double _value_) {
        aturb = _value_;
    }

    private static Object getAturb(BaseClass _this_) {
        return ((GovHydroPID) _this_).getAturb();
    }

    private static void setAturb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setAturb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setAturb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Turbine denominator multiplier (<i>Bturb</i>) (see parameter detail 3).  Typical value = 0,5.
     */
    private Double bturb; // PU

    public Double getBturb() {
        return bturb;
    }

    public void setBturb(Double _value_) {
        bturb = _value_;
    }

    private static Object getBturb(BaseClass _this_) {
        return ((GovHydroPID) _this_).getBturb();
    }

    private static void setBturb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setBturb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setBturb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
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
        return ((GovHydroPID) _this_).getDb1();
    }

    private static void setDb1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setDb1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setDb1(getDoubleFromString((String) _value_));
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
        return ((GovHydroPID) _this_).getDb2();
    }

    private static void setDb2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setDb2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setDb2(getDoubleFromString((String) _value_));
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
        return ((GovHydroPID) _this_).getEps();
    }

    private static void setEps(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setEps((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setEps(getDoubleFromString((String) _value_));
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
        return ((GovHydroPID) _this_).getGv1();
    }

    private static void setGv1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setGv1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setGv1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 2, PU gv (<i>Gv2</i>).  Typical value = 0.
     */
    private Double gv2; // PU

    public Double getGv2() {
        return gv2;
    }

    public void setGv2(Double _value_) {
        gv2 = _value_;
    }

    private static Object getGv2(BaseClass _this_) {
        return ((GovHydroPID) _this_).getGv2();
    }

    private static void setGv2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setGv2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setGv2(getDoubleFromString((String) _value_));
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
        return ((GovHydroPID) _this_).getGv3();
    }

    private static void setGv3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setGv3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setGv3(getDoubleFromString((String) _value_));
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
        return ((GovHydroPID) _this_).getGv4();
    }

    private static void setGv4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setGv4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setGv4(getDoubleFromString((String) _value_));
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
        return ((GovHydroPID) _this_).getGv5();
    }

    private static void setGv5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setGv5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setGv5(getDoubleFromString((String) _value_));
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
        return ((GovHydroPID) _this_).getGv6();
    }

    private static void setGv6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setGv6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setGv6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Input signal switch (<i>Flag</i>).  true = <i>Pe</i> input is used false = feedback is received from <i>CV</i>. <i>Flag</i> is normally dependent on <i>Tt</i>.  If <i>Tt </i>is zero, <i>Flag</i> is set to false. If <i>Tt</i> is not zero, <i>Flag</i> is set to true.   Typical value = true.
     */
    private Boolean inputSignal; // Boolean

    public Boolean getInputSignal() {
        return inputSignal;
    }

    public void setInputSignal(Boolean _value_) {
        inputSignal = _value_;
    }

    private static Object getInputSignal(BaseClass _this_) {
        return ((GovHydroPID) _this_).getInputSignal();
    }

    private static void setInputSignal(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((GovHydroPID) _this_).setInputSignal((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setInputSignal(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Derivative gain (<i>Kd</i>).  Typical value = 1,11.
     */
    private Double kd; // PU

    public Double getKd() {
        return kd;
    }

    public void setKd(Double _value_) {
        kd = _value_;
    }

    private static Object getKd(BaseClass _this_) {
        return ((GovHydroPID) _this_).getKd();
    }

    private static void setKd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setKd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setKd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gate servo gain (<i>Kg</i>).  Typical value = 2,5.
     */
    private Double kg; // PU

    public Double getKg() {
        return kg;
    }

    public void setKg(Double _value_) {
        kg = _value_;
    }

    private static Object getKg(BaseClass _this_) {
        return ((GovHydroPID) _this_).getKg();
    }

    private static void setKg(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setKg((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setKg(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Integral gain (<i>Ki</i>).  Typical value = 0,36.
     */
    private Double ki; // PU

    public Double getKi() {
        return ki;
    }

    public void setKi(Double _value_) {
        ki = _value_;
    }

    private static Object getKi(BaseClass _this_) {
        return ((GovHydroPID) _this_).getKi();
    }

    private static void setKi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setKi((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setKi(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Proportional gain (<i>Kp</i>).  Typical value = 0,1.
     */
    private Double kp; // PU

    public Double getKp() {
        return kp;
    }

    public void setKp(Double _value_) {
        kp = _value_;
    }

    private static Object getKp(BaseClass _this_) {
        return ((GovHydroPID) _this_).getKp();
    }

    private static void setKp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setKp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setKp(getDoubleFromString((String) _value_));
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
        return ((GovHydroPID) _this_).getMwbase();
    }

    private static void setMwbase(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setMwbase((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setMwbase(getDoubleFromString((String) _value_));
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
        return ((GovHydroPID) _this_).getPgv1();
    }

    private static void setPgv1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setPgv1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setPgv1(getDoubleFromString((String) _value_));
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
        return ((GovHydroPID) _this_).getPgv2();
    }

    private static void setPgv2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setPgv2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setPgv2(getDoubleFromString((String) _value_));
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
        return ((GovHydroPID) _this_).getPgv3();
    }

    private static void setPgv3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setPgv3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setPgv3(getDoubleFromString((String) _value_));
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
        return ((GovHydroPID) _this_).getPgv4();
    }

    private static void setPgv4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setPgv4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setPgv4(getDoubleFromString((String) _value_));
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
        return ((GovHydroPID) _this_).getPgv5();
    }

    private static void setPgv5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setPgv5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setPgv5(getDoubleFromString((String) _value_));
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
        return ((GovHydroPID) _this_).getPgv6();
    }

    private static void setPgv6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setPgv6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setPgv6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum gate opening, PU of MWbase (<i>Pmax</i>) (&gt; GovHydroPID.pmin).  Typical value = 1.
     */
    private Double pmax; // PU

    public Double getPmax() {
        return pmax;
    }

    public void setPmax(Double _value_) {
        pmax = _value_;
    }

    private static Object getPmax(BaseClass _this_) {
        return ((GovHydroPID) _this_).getPmax();
    }

    private static void setPmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setPmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setPmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum gate opening, PU of MWbase (<i>Pmin</i>) (&lt; GovHydroPID.pmax).  Typical value = 0.
     */
    private Double pmin; // PU

    public Double getPmin() {
        return pmin;
    }

    public void setPmin(Double _value_) {
        pmin = _value_;
    }

    private static Object getPmin(BaseClass _this_) {
        return ((GovHydroPID) _this_).getPmin();
    }

    private static void setPmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setPmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setPmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Steady state droop (<i>R</i>).  Typical value = 0,05.
     */
    private Double r; // PU

    public Double getR() {
        return r;
    }

    public void setR(Double _value_) {
        r = _value_;
    }

    private static Object getR(BaseClass _this_) {
        return ((GovHydroPID) _this_).getR();
    }

    private static void setR(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setR((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setR(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Input filter time constant (<i>Td</i>) (&gt;= 0).  If = 0, block is bypassed.  Typical value = 0.
     */
    private Double td; // Seconds

    public Double getTd() {
        return td;
    }

    public void setTd(Double _value_) {
        td = _value_;
    }

    private static Object getTd(BaseClass _this_) {
        return ((GovHydroPID) _this_).getTd();
    }

    private static void setTd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setTd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setTd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Washout time constant (<i>Tf</i>) (&gt;= 0).  Typical value = 0,1.
     */
    private Double tf; // Seconds

    public Double getTf() {
        return tf;
    }

    public void setTf(Double _value_) {
        tf = _value_;
    }

    private static Object getTf(BaseClass _this_) {
        return ((GovHydroPID) _this_).getTf();
    }

    private static void setTf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setTf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setTf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gate servo time constant (<i>Tp</i>) (&gt;= 0).  If = 0, block is bypassed.  Typical value = 0,35.
     */
    private Double tp; // Seconds

    public Double getTp() {
        return tp;
    }

    public void setTp(Double _value_) {
        tp = _value_;
    }

    private static Object getTp(BaseClass _this_) {
        return ((GovHydroPID) _this_).getTp();
    }

    private static void setTp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setTp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setTp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Power feedback time constant (<i>Tt</i>) (&gt;= 0).  If = 0, block is bypassed.  Typical value = 0,02.
     */
    private Double tt; // Seconds

    public Double getTt() {
        return tt;
    }

    public void setTt(Double _value_) {
        tt = _value_;
    }

    private static Object getTt(BaseClass _this_) {
        return ((GovHydroPID) _this_).getTt();
    }

    private static void setTt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setTt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setTt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Turbine time constant (<i>Tturb</i>) (&gt;= 0). See Parameter detail 3.  Typical value = 0,8.
     */
    private Double tturb; // Seconds

    public Double getTturb() {
        return tturb;
    }

    public void setTturb(Double _value_) {
        tturb = _value_;
    }

    private static Object getTturb(BaseClass _this_) {
        return ((GovHydroPID) _this_).getTturb();
    }

    private static void setTturb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID) _this_).setTturb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setTturb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum gate closing velocity (<i>Velcl</i>).  Unit = PU / s.  Typical value = -0,14.
     */
    private Float velcl; // Float

    public Float getVelcl() {
        return velcl;
    }

    public void setVelcl(Float _value_) {
        velcl = _value_;
    }

    private static Object getVelcl(BaseClass _this_) {
        return ((GovHydroPID) _this_).getVelcl();
    }

    private static void setVelcl(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovHydroPID) _this_).setVelcl((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setVelcl(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Maximum gate opening velocity (<i>Velop</i>).  Unit = PU / s.  Typical value = 0,09.
     */
    private Float velop; // Float

    public Float getVelop() {
        return velop;
    }

    public void setVelop(Float _value_) {
        velop = _value_;
    }

    private static Object getVelop(BaseClass _this_) {
        return ((GovHydroPID) _this_).getVelop();
    }

    private static void setVelop(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovHydroPID) _this_).setVelop((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID) _this_).setVelop(getFloatFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovHydroPID", attrName));
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
                "GovHydroPID", attrName, value));
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
            map.put("aturb", new AttrDetails("GovHydroPID.aturb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getAturb, GovHydroPID::setAturb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bturb", new AttrDetails("GovHydroPID.bturb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getBturb, GovHydroPID::setBturb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db1", new AttrDetails("GovHydroPID.db1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getDb1, GovHydroPID::setDb1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db2", new AttrDetails("GovHydroPID.db2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getDb2, GovHydroPID::setDb2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eps", new AttrDetails("GovHydroPID.eps", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getEps, GovHydroPID::setEps));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv1", new AttrDetails("GovHydroPID.gv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getGv1, GovHydroPID::setGv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv2", new AttrDetails("GovHydroPID.gv2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getGv2, GovHydroPID::setGv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv3", new AttrDetails("GovHydroPID.gv3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getGv3, GovHydroPID::setGv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv4", new AttrDetails("GovHydroPID.gv4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getGv4, GovHydroPID::setGv4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv5", new AttrDetails("GovHydroPID.gv5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getGv5, GovHydroPID::setGv5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv6", new AttrDetails("GovHydroPID.gv6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getGv6, GovHydroPID::setGv6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("inputSignal", new AttrDetails("GovHydroPID.inputSignal", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getInputSignal, GovHydroPID::setInputSignal));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("GovHydroPID.kd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getKd, GovHydroPID::setKd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kg", new AttrDetails("GovHydroPID.kg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getKg, GovHydroPID::setKg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("GovHydroPID.ki", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getKi, GovHydroPID::setKi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("GovHydroPID.kp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getKp, GovHydroPID::setKp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovHydroPID.mwbase", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getMwbase, GovHydroPID::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv1", new AttrDetails("GovHydroPID.pgv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getPgv1, GovHydroPID::setPgv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv2", new AttrDetails("GovHydroPID.pgv2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getPgv2, GovHydroPID::setPgv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv3", new AttrDetails("GovHydroPID.pgv3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getPgv3, GovHydroPID::setPgv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv4", new AttrDetails("GovHydroPID.pgv4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getPgv4, GovHydroPID::setPgv4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv5", new AttrDetails("GovHydroPID.pgv5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getPgv5, GovHydroPID::setPgv5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv6", new AttrDetails("GovHydroPID.pgv6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getPgv6, GovHydroPID::setPgv6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmax", new AttrDetails("GovHydroPID.pmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getPmax, GovHydroPID::setPmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmin", new AttrDetails("GovHydroPID.pmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getPmin, GovHydroPID::setPmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("r", new AttrDetails("GovHydroPID.r", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getR, GovHydroPID::setR));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("td", new AttrDetails("GovHydroPID.td", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getTd, GovHydroPID::setTd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("GovHydroPID.tf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getTf, GovHydroPID::setTf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tp", new AttrDetails("GovHydroPID.tp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getTp, GovHydroPID::setTp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tt", new AttrDetails("GovHydroPID.tt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getTt, GovHydroPID::setTt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tturb", new AttrDetails("GovHydroPID.tturb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getTturb, GovHydroPID::setTturb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("velcl", new AttrDetails("GovHydroPID.velcl", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getVelcl, GovHydroPID::setVelcl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("velop", new AttrDetails("GovHydroPID.velop", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID::getVelop, GovHydroPID::setVelop));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovHydroPID(null).allAttrDetailsMap());
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
