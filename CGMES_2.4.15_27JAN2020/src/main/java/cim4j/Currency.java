/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Monetary currencies. Apologies for this list not being exhaustive.
 */
public class Currency extends BaseClass {

	private static final Logging LOG = Logging.getLogger(Currency.class);

	private enum Currency_ENUM {
		/**
		 * US dollar
		 */
		USD,
		/**
		 * European euro
		 */
		EUR,
		/**
		 * Australian dollar
		 */
		AUD,
		/**
		 * Canadian dollar
		 */
		CAD,
		/**
		 * Swiss francs
		 */
		CHF,
		/**
		 * Chinese yuan renminbi
		 */
		CNY,
		/**
		 * Danish crown
		 */
		DKK,
		/**
		 * British pound
		 */
		GBP,
		/**
		 * Japanese yen
		 */
		JPY,
		/**
		 * Norwegian crown
		 */
		NOK,
		/**
		 * Russian ruble
		 */
		RUR,
		/**
		 * Swedish crown
		 */
		SEK,
		/**
		 * India rupees
		 */
		INR,
		/**
		 * Another type of currency.
		 */
		other,
		MAX_Currency_ENUM
	}

	private Currency_ENUM value;

	private boolean initialized = false;

	public Currency() {
	}

	public Currency(java.lang.String s) {
		setValue(s);
	}

	@Override
	public BaseClass construct() {
		return new Currency();
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
			value = Currency_ENUM.valueOf(s.trim());
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

	private final java.lang.String debugName = "Currency";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
