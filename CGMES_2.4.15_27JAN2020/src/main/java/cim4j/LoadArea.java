/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class is the root or first level in a hierarchical structure for grouping of loads for the purpose of load flow load scaling.
 */
public class LoadArea extends EnergyArea {

	private static final Logging LOG = Logging.getLogger(LoadArea.class);

	private BaseClass[] LoadArea_class_attributes;
	private BaseClass[] LoadArea_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new LoadArea().getAttributeNamesMap();
	}

	private enum LoadArea_primitive_builder implements PrimitiveBuilder {
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum LoadArea_class_attributes_enum {
		SubLoadAreas,
		LAST_ENUM
	}

	public LoadArea() {
		LoadArea_primitive_attributes = new BaseClass[LoadArea_primitive_builder.values().length];
		LoadArea_class_attributes = new BaseClass[LoadArea_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new LoadArea();
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

	private void updateAttributeInArray(LoadArea_class_attributes_enum attrEnum, BaseClass value) {
		try {
			LoadArea_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(LoadArea_primitive_builder attrEnum, BaseClass value) {
		try {
			LoadArea_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			LoadArea_class_attributes_enum attrEnum = LoadArea_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated LoadArea, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			LoadArea_primitive_builder attrEnum = LoadArea_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated LoadArea, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			LoadArea_primitive_builder attrEnum = LoadArea_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = LoadArea_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			LoadArea_class_attributes_enum attrEnum = LoadArea_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = LoadArea_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : LoadArea_primitive_builder.values()) {
			if (enumValue != LoadArea_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "LoadArea." + enumValue.name());
			}
		}
		for (var enumValue : LoadArea_class_attributes_enum.values()) {
			if (enumValue != LoadArea_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "LoadArea." + enumValue.name());
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
			for (LoadArea_primitive_builder attrEnum : LoadArea_primitive_builder.values()) {
				BaseClass bc = LoadArea_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LoadArea." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (LoadArea_class_attributes_enum attrEnum : LoadArea_class_attributes_enum.values()) {
				BaseClass bc = LoadArea_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LoadArea." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(LoadArea) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "LoadArea";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
