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
 * Current limitation model.  The current limitation model combines the physical limits.  Reference: IEC Standard 61400-27-1 Section 6.6.5.7.
 */
@SuppressWarnings("unused")
public class WindContCurrLimIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindContCurrLimIEC.class);

    /**
     * Constructor.
     */
    public WindContCurrLimIEC(String rdfid) {
        super("WindContCurrLimIEC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindContCurrLimIEC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The current control limitation model with which this wind dynamics lookup table is associated.
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
            _object_.setWindContCurrLimIEC(this);
            WindDynamicsLookupTableIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getWindDynamicsLookupTable(BaseClass _this_) {
        var objs = ((WindContCurrLimIEC) _this_).getWindDynamicsLookupTable();
        var ids = ((WindContCurrLimIEC) _this_).WindDynamicsLookupTableIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setWindDynamicsLookupTable(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindContCurrLimIEC) _this_).WindDynamicsLookupTableIdSet.add((String) _value_);
        } else if (_value_ instanceof WindDynamicsLookupTable) {
            ((WindContCurrLimIEC) _this_).setWindDynamicsLookupTable((WindDynamicsLookupTable) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindDynamicsLookupTable");
        }
    }

    /**
     * Wind turbine type 3 or 4 model with which this wind control current limitation model is associated.
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
            _object_.setWindContCurrLimIEC(this);
            WindTurbineType3or4IECId = _object_.getRdfid();
        }
    }

    private static Object getWindTurbineType3or4IEC(BaseClass _this_) {
        var obj = ((WindContCurrLimIEC) _this_).getWindTurbineType3or4IEC();
        var id = ((WindContCurrLimIEC) _this_).WindTurbineType3or4IECId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setWindTurbineType3or4IEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindContCurrLimIEC) _this_).WindTurbineType3or4IECId = (String) _value_;
        } else if (_value_ instanceof WindTurbineType3or4IEC) {
            ((WindContCurrLimIEC) _this_).setWindTurbineType3or4IEC((WindTurbineType3or4IEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindTurbineType3or4IEC");
        }
    }

    /**
     * Maximum continuous current at the wind turbine terminals (). It is type dependent parameter.
     */
    private Double imax; // PU

    public Double getImax() {
        return imax;
    }

    public void setImax(Double _value_) {
        imax = _value_;
    }

    private static Object getImax(BaseClass _this_) {
        return ((WindContCurrLimIEC) _this_).getImax();
    }

    private static void setImax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContCurrLimIEC) _this_).setImax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContCurrLimIEC) _this_).setImax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum current during voltage dip at the wind turbine terminals (). It is project dependent parameter.
     */
    private Double imaxdip; // PU

    public Double getImaxdip() {
        return imaxdip;
    }

    public void setImaxdip(Double _value_) {
        imaxdip = _value_;
    }

    private static Object getImaxdip(BaseClass _this_) {
        return ((WindContCurrLimIEC) _this_).getImaxdip();
    }

    private static void setImaxdip(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContCurrLimIEC) _this_).setImaxdip((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContCurrLimIEC) _this_).setImaxdip(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Limitation of type 3 stator current  ():  - false=0: total current limitation,  - true=1: stator current limitation).  It is type dependent parameter.
     */
    private Boolean mdfslim; // Boolean

    public Boolean getMdfslim() {
        return mdfslim;
    }

    public void setMdfslim(Boolean _value_) {
        mdfslim = _value_;
    }

    private static Object getMdfslim(BaseClass _this_) {
        return ((WindContCurrLimIEC) _this_).getMdfslim();
    }

    private static void setMdfslim(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((WindContCurrLimIEC) _this_).setMdfslim((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((WindContCurrLimIEC) _this_).setMdfslim(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Prioritisation of q control during LVRT (): - true = 1: reactive power priority, - false = 0: active power priority.  It is project dependent parameter.
     */
    private Boolean mqpri; // Boolean

    public Boolean getMqpri() {
        return mqpri;
    }

    public void setMqpri(Boolean _value_) {
        mqpri = _value_;
    }

    private static Object getMqpri(BaseClass _this_) {
        return ((WindContCurrLimIEC) _this_).getMqpri();
    }

    private static void setMqpri(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((WindContCurrLimIEC) _this_).setMqpri((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((WindContCurrLimIEC) _this_).setMqpri(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Voltage measurement filter time constant (). It is type dependent parameter.
     */
    private Double tufilt; // Seconds

    public Double getTufilt() {
        return tufilt;
    }

    public void setTufilt(Double _value_) {
        tufilt = _value_;
    }

    private static Object getTufilt(BaseClass _this_) {
        return ((WindContCurrLimIEC) _this_).getTufilt();
    }

    private static void setTufilt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContCurrLimIEC) _this_).setTufilt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContCurrLimIEC) _this_).setTufilt(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindContCurrLimIEC", attrName));
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
                "WindContCurrLimIEC", attrName, value));
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
            map.put("WindDynamicsLookupTable", new AttrDetails("WindContCurrLimIEC.WindDynamicsLookupTable", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindContCurrLimIEC::getWindDynamicsLookupTable, WindContCurrLimIEC::setWindDynamicsLookupTable));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindTurbineType3or4IEC", new AttrDetails("WindContCurrLimIEC.WindTurbineType3or4IEC", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindContCurrLimIEC::getWindTurbineType3or4IEC, WindContCurrLimIEC::setWindTurbineType3or4IEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("imax", new AttrDetails("WindContCurrLimIEC.imax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContCurrLimIEC::getImax, WindContCurrLimIEC::setImax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("imaxdip", new AttrDetails("WindContCurrLimIEC.imaxdip", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContCurrLimIEC::getImaxdip, WindContCurrLimIEC::setImaxdip));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mdfslim", new AttrDetails("WindContCurrLimIEC.mdfslim", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContCurrLimIEC::getMdfslim, WindContCurrLimIEC::setMdfslim));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mqpri", new AttrDetails("WindContCurrLimIEC.mqpri", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContCurrLimIEC::getMqpri, WindContCurrLimIEC::setMqpri));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tufilt", new AttrDetails("WindContCurrLimIEC.tufilt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindContCurrLimIEC::getTufilt, WindContCurrLimIEC::setTufilt));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindContCurrLimIEC(null).allAttrDetailsMap());
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
