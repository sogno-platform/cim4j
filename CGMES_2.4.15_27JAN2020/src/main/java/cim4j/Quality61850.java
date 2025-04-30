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
 * Quality flags in this class are as defined in IEC 61850, except for estimatorReplaced, which has been included in this class for convenience.
 */
@SuppressWarnings("unused")
public class Quality61850 extends BaseClass {

    private static final Logging LOG = Logging.getLogger(Quality61850.class);

    /**
     * Default constructor.
     */
    public Quality61850() {
        setCimType("Quality61850");
    }

    /**
     * Measurement value may be incorrect due to a reference being out of calibration.
     */
    private Boolean badReference; // Boolean

    public Boolean getBadReference() {
        return badReference;
    }

    public void setBadReference(Boolean _value_) {
        badReference = _value_;
    }

    public void setBadReference(String _value_) {
        badReference = getBooleanFromString(_value_);
    }

    public String badReferenceToString() {
        return badReference != null ? badReference.toString() : null;
    }

    /**
     * Value has been replaced by State Estimator. estimatorReplaced is not an IEC61850 quality bit but has been put in this class for convenience.
     */
    private Boolean estimatorReplaced; // Boolean

    public Boolean getEstimatorReplaced() {
        return estimatorReplaced;
    }

    public void setEstimatorReplaced(Boolean _value_) {
        estimatorReplaced = _value_;
    }

    public void setEstimatorReplaced(String _value_) {
        estimatorReplaced = getBooleanFromString(_value_);
    }

    public String estimatorReplacedToString() {
        return estimatorReplaced != null ? estimatorReplaced.toString() : null;
    }

    /**
     * This identifier indicates that a supervision function has detected an internal or external failure, e.g. communication failure.
     */
    private Boolean failure; // Boolean

    public Boolean getFailure() {
        return failure;
    }

    public void setFailure(Boolean _value_) {
        failure = _value_;
    }

    public void setFailure(String _value_) {
        failure = getBooleanFromString(_value_);
    }

    public String failureToString() {
        return failure != null ? failure.toString() : null;
    }

    /**
     * Measurement value is old and possibly invalid, as it has not been successfully updated during a specified time interval.
     */
    private Boolean oldData; // Boolean

    public Boolean getOldData() {
        return oldData;
    }

    public void setOldData(Boolean _value_) {
        oldData = _value_;
    }

    public void setOldData(String _value_) {
        oldData = getBooleanFromString(_value_);
    }

    public String oldDataToString() {
        return oldData != null ? oldData.toString() : null;
    }

    /**
     * Measurement value is blocked and hence unavailable for transmission.
     */
    private Boolean operatorBlocked; // Boolean

    public Boolean getOperatorBlocked() {
        return operatorBlocked;
    }

    public void setOperatorBlocked(Boolean _value_) {
        operatorBlocked = _value_;
    }

    public void setOperatorBlocked(String _value_) {
        operatorBlocked = getBooleanFromString(_value_);
    }

    public String operatorBlockedToString() {
        return operatorBlocked != null ? operatorBlocked.toString() : null;
    }

    /**
     * To prevent some overload of the communication it is sensible to detect and suppress oscillating (fast changing) binary inputs. If a signal changes in a defined time (tosc) twice in the same direction (from 0 to 1 or from 1 to 0) then oscillation is detected and the detail quality identifier `oscillatory` is set. If it is detected a configured numbers of transient changes could be passed by. In this time the validity status `questionable` is set. If after this defined numbers of changes the signal is still in the oscillating state the value shall be set either to the opposite state of the previous stable value or to a defined default value. In this case the validity status `questionable` is reset and `invalid` is set as long as the signal is oscillating. If it is configured such that no transient changes should be passed by then the validity status `invalid` is set immediately in addition to the detail quality identifier `oscillatory` (used for status information only).
     */
    private Boolean oscillatory; // Boolean

    public Boolean getOscillatory() {
        return oscillatory;
    }

    public void setOscillatory(Boolean _value_) {
        oscillatory = _value_;
    }

    public void setOscillatory(String _value_) {
        oscillatory = getBooleanFromString(_value_);
    }

    public String oscillatoryToString() {
        return oscillatory != null ? oscillatory.toString() : null;
    }

    /**
     * Measurement value is beyond a predefined range of value.
     */
    private Boolean outOfRange; // Boolean

    public Boolean getOutOfRange() {
        return outOfRange;
    }

