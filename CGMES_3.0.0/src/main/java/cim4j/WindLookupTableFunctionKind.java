/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Function of the lookup table.
 */
public class WindLookupTableFunctionKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(WindLookupTableFunctionKind.class);

    private enum WindLookupTableFunctionKind_ENUM {
        /**
         * Power versus speed change (negative slip) lookup table (p&lt;sub&gt;rr&lt;/sub&gt;(deltaomega)). It is used for the rotor resistance control model, IEC 61400-27-1:2015, 5.6.5.3.
         */
        prr,
        /**
         * Power vs. speed lookup table (omega(p)). It is used for the P control model type 3, IEC 61400-27-1:2015, 5.6.5.4.
         */
        omegap,
        /**
         * Lookup table for voltage dependency of active current limits (i&lt;sub&gt;pmax&lt;/sub&gt;(u&lt;sub&gt;WT&lt;/sub&gt;)). It is used for the current limitation model, IEC 61400-27-1:2015, 5.6.5.8.
         */
        ipmax,
        /**
         * Lookup table for voltage dependency of reactive current limits (i&lt;sub&gt;qmax&lt;/sub&gt;(u&lt;sub&gt;WT&lt;/sub&gt;)). It is used for the current limitation model, IEC 61400-27-1:2015, 5.6.5.8.
         */
        iqmax,
        /**
         * Power vs. frequency lookup table (p&lt;sub&gt;WPbias&lt;/sub&gt;(f)). It is used for the wind power plant frequency and active power control model, IEC 61400-27-1:2015, Annex D.
         */
        pwp,
        /**
         * Crowbar duration versus voltage variation look-up table (T&lt;sub&gt;CW&lt;/sub&gt;(du)). It is a case-dependent parameter. It is used for the type 3B generator set model, IEC 61400-27-1:2015, 5.6.3.3.
         */
        tcwdu,
        /**
         * Lookup table to determine the duration of the power reduction after a voltage dip, depending on the size of the voltage dip (T&lt;sub&gt;d&lt;/sub&gt;(u&lt;sub&gt;WT&lt;/sub&gt;)). It is a type-dependent parameter. It is used for the pitch control power model, IEC 61400-27-1:2015, 5.6.5.1.
         */
        tduwt,
        /**
         * Lookup table for active power dependency of reactive power maximum limit (q&lt;sub&gt;maxp&lt;/sub&gt;(p)). It is used for the QP and QU limitation model, IEC 61400-27-1:2015, 5.6.5.10.
         */
        qmaxp,
        /**
         * Lookup table for active power dependency of reactive power minimum limit (q&lt;sub&gt;minp&lt;/sub&gt;(p)). It is used for the QP and QU limitation model, IEC 61400-27-1:2015, 5.6.5.10.
         */
        qminp,
        /**
         * Lookup table for voltage dependency of reactive power maximum limit (q&lt;sub&gt;maxu&lt;/sub&gt;(p)). It is used for the QP and QU limitation model, IEC 61400-27-1:2015, 5.6.5.10.
         */
        qmaxu,
        /**
         * Lookup table for voltage dependency of reactive power minimum limit (q&lt;sub&gt;minu&lt;/sub&gt;(p)). It is used for the QP and QU limitation model, IEC 61400-27-1:2015, 5.6.5.10.
         */
        qminu,
        /**
         * Disconnection time versus over-voltage lookup table (T&lt;sub&gt;uover&lt;/sub&gt;(u&lt;sub&gt;WT&lt;/sub&gt;)). It is used for the grid protection model, IEC 61400-27-1:2015, 5.6.6.
         */
        tuover,
        /**
         * Disconnection time versus under-voltage lookup table (T&lt;sub&gt;uunder&lt;/sub&gt;(u&lt;sub&gt;WT&lt;/sub&gt;)). It is used for the grid protection model, IEC 61400-27-1:2015, 5.6.6.
         */
        tuunder,
        /**
         * Disconnection time versus over-frequency lookup table (T&lt;sub&gt;fover&lt;/sub&gt;(f&lt;sub&gt;WT&lt;/sub&gt;)). It is used for the grid protection model, IEC 61400-27-1:2015, 5.6.6.
         */
        tfover,
        /**
         * Disconnection time versus under-frequency lookup table (T&lt;sub&gt;funder&lt;/sub&gt;(f&lt;sub&gt;WT&lt;/sub&gt;)). It is used for the grid protection model, IEC 61400-27-1:2015, 5.6.6.
         */
        tfunder,
        /**
         * Look up table for the UQ static mode (q&lt;sub&gt;WP&lt;/sub&gt;(u&lt;sub&gt;err&lt;/sub&gt;)). It is used for the voltage and reactive power control model, IEC 61400-27-1:2015, Annex D.
         */
        qwp,
        MAX_WindLookupTableFunctionKind_ENUM
    }

    private WindLookupTableFunctionKind_ENUM value;

    private boolean initialized = false;

    public WindLookupTableFunctionKind() {
    }

    public WindLookupTableFunctionKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new WindLookupTableFunctionKind();
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
            value = WindLookupTableFunctionKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "WindLookupTableFunctionKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
