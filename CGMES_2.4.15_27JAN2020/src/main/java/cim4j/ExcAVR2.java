/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Italian excitation system corresponding to IEEE (1968) Type 2 Model. It represents alternator and rotating diodes and electromechanic voltage regulators.
 */
public class ExcAVR2 extends ExcitationSystemDynamics {

	private static final Logging LOG = Logging.getLogger(ExcAVR2.class);

	private BaseClass[] ExcAVR2_class_attributes;
	private BaseClass[] ExcAVR2_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ExcAVR2().getAttributeNamesMap();
	}

	private enum ExcAVR2_primitive_builder implements PrimitiveBuilder {
		e1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		e2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ka() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kf() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		se1() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		se2() {
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
		vrmn() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vrmx() {
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

	private enum ExcAVR2_class_attributes_enum {
		e1,
		e2,
		ka,
		kf,
		se1,
		se2,
		ta,
		tb,
		te,
		tf1,
		tf2,
		vrmn,
		vrmx,
		LAST_ENUM
	}

	public ExcAVR2() {
		ExcAVR2_primitive_attributes = new BaseClass[ExcAVR2_primitive_builder.values().length];
		ExcAVR2_class_attributes = new BaseClass[ExcAVR2_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ExcAVR2();
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

	private void updateAttributeInArray(ExcAVR2_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcAVR2_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ExcAVR2_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcAVR2_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcAVR2_class_attributes_enum attrEnum = ExcAVR2_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ExcAVR2, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcAVR2_primitive_builder attrEnum = ExcAVR2_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ExcAVR2, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ExcAVR2_primitive_builder attrEnum = ExcAVR2_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcAVR2_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ExcAVR2_class_attributes_enum attrEnum = ExcAVR2_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcAVR2_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ExcAVR2_primitive_builder.values()) {
			if (enumValue != ExcAVR2_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcAVR2." + enumValue.name());
			}
		}
		for (var enumValue : ExcAVR2_class_attributes_enum.values()) {
			if (enumValue != ExcAVR2_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcAVR2." + enumValue.name());
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
			for (ExcAVR2_primitive_builder attrEnum : ExcAVR2_primitive_builder.values()) {
				BaseClass bc = ExcAVR2_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcAVR2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcAVR2_class_attributes_enum attrEnum : ExcAVR2_class_attributes_enum.values()) {
				BaseClass bc = ExcAVR2_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcAVR2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ExcAVR2) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ExcAVR2";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
