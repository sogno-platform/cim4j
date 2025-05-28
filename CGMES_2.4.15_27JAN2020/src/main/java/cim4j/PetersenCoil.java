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
 * A tunable impedance device normally used to offset line charging during single line faults in an ungrounded section of network.
 */
@SuppressWarnings("unused")
public class PetersenCoil extends EarthFaultCompensator {

    private static final Logging LOG = Logging.getLogger(PetersenCoil.class);

    /**
     * Constructor.
     */
    public PetersenCoil(String rdfid) {
        super("PetersenCoil", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected PetersenCoil(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The mode of operation of the Petersen coil.
     */
    private String mode; // PetersenCoilModeKind

    public String getMode() {
        return mode;
    }

    public void setMode(String _value_) {
        mode = _value_;
    }

    private static Object getMode(BaseClass _this_) {
        return ((PetersenCoil) _this_).getMode();
    }

    private static void setMode(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((PetersenCoil) _this_).setMode((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * The nominal voltage for which the coil is designed.
     */
    private Double nominalU; // Voltage

    public Double getNominalU() {
        return nominalU;
    }

    public void setNominalU(Double _value_) {
        nominalU = _value_;
    }

    private static Object getNominalU(BaseClass _this_) {
        return ((PetersenCoil) _this_).getNominalU();
    }

    private static void setNominalU(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PetersenCoil) _this_).setNominalU((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PetersenCoil) _this_).setNominalU(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * The offset current that the Petersen coil controller is operating from the resonant point.  This is normally a fixed amount for which the controller is configured and could be positive or negative.  Typically 0 to 60 Amperes depending on voltage and resonance conditions.
     */
    private Double offsetCurrent; // CurrentFlow

    public Double getOffsetCurrent() {
        return offsetCurrent;
    }

    public void setOffsetCurrent(Double _value_) {
        offsetCurrent = _value_;
    }

    private static Object getOffsetCurrent(BaseClass _this_) {
        return ((PetersenCoil) _this_).getOffsetCurrent();
    }

    private static void setOffsetCurrent(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PetersenCoil) _this_).setOffsetCurrent((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PetersenCoil) _this_).setOffsetCurrent(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * The control current used to control the Petersen coil also known as the position current.  Typically in the range of 20-200mA.
     */
    private Double positionCurrent; // CurrentFlow

    public Double getPositionCurrent() {
        return positionCurrent;
    }

    public void setPositionCurrent(Double _value_) {
        positionCurrent = _value_;
    }

    private static Object getPositionCurrent(BaseClass _this_) {
        return ((PetersenCoil) _this_).getPositionCurrent();
    }

    private static void setPositionCurrent(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PetersenCoil) _this_).setPositionCurrent((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PetersenCoil) _this_).setPositionCurrent(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * The maximum reactance.
     */
    private Double xGroundMax; // Reactance

    public Double getXGroundMax() {
        return xGroundMax;
    }

    public void setXGroundMax(Double _value_) {
        xGroundMax = _value_;
    }

    private static Object getXGroundMax(BaseClass _this_) {
        return ((PetersenCoil) _this_).getXGroundMax();
    }

    private static void setXGroundMax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PetersenCoil) _this_).setXGroundMax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PetersenCoil) _this_).setXGroundMax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * The minimum reactance.
     */
    private Double xGroundMin; // Reactance

    public Double getXGroundMin() {
        return xGroundMin;
    }

    public void setXGroundMin(Double _value_) {
        xGroundMin = _value_;
    }

    private static Object getXGroundMin(BaseClass _this_) {
        return ((PetersenCoil) _this_).getXGroundMin();
    }

    private static void setXGroundMin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PetersenCoil) _this_).setXGroundMin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PetersenCoil) _this_).setXGroundMin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * The nominal reactance.  This is the operating point (normally over compensation) that is defined based on the resonance point in the healthy network condition.  The impedance is calculated based on nominal voltage divided by position current.
     */
    private Double xGroundNominal; // Reactance

    public Double getXGroundNominal() {
        return xGroundNominal;
    }

    public void setXGroundNominal(Double _value_) {
        xGroundNominal = _value_;
    }

    private static Object getXGroundNominal(BaseClass _this_) {
        return ((PetersenCoil) _this_).getXGroundNominal();
    }

    private static void setXGroundNominal(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PetersenCoil) _this_).setXGroundNominal((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PetersenCoil) _this_).setXGroundNominal(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PetersenCoil", attrName));
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
                "PetersenCoil", attrName, value));
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
            map.put("mode", new AttrDetails("PetersenCoil.mode", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, PetersenCoil::getMode, PetersenCoil::setMode));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("nominalU", new AttrDetails("PetersenCoil.nominalU", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PetersenCoil::getNominalU, PetersenCoil::setNominalU));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("offsetCurrent", new AttrDetails("PetersenCoil.offsetCurrent", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PetersenCoil::getOffsetCurrent, PetersenCoil::setOffsetCurrent));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("positionCurrent", new AttrDetails("PetersenCoil.positionCurrent", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PetersenCoil::getPositionCurrent, PetersenCoil::setPositionCurrent));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("xGroundMax", new AttrDetails("PetersenCoil.xGroundMax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PetersenCoil::getXGroundMax, PetersenCoil::setXGroundMax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("xGroundMin", new AttrDetails("PetersenCoil.xGroundMin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PetersenCoil::getXGroundMin, PetersenCoil::setXGroundMin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("xGroundNominal", new AttrDetails("PetersenCoil.xGroundNominal", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PetersenCoil::getXGroundNominal, PetersenCoil::setXGroundNominal));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PetersenCoil(null).allAttrDetailsMap());
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
