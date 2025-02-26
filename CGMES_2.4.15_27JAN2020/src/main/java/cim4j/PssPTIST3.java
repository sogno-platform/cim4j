/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * PTI Microprocessor-Based Stabilizer type 3.
 */
public class PssPTIST3 extends PowerSystemStabilizerDynamics {

	private static final Logging LOG = Logging.getLogger(PssPTIST3.class);

	private BaseClass[] PssPTIST3_class_attributes;
	private BaseClass[] PssPTIST3_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new PssPTIST3().getAttributeNamesMap();
	}

	private enum PssPTIST3_primitive_builder implements PrimitiveBuilder {
		a0() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
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
		al() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		athres() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		b0() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		b1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		b2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		b3() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		b4() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		b5() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		dl() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		dtc() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		dtf() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		dtp() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		isw() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		k() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		lthres() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		m() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		nav() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		ncl() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		ncr() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		pmin() {
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
		tf() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tp() {
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

	private enum PssPTIST3_class_attributes_enum {
		a0,
		a1,
		a2,
		a3,
		a4,
		a5,
		al,
		athres,
		b0,
		b1,
		b2,
		b3,
		b4,
		b5,
		dl,
		dtc,
		dtf,
		dtp,
		isw,
		k,
		lthres,
		m,
		nav,
		ncl,
		ncr,
		pmin,
		t1,
		t2,
		t3,
		t4,
		t5,
		t6,
		tf,
		tp,
		LAST_ENUM
	}

	public PssPTIST3() {
		PssPTIST3_primitive_attributes = new BaseClass[PssPTIST3_primitive_builder.values().length];
		PssPTIST3_class_attributes = new BaseClass[PssPTIST3_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new PssPTIST3();
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

	private void updateAttributeInArray(PssPTIST3_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PssPTIST3_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(PssPTIST3_primitive_builder attrEnum, BaseClass value) {
		try {
			PssPTIST3_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PssPTIST3_class_attributes_enum attrEnum = PssPTIST3_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated PssPTIST3, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PssPTIST3_primitive_builder attrEnum = PssPTIST3_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated PssPTIST3, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			PssPTIST3_primitive_builder attrEnum = PssPTIST3_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = PssPTIST3_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			PssPTIST3_class_attributes_enum attrEnum = PssPTIST3_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = PssPTIST3_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : PssPTIST3_primitive_builder.values()) {
			if (enumValue != PssPTIST3_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "PssPTIST3." + enumValue.name());
			}
		}
		for (var enumValue : PssPTIST3_class_attributes_enum.values()) {
			if (enumValue != PssPTIST3_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "PssPTIST3." + enumValue.name());
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
			for (PssPTIST3_primitive_builder attrEnum : PssPTIST3_primitive_builder.values()) {
				BaseClass bc = PssPTIST3_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssPTIST3." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PssPTIST3_class_attributes_enum attrEnum : PssPTIST3_class_attributes_enum.values()) {
				BaseClass bc = PssPTIST3_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssPTIST3." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(PssPTIST3) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "PssPTIST3";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
