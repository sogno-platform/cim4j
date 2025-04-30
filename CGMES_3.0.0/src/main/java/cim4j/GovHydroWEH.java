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
 * Woodward<sup>TM </sup>electric hydro governor.  [Footnote: Woodward electric hydro governors are an example of suitable products available commercially. This information is given for the convenience of users of this document and does not constitute an endorsement by IEC of these products.]
 */
@SuppressWarnings("unused")
public class GovHydroWEH extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydroWEH.class);

    /**
     * Default constructor.
     */
    public GovHydroWEH() {
        setCimType("GovHydroWEH");
    }

    /**
     * Speed deadband (&lt;i&gt;db&lt;/i&gt;).
     */
    private Double db; // PU

    public Double getDb() {
        return db;
    }

    public void setDb(Double _value_) {
        db = _value_;
    }

    public void setDb(String _value_) {
        db = getDoubleFromString(_value_);
    }

    public String dbToString() {
        return db != null ? db.toString() : null;
    }

    /**
     * Value to allow the integral controller to advance beyond the gate limits (&lt;i&gt;Dicn&lt;/i&gt;).
     */
    private Double dicn; // PU

    public Double getDicn() {
        return dicn;
    }

    public void setDicn(Double _value_) {
        dicn = _value_;
    }

    public void setDicn(String _value_) {
        dicn = getDoubleFromString(_value_);
    }

    public String dicnToString() {
        return dicn != null ? dicn.toString() : null;
    }

    /**
     * Value to allow the pilot valve controller to advance beyond the gate limits (&lt;i&gt;Dpv&lt;/i&gt;).
     */
    private Double dpv; // PU

    public Double getDpv() {
        return dpv;
    }

    public void setDpv(Double _value_) {
        dpv = _value_;
    }

    public void setDpv(String _value_) {
        dpv = getDoubleFromString(_value_);
    }

    public String dpvToString() {
        return dpv != null ? dpv.toString() : null;
    }

    /**
     * Turbine damping factor (&lt;i&gt;Dturb&lt;/i&gt;).  Unit = delta P (PU of &lt;i&gt;MWbase&lt;/i&gt;) / delta speed (PU).
     */
    private Double dturb; // PU

    public Double getDturb() {
        return dturb;
    }

    public void setDturb(Double _value_) {
        dturb = _value_;
    }

    public void setDturb(String _value_) {
        dturb = getDoubleFromString(_value_);
    }

    public String dturbToString() {
        return dturb != null ? dturb.toString() : null;
    }

    /**
     * Feedback signal selection (&lt;i&gt;Sw&lt;/i&gt;). true = PID output (if &lt;i&gt;R-Perm-Gate &lt;/i&gt;= droop and &lt;i&gt;R-Perm-Pe &lt;/i&gt;= 0) false = electrical power (if &lt;i&gt;R-Perm-Gate &lt;/i&gt;= 0 and &lt;i&gt;R-Perm-Pe &lt;/i&gt;= droop) or false = gate position (if R&lt;i&gt;-Perm-Gate &lt;/i&gt;= droop and &lt;i&gt;R-Perm-Pe &lt;/i&gt;= 0). Typical value = false.
     */
    private Boolean feedbackSignal; // Boolean

    public Boolean getFeedbackSignal() {
        return feedbackSignal;
    }

    public void setFeedbackSignal(Boolean _value_) {
        feedbackSignal = _value_;
    }

    public void setFeedbackSignal(String _value_) {
        feedbackSignal = getBooleanFromString(_value_);
    }

    public String feedbackSignalToString() {
        return feedbackSignal != null ? feedbackSignal.toString() : null;
    }

    /**
     * Flowgate 1 (&lt;i&gt;Fl1&lt;/i&gt;).  Flow value for gate position point 1 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     */
    private Double fl1; // PU

    public Double getFl1() {
        return fl1;
    }

    public void setFl1(Double _value_) {
        fl1 = _value_;
    }

    public void setFl1(String _value_) {
        fl1 = getDoubleFromString(_value_);
    }

    public String fl1ToString() {
        return fl1 != null ? fl1.toString() : null;
    }

    /**
     * Flowgate 2 (&lt;i&gt;Fl2&lt;/i&gt;).  Flow value for gate position point 2 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     */
    private Double fl2; // PU

    public Double getFl2() {
        return fl2;
    }

    public void setFl2(Double _value_) {
        fl2 = _value_;
    }

    public void setFl2(String _value_) {
        fl2 = getDoubleFromString(_value_);
    }

    public String fl2ToString() {
        return fl2 != null ? fl2.toString() : null;
    }

    /**
     * Flowgate 3 (&lt;i&gt;Fl3&lt;/i&gt;).  Flow value for gate position point 3 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     */
    private Double fl3; // PU

    public Double getFl3() {
        return fl3;
    }

    public void setFl3(Double _value_) {
        fl3 = _value_;
    }

    public void setFl3(String _value_) {
        fl3 = getDoubleFromString(_value_);
    }

    public String fl3ToString() {
        return fl3 != null ? fl3.toString() : null;
    }

    /**
     * Flowgate 4 (&lt;i&gt;Fl4&lt;/i&gt;).  Flow value for gate position point 4 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     */
    private Double fl4; // PU

    public Double getFl4() {
        return fl4;
    }

    public void setFl4(Double _value_) {
        fl4 = _value_;
    }

    public void setFl4(String _value_) {
        fl4 = getDoubleFromString(_value_);
    }

    public String fl4ToString() {
        return fl4 != null ? fl4.toString() : null;
    }

    /**
     * Flowgate 5 (&lt;i&gt;Fl5&lt;/i&gt;).  Flow value for gate position point 5 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     */
    private Double fl5; // PU

    public Double getFl5() {
        return fl5;
    }

    public void setFl5(Double _value_) {
        fl5 = _value_;
    }

    public void setFl5(String _value_) {
        fl5 = getDoubleFromString(_value_);
    }

    public String fl5ToString() {
        return fl5 != null ? fl5.toString() : null;
    }

    /**
     * Flow P1 (&lt;i&gt;Fp1&lt;/i&gt;).  Turbine flow value for point 1 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double fp1; // PU

    public Double getFp1() {
        return fp1;
    }

    public void setFp1(Double _value_) {
        fp1 = _value_;
    }

    public void setFp1(String _value_) {
        fp1 = getDoubleFromString(_value_);
    }

    public String fp1ToString() {
        return fp1 != null ? fp1.toString() : null;
    }

    /**
     * Flow P10 (&lt;i&gt;Fp10&lt;/i&gt;).  Turbine flow value for point 10 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double fp10; // PU

    public Double getFp10() {
        return fp10;
    }

    public void setFp10(Double _value_) {
        fp10 = _value_;
    }

    public void setFp10(String _value_) {
        fp10 = getDoubleFromString(_value_);
    }

    public String fp10ToString() {
        return fp10 != null ? fp10.toString() : null;
    }

    /**
     * Flow P2 (&lt;i&gt;Fp2&lt;/i&gt;).  Turbine flow value for point 2 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double fp2; // PU

    public Double getFp2() {
        return fp2;
    }

    public void setFp2(Double _value_) {
        fp2 = _value_;
    }

    public void setFp2(String _value_) {
        fp2 = getDoubleFromString(_value_);
    }

    public String fp2ToString() {
        return fp2 != null ? fp2.toString() : null;
    }

    /**
     * Flow P3 (&lt;i&gt;Fp3&lt;/i&gt;).  Turbine flow value for point 3 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double fp3; // PU

    public Double getFp3() {
        return fp3;
    }

    public void setFp3(Double _value_) {
        fp3 = _value_;
    }

    public void setFp3(String _value_) {
        fp3 = getDoubleFromString(_value_);
    }

    public String fp3ToString() {
        return fp3 != null ? fp3.toString() : null;
    }

    /**
     * Flow P4 (&lt;i&gt;Fp4&lt;/i&gt;).  Turbine flow value for point 4 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double fp4; // PU

    public Double getFp4() {
        return fp4;
    }

    public void setFp4(Double _value_) {
        fp4 = _value_;
    }

    public void setFp4(String _value_) {
        fp4 = getDoubleFromString(_value_);
    }

    public String fp4ToString() {
        return fp4 != null ? fp4.toString() : null;
    }

    /**
     * Flow P5 (&lt;i&gt;Fp5&lt;/i&gt;).  Turbine flow value for point 5 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double fp5; // PU

    public Double getFp5() {
        return fp5;
    }

    public void setFp5(Double _value_) {
        fp5 = _value_;
    }

    public void setFp5(String _value_) {
        fp5 = getDoubleFromString(_value_);
    }

    public String fp5ToString() {
        return fp5 != null ? fp5.toString() : null;
    }

    /**
     * Flow P6 (&lt;i&gt;Fp6&lt;/i&gt;).  Turbine flow value for point 6 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double fp6; // PU

    public Double getFp6() {
        return fp6;
    }

    public void setFp6(Double _value_) {
        fp6 = _value_;
    }

    public void setFp6(String _value_) {
        fp6 = getDoubleFromString(_value_);
    }

    public String fp6ToString() {
        return fp6 != null ? fp6.toString() : null;
    }

    /**
     * Flow P7 (&lt;i&gt;Fp7&lt;/i&gt;).  Turbine flow value for point 7 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double fp7; // PU

    public Double getFp7() {
        return fp7;
    }

    public void setFp7(Double _value_) {
        fp7 = _value_;
    }

    public void setFp7(String _value_) {
        fp7 = getDoubleFromString(_value_);
    }

    public String fp7ToString() {
        return fp7 != null ? fp7.toString() : null;
    }

    /**
     * Flow P8 (&lt;i&gt;Fp8&lt;/i&gt;).  Turbine flow value for point 8 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double fp8; // PU

    public Double getFp8() {
        return fp8;
    }

    public void setFp8(Double _value_) {
        fp8 = _value_;
    }

    public void setFp8(String _value_) {
        fp8 = getDoubleFromString(_value_);
    }

    public String fp8ToString() {
        return fp8 != null ? fp8.toString() : null;
    }

    /**
     * Flow P9 (&lt;i&gt;Fp9&lt;/i&gt;).  Turbine flow value for point 9 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double fp9; // PU

    public Double getFp9() {
        return fp9;
    }

    public void setFp9(Double _value_) {
        fp9 = _value_;
    }

    public void setFp9(String _value_) {
        fp9 = getDoubleFromString(_value_);
    }

    public String fp9ToString() {
        return fp9 != null ? fp9.toString() : null;
    }

    /**
     * Maximum gate position (&lt;i&gt;Gmax&lt;/i&gt;) (&amp;gt; GovHydroWEH.gmin).
     */
    private Double gmax; // PU

    public Double getGmax() {
        return gmax;
    }

    public void setGmax(Double _value_) {
        gmax = _value_;
    }

    public void setGmax(String _value_) {
        gmax = getDoubleFromString(_value_);
    }

    public String gmaxToString() {
        return gmax != null ? gmax.toString() : null;
    }

    /**
     * Minimum gate position (&lt;i&gt;Gmin&lt;/i&gt;) (&amp;lt; GovHydroWEH.gmax).
     */
    private Double gmin; // PU

    public Double getGmin() {
        return gmin;
    }

    public void setGmin(Double _value_) {
        gmin = _value_;
    }

    public void setGmin(String _value_) {
        gmin = getDoubleFromString(_value_);
    }

    public String gminToString() {
        return gmin != null ? gmin.toString() : null;
    }

    /**
     * Maximum gate closing rate (&lt;i&gt;Gtmxcl&lt;/i&gt;).
     */
    private Double gtmxcl; // PU

    public Double getGtmxcl() {
        return gtmxcl;
    }

    public void setGtmxcl(Double _value_) {
        gtmxcl = _value_;
    }

    public void setGtmxcl(String _value_) {
        gtmxcl = getDoubleFromString(_value_);
    }

    public String gtmxclToString() {
        return gtmxcl != null ? gtmxcl.toString() : null;
    }

    /**
     * Maximum gate opening rate (&lt;i&gt;Gtmxop&lt;/i&gt;).
     */
    private Double gtmxop; // PU

    public Double getGtmxop() {
        return gtmxop;
    }

    public void setGtmxop(Double _value_) {
        gtmxop = _value_;
    }

    public void setGtmxop(String _value_) {
        gtmxop = getDoubleFromString(_value_);
    }

    public String gtmxopToString() {
        return gtmxop != null ? gtmxop.toString() : null;
    }

    /**
     * Gate 1 (&lt;i&gt;Gv1&lt;/i&gt;).  Gate Position value for point 1 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     */
    private Double gv1; // PU

    public Double getGv1() {
        return gv1;
    }

    public void setGv1(Double _value_) {
        gv1 = _value_;
    }

    public void setGv1(String _value_) {
        gv1 = getDoubleFromString(_value_);
    }

    public String gv1ToString() {
        return gv1 != null ? gv1.toString() : null;
    }

    /**
     * Gate 2 (&lt;i&gt;Gv2&lt;/i&gt;).  Gate Position value for point 2 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     */
    private Double gv2; // PU

    public Double getGv2() {
        return gv2;
    }

    public void setGv2(Double _value_) {
        gv2 = _value_;
    }

    public void setGv2(String _value_) {
        gv2 = getDoubleFromString(_value_);
    }

    public String gv2ToString() {
        return gv2 != null ? gv2.toString() : null;
    }

    /**
     * Gate 3 (&lt;i&gt;Gv3&lt;/i&gt;).  Gate Position value for point 3 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     */
    private Double gv3; // PU

    public Double getGv3() {
        return gv3;
    }

    public void setGv3(Double _value_) {
        gv3 = _value_;
    }

    public void setGv3(String _value_) {
        gv3 = getDoubleFromString(_value_);
    }

    public String gv3ToString() {
        return gv3 != null ? gv3.toString() : null;
    }

    /**
     * Gate 4 (&lt;i&gt;Gv4&lt;/i&gt;).  Gate Position value for point 4 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     */
    private Double gv4; // PU

    public Double getGv4() {
        return gv4;
    }

    public void setGv4(Double _value_) {
        gv4 = _value_;
    }

    public void setGv4(String _value_) {
        gv4 = getDoubleFromString(_value_);
    }

    public String gv4ToString() {
        return gv4 != null ? gv4.toString() : null;
    }

    /**
     * Gate 5 (&lt;i&gt;Gv5&lt;/i&gt;).  Gate Position value for point 5 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     */
    private Double gv5; // PU

    public Double getGv5() {
        return gv5;
    }

    public void setGv5(Double _value_) {
        gv5 = _value_;
    }

    public void setGv5(String _value_) {
        gv5 = getDoubleFromString(_value_);
    }

    public String gv5ToString() {
        return gv5 != null ? gv5.toString() : null;
    }

    /**
     * Derivative controller derivative gain (&lt;i&gt;Kd&lt;/i&gt;).
     */
    private Double kd; // PU

    public Double getKd() {
        return kd;
    }

    public void setKd(Double _value_) {
        kd = _value_;
    }

    public void setKd(String _value_) {
        kd = getDoubleFromString(_value_);
    }

    public String kdToString() {
        return kd != null ? kd.toString() : null;
    }

    /**
     * Derivative controller Integral gain (&lt;i&gt;Ki&lt;/i&gt;).
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
     * Derivative control gain (&lt;i&gt;Kp&lt;/i&gt;).
     */
    private Double kp; // PU

    public Double getKp() {
        return kp;
    }

    public void setKp(Double _value_) {
        kp = _value_;
    }

    public void setKp(String _value_) {
        kp = getDoubleFromString(_value_);
    }

    public String kpToString() {
        return kp != null ? kp.toString() : null;
    }

    /**
     * Base for power values (&lt;i&gt;MWbase&lt;/i&gt;) (&amp;gt; 0).  Unit = MW.
     */
    private Double mwbase; // ActivePower

    public Double getMwbase() {
        return mwbase;
    }

    public void setMwbase(Double _value_) {
        mwbase = _value_;
    }

    public void setMwbase(String _value_) {
        mwbase = getDoubleFromString(_value_);
    }

    public String mwbaseToString() {
        return mwbase != null ? mwbase.toString() : null;
    }

    /**
     * Pmss flow P1 (&lt;i&gt;Pmss1&lt;/i&gt;).  Mechanical power output for turbine flow point 1 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double pmss1; // PU

    public Double getPmss1() {
        return pmss1;
    }

    public void setPmss1(Double _value_) {
        pmss1 = _value_;
    }

    public void setPmss1(String _value_) {
        pmss1 = getDoubleFromString(_value_);
    }

    public String pmss1ToString() {
        return pmss1 != null ? pmss1.toString() : null;
    }

    /**
     * Pmss flow P10 (&lt;i&gt;Pmss10&lt;/i&gt;).  Mechanical power output for turbine flow point 10 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double pmss10; // PU

    public Double getPmss10() {
        return pmss10;
    }

    public void setPmss10(Double _value_) {
        pmss10 = _value_;
    }

    public void setPmss10(String _value_) {
        pmss10 = getDoubleFromString(_value_);
    }

    public String pmss10ToString() {
        return pmss10 != null ? pmss10.toString() : null;
    }

    /**
     * Pmss flow P2 (&lt;i&gt;Pmss2&lt;/i&gt;).  Mechanical power output for turbine flow point 2 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double pmss2; // PU

    public Double getPmss2() {
        return pmss2;
    }

    public void setPmss2(Double _value_) {
        pmss2 = _value_;
    }

    public void setPmss2(String _value_) {
        pmss2 = getDoubleFromString(_value_);
    }

    public String pmss2ToString() {
        return pmss2 != null ? pmss2.toString() : null;
    }

    /**
     * Pmss flow P3 (&lt;i&gt;Pmss3&lt;/i&gt;).  Mechanical power output for turbine flow point 3 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double pmss3; // PU

    public Double getPmss3() {
        return pmss3;
    }

    public void setPmss3(Double _value_) {
        pmss3 = _value_;
    }

    public void setPmss3(String _value_) {
        pmss3 = getDoubleFromString(_value_);
    }

    public String pmss3ToString() {
        return pmss3 != null ? pmss3.toString() : null;
    }

    /**
     * Pmss flow P4 (&lt;i&gt;Pmss4&lt;/i&gt;).  Mechanical power output for turbine flow point 4 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double pmss4; // PU

    public Double getPmss4() {
        return pmss4;
    }

    public void setPmss4(Double _value_) {
        pmss4 = _value_;
    }

    public void setPmss4(String _value_) {
        pmss4 = getDoubleFromString(_value_);
    }

    public String pmss4ToString() {
        return pmss4 != null ? pmss4.toString() : null;
    }

    /**
     * Pmss flow P5 (&lt;i&gt;Pmss5&lt;/i&gt;).  Mechanical power output for turbine flow point 5 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double pmss5; // PU

    public Double getPmss5() {
        return pmss5;
    }

    public void setPmss5(Double _value_) {
        pmss5 = _value_;
    }

    public void setPmss5(String _value_) {
        pmss5 = getDoubleFromString(_value_);
    }

    public String pmss5ToString() {
        return pmss5 != null ? pmss5.toString() : null;
    }

    /**
     * Pmss flow P6 (&lt;i&gt;Pmss6&lt;/i&gt;).  Mechanical power output for turbine flow point 6 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double pmss6; // PU

    public Double getPmss6() {
        return pmss6;
    }

    public void setPmss6(Double _value_) {
        pmss6 = _value_;
    }

    public void setPmss6(String _value_) {
        pmss6 = getDoubleFromString(_value_);
    }

    public String pmss6ToString() {
        return pmss6 != null ? pmss6.toString() : null;
    }

    /**
     * Pmss flow P7 (&lt;i&gt;Pmss7&lt;/i&gt;).  Mechanical power output for turbine flow point 7 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double pmss7; // PU

    public Double getPmss7() {
        return pmss7;
    }

    public void setPmss7(Double _value_) {
        pmss7 = _value_;
    }

    public void setPmss7(String _value_) {
        pmss7 = getDoubleFromString(_value_);
    }

    public String pmss7ToString() {
        return pmss7 != null ? pmss7.toString() : null;
    }

    /**
     * Pmss flow P8 (&lt;i&gt;Pmss8&lt;/i&gt;).  Mechanical power output for turbine flow point 8 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double pmss8; // PU

    public Double getPmss8() {
        return pmss8;
    }

    public void setPmss8(Double _value_) {
        pmss8 = _value_;
    }

    public void setPmss8(String _value_) {
        pmss8 = getDoubleFromString(_value_);
    }

    public String pmss8ToString() {
        return pmss8 != null ? pmss8.toString() : null;
    }

    /**
     * Pmss flow P9 (&lt;i&gt;Pmss9&lt;/i&gt;).  Mechanical power output for turbine flow point 9 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double pmss9; // PU

    public Double getPmss9() {
        return pmss9;
    }

    public void setPmss9(Double _value_) {
        pmss9 = _value_;
    }

    public void setPmss9(String _value_) {
        pmss9 = getDoubleFromString(_value_);
    }

    public String pmss9ToString() {
        return pmss9 != null ? pmss9.toString() : null;
    }

    /**
     * Permanent droop for governor output feedback (&lt;i&gt;R-Perm-Gate&lt;/i&gt;).
     */
    private Float rpg; // Float

    public Float getRpg() {
        return rpg;
    }

    public void setRpg(Float _value_) {
        rpg = _value_;
    }

    public void setRpg(String _value_) {
        rpg = getFloatFromString(_value_);
    }

    public String rpgToString() {
        return rpg != null ? rpg.toString() : null;
    }

    /**
     * Permanent droop for electrical power feedback (&lt;i&gt;R-Perm-Pe&lt;/i&gt;).
     */
    private Float rpp; // Float

    public Float getRpp() {
        return rpp;
    }

    public void setRpp(Float _value_) {
        rpp = _value_;
    }

    public void setRpp(String _value_) {
        rpp = getFloatFromString(_value_);
    }

    public String rppToString() {
        return rpp != null ? rpp.toString() : null;
    }

    /**
     * Derivative controller time constant (&lt;i&gt;Td&lt;/i&gt;) (&amp;gt;= 0).  Limits the derivative characteristic beyond a breakdown frequency to avoid amplification of high-frequency noise.
     */
    private Double td; // Seconds

    public Double getTd() {
        return td;
    }

    public void setTd(Double _value_) {
        td = _value_;
    }

    public void setTd(String _value_) {
        td = getDoubleFromString(_value_);
    }

    public String tdToString() {
        return td != null ? td.toString() : null;
    }

    /**
     * Distributive valve time lag time constant (&lt;i&gt;Tdv&lt;/i&gt;) (&amp;gt;= 0).
     */
    private Double tdv; // Seconds

    public Double getTdv() {
        return tdv;
    }

    public void setTdv(Double _value_) {
        tdv = _value_;
    }

    public void setTdv(String _value_) {
        tdv = getDoubleFromString(_value_);
    }

    public String tdvToString() {
        return tdv != null ? tdv.toString() : null;
    }

    /**
     * Value to allow the distribution valve controller to advance beyond the gate movement rate limit (&lt;i&gt;Tg&lt;/i&gt;) (&amp;gt;= 0).
     */
    private Double tg; // Seconds

    public Double getTg() {
        return tg;
    }

    public void setTg(Double _value_) {
        tg = _value_;
    }

    public void setTg(String _value_) {
        tg = getDoubleFromString(_value_);
    }

    public String tgToString() {
        return tg != null ? tg.toString() : null;
    }

    /**
     * Pilot valve time lag time constant (&lt;i&gt;Tp&lt;/i&gt;) (&amp;gt;= 0).
     */
    private Double tp; // Seconds

    public Double getTp() {
        return tp;
    }

    public void setTp(Double _value_) {
        tp = _value_;
    }

    public void setTp(String _value_) {
        tp = getDoubleFromString(_value_);
    }

    public String tpToString() {
        return tp != null ? tp.toString() : null;
    }

    /**
     * Electrical power droop time constant (&lt;i&gt;Tpe&lt;/i&gt;) (&amp;gt;= 0).
     */
    private Double tpe; // Seconds

    public Double getTpe() {
        return tpe;
    }

    public void setTpe(Double _value_) {
        tpe = _value_;
    }

    public void setTpe(String _value_) {
        tpe = getDoubleFromString(_value_);
    }

    public String tpeToString() {
        return tpe != null ? tpe.toString() : null;
    }

    /**
     * Water inertia time constant (&lt;i&gt;Tw&lt;/i&gt;) (&amp;gt; 0).
     */
    private Double tw; // Seconds

    public Double getTw() {
        return tw;
    }

    public void setTw(Double _value_) {
        tw = _value_;
    }

    public void setTw(String _value_) {
        tw = getDoubleFromString(_value_);
    }

    public String twToString() {
        return tw != null ? tw.toString() : null;
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
        return getAttribute("GovHydroWEH", attrName);
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
        setAttribute("GovHydroWEH", attrName, objectValue);
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
        setAttribute("GovHydroWEH", attrName, stringValue);
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

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/CIM100#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db", new AttrDetails("GovHydroWEH.db", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dicn", new AttrDetails("GovHydroWEH.dicn", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dpv", new AttrDetails("GovHydroWEH.dpv", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dturb", new AttrDetails("GovHydroWEH.dturb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("feedbackSignal", new AttrDetails("GovHydroWEH.feedbackSignal", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fl1", new AttrDetails("GovHydroWEH.fl1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fl2", new AttrDetails("GovHydroWEH.fl2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fl3", new AttrDetails("GovHydroWEH.fl3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fl4", new AttrDetails("GovHydroWEH.fl4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fl5", new AttrDetails("GovHydroWEH.fl5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fp1", new AttrDetails("GovHydroWEH.fp1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fp10", new AttrDetails("GovHydroWEH.fp10", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fp2", new AttrDetails("GovHydroWEH.fp2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fp3", new AttrDetails("GovHydroWEH.fp3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fp4", new AttrDetails("GovHydroWEH.fp4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fp5", new AttrDetails("GovHydroWEH.fp5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fp6", new AttrDetails("GovHydroWEH.fp6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fp7", new AttrDetails("GovHydroWEH.fp7", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fp8", new AttrDetails("GovHydroWEH.fp8", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fp9", new AttrDetails("GovHydroWEH.fp9", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gmax", new AttrDetails("GovHydroWEH.gmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gmin", new AttrDetails("GovHydroWEH.gmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gtmxcl", new AttrDetails("GovHydroWEH.gtmxcl", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gtmxop", new AttrDetails("GovHydroWEH.gtmxop", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv1", new AttrDetails("GovHydroWEH.gv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv2", new AttrDetails("GovHydroWEH.gv2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv3", new AttrDetails("GovHydroWEH.gv3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv4", new AttrDetails("GovHydroWEH.gv4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv5", new AttrDetails("GovHydroWEH.gv5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("GovHydroWEH.kd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("GovHydroWEH.ki", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("GovHydroWEH.kp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovHydroWEH.mwbase", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmss1", new AttrDetails("GovHydroWEH.pmss1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmss10", new AttrDetails("GovHydroWEH.pmss10", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmss2", new AttrDetails("GovHydroWEH.pmss2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmss3", new AttrDetails("GovHydroWEH.pmss3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmss4", new AttrDetails("GovHydroWEH.pmss4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmss5", new AttrDetails("GovHydroWEH.pmss5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmss6", new AttrDetails("GovHydroWEH.pmss6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmss7", new AttrDetails("GovHydroWEH.pmss7", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmss8", new AttrDetails("GovHydroWEH.pmss8", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmss9", new AttrDetails("GovHydroWEH.pmss9", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rpg", new AttrDetails("GovHydroWEH.rpg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rpp", new AttrDetails("GovHydroWEH.rpp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("td", new AttrDetails("GovHydroWEH.td", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tdv", new AttrDetails("GovHydroWEH.tdv", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tg", new AttrDetails("GovHydroWEH.tg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tp", new AttrDetails("GovHydroWEH.tp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpe", new AttrDetails("GovHydroWEH.tpe", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw", new AttrDetails("GovHydroWEH.tw", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovHydroWEH().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("db", new GetterSetter(this::dbToString, null, this::setDb));
        map.put("dicn", new GetterSetter(this::dicnToString, null, this::setDicn));
        map.put("dpv", new GetterSetter(this::dpvToString, null, this::setDpv));
        map.put("dturb", new GetterSetter(this::dturbToString, null, this::setDturb));
        map.put("feedbackSignal", new GetterSetter(this::feedbackSignalToString, null, this::setFeedbackSignal));
        map.put("fl1", new GetterSetter(this::fl1ToString, null, this::setFl1));
        map.put("fl2", new GetterSetter(this::fl2ToString, null, this::setFl2));
        map.put("fl3", new GetterSetter(this::fl3ToString, null, this::setFl3));
        map.put("fl4", new GetterSetter(this::fl4ToString, null, this::setFl4));
        map.put("fl5", new GetterSetter(this::fl5ToString, null, this::setFl5));
        map.put("fp1", new GetterSetter(this::fp1ToString, null, this::setFp1));
        map.put("fp10", new GetterSetter(this::fp10ToString, null, this::setFp10));
        map.put("fp2", new GetterSetter(this::fp2ToString, null, this::setFp2));
        map.put("fp3", new GetterSetter(this::fp3ToString, null, this::setFp3));
        map.put("fp4", new GetterSetter(this::fp4ToString, null, this::setFp4));
        map.put("fp5", new GetterSetter(this::fp5ToString, null, this::setFp5));
        map.put("fp6", new GetterSetter(this::fp6ToString, null, this::setFp6));
        map.put("fp7", new GetterSetter(this::fp7ToString, null, this::setFp7));
        map.put("fp8", new GetterSetter(this::fp8ToString, null, this::setFp8));
        map.put("fp9", new GetterSetter(this::fp9ToString, null, this::setFp9));
        map.put("gmax", new GetterSetter(this::gmaxToString, null, this::setGmax));
        map.put("gmin", new GetterSetter(this::gminToString, null, this::setGmin));
        map.put("gtmxcl", new GetterSetter(this::gtmxclToString, null, this::setGtmxcl));
        map.put("gtmxop", new GetterSetter(this::gtmxopToString, null, this::setGtmxop));
        map.put("gv1", new GetterSetter(this::gv1ToString, null, this::setGv1));
        map.put("gv2", new GetterSetter(this::gv2ToString, null, this::setGv2));
        map.put("gv3", new GetterSetter(this::gv3ToString, null, this::setGv3));
        map.put("gv4", new GetterSetter(this::gv4ToString, null, this::setGv4));
        map.put("gv5", new GetterSetter(this::gv5ToString, null, this::setGv5));
        map.put("kd", new GetterSetter(this::kdToString, null, this::setKd));
        map.put("ki", new GetterSetter(this::kiToString, null, this::setKi));
        map.put("kp", new GetterSetter(this::kpToString, null, this::setKp));
        map.put("mwbase", new GetterSetter(this::mwbaseToString, null, this::setMwbase));
        map.put("pmss1", new GetterSetter(this::pmss1ToString, null, this::setPmss1));
        map.put("pmss10", new GetterSetter(this::pmss10ToString, null, this::setPmss10));
        map.put("pmss2", new GetterSetter(this::pmss2ToString, null, this::setPmss2));
        map.put("pmss3", new GetterSetter(this::pmss3ToString, null, this::setPmss3));
        map.put("pmss4", new GetterSetter(this::pmss4ToString, null, this::setPmss4));
        map.put("pmss5", new GetterSetter(this::pmss5ToString, null, this::setPmss5));
        map.put("pmss6", new GetterSetter(this::pmss6ToString, null, this::setPmss6));
        map.put("pmss7", new GetterSetter(this::pmss7ToString, null, this::setPmss7));
        map.put("pmss8", new GetterSetter(this::pmss8ToString, null, this::setPmss8));
        map.put("pmss9", new GetterSetter(this::pmss9ToString, null, this::setPmss9));
        map.put("rpg", new GetterSetter(this::rpgToString, null, this::setRpg));
        map.put("rpp", new GetterSetter(this::rppToString, null, this::setRpp));
        map.put("td", new GetterSetter(this::tdToString, null, this::setTd));
        map.put("tdv", new GetterSetter(this::tdvToString, null, this::setTdv));
        map.put("tg", new GetterSetter(this::tgToString, null, this::setTg));
        map.put("tp", new GetterSetter(this::tpToString, null, this::setTp));
        map.put("tpe", new GetterSetter(this::tpeToString, null, this::setTpe));
        map.put("tw", new GetterSetter(this::twToString, null, this::setTw));
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
