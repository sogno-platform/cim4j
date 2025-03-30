/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Modified IEEE AC5A alternator-supplied rectifier excitation system with different minimum controller output.
 */
public class ExcAC5A extends ExcitationSystemDynamics {

	private static final Logging LOG = Logging.getLogger(ExcAC5A.class);

	private BaseClass[] ExcAC5A_class_attributes;
	private BaseClass[] ExcAC5A_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ExcAC5A().getAttributeNamesMap();
	}

	private enum ExcAC5A_primitive_builder implements PrimitiveBuilder {
		a() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
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
		ka() {
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
		ks() {
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
		tf1() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tf2() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tf3() {
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

	private enum ExcAC5A_class_attributes_enum {
		a,
		efd1,
		efd2,
		ka,
		ke,
		kf,
		ks,
		seefd1,
		seefd2,
		ta,
		tb,
		tc,
		te,
		tf1,
		tf2,
		tf3,
		vrmax,
		vrmin,
		LAST_ENUM
	}

	public ExcAC5A() {
		ExcAC5A_primitive_attributes = new BaseClass[ExcAC5A_primitive_builder.values().length];
		ExcAC5A_class_attributes = new BaseClass[ExcAC5A_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ExcAC5A();
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

	private void updateAttributeInArray(ExcAC5A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcAC5A_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ExcAC5A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcAC5A_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcAC5A_class_attributes_enum attrEnum = ExcAC5A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ExcAC5A, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcAC5A_primitive_builder attrEnum = ExcAC5A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ExcAC5A, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ExcAC5A_primitive_builder attrEnum = ExcAC5A_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcAC5A_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ExcAC5A_class_attributes_enum attrEnum = ExcAC5A_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcAC5A_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ExcAC5A_primitive_builder.values()) {
			if (enumValue != ExcAC5A_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcAC5A." + enumValue.name());
			}
		}
		for (var enumValue : ExcAC5A_class_attributes_enum.values()) {
			if (enumValue != ExcAC5A_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcAC5A." + enumValue.name());
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
			for (ExcAC5A_primitive_builder attrEnum : ExcAC5A_primitive_builder.values()) {
				BaseClass bc = ExcAC5A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcAC5A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcAC5A_class_attributes_enum attrEnum : ExcAC5A_class_attributes_enum.values()) {
				BaseClass bc = ExcAC5A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcAC5A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ExcAC5A) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ExcAC5A";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
