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
 * QP and QU limitation model. Reference: IEC 61400-27-1:2015, 5.6.5.10.
 */
@SuppressWarnings("unused")
public class WindContQPQULimIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindContQPQULimIEC.class);

    /**
     * Constructor.
     */
    public WindContQPQULimIEC(String rdfid) {
        super("WindContQPQULimIEC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindContQPQULimIEC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The wind dynamics lookup table associated with this QP and QU limitation model.
     *
     * NOT USED
     */
    private Set<WindDynamicsLookupTable> WindDynamicsLookupTable = new HashSet<>(); // OneToMany

    private Set<String> WindDynamicsLookupTableIdSet = new HashSet<>();

    public Set<WindDynamicsLookupTable> getWindDynamicsLookupTable() {
        return WindDynamicsLookupTable;
    }

    public void setWindDynamicsLookupTable(WindDynamicsLookupTable _object_) {
        if (!WindDynamicsLookupTable.contains(_object_)) {
            WindDynamicsLookupTable.add(_object_);
            _object_.setWindContQPQULimIEC(this);
            WindDynamicsLookupTableIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getWindDynamicsLookupTable(BaseClass _this_) {
        var objs = ((WindContQPQULimIEC) _this_).getWindDynamicsLookupTable();
        var ids = ((WindContQPQULimIEC) _this_).WindDynamicsLookupTableIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setWindDynamicsLookupTable(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindContQPQULimIEC) _this_).WindDynamicsLookupTableIdSet.add((String) _value_);
        } else if (_value_ instanceof WindDynamicsLookupTable) {
            ((WindContQPQULimIEC) _this_).setWindDynamicsLookupTable((WindDynamicsLookupTable) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindDynamicsLookupTable");
        }
    }

    /**
     * Wind generator type 3 or type 4 model with which this QP and QU limitation model is associated.
     *
     * NOT USED
     */
    private WindTurbineType3or4IEC WindTurbineType3or4IEC; // OneToOne

    private String WindTurbineType3or4IECId;

    public WindTurbineType3or4IEC getWindTurbineType3or4IEC() {
        return WindTurbineType3or4IEC;
    }

    public void setWindTurbineType3or4IEC(WindTurbineType3or4IEC _object_) {
        if (WindTurbineType3or4IEC != _object_) {
            WindTurbineType3or4IEC = _object_;
            _object_.setWindContQPQULimIEC(this);
            WindTurbineType3or4IECId = _object_.getRdfid();
        }
    }

    private static Object getWindTurbineType3or4IEC(BaseClass _this_) {
        var obj = ((WindContQPQULimIEC) _this_).getWindTurbineType3or4IEC();
        var id = ((WindContQPQULimIEC) _this_).WindTurbineType3or4IECId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setWindTurbineType3or4IEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindContQPQULimIEC) _this_).WindTurbineType3or4IECId = (String) _value_;
        } else if (_value_ instanceof WindTurbineType3or4IEC) {
            ((WindContQPQULimIEC) _this_).setWindTurbineType3or4IEC((WindTurbineType3or4IEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindTurbineType3or4IEC");
        }
    }

    /**
     * Power measurement filter time constant for Q capacity (<i>T</i><i><sub>pfiltql</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     */
    private Double tpfiltql; // Seconds

    public Double getTpfiltql() {
        return tpfiltql;
    }

    public void setTpfiltql(Double _value_) {
        tpfiltql = _value_;
    }

    private static Object getTpfiltql(BaseClass _this_) {
        return ((WindContQPQULimIEC) _this_).getTpfiltql();
    }

    private static void setTpfiltql(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQPQULimIEC) _this_).setTpfiltql((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQPQULimIEC) _this_).setTpfiltql(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage measurement filter time constant for Q capacity (<i>T</i><i><sub>ufiltql</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     */
    private Double tufiltql; // Seconds

    public Double getTufiltql() {
        return tufiltql;
    }

    public void setTufiltql(Double _value_) {
        tufiltql = _value_;
    }

    private static Object getTufiltql(BaseClass _this_) {
        return ((WindContQPQULimIEC) _this_).getTufiltql();
    }

    private static void setTufiltql(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContQPQULimIEC) _this_).setTufiltql((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContQPQULimIEC) _this_).setTufiltql(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindContQPQULimIEC", attrName));
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
                "WindContQPQULimIEC", attrName, value));
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
            map.put("WindDynamicsLookupTable", new AttrDetails("WindContQPQULimIEC.WindDynamicsLookupTable", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindContQPQULimIEC::getWindDynamicsLookupTable, WindContQPQULimIEC::setWindDynamicsLookupTable));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindTurbineType3or4IEC", new AttrDetails("WindContQPQULimIEC.WindTurbineType3or4IEC", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindContQPQULimIEC::getWindTurbineType3or4IEC, WindContQPQULimIEC::setWindTurbineType3or4IEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpfiltql", new AttrDetails("WindContQPQULimIEC.tpfiltql", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQPQULimIEC::getTpfiltql, WindContQPQULimIEC::setTpfiltql));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tufiltql", new AttrDetails("WindContQPQULimIEC.tufiltql", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQPQULimIEC::getTufiltql, WindContQPQULimIEC::setTufiltql));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindContQPQULimIEC(null).allAttrDetailsMap());
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
