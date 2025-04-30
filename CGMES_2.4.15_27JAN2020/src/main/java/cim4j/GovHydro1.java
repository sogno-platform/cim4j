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
 * Basic Hydro turbine governor model.
 */
@SuppressWarnings("unused")
public class GovHydro1 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydro1.class);

    /**
     * Default constructor.
     */
    public GovHydro1() {
        setCimType("GovHydro1");
    }

    /**
     * Turbine gain (At) (&gt;0).  Typical Value = 1.2.
     */
    private Double at; // PU

    public Double getAt() {
        return at;
    }

    public void setAt(Double _value_) {
        at = _value_;
    }

    public void setAt(String _value_) {
        at = getDoubleFromString(_value_);
    }

    public String atToString() {
        return at != null ? at.toString() : null;
    }

    /**
     * Turbine damping factor (Dturb) (&gt;=0).  Typical Value = 0.5.
     */
    private Double dturb; // PU

    public Double getDturb() {
        return dturb;
    }

    public void setDturb(Double _value_) {
        dturb = _value_;
    }

    public void setDturb(String _value_) {
        dturb = getDoubleFromString(_value_);
    }

    public String dturbToString() {
        return dturb != null ? dturb.toString() : null;
    }

    /**
     * Maximum gate opening (Gmax) (&gt;0).  Typical Value = 1.
     */
    private Double gmax; // PU

    public Double getGmax() {
        return gmax;
    }

    public void setGmax(Double _value_) {
        gmax = _value_;
    }

    public void setGmax(String _value_) {
        gmax = getDoubleFromString(_value_);
    }

    public String gmaxToString() {
        return gmax != null ? gmax.toString() : null;
    }

    /**
     * Minimum gate opening (Gmin) (&gt;=0).  Typical Value = 0.
     */
    private Double gmin; // PU

    public Double getGmin() {
        return gmin;
    }

    public void setGmin(Double _value_) {
        gmin = _value_;
    }

    public void setGmin(String _value_) {
        gmin = getDoubleFromString(_value_);
    }

    public String gminToString() {
        return gmin != null ? gmin.toString() : null;
    }

    /**
     * Turbine nominal head (hdam).  Typical Value = 1.
     */
    private Double hdam; // PU

    public Double getHdam() {
        return hdam;
    }

    public void setHdam(Double _value_) {
        hdam = _value_;
    }

    public void setHdam(String _value_) {
        hdam = getDoubleFromString(_value_);
    }

    public String hdamToString() {
        return hdam != null ? hdam.toString() : null;
    }

    /**
     * Base for power values (MWbase) (&gt; 0).  Unit = MW.
     */
    private Double mwbase; // ActivePower

    public Double getMwbase() {
        return mwbase;
    }

    public void setMwbase(Double _value_) {
        mwbase = _value_;
    }

    public void setMwbase(String _value_) {
        mwbase = getDoubleFromString(_value_);
    }

    public String mwbaseToString() {
        return mwbase != null ? mwbase.toString() : null;
    }

    /**
     * No-load flow at nominal head (qnl) (&gt;=0).  Typical Value = 0.08.
     */
    private Double qnl; // PU

    public Double getQnl() {
        return qnl;
    }

    public void setQnl(Double _value_) {
        qnl = _value_;
    }

    public void setQnl(String _value_) {
        qnl = getDoubleFromString(_value_);
    }

    public String qnlToString() {
        return qnl != null ? qnl.toString() : null;
    }

    /**
     * Permanent droop (R) (&gt;0).  Typical Value = 0.04.
     */
    private Double rperm; // PU

    public Double getRperm() {
        return rperm;
    }

    public void setRperm(Double _value_) {
        rperm = _value_;
    }

    public void setRperm(String _value_) {
        rperm = getDoubleFromString(_value_);
    }

    public String rpermToString() {
        return rperm != null ? rperm.toString() : null;
    }

    /**
     * Temporary droop (r) (&gt;R).  Typical Value = 0.3.
     */
    private Double rtemp; // PU

    public Double getRtemp() {
        return rtemp;
    }

    public void setRtemp(Double _value_) {
        rtemp = _value_;
    }

    public void setRtemp(String _value_) {
        rtemp = getDoubleFromString(_value_);
    }

    public String rtempToString() {
        return rtemp != null ? rtemp.toString() : null;
    }

    /**
     * Filter time constant () (&gt;0).  Typical Value = 0.05.
     */
    private Double tf; // Seconds

    public Double getTf() {
        return tf;
    }

    public void setTf(Double _value_) {
        tf = _value_;
    }

    public void setTf(String _value_) {
        tf = getDoubleFromString(_value_);
    }

    public String tfToString() {
        return tf != null ? tf.toString() : null;
    }

    /**
     * Gate servo time constant (Tg) (&gt;0).  Typical Value = 0.5.
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
     * Washout time constant (Tr) (&gt;0).  Typical Value = 5.
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
     * Water inertia time constant (Tw) (&gt;0).  Typical Value = 1.
     */
    private Double tw; // Seconds

    public Double getTw() {
        return tw;
    }

    public void setTw(Double _value_) {
        tw = _value_;
    }

    public void setTw(String _value_) {
        tw = getDoubleFromString(_value_);
    }

    public String twToString() {
        return tw != null ? tw.toString() : null;
    }

    /**
     * Maximum gate velocity (Vlem) (&gt;0).  Typical Value = 0.2.
     */
    private Double velm; // Simple_Float

    public Double getVelm() {
        return velm;
    }

    public void setVelm(Double _value_) {
        velm = _value_;
    }

    public void setVelm(String _value_) {
        velm = getDoubleFromString(_value_);
    }

    public String velmToString() {
        return velm != null ? velm.toString() : null;
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
        return getAttribute("GovHydro1", attrName);
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
        setAttribute("GovHydro1", attrName, objectValue);
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
        setAttribute("GovHydro1", attrName, stringValue);
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

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/2013/CIM-schema-cim16#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("at", new AttrDetails("GovHydro1.at", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dturb", new AttrDetails("GovHydro1.dturb", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gmax", new AttrDetails("GovHydro1.gmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gmin", new AttrDetails("GovHydro1.gmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("hdam", new AttrDetails("GovHydro1.hdam", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovHydro1.mwbase", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qnl", new AttrDetails("GovHydro1.qnl", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rperm", new AttrDetails("GovHydro1.rperm", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rtemp", new AttrDetails("GovHydro1.rtemp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("GovHydro1.tf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tg", new AttrDetails("GovHydro1.tg", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tr", new AttrDetails("GovHydro1.tr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw", new AttrDetails("GovHydro1.tw", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("velm", new AttrDetails("GovHydro1.velm", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovHydro1().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("at", new GetterSetter(this::atToString, null, this::setAt));
        map.put("dturb", new GetterSetter(this::dturbToString, null, this::setDturb));
        map.put("gmax", new GetterSetter(this::gmaxToString, null, this::setGmax));
        map.put("gmin", new GetterSetter(this::gminToString, null, this::setGmin));
        map.put("hdam", new GetterSetter(this::hdamToString, null, this::setHdam));
        map.put("mwbase", new GetterSetter(this::mwbaseToString, null, this::setMwbase));
        map.put("qnl", new GetterSetter(this::qnlToString, null, this::setQnl));
        map.put("rperm", new GetterSetter(this::rpermToString, null, this::setRperm));
        map.put("rtemp", new GetterSetter(this::rtempToString, null, this::setRtemp));
        map.put("tf", new GetterSetter(this::tfToString, null, this::setTf));
        map.put("tg", new GetterSetter(this::tgToString, null, this::setTg));
        map.put("tr", new GetterSetter(this::trToString, null, this::setTr));
        map.put("tw", new GetterSetter(this::twToString, null, this::setTw));
        map.put("velm", new GetterSetter(this::velmToString, null, this::setVelm));
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
