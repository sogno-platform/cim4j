/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Voltage adjuster function block whose behaviour is described by reference to a standard model
 */
public class VoltageAdjusterDynamics extends DynamicsFunctionBlock {

	private static final Logging LOG = Logging.getLogger(VoltageAdjusterDynamics.class);

	private BaseClass[] VoltageAdjusterDynamics_class_attributes;
	private BaseClass[] VoltageAdjusterDynamics_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new VoltageAdjusterDynamics().getAttributeNamesMap();
	}

	private enum VoltageAdjusterDynamics_primitive_builder implements PrimitiveBuilder {
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum VoltageAdjusterDynamics_class_attributes_enum {
		PFVArControllerType1Dynamics,
		LAST_ENUM
	}

	public VoltageAdjusterDynamics() {
		VoltageAdjusterDynamics_primitive_attributes = new BaseClass[VoltageAdjusterDynamics_primitive_builder.values().length];
		VoltageAdjusterDynamics_class_attributes = new BaseClass[VoltageAdjusterDynamics_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new VoltageAdjusterDynamics();
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

	private void updateAttributeInArray(VoltageAdjusterDynamics_class_attributes_enum attrEnum, BaseClass value) {
		try {
			VoltageAdjusterDynamics_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(VoltageAdjusterDynamics_primitive_builder attrEnum, BaseClass value) {
		try {
			VoltageAdjusterDynamics_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			VoltageAdjusterDynamics_class_attributes_enum attrEnum = VoltageAdjusterDynamics_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated VoltageAdjusterDynamics, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			VoltageAdjusterDynamics_primitive_builder attrEnum = VoltageAdjusterDynamics_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated VoltageAdjusterDynamics, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			VoltageAdjusterDynamics_primitive_builder attrEnum = VoltageAdjusterDynamics_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = VoltageAdjusterDynamics_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			VoltageAdjusterDynamics_class_attributes_enum attrEnum = VoltageAdjusterDynamics_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = VoltageAdjusterDynamics_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : VoltageAdjusterDynamics_primitive_builder.values()) {
			if (enumValue != VoltageAdjusterDynamics_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "VoltageAdjusterDynamics." + enumValue.name());
			}
		}
		for (var enumValue : VoltageAdjusterDynamics_class_attributes_enum.values()) {
			if (enumValue != VoltageAdjusterDynamics_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "VoltageAdjusterDynamics." + enumValue.name());
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
			for (VoltageAdjusterDynamics_primitive_builder attrEnum : VoltageAdjusterDynamics_primitive_builder.values()) {
				BaseClass bc = VoltageAdjusterDynamics_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    VoltageAdjusterDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (VoltageAdjusterDynamics_class_attributes_enum attrEnum : VoltageAdjusterDynamics_class_attributes_enum.values()) {
				BaseClass bc = VoltageAdjusterDynamics_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    VoltageAdjusterDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(VoltageAdjusterDynamics) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "VoltageAdjusterDynamics";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
