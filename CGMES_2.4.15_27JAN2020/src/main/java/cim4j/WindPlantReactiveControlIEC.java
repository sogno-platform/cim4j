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
     * Default constructor.
     */
    public WindPlantReactiveControlIEC() {
        setCimType("WindPlantReactiveControlIEC");
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

    public void setWindPlantIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindPlantIEC)) {
            throw new IllegalArgumentException("Object is not WindPlantIEC");
        }
        if (WindPlantIEC != _object_) {
            WindPlantIEC = (WindPlantIEC) _object_;
            WindPlantIEC.setWindPlantReactiveControlIEC(this);
        }
    }

    public String WindPlantIECToString() {
        return WindPlantIEC != null ? WindPlantIEC.getRdfid() : null;
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

    public void setKiwpx(String _value_) {
        kiwpx = getDoubleFromString(_value_);
    }

    public String kiwpxToString() {
        return kiwpx != null ? kiwpx.toString() : null;
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

    public void setKpwpx(String _value_) {
        kpwpx = getDoubleFromString(_value_);
    }

    public String kpwpxToString() {
        return kpwpx != null ? kpwpx.toString() : null;
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

    public void setKwpqu(String _value_) {
        kwpqu = getDoubleFromString(_value_);
    }

    public String kwpquToString() {
        return kwpqu != null ? kwpqu.toString() : null;
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

    public void setMwppf(String _value_) {
        mwppf = getBooleanFromString(_value_);
    }

    public String mwppfToString() {
        return mwppf != null ? mwppf.toString() : null;
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

    public void setMwpu(String _value_) {
        mwpu = getBooleanFromString(_value_);
    }

    public String mwpuToString() {
        return mwpu != null ? mwpu.toString() : null;
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

    public void setTwppfilt(String _value_) {
        twppfilt = getDoubleFromString(_value_);
    }

    public String twppfiltToString() {
        return twppfilt != null ? twppfilt.toString() : null;
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

    public void setTwpqfilt(String _value_) {
        twpqfilt = getDoubleFromString(_value_);
    }

    public String twpqfiltToString() {
        return twpqfilt != null ? twpqfilt.toString() : null;
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

    public void setTwpufilt(String _value_) {
        twpufilt = getDoubleFromString(_value_);
    }

    public String twpufiltToString() {
        return twpufilt != null ? twpufilt.toString() : null;
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

    public void setTxft(String _value_) {
        txft = getDoubleFromString(_value_);
    }

    public String txftToString() {
        return txft != null ? txft.toString() : null;
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

    public void setTxfv(String _value_) {
        txfv = getDoubleFromString(_value_);
    }

    public String txfvToString() {
        return txfv != null ? txfv.toString() : null;
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

    public void setUwpqdip(String _value_) {
        uwpqdip = getDoubleFromString(_value_);
    }

    public String uwpqdipToString() {
        return uwpqdip != null ? uwpqdip.toString() : null;
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

    public void setXrefmax(String _value_) {
        xrefmax = getDoubleFromString(_value_);
    }

    public String xrefmaxToString() {
        return xrefmax != null ? xrefmax.toString() : null;
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

    public void setXrefmin(String _value_) {
        xrefmin = getDoubleFromString(_value_);
    }

    public String xrefminToString() {
        return xrefmin != null ? xrefmin.toString() : null;
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
        return getAttribute("WindPlantReactiveControlIEC", attrName);
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
        setAttribute("WindPlantReactiveControlIEC", attrName, objectValue);
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
        setAttribute("WindPlantReactiveControlIEC", attrName, stringValue);
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
            map.put("WindPlantIEC", new AttrDetails("WindPlantReactiveControlIEC.WindPlantIEC", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiwpx", new AttrDetails("WindPlantReactiveControlIEC.kiwpx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpwpx", new AttrDetails("WindPlantReactiveControlIEC.kpwpx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kwpqu", new AttrDetails("WindPlantReactiveControlIEC.kwpqu", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwppf", new AttrDetails("WindPlantReactiveControlIEC.mwppf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwpu", new AttrDetails("WindPlantReactiveControlIEC.mwpu", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twppfilt", new AttrDetails("WindPlantReactiveControlIEC.twppfilt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twpqfilt", new AttrDetails("WindPlantReactiveControlIEC.twpqfilt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twpufilt", new AttrDetails("WindPlantReactiveControlIEC.twpufilt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("txft", new AttrDetails("WindPlantReactiveControlIEC.txft", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("txfv", new AttrDetails("WindPlantReactiveControlIEC.txfv", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uwpqdip", new AttrDetails("WindPlantReactiveControlIEC.uwpqdip", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xrefmax", new AttrDetails("WindPlantReactiveControlIEC.xrefmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xrefmin", new AttrDetails("WindPlantReactiveControlIEC.xrefmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindPlantReactiveControlIEC().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("WindPlantIEC", new GetterSetter(this::WindPlantIECToString, this::setWindPlantIEC, null));
        map.put("kiwpx", new GetterSetter(this::kiwpxToString, null, this::setKiwpx));
        map.put("kpwpx", new GetterSetter(this::kpwpxToString, null, this::setKpwpx));
        map.put("kwpqu", new GetterSetter(this::kwpquToString, null, this::setKwpqu));
        map.put("mwppf", new GetterSetter(this::mwppfToString, null, this::setMwppf));
        map.put("mwpu", new GetterSetter(this::mwpuToString, null, this::setMwpu));
        map.put("twppfilt", new GetterSetter(this::twppfiltToString, null, this::setTwppfilt));
        map.put("twpqfilt", new GetterSetter(this::twpqfiltToString, null, this::setTwpqfilt));
        map.put("twpufilt", new GetterSetter(this::twpufiltToString, null, this::setTwpufilt));
        map.put("txft", new GetterSetter(this::txftToString, null, this::setTxft));
        map.put("txfv", new GetterSetter(this::txfvToString, null, this::setTxfv));
        map.put("uwpqdip", new GetterSetter(this::uwpqdipToString, null, this::setUwpqdip));
        map.put("xrefmax", new GetterSetter(this::xrefmaxToString, null, this::setXrefmax));
        map.put("xrefmin", new GetterSetter(this::xrefminToString, null, this::setXrefmin));
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
