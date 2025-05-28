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
 * Modification of an old IEEE ST1A static excitation system without overexcitation limiter (OEL) and underexcitation limiter (UEL).
 */
@SuppressWarnings("unused")
public class ExcST1A extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcST1A.class);

    /**
     * Constructor.
     */
    public ExcST1A(String rdfid) {
        super("ExcST1A", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcST1A(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Exciter output current limit reference (<i>Ilr</i>).  Typical value = 0.
     */
    private Double ilr; // PU

    public Double getIlr() {
        return ilr;
    }

    public void setIlr(Double _value_) {
        ilr = _value_;
    }

    private static Object getIlr(BaseClass _this_) {
        return ((ExcST1A) _this_).getIlr();
    }

    private static void setIlr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST1A) _this_).setIlr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST1A) _this_).setIlr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator gain (<i>Ka</i>) (&gt; 0).  Typical value = 190.
     */
    private Double ka; // PU

    public Double getKa() {
        return ka;
    }

    public void setKa(Double _value_) {
        ka = _value_;
    }

    private static Object getKa(BaseClass _this_) {
        return ((ExcST1A) _this_).getKa();
    }

    private static void setKa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST1A) _this_).setKa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST1A) _this_).setKa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Rectifier loading factor proportional to commutating reactance (<i>Kc</i>) (&gt;= 0). Typical value = 0,05.
     */
    private Double kc; // PU

    public Double getKc() {
        return kc;
    }

    public void setKc(Double _value_) {
        kc = _value_;
    }

    private static Object getKc(BaseClass _this_) {
        return ((ExcST1A) _this_).getKc();
    }

    private static void setKc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST1A) _this_).setKc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST1A) _this_).setKc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Excitation control system stabilizer gains (<i>Kf</i>) (&gt;= 0).  Typical value = 0.
     */
    private Double kf; // PU

    public Double getKf() {
        return kf;
    }

    public void setKf(Double _value_) {
        kf = _value_;
    }

    private static Object getKf(BaseClass _this_) {
        return ((ExcST1A) _this_).getKf();
    }

    private static void setKf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST1A) _this_).setKf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST1A) _this_).setKf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Exciter output current limiter gain (<i>Klr</i>).  Typical value = 0.
     */
    private Double klr; // PU

    public Double getKlr() {
        return klr;
    }

    public void setKlr(Double _value_) {
        klr = _value_;
    }

    private static Object getKlr(BaseClass _this_) {
        return ((ExcST1A) _this_).getKlr();
    }

    private static void setKlr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST1A) _this_).setKlr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST1A) _this_).setKlr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (<i>Ta</i>) (&gt;= 0).  Typical value = 0,02.
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((ExcST1A) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST1A) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST1A) _this_).setTa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (<i>Tb</i>) (&gt;= 0).  Typical value = 10.
     */
    private Double tb; // Seconds

    public Double getTb() {
        return tb;
    }

    public void setTb(Double _value_) {
        tb = _value_;
    }

    private static Object getTb(BaseClass _this_) {
        return ((ExcST1A) _this_).getTb();
    }

    private static void setTb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST1A) _this_).setTb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST1A) _this_).setTb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (<i>Tb1</i>) (&gt;= 0).  Typical value = 0.
     */
    private Double tb1; // Seconds

    public Double getTb1() {
        return tb1;
    }

    public void setTb1(Double _value_) {
        tb1 = _value_;
    }

    private static Object getTb1(BaseClass _this_) {
        return ((ExcST1A) _this_).getTb1();
    }

    private static void setTb1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST1A) _this_).setTb1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST1A) _this_).setTb1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (<i>Tc</i>) (&gt;= 0).  Typical value = 1.
     */
    private Double tc; // Seconds

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    private static Object getTc(BaseClass _this_) {
        return ((ExcST1A) _this_).getTc();
    }

    private static void setTc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST1A) _this_).setTc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST1A) _this_).setTc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator time constant (<i>Tc1</i>) (&gt;= 0).  Typical value = 0.
     */
    private Double tc1; // Seconds

    public Double getTc1() {
        return tc1;
    }

    public void setTc1(Double _value_) {
        tc1 = _value_;
    }

    private static Object getTc1(BaseClass _this_) {
        return ((ExcST1A) _this_).getTc1();
    }

    private static void setTc1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST1A) _this_).setTc1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST1A) _this_).setTc1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Excitation control system stabilizer time constant (<i>Tf</i>) (&gt;= 0).  Typical value = 1.
     */
    private Double tf; // Seconds

    public Double getTf() {
        return tf;
    }

    public void setTf(Double _value_) {
        tf = _value_;
    }

    private static Object getTf(BaseClass _this_) {
        return ((ExcST1A) _this_).getTf();
    }

    private static void setTf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST1A) _this_).setTf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST1A) _this_).setTf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage regulator output (<i>Vamax</i>) (&gt; 0).  Typical value = 999.
     */
    private Double vamax; // PU

    public Double getVamax() {
        return vamax;
    }

    public void setVamax(Double _value_) {
        vamax = _value_;
    }

    private static Object getVamax(BaseClass _this_) {
        return ((ExcST1A) _this_).getVamax();
    }

    private static void setVamax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST1A) _this_).setVamax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST1A) _this_).setVamax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator output (<i>Vamin</i>) (&lt; 0).  Typical value = -999.
     */
    private Double vamin; // PU

    public Double getVamin() {
        return vamin;
    }

    public void setVamin(Double _value_) {
        vamin = _value_;
    }

    private static Object getVamin(BaseClass _this_) {
        return ((ExcST1A) _this_).getVamin();
    }

    private static void setVamin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST1A) _this_).setVamin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST1A) _this_).setVamin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage regulator input limit (<i>Vimax</i>) (&gt; 0).  Typical value = 999.
     */
    private Double vimax; // PU

    public Double getVimax() {
        return vimax;
    }

    public void setVimax(Double _value_) {
        vimax = _value_;
    }

    private static Object getVimax(BaseClass _this_) {
        return ((ExcST1A) _this_).getVimax();
    }

    private static void setVimax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST1A) _this_).setVimax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST1A) _this_).setVimax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator input limit (<i>Vimin</i>) (&lt; 0).  Typical value = -999.
     */
    private Double vimin; // PU

    public Double getVimin() {
        return vimin;
    }

    public void setVimin(Double _value_) {
        vimin = _value_;
    }

    private static Object getVimin(BaseClass _this_) {
        return ((ExcST1A) _this_).getVimin();
    }

    private static void setVimin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST1A) _this_).setVimin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST1A) _this_).setVimin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage regulator outputs (<i>Vrmax</i>) (&gt; 0) .  Typical value = 7,8.
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    private static Object getVrmax(BaseClass _this_) {
        return ((ExcST1A) _this_).getVrmax();
    }

    private static void setVrmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST1A) _this_).setVrmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST1A) _this_).setVrmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator outputs (<i>Vrmin</i>) (&lt; 0).  Typical value = -6,7.
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    private static Object getVrmin(BaseClass _this_) {
        return ((ExcST1A) _this_).getVrmin();
    }

    private static void setVrmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST1A) _this_).setVrmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST1A) _this_).setVrmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Excitation xfmr effective reactance (<i>Xe</i>).  Typical value = 0,04.
     */
    private Double xe; // PU

    public Double getXe() {
        return xe;
    }

    public void setXe(Double _value_) {
        xe = _value_;
    }

    private static Object getXe(BaseClass _this_) {
        return ((ExcST1A) _this_).getXe();
    }

    private static void setXe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST1A) _this_).setXe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST1A) _this_).setXe(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcST1A", attrName));
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
                "ExcST1A", attrName, value));
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
            map.put("ilr", new AttrDetails("ExcST1A.ilr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST1A::getIlr, ExcST1A::setIlr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("ExcST1A.ka", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST1A::getKa, ExcST1A::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("ExcST1A.kc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST1A::getKc, ExcST1A::setKc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("ExcST1A.kf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST1A::getKf, ExcST1A::setKf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("klr", new AttrDetails("ExcST1A.klr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST1A::getKlr, ExcST1A::setKlr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("ExcST1A.ta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST1A::getTa, ExcST1A::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("ExcST1A.tb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST1A::getTb, ExcST1A::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb1", new AttrDetails("ExcST1A.tb1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST1A::getTb1, ExcST1A::setTb1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("ExcST1A.tc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST1A::getTc, ExcST1A::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc1", new AttrDetails("ExcST1A.tc1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST1A::getTc1, ExcST1A::setTc1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("ExcST1A.tf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST1A::getTf, ExcST1A::setTf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vamax", new AttrDetails("ExcST1A.vamax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST1A::getVamax, ExcST1A::setVamax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vamin", new AttrDetails("ExcST1A.vamin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST1A::getVamin, ExcST1A::setVamin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimax", new AttrDetails("ExcST1A.vimax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST1A::getVimax, ExcST1A::setVimax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimin", new AttrDetails("ExcST1A.vimin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST1A::getVimin, ExcST1A::setVimin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcST1A.vrmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST1A::getVrmax, ExcST1A::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcST1A.vrmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST1A::getVrmin, ExcST1A::setVrmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xe", new AttrDetails("ExcST1A.xe", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcST1A::getXe, ExcST1A::setXe));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcST1A(null).allAttrDetailsMap());
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
