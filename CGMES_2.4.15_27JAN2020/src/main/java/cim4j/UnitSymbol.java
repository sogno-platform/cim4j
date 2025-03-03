/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * The units defined for usage in the CIM.
 */
public class UnitSymbol extends BaseClass {

    private static final Logging LOG = Logging.getLogger(UnitSymbol.class);

    private enum UnitSymbol_ENUM {
        /**
         * Apparent power in volt ampere.
         */
        VA,
        /**
         * Active power in watt.
         */
        W,
        /**
         * Reactive power in volt ampere reactive.
         */
        VAr,
        /**
         * Apparent energy in volt ampere hours.
         */
        VAh,
        /**
         * Real energy in what hours.
         */
        Wh,
        /**
         * Reactive energy in volt ampere reactive hours.
         */
        VArh,
        /**
         * Voltage in volt.
         */
        V,
        /**
         * Resistance in ohm.
         */
        ohm,
        /**
         * Current in ampere.
         */
        A,
        /**
         * Capacitance in farad.
         */
        F,
        /**
         * Inductance in henry.
         */
        H,
        /**
         * Relative temperature in degrees Celsius. In the SI unit system the symbol is [SYMBOL REMOVED]C. Electric charge is measured in coulomb that has the unit symbol C. To distinguish degree Celsius form coulomb the symbol used in the UML is degC. Reason for not using [SYMBOL REMOVED]C is the special character [SYMBOL REMOVED] is difficult to manage in software.
         */
        degC,
        /**
         * Time in seconds.
         */
        s,
        /**
         * Time in minutes.
         */
        min,
        /**
         * Time in hours.
         */
        h,
        /**
         * Plane angle in degrees.
         */
        deg,
        /**
         * Plane angle in radians.
         */
        rad,
        /**
         * Energy in joule.
         */
        J,
        /**
         * Force in newton.
         */
        N,
        /**
         * Conductance in siemens.
         */
        S,
        /**
         * Dimension less quantity, e.g. count, per unit, etc.
         */
        none,
        /**
         * Frequency in hertz.
         */
        Hz,
        /**
         * Mass in gram.
         */
        g,
        /**
         * Pressure in pascal (n/m2).
         */
        Pa,
        /**
         * Length in meter.
         */
        m,
        /**
         * Area in square meters.
         */
        m2,
        /**
         * Volume in cubic meters.
         */
        m3,
        MAX_UnitSymbol_ENUM
    }

    private UnitSymbol_ENUM value;

    private boolean initialized = false;

    public UnitSymbol() {
    }

    public UnitSymbol(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new UnitSymbol();
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
            value = UnitSymbol_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "UnitSymbol";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
