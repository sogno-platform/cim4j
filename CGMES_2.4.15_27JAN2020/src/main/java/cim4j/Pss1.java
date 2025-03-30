/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Italian PSS - three input PSS (speed, frequency, power).
 */
public class Pss1 extends PowerSystemStabilizerDynamics {

	private static final Logging LOG = Logging.getLogger(Pss1.class);

	private BaseClass[] Pss1_class_attributes;
	private BaseClass[] Pss1_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new Pss1().getAttributeNamesMap();
	}

	private enum Pss1_primitive_builder implements PrimitiveBuilder {
		kf() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kpe() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		ks() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kw() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		pmin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		t10() {
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
		tpe() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		vadat() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		vsmn() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vsmx() {
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

	private enum Pss1_class_attributes_enum {
		kf,
		kpe,
		ks,
		kw,
		pmin,
		t10,
		t5,
		t6,
		t7,
		t8,
		t9,
		tpe,
		vadat,
		vsmn,
		vsmx,
		LAST_ENUM
	}

	public Pss1() {
		Pss1_primitive_attributes = new BaseClass[Pss1_primitive_builder.values().length];
		Pss1_class_attributes = new BaseClass[Pss1_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new Pss1();
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

	private void updateAttributeInArray(Pss1_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Pss1_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(Pss1_primitive_builder attrEnum, BaseClass value) {
		try {
			Pss1_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Pss1_class_attributes_enum attrEnum = Pss1_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated Pss1, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Pss1_primitive_builder attrEnum = Pss1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated Pss1, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			Pss1_primitive_builder attrEnum = Pss1_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = Pss1_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			Pss1_class_attributes_enum attrEnum = Pss1_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = Pss1_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : Pss1_primitive_builder.values()) {
			if (enumValue != Pss1_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "Pss1." + enumValue.name());
			}
		}
		for (var enumValue : Pss1_class_attributes_enum.values()) {
			if (enumValue != Pss1_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "Pss1." + enumValue.name());
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
			for (Pss1_primitive_builder attrEnum : Pss1_primitive_builder.values()) {
				BaseClass bc = Pss1_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Pss1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Pss1_class_attributes_enum attrEnum : Pss1_class_attributes_enum.values()) {
				BaseClass bc = Pss1_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Pss1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(Pss1) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "Pss1";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
