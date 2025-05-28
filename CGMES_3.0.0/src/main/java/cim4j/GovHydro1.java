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
 * Basic hydro turbine governor.
 */
@SuppressWarnings("unused")
public class GovHydro1 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydro1.class);

    /**
     * Constructor.
     */
    public GovHydro1(String rdfid) {
        super("GovHydro1", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovHydro1(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Turbine gain (<i>At</i>) (&gt; 0).  Typical value = 1,2.
     */
    private Double at; // PU

    public Double getAt() {
        return at;
    }

    public void setAt(Double _value_) {
        at = _value_;
    }

    private static Object getAt(BaseClass _this_) {
        return ((GovHydro1) _this_).getAt();
    }

    private static void setAt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro1) _this_).setAt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro1) _this_).setAt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Turbine damping factor (<i>Dturb</i>) (&gt;= 0).  Typical value = 0,5.
     */
    private Double dturb; // PU

    public Double getDturb() {
        return dturb;
    }

    public void setDturb(Double _value_) {
        dturb = _value_;
    }

    private static Object getDturb(BaseClass _this_) {
        return ((GovHydro1) _this_).getDturb();
    }

    private static void setDturb(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro1) _this_).setDturb((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro1) _this_).setDturb(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum gate opening (<i>Gmax</i>) (&gt; 0 and &gt; GovHydro.gmin).  Typical value = 1.
     */
    private Double gmax; // PU

    public Double getGmax() {
        return gmax;
    }

    public void setGmax(Double _value_) {
        gmax = _value_;
    }

    private static Object getGmax(BaseClass _this_) {
        return ((GovHydro1) _this_).getGmax();
    }

    private static void setGmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro1) _this_).setGmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro1) _this_).setGmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum gate opening (<i>Gmin</i>) (&gt;= 0 and &lt; GovHydro1.gmax).  Typical value = 0.
     */
    private Double gmin; // PU

    public Double getGmin() {
        return gmin;
    }

    public void setGmin(Double _value_) {
        gmin = _value_;
    }

    private static Object getGmin(BaseClass _this_) {
        return ((GovHydro1) _this_).getGmin();
    }

    private static void setGmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro1) _this_).setGmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro1) _this_).setGmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Turbine nominal head (<i>hdam</i>).  Typical value = 1.
     */
    private Double hdam; // PU

    public Double getHdam() {
        return hdam;
    }

    public void setHdam(Double _value_) {
        hdam = _value_;
    }

    private static Object getHdam(BaseClass _this_) {
        return ((GovHydro1) _this_).getHdam();
    }

    private static void setHdam(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro1) _this_).setHdam((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro1) _this_).setHdam(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Base for power values (<i>MWbase</i>) (&gt; 0).  Unit = MW.
     */
    private Double mwbase; // ActivePower

    public Double getMwbase() {
        return mwbase;
    }

    public void setMwbase(Double _value_) {
        mwbase = _value_;
    }

    private static Object getMwbase(BaseClass _this_) {
        return ((GovHydro1) _this_).getMwbase();
    }

    private static void setMwbase(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro1) _this_).setMwbase((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro1) _this_).setMwbase(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * No-load flow at nominal head (<i>qnl</i>) (&gt;= 0).  Typical value = 0,08.
     */
    private Double qnl; // PU

    public Double getQnl() {
        return qnl;
    }

    public void setQnl(Double _value_) {
        qnl = _value_;
    }

    private static Object getQnl(BaseClass _this_) {
        return ((GovHydro1) _this_).getQnl();
    }

    private static void setQnl(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro1) _this_).setQnl((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro1) _this_).setQnl(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Permanent droop (<i>R</i>) (&gt; 0).  Typical value = 0,04.
     */
    private Double rperm; // PU

    public Double getRperm() {
        return rperm;
    }

    public void setRperm(Double _value_) {
        rperm = _value_;
    }

    private static Object getRperm(BaseClass _this_) {
        return ((GovHydro1) _this_).getRperm();
    }

    private static void setRperm(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro1) _this_).setRperm((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro1) _this_).setRperm(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Temporary droop (<i>r</i>) (&gt; GovHydro1.rperm).  Typical value = 0,3.
     */
    private Double rtemp; // PU

    public Double getRtemp() {
        return rtemp;
    }

    public void setRtemp(Double _value_) {
        rtemp = _value_;
    }

    private static Object getRtemp(BaseClass _this_) {
        return ((GovHydro1) _this_).getRtemp();
    }

    private static void setRtemp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro1) _this_).setRtemp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro1) _this_).setRtemp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter time constant (<i>Tf</i>) (&gt; 0).  Typical value = 0,05.
     */
    private Double tf; // Seconds

    public Double getTf() {
        return tf;
    }

    public void setTf(Double _value_) {
        tf = _value_;
    }

    private static Object getTf(BaseClass _this_) {
        return ((GovHydro1) _this_).getTf();
    }

    private static void setTf(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro1) _this_).setTf((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro1) _this_).setTf(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Gate servo time constant (<i>Tg</i>) (&gt; 0).  Typical value = 0,5.
     */
    private Double tg; // Seconds

    public Double getTg() {
        return tg;
    }

    public void setTg(Double _value_) {
        tg = _value_;
    }

    private static Object getTg(BaseClass _this_) {
        return ((GovHydro1) _this_).getTg();
    }

    private static void setTg(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro1) _this_).setTg((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro1) _this_).setTg(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Washout time constant (<i>Tr</i>) (&gt; 0).  Typical value = 5.
     */
    private Double tr; // Seconds

    public Double getTr() {
        return tr;
    }

    public void setTr(Double _value_) {
        tr = _value_;
    }

    private static Object getTr(BaseClass _this_) {
        return ((GovHydro1) _this_).getTr();
    }

    private static void setTr(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro1) _this_).setTr((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro1) _this_).setTr(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Water inertia time constant (<i>Tw</i>) (&gt; 0).  Typical value = 1.
     */
    private Double tw; // Seconds

    public Double getTw() {
        return tw;
    }

    public void setTw(Double _value_) {
        tw = _value_;
    }

    private static Object getTw(BaseClass _this_) {
        return ((GovHydro1) _this_).getTw();
    }

    private static void setTw(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovHydro1) _this_).setTw((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro1) _this_).setTw(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum gate velocity (<i>Vlem</i>) (&gt; 0).  Typical value = 0,2.
     */
    private Float velm; // Float

    public Float getVelm() {
        return velm;
    }

    public void setVelm(Float _value_) {
        velm = _value_;
    }

    private static Object getVelm(BaseClass _this_) {
        return ((GovHydro1) _this_).getVelm();
    }

    private static void setVelm(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((GovHydro1) _this_).setVelm((Float) _value_);
        } else if (_value_ instanceof String) {
            ((GovHydro1) _this_).setVelm(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovHydro1", attrName));
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
                "GovHydro1", attrName, value));
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
            map.put("at", new AttrDetails("GovHydro1.at", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro1::getAt, GovHydro1::setAt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dturb", new AttrDetails("GovHydro1.dturb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro1::getDturb, GovHydro1::setDturb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gmax", new AttrDetails("GovHydro1.gmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro1::getGmax, GovHydro1::setGmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gmin", new AttrDetails("GovHydro1.gmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro1::getGmin, GovHydro1::setGmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("hdam", new AttrDetails("GovHydro1.hdam", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro1::getHdam, GovHydro1::setHdam));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovHydro1.mwbase", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro1::getMwbase, GovHydro1::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qnl", new AttrDetails("GovHydro1.qnl", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro1::getQnl, GovHydro1::setQnl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rperm", new AttrDetails("GovHydro1.rperm", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro1::getRperm, GovHydro1::setRperm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rtemp", new AttrDetails("GovHydro1.rtemp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro1::getRtemp, GovHydro1::setRtemp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("GovHydro1.tf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro1::getTf, GovHydro1::setTf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tg", new AttrDetails("GovHydro1.tg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro1::getTg, GovHydro1::setTg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tr", new AttrDetails("GovHydro1.tr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro1::getTr, GovHydro1::setTr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw", new AttrDetails("GovHydro1.tw", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro1::getTw, GovHydro1::setTw));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("velm", new AttrDetails("GovHydro1.velm", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro1::getVelm, GovHydro1::setVelm));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovHydro1(null).allAttrDetailsMap());
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
