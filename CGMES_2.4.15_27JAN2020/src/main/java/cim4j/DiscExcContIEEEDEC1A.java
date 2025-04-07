/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents IEEE Type DEC1A discontinuous excitation control model that boosts generator excitation to a level higher than that demanded by the voltage regulator and stabilizer immediately following a system fault.  Reference: IEEE Standard 421.5-2005 Section 12.2.
 */
public class DiscExcContIEEEDEC1A extends DiscontinuousExcitationControlDynamics {

    private static final Logging LOG = Logging.getLogger(DiscExcContIEEEDEC1A.class);

    private BaseClass[] DiscExcContIEEEDEC1A_class_attributes;
    private BaseClass[] DiscExcContIEEEDEC1A_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new DiscExcContIEEEDEC1A().getAttributeNamesMap();
    }

    private enum DiscExcContIEEEDEC1A_primitive_builder implements PrimitiveBuilder {
        esc() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kan() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ketl() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        tan() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        td() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl2() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tw5() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        val() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vanmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vomax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vomin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vsmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vsmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vtc() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vtlmt() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vtm() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vtn() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum DiscExcContIEEEDEC1A_class_attributes_enum {
        esc,
        kan,
        ketl,
        tan,
        td,
        tl1,
        tl2,
        tw5,
        val,
        vanmax,
        vomax,
        vomin,
        vsmax,
        vsmin,
        vtc,
        vtlmt,
        vtm,
        vtn,
        LAST_ENUM
    }

    public DiscExcContIEEEDEC1A() {
        DiscExcContIEEEDEC1A_primitive_attributes = new BaseClass[DiscExcContIEEEDEC1A_primitive_builder.values().length];
        DiscExcContIEEEDEC1A_class_attributes = new BaseClass[DiscExcContIEEEDEC1A_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new DiscExcContIEEEDEC1A();
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

    private void updateAttributeInArray(DiscExcContIEEEDEC1A_class_attributes_enum attrEnum, BaseClass value) {
        try {
            DiscExcContIEEEDEC1A_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(DiscExcContIEEEDEC1A_primitive_builder attrEnum, BaseClass value) {
        try {
            DiscExcContIEEEDEC1A_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            DiscExcContIEEEDEC1A_class_attributes_enum attrEnum = DiscExcContIEEEDEC1A_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated DiscExcContIEEEDEC1A, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            DiscExcContIEEEDEC1A_primitive_builder attrEnum = DiscExcContIEEEDEC1A_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated DiscExcContIEEEDEC1A, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            DiscExcContIEEEDEC1A_primitive_builder attrEnum = DiscExcContIEEEDEC1A_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = DiscExcContIEEEDEC1A_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            DiscExcContIEEEDEC1A_class_attributes_enum attrEnum = DiscExcContIEEEDEC1A_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = DiscExcContIEEEDEC1A_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : DiscExcContIEEEDEC1A_primitive_builder.values()) {
            if (enumValue != DiscExcContIEEEDEC1A_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "DiscExcContIEEEDEC1A." + enumValue.name());
            }
        }
        for (var enumValue : DiscExcContIEEEDEC1A_class_attributes_enum.values()) {
            if (enumValue != DiscExcContIEEEDEC1A_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "DiscExcContIEEEDEC1A." + enumValue.name());
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
            for (DiscExcContIEEEDEC1A_primitive_builder attrEnum : DiscExcContIEEEDEC1A_primitive_builder.values()) {
                BaseClass bc = DiscExcContIEEEDEC1A_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    DiscExcContIEEEDEC1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (DiscExcContIEEEDEC1A_class_attributes_enum attrEnum : DiscExcContIEEEDEC1A_class_attributes_enum.values()) {
                BaseClass bc = DiscExcContIEEEDEC1A_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    DiscExcContIEEEDEC1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(DiscExcContIEEEDEC1A) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "DiscExcContIEEEDEC1A";

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
        ATTR_NAMESPACE_MAP = new DiscExcContIEEEDEC1A().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("esc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kan", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ketl", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tan", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("td", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tl1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tl2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tw5", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("val", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vanmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vomax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vomin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vsmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vsmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vtc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vtlmt", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vtm", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vtn", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
