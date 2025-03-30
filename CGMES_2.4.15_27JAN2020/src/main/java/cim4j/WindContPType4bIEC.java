/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * P control model Type 4B.  Reference: IEC Standard 61400-27-1 Section 6.6.5.5.
 */
public class WindContPType4bIEC extends IdentifiedObject {

	private static final Logging LOG = Logging.getLogger(WindContPType4bIEC.class);

	private BaseClass[] WindContPType4bIEC_class_attributes;
	private BaseClass[] WindContPType4bIEC_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new WindContPType4bIEC().getAttributeNamesMap();
	}

	private enum WindContPType4bIEC_primitive_builder implements PrimitiveBuilder {
		dpmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		tpaero() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tpord() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tufilt() {
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

	private enum WindContPType4bIEC_class_attributes_enum {
		WindTurbineType4bIEC,
		dpmax,
		tpaero,
		tpord,
		tufilt,
		LAST_ENUM
	}

	public WindContPType4bIEC() {
		WindContPType4bIEC_primitive_attributes = new BaseClass[WindContPType4bIEC_primitive_builder.values().length];
		WindContPType4bIEC_class_attributes = new BaseClass[WindContPType4bIEC_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new WindContPType4bIEC();
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

	private void updateAttributeInArray(WindContPType4bIEC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindContPType4bIEC_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(WindContPType4bIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindContPType4bIEC_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindContPType4bIEC_class_attributes_enum attrEnum = WindContPType4bIEC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated WindContPType4bIEC, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindContPType4bIEC_primitive_builder attrEnum = WindContPType4bIEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated WindContPType4bIEC, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			WindContPType4bIEC_primitive_builder attrEnum = WindContPType4bIEC_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = WindContPType4bIEC_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			WindContPType4bIEC_class_attributes_enum attrEnum = WindContPType4bIEC_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = WindContPType4bIEC_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : WindContPType4bIEC_primitive_builder.values()) {
			if (enumValue != WindContPType4bIEC_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "WindContPType4bIEC." + enumValue.name());
			}
		}
		for (var enumValue : WindContPType4bIEC_class_attributes_enum.values()) {
			if (enumValue != WindContPType4bIEC_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "WindContPType4bIEC." + enumValue.name());
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
			for (WindContPType4bIEC_primitive_builder attrEnum : WindContPType4bIEC_primitive_builder.values()) {
				BaseClass bc = WindContPType4bIEC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindContPType4bIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindContPType4bIEC_class_attributes_enum attrEnum : WindContPType4bIEC_class_attributes_enum.values()) {
				BaseClass bc = WindContPType4bIEC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindContPType4bIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(WindContPType4bIEC) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "WindContPType4bIEC";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
