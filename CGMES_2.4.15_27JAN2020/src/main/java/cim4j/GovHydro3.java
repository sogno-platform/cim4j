/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Modified IEEE Hydro Governor-Turbine Model.  This model differs from that defined in the IEEE modeling guideline paper in that the limits on gate position and velocity do not permit "wind up" of the upstream signals.
 */
public class GovHydro3 extends TurbineGovernorDynamics {

	private static final Logging LOG = Logging.getLogger(GovHydro3.class);

	private BaseClass[] GovHydro3_class_attributes;
	private BaseClass[] GovHydro3_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new GovHydro3().getAttributeNamesMap();
	}

	private enum GovHydro3_primitive_builder implements PrimitiveBuilder {
		at() {
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
		dturb() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		eps() {
			public BaseClass construct(java.lang.String value) {
				return new Frequency(value);
			}
		},
		governorControl() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
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
		h0() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		k1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		k2() {
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
		qnl() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		relec() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		rgate() {
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
		tw() {
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

	private enum GovHydro3_class_attributes_enum {
		at,
		db1,
		db2,
		dturb,
		eps,
		governorControl,
		gv1,
		gv2,
		gv3,
		gv4,
		gv5,
		gv6,
		h0,
		k1,
		k2,
		kg,
		ki,
		mwbase,
		pgv1,
		pgv2,
		pgv3,
		pgv4,
		pgv5,
		pgv6,
		pmax,
		pmin,
		qnl,
		relec,
		rgate,
		td,
		tf,
		tp,
		tt,
		tw,
		velcl,
		velop,
		LAST_ENUM
	}

	public GovHydro3() {
		GovHydro3_primitive_attributes = new BaseClass[GovHydro3_primitive_builder.values().length];
		GovHydro3_class_attributes = new BaseClass[GovHydro3_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new GovHydro3();
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

	private void updateAttributeInArray(GovHydro3_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovHydro3_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(GovHydro3_primitive_builder attrEnum, BaseClass value) {
		try {
			GovHydro3_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovHydro3_class_attributes_enum attrEnum = GovHydro3_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated GovHydro3, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovHydro3_primitive_builder attrEnum = GovHydro3_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated GovHydro3, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			GovHydro3_primitive_builder attrEnum = GovHydro3_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovHydro3_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			GovHydro3_class_attributes_enum attrEnum = GovHydro3_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovHydro3_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : GovHydro3_primitive_builder.values()) {
			if (enumValue != GovHydro3_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovHydro3." + enumValue.name());
			}
		}
		for (var enumValue : GovHydro3_class_attributes_enum.values()) {
			if (enumValue != GovHydro3_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovHydro3." + enumValue.name());
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
			for (GovHydro3_primitive_builder attrEnum : GovHydro3_primitive_builder.values()) {
				BaseClass bc = GovHydro3_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydro3." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovHydro3_class_attributes_enum attrEnum : GovHydro3_class_attributes_enum.values()) {
				BaseClass bc = GovHydro3_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydro3." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(GovHydro3) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "GovHydro3";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
