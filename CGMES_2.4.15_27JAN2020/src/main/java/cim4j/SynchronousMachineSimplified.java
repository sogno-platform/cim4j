/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The simplified model represents a synchronous generator as a constant internal voltage behind an impedance ( + ) as shown in the Simplified diagram.  Since internal voltage is held constant, there is no  input and any excitation system model will be ignored.  There is also no  output.  This model should not be used for representing a real generator except, perhaps, small generators whose response is insignificant.    The parameters used for the Simplified model include:
 */
public class SynchronousMachineSimplified extends SynchronousMachineDynamics {

	private static final Logging LOG = Logging.getLogger(SynchronousMachineSimplified.class);

	private BaseClass[] SynchronousMachineSimplified_class_attributes;
	private BaseClass[] SynchronousMachineSimplified_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new SynchronousMachineSimplified().getAttributeNamesMap();
	}

	private enum SynchronousMachineSimplified_primitive_builder implements PrimitiveBuilder {
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum SynchronousMachineSimplified_class_attributes_enum {
		LAST_ENUM
	}

	public SynchronousMachineSimplified() {
		SynchronousMachineSimplified_primitive_attributes = new BaseClass[SynchronousMachineSimplified_primitive_builder.values().length];
		SynchronousMachineSimplified_class_attributes = new BaseClass[SynchronousMachineSimplified_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new SynchronousMachineSimplified();
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

	private void updateAttributeInArray(SynchronousMachineSimplified_class_attributes_enum attrEnum, BaseClass value) {
		try {
			SynchronousMachineSimplified_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(SynchronousMachineSimplified_primitive_builder attrEnum, BaseClass value) {
		try {
			SynchronousMachineSimplified_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			SynchronousMachineSimplified_class_attributes_enum attrEnum = SynchronousMachineSimplified_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated SynchronousMachineSimplified, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SynchronousMachineSimplified_primitive_builder attrEnum = SynchronousMachineSimplified_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated SynchronousMachineSimplified, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			SynchronousMachineSimplified_primitive_builder attrEnum = SynchronousMachineSimplified_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = SynchronousMachineSimplified_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			SynchronousMachineSimplified_class_attributes_enum attrEnum = SynchronousMachineSimplified_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = SynchronousMachineSimplified_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : SynchronousMachineSimplified_primitive_builder.values()) {
			if (enumValue != SynchronousMachineSimplified_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "SynchronousMachineSimplified." + enumValue.name());
			}
		}
		for (var enumValue : SynchronousMachineSimplified_class_attributes_enum.values()) {
			if (enumValue != SynchronousMachineSimplified_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "SynchronousMachineSimplified." + enumValue.name());
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
			for (SynchronousMachineSimplified_primitive_builder attrEnum : SynchronousMachineSimplified_primitive_builder.values()) {
				BaseClass bc = SynchronousMachineSimplified_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SynchronousMachineSimplified." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (SynchronousMachineSimplified_class_attributes_enum attrEnum : SynchronousMachineSimplified_class_attributes_enum.values()) {
				BaseClass bc = SynchronousMachineSimplified_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SynchronousMachineSimplified." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(SynchronousMachineSimplified) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "SynchronousMachineSimplified";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
