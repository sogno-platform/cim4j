/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * This models combines static load and induction motor load effects. The dynamics of the motor are simplified by linearizing the induction machine equations.
 */
public class LoadComposite extends LoadDynamics {

    private static final Logging LOG = Logging.getLogger(LoadComposite.class);

    private BaseClass[] LoadComposite_class_attributes;
    private BaseClass[] LoadComposite_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new LoadComposite().getAttributeNamesMap();
    }

    private enum LoadComposite_primitive_builder implements PrimitiveBuilder {
        epfd() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        epfs() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        epvd() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        epvs() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        eqfd() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        eqfs() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        eqvd() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        eqvs() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        h() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        lfrac() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        pfrac() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum LoadComposite_class_attributes_enum {
        epfd,
        epfs,
        epvd,
        epvs,
        eqfd,
        eqfs,
        eqvd,
        eqvs,
        h,
        lfrac,
        pfrac,
        LAST_ENUM
    }

    public LoadComposite() {
        LoadComposite_primitive_attributes = new BaseClass[LoadComposite_primitive_builder.values().length];
        LoadComposite_class_attributes = new BaseClass[LoadComposite_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new LoadComposite();
    }

    @Override
    public void setValue(java.lang.String s) {
        LOG.error(debugString() + " is not sure what to do with " + s);
    }

    @Override
    public void setRdfid(java.lang.String id) {
        rdfid = id;
    }

    @Override
    public java.lang.String getRdfid() {
        return rdfid;
    }

    private void updateAttributeInArray(LoadComposite_class_attributes_enum attrEnum, BaseClass value) {
        try {
            LoadComposite_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(LoadComposite_primitive_builder attrEnum, BaseClass value) {
        try {
            LoadComposite_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            LoadComposite_class_attributes_enum attrEnum = LoadComposite_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated LoadComposite, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            LoadComposite_primitive_builder attrEnum = LoadComposite_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated LoadComposite, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            LoadComposite_primitive_builder attrEnum = LoadComposite_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = LoadComposite_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            LoadComposite_class_attributes_enum attrEnum = LoadComposite_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = LoadComposite_class_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        if (!defined) {
            return super.getAttribute(attrName);
        }
        return null;
    }

    @Override
    protected Map<java.lang.String, java.lang.String> getAttributeNamesMap() {
        Map<java.lang.String, java.lang.String> namesMap = new LinkedHashMap<>();
        for (var enumValue : LoadComposite_primitive_builder.values()) {
            if (enumValue != LoadComposite_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "LoadComposite." + enumValue.name());
            }
        }
        for (var enumValue : LoadComposite_class_attributes_enum.values()) {
            if (enumValue != LoadComposite_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "LoadComposite." + enumValue.name());
            }
        }
        namesMap.putAll(super.getAttributeNamesMap());
        return namesMap;
    }

    @Override
    public Set<java.lang.String> getAttributeNames() {
        return ATTRIBUTE_NAMES_MAP.keySet();
    }

    @Override
    public java.lang.String getAttributeFullName(java.lang.String attrName) {
        return ATTRIBUTE_NAMES_MAP.get(attrName);
    }

    @Override
    public java.lang.String toString(boolean topClass) {
        java.lang.String result = "";
        if (topClass) {
            for (LoadComposite_primitive_builder attrEnum : LoadComposite_primitive_builder.values()) {
                BaseClass bc = LoadComposite_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    LoadComposite." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (LoadComposite_class_attributes_enum attrEnum : LoadComposite_class_attributes_enum.values()) {
                BaseClass bc = LoadComposite_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    LoadComposite." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(LoadComposite) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "LoadComposite";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }

    /**
     * Get the namespace URL of an object of this class.
     *
     * @return The namespace URL
     */
    @Override
    public java.lang.String getClassNamespaceUrl() {
        return "http://iec.ch/TC57/2013/CIM-schema-cim16#";
    }

    /**
     * Get the namespace URL of an attribute (also for inherited attributes).
     *
     * @return The namespace URL
     */
    @Override
    public java.lang.String getAttributeNamespaceUrl(java.lang.String attrName) {
        return ATTR_NAMESPACE_MAP.get(attrName);
    }

    private static final Map<java.lang.String, java.lang.String> ATTR_NAMESPACE_MAP;
    static {
        ATTR_NAMESPACE_MAP = new LoadComposite().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("epfd", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("epfs", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("epvd", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("epvs", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("eqfd", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("eqfs", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("eqvd", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("eqvs", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("h", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("lfrac", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pfrac", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
