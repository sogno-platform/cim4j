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
 * IEEE Simplified Hydro Governor-Turbine Model.  Used for Mechanical-Hydraulic and Electro-Hydraulic turbine governors, with our without steam feedback. Typical values given are for Mechanical-Hydraulic.  Ref
 */
@SuppressWarnings("unused")
public class GovHydroIEEE0 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydroIEEE0.class);

    /**
     * Constructor.
     */
    public GovHydroIEEE0(String rdfid) {
        super("GovHydroIEEE0", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovHydroIEEE0(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Governor gain (K.
     */
    private Double k; // PU

    public Double getK() {
        return k;
    }

    public void setK(Double _value_) {
        k = _value_;
    }

    private static Object getK(BaseClass _this_) {
        return ((GovHydroIEEE0) _this_).getK();
    }

    private static void setK(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroIEEE0) _this_).setK((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroIEEE0) _this_).setK(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Base for power values (MWbase) (> 0).  Unit = MW.
     */
    private Double mwbase; // ActivePower

    public Double getMwbase() {
        return mwbase;
    }

    public void setMwbase(Double _value_) {
        mwbase = _value_;
    }

    private static Object getMwbase(BaseClass _this_) {
        return ((GovHydroIEEE0) _this_).getMwbase();
    }

    private static void setMwbase(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroIEEE0) _this_).setMwbase((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroIEEE0) _this_).setMwbase(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gate maximum (Pmax).
     */
    private Double pmax; // PU

    public Double getPmax() {
        return pmax;
    }

    public void setPmax(Double _value_) {
        pmax = _value_;
    }

    private static Object getPmax(BaseClass _this_) {
        return ((GovHydroIEEE0) _this_).getPmax();
    }

    private static void setPmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroIEEE0) _this_).setPmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroIEEE0) _this_).setPmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gate minimum (Pmin).
     */
    private Double pmin; // PU

    public Double getPmin() {
        return pmin;
    }

    public void setPmin(Double _value_) {
        pmin = _value_;
    }

    private static Object getPmin(BaseClass _this_) {
        return ((GovHydroIEEE0) _this_).getPmin();
    }

    private static void setPmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroIEEE0) _this_).setPmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroIEEE0) _this_).setPmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Governor lag time constant (T1).  Typical Value = 0.25.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((GovHydroIEEE0) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroIEEE0) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroIEEE0) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Governor lead time constant (T2.  Typical Value = 0.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    private static Object getT2(BaseClass _this_) {
        return ((GovHydroIEEE0) _this_).getT2();
    }

    private static void setT2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroIEEE0) _this_).setT2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroIEEE0) _this_).setT2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gate actuator time constant (T3).  Typical Value = 0.1.
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    private static Object getT3(BaseClass _this_) {
        return ((GovHydroIEEE0) _this_).getT3();
    }

    private static void setT3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroIEEE0) _this_).setT3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroIEEE0) _this_).setT3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Water starting time (T4).
     */
    private Double t4; // Seconds

    public Double getT4() {
        return t4;
    }

    public void setT4(Double _value_) {
        t4 = _value_;
    }

    private static Object getT4(BaseClass _this_) {
        return ((GovHydroIEEE0) _this_).getT4();
    }

    private static void setT4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydroIEEE0) _this_).setT4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydroIEEE0) _this_).setT4(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovHydroIEEE0", attrName));
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
                "GovHydroIEEE0", attrName, value));
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
            map.put("k", new AttrDetails("GovHydroIEEE0.k", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroIEEE0::getK, GovHydroIEEE0::setK));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovHydroIEEE0.mwbase", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroIEEE0::getMwbase, GovHydroIEEE0::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmax", new AttrDetails("GovHydroIEEE0.pmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroIEEE0::getPmax, GovHydroIEEE0::setPmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmin", new AttrDetails("GovHydroIEEE0.pmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroIEEE0::getPmin, GovHydroIEEE0::setPmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("GovHydroIEEE0.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroIEEE0::getT1, GovHydroIEEE0::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("GovHydroIEEE0.t2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroIEEE0::getT2, GovHydroIEEE0::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("GovHydroIEEE0.t3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroIEEE0::getT3, GovHydroIEEE0::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("GovHydroIEEE0.t4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroIEEE0::getT4, GovHydroIEEE0::setT4));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovHydroIEEE0(null).allAttrDetailsMap());
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
