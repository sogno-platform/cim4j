/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The place, scene, or point of something where someone or something has been, is, and/or will be at a given moment in time. It can be defined with one or more postition points (coordinates) in a given coordinate system.
 */
public class Location extends IdentifiedObject {

	private static final Logging LOG = Logging.getLogger(Location.class);

	private BaseClass[] Location_class_attributes;
	private BaseClass[] Location_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new Location().getAttributeNamesMap();
	}

	private enum Location_primitive_builder implements PrimitiveBuilder {
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum Location_class_attributes_enum {
		CoordinateSystem,
		PositionPoints,
		PowerSystemResources,
		LAST_ENUM
	}

	public Location() {
		Location_primitive_attributes = new BaseClass[Location_primitive_builder.values().length];
		Location_class_attributes = new BaseClass[Location_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new Location();
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

	private void updateAttributeInArray(Location_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Location_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(Location_primitive_builder attrEnum, BaseClass value) {
		try {
			Location_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Location_class_attributes_enum attrEnum = Location_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated Location, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Location_primitive_builder attrEnum = Location_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated Location, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			Location_primitive_builder attrEnum = Location_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = Location_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			Location_class_attributes_enum attrEnum = Location_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = Location_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : Location_primitive_builder.values()) {
			if (enumValue != Location_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "Location." + enumValue.name());
			}
		}
		for (var enumValue : Location_class_attributes_enum.values()) {
			if (enumValue != Location_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "Location." + enumValue.name());
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
			for (Location_primitive_builder attrEnum : Location_primitive_builder.values()) {
				BaseClass bc = Location_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Location." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Location_class_attributes_enum attrEnum : Location_class_attributes_enum.values()) {
				BaseClass bc = Location_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Location." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(Location) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "Location";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
