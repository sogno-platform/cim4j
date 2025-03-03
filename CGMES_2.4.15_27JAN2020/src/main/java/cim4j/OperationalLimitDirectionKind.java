/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * The direction attribute describes the side of  a limit that is a violation.
 */
public class OperationalLimitDirectionKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(OperationalLimitDirectionKind.class);

    private enum OperationalLimitDirectionKind_ENUM {
        /**
         * High means that a monitored value above the limit value is a violation.   If applied to a terminal flow, the positive direction is into the terminal.
         */
        high,
        /**
         * Low means a monitored value below the limit is a violation.  If applied to a terminal flow, the positive direction is into the terminal.
         */
        low,
        /**
         * An absoluteValue limit means that a monitored absolute value above the limit value is a violation.
         */
        absoluteValue,
        MAX_OperationalLimitDirectionKind_ENUM
    }

    private OperationalLimitDirectionKind_ENUM value;

    private boolean initialized = false;

    public OperationalLimitDirectionKind() {
    }

    public OperationalLimitDirectionKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new OperationalLimitDirectionKind();
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
            value = OperationalLimitDirectionKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "OperationalLimitDirectionKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
