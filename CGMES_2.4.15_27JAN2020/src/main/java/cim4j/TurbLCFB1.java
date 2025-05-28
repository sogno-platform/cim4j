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
 * Turbine Load Controller model developed in the WECC.  This model represents a supervisory turbine load controller that acts to maintain turbine power at a set value by continuous adjustment of the turbine governor speed-load reference. This model is intended to represent slow reset 'outer loop' controllers managing the action of the turbine governor.
 */
@SuppressWarnings("unused")
public class TurbLCFB1 extends TurbineLoadControllerDynamics {

    private static final Logging LOG = Logging.getLogger(TurbLCFB1.class);

    /**
     * Constructor.
     */
    public TurbLCFB1(String rdfid) {
        super("TurbLCFB1", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected TurbLCFB1(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Controller dead band (db).  Typical Value = 0.
     */
    private Double db; // PU

    public Double getDb() {
        return db;
    }

    public void setDb(Double _value_) {
        db = _value_;
    }

    private static Object getDb(BaseClass _this_) {
        return ((TurbLCFB1) _this_).getDb();
    }

    private static void setDb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((TurbLCFB1) _this_).setDb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((TurbLCFB1) _this_).setDb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum control error (Emax) (note 4).  Typical Value = 0.02.
     */
    private Double emax; // PU

    public Double getEmax() {
        return emax;
    }

    public void setEmax(Double _value_) {
        emax = _value_;
    }

    private static Object getEmax(BaseClass _this_) {
        return ((TurbLCFB1) _this_).getEmax();
    }

    private static void setEmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((TurbLCFB1) _this_).setEmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((TurbLCFB1) _this_).setEmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Frequency bias gain (Fb).  Typical Value = 0.
     */
    private Double fb; // PU

    public Double getFb() {
        return fb;
    }

    public void setFb(Double _value_) {
        fb = _value_;
    }

    private static Object getFb(BaseClass _this_) {
        return ((TurbLCFB1) _this_).getFb();
    }

    private static void setFb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((TurbLCFB1) _this_).setFb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((TurbLCFB1) _this_).setFb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Frequency bias flag (Fbf). true = enable frequency bias false = disable frequency bias. Typical Value = false.
     */
    private Boolean fbf; // Boolean

    public Boolean getFbf() {
        return fbf;
    }

    public void setFbf(Boolean _value_) {
        fbf = _value_;
    }

    private static Object getFbf(BaseClass _this_) {
        return ((TurbLCFB1) _this_).getFbf();
    }

    private static void setFbf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((TurbLCFB1) _this_).setFbf((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((TurbLCFB1) _this_).setFbf(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Maximum turbine speed/load reference bias (Irmax) (note 3).  Typical Value = 0.
     */
    private Double irmax; // PU

    public Double getIrmax() {
        return irmax;
    }

    public void setIrmax(Double _value_) {
        irmax = _value_;
    }

    private static Object getIrmax(BaseClass _this_) {
        return ((TurbLCFB1) _this_).getIrmax();
    }

    private static void setIrmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((TurbLCFB1) _this_).setIrmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((TurbLCFB1) _this_).setIrmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Integral gain (Ki).  Typical Value = 0.
     */
    private Double ki; // PU

    public Double getKi() {
        return ki;
    }

    public void setKi(Double _value_) {
        ki = _value_;
    }

    private static Object getKi(BaseClass _this_) {
        return ((TurbLCFB1) _this_).getKi();
    }

    private static void setKi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((TurbLCFB1) _this_).setKi((Double) _value_);
        } else if (_value_ instanceof String) {
            ((TurbLCFB1) _this_).setKi(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Proportional gain (Kp).  Typical Value = 0.
     */
    private Double kp; // PU

    public Double getKp() {
        return kp;
    }

    public void setKp(Double _value_) {
        kp = _value_;
    }

    private static Object getKp(BaseClass _this_) {
        return ((TurbLCFB1) _this_).getKp();
    }

    private static void setKp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((TurbLCFB1) _this_).setKp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((TurbLCFB1) _this_).setKp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Base for power values (MWbase) (>0).  Unit = MW.
     */
    private Double mwbase; // ActivePower

    public Double getMwbase() {
        return mwbase;
    }

    public void setMwbase(Double _value_) {
        mwbase = _value_;
    }

    private static Object getMwbase(BaseClass _this_) {
        return ((TurbLCFB1) _this_).getMwbase();
    }

    private static void setMwbase(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((TurbLCFB1) _this_).setMwbase((Double) _value_);
        } else if (_value_ instanceof String) {
            ((TurbLCFB1) _this_).setMwbase(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Power controller flag (Pbf). true = enable load controller false = disable load controller. Typical Value = false.
     */
    private Boolean pbf; // Boolean

    public Boolean getPbf() {
        return pbf;
    }

    public void setPbf(Boolean _value_) {
        pbf = _value_;
    }

    private static Object getPbf(BaseClass _this_) {
        return ((TurbLCFB1) _this_).getPbf();
    }

    private static void setPbf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((TurbLCFB1) _this_).setPbf((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((TurbLCFB1) _this_).setPbf(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Power controller setpoint (Pmwset) (note 1).  Unit = MW. Typical Value = 0.
     */
    private Double pmwset; // ActivePower

    public Double getPmwset() {
        return pmwset;
    }

    public void setPmwset(Double _value_) {
        pmwset = _value_;
    }

    private static Object getPmwset(BaseClass _this_) {
        return ((TurbLCFB1) _this_).getPmwset();
    }

    private static void setPmwset(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((TurbLCFB1) _this_).setPmwset((Double) _value_);
        } else if (_value_ instanceof String) {
            ((TurbLCFB1) _this_).setPmwset(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Type of turbine governor reference (Type). true = speed reference governor false = load reference governor. Typical Value = true.
     */
    private Boolean speedReferenceGovernor; // Boolean

    public Boolean getSpeedReferenceGovernor() {
        return speedReferenceGovernor;
    }

    public void setSpeedReferenceGovernor(Boolean _value_) {
        speedReferenceGovernor = _value_;
    }

    private static Object getSpeedReferenceGovernor(BaseClass _this_) {
        return ((TurbLCFB1) _this_).getSpeedReferenceGovernor();
    }

    private static void setSpeedReferenceGovernor(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((TurbLCFB1) _this_).setSpeedReferenceGovernor((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((TurbLCFB1) _this_).setSpeedReferenceGovernor(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Power transducer time constant (Tpelec).  Typical Value = 0.
     */
    private Double tpelec; // Seconds

    public Double getTpelec() {
        return tpelec;
    }

    public void setTpelec(Double _value_) {
        tpelec = _value_;
    }

    private static Object getTpelec(BaseClass _this_) {
        return ((TurbLCFB1) _this_).getTpelec();
    }

    private static void setTpelec(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((TurbLCFB1) _this_).setTpelec((Double) _value_);
        } else if (_value_ instanceof String) {
            ((TurbLCFB1) _this_).setTpelec(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "TurbLCFB1", attrName));
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
                "TurbLCFB1", attrName, value));
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
            map.put("db", new AttrDetails("TurbLCFB1.db", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TurbLCFB1::getDb, TurbLCFB1::setDb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("emax", new AttrDetails("TurbLCFB1.emax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TurbLCFB1::getEmax, TurbLCFB1::setEmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fb", new AttrDetails("TurbLCFB1.fb", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TurbLCFB1::getFb, TurbLCFB1::setFb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fbf", new AttrDetails("TurbLCFB1.fbf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TurbLCFB1::getFbf, TurbLCFB1::setFbf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("irmax", new AttrDetails("TurbLCFB1.irmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TurbLCFB1::getIrmax, TurbLCFB1::setIrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("TurbLCFB1.ki", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TurbLCFB1::getKi, TurbLCFB1::setKi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("TurbLCFB1.kp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TurbLCFB1::getKp, TurbLCFB1::setKp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("TurbLCFB1.mwbase", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TurbLCFB1::getMwbase, TurbLCFB1::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pbf", new AttrDetails("TurbLCFB1.pbf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TurbLCFB1::getPbf, TurbLCFB1::setPbf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmwset", new AttrDetails("TurbLCFB1.pmwset", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TurbLCFB1::getPmwset, TurbLCFB1::setPmwset));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("speedReferenceGovernor", new AttrDetails("TurbLCFB1.speedReferenceGovernor", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TurbLCFB1::getSpeedReferenceGovernor, TurbLCFB1::setSpeedReferenceGovernor));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpelec", new AttrDetails("TurbLCFB1.tpelec", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TurbLCFB1::getTpelec, TurbLCFB1::setTpelec));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new TurbLCFB1(null).allAttrDetailsMap());
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
