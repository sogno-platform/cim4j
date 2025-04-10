/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A conducting equipment used to represent a connection to ground which is typically used to compensate earth faults..   An earth fault compensator device modeled with a single terminal implies a second terminal solidly connected to ground.  If two terminals are modeled, the ground is not assumed and normal connection rules apply.
 */
public class EarthFaultCompensator extends ConductingEquipment {

	private static final Logging LOG = Logging.getLogger(EarthFaultCompensator.class);

	private BaseClass[] EarthFaultCompensator_class_attributes;
	private BaseClass[] EarthFaultCompensator_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new EarthFaultCompensator().getAttributeNamesMap();
	}

	private enum EarthFaultCompensator_primitive_builder implements PrimitiveBuilder {
		r() {
			public BaseClass construct(java.lang.String value) {
				return new Resistance(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum EarthFaultCompensator_class_attributes_enum {
		r,
		LAST_ENUM
	}

	public EarthFaultCompensator() {
		EarthFaultCompensator_primitive_attributes = new BaseClass[EarthFaultCompensator_primitive_builder.values().length];
		EarthFaultCompensator_class_attributes = new BaseClass[EarthFaultCompensator_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new EarthFaultCompensator();
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

	private void updateAttributeInArray(EarthFaultCompensator_class_attributes_enum attrEnum, BaseClass value) {
		try {
			EarthFaultCompensator_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(EarthFaultCompensator_primitive_builder attrEnum, BaseClass value) {
		try {
			EarthFaultCompensator_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			EarthFaultCompensator_class_attributes_enum attrEnum = EarthFaultCompensator_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated EarthFaultCompensator, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			EarthFaultCompensator_primitive_builder attrEnum = EarthFaultCompensator_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated EarthFaultCompensator, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			EarthFaultCompensator_primitive_builder attrEnum = EarthFaultCompensator_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = EarthFaultCompensator_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			EarthFaultCompensator_class_attributes_enum attrEnum = EarthFaultCompensator_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = EarthFaultCompensator_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : EarthFaultCompensator_primitive_builder.values()) {
			if (enumValue != EarthFaultCompensator_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "EarthFaultCompensator." + enumValue.name());
			}
		}
		for (var enumValue : EarthFaultCompensator_class_attributes_enum.values()) {
			if (enumValue != EarthFaultCompensator_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "EarthFaultCompensator." + enumValue.name());
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
			for (EarthFaultCompensator_primitive_builder attrEnum : EarthFaultCompensator_primitive_builder.values()) {
				BaseClass bc = EarthFaultCompensator_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    EarthFaultCompensator." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (EarthFaultCompensator_class_attributes_enum attrEnum : EarthFaultCompensator_class_attributes_enum.values()) {
				BaseClass bc = EarthFaultCompensator_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    EarthFaultCompensator." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(EarthFaultCompensator) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "EarthFaultCompensator";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
