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
 * An electrical connection point (AC or DC) to a piece of conducting equipment. Terminals are connected at physical connection points called connectivity nodes.
 */
@SuppressWarnings("unused")
public class ACDCTerminal extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(ACDCTerminal.class);

    /**
     * Constructor.
     */
    public ACDCTerminal(String rdfid) {
        super("ACDCTerminal", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ACDCTerminal(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The bus name marker used to name the bus (topological node).
     */
    private BusNameMarker BusNameMarker; // ManyToOne

    private String BusNameMarkerId;

    public BusNameMarker getBusNameMarker() {
        return BusNameMarker;
    }

    public void setBusNameMarker(BusNameMarker _object_) {
        if (BusNameMarker != _object_) {
            BusNameMarker = _object_;
            _object_.setTerminal(this);
            BusNameMarkerId = _object_.getRdfid();
        }
    }

    private static Object getBusNameMarker(BaseClass _this_) {
        var obj = ((ACDCTerminal) _this_).getBusNameMarker();
        var id = ((ACDCTerminal) _this_).BusNameMarkerId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setBusNameMarker(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ACDCTerminal) _this_).BusNameMarkerId = (String) _value_;
        } else if (_value_ instanceof BusNameMarker) {
            ((ACDCTerminal) _this_).setBusNameMarker((BusNameMarker) _value_);
        } else {
            throw new IllegalArgumentException("Object is not BusNameMarker");
        }
    }

    /**
     * Measurements associated with this terminal defining  where the measurement is placed in the network topology.  It may be used, for instance, to capture the sensor position, such as a voltage transformer (PT) at a busbar or a current transformer (CT) at the bar between a breaker and an isolator.
     *
     * NOT USED
     */
    private Set<Measurement> Measurements = new HashSet<>(); // OneToMany

    private Set<String> MeasurementsIdSet = new HashSet<>();

    public Set<Measurement> getMeasurements() {
        return Measurements;
    }

    public void setMeasurements(Measurement _object_) {
        if (!Measurements.contains(_object_)) {
            Measurements.add(_object_);
            _object_.setTerminal(this);
            MeasurementsIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getMeasurements(BaseClass _this_) {
        var objs = ((ACDCTerminal) _this_).getMeasurements();
        var ids = ((ACDCTerminal) _this_).MeasurementsIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setMeasurements(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ACDCTerminal) _this_).MeasurementsIdSet.add((String) _value_);
        } else if (_value_ instanceof Measurement) {
            ((ACDCTerminal) _this_).setMeasurements((Measurement) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Measurement");
        }
    }

    /**
     *
     * NOT USED
     */
    private Set<OperationalLimitSet> OperationalLimitSet = new HashSet<>(); // OneToMany

    private Set<String> OperationalLimitSetIdSet = new HashSet<>();

    public Set<OperationalLimitSet> getOperationalLimitSet() {
        return OperationalLimitSet;
    }

    public void setOperationalLimitSet(OperationalLimitSet _object_) {
        if (!OperationalLimitSet.contains(_object_)) {
            OperationalLimitSet.add(_object_);
            _object_.setTerminal(this);
            OperationalLimitSetIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getOperationalLimitSet(BaseClass _this_) {
        var objs = ((ACDCTerminal) _this_).getOperationalLimitSet();
        var ids = ((ACDCTerminal) _this_).OperationalLimitSetIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setOperationalLimitSet(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ACDCTerminal) _this_).OperationalLimitSetIdSet.add((String) _value_);
        } else if (_value_ instanceof OperationalLimitSet) {
            ((ACDCTerminal) _this_).setOperationalLimitSet((OperationalLimitSet) _value_);
        } else {
            throw new IllegalArgumentException("Object is not OperationalLimitSet");
        }
    }

    /**
     * The connected status is related to a bus-branch model and the topological node to terminal relation.  True implies the terminal is connected to the related topological node and false implies it is not.  In a bus-branch model, the connected status is used to tell if equipment is disconnected without having to change the connectivity described by the topological node to terminal relation. A valid case is that conducting equipment can be connected in one end and open in the other. In particular for an AC line segment, where the reactive line charging can be significant, this is a relevant case.
     */
    private Boolean connected; // Boolean

    public Boolean getConnected() {
        return connected;
    }

    public void setConnected(Boolean _value_) {
        connected = _value_;
    }

    private static Object getConnected(BaseClass _this_) {
        return ((ACDCTerminal) _this_).getConnected();
    }

    private static void setConnected(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ACDCTerminal) _this_).setConnected((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ACDCTerminal) _this_).setConnected(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * The orientation of the terminal connections for a multiple terminal conducting equipment.  The sequence numbering starts with 1 and additional terminals should follow in increasing order.   The first terminal is the `starting point` for a two terminal branch.
     */
    private Integer sequenceNumber; // Integer

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer _value_) {
        sequenceNumber = _value_;
    }

    private static Object getSequenceNumber(BaseClass _this_) {
        return ((ACDCTerminal) _this_).getSequenceNumber();
    }

    private static void setSequenceNumber(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((ACDCTerminal) _this_).setSequenceNumber((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((ACDCTerminal) _this_).setSequenceNumber(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ACDCTerminal", attrName));
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
                "ACDCTerminal", attrName, value));
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
            map.put("BusNameMarker", new AttrDetails("ACDCTerminal.BusNameMarker", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ACDCTerminal::getBusNameMarker, ACDCTerminal::setBusNameMarker));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("Measurements", new AttrDetails("ACDCTerminal.Measurements", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ACDCTerminal::getMeasurements, ACDCTerminal::setMeasurements));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("OperationalLimitSet", new AttrDetails("ACDCTerminal.OperationalLimitSet", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ACDCTerminal::getOperationalLimitSet, ACDCTerminal::setOperationalLimitSet));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("connected", new AttrDetails("ACDCTerminal.connected", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ACDCTerminal::getConnected, ACDCTerminal::setConnected));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("sequenceNumber", new AttrDetails("ACDCTerminal.sequenceNumber", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ACDCTerminal::getSequenceNumber, ACDCTerminal::setSequenceNumber));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ACDCTerminal(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.DY);
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.SV);
        profiles.add(CGMESProfile.SSH);
        profiles.add(CGMESProfile.TP);
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
