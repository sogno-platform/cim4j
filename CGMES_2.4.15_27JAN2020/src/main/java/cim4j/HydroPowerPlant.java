/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A hydro power station which can generate or pump. When generating, the generator turbines receive water from an upper reservoir. When pumping, the pumps receive their water from a lower reservoir.
 */
public class HydroPowerPlant extends PowerSystemResource {

	private static final Logging LOG = Logging.getLogger(HydroPowerPlant.class);

	private BaseClass[] HydroPowerPlant_class_attributes;
	private BaseClass[] HydroPowerPlant_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new HydroPowerPlant().getAttributeNamesMap();
	}

	private enum HydroPowerPlant_primitive_builder implements PrimitiveBuilder {
		hydroPlantStorageType() {
			public BaseClass construct(java.lang.String value) {
				return new HydroPlantStorageKind(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum HydroPowerPlant_class_attributes_enum {
		HydroGeneratingUnits,
		HydroPumps,
		hydroPlantStorageType,
		LAST_ENUM
	}

	public HydroPowerPlant() {
		HydroPowerPlant_primitive_attributes = new BaseClass[HydroPowerPlant_primitive_builder.values().length];
		HydroPowerPlant_class_attributes = new BaseClass[HydroPowerPlant_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new HydroPowerPlant();
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

	private void updateAttributeInArray(HydroPowerPlant_class_attributes_enum attrEnum, BaseClass value) {
		try {
			HydroPowerPlant_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(HydroPowerPlant_primitive_builder attrEnum, BaseClass value) {
		try {
			HydroPowerPlant_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			HydroPowerPlant_class_attributes_enum attrEnum = HydroPowerPlant_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated HydroPowerPlant, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			HydroPowerPlant_primitive_builder attrEnum = HydroPowerPlant_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated HydroPowerPlant, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			HydroPowerPlant_primitive_builder attrEnum = HydroPowerPlant_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = HydroPowerPlant_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			HydroPowerPlant_class_attributes_enum attrEnum = HydroPowerPlant_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = HydroPowerPlant_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : HydroPowerPlant_primitive_builder.values()) {
			if (enumValue != HydroPowerPlant_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "HydroPowerPlant." + enumValue.name());
			}
		}
		for (var enumValue : HydroPowerPlant_class_attributes_enum.values()) {
			if (enumValue != HydroPowerPlant_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "HydroPowerPlant." + enumValue.name());
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
			for (HydroPowerPlant_primitive_builder attrEnum : HydroPowerPlant_primitive_builder.values()) {
				BaseClass bc = HydroPowerPlant_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    HydroPowerPlant." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (HydroPowerPlant_class_attributes_enum attrEnum : HydroPowerPlant_class_attributes_enum.values()) {
				BaseClass bc = HydroPowerPlant_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    HydroPowerPlant." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(HydroPowerPlant) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "HydroPowerPlant";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
