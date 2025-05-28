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
 * All synchronous machine detailed types use a subset of the same data parameters and input/output variables.   The several variations differ in the following ways: - the number of  equivalent windings that are included; - the way in which saturation is incorporated into the model; - whether or not "subtransient saliency" (<i>X''q</i> not = <i>X''d</i>) is represented. It is not necessary for each simulation tool to have separate models for each of the model types.  The same model can often be used for several types by alternative logic within the model.  Also, differences in saturation representation might not result in significant model performance differences so model substitutions are often acceptable.
 */
@SuppressWarnings("unused")
public class SynchronousMachineDetailed extends SynchronousMachineDynamics {

    private static final Logging LOG = Logging.getLogger(SynchronousMachineDetailed.class);

    /**
     * Constructor.
     */
    public SynchronousMachineDetailed(String rdfid) {
        super("SynchronousMachineDetailed", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected SynchronousMachineDetailed(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Ratio (exciter voltage/generator voltage) of <i>Efd</i> bases of exciter and generator models (&gt; 0). Typical value = 1.
     */
    private Float efdBaseRatio; // Float

    public Float getEfdBaseRatio() {
        return efdBaseRatio;
    }

    public void setEfdBaseRatio(Float _value_) {
        efdBaseRatio = _value_;
    }

    private static Object getEfdBaseRatio(BaseClass _this_) {
        return ((SynchronousMachineDetailed) _this_).getEfdBaseRatio();
    }

    private static void setEfdBaseRatio(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((SynchronousMachineDetailed) _this_).setEfdBaseRatio((Float) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineDetailed) _this_).setEfdBaseRatio(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Excitation base system mode. It should be equal to the value of <i>WLMDV</i> given by the user. <i>WLMDV</i> is the PU ratio between the field voltage and the excitation current: <i>Efd</i> = <i>WLMDV</i> x <i>Ifd</i>. Typical value = ifag.
     */
    private String ifdBaseType; // IfdBaseKind

    public String getIfdBaseType() {
        return ifdBaseType;
    }

    public void setIfdBaseType(String _value_) {
        ifdBaseType = _value_;
    }

    private static Object getIfdBaseType(BaseClass _this_) {
        return ((SynchronousMachineDetailed) _this_).getIfdBaseType();
    }

    private static void setIfdBaseType(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((SynchronousMachineDetailed) _this_).setIfdBaseType((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Quadrature-axis saturation factor at 120% of rated terminal voltage (<i>S12q</i>) (&gt;= SynchonousMachineDetailed.saturationFactorQAxis).  Typical value = 0,12.
     */
    private Float saturationFactor120QAxis; // Float

    public Float getSaturationFactor120QAxis() {
        return saturationFactor120QAxis;
    }

    public void setSaturationFactor120QAxis(Float _value_) {
        saturationFactor120QAxis = _value_;
    }

    private static Object getSaturationFactor120QAxis(BaseClass _this_) {
        return ((SynchronousMachineDetailed) _this_).getSaturationFactor120QAxis();
    }

    private static void setSaturationFactor120QAxis(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((SynchronousMachineDetailed) _this_).setSaturationFactor120QAxis((Float) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineDetailed) _this_).setSaturationFactor120QAxis(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Quadrature-axis saturation factor at rated terminal voltage (<i>S1q</i>) (&gt;= 0). Typical value = 0,02.
     */
    private Float saturationFactorQAxis; // Float

    public Float getSaturationFactorQAxis() {
        return saturationFactorQAxis;
    }

    public void setSaturationFactorQAxis(Float _value_) {
        saturationFactorQAxis = _value_;
    }

    private static Object getSaturationFactorQAxis(BaseClass _this_) {
        return ((SynchronousMachineDetailed) _this_).getSaturationFactorQAxis();
    }

    private static void setSaturationFactorQAxis(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((SynchronousMachineDetailed) _this_).setSaturationFactorQAxis((Float) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineDetailed) _this_).setSaturationFactorQAxis(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "SynchronousMachineDetailed", attrName));
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
                "SynchronousMachineDetailed", attrName, value));
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
            profiles.add(CGMESProfile.DY);
            map.put("efdBaseRatio", new AttrDetails("SynchronousMachineDetailed.efdBaseRatio", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineDetailed::getEfdBaseRatio, SynchronousMachineDetailed::setEfdBaseRatio));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ifdBaseType", new AttrDetails("SynchronousMachineDetailed.ifdBaseType", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, SynchronousMachineDetailed::getIfdBaseType, SynchronousMachineDetailed::setIfdBaseType));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("saturationFactor120QAxis", new AttrDetails("SynchronousMachineDetailed.saturationFactor120QAxis", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineDetailed::getSaturationFactor120QAxis, SynchronousMachineDetailed::setSaturationFactor120QAxis));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("saturationFactorQAxis", new AttrDetails("SynchronousMachineDetailed.saturationFactorQAxis", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineDetailed::getSaturationFactorQAxis, SynchronousMachineDetailed::setSaturationFactorQAxis));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new SynchronousMachineDetailed(null).allAttrDetailsMap());
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
