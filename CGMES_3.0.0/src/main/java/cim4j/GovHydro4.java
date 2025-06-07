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
 * Hydro turbine and governor. Represents plants with straight-forward penstock configurations and hydraulic governors of the traditional 'dashpot' type.  This model can be used to represent simple, Francis/Pelton or Kaplan turbines.
 */
@SuppressWarnings("unused")
public class GovHydro4 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydro4.class);

    /**
     * Constructor.
     */
    public GovHydro4(String rdfid) {
        super("GovHydro4", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovHydro4(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Turbine gain (<i>At</i>).  Typical value = 1,2.
     */
    private Double at; // PU

    public Double getAt() {
        return at;
    }

    public void setAt(Double _value_) {
        at = _value_;
    }

    private static Object getAt(BaseClass _this_) {
        return ((GovHydro4) _this_).getAt();
    }

    private static void setAt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setAt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setAt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Kaplan blade servo point 0 (<i>Bgv0</i>) (= 0 for simple, = 0 for Francis/Pelton).  Typical value for Kaplan = 0.
     */
    private Double bgv0; // PU

    public Double getBgv0() {
        return bgv0;
    }

    public void setBgv0(Double _value_) {
        bgv0 = _value_;
    }

    private static Object getBgv0(BaseClass _this_) {
        return ((GovHydro4) _this_).getBgv0();
    }

    private static void setBgv0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setBgv0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setBgv0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Kaplan blade servo point 1 (<i>Bgv1</i>) (= 0 for simple, = 0 for Francis/Pelton).  Typical value for Kaplan = 0.
     */
    private Double bgv1; // PU

    public Double getBgv1() {
        return bgv1;
    }

    public void setBgv1(Double _value_) {
        bgv1 = _value_;
    }

    private static Object getBgv1(BaseClass _this_) {
        return ((GovHydro4) _this_).getBgv1();
    }

    private static void setBgv1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setBgv1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setBgv1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Kaplan blade servo point 2 (<i>Bgv2</i>) (= 0 for simple, = 0 for Francis/Pelton).  Typical value for Kaplan = 0,1.
     */
    private Double bgv2; // PU

    public Double getBgv2() {
        return bgv2;
    }

    public void setBgv2(Double _value_) {
        bgv2 = _value_;
    }

    private static Object getBgv2(BaseClass _this_) {
        return ((GovHydro4) _this_).getBgv2();
    }

    private static void setBgv2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setBgv2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setBgv2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Kaplan blade servo point 3 (<i>Bgv3</i>) (= 0 for simple, = 0 for Francis/Pelton).  Typical value for Kaplan = 0,667.
     */
    private Double bgv3; // PU

    public Double getBgv3() {
        return bgv3;
    }

    public void setBgv3(Double _value_) {
        bgv3 = _value_;
    }

    private static Object getBgv3(BaseClass _this_) {
        return ((GovHydro4) _this_).getBgv3();
    }

    private static void setBgv3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setBgv3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setBgv3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Kaplan blade servo point 4 (<i>Bgv4</i>) (= 0 for simple, = 0 for Francis/Pelton).  Typical value for Kaplan = 0,9.
     */
    private Double bgv4; // PU

    public Double getBgv4() {
        return bgv4;
    }

    public void setBgv4(Double _value_) {
        bgv4 = _value_;
    }

    private static Object getBgv4(BaseClass _this_) {
        return ((GovHydro4) _this_).getBgv4();
    }

    private static void setBgv4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setBgv4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setBgv4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Kaplan blade servo point 5 (<i>Bgv5</i>) (= 0 for simple, = 0 for Francis/Pelton).  Typical value for Kaplan = 1.
     */
    private Double bgv5; // PU

    public Double getBgv5() {
        return bgv5;
    }

    public void setBgv5(Double _value_) {
        bgv5 = _value_;
    }

    private static Object getBgv5(BaseClass _this_) {
        return ((GovHydro4) _this_).getBgv5();
    }

    private static void setBgv5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setBgv5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setBgv5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum blade adjustment factor (<i>Bmax</i>)  (= 0 for simple, = 0 for Francis/Pelton).  Typical value for Kaplan = 1,1276.
     */
    private Float bmax; // Float

    public Float getBmax() {
        return bmax;
    }

    public void setBmax(Float _value_) {
        bmax = _value_;
    }

    private static Object getBmax(BaseClass _this_) {
        return ((GovHydro4) _this_).getBmax();
    }

    private static void setBmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovHydro4) _this_).setBmax((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setBmax(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Intentional deadband width (<i>db1</i>).  Unit = Hz.  Typical value = 0.
     */
    private Double db1; // Frequency

    public Double getDb1() {
        return db1;
    }

    public void setDb1(Double _value_) {
        db1 = _value_;
    }

    private static Object getDb1(BaseClass _this_) {
        return ((GovHydro4) _this_).getDb1();
    }

    private static void setDb1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setDb1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setDb1(getDoubleFromString((String) _value_));
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
        return ((GovHydro4) _this_).getDb2();
    }

    private static void setDb2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setDb2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setDb2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Turbine damping factor (<i>Dturb</i>).  Unit = delta P (PU of <i>MWbase</i>) / delta speed (PU).  Typical value for simple = 0,5, Francis/Pelton = 1,1, Kaplan = 1,1.
     */
    private Double dturb; // PU

    public Double getDturb() {
        return dturb;
    }

    public void setDturb(Double _value_) {
        dturb = _value_;
    }

    private static Object getDturb(BaseClass _this_) {
        return ((GovHydro4) _this_).getDturb();
    }

    private static void setDturb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setDturb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setDturb(getDoubleFromString((String) _value_));
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
        return ((GovHydro4) _this_).getEps();
    }

    private static void setEps(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setEps((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setEps(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum gate opening, PU of <i>MWbase</i> (<i>Gmax</i>) (&gt; GovHydro4.gmin).  Typical value = 1.
     */
    private Double gmax; // PU

    public Double getGmax() {
        return gmax;
    }

    public void setGmax(Double _value_) {
        gmax = _value_;
    }

    private static Object getGmax(BaseClass _this_) {
        return ((GovHydro4) _this_).getGmax();
    }

    private static void setGmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setGmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setGmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum gate opening, PU of <i>MWbase</i> (<i>Gmin</i>) (&lt; GovHydro4.gmax).  Typical value = 0.
     */
    private Double gmin; // PU

    public Double getGmin() {
        return gmin;
    }

    public void setGmin(Double _value_) {
        gmin = _value_;
    }

    private static Object getGmin(BaseClass _this_) {
        return ((GovHydro4) _this_).getGmin();
    }

    private static void setGmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setGmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setGmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 0, PU gv (<i>Gv0</i>) (= 0 for simple).  Typical for Francis/Pelton = 0,1, Kaplan = 0,1.
     */
    private Double gv0; // PU

    public Double getGv0() {
        return gv0;
    }

    public void setGv0(Double _value_) {
        gv0 = _value_;
    }

    private static Object getGv0(BaseClass _this_) {
        return ((GovHydro4) _this_).getGv0();
    }

    private static void setGv0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setGv0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setGv0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 1, PU gv (<i>Gv1</i>) (= 0 for simple, &gt; GovHydro4.gv0 for Francis/Pelton and Kaplan). Typical value for Francis/Pelton = 0,4, Kaplan = 0,4.
     */
    private Double gv1; // PU

    public Double getGv1() {
        return gv1;
    }

    public void setGv1(Double _value_) {
        gv1 = _value_;
    }

    private static Object getGv1(BaseClass _this_) {
        return ((GovHydro4) _this_).getGv1();
    }

    private static void setGv1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setGv1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setGv1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 2, PU gv (<i>Gv2</i>) (= 0 for simple, &gt; GovHydro4.gv1 for Francis/Pelton and Kaplan). Typical value for Francis/Pelton = 0,5, Kaplan = 0,5.
     */
    private Double gv2; // PU

    public Double getGv2() {
        return gv2;
    }

    public void setGv2(Double _value_) {
        gv2 = _value_;
    }

    private static Object getGv2(BaseClass _this_) {
        return ((GovHydro4) _this_).getGv2();
    }

    private static void setGv2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setGv2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setGv2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 3, PU gv (<i>Gv3</i>)  (= 0 for simple, &gt; GovHydro4.gv2 for Francis/Pelton and Kaplan). Typical value for Francis/Pelton = 0,7, Kaplan = 0,7.
     */
    private Double gv3; // PU

    public Double getGv3() {
        return gv3;
    }

    public void setGv3(Double _value_) {
        gv3 = _value_;
    }

    private static Object getGv3(BaseClass _this_) {
        return ((GovHydro4) _this_).getGv3();
    }

    private static void setGv3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setGv3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setGv3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 4, PU gv (<i>Gv4</i>)  (= 0 for simple, &gt; GovHydro4.gv3 for Francis/Pelton and Kaplan). Typical value for  Francis/Pelton = 0,8, Kaplan = 0,8.
     */
    private Double gv4; // PU

    public Double getGv4() {
        return gv4;
    }

    public void setGv4(Double _value_) {
        gv4 = _value_;
    }

    private static Object getGv4(BaseClass _this_) {
        return ((GovHydro4) _this_).getGv4();
    }

    private static void setGv4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setGv4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setGv4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 5, PU gv (<i>Gv5</i>)  (= 0 for simple, &lt; 1 and &gt; GovHydro4.gv4 for Francis/Pelton and Kaplan). Typical value for Francis/Pelton = 0,9, Kaplan = 0,9.
     */
    private Double gv5; // PU

    public Double getGv5() {
        return gv5;
    }

    public void setGv5(Double _value_) {
        gv5 = _value_;
    }

    private static Object getGv5(BaseClass _this_) {
        return ((GovHydro4) _this_).getGv5();
    }

    private static void setGv5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setGv5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setGv5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Head available at dam (<i>hdam</i>).  Typical value = 1.
     */
    private Double hdam; // PU

    public Double getHdam() {
        return hdam;
    }

    public void setHdam(Double _value_) {
        hdam = _value_;
    }

    private static Object getHdam(BaseClass _this_) {
        return ((GovHydro4) _this_).getHdam();
    }

    private static void setHdam(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setHdam((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setHdam(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * The kind of model being represented (simple, Francis/Pelton or Kaplan).
     */
    private String model; // GovHydro4ModelKind

    public String getModel() {
        return model;
    }

    public void setModel(String _value_) {
        model = _value_;
    }

    private static Object getModel(BaseClass _this_) {
        return ((GovHydro4) _this_).getModel();
    }

    private static void setModel(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((GovHydro4) _this_).setModel((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
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
        return ((GovHydro4) _this_).getMwbase();
    }

    private static void setMwbase(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setMwbase((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setMwbase(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 0, PU power (<i>Pgv0</i>) (= 0 for simple).  Typical value = 0.
     */
    private Double pgv0; // PU

    public Double getPgv0() {
        return pgv0;
    }

    public void setPgv0(Double _value_) {
        pgv0 = _value_;
    }

    private static Object getPgv0(BaseClass _this_) {
        return ((GovHydro4) _this_).getPgv0();
    }

    private static void setPgv0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setPgv0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setPgv0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 1, PU power (<i>Pgv1</i>) (= 0 for simple). Typical value for Francis/Pelton = 0,42, Kaplan = 0,35.
     */
    private Double pgv1; // PU

    public Double getPgv1() {
        return pgv1;
    }

    public void setPgv1(Double _value_) {
        pgv1 = _value_;
    }

    private static Object getPgv1(BaseClass _this_) {
        return ((GovHydro4) _this_).getPgv1();
    }

    private static void setPgv1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setPgv1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setPgv1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 2, PU power (<i>Pgv2</i>) (= 0 for simple). Typical value for Francis/Pelton = 0,56, Kaplan = 0,468.
     */
    private Double pgv2; // PU

    public Double getPgv2() {
        return pgv2;
    }

    public void setPgv2(Double _value_) {
        pgv2 = _value_;
    }

    private static Object getPgv2(BaseClass _this_) {
        return ((GovHydro4) _this_).getPgv2();
    }

    private static void setPgv2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setPgv2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setPgv2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 3, PU power (<i>Pgv3</i>) (= 0 for simple). Typical value for Francis/Pelton = 0,8, Kaplan = 0,796.
     */
    private Double pgv3; // PU

    public Double getPgv3() {
        return pgv3;
    }

    public void setPgv3(Double _value_) {
        pgv3 = _value_;
    }

    private static Object getPgv3(BaseClass _this_) {
        return ((GovHydro4) _this_).getPgv3();
    }

    private static void setPgv3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setPgv3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setPgv3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 4, PU power (<i>Pgv4</i>) (= 0 for simple). Typical value for Francis/Pelton = 0,9, Kaplan = 0,917.
     */
    private Double pgv4; // PU

    public Double getPgv4() {
        return pgv4;
    }

    public void setPgv4(Double _value_) {
        pgv4 = _value_;
    }

    private static Object getPgv4(BaseClass _this_) {
        return ((GovHydro4) _this_).getPgv4();
    }

    private static void setPgv4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setPgv4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setPgv4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Nonlinear gain point 5, PU power (<i>Pgv5</i>) (= 0 for simple).  Typical value for Francis/Pelton = 0,97, Kaplan = 0,99.
     */
    private Double pgv5; // PU

    public Double getPgv5() {
        return pgv5;
    }

    public void setPgv5(Double _value_) {
        pgv5 = _value_;
    }

    private static Object getPgv5(BaseClass _this_) {
        return ((GovHydro4) _this_).getPgv5();
    }

    private static void setPgv5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setPgv5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setPgv5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * No-load flow at nominal head (<i>Qnl</i>). Typical value for simple = 0,08, Francis/Pelton = 0, Kaplan = 0.
     */
    private Double qnl; // PU

    public Double getQnl() {
        return qnl;
    }

    public void setQnl(Double _value_) {
        qnl = _value_;
    }

    private static Object getQnl(BaseClass _this_) {
        return ((GovHydro4) _this_).getQnl();
    }

    private static void setQnl(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setQnl((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setQnl(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Permanent droop (<i>Rperm</i>) (&gt;= 0).  Typical value = 0,05.
     */
    private Double rperm; // Seconds

    public Double getRperm() {
        return rperm;
    }

    public void setRperm(Double _value_) {
        rperm = _value_;
    }

    private static Object getRperm(BaseClass _this_) {
        return ((GovHydro4) _this_).getRperm();
    }

    private static void setRperm(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setRperm((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setRperm(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Temporary droop (<i>Rtemp</i>) (&gt;= 0).  Typical value = 0,3.
     */
    private Double rtemp; // Seconds

    public Double getRtemp() {
        return rtemp;
    }

    public void setRtemp(Double _value_) {
        rtemp = _value_;
    }

    private static Object getRtemp(BaseClass _this_) {
        return ((GovHydro4) _this_).getRtemp();
    }

    private static void setRtemp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setRtemp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setRtemp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Blade servo time constant (<i>Tblade</i>) (&gt;= 0).  Typical value = 100.
     */
    private Double tblade; // Seconds

    public Double getTblade() {
        return tblade;
    }

    public void setTblade(Double _value_) {
        tblade = _value_;
    }

    private static Object getTblade(BaseClass _this_) {
        return ((GovHydro4) _this_).getTblade();
    }

    private static void setTblade(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setTblade((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setTblade(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gate servo time constant (<i>Tg</i>) (&gt; 0).  Typical value = 0,5.
     */
    private Double tg; // Seconds

    public Double getTg() {
        return tg;
    }

    public void setTg(Double _value_) {
        tg = _value_;
    }

    private static Object getTg(BaseClass _this_) {
        return ((GovHydro4) _this_).getTg();
    }

    private static void setTg(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setTg((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setTg(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Pilot servo time constant (<i>Tp</i>) (&gt;= 0).  Typical value = 0,1.
     */
    private Double tp; // Seconds

    public Double getTp() {
        return tp;
    }

    public void setTp(Double _value_) {
        tp = _value_;
    }

    private static Object getTp(BaseClass _this_) {
        return ((GovHydro4) _this_).getTp();
    }

    private static void setTp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setTp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setTp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Dashpot time constant (<i>Tr</i>) (&gt;= 0).  Typical value = 5.
     */
    private Double tr; // Seconds

    public Double getTr() {
        return tr;
    }

    public void setTr(Double _value_) {
        tr = _value_;
    }

    private static Object getTr(BaseClass _this_) {
        return ((GovHydro4) _this_).getTr();
    }

    private static void setTr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setTr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setTr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Water inertia time constant (<i>Tw</i>) (&gt; 0).  Typical value = 1.
     */
    private Double tw; // Seconds

    public Double getTw() {
        return tw;
    }

    public void setTw(Double _value_) {
        tw = _value_;
    }

    private static Object getTw(BaseClass _this_) {
        return ((GovHydro4) _this_).getTw();
    }

    private static void setTw(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro4) _this_).setTw((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setTw(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Max gate closing velocity (<i>Uc</i>).  Typical value = 0,2.
     */
    private Float uc; // Float

    public Float getUc() {
        return uc;
    }

    public void setUc(Float _value_) {
        uc = _value_;
    }

    private static Object getUc(BaseClass _this_) {
        return ((GovHydro4) _this_).getUc();
    }

    private static void setUc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovHydro4) _this_).setUc((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setUc(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Max gate opening velocity (<i>Uo</i>).  Typical value = 0,2.
     */
    private Float uo; // Float

    public Float getUo() {
        return uo;
    }

    public void setUo(Float _value_) {
        uo = _value_;
    }

    private static Object getUo(BaseClass _this_) {
        return ((GovHydro4) _this_).getUo();
    }

    private static void setUo(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovHydro4) _this_).setUo((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro4) _this_).setUo(getFloatFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovHydro4", attrName));
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
                "GovHydro4", attrName, value));
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
            map.put("at", new AttrDetails("GovHydro4.at", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getAt, GovHydro4::setAt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bgv0", new AttrDetails("GovHydro4.bgv0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getBgv0, GovHydro4::setBgv0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bgv1", new AttrDetails("GovHydro4.bgv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getBgv1, GovHydro4::setBgv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bgv2", new AttrDetails("GovHydro4.bgv2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getBgv2, GovHydro4::setBgv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bgv3", new AttrDetails("GovHydro4.bgv3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getBgv3, GovHydro4::setBgv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bgv4", new AttrDetails("GovHydro4.bgv4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getBgv4, GovHydro4::setBgv4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bgv5", new AttrDetails("GovHydro4.bgv5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getBgv5, GovHydro4::setBgv5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bmax", new AttrDetails("GovHydro4.bmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getBmax, GovHydro4::setBmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db1", new AttrDetails("GovHydro4.db1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getDb1, GovHydro4::setDb1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db2", new AttrDetails("GovHydro4.db2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getDb2, GovHydro4::setDb2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dturb", new AttrDetails("GovHydro4.dturb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getDturb, GovHydro4::setDturb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eps", new AttrDetails("GovHydro4.eps", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getEps, GovHydro4::setEps));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gmax", new AttrDetails("GovHydro4.gmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getGmax, GovHydro4::setGmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gmin", new AttrDetails("GovHydro4.gmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getGmin, GovHydro4::setGmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv0", new AttrDetails("GovHydro4.gv0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getGv0, GovHydro4::setGv0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv1", new AttrDetails("GovHydro4.gv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getGv1, GovHydro4::setGv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv2", new AttrDetails("GovHydro4.gv2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getGv2, GovHydro4::setGv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv3", new AttrDetails("GovHydro4.gv3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getGv3, GovHydro4::setGv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv4", new AttrDetails("GovHydro4.gv4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getGv4, GovHydro4::setGv4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv5", new AttrDetails("GovHydro4.gv5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getGv5, GovHydro4::setGv5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("hdam", new AttrDetails("GovHydro4.hdam", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getHdam, GovHydro4::setHdam));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("model", new AttrDetails("GovHydro4.model", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, GovHydro4::getModel, GovHydro4::setModel));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovHydro4.mwbase", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getMwbase, GovHydro4::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv0", new AttrDetails("GovHydro4.pgv0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getPgv0, GovHydro4::setPgv0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv1", new AttrDetails("GovHydro4.pgv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getPgv1, GovHydro4::setPgv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv2", new AttrDetails("GovHydro4.pgv2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getPgv2, GovHydro4::setPgv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv3", new AttrDetails("GovHydro4.pgv3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getPgv3, GovHydro4::setPgv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv4", new AttrDetails("GovHydro4.pgv4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getPgv4, GovHydro4::setPgv4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv5", new AttrDetails("GovHydro4.pgv5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getPgv5, GovHydro4::setPgv5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qnl", new AttrDetails("GovHydro4.qnl", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getQnl, GovHydro4::setQnl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rperm", new AttrDetails("GovHydro4.rperm", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getRperm, GovHydro4::setRperm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rtemp", new AttrDetails("GovHydro4.rtemp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getRtemp, GovHydro4::setRtemp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tblade", new AttrDetails("GovHydro4.tblade", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getTblade, GovHydro4::setTblade));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tg", new AttrDetails("GovHydro4.tg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getTg, GovHydro4::setTg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tp", new AttrDetails("GovHydro4.tp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getTp, GovHydro4::setTp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tr", new AttrDetails("GovHydro4.tr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getTr, GovHydro4::setTr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw", new AttrDetails("GovHydro4.tw", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getTw, GovHydro4::setTw));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uc", new AttrDetails("GovHydro4.uc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getUc, GovHydro4::setUc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uo", new AttrDetails("GovHydro4.uo", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::getUo, GovHydro4::setUo));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovHydro4(null).allAttrDetailsMap());
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
