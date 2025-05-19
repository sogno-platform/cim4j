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
 * Modified IEEE AC8B alternator-supplied rectifier excitation system with speed input and input limiter.
 */
@SuppressWarnings("unused")
public class ExcAC8B extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcAC8B.class);

    /**
     * Default constructor.
     */
    public ExcAC8B() {
        setCimType("ExcAC8B");
    }

    /**
     * Input limiter indicator. true = input limiter &lt;i&gt;Vimax&lt;/i&gt; and &lt;i&gt;Vimin&lt;/i&gt; is considered false = input limiter &lt;i&gt;Vimax &lt;/i&gt;and &lt;i&gt;Vimin&lt;/i&gt; is not considered. Typical value = true.
     */
    private Boolean inlim; // Boolean

    public Boolean getInlim() {
        return inlim;
    }

    public void setInlim(Boolean _value_) {
        inlim = _value_;
    }

    public void setInlim(String _value_) {
        inlim = getBooleanFromString(_value_);
    }

    public String inlimToString() {
        return inlim != null ? inlim.toString() : null;
    }

    /**
     * Voltage regulator gain (&lt;i&gt;Ka&lt;/i&gt;) (&amp;gt; 0).  Typical value = 1.
     */
    private Double ka; // PU

    public Double getKa() {
        return ka;
    }

    public void setKa(Double _value_) {
        ka = _value_;
    }

    public void setKa(String _value_) {
        ka = getDoubleFromString(_value_);
    }

    public String kaToString() {
        return ka != null ? ka.toString() : null;
    }

    /**
     * Rectifier loading factor proportional to commutating reactance (&lt;i&gt;Kc&lt;/i&gt;) (&amp;gt;= 0). Typical value = 0,55.
     */
    private Double kc; // PU

    public Double getKc() {
        return kc;
    }

    public void setKc(Double _value_) {
        kc = _value_;
    }

    public void setKc(String _value_) {
        kc = getDoubleFromString(_value_);
    }

    public String kcToString() {
        return kc != null ? kc.toString() : null;
    }

    /**
     * Demagnetizing factor, a function of exciter alternator reactances (&lt;i&gt;Kd&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 1,1.
     */
    private Double kd; // PU

    public Double getKd() {
        return kd;
    }

    public void setKd(Double _value_) {
        kd = _value_;
    }

    public void setKd(String _value_) {
        kd = getDoubleFromString(_value_);
    }

    public String kdToString() {
        return kd != null ? kd.toString() : null;
    }

    /**
     * Voltage regulator derivative gain (&lt;i&gt;Kdr&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 10.
     */
    private Double kdr; // PU

    public Double getKdr() {
        return kdr;
    }

    public void setKdr(Double _value_) {
        kdr = _value_;
    }

    public void setKdr(String _value_) {
        kdr = getDoubleFromString(_value_);
    }

    public String kdrToString() {
        return kdr != null ? kdr.toString() : null;
    }

    /**
     * Exciter constant related to self-excited field (&lt;i&gt;Ke&lt;/i&gt;).  Typical value = 1.
     */
    private Double ke; // PU

    public Double getKe() {
        return ke;
    }

    public void setKe(Double _value_) {
        ke = _value_;
    }

    public void setKe(String _value_) {
        ke = getDoubleFromString(_value_);
    }

    public String keToString() {
        return ke != null ? ke.toString() : null;
    }

    /**
     * Voltage regulator integral gain (&lt;i&gt;Kir&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 5.
     */
    private Double kir; // PU

    public Double getKir() {
        return kir;
    }

    public void setKir(Double _value_) {
        kir = _value_;
    }

    public void setKir(String _value_) {
        kir = getDoubleFromString(_value_);
    }

    public String kirToString() {
        return kir != null ? kir.toString() : null;
    }

    /**
     * Voltage regulator proportional gain (&lt;i&gt;Kpr&lt;/i&gt;) (&amp;gt; 0 if ExcAC8B.kir = 0).  Typical value = 80.
     */
    private Double kpr; // PU

    public Double getKpr() {
        return kpr;
    }

    public void setKpr(Double _value_) {
        kpr = _value_;
    }

    public void setKpr(String _value_) {
        kpr = getDoubleFromString(_value_);
    }

    public String kprToString() {
        return kpr != null ? kpr.toString() : null;
    }

    /**
     * Coefficient to allow different usage of the model-speed coefficient (&lt;i&gt;Ks&lt;/i&gt;).  Typical value = 0.
     */
    private Double ks; // PU

    public Double getKs() {
        return ks;
    }

    public void setKs(Double _value_) {
        ks = _value_;
    }

    public void setKs(String _value_) {
        ks = getDoubleFromString(_value_);
    }

    public String ksToString() {
        return ks != null ? ks.toString() : null;
    }

    /**
     * PID limiter indicator. true = input limiter &lt;i&gt;Vpidmax&lt;/i&gt; and &lt;i&gt;Vpidmin&lt;/i&gt; is considered false = input limiter &lt;i&gt;Vpidmax&lt;/i&gt; and &lt;i&gt;Vpidmin&lt;/i&gt; is not considered. Typical value = true.
     */
    private Boolean pidlim; // Boolean

    public Boolean getPidlim() {
        return pidlim;
    }

    public void setPidlim(Boolean _value_) {
        pidlim = _value_;
    }

    public void setPidlim(String _value_) {
        pidlim = getBooleanFromString(_value_);
    }

    public String pidlimToString() {
        return pidlim != null ? pidlim.toString() : null;
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, &lt;i&gt;Ve&lt;/i&gt;&lt;i&gt;&lt;sub&gt;1&lt;/sub&gt;&lt;/i&gt;, back of commutating reactance (&lt;i&gt;Se[Ve&lt;/i&gt;&lt;i&gt;&lt;sub&gt;1&lt;/sub&gt;&lt;/i&gt;&lt;i&gt;]&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,3.
     */
    private Float seve1; // Float

    public Float getSeve1() {
        return seve1;
    }

    public void setSeve1(Float _value_) {
        seve1 = _value_;
    }

    public void setSeve1(String _value_) {
        seve1 = getFloatFromString(_value_);
    }

    public String seve1ToString() {
        return seve1 != null ? seve1.toString() : null;
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, &lt;i&gt;Ve&lt;/i&gt;&lt;i&gt;&lt;sub&gt;2&lt;/sub&gt;&lt;/i&gt;, back of commutating reactance (&lt;i&gt;Se[Ve&lt;/i&gt;&lt;i&gt;&lt;sub&gt;2&lt;/sub&gt;&lt;/i&gt;&lt;i&gt;]&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 3.
     */
    private Float seve2; // Float

    public Float getSeve2() {
        return seve2;
    }

    public void setSeve2(Float _value_) {
        seve2 = _value_;
    }

    public void setSeve2(String _value_) {
        seve2 = getFloatFromString(_value_);
    }

    public String seve2ToString() {
        return seve2 != null ? seve2.toString() : null;
    }

    /**
     * Voltage regulator time constant (&lt;i&gt;Ta&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    public void setTa(String _value_) {
        ta = getDoubleFromString(_value_);
    }

    public String taToString() {
        return ta != null ? ta.toString() : null;
    }

    /**
     * Lag time constant (&lt;i&gt;Tdr&lt;/i&gt;) (&amp;gt; 0 if ExcAC8B.kdr &amp;gt; 0).  Typical value = 0,1.
     */
    private Double tdr; // Seconds

    public Double getTdr() {
        return tdr;
    }

    public void setTdr(Double _value_) {
        tdr = _value_;
    }

    public void setTdr(String _value_) {
        tdr = getDoubleFromString(_value_);
    }

    public String tdrToString() {
        return tdr != null ? tdr.toString() : null;
    }

    /**
     * Exciter time constant, integration rate associated with exciter control (&lt;i&gt;Te&lt;/i&gt;) (&amp;gt; 0).  Typical value = 1,2.
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
     * Selector for the limiter on the block (&lt;i&gt;1/sTe&lt;/i&gt;).  See diagram for meaning of true and false. Typical value = false.
     */
    private Boolean telim; // Boolean

    public Boolean getTelim() {
        return telim;
    }

    public void setTelim(Boolean _value_) {
        telim = _value_;
    }

    public void setTelim(String _value_) {
        telim = getBooleanFromString(_value_);
    }

    public String telimToString() {
        return telim != null ? telim.toString() : null;
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (&lt;i&gt;Ve&lt;/i&gt;&lt;i&gt;&lt;sub&gt;1&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; 0).  Typical value = 6,5.
     */
    private Double ve1; // PU

    public Double getVe1() {
        return ve1;
    }

    public void setVe1(Double _value_) {
        ve1 = _value_;
    }

    public void setVe1(String _value_) {
        ve1 = getDoubleFromString(_value_);
    }

    public String ve1ToString() {
        return ve1 != null ? ve1.toString() : null;
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (&lt;i&gt;Ve&lt;/i&gt;&lt;i&gt;&lt;sub&gt;2&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; 0).  Typical value = 9.
     */
    private Double ve2; // PU

    public Double getVe2() {
        return ve2;
    }

    public void setVe2(Double _value_) {
        ve2 = _value_;
    }

    public void setVe2(String _value_) {
        ve2 = getDoubleFromString(_value_);
    }

    public String ve2ToString() {
        return ve2 != null ? ve2.toString() : null;
    }

    /**
     * Minimum exciter voltage output (&lt;i&gt;Vemin&lt;/i&gt;) (&amp;lt;= 0).  Typical value = 0.
     */
    private Double vemin; // PU

    public Double getVemin() {
        return vemin;
    }

    public void setVemin(Double _value_) {
        vemin = _value_;
    }

    public void setVemin(String _value_) {
        vemin = getDoubleFromString(_value_);
    }

    public String veminToString() {
        return vemin != null ? vemin.toString() : null;
    }

    /**
     * Exciter field current limit reference (&lt;i&gt;Vfemax&lt;/i&gt;).  Typical value = 6.
     */
    private Double vfemax; // PU

    public Double getVfemax() {
        return vfemax;
    }

    public void setVfemax(Double _value_) {
        vfemax = _value_;
    }

    public void setVfemax(String _value_) {
        vfemax = getDoubleFromString(_value_);
    }

    public String vfemaxToString() {
        return vfemax != null ? vfemax.toString() : null;
    }

    /**
     * Input signal maximum (&lt;i&gt;Vimax&lt;/i&gt;) (&amp;gt; ExcAC8B.vimin).  Typical value = 35.
     */
    private Double vimax; // PU

    public Double getVimax() {
        return vimax;
    }

    public void setVimax(Double _value_) {
        vimax = _value_;
    }

    public void setVimax(String _value_) {
        vimax = getDoubleFromString(_value_);
    }

    public String vimaxToString() {
        return vimax != null ? vimax.toString() : null;
    }

    /**
     * Input signal minimum (&lt;i&gt;Vimin&lt;/i&gt;) (&amp;lt; ExcAC8B.vimax).  Typical value = -10.
     */
    private Double vimin; // PU

    public Double getVimin() {
        return vimin;
    }

    public void setVimin(Double _value_) {
        vimin = _value_;
    }

    public void setVimin(String _value_) {
        vimin = getDoubleFromString(_value_);
    }

    public String viminToString() {
        return vimin != null ? vimin.toString() : null;
    }

    /**
     * PID maximum controller output (&lt;i&gt;Vpidmax&lt;/i&gt;) (&amp;gt; ExcAC8B.vpidmin).  Typical value = 35.
     */
    private Double vpidmax; // PU

    public Double getVpidmax() {
        return vpidmax;
    }

    public void setVpidmax(Double _value_) {
        vpidmax = _value_;
    }

    public void setVpidmax(String _value_) {
        vpidmax = getDoubleFromString(_value_);
    }

    public String vpidmaxToString() {
        return vpidmax != null ? vpidmax.toString() : null;
    }

    /**
     * PID minimum controller output (&lt;i&gt;Vpidmin&lt;/i&gt;) (&amp;lt; ExcAC8B.vpidmax).  Typical value = -10.
     */
    private Double vpidmin; // PU

    public Double getVpidmin() {
        return vpidmin;
    }

    public void setVpidmin(Double _value_) {
        vpidmin = _value_;
    }

    public void setVpidmin(String _value_) {
        vpidmin = getDoubleFromString(_value_);
    }

    public String vpidminToString() {
        return vpidmin != null ? vpidmin.toString() : null;
    }

    /**
     * Maximum voltage regulator output (&lt;i&gt;Vrmax&lt;/i&gt;) (&amp;gt; 0). Typical value = 35.
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    public void setVrmax(String _value_) {
        vrmax = getDoubleFromString(_value_);
    }

    public String vrmaxToString() {
        return vrmax != null ? vrmax.toString() : null;
    }

    /**
     * Minimum voltage regulator output (&lt;i&gt;Vrmin&lt;/i&gt;) (&amp;lt; 0).  Typical value = 0.
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    public void setVrmin(String _value_) {
        vrmin = getDoubleFromString(_value_);
    }

    public String vrminToString() {
        return vrmin != null ? vrmin.toString() : null;
    }

    /**
     * Multiply by generator`s terminal voltage indicator. true =the limits &lt;i&gt;Vrmax&lt;/i&gt; and &lt;i&gt;Vrmin&lt;/i&gt; are multiplied by the generator`s terminal voltage to represent a thyristor power stage fed from the generator terminals false = limits are not multiplied by generator`s terminal voltage.  Typical value = false.
     */
    private Boolean vtmult; // Boolean

    public Boolean getVtmult() {
        return vtmult;
    }

    public void setVtmult(Boolean _value_) {
        vtmult = _value_;
    }

    public void setVtmult(String _value_) {
        vtmult = getBooleanFromString(_value_);
    }

    public String vtmultToString() {
        return vtmult != null ? vtmult.toString() : null;
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
        return getAttribute("ExcAC8B", attrName);
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
        setAttribute("ExcAC8B", attrName, objectValue);
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
        setAttribute("ExcAC8B", attrName, stringValue);
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
            map.put("inlim", new AttrDetails("ExcAC8B.inlim", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("ExcAC8B.ka", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("ExcAC8B.kc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("ExcAC8B.kd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kdr", new AttrDetails("ExcAC8B.kdr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcAC8B.ke", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kir", new AttrDetails("ExcAC8B.kir", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpr", new AttrDetails("ExcAC8B.kpr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks", new AttrDetails("ExcAC8B.ks", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pidlim", new AttrDetails("ExcAC8B.pidlim", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve1", new AttrDetails("ExcAC8B.seve1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve2", new AttrDetails("ExcAC8B.seve2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("ExcAC8B.ta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tdr", new AttrDetails("ExcAC8B.tdr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcAC8B.te", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("telim", new AttrDetails("ExcAC8B.telim", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve1", new AttrDetails("ExcAC8B.ve1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve2", new AttrDetails("ExcAC8B.ve2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vemin", new AttrDetails("ExcAC8B.vemin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vfemax", new AttrDetails("ExcAC8B.vfemax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimax", new AttrDetails("ExcAC8B.vimax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimin", new AttrDetails("ExcAC8B.vimin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vpidmax", new AttrDetails("ExcAC8B.vpidmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vpidmin", new AttrDetails("ExcAC8B.vpidmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcAC8B.vrmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcAC8B.vrmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vtmult", new AttrDetails("ExcAC8B.vtmult", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcAC8B().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("inlim", new GetterSetter(this::inlimToString, null, this::setInlim));
        map.put("ka", new GetterSetter(this::kaToString, null, this::setKa));
        map.put("kc", new GetterSetter(this::kcToString, null, this::setKc));
        map.put("kd", new GetterSetter(this::kdToString, null, this::setKd));
        map.put("kdr", new GetterSetter(this::kdrToString, null, this::setKdr));
        map.put("ke", new GetterSetter(this::keToString, null, this::setKe));
        map.put("kir", new GetterSetter(this::kirToString, null, this::setKir));
        map.put("kpr", new GetterSetter(this::kprToString, null, this::setKpr));
        map.put("ks", new GetterSetter(this::ksToString, null, this::setKs));
        map.put("pidlim", new GetterSetter(this::pidlimToString, null, this::setPidlim));
        map.put("seve1", new GetterSetter(this::seve1ToString, null, this::setSeve1));
        map.put("seve2", new GetterSetter(this::seve2ToString, null, this::setSeve2));
        map.put("ta", new GetterSetter(this::taToString, null, this::setTa));
        map.put("tdr", new GetterSetter(this::tdrToString, null, this::setTdr));
        map.put("te", new GetterSetter(this::teToString, null, this::setTe));
        map.put("telim", new GetterSetter(this::telimToString, null, this::setTelim));
        map.put("ve1", new GetterSetter(this::ve1ToString, null, this::setVe1));
        map.put("ve2", new GetterSetter(this::ve2ToString, null, this::setVe2));
        map.put("vemin", new GetterSetter(this::veminToString, null, this::setVemin));
        map.put("vfemax", new GetterSetter(this::vfemaxToString, null, this::setVfemax));
        map.put("vimax", new GetterSetter(this::vimaxToString, null, this::setVimax));
        map.put("vimin", new GetterSetter(this::viminToString, null, this::setVimin));
        map.put("vpidmax", new GetterSetter(this::vpidmaxToString, null, this::setVpidmax));
        map.put("vpidmin", new GetterSetter(this::vpidminToString, null, this::setVpidmin));
        map.put("vrmax", new GetterSetter(this::vrmaxToString, null, this::setVrmax));
        map.put("vrmin", new GetterSetter(this::vrminToString, null, this::setVrmin));
        map.put("vtmult", new GetterSetter(this::vtmultToString, null, this::setVtmult));
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
