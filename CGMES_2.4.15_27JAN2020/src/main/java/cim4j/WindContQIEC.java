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
 * Q control model.  Reference: IEC Standard 61400-27-1 Section 6.6.5.6.
 */
@SuppressWarnings("unused")
public class WindContQIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindContQIEC.class);

    /**
     * Constructor.
     */
    public WindContQIEC(String rdfid) {
        super("WindContQIEC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindContQIEC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Wind turbine type 3 or 4 model with which this reactive control mode is associated.
     *
     * NOT USED
     */
    private WindTurbineType3or4IEC WindTurbineType3or4IEC; // OneToOne

    private String WindTurbineType3or4IECId;

    public WindTurbineType3or4IEC getWindTurbineType3or4IEC() {
        return WindTurbineType3or4IEC;
    }

    public void setWindTurbineType3or4IEC(WindTurbineType3or4IEC _object_) {
        if (WindTurbineType3or4IEC != _object_) {
            WindTurbineType3or4IEC = _object_;
            _object_.setWIndContQIEC(this);
            WindTurbineType3or4IECId = _object_.getRdfid();
        }
    }

    private static Object getWindTurbineType3or4IEC(BaseClass _this_) {
        var obj = ((WindContQIEC) _this_).getWindTurbineType3or4IEC();
        var id = ((WindContQIEC) _this_).WindTurbineType3or4IECId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setWindTurbineType3or4IEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindContQIEC) _this_).WindTurbineType3or4IECId = (String) _value_;
        } else if (_value_ instanceof WindTurbineType3or4IEC) {
            ((WindContQIEC) _this_).setWindTurbineType3or4IEC((WindTurbineType3or4IEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindTurbineType3or4IEC");
        }
    }

    /**
     * Maximum reactive current injection during dip (i). It is type dependent parameter.
     */
    private Double iqh1; // PU

    public Double getIqh1() {
        return iqh1;
    }

    public void setIqh1(Double _value_) {
        iqh1 = _value_;
    }

    private static Object getIqh1(BaseClass _this_) {
        return ((WindContQIEC) _this_).getIqh1();
    }

    private static void setIqh1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setIqh1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setIqh1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum reactive current injection (i). It is type dependent parameter.
     */
    private Double iqmax; // PU

    public Double getIqmax() {
        return iqmax;
    }

    public void setIqmax(Double _value_) {
        iqmax = _value_;
    }

    private static Object getIqmax(BaseClass _this_) {
        return ((WindContQIEC) _this_).getIqmax();
    }

    private static void setIqmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setIqmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setIqmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum reactive current injection (i). It is type dependent parameter.
     */
    private Double iqmin; // PU

    public Double getIqmin() {
        return iqmin;
    }

    public void setIqmin(Double _value_) {
        iqmin = _value_;
    }

    private static Object getIqmin(BaseClass _this_) {
        return ((WindContQIEC) _this_).getIqmin();
    }

    private static void setIqmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setIqmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setIqmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Post fault reactive current injection (). It is project dependent parameter.
     */
    private Double iqpost; // PU

    public Double getIqpost() {
        return iqpost;
    }

    public void setIqpost(Double _value_) {
        iqpost = _value_;
    }

    private static Object getIqpost(BaseClass _this_) {
        return ((WindContQIEC) _this_).getIqpost();
    }

    private static void setIqpost(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setIqpost((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setIqpost(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive power PI controller integration gain (). It is type dependent parameter.
     */
    private Double kiq; // PU

    public Double getKiq() {
        return kiq;
    }

    public void setKiq(Double _value_) {
        kiq = _value_;
    }

    private static Object getKiq(BaseClass _this_) {
        return ((WindContQIEC) _this_).getKiq();
    }

    private static void setKiq(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setKiq((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setKiq(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage PI controller integration gain (). It is type dependent parameter.
     */
    private Double kiu; // PU

    public Double getKiu() {
        return kiu;
    }

    public void setKiu(Double _value_) {
        kiu = _value_;
    }

    private static Object getKiu(BaseClass _this_) {
        return ((WindContQIEC) _this_).getKiu();
    }

    private static void setKiu(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setKiu((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setKiu(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive power PI controller proportional gain (). It is type dependent parameter.
     */
    private Double kpq; // PU

    public Double getKpq() {
        return kpq;
    }

    public void setKpq(Double _value_) {
        kpq = _value_;
    }

    private static Object getKpq(BaseClass _this_) {
        return ((WindContQIEC) _this_).getKpq();
    }

    private static void setKpq(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setKpq((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setKpq(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage PI controller proportional gain (). It is type dependent parameter.
     */
    private Double kpu; // PU

    public Double getKpu() {
        return kpu;
    }

    public void setKpu(Double _value_) {
        kpu = _value_;
    }

    private static Object getKpu(BaseClass _this_) {
        return ((WindContQIEC) _this_).getKpu();
    }

    private static void setKpu(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setKpu((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setKpu(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage scaling factor for LVRT current (). It is project dependent parameter.
     */
    private Double kqv; // PU

    public Double getKqv() {
        return kqv;
    }

    public void setKqv(Double _value_) {
        kqv = _value_;
    }

    private static Object getKqv(BaseClass _this_) {
        return ((WindContQIEC) _this_).getKqv();
    }

    private static void setKqv(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setKqv((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setKqv(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum reactive power (q). It is type dependent parameter.
     */
    private Double qmax; // PU

    public Double getQmax() {
        return qmax;
    }

    public void setQmax(Double _value_) {
        qmax = _value_;
    }

    private static Object getQmax(BaseClass _this_) {
        return ((WindContQIEC) _this_).getQmax();
    }

    private static void setQmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setQmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setQmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum reactive power (q). It is type dependent parameter.
     */
    private Double qmin; // PU

    public Double getQmin() {
        return qmin;
    }

    public void setQmin(Double _value_) {
        qmin = _value_;
    }

    private static Object getQmin(BaseClass _this_) {
        return ((WindContQIEC) _this_).getQmin();
    }

    private static void setQmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setQmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setQmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Resistive component of voltage drop impedance (). It is project dependent parameter.
     */
    private Double rdroop; // PU

    public Double getRdroop() {
        return rdroop;
    }

    public void setRdroop(Double _value_) {
        rdroop = _value_;
    }

    private static Object getRdroop(BaseClass _this_) {
        return ((WindContQIEC) _this_).getRdroop();
    }

    private static void setRdroop(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setRdroop((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setRdroop(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant in reactive current lag (T). It is type dependent parameter.
     */
    private Double tiq; // Seconds

    public Double getTiq() {
        return tiq;
    }

    public void setTiq(Double _value_) {
        tiq = _value_;
    }

    private static Object getTiq(BaseClass _this_) {
        return ((WindContQIEC) _this_).getTiq();
    }

    private static void setTiq(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setTiq((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setTiq(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Power measurement filter time constant (). It is type dependent parameter.
     */
    private Double tpfilt; // Seconds

    public Double getTpfilt() {
        return tpfilt;
    }

    public void setTpfilt(Double _value_) {
        tpfilt = _value_;
    }

    private static Object getTpfilt(BaseClass _this_) {
        return ((WindContQIEC) _this_).getTpfilt();
    }

    private static void setTpfilt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setTpfilt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setTpfilt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Length of time period where post fault reactive power is injected (). It is project dependent parameter.
     */
    private Double tpost; // Seconds

    public Double getTpost() {
        return tpost;
    }

    public void setTpost(Double _value_) {
        tpost = _value_;
    }

    private static Object getTpost(BaseClass _this_) {
        return ((WindContQIEC) _this_).getTpost();
    }

    private static void setTpost(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setTpost((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setTpost(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant in reactive power order lag (). It is type dependent parameter.
     */
    private Double tqord; // Seconds

    public Double getTqord() {
        return tqord;
    }

    public void setTqord(Double _value_) {
        tqord = _value_;
    }

    private static Object getTqord(BaseClass _this_) {
        return ((WindContQIEC) _this_).getTqord();
    }

    private static void setTqord(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setTqord((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setTqord(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage measurement filter time constant (). It is type dependent parameter.
     */
    private Double tufilt; // Seconds

    public Double getTufilt() {
        return tufilt;
    }

    public void setTufilt(Double _value_) {
        tufilt = _value_;
    }

    private static Object getTufilt(BaseClass _this_) {
        return ((WindContQIEC) _this_).getTufilt();
    }

    private static void setTufilt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setTufilt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setTufilt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage dead band lower limit (). It is type dependent parameter.
     */
    private Double udb1; // PU

    public Double getUdb1() {
        return udb1;
    }

    public void setUdb1(Double _value_) {
        udb1 = _value_;
    }

    private static Object getUdb1(BaseClass _this_) {
        return ((WindContQIEC) _this_).getUdb1();
    }

    private static void setUdb1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setUdb1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setUdb1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage dead band upper limit (). It is type dependent parameter.
     */
    private Double udb2; // PU

    public Double getUdb2() {
        return udb2;
    }

    public void setUdb2(Double _value_) {
        udb2 = _value_;
    }

    private static Object getUdb2(BaseClass _this_) {
        return ((WindContQIEC) _this_).getUdb2();
    }

    private static void setUdb2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setUdb2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setUdb2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage in voltage PI controller integral term (u). It is type dependent parameter.
     */
    private Double umax; // PU

    public Double getUmax() {
        return umax;
    }

    public void setUmax(Double _value_) {
        umax = _value_;
    }

    private static Object getUmax(BaseClass _this_) {
        return ((WindContQIEC) _this_).getUmax();
    }

    private static void setUmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setUmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setUmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage in voltage PI controller integral term (u). It is type dependent parameter.
     */
    private Double umin; // PU

    public Double getUmin() {
        return umin;
    }

    public void setUmin(Double _value_) {
        umin = _value_;
    }

    private static Object getUmin(BaseClass _this_) {
        return ((WindContQIEC) _this_).getUmin();
    }

    private static void setUmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setUmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setUmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage threshold for LVRT detection in q control (). It is type dependent parameter.
     */
    private Double uqdip; // PU

    public Double getUqdip() {
        return uqdip;
    }

    public void setUqdip(Double _value_) {
        uqdip = _value_;
    }

    private static Object getUqdip(BaseClass _this_) {
        return ((WindContQIEC) _this_).getUqdip();
    }

    private static void setUqdip(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setUqdip((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setUqdip(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * User defined bias in voltage reference (), used when  =. It is case dependent parameter.
     */
    private Double uref0; // PU

    public Double getUref0() {
        return uref0;
    }

    public void setUref0(Double _value_) {
        uref0 = _value_;
    }

    private static Object getUref0(BaseClass _this_) {
        return ((WindContQIEC) _this_).getUref0();
    }

    private static void setUref0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setUref0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setUref0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Types of LVRT Q control modes (). It is project dependent parameter.
     */
    private String windLVRTQcontrolModesType; // WindLVRTQcontrolModesKind

    public String getWindLVRTQcontrolModesType() {
        return windLVRTQcontrolModesType;
    }

    public void setWindLVRTQcontrolModesType(String _value_) {
        windLVRTQcontrolModesType = _value_;
    }

    private static Object getWindLVRTQcontrolModesType(BaseClass _this_) {
        return ((WindContQIEC) _this_).getWindLVRTQcontrolModesType();
    }

    private static void setWindLVRTQcontrolModesType(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setWindLVRTQcontrolModesType((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Types of general wind turbine Q control modes ().  It is project dependent parameter.
     */
    private String windQcontrolModesType; // WindQcontrolModesKind

    public String getWindQcontrolModesType() {
        return windQcontrolModesType;
    }

    public void setWindQcontrolModesType(String _value_) {
        windQcontrolModesType = _value_;
    }

    private static Object getWindQcontrolModesType(BaseClass _this_) {
        return ((WindContQIEC) _this_).getWindQcontrolModesType();
    }

    private static void setWindQcontrolModesType(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setWindQcontrolModesType((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Inductive component of voltage drop impedance (). It is project dependent parameter.
     */
    private Double xdroop; // PU

    public Double getXdroop() {
        return xdroop;
    }

    public void setXdroop(Double _value_) {
        xdroop = _value_;
    }

    private static Object getXdroop(BaseClass _this_) {
        return ((WindContQIEC) _this_).getXdroop();
    }

    private static void setXdroop(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQIEC) _this_).setXdroop((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQIEC) _this_).setXdroop(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindContQIEC", attrName));
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
                "WindContQIEC", attrName, value));
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
            map.put("WindTurbineType3or4IEC", new AttrDetails("WindContQIEC.WindTurbineType3or4IEC", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindContQIEC::getWindTurbineType3or4IEC, WindContQIEC::setWindTurbineType3or4IEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("iqh1", new AttrDetails("WindContQIEC.iqh1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getIqh1, WindContQIEC::setIqh1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("iqmax", new AttrDetails("WindContQIEC.iqmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getIqmax, WindContQIEC::setIqmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("iqmin", new AttrDetails("WindContQIEC.iqmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getIqmin, WindContQIEC::setIqmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("iqpost", new AttrDetails("WindContQIEC.iqpost", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getIqpost, WindContQIEC::setIqpost));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiq", new AttrDetails("WindContQIEC.kiq", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getKiq, WindContQIEC::setKiq));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiu", new AttrDetails("WindContQIEC.kiu", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getKiu, WindContQIEC::setKiu));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpq", new AttrDetails("WindContQIEC.kpq", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getKpq, WindContQIEC::setKpq));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpu", new AttrDetails("WindContQIEC.kpu", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getKpu, WindContQIEC::setKpu));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kqv", new AttrDetails("WindContQIEC.kqv", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getKqv, WindContQIEC::setKqv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qmax", new AttrDetails("WindContQIEC.qmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getQmax, WindContQIEC::setQmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qmin", new AttrDetails("WindContQIEC.qmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getQmin, WindContQIEC::setQmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rdroop", new AttrDetails("WindContQIEC.rdroop", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getRdroop, WindContQIEC::setRdroop));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tiq", new AttrDetails("WindContQIEC.tiq", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getTiq, WindContQIEC::setTiq));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpfilt", new AttrDetails("WindContQIEC.tpfilt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getTpfilt, WindContQIEC::setTpfilt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpost", new AttrDetails("WindContQIEC.tpost", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getTpost, WindContQIEC::setTpost));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tqord", new AttrDetails("WindContQIEC.tqord", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getTqord, WindContQIEC::setTqord));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tufilt", new AttrDetails("WindContQIEC.tufilt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getTufilt, WindContQIEC::setTufilt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("udb1", new AttrDetails("WindContQIEC.udb1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getUdb1, WindContQIEC::setUdb1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("udb2", new AttrDetails("WindContQIEC.udb2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getUdb2, WindContQIEC::setUdb2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("umax", new AttrDetails("WindContQIEC.umax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getUmax, WindContQIEC::setUmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("umin", new AttrDetails("WindContQIEC.umin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getUmin, WindContQIEC::setUmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uqdip", new AttrDetails("WindContQIEC.uqdip", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getUqdip, WindContQIEC::setUqdip));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uref0", new AttrDetails("WindContQIEC.uref0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getUref0, WindContQIEC::setUref0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("windLVRTQcontrolModesType", new AttrDetails("WindContQIEC.windLVRTQcontrolModesType", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, WindContQIEC::getWindLVRTQcontrolModesType, WindContQIEC::setWindLVRTQcontrolModesType));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("windQcontrolModesType", new AttrDetails("WindContQIEC.windQcontrolModesType", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, WindContQIEC::getWindQcontrolModesType, WindContQIEC::setWindQcontrolModesType));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xdroop", new AttrDetails("WindContQIEC.xdroop", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContQIEC::getXdroop, WindContQIEC::setXdroop));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindContQIEC(null).allAttrDetailsMap());
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
