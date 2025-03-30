/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * DC bus.
 */
public class DCTopologicalNode extends IdentifiedObject {

	private static final Logging LOG = Logging.getLogger(DCTopologicalNode.class);

	private BaseClass[] DCTopologicalNode_class_attributes;
	private BaseClass[] DCTopologicalNode_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new DCTopologicalNode().getAttributeNamesMap();
	}

	private enum DCTopologicalNode_primitive_builder implements PrimitiveBuilder {
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum DCTopologicalNode_class_attributes_enum {
		DCEquipmentContainer,
		DCNodes,
		DCTerminals,
		DCTopologicalIsland,
		LAST_ENUM
	}

	public DCTopologicalNode() {
		DCTopologicalNode_primitive_attributes = new BaseClass[DCTopologicalNode_primitive_builder.values().length];
		DCTopologicalNode_class_attributes = new BaseClass[DCTopologicalNode_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new DCTopologicalNode();
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

	private void updateAttributeInArray(DCTopologicalNode_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DCTopologicalNode_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(DCTopologicalNode_primitive_builder attrEnum, BaseClass value) {
		try {
			DCTopologicalNode_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DCTopologicalNode_class_attributes_enum attrEnum = DCTopologicalNode_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated DCTopologicalNode, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DCTopologicalNode_primitive_builder attrEnum = DCTopologicalNode_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated DCTopologicalNode, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			DCTopologicalNode_primitive_builder attrEnum = DCTopologicalNode_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = DCTopologicalNode_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			DCTopologicalNode_class_attributes_enum attrEnum = DCTopologicalNode_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = DCTopologicalNode_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : DCTopologicalNode_primitive_builder.values()) {
			if (enumValue != DCTopologicalNode_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "DCTopologicalNode." + enumValue.name());
			}
		}
		for (var enumValue : DCTopologicalNode_class_attributes_enum.values()) {
			if (enumValue != DCTopologicalNode_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "DCTopologicalNode." + enumValue.name());
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
			for (DCTopologicalNode_primitive_builder attrEnum : DCTopologicalNode_primitive_builder.values()) {
				BaseClass bc = DCTopologicalNode_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCTopologicalNode." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DCTopologicalNode_class_attributes_enum attrEnum : DCTopologicalNode_class_attributes_enum.values()) {
				BaseClass bc = DCTopologicalNode_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCTopologicalNode." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(DCTopologicalNode) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "DCTopologicalNode";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
