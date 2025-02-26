/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Multi-purpose data points for defining a curve.  The use of this generic class is discouraged if a more specific class  can be used to specify the x and y axis values along with their specific data types.
 */
public class CurveData extends BaseClass {

	private static final Logging LOG = Logging.getLogger(CurveData.class);

	private BaseClass[] CurveData_class_attributes;
	private BaseClass[] CurveData_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new CurveData().getAttributeNamesMap();
	}

	private enum CurveData_primitive_builder implements PrimitiveBuilder {
		xvalue() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		y1value() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		y2value() {
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

	private enum CurveData_class_attributes_enum {
		Curve,
		xvalue,
		y1value,
		y2value,
		LAST_ENUM
	}

	public CurveData() {
		CurveData_primitive_attributes = new BaseClass[CurveData_primitive_builder.values().length];
		CurveData_class_attributes = new BaseClass[CurveData_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new CurveData();
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

	private void updateAttributeInArray(CurveData_class_attributes_enum attrEnum, BaseClass value) {
		try {
			CurveData_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(CurveData_primitive_builder attrEnum, BaseClass value) {
		try {
			CurveData_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			CurveData_class_attributes_enum attrEnum = CurveData_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated CurveData, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			CurveData_primitive_builder attrEnum = CurveData_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated CurveData, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			CurveData_primitive_builder attrEnum = CurveData_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = CurveData_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			CurveData_class_attributes_enum attrEnum = CurveData_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = CurveData_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : CurveData_primitive_builder.values()) {
			if (enumValue != CurveData_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "CurveData." + enumValue.name());
			}
		}
		for (var enumValue : CurveData_class_attributes_enum.values()) {
			if (enumValue != CurveData_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "CurveData." + enumValue.name());
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
			for (CurveData_primitive_builder attrEnum : CurveData_primitive_builder.values()) {
				BaseClass bc = CurveData_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    CurveData." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (CurveData_class_attributes_enum attrEnum : CurveData_class_attributes_enum.values()) {
				BaseClass bc = CurveData_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    CurveData." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(CurveData) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "CurveData";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
