/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Steam turbine governor with reheat time constants and modeling of the effects of fast valve closing to reduce mechanical power.
 */
public class GovSteamFV2 extends TurbineGovernorDynamics {

	private static final Logging LOG = Logging.getLogger(GovSteamFV2.class);

	private BaseClass[] GovSteamFV2_class_attributes;
	private BaseClass[] GovSteamFV2_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new GovSteamFV2().getAttributeNamesMap();
	}

	private enum GovSteamFV2_primitive_builder implements PrimitiveBuilder {
		dt() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		k() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		mwbase() {
			public BaseClass construct(java.lang.String value) {
				return new ActivePower(value);
			}
		},
		r() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		t1() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t3() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
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
		ti() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tt() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		vmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vmin() {
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

	private enum GovSteamFV2_class_attributes_enum {
		dt,
		k,
		mwbase,
		r,
		t1,
		t3,
		ta,
		tb,
		tc,
		ti,
		tt,
		vmax,
		vmin,
		LAST_ENUM
	}

	public GovSteamFV2() {
		GovSteamFV2_primitive_attributes = new BaseClass[GovSteamFV2_primitive_builder.values().length];
		GovSteamFV2_class_attributes = new BaseClass[GovSteamFV2_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new GovSteamFV2();
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

	private void updateAttributeInArray(GovSteamFV2_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovSteamFV2_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(GovSteamFV2_primitive_builder attrEnum, BaseClass value) {
		try {
			GovSteamFV2_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovSteamFV2_class_attributes_enum attrEnum = GovSteamFV2_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated GovSteamFV2, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovSteamFV2_primitive_builder attrEnum = GovSteamFV2_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated GovSteamFV2, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			GovSteamFV2_primitive_builder attrEnum = GovSteamFV2_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovSteamFV2_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			GovSteamFV2_class_attributes_enum attrEnum = GovSteamFV2_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovSteamFV2_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : GovSteamFV2_primitive_builder.values()) {
			if (enumValue != GovSteamFV2_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovSteamFV2." + enumValue.name());
			}
		}
		for (var enumValue : GovSteamFV2_class_attributes_enum.values()) {
			if (enumValue != GovSteamFV2_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovSteamFV2." + enumValue.name());
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
			for (GovSteamFV2_primitive_builder attrEnum : GovSteamFV2_primitive_builder.values()) {
				BaseClass bc = GovSteamFV2_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteamFV2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovSteamFV2_class_attributes_enum attrEnum : GovSteamFV2_class_attributes_enum.values()) {
				BaseClass bc = GovSteamFV2_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteamFV2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(GovSteamFV2) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "GovSteamFV2";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
