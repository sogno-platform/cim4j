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
 * Describes a tabular curve for how the phase angle difference and impedance varies with the tap step.
 */
@SuppressWarnings("unused")
public class PhaseTapChangerTable extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(PhaseTapChangerTable.class);

    /**
     * Constructor.
     */
    public PhaseTapChangerTable(String rdfid) {
        super("PhaseTapChangerTable", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected PhaseTapChangerTable(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The points of this table.
     *
     * NOT USED
     */
    private Set<PhaseTapChangerTablePoint> PhaseTapChangerTablePoint = new HashSet<>(); // OneToMany

    private Set<String> PhaseTapChangerTablePointIdSet = new HashSet<>();

    public Set<PhaseTapChangerTablePoint> getPhaseTapChangerTablePoint() {
        return PhaseTapChangerTablePoint;
    }

    public void setPhaseTapChangerTablePoint(PhaseTapChangerTablePoint _object_) {
        if (!PhaseTapChangerTablePoint.contains(_object_)) {
            PhaseTapChangerTablePoint.add(_object_);
            _object_.setPhaseTapChangerTable(this);
            PhaseTapChangerTablePointIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getPhaseTapChangerTablePoint(BaseClass _this_) {
        var objs = ((PhaseTapChangerTable) _this_).getPhaseTapChangerTablePoint();
        var ids = ((PhaseTapChangerTable) _this_).PhaseTapChangerTablePointIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setPhaseTapChangerTablePoint(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((PhaseTapChangerTable) _this_).PhaseTapChangerTablePointIdSet.add((String) _value_);
        } else if (_value_ instanceof PhaseTapChangerTablePoint) {
            ((PhaseTapChangerTable) _this_).setPhaseTapChangerTablePoint((PhaseTapChangerTablePoint) _value_);
        } else {
            throw new IllegalArgumentException("Object is not PhaseTapChangerTablePoint");
        }
    }

    /**
     * The phase tap changers to which this phase tap table applies.
     *
     * NOT USED
     */
    private Set<PhaseTapChangerTabular> PhaseTapChangerTabular = new HashSet<>(); // OneToMany

    private Set<String> PhaseTapChangerTabularIdSet = new HashSet<>();

    public Set<PhaseTapChangerTabular> getPhaseTapChangerTabular() {
        return PhaseTapChangerTabular;
    }

    public void setPhaseTapChangerTabular(PhaseTapChangerTabular _object_) {
        if (!PhaseTapChangerTabular.contains(_object_)) {
            PhaseTapChangerTabular.add(_object_);
            _object_.setPhaseTapChangerTable(this);
            PhaseTapChangerTabularIdSet.add(_object_.getRdfid());
        }
    }

    private static Object getPhaseTapChangerTabular(BaseClass _this_) {
        var objs = ((PhaseTapChangerTable) _this_).getPhaseTapChangerTabular();
        var ids = ((PhaseTapChangerTable) _this_).PhaseTapChangerTabularIdSet;
        if (objs.size() < ids.size()) {
            return ids;
        }
        return objs;
    }

    private static void setPhaseTapChangerTabular(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((PhaseTapChangerTable) _this_).PhaseTapChangerTabularIdSet.add((String) _value_);
        } else if (_value_ instanceof PhaseTapChangerTabular) {
            ((PhaseTapChangerTable) _this_).setPhaseTapChangerTabular((PhaseTapChangerTabular) _value_);
        } else {
            throw new IllegalArgumentException("Object is not PhaseTapChangerTabular");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PhaseTapChangerTable", attrName));
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
                "PhaseTapChangerTable", attrName, value));
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
            profiles.add(CGMESProfile.EQ);
            map.put("PhaseTapChangerTablePoint", new AttrDetails("PhaseTapChangerTable.PhaseTapChangerTablePoint", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, PhaseTapChangerTable::getPhaseTapChangerTablePoint, PhaseTapChangerTable::setPhaseTapChangerTablePoint));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("PhaseTapChangerTabular", new AttrDetails("PhaseTapChangerTable.PhaseTapChangerTabular", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, PhaseTapChangerTable::getPhaseTapChangerTabular, PhaseTapChangerTable::setPhaseTapChangerTabular));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PhaseTapChangerTable(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
        POSSIBLE_PROFILES = Collections.unmodifiableSet(profiles);
    }

    private static final CGMESProfile RECOMMENDED_PROFILE = CGMESProfile.EQ;

    private static final Set<CGMESProfile> POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>(POSSIBLE_PROFILES);
        for (var attrDetails : ATTR_DETAILS_MAP.values()) {
            profiles.addAll(attrDetails.profiles);
        }
        POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES = Collections.unmodifiableSet(profiles);
    }
}
