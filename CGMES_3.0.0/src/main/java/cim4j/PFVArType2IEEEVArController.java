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
 * IEEE VAR controller type 2 which is a summing point type controller. It makes up the outside loop of a two-loop system. This controller is implemented as a slow PI type controller, and the voltage regulator forms the inner loop and is implemented as a fast controller. Reference: IEEE 421.5-2005, 11.5.
 */
@SuppressWarnings("unused")
public class PFVArType2IEEEVArController extends PFVArControllerType2Dynamics {

    private static final Logging LOG = Logging.getLogger(PFVArType2IEEEVArController.class);

    /**
     * Constructor.
     */
    public PFVArType2IEEEVArController(String rdfid) {
        super("PFVArType2IEEEVArController", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected PFVArType2IEEEVArController(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Overexcitation or under excitation flag (<i>EXLON</i>) true = 1 (not in the overexcitation or underexcitation state, integral action is active) false = 0 (in the overexcitation or underexcitation state, so integral action is disabled to allow the limiter to play its role).
     */
    private Boolean exlon; // Boolean

    public Boolean getExlon() {
        return exlon;
    }

    public void setExlon(Boolean _value_) {
        exlon = _value_;
    }

    private static Object getExlon(BaseClass _this_) {
        return ((PFVArType2IEEEVArController) _this_).getExlon();
    }

    private static void setExlon(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((PFVArType2IEEEVArController) _this_).setExlon((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((PFVArType2IEEEVArController) _this_).setExlon(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Integral gain of the pf controller (<i>K</i><i><sub>I</sub></i>).
     */
    private Double ki; // PU

    public Double getKi() {
        return ki;
    }

    public void setKi(Double _value_) {
        ki = _value_;
    }

    private static Object getKi(BaseClass _this_) {
        return ((PFVArType2IEEEVArController) _this_).getKi();
    }

    private static void setKi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PFVArType2IEEEVArController) _this_).setKi((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PFVArType2IEEEVArController) _this_).setKi(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Proportional gain of the pf controller (<i>K</i><i><sub>P</sub></i>).
     */
    private Double kp; // PU

    public Double getKp() {
        return kp;
    }

    public void setKp(Double _value_) {
        kp = _value_;
    }

    private static Object getKp(BaseClass _this_) {
        return ((PFVArType2IEEEVArController) _this_).getKp();
    }

    private static void setKp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PFVArType2IEEEVArController) _this_).setKp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PFVArType2IEEEVArController) _this_).setKp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive power reference (<i>Q</i><i><sub>REF</sub></i>).
     */
    private Double qref; // PU

    public Double getQref() {
        return qref;
    }

    public void setQref(Double _value_) {
        qref = _value_;
    }

    private static Object getQref(BaseClass _this_) {
        return ((PFVArType2IEEEVArController) _this_).getQref();
    }

    private static void setQref(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PFVArType2IEEEVArController) _this_).setQref((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PFVArType2IEEEVArController) _this_).setQref(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum output of the pf controller (<i>V</i><i><sub>CLMT</sub></i>).
     */
    private Double vclmt; // PU

    public Double getVclmt() {
        return vclmt;
    }

    public void setVclmt(Double _value_) {
        vclmt = _value_;
    }

    private static Object getVclmt(BaseClass _this_) {
        return ((PFVArType2IEEEVArController) _this_).getVclmt();
    }

    private static void setVclmt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PFVArType2IEEEVArController) _this_).setVclmt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PFVArType2IEEEVArController) _this_).setVclmt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator reference (<i>V</i><i><sub>REF</sub></i>).
     */
    private Double vref; // PU

    public Double getVref() {
        return vref;
    }

    public void setVref(Double _value_) {
        vref = _value_;
    }

    private static Object getVref(BaseClass _this_) {
        return ((PFVArType2IEEEVArController) _this_).getVref();
    }

    private static void setVref(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PFVArType2IEEEVArController) _this_).setVref((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PFVArType2IEEEVArController) _this_).setVref(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Generator sensing voltage (<i>V</i><i><sub>S</sub></i>).
     */
    private Float vs; // Float

    public Float getVs() {
        return vs;
    }

    public void setVs(Float _value_) {
        vs = _value_;
    }

    private static Object getVs(BaseClass _this_) {
        return ((PFVArType2IEEEVArController) _this_).getVs();
    }

    private static void setVs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((PFVArType2IEEEVArController) _this_).setVs((Float) _value_);
        } else if (_value_ instanceof String) {
            ((PFVArType2IEEEVArController) _this_).setVs(getFloatFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PFVArType2IEEEVArController", attrName));
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
                "PFVArType2IEEEVArController", attrName, value));
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
            map.put("exlon", new AttrDetails("PFVArType2IEEEVArController.exlon", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PFVArType2IEEEVArController::getExlon, PFVArType2IEEEVArController::setExlon));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("PFVArType2IEEEVArController.ki", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PFVArType2IEEEVArController::getKi, PFVArType2IEEEVArController::setKi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("PFVArType2IEEEVArController.kp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PFVArType2IEEEVArController::getKp, PFVArType2IEEEVArController::setKp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qref", new AttrDetails("PFVArType2IEEEVArController.qref", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PFVArType2IEEEVArController::getQref, PFVArType2IEEEVArController::setQref));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vclmt", new AttrDetails("PFVArType2IEEEVArController.vclmt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PFVArType2IEEEVArController::getVclmt, PFVArType2IEEEVArController::setVclmt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vref", new AttrDetails("PFVArType2IEEEVArController.vref", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PFVArType2IEEEVArController::getVref, PFVArType2IEEEVArController::setVref));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vs", new AttrDetails("PFVArType2IEEEVArController.vs", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PFVArType2IEEEVArController::getVs, PFVArType2IEEEVArController::setVs));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PFVArType2IEEEVArController(null).allAttrDetailsMap());
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
