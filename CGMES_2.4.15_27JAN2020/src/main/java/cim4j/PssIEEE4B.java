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
 * The class represents IEEE Std 421.5-2005 type PSS2B power system stabilizer model. The PSS4B model represents a structure based on multiple working frequency bands. Three separate bands, respectively dedicated to the low-, intermediate- and high-frequency modes of oscillations, are used in this delta-omega (speed input) PSS.  Reference: IEEE 4B 421.5-2005 Section 8.4.
 */
@SuppressWarnings("unused")
public class PssIEEE4B extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssIEEE4B.class);

    /**
     * Constructor.
     */
    public PssIEEE4B(String rdfid) {
        super("PssIEEE4B", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected PssIEEE4B(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Notch filter 1 (high-frequency band): Three dB bandwidth (B).
     */
    private Double bwh1; // Simple_Float

    public Double getBwh1() {
        return bwh1;
    }

    public void setBwh1(Double _value_) {
        bwh1 = _value_;
    }

    private static Object getBwh1(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getBwh1();
    }

    private static void setBwh1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setBwh1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setBwh1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Notch filter 2 (high-frequency band): Three dB bandwidth (B).
     */
    private Double bwh2; // Simple_Float

    public Double getBwh2() {
        return bwh2;
    }

    public void setBwh2(Double _value_) {
        bwh2 = _value_;
    }

    private static Object getBwh2(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getBwh2();
    }

    private static void setBwh2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setBwh2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setBwh2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Notch filter 1 (low-frequency band): Three dB bandwidth (B).
     */
    private Double bwl1; // Simple_Float

    public Double getBwl1() {
        return bwl1;
    }

    public void setBwl1(Double _value_) {
        bwl1 = _value_;
    }

    private static Object getBwl1(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getBwl1();
    }

    private static void setBwl1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setBwl1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setBwl1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Notch filter 2 (low-frequency band): Three dB bandwidth (B).
     */
    private Double bwl2; // Simple_Float

    public Double getBwl2() {
        return bwl2;
    }

    public void setBwl2(Double _value_) {
        bwl2 = _value_;
    }

    private static Object getBwl2(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getBwl2();
    }

    private static void setBwl2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setBwl2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setBwl2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * High band gain (K).  Typical Value = 120.
     */
    private Double kh; // PU

    public Double getKh() {
        return kh;
    }

    public void setKh(Double _value_) {
        kh = _value_;
    }

    private static Object getKh(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getKh();
    }

    private static void setKh(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setKh((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setKh(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * High band differential filter gain (K).  Typical Value = 66.
     */
    private Double kh1; // PU

    public Double getKh1() {
        return kh1;
    }

    public void setKh1(Double _value_) {
        kh1 = _value_;
    }

    private static Object getKh1(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getKh1();
    }

    private static void setKh1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setKh1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setKh1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * High band first lead-lag blocks coefficient (K).  Typical Value = 1.
     */
    private Double kh11; // PU

    public Double getKh11() {
        return kh11;
    }

    public void setKh11(Double _value_) {
        kh11 = _value_;
    }

    private static Object getKh11(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getKh11();
    }

    private static void setKh11(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setKh11((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setKh11(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * High band first lead-lag blocks coefficient (K).  Typical Value = 1.
     */
    private Double kh17; // PU

    public Double getKh17() {
        return kh17;
    }

    public void setKh17(Double _value_) {
        kh17 = _value_;
    }

    private static Object getKh17(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getKh17();
    }

    private static void setKh17(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setKh17((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setKh17(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * High band differential filter gain (K).  Typical Value = 66.
     */
    private Double kh2; // PU

    public Double getKh2() {
        return kh2;
    }

    public void setKh2(Double _value_) {
        kh2 = _value_;
    }

    private static Object getKh2(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getKh2();
    }

    private static void setKh2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setKh2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setKh2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intermediate band gain (K).  Typical Value = 30.
     */
    private Double ki; // PU

    public Double getKi() {
        return ki;
    }

    public void setKi(Double _value_) {
        ki = _value_;
    }

    private static Object getKi(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getKi();
    }

    private static void setKi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setKi((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setKi(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intermediate band differential filter gain (K).  Typical Value = 66.
     */
    private Double ki1; // PU

    public Double getKi1() {
        return ki1;
    }

    public void setKi1(Double _value_) {
        ki1 = _value_;
    }

    private static Object getKi1(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getKi1();
    }

    private static void setKi1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setKi1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setKi1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intermediate band first lead-lag blocks coefficient (K).  Typical Value = 1.
     */
    private Double ki11; // PU

    public Double getKi11() {
        return ki11;
    }

    public void setKi11(Double _value_) {
        ki11 = _value_;
    }

    private static Object getKi11(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getKi11();
    }

    private static void setKi11(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setKi11((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setKi11(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intermediate band first lead-lag blocks coefficient (K).  Typical Value = 1.
     */
    private Double ki17; // PU

    public Double getKi17() {
        return ki17;
    }

    public void setKi17(Double _value_) {
        ki17 = _value_;
    }

    private static Object getKi17(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getKi17();
    }

    private static void setKi17(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setKi17((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setKi17(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intermediate band differential filter gain (K).  Typical Value = 66.
     */
    private Double ki2; // PU

    public Double getKi2() {
        return ki2;
    }

    public void setKi2(Double _value_) {
        ki2 = _value_;
    }

    private static Object getKi2(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getKi2();
    }

    private static void setKi2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setKi2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setKi2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low band gain (K).  Typical Value = 7.5.
     */
    private Double kl; // PU

    public Double getKl() {
        return kl;
    }

    public void setKl(Double _value_) {
        kl = _value_;
    }

    private static Object getKl(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getKl();
    }

    private static void setKl(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setKl((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setKl(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low band differential filter gain (K).  Typical Value = 66.
     */
    private Double kl1; // PU

    public Double getKl1() {
        return kl1;
    }

    public void setKl1(Double _value_) {
        kl1 = _value_;
    }

    private static Object getKl1(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getKl1();
    }

    private static void setKl1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setKl1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setKl1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low band first lead-lag blocks coefficient (K).  Typical Value = 1.
     */
    private Double kl11; // PU

    public Double getKl11() {
        return kl11;
    }

    public void setKl11(Double _value_) {
        kl11 = _value_;
    }

    private static Object getKl11(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getKl11();
    }

    private static void setKl11(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setKl11((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setKl11(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low band first lead-lag blocks coefficient (K).  Typical Value = 1.
     */
    private Double kl17; // PU

    public Double getKl17() {
        return kl17;
    }

    public void setKl17(Double _value_) {
        kl17 = _value_;
    }

    private static Object getKl17(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getKl17();
    }

    private static void setKl17(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setKl17((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setKl17(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low band differential filter gain (K).  Typical Value = 66.
     */
    private Double kl2; // PU

    public Double getKl2() {
        return kl2;
    }

    public void setKl2(Double _value_) {
        kl2 = _value_;
    }

    private static Object getKl2(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getKl2();
    }

    private static void setKl2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setKl2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setKl2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Notch filter 1 (high-frequency band): filter frequency (omega).
     */
    private Double omeganh1; // Simple_Float

    public Double getOmeganh1() {
        return omeganh1;
    }

    public void setOmeganh1(Double _value_) {
        omeganh1 = _value_;
    }

    private static Object getOmeganh1(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getOmeganh1();
    }

    private static void setOmeganh1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setOmeganh1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setOmeganh1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Notch filter 2 (high-frequency band): filter frequency (omega).
     */
    private Double omeganh2; // Simple_Float

    public Double getOmeganh2() {
        return omeganh2;
    }

    public void setOmeganh2(Double _value_) {
        omeganh2 = _value_;
    }

    private static Object getOmeganh2(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getOmeganh2();
    }

    private static void setOmeganh2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setOmeganh2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setOmeganh2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Notch filter 1 (low-frequency band): filter frequency (omega).
     */
    private Double omeganl1; // Simple_Float

    public Double getOmeganl1() {
        return omeganl1;
    }

    public void setOmeganl1(Double _value_) {
        omeganl1 = _value_;
    }

    private static Object getOmeganl1(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getOmeganl1();
    }

    private static void setOmeganl1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setOmeganl1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setOmeganl1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Notch filter 2 (low-frequency band): filter frequency (omega).
     */
    private Double omeganl2; // Simple_Float

    public Double getOmeganl2() {
        return omeganl2;
    }

    public void setOmeganl2(Double _value_) {
        omeganl2 = _value_;
    }

    private static Object getOmeganl2(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getOmeganl2();
    }

    private static void setOmeganl2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setOmeganl2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setOmeganl2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * High band time constant (T).  Typical Value = 0.01513.
     */
    private Double th1; // Seconds

    public Double getTh1() {
        return th1;
    }

    public void setTh1(Double _value_) {
        th1 = _value_;
    }

    private static Object getTh1(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTh1();
    }

    private static void setTh1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTh1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTh1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * High band time constant (T).  Typical Value = 0.
     */
    private Double th10; // Seconds

    public Double getTh10() {
        return th10;
    }

    public void setTh10(Double _value_) {
        th10 = _value_;
    }

    private static Object getTh10(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTh10();
    }

    private static void setTh10(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTh10((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTh10(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * High band time constant (T).  Typical Value = 0.
     */
    private Double th11; // Seconds

    public Double getTh11() {
        return th11;
    }

    public void setTh11(Double _value_) {
        th11 = _value_;
    }

    private static Object getTh11(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTh11();
    }

    private static void setTh11(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTh11((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTh11(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * High band time constant (T).  Typical Value = 0.
     */
    private Double th12; // Seconds

    public Double getTh12() {
        return th12;
    }

    public void setTh12(Double _value_) {
        th12 = _value_;
    }

    private static Object getTh12(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTh12();
    }

    private static void setTh12(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTh12((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTh12(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * High band time constant (T).  Typical Value = 0.01816.
     */
    private Double th2; // Seconds

    public Double getTh2() {
        return th2;
    }

    public void setTh2(Double _value_) {
        th2 = _value_;
    }

    private static Object getTh2(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTh2();
    }

    private static void setTh2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTh2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTh2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * High band time constant (T).  Typical Value = 0.
     */
    private Double th3; // Seconds

    public Double getTh3() {
        return th3;
    }

    public void setTh3(Double _value_) {
        th3 = _value_;
    }

    private static Object getTh3(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTh3();
    }

    private static void setTh3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTh3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTh3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * High band time constant (T).  Typical Value = 0.
     */
    private Double th4; // Seconds

    public Double getTh4() {
        return th4;
    }

    public void setTh4(Double _value_) {
        th4 = _value_;
    }

    private static Object getTh4(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTh4();
    }

    private static void setTh4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTh4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTh4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * High band time constant (T).  Typical Value = 0.
     */
    private Double th5; // Seconds

    public Double getTh5() {
        return th5;
    }

    public void setTh5(Double _value_) {
        th5 = _value_;
    }

    private static Object getTh5(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTh5();
    }

    private static void setTh5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTh5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTh5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * High band time constant (T).  Typical Value = 0.
     */
    private Double th6; // Seconds

    public Double getTh6() {
        return th6;
    }

    public void setTh6(Double _value_) {
        th6 = _value_;
    }

    private static Object getTh6(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTh6();
    }

    private static void setTh6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTh6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTh6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * High band time constant (T).  Typical Value = 0.01816.
     */
    private Double th7; // Seconds

    public Double getTh7() {
        return th7;
    }

    public void setTh7(Double _value_) {
        th7 = _value_;
    }

    private static Object getTh7(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTh7();
    }

    private static void setTh7(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTh7((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTh7(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * High band time constant (T).  Typical Value = 0.02179.
     */
    private Double th8; // Seconds

    public Double getTh8() {
        return th8;
    }

    public void setTh8(Double _value_) {
        th8 = _value_;
    }

    private static Object getTh8(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTh8();
    }

    private static void setTh8(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTh8((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTh8(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * High band time constant (T).  Typical Value = 0.
     */
    private Double th9; // Seconds

    public Double getTh9() {
        return th9;
    }

    public void setTh9(Double _value_) {
        th9 = _value_;
    }

    private static Object getTh9(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTh9();
    }

    private static void setTh9(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTh9((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTh9(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intermediate band time constant (T).  Typical Value = 0.173.
     */
    private Double ti1; // Seconds

    public Double getTi1() {
        return ti1;
    }

    public void setTi1(Double _value_) {
        ti1 = _value_;
    }

    private static Object getTi1(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTi1();
    }

    private static void setTi1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTi1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTi1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intermediate band time constant (T).  Typical Value = 0.
     */
    private Double ti10; // Seconds

    public Double getTi10() {
        return ti10;
    }

    public void setTi10(Double _value_) {
        ti10 = _value_;
    }

    private static Object getTi10(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTi10();
    }

    private static void setTi10(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTi10((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTi10(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intermediate band time constant (T).  Typical Value = 0.
     */
    private Double ti11; // Seconds

    public Double getTi11() {
        return ti11;
    }

    public void setTi11(Double _value_) {
        ti11 = _value_;
    }

    private static Object getTi11(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTi11();
    }

    private static void setTi11(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTi11((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTi11(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intermediate band time constant (T).  Typical Value = 0.
     */
    private Double ti12; // Seconds

    public Double getTi12() {
        return ti12;
    }

    public void setTi12(Double _value_) {
        ti12 = _value_;
    }

    private static Object getTi12(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTi12();
    }

    private static void setTi12(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTi12((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTi12(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intermediate band time constant (T).  Typical Value = 0.2075.
     */
    private Double ti2; // Seconds

    public Double getTi2() {
        return ti2;
    }

    public void setTi2(Double _value_) {
        ti2 = _value_;
    }

    private static Object getTi2(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTi2();
    }

    private static void setTi2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTi2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTi2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intermediate band time constant (T).  Typical Value = 0.
     */
    private Double ti3; // Seconds

    public Double getTi3() {
        return ti3;
    }

    public void setTi3(Double _value_) {
        ti3 = _value_;
    }

    private static Object getTi3(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTi3();
    }

    private static void setTi3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTi3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTi3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intermediate band time constant (T).  Typical Value = 0.
     */
    private Double ti4; // Seconds

    public Double getTi4() {
        return ti4;
    }

    public void setTi4(Double _value_) {
        ti4 = _value_;
    }

    private static Object getTi4(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTi4();
    }

    private static void setTi4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTi4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTi4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intermediate band time constant (T).  Typical Value = 0.
     */
    private Double ti5; // Seconds

    public Double getTi5() {
        return ti5;
    }

    public void setTi5(Double _value_) {
        ti5 = _value_;
    }

    private static Object getTi5(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTi5();
    }

    private static void setTi5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTi5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTi5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intermediate band time constant (T).  Typical Value = 0.
     */
    private Double ti6; // Seconds

    public Double getTi6() {
        return ti6;
    }

    public void setTi6(Double _value_) {
        ti6 = _value_;
    }

    private static Object getTi6(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTi6();
    }

    private static void setTi6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTi6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTi6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intermediate band time constant (T).  Typical Value = 0.2075.
     */
    private Double ti7; // Seconds

    public Double getTi7() {
        return ti7;
    }

    public void setTi7(Double _value_) {
        ti7 = _value_;
    }

    private static Object getTi7(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTi7();
    }

    private static void setTi7(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTi7((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTi7(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intermediate band time constant (T).  Typical Value = 0.2491.
     */
    private Double ti8; // Seconds

    public Double getTi8() {
        return ti8;
    }

    public void setTi8(Double _value_) {
        ti8 = _value_;
    }

    private static Object getTi8(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTi8();
    }

    private static void setTi8(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTi8((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTi8(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intermediate band time constant (T).  Typical Value = 0.
     */
    private Double ti9; // Seconds

    public Double getTi9() {
        return ti9;
    }

    public void setTi9(Double _value_) {
        ti9 = _value_;
    }

    private static Object getTi9(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTi9();
    }

    private static void setTi9(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTi9((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTi9(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low band time constant (T).  Typical Value = 1.73.
     */
    private Double tl1; // Seconds

    public Double getTl1() {
        return tl1;
    }

    public void setTl1(Double _value_) {
        tl1 = _value_;
    }

    private static Object getTl1(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTl1();
    }

    private static void setTl1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTl1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTl1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low band time constant (T).  Typical Value = 0.
     */
    private Double tl10; // Seconds

    public Double getTl10() {
        return tl10;
    }

    public void setTl10(Double _value_) {
        tl10 = _value_;
    }

    private static Object getTl10(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTl10();
    }

    private static void setTl10(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTl10((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTl10(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low band time constant (T).  Typical Value = 0.
     */
    private Double tl11; // Seconds

    public Double getTl11() {
        return tl11;
    }

    public void setTl11(Double _value_) {
        tl11 = _value_;
    }

    private static Object getTl11(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTl11();
    }

    private static void setTl11(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTl11((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTl11(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low band time constant (T).  Typical Value = 0.
     */
    private Double tl12; // Seconds

    public Double getTl12() {
        return tl12;
    }

    public void setTl12(Double _value_) {
        tl12 = _value_;
    }

    private static Object getTl12(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTl12();
    }

    private static void setTl12(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTl12((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTl12(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low band time constant (T).  Typical Value = 2.075.
     */
    private Double tl2; // Seconds

    public Double getTl2() {
        return tl2;
    }

    public void setTl2(Double _value_) {
        tl2 = _value_;
    }

    private static Object getTl2(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTl2();
    }

    private static void setTl2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTl2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTl2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low band time constant (T).  Typical Value = 0.
     */
    private Double tl3; // Seconds

    public Double getTl3() {
        return tl3;
    }

    public void setTl3(Double _value_) {
        tl3 = _value_;
    }

    private static Object getTl3(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTl3();
    }

    private static void setTl3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTl3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTl3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low band time constant (T).  Typical Value = 0.
     */
    private Double tl4; // Seconds

    public Double getTl4() {
        return tl4;
    }

    public void setTl4(Double _value_) {
        tl4 = _value_;
    }

    private static Object getTl4(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTl4();
    }

    private static void setTl4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTl4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTl4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low band time constant (T).  Typical Value = 0.
     */
    private Double tl5; // Seconds

    public Double getTl5() {
        return tl5;
    }

    public void setTl5(Double _value_) {
        tl5 = _value_;
    }

    private static Object getTl5(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTl5();
    }

    private static void setTl5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTl5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTl5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low band time constant (T).  Typical Value = 0.
     */
    private Double tl6; // Seconds

    public Double getTl6() {
        return tl6;
    }

    public void setTl6(Double _value_) {
        tl6 = _value_;
    }

    private static Object getTl6(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTl6();
    }

    private static void setTl6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTl6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTl6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low band time constant (T).  Typical Value = 2.075.
     */
    private Double tl7; // Seconds

    public Double getTl7() {
        return tl7;
    }

    public void setTl7(Double _value_) {
        tl7 = _value_;
    }

    private static Object getTl7(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTl7();
    }

    private static void setTl7(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTl7((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTl7(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low band time constant (T).  Typical Value = 2.491.
     */
    private Double tl8; // Seconds

    public Double getTl8() {
        return tl8;
    }

    public void setTl8(Double _value_) {
        tl8 = _value_;
    }

    private static Object getTl8(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTl8();
    }

    private static void setTl8(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTl8((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTl8(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low band time constant (T).  Typical Value = 0.
     */
    private Double tl9; // Seconds

    public Double getTl9() {
        return tl9;
    }

    public void setTl9(Double _value_) {
        tl9 = _value_;
    }

    private static Object getTl9(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getTl9();
    }

    private static void setTl9(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setTl9((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setTl9(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * High band output maximum limit (V).  Typical Value = 0.6.
     */
    private Double vhmax; // PU

    public Double getVhmax() {
        return vhmax;
    }

    public void setVhmax(Double _value_) {
        vhmax = _value_;
    }

    private static Object getVhmax(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getVhmax();
    }

    private static void setVhmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setVhmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setVhmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * High band output minimum limit (V).  Typical Value = -0.6.
     */
    private Double vhmin; // PU

    public Double getVhmin() {
        return vhmin;
    }

    public void setVhmin(Double _value_) {
        vhmin = _value_;
    }

    private static Object getVhmin(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getVhmin();
    }

    private static void setVhmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setVhmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setVhmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intermediate band output maximum limit (V).  Typical Value = 0.6.
     */
    private Double vimax; // PU

    public Double getVimax() {
        return vimax;
    }

    public void setVimax(Double _value_) {
        vimax = _value_;
    }

    private static Object getVimax(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getVimax();
    }

    private static void setVimax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setVimax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setVimax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intermediate band output minimum limit (V).  Typical Value = -0.6.
     */
    private Double vimin; // PU

    public Double getVimin() {
        return vimin;
    }

    public void setVimin(Double _value_) {
        vimin = _value_;
    }

    private static Object getVimin(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getVimin();
    }

    private static void setVimin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setVimin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setVimin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low band output maximum limit (V).  Typical Value = 0.075.
     */
    private Double vlmax; // PU

    public Double getVlmax() {
        return vlmax;
    }

    public void setVlmax(Double _value_) {
        vlmax = _value_;
    }

    private static Object getVlmax(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getVlmax();
    }

    private static void setVlmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setVlmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setVlmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low band output minimum limit (V).  Typical Value = -0.075.
     */
    private Double vlmin; // PU

    public Double getVlmin() {
        return vlmin;
    }

    public void setVlmin(Double _value_) {
        vlmin = _value_;
    }

    private static Object getVlmin(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getVlmin();
    }

    private static void setVlmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setVlmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setVlmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * PSS output maximum limit (V).  Typical Value = 0.15.
     */
    private Double vstmax; // PU

    public Double getVstmax() {
        return vstmax;
    }

    public void setVstmax(Double _value_) {
        vstmax = _value_;
    }

    private static Object getVstmax(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getVstmax();
    }

    private static void setVstmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setVstmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setVstmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * PSS output minimum limit (V).  Typical Value = -0.15.
     */
    private Double vstmin; // PU

    public Double getVstmin() {
        return vstmin;
    }

    public void setVstmin(Double _value_) {
        vstmin = _value_;
    }

    private static Object getVstmin(BaseClass _this_) {
        return ((PssIEEE4B) _this_).getVstmin();
    }

    private static void setVstmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE4B) _this_).setVstmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE4B) _this_).setVstmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PssIEEE4B", attrName));
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
                "PssIEEE4B", attrName, value));
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
            map.put("bwh1", new AttrDetails("PssIEEE4B.bwh1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getBwh1, PssIEEE4B::setBwh1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bwh2", new AttrDetails("PssIEEE4B.bwh2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getBwh2, PssIEEE4B::setBwh2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bwl1", new AttrDetails("PssIEEE4B.bwl1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getBwl1, PssIEEE4B::setBwl1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bwl2", new AttrDetails("PssIEEE4B.bwl2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getBwl2, PssIEEE4B::setBwl2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh", new AttrDetails("PssIEEE4B.kh", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getKh, PssIEEE4B::setKh));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh1", new AttrDetails("PssIEEE4B.kh1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getKh1, PssIEEE4B::setKh1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh11", new AttrDetails("PssIEEE4B.kh11", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getKh11, PssIEEE4B::setKh11));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh17", new AttrDetails("PssIEEE4B.kh17", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getKh17, PssIEEE4B::setKh17));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh2", new AttrDetails("PssIEEE4B.kh2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getKh2, PssIEEE4B::setKh2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("PssIEEE4B.ki", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getKi, PssIEEE4B::setKi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki1", new AttrDetails("PssIEEE4B.ki1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getKi1, PssIEEE4B::setKi1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki11", new AttrDetails("PssIEEE4B.ki11", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getKi11, PssIEEE4B::setKi11));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki17", new AttrDetails("PssIEEE4B.ki17", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getKi17, PssIEEE4B::setKi17));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki2", new AttrDetails("PssIEEE4B.ki2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getKi2, PssIEEE4B::setKi2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl", new AttrDetails("PssIEEE4B.kl", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getKl, PssIEEE4B::setKl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl1", new AttrDetails("PssIEEE4B.kl1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getKl1, PssIEEE4B::setKl1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl11", new AttrDetails("PssIEEE4B.kl11", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getKl11, PssIEEE4B::setKl11));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl17", new AttrDetails("PssIEEE4B.kl17", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getKl17, PssIEEE4B::setKl17));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl2", new AttrDetails("PssIEEE4B.kl2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getKl2, PssIEEE4B::setKl2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omeganh1", new AttrDetails("PssIEEE4B.omeganh1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getOmeganh1, PssIEEE4B::setOmeganh1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omeganh2", new AttrDetails("PssIEEE4B.omeganh2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getOmeganh2, PssIEEE4B::setOmeganh2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omeganl1", new AttrDetails("PssIEEE4B.omeganl1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getOmeganl1, PssIEEE4B::setOmeganl1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omeganl2", new AttrDetails("PssIEEE4B.omeganl2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getOmeganl2, PssIEEE4B::setOmeganl2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th1", new AttrDetails("PssIEEE4B.th1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTh1, PssIEEE4B::setTh1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th10", new AttrDetails("PssIEEE4B.th10", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTh10, PssIEEE4B::setTh10));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th11", new AttrDetails("PssIEEE4B.th11", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTh11, PssIEEE4B::setTh11));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th12", new AttrDetails("PssIEEE4B.th12", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTh12, PssIEEE4B::setTh12));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th2", new AttrDetails("PssIEEE4B.th2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTh2, PssIEEE4B::setTh2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th3", new AttrDetails("PssIEEE4B.th3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTh3, PssIEEE4B::setTh3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th4", new AttrDetails("PssIEEE4B.th4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTh4, PssIEEE4B::setTh4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th5", new AttrDetails("PssIEEE4B.th5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTh5, PssIEEE4B::setTh5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th6", new AttrDetails("PssIEEE4B.th6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTh6, PssIEEE4B::setTh6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th7", new AttrDetails("PssIEEE4B.th7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTh7, PssIEEE4B::setTh7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th8", new AttrDetails("PssIEEE4B.th8", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTh8, PssIEEE4B::setTh8));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th9", new AttrDetails("PssIEEE4B.th9", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTh9, PssIEEE4B::setTh9));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti1", new AttrDetails("PssIEEE4B.ti1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTi1, PssIEEE4B::setTi1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti10", new AttrDetails("PssIEEE4B.ti10", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTi10, PssIEEE4B::setTi10));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti11", new AttrDetails("PssIEEE4B.ti11", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTi11, PssIEEE4B::setTi11));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti12", new AttrDetails("PssIEEE4B.ti12", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTi12, PssIEEE4B::setTi12));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti2", new AttrDetails("PssIEEE4B.ti2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTi2, PssIEEE4B::setTi2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti3", new AttrDetails("PssIEEE4B.ti3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTi3, PssIEEE4B::setTi3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti4", new AttrDetails("PssIEEE4B.ti4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTi4, PssIEEE4B::setTi4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti5", new AttrDetails("PssIEEE4B.ti5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTi5, PssIEEE4B::setTi5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti6", new AttrDetails("PssIEEE4B.ti6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTi6, PssIEEE4B::setTi6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti7", new AttrDetails("PssIEEE4B.ti7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTi7, PssIEEE4B::setTi7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti8", new AttrDetails("PssIEEE4B.ti8", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTi8, PssIEEE4B::setTi8));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti9", new AttrDetails("PssIEEE4B.ti9", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTi9, PssIEEE4B::setTi9));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl1", new AttrDetails("PssIEEE4B.tl1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTl1, PssIEEE4B::setTl1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl10", new AttrDetails("PssIEEE4B.tl10", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTl10, PssIEEE4B::setTl10));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl11", new AttrDetails("PssIEEE4B.tl11", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTl11, PssIEEE4B::setTl11));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl12", new AttrDetails("PssIEEE4B.tl12", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTl12, PssIEEE4B::setTl12));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl2", new AttrDetails("PssIEEE4B.tl2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTl2, PssIEEE4B::setTl2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl3", new AttrDetails("PssIEEE4B.tl3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTl3, PssIEEE4B::setTl3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl4", new AttrDetails("PssIEEE4B.tl4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTl4, PssIEEE4B::setTl4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl5", new AttrDetails("PssIEEE4B.tl5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTl5, PssIEEE4B::setTl5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl6", new AttrDetails("PssIEEE4B.tl6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTl6, PssIEEE4B::setTl6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl7", new AttrDetails("PssIEEE4B.tl7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTl7, PssIEEE4B::setTl7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl8", new AttrDetails("PssIEEE4B.tl8", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTl8, PssIEEE4B::setTl8));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl9", new AttrDetails("PssIEEE4B.tl9", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getTl9, PssIEEE4B::setTl9));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vhmax", new AttrDetails("PssIEEE4B.vhmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getVhmax, PssIEEE4B::setVhmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vhmin", new AttrDetails("PssIEEE4B.vhmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getVhmin, PssIEEE4B::setVhmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimax", new AttrDetails("PssIEEE4B.vimax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getVimax, PssIEEE4B::setVimax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimin", new AttrDetails("PssIEEE4B.vimin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getVimin, PssIEEE4B::setVimin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vlmax", new AttrDetails("PssIEEE4B.vlmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getVlmax, PssIEEE4B::setVlmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vlmin", new AttrDetails("PssIEEE4B.vlmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getVlmin, PssIEEE4B::setVlmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vstmax", new AttrDetails("PssIEEE4B.vstmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getVstmax, PssIEEE4B::setVstmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vstmin", new AttrDetails("PssIEEE4B.vstmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE4B::getVstmin, PssIEEE4B::setVstmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PssIEEE4B(null).allAttrDetailsMap());
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
