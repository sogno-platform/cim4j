/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A conducting connection point of a power transformer. It corresponds to a physical transformer winding terminal.  In earlier CIM versions, the TransformerWinding class served a similar purpose, but this class is more flexible because it associates to terminal but is not a specialization of ConductingEquipment.
 */
public class TransformerEnd extends IdentifiedObject {

	private static final Logging LOG = Logging.getLogger(TransformerEnd.class);

	private BaseClass[] TransformerEnd_class_attributes;
	private BaseClass[] TransformerEnd_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new TransformerEnd().getAttributeNamesMap();
	}

	private enum TransformerEnd_primitive_builder implements PrimitiveBuilder {
		endNumber() {
			public BaseClass construct(java.lang.String value) {
				return new Integer(value);
			}
		},
		grounded() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		rground() {
			public BaseClass construct(java.lang.String value) {
				return new Resistance(value);
			}
		},
		xground() {
			public BaseClass construct(java.lang.String value) {
				return new Reactance(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum TransformerEnd_class_attributes_enum {
		BaseVoltage,
		PhaseTapChanger,
		RatioTapChanger,
		Terminal,
		endNumber,
		grounded,
		rground,
		xground,
		LAST_ENUM
	}

	public TransformerEnd() {
		TransformerEnd_primitive_attributes = new BaseClass[TransformerEnd_primitive_builder.values().length];
		TransformerEnd_class_attributes = new BaseClass[TransformerEnd_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new TransformerEnd();
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

	private void updateAttributeInArray(TransformerEnd_class_attributes_enum attrEnum, BaseClass value) {
		try {
			TransformerEnd_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(TransformerEnd_primitive_builder attrEnum, BaseClass value) {
		try {
			TransformerEnd_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			TransformerEnd_class_attributes_enum attrEnum = TransformerEnd_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated TransformerEnd, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			TransformerEnd_primitive_builder attrEnum = TransformerEnd_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated TransformerEnd, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			TransformerEnd_primitive_builder attrEnum = TransformerEnd_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = TransformerEnd_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			TransformerEnd_class_attributes_enum attrEnum = TransformerEnd_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = TransformerEnd_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : TransformerEnd_primitive_builder.values()) {
			if (enumValue != TransformerEnd_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "TransformerEnd." + enumValue.name());
			}
		}
		for (var enumValue : TransformerEnd_class_attributes_enum.values()) {
			if (enumValue != TransformerEnd_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "TransformerEnd." + enumValue.name());
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
			for (TransformerEnd_primitive_builder attrEnum : TransformerEnd_primitive_builder.values()) {
				BaseClass bc = TransformerEnd_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TransformerEnd." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (TransformerEnd_class_attributes_enum attrEnum : TransformerEnd_class_attributes_enum.values()) {
				BaseClass bc = TransformerEnd_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TransformerEnd." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(TransformerEnd) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "TransformerEnd";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
