/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents IEEE Std 421.5-2005 type ST1A model. This model represents systems in which excitation power is supplied through a transformer from the generator terminals (or the unit's auxiliary bus) and is regulated by a controlled rectifier.  The maximum exciter voltage available from such systems is directly related to the generator terminal voltage.  Reference: IEEE Standard 421.5-2005 Section 7.1.
 */
public class ExcIEEEST1A extends ExcitationSystemDynamics {

	private static final Logging LOG = Logging.getLogger(ExcIEEEST1A.class);

	private BaseClass[] ExcIEEEST1A_class_attributes;
	private BaseClass[] ExcIEEEST1A_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ExcIEEEST1A().getAttributeNamesMap();
	}

	private enum ExcIEEEST1A_primitive_builder implements PrimitiveBuilder {
		ilr() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ka() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kc() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kf() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		klr() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		pssin() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		ta() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tb() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tb1() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tc() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tc1() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tf() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		uelin() {
			public BaseClass construct(java.lang.String value) {
				return new ExcIEEEST1AUELselectorKind(value);
			}
		},
		vamax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vamin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vimax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vimin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vrmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vrmin() {
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

	private enum ExcIEEEST1A_class_attributes_enum {
		ilr,
		ka,
		kc,
		kf,
		klr,
		pssin,
		ta,
		tb,
		tb1,
		tc,
		tc1,
		tf,
		uelin,
		vamax,
		vamin,
		vimax,
		vimin,
		vrmax,
		vrmin,
		LAST_ENUM
	}

	public ExcIEEEST1A() {
		ExcIEEEST1A_primitive_attributes = new BaseClass[ExcIEEEST1A_primitive_builder.values().length];
		ExcIEEEST1A_class_attributes = new BaseClass[ExcIEEEST1A_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ExcIEEEST1A();
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

	private void updateAttributeInArray(ExcIEEEST1A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcIEEEST1A_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ExcIEEEST1A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcIEEEST1A_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcIEEEST1A_class_attributes_enum attrEnum = ExcIEEEST1A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ExcIEEEST1A, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcIEEEST1A_primitive_builder attrEnum = ExcIEEEST1A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ExcIEEEST1A, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ExcIEEEST1A_primitive_builder attrEnum = ExcIEEEST1A_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcIEEEST1A_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ExcIEEEST1A_class_attributes_enum attrEnum = ExcIEEEST1A_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcIEEEST1A_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ExcIEEEST1A_primitive_builder.values()) {
			if (enumValue != ExcIEEEST1A_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcIEEEST1A." + enumValue.name());
			}
		}
		for (var enumValue : ExcIEEEST1A_class_attributes_enum.values()) {
			if (enumValue != ExcIEEEST1A_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcIEEEST1A." + enumValue.name());
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
			for (ExcIEEEST1A_primitive_builder attrEnum : ExcIEEEST1A_primitive_builder.values()) {
				BaseClass bc = ExcIEEEST1A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEST1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcIEEEST1A_class_attributes_enum attrEnum : ExcIEEEST1A_class_attributes_enum.values()) {
				BaseClass bc = ExcIEEEST1A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEST1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ExcIEEEST1A) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ExcIEEEST1A";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
