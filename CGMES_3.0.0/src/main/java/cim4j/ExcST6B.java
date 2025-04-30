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
 * Modified IEEE ST6B static excitation system with PID controller and optional inner feedback loop.
 */
@SuppressWarnings("unused")
public class ExcST6B extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcST6B.class);

    /**
     * Default constructor.
     */
    public ExcST6B() {
        setCimType("ExcST6B");
    }

    /**
     * Exciter output current limit reference (&lt;i&gt;Ilr&lt;/i&gt;) (&amp;gt; 0).  Typical value = 4,164.
     */
    private Double ilr; // PU

    public Double getIlr() {
        return ilr;
    }

    public void setIlr(Double _value_) {
        ilr = _value_;
    }

    public void setIlr(String _value_) {
        ilr = getDoubleFromString(_value_);
    }

    public String ilrToString() {
        return ilr != null ? ilr.toString() : null;
    }

    /**
     * Selector (&lt;i&gt;K1&lt;/i&gt;). true = feedback is from &lt;i&gt;Ifd&lt;/i&gt; false = feedback is not from &lt;i&gt;Ifd&lt;/i&gt;. Typical value = true.
     */
    private Boolean k1; // Boolean

    public Boolean getK1() {
        return k1;
    }

    public void setK1(Boolean _value_) {
        k1 = _value_;
    }

    public void setK1(String _value_) {
        k1 = getBooleanFromString(_value_);
    }

    public String k1ToString() {
        return k1 != null ? k1.toString() : null;
    }

    /**
     * Exciter output current limit adjustment (&lt;i&gt;Kcl&lt;/i&gt;) (&amp;gt; 0).  Typical value = 1,0577.
     */
    private Double kcl; // PU

    public Double getKcl() {
        return kcl;
    }

    public void setKcl(Double _value_) {
        kcl = _value_;
    }

    public void setKcl(String _value_) {
        kcl = getDoubleFromString(_value_);
    }

    public String kclToString() {
        return kcl != null ? kcl.toString() : null;
    }

    /**
     * Pre-control gain constant of the inner loop field regulator (&lt;i&gt;Kff&lt;/i&gt;).  Typical value = 1.
     */
    private Double kff; // PU

    public Double getKff() {
        return kff;
    }

    public void setKff(Double _value_) {
        kff = _value_;
    }

    public void setKff(String _value_) {
        kff = getDoubleFromString(_value_);
    }

    public String kffToString() {
        return kff != null ? kff.toString() : null;
    }

    /**
     * Feedback gain constant of the inner loop field regulator (&lt;i&gt;Kg&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 1.
     */
    private Double kg; // PU

    public Double getKg() {
        return kg;
    }

    public void setKg(Double _value_) {
        kg = _value_;
    }

    public void setKg(String _value_) {
        kg = getDoubleFromString(_value_);
    }

    public String kgToString() {
        return kg != null ? kg.toString() : null;
    }

    /**
     * Voltage regulator integral gain (&lt;i&gt;Kia&lt;/i&gt;) (&amp;gt; 0).  Typical value = 45,094.
     */
    private Double kia; // PU

    public Double getKia() {
        return kia;
    }

    public void setKia(Double _value_) {
        kia = _value_;
    }

    public void setKia(String _value_) {
        kia = getDoubleFromString(_value_);
    }

    public String kiaToString() {
        return kia != null ? kia.toString() : null;
    }

    /**
     * Exciter output current limit adjustment (&lt;i&gt;Kcl&lt;/i&gt;) (&amp;gt; 0).  Typical value = 17,33.
     */
    private Double klr; // PU

    public Double getKlr() {
        return klr;
    }

    public void setKlr(Double _value_) {
        klr = _value_;
    }

    public void setKlr(String _value_) {
        klr = getDoubleFromString(_value_);
    }

    public String klrToString() {
        return klr != null ? klr.toString() : null;
    }

    /**
     * Forward gain constant of the inner loop field regulator (&lt;i&gt;Km&lt;/i&gt;).  Typical value = 1.
     */
    private Double km; // PU

    public Double getKm() {
        return km;
    }

    public void setKm(Double _value_) {
        km = _value_;
    }

    public void setKm(String _value_) {
        km = getDoubleFromString(_value_);
    }

    public String kmToString() {
        return km != null ? km.toString() : null;
    }

    /**
     * Voltage regulator proportional gain (&lt;i&gt;Kpa&lt;/i&gt;) (&amp;gt; 0).  Typical value = 18,038.
     */
    private Double kpa; // PU

    public Double getKpa() {
        return kpa;
    }

    public void setKpa(Double _value_) {
        kpa = _value_;
    }

    public void setKpa(String _value_) {
        kpa = getDoubleFromString(_value_);
    }

    public String kpaToString() {
        return kpa != null ? kpa.toString() : null;
    }

    /**
     * Voltage regulator derivative gain (&lt;i&gt;Kvd&lt;/i&gt;).  Typical value = 0.
     */
    private Double kvd; // PU

    public Double getKvd() {
        return kvd;
    }

    public void setKvd(Double _value_) {
        kvd = _value_;
    }

    public void setKvd(String _value_) {
        kvd = getDoubleFromString(_value_);
    }

    public String kvdToString() {
        return kvd != null ? kvd.toString() : null;
    }

    /**
     * OEL input selector (&lt;i&gt;OELin&lt;/i&gt;).  Typical value = noOELinput (corresponds to &lt;i&gt;OELin&lt;/i&gt; = 0 on diagram).
     */
    private String oelin; // ExcST6BOELselectorKind

    public String getOelin() {
        return oelin;
    }

    public void setOelin(String _value_) {
        oelin = _value_;
    }

    public String oelinToString() {
        return oelin;
    }

    /**
     * Feedback time constant of inner loop field voltage regulator (&lt;i&gt;Tg&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,02.
     */
    private Double tg; // Seconds

    public Double getTg() {
        return tg;
    }

    public void setTg(Double _value_) {
        tg = _value_;
    }

    public void setTg(String _value_) {
        tg = getDoubleFromString(_value_);
    }

    public String tgToString() {
        return tg != null ? tg.toString() : null;
    }

    /**
     * Rectifier firing time constant (&lt;i&gt;Ts&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double ts; // Seconds

    public Double getTs() {
        return ts;
    }

    public void setTs(Double _value_) {
        ts = _value_;
    }

    public void setTs(String _value_) {
        ts = getDoubleFromString(_value_);
    }

    public String tsToString() {
        return ts != null ? ts.toString() : null;
    }

    /**
     * Voltage regulator derivative gain (&lt;i&gt;Tvd&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double tvd; // Seconds

    public Double getTvd() {
        return tvd;
    }

    public void setTvd(Double _value_) {
        tvd = _value_;
    }

    public void setTvd(String _value_) {
        tvd = getDoubleFromString(_value_);
    }

    public String tvdToString() {
        return tvd != null ? tvd.toString() : null;
    }

    /**
     * Maximum voltage regulator output (&lt;i&gt;Vamax&lt;/i&gt;) (&amp;gt; 0).  Typical value = 4,81.
     */
    private Double vamax; // PU

    public Double getVamax() {
        return vamax;
    }

    public void setVamax(Double _value_) {
        vamax = _value_;
    }

    public void setVamax(String _value_) {
        vamax = getDoubleFromString(_value_);
    }

    public String vamaxToString() {
        return vamax != null ? vamax.toString() : null;
    }

    /**
     * Minimum voltage regulator output (&lt;i&gt;Vamin&lt;/i&gt;) (&amp;lt; 0).  Typical value = -3,85.
     */
    private Double vamin; // PU

    public Double getVamin() {
        return vamin;
    }

    public void setVamin(Double _value_) {
        vamin = _value_;
    }

    public void setVamin(String _value_) {
        vamin = getDoubleFromString(_value_);
    }

    public String vaminToString() {
        return vamin != null ? vamin.toString() : null;
    }

    /**
     * Selector (&lt;i&gt;Vilim&lt;/i&gt;). true = &lt;i&gt;Vimin&lt;/i&gt;-&lt;i&gt;Vimax&lt;/i&gt; limiter is active false = &lt;i&gt;Vimin&lt;/i&gt;-&lt;i&gt;Vimax&lt;/i&gt; limiter is not active. Typical value = true.
     */
    private Boolean vilim; // Boolean

    public Boolean getVilim() {
        return vilim;
    }

    public void setVilim(Boolean _value_) {
        vilim = _value_;
    }

    public void setVilim(String _value_) {
        vilim = getBooleanFromString(_value_);
    }

    public String vilimToString() {
        return vilim != null ? vilim.toString() : null;
    }

    /**
     * Maximum voltage regulator input limit (&lt;i&gt;Vimax&lt;/i&gt;) (&amp;gt; ExcST6B.vimin).  Typical value = 10.
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
     * Minimum voltage regulator input limit (&lt;i&gt;Vimin&lt;/i&gt;) (&amp;lt; ExcST6B.vimax).  Typical value = -10.
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
     * Selector (&lt;i&gt;vmult&lt;/i&gt;). true = multiply regulator output by terminal voltage false = do not multiply regulator output by terminal voltage.  Typical value = true.
     */
    private Boolean vmult; // Boolean

    public Boolean getVmult() {
        return vmult;
    }

    public void setVmult(Boolean _value_) {
        vmult = _value_;
    }

    public void setVmult(String _value_) {
        vmult = getBooleanFromString(_value_);
    }

    public String vmultToString() {
        return vmult != null ? vmult.toString() : null;
    }

    /**
     * Maximum voltage regulator output (&lt;i&gt;Vrmax&lt;/i&gt;) (&amp;gt; 0).  Typical value = 4,81.
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
     * Minimum voltage regulator output (&lt;i&gt;Vrmin&lt;/i&gt;) (&amp;lt; 0).  Typical value = -3,85.
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
     * Excitation source reactance (&lt;i&gt;Xc&lt;/i&gt;).  Typical value = 0,05.
     */
    private Double xc; // PU

    public Double getXc() {
        return xc;
    }

    public void setXc(Double _value_) {
        xc = _value_;
    }

    public void setXc(String _value_) {
        xc = getDoubleFromString(_value_);
    }

    public String xcToString() {
        return xc != null ? xc.toString() : null;
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
        return getAttribute("ExcST6B", attrName);
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
        setAttribute("ExcST6B", attrName, objectValue);
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
        setAttribute("ExcST6B", attrName, stringValue);
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
            map.put("ilr", new AttrDetails("ExcST6B.ilr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k1", new AttrDetails("ExcST6B.k1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kcl", new AttrDetails("ExcST6B.kcl", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kff", new AttrDetails("ExcST6B.kff", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kg", new AttrDetails("ExcST6B.kg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kia", new AttrDetails("ExcST6B.kia", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("klr", new AttrDetails("ExcST6B.klr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("km", new AttrDetails("ExcST6B.km", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpa", new AttrDetails("ExcST6B.kpa", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kvd", new AttrDetails("ExcST6B.kvd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("oelin", new AttrDetails("ExcST6B.oelin", true, "http://iec.ch/TC57/CIM100#", profiles, false, true));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tg", new AttrDetails("ExcST6B.tg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ts", new AttrDetails("ExcST6B.ts", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tvd", new AttrDetails("ExcST6B.tvd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vamax", new AttrDetails("ExcST6B.vamax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vamin", new AttrDetails("ExcST6B.vamin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vilim", new AttrDetails("ExcST6B.vilim", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimax", new AttrDetails("ExcST6B.vimax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimin", new AttrDetails("ExcST6B.vimin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmult", new AttrDetails("ExcST6B.vmult", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcST6B.vrmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcST6B.vrmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xc", new AttrDetails("ExcST6B.xc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcST6B().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("ilr", new GetterSetter(this::ilrToString, null, this::setIlr));
        map.put("k1", new GetterSetter(this::k1ToString, null, this::setK1));
        map.put("kcl", new GetterSetter(this::kclToString, null, this::setKcl));
        map.put("kff", new GetterSetter(this::kffToString, null, this::setKff));
        map.put("kg", new GetterSetter(this::kgToString, null, this::setKg));
        map.put("kia", new GetterSetter(this::kiaToString, null, this::setKia));
        map.put("klr", new GetterSetter(this::klrToString, null, this::setKlr));
        map.put("km", new GetterSetter(this::kmToString, null, this::setKm));
        map.put("kpa", new GetterSetter(this::kpaToString, null, this::setKpa));
        map.put("kvd", new GetterSetter(this::kvdToString, null, this::setKvd));
        map.put("oelin", new GetterSetter(this::oelinToString, null, this::setOelin));
        map.put("tg", new GetterSetter(this::tgToString, null, this::setTg));
        map.put("ts", new GetterSetter(this::tsToString, null, this::setTs));
        map.put("tvd", new GetterSetter(this::tvdToString, null, this::setTvd));
        map.put("vamax", new GetterSetter(this::vamaxToString, null, this::setVamax));
        map.put("vamin", new GetterSetter(this::vaminToString, null, this::setVamin));
        map.put("vilim", new GetterSetter(this::vilimToString, null, this::setVilim));
        map.put("vimax", new GetterSetter(this::vimaxToString, null, this::setVimax));
        map.put("vimin", new GetterSetter(this::viminToString, null, this::setVimin));
        map.put("vmult", new GetterSetter(this::vmultToString, null, this::setVmult));
        map.put("vrmax", new GetterSetter(this::vrmaxToString, null, this::setVrmax));
        map.put("vrmin", new GetterSetter(this::vrminToString, null, this::setVrmin));
        map.put("xc", new GetterSetter(this::xcToString, null, this::setXc));
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
