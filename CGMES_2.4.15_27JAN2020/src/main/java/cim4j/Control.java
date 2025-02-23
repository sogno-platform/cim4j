/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Control is used for supervisory/device control. It represents control outputs that are used to change the state in a process, e.g. close or open breaker, a set point value or a raise lower command.
 */
public class Control extends IdentifiedObject {

	private static final Logging LOG = Logging.getLogger(Control.class);

	private BaseClass[] Control_class_attributes;
	private BaseClass[] Control_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new Control().getAttributeNamesMap();
	}

	private enum Control_primitive_builder implements PrimitiveBuilder {
		controlType() {
			public BaseClass construct(java.lang.String value) {
				return new String(value);
			}
		},
		operationInProgress() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		timeStamp() {
			public BaseClass construct(java.lang.String value) {
				return new DateTime(value);
			}
		},
		unitMultiplier() {
			public BaseClass construct(java.lang.String value) {
				return new UnitMultiplier(value);
			}
		},
		unitSymbol() {
			public BaseClass construct(java.lang.String value) {
				return new UnitSymbol(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum Control_class_attributes_enum {
		PowerSystemResource,
		controlType,
		operationInProgress,
		timeStamp,
		unitMultiplier,
		unitSymbol,
		LAST_ENUM
	}

	public Control() {
		Control_primitive_attributes = new BaseClass[Control_primitive_builder.values().length];
		Control_class_attributes = new BaseClass[Control_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new Control();
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

	private void updateAttributeInArray(Control_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Control_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(Control_primitive_builder attrEnum, BaseClass value) {
		try {
			Control_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Control_class_attributes_enum attrEnum = Control_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated Control, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Control_primitive_builder attrEnum = Control_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated Control, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			Control_primitive_builder attrEnum = Control_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = Control_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			Control_class_attributes_enum attrEnum = Control_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = Control_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : Control_primitive_builder.values()) {
			if (enumValue != Control_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "Control." + enumValue.name());
			}
		}
		for (var enumValue : Control_class_attributes_enum.values()) {
			if (enumValue != Control_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "Control." + enumValue.name());
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
			for (Control_primitive_builder attrEnum : Control_primitive_builder.values()) {
				BaseClass bc = Control_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Control." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Control_class_attributes_enum attrEnum : Control_class_attributes_enum.values()) {
				BaseClass bc = Control_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Control." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(Control) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "Control";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
