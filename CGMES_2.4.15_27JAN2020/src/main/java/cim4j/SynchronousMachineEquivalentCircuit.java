/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The electrical equations for all variations of the synchronous models are based on the SynchronousEquivalentCircuit diagram for the direct and quadrature axes.    =  +   =  +  *  / ( + )  =  +  * *  / ( *  +  *  +  * )  =  +   =  +  *  / (+ )  =  +  **  / ( *  +  *  +  * )  = ( + ) / ( * )  = ( *  +  *  +  * ) / ( *  * ( + )  = ( + ) / ( * )  = ( *  +  *  +  * )/ ( *  * ( + ) Same equations using CIM attributes from SynchronousMachineTimeConstantReactance class on left of = sign and SynchronousMachineEquivalentCircuit class on right (except as noted): xDirectSync = xad + RotatingMachineDynamics.statorLeakageReactance xDirectTrans = RotatingMachineDynamics.statorLeakageReactance + xad * xfd / (xad + xfd) xDirectSubtrans = RotatingMachineDynamics.statorLeakageReactance + xad * xfd * x1d / (xad * xfd + xad * x1d + xfd * x1d) xQuadSync = xaq + RotatingMachineDynamics.statorLeakageReactance xQuadTrans = RotatingMachineDynamics.statorLeakageReactance + xaq * x1q / (xaq+ x1q) xQuadSubtrans = RotatingMachineDynamics.statorLeakageReactance + xaq * x1q* x2q / (xaq * x1q + xaq * x2q + x1q * x2q)  tpdo = (xad + xfd) / (2*pi*nominal frequency * rfd) tppdo = (xad * xfd + xad * x1d + xfd * x1d) / (2*pi*nominal frequency * r1d * (xad + xfd) tpqo = (xaq + x1q) / (2*pi*nominal frequency * r1q) tppqo = (xaq * x1q + xaq * x2q + x1q * x2q)/ (2*pi*nominal frequency * r2q * (xaq + x1q).  Are only valid for a simplified model where "Canay" reactance is zero.
 */
public class SynchronousMachineEquivalentCircuit extends SynchronousMachineDetailed {

	private static final Logging LOG = Logging.getLogger(SynchronousMachineEquivalentCircuit.class);

	private BaseClass[] SynchronousMachineEquivalentCircuit_class_attributes;
	private BaseClass[] SynchronousMachineEquivalentCircuit_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new SynchronousMachineEquivalentCircuit().getAttributeNamesMap();
	}

	private enum SynchronousMachineEquivalentCircuit_primitive_builder implements PrimitiveBuilder {
		r1d() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		r1q() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		r2q() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		rfd() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		x1d() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		x1q() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		x2q() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		xad() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		xaq() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		xf1d() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		xfd() {
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

	private enum SynchronousMachineEquivalentCircuit_class_attributes_enum {
		r1d,
		r1q,
		r2q,
		rfd,
		x1d,
		x1q,
		x2q,
		xad,
		xaq,
		xf1d,
		xfd,
		LAST_ENUM
	}

	public SynchronousMachineEquivalentCircuit() {
		SynchronousMachineEquivalentCircuit_primitive_attributes = new BaseClass[SynchronousMachineEquivalentCircuit_primitive_builder.values().length];
		SynchronousMachineEquivalentCircuit_class_attributes = new BaseClass[SynchronousMachineEquivalentCircuit_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new SynchronousMachineEquivalentCircuit();
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

	private void updateAttributeInArray(SynchronousMachineEquivalentCircuit_class_attributes_enum attrEnum, BaseClass value) {
		try {
			SynchronousMachineEquivalentCircuit_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(SynchronousMachineEquivalentCircuit_primitive_builder attrEnum, BaseClass value) {
		try {
			SynchronousMachineEquivalentCircuit_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			SynchronousMachineEquivalentCircuit_class_attributes_enum attrEnum = SynchronousMachineEquivalentCircuit_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated SynchronousMachineEquivalentCircuit, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SynchronousMachineEquivalentCircuit_primitive_builder attrEnum = SynchronousMachineEquivalentCircuit_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated SynchronousMachineEquivalentCircuit, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			SynchronousMachineEquivalentCircuit_primitive_builder attrEnum = SynchronousMachineEquivalentCircuit_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = SynchronousMachineEquivalentCircuit_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			SynchronousMachineEquivalentCircuit_class_attributes_enum attrEnum = SynchronousMachineEquivalentCircuit_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = SynchronousMachineEquivalentCircuit_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : SynchronousMachineEquivalentCircuit_primitive_builder.values()) {
			if (enumValue != SynchronousMachineEquivalentCircuit_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "SynchronousMachineEquivalentCircuit." + enumValue.name());
			}
		}
		for (var enumValue : SynchronousMachineEquivalentCircuit_class_attributes_enum.values()) {
			if (enumValue != SynchronousMachineEquivalentCircuit_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "SynchronousMachineEquivalentCircuit." + enumValue.name());
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
			for (SynchronousMachineEquivalentCircuit_primitive_builder attrEnum : SynchronousMachineEquivalentCircuit_primitive_builder.values()) {
				BaseClass bc = SynchronousMachineEquivalentCircuit_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SynchronousMachineEquivalentCircuit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (SynchronousMachineEquivalentCircuit_class_attributes_enum attrEnum : SynchronousMachineEquivalentCircuit_class_attributes_enum.values()) {
				BaseClass bc = SynchronousMachineEquivalentCircuit_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SynchronousMachineEquivalentCircuit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(SynchronousMachineEquivalentCircuit) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "SynchronousMachineEquivalentCircuit";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
