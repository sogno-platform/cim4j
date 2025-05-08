/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * The source of controls for a generating unit.
 */
public class GeneratorControlSource extends BaseClass {

    private static final Logging LOG = Logging.getLogger(GeneratorControlSource.class);

    private enum GeneratorControlSource_ENUM {
        /**
         * Not available.
         */
        unavailable,
        /**
         * Off of automatic generation control (AGC).
         */
        offAGC,
        /**
         * On automatic generation control (AGC).
         */
        onAGC,
        /**
         * Plant is controlling.
         */
        plantControl,
        MAX_GeneratorControlSource_ENUM
    }

    private GeneratorControlSource_ENUM value;

    private boolean initialized = false;

    public GeneratorControlSource() {
    }

    public GeneratorControlSource(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new GeneratorControlSource();
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
            value = GeneratorControlSource_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "GeneratorControlSource";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
