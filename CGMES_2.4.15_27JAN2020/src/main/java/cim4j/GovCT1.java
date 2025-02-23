/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * General model for any prime mover with a PID governor, used primarily for combustion turbine and combined cycle units. This model can be used to represent a variety of prime movers controlled by PID governors.  It is suitable, for example, for representation of     Additional information on this model is available in the 2012 IEEE report, , section 3.1.2.3 page 3-4 (GGOV1).
 */
public class GovCT1 extends TurbineGovernorDynamics {

	private static final Logging LOG = Logging.getLogger(GovCT1.class);

	private BaseClass[] GovCT1_class_attributes;
	private BaseClass[] GovCT1_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new GovCT1().getAttributeNamesMap();
	}

	private enum GovCT1_primitive_builder implements PrimitiveBuilder {
		aset() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		db() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		dm() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ka() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kdgov() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kigov() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kiload() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kimw() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kpgov() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kpload() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kturb() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ldref() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		maxerr() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		minerr() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		mwbase() {
			public BaseClass construct(java.lang.String value) {
				return new ActivePower(value);
			}
		},
		r() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		rclose() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		rdown() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ropen() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		rselect() {
			public BaseClass construct(java.lang.String value) {
				return new DroopSignalFeedbackKind(value);
			}
		},
		rup() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ta() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tact() {
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
		tdgov() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		teng() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tfload() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tpelec() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tsa() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tsb() {
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
		wfnl() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		wfspd() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum GovCT1_class_attributes_enum {
		aset,
		db,
		dm,
		ka,
		kdgov,
		kigov,
		kiload,
		kimw,
		kpgov,
		kpload,
		kturb,
		ldref,
		maxerr,
		minerr,
		mwbase,
		r,
		rclose,
		rdown,
		ropen,
		rselect,
		rup,
		ta,
		tact,
		tb,
		tc,
		tdgov,
		teng,
		tfload,
		tpelec,
		tsa,
		tsb,
		vmax,
		vmin,
		wfnl,
		wfspd,
		LAST_ENUM
	}

	public GovCT1() {
		GovCT1_primitive_attributes = new BaseClass[GovCT1_primitive_builder.values().length];
		GovCT1_class_attributes = new BaseClass[GovCT1_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new GovCT1();
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

	private void updateAttributeInArray(GovCT1_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovCT1_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(GovCT1_primitive_builder attrEnum, BaseClass value) {
		try {
			GovCT1_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovCT1_class_attributes_enum attrEnum = GovCT1_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated GovCT1, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovCT1_primitive_builder attrEnum = GovCT1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated GovCT1, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			GovCT1_primitive_builder attrEnum = GovCT1_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovCT1_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			GovCT1_class_attributes_enum attrEnum = GovCT1_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovCT1_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : GovCT1_primitive_builder.values()) {
			if (enumValue != GovCT1_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovCT1." + enumValue.name());
			}
		}
		for (var enumValue : GovCT1_class_attributes_enum.values()) {
			if (enumValue != GovCT1_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovCT1." + enumValue.name());
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
			for (GovCT1_primitive_builder attrEnum : GovCT1_primitive_builder.values()) {
				BaseClass bc = GovCT1_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovCT1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovCT1_class_attributes_enum attrEnum : GovCT1_class_attributes_enum.values()) {
				BaseClass bc = GovCT1_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovCT1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(GovCT1) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "GovCT1";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
