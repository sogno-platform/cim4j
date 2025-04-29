/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Kind of wind generating unit.
 */
public class WindGenUnitKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(WindGenUnitKind.class);

    private enum WindGenUnitKind_ENUM {
        /**
         * The wind generating unit is located offshore.
         */
        offshore,
        /**
         * The wind generating unit is located onshore.
         */
        onshore,
        MAX_WindGenUnitKind_ENUM
    }

    private WindGenUnitKind_ENUM value;

    private boolean initialized = false;

    public WindGenUnitKind() {
    }

    public WindGenUnitKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new WindGenUnitKind();
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
            value = WindGenUnitKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "WindGenUnitKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
