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
 * Modified IEEE ST4B static excitation system with maximum inner loop feedback gain <i>Vgmax</i>.
 */
@SuppressWarnings("unused")
public class ExcST4B extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcST4B.class);

    /**
     * Default constructor.
     */
    public ExcST4B() {
        setCimType("ExcST4B");
    }

    /**
     * Rectifier loading factor proportional to commutating reactance (&lt;i&gt;Kc&lt;/i&gt;) (&amp;gt;= 0). Typical value = 0,113.
     */
    private Double kc; // PU

    public Double getKc() {
        return kc;
    }

    public void setKc(Double _value_) {
        kc = _value_;
    }

    public void setKc(String _value_) {
        kc = getDoubleFromString(_value_);
    }

    public String kcToString() {
        return kc != null ? kc.toString() : null;
    }

    /**
     * Feedback gain constant of the inner loop field regulator (&lt;i&gt;Kg&lt;/i&gt;) (&amp;gt;= 0). Typical value = 0.
     */
    private Double kg; // PU

    public Double getKg() {
        return kg;
    }

    public void setKg(Double _value_) {
        kg = _value_;
    }

    public void setKg(String _value_) {
        kg = getDoubleFromString(_value_);
    }

    public String kgToString() {
        return kg != null ? kg.toString() : null;
    }

    /**
     * Potential circuit gain coefficient (&lt;i&gt;Ki&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double ki; // PU

    public Double getKi() {
        return ki;
    }

    public void setKi(Double _value_) {
        ki = _value_;
    }

    public void setKi(String _value_) {
        ki = getDoubleFromString(_value_);
    }

    public String kiToString() {
        return ki != null ? ki.toString() : null;
    }

    /**
     * Voltage regulator integral gain output (&lt;i&gt;Kim&lt;/i&gt;).  Typical value = 0.
     */
    private Double kim; // PU

    public Double getKim() {
        return kim;
    }

    public void setKim(Double _value_) {
        kim = _value_;
    }

    public void setKim(String _value_) {
        kim = getDoubleFromString(_value_);
    }

    public String kimToString() {
        return kim != null ? kim.toString() : null;
    }

    /**
     * Voltage regulator integral gain (&lt;i&gt;Kir&lt;/i&gt;).  Typical value = 10,75.
     */
    private Double kir; // PU

    public Double getKir() {
        return kir;
    }

    public void setKir(Double _value_) {
        kir = _value_;
    }

    public void setKir(String _value_) {
        kir = getDoubleFromString(_value_);
    }

    public String kirToString() {
        return kir != null ? kir.toString() : null;
    }

    /**
     * Potential circuit gain coefficient (&lt;i&gt;Kp&lt;/i&gt;) (&amp;gt; 0).  Typical value = 9,3.
     */
    private Double kp; // PU

    public Double getKp() {
        return kp;
    }

    public void setKp(Double _value_) {
        kp = _value_;
    }

    public void setKp(String _value_) {
        kp = getDoubleFromString(_value_);
    }

    public String kpToString() {
        return kp != null ? kp.toString() : null;
    }

    /**
     * Voltage regulator proportional gain output (&lt;i&gt;Kpm&lt;/i&gt;).  Typical value = 1.
     */
    private Double kpm; // PU

    public Double getKpm() {
        return kpm;
    }

    public void setKpm(Double _value_) {
        kpm = _value_;
    }

    public void setKpm(String _value_) {
        kpm = getDoubleFromString(_value_);
    }

    public String kpmToString() {
        return kpm != null ? kpm.toString() : null;
    }

    /**
     * Voltage regulator proportional gain (&lt;i&gt;Kpr&lt;/i&gt;).  Typical value = 10,75.
     */
    private Double kpr; // PU

    public Double getKpr() {
        return kpr;
    }

    public void setKpr(Double _value_) {
        kpr = _value_;
    }

    public void setKpr(String _value_) {
        kpr = getDoubleFromString(_value_);
    }

    public String kprToString() {
        return kpr != null ? kpr.toString() : null;
    }

    /**
     * Selector (&lt;i&gt;LVGate&lt;/i&gt;). true = &lt;i&gt;LVGate&lt;/i&gt; is part of the block diagram false = &lt;i&gt;LVGate&lt;/i&gt; is not part of the block diagram.  Typical value = false.
     */
    private Boolean lvgate; // Boolean

    public Boolean getLvgate() {
        return lvgate;
    }

    public void setLvgate(Boolean _value_) {
        lvgate = _value_;
    }

    public void setLvgate(String _value_) {
        lvgate = getBooleanFromString(_value_);
    }

    public String lvgateToString() {
        return lvgate != null ? lvgate.toString() : null;
    }

    /**
     * Voltage regulator time constant (&lt;i&gt;Ta&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,02.
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    public void setTa(String _value_) {
        ta = getDoubleFromString(_value_);
    }

    public String taToString() {
        return ta != null ? ta.toString() : null;
    }

    /**
     * Potential circuit phase angle (&lt;i&gt;theta&lt;/i&gt;&lt;i&gt;&lt;sub&gt;p&lt;/sub&gt;&lt;/i&gt;).  Typical value = 0.
     */
    private Double thetap; // AngleDegrees

    public Double getThetap() {
        return thetap;
    }

    public void setThetap(Double _value_) {
        thetap = _value_;
    }

    public void setThetap(String _value_) {
        thetap = getDoubleFromString(_value_);
    }

    public String thetapToString() {
        return thetap != null ? thetap.toString() : null;
    }

    /**
     * Selector (&lt;i&gt;UEL&lt;/i&gt;). true = &lt;i&gt;UEL&lt;/i&gt; is part of block diagram false = &lt;i&gt;UEL&lt;/i&gt; is not part of block diagram.  Typical value = false.
     */
    private Boolean uel; // Boolean

    public Boolean getUel() {
        return uel;
    }

    public void setUel(Boolean _value_) {
        uel = _value_;
    }

    public void setUel(String _value_) {
        uel = getBooleanFromString(_value_);
    }

    public String uelToString() {
        return uel != null ? uel.toString() : null;
    }

    /**
     * Maximum excitation voltage (&lt;i&gt;Vbmax&lt;/i&gt;) (&amp;gt; 0).  Typical value = 11,63.
     */
    private Double vbmax; // PU

    public Double getVbmax() {
        return vbmax;
    }

    public void setVbmax(Double _value_) {
        vbmax = _value_;
    }

    public void setVbmax(String _value_) {
        vbmax = getDoubleFromString(_value_);
    }

    public String vbmaxToString() {
        return vbmax != null ? vbmax.toString() : null;
    }

    /**
     * Maximum inner loop feedback voltage (&lt;i&gt;Vgmax&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 5,8.
     */
    private Double vgmax; // PU

    public Double getVgmax() {
        return vgmax;
    }

    public void setVgmax(Double _value_) {
        vgmax = _value_;
    }

    public void setVgmax(String _value_) {
        vgmax = getDoubleFromString(_value_);
    }

    public String vgmaxToString() {
        return vgmax != null ? vgmax.toString() : null;
    }

    /**
     * Maximum inner loop output (&lt;i&gt;Vmmax&lt;/i&gt;) (&amp;gt; ExcST4B.vmmin).  Typical value = 99.
     */
    private Double vmmax; // PU

    public Double getVmmax() {
        return vmmax;
    }

    public void setVmmax(Double _value_) {
        vmmax = _value_;
    }

    public void setVmmax(String _value_) {
        vmmax = getDoubleFromString(_value_);
    }

    public String vmmaxToString() {
        return vmmax != null ? vmmax.toString() : null;
    }

    /**
     * Minimum inner loop output (&lt;i&gt;Vmmin&lt;/i&gt;) (&amp;lt; ExcST4B.vmmax).  Typical value = -99.
     */
    private Double vmmin; // PU

    public Double getVmmin() {
        return vmmin;
    }

    public void setVmmin(Double _value_) {
        vmmin = _value_;
    }

    public void setVmmin(String _value_) {
        vmmin = getDoubleFromString(_value_);
    }

    public String vmminToString() {
        return vmmin != null ? vmmin.toString() : null;
    }

    /**
     * Maximum voltage regulator output (&lt;i&gt;Vrmax&lt;/i&gt;) (&amp;gt; 0).  Typical value = 1.
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    public void setVrmax(String _value_) {
        vrmax = getDoubleFromString(_value_);
    }

    public String vrmaxToString() {
        return vrmax != null ? vrmax.toString() : null;
    }

    /**
     * Minimum voltage regulator output (&lt;i&gt;Vrmin&lt;/i&gt;) (&amp;lt; 0).  Typical value = -0,87.
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    public void setVrmin(String _value_) {
        vrmin = getDoubleFromString(_value_);
    }

    public String vrminToString() {
        return vrmin != null ? vrmin.toString() : null;
    }

    /**
     * Reactance associated with potential source (&lt;i&gt;Xl&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,124.
     */
    private Double xl; // PU

    public Double getXl() {
        return xl;
    }

    public void setXl(Double _value_) {
        xl = _value_;
    }

    public void setXl(String _value_) {
        xl = getDoubleFromString(_value_);
    }

    public String xlToString() {
        return xl != null ? xl.toString() : null;
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
        return getAttribute("ExcST4B", attrName);
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
        setAttribute("ExcST4B", attrName, objectValue);
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
        setAttribute("ExcST4B", attrName, stringValue);
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

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/CIM100#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("ExcST4B.kc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kg", new AttrDetails("ExcST4B.kg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("ExcST4B.ki", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kim", new AttrDetails("ExcST4B.kim", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kir", new AttrDetails("ExcST4B.kir", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("ExcST4B.kp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpm", new AttrDetails("ExcST4B.kpm", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpr", new AttrDetails("ExcST4B.kpr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lvgate", new AttrDetails("ExcST4B.lvgate", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("ExcST4B.ta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("thetap", new AttrDetails("ExcST4B.thetap", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uel", new AttrDetails("ExcST4B.uel", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vbmax", new AttrDetails("ExcST4B.vbmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vgmax", new AttrDetails("ExcST4B.vgmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmmax", new AttrDetails("ExcST4B.vmmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmmin", new AttrDetails("ExcST4B.vmmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcST4B.vrmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcST4B.vrmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xl", new AttrDetails("ExcST4B.xl", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcST4B().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("kc", new GetterSetter(this::kcToString, null, this::setKc));
        map.put("kg", new GetterSetter(this::kgToString, null, this::setKg));
        map.put("ki", new GetterSetter(this::kiToString, null, this::setKi));
        map.put("kim", new GetterSetter(this::kimToString, null, this::setKim));
        map.put("kir", new GetterSetter(this::kirToString, null, this::setKir));
        map.put("kp", new GetterSetter(this::kpToString, null, this::setKp));
        map.put("kpm", new GetterSetter(this::kpmToString, null, this::setKpm));
        map.put("kpr", new GetterSetter(this::kprToString, null, this::setKpr));
        map.put("lvgate", new GetterSetter(this::lvgateToString, null, this::setLvgate));
        map.put("ta", new GetterSetter(this::taToString, null, this::setTa));
        map.put("thetap", new GetterSetter(this::thetapToString, null, this::setThetap));
        map.put("uel", new GetterSetter(this::uelToString, null, this::setUel));
        map.put("vbmax", new GetterSetter(this::vbmaxToString, null, this::setVbmax));
        map.put("vgmax", new GetterSetter(this::vgmaxToString, null, this::setVgmax));
        map.put("vmmax", new GetterSetter(this::vmmaxToString, null, this::setVmmax));
        map.put("vmmin", new GetterSetter(this::vmminToString, null, this::setVmmin));
        map.put("vrmax", new GetterSetter(this::vrmaxToString, null, this::setVrmax));
        map.put("vrmin", new GetterSetter(this::vrminToString, null, this::setVrmin));
        map.put("xl", new GetterSetter(this::xlToString, null, this::setXl));
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
