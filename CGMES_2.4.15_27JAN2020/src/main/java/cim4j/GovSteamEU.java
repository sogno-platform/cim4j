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
 * Simplified model  of boiler and steam turbine with PID governor.
 */
@SuppressWarnings("unused")
public class GovSteamEU extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovSteamEU.class);

    /**
     * Constructor.
     */
    public GovSteamEU(String rdfid) {
        super("GovSteamEU", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovSteamEU(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Control valves rate closing limit (Chc).  Unit = PU/sec.  Typical Value = -3.3.
     */
    private Double chc; // Simple_Float

    public Double getChc() {
        return chc;
    }

    public void setChc(Double _value_) {
        chc = _value_;
    }

    private static Object getChc(BaseClass _this_) {
        return ((GovSteamEU) _this_).getChc();
    }

    private static void setChc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setChc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setChc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Control valves rate opening limit (Cho).  Unit = PU/sec.  Typical Value = 0.17.
     */
    private Double cho; // Simple_Float

    public Double getCho() {
        return cho;
    }

    public void setCho(Double _value_) {
        cho = _value_;
    }

    private static Object getCho(BaseClass _this_) {
        return ((GovSteamEU) _this_).getCho();
    }

    private static void setCho(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setCho((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setCho(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intercept valves rate closing limit (Cic).  Typical Value = -2.2.
     */
    private Double cic; // PU

    public Double getCic() {
        return cic;
    }

    public void setCic(Double _value_) {
        cic = _value_;
    }

    private static Object getCic(BaseClass _this_) {
        return ((GovSteamEU) _this_).getCic();
    }

    private static void setCic(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setCic((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setCic(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intercept valves rate opening limit (Cio).  Typical Value = 0.123.
     */
    private Double cio; // PU

    public Double getCio() {
        return cio;
    }

    public void setCio(Double _value_) {
        cio = _value_;
    }

    private static Object getCio(BaseClass _this_) {
        return ((GovSteamEU) _this_).getCio();
    }

    private static void setCio(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setCio((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setCio(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Dead band of the frequency corrector (db1).  Typical Value = 0.
     */
    private Double db1; // PU

    public Double getDb1() {
        return db1;
    }

    public void setDb1(Double _value_) {
        db1 = _value_;
    }

    private static Object getDb1(BaseClass _this_) {
        return ((GovSteamEU) _this_).getDb1();
    }

    private static void setDb1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setDb1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setDb1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Dead band of the speed governor (db2).  Typical Value = 0.0004.
     */
    private Double db2; // PU

    public Double getDb2() {
        return db2;
    }

    public void setDb2(Double _value_) {
        db2 = _value_;
    }

    private static Object getDb2(BaseClass _this_) {
        return ((GovSteamEU) _this_).getDb2();
    }

    private static void setDb2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setDb2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setDb2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum control valve position (Hhpmax).  Typical Value = 1.
     */
    private Double hhpmax; // PU

    public Double getHhpmax() {
        return hhpmax;
    }

    public void setHhpmax(Double _value_) {
        hhpmax = _value_;
    }

    private static Object getHhpmax(BaseClass _this_) {
        return ((GovSteamEU) _this_).getHhpmax();
    }

    private static void setHhpmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setHhpmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setHhpmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain of the power controller (Ke).  Typical Value = 0.65.
     */
    private Double ke; // PU

    public Double getKe() {
        return ke;
    }

    public void setKe(Double _value_) {
        ke = _value_;
    }

    private static Object getKe(BaseClass _this_) {
        return ((GovSteamEU) _this_).getKe();
    }

    private static void setKe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setKe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setKe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain of the frequency corrector (Kfcor).  Typical Value = 20.
     */
    private Double kfcor; // PU

    public Double getKfcor() {
        return kfcor;
    }

    public void setKfcor(Double _value_) {
        kfcor = _value_;
    }

    private static Object getKfcor(BaseClass _this_) {
        return ((GovSteamEU) _this_).getKfcor();
    }

    private static void setKfcor(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setKfcor((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setKfcor(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of total turbine output generated by HP part (Khp).  Typical Value = 0.277.
     */
    private Double khp; // PU

    public Double getKhp() {
        return khp;
    }

    public void setKhp(Double _value_) {
        khp = _value_;
    }

    private static Object getKhp(BaseClass _this_) {
        return ((GovSteamEU) _this_).getKhp();
    }

    private static void setKhp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setKhp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setKhp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of total turbine output generated by HP part (Klp).  Typical Value = 0.723.
     */
    private Double klp; // PU

    public Double getKlp() {
        return klp;
    }

    public void setKlp(Double _value_) {
        klp = _value_;
    }

    private static Object getKlp(BaseClass _this_) {
        return ((GovSteamEU) _this_).getKlp();
    }

    private static void setKlp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setKlp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setKlp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain of the speed governor (Kwcor).  Typical Value = 20.
     */
    private Double kwcor; // PU

    public Double getKwcor() {
        return kwcor;
    }

    public void setKwcor(Double _value_) {
        kwcor = _value_;
    }

    private static Object getKwcor(BaseClass _this_) {
        return ((GovSteamEU) _this_).getKwcor();
    }

    private static void setKwcor(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setKwcor((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setKwcor(getDoubleFromString((String) _value_));
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
        return ((GovSteamEU) _this_).getMwbase();
    }

    private static void setMwbase(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setMwbase((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setMwbase(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximal active power of the turbine (Pmax).  Typical Value = 1.
     */
    private Double pmax; // PU

    public Double getPmax() {
        return pmax;
    }

    public void setPmax(Double _value_) {
        pmax = _value_;
    }

    private static Object getPmax(BaseClass _this_) {
        return ((GovSteamEU) _this_).getPmax();
    }

    private static void setPmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setPmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setPmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum low pressure limit (Prhmax).  Typical Value = 1.4.
     */
    private Double prhmax; // PU

    public Double getPrhmax() {
        return prhmax;
    }

    public void setPrhmax(Double _value_) {
        prhmax = _value_;
    }

    private static Object getPrhmax(BaseClass _this_) {
        return ((GovSteamEU) _this_).getPrhmax();
    }

    private static void setPrhmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setPrhmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setPrhmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intercept valves transfer limit (Simx).  Typical Value = 0.425.
     */
    private Double simx; // PU

    public Double getSimx() {
        return simx;
    }

    public void setSimx(Double _value_) {
        simx = _value_;
    }

    private static Object getSimx(BaseClass _this_) {
        return ((GovSteamEU) _this_).getSimx();
    }

    private static void setSimx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setSimx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setSimx(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Boiler time constant (Tb).  Typical Value = 100.
     */
    private Double tb; // Seconds

    public Double getTb() {
        return tb;
    }

    public void setTb(Double _value_) {
        tb = _value_;
    }

    private static Object getTb(BaseClass _this_) {
        return ((GovSteamEU) _this_).getTb();
    }

    private static void setTb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setTb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setTb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Derivative time constant of the power controller (Tdp).  Typical Value = 0.
     */
    private Double tdp; // Seconds

    public Double getTdp() {
        return tdp;
    }

    public void setTdp(Double _value_) {
        tdp = _value_;
    }

    private static Object getTdp(BaseClass _this_) {
        return ((GovSteamEU) _this_).getTdp();
    }

    private static void setTdp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setTdp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setTdp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Electro hydraulic transducer (Ten).  Typical Value = 0.1.
     */
    private Double ten; // Seconds

    public Double getTen() {
        return ten;
    }

    public void setTen(Double _value_) {
        ten = _value_;
    }

    private static Object getTen(BaseClass _this_) {
        return ((GovSteamEU) _this_).getTen();
    }

    private static void setTen(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setTen((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setTen(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Frequency transducer time constant (Tf).  Typical Value = 0.
     */
    private Double tf; // Seconds

    public Double getTf() {
        return tf;
    }

    public void setTf(Double _value_) {
        tf = _value_;
    }

    private static Object getTf(BaseClass _this_) {
        return ((GovSteamEU) _this_).getTf();
    }

    private static void setTf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setTf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setTf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant of the power controller (Tfp).  Typical Value = 0.
     */
    private Double tfp; // Seconds

    public Double getTfp() {
        return tfp;
    }

    public void setTfp(Double _value_) {
        tfp = _value_;
    }

    private static Object getTfp(BaseClass _this_) {
        return ((GovSteamEU) _this_).getTfp();
    }

    private static void setTfp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setTfp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setTfp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * High pressure (HP) time constant of the turbine (Thp).  Typical Value = 0.31.
     */
    private Double thp; // Seconds

    public Double getThp() {
        return thp;
    }

    public void setThp(Double _value_) {
        thp = _value_;
    }

    private static Object getThp(BaseClass _this_) {
        return ((GovSteamEU) _this_).getThp();
    }

    private static void setThp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setThp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setThp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Integral time constant of the power controller (Tip).  Typical Value = 2.
     */
    private Double tip; // Seconds

    public Double getTip() {
        return tip;
    }

    public void setTip(Double _value_) {
        tip = _value_;
    }

    private static Object getTip(BaseClass _this_) {
        return ((GovSteamEU) _this_).getTip();
    }

    private static void setTip(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setTip((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setTip(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low pressure(LP) time constant of the turbine (Tlp).  Typical Value = 0.45.
     */
    private Double tlp; // Seconds

    public Double getTlp() {
        return tlp;
    }

    public void setTlp(Double _value_) {
        tlp = _value_;
    }

    private static Object getTlp(BaseClass _this_) {
        return ((GovSteamEU) _this_).getTlp();
    }

    private static void setTlp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setTlp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setTlp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Power transducer time constant (Tp).  Typical Value = 0.07.
     */
    private Double tp; // Seconds

    public Double getTp() {
        return tp;
    }

    public void setTp(Double _value_) {
        tp = _value_;
    }

    private static Object getTp(BaseClass _this_) {
        return ((GovSteamEU) _this_).getTp();
    }

    private static void setTp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setTp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setTp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reheater  time constant of the turbine (Trh).  Typical Value = 8.
     */
    private Double trh; // Seconds

    public Double getTrh() {
        return trh;
    }

    public void setTrh(Double _value_) {
        trh = _value_;
    }

    private static Object getTrh(BaseClass _this_) {
        return ((GovSteamEU) _this_).getTrh();
    }

    private static void setTrh(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setTrh((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setTrh(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Control valves servo time constant (Tvhp).  Typical Value = 0.1.
     */
    private Double tvhp; // Seconds

    public Double getTvhp() {
        return tvhp;
    }

    public void setTvhp(Double _value_) {
        tvhp = _value_;
    }

    private static Object getTvhp(BaseClass _this_) {
        return ((GovSteamEU) _this_).getTvhp();
    }

    private static void setTvhp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setTvhp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setTvhp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intercept valves servo time constant (Tvip).  Typical Value = 0.15.
     */
    private Double tvip; // Seconds

    public Double getTvip() {
        return tvip;
    }

    public void setTvip(Double _value_) {
        tvip = _value_;
    }

    private static Object getTvip(BaseClass _this_) {
        return ((GovSteamEU) _this_).getTvip();
    }

    private static void setTvip(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setTvip((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setTvip(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Speed transducer time constant (Tw).  Typical Value = 0.02.
     */
    private Double tw; // Seconds

    public Double getTw() {
        return tw;
    }

    public void setTw(Double _value_) {
        tw = _value_;
    }

    private static Object getTw(BaseClass _this_) {
        return ((GovSteamEU) _this_).getTw();
    }

    private static void setTw(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setTw((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setTw(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Upper limit for frequency correction (Wfmax).  Typical Value = 0.05.
     */
    private Double wfmax; // PU

    public Double getWfmax() {
        return wfmax;
    }

    public void setWfmax(Double _value_) {
        wfmax = _value_;
    }

    private static Object getWfmax(BaseClass _this_) {
        return ((GovSteamEU) _this_).getWfmax();
    }

    private static void setWfmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setWfmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setWfmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lower limit for frequency correction (Wfmin).  Typical Value = -0.05.
     */
    private Double wfmin; // PU

    public Double getWfmin() {
        return wfmin;
    }

    public void setWfmin(Double _value_) {
        wfmin = _value_;
    }

    private static Object getWfmin(BaseClass _this_) {
        return ((GovSteamEU) _this_).getWfmin();
    }

    private static void setWfmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setWfmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setWfmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Emergency speed control lower limit (wmax1).  Typical Value = 1.025.
     */
    private Double wmax1; // PU

    public Double getWmax1() {
        return wmax1;
    }

    public void setWmax1(Double _value_) {
        wmax1 = _value_;
    }

    private static Object getWmax1(BaseClass _this_) {
        return ((GovSteamEU) _this_).getWmax1();
    }

    private static void setWmax1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setWmax1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setWmax1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Emergency speed control upper limit (wmax2).  Typical Value = 1.05.
     */
    private Double wmax2; // PU

    public Double getWmax2() {
        return wmax2;
    }

    public void setWmax2(Double _value_) {
        wmax2 = _value_;
    }

    private static Object getWmax2(BaseClass _this_) {
        return ((GovSteamEU) _this_).getWmax2();
    }

    private static void setWmax2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setWmax2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setWmax2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Upper limit for the speed governor (Wwmax).  Typical Value = 0.1.
     */
    private Double wwmax; // PU

    public Double getWwmax() {
        return wwmax;
    }

    public void setWwmax(Double _value_) {
        wwmax = _value_;
    }

    private static Object getWwmax(BaseClass _this_) {
        return ((GovSteamEU) _this_).getWwmax();
    }

    private static void setWwmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setWwmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setWwmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lower limit for the speed governor frequency correction (Wwmin).  Typical Value = -1.
     */
    private Double wwmin; // PU

    public Double getWwmin() {
        return wwmin;
    }

    public void setWwmin(Double _value_) {
        wwmin = _value_;
    }

    private static Object getWwmin(BaseClass _this_) {
        return ((GovSteamEU) _this_).getWwmin();
    }

    private static void setWwmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamEU) _this_).setWwmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamEU) _this_).setWwmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovSteamEU", attrName));
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
                "GovSteamEU", attrName, value));
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
            map.put("chc", new AttrDetails("GovSteamEU.chc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getChc, GovSteamEU::setChc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("cho", new AttrDetails("GovSteamEU.cho", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getCho, GovSteamEU::setCho));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("cic", new AttrDetails("GovSteamEU.cic", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getCic, GovSteamEU::setCic));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("cio", new AttrDetails("GovSteamEU.cio", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getCio, GovSteamEU::setCio));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db1", new AttrDetails("GovSteamEU.db1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getDb1, GovSteamEU::setDb1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db2", new AttrDetails("GovSteamEU.db2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getDb2, GovSteamEU::setDb2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("hhpmax", new AttrDetails("GovSteamEU.hhpmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getHhpmax, GovSteamEU::setHhpmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("GovSteamEU.ke", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getKe, GovSteamEU::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kfcor", new AttrDetails("GovSteamEU.kfcor", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getKfcor, GovSteamEU::setKfcor));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("khp", new AttrDetails("GovSteamEU.khp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getKhp, GovSteamEU::setKhp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("klp", new AttrDetails("GovSteamEU.klp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getKlp, GovSteamEU::setKlp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kwcor", new AttrDetails("GovSteamEU.kwcor", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getKwcor, GovSteamEU::setKwcor));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovSteamEU.mwbase", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getMwbase, GovSteamEU::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmax", new AttrDetails("GovSteamEU.pmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getPmax, GovSteamEU::setPmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("prhmax", new AttrDetails("GovSteamEU.prhmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getPrhmax, GovSteamEU::setPrhmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("simx", new AttrDetails("GovSteamEU.simx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getSimx, GovSteamEU::setSimx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("GovSteamEU.tb", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getTb, GovSteamEU::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tdp", new AttrDetails("GovSteamEU.tdp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getTdp, GovSteamEU::setTdp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ten", new AttrDetails("GovSteamEU.ten", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getTen, GovSteamEU::setTen));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("GovSteamEU.tf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getTf, GovSteamEU::setTf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tfp", new AttrDetails("GovSteamEU.tfp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getTfp, GovSteamEU::setTfp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("thp", new AttrDetails("GovSteamEU.thp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getThp, GovSteamEU::setThp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tip", new AttrDetails("GovSteamEU.tip", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getTip, GovSteamEU::setTip));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tlp", new AttrDetails("GovSteamEU.tlp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getTlp, GovSteamEU::setTlp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tp", new AttrDetails("GovSteamEU.tp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getTp, GovSteamEU::setTp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("trh", new AttrDetails("GovSteamEU.trh", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getTrh, GovSteamEU::setTrh));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tvhp", new AttrDetails("GovSteamEU.tvhp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getTvhp, GovSteamEU::setTvhp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tvip", new AttrDetails("GovSteamEU.tvip", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getTvip, GovSteamEU::setTvip));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw", new AttrDetails("GovSteamEU.tw", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getTw, GovSteamEU::setTw));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("wfmax", new AttrDetails("GovSteamEU.wfmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getWfmax, GovSteamEU::setWfmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("wfmin", new AttrDetails("GovSteamEU.wfmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getWfmin, GovSteamEU::setWfmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("wmax1", new AttrDetails("GovSteamEU.wmax1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getWmax1, GovSteamEU::setWmax1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("wmax2", new AttrDetails("GovSteamEU.wmax2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getWmax2, GovSteamEU::setWmax2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("wwmax", new AttrDetails("GovSteamEU.wwmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getWwmax, GovSteamEU::setWwmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("wwmin", new AttrDetails("GovSteamEU.wwmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::getWwmin, GovSteamEU::setWwmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovSteamEU(null).allAttrDetailsMap());
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
