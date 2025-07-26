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
 * Frequency and active power controller model.  Reference: IEC Standard 61400-27-1 Annex E.
 */
@SuppressWarnings("unused")
public class WindPlantFreqPcontrolIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindPlantFreqPcontrolIEC.class);

    /**
     * Constructor.
     */
    public WindPlantFreqPcontrolIEC(String rdfid) {
        super("WindPlantFreqPcontrolIEC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindPlantFreqPcontrolIEC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The frequency and active power wind plant control model with which this wind dynamics lookup table is associated.
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
            _object_.setWindPlantFreqPcontrolIEC(this);
            WindDynamicsLookupTableIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getWindDynamicsLookupTable(BaseClass _this_) {
        var objs = ((WindPlantFreqPcontrolIEC) _this_).getWindDynamicsLookupTable();
        var ids = ((WindPlantFreqPcontrolIEC) _this_).WindDynamicsLookupTableIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setWindDynamicsLookupTable(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindPlantFreqPcontrolIEC) _this_).WindDynamicsLookupTableIdSet.add((String) _value_);
        } else if (_value_ instanceof WindDynamicsLookupTable) {
            ((WindPlantFreqPcontrolIEC) _this_).setWindDynamicsLookupTable((WindDynamicsLookupTable) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindDynamicsLookupTable");
        }
    }

    /**
     * Wind plant model with which this wind plant frequency and active power control is associated.
     *
     * NOT USED
     */
    private WindPlantIEC WindPlantIEC; // OneToOne

    private String WindPlantIECId;

    public WindPlantIEC getWindPlantIEC() {
        return WindPlantIEC;
    }

    public void setWindPlantIEC(WindPlantIEC _object_) {
        if (WindPlantIEC != _object_) {
            WindPlantIEC = _object_;
            _object_.setWindPlantFreqPcontrolIEC(this);
            WindPlantIECId = _object_.getRdfid();
        }
    }

    private static Object getWindPlantIEC(BaseClass _this_) {
        var obj = ((WindPlantFreqPcontrolIEC) _this_).getWindPlantIEC();
        var id = ((WindPlantFreqPcontrolIEC) _this_).WindPlantIECId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setWindPlantIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindPlantFreqPcontrolIEC) _this_).WindPlantIECId = (String) _value_;
        } else if (_value_ instanceof WindPlantIEC) {
            ((WindPlantFreqPcontrolIEC) _this_).setWindPlantIEC((WindPlantIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindPlantIEC");
        }
    }

    /**
     * Maximum ramp rate of  request from the plant controller to the wind turbines (). It is project dependent parameter.
     */
    private Double dprefmax; // PU

    public Double getDprefmax() {
        return dprefmax;
    }

    public void setDprefmax(Double _value_) {
        dprefmax = _value_;
    }

    private static Object getDprefmax(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).getDprefmax();
    }

    private static void setDprefmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantFreqPcontrolIEC) _this_).setDprefmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantFreqPcontrolIEC) _this_).setDprefmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum (negative) ramp rate of  request from the plant controller to the wind turbines (). It is project dependent parameter.
     */
    private Double dprefmin; // PU

    public Double getDprefmin() {
        return dprefmin;
    }

    public void setDprefmin(Double _value_) {
        dprefmin = _value_;
    }

    private static Object getDprefmin(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).getDprefmin();
    }

    private static void setDprefmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantFreqPcontrolIEC) _this_).setDprefmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantFreqPcontrolIEC) _this_).setDprefmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Plant P controller integral gain (). It is type dependent parameter.
     */
    private Double kiwpp; // Simple_Float

    public Double getKiwpp() {
        return kiwpp;
    }

    public void setKiwpp(Double _value_) {
        kiwpp = _value_;
    }

    private static Object getKiwpp(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).getKiwpp();
    }

    private static void setKiwpp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantFreqPcontrolIEC) _this_).setKiwpp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantFreqPcontrolIEC) _this_).setKiwpp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Plant P controller proportional gain (). It is type dependent parameter.
     */
    private Double kpwpp; // Simple_Float

    public Double getKpwpp() {
        return kpwpp;
    }

    public void setKpwpp(Double _value_) {
        kpwpp = _value_;
    }

    private static Object getKpwpp(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).getKpwpp();
    }

    private static void setKpwpp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantFreqPcontrolIEC) _this_).setKpwpp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantFreqPcontrolIEC) _this_).setKpwpp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum  request from the plant controller to the wind turbines (). It is type dependent parameter.
     */
    private Double prefmax; // PU

    public Double getPrefmax() {
        return prefmax;
    }

    public void setPrefmax(Double _value_) {
        prefmax = _value_;
    }

    private static Object getPrefmax(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).getPrefmax();
    }

    private static void setPrefmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantFreqPcontrolIEC) _this_).setPrefmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantFreqPcontrolIEC) _this_).setPrefmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum  request from the plant controller to the wind turbines (). It is type dependent parameter.
     */
    private Double prefmin; // PU

    public Double getPrefmin() {
        return prefmin;
    }

    public void setPrefmin(Double _value_) {
        prefmin = _value_;
    }

    private static Object getPrefmin(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).getPrefmin();
    }

    private static void setPrefmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantFreqPcontrolIEC) _this_).setPrefmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantFreqPcontrolIEC) _this_).setPrefmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead time constant in reference value transfer function (). It is type dependent parameter.
     */
    private Double tpft; // Seconds

    public Double getTpft() {
        return tpft;
    }

    public void setTpft(Double _value_) {
        tpft = _value_;
    }

    private static Object getTpft(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).getTpft();
    }

    private static void setTpft(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantFreqPcontrolIEC) _this_).setTpft((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantFreqPcontrolIEC) _this_).setTpft(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lag time constant in reference value transfer function (). It is type dependent parameter.
     */
    private Double tpfv; // Seconds

    public Double getTpfv() {
        return tpfv;
    }

    public void setTpfv(Double _value_) {
        tpfv = _value_;
    }

    private static Object getTpfv(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).getTpfv();
    }

    private static void setTpfv(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantFreqPcontrolIEC) _this_).setTpfv((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantFreqPcontrolIEC) _this_).setTpfv(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter time constant for frequency measurement (). It is type dependent parameter.
     */
    private Double twpffilt; // Seconds

    public Double getTwpffilt() {
        return twpffilt;
    }

    public void setTwpffilt(Double _value_) {
        twpffilt = _value_;
    }

    private static Object getTwpffilt(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).getTwpffilt();
    }

    private static void setTwpffilt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantFreqPcontrolIEC) _this_).setTwpffilt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantFreqPcontrolIEC) _this_).setTwpffilt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter time constant for active power measurement (). It is type dependent parameter.
     */
    private Double twppfilt; // Seconds

    public Double getTwppfilt() {
        return twppfilt;
    }

    public void setTwppfilt(Double _value_) {
        twppfilt = _value_;
    }

    private static Object getTwppfilt(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).getTwppfilt();
    }

    private static void setTwppfilt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantFreqPcontrolIEC) _this_).setTwppfilt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantFreqPcontrolIEC) _this_).setTwppfilt(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindPlantFreqPcontrolIEC", attrName));
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
                "WindPlantFreqPcontrolIEC", attrName, value));
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
            map.put("WindDynamicsLookupTable", new AttrDetails("WindPlantFreqPcontrolIEC.WindDynamicsLookupTable", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindPlantFreqPcontrolIEC::getWindDynamicsLookupTable, WindPlantFreqPcontrolIEC::setWindDynamicsLookupTable));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindPlantIEC", new AttrDetails("WindPlantFreqPcontrolIEC.WindPlantIEC", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindPlantFreqPcontrolIEC::getWindPlantIEC, WindPlantFreqPcontrolIEC::setWindPlantIEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dprefmax", new AttrDetails("WindPlantFreqPcontrolIEC.dprefmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantFreqPcontrolIEC::getDprefmax, WindPlantFreqPcontrolIEC::setDprefmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dprefmin", new AttrDetails("WindPlantFreqPcontrolIEC.dprefmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantFreqPcontrolIEC::getDprefmin, WindPlantFreqPcontrolIEC::setDprefmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiwpp", new AttrDetails("WindPlantFreqPcontrolIEC.kiwpp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantFreqPcontrolIEC::getKiwpp, WindPlantFreqPcontrolIEC::setKiwpp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpwpp", new AttrDetails("WindPlantFreqPcontrolIEC.kpwpp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantFreqPcontrolIEC::getKpwpp, WindPlantFreqPcontrolIEC::setKpwpp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("prefmax", new AttrDetails("WindPlantFreqPcontrolIEC.prefmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantFreqPcontrolIEC::getPrefmax, WindPlantFreqPcontrolIEC::setPrefmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("prefmin", new AttrDetails("WindPlantFreqPcontrolIEC.prefmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantFreqPcontrolIEC::getPrefmin, WindPlantFreqPcontrolIEC::setPrefmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpft", new AttrDetails("WindPlantFreqPcontrolIEC.tpft", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantFreqPcontrolIEC::getTpft, WindPlantFreqPcontrolIEC::setTpft));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpfv", new AttrDetails("WindPlantFreqPcontrolIEC.tpfv", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantFreqPcontrolIEC::getTpfv, WindPlantFreqPcontrolIEC::setTpfv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twpffilt", new AttrDetails("WindPlantFreqPcontrolIEC.twpffilt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantFreqPcontrolIEC::getTwpffilt, WindPlantFreqPcontrolIEC::setTwpffilt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twppfilt", new AttrDetails("WindPlantFreqPcontrolIEC.twppfilt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantFreqPcontrolIEC::getTwppfilt, WindPlantFreqPcontrolIEC::setTwppfilt));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindPlantFreqPcontrolIEC(null).allAttrDetailsMap());
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
