/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Simplified governor model.
 */
public class GovSteam2 extends TurbineGovernorDynamics {

	private static final Logging LOG = Logging.getLogger(GovSteam2.class);

	private BaseClass[] GovSteam2_class_attributes;
	private BaseClass[] GovSteam2_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new GovSteam2().getAttributeNamesMap();
	}

	private enum GovSteam2_primitive_builder implements PrimitiveBuilder {
		dbf() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		k() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		mnef() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		mxef() {
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
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum GovSteam2_class_attributes_enum {
		dbf,
		k,
		mnef,
		mxef,
		pmax,
		pmin,
		t1,
		t2,
		LAST_ENUM
	}

	public GovSteam2() {
		GovSteam2_primitive_attributes = new BaseClass[GovSteam2_primitive_builder.values().length];
		GovSteam2_class_attributes = new BaseClass[GovSteam2_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new GovSteam2();
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

	private void updateAttributeInArray(GovSteam2_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovSteam2_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(GovSteam2_primitive_builder attrEnum, BaseClass value) {
		try {
			GovSteam2_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovSteam2_class_attributes_enum attrEnum = GovSteam2_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated GovSteam2, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovSteam2_primitive_builder attrEnum = GovSteam2_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated GovSteam2, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			GovSteam2_primitive_builder attrEnum = GovSteam2_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovSteam2_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			GovSteam2_class_attributes_enum attrEnum = GovSteam2_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovSteam2_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : GovSteam2_primitive_builder.values()) {
			if (enumValue != GovSteam2_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovSteam2." + enumValue.name());
			}
		}
		for (var enumValue : GovSteam2_class_attributes_enum.values()) {
			if (enumValue != GovSteam2_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovSteam2." + enumValue.name());
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
			for (GovSteam2_primitive_builder attrEnum : GovSteam2_primitive_builder.values()) {
				BaseClass bc = GovSteam2_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteam2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovSteam2_class_attributes_enum attrEnum : GovSteam2_class_attributes_enum.values()) {
				BaseClass bc = GovSteam2_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteam2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(GovSteam2) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "GovSteam2";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
