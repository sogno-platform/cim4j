/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A collection of equipment for purposes other than generation or utilization, through which electric energy in bulk is passed for the purposes of switching or modifying its characteristics.
 */
public class Substation extends EquipmentContainer {

	private static final Logging LOG = Logging.getLogger(Substation.class);

	private BaseClass[] Substation_class_attributes;
	private BaseClass[] Substation_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new Substation().getAttributeNamesMap();
	}

	private enum Substation_primitive_builder implements PrimitiveBuilder {
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum Substation_class_attributes_enum {
		DCConverterUnit,
		Region,
		VoltageLevels,
		LAST_ENUM
	}

	public Substation() {
		Substation_primitive_attributes = new BaseClass[Substation_primitive_builder.values().length];
		Substation_class_attributes = new BaseClass[Substation_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new Substation();
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

	private void updateAttributeInArray(Substation_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Substation_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(Substation_primitive_builder attrEnum, BaseClass value) {
		try {
			Substation_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Substation_class_attributes_enum attrEnum = Substation_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated Substation, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Substation_primitive_builder attrEnum = Substation_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated Substation, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			Substation_primitive_builder attrEnum = Substation_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = Substation_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			Substation_class_attributes_enum attrEnum = Substation_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = Substation_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : Substation_primitive_builder.values()) {
			if (enumValue != Substation_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "Substation." + enumValue.name());
			}
		}
		for (var enumValue : Substation_class_attributes_enum.values()) {
			if (enumValue != Substation_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "Substation." + enumValue.name());
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
			for (Substation_primitive_builder attrEnum : Substation_primitive_builder.values()) {
				BaseClass bc = Substation_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Substation." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Substation_class_attributes_enum attrEnum : Substation_class_attributes_enum.values()) {
				BaseClass bc = Substation_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Substation." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(Substation) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "Substation";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
