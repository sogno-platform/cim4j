/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generic turbogas with acceleration and temperature controller.
 */
public class GovGAST3 extends TurbineGovernorDynamics {

	private static final Logging LOG = Logging.getLogger(GovGAST3.class);

	private BaseClass[] GovGAST3_class_attributes;
	private BaseClass[] GovGAST3_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new GovGAST3().getAttributeNamesMap();
	}

	private enum GovGAST3_primitive_builder implements PrimitiveBuilder {
		bca() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		bp() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		dtc() {
			public BaseClass construct(java.lang.String value) {
				return new Temperature(value);
			}
		},
		ka() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kac() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kca() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		ksi() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		ky() {
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
		rcmn() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		rcmx() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		tac() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tc() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		td() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tfen() {
			public BaseClass construct(java.lang.String value) {
				return new Temperature(value);
			}
		},
		tg() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tsi() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tt() {
			public BaseClass construct(java.lang.String value) {
				return new Temperature(value);
			}
		},
		ttc() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		ty() {
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

	private enum GovGAST3_class_attributes_enum {
		bca,
		bp,
		dtc,
		ka,
		kac,
		kca,
		ksi,
		ky,
		mnef,
		mxef,
		rcmn,
		rcmx,
		tac,
		tc,
		td,
		tfen,
		tg,
		tsi,
		tt,
		ttc,
		ty,
		LAST_ENUM
	}

	public GovGAST3() {
		GovGAST3_primitive_attributes = new BaseClass[GovGAST3_primitive_builder.values().length];
		GovGAST3_class_attributes = new BaseClass[GovGAST3_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new GovGAST3();
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

	private void updateAttributeInArray(GovGAST3_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovGAST3_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(GovGAST3_primitive_builder attrEnum, BaseClass value) {
		try {
			GovGAST3_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovGAST3_class_attributes_enum attrEnum = GovGAST3_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated GovGAST3, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovGAST3_primitive_builder attrEnum = GovGAST3_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated GovGAST3, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			GovGAST3_primitive_builder attrEnum = GovGAST3_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovGAST3_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			GovGAST3_class_attributes_enum attrEnum = GovGAST3_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovGAST3_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : GovGAST3_primitive_builder.values()) {
			if (enumValue != GovGAST3_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovGAST3." + enumValue.name());
			}
		}
		for (var enumValue : GovGAST3_class_attributes_enum.values()) {
			if (enumValue != GovGAST3_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovGAST3." + enumValue.name());
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
			for (GovGAST3_primitive_builder attrEnum : GovGAST3_primitive_builder.values()) {
				BaseClass bc = GovGAST3_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovGAST3." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovGAST3_class_attributes_enum attrEnum : GovGAST3_class_attributes_enum.values()) {
				BaseClass bc = GovGAST3_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovGAST3." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(GovGAST3) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "GovGAST3";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
