/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Types of connections for the UEL input used for static excitation systems type 7B.
 */
public class ExcST7BUELselectorKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(ExcST7BUELselectorKind.class);

    private enum ExcST7BUELselectorKind_ENUM {
        /**
         * No UEL input is used.  Corresponds to &lt;i&gt;UELin&lt;/i&gt; not = 1 and not = 2 and not = 3 on the ExcST7B diagram. Original ExcST7B model would have called this &lt;i&gt;UELin&lt;/i&gt; = 0.
         */
        noUELinput,
        /**
         * The signal is added to &lt;i&gt;Vref&lt;/i&gt;. Corresponds to &lt;i&gt;UELin&lt;/i&gt; = 1 on the ExcST7B diagram.
         */
        addVref,
        /**
         * The signal is connected into the input &lt;i&gt;HVGate&lt;/i&gt;.  Corresponds to &lt;i&gt;UELin&lt;/i&gt; = 2 on the ExcST7B diagram.
         */
        inputHVgate,
        /**
         * The signal is connected into the output &lt;i&gt;HVGate&lt;/i&gt;.  Corresponds to &lt;i&gt;UELin&lt;/i&gt; = 3 on the ExcST7B diagram.
         */
        outputHVgate,
        MAX_ExcST7BUELselectorKind_ENUM
    }

    private ExcST7BUELselectorKind_ENUM value;

    private boolean initialized = false;

    public ExcST7BUELselectorKind() {
    }

    public ExcST7BUELselectorKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new ExcST7BUELselectorKind();
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
            value = ExcST7BUELselectorKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "ExcST7BUELselectorKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
