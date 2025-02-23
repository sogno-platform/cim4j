/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * This model can be derived from UnderexcLimIEEE2. The limit characteristic (look -up table) is a single straight-line, the same as UnderexcLimIEEE2 (see Figure 10.4 (p 32), IEEE 421.5-2005 Section 10.2).
 */
public class UnderexcLim2Simplified extends UnderexcitationLimiterDynamics {

	private static final Logging LOG = Logging.getLogger(UnderexcLim2Simplified.class);

	private BaseClass[] UnderexcLim2Simplified_class_attributes;
	private BaseClass[] UnderexcLim2Simplified_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new UnderexcLim2Simplified().getAttributeNamesMap();
	}

	private enum UnderexcLim2Simplified_primitive_builder implements PrimitiveBuilder {
		kui() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		p0() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		p1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		q0() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		q1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vuimax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vuimin() {
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

	private enum UnderexcLim2Simplified_class_attributes_enum {
		kui,
		p0,
		p1,
		q0,
		q1,
		vuimax,
		vuimin,
		LAST_ENUM
	}

	public UnderexcLim2Simplified() {
		UnderexcLim2Simplified_primitive_attributes = new BaseClass[UnderexcLim2Simplified_primitive_builder.values().length];
		UnderexcLim2Simplified_class_attributes = new BaseClass[UnderexcLim2Simplified_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new UnderexcLim2Simplified();
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

	private void updateAttributeInArray(UnderexcLim2Simplified_class_attributes_enum attrEnum, BaseClass value) {
		try {
			UnderexcLim2Simplified_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(UnderexcLim2Simplified_primitive_builder attrEnum, BaseClass value) {
		try {
			UnderexcLim2Simplified_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			UnderexcLim2Simplified_class_attributes_enum attrEnum = UnderexcLim2Simplified_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated UnderexcLim2Simplified, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			UnderexcLim2Simplified_primitive_builder attrEnum = UnderexcLim2Simplified_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated UnderexcLim2Simplified, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			UnderexcLim2Simplified_primitive_builder attrEnum = UnderexcLim2Simplified_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = UnderexcLim2Simplified_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			UnderexcLim2Simplified_class_attributes_enum attrEnum = UnderexcLim2Simplified_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = UnderexcLim2Simplified_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : UnderexcLim2Simplified_primitive_builder.values()) {
			if (enumValue != UnderexcLim2Simplified_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "UnderexcLim2Simplified." + enumValue.name());
			}
		}
		for (var enumValue : UnderexcLim2Simplified_class_attributes_enum.values()) {
			if (enumValue != UnderexcLim2Simplified_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "UnderexcLim2Simplified." + enumValue.name());
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
			for (UnderexcLim2Simplified_primitive_builder attrEnum : UnderexcLim2Simplified_primitive_builder.values()) {
				BaseClass bc = UnderexcLim2Simplified_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    UnderexcLim2Simplified." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (UnderexcLim2Simplified_class_attributes_enum attrEnum : UnderexcLim2Simplified_class_attributes_enum.values()) {
				BaseClass bc = UnderexcLim2Simplified_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    UnderexcLim2Simplified." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(UnderexcLim2Simplified) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "UnderexcLim2Simplified";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
