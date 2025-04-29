/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * General wind turbine Q control modes <i>M</i><i><sub>qG</sub></i><i>.</i>
 */
public class WindQcontrolModeKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(WindQcontrolModeKind.class);

    private enum WindQcontrolModeKind_ENUM {
        /**
         * Voltage control (&lt;i&gt;M&lt;/i&gt;&lt;i&gt;&lt;sub&gt;qG&lt;/sub&gt;&lt;/i&gt; equals 0).
         */
        voltage,
        /**
         * Reactive power control (&lt;i&gt;M&lt;/i&gt;&lt;i&gt;&lt;sub&gt;qG&lt;/sub&gt;&lt;/i&gt; equals 1).
         */
        reactivePower,
        /**
         * Open loop reactive power control (only used with closed loop at plant level) (&lt;i&gt;M&lt;/i&gt;&lt;i&gt;&lt;sub&gt;qG&lt;/sub&gt;&lt;/i&gt;&lt;sub&gt; &lt;/sub&gt;equals 2).
         */
        openLoopReactivePower,
        /**
         * Power factor control (&lt;i&gt;M&lt;/i&gt;&lt;i&gt;&lt;sub&gt;qG&lt;/sub&gt;&lt;/i&gt;&lt;sub&gt; &lt;/sub&gt;equals 3).
         */
        powerFactor,
        /**
         * Open loop power factor control (&lt;i&gt;M&lt;/i&gt;&lt;i&gt;&lt;sub&gt;qG&lt;/sub&gt;&lt;/i&gt;&lt;sub&gt; &lt;/sub&gt;equals 4).
         */
        openLooppowerFactor,
        MAX_WindQcontrolModeKind_ENUM
    }

    private WindQcontrolModeKind_ENUM value;

    private boolean initialized = false;

    public WindQcontrolModeKind() {
    }

    public WindQcontrolModeKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new WindQcontrolModeKind();
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
            value = WindQcontrolModeKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "WindQcontrolModeKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
