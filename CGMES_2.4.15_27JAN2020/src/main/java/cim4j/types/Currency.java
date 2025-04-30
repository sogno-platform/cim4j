/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Monetary currencies. Apologies for this list not being exhaustive.
 */
public enum Currency {
    /**
     * US dollar
     */
    _USD("USD"),
    /**
     * European euro
     */
    _EUR("EUR"),
    /**
     * Australian dollar
     */
    _AUD("AUD"),
    /**
     * Canadian dollar
     */
    _CAD("CAD"),
    /**
     * Swiss francs
     */
    _CHF("CHF"),
    /**
     * Chinese yuan renminbi
     */
    _CNY("CNY"),
    /**
     * Danish crown
     */
    _DKK("DKK"),
    /**
     * British pound
     */
    _GBP("GBP"),
    /**
     * Japanese yen
     */
    _JPY("JPY"),
    /**
     * Norwegian crown
     */
    _NOK("NOK"),
    /**
     * Russian ruble
     */
    _RUR("RUR"),
    /**
     * Swedish crown
     */
    _SEK("SEK"),
    /**
     * India rupees
     */
    _INR("INR"),
    /**
     * Another type of currency.
     */
    _other("other"),
    ;

    private final String value;

    private Currency(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static Currency fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, Currency> ENUM_MAP;
    static {
        var map = new HashMap<String, Currency>();
        for (Currency instance : Currency.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
