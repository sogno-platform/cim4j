/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Dual input Power System Stabilizer, based on IEEE type 2, with modified output limiter defined by WECC (Western Electricity Coordinating Council, USA).
 */
public class PssWECC extends PowerSystemStabilizerDynamics {

	private static final Logging LOG = Logging.getLogger(PssWECC.class);

	private BaseClass[] PssWECC_class_attributes;
	private BaseClass[] PssWECC_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new PssWECC().getAttributeNamesMap();
	}

	private enum PssWECC_primitive_builder implements PrimitiveBuilder {
		inputSignal1Type() {
			public BaseClass construct(java.lang.String value) {
				return new InputSignalKind(value);
			}
		},
		inputSignal2Type() {
			public BaseClass construct(java.lang.String value) {
				return new InputSignalKind(value);
			}
		},
		k1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		k2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		t1() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t10() {
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
		t7() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t8() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t9() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		vcl() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vcu() {
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
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum PssWECC_class_attributes_enum {
		inputSignal1Type,
		inputSignal2Type,
		k1,
		k2,
		t1,
		t10,
		t2,
		t3,
		t4,
		t5,
		t6,
		t7,
		t8,
		t9,
		vcl,
		vcu,
		vsmax,
		vsmin,
		LAST_ENUM
	}

	public PssWECC() {
		PssWECC_primitive_attributes = new BaseClass[PssWECC_primitive_builder.values().length];
		PssWECC_class_attributes = new BaseClass[PssWECC_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new PssWECC();
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

	private void updateAttributeInArray(PssWECC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PssWECC_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(PssWECC_primitive_builder attrEnum, BaseClass value) {
		try {
			PssWECC_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PssWECC_class_attributes_enum attrEnum = PssWECC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated PssWECC, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PssWECC_primitive_builder attrEnum = PssWECC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated PssWECC, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			PssWECC_primitive_builder attrEnum = PssWECC_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = PssWECC_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			PssWECC_class_attributes_enum attrEnum = PssWECC_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = PssWECC_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : PssWECC_primitive_builder.values()) {
			if (enumValue != PssWECC_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "PssWECC." + enumValue.name());
			}
		}
		for (var enumValue : PssWECC_class_attributes_enum.values()) {
			if (enumValue != PssWECC_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "PssWECC." + enumValue.name());
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
			for (PssWECC_primitive_builder attrEnum : PssWECC_primitive_builder.values()) {
				BaseClass bc = PssWECC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssWECC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PssWECC_class_attributes_enum attrEnum : PssWECC_class_attributes_enum.values()) {
				BaseClass bc = PssWECC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssWECC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(PssWECC) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "PssWECC";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
