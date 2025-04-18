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
public class GeographicalLocationVersion extends BaseClass {

	private static final Logging LOG = Logging.getLogger(GeographicalLocationVersion.class);

	private BaseClass[] GeographicalLocationVersion_class_attributes;
	private BaseClass[] GeographicalLocationVersion_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new GeographicalLocationVersion().getAttributeNamesMap();
	}

	private enum GeographicalLocationVersion_primitive_builder implements PrimitiveBuilder {
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

	private enum GeographicalLocationVersion_class_attributes_enum {
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

	public GeographicalLocationVersion() {
		GeographicalLocationVersion_primitive_attributes = new BaseClass[GeographicalLocationVersion_primitive_builder.values().length];
		GeographicalLocationVersion_class_attributes = new BaseClass[GeographicalLocationVersion_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new GeographicalLocationVersion();
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

	private void updateAttributeInArray(GeographicalLocationVersion_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GeographicalLocationVersion_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(GeographicalLocationVersion_primitive_builder attrEnum, BaseClass value) {
		try {
			GeographicalLocationVersion_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GeographicalLocationVersion_class_attributes_enum attrEnum = GeographicalLocationVersion_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated GeographicalLocationVersion, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GeographicalLocationVersion_primitive_builder attrEnum = GeographicalLocationVersion_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated GeographicalLocationVersion, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			GeographicalLocationVersion_primitive_builder attrEnum = GeographicalLocationVersion_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GeographicalLocationVersion_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			GeographicalLocationVersion_class_attributes_enum attrEnum = GeographicalLocationVersion_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = GeographicalLocationVersion_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : GeographicalLocationVersion_primitive_builder.values()) {
			if (enumValue != GeographicalLocationVersion_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GeographicalLocationVersion." + enumValue.name());
			}
		}
		for (var enumValue : GeographicalLocationVersion_class_attributes_enum.values()) {
			if (enumValue != GeographicalLocationVersion_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "GeographicalLocationVersion." + enumValue.name());
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
			for (GeographicalLocationVersion_primitive_builder attrEnum : GeographicalLocationVersion_primitive_builder.values()) {
				BaseClass bc = GeographicalLocationVersion_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GeographicalLocationVersion." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GeographicalLocationVersion_class_attributes_enum attrEnum : GeographicalLocationVersion_class_attributes_enum.values()) {
				BaseClass bc = GeographicalLocationVersion_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GeographicalLocationVersion." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(GeographicalLocationVersion) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "GeographicalLocationVersion";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
