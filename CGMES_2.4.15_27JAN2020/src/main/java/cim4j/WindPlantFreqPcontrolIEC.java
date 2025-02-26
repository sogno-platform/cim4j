/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Frequency and active power controller model.  Reference: IEC Standard 61400-27-1 Annex E.
 */
public class WindPlantFreqPcontrolIEC extends IdentifiedObject {

	private static final Logging LOG = Logging.getLogger(WindPlantFreqPcontrolIEC.class);

	private BaseClass[] WindPlantFreqPcontrolIEC_class_attributes;
	private BaseClass[] WindPlantFreqPcontrolIEC_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new WindPlantFreqPcontrolIEC().getAttributeNamesMap();
	}

	private enum WindPlantFreqPcontrolIEC_primitive_builder implements PrimitiveBuilder {
		dprefmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		dprefmin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kiwpp() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kpwpp() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		prefmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		prefmin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		tpft() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tpfv() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		twpffilt() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		twppfilt() {
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

	private enum WindPlantFreqPcontrolIEC_class_attributes_enum {
		WindDynamicsLookupTable,
		WindPlantIEC,
		dprefmax,
		dprefmin,
		kiwpp,
		kpwpp,
		prefmax,
		prefmin,
		tpft,
		tpfv,
		twpffilt,
		twppfilt,
		LAST_ENUM
	}

	public WindPlantFreqPcontrolIEC() {
		WindPlantFreqPcontrolIEC_primitive_attributes = new BaseClass[WindPlantFreqPcontrolIEC_primitive_builder.values().length];
		WindPlantFreqPcontrolIEC_class_attributes = new BaseClass[WindPlantFreqPcontrolIEC_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new WindPlantFreqPcontrolIEC();
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

	private void updateAttributeInArray(WindPlantFreqPcontrolIEC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindPlantFreqPcontrolIEC_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(WindPlantFreqPcontrolIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindPlantFreqPcontrolIEC_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindPlantFreqPcontrolIEC_class_attributes_enum attrEnum = WindPlantFreqPcontrolIEC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated WindPlantFreqPcontrolIEC, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindPlantFreqPcontrolIEC_primitive_builder attrEnum = WindPlantFreqPcontrolIEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated WindPlantFreqPcontrolIEC, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			WindPlantFreqPcontrolIEC_primitive_builder attrEnum = WindPlantFreqPcontrolIEC_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = WindPlantFreqPcontrolIEC_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			WindPlantFreqPcontrolIEC_class_attributes_enum attrEnum = WindPlantFreqPcontrolIEC_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = WindPlantFreqPcontrolIEC_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : WindPlantFreqPcontrolIEC_primitive_builder.values()) {
			if (enumValue != WindPlantFreqPcontrolIEC_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "WindPlantFreqPcontrolIEC." + enumValue.name());
			}
		}
		for (var enumValue : WindPlantFreqPcontrolIEC_class_attributes_enum.values()) {
			if (enumValue != WindPlantFreqPcontrolIEC_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "WindPlantFreqPcontrolIEC." + enumValue.name());
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
			for (WindPlantFreqPcontrolIEC_primitive_builder attrEnum : WindPlantFreqPcontrolIEC_primitive_builder.values()) {
				BaseClass bc = WindPlantFreqPcontrolIEC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindPlantFreqPcontrolIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindPlantFreqPcontrolIEC_class_attributes_enum attrEnum : WindPlantFreqPcontrolIEC_class_attributes_enum.values()) {
				BaseClass bc = WindPlantFreqPcontrolIEC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindPlantFreqPcontrolIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(WindPlantFreqPcontrolIEC) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "WindPlantFreqPcontrolIEC";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
