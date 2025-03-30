/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A facility for providing variable and controllable shunt reactive power. The SVC typically consists of a stepdown transformer, filter, thyristor-controlled reactor, and thyristor-switched capacitor arms.  The SVC may operate in fixed MVar output mode or in voltage control mode. When in voltage control mode, the output of the SVC will be proportional to the deviation of voltage at the controlled bus from the voltage setpoint.  The SVC characteristic slope defines the proportion.  If the voltage at the controlled bus is equal to the voltage setpoint, the SVC MVar output is zero.
 */
public class StaticVarCompensator extends RegulatingCondEq {

	private static final Logging LOG = Logging.getLogger(StaticVarCompensator.class);

	private BaseClass[] StaticVarCompensator_class_attributes;
	private BaseClass[] StaticVarCompensator_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new StaticVarCompensator().getAttributeNamesMap();
	}

	private enum StaticVarCompensator_primitive_builder implements PrimitiveBuilder {
		capacitiveRating() {
			public BaseClass construct(java.lang.String value) {
				return new Reactance(value);
			}
		},
		inductiveRating() {
			public BaseClass construct(java.lang.String value) {
				return new Reactance(value);
			}
		},
		q() {
			public BaseClass construct(java.lang.String value) {
				return new ReactivePower(value);
			}
		},
		sVCControlMode() {
			public BaseClass construct(java.lang.String value) {
				return new SVCControlMode(value);
			}
		},
		slope() {
			public BaseClass construct(java.lang.String value) {
				return new VoltagePerReactivePower(value);
			}
		},
		voltageSetPoint() {
			public BaseClass construct(java.lang.String value) {
				return new Voltage(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum StaticVarCompensator_class_attributes_enum {
		capacitiveRating,
		inductiveRating,
		q,
		sVCControlMode,
		slope,
		voltageSetPoint,
		LAST_ENUM
	}

	public StaticVarCompensator() {
		StaticVarCompensator_primitive_attributes = new BaseClass[StaticVarCompensator_primitive_builder.values().length];
		StaticVarCompensator_class_attributes = new BaseClass[StaticVarCompensator_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new StaticVarCompensator();
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

	private void updateAttributeInArray(StaticVarCompensator_class_attributes_enum attrEnum, BaseClass value) {
		try {
			StaticVarCompensator_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(StaticVarCompensator_primitive_builder attrEnum, BaseClass value) {
		try {
			StaticVarCompensator_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			StaticVarCompensator_class_attributes_enum attrEnum = StaticVarCompensator_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated StaticVarCompensator, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			StaticVarCompensator_primitive_builder attrEnum = StaticVarCompensator_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated StaticVarCompensator, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			StaticVarCompensator_primitive_builder attrEnum = StaticVarCompensator_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = StaticVarCompensator_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			StaticVarCompensator_class_attributes_enum attrEnum = StaticVarCompensator_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = StaticVarCompensator_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : StaticVarCompensator_primitive_builder.values()) {
			if (enumValue != StaticVarCompensator_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "StaticVarCompensator." + enumValue.name());
			}
		}
		for (var enumValue : StaticVarCompensator_class_attributes_enum.values()) {
			if (enumValue != StaticVarCompensator_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "StaticVarCompensator." + enumValue.name());
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
			for (StaticVarCompensator_primitive_builder attrEnum : StaticVarCompensator_primitive_builder.values()) {
				BaseClass bc = StaticVarCompensator_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    StaticVarCompensator." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (StaticVarCompensator_class_attributes_enum attrEnum : StaticVarCompensator_class_attributes_enum.values()) {
				BaseClass bc = StaticVarCompensator_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    StaticVarCompensator." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(StaticVarCompensator) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "StaticVarCompensator";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
