/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Simplified model  of boiler and steam turbine with PID governor.
 */
public class GovSteamEU extends TurbineGovernorDynamics {

	private static final Logging LOG = Logging.getLogger(GovSteamEU.class);

	private BaseClass[] GovSteamEU_class_attributes;
	private BaseClass[] GovSteamEU_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new GovSteamEU().getAttributeNamesMap();
	}

	private enum GovSteamEU_primitive_builder implements PrimitiveBuilder {
		chc() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		cho() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		cic() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		cio() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		db1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		db2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		hhpmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ke() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kfcor() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		khp() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		klp() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kwcor() {
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
		prhmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		simx() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		tb() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tdp() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		ten() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tf() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tfp() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		thp() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tip() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tlp() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tp() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		trh() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tvhp() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tvip() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tw() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		wfmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		wfmin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		wmax1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		wmax2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		wwmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		wwmin() {
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

	private enum GovSteamEU_class_attributes_enum {
		chc,
		cho,
		cic,
		cio,
		db1,
		db2,
		hhpmax,
		ke,
		kfcor,
		khp,
		klp,
		kwcor,
		mwbase,
		pmax,
		prhmax,
		simx,
		tb,
		tdp,
		ten,
		tf,
		tfp,
		thp,
		tip,
		tlp,
		tp,
		trh,
		tvhp,
		tvip,
		tw,
		wfmax,
		wfmin,
		wmax1,
		wmax2,
		wwmax,
		wwmin,
		LAST_ENUM
	}

	public GovSteamEU() {
		GovSteamEU_primitive_attributes = new BaseClass[GovSteamEU_primitive_builder.values().length];
		GovSteamEU_class_attributes = new BaseClass[GovSteamEU_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new GovSteamEU();
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

	private void updateAttributeInArray(GovSteamEU_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovSteamEU_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(GovSteamEU_primitive_builder attrEnum, BaseClass value) {
		try {
			GovSteamEU_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovSteamEU_class_attributes_enum attrEnum = GovSteamEU_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated GovSteamEU, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovSteamEU_primitive_builder attrEnum = GovSteamEU_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated GovSteamEU, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			GovSteamEU_primitive_builder attrEnum = GovSteamEU_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovSteamEU_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			GovSteamEU_class_attributes_enum attrEnum = GovSteamEU_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovSteamEU_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : GovSteamEU_primitive_builder.values()) {
			if (enumValue != GovSteamEU_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovSteamEU." + enumValue.name());
			}
		}
		for (var enumValue : GovSteamEU_class_attributes_enum.values()) {
			if (enumValue != GovSteamEU_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovSteamEU." + enumValue.name());
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
			for (GovSteamEU_primitive_builder attrEnum : GovSteamEU_primitive_builder.values()) {
				BaseClass bc = GovSteamEU_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteamEU." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovSteamEU_class_attributes_enum attrEnum : GovSteamEU_class_attributes_enum.values()) {
				BaseClass bc = GovSteamEU_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteamEU." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(GovSteamEU) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "GovSteamEU";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
