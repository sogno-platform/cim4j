/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A type of conducting equipment that can regulate a quantity (i.e. voltage or flow) at a specific point in the network.
 */
public class RegulatingCondEq extends ConductingEquipment {

	private static final Logging LOG = Logging.getLogger(RegulatingCondEq.class);

	private BaseClass[] RegulatingCondEq_class_attributes;
	private BaseClass[] RegulatingCondEq_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new RegulatingCondEq().getAttributeNamesMap();
	}

	private enum RegulatingCondEq_primitive_builder implements PrimitiveBuilder {
		controlEnabled() {
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

	private enum RegulatingCondEq_class_attributes_enum {
		RegulatingControl,
		controlEnabled,
		LAST_ENUM
	}

	public RegulatingCondEq() {
		RegulatingCondEq_primitive_attributes = new BaseClass[RegulatingCondEq_primitive_builder.values().length];
		RegulatingCondEq_class_attributes = new BaseClass[RegulatingCondEq_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new RegulatingCondEq();
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

	private void updateAttributeInArray(RegulatingCondEq_class_attributes_enum attrEnum, BaseClass value) {
		try {
			RegulatingCondEq_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(RegulatingCondEq_primitive_builder attrEnum, BaseClass value) {
		try {
			RegulatingCondEq_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			RegulatingCondEq_class_attributes_enum attrEnum = RegulatingCondEq_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated RegulatingCondEq, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			RegulatingCondEq_primitive_builder attrEnum = RegulatingCondEq_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated RegulatingCondEq, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			RegulatingCondEq_primitive_builder attrEnum = RegulatingCondEq_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = RegulatingCondEq_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			RegulatingCondEq_class_attributes_enum attrEnum = RegulatingCondEq_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = RegulatingCondEq_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : RegulatingCondEq_primitive_builder.values()) {
			if (enumValue != RegulatingCondEq_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "RegulatingCondEq." + enumValue.name());
			}
		}
		for (var enumValue : RegulatingCondEq_class_attributes_enum.values()) {
			if (enumValue != RegulatingCondEq_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "RegulatingCondEq." + enumValue.name());
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
			for (RegulatingCondEq_primitive_builder attrEnum : RegulatingCondEq_primitive_builder.values()) {
				BaseClass bc = RegulatingCondEq_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RegulatingCondEq." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (RegulatingCondEq_class_attributes_enum attrEnum : RegulatingCondEq_class_attributes_enum.values()) {
				BaseClass bc = RegulatingCondEq_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RegulatingCondEq." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(RegulatingCondEq) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "RegulatingCondEq";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
