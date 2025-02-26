/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * IEC Type 3A generator set model.  Reference: IEC Standard 61400-27-1 Section 6.6.3.2.
 */
public class WindGenTurbineType3aIEC extends WindGenTurbineType3IEC {

	private static final Logging LOG = Logging.getLogger(WindGenTurbineType3aIEC.class);

	private BaseClass[] WindGenTurbineType3aIEC_class_attributes;
	private BaseClass[] WindGenTurbineType3aIEC_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new WindGenTurbineType3aIEC().getAttributeNamesMap();
	}

	private enum WindGenTurbineType3aIEC_primitive_builder implements PrimitiveBuilder {
		kpc() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		tic() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		xs() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum WindGenTurbineType3aIEC_class_attributes_enum {
		kpc,
		tic,
		xs,
		LAST_ENUM
	}

	public WindGenTurbineType3aIEC() {
		WindGenTurbineType3aIEC_primitive_attributes = new BaseClass[WindGenTurbineType3aIEC_primitive_builder.values().length];
		WindGenTurbineType3aIEC_class_attributes = new BaseClass[WindGenTurbineType3aIEC_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new WindGenTurbineType3aIEC();
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

	private void updateAttributeInArray(WindGenTurbineType3aIEC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindGenTurbineType3aIEC_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(WindGenTurbineType3aIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindGenTurbineType3aIEC_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindGenTurbineType3aIEC_class_attributes_enum attrEnum = WindGenTurbineType3aIEC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated WindGenTurbineType3aIEC, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindGenTurbineType3aIEC_primitive_builder attrEnum = WindGenTurbineType3aIEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated WindGenTurbineType3aIEC, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			WindGenTurbineType3aIEC_primitive_builder attrEnum = WindGenTurbineType3aIEC_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = WindGenTurbineType3aIEC_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			WindGenTurbineType3aIEC_class_attributes_enum attrEnum = WindGenTurbineType3aIEC_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = WindGenTurbineType3aIEC_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : WindGenTurbineType3aIEC_primitive_builder.values()) {
			if (enumValue != WindGenTurbineType3aIEC_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "WindGenTurbineType3aIEC." + enumValue.name());
			}
		}
		for (var enumValue : WindGenTurbineType3aIEC_class_attributes_enum.values()) {
			if (enumValue != WindGenTurbineType3aIEC_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "WindGenTurbineType3aIEC." + enumValue.name());
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
			for (WindGenTurbineType3aIEC_primitive_builder attrEnum : WindGenTurbineType3aIEC_primitive_builder.values()) {
				BaseClass bc = WindGenTurbineType3aIEC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindGenTurbineType3aIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindGenTurbineType3aIEC_class_attributes_enum attrEnum : WindGenTurbineType3aIEC_class_attributes_enum.values()) {
				BaseClass bc = WindGenTurbineType3aIEC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindGenTurbineType3aIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(WindGenTurbineType3aIEC) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "WindGenTurbineType3aIEC";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
