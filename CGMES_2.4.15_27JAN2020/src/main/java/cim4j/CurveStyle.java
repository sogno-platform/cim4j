/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Style or shape of curve.
 */
public class CurveStyle extends BaseClass {

    private static final Logging LOG = Logging.getLogger(CurveStyle.class);

    private enum CurveStyle_ENUM {
        /**
         * The Y-axis values are assumed constant until the next curve point and prior to the first curve point.
         */
        constantYValue,
        /**
         * The Y-axis values are assumed to be a straight line between values.  Also known as linear interpolation.
         */
        straightLineYValues,
        MAX_CurveStyle_ENUM
    }

    private CurveStyle_ENUM value;

    private boolean initialized = false;

    public CurveStyle() {
    }

    public CurveStyle(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new CurveStyle();
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
            value = CurveStyle_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "CurveStyle";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
