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
 * The class represents equivalent branches. In cases where a transformer phase shift is modelled and the EquivalentBranch is spanning the same nodes, the impedance quantities for the EquivalentBranch shall consider the needed phase shift.
 */
@SuppressWarnings("unused")
public class EquivalentBranch extends EquivalentEquipment {

    private static final Logging LOG = Logging.getLogger(EquivalentBranch.class);

    /**
     * Constructor.
     */
    public EquivalentBranch(String rdfid) {
        super("EquivalentBranch", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected EquivalentBranch(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Negative sequence series resistance from terminal sequence  1 to terminal sequence 2. Used for short circuit data exchange according to IEC 60909. EquivalentBranch is a result of network reduction prior to the data exchange.
     */
    private Double negativeR12; // Resistance

    public Double getNegativeR12() {
        return negativeR12;
    }

    public void setNegativeR12(Double _value_) {
        negativeR12 = _value_;
    }

    private static Object getNegativeR12(BaseClass _this_) {
        return ((EquivalentBranch) _this_).getNegativeR12();
    }

    private static void setNegativeR12(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentBranch) _this_).setNegativeR12((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentBranch) _this_).setNegativeR12(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Negative sequence series resistance from terminal sequence 2 to terminal sequence 1. Used for short circuit data exchange according to IEC 60909. EquivalentBranch is a result of network reduction prior to the data exchange.
     */
    private Double negativeR21; // Resistance

    public Double getNegativeR21() {
        return negativeR21;
    }

    public void setNegativeR21(Double _value_) {
        negativeR21 = _value_;
    }

    private static Object getNegativeR21(BaseClass _this_) {
        return ((EquivalentBranch) _this_).getNegativeR21();
    }

    private static void setNegativeR21(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentBranch) _this_).setNegativeR21((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentBranch) _this_).setNegativeR21(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Negative sequence series reactance from terminal sequence  1 to terminal sequence 2. Used for short circuit data exchange according to IEC 60909. Usage : EquivalentBranch is a result of network reduction prior to the data exchange.
     */
    private Double negativeX12; // Reactance

    public Double getNegativeX12() {
        return negativeX12;
    }

    public void setNegativeX12(Double _value_) {
        negativeX12 = _value_;
    }

    private static Object getNegativeX12(BaseClass _this_) {
        return ((EquivalentBranch) _this_).getNegativeX12();
    }

    private static void setNegativeX12(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentBranch) _this_).setNegativeX12((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentBranch) _this_).setNegativeX12(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Negative sequence series reactance from terminal sequence 2 to terminal sequence 1. Used for short circuit data exchange according to IEC 60909. Usage: EquivalentBranch is a result of network reduction prior to the data exchange.
     */
    private Double negativeX21; // Reactance

    public Double getNegativeX21() {
        return negativeX21;
    }

    public void setNegativeX21(Double _value_) {
        negativeX21 = _value_;
    }

    private static Object getNegativeX21(BaseClass _this_) {
        return ((EquivalentBranch) _this_).getNegativeX21();
    }

    private static void setNegativeX21(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentBranch) _this_).setNegativeX21((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentBranch) _this_).setNegativeX21(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Positive sequence series resistance from terminal sequence  1 to terminal sequence 2 . Used for short circuit data exchange according to IEC 60909.  EquivalentBranch is a result of network reduction prior to the data exchange.
     */
    private Double positiveR12; // Resistance

    public Double getPositiveR12() {
        return positiveR12;
    }

    public void setPositiveR12(Double _value_) {
        positiveR12 = _value_;
    }

    private static Object getPositiveR12(BaseClass _this_) {
        return ((EquivalentBranch) _this_).getPositiveR12();
    }

    private static void setPositiveR12(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentBranch) _this_).setPositiveR12((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentBranch) _this_).setPositiveR12(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Positive sequence series resistance from terminal sequence 2 to terminal sequence 1. Used for short circuit data exchange according to IEC 60909. EquivalentBranch is a result of network reduction prior to the data exchange.
     */
    private Double positiveR21; // Resistance

    public Double getPositiveR21() {
        return positiveR21;
    }

    public void setPositiveR21(Double _value_) {
        positiveR21 = _value_;
    }

    private static Object getPositiveR21(BaseClass _this_) {
        return ((EquivalentBranch) _this_).getPositiveR21();
    }

    private static void setPositiveR21(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentBranch) _this_).setPositiveR21((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentBranch) _this_).setPositiveR21(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Positive sequence series reactance from terminal sequence  1 to terminal sequence 2. Used for short circuit data exchange according to IEC 60909. Usage : EquivalentBranch is a result of network reduction prior to the data exchange.
     */
    private Double positiveX12; // Reactance

    public Double getPositiveX12() {
        return positiveX12;
    }

    public void setPositiveX12(Double _value_) {
        positiveX12 = _value_;
    }

    private static Object getPositiveX12(BaseClass _this_) {
        return ((EquivalentBranch) _this_).getPositiveX12();
    }

    private static void setPositiveX12(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentBranch) _this_).setPositiveX12((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentBranch) _this_).setPositiveX12(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Positive sequence series reactance from terminal sequence 2 to terminal sequence 1. Used for short circuit data exchange according to IEC 60909. Usage : EquivalentBranch is a result of network reduction prior to the data exchange.
     */
    private Double positiveX21; // Reactance

    public Double getPositiveX21() {
        return positiveX21;
    }

    public void setPositiveX21(Double _value_) {
        positiveX21 = _value_;
    }

    private static Object getPositiveX21(BaseClass _this_) {
        return ((EquivalentBranch) _this_).getPositiveX21();
    }

    private static void setPositiveX21(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentBranch) _this_).setPositiveX21((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentBranch) _this_).setPositiveX21(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Positive sequence series resistance of the reduced branch.
     */
    private Double r; // Resistance

    public Double getR() {
        return r;
    }

    public void setR(Double _value_) {
        r = _value_;
    }

    private static Object getR(BaseClass _this_) {
        return ((EquivalentBranch) _this_).getR();
    }

    private static void setR(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentBranch) _this_).setR((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentBranch) _this_).setR(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Resistance from terminal sequence 2 to terminal sequence 1 .Used for steady state power flow. This attribute is optional and represent unbalanced network such as off-nominal phase shifter. If only EquivalentBranch.r is given, then EquivalentBranch.r21 is assumed equal to EquivalentBranch.r. Usage rule : EquivalentBranch is a result of network reduction prior to the data exchange.
     */
    private Double r21; // Resistance

    public Double getR21() {
        return r21;
    }

    public void setR21(Double _value_) {
        r21 = _value_;
    }

    private static Object getR21(BaseClass _this_) {
        return ((EquivalentBranch) _this_).getR21();
    }

    private static void setR21(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentBranch) _this_).setR21((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentBranch) _this_).setR21(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Positive sequence series reactance of the reduced branch.
     */
    private Double x; // Reactance

    public Double getX() {
        return x;
    }

    public void setX(Double _value_) {
        x = _value_;
    }

    private static Object getX(BaseClass _this_) {
        return ((EquivalentBranch) _this_).getX();
    }

    private static void setX(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentBranch) _this_).setX((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentBranch) _this_).setX(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactance from terminal sequence 2 to terminal sequence 1. Used for steady state power flow. This attribute is optional and represents an unbalanced network such as off-nominal phase shifter. If only EquivalentBranch.x is given, then EquivalentBranch.x21 is assumed equal to EquivalentBranch.x. Usage rule: EquivalentBranch is a result of network reduction prior to the data exchange.
     */
    private Double x21; // Reactance

    public Double getX21() {
        return x21;
    }

    public void setX21(Double _value_) {
        x21 = _value_;
    }

    private static Object getX21(BaseClass _this_) {
        return ((EquivalentBranch) _this_).getX21();
    }

    private static void setX21(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentBranch) _this_).setX21((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentBranch) _this_).setX21(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Zero sequence series resistance from terminal sequence  1 to terminal sequence 2. Used for short circuit data exchange according to IEC 60909. EquivalentBranch is a result of network reduction prior to the data exchange.
     */
    private Double zeroR12; // Resistance

    public Double getZeroR12() {
        return zeroR12;
    }

    public void setZeroR12(Double _value_) {
        zeroR12 = _value_;
    }

    private static Object getZeroR12(BaseClass _this_) {
        return ((EquivalentBranch) _this_).getZeroR12();
    }

    private static void setZeroR12(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentBranch) _this_).setZeroR12((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentBranch) _this_).setZeroR12(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Zero sequence series resistance from terminal sequence  2 to terminal sequence 1. Used for short circuit data exchange according to IEC 60909. Usage : EquivalentBranch is a result of network reduction prior to the data exchange.
     */
    private Double zeroR21; // Resistance

    public Double getZeroR21() {
        return zeroR21;
    }

    public void setZeroR21(Double _value_) {
        zeroR21 = _value_;
    }

    private static Object getZeroR21(BaseClass _this_) {
        return ((EquivalentBranch) _this_).getZeroR21();
    }

    private static void setZeroR21(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentBranch) _this_).setZeroR21((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentBranch) _this_).setZeroR21(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Zero sequence series reactance from terminal sequence  1 to terminal sequence 2. Used for short circuit data exchange according to IEC 60909. Usage : EquivalentBranch is a result of network reduction prior to the data exchange.
     */
    private Double zeroX12; // Reactance

    public Double getZeroX12() {
        return zeroX12;
    }

    public void setZeroX12(Double _value_) {
        zeroX12 = _value_;
    }

    private static Object getZeroX12(BaseClass _this_) {
        return ((EquivalentBranch) _this_).getZeroX12();
    }

    private static void setZeroX12(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentBranch) _this_).setZeroX12((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentBranch) _this_).setZeroX12(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Zero sequence series reactance from terminal sequence 2 to terminal sequence 1. Used for short circuit data exchange according to IEC 60909. Usage : EquivalentBranch is a result of network reduction prior to the data exchange.
     */
    private Double zeroX21; // Reactance

    public Double getZeroX21() {
        return zeroX21;
    }

    public void setZeroX21(Double _value_) {
        zeroX21 = _value_;
    }

    private static Object getZeroX21(BaseClass _this_) {
        return ((EquivalentBranch) _this_).getZeroX21();
    }

    private static void setZeroX21(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((EquivalentBranch) _this_).setZeroX21((Double) _value_);
        } else if (_value_ instanceof String) {
            ((EquivalentBranch) _this_).setZeroX21(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "EquivalentBranch", attrName));
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
                "EquivalentBranch", attrName, value));
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
            profiles.add(CGMESProfile.SC);
            map.put("negativeR12", new AttrDetails("EquivalentBranch.negativeR12", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, EquivalentBranch::getNegativeR12, EquivalentBranch::setNegativeR12));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("negativeR21", new AttrDetails("EquivalentBranch.negativeR21", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, EquivalentBranch::getNegativeR21, EquivalentBranch::setNegativeR21));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("negativeX12", new AttrDetails("EquivalentBranch.negativeX12", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, EquivalentBranch::getNegativeX12, EquivalentBranch::setNegativeX12));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("negativeX21", new AttrDetails("EquivalentBranch.negativeX21", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, EquivalentBranch::getNegativeX21, EquivalentBranch::setNegativeX21));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("positiveR12", new AttrDetails("EquivalentBranch.positiveR12", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, EquivalentBranch::getPositiveR12, EquivalentBranch::setPositiveR12));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("positiveR21", new AttrDetails("EquivalentBranch.positiveR21", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, EquivalentBranch::getPositiveR21, EquivalentBranch::setPositiveR21));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("positiveX12", new AttrDetails("EquivalentBranch.positiveX12", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, EquivalentBranch::getPositiveX12, EquivalentBranch::setPositiveX12));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("positiveX21", new AttrDetails("EquivalentBranch.positiveX21", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, EquivalentBranch::getPositiveX21, EquivalentBranch::setPositiveX21));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r", new AttrDetails("EquivalentBranch.r", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, EquivalentBranch::getR, EquivalentBranch::setR));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r21", new AttrDetails("EquivalentBranch.r21", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, EquivalentBranch::getR21, EquivalentBranch::setR21));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x", new AttrDetails("EquivalentBranch.x", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, EquivalentBranch::getX, EquivalentBranch::setX));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x21", new AttrDetails("EquivalentBranch.x21", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, EquivalentBranch::getX21, EquivalentBranch::setX21));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("zeroR12", new AttrDetails("EquivalentBranch.zeroR12", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, EquivalentBranch::getZeroR12, EquivalentBranch::setZeroR12));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("zeroR21", new AttrDetails("EquivalentBranch.zeroR21", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, EquivalentBranch::getZeroR21, EquivalentBranch::setZeroR21));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("zeroX12", new AttrDetails("EquivalentBranch.zeroX12", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, EquivalentBranch::getZeroX12, EquivalentBranch::setZeroX12));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("zeroX21", new AttrDetails("EquivalentBranch.zeroX21", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, EquivalentBranch::getZeroX21, EquivalentBranch::setZeroX21));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new EquivalentBranch(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.SC);
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
