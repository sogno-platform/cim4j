/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A PowerTransformerEnd is associated with each Terminal of a PowerTransformer. The impedance values r, r0, x, and x0 of a PowerTransformerEnd represents a star equivalent as follows 1) for a two Terminal PowerTransformer the high voltage PowerTransformerEnd has non zero values on r, r0, x, and x0 while the low voltage PowerTransformerEnd has zero values for r, r0, x, and x0. 2) for a three Terminal PowerTransformer the three PowerTransformerEnds represents a star equivalent with each leg in the star represented by r, r0, x, and x0 values. 3) for a PowerTransformer with more than three Terminals the PowerTransformerEnd impedance values cannot be used. Instead use the TransformerMeshImpedance or split the transformer into multiple PowerTransformers.
 */
public class PowerTransformerEnd extends TransformerEnd {

	private static final Logging LOG = Logging.getLogger(PowerTransformerEnd.class);

	private BaseClass[] PowerTransformerEnd_class_attributes;
	private BaseClass[] PowerTransformerEnd_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new PowerTransformerEnd().getAttributeNamesMap();
	}

	private enum PowerTransformerEnd_primitive_builder implements PrimitiveBuilder {
		b() {
			public BaseClass construct(java.lang.String value) {
				return new Susceptance(value);
			}
		},
		b0() {
			public BaseClass construct(java.lang.String value) {
				return new Susceptance(value);
			}
		},
		connectionKind() {
			public BaseClass construct(java.lang.String value) {
				return new WindingConnection(value);
			}
		},
		g() {
			public BaseClass construct(java.lang.String value) {
				return new Conductance(value);
			}
		},
		g0() {
			public BaseClass construct(java.lang.String value) {
				return new Conductance(value);
			}
		},
		phaseAngleClock() {
			public BaseClass construct(java.lang.String value) {
				return new Integer(value);
			}
		},
		r() {
			public BaseClass construct(java.lang.String value) {
				return new Resistance(value);
			}
		},
		r0() {
			public BaseClass construct(java.lang.String value) {
				return new Resistance(value);
			}
		},
		ratedS() {
			public BaseClass construct(java.lang.String value) {
				return new ApparentPower(value);
			}
		},
		ratedU() {
			public BaseClass construct(java.lang.String value) {
				return new Voltage(value);
			}
		},
		x() {
			public BaseClass construct(java.lang.String value) {
				return new Reactance(value);
			}
		},
		x0() {
			public BaseClass construct(java.lang.String value) {
				return new Reactance(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum PowerTransformerEnd_class_attributes_enum {
		PowerTransformer,
		b,
		b0,
		connectionKind,
		g,
		g0,
		phaseAngleClock,
		r,
		r0,
		ratedS,
		ratedU,
		x,
		x0,
		LAST_ENUM
	}

	public PowerTransformerEnd() {
		PowerTransformerEnd_primitive_attributes = new BaseClass[PowerTransformerEnd_primitive_builder.values().length];
		PowerTransformerEnd_class_attributes = new BaseClass[PowerTransformerEnd_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new PowerTransformerEnd();
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

	private void updateAttributeInArray(PowerTransformerEnd_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PowerTransformerEnd_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(PowerTransformerEnd_primitive_builder attrEnum, BaseClass value) {
		try {
			PowerTransformerEnd_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PowerTransformerEnd_class_attributes_enum attrEnum = PowerTransformerEnd_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated PowerTransformerEnd, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PowerTransformerEnd_primitive_builder attrEnum = PowerTransformerEnd_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated PowerTransformerEnd, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			PowerTransformerEnd_primitive_builder attrEnum = PowerTransformerEnd_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = PowerTransformerEnd_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			PowerTransformerEnd_class_attributes_enum attrEnum = PowerTransformerEnd_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = PowerTransformerEnd_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : PowerTransformerEnd_primitive_builder.values()) {
			if (enumValue != PowerTransformerEnd_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "PowerTransformerEnd." + enumValue.name());
			}
		}
		for (var enumValue : PowerTransformerEnd_class_attributes_enum.values()) {
			if (enumValue != PowerTransformerEnd_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "PowerTransformerEnd." + enumValue.name());
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
			for (PowerTransformerEnd_primitive_builder attrEnum : PowerTransformerEnd_primitive_builder.values()) {
				BaseClass bc = PowerTransformerEnd_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PowerTransformerEnd." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PowerTransformerEnd_class_attributes_enum attrEnum : PowerTransformerEnd_class_attributes_enum.values()) {
				BaseClass bc = PowerTransformerEnd_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PowerTransformerEnd." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(PowerTransformerEnd) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "PowerTransformerEnd";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
