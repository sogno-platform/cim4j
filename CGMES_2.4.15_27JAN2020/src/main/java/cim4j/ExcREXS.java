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
 * General Purpose Rotating Excitation System Model.  This model can be used to represent a wide range of excitation systems whose DC power source is an AC or DC generator. It encompasses IEEE type AC1, AC2, DC1, and DC2 excitation system models.
 */
@SuppressWarnings("unused")
public class ExcREXS extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcREXS.class);

    /**
     * Constructor.
     */
    public ExcREXS(String rdfid) {
        super("ExcREXS", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcREXS(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Field voltage value 1 (E1).  Typical Value = 3.
     */
    private Double e1; // PU

    public Double getE1() {
        return e1;
    }

    public void setE1(Double _value_) {
        e1 = _value_;
    }

    private static Object getE1(BaseClass _this_) {
        return ((ExcREXS) _this_).getE1();
    }

    private static void setE1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setE1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setE1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Field voltage value 2 (E2).  Typical Value = 4.
     */
    private Double e2; // PU

    public Double getE2() {
        return e2;
    }

    public void setE2(Double _value_) {
        e2 = _value_;
    }

    private static Object getE2(BaseClass _this_) {
        return ((ExcREXS) _this_).getE2();
    }

    private static void setE2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setE2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setE2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rate feedback signal flag (Fbf). Typical Value = fieldCurrent.
     */
    private String fbf; // ExcREXSFeedbackSignalKind

    public String getFbf() {
        return fbf;
    }

    public void setFbf(String _value_) {
        fbf = _value_;
    }

    private static Object getFbf(BaseClass _this_) {
        return ((ExcREXS) _this_).getFbf();
    }

    private static void setFbf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ExcREXS) _this_).setFbf((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Limit type flag (Flimf).  Typical Value = 0.
     */
    private Double flimf; // PU

    public Double getFlimf() {
        return flimf;
    }

    public void setFlimf(Double _value_) {
        flimf = _value_;
    }

    private static Object getFlimf(BaseClass _this_) {
        return ((ExcREXS) _this_).getFlimf();
    }

    private static void setFlimf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setFlimf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setFlimf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rectifier regulation factor (Kc).  Typical Value = 0.05.
     */
    private Double kc; // PU

    public Double getKc() {
        return kc;
    }

    public void setKc(Double _value_) {
        kc = _value_;
    }

    private static Object getKc(BaseClass _this_) {
        return ((ExcREXS) _this_).getKc();
    }

    private static void setKc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setKc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setKc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter regulation factor (Kd).  Typical Value = 2.
     */
    private Double kd; // PU

    public Double getKd() {
        return kd;
    }

    public void setKd(Double _value_) {
        kd = _value_;
    }

    private static Object getKd(BaseClass _this_) {
        return ((ExcREXS) _this_).getKd();
    }

    private static void setKd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setKd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setKd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter field proportional constant (Ke).  Typical Value = 1.
     */
    private Double ke; // PU

    public Double getKe() {
        return ke;
    }

    public void setKe(Double _value_) {
        ke = _value_;
    }

    private static Object getKe(BaseClass _this_) {
        return ((ExcREXS) _this_).getKe();
    }

    private static void setKe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setKe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setKe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Field voltage feedback gain (Kefd).  Typical Value = 0.
     */
    private Double kefd; // PU

    public Double getKefd() {
        return kefd;
    }

    public void setKefd(Double _value_) {
        kefd = _value_;
    }

    private static Object getKefd(BaseClass _this_) {
        return ((ExcREXS) _this_).getKefd();
    }

    private static void setKefd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setKefd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setKefd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rate feedback gain (Kf).  Typical Value = 0.05.
     */
    private Double kf; // Seconds

    public Double getKf() {
        return kf;
    }

    public void setKf(Double _value_) {
        kf = _value_;
    }

    private static Object getKf(BaseClass _this_) {
        return ((ExcREXS) _this_).getKf();
    }

    private static void setKf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setKf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setKf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Field voltage controller feedback gain (Kh).  Typical Value = 0.
     */
    private Double kh; // PU

    public Double getKh() {
        return kh;
    }

    public void setKh(Double _value_) {
        kh = _value_;
    }

    private static Object getKh(BaseClass _this_) {
        return ((ExcREXS) _this_).getKh();
    }

    private static void setKh(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setKh((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setKh(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Field Current Regulator Integral Gain (Kii).  Typical Value = 0.
     */
    private Double kii; // PU

    public Double getKii() {
        return kii;
    }

    public void setKii(Double _value_) {
        kii = _value_;
    }

    private static Object getKii(BaseClass _this_) {
        return ((ExcREXS) _this_).getKii();
    }

    private static void setKii(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setKii((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setKii(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Field Current Regulator Proportional Gain (Kip).  Typical Value = 1.
     */
    private Double kip; // PU

    public Double getKip() {
        return kip;
    }

    public void setKip(Double _value_) {
        kip = _value_;
    }

    private static Object getKip(BaseClass _this_) {
        return ((ExcREXS) _this_).getKip();
    }

    private static void setKip(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setKip((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setKip(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Coefficient to allow different usage of the model-speed coefficient (Ks).  Typical Value = 0.
     */
    private Double ks; // PU

    public Double getKs() {
        return ks;
    }

    public void setKs(Double _value_) {
        ks = _value_;
    }

    private static Object getKs(BaseClass _this_) {
        return ((ExcREXS) _this_).getKs();
    }

    private static void setKs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setKs((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setKs(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage Regulator Integral Gain (Kvi).  Typical Value = 0.
     */
    private Double kvi; // PU

    public Double getKvi() {
        return kvi;
    }

    public void setKvi(Double _value_) {
        kvi = _value_;
    }

    private static Object getKvi(BaseClass _this_) {
        return ((ExcREXS) _this_).getKvi();
    }

    private static void setKvi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setKvi((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setKvi(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage Regulator Proportional Gain (Kvp).  Typical Value = 2800.
     */
    private Double kvp; // PU

    public Double getKvp() {
        return kvp;
    }

    public void setKvp(Double _value_) {
        kvp = _value_;
    }

    private static Object getKvp(BaseClass _this_) {
        return ((ExcREXS) _this_).getKvp();
    }

    private static void setKvp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setKvp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setKvp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * V/Hz limiter gain (Kvphz).  Typical Value = 0.
     */
    private Double kvphz; // PU

    public Double getKvphz() {
        return kvphz;
    }

    public void setKvphz(Double _value_) {
        kvphz = _value_;
    }

    private static Object getKvphz(BaseClass _this_) {
        return ((ExcREXS) _this_).getKvphz();
    }

    private static void setKvphz(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setKvphz((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setKvphz(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Pickup speed of V/Hz limiter (Nvphz).  Typical Value = 0.
     */
    private Double nvphz; // PU

    public Double getNvphz() {
        return nvphz;
    }

    public void setNvphz(Double _value_) {
        nvphz = _value_;
    }

    private static Object getNvphz(BaseClass _this_) {
        return ((ExcREXS) _this_).getNvphz();
    }

    private static void setNvphz(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setNvphz((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setNvphz(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Saturation factor at E1 (Se1).  Typical Value = 0.0001.
     */
    private Double se1; // PU

    public Double getSe1() {
        return se1;
    }

    public void setSe1(Double _value_) {
        se1 = _value_;
    }

    private static Object getSe1(BaseClass _this_) {
        return ((ExcREXS) _this_).getSe1();
    }

    private static void setSe1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setSe1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setSe1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Saturation factor at E2 (Se2).  Typical Value = 0.001.
     */
    private Double se2; // PU

    public Double getSe2() {
        return se2;
    }

    public void setSe2(Double _value_) {
        se2 = _value_;
    }

    private static Object getSe2(BaseClass _this_) {
        return ((ExcREXS) _this_).getSe2();
    }

    private static void setSe2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setSe2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setSe2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage Regulator time constant (Ta).  Typical Value = 0.01.
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((ExcREXS) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setTa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lag time constant (Tb1).  Typical Value = 0.
     */
    private Double tb1; // Seconds

    public Double getTb1() {
        return tb1;
    }

    public void setTb1(Double _value_) {
        tb1 = _value_;
    }

    private static Object getTb1(BaseClass _this_) {
        return ((ExcREXS) _this_).getTb1();
    }

    private static void setTb1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setTb1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setTb1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lag time constant (Tb2).  Typical Value = 0.
     */
    private Double tb2; // Seconds

    public Double getTb2() {
        return tb2;
    }

    public void setTb2(Double _value_) {
        tb2 = _value_;
    }

    private static Object getTb2(BaseClass _this_) {
        return ((ExcREXS) _this_).getTb2();
    }

    private static void setTb2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setTb2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setTb2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead time constant (Tc1).  Typical Value = 0.
     */
    private Double tc1; // Seconds

    public Double getTc1() {
        return tc1;
    }

    public void setTc1(Double _value_) {
        tc1 = _value_;
    }

    private static Object getTc1(BaseClass _this_) {
        return ((ExcREXS) _this_).getTc1();
    }

    private static void setTc1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setTc1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setTc1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead time constant (Tc2).  Typical Value = 0.
     */
    private Double tc2; // Seconds

    public Double getTc2() {
        return tc2;
    }

    public void setTc2(Double _value_) {
        tc2 = _value_;
    }

    private static Object getTc2(BaseClass _this_) {
        return ((ExcREXS) _this_).getTc2();
    }

    private static void setTc2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setTc2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setTc2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter field time constant (Te).  Typical Value = 1.2.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    private static Object getTe(BaseClass _this_) {
        return ((ExcREXS) _this_).getTe();
    }

    private static void setTe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setTe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setTe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rate feedback time constant (Tf).  Typical Value = 1.
     */
    private Double tf; // Seconds

    public Double getTf() {
        return tf;
    }

    public void setTf(Double _value_) {
        tf = _value_;
    }

    private static Object getTf(BaseClass _this_) {
        return ((ExcREXS) _this_).getTf();
    }

    private static void setTf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setTf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setTf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Feedback lead time constant (Tf1).  Typical Value = 0.
     */
    private Double tf1; // Seconds

    public Double getTf1() {
        return tf1;
    }

    public void setTf1(Double _value_) {
        tf1 = _value_;
    }

    private static Object getTf1(BaseClass _this_) {
        return ((ExcREXS) _this_).getTf1();
    }

    private static void setTf1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setTf1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setTf1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Feedback lag time constant (Tf2).  Typical Value = 0.
     */
    private Double tf2; // Seconds

    public Double getTf2() {
        return tf2;
    }

    public void setTf2(Double _value_) {
        tf2 = _value_;
    }

    private static Object getTf2(BaseClass _this_) {
        return ((ExcREXS) _this_).getTf2();
    }

    private static void setTf2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setTf2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setTf2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Field current Bridge time constant (Tp).  Typical Value = 0.
     */
    private Double tp; // Seconds

    public Double getTp() {
        return tp;
    }

    public void setTp(Double _value_) {
        tp = _value_;
    }

    private static Object getTp(BaseClass _this_) {
        return ((ExcREXS) _this_).getTp();
    }

    private static void setTp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setTp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setTp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum compounding voltage (Vcmax).  Typical Value = 0.
     */
    private Double vcmax; // PU

    public Double getVcmax() {
        return vcmax;
    }

    public void setVcmax(Double _value_) {
        vcmax = _value_;
    }

    private static Object getVcmax(BaseClass _this_) {
        return ((ExcREXS) _this_).getVcmax();
    }

    private static void setVcmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setVcmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setVcmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum Exciter Field Current (Vfmax).  Typical Value = 47.
     */
    private Double vfmax; // PU

    public Double getVfmax() {
        return vfmax;
    }

    public void setVfmax(Double _value_) {
        vfmax = _value_;
    }

    private static Object getVfmax(BaseClass _this_) {
        return ((ExcREXS) _this_).getVfmax();
    }

    private static void setVfmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setVfmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setVfmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum Exciter Field Current (Vfmin).  Typical Value = -20.
     */
    private Double vfmin; // PU

    public Double getVfmin() {
        return vfmin;
    }

    public void setVfmin(Double _value_) {
        vfmin = _value_;
    }

    private static Object getVfmin(BaseClass _this_) {
        return ((ExcREXS) _this_).getVfmin();
    }

    private static void setVfmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setVfmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setVfmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage Regulator Input Limit (Vimax).  Typical Value = 0.1.
     */
    private Double vimax; // PU

    public Double getVimax() {
        return vimax;
    }

    public void setVimax(Double _value_) {
        vimax = _value_;
    }

    private static Object getVimax(BaseClass _this_) {
        return ((ExcREXS) _this_).getVimax();
    }

    private static void setVimax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setVimax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setVimax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum controller output (Vrmax).  Typical Value = 47.
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    private static Object getVrmax(BaseClass _this_) {
        return ((ExcREXS) _this_).getVrmax();
    }

    private static void setVrmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setVrmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setVrmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum controller output (Vrmin).  Typical Value = -20.
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    private static Object getVrmin(BaseClass _this_) {
        return ((ExcREXS) _this_).getVrmin();
    }

    private static void setVrmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setVrmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setVrmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter compounding reactance (Xc).  Typical Value = 0.
     */
    private Double xc; // PU

    public Double getXc() {
        return xc;
    }

    public void setXc(Double _value_) {
        xc = _value_;
    }

    private static Object getXc(BaseClass _this_) {
        return ((ExcREXS) _this_).getXc();
    }

    private static void setXc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcREXS) _this_).setXc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcREXS) _this_).setXc(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcREXS", attrName));
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
                "ExcREXS", attrName, value));
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
            map.put("e1", new AttrDetails("ExcREXS.e1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getE1, ExcREXS::setE1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("e2", new AttrDetails("ExcREXS.e2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getE2, ExcREXS::setE2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fbf", new AttrDetails("ExcREXS.fbf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, ExcREXS::getFbf, ExcREXS::setFbf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("flimf", new AttrDetails("ExcREXS.flimf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getFlimf, ExcREXS::setFlimf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("ExcREXS.kc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getKc, ExcREXS::setKc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("ExcREXS.kd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getKd, ExcREXS::setKd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcREXS.ke", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getKe, ExcREXS::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kefd", new AttrDetails("ExcREXS.kefd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getKefd, ExcREXS::setKefd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("ExcREXS.kf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getKf, ExcREXS::setKf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh", new AttrDetails("ExcREXS.kh", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getKh, ExcREXS::setKh));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kii", new AttrDetails("ExcREXS.kii", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getKii, ExcREXS::setKii));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kip", new AttrDetails("ExcREXS.kip", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getKip, ExcREXS::setKip));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks", new AttrDetails("ExcREXS.ks", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getKs, ExcREXS::setKs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kvi", new AttrDetails("ExcREXS.kvi", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getKvi, ExcREXS::setKvi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kvp", new AttrDetails("ExcREXS.kvp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getKvp, ExcREXS::setKvp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kvphz", new AttrDetails("ExcREXS.kvphz", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getKvphz, ExcREXS::setKvphz));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("nvphz", new AttrDetails("ExcREXS.nvphz", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getNvphz, ExcREXS::setNvphz));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("se1", new AttrDetails("ExcREXS.se1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getSe1, ExcREXS::setSe1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("se2", new AttrDetails("ExcREXS.se2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getSe2, ExcREXS::setSe2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("ExcREXS.ta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getTa, ExcREXS::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb1", new AttrDetails("ExcREXS.tb1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getTb1, ExcREXS::setTb1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb2", new AttrDetails("ExcREXS.tb2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getTb2, ExcREXS::setTb2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc1", new AttrDetails("ExcREXS.tc1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getTc1, ExcREXS::setTc1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc2", new AttrDetails("ExcREXS.tc2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getTc2, ExcREXS::setTc2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcREXS.te", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getTe, ExcREXS::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("ExcREXS.tf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getTf, ExcREXS::setTf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf1", new AttrDetails("ExcREXS.tf1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getTf1, ExcREXS::setTf1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf2", new AttrDetails("ExcREXS.tf2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getTf2, ExcREXS::setTf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tp", new AttrDetails("ExcREXS.tp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getTp, ExcREXS::setTp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vcmax", new AttrDetails("ExcREXS.vcmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getVcmax, ExcREXS::setVcmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vfmax", new AttrDetails("ExcREXS.vfmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getVfmax, ExcREXS::setVfmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vfmin", new AttrDetails("ExcREXS.vfmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getVfmin, ExcREXS::setVfmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimax", new AttrDetails("ExcREXS.vimax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getVimax, ExcREXS::setVimax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcREXS.vrmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getVrmax, ExcREXS::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcREXS.vrmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getVrmin, ExcREXS::setVrmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xc", new AttrDetails("ExcREXS.xc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcREXS::getXc, ExcREXS::setXc));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcREXS(null).allAttrDetailsMap());
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
