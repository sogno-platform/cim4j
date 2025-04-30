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
 * IEEE type DEC1A discontinuous excitation control model that boosts generator excitation to a level higher than that demanded by the voltage regulator and stabilizer immediately following a system fault. Reference: IEEE 421.5-2005, 12.2.
 */
@SuppressWarnings("unused")
public class DiscExcContIEEEDEC1A extends DiscontinuousExcitationControlDynamics {

    private static final Logging LOG = Logging.getLogger(DiscExcContIEEEDEC1A.class);

    /**
     * Default constructor.
     */
    public DiscExcContIEEEDEC1A() {
        setCimType("DiscExcContIEEEDEC1A");
    }

    /**
     * Speed change reference (&lt;i&gt;E&lt;/i&gt;&lt;i&gt;&lt;sub&gt;SC&lt;/sub&gt;&lt;/i&gt;).  Typical value = 0,0015.
     */
    private Double esc; // PU

    public Double getEsc() {
        return esc;
    }

    public void setEsc(Double _value_) {
        esc = _value_;
    }

    public void setEsc(String _value_) {
        esc = getDoubleFromString(_value_);
    }

    public String escToString() {
        return esc != null ? esc.toString() : null;
    }

    /**
     * Discontinuous controller gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;AN&lt;/sub&gt;&lt;/i&gt;).  Typical value = 400.
     */
    private Double kan; // PU

    public Double getKan() {
        return kan;
    }

    public void setKan(Double _value_) {
        kan = _value_;
    }

    public void setKan(String _value_) {
        kan = getDoubleFromString(_value_);
    }

    public String kanToString() {
        return kan != null ? kan.toString() : null;
    }

    /**
     * Terminal voltage limiter gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;ETL&lt;/sub&gt;&lt;/i&gt;).  Typical value = 47.
     */
    private Double ketl; // PU

    public Double getKetl() {
        return ketl;
    }

    public void setKetl(Double _value_) {
        ketl = _value_;
    }

    public void setKetl(String _value_) {
        ketl = getDoubleFromString(_value_);
    }

    public String ketlToString() {
        return ketl != null ? ketl.toString() : null;
    }

    /**
     * Discontinuous controller time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;AN&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,08.
     */
    private Double tan; // Seconds

    public Double getTan() {
        return tan;
    }

    public void setTan(Double _value_) {
        tan = _value_;
    }

    public void setTan(String _value_) {
        tan = getDoubleFromString(_value_);
    }

    public String tanToString() {
        return tan != null ? tan.toString() : null;
    }

    /**
     * Time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;D&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,03.
     */
    private Double td; // Seconds

    public Double getTd() {
        return td;
    }

    public void setTd(Double _value_) {
        td = _value_;
    }

    public void setTd(String _value_) {
        td = getDoubleFromString(_value_);
    }

    public String tdToString() {
        return td != null ? td.toString() : null;
    }

    /**
     * Time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L&lt;/sub&gt;&lt;/i&gt;&lt;sub&gt;1&lt;/sub&gt;) (&amp;gt;= 0).  Typical value = 0,025.
     */
    private Double tl1; // Seconds

    public Double getTl1() {
        return tl1;
    }

    public void setTl1(Double _value_) {
        tl1 = _value_;
    }

    public void setTl1(String _value_) {
        tl1 = getDoubleFromString(_value_);
    }

    public String tl1ToString() {
        return tl1 != null ? tl1.toString() : null;
    }

    /**
     * Time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L&lt;/sub&gt;&lt;/i&gt;&lt;sub&gt;2&lt;/sub&gt;) (&amp;gt;= 0).  Typical value = 1,25.
     */
    private Double tl2; // Seconds

    public Double getTl2() {
        return tl2;
    }

    public void setTl2(Double _value_) {
        tl2 = _value_;
    }

    public void setTl2(String _value_) {
        tl2 = getDoubleFromString(_value_);
    }

    public String tl2ToString() {
        return tl2 != null ? tl2.toString() : null;
    }

    /**
     * DEC washout time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;W&lt;/sub&gt;&lt;/i&gt;&lt;sub&gt;5&lt;/sub&gt;) (&amp;gt;= 0).  Typical value = 5.
     */
    private Double tw5; // Seconds

    public Double getTw5() {
        return tw5;
    }

