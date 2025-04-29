/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Turbine-governor cross-compound function block whose behaviour is described by reference to a standard model <font color="#0f0f0f">or by definition of a user-defined model.</font>
 */
public class CrossCompoundTurbineGovernorDynamics extends DynamicsFunctionBlock {

    private static final Logging LOG = Logging.getLogger(CrossCompoundTurbineGovernorDynamics.class);

    private BaseClass[] CrossCompoundTurbineGovernorDynamics_class_attributes;
    private BaseClass[] CrossCompoundTurbineGovernorDynamics_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new CrossCompoundTurbineGovernorDynamics().getAttributeNamesMap();
    }

    private enum CrossCompoundTurbineGovernorDynamics_primitive_builder implements PrimitiveBuilder {
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum CrossCompoundTurbineGovernorDynamics_class_attributes_enum {
        HighPressureSynchronousMachineDynamics,
        LowPressureSynchronousMachineDynamics,
        LAST_ENUM
    }

    public CrossCompoundTurbineGovernorDynamics() {
        CrossCompoundTurbineGovernorDynamics_primitive_attributes = new BaseClass[CrossCompoundTurbineGovernorDynamics_primitive_builder.values().length];
        CrossCompoundTurbineGovernorDynamics_class_attributes = new BaseClass[CrossCompoundTurbineGovernorDynamics_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new CrossCompoundTurbineGovernorDynamics();
    }

    @Override
    public void setValue(java.lang.String s) {
        LOG.error(debugString() + " is not sure what to do with " + s);
    }

    @Override
    public void setRdfid(java.lang.String id) {
        rdfid = id;
    }

    @Override
    public java.lang.String getRdfid() {
        return rdfid;
    }

    private void updateAttributeInArray(CrossCompoundTurbineGovernorDynamics_class_attributes_enum attrEnum, BaseClass value) {
        try {
            CrossCompoundTurbineGovernorDynamics_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(CrossCompoundTurbineGovernorDynamics_primitive_builder attrEnum, BaseClass value) {
        try {
            CrossCompoundTurbineGovernorDynamics_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            CrossCompoundTurbineGovernorDynamics_class_attributes_enum attrEnum = CrossCompoundTurbineGovernorDynamics_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated CrossCompoundTurbineGovernorDynamics, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            CrossCompoundTurbineGovernorDynamics_primitive_builder attrEnum = CrossCompoundTurbineGovernorDynamics_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated CrossCompoundTurbineGovernorDynamics, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            CrossCompoundTurbineGovernorDynamics_primitive_builder attrEnum = CrossCompoundTurbineGovernorDynamics_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = CrossCompoundTurbineGovernorDynamics_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            CrossCompoundTurbineGovernorDynamics_class_attributes_enum attrEnum = CrossCompoundTurbineGovernorDynamics_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = CrossCompoundTurbineGovernorDynamics_class_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        if (!defined) {
            return super.getAttribute(attrName);
        }
        return null;
    }

    @Override
    protected Map<java.lang.String, java.lang.String> getAttributeNamesMap() {
        Map<java.lang.String, java.lang.String> namesMap = new LinkedHashMap<>();
        for (var enumValue : CrossCompoundTurbineGovernorDynamics_primitive_builder.values()) {
            if (enumValue != CrossCompoundTurbineGovernorDynamics_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "CrossCompoundTurbineGovernorDynamics." + enumValue.name());
            }
        }
        for (var enumValue : CrossCompoundTurbineGovernorDynamics_class_attributes_enum.values()) {
            if (enumValue != CrossCompoundTurbineGovernorDynamics_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "CrossCompoundTurbineGovernorDynamics." + enumValue.name());
            }
        }
        namesMap.putAll(super.getAttributeNamesMap());
        return namesMap;
    }

    @Override
    public Set<java.lang.String> getAttributeNames() {
        return ATTRIBUTE_NAMES_MAP.keySet();
    }

    @Override
    public java.lang.String getAttributeFullName(java.lang.String attrName) {
        return ATTRIBUTE_NAMES_MAP.get(attrName);
    }

    @Override
    public java.lang.String toString(boolean topClass) {
        java.lang.String result = "";
        if (topClass) {
            for (CrossCompoundTurbineGovernorDynamics_primitive_builder attrEnum : CrossCompoundTurbineGovernorDynamics_primitive_builder.values()) {
                BaseClass bc = CrossCompoundTurbineGovernorDynamics_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    CrossCompoundTurbineGovernorDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (CrossCompoundTurbineGovernorDynamics_class_attributes_enum attrEnum : CrossCompoundTurbineGovernorDynamics_class_attributes_enum.values()) {
                BaseClass bc = CrossCompoundTurbineGovernorDynamics_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    CrossCompoundTurbineGovernorDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(CrossCompoundTurbineGovernorDynamics) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "CrossCompoundTurbineGovernorDynamics";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }

    /**
     * Get the namespace URL of an object of this class.
     *
     * @return The namespace URL
     */
    @Override
    public java.lang.String getClassNamespaceUrl() {
        return CLASS_NAMESPACE;
    }

    /**
     * Get the namespace URL of an attribute (also for inherited attributes).
     *
     * @return The namespace URL
     */
    @Override
    public java.lang.String getAttributeNamespaceUrl(java.lang.String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) ? ATTR_DETAILS_MAP.get(attrName).nameSpace : null;
    }

    @Override
    protected Map<java.lang.String, AttrDetails> allAttrDetailsMap() {
        Map<java.lang.String, AttrDetails> map = new LinkedHashMap<>(CLASS_ATTR_DETAILS_MAP);
        map.putAll(super.allAttrDetailsMap());
        return map;
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
    public Set<CGMESProfile> getPossibleAttributeProfiles(java.lang.String attrName) {
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

    private static final java.lang.String CLASS_NAMESPACE = "http://iec.ch/TC57/CIM100#";

    private static final Map<java.lang.String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<java.lang.String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<java.lang.String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("HighPressureSynchronousMachineDynamics", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("LowPressureSynchronousMachineDynamics", new AttrDetails("http://iec.ch/TC57/CIM100#", profiles));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new CrossCompoundTurbineGovernorDynamics().allAttrDetailsMap());
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
