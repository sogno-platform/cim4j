/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The schedule has time points where the time between them is constant.
 */
public class RegularIntervalSchedule extends BasicIntervalSchedule {

	private static final Logging LOG = Logging.getLogger(RegularIntervalSchedule.class);

	private BaseClass[] RegularIntervalSchedule_class_attributes;
	private BaseClass[] RegularIntervalSchedule_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new RegularIntervalSchedule().getAttributeNamesMap();
	}

	private enum RegularIntervalSchedule_primitive_builder implements PrimitiveBuilder {
		endTime() {
			public BaseClass construct(java.lang.String value) {
				return new DateTime(value);
			}
		},
		timeStep() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum RegularIntervalSchedule_class_attributes_enum {
		TimePoints,
		endTime,
		timeStep,
		LAST_ENUM
	}

	public RegularIntervalSchedule() {
		RegularIntervalSchedule_primitive_attributes = new BaseClass[RegularIntervalSchedule_primitive_builder.values().length];
		RegularIntervalSchedule_class_attributes = new BaseClass[RegularIntervalSchedule_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new RegularIntervalSchedule();
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

	private void updateAttributeInArray(RegularIntervalSchedule_class_attributes_enum attrEnum, BaseClass value) {
		try {
			RegularIntervalSchedule_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(RegularIntervalSchedule_primitive_builder attrEnum, BaseClass value) {
		try {
			RegularIntervalSchedule_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			RegularIntervalSchedule_class_attributes_enum attrEnum = RegularIntervalSchedule_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated RegularIntervalSchedule, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			RegularIntervalSchedule_primitive_builder attrEnum = RegularIntervalSchedule_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated RegularIntervalSchedule, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			RegularIntervalSchedule_primitive_builder attrEnum = RegularIntervalSchedule_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = RegularIntervalSchedule_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			RegularIntervalSchedule_class_attributes_enum attrEnum = RegularIntervalSchedule_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = RegularIntervalSchedule_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : RegularIntervalSchedule_primitive_builder.values()) {
			if (enumValue != RegularIntervalSchedule_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "RegularIntervalSchedule." + enumValue.name());
			}
		}
		for (var enumValue : RegularIntervalSchedule_class_attributes_enum.values()) {
			if (enumValue != RegularIntervalSchedule_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "RegularIntervalSchedule." + enumValue.name());
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
			for (RegularIntervalSchedule_primitive_builder attrEnum : RegularIntervalSchedule_primitive_builder.values()) {
				BaseClass bc = RegularIntervalSchedule_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RegularIntervalSchedule." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (RegularIntervalSchedule_class_attributes_enum attrEnum : RegularIntervalSchedule_class_attributes_enum.values()) {
				BaseClass bc = RegularIntervalSchedule_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RegularIntervalSchedule." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(RegularIntervalSchedule) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "RegularIntervalSchedule";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
