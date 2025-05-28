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
 * Rotor resistance control model. Reference: IEC 61400-27-1:2015, 5.6.5.3.
 */
@SuppressWarnings("unused")
public class WindContRotorRIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindContRotorRIEC.class);

    /**
     * Constructor.
     */
    public WindContRotorRIEC(String rdfid) {
        super("WindContRotorRIEC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindContRotorRIEC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The wind dynamics lookup table associated with this rotor resistance control model.
     *
     * NOT USED
     */
    private Set<WindDynamicsLookupTable> WindDynamicsLookupTable = new HashSet<>(); // OneToMany

    public Set<WindDynamicsLookupTable> getWindDynamicsLookupTable() {
        return WindDynamicsLookupTable;
    }

    public void setWindDynamicsLookupTable(WindDynamicsLookupTable _object_) {
        if (!WindDynamicsLookupTable.contains(_object_)) {
            WindDynamicsLookupTable.add(_object_);
            _object_.setWindContRotorRIEC(this);
        }
    }

    private static Object getWindDynamicsLookupTable(BaseClass _this_) {
        return ((WindContRotorRIEC) _this_).getWindDynamicsLookupTable();
    }

    private static void setWindDynamicsLookupTable(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindDynamicsLookupTable) {
            ((WindContRotorRIEC) _this_).setWindDynamicsLookupTable((WindDynamicsLookupTable) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindDynamicsLookupTable");
        }
    }

    /**
     * Wind turbine type 2 model with whitch this wind control rotor resistance model is associated.
     *
     * NOT USED
     */
    private WindGenTurbineType2IEC WindGenTurbineType2IEC; // OneToOne

    public WindGenTurbineType2IEC getWindGenTurbineType2IEC() {
        return WindGenTurbineType2IEC;
    }

    public void setWindGenTurbineType2IEC(WindGenTurbineType2IEC _object_) {
        if (WindGenTurbineType2IEC != _object_) {
            WindGenTurbineType2IEC = _object_;
            WindGenTurbineType2IEC.setWindContRotorRIEC(this);
        }
    }

    private static Object getWindGenTurbineType2IEC(BaseClass _this_) {
        return ((WindContRotorRIEC) _this_).getWindGenTurbineType2IEC();
    }

    private static void setWindGenTurbineType2IEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindGenTurbineType2IEC) {
            ((WindContRotorRIEC) _this_).setWindGenTurbineType2IEC((WindGenTurbineType2IEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindGenTurbineType2IEC");
        }
    }

    /**
     * Integral gain in rotor resistance PI controller (<i>K</i><i><sub>Irr</sub></i>). It is a type-dependent parameter.
     */
    private Double kirr; // PU

    public Double getKirr() {
        return kirr;
    }

    public void setKirr(Double _value_) {
        kirr = _value_;
    }

    private static Object getKirr(BaseClass _this_) {
        return ((WindContRotorRIEC) _this_).getKirr();
    }

    private static void setKirr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContRotorRIEC) _this_).setKirr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContRotorRIEC) _this_).setKirr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter gain for generator speed measurement (<i>K</i><i><sub>omegafilt</sub></i>). It is a type-dependent parameter.
     */
    private Float komegafilt; // Float

    public Float getKomegafilt() {
        return komegafilt;
    }

    public void setKomegafilt(Float _value_) {
        komegafilt = _value_;
    }

    private static Object getKomegafilt(BaseClass _this_) {
        return ((WindContRotorRIEC) _this_).getKomegafilt();
    }

    private static void setKomegafilt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((WindContRotorRIEC) _this_).setKomegafilt((Float) _value_);
        } else if (_value_ instanceof String) {
            ((WindContRotorRIEC) _this_).setKomegafilt(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Filter gain for power measurement (<i>K</i><i><sub>pfilt</sub></i>). It is a type-dependent parameter.
     */
    private Float kpfilt; // Float

    public Float getKpfilt() {
        return kpfilt;
    }

    public void setKpfilt(Float _value_) {
        kpfilt = _value_;
    }

    private static Object getKpfilt(BaseClass _this_) {
        return ((WindContRotorRIEC) _this_).getKpfilt();
    }

    private static void setKpfilt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((WindContRotorRIEC) _this_).setKpfilt((Float) _value_);
        } else if (_value_ instanceof String) {
            ((WindContRotorRIEC) _this_).setKpfilt(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Proportional gain in rotor resistance PI controller (<i>K</i><i><sub>Prr</sub></i>). It is a type-dependent parameter.
     */
    private Double kprr; // PU

    public Double getKprr() {
        return kprr;
    }

    public void setKprr(Double _value_) {
        kprr = _value_;
    }

    private static Object getKprr(BaseClass _this_) {
        return ((WindContRotorRIEC) _this_).getKprr();
    }

    private static void setKprr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContRotorRIEC) _this_).setKprr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContRotorRIEC) _this_).setKprr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum rotor resistance (<i>r</i><i><sub>max</sub></i>) (&gt; WindContRotorRIEC.rmin). It is a type-dependent parameter.
     */
    private Double rmax; // PU

    public Double getRmax() {
        return rmax;
    }

    public void setRmax(Double _value_) {
        rmax = _value_;
    }

    private static Object getRmax(BaseClass _this_) {
        return ((WindContRotorRIEC) _this_).getRmax();
    }

    private static void setRmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContRotorRIEC) _this_).setRmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContRotorRIEC) _this_).setRmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum rotor resistance (<i>r</i><i><sub>min</sub></i>) (&lt; WindContRotorRIEC.rmax). It is a type-dependent parameter.
     */
    private Double rmin; // PU

    public Double getRmin() {
        return rmin;
    }

    public void setRmin(Double _value_) {
        rmin = _value_;
    }

    private static Object getRmin(BaseClass _this_) {
        return ((WindContRotorRIEC) _this_).getRmin();
    }

    private static void setRmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContRotorRIEC) _this_).setRmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContRotorRIEC) _this_).setRmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter time constant for generator speed measurement (<i>T</i><i><sub>omegafiltrr</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     */
    private Double tomegafiltrr; // Seconds

    public Double getTomegafiltrr() {
        return tomegafiltrr;
    }

    public void setTomegafiltrr(Double _value_) {
        tomegafiltrr = _value_;
    }

    private static Object getTomegafiltrr(BaseClass _this_) {
        return ((WindContRotorRIEC) _this_).getTomegafiltrr();
    }

    private static void setTomegafiltrr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContRotorRIEC) _this_).setTomegafiltrr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContRotorRIEC) _this_).setTomegafiltrr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter time constant for power measurement (<i>T</i><i><sub>pfiltrr</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     */
    private Double tpfiltrr; // Seconds

    public Double getTpfiltrr() {
        return tpfiltrr;
    }

    public void setTpfiltrr(Double _value_) {
        tpfiltrr = _value_;
    }

    private static Object getTpfiltrr(BaseClass _this_) {
        return ((WindContRotorRIEC) _this_).getTpfiltrr();
    }

    private static void setTpfiltrr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindContRotorRIEC) _this_).setTpfiltrr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindContRotorRIEC) _this_).setTpfiltrr(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindContRotorRIEC", attrName));
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
                "WindContRotorRIEC", attrName, value));
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
            map.put("WindDynamicsLookupTable", new AttrDetails("WindContRotorRIEC.WindDynamicsLookupTable", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindContRotorRIEC::getWindDynamicsLookupTable, WindContRotorRIEC::setWindDynamicsLookupTable));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindGenTurbineType2IEC", new AttrDetails("WindContRotorRIEC.WindGenTurbineType2IEC", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindContRotorRIEC::getWindGenTurbineType2IEC, WindContRotorRIEC::setWindGenTurbineType2IEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kirr", new AttrDetails("WindContRotorRIEC.kirr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContRotorRIEC::getKirr, WindContRotorRIEC::setKirr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("komegafilt", new AttrDetails("WindContRotorRIEC.komegafilt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContRotorRIEC::getKomegafilt, WindContRotorRIEC::setKomegafilt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpfilt", new AttrDetails("WindContRotorRIEC.kpfilt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContRotorRIEC::getKpfilt, WindContRotorRIEC::setKpfilt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kprr", new AttrDetails("WindContRotorRIEC.kprr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContRotorRIEC::getKprr, WindContRotorRIEC::setKprr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rmax", new AttrDetails("WindContRotorRIEC.rmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContRotorRIEC::getRmax, WindContRotorRIEC::setRmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rmin", new AttrDetails("WindContRotorRIEC.rmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContRotorRIEC::getRmin, WindContRotorRIEC::setRmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tomegafiltrr", new AttrDetails("WindContRotorRIEC.tomegafiltrr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContRotorRIEC::getTomegafiltrr, WindContRotorRIEC::setTomegafiltrr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpfiltrr", new AttrDetails("WindContRotorRIEC.tpfiltrr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContRotorRIEC::getTpfiltrr, WindContRotorRIEC::setTpfiltrr));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindContRotorRIEC(null).allAttrDetailsMap());
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
