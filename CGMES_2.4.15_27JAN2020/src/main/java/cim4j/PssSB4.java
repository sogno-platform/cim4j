/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Power sensitive stabilizer model.
 */
public class PssSB4 extends PowerSystemStabilizerDynamics {

	private static final Logging LOG = Logging.getLogger(PssSB4.class);

	private BaseClass[] PssSB4_class_attributes;
	private BaseClass[] PssSB4_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new PssSB4().getAttributeNamesMap();
	}

	private enum PssSB4_primitive_builder implements PrimitiveBuilder {
		kx() {
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
		td() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		te() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tt() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tx1() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tx2() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
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

	private enum PssSB4_class_attributes_enum {
		kx,
		ta,
		tb,
		tc,
		td,
		te,
		tt,
		tx1,
		tx2,
		vsmax,
		vsmin,
		LAST_ENUM
	}

	public PssSB4() {
		PssSB4_primitive_attributes = new BaseClass[PssSB4_primitive_builder.values().length];
		PssSB4_class_attributes = new BaseClass[PssSB4_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new PssSB4();
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

	private void updateAttributeInArray(PssSB4_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PssSB4_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(PssSB4_primitive_builder attrEnum, BaseClass value) {
		try {
			PssSB4_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PssSB4_class_attributes_enum attrEnum = PssSB4_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated PssSB4, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PssSB4_primitive_builder attrEnum = PssSB4_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated PssSB4, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			PssSB4_primitive_builder attrEnum = PssSB4_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = PssSB4_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			PssSB4_class_attributes_enum attrEnum = PssSB4_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = PssSB4_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : PssSB4_primitive_builder.values()) {
			if (enumValue != PssSB4_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "PssSB4." + enumValue.name());
			}
		}
		for (var enumValue : PssSB4_class_attributes_enum.values()) {
			if (enumValue != PssSB4_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "PssSB4." + enumValue.name());
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
			for (PssSB4_primitive_builder attrEnum : PssSB4_primitive_builder.values()) {
				BaseClass bc = PssSB4_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssSB4." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PssSB4_class_attributes_enum attrEnum : PssSB4_class_attributes_enum.values()) {
				BaseClass bc = PssSB4_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssSB4." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(PssSB4) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "PssSB4";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
