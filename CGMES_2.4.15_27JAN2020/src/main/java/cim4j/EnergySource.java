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
 * A generic equivalent for an energy supplier on a transmission or distribution voltage level.
 */
@SuppressWarnings("unused")
public class EnergySource extends ConductingEquipment {

    private static final Logging LOG = Logging.getLogger(EnergySource.class);

    /**
     * Default constructor.
     */
    public EnergySource() {
        setCimType("EnergySource");
    }

    /**
     * Energy Scheduling Type of an Energy Source
     */
    private EnergySchedulingType EnergySchedulingType; // ManyToOne

    public EnergySchedulingType getEnergySchedulingType() {
        return EnergySchedulingType;
    }

    public void setEnergySchedulingType(BaseClass _object_) {
        if (!(_object_ instanceof EnergySchedulingType)) {
            throw new IllegalArgumentException("Object is not EnergySchedulingType");
        }
        if (EnergySchedulingType != _object_) {
            EnergySchedulingType = (EnergySchedulingType) _object_;
            EnergySchedulingType.setEnergySource(this);
        }
    }

    public String EnergySchedulingTypeToString() {
        return EnergySchedulingType != null ? EnergySchedulingType.getRdfid() : null;
    }

    /**
     * Wind generator Type 3 or 4 dynamics model associated with this energy source.
     *
     * NOT USED
     */
    private WindTurbineType3or4Dynamics WindTurbineType3or4Dynamics; // OneToOne

    public WindTurbineType3or4Dynamics getWindTurbineType3or4Dynamics() {
        return WindTurbineType3or4Dynamics;
    }

    public void setWindTurbineType3or4Dynamics(BaseClass _object_) {
        if (!(_object_ instanceof WindTurbineType3or4Dynamics)) {
            throw new IllegalArgumentException("Object is not WindTurbineType3or4Dynamics");
        }
        if (WindTurbineType3or4Dynamics != _object_) {
            WindTurbineType3or4Dynamics = (WindTurbineType3or4Dynamics) _object_;
            WindTurbineType3or4Dynamics.setEnergySource(this);
        }
    }

    public String WindTurbineType3or4DynamicsToString() {
        return WindTurbineType3or4Dynamics != null ? WindTurbineType3or4Dynamics.getRdfid() : null;
    }

    /**
     * High voltage source active injection. Load sign convention is used, i.e. positive sign means flow out from a node. Starting value for steady state solutions.
     */
    private Double activePower; // ActivePower

    public Double getActivePower() {
        return activePower;
    }

    public void setActivePower(Double _value_) {
        activePower = _value_;
    }

    public void setActivePower(String _value_) {
        activePower = getDoubleFromString(_value_);
    }

    public String activePowerToString() {
        return activePower != null ? activePower.toString() : null;
    }

    /**
     * Phase-to-phase nominal voltage.
     */
    private Double nominalVoltage; // Voltage

    public Double getNominalVoltage() {
        return nominalVoltage;
    }

    public void setNominalVoltage(Double _value_) {
        nominalVoltage = _value_;
    }

    public void setNominalVoltage(String _value_) {
        nominalVoltage = getDoubleFromString(_value_);
    }

    public String nominalVoltageToString() {
        return nominalVoltage != null ? nominalVoltage.toString() : null;
    }

    /**
     * Positive sequence Thevenin resistance.
     */
    private Double r; // Resistance

    public Double getR() {
        return r;
    }

    public void setR(Double _value_) {
        r = _value_;
    }

    public void setR(String _value_) {
        r = getDoubleFromString(_value_);
    }

    public String rToString() {
        return r != null ? r.toString() : null;
    }

    /**
     * Zero sequence Thevenin resistance.
     */
    private Double r0; // Resistance

    public Double getR0() {
        return r0;
    }

    public void setR0(Double _value_) {
        r0 = _value_;
    }

    public void setR0(String _value_) {
        r0 = getDoubleFromString(_value_);
    }

    public String r0ToString() {
        return r0 != null ? r0.toString() : null;
    }

    /**
     * High voltage source reactive injection. Load sign convention is used, i.e. positive sign means flow out from a node. Starting value for steady state solutions.
     */
    private Double reactivePower; // ReactivePower

    public Double getReactivePower() {
        return reactivePower;
    }

    public void setReactivePower(Double _value_) {
        reactivePower = _value_;
    }

    public void setReactivePower(String _value_) {
        reactivePower = getDoubleFromString(_value_);
    }

    public String reactivePowerToString() {
        return reactivePower != null ? reactivePower.toString() : null;
    }

    /**
     * Negative sequence Thevenin resistance.
     */
    private Double rn; // Resistance

    public Double getRn() {
        return rn;
    }

    public void setRn(Double _value_) {
        rn = _value_;
    }

    public void setRn(String _value_) {
        rn = getDoubleFromString(_value_);
    }

    public String rnToString() {
        return rn != null ? rn.toString() : null;
    }

    /**
     * Phase angle of a-phase open circuit.
     */
    private Double voltageAngle; // AngleRadians

    public Double getVoltageAngle() {
        return voltageAngle;
    }

