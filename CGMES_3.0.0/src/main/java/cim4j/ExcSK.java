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
 * Slovakian excitation system.  UEL and secondary voltage control are included in this model. When this model is used, there cannot be a separate underexcitation limiter or VAr controller model.
 */
@SuppressWarnings("unused")
public class ExcSK extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcSK.class);

    /**
     * Default constructor.
     */
    public ExcSK() {
        setCimType("ExcSK");
    }

    /**
     * Field voltage clipping upper level limit (&lt;i&gt;Efdmax&lt;/i&gt;) (&amp;gt; ExcSK.efdmin).
     */
    private Double efdmax; // PU

    public Double getEfdmax() {
        return efdmax;
    }

    public void setEfdmax(Double _value_) {
        efdmax = _value_;
    }

    public void setEfdmax(String _value_) {
        efdmax = getDoubleFromString(_value_);
    }

    public String efdmaxToString() {
        return efdmax != null ? efdmax.toString() : null;
    }

    /**
     * Field voltage clipping lower level limit (&lt;i&gt;Efdmin&lt;/i&gt;) (&amp;lt; ExcSK.efdmax).
     */
    private Double efdmin; // PU

    public Double getEfdmin() {
        return efdmin;
    }

    public void setEfdmin(Double _value_) {
        efdmin = _value_;
    }

    public void setEfdmin(String _value_) {
        efdmin = getDoubleFromString(_value_);
    }

    public String efdminToString() {
        return efdmin != null ? efdmin.toString() : null;
    }

    /**
     * Maximum field voltage output (&lt;i&gt;Emax&lt;/i&gt;) (&amp;gt; ExcSK.emin).  Typical value = 20.
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
     * Minimum field voltage output (&lt;i&gt;Emin&lt;/i&gt;) (&amp;lt; ExcSK.emax).  Typical value = -20.
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
     * Gain (&lt;i&gt;K&lt;/i&gt;).  Typical value = 1.
     */
    private Double k; // PU

    public Double getK() {
        return k;
    }

    public void setK(Double _value_) {
        k = _value_;
    }

    public void setK(String _value_) {
        k = getDoubleFromString(_value_);
    }

    public String kToString() {
        return k != null ? k.toString() : null;
    }

    /**
     * Parameter of underexcitation limit (&lt;i&gt;K1&lt;/i&gt;).  Typical value = 0,1364.
     */
    private Double k1; // PU

    public Double getK1() {
        return k1;
    }

    public void setK1(Double _value_) {
        k1 = _value_;
    }

    public void setK1(String _value_) {
        k1 = getDoubleFromString(_value_);
    }

    public String k1ToString() {
        return k1 != null ? k1.toString() : null;
    }

    /**
     * Parameter of underexcitation limit (&lt;i&gt;K2&lt;/i&gt;).  Typical value = -0,3861.
     */
    private Double k2; // PU

    public Double getK2() {
        return k2;
    }

    public void setK2(Double _value_) {
        k2 = _value_;
    }

    public void setK2(String _value_) {
        k2 = getDoubleFromString(_value_);
    }

    public String k2ToString() {
        return k2 != null ? k2.toString() : null;
    }

    /**
     * PI controller gain (&lt;i&gt;Kc&lt;/i&gt;).  Typical value = 70.
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
     * Rectifier regulation factor (&lt;i&gt;Kce&lt;/i&gt;).  Typical value = 0.
     */
    private Double kce; // PU

    public Double getKce() {
        return kce;
    }

    public void setKce(Double _value_) {
        kce = _value_;
    }

    public void setKce(String _value_) {
        kce = getDoubleFromString(_value_);
    }

    public String kceToString() {
        return kce != null ? kce.toString() : null;
    }

    /**
     * Exciter internal reactance (&lt;i&gt;Kd&lt;/i&gt;).  Typical value = 0.
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
     * P controller gain (&lt;i&gt;Kgob&lt;/i&gt;).  Typical value = 10.
     */
    private Double kgob; // PU

    public Double getKgob() {
        return kgob;
    }

    public void setKgob(Double _value_) {
        kgob = _value_;
    }

    public void setKgob(String _value_) {
        kgob = getDoubleFromString(_value_);
    }

    public String kgobToString() {
        return kgob != null ? kgob.toString() : null;
    }

    /**
     * PI controller gain (&lt;i&gt;Kp&lt;/i&gt;).  Typical value = 1.
     */
    private Double kp; // PU

    public Double getKp() {
        return kp;
    }

    public void setKp(Double _value_) {
        kp = _value_;
    }

    public void setKp(String _value_) {
        kp = getDoubleFromString(_value_);
    }

    public String kpToString() {
        return kp != null ? kp.toString() : null;
    }

    /**
     * PI controller gain of integral component (&lt;i&gt;Kqi&lt;/i&gt;).  Typical value = 0.
     */
    private Double kqi; // PU

    public Double getKqi() {
        return kqi;
    }

    public void setKqi(Double _value_) {
        kqi = _value_;
    }

    public void setKqi(String _value_) {
        kqi = getDoubleFromString(_value_);
    }

    public String kqiToString() {
        return kqi != null ? kqi.toString() : null;
    }

    /**
     * Rate of rise of the reactive power (&lt;i&gt;Kqob&lt;/i&gt;).
     */
    private Double kqob; // PU

    public Double getKqob() {
        return kqob;
    }

    public void setKqob(Double _value_) {
        kqob = _value_;
    }

    public void setKqob(String _value_) {
        kqob = getDoubleFromString(_value_);
    }

    public String kqobToString() {
        return kqob != null ? kqob.toString() : null;
    }

    /**
     * PI controller gain (&lt;i&gt;Kqp&lt;/i&gt;).  Typical value = 0.
     */
    private Double kqp; // PU

    public Double getKqp() {
        return kqp;
    }

    public void setKqp(Double _value_) {
        kqp = _value_;
    }

    public void setKqp(String _value_) {
        kqp = getDoubleFromString(_value_);
    }

    public String kqpToString() {
        return kqp != null ? kqp.toString() : null;
    }

    /**
     * Deadband of reactive power (&lt;i&gt;nq&lt;/i&gt;).  Determines the range of sensitivity.  Typical value = 0,001.
     */
    private Double nq; // PU

    public Double getNq() {
        return nq;
    }

    public void setNq(Double _value_) {
        nq = _value_;
    }

    public void setNq(String _value_) {
        nq = getDoubleFromString(_value_);
    }

    public String nqToString() {
        return nq != null ? nq.toString() : null;
    }

    /**
     * Secondary voltage control state (&lt;i&gt;Qc_on_off&lt;/i&gt;). true = secondary voltage control is on false = secondary voltage control is off. Typical value = false.
     */
    private Boolean qconoff; // Boolean

    public Boolean getQconoff() {
        return qconoff;
    }

    public void setQconoff(Boolean _value_) {
        qconoff = _value_;
    }

    public void setQconoff(String _value_) {
        qconoff = getBooleanFromString(_value_);
    }

    public String qconoffToString() {
        return qconoff != null ? qconoff.toString() : null;
    }

    /**
     * Desired value (setpoint) of reactive power, manual setting (&lt;i&gt;Qz&lt;/i&gt;).
     */
    private Double qz; // PU

    public Double getQz() {
        return qz;
    }

    public void setQz(Double _value_) {
        qz = _value_;
    }

    public void setQz(String _value_) {
        qz = getDoubleFromString(_value_);
    }

    public String qzToString() {
        return qz != null ? qz.toString() : null;
    }

    /**
     * Selector to apply automatic calculation in secondary controller model (&lt;i&gt;remote&lt;/i&gt;). true = automatic calculation is activated false = manual set is active; the use of desired value of reactive power (&lt;i&gt;Qz&lt;/i&gt;) is required. Typical value = true.
     */
    private Boolean remote; // Boolean

    public Boolean getRemote() {
        return remote;
    }

    public void setRemote(Boolean _value_) {
        remote = _value_;
    }

    public void setRemote(String _value_) {
        remote = getBooleanFromString(_value_);
    }

    public String remoteToString() {
        return remote != null ? remote.toString() : null;
    }

    /**
     * Apparent power of the unit (&lt;i&gt;Sbase&lt;/i&gt;) (&amp;gt; 0).  Unit = MVA.  Typical value = 259.
     */
    private Double sbase; // ApparentPower

    public Double getSbase() {
        return sbase;
    }

    public void setSbase(Double _value_) {
        sbase = _value_;
    }

    public void setSbase(String _value_) {
        sbase = getDoubleFromString(_value_);
    }

    public String sbaseToString() {
        return sbase != null ? sbase.toString() : null;
    }

    /**
     * PI controller phase lead time constant (&lt;i&gt;Tc&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 8.
     */
    private Double tc; // Seconds

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    public void setTc(String _value_) {
        tc = getDoubleFromString(_value_);
    }

    public String tcToString() {
        return tc != null ? tc.toString() : null;
    }

    /**
     * Time constant of gain block (&lt;i&gt;Te&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,1.
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
     * PI controller phase lead time constant (&lt;i&gt;Ti&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 2.
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
     * Time constant (&lt;i&gt;Tp&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,1.
     */
    private Double tp; // Seconds

    public Double getTp() {
        return tp;
    }

    public void setTp(Double _value_) {
        tp = _value_;
    }

    public void setTp(String _value_) {
        tp = getDoubleFromString(_value_);
    }

    public String tpToString() {
        return tp != null ? tp.toString() : null;
    }

    /**
     * Voltage transducer time constant (&lt;i&gt;Tr&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,01.
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
     * Maximum error (&lt;i&gt;UImax&lt;/i&gt;) (&amp;gt; ExcSK.uimin).  Typical value = 10.
     */
    private Double uimax; // PU

    public Double getUimax() {
        return uimax;
    }

    public void setUimax(Double _value_) {
        uimax = _value_;
    }

    public void setUimax(String _value_) {
        uimax = getDoubleFromString(_value_);
    }

    public String uimaxToString() {
        return uimax != null ? uimax.toString() : null;
    }

    /**
     * Minimum error (&lt;i&gt;UImin&lt;/i&gt;) (&amp;lt; ExcSK.uimax).  Typical value = -10.
     */
    private Double uimin; // PU

    public Double getUimin() {
        return uimin;
    }

    public void setUimin(Double _value_) {
        uimin = _value_;
    }

    public void setUimin(String _value_) {
        uimin = getDoubleFromString(_value_);
    }

    public String uiminToString() {
        return uimin != null ? uimin.toString() : null;
    }

    /**
     * Maximum controller output (&lt;i&gt;URmax&lt;/i&gt;) (&amp;gt; ExcSK.urmin).  Typical value = 10.
     */
    private Double urmax; // PU

    public Double getUrmax() {
        return urmax;
    }

    public void setUrmax(Double _value_) {
        urmax = _value_;
    }

    public void setUrmax(String _value_) {
        urmax = getDoubleFromString(_value_);
    }

    public String urmaxToString() {
        return urmax != null ? urmax.toString() : null;
    }

    /**
     * Minimum controller output (&lt;i&gt;URmin&lt;/i&gt;) (&amp;lt; ExcSK.urmax).  Typical value = -10.
     */
    private Double urmin; // PU

    public Double getUrmin() {
        return urmin;
    }

    public void setUrmin(Double _value_) {
        urmin = _value_;
    }

    public void setUrmin(String _value_) {
        urmin = getDoubleFromString(_value_);
    }

    public String urminToString() {
        return urmin != null ? urmin.toString() : null;
    }

    /**
     * Maximum terminal voltage input (&lt;i&gt;Vtmax&lt;/i&gt;) (&amp;gt; ExcSK.vtmin).  Determines the range of voltage deadband.  Typical value = 1,05.
     */
    private Double vtmax; // PU

    public Double getVtmax() {
        return vtmax;
    }

    public void setVtmax(Double _value_) {
        vtmax = _value_;
    }

    public void setVtmax(String _value_) {
        vtmax = getDoubleFromString(_value_);
    }

    public String vtmaxToString() {
        return vtmax != null ? vtmax.toString() : null;
    }

    /**
     * Minimum terminal voltage input (&lt;i&gt;Vtmin&lt;/i&gt;) (&amp;lt; ExcSK.vtmax).  Determines the range of voltage deadband.  Typical value = 0,95.
     */
    private Double vtmin; // PU

    public Double getVtmin() {
        return vtmin;
    }

    public void setVtmin(Double _value_) {
        vtmin = _value_;
    }

    public void setVtmin(String _value_) {
        vtmin = getDoubleFromString(_value_);
    }

    public String vtminToString() {
        return vtmin != null ? vtmin.toString() : null;
    }

    /**
     * Maximum output (&lt;i&gt;Yp&lt;/i&gt;).  Typical value = 1.
     */
    private Double yp; // PU

    public Double getYp() {
        return yp;
    }

    public void setYp(Double _value_) {
        yp = _value_;
    }

    public void setYp(String _value_) {
        yp = getDoubleFromString(_value_);
    }

    public String ypToString() {
        return yp != null ? yp.toString() : null;
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
        return getAttribute("ExcSK", attrName);
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
        setAttribute("ExcSK", attrName, objectValue);
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
        setAttribute("ExcSK", attrName, stringValue);
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
            map.put("efdmax", new AttrDetails("ExcSK.efdmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efdmin", new AttrDetails("ExcSK.efdmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("emax", new AttrDetails("ExcSK.emax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("emin", new AttrDetails("ExcSK.emin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k", new AttrDetails("ExcSK.k", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k1", new AttrDetails("ExcSK.k1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k2", new AttrDetails("ExcSK.k2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("ExcSK.kc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kce", new AttrDetails("ExcSK.kce", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("ExcSK.kd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kgob", new AttrDetails("ExcSK.kgob", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("ExcSK.kp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kqi", new AttrDetails("ExcSK.kqi", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kqob", new AttrDetails("ExcSK.kqob", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kqp", new AttrDetails("ExcSK.kqp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("nq", new AttrDetails("ExcSK.nq", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qconoff", new AttrDetails("ExcSK.qconoff", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qz", new AttrDetails("ExcSK.qz", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("remote", new AttrDetails("ExcSK.remote", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("sbase", new AttrDetails("ExcSK.sbase", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("ExcSK.tc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcSK.te", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti", new AttrDetails("ExcSK.ti", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tp", new AttrDetails("ExcSK.tp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tr", new AttrDetails("ExcSK.tr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uimax", new AttrDetails("ExcSK.uimax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uimin", new AttrDetails("ExcSK.uimin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("urmax", new AttrDetails("ExcSK.urmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("urmin", new AttrDetails("ExcSK.urmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vtmax", new AttrDetails("ExcSK.vtmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vtmin", new AttrDetails("ExcSK.vtmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("yp", new AttrDetails("ExcSK.yp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcSK().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("efdmax", new GetterSetter(this::efdmaxToString, null, this::setEfdmax));
        map.put("efdmin", new GetterSetter(this::efdminToString, null, this::setEfdmin));
        map.put("emax", new GetterSetter(this::emaxToString, null, this::setEmax));
        map.put("emin", new GetterSetter(this::eminToString, null, this::setEmin));
        map.put("k", new GetterSetter(this::kToString, null, this::setK));
        map.put("k1", new GetterSetter(this::k1ToString, null, this::setK1));
        map.put("k2", new GetterSetter(this::k2ToString, null, this::setK2));
        map.put("kc", new GetterSetter(this::kcToString, null, this::setKc));
        map.put("kce", new GetterSetter(this::kceToString, null, this::setKce));
        map.put("kd", new GetterSetter(this::kdToString, null, this::setKd));
        map.put("kgob", new GetterSetter(this::kgobToString, null, this::setKgob));
        map.put("kp", new GetterSetter(this::kpToString, null, this::setKp));
        map.put("kqi", new GetterSetter(this::kqiToString, null, this::setKqi));
        map.put("kqob", new GetterSetter(this::kqobToString, null, this::setKqob));
        map.put("kqp", new GetterSetter(this::kqpToString, null, this::setKqp));
        map.put("nq", new GetterSetter(this::nqToString, null, this::setNq));
        map.put("qconoff", new GetterSetter(this::qconoffToString, null, this::setQconoff));
        map.put("qz", new GetterSetter(this::qzToString, null, this::setQz));
        map.put("remote", new GetterSetter(this::remoteToString, null, this::setRemote));
        map.put("sbase", new GetterSetter(this::sbaseToString, null, this::setSbase));
        map.put("tc", new GetterSetter(this::tcToString, null, this::setTc));
        map.put("te", new GetterSetter(this::teToString, null, this::setTe));
        map.put("ti", new GetterSetter(this::tiToString, null, this::setTi));
        map.put("tp", new GetterSetter(this::tpToString, null, this::setTp));
        map.put("tr", new GetterSetter(this::trToString, null, this::setTr));
        map.put("uimax", new GetterSetter(this::uimaxToString, null, this::setUimax));
        map.put("uimin", new GetterSetter(this::uiminToString, null, this::setUimin));
        map.put("urmax", new GetterSetter(this::urmaxToString, null, this::setUrmax));
        map.put("urmin", new GetterSetter(this::urminToString, null, this::setUrmin));
        map.put("vtmax", new GetterSetter(this::vtmaxToString, null, this::setVtmax));
        map.put("vtmin", new GetterSetter(this::vtminToString, null, this::setVtmin));
        map.put("yp", new GetterSetter(this::ypToString, null, this::setYp));
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
