/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Double derivative hydro governor and turbine.
 */
public class GovHydroDD extends TurbineGovernorDynamics {

	private static final Logging LOG = Logging.getLogger(GovHydroDD.class);

	private BaseClass[] GovHydroDD_class_attributes;
	private BaseClass[] GovHydroDD_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new GovHydroDD().getAttributeNamesMap();
	}

	private enum GovHydroDD_primitive_builder implements PrimitiveBuilder {
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
		gmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		gmin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
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

	private enum GovHydroDD_class_attributes_enum {
		aturb,
		bturb,
		db1,
		db2,
		eps,
		gmax,
		gmin,
		gv1,
		gv2,
		gv3,
		gv4,
		gv5,
		gv6,
		inputSignal,
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

	public GovHydroDD() {
		GovHydroDD_primitive_attributes = new BaseClass[GovHydroDD_primitive_builder.values().length];
		GovHydroDD_class_attributes = new BaseClass[GovHydroDD_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new GovHydroDD();
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

	private void updateAttributeInArray(GovHydroDD_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovHydroDD_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(GovHydroDD_primitive_builder attrEnum, BaseClass value) {
		try {
			GovHydroDD_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovHydroDD_class_attributes_enum attrEnum = GovHydroDD_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated GovHydroDD, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovHydroDD_primitive_builder attrEnum = GovHydroDD_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated GovHydroDD, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			GovHydroDD_primitive_builder attrEnum = GovHydroDD_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovHydroDD_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			GovHydroDD_class_attributes_enum attrEnum = GovHydroDD_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovHydroDD_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : GovHydroDD_primitive_builder.values()) {
			if (enumValue != GovHydroDD_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovHydroDD." + enumValue.name());
			}
		}
		for (var enumValue : GovHydroDD_class_attributes_enum.values()) {
			if (enumValue != GovHydroDD_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovHydroDD." + enumValue.name());
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
			for (GovHydroDD_primitive_builder attrEnum : GovHydroDD_primitive_builder.values()) {
				BaseClass bc = GovHydroDD_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydroDD." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovHydroDD_class_attributes_enum attrEnum : GovHydroDD_class_attributes_enum.values()) {
				BaseClass bc = GovHydroDD_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydroDD." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(GovHydroDD) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "GovHydroDD";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
