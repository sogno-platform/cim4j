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
 * Steam turbine governor with reheat time constants and modeling of the effects of fast valve closing to reduce mechanical power.
 */
@SuppressWarnings("unused")
public class GovSteamFV2 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovSteamFV2.class);

    /**
     * Constructor.
     */
    public GovSteamFV2(String rdfid) {
        super("GovSteamFV2", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovSteamFV2(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * (Dt).
     */
    private Double dt; // PU

    public Double getDt() {
        return dt;
    }

    public void setDt(Double _value_) {
        dt = _value_;
    }

    private static Object getDt(BaseClass _this_) {
        return ((GovSteamFV2) _this_).getDt();
    }

    private static void setDt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV2) _this_).setDt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV2) _this_).setDt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of the turbine power developed by turbine sections not involved in fast valving (K).
     */
    private Double k; // PU

    public Double getK() {
        return k;
    }

    public void setK(Double _value_) {
        k = _value_;
    }

    private static Object getK(BaseClass _this_) {
        return ((GovSteamFV2) _this_).getK();
    }

    private static void setK(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV2) _this_).setK((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV2) _this_).setK(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Alternate Base used instead of Machine base in equipment model if necessary (MWbase) (>0).  Unit = MW.
     */
    private Double mwbase; // ActivePower

    public Double getMwbase() {
        return mwbase;
    }

    public void setMwbase(Double _value_) {
        mwbase = _value_;
    }

    private static Object getMwbase(BaseClass _this_) {
        return ((GovSteamFV2) _this_).getMwbase();
    }

    private static void setMwbase(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV2) _this_).setMwbase((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV2) _this_).setMwbase(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * (R).
     */
    private Double r; // PU

    public Double getR() {
        return r;
    }

    public void setR(Double _value_) {
        r = _value_;
    }

    private static Object getR(BaseClass _this_) {
        return ((GovSteamFV2) _this_).getR();
    }

    private static void setR(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV2) _this_).setR((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV2) _this_).setR(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Governor time constant (T1).
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((GovSteamFV2) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV2) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV2) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reheater time constant (T3).
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    private static Object getT3(BaseClass _this_) {
        return ((GovSteamFV2) _this_).getT3();
    }

    private static void setT3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV2) _this_).setT3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV2) _this_).setT3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time after initial time for valve to close (Ta).
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((GovSteamFV2) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV2) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV2) _this_).setTa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time after initial time for valve to begin opening (Tb).
     */
    private Double tb; // Seconds

    public Double getTb() {
        return tb;
    }

    public void setTb(Double _value_) {
        tb = _value_;
    }

    private static Object getTb(BaseClass _this_) {
        return ((GovSteamFV2) _this_).getTb();
    }

    private static void setTb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV2) _this_).setTb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV2) _this_).setTb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time after initial time for valve to become fully open (Tc).
     */
    private Double tc; // Seconds

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    private static Object getTc(BaseClass _this_) {
        return ((GovSteamFV2) _this_).getTc();
    }

    private static void setTc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV2) _this_).setTc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV2) _this_).setTc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Initial time to begin fast valving (Ti).
     */
    private Double ti; // Seconds

    public Double getTi() {
        return ti;
    }

    public void setTi(Double _value_) {
        ti = _value_;
    }

    private static Object getTi(BaseClass _this_) {
        return ((GovSteamFV2) _this_).getTi();
    }

    private static void setTi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV2) _this_).setTi((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV2) _this_).setTi(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant with which power falls off after intercept valve closure (Tt).
     */
    private Double tt; // Seconds

    public Double getTt() {
        return tt;
    }

    public void setTt(Double _value_) {
        tt = _value_;
    }

    private static Object getTt(BaseClass _this_) {
        return ((GovSteamFV2) _this_).getTt();
    }

    private static void setTt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV2) _this_).setTt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV2) _this_).setTt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * (Vmax).
     */
    private Double vmax; // PU

    public Double getVmax() {
        return vmax;
    }

    public void setVmax(Double _value_) {
        vmax = _value_;
    }

    private static Object getVmax(BaseClass _this_) {
        return ((GovSteamFV2) _this_).getVmax();
    }

    private static void setVmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV2) _this_).setVmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV2) _this_).setVmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * (Vmin).
     */
    private Double vmin; // PU

    public Double getVmin() {
        return vmin;
    }

    public void setVmin(Double _value_) {
        vmin = _value_;
    }

    private static Object getVmin(BaseClass _this_) {
        return ((GovSteamFV2) _this_).getVmin();
    }

    private static void setVmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV2) _this_).setVmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV2) _this_).setVmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovSteamFV2", attrName));
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
                "GovSteamFV2", attrName, value));
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
            map.put("dt", new AttrDetails("GovSteamFV2.dt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV2::getDt, GovSteamFV2::setDt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k", new AttrDetails("GovSteamFV2.k", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV2::getK, GovSteamFV2::setK));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovSteamFV2.mwbase", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV2::getMwbase, GovSteamFV2::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("r", new AttrDetails("GovSteamFV2.r", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV2::getR, GovSteamFV2::setR));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("GovSteamFV2.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV2::getT1, GovSteamFV2::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("GovSteamFV2.t3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV2::getT3, GovSteamFV2::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("GovSteamFV2.ta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV2::getTa, GovSteamFV2::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("GovSteamFV2.tb", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV2::getTb, GovSteamFV2::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("GovSteamFV2.tc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV2::getTc, GovSteamFV2::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti", new AttrDetails("GovSteamFV2.ti", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV2::getTi, GovSteamFV2::setTi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tt", new AttrDetails("GovSteamFV2.tt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV2::getTt, GovSteamFV2::setTt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmax", new AttrDetails("GovSteamFV2.vmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV2::getVmax, GovSteamFV2::setVmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmin", new AttrDetails("GovSteamFV2.vmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV2::getVmin, GovSteamFV2::setVmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovSteamFV2(null).allAttrDetailsMap());
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
