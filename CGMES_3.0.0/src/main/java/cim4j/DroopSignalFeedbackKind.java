/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Governor droop signal feedback source.
 */
public class DroopSignalFeedbackKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(DroopSignalFeedbackKind.class);

    private enum DroopSignalFeedbackKind_ENUM {
        /**
         * Electrical power feedback (connection indicated as 1 in the block diagrams of models, e.g. GovCT1, GovCT2).
         */
        electricalPower,
        /**
         * No droop signal feedback, is isochronous governor.
         */
        none,
        /**
         * Fuel valve stroke feedback (true stroke) (connection indicated as 2 in the block diagrams of model, e.g. GovCT1, GovCT2).
         */
        fuelValveStroke,
        /**
         * Governor output feedback (requested stroke) (connection indicated as 3 in the block diagrams of models, e.g. GovCT1, GovCT2).
         */
        governorOutput,
        MAX_DroopSignalFeedbackKind_ENUM
    }

    private DroopSignalFeedbackKind_ENUM value;

    private boolean initialized = false;

    public DroopSignalFeedbackKind() {
    }

    public DroopSignalFeedbackKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new DroopSignalFeedbackKind();
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
            value = DroopSignalFeedbackKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "DroopSignalFeedbackKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
