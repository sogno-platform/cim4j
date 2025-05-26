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
 * Detailed hydro unit - Pelton model.  This model can be used to represent the dynamic related to water tunnel and surge chamber. A schematic of the hydraulic system of detailed hydro unit models, like Francis and Pelton, is located under the GovHydroFrancis class.
 */
@SuppressWarnings("unused")
public class GovHydroPelton extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydroPelton.class);

    /**
     * Constructor.
     */
    public GovHydroPelton(String rdfid) {
        super("GovHydroPelton", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovHydroPelton(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Area of the surge tank (A). Unit = m. Typical Value = 30.
     */
    private Double av0; // Area

    public Double getAv0() {
        return av0;
    }

    public void setAv0(Double _value_) {
        av0 = _value_;
    }

    private static Object getAv0(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getAv0();
    }

    private static void setAv0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setAv0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setAv0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Area of the compensation tank (A). Unit = m. Typical Value = 700.
     */
    private Double av1; // Area

    public Double getAv1() {
        return av1;
    }

    public void setAv1(Double _value_) {
        av1 = _value_;
    }

    private static Object getAv1(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getAv1();
    }

    private static void setAv1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setAv1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setAv1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Droop (bp).  Typical Value = 0.05.
     */
    private Double bp; // PU

    public Double getBp() {
        return bp;
    }

    public void setBp(Double _value_) {
        bp = _value_;
    }

    private static Object getBp(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getBp();
    }

    private static void setBp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setBp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setBp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intentional dead-band width (DB1).  Unit = Hz.  Typical Value = 0.
     */
    private Double db1; // Frequency

    public Double getDb1() {
        return db1;
    }

    public void setDb1(Double _value_) {
        db1 = _value_;
    }

    private static Object getDb1(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getDb1();
    }

    private static void setDb1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setDb1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setDb1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intentional dead-band width of valve opening error (DB2). Unit = Hz.  Typical Value = 0.01.
     */
    private Double db2; // Frequency

    public Double getDb2() {
        return db2;
    }

    public void setDb2(Double _value_) {
        db2 = _value_;
    }

    private static Object getDb2(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getDb2();
    }

    private static void setDb2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setDb2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setDb2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Head of compensation chamber water level with respect to the level of penstock (H).  Unit = m. Typical Value = 4.
     */
    private Double h1; // Length

    public Double getH1() {
        return h1;
    }

    public void setH1(Double _value_) {
        h1 = _value_;
    }

    private static Object getH1(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getH1();
    }

    private static void setH1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setH1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setH1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Head of surge tank water level with respect to the level of penstock (H).  Unit = m. Typical Value = 40.
     */
    private Double h2; // Length

    public Double getH2() {
        return h2;
    }

    public void setH2(Double _value_) {
        h2 = _value_;
    }

    private static Object getH2(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getH2();
    }

    private static void setH2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setH2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setH2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rated hydraulic head (H).  Unit = m. Typical Value = 250.
     */
    private Double hn; // Length

    public Double getHn() {
        return hn;
    }

    public void setHn(Double _value_) {
        hn = _value_;
    }

    private static Object getHn(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getHn();
    }

    private static void setHn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setHn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setHn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Penstock loss coefficient (due to friction) (Kc).  Typical Value = 0.025.
     */
    private Double kc; // PU

    public Double getKc() {
        return kc;
    }

    public void setKc(Double _value_) {
        kc = _value_;
    }

    private static Object getKc(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getKc();
    }

    private static void setKc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setKc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setKc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Water tunnel and surge chamber loss coefficient (due to friction) (Kg).  Typical Value = -0.025.
     */
    private Double kg; // PU

    public Double getKg() {
        return kg;
    }

    public void setKg(Double _value_) {
        kg = _value_;
    }

    private static Object getKg(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getKg();
    }

    private static void setKg(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setKg((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setKg(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * No-load turbine flow at nominal head (Qc0).  Typical Value = 0.05.
     */
    private Double qc0; // PU

    public Double getQc0() {
        return qc0;
    }

    public void setQc0(Double _value_) {
        qc0 = _value_;
    }

    private static Object getQc0(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getQc0();
    }

    private static void setQc0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setQc0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setQc0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rated flow (Q). Unit = m/s. Typical Value = 40.
     */
    private Double qn; // VolumeFlowRate

    public Double getQn() {
        return qn;
    }

    public void setQn(Double _value_) {
        qn = _value_;
    }

    private static Object getQn(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getQn();
    }

    private static void setQn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setQn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setQn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Simplified Pelton model simulation (Sflag). true = enable of simplified Pelton model simulation false = enable of complete Pelton model simulation (non linear gain). Typical Value = false.
     */
    private Boolean simplifiedPelton; // Boolean

    public Boolean getSimplifiedPelton() {
        return simplifiedPelton;
    }

    public void setSimplifiedPelton(Boolean _value_) {
        simplifiedPelton = _value_;
    }

    private static Object getSimplifiedPelton(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getSimplifiedPelton();
    }

    private static void setSimplifiedPelton(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((GovHydroPelton) _this_).setSimplifiedPelton((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setSimplifiedPelton(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Static compensating characteristic (Cflag). true = enable of static compensating characteristic  false = inhibit of static compensating characteristic. Typical Value = false.
     */
    private Boolean staticCompensating; // Boolean

    public Boolean getStaticCompensating() {
        return staticCompensating;
    }

    public void setStaticCompensating(Boolean _value_) {
        staticCompensating = _value_;
    }

    private static Object getStaticCompensating(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getStaticCompensating();
    }

    private static void setStaticCompensating(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((GovHydroPelton) _this_).setStaticCompensating((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setStaticCompensating(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Derivative gain (accelerometer time constant) (Ta).  Typical Value = 3.
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setTa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gate servo time constant (Ts).  Typical Value = 0.15.
     */
    private Double ts; // Seconds

    public Double getTs() {
        return ts;
    }

    public void setTs(Double _value_) {
        ts = _value_;
    }

    private static Object getTs(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getTs();
    }

    private static void setTs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setTs((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setTs(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Servomotor integrator time constant (TV).  Typical Value = 0.3.
     */
    private Double tv; // Seconds

    public Double getTv() {
        return tv;
    }

    public void setTv(Double _value_) {
        tv = _value_;
    }

    private static Object getTv(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getTv();
    }

    private static void setTv(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setTv((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setTv(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Water inertia time constant (Twnc).  Typical Value = 1.
     */
    private Double twnc; // Seconds

    public Double getTwnc() {
        return twnc;
    }

    public void setTwnc(Double _value_) {
        twnc = _value_;
    }

    private static Object getTwnc(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getTwnc();
    }

    private static void setTwnc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setTwnc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setTwnc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Water tunnel and surge chamber inertia time constant (Twng). Typical Value = 3.
     */
    private Double twng; // Seconds

    public Double getTwng() {
        return twng;
    }

    public void setTwng(Double _value_) {
        twng = _value_;
    }

    private static Object getTwng(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getTwng();
    }

    private static void setTwng(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setTwng((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setTwng(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Electronic integrator time constant (Tx).  Typical Value = 0.5.
     */
    private Double tx; // Seconds

    public Double getTx() {
        return tx;
    }

    public void setTx(Double _value_) {
        tx = _value_;
    }

    private static Object getTx(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getTx();
    }

    private static void setTx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setTx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setTx(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum gate opening velocity (Va).  Unit = PU/sec.  Typical Value = 0.016.
     */
    private Double va; // Simple_Float

    public Double getVa() {
        return va;
    }

    public void setVa(Double _value_) {
        va = _value_;
    }

    private static Object getVa(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getVa();
    }

    private static void setVa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setVa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setVa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum gate opening (ValvMax).  Typical Value = 1.
     */
    private Double valvmax; // PU

    public Double getValvmax() {
        return valvmax;
    }

    public void setValvmax(Double _value_) {
        valvmax = _value_;
    }

    private static Object getValvmax(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getValvmax();
    }

    private static void setValvmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setValvmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setValvmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum gate opening (ValvMin).  Typical Value = 0.
     */
    private Double valvmin; // PU

    public Double getValvmin() {
        return valvmin;
    }

    public void setValvmin(Double _value_) {
        valvmin = _value_;
    }

    private static Object getValvmin(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getValvmin();
    }

    private static void setValvmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setValvmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setValvmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum servomotor valve opening velocity (Vav).  Typical Value = 0.017.
     */
    private Double vav; // PU

    public Double getVav() {
        return vav;
    }

    public void setVav(Double _value_) {
        vav = _value_;
    }

    private static Object getVav(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getVav();
    }

    private static void setVav(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setVav((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setVav(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum gate closing velocity (Vc).  Unit = PU/sec.  Typical Value = -0.016.
     */
    private Double vc; // Simple_Float

    public Double getVc() {
        return vc;
    }

    public void setVc(Double _value_) {
        vc = _value_;
    }

    private static Object getVc(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getVc();
    }

    private static void setVc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setVc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setVc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum servomotor valve closing velocity (Vcv).  Typical Value = -0.017.
     */
    private Double vcv; // PU

    public Double getVcv() {
        return vcv;
    }

    public void setVcv(Double _value_) {
        vcv = _value_;
    }

    private static Object getVcv(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getVcv();
    }

    private static void setVcv(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setVcv((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setVcv(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Water tunnel and surge chamber simulation (Tflag). true = enable of water tunnel and surge chamber simulation false = inhibit of water tunnel and surge chamber simulation. Typical Value = false.
     */
    private Boolean waterTunnelSurgeChamberSimulation; // Boolean

    public Boolean getWaterTunnelSurgeChamberSimulation() {
        return waterTunnelSurgeChamberSimulation;
    }

    public void setWaterTunnelSurgeChamberSimulation(Boolean _value_) {
        waterTunnelSurgeChamberSimulation = _value_;
    }

    private static Object getWaterTunnelSurgeChamberSimulation(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getWaterTunnelSurgeChamberSimulation();
    }

    private static void setWaterTunnelSurgeChamberSimulation(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((GovHydroPelton) _this_).setWaterTunnelSurgeChamberSimulation((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setWaterTunnelSurgeChamberSimulation(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Head of upper water level with respect to the level of penstock (Zsfc).  Unit = m. Typical Value = 25.
     */
    private Double zsfc; // Length

    public Double getZsfc() {
        return zsfc;
    }

    public void setZsfc(Double _value_) {
        zsfc = _value_;
    }

    private static Object getZsfc(BaseClass _this_) {
        return ((GovHydroPelton) _this_).getZsfc();
    }

    private static void setZsfc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPelton) _this_).setZsfc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPelton) _this_).setZsfc(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovHydroPelton", attrName));
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
                "GovHydroPelton", attrName, value));
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
            map.put("av0", new AttrDetails("GovHydroPelton.av0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getAv0, GovHydroPelton::setAv0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("av1", new AttrDetails("GovHydroPelton.av1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getAv1, GovHydroPelton::setAv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bp", new AttrDetails("GovHydroPelton.bp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getBp, GovHydroPelton::setBp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db1", new AttrDetails("GovHydroPelton.db1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getDb1, GovHydroPelton::setDb1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db2", new AttrDetails("GovHydroPelton.db2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getDb2, GovHydroPelton::setDb2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("h1", new AttrDetails("GovHydroPelton.h1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getH1, GovHydroPelton::setH1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("h2", new AttrDetails("GovHydroPelton.h2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getH2, GovHydroPelton::setH2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("hn", new AttrDetails("GovHydroPelton.hn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getHn, GovHydroPelton::setHn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("GovHydroPelton.kc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getKc, GovHydroPelton::setKc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kg", new AttrDetails("GovHydroPelton.kg", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getKg, GovHydroPelton::setKg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qc0", new AttrDetails("GovHydroPelton.qc0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getQc0, GovHydroPelton::setQc0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qn", new AttrDetails("GovHydroPelton.qn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getQn, GovHydroPelton::setQn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("simplifiedPelton", new AttrDetails("GovHydroPelton.simplifiedPelton", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getSimplifiedPelton, GovHydroPelton::setSimplifiedPelton));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("staticCompensating", new AttrDetails("GovHydroPelton.staticCompensating", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getStaticCompensating, GovHydroPelton::setStaticCompensating));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("GovHydroPelton.ta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getTa, GovHydroPelton::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ts", new AttrDetails("GovHydroPelton.ts", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getTs, GovHydroPelton::setTs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tv", new AttrDetails("GovHydroPelton.tv", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getTv, GovHydroPelton::setTv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twnc", new AttrDetails("GovHydroPelton.twnc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getTwnc, GovHydroPelton::setTwnc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twng", new AttrDetails("GovHydroPelton.twng", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getTwng, GovHydroPelton::setTwng));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tx", new AttrDetails("GovHydroPelton.tx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getTx, GovHydroPelton::setTx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("va", new AttrDetails("GovHydroPelton.va", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getVa, GovHydroPelton::setVa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("valvmax", new AttrDetails("GovHydroPelton.valvmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getValvmax, GovHydroPelton::setValvmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("valvmin", new AttrDetails("GovHydroPelton.valvmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getValvmin, GovHydroPelton::setValvmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vav", new AttrDetails("GovHydroPelton.vav", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getVav, GovHydroPelton::setVav));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vc", new AttrDetails("GovHydroPelton.vc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getVc, GovHydroPelton::setVc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vcv", new AttrDetails("GovHydroPelton.vcv", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getVcv, GovHydroPelton::setVcv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("waterTunnelSurgeChamberSimulation", new AttrDetails("GovHydroPelton.waterTunnelSurgeChamberSimulation", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getWaterTunnelSurgeChamberSimulation, GovHydroPelton::setWaterTunnelSurgeChamberSimulation));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("zsfc", new AttrDetails("GovHydroPelton.zsfc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroPelton::getZsfc, GovHydroPelton::setZsfc));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovHydroPelton(null).allAttrDetailsMap());
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
