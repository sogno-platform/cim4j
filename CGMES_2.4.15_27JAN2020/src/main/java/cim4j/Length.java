/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Unit of length. Never negative.
 */
public class Length extends BaseClass {

    private static final Logging LOG = Logging.getLogger(Length.class);

    private double value = 0.0;

    private boolean initialized = false;

    public Length() {
    }

    public Length(double v) {
        value = v;
        initialized = true;
    }

    public Length(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new Length();
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
            value = java.lang.Float.valueOf(s.trim()).floatValue();
            initialized = true;
        } catch (NumberFormatException nfe) {
            LOG.error("NumberFormatException: " + nfe.getMessage());
        }
    }

    @Override
    public Object getValue() {
        return Double.valueOf(value);
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        throw new IllegalArgumentException("Float class cannot set attribute: " + attrName);
    }

    @Override
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        throw new IllegalArgumentException("Float class cannot set attribute: " + attrName);
    }

    @Override
    public java.lang.String toString(boolean topClass) {
        return "Float: (" + Double.toString(value) + ")";
    }

    private final java.lang.String debugName = "Length";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
