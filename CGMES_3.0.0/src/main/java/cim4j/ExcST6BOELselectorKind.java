/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Types of connections for the OEL input used for static excitation systems type 6B.
 */
public class ExcST6BOELselectorKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(ExcST6BOELselectorKind.class);

    private enum ExcST6BOELselectorKind_ENUM {
        /**
         * No OEL input is used. Corresponds to &lt;i&gt;OELin&lt;/i&gt; not = 1 and not = 2 on the ExcST6B diagram. Original ExcST6B model would have called this &lt;i&gt;OELin&lt;/i&gt; = 0.
         */
        noOELinput,
        /**
         * The connection is before UEL. Corresponds to &lt;i&gt;OELin&lt;/i&gt; = 1 on the ExcST6B diagram.
         */
        beforeUEL,
        /**
         * The connection is after UEL. Corresponds to &lt;i&gt;OELin&lt;/i&gt; = 2 on the ExcST6B diagram.
         */
        afterUEL,
        MAX_ExcST6BOELselectorKind_ENUM
    }

    private ExcST6BOELselectorKind_ENUM value;

    private boolean initialized = false;

    public ExcST6BOELselectorKind() {
    }

    public ExcST6BOELselectorKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new ExcST6BOELselectorKind();
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
            value = ExcST6BOELselectorKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "ExcST6BOELselectorKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
