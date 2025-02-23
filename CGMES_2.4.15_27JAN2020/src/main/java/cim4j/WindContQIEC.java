/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Q control model.  Reference: IEC Standard 61400-27-1 Section 6.6.5.6.
 */
public class WindContQIEC extends IdentifiedObject {

	private static final Logging LOG = Logging.getLogger(WindContQIEC.class);

	private BaseClass[] WindContQIEC_class_attributes;
	private BaseClass[] WindContQIEC_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new WindContQIEC().getAttributeNamesMap();
	}

	private enum WindContQIEC_primitive_builder implements PrimitiveBuilder {
		iqh1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		iqmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		iqmin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		iqpost() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kiq() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kiu() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kpq() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kpu() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kqv() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		qmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		qmin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		rdroop() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		tiq() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tpfilt() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tpost() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tqord() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tufilt() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		udb1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		udb2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		umax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		umin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		uqdip() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		uref0() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		windLVRTQcontrolModesType() {
			public BaseClass construct(java.lang.String value) {
				return new WindLVRTQcontrolModesKind(value);
			}
		},
		windQcontrolModesType() {
			public BaseClass construct(java.lang.String value) {
				return new WindQcontrolModesKind(value);
			}
		},
		xdroop() {
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

	private enum WindContQIEC_class_attributes_enum {
		WindTurbineType3or4IEC,
		iqh1,
		iqmax,
		iqmin,
		iqpost,
		kiq,
		kiu,
		kpq,
		kpu,
		kqv,
		qmax,
		qmin,
		rdroop,
		tiq,
		tpfilt,
		tpost,
		tqord,
		tufilt,
		udb1,
		udb2,
		umax,
		umin,
		uqdip,
		uref0,
		windLVRTQcontrolModesType,
		windQcontrolModesType,
		xdroop,
		LAST_ENUM
	}

	public WindContQIEC() {
		WindContQIEC_primitive_attributes = new BaseClass[WindContQIEC_primitive_builder.values().length];
		WindContQIEC_class_attributes = new BaseClass[WindContQIEC_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new WindContQIEC();
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

	private void updateAttributeInArray(WindContQIEC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindContQIEC_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(WindContQIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindContQIEC_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindContQIEC_class_attributes_enum attrEnum = WindContQIEC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated WindContQIEC, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindContQIEC_primitive_builder attrEnum = WindContQIEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated WindContQIEC, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			WindContQIEC_primitive_builder attrEnum = WindContQIEC_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = WindContQIEC_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			WindContQIEC_class_attributes_enum attrEnum = WindContQIEC_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = WindContQIEC_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : WindContQIEC_primitive_builder.values()) {
			if (enumValue != WindContQIEC_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "WindContQIEC." + enumValue.name());
			}
		}
		for (var enumValue : WindContQIEC_class_attributes_enum.values()) {
			if (enumValue != WindContQIEC_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "WindContQIEC." + enumValue.name());
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
			for (WindContQIEC_primitive_builder attrEnum : WindContQIEC_primitive_builder.values()) {
				BaseClass bc = WindContQIEC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindContQIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindContQIEC_class_attributes_enum attrEnum : WindContQIEC_class_attributes_enum.values()) {
				BaseClass bc = WindContQIEC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindContQIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(WindContQIEC) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "WindContQIEC";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
