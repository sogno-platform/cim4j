/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Validity for MeasurementValue.
 */
public class Validity extends BaseClass {

    private static final Logging LOG = Logging.getLogger(Validity.class);

    private enum Validity_ENUM {
        /**
         * The value is marked good if no abnormal condition of the acquisition function or the information source is detected.
         */
        GOOD,
        /**
         * The value is marked questionable if a supervision function detects an abnormal behaviour, however the value could still be valid. The client is responsible for determining whether or not values marked &quot;questionable&quot; should be used.
         */
        QUESTIONABLE,
        /**
         * The value is marked invalid when a supervision function recognises abnormal conditions of the acquisition function or the information source (missing or non-operating updating devices). The value is not defined under this condition. The mark invalid is used to indicate to the client that the value may be incorrect and shall not be used.
         */
        INVALID,
        MAX_Validity_ENUM
    }

    private Validity_ENUM value;

    private boolean initialized = false;

    public Validity() {
    }

    public Validity(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new Validity();
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
            value = Validity_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "Validity";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
