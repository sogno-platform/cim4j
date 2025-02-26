/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * An electrical connection point (AC or DC) to a piece of conducting equipment. Terminals are connected at physical connection points called connectivity nodes.
 */
public class ACDCTerminal extends IdentifiedObject {

	private static final Logging LOG = Logging.getLogger(ACDCTerminal.class);

	private BaseClass[] ACDCTerminal_class_attributes;
	private BaseClass[] ACDCTerminal_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ACDCTerminal().getAttributeNamesMap();
	}

	private enum ACDCTerminal_primitive_builder implements PrimitiveBuilder {
		connected() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		sequenceNumber() {
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

	private enum ACDCTerminal_class_attributes_enum {
		BusNameMarker,
		Measurements,
		OperationalLimitSet,
		connected,
		sequenceNumber,
		LAST_ENUM
	}

	public ACDCTerminal() {
		ACDCTerminal_primitive_attributes = new BaseClass[ACDCTerminal_primitive_builder.values().length];
		ACDCTerminal_class_attributes = new BaseClass[ACDCTerminal_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ACDCTerminal();
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

	private void updateAttributeInArray(ACDCTerminal_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ACDCTerminal_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ACDCTerminal_primitive_builder attrEnum, BaseClass value) {
		try {
			ACDCTerminal_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ACDCTerminal_class_attributes_enum attrEnum = ACDCTerminal_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ACDCTerminal, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ACDCTerminal_primitive_builder attrEnum = ACDCTerminal_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ACDCTerminal, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ACDCTerminal_primitive_builder attrEnum = ACDCTerminal_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ACDCTerminal_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ACDCTerminal_class_attributes_enum attrEnum = ACDCTerminal_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ACDCTerminal_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ACDCTerminal_primitive_builder.values()) {
			if (enumValue != ACDCTerminal_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ACDCTerminal." + enumValue.name());
			}
		}
		for (var enumValue : ACDCTerminal_class_attributes_enum.values()) {
			if (enumValue != ACDCTerminal_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ACDCTerminal." + enumValue.name());
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
			for (ACDCTerminal_primitive_builder attrEnum : ACDCTerminal_primitive_builder.values()) {
				BaseClass bc = ACDCTerminal_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ACDCTerminal." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ACDCTerminal_class_attributes_enum attrEnum : ACDCTerminal_class_attributes_enum.values()) {
				BaseClass bc = ACDCTerminal_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ACDCTerminal." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ACDCTerminal) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ACDCTerminal";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
