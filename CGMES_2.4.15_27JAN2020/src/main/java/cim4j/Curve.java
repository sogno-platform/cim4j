/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A multi-purpose curve or functional relationship between an independent variable (X-axis) and dependent (Y-axis) variables.
 */
public class Curve extends IdentifiedObject {

	private static final Logging LOG = Logging.getLogger(Curve.class);

	private BaseClass[] Curve_class_attributes;
	private BaseClass[] Curve_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new Curve().getAttributeNamesMap();
	}

	private enum Curve_primitive_builder implements PrimitiveBuilder {
		curveStyle() {
			public BaseClass construct(java.lang.String value) {
				return new CurveStyle(value);
			}
		},
		xUnit() {
			public BaseClass construct(java.lang.String value) {
				return new UnitSymbol(value);
			}
		},
		y1Unit() {
			public BaseClass construct(java.lang.String value) {
				return new UnitSymbol(value);
			}
		},
		y2Unit() {
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

	private enum Curve_class_attributes_enum {
		CurveDatas,
		curveStyle,
		xUnit,
		y1Unit,
		y2Unit,
		LAST_ENUM
	}

	public Curve() {
		Curve_primitive_attributes = new BaseClass[Curve_primitive_builder.values().length];
		Curve_class_attributes = new BaseClass[Curve_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new Curve();
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

	private void updateAttributeInArray(Curve_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Curve_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(Curve_primitive_builder attrEnum, BaseClass value) {
		try {
			Curve_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Curve_class_attributes_enum attrEnum = Curve_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated Curve, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Curve_primitive_builder attrEnum = Curve_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated Curve, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			Curve_primitive_builder attrEnum = Curve_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = Curve_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			Curve_class_attributes_enum attrEnum = Curve_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = Curve_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : Curve_primitive_builder.values()) {
			if (enumValue != Curve_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "Curve." + enumValue.name());
			}
		}
		for (var enumValue : Curve_class_attributes_enum.values()) {
			if (enumValue != Curve_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "Curve." + enumValue.name());
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
			for (Curve_primitive_builder attrEnum : Curve_primitive_builder.values()) {
				BaseClass bc = Curve_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Curve." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Curve_class_attributes_enum attrEnum : Curve_class_attributes_enum.values()) {
				BaseClass bc = Curve_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Curve." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(Curve) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "Curve";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
