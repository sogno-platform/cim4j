/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Version details.
 */
public class SteadyStateHypothesisVersion extends BaseClass {

	private static final Logging LOG = Logging.getLogger(SteadyStateHypothesisVersion.class);

	private BaseClass[] SteadyStateHypothesisVersion_class_attributes;
	private BaseClass[] SteadyStateHypothesisVersion_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new SteadyStateHypothesisVersion().getAttributeNamesMap();
	}

	private enum SteadyStateHypothesisVersion_primitive_builder implements PrimitiveBuilder {
		baseUML() {
			public BaseClass construct(java.lang.String value) {
				return new String(value);
			}
		},
		baseURI() {
			public BaseClass construct(java.lang.String value) {
				return new String(value);
			}
		},
		date() {
			public BaseClass construct(java.lang.String value) {
				return new Date(value);
			}
		},
		differenceModelURI() {
			public BaseClass construct(java.lang.String value) {
				return new String(value);
			}
		},
		entsoeUML() {
			public BaseClass construct(java.lang.String value) {
				return new String(value);
			}
		},
		entsoeURI() {
			public BaseClass construct(java.lang.String value) {
				return new String(value);
			}
		},
		modelDescriptionURI() {
			public BaseClass construct(java.lang.String value) {
				return new String(value);
			}
		},
		namespaceRDF() {
			public BaseClass construct(java.lang.String value) {
				return new String(value);
			}
		},
		namespaceUML() {
			public BaseClass construct(java.lang.String value) {
				return new String(value);
			}
		},
		shortName() {
			public BaseClass construct(java.lang.String value) {
				return new String(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum SteadyStateHypothesisVersion_class_attributes_enum {
		baseUML,
		baseURI,
		date,
		differenceModelURI,
		entsoeUML,
		entsoeURI,
		modelDescriptionURI,
		namespaceRDF,
		namespaceUML,
		shortName,
		LAST_ENUM
	}

	public SteadyStateHypothesisVersion() {
		SteadyStateHypothesisVersion_primitive_attributes = new BaseClass[SteadyStateHypothesisVersion_primitive_builder.values().length];
		SteadyStateHypothesisVersion_class_attributes = new BaseClass[SteadyStateHypothesisVersion_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new SteadyStateHypothesisVersion();
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

	private void updateAttributeInArray(SteadyStateHypothesisVersion_class_attributes_enum attrEnum, BaseClass value) {
		try {
			SteadyStateHypothesisVersion_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(SteadyStateHypothesisVersion_primitive_builder attrEnum, BaseClass value) {
		try {
			SteadyStateHypothesisVersion_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			SteadyStateHypothesisVersion_class_attributes_enum attrEnum = SteadyStateHypothesisVersion_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated SteadyStateHypothesisVersion, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SteadyStateHypothesisVersion_primitive_builder attrEnum = SteadyStateHypothesisVersion_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated SteadyStateHypothesisVersion, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			SteadyStateHypothesisVersion_primitive_builder attrEnum = SteadyStateHypothesisVersion_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = SteadyStateHypothesisVersion_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			SteadyStateHypothesisVersion_class_attributes_enum attrEnum = SteadyStateHypothesisVersion_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = SteadyStateHypothesisVersion_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : SteadyStateHypothesisVersion_primitive_builder.values()) {
			if (enumValue != SteadyStateHypothesisVersion_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "SteadyStateHypothesisVersion." + enumValue.name());
			}
		}
		for (var enumValue : SteadyStateHypothesisVersion_class_attributes_enum.values()) {
			if (enumValue != SteadyStateHypothesisVersion_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "SteadyStateHypothesisVersion." + enumValue.name());
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
			for (SteadyStateHypothesisVersion_primitive_builder attrEnum : SteadyStateHypothesisVersion_primitive_builder.values()) {
				BaseClass bc = SteadyStateHypothesisVersion_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SteadyStateHypothesisVersion." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (SteadyStateHypothesisVersion_class_attributes_enum attrEnum : SteadyStateHypothesisVersion_class_attributes_enum.values()) {
				BaseClass bc = SteadyStateHypothesisVersion_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SteadyStateHypothesisVersion." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(SteadyStateHypothesisVersion) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "SteadyStateHypothesisVersion";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
