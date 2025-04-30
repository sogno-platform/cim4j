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
 * P control model Type 3.  Reference: IEC Standard 61400-27-1 Section 6.6.5.3.
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
     * The P control type 3 model with which this wind dynamics lookup table is associated.
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
     * Wind turbine type 3 model with which this Wind control P type 3 model is associated.
     *
     * NOT USED
     */
    private WindGenTurbineType3IEC WindGenTurbineType3IEC; // OneToOne

    public WindGenTurbineType3IEC getWindGenTurbineType3IEC() {
        return WindGenTurbineType3IEC;
    }

    public void setWindGenTurbineType3IEC(BaseClass _object_) {
        if (!(_object_ instanceof WindGenTurbineType3IEC)) {
            throw new IllegalArgumentException("Object is not WindGenTurbineType3IEC");
        }
        if (WindGenTurbineType3IEC != _object_) {
            WindGenTurbineType3IEC = (WindGenTurbineType3IEC) _object_;
            WindGenTurbineType3IEC.setWindContPType3IEC(this);
        }
    }

    public String WindGenTurbineType3IECToString() {
        return WindGenTurbineType3IEC != null ? WindGenTurbineType3IEC.getRdfid() : null;
    }

    /**
     * Maximum wind turbine power ramp rate (). It is project dependent parameter.
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
     * Limitation of torque rise rate during LVRT for S (d). It is project dependent parameter.
     */
    private Double dtrisemaxlvrt; // PU

    public Double getDtrisemaxlvrt() {
        return dtrisemaxlvrt;
    }

    public void setDtrisemaxlvrt(Double _value_) {
        dtrisemaxlvrt = _value_;
    }

    public void setDtrisemaxlvrt(String _value_) {
        dtrisemaxlvrt = getDoubleFromString(_value_);
    }

    public String dtrisemaxlvrtToString() {
        return dtrisemaxlvrt != null ? dtrisemaxlvrt.toString() : null;
    }

    /**
     * Gain for active drive train damping (). It is type dependent parameter.
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
     * PI controller integration parameter (). It is type dependent parameter.
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
     * PI controller proportional gain (). It is type dependent parameter.
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
     * Enable LVRT power control mode (M true = 1: voltage control false = 0: reactive power control.  It is project dependent parameter.
     */
    private Boolean mplvrt; // Boolean

    public Boolean getMplvrt() {
        return mplvrt;
    }

    public void setMplvrt(Boolean _value_) {
        mplvrt = _value_;
    }

    public void setMplvrt(String _value_) {
        mplvrt = getBooleanFromString(_value_);
    }

    public String mplvrtToString() {
        return mplvrt != null ? mplvrt.toString() : null;
    }

    /**
     * Offset to reference value that limits controller action during rotor speed changes (omega). It is case dependent parameter.
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
     * Maximum active drive train damping power (). It is type dependent parameter.
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
     * Ramp limitation of torque, required in some grid codes (). It is project dependent parameter.
     */
    private Double rramp; // PU

    public Double getRramp() {
        return rramp;
    }

    public void setRramp(Double _value_) {
        rramp = _value_;
    }

    public void setRramp(String _value_) {
        rramp = getDoubleFromString(_value_);
    }

    public String rrampToString() {
        return rramp != null ? rramp.toString() : null;
    }

    /**
     * Timedelay after deep voltage sags (T). It is project dependent parameter.
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
     * Minimum electrical generator torque (). It is type dependent parameter.
     */
    private Double temin; // PU

    public Double getTemin() {
        return temin;
    }

    public void setTemin(Double _value_) {
        temin = _value_;
    }

    public void setTemin(String _value_) {
        temin = getDoubleFromString(_value_);
    }

    public String teminToString() {
        return temin != null ? temin.toString() : null;
    }

    /**
     * Filter time constant for generator speed measurement (). It is type dependent parameter.
     */
    private Double tomegafilt; // Seconds

    public Double getTomegafilt() {
        return tomegafilt;
    }

    public void setTomegafilt(Double _value_) {
        tomegafilt = _value_;
    }

    public void setTomegafilt(String _value_) {
        tomegafilt = getDoubleFromString(_value_);
    }

    public String tomegafiltToString() {
        return tomegafilt != null ? tomegafilt.toString() : null;
    }

    /**
     * Filter time constant for power measurement (). It is type dependent parameter.
     */
    private Double tpfilt; // Seconds

    public Double getTpfilt() {
        return tpfilt;
    }

    public void setTpfilt(Double _value_) {
        tpfilt = _value_;
    }

    public void setTpfilt(String _value_) {
        tpfilt = getDoubleFromString(_value_);
    }

    public String tpfiltToString() {
        return tpfilt != null ? tpfilt.toString() : null;
    }

    /**
     * Time constant in power order lag (). It is type dependent parameter.
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
     * Filter time constant for voltage measurement (). It is type dependent parameter.
     */
    private Double tufilt; // Seconds

    public Double getTufilt() {
        return tufilt;
    }

    public void setTufilt(Double _value_) {
        tufilt = _value_;
    }

    public void setTufilt(String _value_) {
        tufilt = getDoubleFromString(_value_);
    }

    public String tufiltToString() {
        return tufilt != null ? tufilt.toString() : null;
    }

    /**
     * Voltage scaling factor of reset-torque (T). It is project dependent parameter.
     */
    private Double tuscale; // PU

    public Double getTuscale() {
        return tuscale;
    }

    public void setTuscale(Double _value_) {
        tuscale = _value_;
    }

    public void setTuscale(String _value_) {
        tuscale = getDoubleFromString(_value_);
    }

    public String tuscaleToString() {
        return tuscale != null ? tuscale.toString() : null;
    }

    /**
     * Time constant in speed reference filter (). It is type dependent parameter.
     */
    private Double twref; // Seconds

    public Double getTwref() {
        return twref;
    }

    public void setTwref(Double _value_) {
        twref = _value_;
    }

    public void setTwref(String _value_) {
        twref = getDoubleFromString(_value_);
    }

    public String twrefToString() {
        return twref != null ? twref.toString() : null;
    }

    /**
     * Voltage limit for hold LVRT status after deep voltage sags (). It is project dependent parameter.
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
     * Voltage dip threshold for P-control ().  Part of turbine control, often different (e.g 0.8) from converter thresholds. It is project dependent parameter.
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
     * Active drive train damping frequency (omega). It can be calculated from two mass model parameters. It is type dependent parameter.
     */
    private Double wdtd; // PU

    public Double getWdtd() {
        return wdtd;
    }

    public void setWdtd(Double _value_) {
        wdtd = _value_;
    }

    public void setWdtd(String _value_) {
        wdtd = getDoubleFromString(_value_);
    }

    public String wdtdToString() {
        return wdtd != null ? wdtd.toString() : null;
    }

    /**
     * Coefficient for active drive train damping (zeta). It is type dependent parameter.
     */
    private Double zeta; // Simple_Float

    public Double getZeta() {
        return zeta;
    }

    public void setZeta(Double _value_) {
        zeta = _value_;
    }

    public void setZeta(String _value_) {
        zeta = getDoubleFromString(_value_);
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

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/2013/CIM-schema-cim16#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindDynamicsLookupTable", new AttrDetails("WindContPType3IEC.WindDynamicsLookupTable", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindGenTurbineType3IEC", new AttrDetails("WindContPType3IEC.WindGenTurbineType3IEC", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dpmax", new AttrDetails("WindContPType3IEC.dpmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dtrisemaxlvrt", new AttrDetails("WindContPType3IEC.dtrisemaxlvrt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kdtd", new AttrDetails("WindContPType3IEC.kdtd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kip", new AttrDetails("WindContPType3IEC.kip", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpp", new AttrDetails("WindContPType3IEC.kpp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mplvrt", new AttrDetails("WindContPType3IEC.mplvrt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omegaoffset", new AttrDetails("WindContPType3IEC.omegaoffset", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pdtdmax", new AttrDetails("WindContPType3IEC.pdtdmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rramp", new AttrDetails("WindContPType3IEC.rramp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tdvs", new AttrDetails("WindContPType3IEC.tdvs", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("temin", new AttrDetails("WindContPType3IEC.temin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tomegafilt", new AttrDetails("WindContPType3IEC.tomegafilt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpfilt", new AttrDetails("WindContPType3IEC.tpfilt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpord", new AttrDetails("WindContPType3IEC.tpord", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tufilt", new AttrDetails("WindContPType3IEC.tufilt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tuscale", new AttrDetails("WindContPType3IEC.tuscale", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twref", new AttrDetails("WindContPType3IEC.twref", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("udvs", new AttrDetails("WindContPType3IEC.udvs", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("updip", new AttrDetails("WindContPType3IEC.updip", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("wdtd", new AttrDetails("WindContPType3IEC.wdtd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("zeta", new AttrDetails("WindContPType3IEC.zeta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindContPType3IEC().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("WindDynamicsLookupTable", new GetterSetter(this::WindDynamicsLookupTableToString, this::setWindDynamicsLookupTable, null));
        map.put("WindGenTurbineType3IEC", new GetterSetter(this::WindGenTurbineType3IECToString, this::setWindGenTurbineType3IEC, null));
        map.put("dpmax", new GetterSetter(this::dpmaxToString, null, this::setDpmax));
        map.put("dtrisemaxlvrt", new GetterSetter(this::dtrisemaxlvrtToString, null, this::setDtrisemaxlvrt));
        map.put("kdtd", new GetterSetter(this::kdtdToString, null, this::setKdtd));
        map.put("kip", new GetterSetter(this::kipToString, null, this::setKip));
        map.put("kpp", new GetterSetter(this::kppToString, null, this::setKpp));
        map.put("mplvrt", new GetterSetter(this::mplvrtToString, null, this::setMplvrt));
        map.put("omegaoffset", new GetterSetter(this::omegaoffsetToString, null, this::setOmegaoffset));
        map.put("pdtdmax", new GetterSetter(this::pdtdmaxToString, null, this::setPdtdmax));
        map.put("rramp", new GetterSetter(this::rrampToString, null, this::setRramp));
        map.put("tdvs", new GetterSetter(this::tdvsToString, null, this::setTdvs));
        map.put("temin", new GetterSetter(this::teminToString, null, this::setTemin));
        map.put("tomegafilt", new GetterSetter(this::tomegafiltToString, null, this::setTomegafilt));
        map.put("tpfilt", new GetterSetter(this::tpfiltToString, null, this::setTpfilt));
        map.put("tpord", new GetterSetter(this::tpordToString, null, this::setTpord));
        map.put("tufilt", new GetterSetter(this::tufiltToString, null, this::setTufilt));
        map.put("tuscale", new GetterSetter(this::tuscaleToString, null, this::setTuscale));
        map.put("twref", new GetterSetter(this::twrefToString, null, this::setTwref));
        map.put("udvs", new GetterSetter(this::udvsToString, null, this::setUdvs));
        map.put("updip", new GetterSetter(this::updipToString, null, this::setUpdip));
        map.put("wdtd", new GetterSetter(this::wdtdToString, null, this::setWdtd));
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
