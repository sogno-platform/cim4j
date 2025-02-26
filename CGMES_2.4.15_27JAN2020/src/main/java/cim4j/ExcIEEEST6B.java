/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents IEEE Std 421.5-2005 type ST6B model. This model consists of a PI voltage regulator with an inner loop field voltage regulator and pre-control. The field voltage regulator implements a proportional control. The pre-control and the delay in the feedback circuit increase the dynamic response.  Reference: IEEE Standard 421.5-2005 Section 7.6.
 */
public class ExcIEEEST6B extends ExcitationSystemDynamics {

	private static final Logging LOG = Logging.getLogger(ExcIEEEST6B.class);

	private BaseClass[] ExcIEEEST6B_class_attributes;
	private BaseClass[] ExcIEEEST6B_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ExcIEEEST6B().getAttributeNamesMap();
	}

	private enum ExcIEEEST6B_primitive_builder implements PrimitiveBuilder {
		ilr() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kci() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kff() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kg() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kia() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		klr() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		km() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kpa() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		oelin() {
			public BaseClass construct(java.lang.String value) {
				return new ExcST6BOELselectorKind(value);
			}
		},
		tg() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		vamax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vamin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
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

	private enum ExcIEEEST6B_class_attributes_enum {
		ilr,
		kci,
		kff,
		kg,
		kia,
		klr,
		km,
		kpa,
		oelin,
		tg,
		vamax,
		vamin,
		vrmax,
		vrmin,
		LAST_ENUM
	}

	public ExcIEEEST6B() {
		ExcIEEEST6B_primitive_attributes = new BaseClass[ExcIEEEST6B_primitive_builder.values().length];
		ExcIEEEST6B_class_attributes = new BaseClass[ExcIEEEST6B_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ExcIEEEST6B();
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

	private void updateAttributeInArray(ExcIEEEST6B_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcIEEEST6B_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ExcIEEEST6B_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcIEEEST6B_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcIEEEST6B_class_attributes_enum attrEnum = ExcIEEEST6B_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ExcIEEEST6B, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcIEEEST6B_primitive_builder attrEnum = ExcIEEEST6B_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ExcIEEEST6B, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ExcIEEEST6B_primitive_builder attrEnum = ExcIEEEST6B_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcIEEEST6B_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ExcIEEEST6B_class_attributes_enum attrEnum = ExcIEEEST6B_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcIEEEST6B_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ExcIEEEST6B_primitive_builder.values()) {
			if (enumValue != ExcIEEEST6B_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcIEEEST6B." + enumValue.name());
			}
		}
		for (var enumValue : ExcIEEEST6B_class_attributes_enum.values()) {
			if (enumValue != ExcIEEEST6B_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcIEEEST6B." + enumValue.name());
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
			for (ExcIEEEST6B_primitive_builder attrEnum : ExcIEEEST6B_primitive_builder.values()) {
				BaseClass bc = ExcIEEEST6B_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEST6B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcIEEEST6B_class_attributes_enum attrEnum : ExcIEEEST6B_class_attributes_enum.values()) {
				BaseClass bc = ExcIEEEST6B_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEST6B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ExcIEEEST6B) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ExcIEEEST6B";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
