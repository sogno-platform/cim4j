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
 * The class models a look up table for the purpose of wind standard models.
 */
@SuppressWarnings("unused")
public class WindDynamicsLookupTable extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindDynamicsLookupTable.class);

    /**
     * Constructor.
     */
    public WindDynamicsLookupTable(String rdfid) {
        super("WindDynamicsLookupTable", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindDynamicsLookupTable(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The wind dynamics lookup table associated with this current control limitation model.
     */
    private WindContCurrLimIEC WindContCurrLimIEC; // ManyToOne

    private String WindContCurrLimIECId;

    public WindContCurrLimIEC getWindContCurrLimIEC() {
        return WindContCurrLimIEC;
    }

    public void setWindContCurrLimIEC(WindContCurrLimIEC _object_) {
        if (WindContCurrLimIEC != _object_) {
            WindContCurrLimIEC = _object_;
            _object_.setWindDynamicsLookupTable(this);
            WindContCurrLimIECId = _object_.getRdfid();
        }
    }

    private static Object getWindContCurrLimIEC(BaseClass _this_) {
        var obj = ((WindDynamicsLookupTable) _this_).getWindContCurrLimIEC();
        var id = ((WindDynamicsLookupTable) _this_).WindContCurrLimIECId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setWindContCurrLimIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindDynamicsLookupTable) _this_).WindContCurrLimIECId = (String) _value_;
        } else if (_value_ instanceof WindContCurrLimIEC) {
            ((WindDynamicsLookupTable) _this_).setWindContCurrLimIEC((WindContCurrLimIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindContCurrLimIEC");
        }
    }

    /**
     * The wind dynamics lookup table associated with this P control type 3 model.
     */
    private WindContPType3IEC WindContPType3IEC; // ManyToOne

    private String WindContPType3IECId;

    public WindContPType3IEC getWindContPType3IEC() {
        return WindContPType3IEC;
    }

    public void setWindContPType3IEC(WindContPType3IEC _object_) {
        if (WindContPType3IEC != _object_) {
            WindContPType3IEC = _object_;
            _object_.setWindDynamicsLookupTable(this);
            WindContPType3IECId = _object_.getRdfid();
        }
    }

    private static Object getWindContPType3IEC(BaseClass _this_) {
        var obj = ((WindDynamicsLookupTable) _this_).getWindContPType3IEC();
        var id = ((WindDynamicsLookupTable) _this_).WindContPType3IECId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setWindContPType3IEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindDynamicsLookupTable) _this_).WindContPType3IECId = (String) _value_;
        } else if (_value_ instanceof WindContPType3IEC) {
            ((WindDynamicsLookupTable) _this_).setWindContPType3IEC((WindContPType3IEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindContPType3IEC");
        }
    }

    /**
     * The rotor resistance control model with which this wind dynamics lookup table is associated.
     */
    private WindContRotorRIEC WindContRotorRIEC; // ManyToOne

    private String WindContRotorRIECId;

    public WindContRotorRIEC getWindContRotorRIEC() {
        return WindContRotorRIEC;
    }

    public void setWindContRotorRIEC(WindContRotorRIEC _object_) {
        if (WindContRotorRIEC != _object_) {
            WindContRotorRIEC = _object_;
            _object_.setWindDynamicsLookupTable(this);
            WindContRotorRIECId = _object_.getRdfid();
        }
    }

    private static Object getWindContRotorRIEC(BaseClass _this_) {
        var obj = ((WindDynamicsLookupTable) _this_).getWindContRotorRIEC();
        var id = ((WindDynamicsLookupTable) _this_).WindContRotorRIECId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setWindContRotorRIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindDynamicsLookupTable) _this_).WindContRotorRIECId = (String) _value_;
        } else if (_value_ instanceof WindContRotorRIEC) {
            ((WindDynamicsLookupTable) _this_).setWindContRotorRIEC((WindContRotorRIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindContRotorRIEC");
        }
    }

    /**
     * The wind dynamics lookup table associated with this frequency and active power wind plant model.
     */
    private WindPlantFreqPcontrolIEC WindPlantFreqPcontrolIEC; // ManyToOne

    private String WindPlantFreqPcontrolIECId;

    public WindPlantFreqPcontrolIEC getWindPlantFreqPcontrolIEC() {
        return WindPlantFreqPcontrolIEC;
    }

    public void setWindPlantFreqPcontrolIEC(WindPlantFreqPcontrolIEC _object_) {
        if (WindPlantFreqPcontrolIEC != _object_) {
            WindPlantFreqPcontrolIEC = _object_;
            _object_.setWindDynamicsLookupTable(this);
            WindPlantFreqPcontrolIECId = _object_.getRdfid();
        }
    }

    private static Object getWindPlantFreqPcontrolIEC(BaseClass _this_) {
        var obj = ((WindDynamicsLookupTable) _this_).getWindPlantFreqPcontrolIEC();
        var id = ((WindDynamicsLookupTable) _this_).WindPlantFreqPcontrolIECId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setWindPlantFreqPcontrolIEC(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindDynamicsLookupTable) _this_).WindPlantFreqPcontrolIECId = (String) _value_;
        } else if (_value_ instanceof WindPlantFreqPcontrolIEC) {
            ((WindDynamicsLookupTable) _this_).setWindPlantFreqPcontrolIEC((WindPlantFreqPcontrolIEC) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindPlantFreqPcontrolIEC");
        }
    }

    /**
     * Input value (x) for the lookup table function.
     */
    private Double input; // Simple_Float

    public Double getInput() {
        return input;
    }

    public void setInput(Double _value_) {
        input = _value_;
    }

    private static Object getInput(BaseClass _this_) {
        return ((WindDynamicsLookupTable) _this_).getInput();
    }

    private static void setInput(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindDynamicsLookupTable) _this_).setInput((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindDynamicsLookupTable) _this_).setInput(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Type of the lookup table function.
     */
    private String lookupTableFunctionType; // WindLookupTableFunctionKind

    public String getLookupTableFunctionType() {
        return lookupTableFunctionType;
    }

    public void setLookupTableFunctionType(String _value_) {
        lookupTableFunctionType = _value_;
    }

    private static Object getLookupTableFunctionType(BaseClass _this_) {
        return ((WindDynamicsLookupTable) _this_).getLookupTableFunctionType();
    }

    private static void setLookupTableFunctionType(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((WindDynamicsLookupTable) _this_).setLookupTableFunctionType((String) _value_);
        } else {
            throw new IllegalArgumentException("Object is not String");
        }
    }

    /**
     * Output value (y) for the lookup table function.
     */
    private Double output; // Simple_Float

    public Double getOutput() {
        return output;
    }

    public void setOutput(Double _value_) {
        output = _value_;
    }

    private static Object getOutput(BaseClass _this_) {
        return ((WindDynamicsLookupTable) _this_).getOutput();
    }

    private static void setOutput(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((WindDynamicsLookupTable) _this_).setOutput((Double) _value_);
        } else if (_value_ instanceof String) {
            ((WindDynamicsLookupTable) _this_).setOutput(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Sequence numbers of the pairs of the input (x) and the output (y) of the lookup table function.
     */
    private Integer sequence; // Integer

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer _value_) {
        sequence = _value_;
    }

    private static Object getSequence(BaseClass _this_) {
        return ((WindDynamicsLookupTable) _this_).getSequence();
    }

    private static void setSequence(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((WindDynamicsLookupTable) _this_).setSequence((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((WindDynamicsLookupTable) _this_).setSequence(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindDynamicsLookupTable", attrName));
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
                "WindDynamicsLookupTable", attrName, value));
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
            map.put("WindContCurrLimIEC", new AttrDetails("WindDynamicsLookupTable.WindContCurrLimIEC", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindDynamicsLookupTable::getWindContCurrLimIEC, WindDynamicsLookupTable::setWindContCurrLimIEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindContPType3IEC", new AttrDetails("WindDynamicsLookupTable.WindContPType3IEC", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindDynamicsLookupTable::getWindContPType3IEC, WindDynamicsLookupTable::setWindContPType3IEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindContRotorRIEC", new AttrDetails("WindDynamicsLookupTable.WindContRotorRIEC", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindDynamicsLookupTable::getWindContRotorRIEC, WindDynamicsLookupTable::setWindContRotorRIEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindPlantFreqPcontrolIEC", new AttrDetails("WindDynamicsLookupTable.WindPlantFreqPcontrolIEC", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindDynamicsLookupTable::getWindPlantFreqPcontrolIEC, WindDynamicsLookupTable::setWindPlantFreqPcontrolIEC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("input", new AttrDetails("WindDynamicsLookupTable.input", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindDynamicsLookupTable::getInput, WindDynamicsLookupTable::setInput));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lookupTableFunctionType", new AttrDetails("WindDynamicsLookupTable.lookupTableFunctionType", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, WindDynamicsLookupTable::getLookupTableFunctionType, WindDynamicsLookupTable::setLookupTableFunctionType));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("output", new AttrDetails("WindDynamicsLookupTable.output", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindDynamicsLookupTable::getOutput, WindDynamicsLookupTable::setOutput));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("sequence", new AttrDetails("WindDynamicsLookupTable.sequence", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindDynamicsLookupTable::getSequence, WindDynamicsLookupTable::setSequence));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindDynamicsLookupTable(null).allAttrDetailsMap());
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