    public void setTw5(Double _value_) {
        tw5 = _value_;
    }

    public void setTw5(String _value_) {
        tw5 = getDoubleFromString(_value_);
    }

    public String tw5ToString() {
        return tw5 != null ? tw5.toString() : null;
    }

    /**
     * Regulator voltage reference (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;AL&lt;/sub&gt;&lt;/i&gt;).  Typical value = 5,5.
     */
    private Double val; // PU

    public Double getVal() {
        return val;
    }

    public void setVal(Double _value_) {
        val = _value_;
    }

    public void setVal(String _value_) {
        val = getDoubleFromString(_value_);
    }

    public String valToString() {
        return val != null ? val.toString() : null;
    }

    /**
     * Limiter for Van (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;ANMAX&lt;/sub&gt;&lt;/i&gt;).
     */
    private Double vanmax; // PU

    public Double getVanmax() {
        return vanmax;
    }

    public void setVanmax(Double _value_) {
        vanmax = _value_;
    }

    public void setVanmax(String _value_) {
        vanmax = getDoubleFromString(_value_);
    }

    public String vanmaxToString() {
        return vanmax != null ? vanmax.toString() : null;
    }

    /**
     * Limiter (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;OMAX&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; DiscExcContIEEEDEC1A.vomin).  Typical value = 0,3.
     */
    private Double vomax; // PU

    public Double getVomax() {
        return vomax;
    }

    public void setVomax(Double _value_) {
        vomax = _value_;
    }

    public void setVomax(String _value_) {
        vomax = getDoubleFromString(_value_);
    }

    public String vomaxToString() {
        return vomax != null ? vomax.toString() : null;
    }

    /**
     * Limiter (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;OMIN&lt;/sub&gt;&lt;/i&gt;) (&amp;lt; DiscExcContIEEEDEC1A.vomax).  Typical value = 0,1.
     */
    private Double vomin; // PU

    public Double getVomin() {
        return vomin;
    }

    public void setVomin(Double _value_) {
        vomin = _value_;
    }

    public void setVomin(String _value_) {
        vomin = getDoubleFromString(_value_);
    }

    public String vominToString() {
        return vomin != null ? vomin.toString() : null;
    }

    /**
     * Limiter (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;SMAX&lt;/sub&gt;&lt;/i&gt;)(&amp;gt; DiscExcContIEEEDEC1A.vsmin).  Typical value = 0,2.
     */
    private Double vsmax; // PU

    public Double getVsmax() {
        return vsmax;
    }

    public void setVsmax(Double _value_) {
        vsmax = _value_;
    }

    public void setVsmax(String _value_) {
        vsmax = getDoubleFromString(_value_);
    }

    public String vsmaxToString() {
        return vsmax != null ? vsmax.toString() : null;
    }

    /**
     * Limiter (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;SMIN&lt;/sub&gt;&lt;/i&gt;) (&amp;lt; DiscExcContIEEEDEC1A.vsmax).  Typical value = -0,066.
     */
    private Double vsmin; // PU

    public Double getVsmin() {
        return vsmin;
    }

    public void setVsmin(Double _value_) {
        vsmin = _value_;
    }

    public void setVsmin(String _value_) {
        vsmin = getDoubleFromString(_value_);
    }

    public String vsminToString() {
        return vsmin != null ? vsmin.toString() : null;
    }

    /**
     * Terminal voltage level reference (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;TC&lt;/sub&gt;&lt;/i&gt;).  Typical value = 0,95.
     */
    private Double vtc; // PU

    public Double getVtc() {
        return vtc;
    }

    public void setVtc(Double _value_) {
        vtc = _value_;
    }

    public void setVtc(String _value_) {
        vtc = getDoubleFromString(_value_);
    }

    public String vtcToString() {
        return vtc != null ? vtc.toString() : null;
    }

    /**
     * Voltage reference (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;TLMT&lt;/sub&gt;&lt;/i&gt;).  Typical value = 1,1.
     */
    private Double vtlmt; // PU

    public Double getVtlmt() {
        return vtlmt;
    }

    public void setVtlmt(Double _value_) {
        vtlmt = _value_;
    }

    public void setVtlmt(String _value_) {
        vtlmt = getDoubleFromString(_value_);
    }

    public String vtlmtToString() {
        return vtlmt != null ? vtlmt.toString() : null;
    }

