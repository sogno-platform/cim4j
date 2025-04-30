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
 * Pitch control emulator model.  Reference: IEC Standard 61400-27-1 Section 6.6.5.1.
 */
@SuppressWarnings("unused")
public class WindPitchContEmulIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindPitchContEmulIEC.class);

    /**
     * Default constructor.
     */
    public WindPitchContEmulIEC() {
        setCimType("WindPitchContEmulIEC");
    }

    /**
     * Wind turbine type 2 model with which this Pitch control emulator model is associated.
     *
     * NOT USED
     */
    private WindGenTurbineType2IEC WindGenTurbineType2IEC; // OneToOne

    public WindGenTurbineType2IEC getWindGenTurbineType2IEC() {
        return WindGenTurbineType2IEC;
    }

    public void setWindGenTurbineType2IEC(BaseClass _object_) {
        if (!(_object_ instanceof WindGenTurbineType2IEC)) {
            throw new IllegalArgumentException("Object is not WindGenTurbineType2IEC");
        }
        if (WindGenTurbineType2IEC != _object_) {
            WindGenTurbineType2IEC = (WindGenTurbineType2IEC) _object_;
            WindGenTurbineType2IEC.setWindPitchContEmulIEC(this);
        }
    }

    public String WindGenTurbineType2IECToString() {
        return WindGenTurbineType2IEC != null ? WindGenTurbineType2IEC.getRdfid() : null;
    }

    /**
     * Power error gain (). It is case dependent parameter.
     */
    private Double kdroop; // Simple_Float

    public Double getKdroop() {
        return kdroop;
    }

    public void setKdroop(Double _value_) {
        kdroop = _value_;
    }

    public void setKdroop(String _value_) {
        kdroop = getDoubleFromString(_value_);
    }

    public String kdroopToString() {
        return kdroop != null ? kdroop.toString() : null;
    }

    /**
     * Pitch control emulator integral constant (). It is type dependent parameter.
     */
    private Double kipce; // Simple_Float

    public Double getKipce() {
        return kipce;
    }

    public void setKipce(Double _value_) {
        kipce = _value_;
    }

    public void setKipce(String _value_) {
        kipce = getDoubleFromString(_value_);
    }

    public String kipceToString() {
        return kipce != null ? kipce.toString() : null;
    }

    /**
     * Aerodynamic power change vs. omegachange (). It is case dependent parameter.
     */
    private Double komegaaero; // PU

    public Double getKomegaaero() {
        return komegaaero;
    }

    public void setKomegaaero(Double _value_) {
        komegaaero = _value_;
    }

    public void setKomegaaero(String _value_) {
        komegaaero = getDoubleFromString(_value_);
    }

    public String komegaaeroToString() {
        return komegaaero != null ? komegaaero.toString() : null;
    }

    /**
     * Pitch control emulator proportional constant (). It is type dependent parameter.
     */
    private Double kppce; // Simple_Float

    public Double getKppce() {
        return kppce;
    }

    public void setKppce(Double _value_) {
        kppce = _value_;
    }

    public void setKppce(String _value_) {
        kppce = getDoubleFromString(_value_);
    }

    public String kppceToString() {
        return kppce != null ? kppce.toString() : null;
    }

    /**
     * Rotor speed in initial steady state (omega). It is case dependent parameter.
     */
    private Double omegaref; // PU

    public Double getOmegaref() {
        return omegaref;
    }

    public void setOmegaref(Double _value_) {
        omegaref = _value_;
    }

    public void setOmegaref(String _value_) {
        omegaref = getDoubleFromString(_value_);
    }

    public String omegarefToString() {
        return omegaref != null ? omegaref.toString() : null;
    }

    /**
     * Maximum steady state power (). It is case dependent parameter.
     */
    private Double pimax; // PU

    public Double getPimax() {
        return pimax;
    }

    public void setPimax(Double _value_) {
        pimax = _value_;
    }

    public void setPimax(String _value_) {
        pimax = getDoubleFromString(_value_);
    }

    public String pimaxToString() {
        return pimax != null ? pimax.toString() : null;
    }

    /**
     * Minimum steady state power (). It is case dependent parameter.
     */
    private Double pimin; // PU

    public Double getPimin() {
        return pimin;
    }

    public void setPimin(Double _value_) {
        pimin = _value_;
    }

    public void setPimin(String _value_) {
        pimin = getDoubleFromString(_value_);
    }

    public String piminToString() {
        return pimin != null ? pimin.toString() : null;
    }

    /**
     * First time constant in pitch control lag (). It is type dependent parameter.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    public void setT1(String _value_) {
        t1 = getDoubleFromString(_value_);
    }

    public String t1ToString() {
        return t1 != null ? t1.toString() : null;
    }

    /**
     * Second time constant in pitch control lag (). It is type dependent parameter.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    public void setT2(String _value_) {
        t2 = getDoubleFromString(_value_);
    }

    public String t2ToString() {
        return t2 != null ? t2.toString() : null;
    }

    /**
     * Time constant in generator air gap power lag (). It is type dependent parameter.
     */
    private Double tpe; // Seconds

    public Double getTpe() {
        return tpe;
    }

    public void setTpe(Double _value_) {
        tpe = _value_;
    }

    public void setTpe(String _value_) {
        tpe = getDoubleFromString(_value_);
    }

    public String tpeToString() {
        return tpe != null ? tpe.toString() : null;
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
        return getAttribute("WindPitchContEmulIEC", attrName);
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
        setAttribute("WindPitchContEmulIEC", attrName, objectValue);
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
        setAttribute("WindPitchContEmulIEC", attrName, stringValue);
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
            map.put("WindGenTurbineType2IEC", new AttrDetails("WindPitchContEmulIEC.WindGenTurbineType2IEC", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kdroop", new AttrDetails("WindPitchContEmulIEC.kdroop", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kipce", new AttrDetails("WindPitchContEmulIEC.kipce", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("komegaaero", new AttrDetails("WindPitchContEmulIEC.komegaaero", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kppce", new AttrDetails("WindPitchContEmulIEC.kppce", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omegaref", new AttrDetails("WindPitchContEmulIEC.omegaref", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pimax", new AttrDetails("WindPitchContEmulIEC.pimax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pimin", new AttrDetails("WindPitchContEmulIEC.pimin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("WindPitchContEmulIEC.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("WindPitchContEmulIEC.t2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpe", new AttrDetails("WindPitchContEmulIEC.tpe", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindPitchContEmulIEC().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("WindGenTurbineType2IEC", new GetterSetter(this::WindGenTurbineType2IECToString, this::setWindGenTurbineType2IEC, null));
        map.put("kdroop", new GetterSetter(this::kdroopToString, null, this::setKdroop));
        map.put("kipce", new GetterSetter(this::kipceToString, null, this::setKipce));
        map.put("komegaaero", new GetterSetter(this::komegaaeroToString, null, this::setKomegaaero));
        map.put("kppce", new GetterSetter(this::kppceToString, null, this::setKppce));
        map.put("omegaref", new GetterSetter(this::omegarefToString, null, this::setOmegaref));
        map.put("pimax", new GetterSetter(this::pimaxToString, null, this::setPimax));
        map.put("pimin", new GetterSetter(this::piminToString, null, this::setPimin));
        map.put("t1", new GetterSetter(this::t1ToString, null, this::setT1));
        map.put("t2", new GetterSetter(this::t2ToString, null, this::setT2));
        map.put("tpe", new GetterSetter(this::tpeToString, null, this::setTpe));
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
