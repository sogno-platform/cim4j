/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents IEEE Std 421.5-2005 type DC3A model. This model represents represent older systems, in particular those dc commutator exciters with non-continuously acting regulators that were commonly used before the development of the continuously acting varieties.  These systems respond at basically two different rates, depending upon the magnitude of voltage error. For small errors, adjustment is made periodically with a signal to a motor-operated rheostat. Larger errors cause resistors to be quickly shorted or inserted and a strong forcing signal applied to the exciter. Continuous motion of the motor-operated rheostat occurs for these larger error signals, even though it is bypassed by contactor action.   Reference: IEEE Standard 421.5-2005 Section 5.3.
 */
public class ExcIEEEDC3A extends ExcitationSystemDynamics {

	private static final Logging LOG = Logging.getLogger(ExcIEEEDC3A.class);

	private BaseClass[] ExcIEEEDC3A_class_attributes;
	private BaseClass[] ExcIEEEDC3A_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ExcIEEEDC3A().getAttributeNamesMap();
	}

	private enum ExcIEEEDC3A_primitive_builder implements PrimitiveBuilder {
		efd1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		efd2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		exclim() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		ke() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kv() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		seefd1() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		seefd2() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		te() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		trh() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		vrmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vrmin() {
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

	private enum ExcIEEEDC3A_class_attributes_enum {
		efd1,
		efd2,
		exclim,
		ke,
		kv,
		seefd1,
		seefd2,
		te,
		trh,
		vrmax,
		vrmin,
		LAST_ENUM
	}

	public ExcIEEEDC3A() {
		ExcIEEEDC3A_primitive_attributes = new BaseClass[ExcIEEEDC3A_primitive_builder.values().length];
		ExcIEEEDC3A_class_attributes = new BaseClass[ExcIEEEDC3A_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ExcIEEEDC3A();
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

	private void updateAttributeInArray(ExcIEEEDC3A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcIEEEDC3A_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ExcIEEEDC3A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcIEEEDC3A_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcIEEEDC3A_class_attributes_enum attrEnum = ExcIEEEDC3A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ExcIEEEDC3A, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcIEEEDC3A_primitive_builder attrEnum = ExcIEEEDC3A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ExcIEEEDC3A, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ExcIEEEDC3A_primitive_builder attrEnum = ExcIEEEDC3A_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcIEEEDC3A_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ExcIEEEDC3A_class_attributes_enum attrEnum = ExcIEEEDC3A_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcIEEEDC3A_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ExcIEEEDC3A_primitive_builder.values()) {
			if (enumValue != ExcIEEEDC3A_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcIEEEDC3A." + enumValue.name());
			}
		}
		for (var enumValue : ExcIEEEDC3A_class_attributes_enum.values()) {
			if (enumValue != ExcIEEEDC3A_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcIEEEDC3A." + enumValue.name());
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
			for (ExcIEEEDC3A_primitive_builder attrEnum : ExcIEEEDC3A_primitive_builder.values()) {
				BaseClass bc = ExcIEEEDC3A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEDC3A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcIEEEDC3A_class_attributes_enum attrEnum : ExcIEEEDC3A_class_attributes_enum.values()) {
				BaseClass bc = ExcIEEEDC3A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEDC3A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ExcIEEEDC3A) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ExcIEEEDC3A";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
