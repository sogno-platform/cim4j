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
 * General model for any prime mover with a PID governor, used primarily for combustion turbine and combined cycle units. This model can be used to represent a variety of prime movers controlled by PID governors.  It is suitable, for example, for the representation of:  <ul> 	<li>gas turbine and single shaft combined cycle turbines</li> </ul> <ul> 	<li>diesel engines with modern electronic or digital governors  </li> </ul> <ul> 	<li>steam turbines where steam is supplied from a large boiler drum or a large header whose pressure is substantially constant over the period under study</li> 	<li>simple hydro turbines in dam configurations where the water column length is short and water inertia effects are minimal.</li> </ul> Additional information on this model is available in the 2012 IEEE report, <i><u>Dynamic Models for Turbine-Governors in Power System Studies</u></i>, 3.1.2.3 pages 3-4 (GGOV1).
 */
@SuppressWarnings("unused")
public class GovCT1 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovCT1.class);

    /**
     * Constructor.
     */
    public GovCT1(String rdfid) {
        super("GovCT1", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovCT1(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Acceleration limiter setpoint (<i>Aset</i>).  Unit = PU / s.  Typical value = 0,01.
     */
    private Float aset; // Float

    public Float getAset() {
        return aset;
    }

    public void setAset(Float _value_) {
        aset = _value_;
    }

    private static Object getAset(BaseClass _this_) {
        return ((GovCT1) _this_).getAset();
    }

    private static void setAset(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovCT1) _this_).setAset((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setAset(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Speed governor deadband in PU speed (<i>db</i>).  In the majority of applications, it is recommended that this value be set to zero.  Typical value = 0.
     */
    private Double db; // PU

    public Double getDb() {
        return db;
    }

    public void setDb(Double _value_) {
        db = _value_;
    }

    private static Object getDb(BaseClass _this_) {
        return ((GovCT1) _this_).getDb();
    }

    private static void setDb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setDb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setDb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Speed sensitivity coefficient (<i>Dm</i>).  <i>Dm</i> can represent either the variation of the engine power with the shaft speed or the variation of maximum power capability with shaft speed.  If it is positive it describes the falling slope of the engine speed verses power characteristic as speed increases. A slightly falling characteristic is typical for reciprocating engines and some aero-derivative turbines.  If it is negative the engine power is assumed to be unaffected by the shaft speed, but the maximum permissible fuel flow is taken to fall with falling shaft speed. This is characteristic of single-shaft industrial turbines due to exhaust temperature limits.  Typical value = 0.
     */
    private Double dm; // PU

    public Double getDm() {
        return dm;
    }

    public void setDm(Double _value_) {
        dm = _value_;
    }

    private static Object getDm(BaseClass _this_) {
        return ((GovCT1) _this_).getDm();
    }

    private static void setDm(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setDm((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setDm(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Acceleration limiter gain (<i>Ka</i>).  Typical value = 10.
     */
    private Double ka; // PU

    public Double getKa() {
        return ka;
    }

    public void setKa(Double _value_) {
        ka = _value_;
    }

    private static Object getKa(BaseClass _this_) {
        return ((GovCT1) _this_).getKa();
    }

    private static void setKa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setKa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setKa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Governor derivative gain (<i>Kdgov</i>).  Typical value = 0.
     */
    private Double kdgov; // PU

    public Double getKdgov() {
        return kdgov;
    }

    public void setKdgov(Double _value_) {
        kdgov = _value_;
    }

    private static Object getKdgov(BaseClass _this_) {
        return ((GovCT1) _this_).getKdgov();
    }

    private static void setKdgov(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setKdgov((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setKdgov(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Governor integral gain (<i>Kigov</i>).  Typical value = 2.
     */
    private Double kigov; // PU

    public Double getKigov() {
        return kigov;
    }

    public void setKigov(Double _value_) {
        kigov = _value_;
    }

    private static Object getKigov(BaseClass _this_) {
        return ((GovCT1) _this_).getKigov();
    }

    private static void setKigov(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setKigov((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setKigov(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Load limiter integral gain for PI controller (<i>Kiload</i>).  Typical value = 0,67.
     */
    private Double kiload; // PU

    public Double getKiload() {
        return kiload;
    }

    public void setKiload(Double _value_) {
        kiload = _value_;
    }

    private static Object getKiload(BaseClass _this_) {
        return ((GovCT1) _this_).getKiload();
    }

    private static void setKiload(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setKiload((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setKiload(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Power controller (reset) gain (<i>Kimw</i>).  The default value of 0,01 corresponds to a reset time of 100 s.  A value of 0,001 corresponds to a relatively slow-acting load controller.  Typical value = 0,01.
     */
    private Double kimw; // PU

    public Double getKimw() {
        return kimw;
    }

    public void setKimw(Double _value_) {
        kimw = _value_;
    }

    private static Object getKimw(BaseClass _this_) {
        return ((GovCT1) _this_).getKimw();
    }

    private static void setKimw(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setKimw((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setKimw(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Governor proportional gain (<i>Kpgov</i>).  Typical value = 10.
     */
    private Double kpgov; // PU

    public Double getKpgov() {
        return kpgov;
    }

    public void setKpgov(Double _value_) {
        kpgov = _value_;
    }

    private static Object getKpgov(BaseClass _this_) {
        return ((GovCT1) _this_).getKpgov();
    }

    private static void setKpgov(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setKpgov((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setKpgov(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Load limiter proportional gain for PI controller (<i>Kpload</i>).  Typical value = 2.
     */
    private Double kpload; // PU

    public Double getKpload() {
        return kpload;
    }

    public void setKpload(Double _value_) {
        kpload = _value_;
    }

    private static Object getKpload(BaseClass _this_) {
        return ((GovCT1) _this_).getKpload();
    }

    private static void setKpload(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setKpload((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setKpload(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Turbine gain (<i>Kturb</i>) (&gt; 0).  Typical value = 1,5.
     */
    private Double kturb; // PU

    public Double getKturb() {
        return kturb;
    }

    public void setKturb(Double _value_) {
        kturb = _value_;
    }

    private static Object getKturb(BaseClass _this_) {
        return ((GovCT1) _this_).getKturb();
    }

    private static void setKturb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setKturb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setKturb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Load limiter reference value (<i>Ldref</i>).  Typical value = 1.
     */
    private Double ldref; // PU

    public Double getLdref() {
        return ldref;
    }

    public void setLdref(Double _value_) {
        ldref = _value_;
    }

    private static Object getLdref(BaseClass _this_) {
        return ((GovCT1) _this_).getLdref();
    }

    private static void setLdref(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setLdref((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setLdref(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum value for speed error signal (<i>maxerr</i>) (&gt; GovCT1.minerr).  Typical value = 0,05.
     */
    private Double maxerr; // PU

    public Double getMaxerr() {
        return maxerr;
    }

    public void setMaxerr(Double _value_) {
        maxerr = _value_;
    }

    private static Object getMaxerr(BaseClass _this_) {
        return ((GovCT1) _this_).getMaxerr();
    }

    private static void setMaxerr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setMaxerr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setMaxerr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum value for speed error signal (<i>minerr</i>) (&lt; GovCT1.maxerr).  Typical value = -0,05.
     */
    private Double minerr; // PU

    public Double getMinerr() {
        return minerr;
    }

    public void setMinerr(Double _value_) {
        minerr = _value_;
    }

    private static Object getMinerr(BaseClass _this_) {
        return ((GovCT1) _this_).getMinerr();
    }

    private static void setMinerr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setMinerr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setMinerr(getDoubleFromString((String) _value_));
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
        return ((GovCT1) _this_).getMwbase();
    }

    private static void setMwbase(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setMwbase((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setMwbase(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Permanent droop (<i>R</i>).  Typical value = 0,04.
     */
    private Double r; // PU

    public Double getR() {
        return r;
    }

    public void setR(Double _value_) {
        r = _value_;
    }

    private static Object getR(BaseClass _this_) {
        return ((GovCT1) _this_).getR();
    }

    private static void setR(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setR((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setR(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum valve closing rate (<i>Rclose</i>).  Unit = PU / s.  Typical value = -0,1.
     */
    private Float rclose; // Float

    public Float getRclose() {
        return rclose;
    }

    public void setRclose(Float _value_) {
        rclose = _value_;
    }

    private static Object getRclose(BaseClass _this_) {
        return ((GovCT1) _this_).getRclose();
    }

    private static void setRclose(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovCT1) _this_).setRclose((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setRclose(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Maximum rate of load limit decrease (<i>Rdown</i>).  Typical value = -99.
     */
    private Double rdown; // PU

    public Double getRdown() {
        return rdown;
    }

    public void setRdown(Double _value_) {
        rdown = _value_;
    }

    private static Object getRdown(BaseClass _this_) {
        return ((GovCT1) _this_).getRdown();
    }

    private static void setRdown(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setRdown((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setRdown(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum valve opening rate (<i>Ropen</i>).  Unit = PU / s.  Typical value = 0.10.
     */
    private Float ropen; // Float

    public Float getRopen() {
        return ropen;
    }

    public void setRopen(Float _value_) {
        ropen = _value_;
    }

    private static Object getRopen(BaseClass _this_) {
        return ((GovCT1) _this_).getRopen();
    }

    private static void setRopen(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovCT1) _this_).setRopen((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setRopen(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Feedback signal for droop (<i>Rselect</i>).  Typical value = electricalPower.
     */
    private String rselect; // DroopSignalFeedbackKind

    public String getRselect() {
        return rselect;
    }

    public void setRselect(String _value_) {
        rselect = _value_;
    }

    private static Object getRselect(BaseClass _this_) {
        return ((GovCT1) _this_).getRselect();
    }

    private static void setRselect(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((GovCT1) _this_).setRselect((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Maximum rate of load limit increase (<i>Rup</i>).  Typical value = 99.
     */
    private Double rup; // PU

    public Double getRup() {
        return rup;
    }

    public void setRup(Double _value_) {
        rup = _value_;
    }

    private static Object getRup(BaseClass _this_) {
        return ((GovCT1) _this_).getRup();
    }

    private static void setRup(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setRup((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setRup(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Acceleration limiter time constant (<i>Ta</i>) (&gt; 0).  Typical value = 0,1.
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((GovCT1) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setTa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Actuator time constant (<i>Tact</i>) (&gt;= 0).  Typical value = 0,5.
     */
    private Double tact; // Seconds

    public Double getTact() {
        return tact;
    }

    public void setTact(Double _value_) {
        tact = _value_;
    }

    private static Object getTact(BaseClass _this_) {
        return ((GovCT1) _this_).getTact();
    }

    private static void setTact(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setTact((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setTact(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Turbine lag time constant (<i>Tb</i>) (&gt; 0).  Typical value = 0,5.
     */
    private Double tb; // Seconds

    public Double getTb() {
        return tb;
    }

    public void setTb(Double _value_) {
        tb = _value_;
    }

    private static Object getTb(BaseClass _this_) {
        return ((GovCT1) _this_).getTb();
    }

    private static void setTb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setTb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setTb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Turbine lead time constant (<i>Tc</i>) (&gt;= 0).  Typical value = 0.
     */
    private Double tc; // Seconds

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    private static Object getTc(BaseClass _this_) {
        return ((GovCT1) _this_).getTc();
    }

    private static void setTc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setTc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setTc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Governor derivative controller time constant (<i>Tdgov</i>) (&gt;= 0).  Typical value = 1.
     */
    private Double tdgov; // Seconds

    public Double getTdgov() {
        return tdgov;
    }

    public void setTdgov(Double _value_) {
        tdgov = _value_;
    }

    private static Object getTdgov(BaseClass _this_) {
        return ((GovCT1) _this_).getTdgov();
    }

    private static void setTdgov(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setTdgov((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setTdgov(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Transport time delay for diesel engine used in representing diesel engines where there is a small but measurable transport delay between a change in fuel flow setting and the development of torque (<i>Teng</i>) (&gt;= 0).  <i>Teng</i> should be zero in all but special cases where this transport delay is of particular concern.  Typical value = 0.
     */
    private Double teng; // Seconds

    public Double getTeng() {
        return teng;
    }

    public void setTeng(Double _value_) {
        teng = _value_;
    }

    private static Object getTeng(BaseClass _this_) {
        return ((GovCT1) _this_).getTeng();
    }

    private static void setTeng(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setTeng((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setTeng(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Load-limiter time constant (<i>Tfload</i>) (&gt; 0).  Typical value = 3.
     */
    private Double tfload; // Seconds

    public Double getTfload() {
        return tfload;
    }

    public void setTfload(Double _value_) {
        tfload = _value_;
    }

    private static Object getTfload(BaseClass _this_) {
        return ((GovCT1) _this_).getTfload();
    }

    private static void setTfload(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setTfload((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setTfload(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Electrical power transducer time constant (<i>Tpelec</i>) (&gt; 0).  Typical value = 1.
     */
    private Double tpelec; // Seconds

    public Double getTpelec() {
        return tpelec;
    }

    public void setTpelec(Double _value_) {
        tpelec = _value_;
    }

    private static Object getTpelec(BaseClass _this_) {
        return ((GovCT1) _this_).getTpelec();
    }

    private static void setTpelec(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setTpelec((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setTpelec(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Temperature detection lead time constant (<i>Tsa</i>) (&gt;= 0).  Typical value = 4.
     */
    private Double tsa; // Seconds

    public Double getTsa() {
        return tsa;
    }

    public void setTsa(Double _value_) {
        tsa = _value_;
    }

    private static Object getTsa(BaseClass _this_) {
        return ((GovCT1) _this_).getTsa();
    }

    private static void setTsa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setTsa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setTsa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Temperature detection lag time constant (<i>Tsb</i>) (&gt;= 0).  Typical value = 5.
     */
    private Double tsb; // Seconds

    public Double getTsb() {
        return tsb;
    }

    public void setTsb(Double _value_) {
        tsb = _value_;
    }

    private static Object getTsb(BaseClass _this_) {
        return ((GovCT1) _this_).getTsb();
    }

    private static void setTsb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setTsb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setTsb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum valve position limit (<i>Vmax</i>) (&gt; GovCT1.vmin).  Typical value = 1.
     */
    private Double vmax; // PU

    public Double getVmax() {
        return vmax;
    }

    public void setVmax(Double _value_) {
        vmax = _value_;
    }

    private static Object getVmax(BaseClass _this_) {
        return ((GovCT1) _this_).getVmax();
    }

    private static void setVmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setVmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setVmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum valve position limit (<i>Vmin</i>) (&lt; GovCT1.vmax).  Typical value = 0,15.
     */
    private Double vmin; // PU

    public Double getVmin() {
        return vmin;
    }

    public void setVmin(Double _value_) {
        vmin = _value_;
    }

    private static Object getVmin(BaseClass _this_) {
        return ((GovCT1) _this_).getVmin();
    }

    private static void setVmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setVmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setVmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * No load fuel flow (<i>Wfnl</i>).  Typical value = 0,2.
     */
    private Double wfnl; // PU

    public Double getWfnl() {
        return wfnl;
    }

    public void setWfnl(Double _value_) {
        wfnl = _value_;
    }

    private static Object getWfnl(BaseClass _this_) {
        return ((GovCT1) _this_).getWfnl();
    }

    private static void setWfnl(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovCT1) _this_).setWfnl((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setWfnl(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Switch for fuel source characteristic to recognize that fuel flow, for a given fuel valve stroke, can be proportional to engine speed (<i>Wfspd</i>). true = fuel flow proportional to speed (for some gas turbines and diesel engines with positive displacement fuel injectors) false = fuel control system keeps fuel flow independent of engine speed. Typical value = true.
     */
    private Boolean wfspd; // Boolean

    public Boolean getWfspd() {
        return wfspd;
    }

    public void setWfspd(Boolean _value_) {
        wfspd = _value_;
    }

    private static Object getWfspd(BaseClass _this_) {
        return ((GovCT1) _this_).getWfspd();
    }

    private static void setWfspd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((GovCT1) _this_).setWfspd((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((GovCT1) _this_).setWfspd(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovCT1", attrName));
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
                "GovCT1", attrName, value));
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
            map.put("aset", new AttrDetails("GovCT1.aset", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getAset, GovCT1::setAset));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db", new AttrDetails("GovCT1.db", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getDb, GovCT1::setDb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dm", new AttrDetails("GovCT1.dm", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getDm, GovCT1::setDm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("GovCT1.ka", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getKa, GovCT1::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kdgov", new AttrDetails("GovCT1.kdgov", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getKdgov, GovCT1::setKdgov));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kigov", new AttrDetails("GovCT1.kigov", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getKigov, GovCT1::setKigov));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiload", new AttrDetails("GovCT1.kiload", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getKiload, GovCT1::setKiload));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kimw", new AttrDetails("GovCT1.kimw", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getKimw, GovCT1::setKimw));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpgov", new AttrDetails("GovCT1.kpgov", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getKpgov, GovCT1::setKpgov));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpload", new AttrDetails("GovCT1.kpload", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getKpload, GovCT1::setKpload));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kturb", new AttrDetails("GovCT1.kturb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getKturb, GovCT1::setKturb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ldref", new AttrDetails("GovCT1.ldref", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getLdref, GovCT1::setLdref));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("maxerr", new AttrDetails("GovCT1.maxerr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getMaxerr, GovCT1::setMaxerr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("minerr", new AttrDetails("GovCT1.minerr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getMinerr, GovCT1::setMinerr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovCT1.mwbase", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getMwbase, GovCT1::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("r", new AttrDetails("GovCT1.r", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getR, GovCT1::setR));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rclose", new AttrDetails("GovCT1.rclose", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getRclose, GovCT1::setRclose));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rdown", new AttrDetails("GovCT1.rdown", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getRdown, GovCT1::setRdown));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ropen", new AttrDetails("GovCT1.ropen", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getRopen, GovCT1::setRopen));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rselect", new AttrDetails("GovCT1.rselect", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, GovCT1::getRselect, GovCT1::setRselect));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rup", new AttrDetails("GovCT1.rup", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getRup, GovCT1::setRup));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("GovCT1.ta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getTa, GovCT1::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tact", new AttrDetails("GovCT1.tact", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getTact, GovCT1::setTact));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("GovCT1.tb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getTb, GovCT1::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("GovCT1.tc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getTc, GovCT1::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tdgov", new AttrDetails("GovCT1.tdgov", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getTdgov, GovCT1::setTdgov));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("teng", new AttrDetails("GovCT1.teng", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getTeng, GovCT1::setTeng));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tfload", new AttrDetails("GovCT1.tfload", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getTfload, GovCT1::setTfload));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpelec", new AttrDetails("GovCT1.tpelec", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getTpelec, GovCT1::setTpelec));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tsa", new AttrDetails("GovCT1.tsa", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getTsa, GovCT1::setTsa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tsb", new AttrDetails("GovCT1.tsb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getTsb, GovCT1::setTsb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmax", new AttrDetails("GovCT1.vmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getVmax, GovCT1::setVmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmin", new AttrDetails("GovCT1.vmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getVmin, GovCT1::setVmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("wfnl", new AttrDetails("GovCT1.wfnl", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getWfnl, GovCT1::setWfnl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("wfspd", new AttrDetails("GovCT1.wfspd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::getWfspd, GovCT1::setWfspd));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovCT1(null).allAttrDetailsMap());
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
