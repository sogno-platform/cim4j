/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Connectivity nodes are points where terminals of AC conducting equipment are connected together with zero impedance.
 */
public class ConnectivityNode extends IdentifiedObject {

	private static final Logging LOG = Logging.getLogger(ConnectivityNode.class);

	private BaseClass[] ConnectivityNode_class_attributes;
	private BaseClass[] ConnectivityNode_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ConnectivityNode().getAttributeNamesMap();
	}

	private enum ConnectivityNode_primitive_builder implements PrimitiveBuilder {
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

	private enum ConnectivityNode_class_attributes_enum {
		ConnectivityNodeContainer,
		Terminals,
		TopologicalNode,
		boundaryPoint,
		fromEndIsoCode,
		fromEndName,
		fromEndNameTso,
		toEndIsoCode,
		toEndName,
		toEndNameTso,
		LAST_ENUM
	}

	public ConnectivityNode() {
		ConnectivityNode_primitive_attributes = new BaseClass[ConnectivityNode_primitive_builder.values().length];
		ConnectivityNode_class_attributes = new BaseClass[ConnectivityNode_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ConnectivityNode();
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

	private void updateAttributeInArray(ConnectivityNode_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ConnectivityNode_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ConnectivityNode_primitive_builder attrEnum, BaseClass value) {
		try {
			ConnectivityNode_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ConnectivityNode_class_attributes_enum attrEnum = ConnectivityNode_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ConnectivityNode, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ConnectivityNode_primitive_builder attrEnum = ConnectivityNode_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ConnectivityNode, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ConnectivityNode_primitive_builder attrEnum = ConnectivityNode_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ConnectivityNode_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ConnectivityNode_class_attributes_enum attrEnum = ConnectivityNode_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ConnectivityNode_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ConnectivityNode_primitive_builder.values()) {
			if (enumValue != ConnectivityNode_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ConnectivityNode." + enumValue.name());
			}
		}
		for (var enumValue : ConnectivityNode_class_attributes_enum.values()) {
			if (enumValue != ConnectivityNode_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ConnectivityNode." + enumValue.name());
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
			for (ConnectivityNode_primitive_builder attrEnum : ConnectivityNode_primitive_builder.values()) {
				BaseClass bc = ConnectivityNode_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ConnectivityNode." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ConnectivityNode_class_attributes_enum attrEnum : ConnectivityNode_class_attributes_enum.values()) {
				BaseClass bc = ConnectivityNode_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ConnectivityNode." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ConnectivityNode) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ConnectivityNode";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
