/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Mechanical load function block whose behavior is described by reference to a standard model
 */
public class MechanicalLoadDynamics extends DynamicsFunctionBlock {

	private static final Logging LOG = Logging.getLogger(MechanicalLoadDynamics.class);

	private BaseClass[] MechanicalLoadDynamics_class_attributes;
	private BaseClass[] MechanicalLoadDynamics_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new MechanicalLoadDynamics().getAttributeNamesMap();
	}

	private enum MechanicalLoadDynamics_primitive_builder implements PrimitiveBuilder {
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum MechanicalLoadDynamics_class_attributes_enum {
		AsynchronousMachineDynamics,
		SynchronousMachineDynamics,
		LAST_ENUM
	}

	public MechanicalLoadDynamics() {
		MechanicalLoadDynamics_primitive_attributes = new BaseClass[MechanicalLoadDynamics_primitive_builder.values().length];
		MechanicalLoadDynamics_class_attributes = new BaseClass[MechanicalLoadDynamics_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new MechanicalLoadDynamics();
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

	private void updateAttributeInArray(MechanicalLoadDynamics_class_attributes_enum attrEnum, BaseClass value) {
		try {
			MechanicalLoadDynamics_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(MechanicalLoadDynamics_primitive_builder attrEnum, BaseClass value) {
		try {
			MechanicalLoadDynamics_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			MechanicalLoadDynamics_class_attributes_enum attrEnum = MechanicalLoadDynamics_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated MechanicalLoadDynamics, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			MechanicalLoadDynamics_primitive_builder attrEnum = MechanicalLoadDynamics_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated MechanicalLoadDynamics, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			MechanicalLoadDynamics_primitive_builder attrEnum = MechanicalLoadDynamics_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = MechanicalLoadDynamics_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			MechanicalLoadDynamics_class_attributes_enum attrEnum = MechanicalLoadDynamics_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = MechanicalLoadDynamics_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : MechanicalLoadDynamics_primitive_builder.values()) {
			if (enumValue != MechanicalLoadDynamics_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "MechanicalLoadDynamics." + enumValue.name());
			}
		}
		for (var enumValue : MechanicalLoadDynamics_class_attributes_enum.values()) {
			if (enumValue != MechanicalLoadDynamics_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "MechanicalLoadDynamics." + enumValue.name());
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
			for (MechanicalLoadDynamics_primitive_builder attrEnum : MechanicalLoadDynamics_primitive_builder.values()) {
				BaseClass bc = MechanicalLoadDynamics_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    MechanicalLoadDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (MechanicalLoadDynamics_class_attributes_enum attrEnum : MechanicalLoadDynamics_class_attributes_enum.values()) {
				BaseClass bc = MechanicalLoadDynamics_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    MechanicalLoadDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(MechanicalLoadDynamics) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "MechanicalLoadDynamics";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
