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
 * Aggregate induction motor load. This model  is used to represent a fraction of an ordinary load as "induction motor load".  It allows load that is treated as ordinary constant power in power flow analysis to be represented by an induction motor in dynamic simulation.  If  = 0. or  = , or  = 0.,  only one cage is represented. Magnetic saturation is not modelled. Either a "one-cage" or "two-cage" model of the induction machine can be modelled. Magnetic saturation is not modelled.  This model is intended for representation of aggregations of many motors dispersed through a load represented at a high voltage bus but where there is no information on the characteristics of individual motors.  This model treats a fraction of the constant power part of a load as a motor. During initialisation, the initial power drawn by the motor is set equal to  times the constant  part of the static load.  The remainder of the load is left as static load.  The reactive power demand of the motor is calculated during initialisation as a function of voltage at the load bus. This reactive power demand may be less than or greater than the constant  component of the load.  If the motor's reactive demand is greater than the constant  component of the load, the model inserts a shunt capacitor at the terminal of the motor to bring its reactive demand down to equal the constant  reactive load.   If a motor model and a static load model are both present for a load, the motor  is assumed to be subtracted from the power flow constant  load before the static load model is applied.  The remainder of the load, if any, is then represented by the static load model.
 */
@SuppressWarnings("unused")
public class LoadMotor extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(LoadMotor.class);

    /**
     * Constructor.
     */
    public LoadMotor(String rdfid) {
        super("LoadMotor", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected LoadMotor(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Aggregate load to which this aggregate motor (dynamic) load belongs.
     */
    private LoadAggregate LoadAggregate; // OneToOne

    private String LoadAggregateId;

    public LoadAggregate getLoadAggregate() {
        return LoadAggregate;
    }

    public void setLoadAggregate(LoadAggregate _object_) {
        if (LoadAggregate != _object_) {
            LoadAggregate = _object_;
            _object_.setLoadMotor(this);
            LoadAggregateId = _object_.getRdfid();
        }
    }

    private static Object getLoadAggregate(BaseClass _this_) {
        var obj = ((LoadMotor) _this_).getLoadAggregate();
        var id = ((LoadMotor) _this_).LoadAggregateId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setLoadAggregate(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((LoadMotor) _this_).LoadAggregateId = (String) _value_;
        } else if (_value_ instanceof LoadAggregate) {
            ((LoadMotor) _this_).setLoadAggregate((LoadAggregate) _value_);
        } else {
            throw new IllegalArgumentException("Object is not LoadAggregate");
        }
    }

    /**
     * Damping factor (D).  Unit = delta P/delta speed.  Typical Value = 2.
     */
    private Double d; // Simple_Float

    public Double getD() {
        return d;
    }

    public void setD(Double _value_) {
        d = _value_;
    }

    private static Object getD(BaseClass _this_) {
        return ((LoadMotor) _this_).getD();
    }

    private static void setD(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadMotor) _this_).setD((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadMotor) _this_).setD(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Inertia constant (H) (not=0).  Typical Value = 0.4.
     */
    private Double h; // Seconds

    public Double getH() {
        return h;
    }

    public void setH(Double _value_) {
        h = _value_;
    }

    private static Object getH(BaseClass _this_) {
        return ((LoadMotor) _this_).getH();
    }

    private static void setH(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadMotor) _this_).setH((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadMotor) _this_).setH(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Loading factor - ratio of initial P to motor MVA base (Lfac).  Typical Value = 0.8.
     */
    private Double lfac; // Simple_Float

    public Double getLfac() {
        return lfac;
    }

    public void setLfac(Double _value_) {
        lfac = _value_;
    }

    private static Object getLfac(BaseClass _this_) {
        return ((LoadMotor) _this_).getLfac();
    }

    private static void setLfac(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadMotor) _this_).setLfac((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadMotor) _this_).setLfac(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Transient reactance (Lp).  Typical Value = 0.15.
     */
    private Double lp; // PU

    public Double getLp() {
        return lp;
    }

    public void setLp(Double _value_) {
        lp = _value_;
    }

    private static Object getLp(BaseClass _this_) {
        return ((LoadMotor) _this_).getLp();
    }

    private static void setLp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadMotor) _this_).setLp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadMotor) _this_).setLp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Subtransient reactance (Lpp).  Typical Value = 0.15.
     */
    private Double lpp; // PU

    public Double getLpp() {
        return lpp;
    }

    public void setLpp(Double _value_) {
        lpp = _value_;
    }

    private static Object getLpp(BaseClass _this_) {
        return ((LoadMotor) _this_).getLpp();
    }

    private static void setLpp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadMotor) _this_).setLpp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadMotor) _this_).setLpp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Synchronous reactance (Ls).  Typical Value = 3.2.
     */
    private Double ls; // PU

    public Double getLs() {
        return ls;
    }

    public void setLs(Double _value_) {
        ls = _value_;
    }

    private static Object getLs(BaseClass _this_) {
        return ((LoadMotor) _this_).getLs();
    }

    private static void setLs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadMotor) _this_).setLs((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadMotor) _this_).setLs(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of constant-power load to be represented by this motor model (Pfrac) (>=0.0 and <=1.0).  Typical Value = 0.3.
     */
    private Double pfrac; // Simple_Float

    public Double getPfrac() {
        return pfrac;
    }

    public void setPfrac(Double _value_) {
        pfrac = _value_;
    }

    private static Object getPfrac(BaseClass _this_) {
        return ((LoadMotor) _this_).getPfrac();
    }

    private static void setPfrac(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadMotor) _this_).setPfrac((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadMotor) _this_).setPfrac(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Stator resistance (Ra).  Typical Value = 0.
     */
    private Double ra; // PU

    public Double getRa() {
        return ra;
    }

    public void setRa(Double _value_) {
        ra = _value_;
    }

    private static Object getRa(BaseClass _this_) {
        return ((LoadMotor) _this_).getRa();
    }

    private static void setRa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadMotor) _this_).setRa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadMotor) _this_).setRa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Circuit breaker operating time (Tbkr).  Typical Value = 0.08.
     */
    private Double tbkr; // Seconds

    public Double getTbkr() {
        return tbkr;
    }

    public void setTbkr(Double _value_) {
        tbkr = _value_;
    }

    private static Object getTbkr(BaseClass _this_) {
        return ((LoadMotor) _this_).getTbkr();
    }

    private static void setTbkr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadMotor) _this_).setTbkr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadMotor) _this_).setTbkr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Transient rotor time constant (Tpo) (not=0).  Typical Value = 1.
     */
    private Double tpo; // Seconds

    public Double getTpo() {
        return tpo;
    }

    public void setTpo(Double _value_) {
        tpo = _value_;
    }

    private static Object getTpo(BaseClass _this_) {
        return ((LoadMotor) _this_).getTpo();
    }

    private static void setTpo(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadMotor) _this_).setTpo((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadMotor) _this_).setTpo(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Subtransient rotor time constant (Tppo).  Typical Value = 0.02.
     */
    private Double tppo; // Seconds

    public Double getTppo() {
        return tppo;
    }

    public void setTppo(Double _value_) {
        tppo = _value_;
    }

    private static Object getTppo(BaseClass _this_) {
        return ((LoadMotor) _this_).getTppo();
    }

    private static void setTppo(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadMotor) _this_).setTppo((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadMotor) _this_).setTppo(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage trip pickup time (Tv).  Typical Value = 0.1.
     */
    private Double tv; // Seconds

    public Double getTv() {
        return tv;
    }

    public void setTv(Double _value_) {
        tv = _value_;
    }

    private static Object getTv(BaseClass _this_) {
        return ((LoadMotor) _this_).getTv();
    }

    private static void setTv(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadMotor) _this_).setTv((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadMotor) _this_).setTv(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage threshold for tripping (Vt).  Typical Value = 0.7.
     */
    private Double vt; // PU

    public Double getVt() {
        return vt;
    }

    public void setVt(Double _value_) {
        vt = _value_;
    }

    private static Object getVt(BaseClass _this_) {
        return ((LoadMotor) _this_).getVt();
    }

    private static void setVt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadMotor) _this_).setVt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadMotor) _this_).setVt(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "LoadMotor", attrName));
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
                "LoadMotor", attrName, value));
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
            map.put("LoadAggregate", new AttrDetails("LoadMotor.LoadAggregate", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, LoadMotor::getLoadAggregate, LoadMotor::setLoadAggregate));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("d", new AttrDetails("LoadMotor.d", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadMotor::getD, LoadMotor::setD));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("h", new AttrDetails("LoadMotor.h", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadMotor::getH, LoadMotor::setH));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lfac", new AttrDetails("LoadMotor.lfac", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadMotor::getLfac, LoadMotor::setLfac));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lp", new AttrDetails("LoadMotor.lp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadMotor::getLp, LoadMotor::setLp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lpp", new AttrDetails("LoadMotor.lpp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadMotor::getLpp, LoadMotor::setLpp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ls", new AttrDetails("LoadMotor.ls", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadMotor::getLs, LoadMotor::setLs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pfrac", new AttrDetails("LoadMotor.pfrac", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadMotor::getPfrac, LoadMotor::setPfrac));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ra", new AttrDetails("LoadMotor.ra", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadMotor::getRa, LoadMotor::setRa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tbkr", new AttrDetails("LoadMotor.tbkr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadMotor::getTbkr, LoadMotor::setTbkr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpo", new AttrDetails("LoadMotor.tpo", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadMotor::getTpo, LoadMotor::setTpo));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tppo", new AttrDetails("LoadMotor.tppo", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadMotor::getTppo, LoadMotor::setTppo));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tv", new AttrDetails("LoadMotor.tv", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadMotor::getTv, LoadMotor::setTv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vt", new AttrDetails("LoadMotor.vt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, LoadMotor::getVt, LoadMotor::setVt));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new LoadMotor(null).allAttrDetailsMap());
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
