/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Modified IEEE ST2A static excitation system - another lead-lag block added to match  the model defined by WECC.
 */
public class ExcST2A extends ExcitationSystemDynamics {

	private static final Logging LOG = Logging.getLogger(ExcST2A.class);

	private BaseClass[] ExcST2A_class_attributes;
	private BaseClass[] ExcST2A_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ExcST2A().getAttributeNamesMap();
	}

	private enum ExcST2A_primitive_builder implements PrimitiveBuilder {
		efdmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ka() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kc() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ke() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kf() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
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
		ta() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
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
		te() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tf() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		uelin() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
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

	private enum ExcST2A_class_attributes_enum {
		efdmax,
		ka,
		kc,
		ke,
		kf,
		ki,
		kp,
		ta,
		tb,
		tc,
		te,
		tf,
		uelin,
		vrmax,
		vrmin,
		LAST_ENUM
	}

	public ExcST2A() {
		ExcST2A_primitive_attributes = new BaseClass[ExcST2A_primitive_builder.values().length];
		ExcST2A_class_attributes = new BaseClass[ExcST2A_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ExcST2A();
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

	private void updateAttributeInArray(ExcST2A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcST2A_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ExcST2A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcST2A_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcST2A_class_attributes_enum attrEnum = ExcST2A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ExcST2A, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcST2A_primitive_builder attrEnum = ExcST2A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ExcST2A, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ExcST2A_primitive_builder attrEnum = ExcST2A_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcST2A_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ExcST2A_class_attributes_enum attrEnum = ExcST2A_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcST2A_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ExcST2A_primitive_builder.values()) {
			if (enumValue != ExcST2A_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcST2A." + enumValue.name());
			}
		}
		for (var enumValue : ExcST2A_class_attributes_enum.values()) {
			if (enumValue != ExcST2A_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcST2A." + enumValue.name());
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
			for (ExcST2A_primitive_builder attrEnum : ExcST2A_primitive_builder.values()) {
				BaseClass bc = ExcST2A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcST2A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcST2A_class_attributes_enum attrEnum : ExcST2A_class_attributes_enum.values()) {
				BaseClass bc = ExcST2A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcST2A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ExcST2A) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ExcST2A";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
