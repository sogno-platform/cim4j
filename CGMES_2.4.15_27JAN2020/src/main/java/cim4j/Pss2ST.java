/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * PTI Microprocessor-Based Stabilizer type 1.
 */
public class Pss2ST extends PowerSystemStabilizerDynamics {

	private static final Logging LOG = Logging.getLogger(Pss2ST.class);

	private BaseClass[] Pss2ST_class_attributes;
	private BaseClass[] Pss2ST_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new Pss2ST().getAttributeNamesMap();
	}

	private enum Pss2ST_primitive_builder implements PrimitiveBuilder {
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
		lsmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		lsmin() {
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
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum Pss2ST_class_attributes_enum {
		inputSignal1Type,
		inputSignal2Type,
		k1,
		k2,
		lsmax,
		lsmin,
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
		LAST_ENUM
	}

	public Pss2ST() {
		Pss2ST_primitive_attributes = new BaseClass[Pss2ST_primitive_builder.values().length];
		Pss2ST_class_attributes = new BaseClass[Pss2ST_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new Pss2ST();
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

	private void updateAttributeInArray(Pss2ST_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Pss2ST_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(Pss2ST_primitive_builder attrEnum, BaseClass value) {
		try {
			Pss2ST_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Pss2ST_class_attributes_enum attrEnum = Pss2ST_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated Pss2ST, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Pss2ST_primitive_builder attrEnum = Pss2ST_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated Pss2ST, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			Pss2ST_primitive_builder attrEnum = Pss2ST_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = Pss2ST_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			Pss2ST_class_attributes_enum attrEnum = Pss2ST_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = Pss2ST_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : Pss2ST_primitive_builder.values()) {
			if (enumValue != Pss2ST_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "Pss2ST." + enumValue.name());
			}
		}
		for (var enumValue : Pss2ST_class_attributes_enum.values()) {
			if (enumValue != Pss2ST_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "Pss2ST." + enumValue.name());
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
			for (Pss2ST_primitive_builder attrEnum : Pss2ST_primitive_builder.values()) {
				BaseClass bc = Pss2ST_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Pss2ST." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Pss2ST_class_attributes_enum attrEnum : Pss2ST_class_attributes_enum.values()) {
				BaseClass bc = Pss2ST_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Pss2ST." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(Pss2ST) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "Pss2ST";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
