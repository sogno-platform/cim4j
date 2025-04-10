/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Describes the tap model for an asymmetrical phase shifting transformer in which the difference voltage vector adds to the primary side voltage. The angle between the primary side voltage and the difference voltage is named the winding connection angle. The phase shift depends on both the difference voltage magnitude and the winding connection angle.
 */
public class PhaseTapChangerAsymmetrical extends PhaseTapChangerNonLinear {

	private static final Logging LOG = Logging.getLogger(PhaseTapChangerAsymmetrical.class);

	private BaseClass[] PhaseTapChangerAsymmetrical_class_attributes;
	private BaseClass[] PhaseTapChangerAsymmetrical_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new PhaseTapChangerAsymmetrical().getAttributeNamesMap();
	}

	private enum PhaseTapChangerAsymmetrical_primitive_builder implements PrimitiveBuilder {
		windingConnectionAngle() {
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

	private enum PhaseTapChangerAsymmetrical_class_attributes_enum {
		windingConnectionAngle,
		LAST_ENUM
	}

	public PhaseTapChangerAsymmetrical() {
		PhaseTapChangerAsymmetrical_primitive_attributes = new BaseClass[PhaseTapChangerAsymmetrical_primitive_builder.values().length];
		PhaseTapChangerAsymmetrical_class_attributes = new BaseClass[PhaseTapChangerAsymmetrical_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new PhaseTapChangerAsymmetrical();
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

	private void updateAttributeInArray(PhaseTapChangerAsymmetrical_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PhaseTapChangerAsymmetrical_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(PhaseTapChangerAsymmetrical_primitive_builder attrEnum, BaseClass value) {
		try {
			PhaseTapChangerAsymmetrical_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PhaseTapChangerAsymmetrical_class_attributes_enum attrEnum = PhaseTapChangerAsymmetrical_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated PhaseTapChangerAsymmetrical, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PhaseTapChangerAsymmetrical_primitive_builder attrEnum = PhaseTapChangerAsymmetrical_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated PhaseTapChangerAsymmetrical, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			PhaseTapChangerAsymmetrical_primitive_builder attrEnum = PhaseTapChangerAsymmetrical_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = PhaseTapChangerAsymmetrical_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			PhaseTapChangerAsymmetrical_class_attributes_enum attrEnum = PhaseTapChangerAsymmetrical_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = PhaseTapChangerAsymmetrical_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : PhaseTapChangerAsymmetrical_primitive_builder.values()) {
			if (enumValue != PhaseTapChangerAsymmetrical_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "PhaseTapChangerAsymmetrical." + enumValue.name());
			}
		}
		for (var enumValue : PhaseTapChangerAsymmetrical_class_attributes_enum.values()) {
			if (enumValue != PhaseTapChangerAsymmetrical_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "PhaseTapChangerAsymmetrical." + enumValue.name());
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
			for (PhaseTapChangerAsymmetrical_primitive_builder attrEnum : PhaseTapChangerAsymmetrical_primitive_builder.values()) {
				BaseClass bc = PhaseTapChangerAsymmetrical_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PhaseTapChangerAsymmetrical." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PhaseTapChangerAsymmetrical_class_attributes_enum attrEnum : PhaseTapChangerAsymmetrical_class_attributes_enum.values()) {
				BaseClass bc = PhaseTapChangerAsymmetrical_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PhaseTapChangerAsymmetrical." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(PhaseTapChangerAsymmetrical) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "PhaseTapChangerAsymmetrical";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
