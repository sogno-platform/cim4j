/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Manual excitation control with field circuit resistance. This model can be used as a very simple representation of manual voltage control.
 */
public class ExcAVR5 extends ExcitationSystemDynamics {

	private static final Logging LOG = Logging.getLogger(ExcAVR5.class);

	private BaseClass[] ExcAVR5_class_attributes;
	private BaseClass[] ExcAVR5_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ExcAVR5().getAttributeNamesMap();
	}

	private enum ExcAVR5_primitive_builder implements PrimitiveBuilder {
		ka() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		rex() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ta() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum ExcAVR5_class_attributes_enum {
		ka,
		rex,
		ta,
		LAST_ENUM
	}

	public ExcAVR5() {
		ExcAVR5_primitive_attributes = new BaseClass[ExcAVR5_primitive_builder.values().length];
		ExcAVR5_class_attributes = new BaseClass[ExcAVR5_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ExcAVR5();
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

	private void updateAttributeInArray(ExcAVR5_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcAVR5_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ExcAVR5_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcAVR5_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcAVR5_class_attributes_enum attrEnum = ExcAVR5_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ExcAVR5, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcAVR5_primitive_builder attrEnum = ExcAVR5_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ExcAVR5, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ExcAVR5_primitive_builder attrEnum = ExcAVR5_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcAVR5_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ExcAVR5_class_attributes_enum attrEnum = ExcAVR5_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcAVR5_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ExcAVR5_primitive_builder.values()) {
			if (enumValue != ExcAVR5_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcAVR5." + enumValue.name());
			}
		}
		for (var enumValue : ExcAVR5_class_attributes_enum.values()) {
			if (enumValue != ExcAVR5_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcAVR5." + enumValue.name());
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
			for (ExcAVR5_primitive_builder attrEnum : ExcAVR5_primitive_builder.values()) {
				BaseClass bc = ExcAVR5_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcAVR5." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcAVR5_class_attributes_enum attrEnum : ExcAVR5_class_attributes_enum.values()) {
				BaseClass bc = ExcAVR5_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcAVR5." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ExcAVR5) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ExcAVR5";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
