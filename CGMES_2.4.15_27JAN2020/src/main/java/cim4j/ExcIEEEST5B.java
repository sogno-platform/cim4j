/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents IEEE Std 421.5-2005 type ST5B model. The Type ST5B excitation system is a variation of the Type ST1A model, with alternative overexcitation and underexcitation inputs and additional limits.  Reference: IEEE Standard 421.5-2005 Section 7.5.   Note: the block diagram in the IEEE 421.5 standard has input signal Vc and does not indicate the summation point with Vref. The implementation of the ExcIEEEST5B shall consider summation point with Vref.
 */
public class ExcIEEEST5B extends ExcitationSystemDynamics {

	private static final Logging LOG = Logging.getLogger(ExcIEEEST5B.class);

	private BaseClass[] ExcIEEEST5B_class_attributes;
	private BaseClass[] ExcIEEEST5B_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ExcIEEEST5B().getAttributeNamesMap();
	}

	private enum ExcIEEEST5B_primitive_builder implements PrimitiveBuilder {
		kc() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kr() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		t1() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tb1() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tb2() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tc1() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tc2() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tob1() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tob2() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		toc1() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		toc2() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tub1() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tub2() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tuc1() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tuc2() {
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

	private enum ExcIEEEST5B_class_attributes_enum {
		kc,
		kr,
		t1,
		tb1,
		tb2,
		tc1,
		tc2,
		tob1,
		tob2,
		toc1,
		toc2,
		tub1,
		tub2,
		tuc1,
		tuc2,
		vrmax,
		vrmin,
		LAST_ENUM
	}

	public ExcIEEEST5B() {
		ExcIEEEST5B_primitive_attributes = new BaseClass[ExcIEEEST5B_primitive_builder.values().length];
		ExcIEEEST5B_class_attributes = new BaseClass[ExcIEEEST5B_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ExcIEEEST5B();
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

	private void updateAttributeInArray(ExcIEEEST5B_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcIEEEST5B_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ExcIEEEST5B_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcIEEEST5B_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcIEEEST5B_class_attributes_enum attrEnum = ExcIEEEST5B_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ExcIEEEST5B, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcIEEEST5B_primitive_builder attrEnum = ExcIEEEST5B_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ExcIEEEST5B, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ExcIEEEST5B_primitive_builder attrEnum = ExcIEEEST5B_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcIEEEST5B_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ExcIEEEST5B_class_attributes_enum attrEnum = ExcIEEEST5B_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcIEEEST5B_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ExcIEEEST5B_primitive_builder.values()) {
			if (enumValue != ExcIEEEST5B_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcIEEEST5B." + enumValue.name());
			}
		}
		for (var enumValue : ExcIEEEST5B_class_attributes_enum.values()) {
			if (enumValue != ExcIEEEST5B_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcIEEEST5B." + enumValue.name());
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
			for (ExcIEEEST5B_primitive_builder attrEnum : ExcIEEEST5B_primitive_builder.values()) {
				BaseClass bc = ExcIEEEST5B_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEST5B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcIEEEST5B_class_attributes_enum attrEnum : ExcIEEEST5B_class_attributes_enum.values()) {
				BaseClass bc = ExcIEEEST5B_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEST5B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ExcIEEEST5B) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ExcIEEEST5B";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
