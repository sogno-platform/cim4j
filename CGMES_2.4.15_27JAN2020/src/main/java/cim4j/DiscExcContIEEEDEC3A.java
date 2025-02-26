/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents IEEE Type DEC3A model. In some systems, the stabilizer output is disconnected from the regulator immediately following a severe fault to prevent the stabilizer from competing with action of voltage regulator during the first swing.  Reference: IEEE Standard 421.5-2005 Section 12.4.
 */
public class DiscExcContIEEEDEC3A extends DiscontinuousExcitationControlDynamics {

	private static final Logging LOG = Logging.getLogger(DiscExcContIEEEDEC3A.class);

	private BaseClass[] DiscExcContIEEEDEC3A_class_attributes;
	private BaseClass[] DiscExcContIEEEDEC3A_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new DiscExcContIEEEDEC3A().getAttributeNamesMap();
	}

	private enum DiscExcContIEEEDEC3A_primitive_builder implements PrimitiveBuilder {
		tdr() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		vtmin() {
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

	private enum DiscExcContIEEEDEC3A_class_attributes_enum {
		tdr,
		vtmin,
		LAST_ENUM
	}

	public DiscExcContIEEEDEC3A() {
		DiscExcContIEEEDEC3A_primitive_attributes = new BaseClass[DiscExcContIEEEDEC3A_primitive_builder.values().length];
		DiscExcContIEEEDEC3A_class_attributes = new BaseClass[DiscExcContIEEEDEC3A_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new DiscExcContIEEEDEC3A();
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

	private void updateAttributeInArray(DiscExcContIEEEDEC3A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DiscExcContIEEEDEC3A_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(DiscExcContIEEEDEC3A_primitive_builder attrEnum, BaseClass value) {
		try {
			DiscExcContIEEEDEC3A_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DiscExcContIEEEDEC3A_class_attributes_enum attrEnum = DiscExcContIEEEDEC3A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated DiscExcContIEEEDEC3A, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DiscExcContIEEEDEC3A_primitive_builder attrEnum = DiscExcContIEEEDEC3A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated DiscExcContIEEEDEC3A, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			DiscExcContIEEEDEC3A_primitive_builder attrEnum = DiscExcContIEEEDEC3A_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = DiscExcContIEEEDEC3A_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			DiscExcContIEEEDEC3A_class_attributes_enum attrEnum = DiscExcContIEEEDEC3A_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = DiscExcContIEEEDEC3A_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : DiscExcContIEEEDEC3A_primitive_builder.values()) {
			if (enumValue != DiscExcContIEEEDEC3A_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "DiscExcContIEEEDEC3A." + enumValue.name());
			}
		}
		for (var enumValue : DiscExcContIEEEDEC3A_class_attributes_enum.values()) {
			if (enumValue != DiscExcContIEEEDEC3A_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "DiscExcContIEEEDEC3A." + enumValue.name());
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
			for (DiscExcContIEEEDEC3A_primitive_builder attrEnum : DiscExcContIEEEDEC3A_primitive_builder.values()) {
				BaseClass bc = DiscExcContIEEEDEC3A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DiscExcContIEEEDEC3A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DiscExcContIEEEDEC3A_class_attributes_enum attrEnum : DiscExcContIEEEDEC3A_class_attributes_enum.values()) {
				BaseClass bc = DiscExcContIEEEDEC3A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DiscExcContIEEEDEC3A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(DiscExcContIEEEDEC3A) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "DiscExcContIEEEDEC3A";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
