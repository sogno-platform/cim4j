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
 * General Purpose Rotating Excitation System Model.  This model can be used to represent a wide range of excitation systems whose DC power source is an AC or DC generator. It encompasses IEEE type AC1, AC2, DC1, and DC2 excitation system models.
 */
@SuppressWarnings("unused")
public class ExcREXS extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcREXS.class);

    /**
     * Default constructor.
     */
    public ExcREXS() {
        setCimType("ExcREXS");
    }

    /**
     * Field voltage value 1 (E1).  Typical Value = 3.
     */
    private Double e1; // PU

    public Double getE1() {
        return e1;
    }

    public void setE1(Double _value_) {
        e1 = _value_;
    }

    public void setE1(String _value_) {
        e1 = getDoubleFromString(_value_);
    }

    public String e1ToString() {
        return e1 != null ? e1.toString() : null;
    }

    /**
     * Field voltage value 2 (E2).  Typical Value = 4.
     */
    private Double e2; // PU

    public Double getE2() {
        return e2;
    }

    public void setE2(Double _value_) {
        e2 = _value_;
    }

    public void setE2(String _value_) {
        e2 = getDoubleFromString(_value_);
    }

    public String e2ToString() {
        return e2 != null ? e2.toString() : null;
    }

    /**
     * Rate feedback signal flag (Fbf). Typical Value = fieldCurrent.
     */
    private String fbf; // ExcREXSFeedbackSignalKind

    public String getFbf() {
        return fbf;
    }

    public void setFbf(String _value_) {
        fbf = _value_;
    }

    public String fbfToString() {
        return fbf;
    }

    /**
     * Limit type flag (Flimf).  Typical Value = 0.
     */
    private Double flimf; // PU

    public Double getFlimf() {
        return flimf;
    }

    public void setFlimf(Double _value_) {
        flimf = _value_;
    }

    public void setFlimf(String _value_) {
        flimf = getDoubleFromString(_value_);
    }

    public String flimfToString() {
        return flimf != null ? flimf.toString() : null;
    }

    /**
     * Rectifier regulation factor (Kc).  Typical Value = 0.05.
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
     * Exciter regulation factor (Kd).  Typical Value = 2.
     */
    private Double kd; // PU

    public Double getKd() {
        return kd;
    }

    public void setKd(Double _value_) {
        kd = _value_;
    }

    public void setKd(String _value_) {
        kd = getDoubleFromString(_value_);
    }

    public String kdToString() {
        return kd != null ? kd.toString() : null;
    }

    /**
     * Exciter field proportional constant (Ke).  Typical Value = 1.
     */
    private Double ke; // PU

    public Double getKe() {
        return ke;
    }

    public void setKe(Double _value_) {
        ke = _value_;
    }

    public void setKe(String _value_) {
        ke = getDoubleFromString(_value_);
    }

    public String keToString() {
        return ke != null ? ke.toString() : null;
    }

    /**
     * Field voltage feedback gain (Kefd).  Typical Value = 0.
     */
    private Double kefd; // PU

    public Double getKefd() {
        return kefd;
    }

    public void setKefd(Double _value_) {
        kefd = _value_;
    }

    public void setKefd(String _value_) {
        kefd = getDoubleFromString(_value_);
    }

    public String kefdToString() {
        return kefd != null ? kefd.toString() : null;
    }

    /**
     * Rate feedback gain (Kf).  Typical Value = 0.05.
     */
    private Double kf; // Seconds

    public Double getKf() {
        return kf;
    }

    public void setKf(Double _value_) {
        kf = _value_;
    }

    public void setKf(String _value_) {
        kf = getDoubleFromString(_value_);
    }

    public String kfToString() {
        return kf != null ? kf.toString() : null;
    }

    /**
     * Field voltage controller feedback gain (Kh).  Typical Value = 0.
     */
    private Double kh; // PU

    public Double getKh() {
        return kh;
    }

    public void setKh(Double _value_) {
        kh = _value_;
    }

    public void setKh(String _value_) {
        kh = getDoubleFromString(_value_);
    }

    public String khToString() {
        return kh != null ? kh.toString() : null;
    }

    /**
     * Field Current Regulator Integral Gain (Kii).  Typical Value = 0.
     */
    private Double kii; // PU

    public Double getKii() {
        return kii;
    }

    public void setKii(Double _value_) {
        kii = _value_;
    }

    public void setKii(String _value_) {
        kii = getDoubleFromString(_value_);
    }

    public String kiiToString() {
        return kii != null ? kii.toString() : null;
    }

    /**
     * Field Current Regulator Proportional Gain (Kip).  Typical Value = 1.
     */
    private Double kip; // PU

    public Double getKip() {
        return kip;
    }

    public void setKip(Double _value_) {
        kip = _value_;
    }

    public void setKip(String _value_) {
        kip = getDoubleFromString(_value_);
    }

    public String kipToString() {
        return kip != null ? kip.toString() : null;
    }

    /**
     * Coefficient to allow different usage of the model-speed coefficient (Ks).  Typical Value = 0.
     */
    private Double ks; // PU

    public Double getKs() {
        return ks;
    }

    public void setKs(Double _value_) {
        ks = _value_;
    }

    public void setKs(String _value_) {
        ks = getDoubleFromString(_value_);
    }

    public String ksToString() {
        return ks != null ? ks.toString() : null;
    }

    /**
     * Voltage Regulator Integral Gain (Kvi).  Typical Value = 0.
     */
    private Double kvi; // PU

    public Double getKvi() {
        return kvi;
    }

    public void setKvi(Double _value_) {
        kvi = _value_;
    }

    public void setKvi(String _value_) {
        kvi = getDoubleFromString(_value_);
    }

    public String kviToString() {
        return kvi != null ? kvi.toString() : null;
    }

    /**
     * Voltage Regulator Proportional Gain (Kvp).  Typical Value = 2800.
     */
    private Double kvp; // PU

    public Double getKvp() {
        return kvp;
    }

    public void setKvp(Double _value_) {
        kvp = _value_;
    }

    public void setKvp(String _value_) {
        kvp = getDoubleFromString(_value_);
    }

    public String kvpToString() {
        return kvp != null ? kvp.toString() : null;
    }

    /**
     * V/Hz limiter gain (Kvphz).  Typical Value = 0.
     */
    private Double kvphz; // PU

    public Double getKvphz() {
        return kvphz;
    }

    public void setKvphz(Double _value_) {
        kvphz = _value_;
    }

    public void setKvphz(String _value_) {
        kvphz = getDoubleFromString(_value_);
    }

    public String kvphzToString() {
        return kvphz != null ? kvphz.toString() : null;
    }

    /**
     * Pickup speed of V/Hz limiter (Nvphz).  Typical Value = 0.
     */
    private Double nvphz; // PU

    public Double getNvphz() {
        return nvphz;
    }

    public void setNvphz(Double _value_) {
        nvphz = _value_;
    }

    public void setNvphz(String _value_) {
        nvphz = getDoubleFromString(_value_);
    }

    public String nvphzToString() {
        return nvphz != null ? nvphz.toString() : null;
    }

    /**
     * Saturation factor at E1 (Se1).  Typical Value = 0.0001.
     */
    private Double se1; // PU

    public Double getSe1() {
        return se1;
    }

    public void setSe1(Double _value_) {
        se1 = _value_;
    }

    public void setSe1(String _value_) {
        se1 = getDoubleFromString(_value_);
    }

    public String se1ToString() {
        return se1 != null ? se1.toString() : null;
    }

    /**
     * Saturation factor at E2 (Se2).  Typical Value = 0.001.
     */
    private Double se2; // PU

    public Double getSe2() {
        return se2;
    }

    public void setSe2(Double _value_) {
        se2 = _value_;
    }

    public void setSe2(String _value_) {
        se2 = getDoubleFromString(_value_);
    }

    public String se2ToString() {
        return se2 != null ? se2.toString() : null;
    }

    /**
     * Voltage Regulator time constant (Ta).  Typical Value = 0.01.
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
     * Lag time constant (Tb1).  Typical Value = 0.
     */
    private Double tb1; // Seconds

    public Double getTb1() {
        return tb1;
    }

    public void setTb1(Double _value_) {
        tb1 = _value_;
    }

    public void setTb1(String _value_) {
        tb1 = getDoubleFromString(_value_);
    }

    public String tb1ToString() {
        return tb1 != null ? tb1.toString() : null;
    }

    /**
     * Lag time constant (Tb2).  Typical Value = 0.
     */
    private Double tb2; // Seconds

    public Double getTb2() {
        return tb2;
    }

    public void setTb2(Double _value_) {
        tb2 = _value_;
    }

    public void setTb2(String _value_) {
        tb2 = getDoubleFromString(_value_);
    }

    public String tb2ToString() {
        return tb2 != null ? tb2.toString() : null;
    }

    /**
     * Lead time constant (Tc1).  Typical Value = 0.
     */
    private Double tc1; // Seconds

    public Double getTc1() {
        return tc1;
    }

    public void setTc1(Double _value_) {
        tc1 = _value_;
    }

    public void setTc1(String _value_) {
        tc1 = getDoubleFromString(_value_);
    }

    public String tc1ToString() {
        return tc1 != null ? tc1.toString() : null;
    }

    /**
     * Lead time constant (Tc2).  Typical Value = 0.
     */
    private Double tc2; // Seconds

    public Double getTc2() {
        return tc2;
    }

    public void setTc2(Double _value_) {
        tc2 = _value_;
    }

    public void setTc2(String _value_) {
        tc2 = getDoubleFromString(_value_);
    }

    public String tc2ToString() {
        return tc2 != null ? tc2.toString() : null;
    }

    /**
     * Exciter field time constant (Te).  Typical Value = 1.2.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    public void setTe(String _value_) {
        te = getDoubleFromString(_value_);
    }

    public String teToString() {
        return te != null ? te.toString() : null;
    }

    /**
     * Rate feedback time constant (Tf).  Typical Value = 1.
     */
    private Double tf; // Seconds

    public Double getTf() {
        return tf;
    }

    public void setTf(Double _value_) {
        tf = _value_;
    }

    public void setTf(String _value_) {
        tf = getDoubleFromString(_value_);
    }

    public String tfToString() {
        return tf != null ? tf.toString() : null;
    }

    /**
     * Feedback lead time constant (Tf1).  Typical Value = 0.
     */
    private Double tf1; // Seconds

    public Double getTf1() {
        return tf1;
    }

    public void setTf1(Double _value_) {
        tf1 = _value_;
    }

    public void setTf1(String _value_) {
        tf1 = getDoubleFromString(_value_);
    }

    public String tf1ToString() {
        return tf1 != null ? tf1.toString() : null;
    }

    /**
     * Feedback lag time constant (Tf2).  Typical Value = 0.
     */
    private Double tf2; // Seconds

    public Double getTf2() {
        return tf2;
    }

    public void setTf2(Double _value_) {
        tf2 = _value_;
    }

    public void setTf2(String _value_) {
        tf2 = getDoubleFromString(_value_);
    }

    public String tf2ToString() {
        return tf2 != null ? tf2.toString() : null;
    }

    /**
     * Field current Bridge time constant (Tp).  Typical Value = 0.
     */
    private Double tp; // Seconds

    public Double getTp() {
        return tp;
    }

    public void setTp(Double _value_) {
        tp = _value_;
    }

    public void setTp(String _value_) {
        tp = getDoubleFromString(_value_);
    }

    public String tpToString() {
        return tp != null ? tp.toString() : null;
    }

    /**
     * Maximum compounding voltage (Vcmax).  Typical Value = 0.
     */
    private Double vcmax; // PU

    public Double getVcmax() {
        return vcmax;
    }

    public void setVcmax(Double _value_) {
        vcmax = _value_;
    }

    public void setVcmax(String _value_) {
        vcmax = getDoubleFromString(_value_);
    }

    public String vcmaxToString() {
        return vcmax != null ? vcmax.toString() : null;
    }

    /**
     * Maximum Exciter Field Current (Vfmax).  Typical Value = 47.
     */
    private Double vfmax; // PU

    public Double getVfmax() {
        return vfmax;
    }

    public void setVfmax(Double _value_) {
        vfmax = _value_;
    }

    public void setVfmax(String _value_) {
        vfmax = getDoubleFromString(_value_);
    }

    public String vfmaxToString() {
        return vfmax != null ? vfmax.toString() : null;
    }

    /**
     * Minimum Exciter Field Current (Vfmin).  Typical Value = -20.
     */
    private Double vfmin; // PU

    public Double getVfmin() {
        return vfmin;
    }

    public void setVfmin(Double _value_) {
        vfmin = _value_;
    }

    public void setVfmin(String _value_) {
        vfmin = getDoubleFromString(_value_);
    }

    public String vfminToString() {
        return vfmin != null ? vfmin.toString() : null;
    }

    /**
     * Voltage Regulator Input Limit (Vimax).  Typical Value = 0.1.
     */
    private Double vimax; // PU

    public Double getVimax() {
        return vimax;
    }

    public void setVimax(Double _value_) {
        vimax = _value_;
    }

    public void setVimax(String _value_) {
        vimax = getDoubleFromString(_value_);
    }

    public String vimaxToString() {
        return vimax != null ? vimax.toString() : null;
    }

    /**
     * Maximum controller output (Vrmax).  Typical Value = 47.
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
     * Minimum controller output (Vrmin).  Typical Value = -20.
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
     * Exciter compounding reactance (Xc).  Typical Value = 0.
     */
    private Double xc; // PU

    public Double getXc() {
        return xc;
    }

    public void setXc(Double _value_) {
        xc = _value_;
    }

    public void setXc(String _value_) {
        xc = getDoubleFromString(_value_);
    }

    public String xcToString() {
        return xc != null ? xc.toString() : null;
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
        return getAttribute("ExcREXS", attrName);
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
        setAttribute("ExcREXS", attrName, objectValue);
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
        setAttribute("ExcREXS", attrName, stringValue);
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

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/2013/CIM-schema-cim16#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("e1", new AttrDetails("ExcREXS.e1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("e2", new AttrDetails("ExcREXS.e2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fbf", new AttrDetails("ExcREXS.fbf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("flimf", new AttrDetails("ExcREXS.flimf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("ExcREXS.kc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("ExcREXS.kd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcREXS.ke", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kefd", new AttrDetails("ExcREXS.kefd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("ExcREXS.kf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh", new AttrDetails("ExcREXS.kh", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kii", new AttrDetails("ExcREXS.kii", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kip", new AttrDetails("ExcREXS.kip", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks", new AttrDetails("ExcREXS.ks", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kvi", new AttrDetails("ExcREXS.kvi", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kvp", new AttrDetails("ExcREXS.kvp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kvphz", new AttrDetails("ExcREXS.kvphz", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("nvphz", new AttrDetails("ExcREXS.nvphz", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("se1", new AttrDetails("ExcREXS.se1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("se2", new AttrDetails("ExcREXS.se2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("ExcREXS.ta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb1", new AttrDetails("ExcREXS.tb1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb2", new AttrDetails("ExcREXS.tb2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc1", new AttrDetails("ExcREXS.tc1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc2", new AttrDetails("ExcREXS.tc2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcREXS.te", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("ExcREXS.tf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf1", new AttrDetails("ExcREXS.tf1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf2", new AttrDetails("ExcREXS.tf2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tp", new AttrDetails("ExcREXS.tp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vcmax", new AttrDetails("ExcREXS.vcmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vfmax", new AttrDetails("ExcREXS.vfmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vfmin", new AttrDetails("ExcREXS.vfmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimax", new AttrDetails("ExcREXS.vimax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcREXS.vrmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcREXS.vrmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xc", new AttrDetails("ExcREXS.xc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcREXS().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("e1", new GetterSetter(this::e1ToString, null, this::setE1));
        map.put("e2", new GetterSetter(this::e2ToString, null, this::setE2));
        map.put("fbf", new GetterSetter(this::fbfToString, null, this::setFbf));
        map.put("flimf", new GetterSetter(this::flimfToString, null, this::setFlimf));
        map.put("kc", new GetterSetter(this::kcToString, null, this::setKc));
        map.put("kd", new GetterSetter(this::kdToString, null, this::setKd));
        map.put("ke", new GetterSetter(this::keToString, null, this::setKe));
        map.put("kefd", new GetterSetter(this::kefdToString, null, this::setKefd));
        map.put("kf", new GetterSetter(this::kfToString, null, this::setKf));
        map.put("kh", new GetterSetter(this::khToString, null, this::setKh));
        map.put("kii", new GetterSetter(this::kiiToString, null, this::setKii));
        map.put("kip", new GetterSetter(this::kipToString, null, this::setKip));
        map.put("ks", new GetterSetter(this::ksToString, null, this::setKs));
        map.put("kvi", new GetterSetter(this::kviToString, null, this::setKvi));
        map.put("kvp", new GetterSetter(this::kvpToString, null, this::setKvp));
        map.put("kvphz", new GetterSetter(this::kvphzToString, null, this::setKvphz));
        map.put("nvphz", new GetterSetter(this::nvphzToString, null, this::setNvphz));
        map.put("se1", new GetterSetter(this::se1ToString, null, this::setSe1));
        map.put("se2", new GetterSetter(this::se2ToString, null, this::setSe2));
        map.put("ta", new GetterSetter(this::taToString, null, this::setTa));
        map.put("tb1", new GetterSetter(this::tb1ToString, null, this::setTb1));
        map.put("tb2", new GetterSetter(this::tb2ToString, null, this::setTb2));
        map.put("tc1", new GetterSetter(this::tc1ToString, null, this::setTc1));
        map.put("tc2", new GetterSetter(this::tc2ToString, null, this::setTc2));
        map.put("te", new GetterSetter(this::teToString, null, this::setTe));
        map.put("tf", new GetterSetter(this::tfToString, null, this::setTf));
        map.put("tf1", new GetterSetter(this::tf1ToString, null, this::setTf1));
        map.put("tf2", new GetterSetter(this::tf2ToString, null, this::setTf2));
        map.put("tp", new GetterSetter(this::tpToString, null, this::setTp));
        map.put("vcmax", new GetterSetter(this::vcmaxToString, null, this::setVcmax));
        map.put("vfmax", new GetterSetter(this::vfmaxToString, null, this::setVfmax));
        map.put("vfmin", new GetterSetter(this::vfminToString, null, this::setVfmin));
        map.put("vimax", new GetterSetter(this::vimaxToString, null, this::setVimax));
        map.put("vrmax", new GetterSetter(this::vrmaxToString, null, this::setVrmax));
        map.put("vrmin", new GetterSetter(this::vrminToString, null, this::setVrmin));
        map.put("xc", new GetterSetter(this::xcToString, null, this::setXc));
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
