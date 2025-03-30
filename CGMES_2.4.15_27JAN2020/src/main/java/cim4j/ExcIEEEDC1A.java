/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents IEEE Std 421.5-2005 type DC1A model. This model represents field-controlled dc commutator exciters with continuously acting voltage regulators (especially the direct-acting rheostatic, rotating amplifier, and magnetic amplifier types).  Because this model has been widely implemented by the industry, it is sometimes used to represent other types of systems when detailed data for them are not available or when a simplified model is required.   Reference: IEEE Standard 421.5-2005 Section 5.1.
 */
public class ExcIEEEDC1A extends ExcitationSystemDynamics {

	private static final Logging LOG = Logging.getLogger(ExcIEEEDC1A.class);

	private BaseClass[] ExcIEEEDC1A_class_attributes;
	private BaseClass[] ExcIEEEDC1A_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ExcIEEEDC1A().getAttributeNamesMap();
	}

	private enum ExcIEEEDC1A_primitive_builder implements PrimitiveBuilder {
		efd1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		efd2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		exclim() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		ka() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ke() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kf() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		seefd1() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		seefd2() {
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
		tc() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		te() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tf() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		uelin() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
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

	private enum ExcIEEEDC1A_class_attributes_enum {
		efd1,
		efd2,
		exclim,
		ka,
		ke,
		kf,
		seefd1,
		seefd2,
		ta,
		tb,
		tc,
		te,
		tf,
		uelin,
		vrmax,
		vrmin,
		LAST_ENUM
	}

	public ExcIEEEDC1A() {
		ExcIEEEDC1A_primitive_attributes = new BaseClass[ExcIEEEDC1A_primitive_builder.values().length];
		ExcIEEEDC1A_class_attributes = new BaseClass[ExcIEEEDC1A_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ExcIEEEDC1A();
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

	private void updateAttributeInArray(ExcIEEEDC1A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcIEEEDC1A_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ExcIEEEDC1A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcIEEEDC1A_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcIEEEDC1A_class_attributes_enum attrEnum = ExcIEEEDC1A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ExcIEEEDC1A, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcIEEEDC1A_primitive_builder attrEnum = ExcIEEEDC1A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ExcIEEEDC1A, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ExcIEEEDC1A_primitive_builder attrEnum = ExcIEEEDC1A_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcIEEEDC1A_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ExcIEEEDC1A_class_attributes_enum attrEnum = ExcIEEEDC1A_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcIEEEDC1A_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ExcIEEEDC1A_primitive_builder.values()) {
			if (enumValue != ExcIEEEDC1A_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcIEEEDC1A." + enumValue.name());
			}
		}
		for (var enumValue : ExcIEEEDC1A_class_attributes_enum.values()) {
			if (enumValue != ExcIEEEDC1A_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcIEEEDC1A." + enumValue.name());
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
			for (ExcIEEEDC1A_primitive_builder attrEnum : ExcIEEEDC1A_primitive_builder.values()) {
				BaseClass bc = ExcIEEEDC1A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEDC1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcIEEEDC1A_class_attributes_enum attrEnum : ExcIEEEDC1A_class_attributes_enum.values()) {
				BaseClass bc = ExcIEEEDC1A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEDC1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ExcIEEEDC1A) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ExcIEEEDC1A";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
