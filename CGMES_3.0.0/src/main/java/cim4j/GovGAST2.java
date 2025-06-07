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
 * Gas turbine.
 */
@SuppressWarnings("unused")
public class GovGAST2 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovGAST2.class);

    /**
     * Constructor.
     */
    public GovGAST2(String rdfid) {
        super("GovGAST2", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovGAST2(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Valve positioner (<i>A</i>).
     */
    private Float a; // Float

    public Float getA() {
        return a;
    }

    public void setA(Float _value_) {
        a = _value_;
    }

    private static Object getA(BaseClass _this_) {
        return ((GovGAST2) _this_).getA();
    }

    private static void setA(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovGAST2) _this_).setA((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setA(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Exhaust temperature parameter (<i>Af1</i>).  Unit = PU temperature.  Based on temperature in degrees C.
     */
    private Double af1; // PU

    public Double getAf1() {
        return af1;
    }

    public void setAf1(Double _value_) {
        af1 = _value_;
    }

    private static Object getAf1(BaseClass _this_) {
        return ((GovGAST2) _this_).getAf1();
    }

    private static void setAf1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setAf1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setAf1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Coefficient equal to 0,5(1-speed) (<i>Af2</i>).
     */
    private Double af2; // PU

    public Double getAf2() {
        return af2;
    }

    public void setAf2(Double _value_) {
        af2 = _value_;
    }

    private static Object getAf2(BaseClass _this_) {
        return ((GovGAST2) _this_).getAf2();
    }

    private static void setAf2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setAf2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setAf2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Valve positioner (<i>B</i>).
     */
    private Float b; // Float

    public Float getB() {
        return b;
    }

    public void setB(Float _value_) {
        b = _value_;
    }

    private static Object getB(BaseClass _this_) {
        return ((GovGAST2) _this_).getB();
    }

    private static void setB(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovGAST2) _this_).setB((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setB(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * (<i>Bf1</i>).  <i>Bf1</i> = <i>E</i>(1 - <i>W</i>) where <i>E</i> (speed sensitivity coefficient) is 0,55 to 0,65 x <i>Tr</i>.  Unit = PU temperature.  Based on temperature in degrees C.
     */
    private Double bf1; // PU

    public Double getBf1() {
        return bf1;
    }

    public void setBf1(Double _value_) {
        bf1 = _value_;
    }

    private static Object getBf1(BaseClass _this_) {
        return ((GovGAST2) _this_).getBf1();
    }

    private static void setBf1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setBf1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setBf1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Turbine torque coefficient K<sub>hhv</sub> (depends on heating value of fuel stream in combustion chamber) (<i>Bf2</i>).
     */
    private Double bf2; // PU

    public Double getBf2() {
        return bf2;
    }

    public void setBf2(Double _value_) {
        bf2 = _value_;
    }

    private static Object getBf2(BaseClass _this_) {
        return ((GovGAST2) _this_).getBf2();
    }

    private static void setBf2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setBf2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setBf2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Valve positioner (<i>C</i>).
     */
    private Float c; // Float

    public Float getC() {
        return c;
    }

    public void setC(Float _value_) {
        c = _value_;
    }

    private static Object getC(BaseClass _this_) {
        return ((GovGAST2) _this_).getC();
    }

    private static void setC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovGAST2) _this_).setC((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setC(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Coefficient defining fuel flow where power output is 0% (<i>Cf2</i>).  Synchronous but no output.  Typically 0,23 x K<sub>hhv</sub> (23% fuel flow).
     */
    private Double cf2; // PU

    public Double getCf2() {
        return cf2;
    }

    public void setCf2(Double _value_) {
        cf2 = _value_;
    }

    private static Object getCf2(BaseClass _this_) {
        return ((GovGAST2) _this_).getCf2();
    }

    private static void setCf2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setCf2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setCf2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Combustion reaction time delay (<i>Ecr</i>) (&gt;= 0).
     */
    private Double ecr; // Seconds

    public Double getEcr() {
        return ecr;
    }

    public void setEcr(Double _value_) {
        ecr = _value_;
    }

    private static Object getEcr(BaseClass _this_) {
        return ((GovGAST2) _this_).getEcr();
    }

    private static void setEcr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setEcr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setEcr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Turbine and exhaust delay (<i>Etd</i>) (&gt;= 0).
     */
    private Double etd; // Seconds

    public Double getEtd() {
        return etd;
    }

    public void setEtd(Double _value_) {
        etd = _value_;
    }

    private static Object getEtd(BaseClass _this_) {
        return ((GovGAST2) _this_).getEtd();
    }

    private static void setEtd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setEtd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setEtd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Ratio of fuel adjustment (<i>K3</i>).
     */
    private Double k3; // PU

    public Double getK3() {
        return k3;
    }

    public void setK3(Double _value_) {
        k3 = _value_;
    }

    private static Object getK3(BaseClass _this_) {
        return ((GovGAST2) _this_).getK3();
    }

    private static void setK3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setK3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setK3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain of radiation shield (<i>K4</i>).
     */
    private Double k4; // PU

    public Double getK4() {
        return k4;
    }

    public void setK4(Double _value_) {
        k4 = _value_;
    }

    private static Object getK4(BaseClass _this_) {
        return ((GovGAST2) _this_).getK4();
    }

    private static void setK4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setK4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setK4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain of radiation shield (<i>K5</i>).
     */
    private Double k5; // PU

    public Double getK5() {
        return k5;
    }

    public void setK5(Double _value_) {
        k5 = _value_;
    }

    private static Object getK5(BaseClass _this_) {
        return ((GovGAST2) _this_).getK5();
    }

    private static void setK5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setK5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setK5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum fuel flow (<i>K6</i>).
     */
    private Double k6; // PU

    public Double getK6() {
        return k6;
    }

    public void setK6(Double _value_) {
        k6 = _value_;
    }

    private static Object getK6(BaseClass _this_) {
        return ((GovGAST2) _this_).getK6();
    }

    private static void setK6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setK6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setK6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fuel system feedback (<i>Kf</i>).
     */
    private Double kf; // PU

    public Double getKf() {
        return kf;
    }

    public void setKf(Double _value_) {
        kf = _value_;
    }

    private static Object getKf(BaseClass _this_) {
        return ((GovGAST2) _this_).getKf();
    }

    private static void setKf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setKf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setKf(getDoubleFromString((String) _value_));
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
        return ((GovGAST2) _this_).getMwbase();
    }

    private static void setMwbase(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setMwbase((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setMwbase(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fuel control time constant (<i>T</i>) (&gt;= 0).
     */
    private Double t; // Seconds

    public Double getT() {
        return t;
    }

    public void setT(Double _value_) {
        t = _value_;
    }

    private static Object getT(BaseClass _this_) {
        return ((GovGAST2) _this_).getT();
    }

    private static void setT(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setT((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setT(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Radiation shield time constant (<i>T3</i>) (&gt;= 0).
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    private static Object getT3(BaseClass _this_) {
        return ((GovGAST2) _this_).getT3();
    }

    private static void setT3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setT3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setT3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Thermocouple time constant (<i>T4</i>) (&gt;= 0).
     */
    private Double t4; // Seconds

    public Double getT4() {
        return t4;
    }

    public void setT4(Double _value_) {
        t4 = _value_;
    }

    private static Object getT4(BaseClass _this_) {
        return ((GovGAST2) _this_).getT4();
    }

    private static void setT4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setT4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setT4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Temperature control time constant (<i>T5</i>) (&gt;= 0).
     */
    private Double t5; // Seconds

    public Double getT5() {
        return t5;
    }

    public void setT5(Double _value_) {
        t5 = _value_;
    }

    private static Object getT5(BaseClass _this_) {
        return ((GovGAST2) _this_).getT5();
    }

    private static void setT5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setT5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setT5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Temperature control (<i>Tc</i>).  Unit = [SYMBOL REMOVED]F or [SYMBOL REMOVED]C depending on parameters <i>Af1</i> and <i>Bf1</i>.
     */
    private Double tc; // Temperature

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    private static Object getTc(BaseClass _this_) {
        return ((GovGAST2) _this_).getTc();
    }

    private static void setTc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setTc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setTc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Compressor discharge time constant (<i>Tcd</i>) (&gt;= 0).
     */
    private Double tcd; // Seconds

    public Double getTcd() {
        return tcd;
    }

    public void setTcd(Double _value_) {
        tcd = _value_;
    }

    private static Object getTcd(BaseClass _this_) {
        return ((GovGAST2) _this_).getTcd();
    }

    private static void setTcd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setTcd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setTcd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fuel system time constant (<i>Tf</i>) (&gt;= 0).
     */
    private Double tf; // Seconds

    public Double getTf() {
        return tf;
    }

    public void setTf(Double _value_) {
        tf = _value_;
    }

    private static Object getTf(BaseClass _this_) {
        return ((GovGAST2) _this_).getTf();
    }

    private static void setTf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setTf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setTf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum turbine limit (<i>Tmax</i>) (&gt; GovGAST2.tmin).
     */
    private Double tmax; // PU

    public Double getTmax() {
        return tmax;
    }

    public void setTmax(Double _value_) {
        tmax = _value_;
    }

    private static Object getTmax(BaseClass _this_) {
        return ((GovGAST2) _this_).getTmax();
    }

    private static void setTmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setTmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setTmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum turbine limit (<i>Tmin</i>) (&lt; GovGAST2.tmax).
     */
    private Double tmin; // PU

    public Double getTmin() {
        return tmin;
    }

    public void setTmin(Double _value_) {
        tmin = _value_;
    }

    private static Object getTmin(BaseClass _this_) {
        return ((GovGAST2) _this_).getTmin();
    }

    private static void setTmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setTmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setTmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rated temperature (<i>Tr</i>).  Unit = [SYMBOL REMOVED]C depending on parameters<i> Af1 </i>and <i>Bf1</i>.
     */
    private Double tr; // Temperature

    public Double getTr() {
        return tr;
    }

    public void setTr(Double _value_) {
        tr = _value_;
    }

    private static Object getTr(BaseClass _this_) {
        return ((GovGAST2) _this_).getTr();
    }

    private static void setTr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setTr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setTr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Turbine rating (<i>Trate</i>).  Unit = MW.
     */
    private Double trate; // ActivePower

    public Double getTrate() {
        return trate;
    }

    public void setTrate(Double _value_) {
        trate = _value_;
    }

    private static Object getTrate(BaseClass _this_) {
        return ((GovGAST2) _this_).getTrate();
    }

    private static void setTrate(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setTrate((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setTrate(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Temperature controller integration rate (<i>Tt</i>) (&gt;= 0).
     */
    private Double tt; // Seconds

    public Double getTt() {
        return tt;
    }

    public void setTt(Double _value_) {
        tt = _value_;
    }

    private static Object getTt(BaseClass _this_) {
        return ((GovGAST2) _this_).getTt();
    }

    private static void setTt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setTt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setTt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Governor gain (1/droop) on turbine rating (<i>W</i>).
     */
    private Double w; // PU

    public Double getW() {
        return w;
    }

    public void setW(Double _value_) {
        w = _value_;
    }

    private static Object getW(BaseClass _this_) {
        return ((GovGAST2) _this_).getW();
    }

    private static void setW(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setW((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setW(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Governor lead time constant (<i>X</i>) (&gt;= 0).
     */
    private Double x; // Seconds

    public Double getX() {
        return x;
    }

    public void setX(Double _value_) {
        x = _value_;
    }

    private static Object getX(BaseClass _this_) {
        return ((GovGAST2) _this_).getX();
    }

    private static void setX(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setX((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setX(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Governor lag time constant (<i>Y</i>) (&gt; 0).
     */
    private Double y; // Seconds

    public Double getY() {
        return y;
    }

    public void setY(Double _value_) {
        y = _value_;
    }

    private static Object getY(BaseClass _this_) {
        return ((GovGAST2) _this_).getY();
    }

    private static void setY(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST2) _this_).setY((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setY(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Governor mode (<i>Z</i>). 1 = droop 0 = isochronous.
     */
    private Integer z; // Integer

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer _value_) {
        z = _value_;
    }

    private static Object getZ(BaseClass _this_) {
        return ((GovGAST2) _this_).getZ();
    }

    private static void setZ(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((GovGAST2) _this_).setZ((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST2) _this_).setZ(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovGAST2", attrName));
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
                "GovGAST2", attrName, value));
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
            map.put("a", new AttrDetails("GovGAST2.a", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getA, GovGAST2::setA));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("af1", new AttrDetails("GovGAST2.af1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getAf1, GovGAST2::setAf1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("af2", new AttrDetails("GovGAST2.af2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getAf2, GovGAST2::setAf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("b", new AttrDetails("GovGAST2.b", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getB, GovGAST2::setB));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bf1", new AttrDetails("GovGAST2.bf1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getBf1, GovGAST2::setBf1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bf2", new AttrDetails("GovGAST2.bf2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getBf2, GovGAST2::setBf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("c", new AttrDetails("GovGAST2.c", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getC, GovGAST2::setC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("cf2", new AttrDetails("GovGAST2.cf2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getCf2, GovGAST2::setCf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ecr", new AttrDetails("GovGAST2.ecr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getEcr, GovGAST2::setEcr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("etd", new AttrDetails("GovGAST2.etd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getEtd, GovGAST2::setEtd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k3", new AttrDetails("GovGAST2.k3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getK3, GovGAST2::setK3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k4", new AttrDetails("GovGAST2.k4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getK4, GovGAST2::setK4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k5", new AttrDetails("GovGAST2.k5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getK5, GovGAST2::setK5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k6", new AttrDetails("GovGAST2.k6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getK6, GovGAST2::setK6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("GovGAST2.kf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getKf, GovGAST2::setKf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovGAST2.mwbase", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getMwbase, GovGAST2::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t", new AttrDetails("GovGAST2.t", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getT, GovGAST2::setT));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("GovGAST2.t3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getT3, GovGAST2::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("GovGAST2.t4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getT4, GovGAST2::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5", new AttrDetails("GovGAST2.t5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getT5, GovGAST2::setT5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("GovGAST2.tc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getTc, GovGAST2::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tcd", new AttrDetails("GovGAST2.tcd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getTcd, GovGAST2::setTcd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("GovGAST2.tf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getTf, GovGAST2::setTf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tmax", new AttrDetails("GovGAST2.tmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getTmax, GovGAST2::setTmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tmin", new AttrDetails("GovGAST2.tmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getTmin, GovGAST2::setTmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tr", new AttrDetails("GovGAST2.tr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getTr, GovGAST2::setTr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("trate", new AttrDetails("GovGAST2.trate", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getTrate, GovGAST2::setTrate));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tt", new AttrDetails("GovGAST2.tt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getTt, GovGAST2::setTt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("w", new AttrDetails("GovGAST2.w", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getW, GovGAST2::setW));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("x", new AttrDetails("GovGAST2.x", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getX, GovGAST2::setX));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("y", new AttrDetails("GovGAST2.y", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getY, GovGAST2::setY));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("z", new AttrDetails("GovGAST2.z", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST2::getZ, GovGAST2::setZ));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovGAST2(null).allAttrDetailsMap());
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
