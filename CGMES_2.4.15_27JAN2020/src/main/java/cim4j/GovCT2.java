/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * General governor model with frequency-dependent fuel flow limit.  This model is a modification of the GovCT1model in order to represent the frequency-dependent fuel flow limit of a specific gas turbine manufacturer.
 */
public class GovCT2 extends TurbineGovernorDynamics {

	private static final Logging LOG = Logging.getLogger(GovCT2.class);

	private BaseClass[] GovCT2_class_attributes;
	private BaseClass[] GovCT2_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new GovCT2().getAttributeNamesMap();
	}

	private enum GovCT2_primitive_builder implements PrimitiveBuilder {
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
		flim1() {
			public BaseClass construct(java.lang.String value) {
				return new Frequency(value);
			}
		},
		flim10() {
			public BaseClass construct(java.lang.String value) {
				return new Frequency(value);
			}
		},
		flim2() {
			public BaseClass construct(java.lang.String value) {
				return new Frequency(value);
			}
		},
		flim3() {
			public BaseClass construct(java.lang.String value) {
				return new Frequency(value);
			}
		},
		flim4() {
			public BaseClass construct(java.lang.String value) {
				return new Frequency(value);
			}
		},
		flim5() {
			public BaseClass construct(java.lang.String value) {
				return new Frequency(value);
			}
		},
		flim6() {
			public BaseClass construct(java.lang.String value) {
				return new Frequency(value);
			}
		},
		flim7() {
			public BaseClass construct(java.lang.String value) {
				return new Frequency(value);
			}
		},
		flim8() {
			public BaseClass construct(java.lang.String value) {
				return new Frequency(value);
			}
		},
		flim9() {
			public BaseClass construct(java.lang.String value) {
				return new Frequency(value);
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
		plim1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		plim10() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		plim2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		plim3() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		plim4() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		plim5() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		plim6() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		plim7() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		plim8() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		plim9() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		prate() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
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

	private enum GovCT2_class_attributes_enum {
		aset,
		db,
		dm,
		flim1,
		flim10,
		flim2,
		flim3,
		flim4,
		flim5,
		flim6,
		flim7,
		flim8,
		flim9,
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
		plim1,
		plim10,
		plim2,
		plim3,
		plim4,
		plim5,
		plim6,
		plim7,
		plim8,
		plim9,
		prate,
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

	public GovCT2() {
		GovCT2_primitive_attributes = new BaseClass[GovCT2_primitive_builder.values().length];
		GovCT2_class_attributes = new BaseClass[GovCT2_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new GovCT2();
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

	private void updateAttributeInArray(GovCT2_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovCT2_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(GovCT2_primitive_builder attrEnum, BaseClass value) {
		try {
			GovCT2_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovCT2_class_attributes_enum attrEnum = GovCT2_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated GovCT2, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovCT2_primitive_builder attrEnum = GovCT2_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated GovCT2, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			GovCT2_primitive_builder attrEnum = GovCT2_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovCT2_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			GovCT2_class_attributes_enum attrEnum = GovCT2_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovCT2_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : GovCT2_primitive_builder.values()) {
			if (enumValue != GovCT2_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovCT2." + enumValue.name());
			}
		}
		for (var enumValue : GovCT2_class_attributes_enum.values()) {
			if (enumValue != GovCT2_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovCT2." + enumValue.name());
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
			for (GovCT2_primitive_builder attrEnum : GovCT2_primitive_builder.values()) {
				BaseClass bc = GovCT2_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovCT2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovCT2_class_attributes_enum attrEnum : GovCT2_class_attributes_enum.values()) {
				BaseClass bc = GovCT2_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovCT2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(GovCT2) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "GovCT2";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
