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
 * Slovakian Excitation System Model.  UEL and secondary voltage control are included in this model. When this model is used, there cannot be a separate underexcitation limiter or VAr controller model.
 */
@SuppressWarnings("unused")
public class ExcSK extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcSK.class);

    /**
     * Constructor.
     */
    public ExcSK(String rdfid) {
        super("ExcSK", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcSK(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Field voltage clipping limit (Efdmax).
     */
    private Double efdmax; // PU

    public Double getEfdmax() {
        return efdmax;
    }

    public void setEfdmax(Double _value_) {
        efdmax = _value_;
    }

    private static Object getEfdmax(BaseClass _this_) {
        return ((ExcSK) _this_).getEfdmax();
    }

    private static void setEfdmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setEfdmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setEfdmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Field voltage clipping limit (Efdmin).
     */
    private Double efdmin; // PU

    public Double getEfdmin() {
        return efdmin;
    }

    public void setEfdmin(Double _value_) {
        efdmin = _value_;
    }

    private static Object getEfdmin(BaseClass _this_) {
        return ((ExcSK) _this_).getEfdmin();
    }

    private static void setEfdmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setEfdmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setEfdmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum field voltage output (Emax).  Typical Value = 20.
     */
    private Double emax; // PU

    public Double getEmax() {
        return emax;
    }

    public void setEmax(Double _value_) {
        emax = _value_;
    }

    private static Object getEmax(BaseClass _this_) {
        return ((ExcSK) _this_).getEmax();
    }

    private static void setEmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setEmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setEmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum field voltage output (Emin).  Typical Value = -20.
     */
    private Double emin; // PU

    public Double getEmin() {
        return emin;
    }

    public void setEmin(Double _value_) {
        emin = _value_;
    }

    private static Object getEmin(BaseClass _this_) {
        return ((ExcSK) _this_).getEmin();
    }

    private static void setEmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setEmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setEmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (K).  Typical Value = 1.
     */
    private Double k; // PU

    public Double getK() {
        return k;
    }

    public void setK(Double _value_) {
        k = _value_;
    }

    private static Object getK(BaseClass _this_) {
        return ((ExcSK) _this_).getK();
    }

    private static void setK(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setK((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setK(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Parameter of underexcitation limit (K1).  Typical Value = 0.1364.
     */
    private Double k1; // PU

    public Double getK1() {
        return k1;
    }

    public void setK1(Double _value_) {
        k1 = _value_;
    }

    private static Object getK1(BaseClass _this_) {
        return ((ExcSK) _this_).getK1();
    }

    private static void setK1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setK1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setK1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Parameter of underexcitation limit (K2).  Typical Value = -0.3861.
     */
    private Double k2; // PU

    public Double getK2() {
        return k2;
    }

    public void setK2(Double _value_) {
        k2 = _value_;
    }

    private static Object getK2(BaseClass _this_) {
        return ((ExcSK) _this_).getK2();
    }

    private static void setK2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setK2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setK2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * PI controller gain (Kc).  Typical Value = 70.
     */
    private Double kc; // PU

    public Double getKc() {
        return kc;
    }

    public void setKc(Double _value_) {
        kc = _value_;
    }

    private static Object getKc(BaseClass _this_) {
        return ((ExcSK) _this_).getKc();
    }

    private static void setKc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setKc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setKc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rectifier regulation factor (Kce).  Typical Value = 0.
     */
    private Double kce; // PU

    public Double getKce() {
        return kce;
    }

    public void setKce(Double _value_) {
        kce = _value_;
    }

    private static Object getKce(BaseClass _this_) {
        return ((ExcSK) _this_).getKce();
    }

    private static void setKce(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setKce((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setKce(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter internal reactance (Kd).  Typical Value = 0.
     */
    private Double kd; // PU

    public Double getKd() {
        return kd;
    }

    public void setKd(Double _value_) {
        kd = _value_;
    }

    private static Object getKd(BaseClass _this_) {
        return ((ExcSK) _this_).getKd();
    }

    private static void setKd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setKd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setKd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * P controller gain (Kgob).  Typical Value = 10.
     */
    private Double kgob; // PU

    public Double getKgob() {
        return kgob;
    }

    public void setKgob(Double _value_) {
        kgob = _value_;
    }

    private static Object getKgob(BaseClass _this_) {
        return ((ExcSK) _this_).getKgob();
    }

    private static void setKgob(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setKgob((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setKgob(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * PI controller gain (Kp).  Typical Value = 1.
     */
    private Double kp; // PU

    public Double getKp() {
        return kp;
    }

    public void setKp(Double _value_) {
        kp = _value_;
    }

    private static Object getKp(BaseClass _this_) {
        return ((ExcSK) _this_).getKp();
    }

    private static void setKp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setKp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setKp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * PI controller gain of integral component (Kqi).  Typical Value = 0.
     */
    private Double kqi; // PU

    public Double getKqi() {
        return kqi;
    }

    public void setKqi(Double _value_) {
        kqi = _value_;
    }

    private static Object getKqi(BaseClass _this_) {
        return ((ExcSK) _this_).getKqi();
    }

    private static void setKqi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setKqi((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setKqi(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rate of rise of the reactive power (Kqob).
     */
    private Double kqob; // PU

    public Double getKqob() {
        return kqob;
    }

    public void setKqob(Double _value_) {
        kqob = _value_;
    }

    private static Object getKqob(BaseClass _this_) {
        return ((ExcSK) _this_).getKqob();
    }

    private static void setKqob(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setKqob((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setKqob(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * PI controller gain (Kqp).  Typical Value = 0.
     */
    private Double kqp; // PU

    public Double getKqp() {
        return kqp;
    }

    public void setKqp(Double _value_) {
        kqp = _value_;
    }

    private static Object getKqp(BaseClass _this_) {
        return ((ExcSK) _this_).getKqp();
    }

    private static void setKqp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setKqp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setKqp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Dead band of reactive power (nq).  Determines the range of sensitivity.  Typical Value = 0.001.
     */
    private Double nq; // PU

    public Double getNq() {
        return nq;
    }

    public void setNq(Double _value_) {
        nq = _value_;
    }

    private static Object getNq(BaseClass _this_) {
        return ((ExcSK) _this_).getNq();
    }

    private static void setNq(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setNq((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setNq(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Secondary voltage control state (Qc_on_off). true = secondary voltage control is ON false = secondary voltage control is OFF. Typical Value = false.
     */
    private Boolean qconoff; // Boolean

    public Boolean getQconoff() {
        return qconoff;
    }

    public void setQconoff(Boolean _value_) {
        qconoff = _value_;
    }

    private static Object getQconoff(BaseClass _this_) {
        return ((ExcSK) _this_).getQconoff();
    }

    private static void setQconoff(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ExcSK) _this_).setQconoff((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setQconoff(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Desired value (setpoint) of reactive power, manual setting (Qz).
     */
    private Double qz; // PU

    public Double getQz() {
        return qz;
    }

    public void setQz(Double _value_) {
        qz = _value_;
    }

    private static Object getQz(BaseClass _this_) {
        return ((ExcSK) _this_).getQz();
    }

    private static void setQz(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setQz((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setQz(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Selector to apply automatic calculation in secondary controller model. true = automatic calculation is activated false = manual set is active; the use of desired value of reactive power (Qz) is required. Typical Value = true.
     */
    private Boolean remote; // Boolean

    public Boolean getRemote() {
        return remote;
    }

    public void setRemote(Boolean _value_) {
        remote = _value_;
    }

    private static Object getRemote(BaseClass _this_) {
        return ((ExcSK) _this_).getRemote();
    }

    private static void setRemote(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ExcSK) _this_).setRemote((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setRemote(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Apparent power of the unit (Sbase).  Unit = MVA.  Typical Value = 259.
     */
    private Double sbase; // ApparentPower

    public Double getSbase() {
        return sbase;
    }

    public void setSbase(Double _value_) {
        sbase = _value_;
    }

    private static Object getSbase(BaseClass _this_) {
        return ((ExcSK) _this_).getSbase();
    }

    private static void setSbase(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setSbase((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setSbase(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * PI controller phase lead time constant (Tc).  Typical Value = 8.
     */
    private Double tc; // Seconds

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    private static Object getTc(BaseClass _this_) {
        return ((ExcSK) _this_).getTc();
    }

    private static void setTc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setTc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setTc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant of gain block (Te).  Typical Value = 0.1.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    private static Object getTe(BaseClass _this_) {
        return ((ExcSK) _this_).getTe();
    }

    private static void setTe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setTe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setTe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * PI controller phase lead time constant (Ti).  Typical Value = 2.
     */
    private Double ti; // Seconds

    public Double getTi() {
        return ti;
    }

    public void setTi(Double _value_) {
        ti = _value_;
    }

    private static Object getTi(BaseClass _this_) {
        return ((ExcSK) _this_).getTi();
    }

    private static void setTi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setTi((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setTi(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (Tp).  Typical Value = 0.1.
     */
    private Double tp; // Seconds

    public Double getTp() {
        return tp;
    }

    public void setTp(Double _value_) {
        tp = _value_;
    }

    private static Object getTp(BaseClass _this_) {
        return ((ExcSK) _this_).getTp();
    }

    private static void setTp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setTp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setTp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage transducer time constant (Tr).  Typical Value = 0.01.
     */
    private Double tr; // Seconds

    public Double getTr() {
        return tr;
    }

    public void setTr(Double _value_) {
        tr = _value_;
    }

    private static Object getTr(BaseClass _this_) {
        return ((ExcSK) _this_).getTr();
    }

    private static void setTr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setTr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setTr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum error (Uimax).  Typical Value = 10.
     */
    private Double uimax; // PU

    public Double getUimax() {
        return uimax;
    }

    public void setUimax(Double _value_) {
        uimax = _value_;
    }

    private static Object getUimax(BaseClass _this_) {
        return ((ExcSK) _this_).getUimax();
    }

    private static void setUimax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setUimax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setUimax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum error (UImin).  Typical Value = -10.
     */
    private Double uimin; // PU

    public Double getUimin() {
        return uimin;
    }

    public void setUimin(Double _value_) {
        uimin = _value_;
    }

    private static Object getUimin(BaseClass _this_) {
        return ((ExcSK) _this_).getUimin();
    }

    private static void setUimin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setUimin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setUimin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum controller output (URmax).  Typical Value = 10.
     */
    private Double urmax; // PU

    public Double getUrmax() {
        return urmax;
    }

    public void setUrmax(Double _value_) {
        urmax = _value_;
    }

    private static Object getUrmax(BaseClass _this_) {
        return ((ExcSK) _this_).getUrmax();
    }

    private static void setUrmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setUrmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setUrmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum controller output (URmin).  Typical Value = -10.
     */
    private Double urmin; // PU

    public Double getUrmin() {
        return urmin;
    }

    public void setUrmin(Double _value_) {
        urmin = _value_;
    }

    private static Object getUrmin(BaseClass _this_) {
        return ((ExcSK) _this_).getUrmin();
    }

    private static void setUrmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setUrmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setUrmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum terminal voltage input (Vtmax).  Determines the range of voltage dead band.  Typical Value = 1.05.
     */
    private Double vtmax; // PU

    public Double getVtmax() {
        return vtmax;
    }

    public void setVtmax(Double _value_) {
        vtmax = _value_;
    }

    private static Object getVtmax(BaseClass _this_) {
        return ((ExcSK) _this_).getVtmax();
    }

    private static void setVtmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setVtmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setVtmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum terminal voltage input (Vtmin).  Determines the range of voltage dead band.  Typical Value = 0.95.
     */
    private Double vtmin; // PU

    public Double getVtmin() {
        return vtmin;
    }

    public void setVtmin(Double _value_) {
        vtmin = _value_;
    }

    private static Object getVtmin(BaseClass _this_) {
        return ((ExcSK) _this_).getVtmin();
    }

    private static void setVtmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setVtmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setVtmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum output (Yp).  Minimum output = 0.  Typical Value = 1.
     */
    private Double yp; // PU

    public Double getYp() {
        return yp;
    }

    public void setYp(Double _value_) {
        yp = _value_;
    }

    private static Object getYp(BaseClass _this_) {
        return ((ExcSK) _this_).getYp();
    }

    private static void setYp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSK) _this_).setYp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSK) _this_).setYp(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcSK", attrName));
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
                "ExcSK", attrName, value));
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
            map.put("efdmax", new AttrDetails("ExcSK.efdmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getEfdmax, ExcSK::setEfdmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efdmin", new AttrDetails("ExcSK.efdmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getEfdmin, ExcSK::setEfdmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("emax", new AttrDetails("ExcSK.emax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getEmax, ExcSK::setEmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("emin", new AttrDetails("ExcSK.emin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getEmin, ExcSK::setEmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k", new AttrDetails("ExcSK.k", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getK, ExcSK::setK));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k1", new AttrDetails("ExcSK.k1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getK1, ExcSK::setK1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k2", new AttrDetails("ExcSK.k2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getK2, ExcSK::setK2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("ExcSK.kc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getKc, ExcSK::setKc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kce", new AttrDetails("ExcSK.kce", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getKce, ExcSK::setKce));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("ExcSK.kd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getKd, ExcSK::setKd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kgob", new AttrDetails("ExcSK.kgob", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getKgob, ExcSK::setKgob));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("ExcSK.kp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getKp, ExcSK::setKp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kqi", new AttrDetails("ExcSK.kqi", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getKqi, ExcSK::setKqi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kqob", new AttrDetails("ExcSK.kqob", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getKqob, ExcSK::setKqob));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kqp", new AttrDetails("ExcSK.kqp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getKqp, ExcSK::setKqp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("nq", new AttrDetails("ExcSK.nq", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getNq, ExcSK::setNq));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qconoff", new AttrDetails("ExcSK.qconoff", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getQconoff, ExcSK::setQconoff));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qz", new AttrDetails("ExcSK.qz", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getQz, ExcSK::setQz));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("remote", new AttrDetails("ExcSK.remote", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getRemote, ExcSK::setRemote));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("sbase", new AttrDetails("ExcSK.sbase", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getSbase, ExcSK::setSbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("ExcSK.tc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getTc, ExcSK::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcSK.te", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getTe, ExcSK::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti", new AttrDetails("ExcSK.ti", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getTi, ExcSK::setTi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tp", new AttrDetails("ExcSK.tp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getTp, ExcSK::setTp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tr", new AttrDetails("ExcSK.tr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getTr, ExcSK::setTr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uimax", new AttrDetails("ExcSK.uimax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getUimax, ExcSK::setUimax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uimin", new AttrDetails("ExcSK.uimin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getUimin, ExcSK::setUimin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("urmax", new AttrDetails("ExcSK.urmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getUrmax, ExcSK::setUrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("urmin", new AttrDetails("ExcSK.urmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getUrmin, ExcSK::setUrmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vtmax", new AttrDetails("ExcSK.vtmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getVtmax, ExcSK::setVtmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vtmin", new AttrDetails("ExcSK.vtmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getVtmin, ExcSK::setVtmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("yp", new AttrDetails("ExcSK.yp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSK::getYp, ExcSK::setYp));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcSK(null).allAttrDetailsMap());
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
