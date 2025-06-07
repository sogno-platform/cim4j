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
 * Control is used for supervisory/device control. It represents control outputs that are used to change the state in a process, e.g. close or open breaker, a set point value or a raise lower command.
 */
@SuppressWarnings("unused")
public class Control extends IOPoint {

    private static final Logging LOG = Logging.getLogger(Control.class);

    /**
     * Constructor.
     */
    public Control(String rdfid) {
        super("Control", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected Control(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Regulating device governed by this control output.
     */
    private PowerSystemResource PowerSystemResource; // ManyToOne

    public PowerSystemResource getPowerSystemResource() {
        return PowerSystemResource;
    }

    public void setPowerSystemResource(PowerSystemResource _object_) {
        if (PowerSystemResource != _object_) {
            PowerSystemResource = _object_;
            PowerSystemResource.setControls(this);
        }
    }

    private static Object getPowerSystemResource(BaseClass _this_) {
        return ((Control) _this_).getPowerSystemResource();
    }

    private static void setPowerSystemResource(BaseClass _this_, Object _value_) {
        if (_value_ instanceof PowerSystemResource) {
            ((Control) _this_).setPowerSystemResource((PowerSystemResource) _value_);
        } else {
            throw new IllegalArgumentException("Object is not PowerSystemResource");
        }
    }

    /**
     * Specifies the type of Control. For example, this specifies if the Control represents BreakerOpen, BreakerClose, GeneratorVoltageSetPoint, GeneratorRaise, GeneratorLower, etc.
     */
    private String controlType; // String

    public String getControlType() {
        return controlType;
    }

    public void setControlType(String _value_) {
        controlType = _value_;
    }

    private static Object getControlType(BaseClass _this_) {
        return ((Control) _this_).getControlType();
    }

    private static void setControlType(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Control) _this_).setControlType((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Indicates that a client is currently sending control commands that has not completed.
     */
    private Boolean operationInProgress; // Boolean

    public Boolean getOperationInProgress() {
        return operationInProgress;
    }

    public void setOperationInProgress(Boolean _value_) {
        operationInProgress = _value_;
    }

    private static Object getOperationInProgress(BaseClass _this_) {
        return ((Control) _this_).getOperationInProgress();
    }

    private static void setOperationInProgress(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((Control) _this_).setOperationInProgress((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((Control) _this_).setOperationInProgress(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * The last time a control output was sent.
     */
    private String timeStamp; // DateTime

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String _value_) {
        timeStamp = _value_;
    }

    private static Object getTimeStamp(BaseClass _this_) {
        return ((Control) _this_).getTimeStamp();
    }

    private static void setTimeStamp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Control) _this_).setTimeStamp((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * The unit multiplier of the controlled quantity.
     */
    private String unitMultiplier; // UnitMultiplier

    public String getUnitMultiplier() {
        return unitMultiplier;
    }

    public void setUnitMultiplier(String _value_) {
        unitMultiplier = _value_;
    }

    private static Object getUnitMultiplier(BaseClass _this_) {
        return ((Control) _this_).getUnitMultiplier();
    }

    private static void setUnitMultiplier(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Control) _this_).setUnitMultiplier((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * The unit of measure of the controlled quantity.
     */
    private String unitSymbol; // UnitSymbol

    public String getUnitSymbol() {
        return unitSymbol;
    }

    public void setUnitSymbol(String _value_) {
        unitSymbol = _value_;
    }

    private static Object getUnitSymbol(BaseClass _this_) {
        return ((Control) _this_).getUnitSymbol();
    }

    private static void setUnitSymbol(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((Control) _this_).setUnitSymbol((String) _value_);
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "Control", attrName));
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
                "Control", attrName, value));
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
            map.put("PowerSystemResource", new AttrDetails("Control.PowerSystemResource", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, Control::getPowerSystemResource, Control::setPowerSystemResource));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("controlType", new AttrDetails("Control.controlType", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Control::getControlType, Control::setControlType));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("operationInProgress", new AttrDetails("Control.operationInProgress", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Control::getOperationInProgress, Control::setOperationInProgress));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("timeStamp", new AttrDetails("Control.timeStamp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, Control::getTimeStamp, Control::setTimeStamp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("unitMultiplier", new AttrDetails("Control.unitMultiplier", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, Control::getUnitMultiplier, Control::setUnitMultiplier));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("unitSymbol", new AttrDetails("Control.unitSymbol", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, Control::getUnitSymbol, Control::setUnitSymbol));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new Control(null).allAttrDetailsMap());
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
