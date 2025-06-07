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
 * Woodward Gas turbine governor model.
 */
@SuppressWarnings("unused")
public class GovGASTWD extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovGASTWD.class);

    /**
     * Constructor.
     */
    public GovGASTWD(String rdfid) {
        super("GovGASTWD", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovGASTWD(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Valve positioner ().
     */
    private Double a; // Simple_Float

    public Double getA() {
        return a;
    }

    public void setA(Double _value_) {
        a = _value_;
    }

    private static Object getA(BaseClass _this_) {
        return ((GovGASTWD) _this_).getA();
    }

    private static void setA(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setA((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setA(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exhaust temperature Parameter (Af1).
     */
    private Double af1; // PU

    public Double getAf1() {
        return af1;
    }

    public void setAf1(Double _value_) {
        af1 = _value_;
    }

    private static Object getAf1(BaseClass _this_) {
        return ((GovGASTWD) _this_).getAf1();
    }

    private static void setAf1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setAf1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setAf1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Coefficient equal to 0.5(1-speed) (Af2).
     */
    private Double af2; // PU

    public Double getAf2() {
        return af2;
    }

    public void setAf2(Double _value_) {
        af2 = _value_;
    }

    private static Object getAf2(BaseClass _this_) {
        return ((GovGASTWD) _this_).getAf2();
    }

    private static void setAf2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setAf2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setAf2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Valve positioner ().
     */
    private Double b; // Simple_Float

    public Double getB() {
        return b;
    }

    public void setB(Double _value_) {
        b = _value_;
    }

    private static Object getB(BaseClass _this_) {
        return ((GovGASTWD) _this_).getB();
    }

    private static void setB(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setB((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setB(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * (Bf1).  Bf1 = E(1-w) where E (speed sensitivity coefficient) is 0.55 to 0.65 x Tr.
     */
    private Double bf1; // PU

    public Double getBf1() {
        return bf1;
    }

    public void setBf1(Double _value_) {
        bf1 = _value_;
    }

    private static Object getBf1(BaseClass _this_) {
        return ((GovGASTWD) _this_).getBf1();
    }

    private static void setBf1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setBf1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setBf1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Turbine Torque Coefficient K (depends on heating value of fuel stream in combustion chamber) (Bf2).
     */
    private Double bf2; // PU

    public Double getBf2() {
        return bf2;
    }

    public void setBf2(Double _value_) {
        bf2 = _value_;
    }

    private static Object getBf2(BaseClass _this_) {
        return ((GovGASTWD) _this_).getBf2();
    }

    private static void setBf2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setBf2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setBf2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Valve positioner ().
     */
    private Double c; // Simple_Float

    public Double getC() {
        return c;
    }

    public void setC(Double _value_) {
        c = _value_;
    }

    private static Object getC(BaseClass _this_) {
        return ((GovGASTWD) _this_).getC();
    }

    private static void setC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setC((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setC(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Coefficient defining fuel flow where power output is 0% (Cf2).  Synchronous but no output.  Typically 0.23 x K(23% fuel flow).
     */
    private Double cf2; // PU

    public Double getCf2() {
        return cf2;
    }

    public void setCf2(Double _value_) {
        cf2 = _value_;
    }

    private static Object getCf2(BaseClass _this_) {
        return ((GovGASTWD) _this_).getCf2();
    }

    private static void setCf2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setCf2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setCf2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Combustion reaction time delay (Ecr).
     */
    private Double ecr; // Seconds

    public Double getEcr() {
        return ecr;
    }

    public void setEcr(Double _value_) {
        ecr = _value_;
    }

    private static Object getEcr(BaseClass _this_) {
        return ((GovGASTWD) _this_).getEcr();
    }

    private static void setEcr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setEcr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setEcr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Turbine and exhaust delay (Etd).
     */
    private Double etd; // Seconds

    public Double getEtd() {
        return etd;
    }

    public void setEtd(Double _value_) {
        etd = _value_;
    }

    private static Object getEtd(BaseClass _this_) {
        return ((GovGASTWD) _this_).getEtd();
    }

    private static void setEtd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setEtd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setEtd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Ratio of Fuel Adjustment (K3).
     */
    private Double k3; // PU

    public Double getK3() {
        return k3;
    }

    public void setK3(Double _value_) {
        k3 = _value_;
    }

    private static Object getK3(BaseClass _this_) {
        return ((GovGASTWD) _this_).getK3();
    }

    private static void setK3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setK3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setK3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain of radiation shield (K4).
     */
    private Double k4; // PU

    public Double getK4() {
        return k4;
    }

    public void setK4(Double _value_) {
        k4 = _value_;
    }

    private static Object getK4(BaseClass _this_) {
        return ((GovGASTWD) _this_).getK4();
    }

    private static void setK4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setK4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setK4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain of radiation shield (K5).
     */
    private Double k5; // PU

    public Double getK5() {
        return k5;
    }

    public void setK5(Double _value_) {
        k5 = _value_;
    }

    private static Object getK5(BaseClass _this_) {
        return ((GovGASTWD) _this_).getK5();
    }

    private static void setK5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setK5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setK5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum fuel flow (K6).
     */
    private Double k6; // PU

    public Double getK6() {
        return k6;
    }

    public void setK6(Double _value_) {
        k6 = _value_;
    }

    private static Object getK6(BaseClass _this_) {
        return ((GovGASTWD) _this_).getK6();
    }

    private static void setK6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setK6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setK6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Drop Governor Gain (Kd).
     */
    private Double kd; // PU

    public Double getKd() {
        return kd;
    }

    public void setKd(Double _value_) {
        kd = _value_;
    }

    private static Object getKd(BaseClass _this_) {
        return ((GovGASTWD) _this_).getKd();
    }

    private static void setKd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setKd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setKd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * (Kdroop).
     */
    private Double kdroop; // PU

    public Double getKdroop() {
        return kdroop;
    }

    public void setKdroop(Double _value_) {
        kdroop = _value_;
    }

    private static Object getKdroop(BaseClass _this_) {
        return ((GovGASTWD) _this_).getKdroop();
    }

    private static void setKdroop(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setKdroop((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setKdroop(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fuel system feedback (Kf).
     */
    private Double kf; // PU

    public Double getKf() {
        return kf;
    }

    public void setKf(Double _value_) {
        kf = _value_;
    }

    private static Object getKf(BaseClass _this_) {
        return ((GovGASTWD) _this_).getKf();
    }

    private static void setKf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setKf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setKf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Isochronous Governor Gain (Ki).
     */
    private Double ki; // PU

    public Double getKi() {
        return ki;
    }

    public void setKi(Double _value_) {
        ki = _value_;
    }

    private static Object getKi(BaseClass _this_) {
        return ((GovGASTWD) _this_).getKi();
    }

    private static void setKi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setKi((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setKi(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * PID Proportional gain (Kp).
     */
    private Double kp; // PU

    public Double getKp() {
        return kp;
    }

    public void setKp(Double _value_) {
        kp = _value_;
    }

    private static Object getKp(BaseClass _this_) {
        return ((GovGASTWD) _this_).getKp();
    }

    private static void setKp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setKp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setKp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Base for power values (MWbase) (> 0).  Unit = MW.
     */
    private Double mwbase; // ActivePower

    public Double getMwbase() {
        return mwbase;
    }

    public void setMwbase(Double _value_) {
        mwbase = _value_;
    }

    private static Object getMwbase(BaseClass _this_) {
        return ((GovGASTWD) _this_).getMwbase();
    }

    private static void setMwbase(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setMwbase((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setMwbase(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fuel Control Time Constant (T).
     */
    private Double t; // Seconds

    public Double getT() {
        return t;
    }

    public void setT(Double _value_) {
        t = _value_;
    }

    private static Object getT(BaseClass _this_) {
        return ((GovGASTWD) _this_).getT();
    }

    private static void setT(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setT((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setT(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Radiation shield time constant (T3).
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    private static Object getT3(BaseClass _this_) {
        return ((GovGASTWD) _this_).getT3();
    }

    private static void setT3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setT3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setT3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Thermocouple time constant (T4).
     */
    private Double t4; // Seconds

    public Double getT4() {
        return t4;
    }

    public void setT4(Double _value_) {
        t4 = _value_;
    }

    private static Object getT4(BaseClass _this_) {
        return ((GovGASTWD) _this_).getT4();
    }

    private static void setT4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setT4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setT4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Temperature control time constant (T5).
     */
    private Double t5; // Seconds

    public Double getT5() {
        return t5;
    }

    public void setT5(Double _value_) {
        t5 = _value_;
    }

    private static Object getT5(BaseClass _this_) {
        return ((GovGASTWD) _this_).getT5();
    }

    private static void setT5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setT5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setT5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Temperature control (Tc).
     */
    private Double tc; // Temperature

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    private static Object getTc(BaseClass _this_) {
        return ((GovGASTWD) _this_).getTc();
    }

    private static void setTc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setTc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setTc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Compressor discharge time constant (Tcd).
     */
    private Double tcd; // Seconds

    public Double getTcd() {
        return tcd;
    }

    public void setTcd(Double _value_) {
        tcd = _value_;
    }

    private static Object getTcd(BaseClass _this_) {
        return ((GovGASTWD) _this_).getTcd();
    }

    private static void setTcd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setTcd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setTcd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Power transducer time constant (Td).
     */
    private Double td; // Seconds

    public Double getTd() {
        return td;
    }

    public void setTd(Double _value_) {
        td = _value_;
    }

    private static Object getTd(BaseClass _this_) {
        return ((GovGASTWD) _this_).getTd();
    }

    private static void setTd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setTd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setTd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fuel system time constant (Tf).
     */
    private Double tf; // Seconds

    public Double getTf() {
        return tf;
    }

    public void setTf(Double _value_) {
        tf = _value_;
    }

    private static Object getTf(BaseClass _this_) {
        return ((GovGASTWD) _this_).getTf();
    }

    private static void setTf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setTf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setTf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum Turbine limit (Tmax).
     */
    private Double tmax; // PU

    public Double getTmax() {
        return tmax;
    }

    public void setTmax(Double _value_) {
        tmax = _value_;
    }

    private static Object getTmax(BaseClass _this_) {
        return ((GovGASTWD) _this_).getTmax();
    }

    private static void setTmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setTmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setTmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum Turbine limit (Tmin).
     */
    private Double tmin; // PU

    public Double getTmin() {
        return tmin;
    }

    public void setTmin(Double _value_) {
        tmin = _value_;
    }

    private static Object getTmin(BaseClass _this_) {
        return ((GovGASTWD) _this_).getTmin();
    }

    private static void setTmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setTmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setTmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rated temperature (Tr).
     */
    private Double tr; // Temperature

    public Double getTr() {
        return tr;
    }

    public void setTr(Double _value_) {
        tr = _value_;
    }

    private static Object getTr(BaseClass _this_) {
        return ((GovGASTWD) _this_).getTr();
    }

    private static void setTr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setTr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setTr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Turbine rating (Trate).  Unit = MW.
     */
    private Double trate; // ActivePower

    public Double getTrate() {
        return trate;
    }

    public void setTrate(Double _value_) {
        trate = _value_;
    }

    private static Object getTrate(BaseClass _this_) {
        return ((GovGASTWD) _this_).getTrate();
    }

    private static void setTrate(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setTrate((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setTrate(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Temperature controller integration rate (Tt).
     */
    private Double tt; // Seconds

    public Double getTt() {
        return tt;
    }

    public void setTt(Double _value_) {
        tt = _value_;
    }

    private static Object getTt(BaseClass _this_) {
        return ((GovGASTWD) _this_).getTt();
    }

    private static void setTt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGASTWD) _this_).setTt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGASTWD) _this_).setTt(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovGASTWD", attrName));
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
                "GovGASTWD", attrName, value));
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
            map.put("a", new AttrDetails("GovGASTWD.a", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getA, GovGASTWD::setA));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("af1", new AttrDetails("GovGASTWD.af1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getAf1, GovGASTWD::setAf1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("af2", new AttrDetails("GovGASTWD.af2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getAf2, GovGASTWD::setAf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("b", new AttrDetails("GovGASTWD.b", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getB, GovGASTWD::setB));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bf1", new AttrDetails("GovGASTWD.bf1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getBf1, GovGASTWD::setBf1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bf2", new AttrDetails("GovGASTWD.bf2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getBf2, GovGASTWD::setBf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("c", new AttrDetails("GovGASTWD.c", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getC, GovGASTWD::setC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("cf2", new AttrDetails("GovGASTWD.cf2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getCf2, GovGASTWD::setCf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ecr", new AttrDetails("GovGASTWD.ecr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getEcr, GovGASTWD::setEcr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("etd", new AttrDetails("GovGASTWD.etd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getEtd, GovGASTWD::setEtd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k3", new AttrDetails("GovGASTWD.k3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getK3, GovGASTWD::setK3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k4", new AttrDetails("GovGASTWD.k4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getK4, GovGASTWD::setK4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k5", new AttrDetails("GovGASTWD.k5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getK5, GovGASTWD::setK5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k6", new AttrDetails("GovGASTWD.k6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getK6, GovGASTWD::setK6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("GovGASTWD.kd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getKd, GovGASTWD::setKd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kdroop", new AttrDetails("GovGASTWD.kdroop", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getKdroop, GovGASTWD::setKdroop));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("GovGASTWD.kf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getKf, GovGASTWD::setKf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("GovGASTWD.ki", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getKi, GovGASTWD::setKi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("GovGASTWD.kp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getKp, GovGASTWD::setKp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovGASTWD.mwbase", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getMwbase, GovGASTWD::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t", new AttrDetails("GovGASTWD.t", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getT, GovGASTWD::setT));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("GovGASTWD.t3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getT3, GovGASTWD::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("GovGASTWD.t4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getT4, GovGASTWD::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5", new AttrDetails("GovGASTWD.t5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getT5, GovGASTWD::setT5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("GovGASTWD.tc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getTc, GovGASTWD::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tcd", new AttrDetails("GovGASTWD.tcd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getTcd, GovGASTWD::setTcd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("td", new AttrDetails("GovGASTWD.td", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getTd, GovGASTWD::setTd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("GovGASTWD.tf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getTf, GovGASTWD::setTf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tmax", new AttrDetails("GovGASTWD.tmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getTmax, GovGASTWD::setTmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tmin", new AttrDetails("GovGASTWD.tmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getTmin, GovGASTWD::setTmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tr", new AttrDetails("GovGASTWD.tr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getTr, GovGASTWD::setTr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("trate", new AttrDetails("GovGASTWD.trate", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getTrate, GovGASTWD::setTrate));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tt", new AttrDetails("GovGASTWD.tt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGASTWD::getTt, GovGASTWD::setTt));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovGASTWD(null).allAttrDetailsMap());
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
