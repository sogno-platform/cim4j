/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A transformer phase shifting tap model that controls the phase angle difference across the power transformer and potentially the active power flow through the power transformer.  This phase tap model may also impact the voltage magnitude.
 */
public class PhaseTapChanger extends TapChanger {

	private static final Logging LOG = Logging.getLogger(PhaseTapChanger.class);

	private BaseClass[] PhaseTapChanger_class_attributes;
	private BaseClass[] PhaseTapChanger_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new PhaseTapChanger().getAttributeNamesMap();
	}

	private enum PhaseTapChanger_primitive_builder implements PrimitiveBuilder {
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum PhaseTapChanger_class_attributes_enum {
		TransformerEnd,
		LAST_ENUM
	}

	public PhaseTapChanger() {
		PhaseTapChanger_primitive_attributes = new BaseClass[PhaseTapChanger_primitive_builder.values().length];
		PhaseTapChanger_class_attributes = new BaseClass[PhaseTapChanger_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new PhaseTapChanger();
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

	private void updateAttributeInArray(PhaseTapChanger_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PhaseTapChanger_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(PhaseTapChanger_primitive_builder attrEnum, BaseClass value) {
		try {
			PhaseTapChanger_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PhaseTapChanger_class_attributes_enum attrEnum = PhaseTapChanger_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated PhaseTapChanger, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PhaseTapChanger_primitive_builder attrEnum = PhaseTapChanger_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated PhaseTapChanger, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			PhaseTapChanger_primitive_builder attrEnum = PhaseTapChanger_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = PhaseTapChanger_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			PhaseTapChanger_class_attributes_enum attrEnum = PhaseTapChanger_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = PhaseTapChanger_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : PhaseTapChanger_primitive_builder.values()) {
			if (enumValue != PhaseTapChanger_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "PhaseTapChanger." + enumValue.name());
			}
		}
		for (var enumValue : PhaseTapChanger_class_attributes_enum.values()) {
			if (enumValue != PhaseTapChanger_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "PhaseTapChanger." + enumValue.name());
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
			for (PhaseTapChanger_primitive_builder attrEnum : PhaseTapChanger_primitive_builder.values()) {
				BaseClass bc = PhaseTapChanger_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PhaseTapChanger." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PhaseTapChanger_class_attributes_enum attrEnum : PhaseTapChanger_class_attributes_enum.values()) {
				BaseClass bc = PhaseTapChanger_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PhaseTapChanger." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(PhaseTapChanger) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "PhaseTapChanger";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
