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
 * Static PI transformer fed excitation system ELIN (VATECH) - simplified model.  This model represents an all-static excitation system. A PI voltage controller establishes a desired field current set point for a proportional current controller. The integrator of the PI controller has a follow-up input to match its signal to the present field current.  A power system stabilizer with power input is included in the model.
 */
@SuppressWarnings("unused")
public class ExcELIN1 extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcELIN1.class);

    /**
     * Default constructor.
     */
    public ExcELIN1() {
        setCimType("ExcELIN1");
    }

    /**
     * Controller follow up deadband (&lt;i&gt;Dpnf&lt;/i&gt;).  Typical value = 0.
     */
    private Double dpnf; // PU

    public Double getDpnf() {
        return dpnf;
    }

    public void setDpnf(Double _value_) {
        dpnf = _value_;
    }

    public void setDpnf(String _value_) {
        dpnf = getDoubleFromString(_value_);
    }

    public String dpnfToString() {
        return dpnf != null ? dpnf.toString() : null;
    }

    /**
     * Maximum open circuit excitation voltage (&lt;i&gt;Efmax&lt;/i&gt;) (&amp;gt; ExcELIN1.efmin).  Typical value = 5.
     */
    private Double efmax; // PU

    public Double getEfmax() {
        return efmax;
    }

    public void setEfmax(Double _value_) {
        efmax = _value_;
    }

    public void setEfmax(String _value_) {
        efmax = getDoubleFromString(_value_);
    }

    public String efmaxToString() {
        return efmax != null ? efmax.toString() : null;
    }

    /**
     * Minimum open circuit excitation voltage (&lt;i&gt;Efmin&lt;/i&gt;) (&amp;lt; ExcELIN1.efmax).  Typical value = -5.
     */
    private Double efmin; // PU

    public Double getEfmin() {
        return efmin;
    }

    public void setEfmin(Double _value_) {
        efmin = _value_;
    }

    public void setEfmin(String _value_) {
        efmin = getDoubleFromString(_value_);
    }

    public String efminToString() {
        return efmin != null ? efmin.toString() : null;
    }

    /**
     * Stabilizer gain 1 (&lt;i&gt;Ks1&lt;/i&gt;).  Typical value = 0.
     */
    private Double ks1; // PU

    public Double getKs1() {
        return ks1;
    }

    public void setKs1(Double _value_) {
        ks1 = _value_;
    }

    public void setKs1(String _value_) {
        ks1 = getDoubleFromString(_value_);
    }

    public String ks1ToString() {
        return ks1 != null ? ks1.toString() : null;
    }

    /**
     * Stabilizer gain 2 (&lt;i&gt;Ks2&lt;/i&gt;).  Typical value = 0.
     */
    private Double ks2; // PU

    public Double getKs2() {
        return ks2;
    }

    public void setKs2(Double _value_) {
        ks2 = _value_;
    }

    public void setKs2(String _value_) {
        ks2 = getDoubleFromString(_value_);
    }

    public String ks2ToString() {
        return ks2 != null ? ks2.toString() : null;
    }

    /**
     * Stabilizer limit output (&lt;i&gt;smax&lt;/i&gt;).  Typical value = 0,1.
     */
    private Double smax; // PU

    public Double getSmax() {
        return smax;
    }

    public void setSmax(Double _value_) {
        smax = _value_;
    }

    public void setSmax(String _value_) {
        smax = getDoubleFromString(_value_);
    }

    public String smaxToString() {
        return smax != null ? smax.toString() : null;
    }

    /**
     * Current transducer time constant (&lt;i&gt;Tfi&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double tfi; // Seconds

    public Double getTfi() {
        return tfi;
    }

    public void setTfi(Double _value_) {
        tfi = _value_;
    }

    public void setTfi(String _value_) {
        tfi = getDoubleFromString(_value_);
    }

    public String tfiToString() {
        return tfi != null ? tfi.toString() : null;
    }

    /**
     * Controller reset time constant (&lt;i&gt;Tnu&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 2.
     */
    private Double tnu; // Seconds

    public Double getTnu() {
        return tnu;
    }

    public void setTnu(Double _value_) {
        tnu = _value_;
    }

    public void setTnu(String _value_) {
        tnu = getDoubleFromString(_value_);
    }

    public String tnuToString() {
        return tnu != null ? tnu.toString() : null;
    }

    /**
     * Stabilizer phase lag time constant (&lt;i&gt;Ts1&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 1.
     */
    private Double ts1; // Seconds

    public Double getTs1() {
        return ts1;
    }

    public void setTs1(Double _value_) {
        ts1 = _value_;
    }

    public void setTs1(String _value_) {
        ts1 = getDoubleFromString(_value_);
    }

    public String ts1ToString() {
        return ts1 != null ? ts1.toString() : null;
    }

    /**
     * Stabilizer filter time constant (&lt;i&gt;Ts2&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 1.
     */
    private Double ts2; // Seconds

    public Double getTs2() {
        return ts2;
    }

    public void setTs2(Double _value_) {
        ts2 = _value_;
    }

    public void setTs2(String _value_) {
        ts2 = getDoubleFromString(_value_);
    }

    public String ts2ToString() {
        return ts2 != null ? ts2.toString() : null;
    }

    /**
     * Stabilizer parameters (&lt;i&gt;Tsw&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 3.
     */
    private Double tsw; // Seconds

    public Double getTsw() {
        return tsw;
    }

    public void setTsw(Double _value_) {
        tsw = _value_;
    }

    public void setTsw(String _value_) {
        tsw = getDoubleFromString(_value_);
    }

    public String tswToString() {
        return tsw != null ? tsw.toString() : null;
    }

    /**
     * Current controller gain (&lt;i&gt;Vpi&lt;/i&gt;).  Typical value = 12,45.
     */
    private Double vpi; // PU

    public Double getVpi() {
        return vpi;
    }

    public void setVpi(Double _value_) {
        vpi = _value_;
    }

    public void setVpi(String _value_) {
        vpi = getDoubleFromString(_value_);
    }

    public String vpiToString() {
        return vpi != null ? vpi.toString() : null;
    }

    /**
     * Controller follow up gain (&lt;i&gt;Vpnf&lt;/i&gt;).  Typical value = 2.
     */
    private Double vpnf; // PU

    public Double getVpnf() {
        return vpnf;
    }

    public void setVpnf(Double _value_) {
        vpnf = _value_;
    }

    public void setVpnf(String _value_) {
        vpnf = getDoubleFromString(_value_);
    }

    public String vpnfToString() {
        return vpnf != null ? vpnf.toString() : null;
    }

    /**
     * Voltage controller proportional gain (&lt;i&gt;Vpu&lt;/i&gt;).  Typical value = 34,5.
     */
    private Double vpu; // PU

    public Double getVpu() {
        return vpu;
    }

    public void setVpu(Double _value_) {
        vpu = _value_;
    }

    public void setVpu(String _value_) {
        vpu = getDoubleFromString(_value_);
    }

    public String vpuToString() {
        return vpu != null ? vpu.toString() : null;
    }

    /**
     * Excitation transformer effective reactance (&lt;i&gt;Xe&lt;/i&gt;) (&amp;gt;= 0).  &lt;i&gt;Xe&lt;/i&gt; represents the regulation of the transformer/rectifier unit.  Typical value = 0,06.
     */
    private Double xe; // PU

    public Double getXe() {
        return xe;
    }

    public void setXe(Double _value_) {
        xe = _value_;
    }

    public void setXe(String _value_) {
        xe = getDoubleFromString(_value_);
    }

    public String xeToString() {
        return xe != null ? xe.toString() : null;
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
        return getAttribute("ExcELIN1", attrName);
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
        setAttribute("ExcELIN1", attrName, objectValue);
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
        setAttribute("ExcELIN1", attrName, stringValue);
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

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/CIM100#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dpnf", new AttrDetails("ExcELIN1.dpnf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efmax", new AttrDetails("ExcELIN1.efmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efmin", new AttrDetails("ExcELIN1.efmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks1", new AttrDetails("ExcELIN1.ks1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks2", new AttrDetails("ExcELIN1.ks2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("smax", new AttrDetails("ExcELIN1.smax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tfi", new AttrDetails("ExcELIN1.tfi", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tnu", new AttrDetails("ExcELIN1.tnu", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ts1", new AttrDetails("ExcELIN1.ts1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ts2", new AttrDetails("ExcELIN1.ts2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tsw", new AttrDetails("ExcELIN1.tsw", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vpi", new AttrDetails("ExcELIN1.vpi", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vpnf", new AttrDetails("ExcELIN1.vpnf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vpu", new AttrDetails("ExcELIN1.vpu", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xe", new AttrDetails("ExcELIN1.xe", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcELIN1().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("dpnf", new GetterSetter(this::dpnfToString, null, this::setDpnf));
        map.put("efmax", new GetterSetter(this::efmaxToString, null, this::setEfmax));
        map.put("efmin", new GetterSetter(this::efminToString, null, this::setEfmin));
        map.put("ks1", new GetterSetter(this::ks1ToString, null, this::setKs1));
        map.put("ks2", new GetterSetter(this::ks2ToString, null, this::setKs2));
        map.put("smax", new GetterSetter(this::smaxToString, null, this::setSmax));
        map.put("tfi", new GetterSetter(this::tfiToString, null, this::setTfi));
        map.put("tnu", new GetterSetter(this::tnuToString, null, this::setTnu));
        map.put("ts1", new GetterSetter(this::ts1ToString, null, this::setTs1));
        map.put("ts2", new GetterSetter(this::ts2ToString, null, this::setTs2));
        map.put("tsw", new GetterSetter(this::tswToString, null, this::setTsw));
        map.put("vpi", new GetterSetter(this::vpiToString, null, this::setVpi));
        map.put("vpnf", new GetterSetter(this::vpnfToString, null, this::setVpnf));
        map.put("vpu", new GetterSetter(this::vpuToString, null, this::setVpu));
        map.put("xe", new GetterSetter(this::xeToString, null, this::setXe));
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
