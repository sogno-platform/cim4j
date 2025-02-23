/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A unit with valves for three phases, together with unit control equipment, essential protective and switching devices, DC storage capacitors, phase reactors and auxiliaries, if any, used for conversion.
 */
public class ACDCConverter extends ConductingEquipment {

	private static final Logging LOG = Logging.getLogger(ACDCConverter.class);

	private BaseClass[] ACDCConverter_class_attributes;
	private BaseClass[] ACDCConverter_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ACDCConverter().getAttributeNamesMap();
	}

	private enum ACDCConverter_primitive_builder implements PrimitiveBuilder {
		baseS() {
			public BaseClass construct(java.lang.String value) {
				return new ApparentPower(value);
			}
		},
		idc() {
			public BaseClass construct(java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
		idleLoss() {
			public BaseClass construct(java.lang.String value) {
				return new ActivePower(value);
			}
		},
		maxUdc() {
			public BaseClass construct(java.lang.String value) {
				return new Voltage(value);
			}
		},
		minUdc() {
			public BaseClass construct(java.lang.String value) {
				return new Voltage(value);
			}
		},
		numberOfValves() {
			public BaseClass construct(java.lang.String value) {
				return new Integer(value);
			}
		},
		p() {
			public BaseClass construct(java.lang.String value) {
				return new ActivePower(value);
			}
		},
		poleLossP() {
			public BaseClass construct(java.lang.String value) {
				return new ActivePower(value);
			}
		},
		q() {
			public BaseClass construct(java.lang.String value) {
				return new ReactivePower(value);
			}
		},
		ratedUdc() {
			public BaseClass construct(java.lang.String value) {
				return new Voltage(value);
			}
		},
		resistiveLoss() {
			public BaseClass construct(java.lang.String value) {
				return new Resistance(value);
			}
		},
		switchingLoss() {
			public BaseClass construct(java.lang.String value) {
				return new ActivePowerPerCurrentFlow(value);
			}
		},
		targetPpcc() {
			public BaseClass construct(java.lang.String value) {
				return new ActivePower(value);
			}
		},
		targetUdc() {
			public BaseClass construct(java.lang.String value) {
				return new Voltage(value);
			}
		},
		uc() {
			public BaseClass construct(java.lang.String value) {
				return new Voltage(value);
			}
		},
		udc() {
			public BaseClass construct(java.lang.String value) {
				return new Voltage(value);
			}
		},
		valveU0() {
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

	private enum ACDCConverter_class_attributes_enum {
		DCTerminals,
		PccTerminal,
		baseS,
		idc,
		idleLoss,
		maxUdc,
		minUdc,
		numberOfValves,
		p,
		poleLossP,
		q,
		ratedUdc,
		resistiveLoss,
		switchingLoss,
		targetPpcc,
		targetUdc,
		uc,
		udc,
		valveU0,
		LAST_ENUM
	}

	public ACDCConverter() {
		ACDCConverter_primitive_attributes = new BaseClass[ACDCConverter_primitive_builder.values().length];
		ACDCConverter_class_attributes = new BaseClass[ACDCConverter_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ACDCConverter();
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

	private void updateAttributeInArray(ACDCConverter_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ACDCConverter_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ACDCConverter_primitive_builder attrEnum, BaseClass value) {
		try {
			ACDCConverter_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ACDCConverter_class_attributes_enum attrEnum = ACDCConverter_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ACDCConverter, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ACDCConverter_primitive_builder attrEnum = ACDCConverter_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ACDCConverter, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ACDCConverter_primitive_builder attrEnum = ACDCConverter_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ACDCConverter_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ACDCConverter_class_attributes_enum attrEnum = ACDCConverter_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ACDCConverter_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ACDCConverter_primitive_builder.values()) {
			if (enumValue != ACDCConverter_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ACDCConverter." + enumValue.name());
			}
		}
		for (var enumValue : ACDCConverter_class_attributes_enum.values()) {
			if (enumValue != ACDCConverter_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ACDCConverter." + enumValue.name());
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
			for (ACDCConverter_primitive_builder attrEnum : ACDCConverter_primitive_builder.values()) {
				BaseClass bc = ACDCConverter_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ACDCConverter." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ACDCConverter_class_attributes_enum attrEnum : ACDCConverter_class_attributes_enum.values()) {
				BaseClass bc = ACDCConverter_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ACDCConverter." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ACDCConverter) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ACDCConverter";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
