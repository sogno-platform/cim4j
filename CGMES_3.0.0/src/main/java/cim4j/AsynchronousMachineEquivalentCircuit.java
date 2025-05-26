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
 * The electrical equations of all variations of the asynchronous model are based on the AsynchronousEquivalentCircuit diagram for the direct- and quadrature- axes, with two equivalent rotor windings in each axis.   Equations for conversion between equivalent circuit and time constant reactance forms: <i>Xs</i> = <i>Xm</i> + <i>Xl</i> <i>X'</i> = <i>Xl</i> + <i>Xm</i> x <i>Xlr1 </i>/ (<i>Xm </i>+ <i>Xlr1</i>) <i>X''</i> = <i>Xl</i> + <i>Xm</i> x <i>Xlr1</i> x <i>Xlr2</i> / (<i>Xm</i> x <i>Xlr1</i> + <i>Xm</i> x <i>Xlr2</i> + <i>Xlr1</i> x <i>Xlr2</i>) <i>T'o</i> = (<i>Xm</i> + <i>Xlr1</i>) / (<i>omega</i><i><sub>0</sub></i> x <i>Rr1</i>) <i>T''o</i> = (<i>Xm</i> x <i>Xlr1</i> + <i>Xm</i> x <i>Xlr2</i> + <i>Xlr1</i> x <i>Xlr2</i>) / (<i>omega</i><i><sub>0</sub></i> x <i>Rr2</i> x (<i>Xm</i> + <i>Xlr1</i>) Same equations using CIM attributes from AsynchronousMachineTimeConstantReactance class on left of "=" and AsynchronousMachineEquivalentCircuit class on right (except as noted): xs = xm + RotatingMachineDynamics.statorLeakageReactance xp = RotatingMachineDynamics.statorLeakageReactance + xm x xlr1 / (xm + xlr1) xpp = RotatingMachineDynamics.statorLeakageReactance + xm x xlr1 x xlr2 / (xm x xlr1 + xm x xlr2 + xlr1 x xlr2) tpo = (xm + xlr1) / (2 x pi x nominal frequency x rr1) tppo = (xm x xlr1 + xm x xlr2 + xlr1 x xlr2) / (2 x pi x nominal frequency x rr2 x (xm + xlr1).
 */
@SuppressWarnings("unused")
public class AsynchronousMachineEquivalentCircuit extends AsynchronousMachineDynamics {

    private static final Logging LOG = Logging.getLogger(AsynchronousMachineEquivalentCircuit.class);

    /**
     * Constructor.
     */
    public AsynchronousMachineEquivalentCircuit(String rdfid) {
        super("AsynchronousMachineEquivalentCircuit", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected AsynchronousMachineEquivalentCircuit(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Damper 1 winding resistance.
     */
    private Double rr1; // PU

    public Double getRr1() {
        return rr1;
    }

    public void setRr1(Double _value_) {
        rr1 = _value_;
    }

    private static Object getRr1(BaseClass _this_) {
        return ((AsynchronousMachineEquivalentCircuit) _this_).getRr1();
    }

    private static void setRr1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((AsynchronousMachineEquivalentCircuit) _this_).setRr1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((AsynchronousMachineEquivalentCircuit) _this_).setRr1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Damper 2 winding resistance.
     */
    private Double rr2; // PU

    public Double getRr2() {
        return rr2;
    }

    public void setRr2(Double _value_) {
        rr2 = _value_;
    }

    private static Object getRr2(BaseClass _this_) {
        return ((AsynchronousMachineEquivalentCircuit) _this_).getRr2();
    }

    private static void setRr2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((AsynchronousMachineEquivalentCircuit) _this_).setRr2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((AsynchronousMachineEquivalentCircuit) _this_).setRr2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Damper 1 winding leakage reactance.
     */
    private Double xlr1; // PU

    public Double getXlr1() {
        return xlr1;
    }

    public void setXlr1(Double _value_) {
        xlr1 = _value_;
    }

    private static Object getXlr1(BaseClass _this_) {
        return ((AsynchronousMachineEquivalentCircuit) _this_).getXlr1();
    }

    private static void setXlr1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((AsynchronousMachineEquivalentCircuit) _this_).setXlr1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((AsynchronousMachineEquivalentCircuit) _this_).setXlr1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Damper 2 winding leakage reactance.
     */
    private Double xlr2; // PU

    public Double getXlr2() {
        return xlr2;
    }

    public void setXlr2(Double _value_) {
        xlr2 = _value_;
    }

    private static Object getXlr2(BaseClass _this_) {
        return ((AsynchronousMachineEquivalentCircuit) _this_).getXlr2();
    }

    private static void setXlr2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((AsynchronousMachineEquivalentCircuit) _this_).setXlr2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((AsynchronousMachineEquivalentCircuit) _this_).setXlr2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Magnetizing reactance.
     */
    private Double xm; // PU

    public Double getXm() {
        return xm;
    }

    public void setXm(Double _value_) {
        xm = _value_;
    }

    private static Object getXm(BaseClass _this_) {
        return ((AsynchronousMachineEquivalentCircuit) _this_).getXm();
    }

    private static void setXm(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((AsynchronousMachineEquivalentCircuit) _this_).setXm((Double) _value_);
        } else if (_value_ instanceof String) {
            ((AsynchronousMachineEquivalentCircuit) _this_).setXm(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "AsynchronousMachineEquivalentCircuit", attrName));
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
                "AsynchronousMachineEquivalentCircuit", attrName, value));
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
            map.put("rr1", new AttrDetails("AsynchronousMachineEquivalentCircuit.rr1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, AsynchronousMachineEquivalentCircuit::getRr1, AsynchronousMachineEquivalentCircuit::setRr1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rr2", new AttrDetails("AsynchronousMachineEquivalentCircuit.rr2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, AsynchronousMachineEquivalentCircuit::getRr2, AsynchronousMachineEquivalentCircuit::setRr2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xlr1", new AttrDetails("AsynchronousMachineEquivalentCircuit.xlr1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, AsynchronousMachineEquivalentCircuit::getXlr1, AsynchronousMachineEquivalentCircuit::setXlr1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xlr2", new AttrDetails("AsynchronousMachineEquivalentCircuit.xlr2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, AsynchronousMachineEquivalentCircuit::getXlr2, AsynchronousMachineEquivalentCircuit::setXlr2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xm", new AttrDetails("AsynchronousMachineEquivalentCircuit.xm", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, AsynchronousMachineEquivalentCircuit::getXm, AsynchronousMachineEquivalentCircuit::setXm));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new AsynchronousMachineEquivalentCircuit(null).allAttrDetailsMap());
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
