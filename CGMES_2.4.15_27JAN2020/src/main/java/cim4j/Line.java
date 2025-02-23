/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Contains equipment beyond a substation belonging to a power transmission line.
 */
public class Line extends EquipmentContainer {

	private static final Logging LOG = Logging.getLogger(Line.class);

	private BaseClass[] Line_class_attributes;
	private BaseClass[] Line_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new Line().getAttributeNamesMap();
	}

	private enum Line_primitive_builder implements PrimitiveBuilder {
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum Line_class_attributes_enum {
		Region,
		LAST_ENUM
	}

	public Line() {
		Line_primitive_attributes = new BaseClass[Line_primitive_builder.values().length];
		Line_class_attributes = new BaseClass[Line_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new Line();
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

	private void updateAttributeInArray(Line_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Line_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(Line_primitive_builder attrEnum, BaseClass value) {
		try {
			Line_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Line_class_attributes_enum attrEnum = Line_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated Line, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Line_primitive_builder attrEnum = Line_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated Line, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			Line_primitive_builder attrEnum = Line_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = Line_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			Line_class_attributes_enum attrEnum = Line_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = Line_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : Line_primitive_builder.values()) {
			if (enumValue != Line_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "Line." + enumValue.name());
			}
		}
		for (var enumValue : Line_class_attributes_enum.values()) {
			if (enumValue != Line_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "Line." + enumValue.name());
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
			for (Line_primitive_builder attrEnum : Line_primitive_builder.values()) {
				BaseClass bc = Line_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Line." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Line_class_attributes_enum attrEnum : Line_class_attributes_enum.values()) {
				BaseClass bc = Line_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Line." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(Line) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "Line";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
