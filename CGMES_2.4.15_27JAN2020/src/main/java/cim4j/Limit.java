/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Specifies one limit value for a Measurement. A Measurement typically has several limits that are kept together by the LimitSet class. The actual meaning and use of a Limit instance (i.e., if it is an alarm or warning limit or if it is a high or low limit) is not captured in the Limit class. However the name of a Limit instance may indicate both meaning and use.
 */
public class Limit extends IdentifiedObject {

	private static final Logging LOG = Logging.getLogger(Limit.class);

	private BaseClass[] Limit_class_attributes;
	private BaseClass[] Limit_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new Limit().getAttributeNamesMap();
	}

	private enum Limit_primitive_builder implements PrimitiveBuilder {
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum Limit_class_attributes_enum {
		LAST_ENUM
	}

	public Limit() {
		Limit_primitive_attributes = new BaseClass[Limit_primitive_builder.values().length];
		Limit_class_attributes = new BaseClass[Limit_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new Limit();
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

	private void updateAttributeInArray(Limit_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Limit_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(Limit_primitive_builder attrEnum, BaseClass value) {
		try {
			Limit_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Limit_class_attributes_enum attrEnum = Limit_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated Limit, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Limit_primitive_builder attrEnum = Limit_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated Limit, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			Limit_primitive_builder attrEnum = Limit_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = Limit_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			Limit_class_attributes_enum attrEnum = Limit_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = Limit_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : Limit_primitive_builder.values()) {
			if (enumValue != Limit_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "Limit." + enumValue.name());
			}
		}
		for (var enumValue : Limit_class_attributes_enum.values()) {
			if (enumValue != Limit_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "Limit." + enumValue.name());
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
			for (Limit_primitive_builder attrEnum : Limit_primitive_builder.values()) {
				BaseClass bc = Limit_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Limit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Limit_class_attributes_enum attrEnum : Limit_class_attributes_enum.values()) {
				BaseClass bc = Limit_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Limit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(Limit) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "Limit";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
