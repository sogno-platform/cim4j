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
 * This is modified old IEEE type 3 excitation system.
 */
@SuppressWarnings("unused")
public class ExcDC3A1 extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcDC3A1.class);

    /**
     * Constructor.
     */
    public ExcDC3A1(String rdfid) {
        super("ExcDC3A1", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcDC3A1(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * (exclim). true = lower limit of zero is applied to integrator output false = lower limit of zero not applied to integrator output. Typical Value = true.
     */
    private Boolean exclim; // Boolean

    public Boolean getExclim() {
        return exclim;
    }

    public void setExclim(Boolean _value_) {
        exclim = _value_;
    }

    private static Object getExclim(BaseClass _this_) {
        return ((ExcDC3A1) _this_).getExclim();
    }

    private static void setExclim(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ExcDC3A1) _this_).setExclim((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A1) _this_).setExclim(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Voltage regulator gain (Ka).  Typical Value = 300.
     */
    private Double ka; // PU

    public Double getKa() {
        return ka;
    }

    public void setKa(Double _value_) {
        ka = _value_;
    }

    private static Object getKa(BaseClass _this_) {
        return ((ExcDC3A1) _this_).getKa();
    }

    private static void setKa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A1) _this_).setKa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A1) _this_).setKa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter constant related to self-excited field (Ke).  Typical Value = 1.
     */
    private Double ke; // PU

    public Double getKe() {
        return ke;
    }

    public void setKe(Double _value_) {
        ke = _value_;
    }

    private static Object getKe(BaseClass _this_) {
        return ((ExcDC3A1) _this_).getKe();
    }

    private static void setKe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A1) _this_).setKe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A1) _this_).setKe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Excitation control system stabilizer gain (Kf).  Typical Value = 0.1.
     */
    private Double kf; // PU

    public Double getKf() {
        return kf;
    }

    public void setKf(Double _value_) {
        kf = _value_;
    }

    private static Object getKf(BaseClass _this_) {
        return ((ExcDC3A1) _this_).getKf();
    }

    private static void setKf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A1) _this_).setKf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A1) _this_).setKf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Potential circuit gain coefficient (Ki).  Typical Value = 4.83.
     */
    private Double ki; // PU

    public Double getKi() {
        return ki;
    }

    public void setKi(Double _value_) {
        ki = _value_;
    }

    private static Object getKi(BaseClass _this_) {
        return ((ExcDC3A1) _this_).getKi();
    }

    private static void setKi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A1) _this_).setKi((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A1) _this_).setKi(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Potential circuit gain coefficient (Kp).  Typical Value = 4.37.
     */
    private Double kp; // PU

    public Double getKp() {
        return kp;
    }

    public void setKp(Double _value_) {
        kp = _value_;
    }

    private static Object getKp(BaseClass _this_) {
        return ((ExcDC3A1) _this_).getKp();
    }

    private static void setKp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A1) _this_).setKp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A1) _this_).setKp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (Ta).  Typical Value = 0.01.
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((ExcDC3A1) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A1) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A1) _this_).setTa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter time constant, integration rate associated with exciter control (Te).  Typical Value = 1.83.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    private static Object getTe(BaseClass _this_) {
        return ((ExcDC3A1) _this_).getTe();
    }

    private static void setTe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A1) _this_).setTe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A1) _this_).setTe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Excitation control system stabilizer time constant (Tf).  Typical Value = 0.675.
     */
    private Double tf; // Seconds

    public Double getTf() {
        return tf;
    }

    public void setTf(Double _value_) {
        tf = _value_;
    }

    private static Object getTf(BaseClass _this_) {
        return ((ExcDC3A1) _this_).getTf();
    }

    private static void setTf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A1) _this_).setTf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A1) _this_).setTf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Available exciter voltage limiter (Vb1max).  Typical Value = 11.63.
     */
    private Double vb1max; // PU

    public Double getVb1max() {
        return vb1max;
    }

    public void setVb1max(Double _value_) {
        vb1max = _value_;
    }

    private static Object getVb1max(BaseClass _this_) {
        return ((ExcDC3A1) _this_).getVb1max();
    }

    private static void setVb1max(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A1) _this_).setVb1max((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A1) _this_).setVb1max(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Vb limiter indicator. true = exciter Vbmax limiter is active false = Vb1max is active.  Typical Value = true.
     */
    private Boolean vblim; // Boolean

    public Boolean getVblim() {
        return vblim;
    }

    public void setVblim(Boolean _value_) {
        vblim = _value_;
    }

    private static Object getVblim(BaseClass _this_) {
        return ((ExcDC3A1) _this_).getVblim();
    }

    private static void setVblim(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ExcDC3A1) _this_).setVblim((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A1) _this_).setVblim(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Available exciter voltage limiter (Vbmax).  Typical Value = 11.63.
     */
    private Double vbmax; // PU

    public Double getVbmax() {
        return vbmax;
    }

    public void setVbmax(Double _value_) {
        vbmax = _value_;
    }

    private static Object getVbmax(BaseClass _this_) {
        return ((ExcDC3A1) _this_).getVbmax();
    }

    private static void setVbmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A1) _this_).setVbmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A1) _this_).setVbmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage regulator output (Vrmax).  Typical Value = 5.
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    private static Object getVrmax(BaseClass _this_) {
        return ((ExcDC3A1) _this_).getVrmax();
    }

    private static void setVrmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A1) _this_).setVrmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A1) _this_).setVrmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator output (Vrmin).  Typical Value = 0.
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    private static Object getVrmin(BaseClass _this_) {
        return ((ExcDC3A1) _this_).getVrmin();
    }

    private static void setVrmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcDC3A1) _this_).setVrmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcDC3A1) _this_).setVrmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcDC3A1", attrName));
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
                "ExcDC3A1", attrName, value));
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
            map.put("exclim", new AttrDetails("ExcDC3A1.exclim", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC3A1::getExclim, ExcDC3A1::setExclim));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("ExcDC3A1.ka", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC3A1::getKa, ExcDC3A1::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcDC3A1.ke", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC3A1::getKe, ExcDC3A1::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("ExcDC3A1.kf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC3A1::getKf, ExcDC3A1::setKf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("ExcDC3A1.ki", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC3A1::getKi, ExcDC3A1::setKi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("ExcDC3A1.kp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC3A1::getKp, ExcDC3A1::setKp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("ExcDC3A1.ta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC3A1::getTa, ExcDC3A1::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcDC3A1.te", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC3A1::getTe, ExcDC3A1::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("ExcDC3A1.tf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC3A1::getTf, ExcDC3A1::setTf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vb1max", new AttrDetails("ExcDC3A1.vb1max", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC3A1::getVb1max, ExcDC3A1::setVb1max));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vblim", new AttrDetails("ExcDC3A1.vblim", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC3A1::getVblim, ExcDC3A1::setVblim));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vbmax", new AttrDetails("ExcDC3A1.vbmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC3A1::getVbmax, ExcDC3A1::setVbmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcDC3A1.vrmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC3A1::getVrmax, ExcDC3A1::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcDC3A1.vrmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcDC3A1::getVrmin, ExcDC3A1::setVrmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcDC3A1(null).allAttrDetailsMap());
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
