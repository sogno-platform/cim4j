/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A flow specification in terms of location and direction for a control area.
 */
public class TieFlow extends BaseClass {

	private static final Logging LOG = Logging.getLogger(TieFlow.class);

	private BaseClass[] TieFlow_class_attributes;
	private BaseClass[] TieFlow_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new TieFlow().getAttributeNamesMap();
	}

	private enum TieFlow_primitive_builder implements PrimitiveBuilder {
		positiveFlowIn() {
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

	private enum TieFlow_class_attributes_enum {
		ControlArea,
		Terminal,
		positiveFlowIn,
		LAST_ENUM
	}

	public TieFlow() {
		TieFlow_primitive_attributes = new BaseClass[TieFlow_primitive_builder.values().length];
		TieFlow_class_attributes = new BaseClass[TieFlow_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new TieFlow();
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

	private void updateAttributeInArray(TieFlow_class_attributes_enum attrEnum, BaseClass value) {
		try {
			TieFlow_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(TieFlow_primitive_builder attrEnum, BaseClass value) {
		try {
			TieFlow_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			TieFlow_class_attributes_enum attrEnum = TieFlow_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated TieFlow, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			TieFlow_primitive_builder attrEnum = TieFlow_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated TieFlow, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			TieFlow_primitive_builder attrEnum = TieFlow_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = TieFlow_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			TieFlow_class_attributes_enum attrEnum = TieFlow_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = TieFlow_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : TieFlow_primitive_builder.values()) {
			if (enumValue != TieFlow_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "TieFlow." + enumValue.name());
			}
		}
		for (var enumValue : TieFlow_class_attributes_enum.values()) {
			if (enumValue != TieFlow_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "TieFlow." + enumValue.name());
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
			for (TieFlow_primitive_builder attrEnum : TieFlow_primitive_builder.values()) {
				BaseClass bc = TieFlow_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TieFlow." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (TieFlow_class_attributes_enum attrEnum : TieFlow_class_attributes_enum.values()) {
				BaseClass bc = TieFlow_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TieFlow." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(TieFlow) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "TieFlow";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
