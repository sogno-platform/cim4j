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
     * Constructor.
     */
    public Quality61850(String rdfid) {
        super("Quality61850", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected Quality61850(String cimType, String rdfid) {
        super(cimType, rdfid);
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

    private static Object getBadReference(BaseClass _this_) {
        return ((Quality61850) _this_).getBadReference();
    }

    private static void setBadReference(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Quality61850) _this_).setBadReference((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Quality61850) _this_).setBadReference(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
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

    private static Object getEstimatorReplaced(BaseClass _this_) {
        return ((Quality61850) _this_).getEstimatorReplaced();
    }

    private static void setEstimatorReplaced(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Quality61850) _this_).setEstimatorReplaced((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Quality61850) _this_).setEstimatorReplaced(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
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

    private static Object getFailure(BaseClass _this_) {
        return ((Quality61850) _this_).getFailure();
    }

    private static void setFailure(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Quality61850) _this_).setFailure((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Quality61850) _this_).setFailure(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
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

    private static Object getOldData(BaseClass _this_) {
        return ((Quality61850) _this_).getOldData();
    }

    private static void setOldData(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Quality61850) _this_).setOldData((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Quality61850) _this_).setOldData(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
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

    private static Object getOperatorBlocked(BaseClass _this_) {
        return ((Quality61850) _this_).getOperatorBlocked();
    }

    private static void setOperatorBlocked(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Quality61850) _this_).setOperatorBlocked((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Quality61850) _this_).setOperatorBlocked(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * To prevent some overload of the communication it is sensible to detect and suppress oscillating (fast changing) binary inputs. If a signal changes in a defined time twice in the same direction (from 0 to 1 or from 1 to 0) then oscillation is detected and the detail quality identifier `oscillatory` is set. If it is detected a configured numbers of transient changes could be passed by. In this time the validity status `questionable` is set. If after this defined numbers of changes the signal is still in the oscillating state the value shall be set either to the opposite state of the previous stable value or to a defined default value. In this case the validity status `questionable` is reset and `invalid` is set as long as the signal is oscillating. If it is configured such that no transient changes should be passed by then the validity status `invalid` is set immediately in addition to the detail quality identifier `oscillatory` (used for status information only).
     */
    private Boolean oscillatory; // Boolean

    public Boolean getOscillatory() {
        return oscillatory;
    }

    public void setOscillatory(Boolean _value_) {
        oscillatory = _value_;
    }

    private static Object getOscillatory(BaseClass _this_) {
        return ((Quality61850) _this_).getOscillatory();
    }

    private static void setOscillatory(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Quality61850) _this_).setOscillatory((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Quality61850) _this_).setOscillatory(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
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

    private static Object getOutOfRange(BaseClass _this_) {
        return ((Quality61850) _this_).getOutOfRange();
    }

    private static void setOutOfRange(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Quality61850) _this_).setOutOfRange((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Quality61850) _this_).setOutOfRange(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
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

    private static Object getOverFlow(BaseClass _this_) {
        return ((Quality61850) _this_).getOverFlow();
    }

    private static void setOverFlow(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Quality61850) _this_).setOverFlow((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Quality61850) _this_).setOverFlow(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
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

    private static Object getSource(BaseClass _this_) {
        return ((Quality61850) _this_).getSource();
    }

    private static void setSource(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Quality61850) _this_).setSource((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * A correlation function has detected that the value is not consistent with other values. Typically set by a network State Estimator.
     */
    private Boolean suspect; // Boolean

    public Boolean getSuspect() {
        return suspect;
    }

    public void setSuspect(Boolean _value_) {
        suspect = _value_;
    }

    private static Object getSuspect(BaseClass _this_) {
        return ((Quality61850) _this_).getSuspect();
    }

    private static void setSuspect(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Quality61850) _this_).setSuspect((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Quality61850) _this_).setSuspect(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
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

    private static Object getTest(BaseClass _this_) {
        return ((Quality61850) _this_).getTest();
    }

    private static void setTest(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Quality61850) _this_).setTest((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Quality61850) _this_).setTest(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
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

    private static Object getValidity(BaseClass _this_) {
        return ((Quality61850) _this_).getValidity();
    }

    private static void setValidity(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Quality61850) _this_).setValidity((String) _value_);
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "Quality61850", attrName));
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
                "Quality61850", attrName, value));
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
            profiles.add(CGMESProfile.OP);
            map.put("badReference", new AttrDetails("Quality61850.badReference", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Quality61850::getBadReference, Quality61850::setBadReference));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("estimatorReplaced", new AttrDetails("Quality61850.estimatorReplaced", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Quality61850::getEstimatorReplaced, Quality61850::setEstimatorReplaced));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("failure", new AttrDetails("Quality61850.failure", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Quality61850::getFailure, Quality61850::setFailure));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("oldData", new AttrDetails("Quality61850.oldData", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Quality61850::getOldData, Quality61850::setOldData));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("operatorBlocked", new AttrDetails("Quality61850.operatorBlocked", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Quality61850::getOperatorBlocked, Quality61850::setOperatorBlocked));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("oscillatory", new AttrDetails("Quality61850.oscillatory", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Quality61850::getOscillatory, Quality61850::setOscillatory));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("outOfRange", new AttrDetails("Quality61850.outOfRange", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Quality61850::getOutOfRange, Quality61850::setOutOfRange));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("overFlow", new AttrDetails("Quality61850.overFlow", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Quality61850::getOverFlow, Quality61850::setOverFlow));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("source", new AttrDetails("Quality61850.source", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, Quality61850::getSource, Quality61850::setSource));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("suspect", new AttrDetails("Quality61850.suspect", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Quality61850::getSuspect, Quality61850::setSuspect));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("test", new AttrDetails("Quality61850.test", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Quality61850::getTest, Quality61850::setTest));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("validity", new AttrDetails("Quality61850.validity", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, Quality61850::getValidity, Quality61850::setValidity));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new Quality61850(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.OP);
        POSSIBLE_PROFILES = Collections.unmodifiableSet(profiles);
    }

    private static final CGMESProfile RECOMMENDED_PROFILE = CGMESProfile.OP;

    private static final Set<CGMESProfile> POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>(POSSIBLE_PROFILES);
        for (var attrDetails : ATTR_DETAILS_MAP.values()) {
            profiles.addAll(attrDetails.profiles);
        }
        POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES = Collections.unmodifiableSet(profiles);
    }
}
