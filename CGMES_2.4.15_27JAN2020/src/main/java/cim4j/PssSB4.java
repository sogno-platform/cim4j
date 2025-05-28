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
 * Power sensitive stabilizer model.
 */
@SuppressWarnings("unused")
public class PssSB4 extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssSB4.class);

    /**
     * Constructor.
     */
    public PssSB4(String rdfid) {
        super("PssSB4", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected PssSB4(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Gain (Kx).
     */
    private Double kx; // PU

    public Double getKx() {
        return kx;
    }

    public void setKx(Double _value_) {
        kx = _value_;
    }

    private static Object getKx(BaseClass _this_) {
        return ((PssSB4) _this_).getKx();
    }

    private static void setKx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSB4) _this_).setKx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSB4) _this_).setKx(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (Ta).
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((PssSB4) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSB4) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSB4) _this_).setTa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (Tb).
     */
    private Double tb; // Seconds

    public Double getTb() {
        return tb;
    }

    public void setTb(Double _value_) {
        tb = _value_;
    }

    private static Object getTb(BaseClass _this_) {
        return ((PssSB4) _this_).getTb();
    }

    private static void setTb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSB4) _this_).setTb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSB4) _this_).setTb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (Tc).
     */
    private Double tc; // Seconds

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    private static Object getTc(BaseClass _this_) {
        return ((PssSB4) _this_).getTc();
    }

    private static void setTc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSB4) _this_).setTc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSB4) _this_).setTc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (Td).
     */
    private Double td; // Seconds

    public Double getTd() {
        return td;
    }

    public void setTd(Double _value_) {
        td = _value_;
    }

    private static Object getTd(BaseClass _this_) {
        return ((PssSB4) _this_).getTd();
    }

    private static void setTd(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSB4) _this_).setTd((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSB4) _this_).setTd(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (Te).
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    private static Object getTe(BaseClass _this_) {
        return ((PssSB4) _this_).getTe();
    }

    private static void setTe(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSB4) _this_).setTe((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSB4) _this_).setTe(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (Tt).
     */
    private Double tt; // Seconds

    public Double getTt() {
        return tt;
    }

    public void setTt(Double _value_) {
        tt = _value_;
    }

    private static Object getTt(BaseClass _this_) {
        return ((PssSB4) _this_).getTt();
    }

    private static void setTt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSB4) _this_).setTt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSB4) _this_).setTt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reset time constant (Tx1).
     */
    private Double tx1; // Seconds

    public Double getTx1() {
        return tx1;
    }

    public void setTx1(Double _value_) {
        tx1 = _value_;
    }

    private static Object getTx1(BaseClass _this_) {
        return ((PssSB4) _this_).getTx1();
    }

    private static void setTx1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSB4) _this_).setTx1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSB4) _this_).setTx1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant (Tx2).
     */
    private Double tx2; // Seconds

    public Double getTx2() {
        return tx2;
    }

    public void setTx2(Double _value_) {
        tx2 = _value_;
    }

    private static Object getTx2(BaseClass _this_) {
        return ((PssSB4) _this_).getTx2();
    }

    private static void setTx2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSB4) _this_).setTx2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSB4) _this_).setTx2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Limiter (Vsmax).
     */
    private Double vsmax; // PU

    public Double getVsmax() {
        return vsmax;
    }

    public void setVsmax(Double _value_) {
        vsmax = _value_;
    }

    private static Object getVsmax(BaseClass _this_) {
        return ((PssSB4) _this_).getVsmax();
    }

    private static void setVsmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSB4) _this_).setVsmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSB4) _this_).setVsmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Limiter (Vsmin).
     */
    private Double vsmin; // PU

    public Double getVsmin() {
        return vsmin;
    }

    public void setVsmin(Double _value_) {
        vsmin = _value_;
    }

    private static Object getVsmin(BaseClass _this_) {
        return ((PssSB4) _this_).getVsmin();
    }

    private static void setVsmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((PssSB4) _this_).setVsmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((PssSB4) _this_).setVsmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PssSB4", attrName));
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
                "PssSB4", attrName, value));
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
            map.put("kx", new AttrDetails("PssSB4.kx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSB4::getKx, PssSB4::setKx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("PssSB4.ta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSB4::getTa, PssSB4::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("PssSB4.tb", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSB4::getTb, PssSB4::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("PssSB4.tc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSB4::getTc, PssSB4::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("td", new AttrDetails("PssSB4.td", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSB4::getTd, PssSB4::setTd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("PssSB4.te", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSB4::getTe, PssSB4::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tt", new AttrDetails("PssSB4.tt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSB4::getTt, PssSB4::setTt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tx1", new AttrDetails("PssSB4.tx1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSB4::getTx1, PssSB4::setTx1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tx2", new AttrDetails("PssSB4.tx2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSB4::getTx2, PssSB4::setTx2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsmax", new AttrDetails("PssSB4.vsmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSB4::getVsmax, PssSB4::setVsmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsmin", new AttrDetails("PssSB4.vsmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSB4::getVsmin, PssSB4::setVsmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PssSB4(null).allAttrDetailsMap());
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
