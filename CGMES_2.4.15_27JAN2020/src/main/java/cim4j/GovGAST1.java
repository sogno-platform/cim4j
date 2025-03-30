/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Modified single shaft gas turbine.
 */
public class GovGAST1 extends TurbineGovernorDynamics {

	private static final Logging LOG = Logging.getLogger(GovGAST1.class);

	private BaseClass[] GovGAST1_class_attributes;
	private BaseClass[] GovGAST1_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new GovGAST1().getAttributeNamesMap();
	}

	private enum GovGAST1_primitive_builder implements PrimitiveBuilder {
		a() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		b() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		db1() {
			public BaseClass construct(java.lang.String value) {
				return new Frequency(value);
			}
		},
		db2() {
			public BaseClass construct(java.lang.String value) {
				return new ActivePower(value);
			}
		},
		eps() {
			public BaseClass construct(java.lang.String value) {
				return new Frequency(value);
			}
		},
		fidle() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		gv1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		gv2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		gv3() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		gv4() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		gv5() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		gv6() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ka() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kt() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		lmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		loadinc() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ltrate() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		mwbase() {
			public BaseClass construct(java.lang.String value) {
				return new ActivePower(value);
			}
		},
		pgv1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		pgv2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		pgv3() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		pgv4() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		pgv5() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		pgv6() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		r() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		rmax() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		t1() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t2() {
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
		tltr() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		vmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vmin() {
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

	private enum GovGAST1_class_attributes_enum {
		a,
		b,
		db1,
		db2,
		eps,
		fidle,
		gv1,
		gv2,
		gv3,
		gv4,
		gv5,
		gv6,
		ka,
		kt,
		lmax,
		loadinc,
		ltrate,
		mwbase,
		pgv1,
		pgv2,
		pgv3,
		pgv4,
		pgv5,
		pgv6,
		r,
		rmax,
		t1,
		t2,
		t3,
		t4,
		t5,
		tltr,
		vmax,
		vmin,
		LAST_ENUM
	}

	public GovGAST1() {
		GovGAST1_primitive_attributes = new BaseClass[GovGAST1_primitive_builder.values().length];
		GovGAST1_class_attributes = new BaseClass[GovGAST1_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new GovGAST1();
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

	private void updateAttributeInArray(GovGAST1_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovGAST1_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(GovGAST1_primitive_builder attrEnum, BaseClass value) {
		try {
			GovGAST1_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovGAST1_class_attributes_enum attrEnum = GovGAST1_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated GovGAST1, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovGAST1_primitive_builder attrEnum = GovGAST1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated GovGAST1, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			GovGAST1_primitive_builder attrEnum = GovGAST1_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovGAST1_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			GovGAST1_class_attributes_enum attrEnum = GovGAST1_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovGAST1_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : GovGAST1_primitive_builder.values()) {
			if (enumValue != GovGAST1_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovGAST1." + enumValue.name());
			}
		}
		for (var enumValue : GovGAST1_class_attributes_enum.values()) {
			if (enumValue != GovGAST1_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovGAST1." + enumValue.name());
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
			for (GovGAST1_primitive_builder attrEnum : GovGAST1_primitive_builder.values()) {
				BaseClass bc = GovGAST1_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovGAST1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovGAST1_class_attributes_enum attrEnum : GovGAST1_class_attributes_enum.values()) {
				BaseClass bc = GovGAST1_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovGAST1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(GovGAST1) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "GovGAST1";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
