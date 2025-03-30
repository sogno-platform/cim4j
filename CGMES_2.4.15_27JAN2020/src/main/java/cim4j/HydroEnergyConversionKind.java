/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Specifies the capability of the hydro generating unit to convert energy as a generator or pump.
 */
public class HydroEnergyConversionKind extends BaseClass {

	private static final Logging LOG = Logging.getLogger(HydroEnergyConversionKind.class);

	private enum HydroEnergyConversionKind_ENUM {
		/**
		 * Able to generate power, but not able to pump water for energy storage.
		 */
		generator,
		/**
		 * Able to both generate power and pump water for energy storage.
		 */
		pumpAndGenerator,
		MAX_HydroEnergyConversionKind_ENUM
	}

	private HydroEnergyConversionKind_ENUM value;

	private boolean initialized = false;

	public HydroEnergyConversionKind() {
	}

	public HydroEnergyConversionKind(java.lang.String s) {
		setValue(s);
	}

	@Override
	public BaseClass construct() {
		return new HydroEnergyConversionKind();
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
			value = HydroEnergyConversionKind_ENUM.valueOf(s.trim());
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

	private final java.lang.String debugName = "HydroEnergyConversionKind";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
