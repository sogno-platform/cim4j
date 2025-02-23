/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class models a look up table for the purpose of wind standard models.
 */
public class WindDynamicsLookupTable extends IdentifiedObject {

	private static final Logging LOG = Logging.getLogger(WindDynamicsLookupTable.class);

	private BaseClass[] WindDynamicsLookupTable_class_attributes;
	private BaseClass[] WindDynamicsLookupTable_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new WindDynamicsLookupTable().getAttributeNamesMap();
	}

	private enum WindDynamicsLookupTable_primitive_builder implements PrimitiveBuilder {
		input() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		lookupTableFunctionType() {
			public BaseClass construct(java.lang.String value) {
				return new WindLookupTableFunctionKind(value);
			}
		},
		output() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		sequence() {
			public BaseClass construct(java.lang.String value) {
				return new Integer(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum WindDynamicsLookupTable_class_attributes_enum {
		WindContCurrLimIEC,
		WindContPType3IEC,
		WindContRotorRIEC,
		WindPlantFreqPcontrolIEC,
		input,
		lookupTableFunctionType,
		output,
		sequence,
		LAST_ENUM
	}

	public WindDynamicsLookupTable() {
		WindDynamicsLookupTable_primitive_attributes = new BaseClass[WindDynamicsLookupTable_primitive_builder.values().length];
		WindDynamicsLookupTable_class_attributes = new BaseClass[WindDynamicsLookupTable_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new WindDynamicsLookupTable();
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

	private void updateAttributeInArray(WindDynamicsLookupTable_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindDynamicsLookupTable_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(WindDynamicsLookupTable_primitive_builder attrEnum, BaseClass value) {
		try {
			WindDynamicsLookupTable_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindDynamicsLookupTable_class_attributes_enum attrEnum = WindDynamicsLookupTable_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated WindDynamicsLookupTable, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindDynamicsLookupTable_primitive_builder attrEnum = WindDynamicsLookupTable_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated WindDynamicsLookupTable, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			WindDynamicsLookupTable_primitive_builder attrEnum = WindDynamicsLookupTable_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = WindDynamicsLookupTable_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			WindDynamicsLookupTable_class_attributes_enum attrEnum = WindDynamicsLookupTable_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = WindDynamicsLookupTable_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : WindDynamicsLookupTable_primitive_builder.values()) {
			if (enumValue != WindDynamicsLookupTable_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "WindDynamicsLookupTable." + enumValue.name());
			}
		}
		for (var enumValue : WindDynamicsLookupTable_class_attributes_enum.values()) {
			if (enumValue != WindDynamicsLookupTable_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "WindDynamicsLookupTable." + enumValue.name());
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
			for (WindDynamicsLookupTable_primitive_builder attrEnum : WindDynamicsLookupTable_primitive_builder.values()) {
				BaseClass bc = WindDynamicsLookupTable_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindDynamicsLookupTable." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindDynamicsLookupTable_class_attributes_enum attrEnum : WindDynamicsLookupTable_class_attributes_enum.values()) {
				BaseClass bc = WindDynamicsLookupTable_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindDynamicsLookupTable." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(WindDynamicsLookupTable) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "WindDynamicsLookupTable";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
