/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The over excitation limiter model is intended to represent the significant features of OELs necessary for some large-scale system studies. It is the result of a pragmatic approach to obtain a model that can be widely applied with attainable data from generator owners. An attempt to include all variations in the functionality of OELs and duplicate how they interact with the rest of the excitation systems would likely result in a level of application insufficient for the studies for which they are intended.  Reference: IEEE OEL 421.5-2005 Section 9.
 */
public class OverexcLimIEEE extends OverexcitationLimiterDynamics {

	private static final Logging LOG = Logging.getLogger(OverexcLimIEEE.class);

	private BaseClass[] OverexcLimIEEE_class_attributes;
	private BaseClass[] OverexcLimIEEE_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new OverexcLimIEEE().getAttributeNamesMap();
	}

	private enum OverexcLimIEEE_primitive_builder implements PrimitiveBuilder {
		hyst() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ifdlim() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ifdmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		itfpu() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kcd() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kramp() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum OverexcLimIEEE_class_attributes_enum {
		hyst,
		ifdlim,
		ifdmax,
		itfpu,
		kcd,
		kramp,
		LAST_ENUM
	}

	public OverexcLimIEEE() {
		OverexcLimIEEE_primitive_attributes = new BaseClass[OverexcLimIEEE_primitive_builder.values().length];
		OverexcLimIEEE_class_attributes = new BaseClass[OverexcLimIEEE_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new OverexcLimIEEE();
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

	private void updateAttributeInArray(OverexcLimIEEE_class_attributes_enum attrEnum, BaseClass value) {
		try {
			OverexcLimIEEE_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(OverexcLimIEEE_primitive_builder attrEnum, BaseClass value) {
		try {
			OverexcLimIEEE_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			OverexcLimIEEE_class_attributes_enum attrEnum = OverexcLimIEEE_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated OverexcLimIEEE, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			OverexcLimIEEE_primitive_builder attrEnum = OverexcLimIEEE_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated OverexcLimIEEE, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			OverexcLimIEEE_primitive_builder attrEnum = OverexcLimIEEE_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = OverexcLimIEEE_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			OverexcLimIEEE_class_attributes_enum attrEnum = OverexcLimIEEE_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = OverexcLimIEEE_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : OverexcLimIEEE_primitive_builder.values()) {
			if (enumValue != OverexcLimIEEE_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "OverexcLimIEEE." + enumValue.name());
			}
		}
		for (var enumValue : OverexcLimIEEE_class_attributes_enum.values()) {
			if (enumValue != OverexcLimIEEE_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "OverexcLimIEEE." + enumValue.name());
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
			for (OverexcLimIEEE_primitive_builder attrEnum : OverexcLimIEEE_primitive_builder.values()) {
				BaseClass bc = OverexcLimIEEE_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    OverexcLimIEEE." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (OverexcLimIEEE_class_attributes_enum attrEnum : OverexcLimIEEE_class_attributes_enum.values()) {
				BaseClass bc = OverexcLimIEEE_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    OverexcLimIEEE." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(OverexcLimIEEE) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "OverexcLimIEEE";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
