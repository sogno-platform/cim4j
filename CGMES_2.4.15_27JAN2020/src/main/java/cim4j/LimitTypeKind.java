/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * The enumeration defines the kinds of the limit types.
 */
public class LimitTypeKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(LimitTypeKind.class);

    private enum LimitTypeKind_ENUM {
        /**
         * The Permanent Admissible Transmission Loading (PATL) is the loading in Amps, MVA or MW that can be accepted by a network branch for an unlimited duration without any risk for the material. The duration attribute is not used and shall be excluded for the PATL limit type. Hence only one limit value exists for the PATL type.
         */
        patl,
        /**
         * Permanent Admissible Transmission Loading Threshold  (PATLT) is a value in engineering units defined for PATL and calculated using percentage less than 100 of the PATL type intended to alert operators of an arising condition. The percentage should be given in the name of the OperationalLimitSet. The aceptableDuration is another way to express the severity of the limit.
         */
        patlt,
        /**
         * Temporarily Admissible Transmission Loading (TATL) which is the loading in Amps, MVA or MW that can be accepted by a branch for a certain limited duration. The TATL can be defined in different ways:   Such a definition of TATL can depend on the initial operating conditions of the network element (sag situation of a line). The duration attribute can be used define several TATL limit types. Hence multiple TATL limit values may exist having different durations.
         */
        tatl,
        /**
         * Tripping Current (TC) is the ultimate intensity without any delay. It is defined as the threshold the line will trip without any possible remedial actions. The tripping of the network element is ordered by protections against short circuits or by overload protections, but in any case, the activation delay of these protections is not compatible with the reaction delay of an operator (less than one minute). The duration is always zero and the duration attribute may be left out. Hence only one limit value exists for the TC type.
         */
        tc,
        /**
         * Tripping Current Threshold  (TCT) is a value in engineering units defined for TC and calculated using percentage less than 100 of the TC type intended to alert operators of an arising condition. The percentage should be given in the name of the OperationalLimitSet. The aceptableDuration is another way to express the severity of the limit.
         */
        tct,
        /**
         * Referring to the rating of the equipments, a voltage too high can lead to accelerated ageing or the destruction of the equipment.  This limit type may or may not have duration.
         */
        highVoltage,
        /**
         * A too low voltage can disturb the normal operation of some protections and transformer equipped with on-load tap changers, electronic power devices or can affect the behaviour of the auxiliaries of generation units. This limit type may or may not have duration.
         */
        lowVoltage,
        MAX_LimitTypeKind_ENUM
    }

    private LimitTypeKind_ENUM value;

    private boolean initialized = false;

    public LimitTypeKind() {
    }

    public LimitTypeKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new LimitTypeKind();
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
            value = LimitTypeKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "LimitTypeKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
