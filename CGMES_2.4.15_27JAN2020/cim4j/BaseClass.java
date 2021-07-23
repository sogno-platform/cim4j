
package cim4j;

import java.util.Map;
import java.util.HashMap;

/* This class really only exists to make the code easier to generate.
   We can say that subclasses extend the BaseClass instead of identifying
   the classes one layer above this one and saying it implements the
   BaseClassInterface. */

public abstract class BaseClass implements BaseClassBuilder, AttributeInterface {

	public abstract BaseClass construct();

	public void setAttribute(java.lang.String s, BaseClass v) {
		System.out.println("No-one knows what to do with the attribute: " + s);
	}

	public void setAttribute(java.lang.String s, java.lang.String v) {
		System.out.println("No-one knows what to do with the attribute: " + s);
	}

	public abstract java.lang.String debugString();

	public java.lang.String listAttributes() {
		return "";
	}

	public java.lang.String toString() {
		return "";
	}
};

