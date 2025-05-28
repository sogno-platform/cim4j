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
 * Generic non-linear dynamic (GNLD) load. This model can be used in mid-term and long-term voltage stability simulations (i.e., to study voltage collapse), as it can replace a more detailed representation of aggregate load, including induction motors, thermostatically controlled and static loads.
 */
@SuppressWarnings("unused")
public class LoadGenericNonLinear extends LoadDynamics {

    private static final Logging LOG = Logging.getLogger(LoadGenericNonLinear.class);

    /**
     * Constructor.
     */
    public LoadGenericNonLinear(String rdfid) {
        super("LoadGenericNonLinear", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected LoadGenericNonLinear(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Steady state voltage index for reactive power (<i>BS</i>).
     */
    private Float bs; // Float

    public Float getBs() {
        return bs;
    }

    public void setBs(Float _value_) {
        bs = _value_;
    }

    private static Object getBs(BaseClass _this_) {
        return ((LoadGenericNonLinear) _this_).getBs();
    }

    private static void setBs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((LoadGenericNonLinear) _this_).setBs((Float) _value_);
        } else if (_value_ instanceof String) {
            ((LoadGenericNonLinear) _this_).setBs(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Transient voltage index for reactive power (<i>BT</i>).
     */
    private Float bt; // Float

    public Float getBt() {
        return bt;
    }

    public void setBt(Float _value_) {
        bt = _value_;
    }

    private static Object getBt(BaseClass _this_) {
        return ((LoadGenericNonLinear) _this_).getBt();
    }

    private static void setBt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((LoadGenericNonLinear) _this_).setBt((Float) _value_);
        } else if (_value_ instanceof String) {
            ((LoadGenericNonLinear) _this_).setBt(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Type of generic non-linear load model.
     */
    private String genericNonLinearLoadModelType; // GenericNonLinearLoadModelKind

    public String getGenericNonLinearLoadModelType() {
        return genericNonLinearLoadModelType;
    }

    public void setGenericNonLinearLoadModelType(String _value_) {
        genericNonLinearLoadModelType = _value_;
    }

    private static Object getGenericNonLinearLoadModelType(BaseClass _this_) {
        return ((LoadGenericNonLinear) _this_).getGenericNonLinearLoadModelType();
    }

    private static void setGenericNonLinearLoadModelType(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((LoadGenericNonLinear) _this_).setGenericNonLinearLoadModelType((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Steady state voltage index for active power (<i>LS</i>).
     */
    private Float ls; // Float

    public Float getLs() {
        return ls;
    }

    public void setLs(Float _value_) {
        ls = _value_;
    }

    private static Object getLs(BaseClass _this_) {
        return ((LoadGenericNonLinear) _this_).getLs();
    }

    private static void setLs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((LoadGenericNonLinear) _this_).setLs((Float) _value_);
        } else if (_value_ instanceof String) {
            ((LoadGenericNonLinear) _this_).setLs(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Transient voltage index for active power (<i>LT</i>).
     */
    private Float lt; // Float

    public Float getLt() {
        return lt;
    }

    public void setLt(Float _value_) {
        lt = _value_;
    }

    private static Object getLt(BaseClass _this_) {
        return ((LoadGenericNonLinear) _this_).getLt();
    }

    private static void setLt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((LoadGenericNonLinear) _this_).setLt((Float) _value_);
        } else if (_value_ instanceof String) {
            ((LoadGenericNonLinear) _this_).setLt(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Time constant of lag function of active power (<i>T</i><i><sub>P</sub></i>) (&gt; 0).
     */
    private Double tp; // Seconds

    public Double getTp() {
        return tp;
    }

    public void setTp(Double _value_) {
        tp = _value_;
    }

    private static Object getTp(BaseClass _this_) {
        return ((LoadGenericNonLinear) _this_).getTp();
    }

    private static void setTp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadGenericNonLinear) _this_).setTp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadGenericNonLinear) _this_).setTp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant of lag function of reactive power (<i>T</i><i><sub>Q</sub></i>) (&gt; 0).
     */
    private Double tq; // Seconds

    public Double getTq() {
        return tq;
    }

    public void setTq(Double _value_) {
        tq = _value_;
    }

    private static Object getTq(BaseClass _this_) {
        return ((LoadGenericNonLinear) _this_).getTq();
    }

    private static void setTq(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((LoadGenericNonLinear) _this_).setTq((Double) _value_);
        } else if (_value_ instanceof String) {
            ((LoadGenericNonLinear) _this_).setTq(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "LoadGenericNonLinear", attrName));
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
                "LoadGenericNonLinear", attrName, value));
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
            map.put("bs", new AttrDetails("LoadGenericNonLinear.bs", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadGenericNonLinear::getBs, LoadGenericNonLinear::setBs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bt", new AttrDetails("LoadGenericNonLinear.bt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadGenericNonLinear::getBt, LoadGenericNonLinear::setBt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("genericNonLinearLoadModelType", new AttrDetails("LoadGenericNonLinear.genericNonLinearLoadModelType", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, LoadGenericNonLinear::getGenericNonLinearLoadModelType, LoadGenericNonLinear::setGenericNonLinearLoadModelType));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ls", new AttrDetails("LoadGenericNonLinear.ls", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadGenericNonLinear::getLs, LoadGenericNonLinear::setLs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lt", new AttrDetails("LoadGenericNonLinear.lt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadGenericNonLinear::getLt, LoadGenericNonLinear::setLt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tp", new AttrDetails("LoadGenericNonLinear.tp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadGenericNonLinear::getTp, LoadGenericNonLinear::setTp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tq", new AttrDetails("LoadGenericNonLinear.tq", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadGenericNonLinear::getTq, LoadGenericNonLinear::setTq));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new LoadGenericNonLinear(null).allAttrDetailsMap());
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
