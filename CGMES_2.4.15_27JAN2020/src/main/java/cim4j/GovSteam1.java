/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Steam turbine governor model, based on the GovSteamIEEE1 model  (with optional deadband and nonlinear valve gain added).
 */
public class GovSteam1 extends TurbineGovernorDynamics {

	private static final Logging LOG = Logging.getLogger(GovSteam1.class);

	private BaseClass[] GovSteam1_class_attributes;
	private BaseClass[] GovSteam1_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new GovSteam1().getAttributeNamesMap();
	}

	private enum GovSteam1_primitive_builder implements PrimitiveBuilder {
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
		k() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		k1() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		k2() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		k3() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		k4() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		k5() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		k6() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		k7() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		k8() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
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
		sdb1() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		sdb2() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		t1() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t2() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t3() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t4() {
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
		uc() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		uo() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		valve() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum GovSteam1_class_attributes_enum {
		db1,
		db2,
		eps,
		gv1,
		gv2,
		gv3,
		gv4,
		gv5,
		gv6,
		k,
		k1,
		k2,
		k3,
		k4,
		k5,
		k6,
		k7,
		k8,
		mwbase,
		pgv1,
		pgv2,
		pgv3,
		pgv4,
		pgv5,
		pgv6,
		pmax,
		pmin,
		sdb1,
		sdb2,
		t1,
		t2,
		t3,
		t4,
		t5,
		t6,
		t7,
		uc,
		uo,
		valve,
		LAST_ENUM
	}

	public GovSteam1() {
		GovSteam1_primitive_attributes = new BaseClass[GovSteam1_primitive_builder.values().length];
		GovSteam1_class_attributes = new BaseClass[GovSteam1_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new GovSteam1();
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

	private void updateAttributeInArray(GovSteam1_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovSteam1_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(GovSteam1_primitive_builder attrEnum, BaseClass value) {
		try {
			GovSteam1_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovSteam1_class_attributes_enum attrEnum = GovSteam1_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated GovSteam1, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovSteam1_primitive_builder attrEnum = GovSteam1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated GovSteam1, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			GovSteam1_primitive_builder attrEnum = GovSteam1_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovSteam1_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			GovSteam1_class_attributes_enum attrEnum = GovSteam1_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovSteam1_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : GovSteam1_primitive_builder.values()) {
			if (enumValue != GovSteam1_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovSteam1." + enumValue.name());
			}
		}
		for (var enumValue : GovSteam1_class_attributes_enum.values()) {
			if (enumValue != GovSteam1_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovSteam1." + enumValue.name());
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
			for (GovSteam1_primitive_builder attrEnum : GovSteam1_primitive_builder.values()) {
				BaseClass bc = GovSteam1_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteam1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovSteam1_class_attributes_enum attrEnum : GovSteam1_class_attributes_enum.values()) {
				BaseClass bc = GovSteam1_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteam1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(GovSteam1) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "GovSteam1";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
