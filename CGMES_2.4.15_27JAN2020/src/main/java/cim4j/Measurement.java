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
 * A Measurement represents any measured, calculated or non-measured non-calculated quantity. Any piece of equipment may contain Measurements, e.g. a substation may have temperature measurements and door open indications, a transformer may have oil temperature and tank pressure measurements, a bay may contain a number of power flow measurements and a Breaker may contain a switch status measurement.  The PSR - Measurement association is intended to capture this use of Measurement and is included in the naming hierarchy based on EquipmentContainer. The naming hierarchy typically has Measurements as leafs, e.g. Substation-VoltageLevel-Bay-Switch-Measurement. Some Measurements represent quantities related to a particular sensor location in the network, e.g. a voltage transformer (PT) at a busbar or a current transformer (CT) at the bar between a breaker and an isolator. The sensing position is not captured in the PSR - Measurement association. Instead it is captured by the Measurement - Terminal association that is used to define the sensing location in the network topology. The location is defined by the connection of the Terminal to ConductingEquipment.  If both a Terminal and PSR are associated, and the PSR is of type ConductingEquipment, the associated Terminal should belong to that ConductingEquipment instance. When the sensor location is needed both Measurement-PSR and Measurement-Terminal are used. The Measurement-Terminal association is never used alone.
 */
@SuppressWarnings("unused")
public class Measurement extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(Measurement.class);

    /**
     * Constructor.
     */
    public Measurement(String rdfid) {
        super("Measurement", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected Measurement(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The measurements associated with this power system resource.
     */
    private PowerSystemResource PowerSystemResource; // ManyToOne

    public PowerSystemResource getPowerSystemResource() {
        return PowerSystemResource;
    }

    public void setPowerSystemResource(PowerSystemResource _object_) {
        if (PowerSystemResource != _object_) {
            PowerSystemResource = _object_;
            PowerSystemResource.setMeasurements(this);
        }
    }

    private static Object getPowerSystemResource(BaseClass _this_) {
        return ((Measurement) _this_).getPowerSystemResource();
    }

    private static void setPowerSystemResource(BaseClass _this_, Object _value_) {
        if (_value_ instanceof PowerSystemResource) {
            ((Measurement) _this_).setPowerSystemResource((PowerSystemResource) _value_);
        } else {
            throw new IllegalArgumentException("Object is not PowerSystemResource");
        }
    }

    /**
     * One or more measurements may be associated with a terminal in the network.
     */
    private ACDCTerminal Terminal; // ManyToOne

    public ACDCTerminal getTerminal() {
        return Terminal;
    }

    public void setTerminal(ACDCTerminal _object_) {
        if (Terminal != _object_) {
            Terminal = _object_;
            Terminal.setMeasurements(this);
        }
    }

    private static Object getTerminal(BaseClass _this_) {
        return ((Measurement) _this_).getTerminal();
    }

    private static void setTerminal(BaseClass _this_, Object _value_) {
        if (_value_ instanceof ACDCTerminal) {
            ((Measurement) _this_).setTerminal((ACDCTerminal) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ACDCTerminal");
        }
    }

    /**
     * Specifies the type of measurement.  For example, this specifies if the measurement represents an indoor temperature, outdoor temperature, bus voltage, line flow, etc.
     */
    private String measurementType; // String

    public String getMeasurementType() {
        return measurementType;
    }

    public void setMeasurementType(String _value_) {
        measurementType = _value_;
    }

    private static Object getMeasurementType(BaseClass _this_) {
        return ((Measurement) _this_).getMeasurementType();
    }

    private static void setMeasurementType(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Measurement) _this_).setMeasurementType((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Indicates to which phases the measurement applies and avoids the need to use `measurementType` to also encode phase information (which would explode the types). The phase information in Measurement, along with `measurementType` and `phases` uniquely defines a Measurement for a device, based on normal network phase. Their meaning will not change when the computed energizing phasing is changed due to jumpers or other reasons. If the attribute is missing three phases (ABC) shall be assumed.
     */
    private String phases; // PhaseCode

    public String getPhases() {
        return phases;
    }

    public void setPhases(String _value_) {
        phases = _value_;
    }

    private static Object getPhases(BaseClass _this_) {
        return ((Measurement) _this_).getPhases();
    }

    private static void setPhases(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Measurement) _this_).setPhases((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * The unit multiplier of the measured quantity.
     */
    private String unitMultiplier; // UnitMultiplier

    public String getUnitMultiplier() {
        return unitMultiplier;
    }

    public void setUnitMultiplier(String _value_) {
        unitMultiplier = _value_;
    }

    private static Object getUnitMultiplier(BaseClass _this_) {
        return ((Measurement) _this_).getUnitMultiplier();
    }

    private static void setUnitMultiplier(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Measurement) _this_).setUnitMultiplier((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * The unit of measure of the measured quantity.
     */
    private String unitSymbol; // UnitSymbol

    public String getUnitSymbol() {
        return unitSymbol;
    }

    public void setUnitSymbol(String _value_) {
        unitSymbol = _value_;
    }

    private static Object getUnitSymbol(BaseClass _this_) {
        return ((Measurement) _this_).getUnitSymbol();
    }

    private static void setUnitSymbol(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Measurement) _this_).setUnitSymbol((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "Measurement", attrName));
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
                "Measurement", attrName, value));
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
            profiles.add(CGMESProfile.EQ);
            map.put("PowerSystemResource", new AttrDetails("Measurement.PowerSystemResource", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, Measurement::getPowerSystemResource, Measurement::setPowerSystemResource));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("Terminal", new AttrDetails("Measurement.Terminal", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, Measurement::getTerminal, Measurement::setTerminal));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("measurementType", new AttrDetails("Measurement.measurementType", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, Measurement::getMeasurementType, Measurement::setMeasurementType));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("phases", new AttrDetails("Measurement.phases", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, Measurement::getPhases, Measurement::setPhases));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("unitMultiplier", new AttrDetails("Measurement.unitMultiplier", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, Measurement::getUnitMultiplier, Measurement::setUnitMultiplier));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("unitSymbol", new AttrDetails("Measurement.unitSymbol", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, Measurement::getUnitSymbol, Measurement::setUnitSymbol));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new Measurement(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
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
