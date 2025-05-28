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
     * Constructor.
     */
    public GovHydroWEH(String rdfid) {
        super("GovHydroWEH", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovHydroWEH(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Speed deadband (<i>db</i>).
     */
    private Double db; // PU

    public Double getDb() {
        return db;
    }

    public void setDb(Double _value_) {
        db = _value_;
    }

    private static Object getDb(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getDb();
    }

    private static void setDb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setDb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setDb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Value to allow the integral controller to advance beyond the gate limits (<i>Dicn</i>).
     */
    private Double dicn; // PU

    public Double getDicn() {
        return dicn;
    }

    public void setDicn(Double _value_) {
        dicn = _value_;
    }

    private static Object getDicn(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getDicn();
    }

    private static void setDicn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setDicn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setDicn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Value to allow the pilot valve controller to advance beyond the gate limits (<i>Dpv</i>).
     */
    private Double dpv; // PU

    public Double getDpv() {
        return dpv;
    }

    public void setDpv(Double _value_) {
        dpv = _value_;
    }

    private static Object getDpv(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getDpv();
    }

    private static void setDpv(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setDpv((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setDpv(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Turbine damping factor (<i>Dturb</i>).  Unit = delta P (PU of <i>MWbase</i>) / delta speed (PU).
     */
    private Double dturb; // PU

    public Double getDturb() {
        return dturb;
    }

    public void setDturb(Double _value_) {
        dturb = _value_;
    }

    private static Object getDturb(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getDturb();
    }

    private static void setDturb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setDturb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setDturb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Feedback signal selection (<i>Sw</i>). true = PID output (if <i>R-Perm-Gate </i>= droop and <i>R-Perm-Pe </i>= 0) false = electrical power (if <i>R-Perm-Gate </i>= 0 and <i>R-Perm-Pe </i>= droop) or false = gate position (if R<i>-Perm-Gate </i>= droop and <i>R-Perm-Pe </i>= 0). Typical value = false.
     */
    private Boolean feedbackSignal; // Boolean

    public Boolean getFeedbackSignal() {
        return feedbackSignal;
    }

    public void setFeedbackSignal(Boolean _value_) {
        feedbackSignal = _value_;
    }

    private static Object getFeedbackSignal(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getFeedbackSignal();
    }

    private static void setFeedbackSignal(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((GovHydroWEH) _this_).setFeedbackSignal((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setFeedbackSignal(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Flowgate 1 (<i>Fl1</i>).  Flow value for gate position point 1 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     */
    private Double fl1; // PU

    public Double getFl1() {
        return fl1;
    }

    public void setFl1(Double _value_) {
        fl1 = _value_;
    }

    private static Object getFl1(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getFl1();
    }

    private static void setFl1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setFl1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setFl1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Flowgate 2 (<i>Fl2</i>).  Flow value for gate position point 2 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     */
    private Double fl2; // PU

    public Double getFl2() {
        return fl2;
    }

    public void setFl2(Double _value_) {
        fl2 = _value_;
    }

    private static Object getFl2(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getFl2();
    }

    private static void setFl2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setFl2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setFl2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Flowgate 3 (<i>Fl3</i>).  Flow value for gate position point 3 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     */
    private Double fl3; // PU

    public Double getFl3() {
        return fl3;
    }

    public void setFl3(Double _value_) {
        fl3 = _value_;
    }

    private static Object getFl3(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getFl3();
    }

    private static void setFl3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setFl3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setFl3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Flowgate 4 (<i>Fl4</i>).  Flow value for gate position point 4 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     */
    private Double fl4; // PU

    public Double getFl4() {
        return fl4;
    }

    public void setFl4(Double _value_) {
        fl4 = _value_;
    }

    private static Object getFl4(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getFl4();
    }

    private static void setFl4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setFl4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setFl4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Flowgate 5 (<i>Fl5</i>).  Flow value for gate position point 5 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     */
    private Double fl5; // PU

    public Double getFl5() {
        return fl5;
    }

    public void setFl5(Double _value_) {
        fl5 = _value_;
    }

    private static Object getFl5(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getFl5();
    }

    private static void setFl5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setFl5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setFl5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Flow P1 (<i>Fp1</i>).  Turbine flow value for point 1 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double fp1; // PU

    public Double getFp1() {
        return fp1;
    }

    public void setFp1(Double _value_) {
        fp1 = _value_;
    }

    private static Object getFp1(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getFp1();
    }

    private static void setFp1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setFp1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setFp1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Flow P10 (<i>Fp10</i>).  Turbine flow value for point 10 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double fp10; // PU

    public Double getFp10() {
        return fp10;
    }

    public void setFp10(Double _value_) {
        fp10 = _value_;
    }

    private static Object getFp10(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getFp10();
    }

    private static void setFp10(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setFp10((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setFp10(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Flow P2 (<i>Fp2</i>).  Turbine flow value for point 2 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double fp2; // PU

    public Double getFp2() {
        return fp2;
    }

    public void setFp2(Double _value_) {
        fp2 = _value_;
    }

    private static Object getFp2(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getFp2();
    }

    private static void setFp2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setFp2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setFp2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Flow P3 (<i>Fp3</i>).  Turbine flow value for point 3 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double fp3; // PU

    public Double getFp3() {
        return fp3;
    }

    public void setFp3(Double _value_) {
        fp3 = _value_;
    }

    private static Object getFp3(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getFp3();
    }

    private static void setFp3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setFp3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setFp3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Flow P4 (<i>Fp4</i>).  Turbine flow value for point 4 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double fp4; // PU

    public Double getFp4() {
        return fp4;
    }

    public void setFp4(Double _value_) {
        fp4 = _value_;
    }

    private static Object getFp4(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getFp4();
    }

    private static void setFp4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setFp4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setFp4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Flow P5 (<i>Fp5</i>).  Turbine flow value for point 5 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double fp5; // PU

    public Double getFp5() {
        return fp5;
    }

    public void setFp5(Double _value_) {
        fp5 = _value_;
    }

    private static Object getFp5(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getFp5();
    }

    private static void setFp5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setFp5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setFp5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Flow P6 (<i>Fp6</i>).  Turbine flow value for point 6 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double fp6; // PU

    public Double getFp6() {
        return fp6;
    }

    public void setFp6(Double _value_) {
        fp6 = _value_;
    }

    private static Object getFp6(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getFp6();
    }

    private static void setFp6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setFp6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setFp6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Flow P7 (<i>Fp7</i>).  Turbine flow value for point 7 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double fp7; // PU

    public Double getFp7() {
        return fp7;
    }

    public void setFp7(Double _value_) {
        fp7 = _value_;
    }

    private static Object getFp7(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getFp7();
    }

    private static void setFp7(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setFp7((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setFp7(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Flow P8 (<i>Fp8</i>).  Turbine flow value for point 8 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double fp8; // PU

    public Double getFp8() {
        return fp8;
    }

    public void setFp8(Double _value_) {
        fp8 = _value_;
    }

    private static Object getFp8(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getFp8();
    }

    private static void setFp8(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setFp8((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setFp8(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Flow P9 (<i>Fp9</i>).  Turbine flow value for point 9 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double fp9; // PU

    public Double getFp9() {
        return fp9;
    }

    public void setFp9(Double _value_) {
        fp9 = _value_;
    }

    private static Object getFp9(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getFp9();
    }

    private static void setFp9(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setFp9((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setFp9(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum gate position (<i>Gmax</i>) (&gt; GovHydroWEH.gmin).
     */
    private Double gmax; // PU

    public Double getGmax() {
        return gmax;
    }

    public void setGmax(Double _value_) {
        gmax = _value_;
    }

    private static Object getGmax(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getGmax();
    }

    private static void setGmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setGmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setGmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum gate position (<i>Gmin</i>) (&lt; GovHydroWEH.gmax).
     */
    private Double gmin; // PU

    public Double getGmin() {
        return gmin;
    }

    public void setGmin(Double _value_) {
        gmin = _value_;
    }

    private static Object getGmin(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getGmin();
    }

    private static void setGmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setGmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setGmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum gate closing rate (<i>Gtmxcl</i>).
     */
    private Double gtmxcl; // PU

    public Double getGtmxcl() {
        return gtmxcl;
    }

    public void setGtmxcl(Double _value_) {
        gtmxcl = _value_;
    }

    private static Object getGtmxcl(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getGtmxcl();
    }

    private static void setGtmxcl(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setGtmxcl((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setGtmxcl(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum gate opening rate (<i>Gtmxop</i>).
     */
    private Double gtmxop; // PU

    public Double getGtmxop() {
        return gtmxop;
    }

    public void setGtmxop(Double _value_) {
        gtmxop = _value_;
    }

    private static Object getGtmxop(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getGtmxop();
    }

    private static void setGtmxop(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setGtmxop((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setGtmxop(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gate 1 (<i>Gv1</i>).  Gate Position value for point 1 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     */
    private Double gv1; // PU

    public Double getGv1() {
        return gv1;
    }

    public void setGv1(Double _value_) {
        gv1 = _value_;
    }

    private static Object getGv1(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getGv1();
    }

    private static void setGv1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setGv1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setGv1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gate 2 (<i>Gv2</i>).  Gate Position value for point 2 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     */
    private Double gv2; // PU

    public Double getGv2() {
        return gv2;
    }

    public void setGv2(Double _value_) {
        gv2 = _value_;
    }

    private static Object getGv2(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getGv2();
    }

    private static void setGv2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setGv2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setGv2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gate 3 (<i>Gv3</i>).  Gate Position value for point 3 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     */
    private Double gv3; // PU

    public Double getGv3() {
        return gv3;
    }

    public void setGv3(Double _value_) {
        gv3 = _value_;
    }

    private static Object getGv3(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getGv3();
    }

    private static void setGv3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setGv3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setGv3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gate 4 (<i>Gv4</i>).  Gate Position value for point 4 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     */
    private Double gv4; // PU

    public Double getGv4() {
        return gv4;
    }

    public void setGv4(Double _value_) {
        gv4 = _value_;
    }

    private static Object getGv4(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getGv4();
    }

    private static void setGv4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setGv4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setGv4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gate 5 (<i>Gv5</i>).  Gate Position value for point 5 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     */
    private Double gv5; // PU

    public Double getGv5() {
        return gv5;
    }

    public void setGv5(Double _value_) {
        gv5 = _value_;
    }

    private static Object getGv5(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getGv5();
    }

    private static void setGv5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setGv5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setGv5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Derivative controller derivative gain (<i>Kd</i>).
     */
    private Double kd; // PU

    public Double getKd() {
        return kd;
    }

    public void setKd(Double _value_) {
        kd = _value_;
    }

    private static Object getKd(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getKd();
    }

    private static void setKd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setKd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setKd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Derivative controller Integral gain (<i>Ki</i>).
     */
    private Double ki; // PU

    public Double getKi() {
        return ki;
    }

    public void setKi(Double _value_) {
        ki = _value_;
    }

    private static Object getKi(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getKi();
    }

    private static void setKi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setKi((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setKi(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Derivative control gain (<i>Kp</i>).
     */
    private Double kp; // PU

    public Double getKp() {
        return kp;
    }

    public void setKp(Double _value_) {
        kp = _value_;
    }

    private static Object getKp(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getKp();
    }

    private static void setKp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setKp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setKp(getDoubleFromString((String) _value_));
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
        return ((GovHydroWEH) _this_).getMwbase();
    }

    private static void setMwbase(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setMwbase((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setMwbase(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Pmss flow P1 (<i>Pmss1</i>).  Mechanical power output for turbine flow point 1 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double pmss1; // PU

    public Double getPmss1() {
        return pmss1;
    }

    public void setPmss1(Double _value_) {
        pmss1 = _value_;
    }

    private static Object getPmss1(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getPmss1();
    }

    private static void setPmss1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setPmss1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setPmss1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Pmss flow P10 (<i>Pmss10</i>).  Mechanical power output for turbine flow point 10 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double pmss10; // PU

    public Double getPmss10() {
        return pmss10;
    }

    public void setPmss10(Double _value_) {
        pmss10 = _value_;
    }

    private static Object getPmss10(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getPmss10();
    }

    private static void setPmss10(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setPmss10((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setPmss10(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Pmss flow P2 (<i>Pmss2</i>).  Mechanical power output for turbine flow point 2 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double pmss2; // PU

    public Double getPmss2() {
        return pmss2;
    }

    public void setPmss2(Double _value_) {
        pmss2 = _value_;
    }

    private static Object getPmss2(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getPmss2();
    }

    private static void setPmss2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setPmss2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setPmss2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Pmss flow P3 (<i>Pmss3</i>).  Mechanical power output for turbine flow point 3 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double pmss3; // PU

    public Double getPmss3() {
        return pmss3;
    }

    public void setPmss3(Double _value_) {
        pmss3 = _value_;
    }

    private static Object getPmss3(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getPmss3();
    }

    private static void setPmss3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setPmss3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setPmss3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Pmss flow P4 (<i>Pmss4</i>).  Mechanical power output for turbine flow point 4 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double pmss4; // PU

    public Double getPmss4() {
        return pmss4;
    }

    public void setPmss4(Double _value_) {
        pmss4 = _value_;
    }

    private static Object getPmss4(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getPmss4();
    }

    private static void setPmss4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setPmss4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setPmss4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Pmss flow P5 (<i>Pmss5</i>).  Mechanical power output for turbine flow point 5 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double pmss5; // PU

    public Double getPmss5() {
        return pmss5;
    }

    public void setPmss5(Double _value_) {
        pmss5 = _value_;
    }

    private static Object getPmss5(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getPmss5();
    }

    private static void setPmss5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setPmss5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setPmss5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Pmss flow P6 (<i>Pmss6</i>).  Mechanical power output for turbine flow point 6 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double pmss6; // PU

    public Double getPmss6() {
        return pmss6;
    }

    public void setPmss6(Double _value_) {
        pmss6 = _value_;
    }

    private static Object getPmss6(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getPmss6();
    }

    private static void setPmss6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setPmss6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setPmss6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Pmss flow P7 (<i>Pmss7</i>).  Mechanical power output for turbine flow point 7 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double pmss7; // PU

    public Double getPmss7() {
        return pmss7;
    }

    public void setPmss7(Double _value_) {
        pmss7 = _value_;
    }

    private static Object getPmss7(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getPmss7();
    }

    private static void setPmss7(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setPmss7((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setPmss7(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Pmss flow P8 (<i>Pmss8</i>).  Mechanical power output for turbine flow point 8 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double pmss8; // PU

    public Double getPmss8() {
        return pmss8;
    }

    public void setPmss8(Double _value_) {
        pmss8 = _value_;
    }

    private static Object getPmss8(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getPmss8();
    }

    private static void setPmss8(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setPmss8((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setPmss8(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Pmss flow P9 (<i>Pmss9</i>).  Mechanical power output for turbine flow point 9 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     */
    private Double pmss9; // PU

    public Double getPmss9() {
        return pmss9;
    }

    public void setPmss9(Double _value_) {
        pmss9 = _value_;
    }

    private static Object getPmss9(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getPmss9();
    }

    private static void setPmss9(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setPmss9((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setPmss9(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Permanent droop for governor output feedback (<i>R-Perm-Gate</i>).
     */
    private Float rpg; // Float

    public Float getRpg() {
        return rpg;
    }

    public void setRpg(Float _value_) {
        rpg = _value_;
    }

    private static Object getRpg(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getRpg();
    }

    private static void setRpg(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovHydroWEH) _this_).setRpg((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setRpg(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Permanent droop for electrical power feedback (<i>R-Perm-Pe</i>).
     */
    private Float rpp; // Float

    public Float getRpp() {
        return rpp;
    }

    public void setRpp(Float _value_) {
        rpp = _value_;
    }

    private static Object getRpp(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getRpp();
    }

    private static void setRpp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovHydroWEH) _this_).setRpp((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setRpp(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Derivative controller time constant (<i>Td</i>) (&gt;= 0).  Limits the derivative characteristic beyond a breakdown frequency to avoid amplification of high-frequency noise.
     */
    private Double td; // Seconds

    public Double getTd() {
        return td;
    }

    public void setTd(Double _value_) {
        td = _value_;
    }

    private static Object getTd(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getTd();
    }

    private static void setTd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setTd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setTd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Distributive valve time lag time constant (<i>Tdv</i>) (&gt;= 0).
     */
    private Double tdv; // Seconds

    public Double getTdv() {
        return tdv;
    }

    public void setTdv(Double _value_) {
        tdv = _value_;
    }

    private static Object getTdv(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getTdv();
    }

    private static void setTdv(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setTdv((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setTdv(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Value to allow the distribution valve controller to advance beyond the gate movement rate limit (<i>Tg</i>) (&gt;= 0).
     */
    private Double tg; // Seconds

    public Double getTg() {
        return tg;
    }

    public void setTg(Double _value_) {
        tg = _value_;
    }

    private static Object getTg(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getTg();
    }

    private static void setTg(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setTg((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setTg(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Pilot valve time lag time constant (<i>Tp</i>) (&gt;= 0).
     */
    private Double tp; // Seconds

    public Double getTp() {
        return tp;
    }

    public void setTp(Double _value_) {
        tp = _value_;
    }

    private static Object getTp(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getTp();
    }

    private static void setTp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setTp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setTp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Electrical power droop time constant (<i>Tpe</i>) (&gt;= 0).
     */
    private Double tpe; // Seconds

    public Double getTpe() {
        return tpe;
    }

    public void setTpe(Double _value_) {
        tpe = _value_;
    }

    private static Object getTpe(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getTpe();
    }

    private static void setTpe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setTpe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setTpe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Water inertia time constant (<i>Tw</i>) (&gt; 0).
     */
    private Double tw; // Seconds

    public Double getTw() {
        return tw;
    }

    public void setTw(Double _value_) {
        tw = _value_;
    }

    private static Object getTw(BaseClass _this_) {
        return ((GovHydroWEH) _this_).getTw();
    }

    private static void setTw(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWEH) _this_).setTw((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWEH) _this_).setTw(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovHydroWEH", attrName));
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
                "GovHydroWEH", attrName, value));
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
            map.put("db", new AttrDetails("GovHydroWEH.db", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getDb, GovHydroWEH::setDb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dicn", new AttrDetails("GovHydroWEH.dicn", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getDicn, GovHydroWEH::setDicn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dpv", new AttrDetails("GovHydroWEH.dpv", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getDpv, GovHydroWEH::setDpv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dturb", new AttrDetails("GovHydroWEH.dturb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getDturb, GovHydroWEH::setDturb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("feedbackSignal", new AttrDetails("GovHydroWEH.feedbackSignal", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getFeedbackSignal, GovHydroWEH::setFeedbackSignal));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fl1", new AttrDetails("GovHydroWEH.fl1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getFl1, GovHydroWEH::setFl1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fl2", new AttrDetails("GovHydroWEH.fl2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getFl2, GovHydroWEH::setFl2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fl3", new AttrDetails("GovHydroWEH.fl3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getFl3, GovHydroWEH::setFl3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fl4", new AttrDetails("GovHydroWEH.fl4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getFl4, GovHydroWEH::setFl4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fl5", new AttrDetails("GovHydroWEH.fl5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getFl5, GovHydroWEH::setFl5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fp1", new AttrDetails("GovHydroWEH.fp1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getFp1, GovHydroWEH::setFp1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fp10", new AttrDetails("GovHydroWEH.fp10", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getFp10, GovHydroWEH::setFp10));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fp2", new AttrDetails("GovHydroWEH.fp2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getFp2, GovHydroWEH::setFp2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fp3", new AttrDetails("GovHydroWEH.fp3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getFp3, GovHydroWEH::setFp3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fp4", new AttrDetails("GovHydroWEH.fp4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getFp4, GovHydroWEH::setFp4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fp5", new AttrDetails("GovHydroWEH.fp5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getFp5, GovHydroWEH::setFp5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fp6", new AttrDetails("GovHydroWEH.fp6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getFp6, GovHydroWEH::setFp6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fp7", new AttrDetails("GovHydroWEH.fp7", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getFp7, GovHydroWEH::setFp7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fp8", new AttrDetails("GovHydroWEH.fp8", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getFp8, GovHydroWEH::setFp8));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fp9", new AttrDetails("GovHydroWEH.fp9", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getFp9, GovHydroWEH::setFp9));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gmax", new AttrDetails("GovHydroWEH.gmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getGmax, GovHydroWEH::setGmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gmin", new AttrDetails("GovHydroWEH.gmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getGmin, GovHydroWEH::setGmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gtmxcl", new AttrDetails("GovHydroWEH.gtmxcl", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getGtmxcl, GovHydroWEH::setGtmxcl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gtmxop", new AttrDetails("GovHydroWEH.gtmxop", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getGtmxop, GovHydroWEH::setGtmxop));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv1", new AttrDetails("GovHydroWEH.gv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getGv1, GovHydroWEH::setGv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv2", new AttrDetails("GovHydroWEH.gv2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getGv2, GovHydroWEH::setGv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv3", new AttrDetails("GovHydroWEH.gv3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getGv3, GovHydroWEH::setGv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv4", new AttrDetails("GovHydroWEH.gv4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getGv4, GovHydroWEH::setGv4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv5", new AttrDetails("GovHydroWEH.gv5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getGv5, GovHydroWEH::setGv5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("GovHydroWEH.kd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getKd, GovHydroWEH::setKd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("GovHydroWEH.ki", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getKi, GovHydroWEH::setKi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("GovHydroWEH.kp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getKp, GovHydroWEH::setKp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovHydroWEH.mwbase", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getMwbase, GovHydroWEH::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmss1", new AttrDetails("GovHydroWEH.pmss1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getPmss1, GovHydroWEH::setPmss1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmss10", new AttrDetails("GovHydroWEH.pmss10", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getPmss10, GovHydroWEH::setPmss10));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmss2", new AttrDetails("GovHydroWEH.pmss2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getPmss2, GovHydroWEH::setPmss2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmss3", new AttrDetails("GovHydroWEH.pmss3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getPmss3, GovHydroWEH::setPmss3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmss4", new AttrDetails("GovHydroWEH.pmss4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getPmss4, GovHydroWEH::setPmss4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmss5", new AttrDetails("GovHydroWEH.pmss5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getPmss5, GovHydroWEH::setPmss5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmss6", new AttrDetails("GovHydroWEH.pmss6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getPmss6, GovHydroWEH::setPmss6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmss7", new AttrDetails("GovHydroWEH.pmss7", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getPmss7, GovHydroWEH::setPmss7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmss8", new AttrDetails("GovHydroWEH.pmss8", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getPmss8, GovHydroWEH::setPmss8));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmss9", new AttrDetails("GovHydroWEH.pmss9", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getPmss9, GovHydroWEH::setPmss9));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rpg", new AttrDetails("GovHydroWEH.rpg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getRpg, GovHydroWEH::setRpg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rpp", new AttrDetails("GovHydroWEH.rpp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getRpp, GovHydroWEH::setRpp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("td", new AttrDetails("GovHydroWEH.td", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getTd, GovHydroWEH::setTd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tdv", new AttrDetails("GovHydroWEH.tdv", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getTdv, GovHydroWEH::setTdv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tg", new AttrDetails("GovHydroWEH.tg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getTg, GovHydroWEH::setTg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tp", new AttrDetails("GovHydroWEH.tp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getTp, GovHydroWEH::setTp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpe", new AttrDetails("GovHydroWEH.tpe", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getTpe, GovHydroWEH::setTpe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw", new AttrDetails("GovHydroWEH.tw", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWEH::getTw, GovHydroWEH::setTw));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovHydroWEH(null).allAttrDetailsMap());
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
