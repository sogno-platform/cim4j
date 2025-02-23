/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * The unit multipliers defined for the CIM.
 */
public class UnitMultiplier extends BaseClass {

	private static final Logging LOG = Logging.getLogger(UnitMultiplier.class);

	private enum UnitMultiplier_ENUM {
		/**
		 * Pico 10**-12.
		 */
		p,
		/**
		 * Nano 10**-9.
		 */
		n,
		/**
		 * Micro 10**-6.
		 */
		micro,
		/**
		 * Milli 10**-3.
		 */
		m,
		/**
		 * Centi 10**-2.
		 */
		c,
		/**
		 * Deci 10**-1.
		 */
		d,
		/**
		 * Kilo 10**3.
		 */
		k,
		/**
		 * Mega 10**6.
		 */
		M,
		/**
		 * Giga 10**9.
		 */
		G,
		/**
		 * Tera 10**12.
		 */
		T,
		/**
		 * No multiplier or equivalently multiply by 1.
		 */
		none,
		MAX_UnitMultiplier_ENUM
	}

	private UnitMultiplier_ENUM value;

	private boolean initialized = false;

	public UnitMultiplier() {
	}

	public UnitMultiplier(java.lang.String s) {
		setValue(s);
	}

	@Override
	public BaseClass construct() {
		return new UnitMultiplier();
	}

	@Override
	public boolean isPrimitive() {
		return true;
	}

	@Override
	public boolean isInitialized() {
		return initialized;
	}

	@Override
	public void setValue(java.lang.String s) {
		try {
			value = UnitMultiplier_ENUM.valueOf(s.trim());
			initialized = true;
		} catch (IllegalArgumentException iae) {
			LOG.error("IllegalArgumentException: " + iae.getMessage());
		}
	}

	@Override
	public Object getValue() {
		return value.toString();
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attrName);
	}

	@Override
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attrName);
	}

	@Override
	public java.lang.String toString(boolean topClass) {
		return "Enum (" + value.toString() + ")";
	}

	private final java.lang.String debugName = "UnitMultiplier";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
