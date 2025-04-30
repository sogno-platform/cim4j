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
     * Default constructor.
     */
    public PssIEEE4B() {
        setCimType("PssIEEE4B");
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

    public void setBwh1(String _value_) {
        bwh1 = getDoubleFromString(_value_);
    }

    public String bwh1ToString() {
        return bwh1 != null ? bwh1.toString() : null;
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

    public void setBwh2(String _value_) {
        bwh2 = getDoubleFromString(_value_);
    }

    public String bwh2ToString() {
        return bwh2 != null ? bwh2.toString() : null;
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

    public void setBwl1(String _value_) {
        bwl1 = getDoubleFromString(_value_);
    }

    public String bwl1ToString() {
        return bwl1 != null ? bwl1.toString() : null;
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

    public void setBwl2(String _value_) {
        bwl2 = getDoubleFromString(_value_);
    }

    public String bwl2ToString() {
        return bwl2 != null ? bwl2.toString() : null;
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

    public void setKh(String _value_) {
        kh = getDoubleFromString(_value_);
    }

    public String khToString() {
        return kh != null ? kh.toString() : null;
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

    public void setKh1(String _value_) {
        kh1 = getDoubleFromString(_value_);
    }

    public String kh1ToString() {
        return kh1 != null ? kh1.toString() : null;
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

    public void setKh11(String _value_) {
        kh11 = getDoubleFromString(_value_);
    }

    public String kh11ToString() {
        return kh11 != null ? kh11.toString() : null;
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

    public void setKh17(String _value_) {
        kh17 = getDoubleFromString(_value_);
    }

    public String kh17ToString() {
        return kh17 != null ? kh17.toString() : null;
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

    public void setKh2(String _value_) {
        kh2 = getDoubleFromString(_value_);
    }

    public String kh2ToString() {
        return kh2 != null ? kh2.toString() : null;
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

    public void setKi(String _value_) {
        ki = getDoubleFromString(_value_);
    }

    public String kiToString() {
        return ki != null ? ki.toString() : null;
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

    public void setKi1(String _value_) {
        ki1 = getDoubleFromString(_value_);
    }

    public String ki1ToString() {
        return ki1 != null ? ki1.toString() : null;
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

    public void setKi11(String _value_) {
        ki11 = getDoubleFromString(_value_);
    }

    public String ki11ToString() {
        return ki11 != null ? ki11.toString() : null;
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

    public void setKi17(String _value_) {
        ki17 = getDoubleFromString(_value_);
    }

    public String ki17ToString() {
        return ki17 != null ? ki17.toString() : null;
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

    public void setKi2(String _value_) {
        ki2 = getDoubleFromString(_value_);
    }

    public String ki2ToString() {
        return ki2 != null ? ki2.toString() : null;
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

    public void setKl(String _value_) {
        kl = getDoubleFromString(_value_);
    }

    public String klToString() {
        return kl != null ? kl.toString() : null;
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

    public void setKl1(String _value_) {
        kl1 = getDoubleFromString(_value_);
    }

    public String kl1ToString() {
        return kl1 != null ? kl1.toString() : null;
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

    public void setKl11(String _value_) {
        kl11 = getDoubleFromString(_value_);
    }

    public String kl11ToString() {
        return kl11 != null ? kl11.toString() : null;
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

    public void setKl17(String _value_) {
        kl17 = getDoubleFromString(_value_);
    }

    public String kl17ToString() {
        return kl17 != null ? kl17.toString() : null;
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

    public void setKl2(String _value_) {
        kl2 = getDoubleFromString(_value_);
    }

    public String kl2ToString() {
        return kl2 != null ? kl2.toString() : null;
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

    public void setOmeganh1(String _value_) {
        omeganh1 = getDoubleFromString(_value_);
    }

    public String omeganh1ToString() {
        return omeganh1 != null ? omeganh1.toString() : null;
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

    public void setOmeganh2(String _value_) {
        omeganh2 = getDoubleFromString(_value_);
    }

    public String omeganh2ToString() {
        return omeganh2 != null ? omeganh2.toString() : null;
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

    public void setOmeganl1(String _value_) {
        omeganl1 = getDoubleFromString(_value_);
    }

    public String omeganl1ToString() {
        return omeganl1 != null ? omeganl1.toString() : null;
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

    public void setOmeganl2(String _value_) {
        omeganl2 = getDoubleFromString(_value_);
    }

    public String omeganl2ToString() {
        return omeganl2 != null ? omeganl2.toString() : null;
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

    public void setTh1(String _value_) {
        th1 = getDoubleFromString(_value_);
    }

    public String th1ToString() {
        return th1 != null ? th1.toString() : null;
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

    public void setTh10(String _value_) {
        th10 = getDoubleFromString(_value_);
    }

    public String th10ToString() {
        return th10 != null ? th10.toString() : null;
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

    public void setTh11(String _value_) {
        th11 = getDoubleFromString(_value_);
    }

    public String th11ToString() {
        return th11 != null ? th11.toString() : null;
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

    public void setTh12(String _value_) {
        th12 = getDoubleFromString(_value_);
    }

    public String th12ToString() {
        return th12 != null ? th12.toString() : null;
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

    public void setTh2(String _value_) {
        th2 = getDoubleFromString(_value_);
    }

    public String th2ToString() {
        return th2 != null ? th2.toString() : null;
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

    public void setTh3(String _value_) {
        th3 = getDoubleFromString(_value_);
    }

    public String th3ToString() {
        return th3 != null ? th3.toString() : null;
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

    public void setTh4(String _value_) {
        th4 = getDoubleFromString(_value_);
    }

    public String th4ToString() {
        return th4 != null ? th4.toString() : null;
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

    public void setTh5(String _value_) {
        th5 = getDoubleFromString(_value_);
    }

    public String th5ToString() {
        return th5 != null ? th5.toString() : null;
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

    public void setTh6(String _value_) {
        th6 = getDoubleFromString(_value_);
    }

    public String th6ToString() {
        return th6 != null ? th6.toString() : null;
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

    public void setTh7(String _value_) {
        th7 = getDoubleFromString(_value_);
    }

    public String th7ToString() {
        return th7 != null ? th7.toString() : null;
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

    public void setTh8(String _value_) {
        th8 = getDoubleFromString(_value_);
    }

    public String th8ToString() {
        return th8 != null ? th8.toString() : null;
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

    public void setTh9(String _value_) {
        th9 = getDoubleFromString(_value_);
    }

    public String th9ToString() {
        return th9 != null ? th9.toString() : null;
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

    public void setTi1(String _value_) {
        ti1 = getDoubleFromString(_value_);
    }

    public String ti1ToString() {
        return ti1 != null ? ti1.toString() : null;
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

    public void setTi10(String _value_) {
        ti10 = getDoubleFromString(_value_);
    }

    public String ti10ToString() {
        return ti10 != null ? ti10.toString() : null;
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

    public void setTi11(String _value_) {
        ti11 = getDoubleFromString(_value_);
    }

    public String ti11ToString() {
        return ti11 != null ? ti11.toString() : null;
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

    public void setTi12(String _value_) {
        ti12 = getDoubleFromString(_value_);
    }

    public String ti12ToString() {
        return ti12 != null ? ti12.toString() : null;
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

    public void setTi2(String _value_) {
        ti2 = getDoubleFromString(_value_);
    }

    public String ti2ToString() {
        return ti2 != null ? ti2.toString() : null;
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

    public void setTi3(String _value_) {
        ti3 = getDoubleFromString(_value_);
    }

    public String ti3ToString() {
        return ti3 != null ? ti3.toString() : null;
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

    public void setTi4(String _value_) {
        ti4 = getDoubleFromString(_value_);
    }

    public String ti4ToString() {
        return ti4 != null ? ti4.toString() : null;
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

    public void setTi5(String _value_) {
        ti5 = getDoubleFromString(_value_);
    }

    public String ti5ToString() {
        return ti5 != null ? ti5.toString() : null;
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

    public void setTi6(String _value_) {
        ti6 = getDoubleFromString(_value_);
    }

    public String ti6ToString() {
        return ti6 != null ? ti6.toString() : null;
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

    public void setTi7(String _value_) {
        ti7 = getDoubleFromString(_value_);
    }

    public String ti7ToString() {
        return ti7 != null ? ti7.toString() : null;
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

    public void setTi8(String _value_) {
        ti8 = getDoubleFromString(_value_);
    }

    public String ti8ToString() {
        return ti8 != null ? ti8.toString() : null;
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

    public void setTi9(String _value_) {
        ti9 = getDoubleFromString(_value_);
    }

    public String ti9ToString() {
        return ti9 != null ? ti9.toString() : null;
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

    public void setTl1(String _value_) {
        tl1 = getDoubleFromString(_value_);
    }

    public String tl1ToString() {
        return tl1 != null ? tl1.toString() : null;
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

    public void setTl10(String _value_) {
        tl10 = getDoubleFromString(_value_);
    }

    public String tl10ToString() {
        return tl10 != null ? tl10.toString() : null;
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

    public void setTl11(String _value_) {
        tl11 = getDoubleFromString(_value_);
    }

    public String tl11ToString() {
        return tl11 != null ? tl11.toString() : null;
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

    public void setTl12(String _value_) {
        tl12 = getDoubleFromString(_value_);
    }

    public String tl12ToString() {
        return tl12 != null ? tl12.toString() : null;
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

    public void setTl2(String _value_) {
        tl2 = getDoubleFromString(_value_);
    }

    public String tl2ToString() {
        return tl2 != null ? tl2.toString() : null;
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

    public void setTl3(String _value_) {
        tl3 = getDoubleFromString(_value_);
    }

    public String tl3ToString() {
        return tl3 != null ? tl3.toString() : null;
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

    public void setTl4(String _value_) {
        tl4 = getDoubleFromString(_value_);
    }

    public String tl4ToString() {
        return tl4 != null ? tl4.toString() : null;
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

    public void setTl5(String _value_) {
        tl5 = getDoubleFromString(_value_);
    }

    public String tl5ToString() {
        return tl5 != null ? tl5.toString() : null;
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

    public void setTl6(String _value_) {
        tl6 = getDoubleFromString(_value_);
    }

    public String tl6ToString() {
        return tl6 != null ? tl6.toString() : null;
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

    public void setTl7(String _value_) {
        tl7 = getDoubleFromString(_value_);
    }

    public String tl7ToString() {
        return tl7 != null ? tl7.toString() : null;
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

    public void setTl8(String _value_) {
        tl8 = getDoubleFromString(_value_);
    }

    public String tl8ToString() {
        return tl8 != null ? tl8.toString() : null;
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

    public void setTl9(String _value_) {
        tl9 = getDoubleFromString(_value_);
    }

    public String tl9ToString() {
        return tl9 != null ? tl9.toString() : null;
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

    public void setVhmax(String _value_) {
        vhmax = getDoubleFromString(_value_);
    }

    public String vhmaxToString() {
        return vhmax != null ? vhmax.toString() : null;
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

    public void setVhmin(String _value_) {
        vhmin = getDoubleFromString(_value_);
    }

    public String vhminToString() {
        return vhmin != null ? vhmin.toString() : null;
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

    public void setVimax(String _value_) {
        vimax = getDoubleFromString(_value_);
    }

    public String vimaxToString() {
        return vimax != null ? vimax.toString() : null;
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

    public void setVimin(String _value_) {
        vimin = getDoubleFromString(_value_);
    }

    public String viminToString() {
        return vimin != null ? vimin.toString() : null;
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

    public void setVlmax(String _value_) {
        vlmax = getDoubleFromString(_value_);
    }

    public String vlmaxToString() {
        return vlmax != null ? vlmax.toString() : null;
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

    public void setVlmin(String _value_) {
        vlmin = getDoubleFromString(_value_);
    }

    public String vlminToString() {
        return vlmin != null ? vlmin.toString() : null;
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

    public void setVstmax(String _value_) {
        vstmax = getDoubleFromString(_value_);
    }

    public String vstmaxToString() {
        return vstmax != null ? vstmax.toString() : null;
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

    public void setVstmin(String _value_) {
        vstmin = getDoubleFromString(_value_);
    }

    public String vstminToString() {
        return vstmin != null ? vstmin.toString() : null;
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
     * Get an attribute value as string.
     *
     * @param attrName The attribute name
     * @return         The attribute value
     */
    @Override
    public String getAttribute(String attrName) {
        return getAttribute("PssIEEE4B", attrName);
    }

    @Override
    protected String getAttribute(String className, String attrName) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var getterFunction = classGetterSetterMap.get(attrName).getter;
            return getterFunction.get();
        }
        return super.getAttribute(className, attrName);
    }

    /**
     * Set an attribute value as object (for class and list attributes).
     *
     * @param attrName    The attribute name
     * @param objectValue The attribute value as object
     */
    @Override
    public void setAttribute(String attrName, BaseClass objectValue) {
        setAttribute("PssIEEE4B", attrName, objectValue);
    }

    @Override
    protected void setAttribute(String className, String attrName, BaseClass objectValue) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var setterFunction = classGetterSetterMap.get(attrName).objectSetter;
            setterFunction.accept(objectValue);
        } else {
            super.setAttribute(className, attrName, objectValue);
        }
    }

    /**
     * Set an attribute value as string (for primitive (including datatype) and enum attributes).
     *
     * @param attrName    The attribute name
     * @param stringValue The attribute value as string
     */
    @Override
    public void setAttribute(String attrName, String stringValue) {
        setAttribute("PssIEEE4B", attrName, stringValue);
    }

    @Override
    protected void setAttribute(String className, String attrName, String stringValue) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var setterFunction = classGetterSetterMap.get(attrName).stringSetter;
            setterFunction.accept(stringValue);
        } else {
            super.setAttribute(className, attrName, stringValue);
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
            map.put("bwh1", new AttrDetails("PssIEEE4B.bwh1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bwh2", new AttrDetails("PssIEEE4B.bwh2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bwl1", new AttrDetails("PssIEEE4B.bwl1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bwl2", new AttrDetails("PssIEEE4B.bwl2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh", new AttrDetails("PssIEEE4B.kh", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh1", new AttrDetails("PssIEEE4B.kh1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh11", new AttrDetails("PssIEEE4B.kh11", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh17", new AttrDetails("PssIEEE4B.kh17", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh2", new AttrDetails("PssIEEE4B.kh2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("PssIEEE4B.ki", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki1", new AttrDetails("PssIEEE4B.ki1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki11", new AttrDetails("PssIEEE4B.ki11", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki17", new AttrDetails("PssIEEE4B.ki17", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki2", new AttrDetails("PssIEEE4B.ki2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl", new AttrDetails("PssIEEE4B.kl", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl1", new AttrDetails("PssIEEE4B.kl1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl11", new AttrDetails("PssIEEE4B.kl11", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl17", new AttrDetails("PssIEEE4B.kl17", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl2", new AttrDetails("PssIEEE4B.kl2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omeganh1", new AttrDetails("PssIEEE4B.omeganh1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omeganh2", new AttrDetails("PssIEEE4B.omeganh2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omeganl1", new AttrDetails("PssIEEE4B.omeganl1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omeganl2", new AttrDetails("PssIEEE4B.omeganl2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th1", new AttrDetails("PssIEEE4B.th1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th10", new AttrDetails("PssIEEE4B.th10", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th11", new AttrDetails("PssIEEE4B.th11", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th12", new AttrDetails("PssIEEE4B.th12", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th2", new AttrDetails("PssIEEE4B.th2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th3", new AttrDetails("PssIEEE4B.th3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th4", new AttrDetails("PssIEEE4B.th4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th5", new AttrDetails("PssIEEE4B.th5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th6", new AttrDetails("PssIEEE4B.th6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th7", new AttrDetails("PssIEEE4B.th7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th8", new AttrDetails("PssIEEE4B.th8", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th9", new AttrDetails("PssIEEE4B.th9", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti1", new AttrDetails("PssIEEE4B.ti1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti10", new AttrDetails("PssIEEE4B.ti10", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti11", new AttrDetails("PssIEEE4B.ti11", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti12", new AttrDetails("PssIEEE4B.ti12", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti2", new AttrDetails("PssIEEE4B.ti2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti3", new AttrDetails("PssIEEE4B.ti3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti4", new AttrDetails("PssIEEE4B.ti4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti5", new AttrDetails("PssIEEE4B.ti5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti6", new AttrDetails("PssIEEE4B.ti6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti7", new AttrDetails("PssIEEE4B.ti7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti8", new AttrDetails("PssIEEE4B.ti8", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti9", new AttrDetails("PssIEEE4B.ti9", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl1", new AttrDetails("PssIEEE4B.tl1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl10", new AttrDetails("PssIEEE4B.tl10", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl11", new AttrDetails("PssIEEE4B.tl11", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl12", new AttrDetails("PssIEEE4B.tl12", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl2", new AttrDetails("PssIEEE4B.tl2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl3", new AttrDetails("PssIEEE4B.tl3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl4", new AttrDetails("PssIEEE4B.tl4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl5", new AttrDetails("PssIEEE4B.tl5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl6", new AttrDetails("PssIEEE4B.tl6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl7", new AttrDetails("PssIEEE4B.tl7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl8", new AttrDetails("PssIEEE4B.tl8", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl9", new AttrDetails("PssIEEE4B.tl9", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vhmax", new AttrDetails("PssIEEE4B.vhmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vhmin", new AttrDetails("PssIEEE4B.vhmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimax", new AttrDetails("PssIEEE4B.vimax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimin", new AttrDetails("PssIEEE4B.vimin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vlmax", new AttrDetails("PssIEEE4B.vlmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vlmin", new AttrDetails("PssIEEE4B.vlmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vstmax", new AttrDetails("PssIEEE4B.vstmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vstmin", new AttrDetails("PssIEEE4B.vstmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PssIEEE4B().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("bwh1", new GetterSetter(this::bwh1ToString, null, this::setBwh1));
        map.put("bwh2", new GetterSetter(this::bwh2ToString, null, this::setBwh2));
        map.put("bwl1", new GetterSetter(this::bwl1ToString, null, this::setBwl1));
        map.put("bwl2", new GetterSetter(this::bwl2ToString, null, this::setBwl2));
        map.put("kh", new GetterSetter(this::khToString, null, this::setKh));
        map.put("kh1", new GetterSetter(this::kh1ToString, null, this::setKh1));
        map.put("kh11", new GetterSetter(this::kh11ToString, null, this::setKh11));
        map.put("kh17", new GetterSetter(this::kh17ToString, null, this::setKh17));
        map.put("kh2", new GetterSetter(this::kh2ToString, null, this::setKh2));
        map.put("ki", new GetterSetter(this::kiToString, null, this::setKi));
        map.put("ki1", new GetterSetter(this::ki1ToString, null, this::setKi1));
        map.put("ki11", new GetterSetter(this::ki11ToString, null, this::setKi11));
        map.put("ki17", new GetterSetter(this::ki17ToString, null, this::setKi17));
        map.put("ki2", new GetterSetter(this::ki2ToString, null, this::setKi2));
        map.put("kl", new GetterSetter(this::klToString, null, this::setKl));
        map.put("kl1", new GetterSetter(this::kl1ToString, null, this::setKl1));
        map.put("kl11", new GetterSetter(this::kl11ToString, null, this::setKl11));
        map.put("kl17", new GetterSetter(this::kl17ToString, null, this::setKl17));
        map.put("kl2", new GetterSetter(this::kl2ToString, null, this::setKl2));
        map.put("omeganh1", new GetterSetter(this::omeganh1ToString, null, this::setOmeganh1));
        map.put("omeganh2", new GetterSetter(this::omeganh2ToString, null, this::setOmeganh2));
        map.put("omeganl1", new GetterSetter(this::omeganl1ToString, null, this::setOmeganl1));
        map.put("omeganl2", new GetterSetter(this::omeganl2ToString, null, this::setOmeganl2));
        map.put("th1", new GetterSetter(this::th1ToString, null, this::setTh1));
        map.put("th10", new GetterSetter(this::th10ToString, null, this::setTh10));
        map.put("th11", new GetterSetter(this::th11ToString, null, this::setTh11));
        map.put("th12", new GetterSetter(this::th12ToString, null, this::setTh12));
        map.put("th2", new GetterSetter(this::th2ToString, null, this::setTh2));
        map.put("th3", new GetterSetter(this::th3ToString, null, this::setTh3));
        map.put("th4", new GetterSetter(this::th4ToString, null, this::setTh4));
        map.put("th5", new GetterSetter(this::th5ToString, null, this::setTh5));
        map.put("th6", new GetterSetter(this::th6ToString, null, this::setTh6));
        map.put("th7", new GetterSetter(this::th7ToString, null, this::setTh7));
        map.put("th8", new GetterSetter(this::th8ToString, null, this::setTh8));
        map.put("th9", new GetterSetter(this::th9ToString, null, this::setTh9));
        map.put("ti1", new GetterSetter(this::ti1ToString, null, this::setTi1));
        map.put("ti10", new GetterSetter(this::ti10ToString, null, this::setTi10));
        map.put("ti11", new GetterSetter(this::ti11ToString, null, this::setTi11));
        map.put("ti12", new GetterSetter(this::ti12ToString, null, this::setTi12));
        map.put("ti2", new GetterSetter(this::ti2ToString, null, this::setTi2));
        map.put("ti3", new GetterSetter(this::ti3ToString, null, this::setTi3));
        map.put("ti4", new GetterSetter(this::ti4ToString, null, this::setTi4));
        map.put("ti5", new GetterSetter(this::ti5ToString, null, this::setTi5));
        map.put("ti6", new GetterSetter(this::ti6ToString, null, this::setTi6));
        map.put("ti7", new GetterSetter(this::ti7ToString, null, this::setTi7));
        map.put("ti8", new GetterSetter(this::ti8ToString, null, this::setTi8));
        map.put("ti9", new GetterSetter(this::ti9ToString, null, this::setTi9));
        map.put("tl1", new GetterSetter(this::tl1ToString, null, this::setTl1));
        map.put("tl10", new GetterSetter(this::tl10ToString, null, this::setTl10));
        map.put("tl11", new GetterSetter(this::tl11ToString, null, this::setTl11));
        map.put("tl12", new GetterSetter(this::tl12ToString, null, this::setTl12));
        map.put("tl2", new GetterSetter(this::tl2ToString, null, this::setTl2));
        map.put("tl3", new GetterSetter(this::tl3ToString, null, this::setTl3));
        map.put("tl4", new GetterSetter(this::tl4ToString, null, this::setTl4));
        map.put("tl5", new GetterSetter(this::tl5ToString, null, this::setTl5));
        map.put("tl6", new GetterSetter(this::tl6ToString, null, this::setTl6));
        map.put("tl7", new GetterSetter(this::tl7ToString, null, this::setTl7));
        map.put("tl8", new GetterSetter(this::tl8ToString, null, this::setTl8));
        map.put("tl9", new GetterSetter(this::tl9ToString, null, this::setTl9));
        map.put("vhmax", new GetterSetter(this::vhmaxToString, null, this::setVhmax));
        map.put("vhmin", new GetterSetter(this::vhminToString, null, this::setVhmin));
        map.put("vimax", new GetterSetter(this::vimaxToString, null, this::setVimax));
        map.put("vimin", new GetterSetter(this::viminToString, null, this::setVimin));
        map.put("vlmax", new GetterSetter(this::vlmaxToString, null, this::setVlmax));
        map.put("vlmin", new GetterSetter(this::vlminToString, null, this::setVlmin));
        map.put("vstmax", new GetterSetter(this::vstmaxToString, null, this::setVstmax));
        map.put("vstmin", new GetterSetter(this::vstminToString, null, this::setVstmin));
        return map;
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
