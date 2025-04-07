/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Version details.
 */
public class EquipmentVersion extends BaseClass {

    private static final Logging LOG = Logging.getLogger(EquipmentVersion.class);

    private BaseClass[] EquipmentVersion_class_attributes;
    private BaseClass[] EquipmentVersion_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new EquipmentVersion().getAttributeNamesMap();
    }

    private enum EquipmentVersion_primitive_builder implements PrimitiveBuilder {
        baseUML() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        baseURIcore() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        baseURIoperation() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        baseURIshortCircuit() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        date() {
            public BaseClass construct(java.lang.String value) {
                return new Date(value);
            }
        },
        differenceModelURI() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        entsoeUML() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        entsoeURIcore() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        entsoeURIoperation() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        entsoeURIshortCircuit() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        modelDescriptionURI() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        namespaceRDF() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        namespaceUML() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        shortName() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum EquipmentVersion_class_attributes_enum {
        baseUML,
        baseURIcore,
        baseURIoperation,
        baseURIshortCircuit,
        date,
        differenceModelURI,
        entsoeUML,
        entsoeURIcore,
        entsoeURIoperation,
        entsoeURIshortCircuit,
        modelDescriptionURI,
        namespaceRDF,
        namespaceUML,
        shortName,
        LAST_ENUM
    }

    public EquipmentVersion() {
        EquipmentVersion_primitive_attributes = new BaseClass[EquipmentVersion_primitive_builder.values().length];
        EquipmentVersion_class_attributes = new BaseClass[EquipmentVersion_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new EquipmentVersion();
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

    private void updateAttributeInArray(EquipmentVersion_class_attributes_enum attrEnum, BaseClass value) {
        try {
            EquipmentVersion_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(EquipmentVersion_primitive_builder attrEnum, BaseClass value) {
        try {
            EquipmentVersion_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            EquipmentVersion_class_attributes_enum attrEnum = EquipmentVersion_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated EquipmentVersion, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            EquipmentVersion_primitive_builder attrEnum = EquipmentVersion_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated EquipmentVersion, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            EquipmentVersion_primitive_builder attrEnum = EquipmentVersion_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = EquipmentVersion_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            EquipmentVersion_class_attributes_enum attrEnum = EquipmentVersion_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = EquipmentVersion_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : EquipmentVersion_primitive_builder.values()) {
            if (enumValue != EquipmentVersion_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "EquipmentVersion." + enumValue.name());
            }
        }
        for (var enumValue : EquipmentVersion_class_attributes_enum.values()) {
            if (enumValue != EquipmentVersion_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "EquipmentVersion." + enumValue.name());
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
            for (EquipmentVersion_primitive_builder attrEnum : EquipmentVersion_primitive_builder.values()) {
                BaseClass bc = EquipmentVersion_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    EquipmentVersion." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (EquipmentVersion_class_attributes_enum attrEnum : EquipmentVersion_class_attributes_enum.values()) {
                BaseClass bc = EquipmentVersion_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    EquipmentVersion." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(EquipmentVersion) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "EquipmentVersion";

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
        return "http://entsoe.eu/CIM/SchemaExtension/3/1#";
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
        ATTR_NAMESPACE_MAP = new EquipmentVersion().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("baseUML", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("baseURIcore", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("baseURIoperation", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("baseURIshortCircuit", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("date", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("differenceModelURI", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("entsoeUML", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("entsoeURIcore", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("entsoeURIoperation", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("entsoeURIshortCircuit", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("modelDescriptionURI", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("namespaceRDF", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("namespaceUML", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("shortName", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
