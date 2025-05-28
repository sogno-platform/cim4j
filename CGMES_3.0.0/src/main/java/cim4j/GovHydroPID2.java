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
 * Hydro turbine and governor. Represents plants with straightforward penstock configurations and "three term" electro-hydraulic governors (i.e. Woodward<sup>TM</sup> electronic). [Footnote: Woodward electronic governors are an example of suitable products available commercially. This information is given for the convenience of users of this document and does not constitute an endorsement by IEC of these products.]
 */
@SuppressWarnings("unused")
public class GovHydroPID2 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydroPID2.class);

    /**
     * Constructor.
     */
    public GovHydroPID2(String rdfid) {
        super("GovHydroPID2", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovHydroPID2(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Factor multiplying <i>Tw</i> (<i>Atw</i>).  Typical value = 0.
     */
    private Double atw; // PU

    public Double getAtw() {
        return atw;
    }

    public void setAtw(Double _value_) {
        atw = _value_;
    }

    private static Object getAtw(BaseClass _this_) {
        return ((GovHydroPID2) _this_).getAtw();
    }

    private static void setAtw(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID2) _this_).setAtw((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID2) _this_).setAtw(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Turbine damping factor (<i>D</i>).  Unit = delta P / delta speed.  Typical value = 0.
     */
    private Double d; // PU

    public Double getD() {
        return d;
    }

    public void setD(Double _value_) {
        d = _value_;
    }

    private static Object getD(BaseClass _this_) {
        return ((GovHydroPID2) _this_).getD();
    }

    private static void setD(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID2) _this_).setD((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID2) _this_).setD(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Feedback signal type flag (<i>Flag</i>). true = use gate position feedback signal false = use Pe.
     */
    private Boolean feedbackSignal; // Boolean

    public Boolean getFeedbackSignal() {
        return feedbackSignal;
    }

    public void setFeedbackSignal(Boolean _value_) {
        feedbackSignal = _value_;
    }

    private static Object getFeedbackSignal(BaseClass _this_) {
        return ((GovHydroPID2) _this_).getFeedbackSignal();
    }

    private static void setFeedbackSignal(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((GovHydroPID2) _this_).setFeedbackSignal((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID2) _this_).setFeedbackSignal(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Gate opening at speed no load (<i>G0</i>).  Typical value = 0.
     */
    private Double g0; // PU

    public Double getG0() {
        return g0;
    }

    public void setG0(Double _value_) {
        g0 = _value_;
    }

    private static Object getG0(BaseClass _this_) {
        return ((GovHydroPID2) _this_).getG0();
    }

    private static void setG0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID2) _this_).setG0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID2) _this_).setG0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intermediate gate opening (<i>G1</i>).  Typical value = 0.
     */
    private Double g1; // PU

    public Double getG1() {
        return g1;
    }

    public void setG1(Double _value_) {
        g1 = _value_;
    }

    private static Object getG1(BaseClass _this_) {
        return ((GovHydroPID2) _this_).getG1();
    }

    private static void setG1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID2) _this_).setG1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID2) _this_).setG1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intermediate gate opening (<i>G2</i>).  Typical value = 0.
     */
    private Double g2; // PU

    public Double getG2() {
        return g2;
    }

    public void setG2(Double _value_) {
        g2 = _value_;
    }

    private static Object getG2(BaseClass _this_) {
        return ((GovHydroPID2) _this_).getG2();
    }

    private static void setG2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID2) _this_).setG2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID2) _this_).setG2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum gate opening (<i>Gmax</i>) (&gt; GovHydroPID2.gmin).  Typical value = 0.
     */
    private Double gmax; // PU

    public Double getGmax() {
        return gmax;
    }

    public void setGmax(Double _value_) {
        gmax = _value_;
    }

    private static Object getGmax(BaseClass _this_) {
        return ((GovHydroPID2) _this_).getGmax();
    }

    private static void setGmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID2) _this_).setGmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID2) _this_).setGmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum gate opening (<i>Gmin</i>) (&gt; GovHydroPID2.gmax).  Typical value = 0.
     */
    private Double gmin; // PU

    public Double getGmin() {
        return gmin;
    }

    public void setGmin(Double _value_) {
        gmin = _value_;
    }

    private static Object getGmin(BaseClass _this_) {
        return ((GovHydroPID2) _this_).getGmin();
    }

    private static void setGmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID2) _this_).setGmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID2) _this_).setGmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Derivative gain (<i>Kd</i>).  Typical value = 0.
     */
    private Double kd; // PU

    public Double getKd() {
        return kd;
    }

    public void setKd(Double _value_) {
        kd = _value_;
    }

    private static Object getKd(BaseClass _this_) {
        return ((GovHydroPID2) _this_).getKd();
    }

    private static void setKd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID2) _this_).setKd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID2) _this_).setKd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reset gain (<i>Ki</i>).  Unit = PU/s.  Typical value = 0.
     */
    private Float ki; // Float

    public Float getKi() {
        return ki;
    }

    public void setKi(Float _value_) {
        ki = _value_;
    }

    private static Object getKi(BaseClass _this_) {
        return ((GovHydroPID2) _this_).getKi();
    }

    private static void setKi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovHydroPID2) _this_).setKi((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID2) _this_).setKi(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Proportional gain (<i>Kp</i>).  Typical value = 0.
     */
    private Double kp; // PU

    public Double getKp() {
        return kp;
    }

    public void setKp(Double _value_) {
        kp = _value_;
    }

    private static Object getKp(BaseClass _this_) {
        return ((GovHydroPID2) _this_).getKp();
    }

    private static void setKp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID2) _this_).setKp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID2) _this_).setKp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Base for power values (<i>MWbase</i>) (&gt;0).  Unit = MW.
     */
    private Double mwbase; // ActivePower

    public Double getMwbase() {
        return mwbase;
    }

    public void setMwbase(Double _value_) {
        mwbase = _value_;
    }

    private static Object getMwbase(BaseClass _this_) {
        return ((GovHydroPID2) _this_).getMwbase();
    }

    private static void setMwbase(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID2) _this_).setMwbase((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID2) _this_).setMwbase(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Power at gate opening <i>G1</i> (<i>P1</i>).  Typical value = 0.
     */
    private Double p1; // PU

    public Double getP1() {
        return p1;
    }

    public void setP1(Double _value_) {
        p1 = _value_;
    }

    private static Object getP1(BaseClass _this_) {
        return ((GovHydroPID2) _this_).getP1();
    }

    private static void setP1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID2) _this_).setP1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID2) _this_).setP1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Power at gate opening G2 (<i>P2</i>).  Typical value = 0.
     */
    private Double p2; // PU

    public Double getP2() {
        return p2;
    }

    public void setP2(Double _value_) {
        p2 = _value_;
    }

    private static Object getP2(BaseClass _this_) {
        return ((GovHydroPID2) _this_).getP2();
    }

    private static void setP2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID2) _this_).setP2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID2) _this_).setP2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Power at full opened gate (<i>P3</i>).  Typical value = 0.
     */
    private Double p3; // PU

    public Double getP3() {
        return p3;
    }

    public void setP3(Double _value_) {
        p3 = _value_;
    }

    private static Object getP3(BaseClass _this_) {
        return ((GovHydroPID2) _this_).getP3();
    }

    private static void setP3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID2) _this_).setP3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID2) _this_).setP3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Permanent drop (<i>Rperm</i>).  Typical value = 0.
     */
    private Double rperm; // PU

    public Double getRperm() {
        return rperm;
    }

    public void setRperm(Double _value_) {
        rperm = _value_;
    }

    private static Object getRperm(BaseClass _this_) {
        return ((GovHydroPID2) _this_).getRperm();
    }

    private static void setRperm(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID2) _this_).setRperm((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID2) _this_).setRperm(getDoubleFromString((String) _value_));
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
        return ((GovHydroPID2) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID2) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID2) _this_).setTa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gate servo time constant (<i>Tb</i>) (&gt; 0).
     */
    private Double tb; // Seconds

    public Double getTb() {
        return tb;
    }

    public void setTb(Double _value_) {
        tb = _value_;
    }

    private static Object getTb(BaseClass _this_) {
        return ((GovHydroPID2) _this_).getTb();
    }

    private static void setTb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID2) _this_).setTb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID2) _this_).setTb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Speed detector time constant (<i>Treg</i>) (&gt;= 0).  Typical value = 0.
     */
    private Double treg; // Seconds

    public Double getTreg() {
        return treg;
    }

    public void setTreg(Double _value_) {
        treg = _value_;
    }

    private static Object getTreg(BaseClass _this_) {
        return ((GovHydroPID2) _this_).getTreg();
    }

    private static void setTreg(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID2) _this_).setTreg((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID2) _this_).setTreg(getDoubleFromString((String) _value_));
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
        return ((GovHydroPID2) _this_).getTw();
    }

    private static void setTw(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroPID2) _this_).setTw((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID2) _this_).setTw(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum gate opening velocity (<i>Velmax</i>) (&lt; GovHydroPID2.velmin).  Unit = PU / s.  Typical value = 0.
     */
    private Float velmax; // Float

    public Float getVelmax() {
        return velmax;
    }

    public void setVelmax(Float _value_) {
        velmax = _value_;
    }

    private static Object getVelmax(BaseClass _this_) {
        return ((GovHydroPID2) _this_).getVelmax();
    }

    private static void setVelmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovHydroPID2) _this_).setVelmax((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID2) _this_).setVelmax(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Maximum gate closing velocity (<i>Velmin</i>) (&gt; GovHydroPID2.velmax).  Unit = PU / s.  Typical value = 0.
     */
    private Float velmin; // Float

    public Float getVelmin() {
        return velmin;
    }

    public void setVelmin(Float _value_) {
        velmin = _value_;
    }

    private static Object getVelmin(BaseClass _this_) {
        return ((GovHydroPID2) _this_).getVelmin();
    }

    private static void setVelmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovHydroPID2) _this_).setVelmin((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroPID2) _this_).setVelmin(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovHydroPID2", attrName));
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
                "GovHydroPID2", attrName, value));
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
            map.put("atw", new AttrDetails("GovHydroPID2.atw", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::getAtw, GovHydroPID2::setAtw));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("d", new AttrDetails("GovHydroPID2.d", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::getD, GovHydroPID2::setD));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("feedbackSignal", new AttrDetails("GovHydroPID2.feedbackSignal", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::getFeedbackSignal, GovHydroPID2::setFeedbackSignal));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("g0", new AttrDetails("GovHydroPID2.g0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::getG0, GovHydroPID2::setG0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("g1", new AttrDetails("GovHydroPID2.g1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::getG1, GovHydroPID2::setG1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("g2", new AttrDetails("GovHydroPID2.g2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::getG2, GovHydroPID2::setG2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gmax", new AttrDetails("GovHydroPID2.gmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::getGmax, GovHydroPID2::setGmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gmin", new AttrDetails("GovHydroPID2.gmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::getGmin, GovHydroPID2::setGmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("GovHydroPID2.kd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::getKd, GovHydroPID2::setKd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("GovHydroPID2.ki", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::getKi, GovHydroPID2::setKi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("GovHydroPID2.kp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::getKp, GovHydroPID2::setKp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovHydroPID2.mwbase", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::getMwbase, GovHydroPID2::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p1", new AttrDetails("GovHydroPID2.p1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::getP1, GovHydroPID2::setP1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p2", new AttrDetails("GovHydroPID2.p2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::getP2, GovHydroPID2::setP2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p3", new AttrDetails("GovHydroPID2.p3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::getP3, GovHydroPID2::setP3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rperm", new AttrDetails("GovHydroPID2.rperm", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::getRperm, GovHydroPID2::setRperm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("GovHydroPID2.ta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::getTa, GovHydroPID2::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("GovHydroPID2.tb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::getTb, GovHydroPID2::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("treg", new AttrDetails("GovHydroPID2.treg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::getTreg, GovHydroPID2::setTreg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw", new AttrDetails("GovHydroPID2.tw", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::getTw, GovHydroPID2::setTw));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("velmax", new AttrDetails("GovHydroPID2.velmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::getVelmax, GovHydroPID2::setVelmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("velmin", new AttrDetails("GovHydroPID2.velmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::getVelmin, GovHydroPID2::setVelmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovHydroPID2(null).allAttrDetailsMap());
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
