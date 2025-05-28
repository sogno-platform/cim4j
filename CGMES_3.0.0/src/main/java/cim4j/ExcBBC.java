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
 * Transformer fed static excitation system (static with ABB regulator). This model represents a static excitation system in which a gated thyristor bridge fed by a transformer at the main generator terminals feeds the main generator directly.
 */
@SuppressWarnings("unused")
public class ExcBBC extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcBBC.class);

    /**
     * Constructor.
     */
    public ExcBBC(String rdfid) {
        super("ExcBBC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcBBC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Maximum open circuit exciter voltage (<i>Efdmax</i>) (&gt; ExcBBC.efdmin).  Typical value = 5.
     */
    private Double efdmax; // PU

    public Double getEfdmax() {
        return efdmax;
    }

    public void setEfdmax(Double _value_) {
        efdmax = _value_;
    }

    private static Object getEfdmax(BaseClass _this_) {
        return ((ExcBBC) _this_).getEfdmax();
    }

    private static void setEfdmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcBBC) _this_).setEfdmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcBBC) _this_).setEfdmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum open circuit exciter voltage (<i>Efdmin</i>) (&lt; ExcBBC.efdmax).  Typical value = -5.
     */
    private Double efdmin; // PU

    public Double getEfdmin() {
        return efdmin;
    }

    public void setEfdmin(Double _value_) {
        efdmin = _value_;
    }

    private static Object getEfdmin(BaseClass _this_) {
        return ((ExcBBC) _this_).getEfdmin();
    }

    private static void setEfdmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcBBC) _this_).setEfdmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcBBC) _this_).setEfdmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Steady state gain (<i>K</i>) (not = 0).  Typical value = 300.
     */
    private Double k; // PU

    public Double getK() {
        return k;
    }

    public void setK(Double _value_) {
        k = _value_;
    }

    private static Object getK(BaseClass _this_) {
        return ((ExcBBC) _this_).getK();
    }

    private static void setK(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcBBC) _this_).setK((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcBBC) _this_).setK(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Supplementary signal routing selector (<i>switch</i>). true = <i>Vs</i> connected to 3rd summing point false =  <i>Vs</i> connected to 1st summing point (see diagram). Typical value = false.
     */
    private Boolean switch_; // Boolean

    public Boolean getSwitch() {
        return switch_;
    }

    public void setSwitch(Boolean _value_) {
        switch_ = _value_;
    }

    private static Object getSwitch(BaseClass _this_) {
        return ((ExcBBC) _this_).getSwitch();
    }

    private static void setSwitch(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ExcBBC) _this_).setSwitch((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ExcBBC) _this_).setSwitch(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Controller time constant (<i>T1</i>) (&gt;= 0).  Typical value = 6.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((ExcBBC) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcBBC) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcBBC) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Controller time constant (<i>T2</i>) (&gt;= 0).  Typical value = 1.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    private static Object getT2(BaseClass _this_) {
        return ((ExcBBC) _this_).getT2();
    }

    private static void setT2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcBBC) _this_).setT2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcBBC) _this_).setT2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (<i>T3</i>) (&gt;= 0).  If = 0, block is bypassed.  Typical value = 0,05.
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    private static Object getT3(BaseClass _this_) {
        return ((ExcBBC) _this_).getT3();
    }

    private static void setT3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcBBC) _this_).setT3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcBBC) _this_).setT3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead/lag time constant (<i>T4</i>) (&gt;= 0).  If = 0, block is bypassed.  Typical value = 0,01.
     */
    private Double t4; // Seconds

    public Double getT4() {
        return t4;
    }

    public void setT4(Double _value_) {
        t4 = _value_;
    }

    private static Object getT4(BaseClass _this_) {
        return ((ExcBBC) _this_).getT4();
    }

    private static void setT4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcBBC) _this_).setT4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcBBC) _this_).setT4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum control element output (<i>Vrmax</i>) (&gt; ExcBBC.vrmin).  Typical value = 5.
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    private static Object getVrmax(BaseClass _this_) {
        return ((ExcBBC) _this_).getVrmax();
    }

    private static void setVrmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcBBC) _this_).setVrmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcBBC) _this_).setVrmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum control element output (<i>Vrmin</i>) (&lt; ExcBBC.vrmax).  Typical value = -5.
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    private static Object getVrmin(BaseClass _this_) {
        return ((ExcBBC) _this_).getVrmin();
    }

    private static void setVrmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcBBC) _this_).setVrmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcBBC) _this_).setVrmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Effective excitation transformer reactance (<i>Xe</i>) (&gt;= 0).  <i>Xe</i> models the regulation of the transformer/rectifier unit.  Typical value = 0,05.
     */
    private Double xe; // PU

    public Double getXe() {
        return xe;
    }

    public void setXe(Double _value_) {
        xe = _value_;
    }

    private static Object getXe(BaseClass _this_) {
        return ((ExcBBC) _this_).getXe();
    }

    private static void setXe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcBBC) _this_).setXe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcBBC) _this_).setXe(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcBBC", attrName));
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
                "ExcBBC", attrName, value));
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
            map.put("efdmax", new AttrDetails("ExcBBC.efdmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcBBC::getEfdmax, ExcBBC::setEfdmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efdmin", new AttrDetails("ExcBBC.efdmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcBBC::getEfdmin, ExcBBC::setEfdmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k", new AttrDetails("ExcBBC.k", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcBBC::getK, ExcBBC::setK));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("switch", new AttrDetails("ExcBBC.switch", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcBBC::getSwitch, ExcBBC::setSwitch));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("ExcBBC.t1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcBBC::getT1, ExcBBC::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("ExcBBC.t2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcBBC::getT2, ExcBBC::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("ExcBBC.t3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcBBC::getT3, ExcBBC::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("ExcBBC.t4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcBBC::getT4, ExcBBC::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcBBC.vrmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcBBC::getVrmax, ExcBBC::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcBBC.vrmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcBBC::getVrmin, ExcBBC::setVrmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xe", new AttrDetails("ExcBBC.xe", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcBBC::getXe, ExcBBC::setXe));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcBBC(null).allAttrDetailsMap());
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
