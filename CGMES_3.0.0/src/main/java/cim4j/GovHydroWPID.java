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
 * Woodward<sup>TM</sup> PID hydro governor. [Footnote: Woodward PID hydro governors are an example of suitable products available commercially. This information is given for the convenience of users of this document and does not constitute an endorsement by IEC of these products.]
 */
@SuppressWarnings("unused")
public class GovHydroWPID extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydroWPID.class);

    /**
     * Constructor.
     */
    public GovHydroWPID(String rdfid) {
        super("GovHydroWPID", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovHydroWPID(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Turbine damping factor (<i>D</i>).  Unit = delta P / delta speed.
     */
    private Double d; // PU

    public Double getD() {
        return d;
    }

    public void setD(Double _value_) {
        d = _value_;
    }

    private static Object getD(BaseClass _this_) {
        return ((GovHydroWPID) _this_).getD();
    }

    private static void setD(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWPID) _this_).setD((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWPID) _this_).setD(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gate opening limit maximum (<i>Gatmax</i>) (&gt; GovHydroWPID.gatmin).
     */
    private Double gatmax; // PU

    public Double getGatmax() {
        return gatmax;
    }

    public void setGatmax(Double _value_) {
        gatmax = _value_;
    }

    private static Object getGatmax(BaseClass _this_) {
        return ((GovHydroWPID) _this_).getGatmax();
    }

    private static void setGatmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWPID) _this_).setGatmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWPID) _this_).setGatmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gate opening limit minimum (<i>Gatmin</i>) (&lt; GovHydroWPID.gatmax).
     */
    private Double gatmin; // PU

    public Double getGatmin() {
        return gatmin;
    }

    public void setGatmin(Double _value_) {
        gatmin = _value_;
    }

    private static Object getGatmin(BaseClass _this_) {
        return ((GovHydroWPID) _this_).getGatmin();
    }

    private static void setGatmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWPID) _this_).setGatmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWPID) _this_).setGatmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gate position 1 (<i>Gv1</i>).
     */
    private Double gv1; // PU

    public Double getGv1() {
        return gv1;
    }

    public void setGv1(Double _value_) {
        gv1 = _value_;
    }

    private static Object getGv1(BaseClass _this_) {
        return ((GovHydroWPID) _this_).getGv1();
    }

    private static void setGv1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWPID) _this_).setGv1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWPID) _this_).setGv1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gate position 2 (<i>Gv2</i>).
     */
    private Double gv2; // PU

    public Double getGv2() {
        return gv2;
    }

    public void setGv2(Double _value_) {
        gv2 = _value_;
    }

    private static Object getGv2(BaseClass _this_) {
        return ((GovHydroWPID) _this_).getGv2();
    }

    private static void setGv2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWPID) _this_).setGv2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWPID) _this_).setGv2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gate position 3 (<i>Gv3</i>) (= 1,0).
     */
    private Double gv3; // PU

    public Double getGv3() {
        return gv3;
    }

    public void setGv3(Double _value_) {
        gv3 = _value_;
    }

    private static Object getGv3(BaseClass _this_) {
        return ((GovHydroWPID) _this_).getGv3();
    }

    private static void setGv3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWPID) _this_).setGv3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWPID) _this_).setGv3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Derivative gain (<i>Kd</i>).  Typical value = 1,11.
     */
    private Double kd; // PU

    public Double getKd() {
        return kd;
    }

    public void setKd(Double _value_) {
        kd = _value_;
    }

    private static Object getKd(BaseClass _this_) {
        return ((GovHydroWPID) _this_).getKd();
    }

    private static void setKd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWPID) _this_).setKd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWPID) _this_).setKd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reset gain (<i>Ki</i>).  Typical value = 0,36.
     */
    private Double ki; // PU

    public Double getKi() {
        return ki;
    }

    public void setKi(Double _value_) {
        ki = _value_;
    }

    private static Object getKi(BaseClass _this_) {
        return ((GovHydroWPID) _this_).getKi();
    }

    private static void setKi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWPID) _this_).setKi((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWPID) _this_).setKi(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Proportional gain (<i>Kp</i>).  Typical value = 0,1.
     */
    private Double kp; // PU

    public Double getKp() {
        return kp;
    }

    public void setKp(Double _value_) {
        kp = _value_;
    }

    private static Object getKp(BaseClass _this_) {
        return ((GovHydroWPID) _this_).getKp();
    }

    private static void setKp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWPID) _this_).setKp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWPID) _this_).setKp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Base for power values  (<i>MWbase</i>) (&gt; 0).  Unit = MW.
     */
    private Double mwbase; // ActivePower

    public Double getMwbase() {
        return mwbase;
    }

    public void setMwbase(Double _value_) {
        mwbase = _value_;
    }

    private static Object getMwbase(BaseClass _this_) {
        return ((GovHydroWPID) _this_).getMwbase();
    }

    private static void setMwbase(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWPID) _this_).setMwbase((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWPID) _this_).setMwbase(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Output at <i>Gv1</i> PU of <i>MWbase</i> (<i>Pgv1</i>).
     */
    private Double pgv1; // PU

    public Double getPgv1() {
        return pgv1;
    }

    public void setPgv1(Double _value_) {
        pgv1 = _value_;
    }

    private static Object getPgv1(BaseClass _this_) {
        return ((GovHydroWPID) _this_).getPgv1();
    }

    private static void setPgv1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWPID) _this_).setPgv1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWPID) _this_).setPgv1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Output at <i>Gv2</i> PU of <i>MWbase</i> (<i>Pgv2</i>).
     */
    private Double pgv2; // PU

    public Double getPgv2() {
        return pgv2;
    }

    public void setPgv2(Double _value_) {
        pgv2 = _value_;
    }

    private static Object getPgv2(BaseClass _this_) {
        return ((GovHydroWPID) _this_).getPgv2();
    }

    private static void setPgv2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWPID) _this_).setPgv2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWPID) _this_).setPgv2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Output at <i>Gv3</i> PU of <i>MWbase</i> (<i>Pgv3</i>).
     */
    private Double pgv3; // PU

    public Double getPgv3() {
        return pgv3;
    }

    public void setPgv3(Double _value_) {
        pgv3 = _value_;
    }

    private static Object getPgv3(BaseClass _this_) {
        return ((GovHydroWPID) _this_).getPgv3();
    }

    private static void setPgv3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWPID) _this_).setPgv3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWPID) _this_).setPgv3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum power output (<i>Pmax</i>) (&gt; GovHydroWPID.pmin).
     */
    private Double pmax; // PU

    public Double getPmax() {
        return pmax;
    }

    public void setPmax(Double _value_) {
        pmax = _value_;
    }

    private static Object getPmax(BaseClass _this_) {
        return ((GovHydroWPID) _this_).getPmax();
    }

    private static void setPmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWPID) _this_).setPmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWPID) _this_).setPmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum power output (<i>Pmin</i>) (&lt; GovHydroWPID.pmax).
     */
    private Double pmin; // PU

    public Double getPmin() {
        return pmin;
    }

    public void setPmin(Double _value_) {
        pmin = _value_;
    }

    private static Object getPmin(BaseClass _this_) {
        return ((GovHydroWPID) _this_).getPmin();
    }

    private static void setPmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWPID) _this_).setPmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWPID) _this_).setPmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Permanent drop (<i>Reg</i>).
     */
    private Double reg; // PU

    public Double getReg() {
        return reg;
    }

    public void setReg(Double _value_) {
        reg = _value_;
    }

    private static Object getReg(BaseClass _this_) {
        return ((GovHydroWPID) _this_).getReg();
    }

    private static void setReg(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWPID) _this_).setReg((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWPID) _this_).setReg(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Controller time constant (<i>Ta</i>) (&gt;= 0).  Typical value = 0.
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((GovHydroWPID) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWPID) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWPID) _this_).setTa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gate servo time constant (<i>Tb</i>) (&gt;= 0).  Typical value = 0.
     */
    private Double tb; // Seconds

    public Double getTb() {
        return tb;
    }

    public void setTb(Double _value_) {
        tb = _value_;
    }

    private static Object getTb(BaseClass _this_) {
        return ((GovHydroWPID) _this_).getTb();
    }

    private static void setTb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWPID) _this_).setTb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWPID) _this_).setTb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Speed detector time constant (<i>Treg</i>) (&gt;= 0).
     */
    private Double treg; // Seconds

    public Double getTreg() {
        return treg;
    }

    public void setTreg(Double _value_) {
        treg = _value_;
    }

    private static Object getTreg(BaseClass _this_) {
        return ((GovHydroWPID) _this_).getTreg();
    }

    private static void setTreg(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWPID) _this_).setTreg((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWPID) _this_).setTreg(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Water inertia time constant (<i>Tw</i>) (&gt;= 0).  Typical value = 0.
     */
    private Double tw; // Seconds

    public Double getTw() {
        return tw;
    }

    public void setTw(Double _value_) {
        tw = _value_;
    }

    private static Object getTw(BaseClass _this_) {
        return ((GovHydroWPID) _this_).getTw();
    }

    private static void setTw(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWPID) _this_).setTw((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWPID) _this_).setTw(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum gate opening velocity (<i>Velmax</i>) (&gt; GovHydroWPID.velmin).  Unit = PU / s.  Typical value = 0.
     */
    private Double velmax; // PU

    public Double getVelmax() {
        return velmax;
    }

    public void setVelmax(Double _value_) {
        velmax = _value_;
    }

    private static Object getVelmax(BaseClass _this_) {
        return ((GovHydroWPID) _this_).getVelmax();
    }

    private static void setVelmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWPID) _this_).setVelmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWPID) _this_).setVelmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum gate closing velocity (<i>Velmin</i>) (&lt; GovHydroWPID.velmax).  Unit = PU / s.  Typical value = 0.
     */
    private Double velmin; // PU

    public Double getVelmin() {
        return velmin;
    }

    public void setVelmin(Double _value_) {
        velmin = _value_;
    }

    private static Object getVelmin(BaseClass _this_) {
        return ((GovHydroWPID) _this_).getVelmin();
    }

    private static void setVelmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroWPID) _this_).setVelmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroWPID) _this_).setVelmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovHydroWPID", attrName));
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
                "GovHydroWPID", attrName, value));
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
            map.put("d", new AttrDetails("GovHydroWPID.d", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWPID::getD, GovHydroWPID::setD));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gatmax", new AttrDetails("GovHydroWPID.gatmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWPID::getGatmax, GovHydroWPID::setGatmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gatmin", new AttrDetails("GovHydroWPID.gatmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWPID::getGatmin, GovHydroWPID::setGatmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv1", new AttrDetails("GovHydroWPID.gv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWPID::getGv1, GovHydroWPID::setGv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv2", new AttrDetails("GovHydroWPID.gv2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWPID::getGv2, GovHydroWPID::setGv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv3", new AttrDetails("GovHydroWPID.gv3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWPID::getGv3, GovHydroWPID::setGv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("GovHydroWPID.kd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWPID::getKd, GovHydroWPID::setKd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("GovHydroWPID.ki", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWPID::getKi, GovHydroWPID::setKi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("GovHydroWPID.kp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWPID::getKp, GovHydroWPID::setKp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovHydroWPID.mwbase", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWPID::getMwbase, GovHydroWPID::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv1", new AttrDetails("GovHydroWPID.pgv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWPID::getPgv1, GovHydroWPID::setPgv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv2", new AttrDetails("GovHydroWPID.pgv2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWPID::getPgv2, GovHydroWPID::setPgv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv3", new AttrDetails("GovHydroWPID.pgv3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWPID::getPgv3, GovHydroWPID::setPgv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmax", new AttrDetails("GovHydroWPID.pmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWPID::getPmax, GovHydroWPID::setPmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmin", new AttrDetails("GovHydroWPID.pmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWPID::getPmin, GovHydroWPID::setPmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("reg", new AttrDetails("GovHydroWPID.reg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWPID::getReg, GovHydroWPID::setReg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("GovHydroWPID.ta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWPID::getTa, GovHydroWPID::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("GovHydroWPID.tb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWPID::getTb, GovHydroWPID::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("treg", new AttrDetails("GovHydroWPID.treg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWPID::getTreg, GovHydroWPID::setTreg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw", new AttrDetails("GovHydroWPID.tw", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWPID::getTw, GovHydroWPID::setTw));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("velmax", new AttrDetails("GovHydroWPID.velmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWPID::getVelmax, GovHydroWPID::setVelmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("velmin", new AttrDetails("GovHydroWPID.velmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroWPID::getVelmin, GovHydroWPID::setVelmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovHydroWPID(null).allAttrDetailsMap());
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
