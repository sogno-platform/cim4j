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
 * Simplified plant voltage and reactive power control model for use with type 3 and type 4 wind turbine models.  Reference: IEC Standard 61400-27-1 Annex E.
 */
@SuppressWarnings("unused")
public class WindPlantReactiveControlIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindPlantReactiveControlIEC.class);

    /**
     * Constructor.
     */
    public WindPlantReactiveControlIEC(String rdfid) {
        super("WindPlantReactiveControlIEC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindPlantReactiveControlIEC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Wind plant model with which this wind reactive control is associated.
     *
     * NOT USED
     */
    private WindPlantIEC WindPlantIEC; // OneToOne

    public WindPlantIEC getWindPlantIEC() {
        return WindPlantIEC;
    }

    public void setWindPlantIEC(WindPlantIEC _object_) {
        if (WindPlantIEC != _object_) {
            WindPlantIEC = _object_;
            WindPlantIEC.setWindPlantReactiveControlIEC(this);
        }
    }

    private static Object getWindPlantIEC(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getWindPlantIEC();
    }

    private static void setWindPlantIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindPlantIEC) {
            ((WindPlantReactiveControlIEC) _this_).setWindPlantIEC((WindPlantIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindPlantIEC");
        }
    }

    /**
     * Plant Q controller integral gain (). It is type dependent parameter.
     */
    private Double kiwpx; // Simple_Float

    public Double getKiwpx() {
        return kiwpx;
    }

    public void setKiwpx(Double _value_) {
        kiwpx = _value_;
    }

    private static Object getKiwpx(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getKiwpx();
    }

    private static void setKiwpx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setKiwpx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setKiwpx(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Plant Q controller proportional gain (). It is type dependent parameter.
     */
    private Double kpwpx; // Simple_Float

    public Double getKpwpx() {
        return kpwpx;
    }

    public void setKpwpx(Double _value_) {
        kpwpx = _value_;
    }

    private static Object getKpwpx(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getKpwpx();
    }

    private static void setKpwpx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setKpwpx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setKpwpx(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Plant voltage control droop (). It is project dependent parameter.
     */
    private Double kwpqu; // PU

    public Double getKwpqu() {
        return kwpqu;
    }

    public void setKwpqu(Double _value_) {
        kwpqu = _value_;
    }

    private static Object getKwpqu(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getKwpqu();
    }

    private static void setKwpqu(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setKwpqu((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setKwpqu(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Power factor control modes selector (). Used only if mwpu is set to false. true = 1: power factor control false = 0: reactive power control. It is project dependent parameter.
     */
    private Boolean mwppf; // Boolean

    public Boolean getMwppf() {
        return mwppf;
    }

    public void setMwppf(Boolean _value_) {
        mwppf = _value_;
    }

    private static Object getMwppf(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getMwppf();
    }

    private static void setMwppf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((WindPlantReactiveControlIEC) _this_).setMwppf((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setMwppf(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Reactive power control modes selector (). true = 1: voltage control false = 0: reactive power control. It is project dependent parameter.
     */
    private Boolean mwpu; // Boolean

    public Boolean getMwpu() {
        return mwpu;
    }

    public void setMwpu(Boolean _value_) {
        mwpu = _value_;
    }

    private static Object getMwpu(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getMwpu();
    }

    private static void setMwpu(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((WindPlantReactiveControlIEC) _this_).setMwpu((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setMwpu(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
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
        return ((WindPlantReactiveControlIEC) _this_).getTwppfilt();
    }

    private static void setTwppfilt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setTwppfilt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setTwppfilt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter time constant for reactive power measurement (). It is type dependent parameter.
     */
    private Double twpqfilt; // Seconds

    public Double getTwpqfilt() {
        return twpqfilt;
    }

    public void setTwpqfilt(Double _value_) {
        twpqfilt = _value_;
    }

    private static Object getTwpqfilt(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getTwpqfilt();
    }

    private static void setTwpqfilt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setTwpqfilt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setTwpqfilt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter time constant for voltage measurement (). It is type dependent parameter.
     */
    private Double twpufilt; // Seconds

    public Double getTwpufilt() {
        return twpufilt;
    }

    public void setTwpufilt(Double _value_) {
        twpufilt = _value_;
    }

    private static Object getTwpufilt(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getTwpufilt();
    }

    private static void setTwpufilt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setTwpufilt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setTwpufilt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead time constant in reference value transfer function (). It is type dependent parameter.
     */
    private Double txft; // Seconds

    public Double getTxft() {
        return txft;
    }

    public void setTxft(Double _value_) {
        txft = _value_;
    }

    private static Object getTxft(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getTxft();
    }

    private static void setTxft(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setTxft((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setTxft(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lag time constant in reference value transfer function (). It is type dependent parameter.
     */
    private Double txfv; // Seconds

    public Double getTxfv() {
        return txfv;
    }

    public void setTxfv(Double _value_) {
        txfv = _value_;
    }

    private static Object getTxfv(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getTxfv();
    }

    private static void setTxfv(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setTxfv((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setTxfv(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage threshold for LVRT detection in q control (). It is type dependent parameter.
     */
    private Double uwpqdip; // PU

    public Double getUwpqdip() {
        return uwpqdip;
    }

    public void setUwpqdip(Double _value_) {
        uwpqdip = _value_;
    }

    private static Object getUwpqdip(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getUwpqdip();
    }

    private static void setUwpqdip(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setUwpqdip((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setUwpqdip(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum  ( or delta ) request from the plant controller (). It is project dependent parameter.
     */
    private Double xrefmax; // PU

    public Double getXrefmax() {
        return xrefmax;
    }

    public void setXrefmax(Double _value_) {
        xrefmax = _value_;
    }

    private static Object getXrefmax(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getXrefmax();
    }

    private static void setXrefmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setXrefmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setXrefmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum  ( or delta) request from the plant controller (). It is project dependent parameter.
     */
    private Double xrefmin; // PU

    public Double getXrefmin() {
        return xrefmin;
    }

    public void setXrefmin(Double _value_) {
        xrefmin = _value_;
    }

    private static Object getXrefmin(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getXrefmin();
    }

    private static void setXrefmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setXrefmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setXrefmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindPlantReactiveControlIEC", attrName));
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
                "WindPlantReactiveControlIEC", attrName, value));
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
            map.put("WindPlantIEC", new AttrDetails("WindPlantReactiveControlIEC.WindPlantIEC", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindPlantReactiveControlIEC::getWindPlantIEC, WindPlantReactiveControlIEC::setWindPlantIEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiwpx", new AttrDetails("WindPlantReactiveControlIEC.kiwpx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantReactiveControlIEC::getKiwpx, WindPlantReactiveControlIEC::setKiwpx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpwpx", new AttrDetails("WindPlantReactiveControlIEC.kpwpx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantReactiveControlIEC::getKpwpx, WindPlantReactiveControlIEC::setKpwpx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kwpqu", new AttrDetails("WindPlantReactiveControlIEC.kwpqu", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantReactiveControlIEC::getKwpqu, WindPlantReactiveControlIEC::setKwpqu));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwppf", new AttrDetails("WindPlantReactiveControlIEC.mwppf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantReactiveControlIEC::getMwppf, WindPlantReactiveControlIEC::setMwppf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwpu", new AttrDetails("WindPlantReactiveControlIEC.mwpu", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantReactiveControlIEC::getMwpu, WindPlantReactiveControlIEC::setMwpu));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twppfilt", new AttrDetails("WindPlantReactiveControlIEC.twppfilt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantReactiveControlIEC::getTwppfilt, WindPlantReactiveControlIEC::setTwppfilt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twpqfilt", new AttrDetails("WindPlantReactiveControlIEC.twpqfilt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantReactiveControlIEC::getTwpqfilt, WindPlantReactiveControlIEC::setTwpqfilt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twpufilt", new AttrDetails("WindPlantReactiveControlIEC.twpufilt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantReactiveControlIEC::getTwpufilt, WindPlantReactiveControlIEC::setTwpufilt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("txft", new AttrDetails("WindPlantReactiveControlIEC.txft", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantReactiveControlIEC::getTxft, WindPlantReactiveControlIEC::setTxft));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("txfv", new AttrDetails("WindPlantReactiveControlIEC.txfv", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantReactiveControlIEC::getTxfv, WindPlantReactiveControlIEC::setTxfv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uwpqdip", new AttrDetails("WindPlantReactiveControlIEC.uwpqdip", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantReactiveControlIEC::getUwpqdip, WindPlantReactiveControlIEC::setUwpqdip));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xrefmax", new AttrDetails("WindPlantReactiveControlIEC.xrefmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantReactiveControlIEC::getXrefmax, WindPlantReactiveControlIEC::setXrefmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xrefmin", new AttrDetails("WindPlantReactiveControlIEC.xrefmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantReactiveControlIEC::getXrefmin, WindPlantReactiveControlIEC::setXrefmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindPlantReactiveControlIEC(null).allAttrDetailsMap());
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
