/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Cross compound turbine governor model.
 */
public class GovSteamCC extends TurbineGovernorDynamics {

	private static final Logging LOG = Logging.getLogger(GovSteamCC.class);

	private BaseClass[] GovSteamCC_class_attributes;
	private BaseClass[] GovSteamCC_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new GovSteamCC().getAttributeNamesMap();
	}

	private enum GovSteamCC_primitive_builder implements PrimitiveBuilder {
		dhp() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		dlp() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		fhp() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		flp() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		mwbase() {
			public BaseClass construct(java.lang.String value) {
				return new ActivePower(value);
			}
		},
		pmaxhp() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		pmaxlp() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		rhp() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		rlp() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		t1hp() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t1lp() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t3hp() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t3lp() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t4hp() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t4lp() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t5hp() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t5lp() {
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

	private enum GovSteamCC_class_attributes_enum {
		dhp,
		dlp,
		fhp,
		flp,
		mwbase,
		pmaxhp,
		pmaxlp,
		rhp,
		rlp,
		t1hp,
		t1lp,
		t3hp,
		t3lp,
		t4hp,
		t4lp,
		t5hp,
		t5lp,
		LAST_ENUM
	}

	public GovSteamCC() {
		GovSteamCC_primitive_attributes = new BaseClass[GovSteamCC_primitive_builder.values().length];
		GovSteamCC_class_attributes = new BaseClass[GovSteamCC_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new GovSteamCC();
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

	private void updateAttributeInArray(GovSteamCC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovSteamCC_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(GovSteamCC_primitive_builder attrEnum, BaseClass value) {
		try {
			GovSteamCC_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovSteamCC_class_attributes_enum attrEnum = GovSteamCC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated GovSteamCC, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovSteamCC_primitive_builder attrEnum = GovSteamCC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated GovSteamCC, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			GovSteamCC_primitive_builder attrEnum = GovSteamCC_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovSteamCC_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			GovSteamCC_class_attributes_enum attrEnum = GovSteamCC_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovSteamCC_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : GovSteamCC_primitive_builder.values()) {
			if (enumValue != GovSteamCC_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovSteamCC." + enumValue.name());
			}
		}
		for (var enumValue : GovSteamCC_class_attributes_enum.values()) {
			if (enumValue != GovSteamCC_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovSteamCC." + enumValue.name());
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
			for (GovSteamCC_primitive_builder attrEnum : GovSteamCC_primitive_builder.values()) {
				BaseClass bc = GovSteamCC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteamCC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovSteamCC_class_attributes_enum attrEnum : GovSteamCC_class_attributes_enum.values()) {
				BaseClass bc = GovSteamCC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteamCC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(GovSteamCC) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "GovSteamCC";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
