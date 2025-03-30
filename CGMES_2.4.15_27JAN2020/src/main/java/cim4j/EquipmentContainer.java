/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A modeling construct to provide a root class for containing equipment.
 */
public class EquipmentContainer extends ConnectivityNodeContainer {

	private static final Logging LOG = Logging.getLogger(EquipmentContainer.class);

	private BaseClass[] EquipmentContainer_class_attributes;
	private BaseClass[] EquipmentContainer_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new EquipmentContainer().getAttributeNamesMap();
	}

	private enum EquipmentContainer_primitive_builder implements PrimitiveBuilder {
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum EquipmentContainer_class_attributes_enum {
		Equipments,
		LAST_ENUM
	}

	public EquipmentContainer() {
		EquipmentContainer_primitive_attributes = new BaseClass[EquipmentContainer_primitive_builder.values().length];
		EquipmentContainer_class_attributes = new BaseClass[EquipmentContainer_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new EquipmentContainer();
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

	private void updateAttributeInArray(EquipmentContainer_class_attributes_enum attrEnum, BaseClass value) {
		try {
			EquipmentContainer_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(EquipmentContainer_primitive_builder attrEnum, BaseClass value) {
		try {
			EquipmentContainer_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			EquipmentContainer_class_attributes_enum attrEnum = EquipmentContainer_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated EquipmentContainer, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			EquipmentContainer_primitive_builder attrEnum = EquipmentContainer_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated EquipmentContainer, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			EquipmentContainer_primitive_builder attrEnum = EquipmentContainer_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = EquipmentContainer_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			EquipmentContainer_class_attributes_enum attrEnum = EquipmentContainer_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = EquipmentContainer_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : EquipmentContainer_primitive_builder.values()) {
			if (enumValue != EquipmentContainer_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "EquipmentContainer." + enumValue.name());
			}
		}
		for (var enumValue : EquipmentContainer_class_attributes_enum.values()) {
			if (enumValue != EquipmentContainer_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "EquipmentContainer." + enumValue.name());
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
			for (EquipmentContainer_primitive_builder attrEnum : EquipmentContainer_primitive_builder.values()) {
				BaseClass bc = EquipmentContainer_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    EquipmentContainer." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (EquipmentContainer_class_attributes_enum attrEnum : EquipmentContainer_class_attributes_enum.values()) {
				BaseClass bc = EquipmentContainer_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    EquipmentContainer." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(EquipmentContainer) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "EquipmentContainer";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
