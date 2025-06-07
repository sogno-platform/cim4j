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
 * Generic turbogas.
 */
@SuppressWarnings("unused")
public class GovGAST4 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovGAST4.class);

    /**
     * Constructor.
     */
    public GovGAST4(String rdfid) {
        super("GovGAST4", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovGAST4(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Droop (bp).  Typical Value = 0.05.
     */
    private Double bp; // PU

    public Double getBp() {
        return bp;
    }

    public void setBp(Double _value_) {
        bp = _value_;
    }

    private static Object getBp(BaseClass _this_) {
        return ((GovGAST4) _this_).getBp();
    }

    private static void setBp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST4) _this_).setBp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST4) _this_).setBp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Compressor gain (K).  Typical Value = 0.
     */
    private Double ktm; // PU

    public Double getKtm() {
        return ktm;
    }

    public void setKtm(Double _value_) {
        ktm = _value_;
    }

    private static Object getKtm(BaseClass _this_) {
        return ((GovGAST4) _this_).getKtm();
    }

    private static void setKtm(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST4) _this_).setKtm((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST4) _this_).setKtm(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fuel flow maximum negative error value (MN).  Typical Value = -0.05.
     */
    private Double mnef; // PU

    public Double getMnef() {
        return mnef;
    }

    public void setMnef(Double _value_) {
        mnef = _value_;
    }

    private static Object getMnef(BaseClass _this_) {
        return ((GovGAST4) _this_).getMnef();
    }

    private static void setMnef(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST4) _this_).setMnef((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST4) _this_).setMnef(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fuel flow maximum positive error value (MX).  Typical Value = 0.05.
     */
    private Double mxef; // PU

    public Double getMxef() {
        return mxef;
    }

    public void setMxef(Double _value_) {
        mxef = _value_;
    }

    private static Object getMxef(BaseClass _this_) {
        return ((GovGAST4) _this_).getMxef();
    }

    private static void setMxef(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST4) _this_).setMxef((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST4) _this_).setMxef(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum valve opening (RYMN).  Typical Value = 0.
     */
    private Double rymn; // PU

    public Double getRymn() {
        return rymn;
    }

    public void setRymn(Double _value_) {
        rymn = _value_;
    }

    private static Object getRymn(BaseClass _this_) {
        return ((GovGAST4) _this_).getRymn();
    }

    private static void setRymn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST4) _this_).setRymn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST4) _this_).setRymn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum valve opening (RYMX).  Typical Value = 1.1.
     */
    private Double rymx; // PU

    public Double getRymx() {
        return rymx;
    }

    public void setRymx(Double _value_) {
        rymx = _value_;
    }

    private static Object getRymx(BaseClass _this_) {
        return ((GovGAST4) _this_).getRymx();
    }

    private static void setRymx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST4) _this_).setRymx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST4) _this_).setRymx(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum gate opening velocity (T).  Typical Value = 3.
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((GovGAST4) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST4) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST4) _this_).setTa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum gate closing velocity (T).  Typical Value = 0.5.
     */
    private Double tc; // Seconds

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    private static Object getTc(BaseClass _this_) {
        return ((GovGAST4) _this_).getTc();
    }

    private static void setTc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST4) _this_).setTc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST4) _this_).setTc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fuel control time constant (T).  Typical Value = 0.1.
     */
    private Double tcm; // Seconds

    public Double getTcm() {
        return tcm;
    }

    public void setTcm(Double _value_) {
        tcm = _value_;
    }

    private static Object getTcm(BaseClass _this_) {
        return ((GovGAST4) _this_).getTcm();
    }

    private static void setTcm(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST4) _this_).setTcm((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST4) _this_).setTcm(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Compressor discharge volume time constant (T).  Typical Value = 0.2.
     */
    private Double tm; // Seconds

    public Double getTm() {
        return tm;
    }

    public void setTm(Double _value_) {
        tm = _value_;
    }

    private static Object getTm(BaseClass _this_) {
        return ((GovGAST4) _this_).getTm();
    }

    private static void setTm(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST4) _this_).setTm((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST4) _this_).setTm(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant of fuel valve positioner (T).  Typical Value = 0.1.
     */
    private Double tv; // Seconds

    public Double getTv() {
        return tv;
    }

    public void setTv(Double _value_) {
        tv = _value_;
    }

    private static Object getTv(BaseClass _this_) {
        return ((GovGAST4) _this_).getTv();
    }

    private static void setTv(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovGAST4) _this_).setTv((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovGAST4) _this_).setTv(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovGAST4", attrName));
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
                "GovGAST4", attrName, value));
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
            map.put("bp", new AttrDetails("GovGAST4.bp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST4::getBp, GovGAST4::setBp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ktm", new AttrDetails("GovGAST4.ktm", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST4::getKtm, GovGAST4::setKtm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mnef", new AttrDetails("GovGAST4.mnef", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST4::getMnef, GovGAST4::setMnef));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mxef", new AttrDetails("GovGAST4.mxef", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST4::getMxef, GovGAST4::setMxef));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rymn", new AttrDetails("GovGAST4.rymn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST4::getRymn, GovGAST4::setRymn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rymx", new AttrDetails("GovGAST4.rymx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST4::getRymx, GovGAST4::setRymx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("GovGAST4.ta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST4::getTa, GovGAST4::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("GovGAST4.tc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST4::getTc, GovGAST4::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tcm", new AttrDetails("GovGAST4.tcm", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST4::getTcm, GovGAST4::setTcm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tm", new AttrDetails("GovGAST4.tm", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST4::getTm, GovGAST4::setTm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tv", new AttrDetails("GovGAST4.tv", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST4::getTv, GovGAST4::setTv));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovGAST4(null).allAttrDetailsMap());
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
