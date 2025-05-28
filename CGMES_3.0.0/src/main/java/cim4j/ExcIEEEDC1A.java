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
 * IEEE 421.5-2005 type DC1A model. This model represents field-controlled DC commutator exciters with continuously acting voltage regulators (especially the direct-acting rheostatic, rotating amplifier, and magnetic amplifier types).  Because this model has been widely implemented by the industry, it is sometimes used to represent other types of systems when detailed data for them are not available or when a simplified model is required. Reference: IEEE 421.5-2005, 5.1.
 */
@SuppressWarnings("unused")
public class ExcIEEEDC1A extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcIEEEDC1A.class);

    /**
     * Constructor.
     */
    public ExcIEEEDC1A(String rdfid) {
        super("ExcIEEEDC1A", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcIEEEDC1A(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Exciter voltage at which exciter saturation is defined (<i>E</i><i><sub>FD1</sub></i>) (&gt; 0).  Typical value = 3,1.
     */
    private Double efd1; // PU

    public Double getEfd1() {
        return efd1;
    }

    public void setEfd1(Double _value_) {
        efd1 = _value_;
    }

    private static Object getEfd1(BaseClass _this_) {
        return ((ExcIEEEDC1A) _this_).getEfd1();
    }

    private static void setEfd1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEDC1A) _this_).setEfd1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEDC1A) _this_).setEfd1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter voltage at which exciter saturation is defined (<i>E</i><i><sub>FD2</sub></i>) (&gt; 0).  Typical value = 2,3.
     */
    private Double efd2; // PU

    public Double getEfd2() {
        return efd2;
    }

    public void setEfd2(Double _value_) {
        efd2 = _value_;
    }

    private static Object getEfd2(BaseClass _this_) {
        return ((ExcIEEEDC1A) _this_).getEfd2();
    }

    private static void setEfd2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEDC1A) _this_).setEfd2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEDC1A) _this_).setEfd2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * (<i>exclim</i>).  IEEE standard is ambiguous about lower limit on exciter output. true = a lower limit of zero is applied to integrator output false = a lower limit of zero is not applied to integrator output. Typical value = true.
     */
    private Boolean exclim; // Boolean

    public Boolean getExclim() {
        return exclim;
    }

    public void setExclim(Boolean _value_) {
        exclim = _value_;
    }

    private static Object getExclim(BaseClass _this_) {
        return ((ExcIEEEDC1A) _this_).getExclim();
    }

    private static void setExclim(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ExcIEEEDC1A) _this_).setExclim((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEDC1A) _this_).setExclim(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Voltage regulator gain (<i>K</i><i><sub>A</sub></i>) (&gt; 0).  Typical value = 46.
     */
    private Double ka; // PU

    public Double getKa() {
        return ka;
    }

    public void setKa(Double _value_) {
        ka = _value_;
    }

    private static Object getKa(BaseClass _this_) {
        return ((ExcIEEEDC1A) _this_).getKa();
    }

    private static void setKa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEDC1A) _this_).setKa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEDC1A) _this_).setKa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter constant related to self-excited field (<i>K</i><i><sub>E</sub></i>).  Typical value = 0.
     */
    private Double ke; // PU

    public Double getKe() {
        return ke;
    }

    public void setKe(Double _value_) {
        ke = _value_;
    }

    private static Object getKe(BaseClass _this_) {
        return ((ExcIEEEDC1A) _this_).getKe();
    }

    private static void setKe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEDC1A) _this_).setKe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEDC1A) _this_).setKe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Excitation control system stabilizer gain (<i>K</i><i><sub>F</sub></i>) (&gt;= 0).  Typical value = 0.1.
     */
    private Double kf; // PU

    public Double getKf() {
        return kf;
    }

    public void setKf(Double _value_) {
        kf = _value_;
    }

    private static Object getKf(BaseClass _this_) {
        return ((ExcIEEEDC1A) _this_).getKf();
    }

    private static void setKf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEDC1A) _this_).setKf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEDC1A) _this_).setKf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, <i>E</i><i><sub>FD1</sub></i> (<i>S</i><i><sub>E</sub></i><i>[E</i><i><sub>FD1</sub></i><i>]</i>) (&gt;= 0).  Typical value = 0.33.
     */
    private Float seefd1; // Float

    public Float getSeefd1() {
        return seefd1;
    }

    public void setSeefd1(Float _value_) {
        seefd1 = _value_;
    }

    private static Object getSeefd1(BaseClass _this_) {
        return ((ExcIEEEDC1A) _this_).getSeefd1();
    }

    private static void setSeefd1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExcIEEEDC1A) _this_).setSeefd1((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEDC1A) _this_).setSeefd1(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, <i>E</i><i><sub>FD2</sub></i> (<i>S</i><i><sub>E</sub></i><i>[E</i><i><sub>FD2</sub></i><i>]</i>) (&gt;= 0).  Typical value = 0,1.
     */
    private Float seefd2; // Float

    public Float getSeefd2() {
        return seefd2;
    }

    public void setSeefd2(Float _value_) {
        seefd2 = _value_;
    }

    private static Object getSeefd2(BaseClass _this_) {
        return ((ExcIEEEDC1A) _this_).getSeefd2();
    }

    private static void setSeefd2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((ExcIEEEDC1A) _this_).setSeefd2((Float) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEDC1A) _this_).setSeefd2(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Voltage regulator time constant (<i>T</i><i><sub>A</sub></i>) (&gt; 0).  Typical value = 0,06.
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((ExcIEEEDC1A) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEDC1A) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEDC1A) _this_).setTa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (<i>T</i><i><sub>B</sub></i>) (&gt;= 0).  Typical value = 0.
     */
    private Double tb; // Seconds

    public Double getTb() {
        return tb;
    }

    public void setTb(Double _value_) {
        tb = _value_;
    }

    private static Object getTb(BaseClass _this_) {
        return ((ExcIEEEDC1A) _this_).getTb();
    }

    private static void setTb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEDC1A) _this_).setTb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEDC1A) _this_).setTb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (<i>T</i><i><sub>C</sub></i>) (&gt;= 0).  Typical value = 0.
     */
    private Double tc; // Seconds

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    private static Object getTc(BaseClass _this_) {
        return ((ExcIEEEDC1A) _this_).getTc();
    }

    private static void setTc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEDC1A) _this_).setTc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEDC1A) _this_).setTc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter time constant, integration rate associated with exciter control (<i>T</i><i><sub>E</sub></i>) (&gt; 0).  Typical value = 0,46.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    private static Object getTe(BaseClass _this_) {
        return ((ExcIEEEDC1A) _this_).getTe();
    }

    private static void setTe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEDC1A) _this_).setTe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEDC1A) _this_).setTe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Excitation control system stabilizer time constant (<i>T</i><i><sub>F</sub></i>) (&gt; 0).  Typical value = 1.
     */
    private Double tf; // Seconds

    public Double getTf() {
        return tf;
    }

    public void setTf(Double _value_) {
        tf = _value_;
    }

    private static Object getTf(BaseClass _this_) {
        return ((ExcIEEEDC1A) _this_).getTf();
    }

    private static void setTf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEDC1A) _this_).setTf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEDC1A) _this_).setTf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * UEL input (<i>uelin</i>). true = input is connected to the HV gate false = input connects to the error signal. Typical value = true.
     */
    private Boolean uelin; // Boolean

    public Boolean getUelin() {
        return uelin;
    }

    public void setUelin(Boolean _value_) {
        uelin = _value_;
    }

    private static Object getUelin(BaseClass _this_) {
        return ((ExcIEEEDC1A) _this_).getUelin();
    }

    private static void setUelin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ExcIEEEDC1A) _this_).setUelin((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEDC1A) _this_).setUelin(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Maximum voltage regulator output (<i>V</i><i><sub>RMAX</sub></i>) (&gt; ExcIEEEDC1A.vrmin).  Typical value = 1.
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    private static Object getVrmax(BaseClass _this_) {
        return ((ExcIEEEDC1A) _this_).getVrmax();
    }

    private static void setVrmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEDC1A) _this_).setVrmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEDC1A) _this_).setVrmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator output (<i>V</i><i><sub>RMIN</sub></i>) (&lt; 0 and &lt; ExcIEEEDC1A.vrmax).  Typical value = -0,9.
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    private static Object getVrmin(BaseClass _this_) {
        return ((ExcIEEEDC1A) _this_).getVrmin();
    }

    private static void setVrmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcIEEEDC1A) _this_).setVrmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcIEEEDC1A) _this_).setVrmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcIEEEDC1A", attrName));
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
                "ExcIEEEDC1A", attrName, value));
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
            map.put("efd1", new AttrDetails("ExcIEEEDC1A.efd1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEDC1A::getEfd1, ExcIEEEDC1A::setEfd1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efd2", new AttrDetails("ExcIEEEDC1A.efd2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEDC1A::getEfd2, ExcIEEEDC1A::setEfd2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("exclim", new AttrDetails("ExcIEEEDC1A.exclim", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEDC1A::getExclim, ExcIEEEDC1A::setExclim));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("ExcIEEEDC1A.ka", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEDC1A::getKa, ExcIEEEDC1A::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcIEEEDC1A.ke", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEDC1A::getKe, ExcIEEEDC1A::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("ExcIEEEDC1A.kf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEDC1A::getKf, ExcIEEEDC1A::setKf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seefd1", new AttrDetails("ExcIEEEDC1A.seefd1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEDC1A::getSeefd1, ExcIEEEDC1A::setSeefd1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seefd2", new AttrDetails("ExcIEEEDC1A.seefd2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEDC1A::getSeefd2, ExcIEEEDC1A::setSeefd2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("ExcIEEEDC1A.ta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEDC1A::getTa, ExcIEEEDC1A::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("ExcIEEEDC1A.tb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEDC1A::getTb, ExcIEEEDC1A::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("ExcIEEEDC1A.tc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEDC1A::getTc, ExcIEEEDC1A::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcIEEEDC1A.te", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEDC1A::getTe, ExcIEEEDC1A::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("ExcIEEEDC1A.tf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEDC1A::getTf, ExcIEEEDC1A::setTf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uelin", new AttrDetails("ExcIEEEDC1A.uelin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEDC1A::getUelin, ExcIEEEDC1A::setUelin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcIEEEDC1A.vrmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEDC1A::getVrmax, ExcIEEEDC1A::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcIEEEDC1A.vrmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEDC1A::getVrmin, ExcIEEEDC1A::setVrmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcIEEEDC1A(null).allAttrDetailsMap());
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
