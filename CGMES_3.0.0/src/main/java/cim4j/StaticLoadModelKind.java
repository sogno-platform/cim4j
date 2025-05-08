/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Type of static load model.
 */
public class StaticLoadModelKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(StaticLoadModelKind.class);

    private enum StaticLoadModelKind_ENUM {
        /**
         * This model is an exponential representation of the load. Exponential equations for active and reactive power are used and the following attributes are required: kp1, kp2, kp3, kpf, ep1, ep2, ep3 kq1, kq2, kq3, kqf, eq1, eq2, eq3.
         */
        exponential,
        /**
         * This model integrates the frequency-dependent load (primarily motors).  ZIP1 equations for active and reactive power are used and the following attributes are required: kp1, kp2, kp3, kpf kq1, kq2, kq3, kqf.
         */
        zIP1,
        /**
         * This model separates the frequency-dependent load (primarily motors) from other load.  ZIP2 equations for active and reactive power are used and the following attributes are required: kp1, kp2, kp3, kq4, kpf kq1, kq2, kq3, kq4, kqf.
         */
        zIP2,
        /**
         * The load is represented as a constant impedance.  ConstantZ equations are used  for active and reactive power and no attributes are required.
         */
        constantZ,
        MAX_StaticLoadModelKind_ENUM
    }

    private StaticLoadModelKind_ENUM value;

    private boolean initialized = false;

    public StaticLoadModelKind() {
    }

    public StaticLoadModelKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new StaticLoadModelKind();
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
            value = StaticLoadModelKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "StaticLoadModelKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
