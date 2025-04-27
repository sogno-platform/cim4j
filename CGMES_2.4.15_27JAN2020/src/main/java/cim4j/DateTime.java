/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Date and time as "yyyy-mm-ddThh:mm:ss.sss", which conforms with ISO 8601. UTC time zone is specified as "yyyy-mm-ddThh:mm:ss.sssZ". A local timezone relative UTC is specified as "yyyy-mm-ddThh:mm:ss.sss-hh:mm". The second component (shown here as "ss.sss") could have any number of digits in its fractional part to allow any kind of precision beyond seconds.
 */
public class DateTime extends BaseClass {

    private java.lang.String value = "";

    private boolean initialized = false;

    public DateTime() {
    }

    public DateTime(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new DateTime();
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
        value = s;
        initialized = true;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        throw new IllegalArgumentException("String class cannot set attribute: " + attrName);
    }

    @Override
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        throw new IllegalArgumentException("String class cannot set attribute: " + attrName);
    }

    @Override
    public java.lang.String toString(boolean topClass) {
        return value;
    }

    private final java.lang.String debugName = "DateTime";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
