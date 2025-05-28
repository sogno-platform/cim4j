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
 * Modified IEEE AC8B alternator-supplied rectifier excitation system with speed input and input limiter.
 */
@SuppressWarnings("unused")
public class ExcAC8B extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcAC8B.class);

    /**
     * Constructor.
     */
    public ExcAC8B(String rdfid) {
        super("ExcAC8B", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcAC8B(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Input limiter indicator. true = input limiter Vimax and Vimin is considered false = input limiter Vimax and Vimin is not considered. Typical Value = true.
     */
    private Boolean inlim; // Boolean

    public Boolean getInlim() {
        return inlim;
    }

    public void setInlim(Boolean _value_) {
        inlim = _value_;
    }

    private static Object getInlim(BaseClass _this_) {
        return ((ExcAC8B) _this_).getInlim();
    }

    private static void setInlim(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ExcAC8B) _this_).setInlim((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setInlim(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Voltage regulator gain (Ka).  Typical Value = 1.
     */
    private Double ka; // PU

    public Double getKa() {
        return ka;
    }

    public void setKa(Double _value_) {
        ka = _value_;
    }

    private static Object getKa(BaseClass _this_) {
        return ((ExcAC8B) _this_).getKa();
    }

    private static void setKa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setKa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setKa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rectifier loading factor proportional to commutating reactance (Kc). Typical Value = 0.55.
     */
    private Double kc; // PU

    public Double getKc() {
        return kc;
    }

    public void setKc(Double _value_) {
        kc = _value_;
    }

    private static Object getKc(BaseClass _this_) {
        return ((ExcAC8B) _this_).getKc();
    }

    private static void setKc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setKc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setKc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Demagnetizing factor, a function of exciter alternator reactances (Kd).  Typical Value = 1.1.
     */
    private Double kd; // PU

    public Double getKd() {
        return kd;
    }

    public void setKd(Double _value_) {
        kd = _value_;
    }

    private static Object getKd(BaseClass _this_) {
        return ((ExcAC8B) _this_).getKd();
    }

    private static void setKd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setKd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setKd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator derivative gain (Kdr).  Typical Value = 10.
     */
    private Double kdr; // PU

    public Double getKdr() {
        return kdr;
    }

    public void setKdr(Double _value_) {
        kdr = _value_;
    }

    private static Object getKdr(BaseClass _this_) {
        return ((ExcAC8B) _this_).getKdr();
    }

    private static void setKdr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setKdr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setKdr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter constant related to self-excited field (Ke).  Typical Value = 1.
     */
    private Double ke; // PU

    public Double getKe() {
        return ke;
    }

    public void setKe(Double _value_) {
        ke = _value_;
    }

    private static Object getKe(BaseClass _this_) {
        return ((ExcAC8B) _this_).getKe();
    }

    private static void setKe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setKe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setKe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator integral gain (Kir).  Typical Value = 5.
     */
    private Double kir; // PU

    public Double getKir() {
        return kir;
    }

    public void setKir(Double _value_) {
        kir = _value_;
    }

    private static Object getKir(BaseClass _this_) {
        return ((ExcAC8B) _this_).getKir();
    }

    private static void setKir(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setKir((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setKir(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator proportional gain (Kpr).  Typical Value = 80.
     */
    private Double kpr; // PU

    public Double getKpr() {
        return kpr;
    }

    public void setKpr(Double _value_) {
        kpr = _value_;
    }

    private static Object getKpr(BaseClass _this_) {
        return ((ExcAC8B) _this_).getKpr();
    }

    private static void setKpr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setKpr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setKpr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Coefficient to allow different usage of the model-speed coefficient (Ks).  Typical Value = 0.
     */
    private Double ks; // PU

    public Double getKs() {
        return ks;
    }

    public void setKs(Double _value_) {
        ks = _value_;
    }

    private static Object getKs(BaseClass _this_) {
        return ((ExcAC8B) _this_).getKs();
    }

    private static void setKs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setKs((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setKs(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * PID limiter indicator. true = input limiter Vpidmax and Vpidmin is considered false = input limiter Vpidmax and Vpidmin is not considered. Typical Value = true.
     */
    private Boolean pidlim; // Boolean

    public Boolean getPidlim() {
        return pidlim;
    }

    public void setPidlim(Boolean _value_) {
        pidlim = _value_;
    }

    private static Object getPidlim(BaseClass _this_) {
        return ((ExcAC8B) _this_).getPidlim();
    }

    private static void setPidlim(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ExcAC8B) _this_).setPidlim((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setPidlim(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, Ve, back of commutating reactance (Se[Ve1]).  Typical Value = 0.3.
     */
    private Double seve1; // Simple_Float

    public Double getSeve1() {
        return seve1;
    }

    public void setSeve1(Double _value_) {
        seve1 = _value_;
    }

    private static Object getSeve1(BaseClass _this_) {
        return ((ExcAC8B) _this_).getSeve1();
    }

    private static void setSeve1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setSeve1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setSeve1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, Ve, back of commutating reactance (Se[Ve2]).  Typical Value = 3.
     */
    private Double seve2; // Simple_Float

    public Double getSeve2() {
        return seve2;
    }

    public void setSeve2(Double _value_) {
        seve2 = _value_;
    }

    private static Object getSeve2(BaseClass _this_) {
        return ((ExcAC8B) _this_).getSeve2();
    }

    private static void setSeve2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setSeve2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setSeve2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (Ta).  Typical Value = 0.
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((ExcAC8B) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setTa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lag time constant (Tdr).  Typical Value = 0.1.
     */
    private Double tdr; // Seconds

    public Double getTdr() {
        return tdr;
    }

    public void setTdr(Double _value_) {
        tdr = _value_;
    }

    private static Object getTdr(BaseClass _this_) {
        return ((ExcAC8B) _this_).getTdr();
    }

    private static void setTdr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setTdr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setTdr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter time constant, integration rate associated with exciter control (Te).  Typical Value = 1.2.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    private static Object getTe(BaseClass _this_) {
        return ((ExcAC8B) _this_).getTe();
    }

    private static void setTe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setTe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setTe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Selector for the limiter on the block [1/sTe].  See diagram for meaning of true and false. Typical Value = false.
     */
    private Boolean telim; // Boolean

    public Boolean getTelim() {
        return telim;
    }

    public void setTelim(Boolean _value_) {
        telim = _value_;
    }

    private static Object getTelim(BaseClass _this_) {
        return ((ExcAC8B) _this_).getTelim();
    }

    private static void setTelim(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ExcAC8B) _this_).setTelim((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setTelim(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (Ve) equals V (Ve1).  Typical Value = 6.5.
     */
    private Double ve1; // PU

    public Double getVe1() {
        return ve1;
    }

    public void setVe1(Double _value_) {
        ve1 = _value_;
    }

    private static Object getVe1(BaseClass _this_) {
        return ((ExcAC8B) _this_).getVe1();
    }

    private static void setVe1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setVe1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setVe1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (Ve).  Typical Value = 9.
     */
    private Double ve2; // PU

    public Double getVe2() {
        return ve2;
    }

    public void setVe2(Double _value_) {
        ve2 = _value_;
    }

    private static Object getVe2(BaseClass _this_) {
        return ((ExcAC8B) _this_).getVe2();
    }

    private static void setVe2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setVe2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setVe2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum exciter voltage output (Vemin).  Typical Value = 0.
     */
    private Double vemin; // PU

    public Double getVemin() {
        return vemin;
    }

    public void setVemin(Double _value_) {
        vemin = _value_;
    }

    private static Object getVemin(BaseClass _this_) {
        return ((ExcAC8B) _this_).getVemin();
    }

    private static void setVemin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setVemin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setVemin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter field current limit reference (Vfemax).  Typical Value = 6.
     */
    private Double vfemax; // PU

    public Double getVfemax() {
        return vfemax;
    }

    public void setVfemax(Double _value_) {
        vfemax = _value_;
    }

    private static Object getVfemax(BaseClass _this_) {
        return ((ExcAC8B) _this_).getVfemax();
    }

    private static void setVfemax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setVfemax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setVfemax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Input signal maximum (Vimax).  Typical Value = 35.
     */
    private Double vimax; // PU

    public Double getVimax() {
        return vimax;
    }

    public void setVimax(Double _value_) {
        vimax = _value_;
    }

    private static Object getVimax(BaseClass _this_) {
        return ((ExcAC8B) _this_).getVimax();
    }

    private static void setVimax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setVimax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setVimax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Input signal minimum (Vimin).  Typical Value = -10.
     */
    private Double vimin; // PU

    public Double getVimin() {
        return vimin;
    }

    public void setVimin(Double _value_) {
        vimin = _value_;
    }

    private static Object getVimin(BaseClass _this_) {
        return ((ExcAC8B) _this_).getVimin();
    }

    private static void setVimin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setVimin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setVimin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * PID maximum controller output (Vpidmax).  Typical Value = 35.
     */
    private Double vpidmax; // PU

    public Double getVpidmax() {
        return vpidmax;
    }

    public void setVpidmax(Double _value_) {
        vpidmax = _value_;
    }

    private static Object getVpidmax(BaseClass _this_) {
        return ((ExcAC8B) _this_).getVpidmax();
    }

    private static void setVpidmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setVpidmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setVpidmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * PID minimum controller output (Vpidmin).  Typical Value = -10.
     */
    private Double vpidmin; // PU

    public Double getVpidmin() {
        return vpidmin;
    }

    public void setVpidmin(Double _value_) {
        vpidmin = _value_;
    }

    private static Object getVpidmin(BaseClass _this_) {
        return ((ExcAC8B) _this_).getVpidmin();
    }

    private static void setVpidmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setVpidmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setVpidmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage regulator output (Vrmax). Typical Value = 35.
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    private static Object getVrmax(BaseClass _this_) {
        return ((ExcAC8B) _this_).getVrmax();
    }

    private static void setVrmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setVrmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setVrmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator output (Vrmin).  Typical Value = 0.
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    private static Object getVrmin(BaseClass _this_) {
        return ((ExcAC8B) _this_).getVrmin();
    }

    private static void setVrmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcAC8B) _this_).setVrmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setVrmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Multiply by generator`s terminal voltage indicator. true =the limits Vrmax and Vrmin are multiplied by the generator`s terminal voltage to represent a thyristor power stage fed from the generator terminals false = limits are not multiplied by generator`s terminal voltage.  Typical Value = false.
     */
    private Boolean vtmult; // Boolean

    public Boolean getVtmult() {
        return vtmult;
    }

    public void setVtmult(Boolean _value_) {
        vtmult = _value_;
    }

    private static Object getVtmult(BaseClass _this_) {
        return ((ExcAC8B) _this_).getVtmult();
    }

    private static void setVtmult(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ExcAC8B) _this_).setVtmult((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ExcAC8B) _this_).setVtmult(getBooleanFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcAC8B", attrName));
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
                "ExcAC8B", attrName, value));
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
            map.put("inlim", new AttrDetails("ExcAC8B.inlim", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getInlim, ExcAC8B::setInlim));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("ExcAC8B.ka", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getKa, ExcAC8B::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("ExcAC8B.kc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getKc, ExcAC8B::setKc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("ExcAC8B.kd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getKd, ExcAC8B::setKd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kdr", new AttrDetails("ExcAC8B.kdr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getKdr, ExcAC8B::setKdr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcAC8B.ke", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getKe, ExcAC8B::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kir", new AttrDetails("ExcAC8B.kir", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getKir, ExcAC8B::setKir));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpr", new AttrDetails("ExcAC8B.kpr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getKpr, ExcAC8B::setKpr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks", new AttrDetails("ExcAC8B.ks", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getKs, ExcAC8B::setKs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pidlim", new AttrDetails("ExcAC8B.pidlim", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getPidlim, ExcAC8B::setPidlim));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve1", new AttrDetails("ExcAC8B.seve1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getSeve1, ExcAC8B::setSeve1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve2", new AttrDetails("ExcAC8B.seve2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getSeve2, ExcAC8B::setSeve2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("ExcAC8B.ta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getTa, ExcAC8B::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tdr", new AttrDetails("ExcAC8B.tdr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getTdr, ExcAC8B::setTdr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcAC8B.te", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getTe, ExcAC8B::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("telim", new AttrDetails("ExcAC8B.telim", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getTelim, ExcAC8B::setTelim));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve1", new AttrDetails("ExcAC8B.ve1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getVe1, ExcAC8B::setVe1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve2", new AttrDetails("ExcAC8B.ve2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getVe2, ExcAC8B::setVe2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vemin", new AttrDetails("ExcAC8B.vemin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getVemin, ExcAC8B::setVemin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vfemax", new AttrDetails("ExcAC8B.vfemax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getVfemax, ExcAC8B::setVfemax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimax", new AttrDetails("ExcAC8B.vimax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getVimax, ExcAC8B::setVimax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimin", new AttrDetails("ExcAC8B.vimin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getVimin, ExcAC8B::setVimin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vpidmax", new AttrDetails("ExcAC8B.vpidmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getVpidmax, ExcAC8B::setVpidmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vpidmin", new AttrDetails("ExcAC8B.vpidmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getVpidmin, ExcAC8B::setVpidmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcAC8B.vrmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getVrmax, ExcAC8B::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcAC8B.vrmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getVrmin, ExcAC8B::setVrmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vtmult", new AttrDetails("ExcAC8B.vtmult", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::getVtmult, ExcAC8B::setVtmult));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcAC8B(null).allAttrDetailsMap());
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
