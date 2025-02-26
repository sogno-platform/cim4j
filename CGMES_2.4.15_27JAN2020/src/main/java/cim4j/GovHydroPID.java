/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * PID governor and turbine.
 */
public class GovHydroPID extends TurbineGovernorDynamics {

	private static final Logging LOG = Logging.getLogger(GovHydroPID.class);

	private BaseClass[] GovHydroPID_class_attributes;
	private BaseClass[] GovHydroPID_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new GovHydroPID().getAttributeNamesMap();
	}

	private enum GovHydroPID_primitive_builder implements PrimitiveBuilder {
		aturb() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		bturb() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		db1() {
			public BaseClass construct(java.lang.String value) {
				return new Frequency(value);
			}
		},
		db2() {
			public BaseClass construct(java.lang.String value) {
				return new ActivePower(value);
			}
		},
		eps() {
			public BaseClass construct(java.lang.String value) {
				return new Frequency(value);
			}
		},
		gv1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		gv2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		gv3() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		gv4() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		gv5() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		gv6() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		inputSignal() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		kd() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kg() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ki() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kp() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		mwbase() {
			public BaseClass construct(java.lang.String value) {
				return new ActivePower(value);
			}
		},
		pgv1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		pgv2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		pgv3() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		pgv4() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		pgv5() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		pgv6() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		pmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		pmin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		r() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		td() {
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
		tt() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tturb() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		velcl() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		velop() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum GovHydroPID_class_attributes_enum {
		aturb,
		bturb,
		db1,
		db2,
		eps,
		gv1,
		gv2,
		gv3,
		gv4,
		gv5,
		gv6,
		inputSignal,
		kd,
		kg,
		ki,
		kp,
		mwbase,
		pgv1,
		pgv2,
		pgv3,
		pgv4,
		pgv5,
		pgv6,
		pmax,
		pmin,
		r,
		td,
		tf,
		tp,
		tt,
		tturb,
		velcl,
		velop,
		LAST_ENUM
	}

	public GovHydroPID() {
		GovHydroPID_primitive_attributes = new BaseClass[GovHydroPID_primitive_builder.values().length];
		GovHydroPID_class_attributes = new BaseClass[GovHydroPID_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new GovHydroPID();
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

	private void updateAttributeInArray(GovHydroPID_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovHydroPID_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(GovHydroPID_primitive_builder attrEnum, BaseClass value) {
		try {
			GovHydroPID_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovHydroPID_class_attributes_enum attrEnum = GovHydroPID_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated GovHydroPID, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovHydroPID_primitive_builder attrEnum = GovHydroPID_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated GovHydroPID, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			GovHydroPID_primitive_builder attrEnum = GovHydroPID_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovHydroPID_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			GovHydroPID_class_attributes_enum attrEnum = GovHydroPID_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovHydroPID_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : GovHydroPID_primitive_builder.values()) {
			if (enumValue != GovHydroPID_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovHydroPID." + enumValue.name());
			}
		}
		for (var enumValue : GovHydroPID_class_attributes_enum.values()) {
			if (enumValue != GovHydroPID_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovHydroPID." + enumValue.name());
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
			for (GovHydroPID_primitive_builder attrEnum : GovHydroPID_primitive_builder.values()) {
				BaseClass bc = GovHydroPID_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydroPID." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovHydroPID_class_attributes_enum attrEnum : GovHydroPID_class_attributes_enum.values()) {
				BaseClass bc = GovHydroPID_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydroPID." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(GovHydroPID) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "GovHydroPID";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
