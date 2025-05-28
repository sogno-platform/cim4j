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
 * Synchronous machine detailed modelling types are defined by the combination of the attributes SynchronousMachineTimeConstantReactance.modelType and SynchronousMachineTimeConstantReactance.rotorType.     The parameters used for models expressed in time constant reactance form include:
 */
@SuppressWarnings("unused")
public class SynchronousMachineTimeConstantReactance extends SynchronousMachineDetailed {

    private static final Logging LOG = Logging.getLogger(SynchronousMachineTimeConstantReactance.class);

    /**
     * Constructor.
     */
    public SynchronousMachineTimeConstantReactance(String rdfid) {
        super("SynchronousMachineTimeConstantReactance", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected SynchronousMachineTimeConstantReactance(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Saturation loading correction factor (Ks) (>= 0).  Used only by Type J model.  Typical Value = 0.
     */
    private Double ks; // Simple_Float

    public Double getKs() {
        return ks;
    }

    public void setKs(Double _value_) {
        ks = _value_;
    }

    private static Object getKs(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).getKs();
    }

    private static void setKs(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineTimeConstantReactance) _this_).setKs((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineTimeConstantReactance) _this_).setKs(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Type of synchronous machine model used in Dynamic simulation applications.
     */
    private String modelType; // SynchronousMachineModelKind

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String _value_) {
        modelType = _value_;
    }

    private static Object getModelType(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).getModelType();
    }

    private static void setModelType(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((SynchronousMachineTimeConstantReactance) _this_).setModelType((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Type of rotor on physical machine.
     */
    private String rotorType; // RotorKind

    public String getRotorType() {
        return rotorType;
    }

    public void setRotorType(String _value_) {
        rotorType = _value_;
    }

    private static Object getRotorType(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).getRotorType();
    }

    private static void setRotorType(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((SynchronousMachineTimeConstantReactance) _this_).setRotorType((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Damping time constant for `Canay` reactance.  Typical Value = 0.
     */
    private Double tc; // Seconds

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    private static Object getTc(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).getTc();
    }

    private static void setTc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineTimeConstantReactance) _this_).setTc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineTimeConstantReactance) _this_).setTc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Direct-axis transient rotor time constant (T`do) (> T``do).  Typical Value = 5.
     */
    private Double tpdo; // Seconds

    public Double getTpdo() {
        return tpdo;
    }

    public void setTpdo(Double _value_) {
        tpdo = _value_;
    }

    private static Object getTpdo(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).getTpdo();
    }

    private static void setTpdo(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineTimeConstantReactance) _this_).setTpdo((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineTimeConstantReactance) _this_).setTpdo(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Direct-axis subtransient rotor time constant (T``do) (> 0).  Typical Value = 0.03.
     */
    private Double tppdo; // Seconds

    public Double getTppdo() {
        return tppdo;
    }

    public void setTppdo(Double _value_) {
        tppdo = _value_;
    }

    private static Object getTppdo(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).getTppdo();
    }

    private static void setTppdo(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineTimeConstantReactance) _this_).setTppdo((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineTimeConstantReactance) _this_).setTppdo(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Quadrature-axis subtransient rotor time constant (T``qo) (> 0). Typical Value = 0.03.
     */
    private Double tppqo; // Seconds

    public Double getTppqo() {
        return tppqo;
    }

    public void setTppqo(Double _value_) {
        tppqo = _value_;
    }

    private static Object getTppqo(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).getTppqo();
    }

    private static void setTppqo(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineTimeConstantReactance) _this_).setTppqo((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineTimeConstantReactance) _this_).setTppqo(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Quadrature-axis transient rotor time constant (T`qo) (> T``qo). Typical Value = 0.5.
     */
    private Double tpqo; // Seconds

    public Double getTpqo() {
        return tpqo;
    }

    public void setTpqo(Double _value_) {
        tpqo = _value_;
    }

