/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A non linear shunt compensator has bank or section admittance values that differs.
 */
public class NonlinearShuntCompensator extends ShuntCompensator {

	private static final Logging LOG = Logging.getLogger(NonlinearShuntCompensator.class);

	private BaseClass[] NonlinearShuntCompensator_class_attributes;
	private BaseClass[] NonlinearShuntCompensator_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new NonlinearShuntCompensator().getAttributeNamesMap();
	}

	private enum NonlinearShuntCompensator_primitive_builder implements PrimitiveBuilder {
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum NonlinearShuntCompensator_class_attributes_enum {
		NonlinearShuntCompensatorPoints,
		LAST_ENUM
	}

	public NonlinearShuntCompensator() {
		NonlinearShuntCompensator_primitive_attributes = new BaseClass[NonlinearShuntCompensator_primitive_builder.values().length];
		NonlinearShuntCompensator_class_attributes = new BaseClass[NonlinearShuntCompensator_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new NonlinearShuntCompensator();
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

	private void updateAttributeInArray(NonlinearShuntCompensator_class_attributes_enum attrEnum, BaseClass value) {
		try {
			NonlinearShuntCompensator_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(NonlinearShuntCompensator_primitive_builder attrEnum, BaseClass value) {
		try {
			NonlinearShuntCompensator_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			NonlinearShuntCompensator_class_attributes_enum attrEnum = NonlinearShuntCompensator_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated NonlinearShuntCompensator, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			NonlinearShuntCompensator_primitive_builder attrEnum = NonlinearShuntCompensator_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated NonlinearShuntCompensator, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			NonlinearShuntCompensator_primitive_builder attrEnum = NonlinearShuntCompensator_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = NonlinearShuntCompensator_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			NonlinearShuntCompensator_class_attributes_enum attrEnum = NonlinearShuntCompensator_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = NonlinearShuntCompensator_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : NonlinearShuntCompensator_primitive_builder.values()) {
			if (enumValue != NonlinearShuntCompensator_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "NonlinearShuntCompensator." + enumValue.name());
			}
		}
		for (var enumValue : NonlinearShuntCompensator_class_attributes_enum.values()) {
			if (enumValue != NonlinearShuntCompensator_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "NonlinearShuntCompensator." + enumValue.name());
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
			for (NonlinearShuntCompensator_primitive_builder attrEnum : NonlinearShuntCompensator_primitive_builder.values()) {
				BaseClass bc = NonlinearShuntCompensator_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    NonlinearShuntCompensator." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (NonlinearShuntCompensator_class_attributes_enum attrEnum : NonlinearShuntCompensator_class_attributes_enum.values()) {
				BaseClass bc = NonlinearShuntCompensator_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    NonlinearShuntCompensator." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(NonlinearShuntCompensator) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "NonlinearShuntCompensator";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
