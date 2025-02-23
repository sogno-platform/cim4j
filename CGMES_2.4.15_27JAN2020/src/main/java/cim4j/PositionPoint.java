/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Set of spatial coordinates that determine a point, defined in the coordinate system specified in 'Location.CoordinateSystem'. Use a single position point instance to desribe a point-oriented location. Use a sequence of position points to describe a line-oriented object (physical location of non-point oriented objects like cables or lines), or area of an object (like a substation or a geographical zone - in this case, have first and last position point with the same values).
 */
public class PositionPoint extends BaseClass {

	private static final Logging LOG = Logging.getLogger(PositionPoint.class);

	private BaseClass[] PositionPoint_class_attributes;
	private BaseClass[] PositionPoint_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new PositionPoint().getAttributeNamesMap();
	}

	private enum PositionPoint_primitive_builder implements PrimitiveBuilder {
		sequenceNumber() {
			public BaseClass construct(java.lang.String value) {
				return new Integer(value);
			}
		},
		xPosition() {
			public BaseClass construct(java.lang.String value) {
				return new String(value);
			}
		},
		yPosition() {
			public BaseClass construct(java.lang.String value) {
				return new String(value);
			}
		},
		zPosition() {
			public BaseClass construct(java.lang.String value) {
				return new String(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum PositionPoint_class_attributes_enum {
		Location,
		sequenceNumber,
		xPosition,
		yPosition,
		zPosition,
		LAST_ENUM
	}

	public PositionPoint() {
		PositionPoint_primitive_attributes = new BaseClass[PositionPoint_primitive_builder.values().length];
		PositionPoint_class_attributes = new BaseClass[PositionPoint_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new PositionPoint();
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

	private void updateAttributeInArray(PositionPoint_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PositionPoint_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(PositionPoint_primitive_builder attrEnum, BaseClass value) {
		try {
			PositionPoint_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PositionPoint_class_attributes_enum attrEnum = PositionPoint_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated PositionPoint, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PositionPoint_primitive_builder attrEnum = PositionPoint_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated PositionPoint, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			PositionPoint_primitive_builder attrEnum = PositionPoint_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = PositionPoint_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			PositionPoint_class_attributes_enum attrEnum = PositionPoint_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = PositionPoint_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : PositionPoint_primitive_builder.values()) {
			if (enumValue != PositionPoint_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "PositionPoint." + enumValue.name());
			}
		}
		for (var enumValue : PositionPoint_class_attributes_enum.values()) {
			if (enumValue != PositionPoint_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "PositionPoint." + enumValue.name());
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
			for (PositionPoint_primitive_builder attrEnum : PositionPoint_primitive_builder.values()) {
				BaseClass bc = PositionPoint_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PositionPoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PositionPoint_class_attributes_enum attrEnum : PositionPoint_class_attributes_enum.values()) {
				BaseClass bc = PositionPoint_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PositionPoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(PositionPoint) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "PositionPoint";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
