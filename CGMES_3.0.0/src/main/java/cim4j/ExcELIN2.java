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
 * Detailed excitation system ELIN (VATECH).  This model represents an all-static excitation system. A PI voltage controller establishes a desired field current set point for a proportional current controller. The integrator of the PI controller has a follow-up input to match its signal to the present field current.  Power system stabilizer models used in conjunction with this excitation system model: PssELIN2, PssIEEE2B, Pss2B.
 */
@SuppressWarnings("unused")
public class ExcELIN2 extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcELIN2.class);

    /**
     * Constructor.
     */
    public ExcELIN2(String rdfid) {
        super("ExcELIN2", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcELIN2(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Gain (<i>Efdbas</i>).  Typical value = 0,1.
     */
    private Double efdbas; // PU

    public Double getEfdbas() {
        return efdbas;
    }

    public void setEfdbas(Double _value_) {
        efdbas = _value_;
    }

    private static Object getEfdbas(BaseClass _this_) {
        return ((ExcELIN2) _this_).getEfdbas();
    }

    private static void setEfdbas(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setEfdbas((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setEfdbas(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Limiter (<i>I</i><i><sub>efmax</sub></i>) (&gt; ExcELIN2.iefmin).  Typical value = 1.
     */
    private Double iefmax; // PU

    public Double getIefmax() {
        return iefmax;
    }

    public void setIefmax(Double _value_) {
        iefmax = _value_;
    }

    private static Object getIefmax(BaseClass _this_) {
        return ((ExcELIN2) _this_).getIefmax();
    }

    private static void setIefmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setIefmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setIefmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum open circuit excitation voltage (<i>I</i><i><sub>efmax2</sub></i>).  Typical value = -5.
     */
    private Double iefmax2; // PU

    public Double getIefmax2() {
        return iefmax2;
    }

    public void setIefmax2(Double _value_) {
        iefmax2 = _value_;
    }

    private static Object getIefmax2(BaseClass _this_) {
        return ((ExcELIN2) _this_).getIefmax2();
    }

    private static void setIefmax2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setIefmax2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setIefmax2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Limiter (<i>I</i><i><sub>efmin</sub></i>) (&lt; ExcELIN2.iefmax).  Typical value = 1.
     */
    private Double iefmin; // PU

    public Double getIefmin() {
        return iefmin;
    }

    public void setIefmin(Double _value_) {
        iefmin = _value_;
    }

    private static Object getIefmin(BaseClass _this_) {
        return ((ExcELIN2) _this_).getIefmin();
    }

    private static void setIefmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setIefmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setIefmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator input gain (<i>K1</i>).  Typical value = 0.
     */
    private Double k1; // PU

    public Double getK1() {
        return k1;
    }

    public void setK1(Double _value_) {
        k1 = _value_;
    }

    private static Object getK1(BaseClass _this_) {
        return ((ExcELIN2) _this_).getK1();
    }

    private static void setK1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setK1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setK1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator input limit (<i>K1ec</i>).  Typical value = 2.
     */
    private Double k1ec; // PU

    public Double getK1ec() {
        return k1ec;
    }

    public void setK1ec(Double _value_) {
        k1ec = _value_;
    }

    private static Object getK1ec(BaseClass _this_) {
        return ((ExcELIN2) _this_).getK1ec();
    }

    private static void setK1ec(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setK1ec((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setK1ec(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (<i>K2</i>).  Typical value = 5.
     */
    private Double k2; // PU

    public Double getK2() {
        return k2;
    }

    public void setK2(Double _value_) {
        k2 = _value_;
    }

    private static Object getK2(BaseClass _this_) {
        return ((ExcELIN2) _this_).getK2();
    }

    private static void setK2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setK2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setK2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (<i>K3</i>).  Typical value = 0,1.
     */
    private Double k3; // PU

    public Double getK3() {
        return k3;
    }

    public void setK3(Double _value_) {
        k3 = _value_;
    }

    private static Object getK3(BaseClass _this_) {
        return ((ExcELIN2) _this_).getK3();
    }

    private static void setK3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setK3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setK3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (<i>K4</i>).  Typical value = 0.
     */
    private Double k4; // PU

    public Double getK4() {
        return k4;
    }

    public void setK4(Double _value_) {
        k4 = _value_;
    }

    private static Object getK4(BaseClass _this_) {
        return ((ExcELIN2) _this_).getK4();
    }

    private static void setK4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setK4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setK4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage controller derivative gain (<i>Kd1</i>).  Typical value = 34,5.
     */
    private Double kd1; // PU

    public Double getKd1() {
        return kd1;
    }

    public void setKd1(Double _value_) {
        kd1 = _value_;
    }

    private static Object getKd1(BaseClass _this_) {
        return ((ExcELIN2) _this_).getKd1();
    }

    private static void setKd1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setKd1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setKd1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (<i>Ke2</i>).  Typical value = 0,1.
     */
    private Double ke2; // PU

    public Double getKe2() {
        return ke2;
    }

    public void setKe2(Double _value_) {
        ke2 = _value_;
    }

    private static Object getKe2(BaseClass _this_) {
        return ((ExcELIN2) _this_).getKe2();
    }

    private static void setKe2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setKe2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setKe2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (<i>Ketb</i>).  Typical value = 0,06.
     */
    private Double ketb; // PU

    public Double getKetb() {
        return ketb;
    }

    public void setKetb(Double _value_) {
        ketb = _value_;
    }

    private static Object getKetb(BaseClass _this_) {
        return ((ExcELIN2) _this_).getKetb();
    }

    private static void setKetb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setKetb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setKetb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Controller follow up gain (<i>PID1max</i>).  Typical value = 2.
     */
    private Double pid1max; // PU

    public Double getPid1max() {
        return pid1max;
    }

    public void setPid1max(Double _value_) {
        pid1max = _value_;
    }

    private static Object getPid1max(BaseClass _this_) {
        return ((ExcELIN2) _this_).getPid1max();
    }

    private static void setPid1max(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setPid1max((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setPid1max(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, <i>Ve</i><i><sub>1</sub></i>, back of commutating reactance (<i>Se[Ve</i><i><sub>1</sub></i><i>]</i>) (&gt;= 0).  Typical value = 0.
     */
    private Double seve1; // PU

    public Double getSeve1() {
        return seve1;
    }

    public void setSeve1(Double _value_) {
        seve1 = _value_;
    }

    private static Object getSeve1(BaseClass _this_) {
        return ((ExcELIN2) _this_).getSeve1();
    }

    private static void setSeve1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setSeve1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setSeve1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, <i>Ve</i><i><sub>2</sub></i>, back of commutating reactance (<i>Se[Ve</i><i><sub>2</sub></i><i>]</i>) (&gt;= 0).  Typical value = 1.
     */
    private Double seve2; // PU

    public Double getSeve2() {
        return seve2;
    }

    public void setSeve2(Double _value_) {
        seve2 = _value_;
    }

    private static Object getSeve2(BaseClass _this_) {
        return ((ExcELIN2) _this_).getSeve2();
    }

    private static void setSeve2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setSeve2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setSeve2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage controller derivative washout time constant (<i>Tb1</i>) (&gt;= 0).  Typical value = 12,45.
     */
    private Double tb1; // Seconds

    public Double getTb1() {
        return tb1;
    }

    public void setTb1(Double _value_) {
        tb1 = _value_;
    }

    private static Object getTb1(BaseClass _this_) {
        return ((ExcELIN2) _this_).getTb1();
    }

    private static void setTb1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setTb1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setTb1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>Te</i>) (&gt;= 0).  Typical value = 0.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    private static Object getTe(BaseClass _this_) {
        return ((ExcELIN2) _this_).getTe();
    }

    private static void setTe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setTe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setTe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time Constant (<i>T</i><i><sub>e2</sub></i>) (&gt;= 0).  Typical value = 1.
     */
    private Double te2; // Seconds

    public Double getTe2() {
        return te2;
    }

    public void setTe2(Double _value_) {
        te2 = _value_;
    }

    private static Object getTe2(BaseClass _this_) {
        return ((ExcELIN2) _this_).getTe2();
    }

    private static void setTe2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setTe2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setTe2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Controller follow up deadband (<i>Ti1</i>).  Typical value = 0.
     */
    private Double ti1; // PU

    public Double getTi1() {
        return ti1;
    }

    public void setTi1(Double _value_) {
        ti1 = _value_;
    }

    private static Object getTi1(BaseClass _this_) {
        return ((ExcELIN2) _this_).getTi1();
    }

    private static void setTi1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setTi1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setTi1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T</i><i><sub>i3</sub></i>) (&gt;= 0).  Typical value = 3.
     */
    private Double ti3; // Seconds

    public Double getTi3() {
        return ti3;
    }

    public void setTi3(Double _value_) {
        ti3 = _value_;
    }

    private static Object getTi3(BaseClass _this_) {
        return ((ExcELIN2) _this_).getTi3();
    }

    private static void setTi3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setTi3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setTi3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T</i><i><sub>i4</sub></i>) (&gt;= 0).  Typical value = 0.
     */
    private Double ti4; // Seconds

    public Double getTi4() {
        return ti4;
    }

    public void setTi4(Double _value_) {
        ti4 = _value_;
    }

    private static Object getTi4(BaseClass _this_) {
        return ((ExcELIN2) _this_).getTi4();
    }

    private static void setTi4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setTi4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setTi4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T</i><i><sub>r4</sub></i>) (&gt;= 0).  Typical value = 1.
     */
    private Double tr4; // Seconds

    public Double getTr4() {
        return tr4;
    }

    public void setTr4(Double _value_) {
        tr4 = _value_;
    }

    private static Object getTr4(BaseClass _this_) {
        return ((ExcELIN2) _this_).getTr4();
    }

    private static void setTr4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setTr4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setTr4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Limiter (<i>Upmax</i>) (&gt; ExcELIN2.upmin).  Typical value = 3.
     */
    private Double upmax; // PU

    public Double getUpmax() {
        return upmax;
    }

    public void setUpmax(Double _value_) {
        upmax = _value_;
    }

    private static Object getUpmax(BaseClass _this_) {
        return ((ExcELIN2) _this_).getUpmax();
    }

    private static void setUpmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setUpmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setUpmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Limiter (<i>Upmin</i>) (&lt; ExcELIN2.upmax).  Typical value = 0.
     */
    private Double upmin; // PU

    public Double getUpmin() {
        return upmin;
    }

    public void setUpmin(Double _value_) {
        upmin = _value_;
    }

    private static Object getUpmin(BaseClass _this_) {
        return ((ExcELIN2) _this_).getUpmin();
    }

    private static void setUpmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setUpmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setUpmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (<i>Ve</i><i><sub>1</sub></i>) (&gt; 0).  Typical value = 3.
     */
    private Double ve1; // PU

    public Double getVe1() {
        return ve1;
    }

    public void setVe1(Double _value_) {
        ve1 = _value_;
    }

    private static Object getVe1(BaseClass _this_) {
        return ((ExcELIN2) _this_).getVe1();
    }

    private static void setVe1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setVe1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setVe1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (<i>Ve</i><i><sub>2</sub></i>) (&gt; 0).  Typical value = 0.
     */
    private Double ve2; // PU

    public Double getVe2() {
        return ve2;
    }

    public void setVe2(Double _value_) {
        ve2 = _value_;
    }

    private static Object getVe2(BaseClass _this_) {
        return ((ExcELIN2) _this_).getVe2();
    }

    private static void setVe2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setVe2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setVe2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Excitation transformer effective reactance (<i>Xp</i>).  Typical value = 1.
     */
    private Double xp; // PU

    public Double getXp() {
        return xp;
    }

    public void setXp(Double _value_) {
        xp = _value_;
    }

    private static Object getXp(BaseClass _this_) {
        return ((ExcELIN2) _this_).getXp();
    }

    private static void setXp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN2) _this_).setXp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN2) _this_).setXp(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcELIN2", attrName));
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
                "ExcELIN2", attrName, value));
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
            map.put("efdbas", new AttrDetails("ExcELIN2.efdbas", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getEfdbas, ExcELIN2::setEfdbas));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("iefmax", new AttrDetails("ExcELIN2.iefmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getIefmax, ExcELIN2::setIefmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("iefmax2", new AttrDetails("ExcELIN2.iefmax2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getIefmax2, ExcELIN2::setIefmax2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("iefmin", new AttrDetails("ExcELIN2.iefmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getIefmin, ExcELIN2::setIefmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k1", new AttrDetails("ExcELIN2.k1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getK1, ExcELIN2::setK1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k1ec", new AttrDetails("ExcELIN2.k1ec", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getK1ec, ExcELIN2::setK1ec));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k2", new AttrDetails("ExcELIN2.k2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getK2, ExcELIN2::setK2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k3", new AttrDetails("ExcELIN2.k3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getK3, ExcELIN2::setK3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k4", new AttrDetails("ExcELIN2.k4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getK4, ExcELIN2::setK4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd1", new AttrDetails("ExcELIN2.kd1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getKd1, ExcELIN2::setKd1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke2", new AttrDetails("ExcELIN2.ke2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getKe2, ExcELIN2::setKe2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ketb", new AttrDetails("ExcELIN2.ketb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getKetb, ExcELIN2::setKetb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pid1max", new AttrDetails("ExcELIN2.pid1max", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getPid1max, ExcELIN2::setPid1max));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve1", new AttrDetails("ExcELIN2.seve1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getSeve1, ExcELIN2::setSeve1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve2", new AttrDetails("ExcELIN2.seve2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getSeve2, ExcELIN2::setSeve2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb1", new AttrDetails("ExcELIN2.tb1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getTb1, ExcELIN2::setTb1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcELIN2.te", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getTe, ExcELIN2::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te2", new AttrDetails("ExcELIN2.te2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getTe2, ExcELIN2::setTe2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti1", new AttrDetails("ExcELIN2.ti1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getTi1, ExcELIN2::setTi1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti3", new AttrDetails("ExcELIN2.ti3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getTi3, ExcELIN2::setTi3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti4", new AttrDetails("ExcELIN2.ti4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getTi4, ExcELIN2::setTi4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tr4", new AttrDetails("ExcELIN2.tr4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getTr4, ExcELIN2::setTr4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("upmax", new AttrDetails("ExcELIN2.upmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getUpmax, ExcELIN2::setUpmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("upmin", new AttrDetails("ExcELIN2.upmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getUpmin, ExcELIN2::setUpmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve1", new AttrDetails("ExcELIN2.ve1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getVe1, ExcELIN2::setVe1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve2", new AttrDetails("ExcELIN2.ve2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getVe2, ExcELIN2::setVe2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xp", new AttrDetails("ExcELIN2.xp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcELIN2::getXp, ExcELIN2::setXp));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcELIN2(null).allAttrDetailsMap());
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
