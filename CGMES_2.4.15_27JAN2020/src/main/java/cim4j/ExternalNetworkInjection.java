/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * This class represents external network and it is used for IEC 60909 calculations.
 */
public class ExternalNetworkInjection extends RegulatingCondEq {

	private static final Logging LOG = Logging.getLogger(ExternalNetworkInjection.class);

	private BaseClass[] ExternalNetworkInjection_class_attributes;
	private BaseClass[] ExternalNetworkInjection_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ExternalNetworkInjection().getAttributeNamesMap();
	}

	private enum ExternalNetworkInjection_primitive_builder implements PrimitiveBuilder {
		governorSCD() {
			public BaseClass construct(java.lang.String value) {
				return new ActivePowerPerFrequency(value);
			}
		},
		ikSecond() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		maxInitialSymShCCurrent() {
			public BaseClass construct(java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
		maxP() {
			public BaseClass construct(java.lang.String value) {
				return new ActivePower(value);
			}
		},
		maxQ() {
			public BaseClass construct(java.lang.String value) {
				return new ReactivePower(value);
			}
		},
		maxR0ToX0Ratio() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		maxR1ToX1Ratio() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		maxZ0ToZ1Ratio() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		minInitialSymShCCurrent() {
			public BaseClass construct(java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
		minP() {
			public BaseClass construct(java.lang.String value) {
				return new ActivePower(value);
			}
		},
		minQ() {
			public BaseClass construct(java.lang.String value) {
				return new ReactivePower(value);
			}
		},
		minR0ToX0Ratio() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		minR1ToX1Ratio() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		minZ0ToZ1Ratio() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		p() {
			public BaseClass construct(java.lang.String value) {
				return new ActivePower(value);
			}
		},
		q() {
			public BaseClass construct(java.lang.String value) {
				return new ReactivePower(value);
			}
		},
		referencePriority() {
			public BaseClass construct(java.lang.String value) {
				return new Integer(value);
			}
		},
		voltageFactor() {
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

	private enum ExternalNetworkInjection_class_attributes_enum {
		governorSCD,
		ikSecond,
		maxInitialSymShCCurrent,
		maxP,
		maxQ,
		maxR0ToX0Ratio,
		maxR1ToX1Ratio,
		maxZ0ToZ1Ratio,
		minInitialSymShCCurrent,
		minP,
		minQ,
		minR0ToX0Ratio,
		minR1ToX1Ratio,
		minZ0ToZ1Ratio,
		p,
		q,
		referencePriority,
		voltageFactor,
		LAST_ENUM
	}

	public ExternalNetworkInjection() {
		ExternalNetworkInjection_primitive_attributes = new BaseClass[ExternalNetworkInjection_primitive_builder.values().length];
		ExternalNetworkInjection_class_attributes = new BaseClass[ExternalNetworkInjection_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ExternalNetworkInjection();
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

	private void updateAttributeInArray(ExternalNetworkInjection_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExternalNetworkInjection_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ExternalNetworkInjection_primitive_builder attrEnum, BaseClass value) {
		try {
			ExternalNetworkInjection_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExternalNetworkInjection_class_attributes_enum attrEnum = ExternalNetworkInjection_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ExternalNetworkInjection, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExternalNetworkInjection_primitive_builder attrEnum = ExternalNetworkInjection_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ExternalNetworkInjection, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ExternalNetworkInjection_primitive_builder attrEnum = ExternalNetworkInjection_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExternalNetworkInjection_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ExternalNetworkInjection_class_attributes_enum attrEnum = ExternalNetworkInjection_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExternalNetworkInjection_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ExternalNetworkInjection_primitive_builder.values()) {
			if (enumValue != ExternalNetworkInjection_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExternalNetworkInjection." + enumValue.name());
			}
		}
		for (var enumValue : ExternalNetworkInjection_class_attributes_enum.values()) {
			if (enumValue != ExternalNetworkInjection_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExternalNetworkInjection." + enumValue.name());
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
			for (ExternalNetworkInjection_primitive_builder attrEnum : ExternalNetworkInjection_primitive_builder.values()) {
				BaseClass bc = ExternalNetworkInjection_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExternalNetworkInjection." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExternalNetworkInjection_class_attributes_enum attrEnum : ExternalNetworkInjection_class_attributes_enum.values()) {
				BaseClass bc = ExternalNetworkInjection_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExternalNetworkInjection." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ExternalNetworkInjection) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ExternalNetworkInjection";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
