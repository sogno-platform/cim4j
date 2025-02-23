/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Detailed hydro unit - Pelton model.  This model can be used to represent the dynamic related to water tunnel and surge chamber. A schematic of the hydraulic system of detailed hydro unit models, like Francis and Pelton, is located under the GovHydroFrancis class.
 */
public class GovHydroPelton extends TurbineGovernorDynamics {

	private static final Logging LOG = Logging.getLogger(GovHydroPelton.class);

	private BaseClass[] GovHydroPelton_class_attributes;
	private BaseClass[] GovHydroPelton_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new GovHydroPelton().getAttributeNamesMap();
	}

	private enum GovHydroPelton_primitive_builder implements PrimitiveBuilder {
		av0() {
			public BaseClass construct(java.lang.String value) {
				return new Area(value);
			}
		},
		av1() {
			public BaseClass construct(java.lang.String value) {
				return new Area(value);
			}
		},
		bp() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		db1() {
			public BaseClass construct(java.lang.String value) {
				return new Frequency(value);
			}
		},
		db2() {
			public BaseClass construct(java.lang.String value) {
				return new Frequency(value);
			}
		},
		h1() {
			public BaseClass construct(java.lang.String value) {
				return new Length(value);
			}
		},
		h2() {
			public BaseClass construct(java.lang.String value) {
				return new Length(value);
			}
		},
		hn() {
			public BaseClass construct(java.lang.String value) {
				return new Length(value);
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
		qc0() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		qn() {
			public BaseClass construct(java.lang.String value) {
				return new VolumeFlowRate(value);
			}
		},
		simplifiedPelton() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		staticCompensating() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		ta() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		ts() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tv() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		twnc() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		twng() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tx() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		va() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		valvmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		valvmin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vav() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vc() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		vcv() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		waterTunnelSurgeChamberSimulation() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		zsfc() {
			public BaseClass construct(java.lang.String value) {
				return new Length(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum GovHydroPelton_class_attributes_enum {
		av0,
		av1,
		bp,
		db1,
		db2,
		h1,
		h2,
		hn,
		kc,
		kg,
		qc0,
		qn,
		simplifiedPelton,
		staticCompensating,
		ta,
		ts,
		tv,
		twnc,
		twng,
		tx,
		va,
		valvmax,
		valvmin,
		vav,
		vc,
		vcv,
		waterTunnelSurgeChamberSimulation,
		zsfc,
		LAST_ENUM
	}

	public GovHydroPelton() {
		GovHydroPelton_primitive_attributes = new BaseClass[GovHydroPelton_primitive_builder.values().length];
		GovHydroPelton_class_attributes = new BaseClass[GovHydroPelton_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new GovHydroPelton();
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

	private void updateAttributeInArray(GovHydroPelton_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovHydroPelton_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(GovHydroPelton_primitive_builder attrEnum, BaseClass value) {
		try {
			GovHydroPelton_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovHydroPelton_class_attributes_enum attrEnum = GovHydroPelton_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated GovHydroPelton, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovHydroPelton_primitive_builder attrEnum = GovHydroPelton_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated GovHydroPelton, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			GovHydroPelton_primitive_builder attrEnum = GovHydroPelton_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovHydroPelton_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			GovHydroPelton_class_attributes_enum attrEnum = GovHydroPelton_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GovHydroPelton_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : GovHydroPelton_primitive_builder.values()) {
			if (enumValue != GovHydroPelton_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovHydroPelton." + enumValue.name());
			}
		}
		for (var enumValue : GovHydroPelton_class_attributes_enum.values()) {
			if (enumValue != GovHydroPelton_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GovHydroPelton." + enumValue.name());
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
			for (GovHydroPelton_primitive_builder attrEnum : GovHydroPelton_primitive_builder.values()) {
				BaseClass bc = GovHydroPelton_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydroPelton." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovHydroPelton_class_attributes_enum attrEnum : GovHydroPelton_class_attributes_enum.values()) {
				BaseClass bc = GovHydroPelton_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydroPelton." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(GovHydroPelton) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "GovHydroPelton";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
