/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A non linear shunt compensator bank or section admittance value.
 */
public class NonlinearShuntCompensatorPoint extends BaseClass {

	private static final Logging LOG = Logging.getLogger(NonlinearShuntCompensatorPoint.class);

	private BaseClass[] NonlinearShuntCompensatorPoint_class_attributes;
	private BaseClass[] NonlinearShuntCompensatorPoint_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new NonlinearShuntCompensatorPoint().getAttributeNamesMap();
	}

	private enum NonlinearShuntCompensatorPoint_primitive_builder implements PrimitiveBuilder {
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
		sectionNumber() {
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

	private enum NonlinearShuntCompensatorPoint_class_attributes_enum {
		NonlinearShuntCompensator,
		b,
		b0,
		g,
		g0,
		sectionNumber,
		LAST_ENUM
	}

	public NonlinearShuntCompensatorPoint() {
		NonlinearShuntCompensatorPoint_primitive_attributes = new BaseClass[NonlinearShuntCompensatorPoint_primitive_builder.values().length];
		NonlinearShuntCompensatorPoint_class_attributes = new BaseClass[NonlinearShuntCompensatorPoint_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new NonlinearShuntCompensatorPoint();
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

	private void updateAttributeInArray(NonlinearShuntCompensatorPoint_class_attributes_enum attrEnum, BaseClass value) {
		try {
			NonlinearShuntCompensatorPoint_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(NonlinearShuntCompensatorPoint_primitive_builder attrEnum, BaseClass value) {
		try {
			NonlinearShuntCompensatorPoint_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			NonlinearShuntCompensatorPoint_class_attributes_enum attrEnum = NonlinearShuntCompensatorPoint_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated NonlinearShuntCompensatorPoint, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			NonlinearShuntCompensatorPoint_primitive_builder attrEnum = NonlinearShuntCompensatorPoint_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated NonlinearShuntCompensatorPoint, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			NonlinearShuntCompensatorPoint_primitive_builder attrEnum = NonlinearShuntCompensatorPoint_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = NonlinearShuntCompensatorPoint_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			NonlinearShuntCompensatorPoint_class_attributes_enum attrEnum = NonlinearShuntCompensatorPoint_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = NonlinearShuntCompensatorPoint_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : NonlinearShuntCompensatorPoint_primitive_builder.values()) {
			if (enumValue != NonlinearShuntCompensatorPoint_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "NonlinearShuntCompensatorPoint." + enumValue.name());
			}
		}
		for (var enumValue : NonlinearShuntCompensatorPoint_class_attributes_enum.values()) {
			if (enumValue != NonlinearShuntCompensatorPoint_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "NonlinearShuntCompensatorPoint." + enumValue.name());
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
			for (NonlinearShuntCompensatorPoint_primitive_builder attrEnum : NonlinearShuntCompensatorPoint_primitive_builder.values()) {
				BaseClass bc = NonlinearShuntCompensatorPoint_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    NonlinearShuntCompensatorPoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (NonlinearShuntCompensatorPoint_class_attributes_enum attrEnum : NonlinearShuntCompensatorPoint_class_attributes_enum.values()) {
				BaseClass bc = NonlinearShuntCompensatorPoint_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    NonlinearShuntCompensatorPoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(NonlinearShuntCompensatorPoint) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "NonlinearShuntCompensatorPoint";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
