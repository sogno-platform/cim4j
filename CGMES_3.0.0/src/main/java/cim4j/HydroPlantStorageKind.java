/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * The type of hydro power plant.
 */
public class HydroPlantStorageKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(HydroPlantStorageKind.class);

    private enum HydroPlantStorageKind_ENUM {
        /**
         * Run of river.
         */
        runOfRiver,
        /**
         * Pumped storage.
         */
        pumpedStorage,
        /**
         * Storage.
         */
        storage,
        MAX_HydroPlantStorageKind_ENUM
    }

    private HydroPlantStorageKind_ENUM value;

    private boolean initialized = false;

    public HydroPlantStorageKind() {
    }

    public HydroPlantStorageKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new HydroPlantStorageKind();
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
            value = HydroPlantStorageKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "HydroPlantStorageKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
