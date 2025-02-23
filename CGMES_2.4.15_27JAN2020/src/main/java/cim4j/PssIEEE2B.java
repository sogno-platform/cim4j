/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents IEEE Std 421.5-2005 type PSS2B power system stabilizer model. This stabilizer model is designed to represent a variety of dual-input stabilizers, which normally use combinations of power and speed or frequency to derive the stabilizing signal.  Reference: IEEE 2B 421.5-2005 Section 8.2.
 */
public class PssIEEE2B extends PowerSystemStabilizerDynamics {

	private static final Logging LOG = Logging.getLogger(PssIEEE2B.class);

	private BaseClass[] PssIEEE2B_class_attributes;
	private BaseClass[] PssIEEE2B_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new PssIEEE2B().getAttributeNamesMap();
	}

	private enum PssIEEE2B_primitive_builder implements PrimitiveBuilder {
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
		ks1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ks2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ks3() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		m() {
			public BaseClass construct(java.lang.String value) {
				return new Integer(value);
			}
		},
		n() {
			public BaseClass construct(java.lang.String value) {
				return new Integer(value);
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
		t11() {
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
		tw1() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tw2() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tw3() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tw4() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		vsi1max() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vsi1min() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vsi2max() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vsi2min() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vstmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vstmin() {
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

	private enum PssIEEE2B_class_attributes_enum {
		inputSignal1Type,
		inputSignal2Type,
		ks1,
		ks2,
		ks3,
		m,
		n,
		t1,
		t10,
		t11,
		t2,
		t3,
		t4,
		t6,
		t7,
		t8,
		t9,
		tw1,
		tw2,
		tw3,
		tw4,
		vsi1max,
		vsi1min,
		vsi2max,
		vsi2min,
		vstmax,
		vstmin,
		LAST_ENUM
	}

	public PssIEEE2B() {
		PssIEEE2B_primitive_attributes = new BaseClass[PssIEEE2B_primitive_builder.values().length];
		PssIEEE2B_class_attributes = new BaseClass[PssIEEE2B_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new PssIEEE2B();
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

	private void updateAttributeInArray(PssIEEE2B_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PssIEEE2B_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(PssIEEE2B_primitive_builder attrEnum, BaseClass value) {
		try {
			PssIEEE2B_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PssIEEE2B_class_attributes_enum attrEnum = PssIEEE2B_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated PssIEEE2B, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PssIEEE2B_primitive_builder attrEnum = PssIEEE2B_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated PssIEEE2B, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			PssIEEE2B_primitive_builder attrEnum = PssIEEE2B_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = PssIEEE2B_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			PssIEEE2B_class_attributes_enum attrEnum = PssIEEE2B_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = PssIEEE2B_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : PssIEEE2B_primitive_builder.values()) {
			if (enumValue != PssIEEE2B_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "PssIEEE2B." + enumValue.name());
			}
		}
		for (var enumValue : PssIEEE2B_class_attributes_enum.values()) {
			if (enumValue != PssIEEE2B_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "PssIEEE2B." + enumValue.name());
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
			for (PssIEEE2B_primitive_builder attrEnum : PssIEEE2B_primitive_builder.values()) {
				BaseClass bc = PssIEEE2B_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssIEEE2B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PssIEEE2B_class_attributes_enum attrEnum : PssIEEE2B_class_attributes_enum.values()) {
				BaseClass bc = PssIEEE2B_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssIEEE2B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(PssIEEE2B) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "PssIEEE2B";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