    /**
     * Voltage limits (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;TM&lt;/sub&gt;&lt;/i&gt;).  Typical value = 1,13.
     */
    private Double vtm; // PU

    public Double getVtm() {
        return vtm;
    }

    public void setVtm(Double _value_) {
        vtm = _value_;
    }

    public void setVtm(String _value_) {
        vtm = getDoubleFromString(_value_);
    }

    public String vtmToString() {
        return vtm != null ? vtm.toString() : null;
    }

    /**
     * Voltage limits (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;TN&lt;/sub&gt;&lt;/i&gt;).  Typical value = 1,12.
     */
    private Double vtn; // PU

    public Double getVtn() {
        return vtn;
    }

    public void setVtn(Double _value_) {
        vtn = _value_;
    }

    public void setVtn(String _value_) {
        vtn = getDoubleFromString(_value_);
    }

    public String vtnToString() {
        return vtn != null ? vtn.toString() : null;
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
        return getAttribute("DiscExcContIEEEDEC1A", attrName);
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
        setAttribute("DiscExcContIEEEDEC1A", attrName, objectValue);
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
        setAttribute("DiscExcContIEEEDEC1A", attrName, stringValue);
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
            map.put("esc", new AttrDetails("DiscExcContIEEEDEC1A.esc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kan", new AttrDetails("DiscExcContIEEEDEC1A.kan", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ketl", new AttrDetails("DiscExcContIEEEDEC1A.ketl", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tan", new AttrDetails("DiscExcContIEEEDEC1A.tan", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("td", new AttrDetails("DiscExcContIEEEDEC1A.td", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl1", new AttrDetails("DiscExcContIEEEDEC1A.tl1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl2", new AttrDetails("DiscExcContIEEEDEC1A.tl2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw5", new AttrDetails("DiscExcContIEEEDEC1A.tw5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("val", new AttrDetails("DiscExcContIEEEDEC1A.val", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vanmax", new AttrDetails("DiscExcContIEEEDEC1A.vanmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vomax", new AttrDetails("DiscExcContIEEEDEC1A.vomax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vomin", new AttrDetails("DiscExcContIEEEDEC1A.vomin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsmax", new AttrDetails("DiscExcContIEEEDEC1A.vsmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsmin", new AttrDetails("DiscExcContIEEEDEC1A.vsmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vtc", new AttrDetails("DiscExcContIEEEDEC1A.vtc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vtlmt", new AttrDetails("DiscExcContIEEEDEC1A.vtlmt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vtm", new AttrDetails("DiscExcContIEEEDEC1A.vtm", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vtn", new AttrDetails("DiscExcContIEEEDEC1A.vtn", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new DiscExcContIEEEDEC1A().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("esc", new GetterSetter(this::escToString, null, this::setEsc));
        map.put("kan", new GetterSetter(this::kanToString, null, this::setKan));
        map.put("ketl", new GetterSetter(this::ketlToString, null, this::setKetl));
        map.put("tan", new GetterSetter(this::tanToString, null, this::setTan));
        map.put("td", new GetterSetter(this::tdToString, null, this::setTd));
        map.put("tl1", new GetterSetter(this::tl1ToString, null, this::setTl1));
        map.put("tl2", new GetterSetter(this::tl2ToString, null, this::setTl2));
        map.put("tw5", new GetterSetter(this::tw5ToString, null, this::setTw5));
        map.put("val", new GetterSetter(this::valToString, null, this::setVal));
        map.put("vanmax", new GetterSetter(this::vanmaxToString, null, this::setVanmax));
        map.put("vomax", new GetterSetter(this::vomaxToString, null, this::setVomax));
        map.put("vomin", new GetterSetter(this::vominToString, null, this::setVomin));
        map.put("vsmax", new GetterSetter(this::vsmaxToString, null, this::setVsmax));
        map.put("vsmin", new GetterSetter(this::vsminToString, null, this::setVsmin));
        map.put("vtc", new GetterSetter(this::vtcToString, null, this::setVtc));
        map.put("vtlmt", new GetterSetter(this::vtlmtToString, null, this::setVtlmt));
        map.put("vtm", new GetterSetter(this::vtmToString, null, this::setVtm));
        map.put("vtn", new GetterSetter(this::vtnToString, null, this::setVtn));
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
