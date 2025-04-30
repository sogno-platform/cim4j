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
     * Default constructor.
     */
    public ExcHU() {
        setCimType("ExcHU");
    }

    /**
     * Major loop PI tag gain factor (&lt;i&gt;Ae&lt;/i&gt;).  Typical value = 3.
     */
    private Double ae; // PU

    public Double getAe() {
        return ae;
    }

    public void setAe(Double _value_) {
        ae = _value_;
    }

    public void setAe(String _value_) {
        ae = getDoubleFromString(_value_);
    }

    public String aeToString() {
        return ae != null ? ae.toString() : null;
    }

    /**
     * Minor loop PI tag gain factor (&lt;i&gt;Ai&lt;/i&gt;).  Typical value = 22.
     */
    private Double ai; // PU

    public Double getAi() {
        return ai;
    }

    public void setAi(Double _value_) {
        ai = _value_;
    }

    public void setAi(String _value_) {
        ai = getDoubleFromString(_value_);
    }

    public String aiToString() {
        return ai != null ? ai.toString() : null;
    }

    /**
     * AVR constant (&lt;i&gt;Atr&lt;/i&gt;).  Typical value = 2,19.
     */
    private Double atr; // PU

    public Double getAtr() {
        return atr;
    }

    public void setAtr(Double _value_) {
        atr = _value_;
    }

    public void setAtr(String _value_) {
        atr = getDoubleFromString(_value_);
    }

    public String atrToString() {
        return atr != null ? atr.toString() : null;
    }

    /**
     * Field voltage control signal upper limit on AVR base (&lt;i&gt;Emax&lt;/i&gt;) (&amp;gt; ExcHU.emin).  Typical value = 0,996.
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
     * Field voltage control signal lower limit on AVR base (&lt;i&gt;Emin&lt;/i&gt;) (&amp;lt; ExcHU.emax).  Typical value = -0,866.
     */
    private Double emin; // PU

    public Double getEmin() {
        return emin;
    }

    public void setEmin(Double _value_) {
        emin = _value_;
    }

    public void setEmin(String _value_) {
        emin = getDoubleFromString(_value_);
    }

    public String eminToString() {
        return emin != null ? emin.toString() : null;
    }

    /**
     * Major loop PI tag output signal upper limit (&lt;i&gt;Imax&lt;/i&gt;) (&amp;gt; ExcHU.imin).  Typical value = 2,19.
     */
    private Double imax; // PU

    public Double getImax() {
        return imax;
    }

    public void setImax(Double _value_) {
        imax = _value_;
    }

    public void setImax(String _value_) {
        imax = getDoubleFromString(_value_);
    }

    public String imaxToString() {
        return imax != null ? imax.toString() : null;
    }

    /**
     * Major loop PI tag output signal lower limit (&lt;i&gt;Imin&lt;/i&gt;) (&amp;lt; ExcHU.imax).  Typical value = 0,1.
     */
    private Double imin; // PU

    public Double getImin() {
        return imin;
    }

    public void setImin(Double _value_) {
        imin = _value_;
    }

    public void setImin(String _value_) {
        imin = getDoubleFromString(_value_);
    }

    public String iminToString() {
        return imin != null ? imin.toString() : null;
    }

    /**
     * Voltage base conversion constant (&lt;i&gt;Ke&lt;/i&gt;).  Typical value = 4,666.
     */
    private Float ke; // Float

    public Float getKe() {
        return ke;
    }

    public void setKe(Float _value_) {
        ke = _value_;
    }

    public void setKe(String _value_) {
        ke = getFloatFromString(_value_);
    }

    public String keToString() {
        return ke != null ? ke.toString() : null;
    }

    /**
     * Current base conversion constant (&lt;i&gt;Ki&lt;/i&gt;).  Typical value = 0,21428.
     */
    private Float ki; // Float

    public Float getKi() {
        return ki;
    }

    public void setKi(Float _value_) {
        ki = _value_;
    }

    public void setKi(String _value_) {
        ki = getFloatFromString(_value_);
    }

    public String kiToString() {
        return ki != null ? ki.toString() : null;
    }

    /**
     * Major loop PI tag integration time constant (&lt;i&gt;Te&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,154.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    public void setTe(String _value_) {
        te = getDoubleFromString(_value_);
    }

    public String teToString() {
        return te != null ? te.toString() : null;
    }

    /**
     * Minor loop PI control tag integration time constant (&lt;i&gt;Ti&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,01333.
     */
    private Double ti; // Seconds

    public Double getTi() {
        return ti;
    }

    public void setTi(Double _value_) {
        ti = _value_;
    }

    public void setTi(String _value_) {
        ti = getDoubleFromString(_value_);
    }

    public String tiToString() {
        return ti != null ? ti.toString() : null;
    }

    /**
     * Filter time constant (&lt;i&gt;Tr&lt;/i&gt;) (&amp;gt;= 0). If a voltage compensator is used in conjunction with this excitation system model, &lt;i&gt;Tr &lt;/i&gt;should be set to 0.  Typical value = 0,01.
     */
    private Double tr; // Seconds

    public Double getTr() {
        return tr;
    }

    public void setTr(Double _value_) {
        tr = _value_;
    }

    public void setTr(String _value_) {
        tr = getDoubleFromString(_value_);
    }

    public String trToString() {
        return tr != null ? tr.toString() : null;
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
        return getAttribute("ExcHU", attrName);
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
        setAttribute("ExcHU", attrName, objectValue);
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
        setAttribute("ExcHU", attrName, stringValue);
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
            map.put("ae", new AttrDetails("ExcHU.ae", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ai", new AttrDetails("ExcHU.ai", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("atr", new AttrDetails("ExcHU.atr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("emax", new AttrDetails("ExcHU.emax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("emin", new AttrDetails("ExcHU.emin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("imax", new AttrDetails("ExcHU.imax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("imin", new AttrDetails("ExcHU.imin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcHU.ke", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("ExcHU.ki", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcHU.te", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti", new AttrDetails("ExcHU.ti", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tr", new AttrDetails("ExcHU.tr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcHU().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("ae", new GetterSetter(this::aeToString, null, this::setAe));
        map.put("ai", new GetterSetter(this::aiToString, null, this::setAi));
        map.put("atr", new GetterSetter(this::atrToString, null, this::setAtr));
        map.put("emax", new GetterSetter(this::emaxToString, null, this::setEmax));
        map.put("emin", new GetterSetter(this::eminToString, null, this::setEmin));
        map.put("imax", new GetterSetter(this::imaxToString, null, this::setImax));
        map.put("imin", new GetterSetter(this::iminToString, null, this::setImin));
        map.put("ke", new GetterSetter(this::keToString, null, this::setKe));
        map.put("ki", new GetterSetter(this::kiToString, null, this::setKi));
        map.put("te", new GetterSetter(this::teToString, null, this::setTe));
        map.put("ti", new GetterSetter(this::tiToString, null, this::setTi));
        map.put("tr", new GetterSetter(this::trToString, null, this::setTr));
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
