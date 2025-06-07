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
 * Simplified plant voltage and reactive power control model for use with type 3 and type 4 wind turbine models. Reference: IEC 61400-27-1:2015, Annex D.
 */
@SuppressWarnings("unused")
public class WindPlantReactiveControlIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindPlantReactiveControlIEC.class);

    /**
     * Constructor.
     */
    public WindPlantReactiveControlIEC(String rdfid) {
        super("WindPlantReactiveControlIEC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindPlantReactiveControlIEC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The wind dynamics lookup table associated with this voltage and reactive power wind plant model.
     *
     * NOT USED
     */
    private Set<WindDynamicsLookupTable> WindDynamicsLookupTable = new HashSet<>(); // OneToMany

    public Set<WindDynamicsLookupTable> getWindDynamicsLookupTable() {
        return WindDynamicsLookupTable;
    }

    public void setWindDynamicsLookupTable(WindDynamicsLookupTable _object_) {
        if (!WindDynamicsLookupTable.contains(_object_)) {
            WindDynamicsLookupTable.add(_object_);
            _object_.setWindPlantReactiveControlIEC(this);
        }
    }

    private static Object getWindDynamicsLookupTable(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getWindDynamicsLookupTable();
    }

    private static void setWindDynamicsLookupTable(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindDynamicsLookupTable) {
            ((WindPlantReactiveControlIEC) _this_).setWindDynamicsLookupTable((WindDynamicsLookupTable) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindDynamicsLookupTable");
        }
    }

    /**
     * Wind plant reactive control model associated with this wind plant.
     *
     * NOT USED
     */
    private WindPlantIEC WindPlantIEC; // OneToOne

    public WindPlantIEC getWindPlantIEC() {
        return WindPlantIEC;
    }

    public void setWindPlantIEC(WindPlantIEC _object_) {
        if (WindPlantIEC != _object_) {
            WindPlantIEC = _object_;
            WindPlantIEC.setWindPlantReactiveControlIEC(this);
        }
    }

    private static Object getWindPlantIEC(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getWindPlantIEC();
    }

    private static void setWindPlantIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof WindPlantIEC) {
            ((WindPlantReactiveControlIEC) _this_).setWindPlantIEC((WindPlantIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindPlantIEC");
        }
    }

    /**
     * Maximum positive ramp rate for wind turbine reactive power/voltage reference (<i>dx</i><i><sub>refmax</sub></i>) (&gt; WindPlantReactiveControlIEC.dxrefmin). It is a project-dependent parameter.
     */
    private Double dxrefmax; // PU

    public Double getDxrefmax() {
        return dxrefmax;
    }

    public void setDxrefmax(Double _value_) {
        dxrefmax = _value_;
    }

    private static Object getDxrefmax(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getDxrefmax();
    }

    private static void setDxrefmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setDxrefmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setDxrefmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum negative ramp rate for wind turbine reactive power/voltage reference (<i>dx</i><i><sub>refmin</sub></i>) (&lt; WindPlantReactiveControlIEC.dxrefmax). It is a project-dependent parameter.
     */
    private Double dxrefmin; // PU

    public Double getDxrefmin() {
        return dxrefmin;
    }

    public void setDxrefmin(Double _value_) {
        dxrefmin = _value_;
    }

    private static Object getDxrefmin(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getDxrefmin();
    }

    private static void setDxrefmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setDxrefmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setDxrefmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Plant Q controller integral gain (<i>K</i><i><sub>IWPx</sub></i>). It is a project-dependent parameter.
     */
    private Float kiwpx; // Float

    public Float getKiwpx() {
        return kiwpx;
    }

    public void setKiwpx(Float _value_) {
        kiwpx = _value_;
    }

    private static Object getKiwpx(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getKiwpx();
    }

    private static void setKiwpx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((WindPlantReactiveControlIEC) _this_).setKiwpx((Float) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setKiwpx(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Maximum reactive power/voltage reference from integration (<i>K</i><i><sub>IWPxmax</sub></i>) (&gt; WindPlantReactiveControlIEC.kiwpxmin). It is a project-dependent parameter.
     */
    private Double kiwpxmax; // PU

    public Double getKiwpxmax() {
        return kiwpxmax;
    }

    public void setKiwpxmax(Double _value_) {
        kiwpxmax = _value_;
    }

    private static Object getKiwpxmax(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getKiwpxmax();
    }

    private static void setKiwpxmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setKiwpxmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setKiwpxmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum reactive power/voltage reference from integration (<i>K</i><i><sub>IWPxmin</sub></i>) (&lt; WindPlantReactiveControlIEC.kiwpxmax). It is a project-dependent parameter.
     */
    private Double kiwpxmin; // PU

    public Double getKiwpxmin() {
        return kiwpxmin;
    }

    public void setKiwpxmin(Double _value_) {
        kiwpxmin = _value_;
    }

    private static Object getKiwpxmin(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getKiwpxmin();
    }

    private static void setKiwpxmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setKiwpxmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setKiwpxmin(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Plant Q controller proportional gain (<i>K</i><i><sub>PWPx</sub></i>). It is a project-dependent parameter.
     */
    private Float kpwpx; // Float

    public Float getKpwpx() {
        return kpwpx;
    }

    public void setKpwpx(Float _value_) {
        kpwpx = _value_;
    }

    private static Object getKpwpx(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getKpwpx();
    }

    private static void setKpwpx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Float) {
            ((WindPlantReactiveControlIEC) _this_).setKpwpx((Float) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setKpwpx(getFloatFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Float nor String");
        }
    }

    /**
     * Reactive power reference gain (<i>K</i><i><sub>WPqref</sub></i>). It is a project-dependent parameter.
     */
    private Double kwpqref; // PU

    public Double getKwpqref() {
        return kwpqref;
    }

    public void setKwpqref(Double _value_) {
        kwpqref = _value_;
    }

    private static Object getKwpqref(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getKwpqref();
    }

    private static void setKwpqref(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setKwpqref((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setKwpqref(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Plant voltage control droop (<i>K</i><i><sub>WPqu</sub></i>). It is a project-dependent parameter.
     */
    private Double kwpqu; // PU

    public Double getKwpqu() {
        return kwpqu;
    }

    public void setKwpqu(Double _value_) {
        kwpqu = _value_;
    }

    private static Object getKwpqu(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getKwpqu();
    }

    private static void setKwpqu(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setKwpqu((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setKwpqu(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter time constant for voltage-dependent reactive power (<i>T</i><i><sub>uqfilt</sub></i>) (&gt;= 0). It is a project-dependent parameter.
     */
    private Double tuqfilt; // Seconds

    public Double getTuqfilt() {
        return tuqfilt;
    }

    public void setTuqfilt(Double _value_) {
        tuqfilt = _value_;
    }

    private static Object getTuqfilt(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getTuqfilt();
    }

    private static void setTuqfilt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setTuqfilt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setTuqfilt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter time constant for active power measurement (<i>T</i><i><sub>WPpfiltq</sub></i>) (&gt;= 0). It is a project-dependent parameter.
     */
    private Double twppfiltq; // Seconds

    public Double getTwppfiltq() {
        return twppfiltq;
    }

    public void setTwppfiltq(Double _value_) {
        twppfiltq = _value_;
    }

    private static Object getTwppfiltq(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getTwppfiltq();
    }

    private static void setTwppfiltq(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setTwppfiltq((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setTwppfiltq(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter time constant for reactive power measurement (<i>T</i><i><sub>WPqfiltq</sub></i>) (&gt;= 0). It is a project-dependent parameter.
     */
    private Double twpqfiltq; // Seconds

    public Double getTwpqfiltq() {
        return twpqfiltq;
    }

    public void setTwpqfiltq(Double _value_) {
        twpqfiltq = _value_;
    }

    private static Object getTwpqfiltq(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getTwpqfiltq();
    }

    private static void setTwpqfiltq(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setTwpqfiltq((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setTwpqfiltq(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Filter time constant for voltage measurement (<i>T</i><i><sub>WPufiltq</sub></i>) (&gt;= 0). It is a project-dependent parameter.
     */
    private Double twpufiltq; // Seconds

    public Double getTwpufiltq() {
        return twpufiltq;
    }

    public void setTwpufiltq(Double _value_) {
        twpufiltq = _value_;
    }

    private static Object getTwpufiltq(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getTwpufiltq();
    }

    private static void setTwpufiltq(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setTwpufiltq((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setTwpufiltq(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lead time constant in reference value transfer function (<i>T</i><i><sub>xft</sub></i>) (&gt;= 0). It is a project-dependent parameter.
     */
    private Double txft; // Seconds

    public Double getTxft() {
        return txft;
    }

    public void setTxft(Double _value_) {
        txft = _value_;
    }

    private static Object getTxft(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getTxft();
    }

    private static void setTxft(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setTxft((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setTxft(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lag time constant in reference value transfer function (<i>T</i><i><sub>xfv</sub></i>) (&gt;= 0). It is a project-dependent parameter.
     */
    private Double txfv; // Seconds

    public Double getTxfv() {
        return txfv;
    }

    public void setTxfv(Double _value_) {
        txfv = _value_;
    }

    private static Object getTxfv(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getTxfv();
    }

    private static void setTxfv(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setTxfv((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setTxfv(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Voltage threshold for UVRT detection in Q control (<i>u</i><i><sub>WPqdip</sub></i>). It is a project-dependent parameter.
     */
    private Double uwpqdip; // PU

    public Double getUwpqdip() {
        return uwpqdip;
    }

    public void setUwpqdip(Double _value_) {
        uwpqdip = _value_;
    }

    private static Object getUwpqdip(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getUwpqdip();
    }

    private static void setUwpqdip(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setUwpqdip((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setUwpqdip(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reactive power/voltage controller mode (<i>M</i><i><sub>WPqmode</sub></i>). It is a case-dependent parameter.
     */
    private String windPlantQcontrolModesType; // WindPlantQcontrolModeKind

    public String getWindPlantQcontrolModesType() {
        return windPlantQcontrolModesType;
    }

    public void setWindPlantQcontrolModesType(String _value_) {
        windPlantQcontrolModesType = _value_;
    }

    private static Object getWindPlantQcontrolModesType(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getWindPlantQcontrolModesType();
    }

    private static void setWindPlantQcontrolModesType(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setWindPlantQcontrolModesType((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Maximum <i>x</i><sub>WTref</sub> (<i>q</i><i><sub>WTref</sub></i> or delta<i> u</i><i><sub>WTref</sub></i>) request from the plant controller (<i>x</i><i><sub>refmax</sub></i>) (&gt; WindPlantReactiveControlIEC.xrefmin). It is a case-dependent parameter.
     */
    private Double xrefmax; // PU

    public Double getXrefmax() {
        return xrefmax;
    }

    public void setXrefmax(Double _value_) {
        xrefmax = _value_;
    }

    private static Object getXrefmax(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getXrefmax();
    }

    private static void setXrefmax(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setXrefmax((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setXrefmax(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum <i>x</i><i><sub>WTref</sub></i> (<i>q</i><i><sub>WTref</sub></i> or delta <i>u</i><i><sub>WTref</sub></i>) request from the plant controller (<i>x</i><i><sub>refmin</sub></i>) (&lt; WindPlantReactiveControlIEC.xrefmax). It is a project-dependent parameter.
     */
    private Double xrefmin; // PU

    public Double getXrefmin() {
        return xrefmin;
    }

    public void setXrefmin(Double _value_) {
        xrefmin = _value_;
    }

    private static Object getXrefmin(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).getXrefmin();
    }

    private static void setXrefmin(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindPlantReactiveControlIEC) _this_).setXrefmin((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindPlantReactiveControlIEC) _this_).setXrefmin(getDoubleFromString((String) _value_));
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindPlantReactiveControlIEC", attrName));
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
                "WindPlantReactiveControlIEC", attrName, value));
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
            map.put("WindDynamicsLookupTable", new AttrDetails("WindPlantReactiveControlIEC.WindDynamicsLookupTable", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindPlantReactiveControlIEC::getWindDynamicsLookupTable, WindPlantReactiveControlIEC::setWindDynamicsLookupTable));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindPlantIEC", new AttrDetails("WindPlantReactiveControlIEC.WindPlantIEC", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindPlantReactiveControlIEC::getWindPlantIEC, WindPlantReactiveControlIEC::setWindPlantIEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dxrefmax", new AttrDetails("WindPlantReactiveControlIEC.dxrefmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::getDxrefmax, WindPlantReactiveControlIEC::setDxrefmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dxrefmin", new AttrDetails("WindPlantReactiveControlIEC.dxrefmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::getDxrefmin, WindPlantReactiveControlIEC::setDxrefmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiwpx", new AttrDetails("WindPlantReactiveControlIEC.kiwpx", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::getKiwpx, WindPlantReactiveControlIEC::setKiwpx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiwpxmax", new AttrDetails("WindPlantReactiveControlIEC.kiwpxmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::getKiwpxmax, WindPlantReactiveControlIEC::setKiwpxmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiwpxmin", new AttrDetails("WindPlantReactiveControlIEC.kiwpxmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::getKiwpxmin, WindPlantReactiveControlIEC::setKiwpxmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpwpx", new AttrDetails("WindPlantReactiveControlIEC.kpwpx", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::getKpwpx, WindPlantReactiveControlIEC::setKpwpx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kwpqref", new AttrDetails("WindPlantReactiveControlIEC.kwpqref", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::getKwpqref, WindPlantReactiveControlIEC::setKwpqref));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kwpqu", new AttrDetails("WindPlantReactiveControlIEC.kwpqu", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::getKwpqu, WindPlantReactiveControlIEC::setKwpqu));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tuqfilt", new AttrDetails("WindPlantReactiveControlIEC.tuqfilt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::getTuqfilt, WindPlantReactiveControlIEC::setTuqfilt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twppfiltq", new AttrDetails("WindPlantReactiveControlIEC.twppfiltq", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::getTwppfiltq, WindPlantReactiveControlIEC::setTwppfiltq));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twpqfiltq", new AttrDetails("WindPlantReactiveControlIEC.twpqfiltq", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::getTwpqfiltq, WindPlantReactiveControlIEC::setTwpqfiltq));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twpufiltq", new AttrDetails("WindPlantReactiveControlIEC.twpufiltq", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::getTwpufiltq, WindPlantReactiveControlIEC::setTwpufiltq));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("txft", new AttrDetails("WindPlantReactiveControlIEC.txft", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::getTxft, WindPlantReactiveControlIEC::setTxft));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("txfv", new AttrDetails("WindPlantReactiveControlIEC.txfv", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::getTxfv, WindPlantReactiveControlIEC::setTxfv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uwpqdip", new AttrDetails("WindPlantReactiveControlIEC.uwpqdip", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::getUwpqdip, WindPlantReactiveControlIEC::setUwpqdip));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("windPlantQcontrolModesType", new AttrDetails("WindPlantReactiveControlIEC.windPlantQcontrolModesType", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, WindPlantReactiveControlIEC::getWindPlantQcontrolModesType, WindPlantReactiveControlIEC::setWindPlantQcontrolModesType));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xrefmax", new AttrDetails("WindPlantReactiveControlIEC.xrefmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::getXrefmax, WindPlantReactiveControlIEC::setXrefmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xrefmin", new AttrDetails("WindPlantReactiveControlIEC.xrefmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::getXrefmin, WindPlantReactiveControlIEC::setXrefmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindPlantReactiveControlIEC(null).allAttrDetailsMap());
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
