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
 * IEEE 421.5-2005 type ST6B model. This model consists of a PI voltage regulator with an inner loop field voltage regulator and pre-control. The field voltage regulator implements a proportional control. The pre-control and the delay in the feedback circuit increase the dynamic response. Reference: IEEE 421.5-2005, 7.6.
 */
@SuppressWarnings("unused")
public class ExcIEEEST6B extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcIEEEST6B.class);

    /**
     * Constructor.
     */
    public ExcIEEEST6B(String rdfid) {
        super("ExcIEEEST6B", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcIEEEST6B(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Exciter output current limit reference (<i>I</i><i><sub>LR</sub></i>) (&gt; 0).  Typical value = 4,164.
     */
    private Double ilr; // PU

    public Double getIlr() {
        return ilr;
    }

    public void setIlr(Double _value_) {
        ilr = _value_;
    }

    private static Object getIlr(BaseClass _this_) {
        return ((ExcIEEEST6B) _this_).getIlr();
    }

    private static void setIlr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST6B) _this_).setIlr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST6B) _this_).setIlr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter output current limit adjustment (<i>K</i><i><sub>CI</sub></i>) (&gt; 0).  Typical value = 1,0577.
     */
    private Double kci; // PU

    public Double getKci() {
        return kci;
    }

    public void setKci(Double _value_) {
        kci = _value_;
    }

    private static Object getKci(BaseClass _this_) {
        return ((ExcIEEEST6B) _this_).getKci();
    }

    private static void setKci(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST6B) _this_).setKci((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST6B) _this_).setKci(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Pre-control gain constant of the inner loop field regulator (<i>K</i><i><sub>FF</sub></i>). Typical value = 1.
     */
    private Double kff; // PU

    public Double getKff() {
        return kff;
    }

    public void setKff(Double _value_) {
        kff = _value_;
    }

    private static Object getKff(BaseClass _this_) {
        return ((ExcIEEEST6B) _this_).getKff();
    }

    private static void setKff(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST6B) _this_).setKff((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST6B) _this_).setKff(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Feedback gain constant of the inner loop field regulator (<i>K</i><i><sub>G</sub></i>) (&gt;= 0).  Typical value = 1.
     */
    private Double kg; // PU

    public Double getKg() {
        return kg;
    }

    public void setKg(Double _value_) {
        kg = _value_;
    }

    private static Object getKg(BaseClass _this_) {
        return ((ExcIEEEST6B) _this_).getKg();
    }

    private static void setKg(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST6B) _this_).setKg((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST6B) _this_).setKg(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator integral gain (<i>K</i><i><sub>IA</sub></i>) (&gt; 0).  Typical value = 45,094.
     */
    private Double kia; // PU

    public Double getKia() {
        return kia;
    }

    public void setKia(Double _value_) {
        kia = _value_;
    }

    private static Object getKia(BaseClass _this_) {
        return ((ExcIEEEST6B) _this_).getKia();
    }

    private static void setKia(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST6B) _this_).setKia((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST6B) _this_).setKia(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter output current limiter gain (<i>K</i><i><sub>LR</sub></i>) (&gt; 0).  Typical value = 17,33.
     */
    private Double klr; // PU

    public Double getKlr() {
        return klr;
    }

    public void setKlr(Double _value_) {
        klr = _value_;
    }

    private static Object getKlr(BaseClass _this_) {
        return ((ExcIEEEST6B) _this_).getKlr();
    }

    private static void setKlr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST6B) _this_).setKlr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST6B) _this_).setKlr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Forward gain constant of the inner loop field regulator (<i>K</i><i><sub>M</sub></i>).  Typical value = 1.
     */
    private Double km; // PU

    public Double getKm() {
        return km;
    }

    public void setKm(Double _value_) {
        km = _value_;
    }

    private static Object getKm(BaseClass _this_) {
        return ((ExcIEEEST6B) _this_).getKm();
    }

    private static void setKm(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST6B) _this_).setKm((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST6B) _this_).setKm(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator proportional gain (<u>K</u><u><sub>PA</sub></u>) (&gt; 0).  Typical value = 18,038.
     */
    private Double kpa; // PU

    public Double getKpa() {
        return kpa;
    }

    public void setKpa(Double _value_) {
        kpa = _value_;
    }

    private static Object getKpa(BaseClass _this_) {
        return ((ExcIEEEST6B) _this_).getKpa();
    }

    private static void setKpa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST6B) _this_).setKpa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST6B) _this_).setKpa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * OEL input selector (<i>OELin</i>). Typical value = noOELinput.
     */
    private String oelin; // ExcST6BOELselectorKind

    public String getOelin() {
        return oelin;
    }

    public void setOelin(String _value_) {
        oelin = _value_;
    }

    private static Object getOelin(BaseClass _this_) {
        return ((ExcIEEEST6B) _this_).getOelin();
    }

    private static void setOelin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ExcIEEEST6B) _this_).setOelin((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Feedback time constant of inner loop field voltage regulator (<i>T</i><i><sub>G</sub></i>) (&gt;= 0). Typical value = 0,02.
     */
    private Double tg; // Seconds

    public Double getTg() {
        return tg;
    }

    public void setTg(Double _value_) {
        tg = _value_;
    }

    private static Object getTg(BaseClass _this_) {
        return ((ExcIEEEST6B) _this_).getTg();
    }

    private static void setTg(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST6B) _this_).setTg((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST6B) _this_).setTg(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage regulator output (V<i><sub>AMAX</sub></i>) (&gt; 0).  Typical value = 4,81.
     */
    private Double vamax; // PU

    public Double getVamax() {
        return vamax;
    }

    public void setVamax(Double _value_) {
        vamax = _value_;
    }

    private static Object getVamax(BaseClass _this_) {
        return ((ExcIEEEST6B) _this_).getVamax();
    }

    private static void setVamax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST6B) _this_).setVamax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST6B) _this_).setVamax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator output (<i>V</i><i><sub>AMIN</sub></i>) (&lt; 0).  Typical value = -3,85.
     */
    private Double vamin; // PU

    public Double getVamin() {
        return vamin;
    }

    public void setVamin(Double _value_) {
        vamin = _value_;
    }

    private static Object getVamin(BaseClass _this_) {
        return ((ExcIEEEST6B) _this_).getVamin();
    }

    private static void setVamin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST6B) _this_).setVamin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST6B) _this_).setVamin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage regulator output (<i>V</i><i><sub>RMAX</sub></i>) (&gt; 0).  Typical value = 4,81.
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    private static Object getVrmax(BaseClass _this_) {
        return ((ExcIEEEST6B) _this_).getVrmax();
    }

    private static void setVrmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST6B) _this_).setVrmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST6B) _this_).setVrmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator output (<i>V</i><i><sub>RMIN</sub></i>) (&lt; 0).  Typical value = -3,85.
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    private static Object getVrmin(BaseClass _this_) {
        return ((ExcIEEEST6B) _this_).getVrmin();
    }

    private static void setVrmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEST6B) _this_).setVrmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEST6B) _this_).setVrmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcIEEEST6B", attrName));
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
                "ExcIEEEST6B", attrName, value));
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
            map.put("ilr", new AttrDetails("ExcIEEEST6B.ilr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST6B::getIlr, ExcIEEEST6B::setIlr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kci", new AttrDetails("ExcIEEEST6B.kci", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST6B::getKci, ExcIEEEST6B::setKci));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kff", new AttrDetails("ExcIEEEST6B.kff", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST6B::getKff, ExcIEEEST6B::setKff));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kg", new AttrDetails("ExcIEEEST6B.kg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST6B::getKg, ExcIEEEST6B::setKg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kia", new AttrDetails("ExcIEEEST6B.kia", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST6B::getKia, ExcIEEEST6B::setKia));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("klr", new AttrDetails("ExcIEEEST6B.klr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST6B::getKlr, ExcIEEEST6B::setKlr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("km", new AttrDetails("ExcIEEEST6B.km", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST6B::getKm, ExcIEEEST6B::setKm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpa", new AttrDetails("ExcIEEEST6B.kpa", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST6B::getKpa, ExcIEEEST6B::setKpa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("oelin", new AttrDetails("ExcIEEEST6B.oelin", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, ExcIEEEST6B::getOelin, ExcIEEEST6B::setOelin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tg", new AttrDetails("ExcIEEEST6B.tg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST6B::getTg, ExcIEEEST6B::setTg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vamax", new AttrDetails("ExcIEEEST6B.vamax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST6B::getVamax, ExcIEEEST6B::setVamax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vamin", new AttrDetails("ExcIEEEST6B.vamin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST6B::getVamin, ExcIEEEST6B::setVamin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcIEEEST6B.vrmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST6B::getVrmax, ExcIEEEST6B::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcIEEEST6B.vrmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEST6B::getVrmin, ExcIEEEST6B::setVrmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcIEEEST6B(null).allAttrDetailsMap());
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
