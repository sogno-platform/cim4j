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
 * Proportional/Integral Regulator Excitation System Model.  This model can be used to represent excitation systems with a proportional-integral (PI) voltage regulator controller.
 */
@SuppressWarnings("unused")
public class ExcPIC extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcPIC.class);

    /**
     * Constructor.
     */
    public ExcPIC(String rdfid) {
        super("ExcPIC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcPIC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Field voltage value 1 (E1).  Typical Value = 0.
     */
    private Double e1; // PU

    public Double getE1() {
        return e1;
    }

    public void setE1(Double _value_) {
        e1 = _value_;
    }

    private static Object getE1(BaseClass _this_) {
        return ((ExcPIC) _this_).getE1();
    }

    private static void setE1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setE1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setE1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Field voltage value 2 (E2).  Typical Value = 0.
     */
    private Double e2; // PU

    public Double getE2() {
        return e2;
    }

    public void setE2(Double _value_) {
        e2 = _value_;
    }

    private static Object getE2(BaseClass _this_) {
        return ((ExcPIC) _this_).getE2();
    }

    private static void setE2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setE2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setE2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter maximum limit (Efdmax).  Typical Value = 8.
     */
    private Double efdmax; // PU

    public Double getEfdmax() {
        return efdmax;
    }

    public void setEfdmax(Double _value_) {
        efdmax = _value_;
    }

    private static Object getEfdmax(BaseClass _this_) {
        return ((ExcPIC) _this_).getEfdmax();
    }

    private static void setEfdmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setEfdmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setEfdmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter minimum limit (Efdmin).  Typical Value = -0.87.
     */
    private Double efdmin; // PU

    public Double getEfdmin() {
        return efdmin;
    }

    public void setEfdmin(Double _value_) {
        efdmin = _value_;
    }

    private static Object getEfdmin(BaseClass _this_) {
        return ((ExcPIC) _this_).getEfdmin();
    }

    private static void setEfdmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setEfdmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setEfdmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * PI controller gain (Ka).  Typical Value = 3.15.
     */
    private Double ka; // PU

    public Double getKa() {
        return ka;
    }

    public void setKa(Double _value_) {
        ka = _value_;
    }

    private static Object getKa(BaseClass _this_) {
        return ((ExcPIC) _this_).getKa();
    }

    private static void setKa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setKa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setKa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter regulation factor (Kc).  Typical Value = 0.08.
     */
    private Double kc; // PU

    public Double getKc() {
        return kc;
    }

    public void setKc(Double _value_) {
        kc = _value_;
    }

    private static Object getKc(BaseClass _this_) {
        return ((ExcPIC) _this_).getKc();
    }

    private static void setKc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setKc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setKc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter constant (Ke).  Typical Value = 0.
     */
    private Double ke; // PU

    public Double getKe() {
        return ke;
    }

    public void setKe(Double _value_) {
        ke = _value_;
    }

    private static Object getKe(BaseClass _this_) {
        return ((ExcPIC) _this_).getKe();
    }

    private static void setKe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setKe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setKe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rate feedback gain (Kf).  Typical Value = 0.
     */
    private Double kf; // PU

    public Double getKf() {
        return kf;
    }

    public void setKf(Double _value_) {
        kf = _value_;
    }

    private static Object getKf(BaseClass _this_) {
        return ((ExcPIC) _this_).getKf();
    }

    private static void setKf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setKf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setKf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Current source gain (Ki).  Typical Value = 0.
     */
    private Double ki; // PU

    public Double getKi() {
        return ki;
    }

    public void setKi(Double _value_) {
        ki = _value_;
    }

    private static Object getKi(BaseClass _this_) {
        return ((ExcPIC) _this_).getKi();
    }

    private static void setKi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setKi((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setKi(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Potential source gain (Kp).  Typical Value = 6.5.
     */
    private Double kp; // PU

    public Double getKp() {
        return kp;
    }

    public void setKp(Double _value_) {
        kp = _value_;
    }

    private static Object getKp(BaseClass _this_) {
        return ((ExcPIC) _this_).getKp();
    }

    private static void setKp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setKp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setKp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Saturation factor at E1 (Se1).  Typical Value = 0.
     */
    private Double se1; // PU

    public Double getSe1() {
        return se1;
    }

    public void setSe1(Double _value_) {
        se1 = _value_;
    }

    private static Object getSe1(BaseClass _this_) {
        return ((ExcPIC) _this_).getSe1();
    }

    private static void setSe1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setSe1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setSe1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Saturation factor at E2 (Se2).  Typical Value = 0.
     */
    private Double se2; // PU

    public Double getSe2() {
        return se2;
    }

    public void setSe2(Double _value_) {
        se2 = _value_;
    }

    private static Object getSe2(BaseClass _this_) {
        return ((ExcPIC) _this_).getSe2();
    }

    private static void setSe2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setSe2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setSe2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * PI controller time constant (Ta1).  Typical Value = 1.
     */
    private Double ta1; // Seconds

    public Double getTa1() {
        return ta1;
    }

    public void setTa1(Double _value_) {
        ta1 = _value_;
    }

    private static Object getTa1(BaseClass _this_) {
        return ((ExcPIC) _this_).getTa1();
    }

    private static void setTa1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setTa1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setTa1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (Ta2).  Typical Value = 0.01.
     */
    private Double ta2; // Seconds

    public Double getTa2() {
        return ta2;
    }

    public void setTa2(Double _value_) {
        ta2 = _value_;
    }

    private static Object getTa2(BaseClass _this_) {
        return ((ExcPIC) _this_).getTa2();
    }

    private static void setTa2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setTa2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setTa2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead time constant (Ta3).  Typical Value = 0.
     */
    private Double ta3; // Seconds

    public Double getTa3() {
        return ta3;
    }

    public void setTa3(Double _value_) {
        ta3 = _value_;
    }

    private static Object getTa3(BaseClass _this_) {
        return ((ExcPIC) _this_).getTa3();
    }

    private static void setTa3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setTa3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setTa3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lag time constant (Ta4).  Typical Value = 0.
     */
    private Double ta4; // Seconds

    public Double getTa4() {
        return ta4;
    }

    public void setTa4(Double _value_) {
        ta4 = _value_;
    }

    private static Object getTa4(BaseClass _this_) {
        return ((ExcPIC) _this_).getTa4();
    }

    private static void setTa4(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setTa4((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setTa4(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter time constant (Te).  Typical Value = 0.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    private static Object getTe(BaseClass _this_) {
        return ((ExcPIC) _this_).getTe();
    }

    private static void setTe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setTe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setTe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rate feedback time constant (Tf1).  Typical Value = 0.
     */
    private Double tf1; // Seconds

    public Double getTf1() {
        return tf1;
    }

    public void setTf1(Double _value_) {
        tf1 = _value_;
    }

    private static Object getTf1(BaseClass _this_) {
        return ((ExcPIC) _this_).getTf1();
    }

    private static void setTf1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setTf1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setTf1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rate feedback lag time constant (Tf2).  Typical Value = 0.
     */
    private Double tf2; // Seconds

    public Double getTf2() {
        return tf2;
    }

    public void setTf2(Double _value_) {
        tf2 = _value_;
    }

    private static Object getTf2(BaseClass _this_) {
        return ((ExcPIC) _this_).getTf2();
    }

    private static void setTf2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setTf2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setTf2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * PI maximum limit (Vr1).  Typical Value = 1.
     */
    private Double vr1; // PU

    public Double getVr1() {
        return vr1;
    }

    public void setVr1(Double _value_) {
        vr1 = _value_;
    }

    private static Object getVr1(BaseClass _this_) {
        return ((ExcPIC) _this_).getVr1();
    }

    private static void setVr1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setVr1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setVr1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * PI minimum limit (Vr2).  Typical Value = -0.87.
     */
    private Double vr2; // PU

    public Double getVr2() {
        return vr2;
    }

    public void setVr2(Double _value_) {
        vr2 = _value_;
    }

    private static Object getVr2(BaseClass _this_) {
        return ((ExcPIC) _this_).getVr2();
    }

    private static void setVr2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setVr2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setVr2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator maximum limit (Vrmax).  Typical Value = 1.
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    private static Object getVrmax(BaseClass _this_) {
        return ((ExcPIC) _this_).getVrmax();
    }

    private static void setVrmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setVrmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setVrmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator minimum limit (Vrmin).  Typical Value = -0.87.
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    private static Object getVrmin(BaseClass _this_) {
        return ((ExcPIC) _this_).getVrmin();
    }

    private static void setVrmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcPIC) _this_).setVrmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcPIC) _this_).setVrmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcPIC", attrName));
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
                "ExcPIC", attrName, value));
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
            map.put("e1", new AttrDetails("ExcPIC.e1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getE1, ExcPIC::setE1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("e2", new AttrDetails("ExcPIC.e2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getE2, ExcPIC::setE2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efdmax", new AttrDetails("ExcPIC.efdmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getEfdmax, ExcPIC::setEfdmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efdmin", new AttrDetails("ExcPIC.efdmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getEfdmin, ExcPIC::setEfdmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("ExcPIC.ka", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getKa, ExcPIC::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("ExcPIC.kc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getKc, ExcPIC::setKc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcPIC.ke", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getKe, ExcPIC::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("ExcPIC.kf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getKf, ExcPIC::setKf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("ExcPIC.ki", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getKi, ExcPIC::setKi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("ExcPIC.kp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getKp, ExcPIC::setKp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("se1", new AttrDetails("ExcPIC.se1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getSe1, ExcPIC::setSe1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("se2", new AttrDetails("ExcPIC.se2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getSe2, ExcPIC::setSe2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta1", new AttrDetails("ExcPIC.ta1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getTa1, ExcPIC::setTa1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta2", new AttrDetails("ExcPIC.ta2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getTa2, ExcPIC::setTa2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta3", new AttrDetails("ExcPIC.ta3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getTa3, ExcPIC::setTa3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta4", new AttrDetails("ExcPIC.ta4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getTa4, ExcPIC::setTa4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcPIC.te", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getTe, ExcPIC::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf1", new AttrDetails("ExcPIC.tf1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getTf1, ExcPIC::setTf1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf2", new AttrDetails("ExcPIC.tf2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getTf2, ExcPIC::setTf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vr1", new AttrDetails("ExcPIC.vr1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getVr1, ExcPIC::setVr1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vr2", new AttrDetails("ExcPIC.vr2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getVr2, ExcPIC::setVr2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcPIC.vrmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getVrmax, ExcPIC::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcPIC.vrmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::getVrmin, ExcPIC::setVrmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcPIC(null).allAttrDetailsMap());
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
