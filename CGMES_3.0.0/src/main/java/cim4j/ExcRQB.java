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
 * Excitation system type RQB (four-loop regulator, r?gulateur quatre boucles, developed in France) primarily used in nuclear or thermal generating units. This excitation system shall be always used together with power system stabilizer type PssRQB.
 */
@SuppressWarnings("unused")
public class ExcRQB extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcRQB.class);

    /**
     * Constructor.
     */
    public ExcRQB(String rdfid) {
        super("ExcRQB", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcRQB(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Voltage reference input gain (<i>Ki0</i>).  Typical value = 12,7.
     */
    private Float ki0; // Float

    public Float getKi0() {
        return ki0;
    }

    public void setKi0(Float _value_) {
        ki0 = _value_;
    }

    private static Object getKi0(BaseClass _this_) {
        return ((ExcRQB) _this_).getKi0();
    }

    private static void setKi0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExcRQB) _this_).setKi0((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExcRQB) _this_).setKi0(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Voltage input gain (<i>Ki1</i>).  Typical value = -16,8.
     */
    private Float ki1; // Float

    public Float getKi1() {
        return ki1;
    }

    public void setKi1(Float _value_) {
        ki1 = _value_;
    }

    private static Object getKi1(BaseClass _this_) {
        return ((ExcRQB) _this_).getKi1();
    }

    private static void setKi1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExcRQB) _this_).setKi1((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExcRQB) _this_).setKi1(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * OEL input gain (<i>KLIR</i>).  Typical value = 12,13.
     */
    private Float klir; // Float

    public Float getKlir() {
        return klir;
    }

    public void setKlir(Float _value_) {
        klir = _value_;
    }

    private static Object getKlir(BaseClass _this_) {
        return ((ExcRQB) _this_).getKlir();
    }

    private static void setKlir(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExcRQB) _this_).setKlir((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExcRQB) _this_).setKlir(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Limiter gain (<i>KLUS</i>).  Typical value = 50.
     */
    private Float klus; // Float

    public Float getKlus() {
        return klus;
    }

    public void setKlus(Float _value_) {
        klus = _value_;
    }

    private static Object getKlus(BaseClass _this_) {
        return ((ExcRQB) _this_).getKlus();
    }

    private static void setKlus(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExcRQB) _this_).setKlus((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExcRQB) _this_).setKlus(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Integrator limiter (<i>LSAT</i>).  Typical value = 5,73.
     */
    private Double lsat; // PU

    public Double getLsat() {
        return lsat;
    }

    public void setLsat(Double _value_) {
        lsat = _value_;
    }

    private static Object getLsat(BaseClass _this_) {
        return ((ExcRQB) _this_).getLsat();
    }

    private static void setLsat(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcRQB) _this_).setLsat((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcRQB) _this_).setLsat(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Setpoint (<i>LUS</i>).  Typical value = 0,12.
     */
    private Double lus; // PU

    public Double getLus() {
        return lus;
    }

    public void setLus(Double _value_) {
        lus = _value_;
    }

    private static Object getLus(BaseClass _this_) {
        return ((ExcRQB) _this_).getLus();
    }

    private static void setLus(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcRQB) _this_).setLus((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcRQB) _this_).setLus(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage input time constant (<i>MESU</i>) (&gt;= 0).  Typical value = 0,02.
     */
    private Double mesu; // Seconds

    public Double getMesu() {
        return mesu;
    }

    public void setMesu(Double _value_) {
        mesu = _value_;
    }

    private static Object getMesu(BaseClass _this_) {
        return ((ExcRQB) _this_).getMesu();
    }

    private static void setMesu(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcRQB) _this_).setMesu((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcRQB) _this_).setMesu(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Input time constant (<i>T4M</i>) (&gt;= 0).  Typical value = 5.
     */
    private Double t4m; // Seconds

    public Double getT4m() {
        return t4m;
    }

    public void setT4m(Double _value_) {
        t4m = _value_;
    }

    private static Object getT4m(BaseClass _this_) {
        return ((ExcRQB) _this_).getT4m();
    }

    private static void setT4m(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcRQB) _this_).setT4m((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcRQB) _this_).setT4m(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead lag time constant (<i>TC</i>) (&gt;= 0).  Typical value = 0,02.
     */
    private Double tc; // Seconds

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    private static Object getTc(BaseClass _this_) {
        return ((ExcRQB) _this_).getTc();
    }

    private static void setTc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcRQB) _this_).setTc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcRQB) _this_).setTc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead lag time constant (<i>TE</i>) (&gt;= 0).  Typical value = 0,22.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    private static Object getTe(BaseClass _this_) {
        return ((ExcRQB) _this_).getTe();
    }

    private static void setTe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcRQB) _this_).setTe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcRQB) _this_).setTe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter time constant (<i>TF</i>) (&gt;= 0).  Typical value = 0,01.
     */
    private Double tf; // Seconds

    public Double getTf() {
        return tf;
    }

    public void setTf(Double _value_) {
        tf = _value_;
    }

    private static Object getTf(BaseClass _this_) {
        return ((ExcRQB) _this_).getTf();
    }

    private static void setTf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcRQB) _this_).setTf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcRQB) _this_).setTf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage reference limit (<i>UCMAX</i>) (&gt; ExcRQB.ucmin).  Typical value = 1,1.
     */
    private Double ucmax; // PU

    public Double getUcmax() {
        return ucmax;
    }

    public void setUcmax(Double _value_) {
        ucmax = _value_;
    }

    private static Object getUcmax(BaseClass _this_) {
        return ((ExcRQB) _this_).getUcmax();
    }

    private static void setUcmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcRQB) _this_).setUcmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcRQB) _this_).setUcmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage reference limit (<i>UCMIN</i>) (&lt; ExcRQB.ucmax).  Typical value = 0,9.
     */
    private Double ucmin; // PU

    public Double getUcmin() {
        return ucmin;
    }

    public void setUcmin(Double _value_) {
        ucmin = _value_;
    }

    private static Object getUcmin(BaseClass _this_) {
        return ((ExcRQB) _this_).getUcmin();
    }

    private static void setUcmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcRQB) _this_).setUcmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcRQB) _this_).setUcmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcRQB", attrName));
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
                "ExcRQB", attrName, value));
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
            map.put("ki0", new AttrDetails("ExcRQB.ki0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcRQB::getKi0, ExcRQB::setKi0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki1", new AttrDetails("ExcRQB.ki1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcRQB::getKi1, ExcRQB::setKi1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("klir", new AttrDetails("ExcRQB.klir", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcRQB::getKlir, ExcRQB::setKlir));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("klus", new AttrDetails("ExcRQB.klus", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcRQB::getKlus, ExcRQB::setKlus));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lsat", new AttrDetails("ExcRQB.lsat", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcRQB::getLsat, ExcRQB::setLsat));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lus", new AttrDetails("ExcRQB.lus", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcRQB::getLus, ExcRQB::setLus));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mesu", new AttrDetails("ExcRQB.mesu", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcRQB::getMesu, ExcRQB::setMesu));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4m", new AttrDetails("ExcRQB.t4m", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcRQB::getT4m, ExcRQB::setT4m));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("ExcRQB.tc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcRQB::getTc, ExcRQB::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcRQB.te", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcRQB::getTe, ExcRQB::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("ExcRQB.tf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcRQB::getTf, ExcRQB::setTf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ucmax", new AttrDetails("ExcRQB.ucmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcRQB::getUcmax, ExcRQB::setUcmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ucmin", new AttrDetails("ExcRQB.ucmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcRQB::getUcmin, ExcRQB::setUcmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcRQB(null).allAttrDetailsMap());
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
