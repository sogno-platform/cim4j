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
 * Generic turbogas with acceleration and temperature controller.
 */
@SuppressWarnings("unused")
public class GovGAST3 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovGAST3.class);

    /**
     * Constructor.
     */
    public GovGAST3(String rdfid) {
        super("GovGAST3", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovGAST3(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Acceleration limit set-point (<i>Bca</i>).  Unit = 1/s.  Typical value = 0,01.
     */
    private Float bca; // Float

    public Float getBca() {
        return bca;
    }

    public void setBca(Float _value_) {
        bca = _value_;
    }

    private static Object getBca(BaseClass _this_) {
        return ((GovGAST3) _this_).getBca();
    }

    private static void setBca(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovGAST3) _this_).setBca((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST3) _this_).setBca(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Droop (<i>bp</i>).  Typical value = 0,05.
     */
    private Double bp; // PU

    public Double getBp() {
        return bp;
    }

    public void setBp(Double _value_) {
        bp = _value_;
    }

    private static Object getBp(BaseClass _this_) {
        return ((GovGAST3) _this_).getBp();
    }

    private static void setBp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST3) _this_).setBp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST3) _this_).setBp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exhaust temperature variation due to fuel flow increasing from 0 to 1 PU (<i>deltaTc</i>).  Typical value = 390.
     */
    private Double dtc; // Temperature

    public Double getDtc() {
        return dtc;
    }

    public void setDtc(Double _value_) {
        dtc = _value_;
    }

    private static Object getDtc(BaseClass _this_) {
        return ((GovGAST3) _this_).getDtc();
    }

    private static void setDtc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST3) _this_).setDtc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST3) _this_).setDtc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum fuel flow (<i>Ka</i>).  Typical value = 0,23.
     */
    private Double ka; // PU

    public Double getKa() {
        return ka;
    }

    public void setKa(Double _value_) {
        ka = _value_;
    }

    private static Object getKa(BaseClass _this_) {
        return ((GovGAST3) _this_).getKa();
    }

    private static void setKa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST3) _this_).setKa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST3) _this_).setKa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fuel system feedback (<i>K</i><i><sub>AC</sub></i>).  Typical value = 0.
     */
    private Float kac; // Float

    public Float getKac() {
        return kac;
    }

    public void setKac(Float _value_) {
        kac = _value_;
    }

    private static Object getKac(BaseClass _this_) {
        return ((GovGAST3) _this_).getKac();
    }

    private static void setKac(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovGAST3) _this_).setKac((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST3) _this_).setKac(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Acceleration control integral gain (<i>Kca</i>). Unit = 1/s.  Typical value = 100.
     */
    private Float kca; // Float

    public Float getKca() {
        return kca;
    }

    public void setKca(Float _value_) {
        kca = _value_;
    }

    private static Object getKca(BaseClass _this_) {
        return ((GovGAST3) _this_).getKca();
    }

    private static void setKca(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovGAST3) _this_).setKca((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST3) _this_).setKca(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Gain of radiation shield (<i>Ksi</i>).  Typical value = 0,8.
     */
    private Float ksi; // Float

    public Float getKsi() {
        return ksi;
    }

    public void setKsi(Float _value_) {
        ksi = _value_;
    }

    private static Object getKsi(BaseClass _this_) {
        return ((GovGAST3) _this_).getKsi();
    }

    private static void setKsi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovGAST3) _this_).setKsi((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST3) _this_).setKsi(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Coefficient of transfer function of fuel valve positioner (<i>Ky</i>).  Typical value = 1.
     */
    private Float ky; // Float

    public Float getKy() {
        return ky;
    }

    public void setKy(Float _value_) {
        ky = _value_;
    }

    private static Object getKy(BaseClass _this_) {
        return ((GovGAST3) _this_).getKy();
    }

    private static void setKy(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovGAST3) _this_).setKy((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST3) _this_).setKy(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Fuel flow maximum negative error value (<i>MNef</i>).  Typical value = -0,05.
     */
    private Double mnef; // PU

    public Double getMnef() {
        return mnef;
    }

    public void setMnef(Double _value_) {
        mnef = _value_;
    }

    private static Object getMnef(BaseClass _this_) {
        return ((GovGAST3) _this_).getMnef();
    }

    private static void setMnef(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST3) _this_).setMnef((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST3) _this_).setMnef(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fuel flow maximum positive error value (<i>MXef</i>).  Typical value = 0,05.
     */
    private Double mxef; // PU

    public Double getMxef() {
        return mxef;
    }

    public void setMxef(Double _value_) {
        mxef = _value_;
    }

    private static Object getMxef(BaseClass _this_) {
        return ((GovGAST3) _this_).getMxef();
    }

    private static void setMxef(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST3) _this_).setMxef((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST3) _this_).setMxef(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum fuel flow (<i>RCMN</i>).  Typical value = -0,1.
     */
    private Double rcmn; // PU

    public Double getRcmn() {
        return rcmn;
    }

    public void setRcmn(Double _value_) {
        rcmn = _value_;
    }

    private static Object getRcmn(BaseClass _this_) {
        return ((GovGAST3) _this_).getRcmn();
    }

    private static void setRcmn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST3) _this_).setRcmn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST3) _this_).setRcmn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum fuel flow (<i>RCMX</i>).  Typical value = 1.
     */
    private Double rcmx; // PU

    public Double getRcmx() {
        return rcmx;
    }

    public void setRcmx(Double _value_) {
        rcmx = _value_;
    }

    private static Object getRcmx(BaseClass _this_) {
        return ((GovGAST3) _this_).getRcmx();
    }

    private static void setRcmx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST3) _this_).setRcmx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST3) _this_).setRcmx(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fuel control time constant (<i>Tac</i>) (&gt;= 0).  Typical value = 0,1.
     */
    private Double tac; // Seconds

    public Double getTac() {
        return tac;
    }

    public void setTac(Double _value_) {
        tac = _value_;
    }

    private static Object getTac(BaseClass _this_) {
        return ((GovGAST3) _this_).getTac();
    }

    private static void setTac(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST3) _this_).setTac((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST3) _this_).setTac(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Compressor discharge volume time constant (<i>Tc</i>) (&gt;= 0).  Typical value = 0,2.
     */
    private Double tc; // Seconds

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    private static Object getTc(BaseClass _this_) {
        return ((GovGAST3) _this_).getTc();
    }

    private static void setTc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST3) _this_).setTc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST3) _this_).setTc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Temperature controller derivative gain (<i>Td</i>) (&gt;= 0).  Typical value = 3,3.
     */
    private Double td; // Seconds

    public Double getTd() {
        return td;
    }

    public void setTd(Double _value_) {
        td = _value_;
    }

    private static Object getTd(BaseClass _this_) {
        return ((GovGAST3) _this_).getTd();
    }

    private static void setTd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST3) _this_).setTd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST3) _this_).setTd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Turbine rated exhaust temperature correspondent to Pm=1 PU (<i>Tfen</i>).  Typical value = 540.
     */
    private Double tfen; // Temperature

    public Double getTfen() {
        return tfen;
    }

    public void setTfen(Double _value_) {
        tfen = _value_;
    }

    private static Object getTfen(BaseClass _this_) {
        return ((GovGAST3) _this_).getTfen();
    }

    private static void setTfen(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST3) _this_).setTfen((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST3) _this_).setTfen(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant of speed governor (<i>Tg</i>) (&gt;= 0).  Typical value = 0,05.
     */
    private Double tg; // Seconds

    public Double getTg() {
        return tg;
    }

    public void setTg(Double _value_) {
        tg = _value_;
    }

    private static Object getTg(BaseClass _this_) {
        return ((GovGAST3) _this_).getTg();
    }

    private static void setTg(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST3) _this_).setTg((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST3) _this_).setTg(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant of radiation shield (<i>Tsi</i>) (&gt;= 0).  Typical value = 15.
     */
    private Double tsi; // Seconds

    public Double getTsi() {
        return tsi;
    }

    public void setTsi(Double _value_) {
        tsi = _value_;
    }

    private static Object getTsi(BaseClass _this_) {
        return ((GovGAST3) _this_).getTsi();
    }

    private static void setTsi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST3) _this_).setTsi((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST3) _this_).setTsi(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Temperature controller integration rate (<i>Tt</i>).  Typical value = 250.
     */
    private Double tt; // Temperature

    public Double getTt() {
        return tt;
    }

    public void setTt(Double _value_) {
        tt = _value_;
    }

    private static Object getTt(BaseClass _this_) {
        return ((GovGAST3) _this_).getTt();
    }

    private static void setTt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST3) _this_).setTt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST3) _this_).setTt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant of thermocouple (<i>Ttc</i>) (&gt;= 0).  Typical value = 2,5.
     */
    private Double ttc; // Seconds

    public Double getTtc() {
        return ttc;
    }

    public void setTtc(Double _value_) {
        ttc = _value_;
    }

    private static Object getTtc(BaseClass _this_) {
        return ((GovGAST3) _this_).getTtc();
    }

    private static void setTtc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST3) _this_).setTtc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST3) _this_).setTtc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant of fuel valve positioner (<i>Ty</i>) (&gt;= 0).  Typical value = 0,2.
     */
    private Double ty; // Seconds

    public Double getTy() {
        return ty;
    }

    public void setTy(Double _value_) {
        ty = _value_;
    }

    private static Object getTy(BaseClass _this_) {
        return ((GovGAST3) _this_).getTy();
    }

    private static void setTy(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST3) _this_).setTy((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST3) _this_).setTy(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovGAST3", attrName));
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
                "GovGAST3", attrName, value));
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
            map.put("bca", new AttrDetails("GovGAST3.bca", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST3::getBca, GovGAST3::setBca));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bp", new AttrDetails("GovGAST3.bp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST3::getBp, GovGAST3::setBp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dtc", new AttrDetails("GovGAST3.dtc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST3::getDtc, GovGAST3::setDtc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("GovGAST3.ka", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST3::getKa, GovGAST3::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kac", new AttrDetails("GovGAST3.kac", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST3::getKac, GovGAST3::setKac));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kca", new AttrDetails("GovGAST3.kca", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST3::getKca, GovGAST3::setKca));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ksi", new AttrDetails("GovGAST3.ksi", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST3::getKsi, GovGAST3::setKsi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ky", new AttrDetails("GovGAST3.ky", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST3::getKy, GovGAST3::setKy));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mnef", new AttrDetails("GovGAST3.mnef", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST3::getMnef, GovGAST3::setMnef));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mxef", new AttrDetails("GovGAST3.mxef", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST3::getMxef, GovGAST3::setMxef));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rcmn", new AttrDetails("GovGAST3.rcmn", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST3::getRcmn, GovGAST3::setRcmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rcmx", new AttrDetails("GovGAST3.rcmx", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST3::getRcmx, GovGAST3::setRcmx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tac", new AttrDetails("GovGAST3.tac", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST3::getTac, GovGAST3::setTac));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("GovGAST3.tc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST3::getTc, GovGAST3::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("td", new AttrDetails("GovGAST3.td", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST3::getTd, GovGAST3::setTd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tfen", new AttrDetails("GovGAST3.tfen", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST3::getTfen, GovGAST3::setTfen));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tg", new AttrDetails("GovGAST3.tg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST3::getTg, GovGAST3::setTg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tsi", new AttrDetails("GovGAST3.tsi", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST3::getTsi, GovGAST3::setTsi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tt", new AttrDetails("GovGAST3.tt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST3::getTt, GovGAST3::setTt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ttc", new AttrDetails("GovGAST3.ttc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST3::getTtc, GovGAST3::setTtc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ty", new AttrDetails("GovGAST3.ty", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGAST3::getTy, GovGAST3::setTy));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovGAST3(null).allAttrDetailsMap());
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
