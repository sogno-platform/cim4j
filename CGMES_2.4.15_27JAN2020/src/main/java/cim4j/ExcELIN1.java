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
 * Static PI transformer fed excitation system: ELIN (VATECH) - simplified model.  This model represents an all-static excitation system. A PI voltage controller establishes a desired field current set point for a proportional current controller. The integrator of the PI controller has a follow-up input to match its signal to the present field current.  A power system stabilizer with power input is included in the model.
 */
@SuppressWarnings("unused")
public class ExcELIN1 extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcELIN1.class);

    /**
     * Constructor.
     */
    public ExcELIN1(String rdfid) {
        super("ExcELIN1", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcELIN1(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Controller follow up dead band (Dpnf).  Typical Value = 0.
     */
    private Double dpnf; // PU

    public Double getDpnf() {
        return dpnf;
    }

    public void setDpnf(Double _value_) {
        dpnf = _value_;
    }

    private static Object getDpnf(BaseClass _this_) {
        return ((ExcELIN1) _this_).getDpnf();
    }

    private static void setDpnf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN1) _this_).setDpnf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN1) _this_).setDpnf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum open circuit excitation voltage (Efmax).  Typical Value = 5.
     */
    private Double efmax; // PU

    public Double getEfmax() {
        return efmax;
    }

    public void setEfmax(Double _value_) {
        efmax = _value_;
    }

    private static Object getEfmax(BaseClass _this_) {
        return ((ExcELIN1) _this_).getEfmax();
    }

    private static void setEfmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN1) _this_).setEfmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN1) _this_).setEfmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum open circuit excitation voltage (Efmin).  Typical Value = -5.
     */
    private Double efmin; // PU

    public Double getEfmin() {
        return efmin;
    }

    public void setEfmin(Double _value_) {
        efmin = _value_;
    }

    private static Object getEfmin(BaseClass _this_) {
        return ((ExcELIN1) _this_).getEfmin();
    }

    private static void setEfmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN1) _this_).setEfmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN1) _this_).setEfmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Stabilizer Gain 1 (Ks1).  Typical Value = 0.
     */
    private Double ks1; // PU

    public Double getKs1() {
        return ks1;
    }

    public void setKs1(Double _value_) {
        ks1 = _value_;
    }

    private static Object getKs1(BaseClass _this_) {
        return ((ExcELIN1) _this_).getKs1();
    }

    private static void setKs1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN1) _this_).setKs1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN1) _this_).setKs1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Stabilizer Gain 2 (Ks2).  Typical Value = 0.
     */
    private Double ks2; // PU

    public Double getKs2() {
        return ks2;
    }

    public void setKs2(Double _value_) {
        ks2 = _value_;
    }

    private static Object getKs2(BaseClass _this_) {
        return ((ExcELIN1) _this_).getKs2();
    }

    private static void setKs2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN1) _this_).setKs2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN1) _this_).setKs2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Stabilizer Limit Output (smax).  Typical Value = 0.1.
     */
    private Double smax; // PU

    public Double getSmax() {
        return smax;
    }

    public void setSmax(Double _value_) {
        smax = _value_;
    }

    private static Object getSmax(BaseClass _this_) {
        return ((ExcELIN1) _this_).getSmax();
    }

    private static void setSmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN1) _this_).setSmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN1) _this_).setSmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Current transducer time constant (Tfi).  Typical Value = 0.
     */
    private Double tfi; // Seconds

    public Double getTfi() {
        return tfi;
    }

    public void setTfi(Double _value_) {
        tfi = _value_;
    }

    private static Object getTfi(BaseClass _this_) {
        return ((ExcELIN1) _this_).getTfi();
    }

    private static void setTfi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN1) _this_).setTfi((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN1) _this_).setTfi(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Controller reset time constant (Tnu).  Typical Value = 2.
     */
    private Double tnu; // Seconds

    public Double getTnu() {
        return tnu;
    }

    public void setTnu(Double _value_) {
        tnu = _value_;
    }

    private static Object getTnu(BaseClass _this_) {
        return ((ExcELIN1) _this_).getTnu();
    }

    private static void setTnu(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN1) _this_).setTnu((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN1) _this_).setTnu(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Stabilizer Phase Lag Time Constant (Ts1).  Typical Value = 1.
     */
    private Double ts1; // Seconds

    public Double getTs1() {
        return ts1;
    }

    public void setTs1(Double _value_) {
        ts1 = _value_;
    }

    private static Object getTs1(BaseClass _this_) {
        return ((ExcELIN1) _this_).getTs1();
    }

    private static void setTs1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN1) _this_).setTs1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN1) _this_).setTs1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Stabilizer Filter Time Constant (Ts2).  Typical Value = 1.
     */
    private Double ts2; // Seconds

    public Double getTs2() {
        return ts2;
    }

    public void setTs2(Double _value_) {
        ts2 = _value_;
    }

    private static Object getTs2(BaseClass _this_) {
        return ((ExcELIN1) _this_).getTs2();
    }

    private static void setTs2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN1) _this_).setTs2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN1) _this_).setTs2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Stabilizer parameters (Tsw).  Typical Value = 3.
     */
    private Double tsw; // Seconds

    public Double getTsw() {
        return tsw;
    }

    public void setTsw(Double _value_) {
        tsw = _value_;
    }

    private static Object getTsw(BaseClass _this_) {
        return ((ExcELIN1) _this_).getTsw();
    }

    private static void setTsw(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN1) _this_).setTsw((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN1) _this_).setTsw(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Current controller gain (Vpi).  Typical Value = 12.45.
     */
    private Double vpi; // PU

    public Double getVpi() {
        return vpi;
    }

    public void setVpi(Double _value_) {
        vpi = _value_;
    }

    private static Object getVpi(BaseClass _this_) {
        return ((ExcELIN1) _this_).getVpi();
    }

    private static void setVpi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN1) _this_).setVpi((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN1) _this_).setVpi(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Controller follow up gain (Vpnf).  Typical Value = 2.
     */
    private Double vpnf; // PU

    public Double getVpnf() {
        return vpnf;
    }

    public void setVpnf(Double _value_) {
        vpnf = _value_;
    }

    private static Object getVpnf(BaseClass _this_) {
        return ((ExcELIN1) _this_).getVpnf();
    }

    private static void setVpnf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN1) _this_).setVpnf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN1) _this_).setVpnf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage controller proportional gain (Vpu).  Typical Value = 34.5.
     */
    private Double vpu; // PU

    public Double getVpu() {
        return vpu;
    }

    public void setVpu(Double _value_) {
        vpu = _value_;
    }

    private static Object getVpu(BaseClass _this_) {
        return ((ExcELIN1) _this_).getVpu();
    }

    private static void setVpu(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN1) _this_).setVpu((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN1) _this_).setVpu(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Excitation transformer effective reactance (Xe) (>=0).  Xe represents the regulation of the transformer/rectifier unit.  Typical Value = 0.06.
     */
    private Double xe; // PU

    public Double getXe() {
        return xe;
    }

    public void setXe(Double _value_) {
        xe = _value_;
    }

    private static Object getXe(BaseClass _this_) {
        return ((ExcELIN1) _this_).getXe();
    }

    private static void setXe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcELIN1) _this_).setXe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcELIN1) _this_).setXe(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcELIN1", attrName));
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
                "ExcELIN1", attrName, value));
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
            map.put("dpnf", new AttrDetails("ExcELIN1.dpnf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::getDpnf, ExcELIN1::setDpnf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efmax", new AttrDetails("ExcELIN1.efmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::getEfmax, ExcELIN1::setEfmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efmin", new AttrDetails("ExcELIN1.efmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::getEfmin, ExcELIN1::setEfmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks1", new AttrDetails("ExcELIN1.ks1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::getKs1, ExcELIN1::setKs1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks2", new AttrDetails("ExcELIN1.ks2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::getKs2, ExcELIN1::setKs2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("smax", new AttrDetails("ExcELIN1.smax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::getSmax, ExcELIN1::setSmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tfi", new AttrDetails("ExcELIN1.tfi", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::getTfi, ExcELIN1::setTfi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tnu", new AttrDetails("ExcELIN1.tnu", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::getTnu, ExcELIN1::setTnu));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ts1", new AttrDetails("ExcELIN1.ts1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::getTs1, ExcELIN1::setTs1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ts2", new AttrDetails("ExcELIN1.ts2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::getTs2, ExcELIN1::setTs2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tsw", new AttrDetails("ExcELIN1.tsw", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::getTsw, ExcELIN1::setTsw));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vpi", new AttrDetails("ExcELIN1.vpi", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::getVpi, ExcELIN1::setVpi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vpnf", new AttrDetails("ExcELIN1.vpnf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::getVpnf, ExcELIN1::setVpnf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vpu", new AttrDetails("ExcELIN1.vpu", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::getVpu, ExcELIN1::setVpu));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xe", new AttrDetails("ExcELIN1.xe", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::getXe, ExcELIN1::setXe));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcELIN1(null).allAttrDetailsMap());
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
