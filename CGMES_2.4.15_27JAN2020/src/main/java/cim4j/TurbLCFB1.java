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
     * Default constructor.
     */
    public TurbLCFB1() {
        setCimType("TurbLCFB1");
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

    public void setDb(String _value_) {
        db = getDoubleFromString(_value_);
    }

    public String dbToString() {
        return db != null ? db.toString() : null;
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

    public void setEmax(String _value_) {
        emax = getDoubleFromString(_value_);
    }

    public String emaxToString() {
        return emax != null ? emax.toString() : null;
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

    public void setFb(String _value_) {
        fb = getDoubleFromString(_value_);
    }

    public String fbToString() {
        return fb != null ? fb.toString() : null;
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

    public void setFbf(String _value_) {
        fbf = getBooleanFromString(_value_);
    }

    public String fbfToString() {
        return fbf != null ? fbf.toString() : null;
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

    public void setIrmax(String _value_) {
        irmax = getDoubleFromString(_value_);
    }

    public String irmaxToString() {
        return irmax != null ? irmax.toString() : null;
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

    public void setKi(String _value_) {
        ki = getDoubleFromString(_value_);
    }

    public String kiToString() {
        return ki != null ? ki.toString() : null;
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

    public void setKp(String _value_) {
        kp = getDoubleFromString(_value_);
    }

    public String kpToString() {
        return kp != null ? kp.toString() : null;
    }

    /**
     * Base for power values (MWbase) (&gt;0).  Unit = MW.
     */
    private Double mwbase; // ActivePower

    public Double getMwbase() {
        return mwbase;
    }

    public void setMwbase(Double _value_) {
        mwbase = _value_;
    }

    public void setMwbase(String _value_) {
        mwbase = getDoubleFromString(_value_);
    }

    public String mwbaseToString() {
        return mwbase != null ? mwbase.toString() : null;
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

    public void setPbf(String _value_) {
        pbf = getBooleanFromString(_value_);
    }

    public String pbfToString() {
        return pbf != null ? pbf.toString() : null;
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

    public void setPmwset(String _value_) {
        pmwset = getDoubleFromString(_value_);
    }

    public String pmwsetToString() {
        return pmwset != null ? pmwset.toString() : null;
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

    public void setSpeedReferenceGovernor(String _value_) {
        speedReferenceGovernor = getBooleanFromString(_value_);
    }

    public String speedReferenceGovernorToString() {
        return speedReferenceGovernor != null ? speedReferenceGovernor.toString() : null;
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

    public void setTpelec(String _value_) {
        tpelec = getDoubleFromString(_value_);
    }

    public String tpelecToString() {
        return tpelec != null ? tpelec.toString() : null;
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
     * Get an attribute value as string.
     *
     * @param attrName The attribute name
     * @return         The attribute value
     */
    @Override
    public String getAttribute(String attrName) {
        return getAttribute("TurbLCFB1", attrName);
    }

    @Override
    protected String getAttribute(String className, String attrName) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var getterFunction = classGetterSetterMap.get(attrName).getter;
            return getterFunction.get();
        }
        return super.getAttribute(className, attrName);
    }

    /**
     * Set an attribute value as object (for class and list attributes).
     *
     * @param attrName    The attribute name
     * @param objectValue The attribute value as object
     */
    @Override
    public void setAttribute(String attrName, BaseClass objectValue) {
        setAttribute("TurbLCFB1", attrName, objectValue);
    }

    @Override
    protected void setAttribute(String className, String attrName, BaseClass objectValue) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var setterFunction = classGetterSetterMap.get(attrName).objectSetter;
            setterFunction.accept(objectValue);
        } else {
            super.setAttribute(className, attrName, objectValue);
        }
    }

    /**
     * Set an attribute value as string (for primitive (including datatype) and enum attributes).
     *
     * @param attrName    The attribute name
     * @param stringValue The attribute value as string
     */
    @Override
    public void setAttribute(String attrName, String stringValue) {
        setAttribute("TurbLCFB1", attrName, stringValue);
    }

    @Override
    protected void setAttribute(String className, String attrName, String stringValue) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var setterFunction = classGetterSetterMap.get(attrName).stringSetter;
            setterFunction.accept(stringValue);
        } else {
            super.setAttribute(className, attrName, stringValue);
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
            map.put("db", new AttrDetails("TurbLCFB1.db", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("emax", new AttrDetails("TurbLCFB1.emax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fb", new AttrDetails("TurbLCFB1.fb", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fbf", new AttrDetails("TurbLCFB1.fbf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("irmax", new AttrDetails("TurbLCFB1.irmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("TurbLCFB1.ki", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("TurbLCFB1.kp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("TurbLCFB1.mwbase", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pbf", new AttrDetails("TurbLCFB1.pbf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmwset", new AttrDetails("TurbLCFB1.pmwset", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("speedReferenceGovernor", new AttrDetails("TurbLCFB1.speedReferenceGovernor", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpelec", new AttrDetails("TurbLCFB1.tpelec", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new TurbLCFB1().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("db", new GetterSetter(this::dbToString, null, this::setDb));
        map.put("emax", new GetterSetter(this::emaxToString, null, this::setEmax));
        map.put("fb", new GetterSetter(this::fbToString, null, this::setFb));
        map.put("fbf", new GetterSetter(this::fbfToString, null, this::setFbf));
        map.put("irmax", new GetterSetter(this::irmaxToString, null, this::setIrmax));
        map.put("ki", new GetterSetter(this::kiToString, null, this::setKi));
        map.put("kp", new GetterSetter(this::kpToString, null, this::setKp));
        map.put("mwbase", new GetterSetter(this::mwbaseToString, null, this::setMwbase));
        map.put("pbf", new GetterSetter(this::pbfToString, null, this::setPbf));
        map.put("pmwset", new GetterSetter(this::pmwsetToString, null, this::setPmwset));
        map.put("speedReferenceGovernor", new GetterSetter(this::speedReferenceGovernorToString, null, this::setSpeedReferenceGovernor));
        map.put("tpelec", new GetterSetter(this::tpelecToString, null, this::setTpelec));
        return map;
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
