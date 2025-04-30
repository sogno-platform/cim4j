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
 * Woodward PID Hydro Governor.
 */
@SuppressWarnings("unused")
public class GovHydroWPID extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydroWPID.class);

    /**
     * Default constructor.
     */
    public GovHydroWPID() {
        setCimType("GovHydroWPID");
    }

    /**
     * Turbine damping factor (D).  Unit = delta P / delta speed.
     */
    private Double d; // PU

    public Double getD() {
        return d;
    }

    public void setD(Double _value_) {
        d = _value_;
    }

    public void setD(String _value_) {
        d = getDoubleFromString(_value_);
    }

    public String dToString() {
        return d != null ? d.toString() : null;
    }

    /**
     * Gate opening Limit Maximum (Gatmax).
     */
    private Double gatmax; // PU

    public Double getGatmax() {
        return gatmax;
    }

    public void setGatmax(Double _value_) {
        gatmax = _value_;
    }

    public void setGatmax(String _value_) {
        gatmax = getDoubleFromString(_value_);
    }

    public String gatmaxToString() {
        return gatmax != null ? gatmax.toString() : null;
    }

    /**
     * Gate opening Limit Minimum (Gatmin).
     */
    private Double gatmin; // PU

    public Double getGatmin() {
        return gatmin;
    }

    public void setGatmin(Double _value_) {
        gatmin = _value_;
    }

    public void setGatmin(String _value_) {
        gatmin = getDoubleFromString(_value_);
    }

    public String gatminToString() {
        return gatmin != null ? gatmin.toString() : null;
    }

    /**
     * Gate position 1 (Gv1).
     */
    private Double gv1; // PU

    public Double getGv1() {
        return gv1;
    }

    public void setGv1(Double _value_) {
        gv1 = _value_;
    }

    public void setGv1(String _value_) {
        gv1 = getDoubleFromString(_value_);
    }

    public String gv1ToString() {
        return gv1 != null ? gv1.toString() : null;
    }

    /**
     * Gate position 2 (Gv2).
     */
    private Double gv2; // PU

    public Double getGv2() {
        return gv2;
    }

    public void setGv2(Double _value_) {
        gv2 = _value_;
    }

    public void setGv2(String _value_) {
        gv2 = getDoubleFromString(_value_);
    }

    public String gv2ToString() {
        return gv2 != null ? gv2.toString() : null;
    }

    /**
     * Gate position 3 (Gv3).
     */
    private Double gv3; // PU

    public Double getGv3() {
        return gv3;
    }

    public void setGv3(Double _value_) {
        gv3 = _value_;
    }

    public void setGv3(String _value_) {
        gv3 = getDoubleFromString(_value_);
    }

    public String gv3ToString() {
        return gv3 != null ? gv3.toString() : null;
    }

    /**
     * Derivative gain (Kd).  Typical Value = 1.11.
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
     * Reset gain (Ki).  Typical Value = 0.36.
     */
    private Double ki; // PU

    public Double getKi() {
        return ki;
    }

    public void setKi(Double _value_) {
        ki = _value_;
    }

    public void setKi(String _value_) {
        ki = getDoubleFromString(_value_);
    }

    public String kiToString() {
        return ki != null ? ki.toString() : null;
    }

    /**
     * Proportional gain (Kp).  Typical Value = 0.1.
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
     * Base for power values  (MWbase) (&gt;0).  Unit = MW.
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
     * Output at Gv1 PU of MWbase (Pgv1).
     */
    private Double pgv1; // PU

    public Double getPgv1() {
        return pgv1;
    }

    public void setPgv1(Double _value_) {
        pgv1 = _value_;
    }

    public void setPgv1(String _value_) {
        pgv1 = getDoubleFromString(_value_);
    }

    public String pgv1ToString() {
        return pgv1 != null ? pgv1.toString() : null;
    }

    /**
     * Output at Gv2 PU of MWbase (Pgv2).
     */
    private Double pgv2; // PU

    public Double getPgv2() {
        return pgv2;
    }

    public void setPgv2(Double _value_) {
        pgv2 = _value_;
    }

    public void setPgv2(String _value_) {
        pgv2 = getDoubleFromString(_value_);
    }

    public String pgv2ToString() {
        return pgv2 != null ? pgv2.toString() : null;
    }

    /**
     * Output at Gv3 PU of MWbase (Pgv3).
     */
    private Double pgv3; // PU

    public Double getPgv3() {
        return pgv3;
    }

    public void setPgv3(Double _value_) {
        pgv3 = _value_;
    }

    public void setPgv3(String _value_) {
        pgv3 = getDoubleFromString(_value_);
    }

    public String pgv3ToString() {
        return pgv3 != null ? pgv3.toString() : null;
    }

    /**
     * Maximum Power Output (Pmax).
     */
    private Double pmax; // PU

    public Double getPmax() {
        return pmax;
    }

    public void setPmax(Double _value_) {
        pmax = _value_;
    }

    public void setPmax(String _value_) {
        pmax = getDoubleFromString(_value_);
    }

    public String pmaxToString() {
        return pmax != null ? pmax.toString() : null;
    }

    /**
     * Minimum Power Output (Pmin).
     */
    private Double pmin; // PU

    public Double getPmin() {
        return pmin;
    }

    public void setPmin(Double _value_) {
        pmin = _value_;
    }

    public void setPmin(String _value_) {
        pmin = getDoubleFromString(_value_);
    }

    public String pminToString() {
        return pmin != null ? pmin.toString() : null;
    }

    /**
     * Permanent drop (Reg).
     */
    private Double reg; // PU

    public Double getReg() {
        return reg;
    }

    public void setReg(Double _value_) {
        reg = _value_;
    }

    public void setReg(String _value_) {
        reg = getDoubleFromString(_value_);
    }

    public String regToString() {
        return reg != null ? reg.toString() : null;
    }

    /**
     * Controller time constant (Ta) (&gt;0).  Typical Value = 0.
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
     * Gate servo time constant (Tb) (&gt;0).  Typical Value = 0.
     */
    private Double tb; // Seconds

    public Double getTb() {
        return tb;
    }

    public void setTb(Double _value_) {
        tb = _value_;
    }

    public void setTb(String _value_) {
        tb = getDoubleFromString(_value_);
    }

    public String tbToString() {
        return tb != null ? tb.toString() : null;
    }

    /**
     * Speed detector time constant (Treg).
     */
    private Double treg; // Seconds

    public Double getTreg() {
        return treg;
    }

    public void setTreg(Double _value_) {
        treg = _value_;
    }

    public void setTreg(String _value_) {
        treg = getDoubleFromString(_value_);
    }

    public String tregToString() {
        return treg != null ? treg.toString() : null;
    }

    /**
     * Water inertia time constant (Tw) (&gt;0).  Typical Value = 0.
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
     * Maximum gate opening velocity (Velmax).  Unit = PU/sec.  Typical Value = 0.
     */
    private Double velmax; // PU

    public Double getVelmax() {
        return velmax;
    }

    public void setVelmax(Double _value_) {
        velmax = _value_;
    }

    public void setVelmax(String _value_) {
        velmax = getDoubleFromString(_value_);
    }

    public String velmaxToString() {
        return velmax != null ? velmax.toString() : null;
    }

    /**
     * Maximum gate closing velocity (Velmin).  Unit = PU/sec.  Typical Value = 0.
     */
    private Double velmin; // PU

    public Double getVelmin() {
        return velmin;
    }

    public void setVelmin(Double _value_) {
        velmin = _value_;
    }

    public void setVelmin(String _value_) {
        velmin = getDoubleFromString(_value_);
    }

    public String velminToString() {
        return velmin != null ? velmin.toString() : null;
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
        return getAttribute("GovHydroWPID", attrName);
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
        setAttribute("GovHydroWPID", attrName, objectValue);
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
        setAttribute("GovHydroWPID", attrName, stringValue);
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
            map.put("d", new AttrDetails("GovHydroWPID.d", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gatmax", new AttrDetails("GovHydroWPID.gatmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gatmin", new AttrDetails("GovHydroWPID.gatmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv1", new AttrDetails("GovHydroWPID.gv1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv2", new AttrDetails("GovHydroWPID.gv2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv3", new AttrDetails("GovHydroWPID.gv3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("GovHydroWPID.kd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("GovHydroWPID.ki", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("GovHydroWPID.kp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovHydroWPID.mwbase", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv1", new AttrDetails("GovHydroWPID.pgv1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv2", new AttrDetails("GovHydroWPID.pgv2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv3", new AttrDetails("GovHydroWPID.pgv3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmax", new AttrDetails("GovHydroWPID.pmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmin", new AttrDetails("GovHydroWPID.pmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("reg", new AttrDetails("GovHydroWPID.reg", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("GovHydroWPID.ta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("GovHydroWPID.tb", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("treg", new AttrDetails("GovHydroWPID.treg", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw", new AttrDetails("GovHydroWPID.tw", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("velmax", new AttrDetails("GovHydroWPID.velmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("velmin", new AttrDetails("GovHydroWPID.velmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovHydroWPID().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("d", new GetterSetter(this::dToString, null, this::setD));
        map.put("gatmax", new GetterSetter(this::gatmaxToString, null, this::setGatmax));
        map.put("gatmin", new GetterSetter(this::gatminToString, null, this::setGatmin));
        map.put("gv1", new GetterSetter(this::gv1ToString, null, this::setGv1));
        map.put("gv2", new GetterSetter(this::gv2ToString, null, this::setGv2));
        map.put("gv3", new GetterSetter(this::gv3ToString, null, this::setGv3));
        map.put("kd", new GetterSetter(this::kdToString, null, this::setKd));
        map.put("ki", new GetterSetter(this::kiToString, null, this::setKi));
        map.put("kp", new GetterSetter(this::kpToString, null, this::setKp));
        map.put("mwbase", new GetterSetter(this::mwbaseToString, null, this::setMwbase));
        map.put("pgv1", new GetterSetter(this::pgv1ToString, null, this::setPgv1));
        map.put("pgv2", new GetterSetter(this::pgv2ToString, null, this::setPgv2));
        map.put("pgv3", new GetterSetter(this::pgv3ToString, null, this::setPgv3));
        map.put("pmax", new GetterSetter(this::pmaxToString, null, this::setPmax));
        map.put("pmin", new GetterSetter(this::pminToString, null, this::setPmin));
        map.put("reg", new GetterSetter(this::regToString, null, this::setReg));
        map.put("ta", new GetterSetter(this::taToString, null, this::setTa));
        map.put("tb", new GetterSetter(this::tbToString, null, this::setTb));
        map.put("treg", new GetterSetter(this::tregToString, null, this::setTreg));
        map.put("tw", new GetterSetter(this::twToString, null, this::setTw));
        map.put("velmax", new GetterSetter(this::velmaxToString, null, this::setVelmax));
        map.put("velmin", new GetterSetter(this::velminToString, null, this::setVelmin));
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
