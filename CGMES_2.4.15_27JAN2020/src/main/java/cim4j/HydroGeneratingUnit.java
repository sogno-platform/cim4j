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
 * A generating unit whose prime mover is a hydraulic turbine (e.g., Francis, Pelton, Kaplan).
 */
@SuppressWarnings("unused")
public class HydroGeneratingUnit extends GeneratingUnit {

    private static final Logging LOG = Logging.getLogger(HydroGeneratingUnit.class);

    /**
     * Constructor.
     */
    public HydroGeneratingUnit(String rdfid) {
        super("HydroGeneratingUnit", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected HydroGeneratingUnit(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The hydro generating unit belongs to a hydro power plant.
     */
    private HydroPowerPlant HydroPowerPlant; // ManyToOne

    private String HydroPowerPlantId;

    public HydroPowerPlant getHydroPowerPlant() {
        return HydroPowerPlant;
    }

    public void setHydroPowerPlant(HydroPowerPlant _object_) {
        if (HydroPowerPlant != _object_) {
            HydroPowerPlant = _object_;
            _object_.setHydroGeneratingUnits(this);
            HydroPowerPlantId = _object_.getRdfid();
        }
    }

    private static Object getHydroPowerPlant(BaseClass _this_) {
        var obj = ((HydroGeneratingUnit) _this_).getHydroPowerPlant();
        var id = ((HydroGeneratingUnit) _this_).HydroPowerPlantId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setHydroPowerPlant(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((HydroGeneratingUnit) _this_).HydroPowerPlantId = (String) _value_;
        } else if (_value_ instanceof HydroPowerPlant) {
            ((HydroGeneratingUnit) _this_).setHydroPowerPlant((HydroPowerPlant) _value_);
        } else {
            throw new IllegalArgumentException("Object is not HydroPowerPlant");
        }
    }

    /**
     * Energy conversion capability for generating.
     */
    private String energyConversionCapability; // HydroEnergyConversionKind

    public String getEnergyConversionCapability() {
        return energyConversionCapability;
    }

    public void setEnergyConversionCapability(String _value_) {
        energyConversionCapability = _value_;
    }

    private static Object getEnergyConversionCapability(BaseClass _this_) {
        return ((HydroGeneratingUnit) _this_).getEnergyConversionCapability();
    }

    private static void setEnergyConversionCapability(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((HydroGeneratingUnit) _this_).setEnergyConversionCapability((String) _value_);
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "HydroGeneratingUnit", attrName));
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
                "HydroGeneratingUnit", attrName, value));
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
            map.put("HydroPowerPlant", new AttrDetails("HydroGeneratingUnit.HydroPowerPlant", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, HydroGeneratingUnit::getHydroPowerPlant, HydroGeneratingUnit::setHydroPowerPlant));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("energyConversionCapability", new AttrDetails("HydroGeneratingUnit.energyConversionCapability", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, HydroGeneratingUnit::getEnergyConversionCapability, HydroGeneratingUnit::setEnergyConversionCapability));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new HydroGeneratingUnit(null).allAttrDetailsMap());
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
