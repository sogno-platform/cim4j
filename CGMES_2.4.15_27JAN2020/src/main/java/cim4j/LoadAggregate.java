/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Standard aggregate load model comprised of static and/or dynamic components.  A static load model represents the sensitivity of the real and reactive power consumed by the load to the amplitude and frequency of the bus voltage. A dynamic load model can used to represent the aggregate response of the motor components of the load.
 */
public class LoadAggregate extends LoadDynamics {

	private static final Logging LOG = Logging.getLogger(LoadAggregate.class);

	private BaseClass[] LoadAggregate_class_attributes;
	private BaseClass[] LoadAggregate_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new LoadAggregate().getAttributeNamesMap();
	}

	private enum LoadAggregate_primitive_builder implements PrimitiveBuilder {
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum LoadAggregate_class_attributes_enum {
		LoadMotor,
		LoadStatic,
		LAST_ENUM
	}

	public LoadAggregate() {
		LoadAggregate_primitive_attributes = new BaseClass[LoadAggregate_primitive_builder.values().length];
		LoadAggregate_class_attributes = new BaseClass[LoadAggregate_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new LoadAggregate();
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

	private void updateAttributeInArray(LoadAggregate_class_attributes_enum attrEnum, BaseClass value) {
		try {
			LoadAggregate_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(LoadAggregate_primitive_builder attrEnum, BaseClass value) {
		try {
			LoadAggregate_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			LoadAggregate_class_attributes_enum attrEnum = LoadAggregate_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated LoadAggregate, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			LoadAggregate_primitive_builder attrEnum = LoadAggregate_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated LoadAggregate, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			LoadAggregate_primitive_builder attrEnum = LoadAggregate_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = LoadAggregate_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			LoadAggregate_class_attributes_enum attrEnum = LoadAggregate_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = LoadAggregate_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : LoadAggregate_primitive_builder.values()) {
			if (enumValue != LoadAggregate_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "LoadAggregate." + enumValue.name());
			}
		}
		for (var enumValue : LoadAggregate_class_attributes_enum.values()) {
			if (enumValue != LoadAggregate_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "LoadAggregate." + enumValue.name());
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
			for (LoadAggregate_primitive_builder attrEnum : LoadAggregate_primitive_builder.values()) {
				BaseClass bc = LoadAggregate_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LoadAggregate." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (LoadAggregate_class_attributes_enum attrEnum : LoadAggregate_class_attributes_enum.values()) {
				BaseClass bc = LoadAggregate_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LoadAggregate." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(LoadAggregate) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "LoadAggregate";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
