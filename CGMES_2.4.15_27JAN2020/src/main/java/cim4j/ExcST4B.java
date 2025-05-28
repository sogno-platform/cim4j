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
 * Modified IEEE ST4B static excitation system with maximum inner loop feedback gain .
 */
@SuppressWarnings("unused")
public class ExcST4B extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcST4B.class);

    /**
     * Constructor.
     */
    public ExcST4B(String rdfid) {
        super("ExcST4B", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcST4B(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Rectifier loading factor proportional to commutating reactance (Kc). Typical Value = 0.113.
     */
    private Double kc; // PU

    public Double getKc() {
        return kc;
    }

    public void setKc(Double _value_) {
        kc = _value_;
    }

    private static Object getKc(BaseClass _this_) {
        return ((ExcST4B) _this_).getKc();
    }

    private static void setKc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST4B) _this_).setKc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST4B) _this_).setKc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Feedback gain constant of the inner loop field regulator (Kg). Typical Value = 0.
     */
    private Double kg; // PU

    public Double getKg() {
        return kg;
    }

    public void setKg(Double _value_) {
        kg = _value_;
    }

    private static Object getKg(BaseClass _this_) {
        return ((ExcST4B) _this_).getKg();
    }

    private static void setKg(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST4B) _this_).setKg((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST4B) _this_).setKg(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Potential circuit gain coefficient (Ki).  Typical Value = 0.
     */
    private Double ki; // PU

    public Double getKi() {
        return ki;
    }

    public void setKi(Double _value_) {
        ki = _value_;
    }

    private static Object getKi(BaseClass _this_) {
        return ((ExcST4B) _this_).getKi();
    }

    private static void setKi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST4B) _this_).setKi((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST4B) _this_).setKi(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator integral gain output (Kim).  Typical Value = 0.
     */
    private Double kim; // PU

    public Double getKim() {
        return kim;
    }

    public void setKim(Double _value_) {
        kim = _value_;
    }

    private static Object getKim(BaseClass _this_) {
        return ((ExcST4B) _this_).getKim();
    }

    private static void setKim(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST4B) _this_).setKim((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST4B) _this_).setKim(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator integral gain (Kir).  Typical Value = 10.75.
     */
    private Double kir; // PU

    public Double getKir() {
        return kir;
    }

    public void setKir(Double _value_) {
        kir = _value_;
    }

    private static Object getKir(BaseClass _this_) {
        return ((ExcST4B) _this_).getKir();
    }

    private static void setKir(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST4B) _this_).setKir((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST4B) _this_).setKir(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Potential circuit gain coefficient (Kp).  Typical Value = 9.3.
     */
    private Double kp; // PU

    public Double getKp() {
        return kp;
    }

    public void setKp(Double _value_) {
        kp = _value_;
    }

    private static Object getKp(BaseClass _this_) {
        return ((ExcST4B) _this_).getKp();
    }

    private static void setKp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST4B) _this_).setKp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST4B) _this_).setKp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator proportional gain output (Kpm).  Typical Value = 1.
     */
    private Double kpm; // PU

    public Double getKpm() {
        return kpm;
    }

    public void setKpm(Double _value_) {
        kpm = _value_;
    }

    private static Object getKpm(BaseClass _this_) {
        return ((ExcST4B) _this_).getKpm();
    }

    private static void setKpm(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST4B) _this_).setKpm((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST4B) _this_).setKpm(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage regulator proportional gain (Kpr).  Typical Value = 10.75.
     */
    private Double kpr; // PU

    public Double getKpr() {
        return kpr;
    }

    public void setKpr(Double _value_) {
        kpr = _value_;
    }

    private static Object getKpr(BaseClass _this_) {
        return ((ExcST4B) _this_).getKpr();
    }

    private static void setKpr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST4B) _this_).setKpr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST4B) _this_).setKpr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Selector (LVgate). true = LVgate is part of the block diagram false = LVgate is not part of the block diagram.  Typical Value = false.
     */
    private Boolean lvgate; // Boolean

    public Boolean getLvgate() {
        return lvgate;
    }

    public void setLvgate(Boolean _value_) {
        lvgate = _value_;
    }

    private static Object getLvgate(BaseClass _this_) {
        return ((ExcST4B) _this_).getLvgate();
    }

    private static void setLvgate(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ExcST4B) _this_).setLvgate((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST4B) _this_).setLvgate(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Voltage regulator time constant (Ta).  Typical Value = 0.02.
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((ExcST4B) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST4B) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST4B) _this_).setTa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Potential circuit phase angle (thetap).  Typical Value = 0.
     */
    private Double thetap; // AngleDegrees

    public Double getThetap() {
        return thetap;
    }

    public void setThetap(Double _value_) {
        thetap = _value_;
    }

    private static Object getThetap(BaseClass _this_) {
        return ((ExcST4B) _this_).getThetap();
    }

    private static void setThetap(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST4B) _this_).setThetap((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST4B) _this_).setThetap(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Selector (Uel). true = UEL is part of block diagram false = UEL is not part of block diagram.  Typical Value = false.
     */
    private Boolean uel; // Boolean

    public Boolean getUel() {
        return uel;
    }

    public void setUel(Boolean _value_) {
        uel = _value_;
    }

    private static Object getUel(BaseClass _this_) {
        return ((ExcST4B) _this_).getUel();
    }

    private static void setUel(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ExcST4B) _this_).setUel((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST4B) _this_).setUel(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Maximum excitation voltage (Vbmax).  Typical Value = 11.63.
     */
    private Double vbmax; // PU

    public Double getVbmax() {
        return vbmax;
    }

    public void setVbmax(Double _value_) {
        vbmax = _value_;
    }

    private static Object getVbmax(BaseClass _this_) {
        return ((ExcST4B) _this_).getVbmax();
    }

    private static void setVbmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST4B) _this_).setVbmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST4B) _this_).setVbmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum inner loop feedback voltage (Vgmax).  Typical Value = 5.8.
     */
    private Double vgmax; // PU

    public Double getVgmax() {
        return vgmax;
    }

    public void setVgmax(Double _value_) {
        vgmax = _value_;
    }

    private static Object getVgmax(BaseClass _this_) {
        return ((ExcST4B) _this_).getVgmax();
    }

    private static void setVgmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST4B) _this_).setVgmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST4B) _this_).setVgmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum inner loop output (Vmmax).  Typical Value = 99.
     */
    private Double vmmax; // PU

    public Double getVmmax() {
        return vmmax;
    }

    public void setVmmax(Double _value_) {
        vmmax = _value_;
    }

    private static Object getVmmax(BaseClass _this_) {
        return ((ExcST4B) _this_).getVmmax();
    }

    private static void setVmmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST4B) _this_).setVmmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST4B) _this_).setVmmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum inner loop output (Vmmin).  Typical Value = -99.
     */
    private Double vmmin; // PU

    public Double getVmmin() {
        return vmmin;
    }

    public void setVmmin(Double _value_) {
        vmmin = _value_;
    }

    private static Object getVmmin(BaseClass _this_) {
        return ((ExcST4B) _this_).getVmmin();
    }

    private static void setVmmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST4B) _this_).setVmmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST4B) _this_).setVmmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum voltage regulator output (Vrmax).  Typical Value = 1.
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    private static Object getVrmax(BaseClass _this_) {
        return ((ExcST4B) _this_).getVrmax();
    }

    private static void setVrmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST4B) _this_).setVrmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST4B) _this_).setVrmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum voltage regulator output (Vrmin).  Typical Value = -0.87.
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    private static Object getVrmin(BaseClass _this_) {
        return ((ExcST4B) _this_).getVrmin();
    }

    private static void setVrmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST4B) _this_).setVrmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST4B) _this_).setVrmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactance associated with potential source (Xl).  Typical Value = 0.124.
     */
    private Double xl; // PU

    public Double getXl() {
        return xl;
    }

    public void setXl(Double _value_) {
        xl = _value_;
    }

    private static Object getXl(BaseClass _this_) {
        return ((ExcST4B) _this_).getXl();
    }

    private static void setXl(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ExcST4B) _this_).setXl((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ExcST4B) _this_).setXl(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcST4B", attrName));
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
                "ExcST4B", attrName, value));
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
            map.put("kc", new AttrDetails("ExcST4B.kc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::getKc, ExcST4B::setKc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kg", new AttrDetails("ExcST4B.kg", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::getKg, ExcST4B::setKg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("ExcST4B.ki", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::getKi, ExcST4B::setKi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kim", new AttrDetails("ExcST4B.kim", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::getKim, ExcST4B::setKim));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kir", new AttrDetails("ExcST4B.kir", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::getKir, ExcST4B::setKir));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("ExcST4B.kp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::getKp, ExcST4B::setKp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpm", new AttrDetails("ExcST4B.kpm", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::getKpm, ExcST4B::setKpm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpr", new AttrDetails("ExcST4B.kpr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::getKpr, ExcST4B::setKpr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lvgate", new AttrDetails("ExcST4B.lvgate", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::getLvgate, ExcST4B::setLvgate));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("ExcST4B.ta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::getTa, ExcST4B::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("thetap", new AttrDetails("ExcST4B.thetap", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::getThetap, ExcST4B::setThetap));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uel", new AttrDetails("ExcST4B.uel", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::getUel, ExcST4B::setUel));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vbmax", new AttrDetails("ExcST4B.vbmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::getVbmax, ExcST4B::setVbmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vgmax", new AttrDetails("ExcST4B.vgmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::getVgmax, ExcST4B::setVgmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmmax", new AttrDetails("ExcST4B.vmmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::getVmmax, ExcST4B::setVmmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmmin", new AttrDetails("ExcST4B.vmmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::getVmmin, ExcST4B::setVmmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcST4B.vrmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::getVrmax, ExcST4B::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcST4B.vrmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::getVrmin, ExcST4B::setVrmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xl", new AttrDetails("ExcST4B.xl", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::getXl, ExcST4B::setXl));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcST4B(null).allAttrDetailsMap());
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
