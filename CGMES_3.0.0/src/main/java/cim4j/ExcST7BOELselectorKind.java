/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Types of connections for the OEL input used for static excitation systems type 7B.
 */
public class ExcST7BOELselectorKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(ExcST7BOELselectorKind.class);

    private enum ExcST7BOELselectorKind_ENUM {
        /**
         * No OEL input is used. Corresponds to &lt;i&gt;OELin&lt;/i&gt; not = 1 and not = 2 and not = 3 on the ExcST7B diagram. Original ExcST7B model would have called this &lt;i&gt;OELin&lt;/i&gt; = 0.
         */
        noOELinput,
        /**
         * The signal is added to &lt;i&gt;Vref&lt;/i&gt;.  Corresponds to &lt;i&gt;OELin&lt;/i&gt; = 1 on the ExcST7B diagram.
         */
        addVref,
        /**
         * The signal is connected into the input &lt;i&gt;LVGate&lt;/i&gt;. Corresponds to &lt;i&gt;OELin&lt;/i&gt; = 2 on the ExcST7B diagram.
         */
        inputLVgate,
        /**
         * The signal is connected into the output &lt;i&gt;LVGate&lt;/i&gt;.  Corresponds to &lt;i&gt;OELin&lt;/i&gt; = 3 on the ExcST7B diagram.
         */
        outputLVgate,
        MAX_ExcST7BOELselectorKind_ENUM
    }

    private ExcST7BOELselectorKind_ENUM value;

    private boolean initialized = false;

    public ExcST7BOELselectorKind() {
    }

    public ExcST7BOELselectorKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new ExcST7BOELselectorKind();
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
            value = ExcST7BOELselectorKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "ExcST7BOELselectorKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
