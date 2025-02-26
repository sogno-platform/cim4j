/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Hungarian Excitation System Model, with built-in voltage transducer.
 */
public class ExcHU extends ExcitationSystemDynamics {

	private static final Logging LOG = Logging.getLogger(ExcHU.class);

	private BaseClass[] ExcHU_class_attributes;
	private BaseClass[] ExcHU_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ExcHU().getAttributeNamesMap();
	}

	private enum ExcHU_primitive_builder implements PrimitiveBuilder {
		ae() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ai() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		atr() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		emax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		emin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		imax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		imin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ke() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		ki() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		te() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		ti() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tr() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum ExcHU_class_attributes_enum {
		ae,
		ai,
		atr,
		emax,
		emin,
		imax,
		imin,
		ke,
		ki,
		te,
		ti,
		tr,
		LAST_ENUM
	}

	public ExcHU() {
		ExcHU_primitive_attributes = new BaseClass[ExcHU_primitive_builder.values().length];
		ExcHU_class_attributes = new BaseClass[ExcHU_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ExcHU();
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

	private void updateAttributeInArray(ExcHU_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcHU_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ExcHU_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcHU_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcHU_class_attributes_enum attrEnum = ExcHU_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ExcHU, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcHU_primitive_builder attrEnum = ExcHU_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ExcHU, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ExcHU_primitive_builder attrEnum = ExcHU_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcHU_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ExcHU_class_attributes_enum attrEnum = ExcHU_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcHU_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ExcHU_primitive_builder.values()) {
			if (enumValue != ExcHU_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcHU." + enumValue.name());
			}
		}
		for (var enumValue : ExcHU_class_attributes_enum.values()) {
			if (enumValue != ExcHU_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcHU." + enumValue.name());
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
			for (ExcHU_primitive_builder attrEnum : ExcHU_primitive_builder.values()) {
				BaseClass bc = ExcHU_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcHU." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcHU_class_attributes_enum attrEnum : ExcHU_class_attributes_enum.values()) {
				BaseClass bc = ExcHU_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcHU." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ExcHU) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ExcHU";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
