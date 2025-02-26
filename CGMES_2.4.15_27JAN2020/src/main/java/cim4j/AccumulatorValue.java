/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * AccumulatorValue represents an accumulated (counted) MeasurementValue.
 */
public class AccumulatorValue extends MeasurementValue {

	private static final Logging LOG = Logging.getLogger(AccumulatorValue.class);

	private BaseClass[] AccumulatorValue_class_attributes;
	private BaseClass[] AccumulatorValue_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new AccumulatorValue().getAttributeNamesMap();
	}

	private enum AccumulatorValue_primitive_builder implements PrimitiveBuilder {
		value() {
			public BaseClass construct(java.lang.String value) {
				return new Integer(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum AccumulatorValue_class_attributes_enum {
		Accumulator,
		AccumulatorReset,
		value,
		LAST_ENUM
	}

	public AccumulatorValue() {
		AccumulatorValue_primitive_attributes = new BaseClass[AccumulatorValue_primitive_builder.values().length];
		AccumulatorValue_class_attributes = new BaseClass[AccumulatorValue_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new AccumulatorValue();
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

	private void updateAttributeInArray(AccumulatorValue_class_attributes_enum attrEnum, BaseClass value) {
		try {
			AccumulatorValue_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(AccumulatorValue_primitive_builder attrEnum, BaseClass value) {
		try {
			AccumulatorValue_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			AccumulatorValue_class_attributes_enum attrEnum = AccumulatorValue_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated AccumulatorValue, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			AccumulatorValue_primitive_builder attrEnum = AccumulatorValue_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated AccumulatorValue, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			AccumulatorValue_primitive_builder attrEnum = AccumulatorValue_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = AccumulatorValue_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			AccumulatorValue_class_attributes_enum attrEnum = AccumulatorValue_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = AccumulatorValue_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : AccumulatorValue_primitive_builder.values()) {
			if (enumValue != AccumulatorValue_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "AccumulatorValue." + enumValue.name());
			}
		}
		for (var enumValue : AccumulatorValue_class_attributes_enum.values()) {
			if (enumValue != AccumulatorValue_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "AccumulatorValue." + enumValue.name());
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
			for (AccumulatorValue_primitive_builder attrEnum : AccumulatorValue_primitive_builder.values()) {
				BaseClass bc = AccumulatorValue_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    AccumulatorValue." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (AccumulatorValue_class_attributes_enum attrEnum : AccumulatorValue_class_attributes_enum.values()) {
				BaseClass bc = AccumulatorValue_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    AccumulatorValue." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(AccumulatorValue) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "AccumulatorValue";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
