/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents IEEE VAR Controller Type 2 which is a summing point type controller. It makes up the outside loop of a two-loop system. This controller is implemented as a slow PI type controller, and the voltage regulator forms the inner loop and is implemented as a fast controller.  Reference: IEEE Standard 421.5-2005 Section 11.5.
 */
public class PFVArType2IEEEVArController extends PFVArControllerType2Dynamics {

    private static final Logging LOG = Logging.getLogger(PFVArType2IEEEVArController.class);

    private BaseClass[] PFVArType2IEEEVArController_class_attributes;
    private BaseClass[] PFVArType2IEEEVArController_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new PFVArType2IEEEVArController().getAttributeNamesMap();
    }

    private enum PFVArType2IEEEVArController_primitive_builder implements PrimitiveBuilder {
        exlon() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        ki() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kp() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        qref() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vclmt() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vref() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vs() {
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

    private enum PFVArType2IEEEVArController_class_attributes_enum {
        exlon,
        ki,
        kp,
        qref,
        vclmt,
        vref,
        vs,
        LAST_ENUM
    }

    public PFVArType2IEEEVArController() {
        PFVArType2IEEEVArController_primitive_attributes = new BaseClass[PFVArType2IEEEVArController_primitive_builder.values().length];
        PFVArType2IEEEVArController_class_attributes = new BaseClass[PFVArType2IEEEVArController_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new PFVArType2IEEEVArController();
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

    private void updateAttributeInArray(PFVArType2IEEEVArController_class_attributes_enum attrEnum, BaseClass value) {
        try {
            PFVArType2IEEEVArController_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(PFVArType2IEEEVArController_primitive_builder attrEnum, BaseClass value) {
        try {
            PFVArType2IEEEVArController_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            PFVArType2IEEEVArController_class_attributes_enum attrEnum = PFVArType2IEEEVArController_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated PFVArType2IEEEVArController, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            PFVArType2IEEEVArController_primitive_builder attrEnum = PFVArType2IEEEVArController_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated PFVArType2IEEEVArController, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            PFVArType2IEEEVArController_primitive_builder attrEnum = PFVArType2IEEEVArController_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PFVArType2IEEEVArController_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            PFVArType2IEEEVArController_class_attributes_enum attrEnum = PFVArType2IEEEVArController_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PFVArType2IEEEVArController_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : PFVArType2IEEEVArController_primitive_builder.values()) {
            if (enumValue != PFVArType2IEEEVArController_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PFVArType2IEEEVArController." + enumValue.name());
            }
        }
        for (var enumValue : PFVArType2IEEEVArController_class_attributes_enum.values()) {
            if (enumValue != PFVArType2IEEEVArController_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PFVArType2IEEEVArController." + enumValue.name());
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
            for (PFVArType2IEEEVArController_primitive_builder attrEnum : PFVArType2IEEEVArController_primitive_builder.values()) {
                BaseClass bc = PFVArType2IEEEVArController_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PFVArType2IEEEVArController." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (PFVArType2IEEEVArController_class_attributes_enum attrEnum : PFVArType2IEEEVArController_class_attributes_enum.values()) {
                BaseClass bc = PFVArType2IEEEVArController_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PFVArType2IEEEVArController." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(PFVArType2IEEEVArController) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "PFVArType2IEEEVArController";

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
        ATTR_NAMESPACE_MAP = new PFVArType2IEEEVArController().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("exlon", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ki", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("qref", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vclmt", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vref", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vs", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
