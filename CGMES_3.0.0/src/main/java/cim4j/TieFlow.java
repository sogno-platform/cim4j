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
 * Defines the structure (in terms of location and direction) of the net interchange constraint for a control area. This constraint may be used by either AGC or power flow.
 */
@SuppressWarnings("unused")
public class TieFlow extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(TieFlow.class);

    /**
     * Constructor.
     */
    public TieFlow(String rdfid) {
        super("TieFlow", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected TieFlow(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The control area of the tie flows.
     */
    private ControlArea ControlArea; // ManyToOne

    private String ControlAreaId;

    public ControlArea getControlArea() {
        return ControlArea;
    }

    public void setControlArea(ControlArea _object_) {
        if (ControlArea != _object_) {
            ControlArea = _object_;
            _object_.setTieFlow(this);
            ControlAreaId = _object_.getRdfid();
        }
    }

    private static Object getControlArea(BaseClass _this_) {
        var obj = ((TieFlow) _this_).getControlArea();
        var id = ((TieFlow) _this_).ControlAreaId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setControlArea(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((TieFlow) _this_).ControlAreaId = (String) _value_;
        } else if (_value_ instanceof ControlArea) {
            ((TieFlow) _this_).setControlArea((ControlArea) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ControlArea");
        }
    }

    /**
     * The terminal to which this tie flow belongs.
     */
    private Terminal Terminal; // ManyToOne

    private String TerminalId;

    public Terminal getTerminal() {
        return Terminal;
    }

    public void setTerminal(Terminal _object_) {
        if (Terminal != _object_) {
            Terminal = _object_;
            _object_.setTieFlow(this);
            TerminalId = _object_.getRdfid();
        }
    }

    private static Object getTerminal(BaseClass _this_) {
        var obj = ((TieFlow) _this_).getTerminal();
        var id = ((TieFlow) _this_).TerminalId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setTerminal(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((TieFlow) _this_).TerminalId = (String) _value_;
        } else if (_value_ instanceof Terminal) {
            ((TieFlow) _this_).setTerminal((Terminal) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Terminal");
        }
    }

    /**
     * Specifies the sign of the tie flow associated with a control area. True if positive flow into the terminal (load convention) is also positive flow into the control area.  See the description of ControlArea for further explanation of how TieFlow.positiveFlowIn is used.
     */
    private Boolean positiveFlowIn; // Boolean

    public Boolean getPositiveFlowIn() {
        return positiveFlowIn;
    }

    public void setPositiveFlowIn(Boolean _value_) {
        positiveFlowIn = _value_;
    }

    private static Object getPositiveFlowIn(BaseClass _this_) {
        return ((TieFlow) _this_).getPositiveFlowIn();
    }

    private static void setPositiveFlowIn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((TieFlow) _this_).setPositiveFlowIn((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((TieFlow) _this_).setPositiveFlowIn(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "TieFlow", attrName));
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
                "TieFlow", attrName, value));
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
            profiles.add(CGMESProfile.EQ);
            map.put("ControlArea", new AttrDetails("TieFlow.ControlArea", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, TieFlow::getControlArea, TieFlow::setControlArea));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("Terminal", new AttrDetails("TieFlow.Terminal", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, TieFlow::getTerminal, TieFlow::setTerminal));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("positiveFlowIn", new AttrDetails("TieFlow.positiveFlowIn", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, TieFlow::getPositiveFlowIn, TieFlow::setPositiveFlowIn));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new TieFlow(null).allAttrDetailsMap());
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
