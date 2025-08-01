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
 * Pitch control emulator model.  Reference: IEC Standard 61400-27-1 Section 6.6.5.1.
 */
@SuppressWarnings("unused")
public class WindPitchContEmulIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindPitchContEmulIEC.class);

    /**
     * Constructor.
     */
    public WindPitchContEmulIEC(String rdfid) {
        super("WindPitchContEmulIEC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindPitchContEmulIEC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Wind turbine type 2 model with which this Pitch control emulator model is associated.
     *
     * NOT USED
     */
    private WindGenTurbineType2IEC WindGenTurbineType2IEC; // OneToOne

    private String WindGenTurbineType2IECId;

    public WindGenTurbineType2IEC getWindGenTurbineType2IEC() {
        return WindGenTurbineType2IEC;
    }

    public void setWindGenTurbineType2IEC(WindGenTurbineType2IEC _object_) {
        if (WindGenTurbineType2IEC != _object_) {
            WindGenTurbineType2IEC = _object_;
            _object_.setWindPitchContEmulIEC(this);
            WindGenTurbineType2IECId = _object_.getRdfid();
        }
    }

    private static Object getWindGenTurbineType2IEC(BaseClass _this_) {
        var obj = ((WindPitchContEmulIEC) _this_).getWindGenTurbineType2IEC();
        var id = ((WindPitchContEmulIEC) _this_).WindGenTurbineType2IECId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setWindGenTurbineType2IEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindPitchContEmulIEC) _this_).WindGenTurbineType2IECId = (String) _value_;
        } else if (_value_ instanceof WindGenTurbineType2IEC) {
            ((WindPitchContEmulIEC) _this_).setWindGenTurbineType2IEC((WindGenTurbineType2IEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindGenTurbineType2IEC");
        }
    }

    /**
     * Power error gain (). It is case dependent parameter.
     */
    private Double kdroop; // Simple_Float

    public Double getKdroop() {
        return kdroop;
    }

    public void setKdroop(Double _value_) {
        kdroop = _value_;
    }

    private static Object getKdroop(BaseClass _this_) {
        return ((WindPitchContEmulIEC) _this_).getKdroop();
    }

    private static void setKdroop(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPitchContEmulIEC) _this_).setKdroop((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPitchContEmulIEC) _this_).setKdroop(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Pitch control emulator integral constant (). It is type dependent parameter.
     */
    private Double kipce; // Simple_Float

    public Double getKipce() {
        return kipce;
    }

    public void setKipce(Double _value_) {
        kipce = _value_;
    }

    private static Object getKipce(BaseClass _this_) {
        return ((WindPitchContEmulIEC) _this_).getKipce();
    }

    private static void setKipce(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPitchContEmulIEC) _this_).setKipce((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPitchContEmulIEC) _this_).setKipce(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Aerodynamic power change vs. omegachange (). It is case dependent parameter.
     */
    private Double komegaaero; // PU

    public Double getKomegaaero() {
        return komegaaero;
    }

    public void setKomegaaero(Double _value_) {
        komegaaero = _value_;
    }

    private static Object getKomegaaero(BaseClass _this_) {
        return ((WindPitchContEmulIEC) _this_).getKomegaaero();
    }

    private static void setKomegaaero(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPitchContEmulIEC) _this_).setKomegaaero((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPitchContEmulIEC) _this_).setKomegaaero(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Pitch control emulator proportional constant (). It is type dependent parameter.
     */
    private Double kppce; // Simple_Float

    public Double getKppce() {
        return kppce;
    }

    public void setKppce(Double _value_) {
        kppce = _value_;
    }

    private static Object getKppce(BaseClass _this_) {
        return ((WindPitchContEmulIEC) _this_).getKppce();
    }

    private static void setKppce(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPitchContEmulIEC) _this_).setKppce((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPitchContEmulIEC) _this_).setKppce(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rotor speed in initial steady state (omega). It is case dependent parameter.
     */
    private Double omegaref; // PU

    public Double getOmegaref() {
        return omegaref;
    }

    public void setOmegaref(Double _value_) {
        omegaref = _value_;
    }

    private static Object getOmegaref(BaseClass _this_) {
        return ((WindPitchContEmulIEC) _this_).getOmegaref();
    }

    private static void setOmegaref(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPitchContEmulIEC) _this_).setOmegaref((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPitchContEmulIEC) _this_).setOmegaref(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum steady state power (). It is case dependent parameter.
     */
    private Double pimax; // PU

    public Double getPimax() {
        return pimax;
    }

    public void setPimax(Double _value_) {
        pimax = _value_;
    }

    private static Object getPimax(BaseClass _this_) {
        return ((WindPitchContEmulIEC) _this_).getPimax();
    }

    private static void setPimax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPitchContEmulIEC) _this_).setPimax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPitchContEmulIEC) _this_).setPimax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum steady state power (). It is case dependent parameter.
     */
    private Double pimin; // PU

    public Double getPimin() {
        return pimin;
    }

    public void setPimin(Double _value_) {
        pimin = _value_;
    }

    private static Object getPimin(BaseClass _this_) {
        return ((WindPitchContEmulIEC) _this_).getPimin();
    }

    private static void setPimin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPitchContEmulIEC) _this_).setPimin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPitchContEmulIEC) _this_).setPimin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * First time constant in pitch control lag (). It is type dependent parameter.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    private static Object getT1(BaseClass _this_) {
        return ((WindPitchContEmulIEC) _this_).getT1();
    }

    private static void setT1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPitchContEmulIEC) _this_).setT1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPitchContEmulIEC) _this_).setT1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Second time constant in pitch control lag (). It is type dependent parameter.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    private static Object getT2(BaseClass _this_) {
        return ((WindPitchContEmulIEC) _this_).getT2();
    }

    private static void setT2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPitchContEmulIEC) _this_).setT2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPitchContEmulIEC) _this_).setT2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant in generator air gap power lag (). It is type dependent parameter.
     */
    private Double tpe; // Seconds

    public Double getTpe() {
        return tpe;
    }

    public void setTpe(Double _value_) {
        tpe = _value_;
    }

    private static Object getTpe(BaseClass _this_) {
        return ((WindPitchContEmulIEC) _this_).getTpe();
    }

    private static void setTpe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPitchContEmulIEC) _this_).setTpe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPitchContEmulIEC) _this_).setTpe(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindPitchContEmulIEC", attrName));
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
                "WindPitchContEmulIEC", attrName, value));
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
            map.put("WindGenTurbineType2IEC", new AttrDetails("WindPitchContEmulIEC.WindGenTurbineType2IEC", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindPitchContEmulIEC::getWindGenTurbineType2IEC, WindPitchContEmulIEC::setWindGenTurbineType2IEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kdroop", new AttrDetails("WindPitchContEmulIEC.kdroop", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPitchContEmulIEC::getKdroop, WindPitchContEmulIEC::setKdroop));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kipce", new AttrDetails("WindPitchContEmulIEC.kipce", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPitchContEmulIEC::getKipce, WindPitchContEmulIEC::setKipce));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("komegaaero", new AttrDetails("WindPitchContEmulIEC.komegaaero", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPitchContEmulIEC::getKomegaaero, WindPitchContEmulIEC::setKomegaaero));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kppce", new AttrDetails("WindPitchContEmulIEC.kppce", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPitchContEmulIEC::getKppce, WindPitchContEmulIEC::setKppce));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omegaref", new AttrDetails("WindPitchContEmulIEC.omegaref", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPitchContEmulIEC::getOmegaref, WindPitchContEmulIEC::setOmegaref));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pimax", new AttrDetails("WindPitchContEmulIEC.pimax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPitchContEmulIEC::getPimax, WindPitchContEmulIEC::setPimax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pimin", new AttrDetails("WindPitchContEmulIEC.pimin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPitchContEmulIEC::getPimin, WindPitchContEmulIEC::setPimin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("WindPitchContEmulIEC.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPitchContEmulIEC::getT1, WindPitchContEmulIEC::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("WindPitchContEmulIEC.t2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPitchContEmulIEC::getT2, WindPitchContEmulIEC::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpe", new AttrDetails("WindPitchContEmulIEC.tpe", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPitchContEmulIEC::getTpe, WindPitchContEmulIEC::setTpe));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindPitchContEmulIEC(null).allAttrDetailsMap());
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
