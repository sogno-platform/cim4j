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
 * A conducting connection point of a power transformer. It corresponds to a physical transformer winding terminal.  In earlier CIM versions, the TransformerWinding class served a similar purpose, but this class is more flexible because it associates to terminal but is not a specialization of ConductingEquipment.
 */
@SuppressWarnings("unused")
public class TransformerEnd extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(TransformerEnd.class);

    /**
     * Constructor.
     */
    public TransformerEnd(String rdfid) {
        super("TransformerEnd", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected TransformerEnd(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Base voltage of the transformer end.  This is essential for PU calculation.
     */
    private BaseVoltage BaseVoltage; // ManyToOne

    public BaseVoltage getBaseVoltage() {
        return BaseVoltage;
    }

    public void setBaseVoltage(BaseVoltage _object_) {
        if (BaseVoltage != _object_) {
            BaseVoltage = _object_;
            BaseVoltage.setTransformerEnds(this);
        }
    }

    private static Object getBaseVoltage(BaseClass _this_) {
        return ((TransformerEnd) _this_).getBaseVoltage();
    }

    private static void setBaseVoltage(BaseClass _this_, Object _value_) {
        if (_value_ instanceof BaseVoltage) {
            ((TransformerEnd) _this_).setBaseVoltage((BaseVoltage) _value_);
        } else {
            throw new IllegalArgumentException("Object is not BaseVoltage");
        }
    }

    /**
     * Transformer end to which this phase tap changer belongs.
     *
     * NOT USED
     */
    private PhaseTapChanger PhaseTapChanger; // OneToOne

    public PhaseTapChanger getPhaseTapChanger() {
        return PhaseTapChanger;
    }

    public void setPhaseTapChanger(PhaseTapChanger _object_) {
        if (PhaseTapChanger != _object_) {
            PhaseTapChanger = _object_;
            PhaseTapChanger.setTransformerEnd(this);
        }
    }

    private static Object getPhaseTapChanger(BaseClass _this_) {
        return ((TransformerEnd) _this_).getPhaseTapChanger();
    }

    private static void setPhaseTapChanger(BaseClass _this_, Object _value_) {
        if (_value_ instanceof PhaseTapChanger) {
            ((TransformerEnd) _this_).setPhaseTapChanger((PhaseTapChanger) _value_);
        } else {
            throw new IllegalArgumentException("Object is not PhaseTapChanger");
        }
    }

    /**
     * Transformer end to which this ratio tap changer belongs.
     *
     * NOT USED
     */
    private RatioTapChanger RatioTapChanger; // OneToOne

    public RatioTapChanger getRatioTapChanger() {
        return RatioTapChanger;
    }

    public void setRatioTapChanger(RatioTapChanger _object_) {
        if (RatioTapChanger != _object_) {
            RatioTapChanger = _object_;
            RatioTapChanger.setTransformerEnd(this);
        }
    }

    private static Object getRatioTapChanger(BaseClass _this_) {
        return ((TransformerEnd) _this_).getRatioTapChanger();
    }

    private static void setRatioTapChanger(BaseClass _this_, Object _value_) {
        if (_value_ instanceof RatioTapChanger) {
            ((TransformerEnd) _this_).setRatioTapChanger((RatioTapChanger) _value_);
        } else {
            throw new IllegalArgumentException("Object is not RatioTapChanger");
        }
    }

    /**
     * Terminal of the power transformer to which this transformer end belongs.
     */
    private Terminal Terminal; // ManyToOne

    public Terminal getTerminal() {
        return Terminal;
    }

    public void setTerminal(Terminal _object_) {
        if (Terminal != _object_) {
            Terminal = _object_;
            Terminal.setTransformerEnd(this);
        }
    }

    private static Object getTerminal(BaseClass _this_) {
        return ((TransformerEnd) _this_).getTerminal();
    }

    private static void setTerminal(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Terminal) {
            ((TransformerEnd) _this_).setTerminal((Terminal) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Terminal");
        }
    }

    /**
     * Number for this transformer end, corresponding to the end`s order in the power transformer vector group or phase angle clock number.  Highest voltage winding should be 1.  Each end within a power transformer should have a unique subsequent end number.   Note the transformer end number need not match the terminal sequence number.
     */
    private Integer endNumber; // Integer

    public Integer getEndNumber() {
        return endNumber;
    }

    public void setEndNumber(Integer _value_) {
        endNumber = _value_;
    }

    private static Object getEndNumber(BaseClass _this_) {
        return ((TransformerEnd) _this_).getEndNumber();
    }

    private static void setEndNumber(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((TransformerEnd) _this_).setEndNumber((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((TransformerEnd) _this_).setEndNumber(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
        }
    }

    /**
     * (for Yn and Zn connections) True if the neutral is solidly grounded.
     */
    private Boolean grounded; // Boolean

    public Boolean getGrounded() {
        return grounded;
    }

    public void setGrounded(Boolean _value_) {
        grounded = _value_;
    }

    private static Object getGrounded(BaseClass _this_) {
        return ((TransformerEnd) _this_).getGrounded();
    }

    private static void setGrounded(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((TransformerEnd) _this_).setGrounded((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((TransformerEnd) _this_).setGrounded(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * (for Yn and Zn connections) Resistance part of neutral impedance where `grounded` is true.
     */
    private Double rground; // Resistance

    public Double getRground() {
        return rground;
    }

    public void setRground(Double _value_) {
        rground = _value_;
    }

    private static Object getRground(BaseClass _this_) {
        return ((TransformerEnd) _this_).getRground();
    }

    private static void setRground(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((TransformerEnd) _this_).setRground((Double) _value_);
        } else if (_value_ instanceof String) {
            ((TransformerEnd) _this_).setRground(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * (for Yn and Zn connections) Reactive part of neutral impedance where `grounded` is true.
     */
    private Double xground; // Reactance

    public Double getXground() {
        return xground;
    }

    public void setXground(Double _value_) {
        xground = _value_;
    }

    private static Object getXground(BaseClass _this_) {
        return ((TransformerEnd) _this_).getXground();
    }

    private static void setXground(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((TransformerEnd) _this_).setXground((Double) _value_);
        } else if (_value_ instanceof String) {
            ((TransformerEnd) _this_).setXground(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "TransformerEnd", attrName));
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
                "TransformerEnd", attrName, value));
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
            map.put("BaseVoltage", new AttrDetails("TransformerEnd.BaseVoltage", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, TransformerEnd::getBaseVoltage, TransformerEnd::setBaseVoltage));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("PhaseTapChanger", new AttrDetails("TransformerEnd.PhaseTapChanger", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, TransformerEnd::getPhaseTapChanger, TransformerEnd::setPhaseTapChanger));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("RatioTapChanger", new AttrDetails("TransformerEnd.RatioTapChanger", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, TransformerEnd::getRatioTapChanger, TransformerEnd::setRatioTapChanger));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("Terminal", new AttrDetails("TransformerEnd.Terminal", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, TransformerEnd::getTerminal, TransformerEnd::setTerminal));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("endNumber", new AttrDetails("TransformerEnd.endNumber", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TransformerEnd::getEndNumber, TransformerEnd::setEndNumber));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("grounded", new AttrDetails("TransformerEnd.grounded", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TransformerEnd::getGrounded, TransformerEnd::setGrounded));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("rground", new AttrDetails("TransformerEnd.rground", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TransformerEnd::getRground, TransformerEnd::setRground));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("xground", new AttrDetails("TransformerEnd.xground", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TransformerEnd::getXground, TransformerEnd::setXground));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new TransformerEnd(null).allAttrDetailsMap());
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
