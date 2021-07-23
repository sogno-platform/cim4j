package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Monetary currencies. Apologies for this list not being exhaustive.
*/
public class Currency extends BaseClass
{
	private enum Currency_ENUM
	{
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
			MAX_Currency_ENUM;
	}

	private Currency_ENUM value;

	public BaseClass construct() {
		return new Currency();
        }

	public Currency() {}

	public Currency(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = Currency_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = Currency_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "Currency";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString() {
		return "";
	}
};