    public void setVoltageAngle(Double _value_) {
        voltageAngle = _value_;
    }

    public void setVoltageAngle(String _value_) {
        voltageAngle = getDoubleFromString(_value_);
    }

    public String voltageAngleToString() {
        return voltageAngle != null ? voltageAngle.toString() : null;
    }

    /**
     * Phase-to-phase open circuit voltage magnitude.
     */
    private Double voltageMagnitude; // Voltage

    public Double getVoltageMagnitude() {
        return voltageMagnitude;
    }

    public void setVoltageMagnitude(Double _value_) {
        voltageMagnitude = _value_;
    }

    public void setVoltageMagnitude(String _value_) {
        voltageMagnitude = getDoubleFromString(_value_);
    }

    public String voltageMagnitudeToString() {
        return voltageMagnitude != null ? voltageMagnitude.toString() : null;
    }

    /**
     * Positive sequence Thevenin reactance.
     */
    private Double x; // Reactance

    public Double getX() {
        return x;
    }

    public void setX(Double _value_) {
        x = _value_;
    }

    public void setX(String _value_) {
        x = getDoubleFromString(_value_);
    }

    public String xToString() {
        return x != null ? x.toString() : null;
    }

    /**
     * Zero sequence Thevenin reactance.
     */
    private Double x0; // Reactance

    public Double getX0() {
        return x0;
    }

    public void setX0(Double _value_) {
        x0 = _value_;
    }

    public void setX0(String _value_) {
        x0 = getDoubleFromString(_value_);
    }

    public String x0ToString() {
        return x0 != null ? x0.toString() : null;
    }

    /**
     * Negative sequence Thevenin reactance.
     */
    private Double xn; // Reactance

    public Double getXn() {
        return xn;
    }

    public void setXn(Double _value_) {
        xn = _value_;
    }

    public void setXn(String _value_) {
        xn = getDoubleFromString(_value_);
    }

    public String xnToString() {
        return xn != null ? xn.toString() : null;
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
        return getAttribute("EnergySource", attrName);
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
        setAttribute("EnergySource", attrName, objectValue);
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
        setAttribute("EnergySource", attrName, stringValue);
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
            profiles.add(CGMESProfile.EQ_BD);
            profiles.add(CGMESProfile.EQ);
            map.put("EnergySchedulingType", new AttrDetails("EnergySource.EnergySchedulingType", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindTurbineType3or4Dynamics", new AttrDetails("EnergySource.WindTurbineType3or4Dynamics", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("activePower", new AttrDetails("EnergySource.activePower", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("nominalVoltage", new AttrDetails("EnergySource.nominalVoltage", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r", new AttrDetails("EnergySource.r", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r0", new AttrDetails("EnergySource.r0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("reactivePower", new AttrDetails("EnergySource.reactivePower", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("rn", new AttrDetails("EnergySource.rn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("voltageAngle", new AttrDetails("EnergySource.voltageAngle", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("voltageMagnitude", new AttrDetails("EnergySource.voltageMagnitude", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x", new AttrDetails("EnergySource.x", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x0", new AttrDetails("EnergySource.x0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("xn", new AttrDetails("EnergySource.xn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new EnergySource().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("EnergySchedulingType", new GetterSetter(this::EnergySchedulingTypeToString, this::setEnergySchedulingType, null));
        map.put("WindTurbineType3or4Dynamics", new GetterSetter(this::WindTurbineType3or4DynamicsToString, this::setWindTurbineType3or4Dynamics, null));
        map.put("activePower", new GetterSetter(this::activePowerToString, null, this::setActivePower));
        map.put("nominalVoltage", new GetterSetter(this::nominalVoltageToString, null, this::setNominalVoltage));
        map.put("r", new GetterSetter(this::rToString, null, this::setR));
        map.put("r0", new GetterSetter(this::r0ToString, null, this::setR0));
        map.put("reactivePower", new GetterSetter(this::reactivePowerToString, null, this::setReactivePower));
        map.put("rn", new GetterSetter(this::rnToString, null, this::setRn));
        map.put("voltageAngle", new GetterSetter(this::voltageAngleToString, null, this::setVoltageAngle));
        map.put("voltageMagnitude", new GetterSetter(this::voltageMagnitudeToString, null, this::setVoltageMagnitude));
        map.put("x", new GetterSetter(this::xToString, null, this::setX));
        map.put("x0", new GetterSetter(this::x0ToString, null, this::setX0));
        map.put("xn", new GetterSetter(this::xnToString, null, this::setXn));
        return map;
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.DY);
        profiles.add(CGMESProfile.EQ_BD);
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.SSH);
        POSSIBLE_PROFILES = Collections.unmodifiableSet(profiles);
    }

    private static final CGMESProfile RECOMMENDED_PROFILE = CGMESProfile.EQ;

    private static final Set<CGMESProfile> POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>(POSSIBLE_PROFILES);
        for (var attrDetails : ATTR_DETAILS_MAP.values()) {
            profiles.addAll(attrDetails.profiles);
        }
        POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES = Collections.unmodifiableSet(profiles);
    }
}
