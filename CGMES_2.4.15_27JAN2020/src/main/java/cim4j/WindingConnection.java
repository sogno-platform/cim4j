/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Winding connection type.
 */
public class WindingConnection extends BaseClass {

	private static final Logging LOG = Logging.getLogger(WindingConnection.class);

	private enum WindingConnection_ENUM {
		/**
		 * Delta
		 */
		D,
		/**
		 * Wye
		 */
		Y,
		/**
		 * ZigZag
		 */
		Z,
		/**
		 * Wye, with neutral brought out for grounding.
		 */
		Yn,
		/**
		 * ZigZag, with neutral brought out for grounding.
		 */
		Zn,
		/**
		 * Autotransformer common winding
		 */
		A,
		/**
		 * Independent winding, for single-phase connections
		 */
		I,
		MAX_WindingConnection_ENUM
	}

	private WindingConnection_ENUM value;

	private boolean initialized = false;

	public WindingConnection() {
	}

	public WindingConnection(java.lang.String s) {
		setValue(s);
	}

	@Override
	public BaseClass construct() {
		return new WindingConnection();
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
			value = WindingConnection_ENUM.valueOf(s.trim());
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

	private final java.lang.String debugName = "WindingConnection";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
