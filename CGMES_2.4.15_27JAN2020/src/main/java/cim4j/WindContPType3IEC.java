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
 * P control model Type 3.  Reference: IEC Standard 61400-27-1 Section 6.6.5.3.
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
     * The P control type 3 model with which this wind dynamics lookup table is associated.
     *
     * NOT USED
     */
    private Set<WindDynamicsLookupTable> WindDynamicsLookupTable = new HashSet<>(); // OneToMany

    private Set<String> WindDynamicsLookupTableIdSet = new HashSet<>();

    public Set<WindDynamicsLookupTable> getWindDynamicsLookupTable() {
        return WindDynamicsLookupTable;
    }

    public void setWindDynamicsLookupTable(WindDynamicsLookupTable _object_) {
        if (!WindDynamicsLookupTable.contains(_object_)) {
            WindDynamicsLookupTable.add(_object_);
            _object_.setWindContPType3IEC(this);
            WindDynamicsLookupTableIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getWindDynamicsLookupTable(BaseClass _this_) {
        var objs = ((WindContPType3IEC) _this_).getWindDynamicsLookupTable();
        var ids = ((WindContPType3IEC) _this_).WindDynamicsLookupTableIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setWindDynamicsLookupTable(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).WindDynamicsLookupTableIdSet.add((String) _value_);
        } else if (_value_ instanceof WindDynamicsLookupTable) {
            ((WindContPType3IEC) _this_).setWindDynamicsLookupTable((WindDynamicsLookupTable) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindDynamicsLookupTable");
        }
    }

    /**
     * Wind turbine type 3 model with which this Wind control P type 3 model is associated.
     *
     * NOT USED
     */
    private WindGenTurbineType3IEC WindGenTurbineType3IEC; // OneToOne

    private String WindGenTurbineType3IECId;

    public WindGenTurbineType3IEC getWindGenTurbineType3IEC() {
        return WindGenTurbineType3IEC;
    }

    public void setWindGenTurbineType3IEC(WindGenTurbineType3IEC _object_) {
        if (WindGenTurbineType3IEC != _object_) {
            WindGenTurbineType3IEC = _object_;
            _object_.setWindContPType3IEC(this);
            WindGenTurbineType3IECId = _object_.getRdfid();
        }
    }

    private static Object getWindGenTurbineType3IEC(BaseClass _this_) {
        var obj = ((WindContPType3IEC) _this_).getWindGenTurbineType3IEC();
        var id = ((WindContPType3IEC) _this_).WindGenTurbineType3IECId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setWindGenTurbineType3IEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).WindGenTurbineType3IECId = (String) _value_;
        } else if (_value_ instanceof WindGenTurbineType3IEC) {
            ((WindContPType3IEC) _this_).setWindGenTurbineType3IEC((WindGenTurbineType3IEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindGenTurbineType3IEC");
        }
    }

    /**
     * Maximum wind turbine power ramp rate (). It is project dependent parameter.
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
     * Limitation of torque rise rate during LVRT for S (d). It is project dependent parameter.
     */
    private Double dtrisemaxlvrt; // PU

    public Double getDtrisemaxlvrt() {
        return dtrisemaxlvrt;
    }

    public void setDtrisemaxlvrt(Double _value_) {
        dtrisemaxlvrt = _value_;
    }

    private static Object getDtrisemaxlvrt(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getDtrisemaxlvrt();
    }

    private static void setDtrisemaxlvrt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setDtrisemaxlvrt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setDtrisemaxlvrt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain for active drive train damping (). It is type dependent parameter.
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
     * PI controller integration parameter (). It is type dependent parameter.
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
     * PI controller proportional gain (). It is type dependent parameter.
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
     * Enable LVRT power control mode (M true = 1: voltage control false = 0: reactive power control.  It is project dependent parameter.
     */
    private Boolean mplvrt; // Boolean

    public Boolean getMplvrt() {
        return mplvrt;
    }

    public void setMplvrt(Boolean _value_) {
        mplvrt = _value_;
    }

    private static Object getMplvrt(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getMplvrt();
    }

    private static void setMplvrt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((WindContPType3IEC) _this_).setMplvrt((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setMplvrt(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Offset to reference value that limits controller action during rotor speed changes (omega). It is case dependent parameter.
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
     * Maximum active drive train damping power (). It is type dependent parameter.
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
     * Ramp limitation of torque, required in some grid codes (). It is project dependent parameter.
     */
    private Double rramp; // PU

    public Double getRramp() {
        return rramp;
    }

    public void setRramp(Double _value_) {
        rramp = _value_;
    }

    private static Object getRramp(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getRramp();
    }

    private static void setRramp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setRramp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setRramp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Timedelay after deep voltage sags (T). It is project dependent parameter.
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
     * Minimum electrical generator torque (). It is type dependent parameter.
     */
    private Double temin; // PU

    public Double getTemin() {
        return temin;
    }

    public void setTemin(Double _value_) {
        temin = _value_;
    }

    private static Object getTemin(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getTemin();
    }

    private static void setTemin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setTemin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setTemin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter time constant for generator speed measurement (). It is type dependent parameter.
     */
    private Double tomegafilt; // Seconds

    public Double getTomegafilt() {
        return tomegafilt;
    }

    public void setTomegafilt(Double _value_) {
        tomegafilt = _value_;
    }

    private static Object getTomegafilt(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getTomegafilt();
    }

    private static void setTomegafilt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setTomegafilt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setTomegafilt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter time constant for power measurement (). It is type dependent parameter.
     */
    private Double tpfilt; // Seconds

    public Double getTpfilt() {
        return tpfilt;
    }

    public void setTpfilt(Double _value_) {
        tpfilt = _value_;
    }

    private static Object getTpfilt(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getTpfilt();
    }

    private static void setTpfilt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setTpfilt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setTpfilt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant in power order lag (). It is type dependent parameter.
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
     * Filter time constant for voltage measurement (). It is type dependent parameter.
     */
    private Double tufilt; // Seconds

    public Double getTufilt() {
        return tufilt;
    }

    public void setTufilt(Double _value_) {
        tufilt = _value_;
    }

    private static Object getTufilt(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getTufilt();
    }

    private static void setTufilt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setTufilt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setTufilt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage scaling factor of reset-torque (T). It is project dependent parameter.
     */
    private Double tuscale; // PU

    public Double getTuscale() {
        return tuscale;
    }

    public void setTuscale(Double _value_) {
        tuscale = _value_;
    }

    private static Object getTuscale(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getTuscale();
    }

    private static void setTuscale(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setTuscale((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setTuscale(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant in speed reference filter (). It is type dependent parameter.
     */
    private Double twref; // Seconds

    public Double getTwref() {
        return twref;
    }

    public void setTwref(Double _value_) {
        twref = _value_;
    }

    private static Object getTwref(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getTwref();
    }

    private static void setTwref(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setTwref((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setTwref(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage limit for hold LVRT status after deep voltage sags (). It is project dependent parameter.
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
     * Voltage dip threshold for P-control ().  Part of turbine control, often different (e.g 0.8) from converter thresholds. It is project dependent parameter.
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
     * Active drive train damping frequency (omega). It can be calculated from two mass model parameters. It is type dependent parameter.
     */
    private Double wdtd; // PU

    public Double getWdtd() {
        return wdtd;
    }

    public void setWdtd(Double _value_) {
        wdtd = _value_;
    }

    private static Object getWdtd(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getWdtd();
    }

    private static void setWdtd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setWdtd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setWdtd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Coefficient for active drive train damping (zeta). It is type dependent parameter.
     */
    private Double zeta; // Simple_Float

    public Double getZeta() {
        return zeta;
    }

    public void setZeta(Double _value_) {
        zeta = _value_;
    }

    private static Object getZeta(BaseClass _this_) {
        return ((WindContPType3IEC) _this_).getZeta();
    }

    private static void setZeta(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContPType3IEC) _this_).setZeta((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContPType3IEC) _this_).setZeta(getDoubleFromString((String) _value_));
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

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/2013/CIM-schema-cim16#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindDynamicsLookupTable", new AttrDetails("WindContPType3IEC.WindDynamicsLookupTable", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindContPType3IEC::getWindDynamicsLookupTable, WindContPType3IEC::setWindDynamicsLookupTable));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindGenTurbineType3IEC", new AttrDetails("WindContPType3IEC.WindGenTurbineType3IEC", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindContPType3IEC::getWindGenTurbineType3IEC, WindContPType3IEC::setWindGenTurbineType3IEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dpmax", new AttrDetails("WindContPType3IEC.dpmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPType3IEC::getDpmax, WindContPType3IEC::setDpmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dtrisemaxlvrt", new AttrDetails("WindContPType3IEC.dtrisemaxlvrt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPType3IEC::getDtrisemaxlvrt, WindContPType3IEC::setDtrisemaxlvrt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kdtd", new AttrDetails("WindContPType3IEC.kdtd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPType3IEC::getKdtd, WindContPType3IEC::setKdtd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kip", new AttrDetails("WindContPType3IEC.kip", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPType3IEC::getKip, WindContPType3IEC::setKip));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpp", new AttrDetails("WindContPType3IEC.kpp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPType3IEC::getKpp, WindContPType3IEC::setKpp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mplvrt", new AttrDetails("WindContPType3IEC.mplvrt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPType3IEC::getMplvrt, WindContPType3IEC::setMplvrt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omegaoffset", new AttrDetails("WindContPType3IEC.omegaoffset", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPType3IEC::getOmegaoffset, WindContPType3IEC::setOmegaoffset));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pdtdmax", new AttrDetails("WindContPType3IEC.pdtdmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPType3IEC::getPdtdmax, WindContPType3IEC::setPdtdmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rramp", new AttrDetails("WindContPType3IEC.rramp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPType3IEC::getRramp, WindContPType3IEC::setRramp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tdvs", new AttrDetails("WindContPType3IEC.tdvs", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPType3IEC::getTdvs, WindContPType3IEC::setTdvs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("temin", new AttrDetails("WindContPType3IEC.temin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPType3IEC::getTemin, WindContPType3IEC::setTemin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tomegafilt", new AttrDetails("WindContPType3IEC.tomegafilt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPType3IEC::getTomegafilt, WindContPType3IEC::setTomegafilt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpfilt", new AttrDetails("WindContPType3IEC.tpfilt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPType3IEC::getTpfilt, WindContPType3IEC::setTpfilt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpord", new AttrDetails("WindContPType3IEC.tpord", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPType3IEC::getTpord, WindContPType3IEC::setTpord));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tufilt", new AttrDetails("WindContPType3IEC.tufilt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPType3IEC::getTufilt, WindContPType3IEC::setTufilt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tuscale", new AttrDetails("WindContPType3IEC.tuscale", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPType3IEC::getTuscale, WindContPType3IEC::setTuscale));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twref", new AttrDetails("WindContPType3IEC.twref", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPType3IEC::getTwref, WindContPType3IEC::setTwref));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("udvs", new AttrDetails("WindContPType3IEC.udvs", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPType3IEC::getUdvs, WindContPType3IEC::setUdvs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("updip", new AttrDetails("WindContPType3IEC.updip", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPType3IEC::getUpdip, WindContPType3IEC::setUpdip));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("wdtd", new AttrDetails("WindContPType3IEC.wdtd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPType3IEC::getWdtd, WindContPType3IEC::setWdtd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("zeta", new AttrDetails("WindContPType3IEC.zeta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContPType3IEC::getZeta, WindContPType3IEC::setZeta));
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
