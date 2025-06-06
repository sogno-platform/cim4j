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
 * Power factor / reactive power regulator. This model represents the power factor or reactive power controller such as the Basler SCP-250. The controller measures power factor or reactive power (PU on generator rated power) and compares it with the operator's set point. [Footnote: Basler SCP-250 is an example of a suitable product available commercially. This information is given for the convenience of users of this document and does not constitute an endorsement by IEC of this product.]
 */
@SuppressWarnings("unused")
public class PFVArType2Common1 extends PFVArControllerType2Dynamics {

    private static final Logging LOG = Logging.getLogger(PFVArType2Common1.class);

    /**
     * Constructor.
     */
    public PFVArType2Common1(String rdfid) {
        super("PFVArType2Common1", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected PFVArType2Common1(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Selector (<i>J</i>). true = control mode for reactive power false = control mode for power factor.
     */
    private Boolean j; // Boolean

    public Boolean getJ() {
        return j;
    }

    public void setJ(Boolean _value_) {
        j = _value_;
    }

    private static Object getJ(BaseClass _this_) {
        return ((PFVArType2Common1) _this_).getJ();
    }

    private static void setJ(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((PFVArType2Common1) _this_).setJ((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((PFVArType2Common1) _this_).setJ(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Reset gain (<i>Ki</i>).
     */
    private Double ki; // PU

    public Double getKi() {
        return ki;
    }

    public void setKi(Double _value_) {
        ki = _value_;
    }

    private static Object getKi(BaseClass _this_) {
        return ((PFVArType2Common1) _this_).getKi();
    }

    private static void setKi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PFVArType2Common1) _this_).setKi((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PFVArType2Common1) _this_).setKi(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Proportional gain (<i>Kp</i>).
     */
    private Double kp; // PU

    public Double getKp() {
        return kp;
    }

    public void setKp(Double _value_) {
        kp = _value_;
    }

    private static Object getKp(BaseClass _this_) {
        return ((PFVArType2Common1) _this_).getKp();
    }

    private static void setKp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PFVArType2Common1) _this_).setKp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PFVArType2Common1) _this_).setKp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Output limit (<i>max</i>).
     */
    private Double max; // PU

    public Double getMax() {
        return max;
    }

    public void setMax(Double _value_) {
        max = _value_;
    }

    private static Object getMax(BaseClass _this_) {
        return ((PFVArType2Common1) _this_).getMax();
    }

    private static void setMax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PFVArType2Common1) _this_).setMax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PFVArType2Common1) _this_).setMax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reference value of reactive power or power factor (<i>Ref</i>). The reference value is initialised by this model. This initialisation can override the value exchanged by this attribute to represent a plant operator`s change of the reference setting.
     */
    private Double ref; // PU

    public Double getRef() {
        return ref;
    }

    public void setRef(Double _value_) {
        ref = _value_;
    }

    private static Object getRef(BaseClass _this_) {
        return ((PFVArType2Common1) _this_).getRef();
    }

    private static void setRef(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PFVArType2Common1) _this_).setRef((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PFVArType2Common1) _this_).setRef(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PFVArType2Common1", attrName));
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
                "PFVArType2Common1", attrName, value));
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
            map.put("j", new AttrDetails("PFVArType2Common1.j", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PFVArType2Common1::getJ, PFVArType2Common1::setJ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("PFVArType2Common1.ki", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PFVArType2Common1::getKi, PFVArType2Common1::setKi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("PFVArType2Common1.kp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PFVArType2Common1::getKp, PFVArType2Common1::setKp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("max", new AttrDetails("PFVArType2Common1.max", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PFVArType2Common1::getMax, PFVArType2Common1::setMax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ref", new AttrDetails("PFVArType2Common1.ref", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PFVArType2Common1::getRef, PFVArType2Common1::setRef));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PFVArType2Common1(null).allAttrDetailsMap());
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
