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
 * Describes the translation of a set of values into a name and is intendend to facilitate custom translations. Each ValueAliasSet has a name, description etc. A specific Measurement may represent a discrete state like Open, Closed, Intermediate etc. This requires a translation from the MeasurementValue.value number to a string, e.g. 0-&gt;"Invalid", 1-&gt;"Open", 2-&gt;"Closed", 3-&gt;"Intermediate". Each ValueToAlias member in ValueAliasSet.Value describe a mapping for one particular value to a name.
 */
@SuppressWarnings("unused")
public class ValueAliasSet extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(ValueAliasSet.class);

    /**
     * Constructor.
     */
    public ValueAliasSet(String rdfid) {
        super("ValueAliasSet", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ValueAliasSet(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The Commands using the set for translation.
     *
     * NOT USED
     */
    private Set<Command> Commands = new HashSet<>(); // OneToMany

    private Set<String> CommandsIdSet = new HashSet<>();

    public Set<Command> getCommands() {
        return Commands;
    }

    public void setCommands(Command _object_) {
        if (!Commands.contains(_object_)) {
            Commands.add(_object_);
            _object_.setValueAliasSet(this);
            CommandsIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getCommands(BaseClass _this_) {
        var objs = ((ValueAliasSet) _this_).getCommands();
        var ids = ((ValueAliasSet) _this_).CommandsIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setCommands(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ValueAliasSet) _this_).CommandsIdSet.add((String) _value_);
        } else if (_value_ instanceof Command) {
            ((ValueAliasSet) _this_).setCommands((Command) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Command");
        }
    }

    /**
     * The Measurements using the set for translation.
     *
     * NOT USED
     */
    private Set<Discrete> Discretes = new HashSet<>(); // OneToMany

    private Set<String> DiscretesIdSet = new HashSet<>();

    public Set<Discrete> getDiscretes() {
        return Discretes;
    }

    public void setDiscretes(Discrete _object_) {
        if (!Discretes.contains(_object_)) {
            Discretes.add(_object_);
            _object_.setValueAliasSet(this);
            DiscretesIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getDiscretes(BaseClass _this_) {
        var objs = ((ValueAliasSet) _this_).getDiscretes();
        var ids = ((ValueAliasSet) _this_).DiscretesIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setDiscretes(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ValueAliasSet) _this_).DiscretesIdSet.add((String) _value_);
        } else if (_value_ instanceof Discrete) {
            ((ValueAliasSet) _this_).setDiscretes((Discrete) _value_);
        } else {
            throw new IllegalArgumentException("Object is not Discrete");
        }
    }

    /**
     * The Commands using the set for translation.
     *
     * NOT USED
     */
    private Set<RaiseLowerCommand> RaiseLowerCommands = new HashSet<>(); // OneToMany

    private Set<String> RaiseLowerCommandsIdSet = new HashSet<>();

    public Set<RaiseLowerCommand> getRaiseLowerCommands() {
        return RaiseLowerCommands;
    }

    public void setRaiseLowerCommands(RaiseLowerCommand _object_) {
        if (!RaiseLowerCommands.contains(_object_)) {
            RaiseLowerCommands.add(_object_);
            _object_.setValueAliasSet(this);
            RaiseLowerCommandsIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getRaiseLowerCommands(BaseClass _this_) {
        var objs = ((ValueAliasSet) _this_).getRaiseLowerCommands();
        var ids = ((ValueAliasSet) _this_).RaiseLowerCommandsIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setRaiseLowerCommands(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ValueAliasSet) _this_).RaiseLowerCommandsIdSet.add((String) _value_);
        } else if (_value_ instanceof RaiseLowerCommand) {
            ((ValueAliasSet) _this_).setRaiseLowerCommands((RaiseLowerCommand) _value_);
        } else {
            throw new IllegalArgumentException("Object is not RaiseLowerCommand");
        }
    }

    /**
     * The ValueToAlias mappings included in the set.
     *
     * NOT USED
     */
    private Set<ValueToAlias> Values = new HashSet<>(); // OneToMany

    private Set<String> ValuesIdSet = new HashSet<>();

    public Set<ValueToAlias> getValues() {
        return Values;
    }

    public void setValues(ValueToAlias _object_) {
        if (!Values.contains(_object_)) {
            Values.add(_object_);
            _object_.setValueAliasSet(this);
            ValuesIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getValues(BaseClass _this_) {
        var objs = ((ValueAliasSet) _this_).getValues();
        var ids = ((ValueAliasSet) _this_).ValuesIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setValues(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ValueAliasSet) _this_).ValuesIdSet.add((String) _value_);
        } else if (_value_ instanceof ValueToAlias) {
            ((ValueAliasSet) _this_).setValues((ValueToAlias) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ValueToAlias");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ValueAliasSet", attrName));
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
                "ValueAliasSet", attrName, value));
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
            profiles.add(CGMESProfile.OP);
            map.put("Commands", new AttrDetails("ValueAliasSet.Commands", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, ValueAliasSet::getCommands, ValueAliasSet::setCommands));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("Discretes", new AttrDetails("ValueAliasSet.Discretes", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, ValueAliasSet::getDiscretes, ValueAliasSet::setDiscretes));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("RaiseLowerCommands", new AttrDetails("ValueAliasSet.RaiseLowerCommands", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, ValueAliasSet::getRaiseLowerCommands, ValueAliasSet::setRaiseLowerCommands));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.OP);
            map.put("Values", new AttrDetails("ValueAliasSet.Values", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, ValueAliasSet::getValues, ValueAliasSet::setValues));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ValueAliasSet(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.OP);
        POSSIBLE_PROFILES = Collections.unmodifiableSet(profiles);
    }

    private static final CGMESProfile RECOMMENDED_PROFILE = CGMESProfile.OP;

    private static final Set<CGMESProfile> POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>(POSSIBLE_PROFILES);
        for (var attrDetails : ATTR_DETAILS_MAP.values()) {
            profiles.addAll(attrDetails.profiles);
        }
        POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES = Collections.unmodifiableSet(profiles);
    }
}
