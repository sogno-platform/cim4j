/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents IEEE Std 421.5-2005 type ST3A model.  Some static systems utilize a field voltage control loop to linearize the exciter control characteristic. This also makes the output independent of supply source variations until supply limitations are reached.  These systems utilize a variety of controlled-rectifier designs: full thyristor complements or hybrid bridges in either series or shunt configurations. The power source may consist of only a potential source, either fed from the machine terminals or from internal windings. Some designs may have compound power sources utilizing both machine potential and current. These power sources are represented as phasor combinations of machine terminal current and voltage and are accommodated by suitable parameters in model Type ST3A which is represented by ExcIEEEST3A.   Reference: IEEE Standard 421.5-2005 Section 7.3.
 */
public class ExcIEEEST3A extends ExcitationSystemDynamics {

	private static final Logging LOG = Logging.getLogger(ExcIEEEST3A.class);

	private BaseClass[] ExcIEEEST3A_class_attributes;
	private BaseClass[] ExcIEEEST3A_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ExcIEEEST3A().getAttributeNamesMap();
	}

	private enum ExcIEEEST3A_primitive_builder implements PrimitiveBuilder {
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
		kg() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ki() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		km() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kp() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
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
		tc() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		thetap() {
			public BaseClass construct(java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
		tm() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		vbmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vgmax() {
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
		vmmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vmmin() {
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
		xl() {
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

	private enum ExcIEEEST3A_class_attributes_enum {
		ka,
		kc,
		kg,
		ki,
		km,
		kp,
		ta,
		tb,
		tc,
		thetap,
		tm,
		vbmax,
		vgmax,
		vimax,
		vimin,
		vmmax,
		vmmin,
		vrmax,
		vrmin,
		xl,
		LAST_ENUM
	}

	public ExcIEEEST3A() {
		ExcIEEEST3A_primitive_attributes = new BaseClass[ExcIEEEST3A_primitive_builder.values().length];
		ExcIEEEST3A_class_attributes = new BaseClass[ExcIEEEST3A_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ExcIEEEST3A();
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

	private void updateAttributeInArray(ExcIEEEST3A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcIEEEST3A_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ExcIEEEST3A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcIEEEST3A_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcIEEEST3A_class_attributes_enum attrEnum = ExcIEEEST3A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ExcIEEEST3A, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcIEEEST3A_primitive_builder attrEnum = ExcIEEEST3A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ExcIEEEST3A, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ExcIEEEST3A_primitive_builder attrEnum = ExcIEEEST3A_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcIEEEST3A_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ExcIEEEST3A_class_attributes_enum attrEnum = ExcIEEEST3A_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcIEEEST3A_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ExcIEEEST3A_primitive_builder.values()) {
			if (enumValue != ExcIEEEST3A_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcIEEEST3A." + enumValue.name());
			}
		}
		for (var enumValue : ExcIEEEST3A_class_attributes_enum.values()) {
			if (enumValue != ExcIEEEST3A_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcIEEEST3A." + enumValue.name());
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
			for (ExcIEEEST3A_primitive_builder attrEnum : ExcIEEEST3A_primitive_builder.values()) {
				BaseClass bc = ExcIEEEST3A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEST3A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcIEEEST3A_class_attributes_enum attrEnum : ExcIEEEST3A_class_attributes_enum.values()) {
				BaseClass bc = ExcIEEEST3A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEST3A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ExcIEEEST3A) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ExcIEEEST3A";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
