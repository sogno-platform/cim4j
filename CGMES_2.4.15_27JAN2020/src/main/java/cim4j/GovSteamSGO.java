/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Simplified Steam turbine governor model.
 */
public class GovSteamSGO extends TurbineGovernorDynamics {

	private static final Logging LOG = Logging.getLogger(GovSteamSGO.class);

	private BaseClass[] GovSteamSGO_class_attributes;
	private BaseClass[] GovSteamSGO_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new GovSteamSGO().getAttributeNamesMap();
	}

	private enum GovSteamSGO_primitive_builder implements PrimitiveBuilder {
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
		k3() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
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
				return new Seconds(value);
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
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum GovSteamSGO_class_attributes_enum {
		k1,
		k2,
		k3,
		mwbase,
		pmax,
		pmin,
		t1,
		t2,
		t3,
		t4,
		t5,
		t6,
		LAST_ENUM
	}

	public GovSteamSGO() {
		GovSteamSGO_primitive_attributes = new BaseClass[GovSteamSGO_primitive_builder.values().length];
		GovSteamSGO_class_attributes = new BaseClass[GovSteamSGO_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new GovSteamSGO();
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

	private void updateAttributeInArray(GovSteamSGO_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovSteamSGO_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(GovSteamSGO_primitive_builder attrEnum, BaseClass value) {
		try {
			GovSteamSGO_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovSteamSGO_class_attributes_enum attrEnum = GovSteamSGO_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated GovSteamSGO, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovSteamSGO_primitive_builder attrEnum = GovSteamSGO_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated GovSteamSGO, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			GovSteamSGO_primitive_builder attrEnum = GovSteamSGO_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovSteamSGO_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			GovSteamSGO_class_attributes_enum attrEnum = GovSteamSGO_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovSteamSGO_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : GovSteamSGO_primitive_builder.values()) {
			if (enumValue != GovSteamSGO_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovSteamSGO." + enumValue.name());
			}
		}
		for (var enumValue : GovSteamSGO_class_attributes_enum.values()) {
			if (enumValue != GovSteamSGO_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovSteamSGO." + enumValue.name());
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
			for (GovSteamSGO_primitive_builder attrEnum : GovSteamSGO_primitive_builder.values()) {
				BaseClass bc = GovSteamSGO_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteamSGO." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovSteamSGO_class_attributes_enum attrEnum : GovSteamSGO_class_attributes_enum.values()) {
				BaseClass bc = GovSteamSGO_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteamSGO." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(GovSteamSGO) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "GovSteamSGO";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
