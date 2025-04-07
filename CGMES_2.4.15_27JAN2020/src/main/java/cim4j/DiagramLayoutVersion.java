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
public class DiagramLayoutVersion extends BaseClass {

    private static final Logging LOG = Logging.getLogger(DiagramLayoutVersion.class);

    private BaseClass[] DiagramLayoutVersion_class_attributes;
    private BaseClass[] DiagramLayoutVersion_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new DiagramLayoutVersion().getAttributeNamesMap();
    }

    private enum DiagramLayoutVersion_primitive_builder implements PrimitiveBuilder {
        baseUML() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        baseURI() {
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
        entsoeURI() {
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

    private enum DiagramLayoutVersion_class_attributes_enum {
        baseUML,
        baseURI,
        date,
        differenceModelURI,
        entsoeUML,
        entsoeURI,
        modelDescriptionURI,
        namespaceRDF,
        namespaceUML,
        shortName,
        LAST_ENUM
    }

    public DiagramLayoutVersion() {
        DiagramLayoutVersion_primitive_attributes = new BaseClass[DiagramLayoutVersion_primitive_builder.values().length];
        DiagramLayoutVersion_class_attributes = new BaseClass[DiagramLayoutVersion_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new DiagramLayoutVersion();
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

    private void updateAttributeInArray(DiagramLayoutVersion_class_attributes_enum attrEnum, BaseClass value) {
        try {
            DiagramLayoutVersion_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(DiagramLayoutVersion_primitive_builder attrEnum, BaseClass value) {
        try {
            DiagramLayoutVersion_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            DiagramLayoutVersion_class_attributes_enum attrEnum = DiagramLayoutVersion_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated DiagramLayoutVersion, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            DiagramLayoutVersion_primitive_builder attrEnum = DiagramLayoutVersion_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated DiagramLayoutVersion, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            DiagramLayoutVersion_primitive_builder attrEnum = DiagramLayoutVersion_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = DiagramLayoutVersion_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            DiagramLayoutVersion_class_attributes_enum attrEnum = DiagramLayoutVersion_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = DiagramLayoutVersion_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : DiagramLayoutVersion_primitive_builder.values()) {
            if (enumValue != DiagramLayoutVersion_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "DiagramLayoutVersion." + enumValue.name());
            }
        }
        for (var enumValue : DiagramLayoutVersion_class_attributes_enum.values()) {
            if (enumValue != DiagramLayoutVersion_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "DiagramLayoutVersion." + enumValue.name());
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
            for (DiagramLayoutVersion_primitive_builder attrEnum : DiagramLayoutVersion_primitive_builder.values()) {
                BaseClass bc = DiagramLayoutVersion_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    DiagramLayoutVersion." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (DiagramLayoutVersion_class_attributes_enum attrEnum : DiagramLayoutVersion_class_attributes_enum.values()) {
                BaseClass bc = DiagramLayoutVersion_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    DiagramLayoutVersion." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(DiagramLayoutVersion) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "DiagramLayoutVersion";

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
        ATTR_NAMESPACE_MAP = new DiagramLayoutVersion().allAttrNamespaceMap();
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
            Map.entry("baseURI", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("date", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("differenceModelURI", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("entsoeUML", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("entsoeURI", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("modelDescriptionURI", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("namespaceRDF", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("namespaceUML", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("shortName", "http://entsoe.eu/CIM/SchemaExtension/3/1#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
