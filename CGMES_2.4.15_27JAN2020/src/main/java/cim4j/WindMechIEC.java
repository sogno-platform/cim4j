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
 * Two mass model.  Reference: IEC Standard 61400-27-1 Section 6.6.2.1.
 */
@SuppressWarnings("unused")
public class WindMechIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindMechIEC.class);

    /**
     * Default constructor.
     */
    public WindMechIEC() {
        setCimType("WindMechIEC");
    }

    /**
     * Wind turbine Type 3 model with which this wind mechanical model is associated.
     *
     * NOT USED
     */
    private WindGenTurbineType3IEC WindGenTurbineType3IEC; // OneToOne

    public WindGenTurbineType3IEC getWindGenTurbineType3IEC() {
        return WindGenTurbineType3IEC;
    }

    public void setWindGenTurbineType3IEC(BaseClass _object_) {
        if (!(_object_ instanceof WindGenTurbineType3IEC)) {
            throw new IllegalArgumentException("Object is not WindGenTurbineType3IEC");
        }
        if (WindGenTurbineType3IEC != _object_) {
            WindGenTurbineType3IEC = (WindGenTurbineType3IEC) _object_;
            WindGenTurbineType3IEC.setWindMechIEC(this);
        }
    }

    public String WindGenTurbineType3IECToString() {
        return WindGenTurbineType3IEC != null ? WindGenTurbineType3IEC.getRdfid() : null;
    }

    /**
     * Wind generator type 1 or 2 model with which this wind mechanical model is associated.
     *
     * NOT USED
     */
    private WindTurbineType1or2IEC WindTurbineType1or2IEC; // OneToOne

    public WindTurbineType1or2IEC getWindTurbineType1or2IEC() {
        return WindTurbineType1or2IEC;
    }

    public void setWindTurbineType1or2IEC(BaseClass _object_) {
        if (!(_object_ instanceof WindTurbineType1or2IEC)) {
            throw new IllegalArgumentException("Object is not WindTurbineType1or2IEC");
        }
        if (WindTurbineType1or2IEC != _object_) {
            WindTurbineType1or2IEC = (WindTurbineType1or2IEC) _object_;
            WindTurbineType1or2IEC.setWindMechIEC(this);
        }
    }

    public String WindTurbineType1or2IECToString() {
        return WindTurbineType1or2IEC != null ? WindTurbineType1or2IEC.getRdfid() : null;
    }

    /**
     * Wind turbine type 4B model with which this wind mechanical model is associated.
     *
     * NOT USED
     */
    private WindTurbineType4bIEC WindTurbineType4bIEC; // OneToOne

    public WindTurbineType4bIEC getWindTurbineType4bIEC() {
        return WindTurbineType4bIEC;
    }

    public void setWindTurbineType4bIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindTurbineType4bIEC)) {
            throw new IllegalArgumentException("Object is not WindTurbineType4bIEC");
        }
        if (WindTurbineType4bIEC != _object_) {
            WindTurbineType4bIEC = (WindTurbineType4bIEC) _object_;
            WindTurbineType4bIEC.setWindMechIEC(this);
        }
    }

    public String WindTurbineType4bIECToString() {
        return WindTurbineType4bIEC != null ? WindTurbineType4bIEC.getRdfid() : null;
    }

    /**
     * Drive train damping (. It is type dependent parameter.
     */
    private Double cdrt; // PU

    public Double getCdrt() {
        return cdrt;
    }

    public void setCdrt(Double _value_) {
        cdrt = _value_;
    }

    public void setCdrt(String _value_) {
        cdrt = getDoubleFromString(_value_);
    }

    public String cdrtToString() {
        return cdrt != null ? cdrt.toString() : null;
    }

    /**
     * Inertia constant of generator (). It is type dependent parameter.
     */
    private Double hgen; // Seconds

    public Double getHgen() {
        return hgen;
    }

    public void setHgen(Double _value_) {
        hgen = _value_;
    }

    public void setHgen(String _value_) {
        hgen = getDoubleFromString(_value_);
    }

    public String hgenToString() {
        return hgen != null ? hgen.toString() : null;
    }

    /**
     * Inertia constant of wind turbine rotor (). It is type dependent parameter.
     */
    private Double hwtr; // Seconds

    public Double getHwtr() {
        return hwtr;
    }

    public void setHwtr(Double _value_) {
        hwtr = _value_;
    }

    public void setHwtr(String _value_) {
        hwtr = getDoubleFromString(_value_);
    }

    public String hwtrToString() {
        return hwtr != null ? hwtr.toString() : null;
    }

    /**
     * Drive train stiffness (). It is type dependent parameter.
     */
    private Double kdrt; // PU

    public Double getKdrt() {
        return kdrt;
    }

    public void setKdrt(Double _value_) {
        kdrt = _value_;
    }

    public void setKdrt(String _value_) {
        kdrt = getDoubleFromString(_value_);
    }

    public String kdrtToString() {
        return kdrt != null ? kdrt.toString() : null;
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
        return getAttribute("WindMechIEC", attrName);
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
        setAttribute("WindMechIEC", attrName, objectValue);
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
        setAttribute("WindMechIEC", attrName, stringValue);
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
            map.put("WindGenTurbineType3IEC", new AttrDetails("WindMechIEC.WindGenTurbineType3IEC", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindTurbineType1or2IEC", new AttrDetails("WindMechIEC.WindTurbineType1or2IEC", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindTurbineType4bIEC", new AttrDetails("WindMechIEC.WindTurbineType4bIEC", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("cdrt", new AttrDetails("WindMechIEC.cdrt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("hgen", new AttrDetails("WindMechIEC.hgen", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("hwtr", new AttrDetails("WindMechIEC.hwtr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kdrt", new AttrDetails("WindMechIEC.kdrt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindMechIEC().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("WindGenTurbineType3IEC", new GetterSetter(this::WindGenTurbineType3IECToString, this::setWindGenTurbineType3IEC, null));
        map.put("WindTurbineType1or2IEC", new GetterSetter(this::WindTurbineType1or2IECToString, this::setWindTurbineType1or2IEC, null));
        map.put("WindTurbineType4bIEC", new GetterSetter(this::WindTurbineType4bIECToString, this::setWindTurbineType4bIEC, null));
        map.put("cdrt", new GetterSetter(this::cdrtToString, null, this::setCdrt));
        map.put("hgen", new GetterSetter(this::hgenToString, null, this::setHgen));
        map.put("hwtr", new GetterSetter(this::hwtrToString, null, this::setHwtr));
        map.put("kdrt", new GetterSetter(this::kdrtToString, null, this::setKdrt));
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
