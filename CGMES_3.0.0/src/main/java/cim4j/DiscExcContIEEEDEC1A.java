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
     * Constructor.
     */
    public DiscExcContIEEEDEC1A(String rdfid) {
        super("DiscExcContIEEEDEC1A", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected DiscExcContIEEEDEC1A(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Speed change reference (<i>E</i><i><sub>SC</sub></i>).  Typical value = 0,0015.
     */
    private Double esc; // PU

    public Double getEsc() {
        return esc;
    }

    public void setEsc(Double _value_) {
        esc = _value_;
    }

    private static Object getEsc(BaseClass _this_) {
        return ((DiscExcContIEEEDEC1A) _this_).getEsc();
    }

    private static void setEsc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC1A) _this_).setEsc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC1A) _this_).setEsc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Discontinuous controller gain (<i>K</i><i><sub>AN</sub></i>).  Typical value = 400.
     */
    private Double kan; // PU

    public Double getKan() {
        return kan;
    }

    public void setKan(Double _value_) {
        kan = _value_;
    }

    private static Object getKan(BaseClass _this_) {
        return ((DiscExcContIEEEDEC1A) _this_).getKan();
    }

    private static void setKan(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC1A) _this_).setKan((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC1A) _this_).setKan(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Terminal voltage limiter gain (<i>K</i><i><sub>ETL</sub></i>).  Typical value = 47.
     */
    private Double ketl; // PU

    public Double getKetl() {
        return ketl;
    }

    public void setKetl(Double _value_) {
        ketl = _value_;
    }

    private static Object getKetl(BaseClass _this_) {
        return ((DiscExcContIEEEDEC1A) _this_).getKetl();
    }

    private static void setKetl(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC1A) _this_).setKetl((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC1A) _this_).setKetl(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Discontinuous controller time constant (<i>T</i><i><sub>AN</sub></i>) (&gt;= 0).  Typical value = 0,08.
     */
    private Double tan; // Seconds

    public Double getTan() {
        return tan;
    }

    public void setTan(Double _value_) {
        tan = _value_;
    }

    private static Object getTan(BaseClass _this_) {
        return ((DiscExcContIEEEDEC1A) _this_).getTan();
    }

    private static void setTan(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC1A) _this_).setTan((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC1A) _this_).setTan(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T</i><i><sub>D</sub></i>) (&gt;= 0).  Typical value = 0,03.
     */
    private Double td; // Seconds

    public Double getTd() {
        return td;
    }

    public void setTd(Double _value_) {
        td = _value_;
    }

    private static Object getTd(BaseClass _this_) {
        return ((DiscExcContIEEEDEC1A) _this_).getTd();
    }

    private static void setTd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC1A) _this_).setTd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC1A) _this_).setTd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T</i><i><sub>L</sub></i><sub>1</sub>) (&gt;= 0).  Typical value = 0,025.
     */
    private Double tl1; // Seconds

    public Double getTl1() {
        return tl1;
    }

    public void setTl1(Double _value_) {
        tl1 = _value_;
    }

    private static Object getTl1(BaseClass _this_) {
        return ((DiscExcContIEEEDEC1A) _this_).getTl1();
    }

    private static void setTl1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC1A) _this_).setTl1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC1A) _this_).setTl1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (<i>T</i><i><sub>L</sub></i><sub>2</sub>) (&gt;= 0).  Typical value = 1,25.
     */
    private Double tl2; // Seconds

    public Double getTl2() {
        return tl2;
    }

    public void setTl2(Double _value_) {
        tl2 = _value_;
    }

    private static Object getTl2(BaseClass _this_) {
        return ((DiscExcContIEEEDEC1A) _this_).getTl2();
    }

    private static void setTl2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC1A) _this_).setTl2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC1A) _this_).setTl2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * DEC washout time constant (<i>T</i><i><sub>W</sub></i><sub>5</sub>) (&gt;= 0).  Typical value = 5.
     */
    private Double tw5; // Seconds

    public Double getTw5() {
        return tw5;
    }

    public void setTw5(Double _value_) {
        tw5 = _value_;
    }

    private static Object getTw5(BaseClass _this_) {
        return ((DiscExcContIEEEDEC1A) _this_).getTw5();
    }

    private static void setTw5(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC1A) _this_).setTw5((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC1A) _this_).setTw5(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Regulator voltage reference (<i>V</i><i><sub>AL</sub></i>).  Typical value = 5,5.
     */
    private Double val; // PU

    public Double getVal() {
        return val;
    }

    public void setVal(Double _value_) {
        val = _value_;
    }

    private static Object getVal(BaseClass _this_) {
        return ((DiscExcContIEEEDEC1A) _this_).getVal();
    }

    private static void setVal(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC1A) _this_).setVal((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC1A) _this_).setVal(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Limiter for Van (<i>V</i><i><sub>ANMAX</sub></i>).
     */
    private Double vanmax; // PU

    public Double getVanmax() {
        return vanmax;
    }

    public void setVanmax(Double _value_) {
        vanmax = _value_;
    }

    private static Object getVanmax(BaseClass _this_) {
        return ((DiscExcContIEEEDEC1A) _this_).getVanmax();
    }

    private static void setVanmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC1A) _this_).setVanmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC1A) _this_).setVanmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Limiter (<i>V</i><i><sub>OMAX</sub></i>) (&gt; DiscExcContIEEEDEC1A.vomin).  Typical value = 0,3.
     */
    private Double vomax; // PU

    public Double getVomax() {
        return vomax;
    }

    public void setVomax(Double _value_) {
        vomax = _value_;
    }

    private static Object getVomax(BaseClass _this_) {
        return ((DiscExcContIEEEDEC1A) _this_).getVomax();
    }

    private static void setVomax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC1A) _this_).setVomax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC1A) _this_).setVomax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Limiter (<i>V</i><i><sub>OMIN</sub></i>) (&lt; DiscExcContIEEEDEC1A.vomax).  Typical value = 0,1.
     */
    private Double vomin; // PU

    public Double getVomin() {
        return vomin;
    }

    public void setVomin(Double _value_) {
        vomin = _value_;
    }

    private static Object getVomin(BaseClass _this_) {
        return ((DiscExcContIEEEDEC1A) _this_).getVomin();
    }

    private static void setVomin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC1A) _this_).setVomin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC1A) _this_).setVomin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Limiter (<i>V</i><i><sub>SMAX</sub></i>)(&gt; DiscExcContIEEEDEC1A.vsmin).  Typical value = 0,2.
     */
    private Double vsmax; // PU

    public Double getVsmax() {
        return vsmax;
    }

    public void setVsmax(Double _value_) {
        vsmax = _value_;
    }

    private static Object getVsmax(BaseClass _this_) {
        return ((DiscExcContIEEEDEC1A) _this_).getVsmax();
    }

    private static void setVsmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC1A) _this_).setVsmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC1A) _this_).setVsmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Limiter (<i>V</i><i><sub>SMIN</sub></i>) (&lt; DiscExcContIEEEDEC1A.vsmax).  Typical value = -0,066.
     */
    private Double vsmin; // PU

    public Double getVsmin() {
        return vsmin;
    }

    public void setVsmin(Double _value_) {
        vsmin = _value_;
    }

    private static Object getVsmin(BaseClass _this_) {
        return ((DiscExcContIEEEDEC1A) _this_).getVsmin();
    }

    private static void setVsmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC1A) _this_).setVsmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC1A) _this_).setVsmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Terminal voltage level reference (<i>V</i><i><sub>TC</sub></i>).  Typical value = 0,95.
     */
    private Double vtc; // PU

    public Double getVtc() {
        return vtc;
    }

    public void setVtc(Double _value_) {
        vtc = _value_;
    }

    private static Object getVtc(BaseClass _this_) {
        return ((DiscExcContIEEEDEC1A) _this_).getVtc();
    }

    private static void setVtc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC1A) _this_).setVtc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC1A) _this_).setVtc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage reference (<i>V</i><i><sub>TLMT</sub></i>).  Typical value = 1,1.
     */
    private Double vtlmt; // PU

    public Double getVtlmt() {
        return vtlmt;
    }

    public void setVtlmt(Double _value_) {
        vtlmt = _value_;
    }

    private static Object getVtlmt(BaseClass _this_) {
        return ((DiscExcContIEEEDEC1A) _this_).getVtlmt();
    }

    private static void setVtlmt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC1A) _this_).setVtlmt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC1A) _this_).setVtlmt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage limits (<i>V</i><i><sub>TM</sub></i>).  Typical value = 1,13.
     */
    private Double vtm; // PU

    public Double getVtm() {
        return vtm;
    }

    public void setVtm(Double _value_) {
        vtm = _value_;
    }

    private static Object getVtm(BaseClass _this_) {
        return ((DiscExcContIEEEDEC1A) _this_).getVtm();
    }

    private static void setVtm(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC1A) _this_).setVtm((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC1A) _this_).setVtm(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage limits (<i>V</i><i><sub>TN</sub></i>).  Typical value = 1,12.
     */
    private Double vtn; // PU

    public Double getVtn() {
        return vtn;
    }

    public void setVtn(Double _value_) {
        vtn = _value_;
    }

    private static Object getVtn(BaseClass _this_) {
        return ((DiscExcContIEEEDEC1A) _this_).getVtn();
    }

    private static void setVtn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((DiscExcContIEEEDEC1A) _this_).setVtn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((DiscExcContIEEEDEC1A) _this_).setVtn(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "DiscExcContIEEEDEC1A", attrName));
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
                "DiscExcContIEEEDEC1A", attrName, value));
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
            map.put("esc", new AttrDetails("DiscExcContIEEEDEC1A.esc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiscExcContIEEEDEC1A::getEsc, DiscExcContIEEEDEC1A::setEsc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kan", new AttrDetails("DiscExcContIEEEDEC1A.kan", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiscExcContIEEEDEC1A::getKan, DiscExcContIEEEDEC1A::setKan));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ketl", new AttrDetails("DiscExcContIEEEDEC1A.ketl", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiscExcContIEEEDEC1A::getKetl, DiscExcContIEEEDEC1A::setKetl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tan", new AttrDetails("DiscExcContIEEEDEC1A.tan", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiscExcContIEEEDEC1A::getTan, DiscExcContIEEEDEC1A::setTan));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("td", new AttrDetails("DiscExcContIEEEDEC1A.td", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiscExcContIEEEDEC1A::getTd, DiscExcContIEEEDEC1A::setTd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl1", new AttrDetails("DiscExcContIEEEDEC1A.tl1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiscExcContIEEEDEC1A::getTl1, DiscExcContIEEEDEC1A::setTl1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl2", new AttrDetails("DiscExcContIEEEDEC1A.tl2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiscExcContIEEEDEC1A::getTl2, DiscExcContIEEEDEC1A::setTl2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw5", new AttrDetails("DiscExcContIEEEDEC1A.tw5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiscExcContIEEEDEC1A::getTw5, DiscExcContIEEEDEC1A::setTw5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("val", new AttrDetails("DiscExcContIEEEDEC1A.val", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiscExcContIEEEDEC1A::getVal, DiscExcContIEEEDEC1A::setVal));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vanmax", new AttrDetails("DiscExcContIEEEDEC1A.vanmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiscExcContIEEEDEC1A::getVanmax, DiscExcContIEEEDEC1A::setVanmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vomax", new AttrDetails("DiscExcContIEEEDEC1A.vomax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiscExcContIEEEDEC1A::getVomax, DiscExcContIEEEDEC1A::setVomax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vomin", new AttrDetails("DiscExcContIEEEDEC1A.vomin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiscExcContIEEEDEC1A::getVomin, DiscExcContIEEEDEC1A::setVomin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsmax", new AttrDetails("DiscExcContIEEEDEC1A.vsmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiscExcContIEEEDEC1A::getVsmax, DiscExcContIEEEDEC1A::setVsmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsmin", new AttrDetails("DiscExcContIEEEDEC1A.vsmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiscExcContIEEEDEC1A::getVsmin, DiscExcContIEEEDEC1A::setVsmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vtc", new AttrDetails("DiscExcContIEEEDEC1A.vtc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiscExcContIEEEDEC1A::getVtc, DiscExcContIEEEDEC1A::setVtc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vtlmt", new AttrDetails("DiscExcContIEEEDEC1A.vtlmt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiscExcContIEEEDEC1A::getVtlmt, DiscExcContIEEEDEC1A::setVtlmt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vtm", new AttrDetails("DiscExcContIEEEDEC1A.vtm", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiscExcContIEEEDEC1A::getVtm, DiscExcContIEEEDEC1A::setVtm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vtn", new AttrDetails("DiscExcContIEEEDEC1A.vtn", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, DiscExcContIEEEDEC1A::getVtn, DiscExcContIEEEDEC1A::setVtn));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new DiscExcContIEEEDEC1A(null).allAttrDetailsMap());
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
