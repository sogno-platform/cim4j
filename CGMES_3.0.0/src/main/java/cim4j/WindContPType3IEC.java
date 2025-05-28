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
 * P control model type 3. Reference: IEC 61400-27-1:2015, 5.6.5.4.
 */
@SuppressWarnings("unused")
public class WindContPType3IEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindContPType3IEC.class);

    /**
     * Constructor.
     */
    public WindContPType3IEC(String rdfid) {
        super("WindContPType3IEC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindContPType3IEC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The wind dynamics lookup table associated with this P control type 3 model.
     *
     * NOT USED
     */
    private Set<WindDynamicsLookupTable> WindDynamicsLookupTable = new HashSet<>(); // OneToMany

    public Set<WindDynamicsLookupTable> getWindDynamicsLookupTable() {
        return WindDynamicsLookupTable;
    }

    public void setWindDynamicsLookupTable(WindDynamicsLookupTable _object_) {
        if (!WindDynamicsLookupTable.contains(_object_)) {
            WindDynamicsLookupTable.add(_object_);
            _object_.setWindContPType3IEC(this);
        }
    }

    private static Object getWindDynamicsLookupTable(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getWindDynamicsLookupTable();
    }

    private static void setWindDynamicsLookupTable(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindDynamicsLookupTable) {
            ((WindContPType3IEC) _this_).setWindDynamicsLookupTable((WindDynamicsLookupTable) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindDynamicsLookupTable");
        }
    }

    /**
     * Wind turbine type 3 model with which this wind control P type 3 model is associated.
     *
     * NOT USED
     */
    private WindTurbineType3IEC WindTurbineType3IEC; // OneToOne

    public WindTurbineType3IEC getWindTurbineType3IEC() {
        return WindTurbineType3IEC;
    }

    public void setWindTurbineType3IEC(WindTurbineType3IEC _object_) {
        if (WindTurbineType3IEC != _object_) {
            WindTurbineType3IEC = _object_;
            WindTurbineType3IEC.setWindContPType3IEC(this);
        }
    }

    private static Object getWindTurbineType3IEC(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getWindTurbineType3IEC();
    }

    private static void setWindTurbineType3IEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindTurbineType3IEC) {
            ((WindContPType3IEC) _this_).setWindTurbineType3IEC((WindTurbineType3IEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindTurbineType3IEC");
        }
    }

    /**
     * Maximum wind turbine power ramp rate (<i>dp</i><i><sub>max</sub></i>). It is a type-dependent parameter.
     */
    private Double dpmax; // PU

    public Double getDpmax() {
        return dpmax;
    }

    public void setDpmax(Double _value_) {
        dpmax = _value_;
    }

    private static Object getDpmax(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getDpmax();
    }

    private static void setDpmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setDpmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setDpmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum ramp rate of wind turbine reference power (<i>dp</i><i><sub>refmax</sub></i>). It is a project-dependent parameter.
     */
    private Double dprefmax; // PU

    public Double getDprefmax() {
        return dprefmax;
    }

    public void setDprefmax(Double _value_) {
        dprefmax = _value_;
    }

    private static Object getDprefmax(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getDprefmax();
    }

    private static void setDprefmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setDprefmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setDprefmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum ramp rate of wind turbine reference power (<i>dp</i><i><sub>refmin</sub></i>). It is a project-dependent parameter.
     */
    private Double dprefmin; // PU

    public Double getDprefmin() {
        return dprefmin;
    }

    public void setDprefmin(Double _value_) {
        dprefmin = _value_;
    }

    private static Object getDprefmin(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getDprefmin();
    }

    private static void setDprefmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setDprefmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setDprefmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Ramp limitation of torque, required in some grid codes (<i>dt</i><i><sub>max</sub></i>). It is a project-dependent parameter.
     */
    private Double dthetamax; // PU

    public Double getDthetamax() {
        return dthetamax;
    }

    public void setDthetamax(Double _value_) {
        dthetamax = _value_;
    }

    private static Object getDthetamax(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getDthetamax();
    }

    private static void setDthetamax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setDthetamax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setDthetamax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Limitation of torque rise rate during UVRT (<i>dtheta</i><i><sub>maxUVRT</sub></i>). It is a project-dependent parameter.
     */
    private Double dthetamaxuvrt; // PU

    public Double getDthetamaxuvrt() {
        return dthetamaxuvrt;
    }

    public void setDthetamaxuvrt(Double _value_) {
        dthetamaxuvrt = _value_;
    }

    private static Object getDthetamaxuvrt(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getDthetamaxuvrt();
    }

    private static void setDthetamaxuvrt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setDthetamaxuvrt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setDthetamaxuvrt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain for active drive train damping (<i>K</i><i><sub>DTD</sub></i>). It is a type-dependent parameter.
     */
    private Double kdtd; // PU

    public Double getKdtd() {
        return kdtd;
    }

    public void setKdtd(Double _value_) {
        kdtd = _value_;
    }

    private static Object getKdtd(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getKdtd();
    }

    private static void setKdtd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setKdtd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setKdtd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * PI controller integration parameter (<i>K</i><sub>Ip</sub>). It is a type-dependent parameter.
     */
    private Double kip; // PU

    public Double getKip() {
        return kip;
    }

    public void setKip(Double _value_) {
        kip = _value_;
    }

    private static Object getKip(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getKip();
    }

    private static void setKip(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setKip((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setKip(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * PI controller proportional gain (<i>K</i><sub>Pp</sub>). It is a type-dependent parameter.
     */
    private Double kpp; // PU

    public Double getKpp() {
        return kpp;
    }

    public void setKpp(Double _value_) {
        kpp = _value_;
    }

    private static Object getKpp(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getKpp();
    }

    private static void setKpp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setKpp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setKpp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Enable UVRT power control mode (<i>M</i><i><sub>pUVRT</sub></i><sub>)</sub>.  It is a project-dependent parameter. true = voltage control (1 in the IEC model) false = reactive power control (0 in the IEC model).
     */
    private Boolean mpuvrt; // Boolean

    public Boolean getMpuvrt() {
        return mpuvrt;
    }

    public void setMpuvrt(Boolean _value_) {
        mpuvrt = _value_;
    }

    private static Object getMpuvrt(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getMpuvrt();
    }

    private static void setMpuvrt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((WindContPType3IEC) _this_).setMpuvrt((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setMpuvrt(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Active drive train damping frequency (<i>omega</i><i><sub>DTD</sub></i>). It can be calculated from two mass model parameters. It is a type-dependent parameter.
     */
    private Double omegadtd; // PU

    public Double getOmegadtd() {
        return omegadtd;
    }

    public void setOmegadtd(Double _value_) {
        omegadtd = _value_;
    }

    private static Object getOmegadtd(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getOmegadtd();
    }

    private static void setOmegadtd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setOmegadtd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setOmegadtd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Offset to reference value that limits controller action during rotor speed changes (<i>omega</i><i><sub>offset</sub></i>). It is a case-dependent parameter.
     */
    private Double omegaoffset; // PU

    public Double getOmegaoffset() {
        return omegaoffset;
    }

    public void setOmegaoffset(Double _value_) {
        omegaoffset = _value_;
    }

    private static Object getOmegaoffset(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getOmegaoffset();
    }

    private static void setOmegaoffset(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setOmegaoffset((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setOmegaoffset(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum active drive train damping power (<i>p</i><sub>DTDmax</sub>). It is a type-dependent parameter.
     */
    private Double pdtdmax; // PU

    public Double getPdtdmax() {
        return pdtdmax;
    }

    public void setPdtdmax(Double _value_) {
        pdtdmax = _value_;
    }

    private static Object getPdtdmax(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getPdtdmax();
    }

    private static void setPdtdmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setPdtdmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setPdtdmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time<sub> </sub>delay after deep voltage sags (<i>T</i><i><sub>DVS</sub></i>) (&gt;= 0). It is a project-dependent parameter.
     */
    private Double tdvs; // Seconds

    public Double getTdvs() {
        return tdvs;
    }

    public void setTdvs(Double _value_) {
        tdvs = _value_;
    }

    private static Object getTdvs(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getTdvs();
    }

    private static void setTdvs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setTdvs((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setTdvs(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum electrical generator torque (<i>t</i><sub>emin</sub>). It is a type-dependent parameter.
     */
    private Double thetaemin; // PU

    public Double getThetaemin() {
        return thetaemin;
    }

    public void setThetaemin(Double _value_) {
        thetaemin = _value_;
    }

    private static Object getThetaemin(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getThetaemin();
    }

    private static void setThetaemin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setThetaemin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setThetaemin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage scaling factor of reset-torque (<i>t</i><sub>uscale</sub>). It is a project-dependent parameter.
     */
    private Double thetauscale; // PU

    public Double getThetauscale() {
        return thetauscale;
    }

    public void setThetauscale(Double _value_) {
        thetauscale = _value_;
    }

    private static Object getThetauscale(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getThetauscale();
    }

    private static void setThetauscale(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setThetauscale((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setThetauscale(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter time constant for generator speed measurement (<i>T</i><sub>omegafiltp3</sub>) (&gt;= 0). It is a type-dependent parameter.
     */
    private Double tomegafiltp3; // Seconds

    public Double getTomegafiltp3() {
        return tomegafiltp3;
    }

    public void setTomegafiltp3(Double _value_) {
        tomegafiltp3 = _value_;
    }

    private static Object getTomegafiltp3(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getTomegafiltp3();
    }

    private static void setTomegafiltp3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setTomegafiltp3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setTomegafiltp3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant in speed reference filter (<i>T</i><sub>omega,ref</sub>) (&gt;= 0). It is a type-dependent parameter.
     */
    private Double tomegaref; // Seconds

    public Double getTomegaref() {
        return tomegaref;
    }

    public void setTomegaref(Double _value_) {
        tomegaref = _value_;
    }

    private static Object getTomegaref(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getTomegaref();
    }

    private static void setTomegaref(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setTomegaref((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setTomegaref(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter time constant for power measurement (<i>T</i><sub>pfiltp3</sub>) (&gt;= 0). It is a type-dependent parameter.
     */
    private Double tpfiltp3; // Seconds

    public Double getTpfiltp3() {
        return tpfiltp3;
    }

    public void setTpfiltp3(Double _value_) {
        tpfiltp3 = _value_;
    }

    private static Object getTpfiltp3(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getTpfiltp3();
    }

    private static void setTpfiltp3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setTpfiltp3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setTpfiltp3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant in power order lag (<i>T</i><sub>pord</sub>). It is a type-dependent parameter.
     */
    private Double tpord; // PU

    public Double getTpord() {
        return tpord;
    }

    public void setTpord(Double _value_) {
        tpord = _value_;
    }

    private static Object getTpord(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getTpord();
    }

    private static void setTpord(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setTpord((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setTpord(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter time constant for voltage measurement (<i>T</i><sub>ufiltp3</sub>) (&gt;= 0). It is a type-dependent parameter.
     */
    private Double tufiltp3; // Seconds

    public Double getTufiltp3() {
        return tufiltp3;
    }

    public void setTufiltp3(Double _value_) {
        tufiltp3 = _value_;
    }

    private static Object getTufiltp3(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getTufiltp3();
    }

    private static void setTufiltp3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setTufiltp3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setTufiltp3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage limit for hold UVRT status after deep voltage sags (<i>u</i><i><sub>DVS</sub></i>). It is a project-dependent parameter.
     */
    private Double udvs; // PU

    public Double getUdvs() {
        return udvs;
    }

    public void setUdvs(Double _value_) {
        udvs = _value_;
    }

    private static Object getUdvs(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getUdvs();
    }

    private static void setUdvs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setUdvs((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setUdvs(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage dip threshold for P-control (<i>u</i><sub>Pdip</sub>).  Part of turbine control, often different (e.g 0.8) from converter thresholds. It is a project-dependent parameter.
     */
    private Double updip; // PU

    public Double getUpdip() {
        return updip;
    }

    public void setUpdip(Double _value_) {
        updip = _value_;
    }

    private static Object getUpdip(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getUpdip();
    }

    private static void setUpdip(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setUpdip((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setUpdip(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Coefficient for active drive train damping (<i>zeta</i>). It is a type-dependent parameter.
     */
    private Float zeta; // Float

    public Float getZeta() {
        return zeta;
    }

    public void setZeta(Float _value_) {
        zeta = _value_;
    }

    private static Object getZeta(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getZeta();
    }

    private static void setZeta(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((WindContPType3IEC) _this_).setZeta((Float) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setZeta(getFloatFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindContPType3IEC", attrName));
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
                "WindContPType3IEC", attrName, value));
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
            map.put("WindDynamicsLookupTable", new AttrDetails("WindContPType3IEC.WindDynamicsLookupTable", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindContPType3IEC::getWindDynamicsLookupTable, WindContPType3IEC::setWindDynamicsLookupTable));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindTurbineType3IEC", new AttrDetails("WindContPType3IEC.WindTurbineType3IEC", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindContPType3IEC::getWindTurbineType3IEC, WindContPType3IEC::setWindTurbineType3IEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dpmax", new AttrDetails("WindContPType3IEC.dpmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getDpmax, WindContPType3IEC::setDpmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dprefmax", new AttrDetails("WindContPType3IEC.dprefmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getDprefmax, WindContPType3IEC::setDprefmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dprefmin", new AttrDetails("WindContPType3IEC.dprefmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getDprefmin, WindContPType3IEC::setDprefmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dthetamax", new AttrDetails("WindContPType3IEC.dthetamax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getDthetamax, WindContPType3IEC::setDthetamax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dthetamaxuvrt", new AttrDetails("WindContPType3IEC.dthetamaxuvrt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getDthetamaxuvrt, WindContPType3IEC::setDthetamaxuvrt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kdtd", new AttrDetails("WindContPType3IEC.kdtd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getKdtd, WindContPType3IEC::setKdtd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kip", new AttrDetails("WindContPType3IEC.kip", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getKip, WindContPType3IEC::setKip));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpp", new AttrDetails("WindContPType3IEC.kpp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getKpp, WindContPType3IEC::setKpp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mpuvrt", new AttrDetails("WindContPType3IEC.mpuvrt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getMpuvrt, WindContPType3IEC::setMpuvrt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omegadtd", new AttrDetails("WindContPType3IEC.omegadtd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getOmegadtd, WindContPType3IEC::setOmegadtd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omegaoffset", new AttrDetails("WindContPType3IEC.omegaoffset", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getOmegaoffset, WindContPType3IEC::setOmegaoffset));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pdtdmax", new AttrDetails("WindContPType3IEC.pdtdmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getPdtdmax, WindContPType3IEC::setPdtdmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tdvs", new AttrDetails("WindContPType3IEC.tdvs", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getTdvs, WindContPType3IEC::setTdvs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("thetaemin", new AttrDetails("WindContPType3IEC.thetaemin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getThetaemin, WindContPType3IEC::setThetaemin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("thetauscale", new AttrDetails("WindContPType3IEC.thetauscale", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getThetauscale, WindContPType3IEC::setThetauscale));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tomegafiltp3", new AttrDetails("WindContPType3IEC.tomegafiltp3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getTomegafiltp3, WindContPType3IEC::setTomegafiltp3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tomegaref", new AttrDetails("WindContPType3IEC.tomegaref", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getTomegaref, WindContPType3IEC::setTomegaref));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpfiltp3", new AttrDetails("WindContPType3IEC.tpfiltp3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getTpfiltp3, WindContPType3IEC::setTpfiltp3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpord", new AttrDetails("WindContPType3IEC.tpord", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getTpord, WindContPType3IEC::setTpord));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tufiltp3", new AttrDetails("WindContPType3IEC.tufiltp3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getTufiltp3, WindContPType3IEC::setTufiltp3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("udvs", new AttrDetails("WindContPType3IEC.udvs", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getUdvs, WindContPType3IEC::setUdvs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("updip", new AttrDetails("WindContPType3IEC.updip", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getUpdip, WindContPType3IEC::setUpdip));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("zeta", new AttrDetails("WindContPType3IEC.zeta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContPType3IEC::getZeta, WindContPType3IEC::setZeta));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindContPType3IEC(null).allAttrDetailsMap());
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
