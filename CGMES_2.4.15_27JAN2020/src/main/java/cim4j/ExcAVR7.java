/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * IVO excitation system.
 */
public class ExcAVR7 extends ExcitationSystemDynamics {

	private static final Logging LOG = Logging.getLogger(ExcAVR7.class);

	private BaseClass[] ExcAVR7_class_attributes;
	private BaseClass[] ExcAVR7_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ExcAVR7().getAttributeNamesMap();
	}

	private enum ExcAVR7_primitive_builder implements PrimitiveBuilder {
		a1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		a2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		a3() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		a4() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		a5() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		a6() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		k1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		k3() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		k5() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		t1() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t2() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t3() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t4() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t5() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t6() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		vmax1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vmax3() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vmax5() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vmin1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vmin3() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vmin5() {
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

	private enum ExcAVR7_class_attributes_enum {
		a1,
		a2,
		a3,
		a4,
		a5,
		a6,
		k1,
		k3,
		k5,
		t1,
		t2,
		t3,
		t4,
		t5,
		t6,
		vmax1,
		vmax3,
		vmax5,
		vmin1,
		vmin3,
		vmin5,
		LAST_ENUM
	}

	public ExcAVR7() {
		ExcAVR7_primitive_attributes = new BaseClass[ExcAVR7_primitive_builder.values().length];
		ExcAVR7_class_attributes = new BaseClass[ExcAVR7_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ExcAVR7();
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

	private void updateAttributeInArray(ExcAVR7_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcAVR7_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ExcAVR7_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcAVR7_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcAVR7_class_attributes_enum attrEnum = ExcAVR7_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ExcAVR7, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcAVR7_primitive_builder attrEnum = ExcAVR7_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ExcAVR7, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ExcAVR7_primitive_builder attrEnum = ExcAVR7_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcAVR7_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ExcAVR7_class_attributes_enum attrEnum = ExcAVR7_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcAVR7_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ExcAVR7_primitive_builder.values()) {
			if (enumValue != ExcAVR7_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcAVR7." + enumValue.name());
			}
		}
		for (var enumValue : ExcAVR7_class_attributes_enum.values()) {
			if (enumValue != ExcAVR7_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcAVR7." + enumValue.name());
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
			for (ExcAVR7_primitive_builder attrEnum : ExcAVR7_primitive_builder.values()) {
				BaseClass bc = ExcAVR7_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcAVR7." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcAVR7_class_attributes_enum attrEnum : ExcAVR7_class_attributes_enum.values()) {
				BaseClass bc = ExcAVR7_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcAVR7." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ExcAVR7) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ExcAVR7";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
