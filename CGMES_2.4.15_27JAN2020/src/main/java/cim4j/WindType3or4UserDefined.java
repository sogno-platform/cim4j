/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Wind Type 3 or Type 4 function block whose dynamic behaviour is described by
 */
public class WindType3or4UserDefined extends WindTurbineType3or4Dynamics {

	private static final Logging LOG = Logging.getLogger(WindType3or4UserDefined.class);

	private BaseClass[] WindType3or4UserDefined_class_attributes;
	private BaseClass[] WindType3or4UserDefined_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new WindType3or4UserDefined().getAttributeNamesMap();
	}

	private enum WindType3or4UserDefined_primitive_builder implements PrimitiveBuilder {
		proprietary() {
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

	private enum WindType3or4UserDefined_class_attributes_enum {
		ProprietaryParameterDynamics,
		proprietary,
		LAST_ENUM
	}

	public WindType3or4UserDefined() {
		WindType3or4UserDefined_primitive_attributes = new BaseClass[WindType3or4UserDefined_primitive_builder.values().length];
		WindType3or4UserDefined_class_attributes = new BaseClass[WindType3or4UserDefined_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new WindType3or4UserDefined();
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

	private void updateAttributeInArray(WindType3or4UserDefined_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindType3or4UserDefined_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(WindType3or4UserDefined_primitive_builder attrEnum, BaseClass value) {
		try {
			WindType3or4UserDefined_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindType3or4UserDefined_class_attributes_enum attrEnum = WindType3or4UserDefined_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated WindType3or4UserDefined, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindType3or4UserDefined_primitive_builder attrEnum = WindType3or4UserDefined_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated WindType3or4UserDefined, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			WindType3or4UserDefined_primitive_builder attrEnum = WindType3or4UserDefined_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = WindType3or4UserDefined_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			WindType3or4UserDefined_class_attributes_enum attrEnum = WindType3or4UserDefined_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = WindType3or4UserDefined_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : WindType3or4UserDefined_primitive_builder.values()) {
			if (enumValue != WindType3or4UserDefined_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "WindType3or4UserDefined." + enumValue.name());
			}
		}
		for (var enumValue : WindType3or4UserDefined_class_attributes_enum.values()) {
			if (enumValue != WindType3or4UserDefined_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "WindType3or4UserDefined." + enumValue.name());
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
			for (WindType3or4UserDefined_primitive_builder attrEnum : WindType3or4UserDefined_primitive_builder.values()) {
				BaseClass bc = WindType3or4UserDefined_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindType3or4UserDefined." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindType3or4UserDefined_class_attributes_enum attrEnum : WindType3or4UserDefined_class_attributes_enum.values()) {
				BaseClass bc = WindType3or4UserDefined_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindType3or4UserDefined." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(WindType3or4UserDefined) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "WindType3or4UserDefined";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
