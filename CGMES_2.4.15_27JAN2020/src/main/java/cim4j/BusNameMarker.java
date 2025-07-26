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
 * Used to apply user standard names to topology buses. Typically used for "bus/branch" case generation. Associated with one or more terminals that are normally connected with the bus name.    The associated terminals are normally connected by non-retained switches. For a ring bus station configuration, all busbar terminals in the ring are typically associated.   For a breaker and a half scheme, both busbars would normally be associated.  For a ring bus, all busbars would normally be associated.  For a "straight" busbar configuration, normally only the main terminal at the busbar would be associated.
 */
@SuppressWarnings("unused")
public class BusNameMarker extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(BusNameMarker.class);

    /**
     * Constructor.
     */
    public BusNameMarker(String rdfid) {
        super("BusNameMarker", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected BusNameMarker(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The bus name markers that belong to this reporting group.
     */
    private ReportingGroup ReportingGroup; // ManyToOne

    private String ReportingGroupId;

    public ReportingGroup getReportingGroup() {
        return ReportingGroup;
    }

    public void setReportingGroup(ReportingGroup _object_) {
        if (ReportingGroup != _object_) {
            ReportingGroup = _object_;
            _object_.setBusNameMarker(this);
            ReportingGroupId = _object_.getRdfid();
        }
    }

    private static Object getReportingGroup(BaseClass _this_) {
        var obj = ((BusNameMarker) _this_).getReportingGroup();
        var id = ((BusNameMarker) _this_).ReportingGroupId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setReportingGroup(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((BusNameMarker) _this_).ReportingGroupId = (String) _value_;
        } else if (_value_ instanceof ReportingGroup) {
            ((BusNameMarker) _this_).setReportingGroup((ReportingGroup) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ReportingGroup");
        }
    }

    /**
     * The terminals associated with this bus name marker.
     *
     * NOT USED
     */
    private Set<ACDCTerminal> Terminal = new HashSet<>(); // OneToMany

    private Set<String> TerminalIdSet = new HashSet<>();

    public Set<ACDCTerminal> getTerminal() {
        return Terminal;
    }

    public void setTerminal(ACDCTerminal _object_) {
        if (!Terminal.contains(_object_)) {
            Terminal.add(_object_);
            _object_.setBusNameMarker(this);
            TerminalIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getTerminal(BaseClass _this_) {
        var objs = ((BusNameMarker) _this_).getTerminal();
        var ids = ((BusNameMarker) _this_).TerminalIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setTerminal(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((BusNameMarker) _this_).TerminalIdSet.add((String) _value_);
        } else if (_value_ instanceof ACDCTerminal) {
            ((BusNameMarker) _this_).setTerminal((ACDCTerminal) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ACDCTerminal");
        }
    }

    /**
     * Priority of bus name marker for use as topology bus name.  Use 0 for don t care.  Use 1 for highest priority.  Use 2 as priority is less than 1 and so on.
     */
    private Integer priority; // Integer

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer _value_) {
        priority = _value_;
    }

    private static Object getPriority(BaseClass _this_) {
        return ((BusNameMarker) _this_).getPriority();
    }

    private static void setPriority(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((BusNameMarker) _this_).setPriority((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((BusNameMarker) _this_).setPriority(getIntegerFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "BusNameMarker", attrName));
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
                "BusNameMarker", attrName, value));
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
            map.put("ReportingGroup", new AttrDetails("BusNameMarker.ReportingGroup", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, BusNameMarker::getReportingGroup, BusNameMarker::setReportingGroup));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("Terminal", new AttrDetails("BusNameMarker.Terminal", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, BusNameMarker::getTerminal, BusNameMarker::setTerminal));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("priority", new AttrDetails("BusNameMarker.priority", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, BusNameMarker::getPriority, BusNameMarker::setPriority));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new BusNameMarker(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
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