    public void setOutOfRange(Boolean _value_) {
        outOfRange = _value_;
    }

    public void setOutOfRange(String _value_) {
        outOfRange = getBooleanFromString(_value_);
    }

    public String outOfRangeToString() {
        return outOfRange != null ? outOfRange.toString() : null;
    }

    /**
     * Measurement value is beyond the capability of being  represented properly. For example, a counter value overflows from maximum count back to a value of zero.
     */
    private Boolean overFlow; // Boolean

    public Boolean getOverFlow() {
        return overFlow;
    }

    public void setOverFlow(Boolean _value_) {
        overFlow = _value_;
    }

    public void setOverFlow(String _value_) {
        overFlow = getBooleanFromString(_value_);
    }

    public String overFlowToString() {
        return overFlow != null ? overFlow.toString() : null;
    }

    /**
     * Source gives information related to the origin of a value. The value may be acquired from the process, defaulted or substituted.
     */
    private String source; // Source

    public String getSource() {
        return source;
    }

    public void setSource(String _value_) {
        source = _value_;
    }

    public String sourceToString() {
        return source;
    }

    /**
     * A correlation function has detected that the value is not consitent with other values. Typically set by a network State Estimator.
     */
    private Boolean suspect; // Boolean

    public Boolean getSuspect() {
        return suspect;
    }

    public void setSuspect(Boolean _value_) {
        suspect = _value_;
    }

    public void setSuspect(String _value_) {
        suspect = getBooleanFromString(_value_);
    }

    public String suspectToString() {
        return suspect != null ? suspect.toString() : null;
    }

    /**
     * Measurement value is transmitted for test purposes.
     */
    private Boolean test; // Boolean

    public Boolean getTest() {
        return test;
    }

    public void setTest(Boolean _value_) {
        test = _value_;
    }

    public void setTest(String _value_) {
        test = getBooleanFromString(_value_);
    }

    public String testToString() {
        return test != null ? test.toString() : null;
    }

    /**
     * Validity of the measurement value.
     */
    private String validity; // Validity

    public String getValidity() {
        return validity;
    }

    public void setValidity(String _value_) {
        validity = _value_;
    }

    public String validityToString() {
        return validity;
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
        return getAttribute("Quality61850", attrName);
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
        setAttribute("Quality61850", attrName, objectValue);
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
        setAttribute("Quality61850", attrName, stringValue);
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
            profiles.add(CGMESProfile.EQ);
            map.put("badReference", new AttrDetails("Quality61850.badReference", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("estimatorReplaced", new AttrDetails("Quality61850.estimatorReplaced", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("failure", new AttrDetails("Quality61850.failure", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("oldData", new AttrDetails("Quality61850.oldData", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("operatorBlocked", new AttrDetails("Quality61850.operatorBlocked", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("oscillatory", new AttrDetails("Quality61850.oscillatory", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("outOfRange", new AttrDetails("Quality61850.outOfRange", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("overFlow", new AttrDetails("Quality61850.overFlow", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("source", new AttrDetails("Quality61850.source", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("suspect", new AttrDetails("Quality61850.suspect", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("test", new AttrDetails("Quality61850.test", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("validity", new AttrDetails("Quality61850.validity", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new Quality61850().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("badReference", new GetterSetter(this::badReferenceToString, null, this::setBadReference));
        map.put("estimatorReplaced", new GetterSetter(this::estimatorReplacedToString, null, this::setEstimatorReplaced));
        map.put("failure", new GetterSetter(this::failureToString, null, this::setFailure));
        map.put("oldData", new GetterSetter(this::oldDataToString, null, this::setOldData));
        map.put("operatorBlocked", new GetterSetter(this::operatorBlockedToString, null, this::setOperatorBlocked));
        map.put("oscillatory", new GetterSetter(this::oscillatoryToString, null, this::setOscillatory));
        map.put("outOfRange", new GetterSetter(this::outOfRangeToString, null, this::setOutOfRange));
        map.put("overFlow", new GetterSetter(this::overFlowToString, null, this::setOverFlow));
        map.put("source", new GetterSetter(this::sourceToString, null, this::setSource));
        map.put("suspect", new GetterSetter(this::suspectToString, null, this::setSuspect));
        map.put("test", new GetterSetter(this::testToString, null, this::setTest));
        map.put("validity", new GetterSetter(this::validityToString, null, this::setValidity));
        return map;
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
