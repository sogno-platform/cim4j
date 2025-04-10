/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents IEEE VAR Controller Type 1 which operates by moving the voltage reference directly.  Reference: IEEE Standard 421.5-2005 Section 11.3.
 */
public class PFVArType1IEEEVArController extends PFVArControllerType1Dynamics {

	private static final Logging LOG = Logging.getLogger(PFVArType1IEEEVArController.class);

	private BaseClass[] PFVArType1IEEEVArController_class_attributes;
	private BaseClass[] PFVArType1IEEEVArController_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new PFVArType1IEEEVArController().getAttributeNamesMap();
	}

	private enum PFVArType1IEEEVArController_primitive_builder implements PrimitiveBuilder {
		tvarc() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		vvar() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vvarcbw() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		vvarref() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vvtmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vvtmin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum PFVArType1IEEEVArController_class_attributes_enum {
		tvarc,
		vvar,
		vvarcbw,
		vvarref,
		vvtmax,
		vvtmin,
		LAST_ENUM
	}

	public PFVArType1IEEEVArController() {
		PFVArType1IEEEVArController_primitive_attributes = new BaseClass[PFVArType1IEEEVArController_primitive_builder.values().length];
		PFVArType1IEEEVArController_class_attributes = new BaseClass[PFVArType1IEEEVArController_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new PFVArType1IEEEVArController();
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

	private void updateAttributeInArray(PFVArType1IEEEVArController_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PFVArType1IEEEVArController_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(PFVArType1IEEEVArController_primitive_builder attrEnum, BaseClass value) {
		try {
			PFVArType1IEEEVArController_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PFVArType1IEEEVArController_class_attributes_enum attrEnum = PFVArType1IEEEVArController_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated PFVArType1IEEEVArController, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PFVArType1IEEEVArController_primitive_builder attrEnum = PFVArType1IEEEVArController_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated PFVArType1IEEEVArController, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			PFVArType1IEEEVArController_primitive_builder attrEnum = PFVArType1IEEEVArController_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = PFVArType1IEEEVArController_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			PFVArType1IEEEVArController_class_attributes_enum attrEnum = PFVArType1IEEEVArController_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = PFVArType1IEEEVArController_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : PFVArType1IEEEVArController_primitive_builder.values()) {
			if (enumValue != PFVArType1IEEEVArController_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "PFVArType1IEEEVArController." + enumValue.name());
			}
		}
		for (var enumValue : PFVArType1IEEEVArController_class_attributes_enum.values()) {
			if (enumValue != PFVArType1IEEEVArController_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "PFVArType1IEEEVArController." + enumValue.name());
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
			for (PFVArType1IEEEVArController_primitive_builder attrEnum : PFVArType1IEEEVArController_primitive_builder.values()) {
				BaseClass bc = PFVArType1IEEEVArController_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PFVArType1IEEEVArController." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PFVArType1IEEEVArController_class_attributes_enum attrEnum : PFVArType1IEEEVArController_class_attributes_enum.values()) {
				BaseClass bc = PFVArType1IEEEVArController_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PFVArType1IEEEVArController." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(PFVArType1IEEEVArController) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "PFVArType1IEEEVArController";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
