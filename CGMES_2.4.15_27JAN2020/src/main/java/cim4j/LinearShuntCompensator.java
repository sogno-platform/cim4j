/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A linear shunt compensator has banks or sections with equal admittance values.
 */
public class LinearShuntCompensator extends ShuntCompensator {

	private static final Logging LOG = Logging.getLogger(LinearShuntCompensator.class);

	private BaseClass[] LinearShuntCompensator_class_attributes;
	private BaseClass[] LinearShuntCompensator_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new LinearShuntCompensator().getAttributeNamesMap();
	}

	private enum LinearShuntCompensator_primitive_builder implements PrimitiveBuilder {
		b0PerSection() {
			public BaseClass construct(java.lang.String value) {
				return new Susceptance(value);
			}
		},
		bPerSection() {
			public BaseClass construct(java.lang.String value) {
				return new Susceptance(value);
			}
		},
		g0PerSection() {
			public BaseClass construct(java.lang.String value) {
				return new Conductance(value);
			}
		},
		gPerSection() {
			public BaseClass construct(java.lang.String value) {
				return new Conductance(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum LinearShuntCompensator_class_attributes_enum {
		b0PerSection,
		bPerSection,
		g0PerSection,
		gPerSection,
		LAST_ENUM
	}

	public LinearShuntCompensator() {
		LinearShuntCompensator_primitive_attributes = new BaseClass[LinearShuntCompensator_primitive_builder.values().length];
		LinearShuntCompensator_class_attributes = new BaseClass[LinearShuntCompensator_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new LinearShuntCompensator();
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

	private void updateAttributeInArray(LinearShuntCompensator_class_attributes_enum attrEnum, BaseClass value) {
		try {
			LinearShuntCompensator_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(LinearShuntCompensator_primitive_builder attrEnum, BaseClass value) {
		try {
			LinearShuntCompensator_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			LinearShuntCompensator_class_attributes_enum attrEnum = LinearShuntCompensator_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated LinearShuntCompensator, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			LinearShuntCompensator_primitive_builder attrEnum = LinearShuntCompensator_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated LinearShuntCompensator, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			LinearShuntCompensator_primitive_builder attrEnum = LinearShuntCompensator_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = LinearShuntCompensator_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			LinearShuntCompensator_class_attributes_enum attrEnum = LinearShuntCompensator_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = LinearShuntCompensator_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : LinearShuntCompensator_primitive_builder.values()) {
			if (enumValue != LinearShuntCompensator_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "LinearShuntCompensator." + enumValue.name());
			}
		}
		for (var enumValue : LinearShuntCompensator_class_attributes_enum.values()) {
			if (enumValue != LinearShuntCompensator_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "LinearShuntCompensator." + enumValue.name());
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
			for (LinearShuntCompensator_primitive_builder attrEnum : LinearShuntCompensator_primitive_builder.values()) {
				BaseClass bc = LinearShuntCompensator_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LinearShuntCompensator." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (LinearShuntCompensator_class_attributes_enum attrEnum : LinearShuntCompensator_class_attributes_enum.values()) {
				BaseClass bc = LinearShuntCompensator_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LinearShuntCompensator." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(LinearShuntCompensator) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "LinearShuntCompensator";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
