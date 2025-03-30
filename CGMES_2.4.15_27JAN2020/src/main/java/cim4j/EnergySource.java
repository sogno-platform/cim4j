/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A generic equivalent for an energy supplier on a transmission or distribution voltage level.
 */
public class EnergySource extends ConductingEquipment {

	private static final Logging LOG = Logging.getLogger(EnergySource.class);

	private BaseClass[] EnergySource_class_attributes;
	private BaseClass[] EnergySource_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new EnergySource().getAttributeNamesMap();
	}

	private enum EnergySource_primitive_builder implements PrimitiveBuilder {
		activePower() {
			public BaseClass construct(java.lang.String value) {
				return new ActivePower(value);
			}
		},
		nominalVoltage() {
			public BaseClass construct(java.lang.String value) {
				return new Voltage(value);
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
		reactivePower() {
			public BaseClass construct(java.lang.String value) {
				return new ReactivePower(value);
			}
		},
		rn() {
			public BaseClass construct(java.lang.String value) {
				return new Resistance(value);
			}
		},
		voltageAngle() {
			public BaseClass construct(java.lang.String value) {
				return new AngleRadians(value);
			}
		},
		voltageMagnitude() {
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
		xn() {
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

	private enum EnergySource_class_attributes_enum {
		EnergySchedulingType,
		WindTurbineType3or4Dynamics,
		activePower,
		nominalVoltage,
		r,
		r0,
		reactivePower,
		rn,
		voltageAngle,
		voltageMagnitude,
		x,
		x0,
		xn,
		LAST_ENUM
	}

	public EnergySource() {
		EnergySource_primitive_attributes = new BaseClass[EnergySource_primitive_builder.values().length];
		EnergySource_class_attributes = new BaseClass[EnergySource_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new EnergySource();
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

	private void updateAttributeInArray(EnergySource_class_attributes_enum attrEnum, BaseClass value) {
		try {
			EnergySource_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(EnergySource_primitive_builder attrEnum, BaseClass value) {
		try {
			EnergySource_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			EnergySource_class_attributes_enum attrEnum = EnergySource_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated EnergySource, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			EnergySource_primitive_builder attrEnum = EnergySource_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated EnergySource, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			EnergySource_primitive_builder attrEnum = EnergySource_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = EnergySource_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			EnergySource_class_attributes_enum attrEnum = EnergySource_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = EnergySource_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : EnergySource_primitive_builder.values()) {
			if (enumValue != EnergySource_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "EnergySource." + enumValue.name());
			}
		}
		for (var enumValue : EnergySource_class_attributes_enum.values()) {
			if (enumValue != EnergySource_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "EnergySource." + enumValue.name());
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
			for (EnergySource_primitive_builder attrEnum : EnergySource_primitive_builder.values()) {
				BaseClass bc = EnergySource_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    EnergySource." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (EnergySource_class_attributes_enum attrEnum : EnergySource_class_attributes_enum.values()) {
				BaseClass bc = EnergySource_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    EnergySource." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(EnergySource) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "EnergySource";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
