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
 * Detailed hydro unit - Francis model.  This model can be used to represent three types of governors. A schematic of the hydraulic system of detailed hydro unit models, such as Francis and Pelton, is provided in the DetailedHydroModelHydraulicSystem diagram.
 */
@SuppressWarnings("unused")
public class GovHydroFrancis extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydroFrancis.class);

    /**
     * Default constructor.
     */
    public GovHydroFrancis() {
        setCimType("GovHydroFrancis");
    }

    /**
     * Opening section &lt;i&gt;S&lt;/i&gt;&lt;i&gt;&lt;sub&gt;EFF&lt;/sub&gt;&lt;/i&gt; at the maximum efficiency (&lt;i&gt;Am&lt;/i&gt;).  Typical value = 0,7.
     */
    private Double am; // PU

    public Double getAm() {
        return am;
    }

    public void setAm(Double _value_) {
        am = _value_;
    }

    public void setAm(String _value_) {
        am = getDoubleFromString(_value_);
    }

    public String amToString() {
        return am != null ? am.toString() : null;
    }

    /**
     * Area of the surge tank (&lt;i&gt;A&lt;/i&gt;&lt;i&gt;&lt;sub&gt;V0&lt;/sub&gt;&lt;/i&gt;). Unit = m&lt;sup&gt;2&lt;/sup&gt;. Typical value = 30.
     */
    private Double av0; // Area

    public Double getAv0() {
        return av0;
    }

    public void setAv0(Double _value_) {
        av0 = _value_;
    }

    public void setAv0(String _value_) {
        av0 = getDoubleFromString(_value_);
    }

    public String av0ToString() {
        return av0 != null ? av0.toString() : null;
    }

    /**
     * Area of the compensation tank (&lt;i&gt;A&lt;/i&gt;&lt;i&gt;&lt;sub&gt;V1&lt;/sub&gt;&lt;/i&gt;). Unit = m&lt;sup&gt;2&lt;/sup&gt;. Typical value = 700.
     */
    private Double av1; // Area

    public Double getAv1() {
        return av1;
    }

    public void setAv1(Double _value_) {
        av1 = _value_;
    }

    public void setAv1(String _value_) {
        av1 = getDoubleFromString(_value_);
    }

    public String av1ToString() {
        return av1 != null ? av1.toString() : null;
    }

    /**
     * Droop (&lt;i&gt;Bp&lt;/i&gt;).  Typical value = 0,05.
     */
    private Double bp; // PU

    public Double getBp() {
        return bp;
    }

    public void setBp(Double _value_) {
        bp = _value_;
    }

    public void setBp(String _value_) {
        bp = getDoubleFromString(_value_);
    }

    public String bpToString() {
        return bp != null ? bp.toString() : null;
    }

    /**
     * Intentional dead-band width (&lt;i&gt;DB1&lt;/i&gt;).  Unit = Hz.  Typical value = 0.
     */
    private Double db1; // Frequency

    public Double getDb1() {
        return db1;
    }

    public void setDb1(Double _value_) {
        db1 = _value_;
    }

    public void setDb1(String _value_) {
        db1 = getDoubleFromString(_value_);
    }

    public String db1ToString() {
        return db1 != null ? db1.toString() : null;
    }

    /**
     * Maximum efficiency (&lt;i&gt;EtaMax&lt;/i&gt;).  Typical value = 1,05.
     */
    private Double etamax; // PU

    public Double getEtamax() {
        return etamax;
    }

    public void setEtamax(Double _value_) {
        etamax = _value_;
    }

    public void setEtamax(String _value_) {
        etamax = getDoubleFromString(_value_);
    }

    public String etamaxToString() {
        return etamax != null ? etamax.toString() : null;
    }

    /**
     * Governor control flag (&lt;i&gt;Cflag&lt;/i&gt;).  Typical value = mechanicHydrolicTachoAccelerator.
     */
    private String governorControl; // FrancisGovernorControlKind

    public String getGovernorControl() {
        return governorControl;
    }

    public void setGovernorControl(String _value_) {
        governorControl = _value_;
    }

    public String governorControlToString() {
        return governorControl;
    }

    /**
     * Head of compensation chamber water level with respect to the level of penstock (&lt;i&gt;H&lt;/i&gt;&lt;i&gt;&lt;sub&gt;1&lt;/sub&gt;&lt;/i&gt;).  Unit = km.  Typical value = 0,004.
     */
    private Double h1; // Length

    public Double getH1() {
        return h1;
    }

    public void setH1(Double _value_) {
        h1 = _value_;
    }

    public void setH1(String _value_) {
        h1 = getDoubleFromString(_value_);
    }

    public String h1ToString() {
        return h1 != null ? h1.toString() : null;
    }

    /**
     * Head of surge tank water level with respect to the level of penstock (&lt;i&gt;H&lt;/i&gt;&lt;i&gt;&lt;sub&gt;2&lt;/sub&gt;&lt;/i&gt;).  Unit = km.  Typical value = 0,040.
     */
    private Double h2; // Length

    public Double getH2() {
        return h2;
    }

    public void setH2(Double _value_) {
        h2 = _value_;
    }

    public void setH2(String _value_) {
        h2 = getDoubleFromString(_value_);
    }

    public String h2ToString() {
        return h2 != null ? h2.toString() : null;
    }

    /**
     * Rated hydraulic head (&lt;i&gt;H&lt;/i&gt;&lt;i&gt;&lt;sub&gt;n&lt;/sub&gt;&lt;/i&gt;).  Unit = km.  Typical value = 0,250.
     */
    private Double hn; // Length

    public Double getHn() {
        return hn;
    }

    public void setHn(Double _value_) {
        hn = _value_;
    }

    public void setHn(String _value_) {
        hn = getDoubleFromString(_value_);
    }

    public String hnToString() {
        return hn != null ? hn.toString() : null;
    }

    /**
     * Penstock loss coefficient (due to friction) (&lt;i&gt;Kc&lt;/i&gt;).  Typical value = 0,025.
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
     * Water tunnel and surge chamber loss coefficient (due to friction) (&lt;i&gt;Kg&lt;/i&gt;).  Typical value = 0,025.
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
     * Washout gain (&lt;i&gt;Kt&lt;/i&gt;).  Typical value = 0,25.
     */
    private Double kt; // PU

    public Double getKt() {
        return kt;
    }

    public void setKt(Double _value_) {
        kt = _value_;
    }

    public void setKt(String _value_) {
        kt = getDoubleFromString(_value_);
    }

    public String ktToString() {
        return kt != null ? kt.toString() : null;
    }

    /**
     * No-load turbine flow at nominal head (&lt;i&gt;Qc0&lt;/i&gt;).  Typical value = 0,1.
     */
    private Double qc0; // PU

    public Double getQc0() {
        return qc0;
    }

    public void setQc0(Double _value_) {
        qc0 = _value_;
    }

    public void setQc0(String _value_) {
        qc0 = getDoubleFromString(_value_);
    }

    public String qc0ToString() {
        return qc0 != null ? qc0.toString() : null;
    }

    /**
     * Rated flow (&lt;i&gt;Q&lt;/i&gt;&lt;i&gt;&lt;sub&gt;n&lt;/sub&gt;&lt;/i&gt;). Unit = m&lt;sup&gt;3&lt;/sup&gt;/s. Typical value = 250.
     */
    private Double qn; // VolumeFlowRate

    public Double getQn() {
        return qn;
    }

    public void setQn(Double _value_) {
        qn = _value_;
    }

    public void setQn(String _value_) {
        qn = getDoubleFromString(_value_);
    }

    public String qnToString() {
        return qn != null ? qn.toString() : null;
    }

    /**
     * Derivative gain (&lt;i&gt;Ta&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 3.
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
     * Washout time constant (&lt;i&gt;Td&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 6.
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
     * Gate servo time constant (&lt;i&gt;Ts&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,5.
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
     * Water inertia time constant (&lt;i&gt;Twnc&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 1.
     */
    private Double twnc; // Seconds

    public Double getTwnc() {
        return twnc;
    }

    public void setTwnc(Double _value_) {
        twnc = _value_;
    }

    public void setTwnc(String _value_) {
        twnc = getDoubleFromString(_value_);
    }

    public String twncToString() {
        return twnc != null ? twnc.toString() : null;
    }

    /**
     * Water tunnel and surge chamber inertia time constant (&lt;i&gt;Twng&lt;/i&gt;) (&amp;gt;= 0). Typical value = 3.
     */
    private Double twng; // Seconds

    public Double getTwng() {
        return twng;
    }

    public void setTwng(Double _value_) {
        twng = _value_;
    }

    public void setTwng(String _value_) {
        twng = getDoubleFromString(_value_);
    }

    public String twngToString() {
        return twng != null ? twng.toString() : null;
    }

    /**
     * Derivative feedback gain (&lt;i&gt;Tx&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 1.
     */
    private Double tx; // Seconds

    public Double getTx() {
        return tx;
    }

    public void setTx(Double _value_) {
        tx = _value_;
    }

    public void setTx(String _value_) {
        tx = getDoubleFromString(_value_);
    }

    public String txToString() {
        return tx != null ? tx.toString() : null;
    }

    /**
     * Maximum gate opening velocity (&lt;i&gt;Va&lt;/i&gt;).  Unit = PU / s.  Typical value = 0,06.
     */
    private Float va; // Float

    public Float getVa() {
        return va;
    }

    public void setVa(Float _value_) {
        va = _value_;
    }

    public void setVa(String _value_) {
        va = getFloatFromString(_value_);
    }

    public String vaToString() {
        return va != null ? va.toString() : null;
    }

    /**
     * Maximum gate opening (&lt;i&gt;ValvMax&lt;/i&gt;) (&amp;gt; GovHydroFrancis.valvmin).  Typical value = 1,1.
     */
    private Double valvmax; // PU

    public Double getValvmax() {
        return valvmax;
    }

    public void setValvmax(Double _value_) {
        valvmax = _value_;
    }

    public void setValvmax(String _value_) {
        valvmax = getDoubleFromString(_value_);
    }

    public String valvmaxToString() {
        return valvmax != null ? valvmax.toString() : null;
    }

    /**
     * Minimum gate opening (&lt;i&gt;ValvMin&lt;/i&gt;) (&amp;lt; GovHydroFrancis.valvmax).  Typical value = 0.
     */
    private Double valvmin; // PU

    public Double getValvmin() {
        return valvmin;
    }

    public void setValvmin(Double _value_) {
        valvmin = _value_;
    }

    public void setValvmin(String _value_) {
        valvmin = getDoubleFromString(_value_);
    }

    public String valvminToString() {
        return valvmin != null ? valvmin.toString() : null;
    }

    /**
     * Maximum gate closing velocity (&lt;i&gt;Vc&lt;/i&gt;).  Unit = PU / s.  Typical value = -0,06.
     */
    private Float vc; // Float

    public Float getVc() {
        return vc;
    }

    public void setVc(Float _value_) {
        vc = _value_;
    }

    public void setVc(String _value_) {
        vc = getFloatFromString(_value_);
    }

    public String vcToString() {
        return vc != null ? vc.toString() : null;
    }

    /**
     * Water tunnel and surge chamber simulation (&lt;i&gt;Tflag&lt;/i&gt;). true = enable of water tunnel and surge chamber simulation false = inhibit of water tunnel and surge chamber simulation. Typical value = false.
     */
    private Boolean waterTunnelSurgeChamberSimulation; // Boolean

    public Boolean getWaterTunnelSurgeChamberSimulation() {
        return waterTunnelSurgeChamberSimulation;
    }

    public void setWaterTunnelSurgeChamberSimulation(Boolean _value_) {
        waterTunnelSurgeChamberSimulation = _value_;
    }

    public void setWaterTunnelSurgeChamberSimulation(String _value_) {
        waterTunnelSurgeChamberSimulation = getBooleanFromString(_value_);
    }

    public String waterTunnelSurgeChamberSimulationToString() {
        return waterTunnelSurgeChamberSimulation != null ? waterTunnelSurgeChamberSimulation.toString() : null;
    }

    /**
     * Head of upper water level with respect to the level of penstock (&lt;i&gt;Zsfc&lt;/i&gt;). Unit = km.  Typical value = 0,025.
     */
    private Double zsfc; // Length

    public Double getZsfc() {
        return zsfc;
    }

    public void setZsfc(Double _value_) {
        zsfc = _value_;
    }

    public void setZsfc(String _value_) {
        zsfc = getDoubleFromString(_value_);
    }

    public String zsfcToString() {
        return zsfc != null ? zsfc.toString() : null;
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
        return getAttribute("GovHydroFrancis", attrName);
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
        setAttribute("GovHydroFrancis", attrName, objectValue);
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
        setAttribute("GovHydroFrancis", attrName, stringValue);
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
            map.put("am", new AttrDetails("GovHydroFrancis.am", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("av0", new AttrDetails("GovHydroFrancis.av0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("av1", new AttrDetails("GovHydroFrancis.av1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bp", new AttrDetails("GovHydroFrancis.bp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db1", new AttrDetails("GovHydroFrancis.db1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("etamax", new AttrDetails("GovHydroFrancis.etamax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("governorControl", new AttrDetails("GovHydroFrancis.governorControl", true, "http://iec.ch/TC57/CIM100#", profiles, false, true));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("h1", new AttrDetails("GovHydroFrancis.h1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("h2", new AttrDetails("GovHydroFrancis.h2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("hn", new AttrDetails("GovHydroFrancis.hn", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("GovHydroFrancis.kc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kg", new AttrDetails("GovHydroFrancis.kg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kt", new AttrDetails("GovHydroFrancis.kt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qc0", new AttrDetails("GovHydroFrancis.qc0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qn", new AttrDetails("GovHydroFrancis.qn", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("GovHydroFrancis.ta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("td", new AttrDetails("GovHydroFrancis.td", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ts", new AttrDetails("GovHydroFrancis.ts", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twnc", new AttrDetails("GovHydroFrancis.twnc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twng", new AttrDetails("GovHydroFrancis.twng", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tx", new AttrDetails("GovHydroFrancis.tx", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("va", new AttrDetails("GovHydroFrancis.va", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("valvmax", new AttrDetails("GovHydroFrancis.valvmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("valvmin", new AttrDetails("GovHydroFrancis.valvmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vc", new AttrDetails("GovHydroFrancis.vc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("waterTunnelSurgeChamberSimulation", new AttrDetails("GovHydroFrancis.waterTunnelSurgeChamberSimulation", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("zsfc", new AttrDetails("GovHydroFrancis.zsfc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovHydroFrancis().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("am", new GetterSetter(this::amToString, null, this::setAm));
        map.put("av0", new GetterSetter(this::av0ToString, null, this::setAv0));
        map.put("av1", new GetterSetter(this::av1ToString, null, this::setAv1));
        map.put("bp", new GetterSetter(this::bpToString, null, this::setBp));
        map.put("db1", new GetterSetter(this::db1ToString, null, this::setDb1));
        map.put("etamax", new GetterSetter(this::etamaxToString, null, this::setEtamax));
        map.put("governorControl", new GetterSetter(this::governorControlToString, null, this::setGovernorControl));
        map.put("h1", new GetterSetter(this::h1ToString, null, this::setH1));
        map.put("h2", new GetterSetter(this::h2ToString, null, this::setH2));
        map.put("hn", new GetterSetter(this::hnToString, null, this::setHn));
        map.put("kc", new GetterSetter(this::kcToString, null, this::setKc));
        map.put("kg", new GetterSetter(this::kgToString, null, this::setKg));
        map.put("kt", new GetterSetter(this::ktToString, null, this::setKt));
        map.put("qc0", new GetterSetter(this::qc0ToString, null, this::setQc0));
        map.put("qn", new GetterSetter(this::qnToString, null, this::setQn));
        map.put("ta", new GetterSetter(this::taToString, null, this::setTa));
        map.put("td", new GetterSetter(this::tdToString, null, this::setTd));
        map.put("ts", new GetterSetter(this::tsToString, null, this::setTs));
        map.put("twnc", new GetterSetter(this::twncToString, null, this::setTwnc));
        map.put("twng", new GetterSetter(this::twngToString, null, this::setTwng));
        map.put("tx", new GetterSetter(this::txToString, null, this::setTx));
        map.put("va", new GetterSetter(this::vaToString, null, this::setVa));
        map.put("valvmax", new GetterSetter(this::valvmaxToString, null, this::setValvmax));
        map.put("valvmin", new GetterSetter(this::valvminToString, null, this::setValvmin));
        map.put("vc", new GetterSetter(this::vcToString, null, this::setVc));
        map.put("waterTunnelSurgeChamberSimulation", new GetterSetter(this::waterTunnelSurgeChamberSimulationToString, null, this::setWaterTunnelSurgeChamberSimulation));
        map.put("zsfc", new GetterSetter(this::zsfcToString, null, this::setZsfc));
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
