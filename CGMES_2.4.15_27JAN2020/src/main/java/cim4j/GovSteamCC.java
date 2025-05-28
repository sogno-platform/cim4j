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
 * Cross compound turbine governor model.
 */
@SuppressWarnings("unused")
public class GovSteamCC extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovSteamCC.class);

    /**
     * Constructor.
     */
    public GovSteamCC(String rdfid) {
        super("GovSteamCC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovSteamCC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * HP damping factor (Dhp).  Typical Value = 0.
     */
    private Double dhp; // PU

    public Double getDhp() {
        return dhp;
    }

    public void setDhp(Double _value_) {
        dhp = _value_;
    }

    private static Object getDhp(BaseClass _this_) {
        return ((GovSteamCC) _this_).getDhp();
    }

    private static void setDhp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamCC) _this_).setDhp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamCC) _this_).setDhp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * LP damping factor (Dlp).  Typical Value = 0.
     */
    private Double dlp; // PU

    public Double getDlp() {
        return dlp;
    }

    public void setDlp(Double _value_) {
        dlp = _value_;
    }

    private static Object getDlp(BaseClass _this_) {
        return ((GovSteamCC) _this_).getDlp();
    }

    private static void setDlp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamCC) _this_).setDlp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamCC) _this_).setDlp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of HP power ahead of reheater (Fhp).  Typical Value = 0.3.
     */
    private Double fhp; // PU

    public Double getFhp() {
        return fhp;
    }

    public void setFhp(Double _value_) {
        fhp = _value_;
    }

    private static Object getFhp(BaseClass _this_) {
        return ((GovSteamCC) _this_).getFhp();
    }

    private static void setFhp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamCC) _this_).setFhp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamCC) _this_).setFhp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction of LP power ahead of reheater (Flp).  Typical Value = 0.7.
     */
    private Double flp; // PU

    public Double getFlp() {
        return flp;
    }

    public void setFlp(Double _value_) {
        flp = _value_;
    }

    private static Object getFlp(BaseClass _this_) {
        return ((GovSteamCC) _this_).getFlp();
    }

    private static void setFlp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamCC) _this_).setFlp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamCC) _this_).setFlp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Base for power values (MWbase) (>0).  Unit = MW.
     */
    private Double mwbase; // ActivePower

    public Double getMwbase() {
        return mwbase;
    }

    public void setMwbase(Double _value_) {
        mwbase = _value_;
    }

    private static Object getMwbase(BaseClass _this_) {
        return ((GovSteamCC) _this_).getMwbase();
    }

    private static void setMwbase(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamCC) _this_).setMwbase((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamCC) _this_).setMwbase(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum HP value position (Pmaxhp).  Typical Value = 1.
     */
    private Double pmaxhp; // PU

    public Double getPmaxhp() {
        return pmaxhp;
    }

    public void setPmaxhp(Double _value_) {
        pmaxhp = _value_;
    }

    private static Object getPmaxhp(BaseClass _this_) {
        return ((GovSteamCC) _this_).getPmaxhp();
    }

    private static void setPmaxhp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamCC) _this_).setPmaxhp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamCC) _this_).setPmaxhp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum LP value position (Pmaxlp).  Typical Value = 1.
     */
    private Double pmaxlp; // PU

    public Double getPmaxlp() {
        return pmaxlp;
    }

    public void setPmaxlp(Double _value_) {
        pmaxlp = _value_;
    }

    private static Object getPmaxlp(BaseClass _this_) {
        return ((GovSteamCC) _this_).getPmaxlp();
    }

    private static void setPmaxlp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamCC) _this_).setPmaxlp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamCC) _this_).setPmaxlp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * HP governor droop (Rhp).  Typical Value = 0.05.
     */
    private Double rhp; // PU

    public Double getRhp() {
        return rhp;
    }

    public void setRhp(Double _value_) {
        rhp = _value_;
    }

    private static Object getRhp(BaseClass _this_) {
        return ((GovSteamCC) _this_).getRhp();
    }

    private static void setRhp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamCC) _this_).setRhp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamCC) _this_).setRhp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * LP governor droop (Rlp).  Typical Value = 0.05.
     */
    private Double rlp; // PU

    public Double getRlp() {
        return rlp;
    }

    public void setRlp(Double _value_) {
        rlp = _value_;
    }

    private static Object getRlp(BaseClass _this_) {
        return ((GovSteamCC) _this_).getRlp();
    }

    private static void setRlp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamCC) _this_).setRlp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamCC) _this_).setRlp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * HP governor time constant (T1hp).  Typical Value = 0.1.
     */
    private Double t1hp; // Seconds

    public Double getT1hp() {
        return t1hp;
    }

    public void setT1hp(Double _value_) {
        t1hp = _value_;
    }

    private static Object getT1hp(BaseClass _this_) {
        return ((GovSteamCC) _this_).getT1hp();
    }

    private static void setT1hp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamCC) _this_).setT1hp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamCC) _this_).setT1hp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * LP governor time constant (T1lp).  Typical Value = 0.1.
     */
    private Double t1lp; // Seconds

    public Double getT1lp() {
        return t1lp;
    }

    public void setT1lp(Double _value_) {
        t1lp = _value_;
    }

    private static Object getT1lp(BaseClass _this_) {
        return ((GovSteamCC) _this_).getT1lp();
    }

    private static void setT1lp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamCC) _this_).setT1lp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamCC) _this_).setT1lp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * HP turbine time constant (T3hp).  Typical Value = 0.1.
     */
    private Double t3hp; // Seconds

    public Double getT3hp() {
        return t3hp;
    }

    public void setT3hp(Double _value_) {
        t3hp = _value_;
    }

    private static Object getT3hp(BaseClass _this_) {
        return ((GovSteamCC) _this_).getT3hp();
    }

    private static void setT3hp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamCC) _this_).setT3hp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamCC) _this_).setT3hp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * LP turbine time constant (T3lp).  Typical Value = 0.1.
     */
    private Double t3lp; // Seconds

    public Double getT3lp() {
        return t3lp;
    }

    public void setT3lp(Double _value_) {
        t3lp = _value_;
    }

    private static Object getT3lp(BaseClass _this_) {
        return ((GovSteamCC) _this_).getT3lp();
    }

    private static void setT3lp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamCC) _this_).setT3lp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamCC) _this_).setT3lp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * HP turbine time constant (T4hp).  Typical Value = 0.1.
     */
    private Double t4hp; // Seconds

    public Double getT4hp() {
        return t4hp;
    }

    public void setT4hp(Double _value_) {
        t4hp = _value_;
    }

    private static Object getT4hp(BaseClass _this_) {
        return ((GovSteamCC) _this_).getT4hp();
    }

    private static void setT4hp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamCC) _this_).setT4hp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamCC) _this_).setT4hp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * LP turbine time constant (T4lp).  Typical Value = 0.1.
     */
    private Double t4lp; // Seconds

    public Double getT4lp() {
        return t4lp;
    }

    public void setT4lp(Double _value_) {
        t4lp = _value_;
    }

    private static Object getT4lp(BaseClass _this_) {
        return ((GovSteamCC) _this_).getT4lp();
    }

    private static void setT4lp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamCC) _this_).setT4lp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamCC) _this_).setT4lp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * HP reheater time constant (T5hp).  Typical Value = 10.
     */
    private Double t5hp; // Seconds

    public Double getT5hp() {
        return t5hp;
    }

    public void setT5hp(Double _value_) {
        t5hp = _value_;
    }

    private static Object getT5hp(BaseClass _this_) {
        return ((GovSteamCC) _this_).getT5hp();
    }

    private static void setT5hp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamCC) _this_).setT5hp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamCC) _this_).setT5hp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * LP reheater time constant (T5lp).  Typical Value = 10.
     */
    private Double t5lp; // Seconds

    public Double getT5lp() {
        return t5lp;
    }

    public void setT5lp(Double _value_) {
        t5lp = _value_;
    }

    private static Object getT5lp(BaseClass _this_) {
        return ((GovSteamCC) _this_).getT5lp();
    }

    private static void setT5lp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamCC) _this_).setT5lp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamCC) _this_).setT5lp(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovSteamCC", attrName));
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
                "GovSteamCC", attrName, value));
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
            map.put("dhp", new AttrDetails("GovSteamCC.dhp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamCC::getDhp, GovSteamCC::setDhp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dlp", new AttrDetails("GovSteamCC.dlp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamCC::getDlp, GovSteamCC::setDlp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fhp", new AttrDetails("GovSteamCC.fhp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamCC::getFhp, GovSteamCC::setFhp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("flp", new AttrDetails("GovSteamCC.flp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamCC::getFlp, GovSteamCC::setFlp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovSteamCC.mwbase", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamCC::getMwbase, GovSteamCC::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmaxhp", new AttrDetails("GovSteamCC.pmaxhp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamCC::getPmaxhp, GovSteamCC::setPmaxhp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmaxlp", new AttrDetails("GovSteamCC.pmaxlp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamCC::getPmaxlp, GovSteamCC::setPmaxlp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rhp", new AttrDetails("GovSteamCC.rhp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamCC::getRhp, GovSteamCC::setRhp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rlp", new AttrDetails("GovSteamCC.rlp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamCC::getRlp, GovSteamCC::setRlp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1hp", new AttrDetails("GovSteamCC.t1hp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamCC::getT1hp, GovSteamCC::setT1hp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1lp", new AttrDetails("GovSteamCC.t1lp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamCC::getT1lp, GovSteamCC::setT1lp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3hp", new AttrDetails("GovSteamCC.t3hp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamCC::getT3hp, GovSteamCC::setT3hp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3lp", new AttrDetails("GovSteamCC.t3lp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamCC::getT3lp, GovSteamCC::setT3lp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4hp", new AttrDetails("GovSteamCC.t4hp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamCC::getT4hp, GovSteamCC::setT4hp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4lp", new AttrDetails("GovSteamCC.t4lp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamCC::getT4lp, GovSteamCC::setT4lp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5hp", new AttrDetails("GovSteamCC.t5hp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamCC::getT5hp, GovSteamCC::setT5hp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5lp", new AttrDetails("GovSteamCC.t5lp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamCC::getT5lp, GovSteamCC::setT5lp));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovSteamCC(null).allAttrDetailsMap());
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
