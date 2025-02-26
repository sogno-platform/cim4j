/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Time point for a schedule where the time between the consecutive points is constant.
 */
public class RegularTimePoint extends BaseClass {

	private static final Logging LOG = Logging.getLogger(RegularTimePoint.class);

	private BaseClass[] RegularTimePoint_class_attributes;
	private BaseClass[] RegularTimePoint_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new RegularTimePoint().getAttributeNamesMap();
	}

	private enum RegularTimePoint_primitive_builder implements PrimitiveBuilder {
		sequenceNumber() {
			public BaseClass construct(java.lang.String value) {
				return new Integer(value);
			}
		},
		value1() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		value2() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum RegularTimePoint_class_attributes_enum {
		IntervalSchedule,
		sequenceNumber,
		value1,
		value2,
		LAST_ENUM
	}

	public RegularTimePoint() {
		RegularTimePoint_primitive_attributes = new BaseClass[RegularTimePoint_primitive_builder.values().length];
		RegularTimePoint_class_attributes = new BaseClass[RegularTimePoint_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new RegularTimePoint();
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

	private void updateAttributeInArray(RegularTimePoint_class_attributes_enum attrEnum, BaseClass value) {
		try {
			RegularTimePoint_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(RegularTimePoint_primitive_builder attrEnum, BaseClass value) {
		try {
			RegularTimePoint_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			RegularTimePoint_class_attributes_enum attrEnum = RegularTimePoint_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated RegularTimePoint, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			RegularTimePoint_primitive_builder attrEnum = RegularTimePoint_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated RegularTimePoint, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			RegularTimePoint_primitive_builder attrEnum = RegularTimePoint_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = RegularTimePoint_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			RegularTimePoint_class_attributes_enum attrEnum = RegularTimePoint_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = RegularTimePoint_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : RegularTimePoint_primitive_builder.values()) {
			if (enumValue != RegularTimePoint_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "RegularTimePoint." + enumValue.name());
			}
		}
		for (var enumValue : RegularTimePoint_class_attributes_enum.values()) {
			if (enumValue != RegularTimePoint_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "RegularTimePoint." + enumValue.name());
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
			for (RegularTimePoint_primitive_builder attrEnum : RegularTimePoint_primitive_builder.values()) {
				BaseClass bc = RegularTimePoint_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RegularTimePoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (RegularTimePoint_class_attributes_enum attrEnum : RegularTimePoint_class_attributes_enum.values()) {
				BaseClass bc = RegularTimePoint_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RegularTimePoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(RegularTimePoint) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "RegularTimePoint";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
