/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Type of fuel.
 */
public class FuelType extends BaseClass {

    private static final Logging LOG = Logging.getLogger(FuelType.class);

    private enum FuelType_ENUM {
        /**
         * Generic coal, not including lignite type.
         */
        coal,
        /**
         * Oil.
         */
        oil,
        /**
         * Natural gas.
         */
        gas,
        /**
         * The fuel is lignite coal.  Note that this is a special type of coal, so the other enum of coal is reserved for hard coal types or if the exact type of coal is not known.
         */
        lignite,
        /**
         * Hard coal.
         */
        hardCoal,
        /**
         * Oil Shale.
         */
        oilShale,
        /**
         * Brown coal lignite.
         */
        brownCoalLignite,
        /**
         * Coal derived gas.
         */
        coalDerivedGas,
        /**
         * Peat.
         */
        peat,
        /**
         * Any fuel type not included in the rest of the enumerated value.
         */
        other,
        MAX_FuelType_ENUM
    }

    private FuelType_ENUM value;

    private boolean initialized = false;

    public FuelType() {
    }

    public FuelType(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new FuelType();
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
            value = FuelType_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "FuelType";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
