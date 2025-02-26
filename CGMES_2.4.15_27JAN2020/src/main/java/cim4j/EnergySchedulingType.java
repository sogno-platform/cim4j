/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Used to define the type of generation for scheduling purposes.
 */
public class EnergySchedulingType extends IdentifiedObject {

	private static final Logging LOG = Logging.getLogger(EnergySchedulingType.class);

	private BaseClass[] EnergySchedulingType_class_attributes;
	private BaseClass[] EnergySchedulingType_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new EnergySchedulingType().getAttributeNamesMap();
	}

	private enum EnergySchedulingType_primitive_builder implements PrimitiveBuilder {
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum EnergySchedulingType_class_attributes_enum {
		EnergySource,
		LAST_ENUM
	}

	public EnergySchedulingType() {
		EnergySchedulingType_primitive_attributes = new BaseClass[EnergySchedulingType_primitive_builder.values().length];
		EnergySchedulingType_class_attributes = new BaseClass[EnergySchedulingType_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new EnergySchedulingType();
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

	private void updateAttributeInArray(EnergySchedulingType_class_attributes_enum attrEnum, BaseClass value) {
		try {
			EnergySchedulingType_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(EnergySchedulingType_primitive_builder attrEnum, BaseClass value) {
		try {
			EnergySchedulingType_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			EnergySchedulingType_class_attributes_enum attrEnum = EnergySchedulingType_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated EnergySchedulingType, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			EnergySchedulingType_primitive_builder attrEnum = EnergySchedulingType_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated EnergySchedulingType, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			EnergySchedulingType_primitive_builder attrEnum = EnergySchedulingType_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = EnergySchedulingType_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			EnergySchedulingType_class_attributes_enum attrEnum = EnergySchedulingType_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = EnergySchedulingType_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : EnergySchedulingType_primitive_builder.values()) {
			if (enumValue != EnergySchedulingType_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "EnergySchedulingType." + enumValue.name());
			}
		}
		for (var enumValue : EnergySchedulingType_class_attributes_enum.values()) {
			if (enumValue != EnergySchedulingType_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "EnergySchedulingType." + enumValue.name());
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
			for (EnergySchedulingType_primitive_builder attrEnum : EnergySchedulingType_primitive_builder.values()) {
				BaseClass bc = EnergySchedulingType_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    EnergySchedulingType." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (EnergySchedulingType_class_attributes_enum attrEnum : EnergySchedulingType_class_attributes_enum.values()) {
				BaseClass bc = EnergySchedulingType_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    EnergySchedulingType." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(EnergySchedulingType) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "EnergySchedulingType";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
