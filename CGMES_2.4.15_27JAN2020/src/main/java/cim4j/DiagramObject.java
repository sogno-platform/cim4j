/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * An object that defines one or more points in a given space. This object can be associated with anything that specializes IdentifiedObject. For single line diagrams such objects typically include such items as analog values, breakers, disconnectors, power transformers, and transmission lines.
 */
public class DiagramObject extends IdentifiedObject {

	private static final Logging LOG = Logging.getLogger(DiagramObject.class);

	private BaseClass[] DiagramObject_class_attributes;
	private BaseClass[] DiagramObject_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new DiagramObject().getAttributeNamesMap();
	}

	private enum DiagramObject_primitive_builder implements PrimitiveBuilder {
		drawingOrder() {
			public BaseClass construct(java.lang.String value) {
				return new Integer(value);
			}
		},
		isPolygon() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		offsetX() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		offsetY() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		rotation() {
			public BaseClass construct(java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum DiagramObject_class_attributes_enum {
		Diagram,
		DiagramObjectPoints,
		DiagramObjectStyle,
		IdentifiedObject,
		VisibilityLayers,
		drawingOrder,
		isPolygon,
		offsetX,
		offsetY,
		rotation,
		LAST_ENUM
	}

	public DiagramObject() {
		DiagramObject_primitive_attributes = new BaseClass[DiagramObject_primitive_builder.values().length];
		DiagramObject_class_attributes = new BaseClass[DiagramObject_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new DiagramObject();
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

	private void updateAttributeInArray(DiagramObject_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DiagramObject_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(DiagramObject_primitive_builder attrEnum, BaseClass value) {
		try {
			DiagramObject_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DiagramObject_class_attributes_enum attrEnum = DiagramObject_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated DiagramObject, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DiagramObject_primitive_builder attrEnum = DiagramObject_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated DiagramObject, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			DiagramObject_primitive_builder attrEnum = DiagramObject_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = DiagramObject_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			DiagramObject_class_attributes_enum attrEnum = DiagramObject_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = DiagramObject_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : DiagramObject_primitive_builder.values()) {
			if (enumValue != DiagramObject_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "DiagramObject." + enumValue.name());
			}
		}
		for (var enumValue : DiagramObject_class_attributes_enum.values()) {
			if (enumValue != DiagramObject_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "DiagramObject." + enumValue.name());
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
			for (DiagramObject_primitive_builder attrEnum : DiagramObject_primitive_builder.values()) {
				BaseClass bc = DiagramObject_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DiagramObject." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DiagramObject_class_attributes_enum attrEnum : DiagramObject_class_attributes_enum.values()) {
				BaseClass bc = DiagramObject_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DiagramObject." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(DiagramObject) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "DiagramObject";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
