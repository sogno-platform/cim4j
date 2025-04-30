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
 * These load models (known also as generic non-linear dynamic (GNLD) load models) can be used in mid-term and long-term voltage stability simulations (i.e., to study voltage collapse), as they can replace a more detailed representation of aggregate load, including induction motors, thermostatically controlled and static loads.
 */
@SuppressWarnings("unused")
public class LoadGenericNonLinear extends LoadDynamics {

    private static final Logging LOG = Logging.getLogger(LoadGenericNonLinear.class);

    /**
     * Default constructor.
     */
    public LoadGenericNonLinear() {
        setCimType("LoadGenericNonLinear");
    }

    /**
     * Steady state voltage index for reactive power (BS).
     */
    private Double bs; // Simple_Float

    public Double getBs() {
        return bs;
    }

    public void setBs(Double _value_) {
        bs = _value_;
    }

    public void setBs(String _value_) {
        bs = getDoubleFromString(_value_);
    }

    public String bsToString() {
        return bs != null ? bs.toString() : null;
    }

    /**
     * Transient voltage index for reactive power (BT).
     */
    private Double bt; // Simple_Float

    public Double getBt() {
        return bt;
    }

    public void setBt(Double _value_) {
        bt = _value_;
    }

    public void setBt(String _value_) {
        bt = getDoubleFromString(_value_);
    }

    public String btToString() {
        return bt != null ? bt.toString() : null;
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

    public String genericNonLinearLoadModelTypeToString() {
        return genericNonLinearLoadModelType;
    }

    /**
     * Steady state voltage index for active power (LS).
     */
    private Double ls; // Simple_Float

    public Double getLs() {
        return ls;
    }

    public void setLs(Double _value_) {
        ls = _value_;
    }

    public void setLs(String _value_) {
        ls = getDoubleFromString(_value_);
    }

    public String lsToString() {
        return ls != null ? ls.toString() : null;
    }

    /**
     * Transient voltage index for active power (LT).
     */
    private Double lt; // Simple_Float

    public Double getLt() {
        return lt;
    }

    public void setLt(Double _value_) {
        lt = _value_;
    }

    public void setLt(String _value_) {
        lt = getDoubleFromString(_value_);
    }

    public String ltToString() {
        return lt != null ? lt.toString() : null;
    }

    /**
     * Dynamic portion of active load (P).
     */
    private Double pt; // Simple_Float

    public Double getPt() {
        return pt;
    }

    public void setPt(Double _value_) {
        pt = _value_;
    }

    public void setPt(String _value_) {
        pt = getDoubleFromString(_value_);
    }

    public String ptToString() {
        return pt != null ? pt.toString() : null;
    }

    /**
     * Dynamic portion of reactive load (Q).
     */
    private Double qt; // Simple_Float

    public Double getQt() {
        return qt;
    }

    public void setQt(Double _value_) {
        qt = _value_;
    }

    public void setQt(String _value_) {
        qt = getDoubleFromString(_value_);
    }

    public String qtToString() {
        return qt != null ? qt.toString() : null;
    }

    /**
     * Time constant of lag function of active power (T).
     */
    private Double tp; // Seconds

    public Double getTp() {
        return tp;
    }

    public void setTp(Double _value_) {
        tp = _value_;
    }

    public void setTp(String _value_) {
        tp = getDoubleFromString(_value_);
    }

    public String tpToString() {
        return tp != null ? tp.toString() : null;
    }

    /**
     * Time constant of lag function of reactive power (T).
     */
    private Double tq; // Seconds

    public Double getTq() {
        return tq;
    }

    public void setTq(Double _value_) {
        tq = _value_;
    }

    public void setTq(String _value_) {
        tq = getDoubleFromString(_value_);
    }

    public String tqToString() {
        return tq != null ? tq.toString() : null;
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
     * Get an attribute value as string.
     *
     * @param attrName The attribute name
     * @return         The attribute value
     */
    @Override
    public String getAttribute(String attrName) {
        return getAttribute("LoadGenericNonLinear", attrName);
    }

    @Override
    protected String getAttribute(String className, String attrName) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var getterFunction = classGetterSetterMap.get(attrName).getter;
            return getterFunction.get();
        }
        return super.getAttribute(className, attrName);
    }

    /**
     * Set an attribute value as object (for class and list attributes).
     *
     * @param attrName    The attribute name
     * @param objectValue The attribute value as object
     */
    @Override
    public void setAttribute(String attrName, BaseClass objectValue) {
        setAttribute("LoadGenericNonLinear", attrName, objectValue);
    }

    @Override
    protected void setAttribute(String className, String attrName, BaseClass objectValue) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var setterFunction = classGetterSetterMap.get(attrName).objectSetter;
            setterFunction.accept(objectValue);
        } else {
            super.setAttribute(className, attrName, objectValue);
        }
    }

    /**
     * Set an attribute value as string (for primitive (including datatype) and enum attributes).
     *
     * @param attrName    The attribute name
     * @param stringValue The attribute value as string
     */
    @Override
    public void setAttribute(String attrName, String stringValue) {
        setAttribute("LoadGenericNonLinear", attrName, stringValue);
    }

    @Override
    protected void setAttribute(String className, String attrName, String stringValue) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var setterFunction = classGetterSetterMap.get(attrName).stringSetter;
            setterFunction.accept(stringValue);
        } else {
            super.setAttribute(className, attrName, stringValue);
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
            map.put("bs", new AttrDetails("LoadGenericNonLinear.bs", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bt", new AttrDetails("LoadGenericNonLinear.bt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("genericNonLinearLoadModelType", new AttrDetails("LoadGenericNonLinear.genericNonLinearLoadModelType", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ls", new AttrDetails("LoadGenericNonLinear.ls", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lt", new AttrDetails("LoadGenericNonLinear.lt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pt", new AttrDetails("LoadGenericNonLinear.pt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qt", new AttrDetails("LoadGenericNonLinear.qt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tp", new AttrDetails("LoadGenericNonLinear.tp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tq", new AttrDetails("LoadGenericNonLinear.tq", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new LoadGenericNonLinear().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("bs", new GetterSetter(this::bsToString, null, this::setBs));
        map.put("bt", new GetterSetter(this::btToString, null, this::setBt));
        map.put("genericNonLinearLoadModelType", new GetterSetter(this::genericNonLinearLoadModelTypeToString, null, this::setGenericNonLinearLoadModelType));
        map.put("ls", new GetterSetter(this::lsToString, null, this::setLs));
        map.put("lt", new GetterSetter(this::ltToString, null, this::setLt));
        map.put("pt", new GetterSetter(this::ptToString, null, this::setPt));
        map.put("qt", new GetterSetter(this::qtToString, null, this::setQt));
        map.put("tp", new GetterSetter(this::tpToString, null, this::setTp));
        map.put("tq", new GetterSetter(this::tqToString, null, this::setTq));
        return map;
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
