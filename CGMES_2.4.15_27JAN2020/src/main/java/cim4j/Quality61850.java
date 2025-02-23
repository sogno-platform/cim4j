/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Quality flags in this class are as defined in IEC 61850, except for estimatorReplaced, which has been included in this class for convenience.
 */
public class Quality61850 extends BaseClass {

	private static final Logging LOG = Logging.getLogger(Quality61850.class);

	private BaseClass[] Quality61850_class_attributes;
	private BaseClass[] Quality61850_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new Quality61850().getAttributeNamesMap();
	}

	private enum Quality61850_primitive_builder implements PrimitiveBuilder {
		badReference() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		estimatorReplaced() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		failure() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		oldData() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		operatorBlocked() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		oscillatory() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		outOfRange() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		overFlow() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		source() {
			public BaseClass construct(java.lang.String value) {
				return new Source(value);
			}
		},
		suspect() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		test() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		validity() {
			public BaseClass construct(java.lang.String value) {
				return new Validity(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum Quality61850_class_attributes_enum {
		badReference,
		estimatorReplaced,
		failure,
		oldData,
		operatorBlocked,
		oscillatory,
		outOfRange,
		overFlow,
		source,
		suspect,
		test,
		validity,
		LAST_ENUM
	}

	public Quality61850() {
		Quality61850_primitive_attributes = new BaseClass[Quality61850_primitive_builder.values().length];
		Quality61850_class_attributes = new BaseClass[Quality61850_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new Quality61850();
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

	private void updateAttributeInArray(Quality61850_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Quality61850_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(Quality61850_primitive_builder attrEnum, BaseClass value) {
		try {
			Quality61850_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Quality61850_class_attributes_enum attrEnum = Quality61850_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated Quality61850, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Quality61850_primitive_builder attrEnum = Quality61850_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated Quality61850, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			Quality61850_primitive_builder attrEnum = Quality61850_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = Quality61850_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			Quality61850_class_attributes_enum attrEnum = Quality61850_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = Quality61850_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : Quality61850_primitive_builder.values()) {
			if (enumValue != Quality61850_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "Quality61850." + enumValue.name());
			}
		}
		for (var enumValue : Quality61850_class_attributes_enum.values()) {
			if (enumValue != Quality61850_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "Quality61850." + enumValue.name());
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
			for (Quality61850_primitive_builder attrEnum : Quality61850_primitive_builder.values()) {
				BaseClass bc = Quality61850_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Quality61850." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Quality61850_class_attributes_enum attrEnum : Quality61850_class_attributes_enum.values()) {
				BaseClass bc = Quality61850_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Quality61850." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(Quality61850) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "Quality61850";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
