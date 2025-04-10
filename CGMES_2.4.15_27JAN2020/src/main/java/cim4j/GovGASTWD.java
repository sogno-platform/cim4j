/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Woodward Gas turbine governor model.
 */
public class GovGASTWD extends TurbineGovernorDynamics {

	private static final Logging LOG = Logging.getLogger(GovGASTWD.class);

	private BaseClass[] GovGASTWD_class_attributes;
	private BaseClass[] GovGASTWD_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new GovGASTWD().getAttributeNamesMap();
	}

	private enum GovGASTWD_primitive_builder implements PrimitiveBuilder {
		a() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		af1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		af2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		b() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		bf1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		bf2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		c() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		cf2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ecr() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		etd() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		k3() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		k4() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		k5() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		k6() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kd() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kdroop() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kf() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ki() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kp() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		mwbase() {
			public BaseClass construct(java.lang.String value) {
				return new ActivePower(value);
			}
		},
		t() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t3() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t4() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t5() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tc() {
			public BaseClass construct(java.lang.String value) {
				return new Temperature(value);
			}
		},
		tcd() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		td() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tf() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		tmin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		tr() {
			public BaseClass construct(java.lang.String value) {
				return new Temperature(value);
			}
		},
		trate() {
			public BaseClass construct(java.lang.String value) {
				return new ActivePower(value);
			}
		},
		tt() {
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

	private enum GovGASTWD_class_attributes_enum {
		a,
		af1,
		af2,
		b,
		bf1,
		bf2,
		c,
		cf2,
		ecr,
		etd,
		k3,
		k4,
		k5,
		k6,
		kd,
		kdroop,
		kf,
		ki,
		kp,
		mwbase,
		t,
		t3,
		t4,
		t5,
		tc,
		tcd,
		td,
		tf,
		tmax,
		tmin,
		tr,
		trate,
		tt,
		LAST_ENUM
	}

	public GovGASTWD() {
		GovGASTWD_primitive_attributes = new BaseClass[GovGASTWD_primitive_builder.values().length];
		GovGASTWD_class_attributes = new BaseClass[GovGASTWD_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new GovGASTWD();
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

	private void updateAttributeInArray(GovGASTWD_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovGASTWD_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(GovGASTWD_primitive_builder attrEnum, BaseClass value) {
		try {
			GovGASTWD_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovGASTWD_class_attributes_enum attrEnum = GovGASTWD_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated GovGASTWD, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovGASTWD_primitive_builder attrEnum = GovGASTWD_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated GovGASTWD, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			GovGASTWD_primitive_builder attrEnum = GovGASTWD_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovGASTWD_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			GovGASTWD_class_attributes_enum attrEnum = GovGASTWD_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovGASTWD_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : GovGASTWD_primitive_builder.values()) {
			if (enumValue != GovGASTWD_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovGASTWD." + enumValue.name());
			}
		}
		for (var enumValue : GovGASTWD_class_attributes_enum.values()) {
			if (enumValue != GovGASTWD_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovGASTWD." + enumValue.name());
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
			for (GovGASTWD_primitive_builder attrEnum : GovGASTWD_primitive_builder.values()) {
				BaseClass bc = GovGASTWD_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovGASTWD." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovGASTWD_class_attributes_enum attrEnum : GovGASTWD_class_attributes_enum.values()) {
				BaseClass bc = GovGASTWD_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovGASTWD." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(GovGASTWD) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "GovGASTWD";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
