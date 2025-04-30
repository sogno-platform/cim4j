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
 * The class represents IEEE Voltage Adjuster which is used to represent the voltage adjuster in either a power factor or var control system.  Reference: IEEE Standard 421.5-2005 Section 11.1.
 */
@SuppressWarnings("unused")
public class VAdjIEEE extends VoltageAdjusterDynamics {

    private static final Logging LOG = Logging.getLogger(VAdjIEEE.class);

    /**
     * Default constructor.
     */
    public VAdjIEEE() {
        setCimType("VAdjIEEE");
    }

    /**
     * Rate at which output of adjuster changes ().  Unit = sec./PU.  Typical Value = 300.
     */
    private Double adjslew; // Simple_Float

    public Double getAdjslew() {
        return adjslew;
    }

    public void setAdjslew(Double _value_) {
        adjslew = _value_;
    }

    public void setAdjslew(String _value_) {
        adjslew = getDoubleFromString(_value_);
    }

    public String adjslewToString() {
        return adjslew != null ? adjslew.toString() : null;
    }

    /**
     * Time that adjuster pulses are off ().  Typical Value = 0.5.
     */
    private Double taoff; // Seconds

    public Double getTaoff() {
        return taoff;
    }

    public void setTaoff(Double _value_) {
        taoff = _value_;
    }

    public void setTaoff(String _value_) {
        taoff = getDoubleFromString(_value_);
    }

    public String taoffToString() {
        return taoff != null ? taoff.toString() : null;
    }

    /**
     * Time that adjuster pulses are on ().  Typical Value = 0.1.
     */
    private Double taon; // Seconds

    public Double getTaon() {
        return taon;
    }

    public void setTaon(Double _value_) {
        taon = _value_;
    }

    public void setTaon(String _value_) {
        taon = getDoubleFromString(_value_);
    }

    public String taonToString() {
        return taon != null ? taon.toString() : null;
    }

    /**
     * Set high to provide a continuous raise or lower ().
     */
    private Double vadjf; // Simple_Float

    public Double getVadjf() {
        return vadjf;
    }

    public void setVadjf(Double _value_) {
        vadjf = _value_;
    }

    public void setVadjf(String _value_) {
        vadjf = getDoubleFromString(_value_);
    }

    public String vadjfToString() {
        return vadjf != null ? vadjf.toString() : null;
    }

    /**
     * Maximum output of the adjuster ().  Typical Value = 1.1.
     */
    private Double vadjmax; // PU

    public Double getVadjmax() {
        return vadjmax;
    }

    public void setVadjmax(Double _value_) {
        vadjmax = _value_;
    }

    public void setVadjmax(String _value_) {
        vadjmax = getDoubleFromString(_value_);
    }

    public String vadjmaxToString() {
        return vadjmax != null ? vadjmax.toString() : null;
    }

    /**
     * Minimum output of the adjuster ().  Typical Value = 0.9.
     */
    private Double vadjmin; // PU

    public Double getVadjmin() {
        return vadjmin;
    }

    public void setVadjmin(Double _value_) {
        vadjmin = _value_;
    }

    public void setVadjmin(String _value_) {
        vadjmin = getDoubleFromString(_value_);
    }

    public String vadjminToString() {
        return vadjmin != null ? vadjmin.toString() : null;
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
        return getAttribute("VAdjIEEE", attrName);
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
        setAttribute("VAdjIEEE", attrName, objectValue);
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
        setAttribute("VAdjIEEE", attrName, stringValue);
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
            map.put("adjslew", new AttrDetails("VAdjIEEE.adjslew", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("taoff", new AttrDetails("VAdjIEEE.taoff", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("taon", new AttrDetails("VAdjIEEE.taon", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vadjf", new AttrDetails("VAdjIEEE.vadjf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vadjmax", new AttrDetails("VAdjIEEE.vadjmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vadjmin", new AttrDetails("VAdjIEEE.vadjmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new VAdjIEEE().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("adjslew", new GetterSetter(this::adjslewToString, null, this::setAdjslew));
        map.put("taoff", new GetterSetter(this::taoffToString, null, this::setTaoff));
        map.put("taon", new GetterSetter(this::taonToString, null, this::setTaon));
        map.put("vadjf", new GetterSetter(this::vadjfToString, null, this::setVadjf));
        map.put("vadjmax", new GetterSetter(this::vadjmaxToString, null, this::setVadjmax));
        map.put("vadjmin", new GetterSetter(this::vadjminToString, null, this::setVadjmin));
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
