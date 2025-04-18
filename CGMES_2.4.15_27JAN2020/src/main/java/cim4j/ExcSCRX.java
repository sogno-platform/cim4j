/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Simple excitation system model representing generic characteristics of many excitation systems; intended for use where negative field current may be a problem.
 */
public class ExcSCRX extends ExcitationSystemDynamics {

	private static final Logging LOG = Logging.getLogger(ExcSCRX.class);

	private BaseClass[] ExcSCRX_class_attributes;
	private BaseClass[] ExcSCRX_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ExcSCRX().getAttributeNamesMap();
	}

	private enum ExcSCRX_primitive_builder implements PrimitiveBuilder {
		cswitch() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		emax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		emin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		k() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		rcrfd() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		tatb() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		tb() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		te() {
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

	private enum ExcSCRX_class_attributes_enum {
		cswitch,
		emax,
		emin,
		k,
		rcrfd,
		tatb,
		tb,
		te,
		LAST_ENUM
	}

	public ExcSCRX() {
		ExcSCRX_primitive_attributes = new BaseClass[ExcSCRX_primitive_builder.values().length];
		ExcSCRX_class_attributes = new BaseClass[ExcSCRX_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ExcSCRX();
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

	private void updateAttributeInArray(ExcSCRX_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcSCRX_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ExcSCRX_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcSCRX_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcSCRX_class_attributes_enum attrEnum = ExcSCRX_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ExcSCRX, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcSCRX_primitive_builder attrEnum = ExcSCRX_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ExcSCRX, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ExcSCRX_primitive_builder attrEnum = ExcSCRX_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcSCRX_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ExcSCRX_class_attributes_enum attrEnum = ExcSCRX_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcSCRX_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ExcSCRX_primitive_builder.values()) {
			if (enumValue != ExcSCRX_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcSCRX." + enumValue.name());
			}
		}
		for (var enumValue : ExcSCRX_class_attributes_enum.values()) {
			if (enumValue != ExcSCRX_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcSCRX." + enumValue.name());
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
			for (ExcSCRX_primitive_builder attrEnum : ExcSCRX_primitive_builder.values()) {
				BaseClass bc = ExcSCRX_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcSCRX." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcSCRX_class_attributes_enum attrEnum : ExcSCRX_class_attributes_enum.values()) {
				BaseClass bc = ExcSCRX_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcSCRX." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ExcSCRX) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ExcSCRX";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
