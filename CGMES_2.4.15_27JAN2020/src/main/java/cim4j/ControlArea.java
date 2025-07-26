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
 * A control areais a grouping of generating units and/or loads and a cutset of tie lines (as terminals) which may be used for a variety of purposes including automatic generation control, powerflow solution area interchange control specification, and input to load forecasting.   Note that any number of overlapping control area specifications can be superimposed on the physical model.
 */
@SuppressWarnings("unused")
public class ControlArea extends PowerSystemResource {

    private static final Logging LOG = Logging.getLogger(ControlArea.class);

    /**
     * Constructor.
     */
    public ControlArea(String rdfid) {
        super("ControlArea", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ControlArea(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The generating unit specificaitons for the control area.
     *
     * NOT USED
     */
    private Set<ControlAreaGeneratingUnit> ControlAreaGeneratingUnit = new HashSet<>(); // OneToMany

    private Set<String> ControlAreaGeneratingUnitIdSet = new HashSet<>();

    public Set<ControlAreaGeneratingUnit> getControlAreaGeneratingUnit() {
        return ControlAreaGeneratingUnit;
    }

    public void setControlAreaGeneratingUnit(ControlAreaGeneratingUnit _object_) {
        if (!ControlAreaGeneratingUnit.contains(_object_)) {
            ControlAreaGeneratingUnit.add(_object_);
            _object_.setControlArea(this);
            ControlAreaGeneratingUnitIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getControlAreaGeneratingUnit(BaseClass _this_) {
        var objs = ((ControlArea) _this_).getControlAreaGeneratingUnit();
        var ids = ((ControlArea) _this_).ControlAreaGeneratingUnitIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setControlAreaGeneratingUnit(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ControlArea) _this_).ControlAreaGeneratingUnitIdSet.add((String) _value_);
        } else if (_value_ instanceof ControlAreaGeneratingUnit) {
            ((ControlArea) _this_).setControlAreaGeneratingUnit((ControlAreaGeneratingUnit) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ControlAreaGeneratingUnit");
        }
    }

    /**
     * The energy area that is forecast from this control area specification.
     */
    private EnergyArea EnergyArea; // OneToOne

    private String EnergyAreaId;

    public EnergyArea getEnergyArea() {
        return EnergyArea;
    }

    public void setEnergyArea(EnergyArea _object_) {
        if (EnergyArea != _object_) {
            EnergyArea = _object_;
            _object_.setControlArea(this);
            EnergyAreaId = _object_.getRdfid();
        }
    }

    private static Object getEnergyArea(BaseClass _this_) {
        var obj = ((ControlArea) _this_).getEnergyArea();
        var id = ((ControlArea) _this_).EnergyAreaId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setEnergyArea(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ControlArea) _this_).EnergyAreaId = (String) _value_;
        } else if (_value_ instanceof EnergyArea) {
            ((ControlArea) _this_).setEnergyArea((EnergyArea) _value_);
        } else {
            throw new IllegalArgumentException("Object is not EnergyArea");
        }
    }

    /**
     * The tie flows associated with the control area.
     *
     * NOT USED
     */
    private Set<TieFlow> TieFlow = new HashSet<>(); // OneToMany

    private Set<String> TieFlowIdSet = new HashSet<>();

    public Set<TieFlow> getTieFlow() {
        return TieFlow;
    }

    public void setTieFlow(TieFlow _object_) {
        if (!TieFlow.contains(_object_)) {
            TieFlow.add(_object_);
            _object_.setControlArea(this);
            TieFlowIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getTieFlow(BaseClass _this_) {
        var objs = ((ControlArea) _this_).getTieFlow();
        var ids = ((ControlArea) _this_).TieFlowIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setTieFlow(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ControlArea) _this_).TieFlowIdSet.add((String) _value_);
        } else if (_value_ instanceof TieFlow) {
            ((ControlArea) _this_).setTieFlow((TieFlow) _value_);
        } else {
            throw new IllegalArgumentException("Object is not TieFlow");
        }
    }

    /**
     * The specified positive net interchange into the control area, i.e. positive sign means flow in to the area.
     */
    private Double netInterchange; // ActivePower

    public Double getNetInterchange() {
        return netInterchange;
    }

    public void setNetInterchange(Double _value_) {
        netInterchange = _value_;
    }

    private static Object getNetInterchange(BaseClass _this_) {
        return ((ControlArea) _this_).getNetInterchange();
    }

    private static void setNetInterchange(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ControlArea) _this_).setNetInterchange((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ControlArea) _this_).setNetInterchange(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Active power net interchange tolerance
     */
    private Double pTolerance; // ActivePower

    public Double getPTolerance() {
        return pTolerance;
    }

    public void setPTolerance(Double _value_) {
        pTolerance = _value_;
    }

    private static Object getPTolerance(BaseClass _this_) {
        return ((ControlArea) _this_).getPTolerance();
    }

    private static void setPTolerance(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ControlArea) _this_).setPTolerance((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ControlArea) _this_).setPTolerance(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * The primary type of control area definition used to determine if this is used for automatic generation control, for planning interchange control, or other purposes.   A control area specified with primary type of automatic generation control could still be forecast and used as an interchange area in power flow analysis.
     */
    private String type; // ControlAreaTypeKind

    public String getType() {
        return type;
    }

    public void setType(String _value_) {
        type = _value_;
    }

    private static Object getType(BaseClass _this_) {
        return ((ControlArea) _this_).getType();
    }

    private static void setType(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ControlArea) _this_).setType((String) _value_);
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ControlArea", attrName));
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
                "ControlArea", attrName, value));
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
            map.put("ControlAreaGeneratingUnit", new AttrDetails("ControlArea.ControlAreaGeneratingUnit", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ControlArea::getControlAreaGeneratingUnit, ControlArea::setControlAreaGeneratingUnit));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("EnergyArea", new AttrDetails("ControlArea.EnergyArea", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ControlArea::getEnergyArea, ControlArea::setEnergyArea));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("TieFlow", new AttrDetails("ControlArea.TieFlow", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ControlArea::getTieFlow, ControlArea::setTieFlow));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("netInterchange", new AttrDetails("ControlArea.netInterchange", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ControlArea::getNetInterchange, ControlArea::setNetInterchange));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("pTolerance", new AttrDetails("ControlArea.pTolerance", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ControlArea::getPTolerance, ControlArea::setPTolerance));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("type", new AttrDetails("ControlArea.type", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, ControlArea::getType, ControlArea::setType));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ControlArea(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.SSH);
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
