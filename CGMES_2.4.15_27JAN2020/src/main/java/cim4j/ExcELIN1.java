/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Static PI transformer fed excitation system: ELIN (VATECH) - simplified model.  This model represents an all-static excitation system. A PI voltage controller establishes a desired field current set point for a proportional current controller. The integrator of the PI controller has a follow-up input to match its signal to the present field current.  A power system stabilizer with power input is included in the model.
 */
public class ExcELIN1 extends ExcitationSystemDynamics {

	private static final Logging LOG = Logging.getLogger(ExcELIN1.class);

	private BaseClass[] ExcELIN1_class_attributes;
	private BaseClass[] ExcELIN1_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ExcELIN1().getAttributeNamesMap();
	}

	private enum ExcELIN1_primitive_builder implements PrimitiveBuilder {
		dpnf() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		efmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		efmin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
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
		smax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		tfi() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tnu() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		ts1() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		ts2() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tsw() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		vpi() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vpnf() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vpu() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		xe() {
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

	private enum ExcELIN1_class_attributes_enum {
		dpnf,
		efmax,
		efmin,
		ks1,
		ks2,
		smax,
		tfi,
		tnu,
		ts1,
		ts2,
		tsw,
		vpi,
		vpnf,
		vpu,
		xe,
		LAST_ENUM
	}

	public ExcELIN1() {
		ExcELIN1_primitive_attributes = new BaseClass[ExcELIN1_primitive_builder.values().length];
		ExcELIN1_class_attributes = new BaseClass[ExcELIN1_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ExcELIN1();
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

	private void updateAttributeInArray(ExcELIN1_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcELIN1_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ExcELIN1_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcELIN1_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcELIN1_class_attributes_enum attrEnum = ExcELIN1_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ExcELIN1, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcELIN1_primitive_builder attrEnum = ExcELIN1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ExcELIN1, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ExcELIN1_primitive_builder attrEnum = ExcELIN1_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcELIN1_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ExcELIN1_class_attributes_enum attrEnum = ExcELIN1_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcELIN1_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ExcELIN1_primitive_builder.values()) {
			if (enumValue != ExcELIN1_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcELIN1." + enumValue.name());
			}
		}
		for (var enumValue : ExcELIN1_class_attributes_enum.values()) {
			if (enumValue != ExcELIN1_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcELIN1." + enumValue.name());
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
			for (ExcELIN1_primitive_builder attrEnum : ExcELIN1_primitive_builder.values()) {
				BaseClass bc = ExcELIN1_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcELIN1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcELIN1_class_attributes_enum attrEnum : ExcELIN1_class_attributes_enum.values()) {
				BaseClass bc = ExcELIN1_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcELIN1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ExcELIN1) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ExcELIN1";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
