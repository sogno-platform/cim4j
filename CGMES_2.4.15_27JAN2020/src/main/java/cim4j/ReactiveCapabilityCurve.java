/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Reactive power rating envelope versus the synchronous machine's active power, in both the generating and motoring modes. For each active power value there is a corresponding high and low reactive power limit  value. Typically there will be a separate curve for each coolant condition, such as hydrogen pressure.  The Y1 axis values represent reactive minimum and the Y2 axis values represent reactive maximum.
 */
public class ReactiveCapabilityCurve extends Curve {

	private static final Logging LOG = Logging.getLogger(ReactiveCapabilityCurve.class);

	private BaseClass[] ReactiveCapabilityCurve_class_attributes;
	private BaseClass[] ReactiveCapabilityCurve_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ReactiveCapabilityCurve().getAttributeNamesMap();
	}

	private enum ReactiveCapabilityCurve_primitive_builder implements PrimitiveBuilder {
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum ReactiveCapabilityCurve_class_attributes_enum {
		EquivalentInjection,
		InitiallyUsedBySynchronousMachines,
		LAST_ENUM
	}

	public ReactiveCapabilityCurve() {
		ReactiveCapabilityCurve_primitive_attributes = new BaseClass[ReactiveCapabilityCurve_primitive_builder.values().length];
		ReactiveCapabilityCurve_class_attributes = new BaseClass[ReactiveCapabilityCurve_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ReactiveCapabilityCurve();
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

	private void updateAttributeInArray(ReactiveCapabilityCurve_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ReactiveCapabilityCurve_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ReactiveCapabilityCurve_primitive_builder attrEnum, BaseClass value) {
		try {
			ReactiveCapabilityCurve_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ReactiveCapabilityCurve_class_attributes_enum attrEnum = ReactiveCapabilityCurve_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ReactiveCapabilityCurve, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ReactiveCapabilityCurve_primitive_builder attrEnum = ReactiveCapabilityCurve_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ReactiveCapabilityCurve, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ReactiveCapabilityCurve_primitive_builder attrEnum = ReactiveCapabilityCurve_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ReactiveCapabilityCurve_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ReactiveCapabilityCurve_class_attributes_enum attrEnum = ReactiveCapabilityCurve_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ReactiveCapabilityCurve_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ReactiveCapabilityCurve_primitive_builder.values()) {
			if (enumValue != ReactiveCapabilityCurve_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ReactiveCapabilityCurve." + enumValue.name());
			}
		}
		for (var enumValue : ReactiveCapabilityCurve_class_attributes_enum.values()) {
			if (enumValue != ReactiveCapabilityCurve_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ReactiveCapabilityCurve." + enumValue.name());
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
			for (ReactiveCapabilityCurve_primitive_builder attrEnum : ReactiveCapabilityCurve_primitive_builder.values()) {
				BaseClass bc = ReactiveCapabilityCurve_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ReactiveCapabilityCurve." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ReactiveCapabilityCurve_class_attributes_enum attrEnum : ReactiveCapabilityCurve_class_attributes_enum.values()) {
				BaseClass bc = ReactiveCapabilityCurve_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ReactiveCapabilityCurve." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ReactiveCapabilityCurve) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ReactiveCapabilityCurve";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
