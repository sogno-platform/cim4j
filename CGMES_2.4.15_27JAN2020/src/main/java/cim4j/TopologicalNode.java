/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * For a detailed substation model a topological node is a set of connectivity nodes that, in the current network state, are connected together through any type of closed switches, including  jumpers. Topological nodes change as the current network state changes (i.e., switches, breakers, etc. change state). For a planning model, switch statuses are not used to form topological nodes. Instead they are manually created or deleted in a model builder tool. Topological nodes maintained this way are also called "busses".
 */
public class TopologicalNode extends IdentifiedObject {

	private static final Logging LOG = Logging.getLogger(TopologicalNode.class);

	private BaseClass[] TopologicalNode_class_attributes;
	private BaseClass[] TopologicalNode_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new TopologicalNode().getAttributeNamesMap();
	}

	private enum TopologicalNode_primitive_builder implements PrimitiveBuilder {
		boundaryPoint() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		fromEndIsoCode() {
			public BaseClass construct(java.lang.String value) {
				return new String(value);
			}
		},
		fromEndName() {
			public BaseClass construct(java.lang.String value) {
				return new String(value);
			}
		},
		fromEndNameTso() {
			public BaseClass construct(java.lang.String value) {
				return new String(value);
			}
		},
		toEndIsoCode() {
			public BaseClass construct(java.lang.String value) {
				return new String(value);
			}
		},
		toEndName() {
			public BaseClass construct(java.lang.String value) {
				return new String(value);
			}
		},
		toEndNameTso() {
			public BaseClass construct(java.lang.String value) {
				return new String(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum TopologicalNode_class_attributes_enum {
		AngleRefTopologicalIsland,
		BaseVoltage,
		ConnectivityNodeContainer,
		ConnectivityNodes,
		ReportingGroup,
		SvInjection,
		SvVoltage,
		Terminal,
		TopologicalIsland,
		boundaryPoint,
		fromEndIsoCode,
		fromEndName,
		fromEndNameTso,
		toEndIsoCode,
		toEndName,
		toEndNameTso,
		LAST_ENUM
	}

	public TopologicalNode() {
		TopologicalNode_primitive_attributes = new BaseClass[TopologicalNode_primitive_builder.values().length];
		TopologicalNode_class_attributes = new BaseClass[TopologicalNode_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new TopologicalNode();
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

	private void updateAttributeInArray(TopologicalNode_class_attributes_enum attrEnum, BaseClass value) {
		try {
			TopologicalNode_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(TopologicalNode_primitive_builder attrEnum, BaseClass value) {
		try {
			TopologicalNode_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			TopologicalNode_class_attributes_enum attrEnum = TopologicalNode_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated TopologicalNode, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			TopologicalNode_primitive_builder attrEnum = TopologicalNode_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated TopologicalNode, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			TopologicalNode_primitive_builder attrEnum = TopologicalNode_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = TopologicalNode_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			TopologicalNode_class_attributes_enum attrEnum = TopologicalNode_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = TopologicalNode_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : TopologicalNode_primitive_builder.values()) {
			if (enumValue != TopologicalNode_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "TopologicalNode." + enumValue.name());
			}
		}
		for (var enumValue : TopologicalNode_class_attributes_enum.values()) {
			if (enumValue != TopologicalNode_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "TopologicalNode." + enumValue.name());
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
			for (TopologicalNode_primitive_builder attrEnum : TopologicalNode_primitive_builder.values()) {
				BaseClass bc = TopologicalNode_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TopologicalNode." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (TopologicalNode_class_attributes_enum attrEnum : TopologicalNode_class_attributes_enum.values()) {
				BaseClass bc = TopologicalNode_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TopologicalNode." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(TopologicalNode) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "TopologicalNode";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
