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
 * Simple excitation system model representing generic characteristics of many excitation systems; intended for use where negative field current may be a problem.
 */
@SuppressWarnings("unused")
public class ExcSCRX extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcSCRX.class);

    /**
     * Constructor.
     */
    public ExcSCRX(String rdfid) {
        super("ExcSCRX", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcSCRX(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Power source switch (Cswitch). true = fixed voltage of 1.0 PU false = generator terminal voltage.
     */
    private Boolean cswitch; // Boolean

    public Boolean getCswitch() {
        return cswitch;
    }

    public void setCswitch(Boolean _value_) {
        cswitch = _value_;
    }

    private static Object getCswitch(BaseClass _this_) {
        return ((ExcSCRX) _this_).getCswitch();
    }

    private static void setCswitch(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ExcSCRX) _this_).setCswitch((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSCRX) _this_).setCswitch(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Maximum field voltage output (Emax).  Typical Value = 5.
     */
    private Double emax; // PU

    public Double getEmax() {
        return emax;
    }

    public void setEmax(Double _value_) {
        emax = _value_;
    }

    private static Object getEmax(BaseClass _this_) {
        return ((ExcSCRX) _this_).getEmax();
    }

    private static void setEmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSCRX) _this_).setEmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSCRX) _this_).setEmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum field voltage output (Emin).  Typical Value = 0.
     */
    private Double emin; // PU

    public Double getEmin() {
        return emin;
    }

    public void setEmin(Double _value_) {
        emin = _value_;
    }

    private static Object getEmin(BaseClass _this_) {
        return ((ExcSCRX) _this_).getEmin();
    }

    private static void setEmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSCRX) _this_).setEmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSCRX) _this_).setEmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gain (K) (>0).  Typical Value = 200.
     */
    private Double k; // PU

    public Double getK() {
        return k;
    }

    public void setK(Double _value_) {
        k = _value_;
    }

    private static Object getK(BaseClass _this_) {
        return ((ExcSCRX) _this_).getK();
    }

    private static void setK(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSCRX) _this_).setK((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSCRX) _this_).setK(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rc/Rfd - ratio of field discharge resistance to field winding resistance (RcRfd).  Typical Value = 0.
     */
    private Double rcrfd; // Simple_Float

    public Double getRcrfd() {
        return rcrfd;
    }

    public void setRcrfd(Double _value_) {
        rcrfd = _value_;
    }

    private static Object getRcrfd(BaseClass _this_) {
        return ((ExcSCRX) _this_).getRcrfd();
    }

    private static void setRcrfd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSCRX) _this_).setRcrfd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSCRX) _this_).setRcrfd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Ta/Tb - gain reduction ratio of lag-lead element (TaTb). The parameter Ta is not defined explicitly.  Typical Value = 0.1.
     */
    private Double tatb; // Simple_Float

    public Double getTatb() {
        return tatb;
    }

    public void setTatb(Double _value_) {
        tatb = _value_;
    }

    private static Object getTatb(BaseClass _this_) {
        return ((ExcSCRX) _this_).getTatb();
    }

    private static void setTatb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSCRX) _this_).setTatb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSCRX) _this_).setTatb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Denominator time constant of lag-lead block (Tb).  Typical Value = 10.
     */
    private Double tb; // Seconds

    public Double getTb() {
        return tb;
    }

    public void setTb(Double _value_) {
        tb = _value_;
    }

    private static Object getTb(BaseClass _this_) {
        return ((ExcSCRX) _this_).getTb();
    }

    private static void setTb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSCRX) _this_).setTb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSCRX) _this_).setTb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant of gain block (Te) (>0).  Typical Value = 0.02.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    private static Object getTe(BaseClass _this_) {
        return ((ExcSCRX) _this_).getTe();
    }

    private static void setTe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcSCRX) _this_).setTe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcSCRX) _this_).setTe(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcSCRX", attrName));
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
                "ExcSCRX", attrName, value));
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
            map.put("cswitch", new AttrDetails("ExcSCRX.cswitch", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSCRX::getCswitch, ExcSCRX::setCswitch));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("emax", new AttrDetails("ExcSCRX.emax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSCRX::getEmax, ExcSCRX::setEmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("emin", new AttrDetails("ExcSCRX.emin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSCRX::getEmin, ExcSCRX::setEmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k", new AttrDetails("ExcSCRX.k", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSCRX::getK, ExcSCRX::setK));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rcrfd", new AttrDetails("ExcSCRX.rcrfd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSCRX::getRcrfd, ExcSCRX::setRcrfd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tatb", new AttrDetails("ExcSCRX.tatb", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSCRX::getTatb, ExcSCRX::setTatb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("ExcSCRX.tb", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSCRX::getTb, ExcSCRX::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcSCRX.te", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcSCRX::getTe, ExcSCRX::setTe));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcSCRX(null).allAttrDetailsMap());
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
