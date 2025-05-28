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
     * Constructor.
     */
    public EnergySource(String rdfid) {
        super("EnergySource", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected EnergySource(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Energy Scheduling Type of an Energy Source
     */
    private EnergySchedulingType EnergySchedulingType; // ManyToOne

    public EnergySchedulingType getEnergySchedulingType() {
        return EnergySchedulingType;
    }

    public void setEnergySchedulingType(EnergySchedulingType _object_) {
        if (EnergySchedulingType != _object_) {
            EnergySchedulingType = _object_;
            EnergySchedulingType.setEnergySource(this);
        }
    }

    private static Object getEnergySchedulingType(BaseClass _this_) {
        return ((EnergySource) _this_).getEnergySchedulingType();
    }

    private static void setEnergySchedulingType(BaseClass _this_, Object _value_) {
        if (_value_ instanceof EnergySchedulingType) {
            ((EnergySource) _this_).setEnergySchedulingType((EnergySchedulingType) _value_);
        } else {
            throw new IllegalArgumentException("Object is not EnergySchedulingType");
        }
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

    public void setWindTurbineType3or4Dynamics(WindTurbineType3or4Dynamics _object_) {
        if (WindTurbineType3or4Dynamics != _object_) {
            WindTurbineType3or4Dynamics = _object_;
            WindTurbineType3or4Dynamics.setEnergySource(this);
        }
    }

    private static Object getWindTurbineType3or4Dynamics(BaseClass _this_) {
        return ((EnergySource) _this_).getWindTurbineType3or4Dynamics();
    }

    private static void setWindTurbineType3or4Dynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindTurbineType3or4Dynamics) {
            ((EnergySource) _this_).setWindTurbineType3or4Dynamics((WindTurbineType3or4Dynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindTurbineType3or4Dynamics");
        }
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

    private static Object getActivePower(BaseClass _this_) {
        return ((EnergySource) _this_).getActivePower();
    }

    private static void setActivePower(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EnergySource) _this_).setActivePower((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EnergySource) _this_).setActivePower(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getNominalVoltage(BaseClass _this_) {
        return ((EnergySource) _this_).getNominalVoltage();
    }

    private static void setNominalVoltage(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EnergySource) _this_).setNominalVoltage((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EnergySource) _this_).setNominalVoltage(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getR(BaseClass _this_) {
        return ((EnergySource) _this_).getR();
    }

    private static void setR(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EnergySource) _this_).setR((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EnergySource) _this_).setR(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getR0(BaseClass _this_) {
        return ((EnergySource) _this_).getR0();
    }

    private static void setR0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EnergySource) _this_).setR0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EnergySource) _this_).setR0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getReactivePower(BaseClass _this_) {
        return ((EnergySource) _this_).getReactivePower();
    }

    private static void setReactivePower(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EnergySource) _this_).setReactivePower((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EnergySource) _this_).setReactivePower(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getRn(BaseClass _this_) {
        return ((EnergySource) _this_).getRn();
    }

    private static void setRn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EnergySource) _this_).setRn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EnergySource) _this_).setRn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getVoltageAngle(BaseClass _this_) {
        return ((EnergySource) _this_).getVoltageAngle();
    }

    private static void setVoltageAngle(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EnergySource) _this_).setVoltageAngle((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EnergySource) _this_).setVoltageAngle(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getVoltageMagnitude(BaseClass _this_) {
        return ((EnergySource) _this_).getVoltageMagnitude();
    }

    private static void setVoltageMagnitude(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EnergySource) _this_).setVoltageMagnitude((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EnergySource) _this_).setVoltageMagnitude(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getX(BaseClass _this_) {
        return ((EnergySource) _this_).getX();
    }

    private static void setX(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EnergySource) _this_).setX((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EnergySource) _this_).setX(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getX0(BaseClass _this_) {
        return ((EnergySource) _this_).getX0();
    }

    private static void setX0(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EnergySource) _this_).setX0((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EnergySource) _this_).setX0(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
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

    private static Object getXn(BaseClass _this_) {
        return ((EnergySource) _this_).getXn();
    }

    private static void setXn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EnergySource) _this_).setXn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EnergySource) _this_).setXn(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "EnergySource", attrName));
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
                "EnergySource", attrName, value));
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
            map.put("EnergySchedulingType", new AttrDetails("EnergySource.EnergySchedulingType", true, "http://entsoe.eu/CIM/SchemaExtension/3/1#", profiles, false, false, EnergySource::getEnergySchedulingType, EnergySource::setEnergySchedulingType));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindTurbineType3or4Dynamics", new AttrDetails("EnergySource.WindTurbineType3or4Dynamics", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, EnergySource::getWindTurbineType3or4Dynamics, EnergySource::setWindTurbineType3or4Dynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("activePower", new AttrDetails("EnergySource.activePower", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EnergySource::getActivePower, EnergySource::setActivePower));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("nominalVoltage", new AttrDetails("EnergySource.nominalVoltage", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EnergySource::getNominalVoltage, EnergySource::setNominalVoltage));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r", new AttrDetails("EnergySource.r", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EnergySource::getR, EnergySource::setR));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r0", new AttrDetails("EnergySource.r0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EnergySource::getR0, EnergySource::setR0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("reactivePower", new AttrDetails("EnergySource.reactivePower", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EnergySource::getReactivePower, EnergySource::setReactivePower));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("rn", new AttrDetails("EnergySource.rn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EnergySource::getRn, EnergySource::setRn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("voltageAngle", new AttrDetails("EnergySource.voltageAngle", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EnergySource::getVoltageAngle, EnergySource::setVoltageAngle));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("voltageMagnitude", new AttrDetails("EnergySource.voltageMagnitude", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EnergySource::getVoltageMagnitude, EnergySource::setVoltageMagnitude));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x", new AttrDetails("EnergySource.x", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EnergySource::getX, EnergySource::setX));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x0", new AttrDetails("EnergySource.x0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EnergySource::getX0, EnergySource::setX0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("xn", new AttrDetails("EnergySource.xn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EnergySource::getXn, EnergySource::setXn));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new EnergySource(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
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
