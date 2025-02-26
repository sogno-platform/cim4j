/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents IEEE Std 421.5-2005 type AC3A model. The model represents the field-controlled alternator-rectifier excitation systems designated Type AC3A. These excitation systems include an alternator main exciter with non-controlled rectifiers. The exciter employs self-excitation, and the voltage regulator power is derived from the exciter output voltage.  Therefore, this system has an additional nonlinearity, simulated by the use of a multiplier whose inputs are the voltage regulator command signal, , and the exciter output voltage, , times .  This model is applicable to excitation systems employing static voltage regulators.   Reference: IEEE Standard 421.5-2005 Section 6.3.
 */
public class ExcIEEEAC3A extends ExcitationSystemDynamics {

	private static final Logging LOG = Logging.getLogger(ExcIEEEAC3A.class);

	private BaseClass[] ExcIEEEAC3A_class_attributes;
	private BaseClass[] ExcIEEEAC3A_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ExcIEEEAC3A().getAttributeNamesMap();
	}

	private enum ExcIEEEAC3A_primitive_builder implements PrimitiveBuilder {
		efdn() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ka() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kc() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kd() {
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
		kn() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kr() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		seve1() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		seve2() {
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
		ve1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ve2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vemin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vfemax() {
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

	private enum ExcIEEEAC3A_class_attributes_enum {
		efdn,
		ka,
		kc,
		kd,
		ke,
		kf,
		kn,
		kr,
		seve1,
		seve2,
		ta,
		tb,
		tc,
		te,
		tf,
		vamax,
		vamin,
		ve1,
		ve2,
		vemin,
		vfemax,
		LAST_ENUM
	}

	public ExcIEEEAC3A() {
		ExcIEEEAC3A_primitive_attributes = new BaseClass[ExcIEEEAC3A_primitive_builder.values().length];
		ExcIEEEAC3A_class_attributes = new BaseClass[ExcIEEEAC3A_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ExcIEEEAC3A();
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

	private void updateAttributeInArray(ExcIEEEAC3A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcIEEEAC3A_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ExcIEEEAC3A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcIEEEAC3A_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcIEEEAC3A_class_attributes_enum attrEnum = ExcIEEEAC3A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ExcIEEEAC3A, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcIEEEAC3A_primitive_builder attrEnum = ExcIEEEAC3A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ExcIEEEAC3A, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ExcIEEEAC3A_primitive_builder attrEnum = ExcIEEEAC3A_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcIEEEAC3A_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ExcIEEEAC3A_class_attributes_enum attrEnum = ExcIEEEAC3A_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcIEEEAC3A_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ExcIEEEAC3A_primitive_builder.values()) {
			if (enumValue != ExcIEEEAC3A_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcIEEEAC3A." + enumValue.name());
			}
		}
		for (var enumValue : ExcIEEEAC3A_class_attributes_enum.values()) {
			if (enumValue != ExcIEEEAC3A_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcIEEEAC3A." + enumValue.name());
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
			for (ExcIEEEAC3A_primitive_builder attrEnum : ExcIEEEAC3A_primitive_builder.values()) {
				BaseClass bc = ExcIEEEAC3A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEAC3A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcIEEEAC3A_class_attributes_enum attrEnum : ExcIEEEAC3A_class_attributes_enum.values()) {
				BaseClass bc = ExcIEEEAC3A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEAC3A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ExcIEEEAC3A) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ExcIEEEAC3A";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
