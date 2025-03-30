/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Modified IEEE ST7B static excitation system without stator current limiter (SCL) and current compensator (DROOP) inputs.
 */
public class ExcST7B extends ExcitationSystemDynamics {

	private static final Logging LOG = Logging.getLogger(ExcST7B.class);

	private BaseClass[] ExcST7B_class_attributes;
	private BaseClass[] ExcST7B_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ExcST7B().getAttributeNamesMap();
	}

	private enum ExcST7B_primitive_builder implements PrimitiveBuilder {
		kh() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kia() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kl() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kpa() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		oelin() {
			public BaseClass construct(java.lang.String value) {
				return new ExcST7BOELselectorKind(value);
			}
		},
		tb() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tc() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tf() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tg() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tia() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		ts() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		uelin() {
			public BaseClass construct(java.lang.String value) {
				return new ExcST7BUELselectorKind(value);
			}
		},
		vmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vmin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
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

	private enum ExcST7B_class_attributes_enum {
		kh,
		kia,
		kl,
		kpa,
		oelin,
		tb,
		tc,
		tf,
		tg,
		tia,
		ts,
		uelin,
		vmax,
		vmin,
		vrmax,
		vrmin,
		LAST_ENUM
	}

	public ExcST7B() {
		ExcST7B_primitive_attributes = new BaseClass[ExcST7B_primitive_builder.values().length];
		ExcST7B_class_attributes = new BaseClass[ExcST7B_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ExcST7B();
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

	private void updateAttributeInArray(ExcST7B_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcST7B_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ExcST7B_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcST7B_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcST7B_class_attributes_enum attrEnum = ExcST7B_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ExcST7B, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcST7B_primitive_builder attrEnum = ExcST7B_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ExcST7B, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ExcST7B_primitive_builder attrEnum = ExcST7B_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcST7B_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ExcST7B_class_attributes_enum attrEnum = ExcST7B_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcST7B_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ExcST7B_primitive_builder.values()) {
			if (enumValue != ExcST7B_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcST7B." + enumValue.name());
			}
		}
		for (var enumValue : ExcST7B_class_attributes_enum.values()) {
			if (enumValue != ExcST7B_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcST7B." + enumValue.name());
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
			for (ExcST7B_primitive_builder attrEnum : ExcST7B_primitive_builder.values()) {
				BaseClass bc = ExcST7B_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcST7B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcST7B_class_attributes_enum attrEnum : ExcST7B_class_attributes_enum.values()) {
				BaseClass bc = ExcST7B_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcST7B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ExcST7B) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ExcST7B";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
