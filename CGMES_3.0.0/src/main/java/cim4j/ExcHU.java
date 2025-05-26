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
 * Hungarian excitation system, with built-in voltage transducer.
 */
@SuppressWarnings("unused")
public class ExcHU extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcHU.class);

    /**
     * Constructor.
     */
    public ExcHU(String rdfid) {
        super("ExcHU", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcHU(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Major loop PI tag gain factor (<i>Ae</i>).  Typical value = 3.
     */
    private Double ae; // PU

    public Double getAe() {
        return ae;
    }

    public void setAe(Double _value_) {
        ae = _value_;
    }

    private static Object getAe(BaseClass _this_) {
        return ((ExcHU) _this_).getAe();
    }

    private static void setAe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcHU) _this_).setAe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcHU) _this_).setAe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minor loop PI tag gain factor (<i>Ai</i>).  Typical value = 22.
     */
    private Double ai; // PU

    public Double getAi() {
        return ai;
    }

    public void setAi(Double _value_) {
        ai = _value_;
    }

    private static Object getAi(BaseClass _this_) {
        return ((ExcHU) _this_).getAi();
    }

    private static void setAi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcHU) _this_).setAi((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcHU) _this_).setAi(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * AVR constant (<i>Atr</i>).  Typical value = 2,19.
     */
    private Double atr; // PU

    public Double getAtr() {
        return atr;
    }

    public void setAtr(Double _value_) {
        atr = _value_;
    }

    private static Object getAtr(BaseClass _this_) {
        return ((ExcHU) _this_).getAtr();
    }

    private static void setAtr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcHU) _this_).setAtr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcHU) _this_).setAtr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Field voltage control signal upper limit on AVR base (<i>Emax</i>) (&gt; ExcHU.emin).  Typical value = 0,996.
     */
    private Double emax; // PU

    public Double getEmax() {
        return emax;
    }

    public void setEmax(Double _value_) {
        emax = _value_;
    }

    private static Object getEmax(BaseClass _this_) {
        return ((ExcHU) _this_).getEmax();
    }

    private static void setEmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcHU) _this_).setEmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcHU) _this_).setEmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Field voltage control signal lower limit on AVR base (<i>Emin</i>) (&lt; ExcHU.emax).  Typical value = -0,866.
     */
    private Double emin; // PU

    public Double getEmin() {
        return emin;
    }

    public void setEmin(Double _value_) {
        emin = _value_;
    }

    private static Object getEmin(BaseClass _this_) {
        return ((ExcHU) _this_).getEmin();
    }

    private static void setEmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcHU) _this_).setEmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcHU) _this_).setEmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Major loop PI tag output signal upper limit (<i>Imax</i>) (&gt; ExcHU.imin).  Typical value = 2,19.
     */
    private Double imax; // PU

    public Double getImax() {
        return imax;
    }

    public void setImax(Double _value_) {
        imax = _value_;
    }

    private static Object getImax(BaseClass _this_) {
        return ((ExcHU) _this_).getImax();
    }

    private static void setImax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcHU) _this_).setImax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcHU) _this_).setImax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Major loop PI tag output signal lower limit (<i>Imin</i>) (&lt; ExcHU.imax).  Typical value = 0,1.
     */
    private Double imin; // PU

    public Double getImin() {
        return imin;
    }

    public void setImin(Double _value_) {
        imin = _value_;
    }

    private static Object getImin(BaseClass _this_) {
        return ((ExcHU) _this_).getImin();
    }

    private static void setImin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcHU) _this_).setImin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcHU) _this_).setImin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage base conversion constant (<i>Ke</i>).  Typical value = 4,666.
     */
    private Float ke; // Float

    public Float getKe() {
        return ke;
    }

    public void setKe(Float _value_) {
        ke = _value_;
    }

    private static Object getKe(BaseClass _this_) {
        return ((ExcHU) _this_).getKe();
    }

    private static void setKe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExcHU) _this_).setKe((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExcHU) _this_).setKe(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Current base conversion constant (<i>Ki</i>).  Typical value = 0,21428.
     */
    private Float ki; // Float

    public Float getKi() {
        return ki;
    }

    public void setKi(Float _value_) {
        ki = _value_;
    }

    private static Object getKi(BaseClass _this_) {
        return ((ExcHU) _this_).getKi();
    }

    private static void setKi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExcHU) _this_).setKi((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExcHU) _this_).setKi(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Major loop PI tag integration time constant (<i>Te</i>) (&gt;= 0).  Typical value = 0,154.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    private static Object getTe(BaseClass _this_) {
        return ((ExcHU) _this_).getTe();
    }

    private static void setTe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcHU) _this_).setTe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcHU) _this_).setTe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minor loop PI control tag integration time constant (<i>Ti</i>) (&gt;= 0).  Typical value = 0,01333.
     */
    private Double ti; // Seconds

    public Double getTi() {
        return ti;
    }

    public void setTi(Double _value_) {
        ti = _value_;
    }

    private static Object getTi(BaseClass _this_) {
        return ((ExcHU) _this_).getTi();
    }

    private static void setTi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcHU) _this_).setTi((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcHU) _this_).setTi(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter time constant (<i>Tr</i>) (&gt;= 0). If a voltage compensator is used in conjunction with this excitation system model, <i>Tr </i>should be set to 0.  Typical value = 0,01.
     */
    private Double tr; // Seconds

    public Double getTr() {
        return tr;
    }

    public void setTr(Double _value_) {
        tr = _value_;
    }

    private static Object getTr(BaseClass _this_) {
        return ((ExcHU) _this_).getTr();
    }

    private static void setTr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcHU) _this_).setTr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcHU) _this_).setTr(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcHU", attrName));
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
                "ExcHU", attrName, value));
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
            map.put("ae", new AttrDetails("ExcHU.ae", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcHU::getAe, ExcHU::setAe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ai", new AttrDetails("ExcHU.ai", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcHU::getAi, ExcHU::setAi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("atr", new AttrDetails("ExcHU.atr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcHU::getAtr, ExcHU::setAtr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("emax", new AttrDetails("ExcHU.emax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcHU::getEmax, ExcHU::setEmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("emin", new AttrDetails("ExcHU.emin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcHU::getEmin, ExcHU::setEmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("imax", new AttrDetails("ExcHU.imax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcHU::getImax, ExcHU::setImax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("imin", new AttrDetails("ExcHU.imin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcHU::getImin, ExcHU::setImin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcHU.ke", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcHU::getKe, ExcHU::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("ExcHU.ki", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcHU::getKi, ExcHU::setKi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcHU.te", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcHU::getTe, ExcHU::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti", new AttrDetails("ExcHU.ti", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcHU::getTi, ExcHU::setTi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tr", new AttrDetails("ExcHU.tr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcHU::getTr, ExcHU::setTr));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcHU(null).allAttrDetailsMap());
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
