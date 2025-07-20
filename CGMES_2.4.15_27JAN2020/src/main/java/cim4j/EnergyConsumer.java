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
 * Generic user of energy - a  point of consumption on the power system model.
 */
@SuppressWarnings("unused")
public class EnergyConsumer extends ConductingEquipment {

    private static final Logging LOG = Logging.getLogger(EnergyConsumer.class);

    /**
     * Constructor.
     */
    public EnergyConsumer(String rdfid) {
        super("EnergyConsumer", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected EnergyConsumer(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Load dynamics model used to describe dynamic behavior of this energy consumer.
     */
    private LoadDynamics LoadDynamics; // ManyToOne

    private String LoadDynamicsId;

    public LoadDynamics getLoadDynamics() {
        return LoadDynamics;
    }

    public void setLoadDynamics(LoadDynamics _object_) {
        if (LoadDynamics != _object_) {
            LoadDynamics = _object_;
            _object_.setEnergyConsumer(this);
            LoadDynamicsId = _object_.getRdfid();
        }
    }

    private static Object getLoadDynamics(BaseClass _this_) {
        var obj = ((EnergyConsumer) _this_).getLoadDynamics();
        var id = ((EnergyConsumer) _this_).LoadDynamicsId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setLoadDynamics(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((EnergyConsumer) _this_).LoadDynamicsId = (String) _value_;
        } else if (_value_ instanceof LoadDynamics) {
            ((EnergyConsumer) _this_).setLoadDynamics((LoadDynamics) _value_);
        } else {
            throw new IllegalArgumentException("Object is not LoadDynamics");
        }
    }

    /**
     * The load response characteristic of this load.  If missing, this load is assumed to be constant power.
     */
    private LoadResponseCharacteristic LoadResponse; // ManyToOne

    private String LoadResponseId;

    public LoadResponseCharacteristic getLoadResponse() {
        return LoadResponse;
    }

    public void setLoadResponse(LoadResponseCharacteristic _object_) {
        if (LoadResponse != _object_) {
            LoadResponse = _object_;
            _object_.setEnergyConsumer(this);
            LoadResponseId = _object_.getRdfid();
        }
    }

    private static Object getLoadResponse(BaseClass _this_) {
        var obj = ((EnergyConsumer) _this_).getLoadResponse();
        var id = ((EnergyConsumer) _this_).LoadResponseId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setLoadResponse(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((EnergyConsumer) _this_).LoadResponseId = (String) _value_;
        } else if (_value_ instanceof LoadResponseCharacteristic) {
            ((EnergyConsumer) _this_).setLoadResponse((LoadResponseCharacteristic) _value_);
        } else {
            throw new IllegalArgumentException("Object is not LoadResponseCharacteristic");
        }
    }

    /**
     * Active power of the load. Load sign convention is used, i.e. positive sign means flow out from a node. For voltage dependent loads the value is at rated voltage. Starting value for a steady state solution.
     */
    private Double p; // ActivePower

    public Double getP() {
        return p;
    }

    public void setP(Double _value_) {
        p = _value_;
    }

    private static Object getP(BaseClass _this_) {
        return ((EnergyConsumer) _this_).getP();
    }

    private static void setP(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EnergyConsumer) _this_).setP((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EnergyConsumer) _this_).setP(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Active power of the load that is a fixed quantity. Load sign convention is used, i.e. positive sign means flow out from a node.
     */
    private Double pfixed; // ActivePower

    public Double getPfixed() {
        return pfixed;
    }

    public void setPfixed(Double _value_) {
        pfixed = _value_;
    }

    private static Object getPfixed(BaseClass _this_) {
        return ((EnergyConsumer) _this_).getPfixed();
    }

    private static void setPfixed(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EnergyConsumer) _this_).setPfixed((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EnergyConsumer) _this_).setPfixed(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fixed active power as per cent of load group fixed active power. Load sign convention is used, i.e. positive sign means flow out from a node.
     */
    private Double pfixedPct; // PerCent

    public Double getPfixedPct() {
        return pfixedPct;
    }

    public void setPfixedPct(Double _value_) {
        pfixedPct = _value_;
    }

    private static Object getPfixedPct(BaseClass _this_) {
        return ((EnergyConsumer) _this_).getPfixedPct();
    }

    private static void setPfixedPct(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EnergyConsumer) _this_).setPfixedPct((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EnergyConsumer) _this_).setPfixedPct(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive power of the load. Load sign convention is used, i.e. positive sign means flow out from a node. For voltage dependent loads the value is at rated voltage. Starting value for a steady state solution.
     */
    private Double q; // ReactivePower

    public Double getQ() {
        return q;
    }

    public void setQ(Double _value_) {
        q = _value_;
    }

    private static Object getQ(BaseClass _this_) {
        return ((EnergyConsumer) _this_).getQ();
    }

    private static void setQ(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EnergyConsumer) _this_).setQ((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EnergyConsumer) _this_).setQ(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive power of the load that is a fixed quantity. Load sign convention is used, i.e. positive sign means flow out from a node.
     */
    private Double qfixed; // ReactivePower

    public Double getQfixed() {
        return qfixed;
    }

    public void setQfixed(Double _value_) {
        qfixed = _value_;
    }

    private static Object getQfixed(BaseClass _this_) {
        return ((EnergyConsumer) _this_).getQfixed();
    }

    private static void setQfixed(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EnergyConsumer) _this_).setQfixed((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EnergyConsumer) _this_).setQfixed(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fixed reactive power as per cent of load group fixed reactive power. Load sign convention is used, i.e. positive sign means flow out from a node.
     */
    private Double qfixedPct; // PerCent

    public Double getQfixedPct() {
        return qfixedPct;
    }

    public void setQfixedPct(Double _value_) {
        qfixedPct = _value_;
    }

    private static Object getQfixedPct(BaseClass _this_) {
        return ((EnergyConsumer) _this_).getQfixedPct();
    }

    private static void setQfixedPct(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EnergyConsumer) _this_).setQfixedPct((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EnergyConsumer) _this_).setQfixedPct(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "EnergyConsumer", attrName));
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
                "EnergyConsumer", attrName, value));
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
            map.put("LoadDynamics", new AttrDetails("EnergyConsumer.LoadDynamics", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, EnergyConsumer::getLoadDynamics, EnergyConsumer::setLoadDynamics));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("LoadResponse", new AttrDetails("EnergyConsumer.LoadResponse", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, EnergyConsumer::getLoadResponse, EnergyConsumer::setLoadResponse));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("p", new AttrDetails("EnergyConsumer.p", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EnergyConsumer::getP, EnergyConsumer::setP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("pfixed", new AttrDetails("EnergyConsumer.pfixed", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EnergyConsumer::getPfixed, EnergyConsumer::setPfixed));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("pfixedPct", new AttrDetails("EnergyConsumer.pfixedPct", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EnergyConsumer::getPfixedPct, EnergyConsumer::setPfixedPct));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("q", new AttrDetails("EnergyConsumer.q", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EnergyConsumer::getQ, EnergyConsumer::setQ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("qfixed", new AttrDetails("EnergyConsumer.qfixed", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EnergyConsumer::getQfixed, EnergyConsumer::setQfixed));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("qfixedPct", new AttrDetails("EnergyConsumer.qfixedPct", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EnergyConsumer::getQfixedPct, EnergyConsumer::setQfixedPct));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new EnergyConsumer(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.DY);
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
