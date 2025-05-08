/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * The unit multipliers defined for the CIM.  When applied to unit symbols, the unit symbol is treated as a derived unit. Regardless of the contents of the unit symbol text, the unit symbol shall be treated as if it were a single-character unit symbol. Unit symbols should not contain multipliers, and it should be left to the multiplier to define the multiple for an entire data type.   For example, if a unit symbol is "m2Pers" and the multiplier is "k", then the value is k(m**2/s), and the multiplier applies to the entire final value, not to any individual part of the value. This can be conceptualized by substituting a derived unit symbol for the unit type. If one imagines that the symbol "Þ" represents the derived unit "m2Pers", then applying the multiplier "k" can be conceptualized simply as "kÞ".  For example, the SI unit for mass is "kg" and not "g".  If the unit symbol is defined as "kg", then the multiplier is applied to "kg" as a whole and does not replace the "k" in front of the "g". In this case, the multiplier of "m" would be used with the unit symbol of "kg" to represent one gram.  As a text string, this violates the instructions in IEC 80000-1. However, because the unit symbol in CIM is treated as a derived unit instead of as an SI unit, it makes more sense to conceptualize the "kg" as if it were replaced by one of the proposed replacements for the SI mass symbol. If one imagines that the "kg" were replaced by a symbol "Þ", then it is easier to conceptualize the multiplier "m" as creating the proper unit "mÞ", and not the forbidden unit "mkg".
 */
public class UnitMultiplier extends BaseClass {

    private static final Logging LOG = Logging.getLogger(UnitMultiplier.class);

    private enum UnitMultiplier_ENUM {
        /**
         * Yocto 10**-24.
         */
        y,
        /**
         * Zepto 10**-21.
         */
        z,
        /**
         * Atto 10**-18.
         */
        a,
        /**
         * Femto 10**-15.
         */
        f,
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
         * No multiplier or equivalently multiply by 1.
         */
        none,
        /**
         * Deca 10**1.
         */
        da,
        /**
         * Hecto 10**2.
         */
        h,
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
         * Peta 10**15.
         */
        P,
        /**
         * Exa 10**18.
         */
        E,
        /**
         * Zetta 10**21.
         */
        Z,
        /**
         * Yotta 10**24.
         */
        Y,
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
