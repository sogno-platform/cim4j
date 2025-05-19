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
 * P control model type 3. Reference: IEC 61400-27-1:2015, 5.6.5.4.
 */
@SuppressWarnings("unused")
public class WindContPType3IEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindContPType3IEC.class);

    /**
     * Default constructor.
     */
    public WindContPType3IEC() {
        setCimType("WindContPType3IEC");
    }

    /**
     * The wind dynamics lookup table associated with this P control type 3 model.
     *
     * NOT USED
     */
    private Set<WindDynamicsLookupTable> WindDynamicsLookupTable = new HashSet<>(); // OneToMany

    public Set<WindDynamicsLookupTable> getWindDynamicsLookupTable() {
        return WindDynamicsLookupTable;
    }

    public void setWindDynamicsLookupTable(BaseClass _object_) {
        if (!(_object_ instanceof WindDynamicsLookupTable)) {
            throw new IllegalArgumentException("Object is not WindDynamicsLookupTable");
        }
        if (!WindDynamicsLookupTable.contains(_object_)) {
            WindDynamicsLookupTable.add((WindDynamicsLookupTable) _object_);
            ((WindDynamicsLookupTable) _object_).setWindContPType3IEC(this);
        }
    }

    public String WindDynamicsLookupTableToString() {
        return getStringFromSet(WindDynamicsLookupTable);
    }

    /**
     * Wind turbine type 3 model with which this wind control P type 3 model is associated.
     *
     * NOT USED
     */
    private WindTurbineType3IEC WindTurbineType3IEC; // OneToOne

    public WindTurbineType3IEC getWindTurbineType3IEC() {
        return WindTurbineType3IEC;
    }

    public void setWindTurbineType3IEC(BaseClass _object_) {
        if (!(_object_ instanceof WindTurbineType3IEC)) {
            throw new IllegalArgumentException("Object is not WindTurbineType3IEC");
        }
        if (WindTurbineType3IEC != _object_) {
            WindTurbineType3IEC = (WindTurbineType3IEC) _object_;
            WindTurbineType3IEC.setWindContPType3IEC(this);
        }
    }

    public String WindTurbineType3IECToString() {
        return WindTurbineType3IEC != null ? WindTurbineType3IEC.getRdfid() : null;
    }

    /**
     * Maximum wind turbine power ramp rate (&lt;i&gt;dp&lt;/i&gt;&lt;i&gt;&lt;sub&gt;max&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double dpmax; // PU

    public Double getDpmax() {
        return dpmax;
    }

    public void setDpmax(Double _value_) {
        dpmax = _value_;
    }

    public void setDpmax(String _value_) {
        dpmax = getDoubleFromString(_value_);
    }

    public String dpmaxToString() {
        return dpmax != null ? dpmax.toString() : null;
    }

    /**
     * Maximum ramp rate of wind turbine reference power (&lt;i&gt;dp&lt;/i&gt;&lt;i&gt;&lt;sub&gt;refmax&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter.
     */
    private Double dprefmax; // PU

    public Double getDprefmax() {
        return dprefmax;
    }

    public void setDprefmax(Double _value_) {
        dprefmax = _value_;
    }

    public void setDprefmax(String _value_) {
        dprefmax = getDoubleFromString(_value_);
    }

    public String dprefmaxToString() {
        return dprefmax != null ? dprefmax.toString() : null;
    }

    /**
     * Minimum ramp rate of wind turbine reference power (&lt;i&gt;dp&lt;/i&gt;&lt;i&gt;&lt;sub&gt;refmin&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter.
     */
    private Double dprefmin; // PU

    public Double getDprefmin() {
        return dprefmin;
    }

    public void setDprefmin(Double _value_) {
        dprefmin = _value_;
    }

    public void setDprefmin(String _value_) {
        dprefmin = getDoubleFromString(_value_);
    }

    public String dprefminToString() {
        return dprefmin != null ? dprefmin.toString() : null;
    }

    /**
     * Ramp limitation of torque, required in some grid codes (&lt;i&gt;dt&lt;/i&gt;&lt;i&gt;&lt;sub&gt;max&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter.
     */
    private Double dthetamax; // PU

    public Double getDthetamax() {
        return dthetamax;
    }

    public void setDthetamax(Double _value_) {
        dthetamax = _value_;
    }

    public void setDthetamax(String _value_) {
        dthetamax = getDoubleFromString(_value_);
    }

    public String dthetamaxToString() {
        return dthetamax != null ? dthetamax.toString() : null;
    }

    /**
     * Limitation of torque rise rate during UVRT (&lt;i&gt;dtheta&lt;/i&gt;&lt;i&gt;&lt;sub&gt;maxUVRT&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter.
     */
    private Double dthetamaxuvrt; // PU

    public Double getDthetamaxuvrt() {
        return dthetamaxuvrt;
    }

    public void setDthetamaxuvrt(Double _value_) {
        dthetamaxuvrt = _value_;
    }

    public void setDthetamaxuvrt(String _value_) {
        dthetamaxuvrt = getDoubleFromString(_value_);
    }

    public String dthetamaxuvrtToString() {
        return dthetamaxuvrt != null ? dthetamaxuvrt.toString() : null;
    }

    /**
     * Gain for active drive train damping (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;DTD&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double kdtd; // PU

    public Double getKdtd() {
        return kdtd;
    }

    public void setKdtd(Double _value_) {
        kdtd = _value_;
    }

    public void setKdtd(String _value_) {
        kdtd = getDoubleFromString(_value_);
    }

    public String kdtdToString() {
        return kdtd != null ? kdtd.toString() : null;
    }

    /**
     * PI controller integration parameter (&lt;i&gt;K&lt;/i&gt;&lt;sub&gt;Ip&lt;/sub&gt;). It is a type-dependent parameter.
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
     * PI controller proportional gain (&lt;i&gt;K&lt;/i&gt;&lt;sub&gt;Pp&lt;/sub&gt;). It is a type-dependent parameter.
     */
    private Double kpp; // PU

    public Double getKpp() {
        return kpp;
    }

    public void setKpp(Double _value_) {
        kpp = _value_;
    }

    public void setKpp(String _value_) {
        kpp = getDoubleFromString(_value_);
    }

    public String kppToString() {
        return kpp != null ? kpp.toString() : null;
    }

    /**
     * Enable UVRT power control mode (&lt;i&gt;M&lt;/i&gt;&lt;i&gt;&lt;sub&gt;pUVRT&lt;/sub&gt;&lt;/i&gt;&lt;sub&gt;)&lt;/sub&gt;.  It is a project-dependent parameter. true = voltage control (1 in the IEC model) false = reactive power control (0 in the IEC model).
     */
    private Boolean mpuvrt; // Boolean

    public Boolean getMpuvrt() {
        return mpuvrt;
    }

    public void setMpuvrt(Boolean _value_) {
        mpuvrt = _value_;
    }

    public void setMpuvrt(String _value_) {
        mpuvrt = getBooleanFromString(_value_);
    }

    public String mpuvrtToString() {
        return mpuvrt != null ? mpuvrt.toString() : null;
    }

    /**
     * Active drive train damping frequency (&lt;i&gt;omega&lt;/i&gt;&lt;i&gt;&lt;sub&gt;DTD&lt;/sub&gt;&lt;/i&gt;). It can be calculated from two mass model parameters. It is a type-dependent parameter.
     */
    private Double omegadtd; // PU

    public Double getOmegadtd() {
        return omegadtd;
    }

    public void setOmegadtd(Double _value_) {
        omegadtd = _value_;
    }

    public void setOmegadtd(String _value_) {
        omegadtd = getDoubleFromString(_value_);
    }

    public String omegadtdToString() {
        return omegadtd != null ? omegadtd.toString() : null;
    }

    /**
     * Offset to reference value that limits controller action during rotor speed changes (&lt;i&gt;omega&lt;/i&gt;&lt;i&gt;&lt;sub&gt;offset&lt;/sub&gt;&lt;/i&gt;). It is a case-dependent parameter.
     */
    private Double omegaoffset; // PU

    public Double getOmegaoffset() {
        return omegaoffset;
    }

    public void setOmegaoffset(Double _value_) {
        omegaoffset = _value_;
    }

    public void setOmegaoffset(String _value_) {
        omegaoffset = getDoubleFromString(_value_);
    }

    public String omegaoffsetToString() {
        return omegaoffset != null ? omegaoffset.toString() : null;
    }

    /**
     * Maximum active drive train damping power (&lt;i&gt;p&lt;/i&gt;&lt;sub&gt;DTDmax&lt;/sub&gt;). It is a type-dependent parameter.
     */
    private Double pdtdmax; // PU

    public Double getPdtdmax() {
        return pdtdmax;
    }

    public void setPdtdmax(Double _value_) {
        pdtdmax = _value_;
    }

    public void setPdtdmax(String _value_) {
        pdtdmax = getDoubleFromString(_value_);
    }

    public String pdtdmaxToString() {
        return pdtdmax != null ? pdtdmax.toString() : null;
    }

    /**
     * Time&lt;sub&gt; &lt;/sub&gt;delay after deep voltage sags (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;DVS&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a project-dependent parameter.
     */
    private Double tdvs; // Seconds

    public Double getTdvs() {
        return tdvs;
    }

    public void setTdvs(Double _value_) {
        tdvs = _value_;
    }

    public void setTdvs(String _value_) {
        tdvs = getDoubleFromString(_value_);
    }

    public String tdvsToString() {
        return tdvs != null ? tdvs.toString() : null;
    }

    /**
     * Minimum electrical generator torque (&lt;i&gt;t&lt;/i&gt;&lt;sub&gt;emin&lt;/sub&gt;). It is a type-dependent parameter.
     */
    private Double thetaemin; // PU

    public Double getThetaemin() {
        return thetaemin;
    }

    public void setThetaemin(Double _value_) {
        thetaemin = _value_;
    }

    public void setThetaemin(String _value_) {
        thetaemin = getDoubleFromString(_value_);
    }

    public String thetaeminToString() {
        return thetaemin != null ? thetaemin.toString() : null;
    }

    /**
     * Voltage scaling factor of reset-torque (&lt;i&gt;t&lt;/i&gt;&lt;sub&gt;uscale&lt;/sub&gt;). It is a project-dependent parameter.
     */
    private Double thetauscale; // PU

    public Double getThetauscale() {
        return thetauscale;
    }

    public void setThetauscale(Double _value_) {
        thetauscale = _value_;
    }

    public void setThetauscale(String _value_) {
        thetauscale = getDoubleFromString(_value_);
    }

    public String thetauscaleToString() {
        return thetauscale != null ? thetauscale.toString() : null;
    }

    /**
     * Filter time constant for generator speed measurement (&lt;i&gt;T&lt;/i&gt;&lt;sub&gt;omegafiltp3&lt;/sub&gt;) (&amp;gt;= 0). It is a type-dependent parameter.
     */
    private Double tomegafiltp3; // Seconds

    public Double getTomegafiltp3() {
        return tomegafiltp3;
    }

    public void setTomegafiltp3(Double _value_) {
        tomegafiltp3 = _value_;
    }

    public void setTomegafiltp3(String _value_) {
        tomegafiltp3 = getDoubleFromString(_value_);
    }

    public String tomegafiltp3ToString() {
        return tomegafiltp3 != null ? tomegafiltp3.toString() : null;
    }

    /**
     * Time constant in speed reference filter (&lt;i&gt;T&lt;/i&gt;&lt;sub&gt;omega,ref&lt;/sub&gt;) (&amp;gt;= 0). It is a type-dependent parameter.
     */
    private Double tomegaref; // Seconds

    public Double getTomegaref() {
        return tomegaref;
    }

    public void setTomegaref(Double _value_) {
        tomegaref = _value_;
    }

    public void setTomegaref(String _value_) {
        tomegaref = getDoubleFromString(_value_);
    }

    public String tomegarefToString() {
        return tomegaref != null ? tomegaref.toString() : null;
    }

    /**
     * Filter time constant for power measurement (&lt;i&gt;T&lt;/i&gt;&lt;sub&gt;pfiltp3&lt;/sub&gt;) (&amp;gt;= 0). It is a type-dependent parameter.
     */
    private Double tpfiltp3; // Seconds

    public Double getTpfiltp3() {
        return tpfiltp3;
    }

    public void setTpfiltp3(Double _value_) {
        tpfiltp3 = _value_;
    }

    public void setTpfiltp3(String _value_) {
        tpfiltp3 = getDoubleFromString(_value_);
    }

    public String tpfiltp3ToString() {
        return tpfiltp3 != null ? tpfiltp3.toString() : null;
    }

    /**
     * Time constant in power order lag (&lt;i&gt;T&lt;/i&gt;&lt;sub&gt;pord&lt;/sub&gt;). It is a type-dependent parameter.
     */
    private Double tpord; // PU

    public Double getTpord() {
        return tpord;
    }

    public void setTpord(Double _value_) {
        tpord = _value_;
    }

    public void setTpord(String _value_) {
        tpord = getDoubleFromString(_value_);
    }

    public String tpordToString() {
        return tpord != null ? tpord.toString() : null;
    }

    /**
     * Filter time constant for voltage measurement (&lt;i&gt;T&lt;/i&gt;&lt;sub&gt;ufiltp3&lt;/sub&gt;) (&amp;gt;= 0). It is a type-dependent parameter.
     */
    private Double tufiltp3; // Seconds

    public Double getTufiltp3() {
        return tufiltp3;
    }

    public void setTufiltp3(Double _value_) {
        tufiltp3 = _value_;
    }

    public void setTufiltp3(String _value_) {
        tufiltp3 = getDoubleFromString(_value_);
    }

    public String tufiltp3ToString() {
        return tufiltp3 != null ? tufiltp3.toString() : null;
    }

    /**
     * Voltage limit for hold UVRT status after deep voltage sags (&lt;i&gt;u&lt;/i&gt;&lt;i&gt;&lt;sub&gt;DVS&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter.
     */
    private Double udvs; // PU

    public Double getUdvs() {
        return udvs;
    }

    public void setUdvs(Double _value_) {
        udvs = _value_;
    }

    public void setUdvs(String _value_) {
        udvs = getDoubleFromString(_value_);
    }

    public String udvsToString() {
        return udvs != null ? udvs.toString() : null;
    }

    /**
     * Voltage dip threshold for P-control (&lt;i&gt;u&lt;/i&gt;&lt;sub&gt;Pdip&lt;/sub&gt;).  Part of turbine control, often different (e.g 0.8) from converter thresholds. It is a project-dependent parameter.
     */
    private Double updip; // PU

    public Double getUpdip() {
        return updip;
    }

    public void setUpdip(Double _value_) {
        updip = _value_;
    }

    public void setUpdip(String _value_) {
        updip = getDoubleFromString(_value_);
    }

    public String updipToString() {
        return updip != null ? updip.toString() : null;
    }

    /**
     * Coefficient for active drive train damping (&lt;i&gt;zeta&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Float zeta; // Float

    public Float getZeta() {
        return zeta;
    }

    public void setZeta(Float _value_) {
        zeta = _value_;
    }

    public void setZeta(String _value_) {
        zeta = getFloatFromString(_value_);
    }

    public String zetaToString() {
        return zeta != null ? zeta.toString() : null;
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
        return getAttribute("WindContPType3IEC", attrName);
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
        setAttribute("WindContPType3IEC", attrName, objectValue);
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
        setAttribute("WindContPType3IEC", attrName, stringValue);
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
            map.put("WindDynamicsLookupTable", new AttrDetails("WindContPType3IEC.WindDynamicsLookupTable", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindTurbineType3IEC", new AttrDetails("WindContPType3IEC.WindTurbineType3IEC", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dpmax", new AttrDetails("WindContPType3IEC.dpmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dprefmax", new AttrDetails("WindContPType3IEC.dprefmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dprefmin", new AttrDetails("WindContPType3IEC.dprefmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dthetamax", new AttrDetails("WindContPType3IEC.dthetamax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dthetamaxuvrt", new AttrDetails("WindContPType3IEC.dthetamaxuvrt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kdtd", new AttrDetails("WindContPType3IEC.kdtd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kip", new AttrDetails("WindContPType3IEC.kip", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpp", new AttrDetails("WindContPType3IEC.kpp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mpuvrt", new AttrDetails("WindContPType3IEC.mpuvrt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omegadtd", new AttrDetails("WindContPType3IEC.omegadtd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omegaoffset", new AttrDetails("WindContPType3IEC.omegaoffset", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pdtdmax", new AttrDetails("WindContPType3IEC.pdtdmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tdvs", new AttrDetails("WindContPType3IEC.tdvs", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("thetaemin", new AttrDetails("WindContPType3IEC.thetaemin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("thetauscale", new AttrDetails("WindContPType3IEC.thetauscale", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tomegafiltp3", new AttrDetails("WindContPType3IEC.tomegafiltp3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tomegaref", new AttrDetails("WindContPType3IEC.tomegaref", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpfiltp3", new AttrDetails("WindContPType3IEC.tpfiltp3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpord", new AttrDetails("WindContPType3IEC.tpord", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tufiltp3", new AttrDetails("WindContPType3IEC.tufiltp3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("udvs", new AttrDetails("WindContPType3IEC.udvs", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("updip", new AttrDetails("WindContPType3IEC.updip", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("zeta", new AttrDetails("WindContPType3IEC.zeta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindContPType3IEC().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("WindDynamicsLookupTable", new GetterSetter(this::WindDynamicsLookupTableToString, this::setWindDynamicsLookupTable, null));
        map.put("WindTurbineType3IEC", new GetterSetter(this::WindTurbineType3IECToString, this::setWindTurbineType3IEC, null));
        map.put("dpmax", new GetterSetter(this::dpmaxToString, null, this::setDpmax));
        map.put("dprefmax", new GetterSetter(this::dprefmaxToString, null, this::setDprefmax));
        map.put("dprefmin", new GetterSetter(this::dprefminToString, null, this::setDprefmin));
        map.put("dthetamax", new GetterSetter(this::dthetamaxToString, null, this::setDthetamax));
        map.put("dthetamaxuvrt", new GetterSetter(this::dthetamaxuvrtToString, null, this::setDthetamaxuvrt));
        map.put("kdtd", new GetterSetter(this::kdtdToString, null, this::setKdtd));
        map.put("kip", new GetterSetter(this::kipToString, null, this::setKip));
        map.put("kpp", new GetterSetter(this::kppToString, null, this::setKpp));
        map.put("mpuvrt", new GetterSetter(this::mpuvrtToString, null, this::setMpuvrt));
        map.put("omegadtd", new GetterSetter(this::omegadtdToString, null, this::setOmegadtd));
        map.put("omegaoffset", new GetterSetter(this::omegaoffsetToString, null, this::setOmegaoffset));
        map.put("pdtdmax", new GetterSetter(this::pdtdmaxToString, null, this::setPdtdmax));
        map.put("tdvs", new GetterSetter(this::tdvsToString, null, this::setTdvs));
        map.put("thetaemin", new GetterSetter(this::thetaeminToString, null, this::setThetaemin));
        map.put("thetauscale", new GetterSetter(this::thetauscaleToString, null, this::setThetauscale));
        map.put("tomegafiltp3", new GetterSetter(this::tomegafiltp3ToString, null, this::setTomegafiltp3));
        map.put("tomegaref", new GetterSetter(this::tomegarefToString, null, this::setTomegaref));
        map.put("tpfiltp3", new GetterSetter(this::tpfiltp3ToString, null, this::setTpfiltp3));
        map.put("tpord", new GetterSetter(this::tpordToString, null, this::setTpord));
        map.put("tufiltp3", new GetterSetter(this::tufiltp3ToString, null, this::setTufiltp3));
        map.put("udvs", new GetterSetter(this::udvsToString, null, this::setUdvs));
        map.put("updip", new GetterSetter(this::updipToString, null, this::setUpdip));
        map.put("zeta", new GetterSetter(this::zetaToString, null, this::setZeta));
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
