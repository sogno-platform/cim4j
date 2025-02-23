/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Hydro turbine and governor. Represents plants with straight forward penstock configurations and "three term" electro-hydraulic governors (i.e. Woodard electronic).
 */
public class GovHydroPID2 extends TurbineGovernorDynamics {

	private static final Logging LOG = Logging.getLogger(GovHydroPID2.class);

	private BaseClass[] GovHydroPID2_class_attributes;
	private BaseClass[] GovHydroPID2_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new GovHydroPID2().getAttributeNamesMap();
	}

	private enum GovHydroPID2_primitive_builder implements PrimitiveBuilder {
		atw() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		d() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		feedbackSignal() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		g0() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		g1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		g2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
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
		kd() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ki() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
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
		p1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		p2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		p3() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		rperm() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
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
		treg() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tw() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		velmax() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		velmin() {
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

	private enum GovHydroPID2_class_attributes_enum {
		atw,
		d,
		feedbackSignal,
		g0,
		g1,
		g2,
		gmax,
		gmin,
		kd,
		ki,
		kp,
		mwbase,
		p1,
		p2,
		p3,
		rperm,
		ta,
		tb,
		treg,
		tw,
		velmax,
		velmin,
		LAST_ENUM
	}

	public GovHydroPID2() {
		GovHydroPID2_primitive_attributes = new BaseClass[GovHydroPID2_primitive_builder.values().length];
		GovHydroPID2_class_attributes = new BaseClass[GovHydroPID2_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new GovHydroPID2();
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

	private void updateAttributeInArray(GovHydroPID2_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovHydroPID2_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(GovHydroPID2_primitive_builder attrEnum, BaseClass value) {
		try {
			GovHydroPID2_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovHydroPID2_class_attributes_enum attrEnum = GovHydroPID2_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated GovHydroPID2, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovHydroPID2_primitive_builder attrEnum = GovHydroPID2_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated GovHydroPID2, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			GovHydroPID2_primitive_builder attrEnum = GovHydroPID2_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovHydroPID2_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			GovHydroPID2_class_attributes_enum attrEnum = GovHydroPID2_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovHydroPID2_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : GovHydroPID2_primitive_builder.values()) {
			if (enumValue != GovHydroPID2_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovHydroPID2." + enumValue.name());
			}
		}
		for (var enumValue : GovHydroPID2_class_attributes_enum.values()) {
			if (enumValue != GovHydroPID2_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovHydroPID2." + enumValue.name());
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
			for (GovHydroPID2_primitive_builder attrEnum : GovHydroPID2_primitive_builder.values()) {
				BaseClass bc = GovHydroPID2_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydroPID2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovHydroPID2_class_attributes_enum attrEnum : GovHydroPID2_class_attributes_enum.values()) {
				BaseClass bc = GovHydroPID2_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydroPID2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(GovHydroPID2) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "GovHydroPID2";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
