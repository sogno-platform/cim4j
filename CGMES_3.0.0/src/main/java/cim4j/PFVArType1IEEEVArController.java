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
 * IEEE VAR controller type 1 which operates by moving the voltage reference directly. Reference: IEEE 421.5-2005, 11.3.
 */
@SuppressWarnings("unused")
public class PFVArType1IEEEVArController extends PFVArControllerType1Dynamics {

    private static final Logging LOG = Logging.getLogger(PFVArType1IEEEVArController.class);

    /**
     * Constructor.
     */
    public PFVArType1IEEEVArController(String rdfid) {
        super("PFVArType1IEEEVArController", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected PFVArType1IEEEVArController(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Var controller time delay (<i>T</i><i><sub>VARC</sub></i>) (&gt;= 0).  Typical value = 5.
     */
    private Double tvarc; // Seconds

    public Double getTvarc() {
        return tvarc;
    }

    public void setTvarc(Double _value_) {
        tvarc = _value_;
    }

    private static Object getTvarc(BaseClass _this_) {
        return ((PFVArType1IEEEVArController) _this_).getTvarc();
    }

    private static void setTvarc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PFVArType1IEEEVArController) _this_).setTvarc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PFVArType1IEEEVArController) _this_).setTvarc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Synchronous machine power factor (<i>V</i><i><sub>VAR</sub></i>).
     */
    private Double vvar; // PU

    public Double getVvar() {
        return vvar;
    }

    public void setVvar(Double _value_) {
        vvar = _value_;
    }

    private static Object getVvar(BaseClass _this_) {
        return ((PFVArType1IEEEVArController) _this_).getVvar();
    }

    private static void setVvar(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PFVArType1IEEEVArController) _this_).setVvar((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PFVArType1IEEEVArController) _this_).setVvar(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Var controller deadband (<i>V</i><i><sub>VARC_BW</sub></i>).  Typical value = 0,02.
     */
    private Float vvarcbw; // Float

    public Float getVvarcbw() {
        return vvarcbw;
    }

    public void setVvarcbw(Float _value_) {
        vvarcbw = _value_;
    }

    private static Object getVvarcbw(BaseClass _this_) {
        return ((PFVArType1IEEEVArController) _this_).getVvarcbw();
    }

    private static void setVvarcbw(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((PFVArType1IEEEVArController) _this_).setVvarcbw((Float) _value_);
        } else if (_value_ instanceof String) {
            ((PFVArType1IEEEVArController) _this_).setVvarcbw(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Var controller reference (<i>V</i><i><sub>VARREF</sub></i>).
     */
    private Double vvarref; // PU

    public Double getVvarref() {
        return vvarref;
    }

    public void setVvarref(Double _value_) {
        vvarref = _value_;
    }

    private static Object getVvarref(BaseClass _this_) {
        return ((PFVArType1IEEEVArController) _this_).getVvarref();
    }

    private static void setVvarref(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PFVArType1IEEEVArController) _this_).setVvarref((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PFVArType1IEEEVArController) _this_).setVvarref(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum machine terminal voltage needed for pf/VAr controller to be enabled (<i>V</i><i><sub>VTMAX</sub></i>) (&gt; PVFArType1IEEEVArController.vvtmin).
     */
    private Double vvtmax; // PU

    public Double getVvtmax() {
        return vvtmax;
    }

    public void setVvtmax(Double _value_) {
        vvtmax = _value_;
    }

    private static Object getVvtmax(BaseClass _this_) {
        return ((PFVArType1IEEEVArController) _this_).getVvtmax();
    }

    private static void setVvtmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PFVArType1IEEEVArController) _this_).setVvtmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PFVArType1IEEEVArController) _this_).setVvtmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum machine terminal voltage needed to enable pf/var controller (<i>V</i><i><sub>VTMIN</sub></i>) (&lt; PVFArType1IEEEVArController.vvtmax).
     */
    private Double vvtmin; // PU

    public Double getVvtmin() {
        return vvtmin;
    }

    public void setVvtmin(Double _value_) {
        vvtmin = _value_;
    }

    private static Object getVvtmin(BaseClass _this_) {
        return ((PFVArType1IEEEVArController) _this_).getVvtmin();
    }

    private static void setVvtmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PFVArType1IEEEVArController) _this_).setVvtmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PFVArType1IEEEVArController) _this_).setVvtmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PFVArType1IEEEVArController", attrName));
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
                "PFVArType1IEEEVArController", attrName, value));
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
            map.put("tvarc", new AttrDetails("PFVArType1IEEEVArController.tvarc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PFVArType1IEEEVArController::getTvarc, PFVArType1IEEEVArController::setTvarc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vvar", new AttrDetails("PFVArType1IEEEVArController.vvar", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PFVArType1IEEEVArController::getVvar, PFVArType1IEEEVArController::setVvar));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vvarcbw", new AttrDetails("PFVArType1IEEEVArController.vvarcbw", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PFVArType1IEEEVArController::getVvarcbw, PFVArType1IEEEVArController::setVvarcbw));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vvarref", new AttrDetails("PFVArType1IEEEVArController.vvarref", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PFVArType1IEEEVArController::getVvarref, PFVArType1IEEEVArController::setVvarref));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vvtmax", new AttrDetails("PFVArType1IEEEVArController.vvtmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PFVArType1IEEEVArController::getVvtmax, PFVArType1IEEEVArController::setVvtmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vvtmin", new AttrDetails("PFVArType1IEEEVArController.vvtmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PFVArType1IEEEVArController::getVvtmin, PFVArType1IEEEVArController::setVvtmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PFVArType1IEEEVArController(null).allAttrDetailsMap());
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
