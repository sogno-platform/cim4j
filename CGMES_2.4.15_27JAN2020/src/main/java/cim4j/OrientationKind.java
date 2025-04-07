/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * The orientation of the coordinate system with respect to top, left, and the coordinate number system.
 */
public class OrientationKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(OrientationKind.class);

    private enum OrientationKind_ENUM {
        /**
         * For 2D diagrams, a negative orientation gives the left-hand orientation (favoured by computer graphics displays) with X values increasing from left to right and Y values increasing from top to bottom.   This is also known as a left hand orientation.
         */
        negative,
        MAX_OrientationKind_ENUM
    }

    private OrientationKind_ENUM value;

    private boolean initialized = false;

    public OrientationKind() {
    }

    public OrientationKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new OrientationKind();
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
            value = OrientationKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "OrientationKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
