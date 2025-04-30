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
 * Synchronous machine whose behaviour is described by reference to a standard model expressed in one of the following forms:
 */
@SuppressWarnings("unused")
public class SynchronousMachineDynamics extends RotatingMachineDynamics {

    private static final Logging LOG = Logging.getLogger(SynchronousMachineDynamics.class);

    /**
     * Default constructor.
     */
    public SynchronousMachineDynamics() {
        setCimType("SynchronousMachineDynamics");
    }

    /**
     * Excitation system model associated with this synchronous machine model.
     *
     * NOT USED
     */
    private ExcitationSystemDynamics ExcitationSystemDynamics; // OneToOne

    public ExcitationSystemDynamics getExcitationSystemDynamics() {
        return ExcitationSystemDynamics;
    }

    public void setExcitationSystemDynamics(BaseClass _object_) {
        if (!(_object_ instanceof ExcitationSystemDynamics)) {
            throw new IllegalArgumentException("Object is not ExcitationSystemDynamics");
        }
        if (ExcitationSystemDynamics != _object_) {
            ExcitationSystemDynamics = (ExcitationSystemDynamics) _object_;
            ExcitationSystemDynamics.setSynchronousMachineDynamics(this);
        }
    }

    public String ExcitationSystemDynamicsToString() {
        return ExcitationSystemDynamics != null ? ExcitationSystemDynamics.getRdfid() : null;
    }

    /**
     * Compensation of voltage compensator`s generator for current flow out of this  generator.
     *
     * NOT USED
     */
    private Set<GenICompensationForGenJ> GenICompensationForGenJ = new HashSet<>(); // OneToMany

    public Set<GenICompensationForGenJ> getGenICompensationForGenJ() {
        return GenICompensationForGenJ;
    }

    public void setGenICompensationForGenJ(BaseClass _object_) {
        if (!(_object_ instanceof GenICompensationForGenJ)) {
            throw new IllegalArgumentException("Object is not GenICompensationForGenJ");
        }
        if (!GenICompensationForGenJ.contains(_object_)) {
            GenICompensationForGenJ.add((GenICompensationForGenJ) _object_);
            ((GenICompensationForGenJ) _object_).setSynchronousMachineDynamics(this);
        }
    }

    public String GenICompensationForGenJToString() {
        return getStringFromSet(GenICompensationForGenJ);
    }

    /**
     * Mechanical load model associated with this synchronous machine model.
     *
     * NOT USED
     */
    private MechanicalLoadDynamics MechanicalLoadDynamics; // OneToOne

    public MechanicalLoadDynamics getMechanicalLoadDynamics() {
        return MechanicalLoadDynamics;
    }

    public void setMechanicalLoadDynamics(BaseClass _object_) {
        if (!(_object_ instanceof MechanicalLoadDynamics)) {
            throw new IllegalArgumentException("Object is not MechanicalLoadDynamics");
        }
        if (MechanicalLoadDynamics != _object_) {
            MechanicalLoadDynamics = (MechanicalLoadDynamics) _object_;
            MechanicalLoadDynamics.setSynchronousMachineDynamics(this);
        }
    }

    public String MechanicalLoadDynamicsToString() {
        return MechanicalLoadDynamics != null ? MechanicalLoadDynamics.getRdfid() : null;
    }

    /**
     * Synchronous machine to which synchronous machine dynamics model applies.
     */
    private SynchronousMachine SynchronousMachine; // OneToOne

    public SynchronousMachine getSynchronousMachine() {
        return SynchronousMachine;
    }

    public void setSynchronousMachine(BaseClass _object_) {
        if (!(_object_ instanceof SynchronousMachine)) {
            throw new IllegalArgumentException("Object is not SynchronousMachine");
        }
        if (SynchronousMachine != _object_) {
            SynchronousMachine = (SynchronousMachine) _object_;
            SynchronousMachine.setSynchronousMachineDynamics(this);
        }
    }

    public String SynchronousMachineToString() {
        return SynchronousMachine != null ? SynchronousMachine.getRdfid() : null;
    }

