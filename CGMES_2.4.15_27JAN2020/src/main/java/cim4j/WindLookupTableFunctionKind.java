/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Function of the lookup table.
 */
public class WindLookupTableFunctionKind extends BaseClass {

	private static final Logging LOG = Logging.getLogger(WindLookupTableFunctionKind.class);

	private enum WindLookupTableFunctionKind_ENUM {
		/**
		 * Power versus slip lookup table (f()). It is used for rotor resistance control model, IEC 61400-27-1, section 6.6.5.2.
		 */
		fpslip,
		/**
		 * Power vs. speed lookup table (f()). It is used for P control model type 3, IEC 61400-27-1, section 6.6.5.3.
		 */
		fpomega,
		/**
		 * Lookup table for voltage dependency of active current limits (i()). It is used for current limitation model, IEC 61400-27-1, section 6.6.5.7.
		 */
		ipvdl,
		/**
		 * Lookup table for voltage dependency of reactive current limits (i()). It is used for current limitation model, IEC 61400-27-1, section 6.6.5.7.
		 */
		iqvdl,
		/**
		 * Power vs. frequency lookup table (()). It is used for wind power plant frequency and active power control model, IEC 61400-27-1, Annex E.
		 */
		fdpf,
		MAX_WindLookupTableFunctionKind_ENUM
	}

	private WindLookupTableFunctionKind_ENUM value;

	private boolean initialized = false;

	public WindLookupTableFunctionKind() {
	}

	public WindLookupTableFunctionKind(java.lang.String s) {
		setValue(s);
	}

	@Override
	public BaseClass construct() {
		return new WindLookupTableFunctionKind();
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
			value = WindLookupTableFunctionKind_ENUM.valueOf(s.trim());
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

	private final java.lang.String debugName = "WindLookupTableFunctionKind";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
