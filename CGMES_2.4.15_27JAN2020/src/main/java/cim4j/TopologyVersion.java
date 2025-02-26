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
public class TopologyVersion extends BaseClass {

	private static final Logging LOG = Logging.getLogger(TopologyVersion.class);

	private BaseClass[] TopologyVersion_class_attributes;
	private BaseClass[] TopologyVersion_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new TopologyVersion().getAttributeNamesMap();
	}

	private enum TopologyVersion_primitive_builder implements PrimitiveBuilder {
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

	private enum TopologyVersion_class_attributes_enum {
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

	public TopologyVersion() {
		TopologyVersion_primitive_attributes = new BaseClass[TopologyVersion_primitive_builder.values().length];
		TopologyVersion_class_attributes = new BaseClass[TopologyVersion_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new TopologyVersion();
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

	private void updateAttributeInArray(TopologyVersion_class_attributes_enum attrEnum, BaseClass value) {
		try {
			TopologyVersion_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(TopologyVersion_primitive_builder attrEnum, BaseClass value) {
		try {
			TopologyVersion_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			TopologyVersion_class_attributes_enum attrEnum = TopologyVersion_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated TopologyVersion, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			TopologyVersion_primitive_builder attrEnum = TopologyVersion_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated TopologyVersion, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			TopologyVersion_primitive_builder attrEnum = TopologyVersion_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = TopologyVersion_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			TopologyVersion_class_attributes_enum attrEnum = TopologyVersion_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = TopologyVersion_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : TopologyVersion_primitive_builder.values()) {
			if (enumValue != TopologyVersion_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "TopologyVersion." + enumValue.name());
			}
		}
		for (var enumValue : TopologyVersion_class_attributes_enum.values()) {
			if (enumValue != TopologyVersion_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "TopologyVersion." + enumValue.name());
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
			for (TopologyVersion_primitive_builder attrEnum : TopologyVersion_primitive_builder.values()) {
				BaseClass bc = TopologyVersion_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TopologyVersion." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (TopologyVersion_class_attributes_enum attrEnum : TopologyVersion_class_attributes_enum.values()) {
				BaseClass bc = TopologyVersion_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TopologyVersion." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(TopologyVersion) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "TopologyVersion";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
