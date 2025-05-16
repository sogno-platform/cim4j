/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * UVRT Q control modes <i>M</i><i><sub>qUVRT</sub></i><i>.</i>
 */
public class WindUVRTQcontrolModeKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(WindUVRTQcontrolModeKind.class);

    private enum WindUVRTQcontrolModeKind_ENUM {
        /**
         * Voltage-dependent reactive current injection (&lt;i&gt;M&lt;/i&gt;&lt;i&gt;&lt;sub&gt;qUVRT&lt;/sub&gt;&lt;/i&gt; &lt;sub&gt; &lt;/sub&gt;equals 0).
         */
        mode0,
        /**
         * Reactive current injection controlled as the pre-fault value plus an additional voltage dependent reactive current injection (&lt;i&gt;M&lt;/i&gt;&lt;i&gt;&lt;sub&gt;qUVRT&lt;/sub&gt;&lt;/i&gt; equals 1).
         */
        mode1,
        /**
         * Reactive current injection controlled as the pre-fault value plus an additional voltage-dependent reactive current injection during fault, and as the pre-fault value plus an additional constant reactive current injection post fault (&lt;i&gt;M&lt;/i&gt;&lt;i&gt;&lt;sub&gt;qUVRT&lt;/sub&gt;&lt;/i&gt;&lt;sub&gt;  &lt;/sub&gt;equals 2).
         */
        mode2,
        MAX_WindUVRTQcontrolModeKind_ENUM
    }

    private WindUVRTQcontrolModeKind_ENUM value;

    private boolean initialized = false;

    public WindUVRTQcontrolModeKind() {
    }

    public WindUVRTQcontrolModeKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new WindUVRTQcontrolModeKind();
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
            value = WindUVRTQcontrolModeKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "WindUVRTQcontrolModeKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
