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
 * IEEE voltage adjuster which is used to represent the voltage adjuster in either a power factor or VAr control system. Reference: IEEE 421.5-2005, 11.1.
 */
@SuppressWarnings("unused")
public class VAdjIEEE extends VoltageAdjusterDynamics {

    private static final Logging LOG = Logging.getLogger(VAdjIEEE.class);

    /**
     * Constructor.
     */
    public VAdjIEEE(String rdfid) {
        super("VAdjIEEE", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected VAdjIEEE(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Rate at which output of adjuster changes (<i>ADJ_SLEW</i>).  Unit = s / PU.  Typical value = 300.
     */
    private Float adjslew; // Float

    public Float getAdjslew() {
        return adjslew;
    }

    public void setAdjslew(Float _value_) {
        adjslew = _value_;
    }

    private static Object getAdjslew(BaseClass _this_) {
        return ((VAdjIEEE) _this_).getAdjslew();
    }

    private static void setAdjslew(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((VAdjIEEE) _this_).setAdjslew((Float) _value_);
        } else if (_value_ instanceof String) {
            ((VAdjIEEE) _this_).setAdjslew(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Time that adjuster pulses are off (<i>T</i><i><sub>AOFF</sub></i>) (&gt;= 0).  Typical value = 0,5.
     */
    private Double taoff; // Seconds

    public Double getTaoff() {
        return taoff;
    }

    public void setTaoff(Double _value_) {
        taoff = _value_;
    }

    private static Object getTaoff(BaseClass _this_) {
        return ((VAdjIEEE) _this_).getTaoff();
    }

    private static void setTaoff(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((VAdjIEEE) _this_).setTaoff((Double) _value_);
        } else if (_value_ instanceof String) {
            ((VAdjIEEE) _this_).setTaoff(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time that adjuster pulses are on (<i>T</i><i><sub>AON</sub></i>) (&gt;= 0).  Typical value = 0,1.
     */
    private Double taon; // Seconds

    public Double getTaon() {
        return taon;
    }

    public void setTaon(Double _value_) {
        taon = _value_;
    }

    private static Object getTaon(BaseClass _this_) {
        return ((VAdjIEEE) _this_).getTaon();
    }

    private static void setTaon(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((VAdjIEEE) _this_).setTaon((Double) _value_);
        } else if (_value_ instanceof String) {
            ((VAdjIEEE) _this_).setTaon(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Set high to provide a continuous raise or lower (<i>V</i><i><sub>ADJF</sub></i>).
     */
    private Float vadjf; // Float

    public Float getVadjf() {
        return vadjf;
    }

    public void setVadjf(Float _value_) {
        vadjf = _value_;
    }

    private static Object getVadjf(BaseClass _this_) {
        return ((VAdjIEEE) _this_).getVadjf();
    }

    private static void setVadjf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((VAdjIEEE) _this_).setVadjf((Float) _value_);
        } else if (_value_ instanceof String) {
            ((VAdjIEEE) _this_).setVadjf(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Maximum output of the adjuster (<i>V</i><i><sub>ADJMAX</sub></i>) (&gt; VAdjIEEE.vadjmin).  Typical value = 1,1.
     */
    private Double vadjmax; // PU

    public Double getVadjmax() {
        return vadjmax;
    }

    public void setVadjmax(Double _value_) {
        vadjmax = _value_;
    }

    private static Object getVadjmax(BaseClass _this_) {
        return ((VAdjIEEE) _this_).getVadjmax();
    }

    private static void setVadjmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((VAdjIEEE) _this_).setVadjmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((VAdjIEEE) _this_).setVadjmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum output of the adjuster (<i>V</i><i><sub>ADJMIN</sub></i>) (&lt; VAdjIEEE.vadjmax).  Typical value = 0,9.
     */
    private Double vadjmin; // PU

    public Double getVadjmin() {
        return vadjmin;
    }

    public void setVadjmin(Double _value_) {
        vadjmin = _value_;
    }

    private static Object getVadjmin(BaseClass _this_) {
        return ((VAdjIEEE) _this_).getVadjmin();
    }

    private static void setVadjmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((VAdjIEEE) _this_).setVadjmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((VAdjIEEE) _this_).setVadjmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "VAdjIEEE", attrName));
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
                "VAdjIEEE", attrName, value));
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
            map.put("adjslew", new AttrDetails("VAdjIEEE.adjslew", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, VAdjIEEE::getAdjslew, VAdjIEEE::setAdjslew));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("taoff", new AttrDetails("VAdjIEEE.taoff", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, VAdjIEEE::getTaoff, VAdjIEEE::setTaoff));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("taon", new AttrDetails("VAdjIEEE.taon", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, VAdjIEEE::getTaon, VAdjIEEE::setTaon));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vadjf", new AttrDetails("VAdjIEEE.vadjf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, VAdjIEEE::getVadjf, VAdjIEEE::setVadjf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vadjmax", new AttrDetails("VAdjIEEE.vadjmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, VAdjIEEE::getVadjmax, VAdjIEEE::setVadjmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vadjmin", new AttrDetails("VAdjIEEE.vadjmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, VAdjIEEE::getVadjmin, VAdjIEEE::setVadjmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new VAdjIEEE(null).allAttrDetailsMap());
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
