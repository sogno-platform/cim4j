/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * An electrical device consisting of  two or more coupled windings, with or without a magnetic core, for introducing mutual coupling between electric circuits. Transformers can be used to control voltage and phase shift (active power flow). A power transformer may be composed of separate transformer tanks that need not be identical. A power transformer can be modeled with or without tanks and is intended for use in both balanced and unbalanced representations.   A power transformer typically has two terminals, but may have one (grounding), three or more terminals. The inherited association ConductingEquipment.BaseVoltage should not be used.  The association from TransformerEnd to BaseVoltage should be used instead.
 */
public class PowerTransformer extends ConductingEquipment {

	private static final Logging LOG = Logging.getLogger(PowerTransformer.class);

	private BaseClass[] PowerTransformer_class_attributes;
	private BaseClass[] PowerTransformer_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new PowerTransformer().getAttributeNamesMap();
	}

	private enum PowerTransformer_primitive_builder implements PrimitiveBuilder {
		beforeShCircuitHighestOperatingCurrent() {
			public BaseClass construct(java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
		beforeShCircuitHighestOperatingVoltage() {
			public BaseClass construct(java.lang.String value) {
				return new Voltage(value);
			}
		},
		beforeShortCircuitAnglePf() {
			public BaseClass construct(java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
		highSideMinOperatingU() {
			public BaseClass construct(java.lang.String value) {
				return new Voltage(value);
			}
		},
		isPartOfGeneratorUnit() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		operationalValuesConsidered() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum PowerTransformer_class_attributes_enum {
		PowerTransformerEnd,
		beforeShCircuitHighestOperatingCurrent,
		beforeShCircuitHighestOperatingVoltage,
		beforeShortCircuitAnglePf,
		highSideMinOperatingU,
		isPartOfGeneratorUnit,
		operationalValuesConsidered,
		LAST_ENUM
	}

	public PowerTransformer() {
		PowerTransformer_primitive_attributes = new BaseClass[PowerTransformer_primitive_builder.values().length];
		PowerTransformer_class_attributes = new BaseClass[PowerTransformer_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new PowerTransformer();
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

	private void updateAttributeInArray(PowerTransformer_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PowerTransformer_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(PowerTransformer_primitive_builder attrEnum, BaseClass value) {
		try {
			PowerTransformer_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PowerTransformer_class_attributes_enum attrEnum = PowerTransformer_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated PowerTransformer, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PowerTransformer_primitive_builder attrEnum = PowerTransformer_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated PowerTransformer, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			PowerTransformer_primitive_builder attrEnum = PowerTransformer_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = PowerTransformer_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			PowerTransformer_class_attributes_enum attrEnum = PowerTransformer_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = PowerTransformer_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : PowerTransformer_primitive_builder.values()) {
			if (enumValue != PowerTransformer_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "PowerTransformer." + enumValue.name());
			}
		}
		for (var enumValue : PowerTransformer_class_attributes_enum.values()) {
			if (enumValue != PowerTransformer_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "PowerTransformer." + enumValue.name());
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
			for (PowerTransformer_primitive_builder attrEnum : PowerTransformer_primitive_builder.values()) {
				BaseClass bc = PowerTransformer_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PowerTransformer." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PowerTransformer_class_attributes_enum attrEnum : PowerTransformer_class_attributes_enum.values()) {
				BaseClass bc = PowerTransformer_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PowerTransformer." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(PowerTransformer) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "PowerTransformer";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