    private static Object getTpqo(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).getTpqo();
    }

    private static void setTpqo(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineTimeConstantReactance) _this_).setTpqo((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineTimeConstantReactance) _this_).setTpqo(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Direct-axis subtransient reactance (unsaturated) (X``d) (> Xl).  Typical Value = 0.2.
     */
    private Double xDirectSubtrans; // PU

    public Double getXDirectSubtrans() {
        return xDirectSubtrans;
    }

    public void setXDirectSubtrans(Double _value_) {
        xDirectSubtrans = _value_;
    }

    private static Object getXDirectSubtrans(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).getXDirectSubtrans();
    }

    private static void setXDirectSubtrans(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineTimeConstantReactance) _this_).setXDirectSubtrans((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineTimeConstantReactance) _this_).setXDirectSubtrans(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Direct-axis synchronous reactance (Xd) (>= X`d). The quotient of a sustained value of that AC component of armature voltage that is produced by the total direct-axis flux due to direct-axis armature current and the value of the AC component of this current, the machine running at rated speed. Typical Value = 1.8.
     */
    private Double xDirectSync; // PU

    public Double getXDirectSync() {
        return xDirectSync;
    }

    public void setXDirectSync(Double _value_) {
        xDirectSync = _value_;
    }

    private static Object getXDirectSync(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).getXDirectSync();
    }

    private static void setXDirectSync(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineTimeConstantReactance) _this_).setXDirectSync((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineTimeConstantReactance) _this_).setXDirectSync(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Direct-axis transient reactance (unsaturated) (X`d) (> =X``d).  Typical Value = 0.5.
     */
    private Double xDirectTrans; // PU

    public Double getXDirectTrans() {
        return xDirectTrans;
    }

    public void setXDirectTrans(Double _value_) {
        xDirectTrans = _value_;
    }

    private static Object getXDirectTrans(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).getXDirectTrans();
    }

    private static void setXDirectTrans(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineTimeConstantReactance) _this_).setXDirectTrans((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineTimeConstantReactance) _this_).setXDirectTrans(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Quadrature-axis subtransient reactance (X``q) (> Xl).  Typical Value = 0.2.
     */
    private Double xQuadSubtrans; // PU

    public Double getXQuadSubtrans() {
        return xQuadSubtrans;
    }

    public void setXQuadSubtrans(Double _value_) {
        xQuadSubtrans = _value_;
    }

    private static Object getXQuadSubtrans(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).getXQuadSubtrans();
    }

    private static void setXQuadSubtrans(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineTimeConstantReactance) _this_).setXQuadSubtrans((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineTimeConstantReactance) _this_).setXQuadSubtrans(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Quadrature-axis synchronous reactance (Xq) (> =X`q). The ratio of the component of reactive armature voltage, due to the quadrature-axis component of armature current, to this component of current, under steady state conditions and at rated frequency.  Typical Value = 1.6.
     */
    private Double xQuadSync; // PU

    public Double getXQuadSync() {
        return xQuadSync;
    }

    public void setXQuadSync(Double _value_) {
        xQuadSync = _value_;
    }

    private static Object getXQuadSync(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).getXQuadSync();
    }

    private static void setXQuadSync(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineTimeConstantReactance) _this_).setXQuadSync((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineTimeConstantReactance) _this_).setXQuadSync(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Quadrature-axis transient reactance (X`q) (> =X``q).  Typical Value = 0.3.
     */
    private Double xQuadTrans; // PU

    public Double getXQuadTrans() {
        return xQuadTrans;
    }

    public void setXQuadTrans(Double _value_) {
        xQuadTrans = _value_;
    }

    private static Object getXQuadTrans(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).getXQuadTrans();
    }

    private static void setXQuadTrans(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((SynchronousMachineTimeConstantReactance) _this_).setXQuadTrans((Double) _value_);
        } else if (_value_ instanceof String) {
            ((SynchronousMachineTimeConstantReactance) _this_).setXQuadTrans(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "SynchronousMachineTimeConstantReactance", attrName));
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
                "SynchronousMachineTimeConstantReactance", attrName, value));
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
            map.put("ks", new AttrDetails("SynchronousMachineTimeConstantReactance.ks", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachineTimeConstantReactance::getKs, SynchronousMachineTimeConstantReactance::setKs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("modelType", new AttrDetails("SynchronousMachineTimeConstantReactance.modelType", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, SynchronousMachineTimeConstantReactance::getModelType, SynchronousMachineTimeConstantReactance::setModelType));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rotorType", new AttrDetails("SynchronousMachineTimeConstantReactance.rotorType", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, SynchronousMachineTimeConstantReactance::getRotorType, SynchronousMachineTimeConstantReactance::setRotorType));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("SynchronousMachineTimeConstantReactance.tc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachineTimeConstantReactance::getTc, SynchronousMachineTimeConstantReactance::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpdo", new AttrDetails("SynchronousMachineTimeConstantReactance.tpdo", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachineTimeConstantReactance::getTpdo, SynchronousMachineTimeConstantReactance::setTpdo));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tppdo", new AttrDetails("SynchronousMachineTimeConstantReactance.tppdo", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachineTimeConstantReactance::getTppdo, SynchronousMachineTimeConstantReactance::setTppdo));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tppqo", new AttrDetails("SynchronousMachineTimeConstantReactance.tppqo", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachineTimeConstantReactance::getTppqo, SynchronousMachineTimeConstantReactance::setTppqo));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpqo", new AttrDetails("SynchronousMachineTimeConstantReactance.tpqo", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachineTimeConstantReactance::getTpqo, SynchronousMachineTimeConstantReactance::setTpqo));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xDirectSubtrans", new AttrDetails("SynchronousMachineTimeConstantReactance.xDirectSubtrans", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachineTimeConstantReactance::getXDirectSubtrans, SynchronousMachineTimeConstantReactance::setXDirectSubtrans));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xDirectSync", new AttrDetails("SynchronousMachineTimeConstantReactance.xDirectSync", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachineTimeConstantReactance::getXDirectSync, SynchronousMachineTimeConstantReactance::setXDirectSync));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xDirectTrans", new AttrDetails("SynchronousMachineTimeConstantReactance.xDirectTrans", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachineTimeConstantReactance::getXDirectTrans, SynchronousMachineTimeConstantReactance::setXDirectTrans));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xQuadSubtrans", new AttrDetails("SynchronousMachineTimeConstantReactance.xQuadSubtrans", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachineTimeConstantReactance::getXQuadSubtrans, SynchronousMachineTimeConstantReactance::setXQuadSubtrans));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xQuadSync", new AttrDetails("SynchronousMachineTimeConstantReactance.xQuadSync", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachineTimeConstantReactance::getXQuadSync, SynchronousMachineTimeConstantReactance::setXQuadSync));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xQuadTrans", new AttrDetails("SynchronousMachineTimeConstantReactance.xQuadTrans", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, SynchronousMachineTimeConstantReactance::getXQuadTrans, SynchronousMachineTimeConstantReactance::setXQuadTrans));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new SynchronousMachineTimeConstantReactance(null).allAttrDetailsMap());
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
