/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * DC nodes are points where terminals of DC conducting equipment are connected together with zero impedance.
 */
public class DCNode extends IdentifiedObject {

	private static final Logging LOG = Logging.getLogger(DCNode.class);

	private BaseClass[] DCNode_class_attributes;
	private BaseClass[] DCNode_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new DCNode().getAttributeNamesMap();
	}

	private enum DCNode_primitive_builder implements PrimitiveBuilder {
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum DCNode_class_attributes_enum {
		DCEquipmentContainer,
		DCTerminals,
		DCTopologicalNode,
		LAST_ENUM
	}

	public DCNode() {
		DCNode_primitive_attributes = new BaseClass[DCNode_primitive_builder.values().length];
		DCNode_class_attributes = new BaseClass[DCNode_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new DCNode();
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

	private void updateAttributeInArray(DCNode_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DCNode_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(DCNode_primitive_builder attrEnum, BaseClass value) {
		try {
			DCNode_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DCNode_class_attributes_enum attrEnum = DCNode_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated DCNode, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DCNode_primitive_builder attrEnum = DCNode_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated DCNode, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			DCNode_primitive_builder attrEnum = DCNode_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = DCNode_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			DCNode_class_attributes_enum attrEnum = DCNode_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = DCNode_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : DCNode_primitive_builder.values()) {
			if (enumValue != DCNode_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "DCNode." + enumValue.name());
			}
		}
		for (var enumValue : DCNode_class_attributes_enum.values()) {
			if (enumValue != DCNode_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "DCNode." + enumValue.name());
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
			for (DCNode_primitive_builder attrEnum : DCNode_primitive_builder.values()) {
				BaseClass bc = DCNode_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCNode." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DCNode_class_attributes_enum attrEnum : DCNode_class_attributes_enum.values()) {
				BaseClass bc = DCNode_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCNode." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(DCNode) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "DCNode";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
