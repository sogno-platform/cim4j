/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Source gives information related to the origin of a value.
 */
public class Source extends BaseClass {

    private static final Logging LOG = Logging.getLogger(Source.class);

    private enum Source_ENUM {
        /**
         * The value is provided by input from the process I/O or being calculated from some function.
         */
        PROCESS,
        /**
         * The value contains a default value.
         */
        DEFAULTED,
        /**
         * The value is provided by input of an operator or by an automatic source.
         */
        SUBSTITUTED,
        MAX_Source_ENUM
    }

    private Source_ENUM value;

    private boolean initialized = false;

    public Source() {
    }

    public Source(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new Source();
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
            value = Source_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "Source";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
