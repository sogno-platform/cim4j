/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * A string consisting of a sequence of characters. The character encoding is UTF-8. The string length is unspecified and unlimited.
 */
public class String extends BaseClass {

    private java.lang.String value = "";

    private boolean initialized = false;

    public String() {
    }

    public String(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new String();
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

    private final java.lang.String debugName = "String";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