    /**
     * Synchronous machine model with which this turbine-governor model is associated.
     *
     * NOT USED
     */
    private Set<TurbineGovernorDynamics> TurbineGovernorDynamics = new HashSet<>(); // OneToMany

    public Set<TurbineGovernorDynamics> getTurbineGovernorDynamics() {
        return TurbineGovernorDynamics;
    }

    public void setTurbineGovernorDynamics(BaseClass _object_) {
        if (!(_object_ instanceof TurbineGovernorDynamics)) {
            throw new IllegalArgumentException("Object is not TurbineGovernorDynamics");
        }
        if (!TurbineGovernorDynamics.contains(_object_)) {
            TurbineGovernorDynamics.add((TurbineGovernorDynamics) _object_);
            ((TurbineGovernorDynamics) _object_).setSynchronousMachineDynamics(this);
        }
    }

    public String TurbineGovernorDynamicsToString() {
        return getStringFromSet(TurbineGovernorDynamics);
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
     * Get an attribute value as string.
     *
     * @param attrName The attribute name
     * @return         The attribute value
     */
    @Override
    public String getAttribute(String attrName) {
        return getAttribute("SynchronousMachineDynamics", attrName);
    }

    @Override
    protected String getAttribute(String className, String attrName) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var getterFunction = classGetterSetterMap.get(attrName).getter;
            return getterFunction.get();
        }
        return super.getAttribute(className, attrName);
    }

    /**
     * Set an attribute value as object (for class and list attributes).
     *
     * @param attrName    The attribute name
     * @param objectValue The attribute value as object
     */
    @Override
    public void setAttribute(String attrName, BaseClass objectValue) {
        setAttribute("SynchronousMachineDynamics", attrName, objectValue);
    }

    @Override
    protected void setAttribute(String className, String attrName, BaseClass objectValue) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var setterFunction = classGetterSetterMap.get(attrName).objectSetter;
            setterFunction.accept(objectValue);
        } else {
            super.setAttribute(className, attrName, objectValue);
        }
    }

    /**
     * Set an attribute value as string (for primitive (including datatype) and enum attributes).
     *
     * @param attrName    The attribute name
     * @param stringValue The attribute value as string
     */
    @Override
    public void setAttribute(String attrName, String stringValue) {
        setAttribute("SynchronousMachineDynamics", attrName, stringValue);
    }

    @Override
    protected void setAttribute(String className, String attrName, String stringValue) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var setterFunction = classGetterSetterMap.get(attrName).stringSetter;
            setterFunction.accept(stringValue);
        } else {
            super.setAttribute(className, attrName, stringValue);
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
            profiles.add(CGMESProfile.DY);
            map.put("ExcitationSystemDynamics", new AttrDetails("SynchronousMachineDynamics.ExcitationSystemDynamics", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("GenICompensationForGenJ", new AttrDetails("SynchronousMachineDynamics.GenICompensationForGenJ", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("MechanicalLoadDynamics", new AttrDetails("SynchronousMachineDynamics.MechanicalLoadDynamics", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("SynchronousMachine", new AttrDetails("SynchronousMachineDynamics.SynchronousMachine", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("TurbineGovernorDynamics", new AttrDetails("SynchronousMachineDynamics.TurbineGovernorDynamics", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new SynchronousMachineDynamics().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("ExcitationSystemDynamics", new GetterSetter(this::ExcitationSystemDynamicsToString, this::setExcitationSystemDynamics, null));
        map.put("GenICompensationForGenJ", new GetterSetter(this::GenICompensationForGenJToString, this::setGenICompensationForGenJ, null));
        map.put("MechanicalLoadDynamics", new GetterSetter(this::MechanicalLoadDynamicsToString, this::setMechanicalLoadDynamics, null));
        map.put("SynchronousMachine", new GetterSetter(this::SynchronousMachineToString, this::setSynchronousMachine, null));
        map.put("TurbineGovernorDynamics", new GetterSetter(this::TurbineGovernorDynamicsToString, this::setTurbineGovernorDynamics, null));
        return map;
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
