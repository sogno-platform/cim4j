/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * IEEE steam turbine governor model.  Ref
 */
public class GovSteamIEEE1 extends TurbineGovernorDynamics {

	private static final Logging LOG = Logging.getLogger(GovSteamIEEE1.class);

	private BaseClass[] GovSteamIEEE1_class_attributes;
	private BaseClass[] GovSteamIEEE1_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new GovSteamIEEE1().getAttributeNamesMap();
	}

	private enum GovSteamIEEE1_primitive_builder implements PrimitiveBuilder {
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
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum GovSteamIEEE1_class_attributes_enum {
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
		pmax,
		pmin,
		t1,
		t2,
		t3,
		t4,
		t5,
		t6,
		t7,
		uc,
		uo,
		LAST_ENUM
	}

	public GovSteamIEEE1() {
		GovSteamIEEE1_primitive_attributes = new BaseClass[GovSteamIEEE1_primitive_builder.values().length];
		GovSteamIEEE1_class_attributes = new BaseClass[GovSteamIEEE1_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new GovSteamIEEE1();
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

	private void updateAttributeInArray(GovSteamIEEE1_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovSteamIEEE1_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(GovSteamIEEE1_primitive_builder attrEnum, BaseClass value) {
		try {
			GovSteamIEEE1_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovSteamIEEE1_class_attributes_enum attrEnum = GovSteamIEEE1_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated GovSteamIEEE1, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovSteamIEEE1_primitive_builder attrEnum = GovSteamIEEE1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated GovSteamIEEE1, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			GovSteamIEEE1_primitive_builder attrEnum = GovSteamIEEE1_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovSteamIEEE1_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			GovSteamIEEE1_class_attributes_enum attrEnum = GovSteamIEEE1_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovSteamIEEE1_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : GovSteamIEEE1_primitive_builder.values()) {
			if (enumValue != GovSteamIEEE1_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovSteamIEEE1." + enumValue.name());
			}
		}
		for (var enumValue : GovSteamIEEE1_class_attributes_enum.values()) {
			if (enumValue != GovSteamIEEE1_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovSteamIEEE1." + enumValue.name());
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
			for (GovSteamIEEE1_primitive_builder attrEnum : GovSteamIEEE1_primitive_builder.values()) {
				BaseClass bc = GovSteamIEEE1_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteamIEEE1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovSteamIEEE1_class_attributes_enum attrEnum : GovSteamIEEE1_class_attributes_enum.values()) {
				BaseClass bc = GovSteamIEEE1_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteamIEEE1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(GovSteamIEEE1) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "GovSteamIEEE1";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
