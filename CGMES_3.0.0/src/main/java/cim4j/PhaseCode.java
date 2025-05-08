/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * An unordered enumeration of phase identifiers.  Allows designation of phases for both transmission and distribution equipment, circuits and loads.   The enumeration, by itself, does not describe how the phases are connected together or connected to ground.  Ground is not explicitly denoted as a phase. Residential and small commercial loads are often served from single-phase, or split-phase, secondary circuits. For the example of s12N, phases 1 and 2 refer to hot wires that are 180 degrees out of phase, while N refers to the neutral wire. Through single-phase transformer connections, these secondary circuits may be served from one or two of the primary phases A, B, and C. For three-phase loads, use the A, B, C phase codes instead of s12N. The integer values are from IEC 61968-9 to support revenue metering applications.
 */
public class PhaseCode extends BaseClass {

    private static final Logging LOG = Logging.getLogger(PhaseCode.class);

    private enum PhaseCode_ENUM {
        /**
         * Phases A, B, C, and N.
         */
        ABCN,
        /**
         * Phases A, B, and C.
         */
        ABC,
        /**
         * Phases A, B, and neutral.
         */
        ABN,
        /**
         * Phases A, C and neutral.
         */
        ACN,
        /**
         * Phases B, C, and neutral.
         */
        BCN,
        /**
         * Phases A and B.
         */
        AB,
        /**
         * Phases A and C.
         */
        AC,
        /**
         * Phases B and C.
         */
        BC,
        /**
         * Phases A and neutral.
         */
        AN,
        /**
         * Phases B and neutral.
         */
        BN,
        /**
         * Phases C and neutral.
         */
        CN,
        /**
         * Phase A.
         */
        A,
        /**
         * Phase B.
         */
        B,
        /**
         * Phase C.
         */
        C,
        /**
         * Neutral phase.
         */
        N,
        /**
         * Secondary phase 1 and neutral.
         */
        s1N,
        /**
         * Secondary phase 2 and neutral.
         */
        s2N,
        /**
         * Secondary phases 1, 2, and neutral.
         */
        s12N,
        /**
         * Secondary phase 1.
         */
        s1,
        /**
         * Secondary phase 2.
         */
        s2,
        /**
         * Secondary phase 1 and 2.
         */
        s12,
        /**
         * No phases specified.
         */
        none,
        /**
         * Unknown non-neutral phase.
         */
        X,
        /**
         * Two unknown non-neutral phases.
         */
        XY,
        /**
         * Unknown non-neutral phase plus neutral.
         */
        XN,
        /**
         * Two unknown non-neutral phases plus neutral.
         */
        XYN,
        MAX_PhaseCode_ENUM
    }

    private PhaseCode_ENUM value;

    private boolean initialized = false;

    public PhaseCode() {
    }

    public PhaseCode(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new PhaseCode();
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
            value = PhaseCode_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "PhaseCode";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
