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
 * The class represents IEEE Std 421.5-2005 type PSS2B power system stabilizer model. This stabilizer model is designed to represent a variety of dual-input stabilizers, which normally use combinations of power and speed or frequency to derive the stabilizing signal.  Reference: IEEE 2B 421.5-2005 Section 8.2.
 */
@SuppressWarnings("unused")
public class PssIEEE2B extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssIEEE2B.class);

    /**
     * Constructor.
     */
    public PssIEEE2B(String rdfid) {
        super("PssIEEE2B", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected PssIEEE2B(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Type of input signal #1.  Typical Value = rotorSpeed.
     */
    private String inputSignal1Type; // InputSignalKind

    public String getInputSignal1Type() {
        return inputSignal1Type;
    }

    public void setInputSignal1Type(String _value_) {
        inputSignal1Type = _value_;
    }

    private static Object getInputSignal1Type(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getInputSignal1Type();
    }

    private static void setInputSignal1Type(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setInputSignal1Type((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Type of input signal #2.  Typical Value = generatorElectricalPower.
     */
    private String inputSignal2Type; // InputSignalKind

    public String getInputSignal2Type() {
        return inputSignal2Type;
    }

    public void setInputSignal2Type(String _value_) {
        inputSignal2Type = _value_;
    }

    private static Object getInputSignal2Type(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getInputSignal2Type();
    }

    private static void setInputSignal2Type(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setInputSignal2Type((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Stabilizer gain (Ks1).  Typical Value = 12.
     */
    private Double ks1; // PU

    public Double getKs1() {
        return ks1;
    }

    public void setKs1(Double _value_) {
        ks1 = _value_;
    }

    private static Object getKs1(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getKs1();
    }

    private static void setKs1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setKs1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setKs1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain on signal #2 (Ks2).  Typical Value = 0.2.
     */
    private Double ks2; // PU

    public Double getKs2() {
        return ks2;
    }

    public void setKs2(Double _value_) {
        ks2 = _value_;
    }

    private static Object getKs2(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getKs2();
    }

    private static void setKs2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setKs2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setKs2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain on signal #2 input before ramp-tracking filter (Ks3).  Typical Value = 1.
     */
    private Double ks3; // PU

    public Double getKs3() {
        return ks3;
    }

    public void setKs3(Double _value_) {
        ks3 = _value_;
    }

    private static Object getKs3(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getKs3();
    }

    private static void setKs3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setKs3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setKs3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Denominator order of ramp tracking filter (M).  Typical Value = 5.
     */
    private Integer m; // Integer

    public Integer getM() {
        return m;
    }

    public void setM(Integer _value_) {
        m = _value_;
    }

    private static Object getM(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getM();
    }

    private static void setM(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((PssIEEE2B) _this_).setM((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setM(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
        }
    }

    /**
     * Order of ramp tracking filter (N).  Typical Value = 1.
     */
    private Integer n; // Integer

    public Integer getN() {
        return n;
    }

    public void setN(Integer _value_) {
        n = _value_;
    }

    private static Object getN(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getN();
    }

    private static void setN(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((PssIEEE2B) _this_).setN((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setN(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
        }
    }

    /**
     * Lead/lag time constant (T1).  Typical Value = 0.12.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (T10).  Typical Value = 0.
     */
    private Double t10; // Seconds

    public Double getT10() {
        return t10;
    }

    public void setT10(Double _value_) {
        t10 = _value_;
    }

    private static Object getT10(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getT10();
    }

    private static void setT10(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setT10((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setT10(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (T11).  Typical Value = 0.
     */
    private Double t11; // Seconds

    public Double getT11() {
        return t11;
    }

    public void setT11(Double _value_) {
        t11 = _value_;
    }

    private static Object getT11(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getT11();
    }

    private static void setT11(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setT11((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setT11(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (T2).  Typical Value = 0.02.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    private static Object getT2(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getT2();
    }

    private static void setT2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setT2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setT2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (T3).  Typical Value = 0.3.
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    private static Object getT3(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getT3();
    }

    private static void setT3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setT3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setT3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (T4).  Typical Value = 0.02.
     */
    private Double t4; // Seconds

    public Double getT4() {
        return t4;
    }

    public void setT4(Double _value_) {
        t4 = _value_;
    }

    private static Object getT4(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getT4();
    }

    private static void setT4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setT4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setT4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant on signal #1 (T6).  Typical Value = 0.
     */
    private Double t6; // Seconds

    public Double getT6() {
        return t6;
    }

    public void setT6(Double _value_) {
        t6 = _value_;
    }

    private static Object getT6(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getT6();
    }

    private static void setT6(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setT6((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setT6(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant on signal #2 (T7).  Typical Value = 2.
     */
    private Double t7; // Seconds

    public Double getT7() {
        return t7;
    }

    public void setT7(Double _value_) {
        t7 = _value_;
    }

    private static Object getT7(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getT7();
    }

    private static void setT7(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setT7((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setT7(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead of ramp tracking filter (T8).  Typical Value = 0.2.
     */
    private Double t8; // Seconds

    public Double getT8() {
        return t8;
    }

    public void setT8(Double _value_) {
        t8 = _value_;
    }

    private static Object getT8(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getT8();
    }

    private static void setT8(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setT8((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setT8(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lag of ramp tracking filter (T9).  Typical Value = 0.1.
     */
    private Double t9; // Seconds

    public Double getT9() {
        return t9;
    }

    public void setT9(Double _value_) {
        t9 = _value_;
    }

    private static Object getT9(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getT9();
    }

    private static void setT9(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setT9((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setT9(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * First washout on signal #1 (Tw1).  Typical Value = 2.
     */
    private Double tw1; // Seconds

    public Double getTw1() {
        return tw1;
    }

    public void setTw1(Double _value_) {
        tw1 = _value_;
    }

    private static Object getTw1(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getTw1();
    }

    private static void setTw1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setTw1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setTw1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Second washout on signal #1 (Tw2).  Typical Value = 2.
     */
    private Double tw2; // Seconds

    public Double getTw2() {
        return tw2;
    }

    public void setTw2(Double _value_) {
        tw2 = _value_;
    }

    private static Object getTw2(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getTw2();
    }

    private static void setTw2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setTw2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setTw2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * First washout on signal #2 (Tw3).  Typical Value = 2.
     */
    private Double tw3; // Seconds

    public Double getTw3() {
        return tw3;
    }

    public void setTw3(Double _value_) {
        tw3 = _value_;
    }

    private static Object getTw3(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getTw3();
    }

    private static void setTw3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setTw3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setTw3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Second washout on signal #2 (Tw4).  Typical Value = 0.
     */
    private Double tw4; // Seconds

    public Double getTw4() {
        return tw4;
    }

    public void setTw4(Double _value_) {
        tw4 = _value_;
    }

    private static Object getTw4(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getTw4();
    }

    private static void setTw4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setTw4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setTw4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Input signal #1 max limit (Vsi1max).  Typical Value = 2.
     */
    private Double vsi1max; // PU

    public Double getVsi1max() {
        return vsi1max;
    }

    public void setVsi1max(Double _value_) {
        vsi1max = _value_;
    }

    private static Object getVsi1max(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getVsi1max();
    }

    private static void setVsi1max(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setVsi1max((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setVsi1max(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Input signal #1 min limit (Vsi1min).  Typical Value = -2.
     */
    private Double vsi1min; // PU

    public Double getVsi1min() {
        return vsi1min;
    }

    public void setVsi1min(Double _value_) {
        vsi1min = _value_;
    }

    private static Object getVsi1min(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getVsi1min();
    }

    private static void setVsi1min(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setVsi1min((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setVsi1min(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Input signal #2 max limit (Vsi2max).  Typical Value = 2.
     */
    private Double vsi2max; // PU

    public Double getVsi2max() {
        return vsi2max;
    }

    public void setVsi2max(Double _value_) {
        vsi2max = _value_;
    }

    private static Object getVsi2max(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getVsi2max();
    }

    private static void setVsi2max(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setVsi2max((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setVsi2max(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Input signal #2 min limit (Vsi2min).  Typical Value = -2.
     */
    private Double vsi2min; // PU

    public Double getVsi2min() {
        return vsi2min;
    }

    public void setVsi2min(Double _value_) {
        vsi2min = _value_;
    }

    private static Object getVsi2min(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getVsi2min();
    }

    private static void setVsi2min(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setVsi2min((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setVsi2min(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Stabilizer output max limit (Vstmax).  Typical Value = 0.1.
     */
    private Double vstmax; // PU

    public Double getVstmax() {
        return vstmax;
    }

    public void setVstmax(Double _value_) {
        vstmax = _value_;
    }

    private static Object getVstmax(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getVstmax();
    }

    private static void setVstmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setVstmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setVstmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Stabilizer output min limit (Vstmin).  Typical Value = -0.1.
     */
    private Double vstmin; // PU

    public Double getVstmin() {
        return vstmin;
    }

    public void setVstmin(Double _value_) {
        vstmin = _value_;
    }

    private static Object getVstmin(BaseClass _this_) {
        return ((PssIEEE2B) _this_).getVstmin();
    }

    private static void setVstmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssIEEE2B) _this_).setVstmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssIEEE2B) _this_).setVstmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PssIEEE2B", attrName));
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
                "PssIEEE2B", attrName, value));
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
            map.put("inputSignal1Type", new AttrDetails("PssIEEE2B.inputSignal1Type", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, PssIEEE2B::getInputSignal1Type, PssIEEE2B::setInputSignal1Type));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("inputSignal2Type", new AttrDetails("PssIEEE2B.inputSignal2Type", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, PssIEEE2B::getInputSignal2Type, PssIEEE2B::setInputSignal2Type));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks1", new AttrDetails("PssIEEE2B.ks1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getKs1, PssIEEE2B::setKs1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks2", new AttrDetails("PssIEEE2B.ks2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getKs2, PssIEEE2B::setKs2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks3", new AttrDetails("PssIEEE2B.ks3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getKs3, PssIEEE2B::setKs3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("m", new AttrDetails("PssIEEE2B.m", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getM, PssIEEE2B::setM));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("n", new AttrDetails("PssIEEE2B.n", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getN, PssIEEE2B::setN));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("PssIEEE2B.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getT1, PssIEEE2B::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t10", new AttrDetails("PssIEEE2B.t10", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getT10, PssIEEE2B::setT10));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t11", new AttrDetails("PssIEEE2B.t11", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getT11, PssIEEE2B::setT11));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("PssIEEE2B.t2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getT2, PssIEEE2B::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("PssIEEE2B.t3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getT3, PssIEEE2B::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("PssIEEE2B.t4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getT4, PssIEEE2B::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t6", new AttrDetails("PssIEEE2B.t6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getT6, PssIEEE2B::setT6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t7", new AttrDetails("PssIEEE2B.t7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getT7, PssIEEE2B::setT7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t8", new AttrDetails("PssIEEE2B.t8", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getT8, PssIEEE2B::setT8));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t9", new AttrDetails("PssIEEE2B.t9", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getT9, PssIEEE2B::setT9));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw1", new AttrDetails("PssIEEE2B.tw1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getTw1, PssIEEE2B::setTw1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw2", new AttrDetails("PssIEEE2B.tw2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getTw2, PssIEEE2B::setTw2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw3", new AttrDetails("PssIEEE2B.tw3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getTw3, PssIEEE2B::setTw3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw4", new AttrDetails("PssIEEE2B.tw4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getTw4, PssIEEE2B::setTw4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsi1max", new AttrDetails("PssIEEE2B.vsi1max", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getVsi1max, PssIEEE2B::setVsi1max));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsi1min", new AttrDetails("PssIEEE2B.vsi1min", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getVsi1min, PssIEEE2B::setVsi1min));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsi2max", new AttrDetails("PssIEEE2B.vsi2max", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getVsi2max, PssIEEE2B::setVsi2max));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsi2min", new AttrDetails("PssIEEE2B.vsi2min", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getVsi2min, PssIEEE2B::setVsi2min));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vstmax", new AttrDetails("PssIEEE2B.vstmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getVstmax, PssIEEE2B::setVstmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vstmin", new AttrDetails("PssIEEE2B.vstmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssIEEE2B::getVstmin, PssIEEE2B::setVstmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PssIEEE2B(null).allAttrDetailsMap());
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
