/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Limit kinds.
 */
public enum LimitKind {
    /**
     * The Permanent Admissible Transmission Loading (PATL) is the loading in amperes, MVA or MW that can be accepted by a network branch for an unlimited duration without any risk for the material. The OperationnalLimitType.isInfiniteDuration is set to true. There shall be only one OperationalLimitType of kind PATL per OperationalLimitSet if the PATL is ApparentPowerLimit, ActivePowerLimit, or CurrentLimit for a given Terminal or Equipment.
     */
    _patl("patl"),
    /**
     * Permanent Admissible Transmission Loading Threshold  (PATLT) is a value in engineering units defined for PATL and calculated using a percentage less than 100 % of the PATL type intended to alert operators of an arising condition. The percentage should be given in the name of the OperationalLimitSet. The aceptableDuration is another way to express the severity of the limit.
     */
    _patlt("patlt"),
    /**
     * Temporarily Admissible Transmission Loading (TATL) which is the loading in amperes, MVA or MW that can be accepted by a branch for a certain limited duration. The TATL can be defined in different ways: &lt;ul&gt; 	&lt;li&gt;as a fixed percentage of the PATL for a given time (for example, 115% of the PATL that can be accepted during 15 minutes),&lt;/li&gt; &lt;/ul&gt; &lt;ul&gt; 	&lt;li&gt;pairs of TATL type and Duration calculated for each line taking into account its particular configuration and conditions of functioning (for example, it can define a TATL acceptable during 20 minutes and another one acceptable during 10 minutes).&lt;/li&gt; &lt;/ul&gt; Such a definition of TATL can depend on the initial operating conditions of the network element (sag situation of a line). The duration attribute can be used to define several TATL limit types. Hence multiple TATL limit values may exist having different durations.
     */
    _tatl("tatl"),
    /**
     * Tripping Current (TC) is the ultimate intensity without any delay. It is defined as the threshold the line will trip without any possible remedial actions. The tripping of the network element is ordered by protections against short circuits or by overload protections, but in any case, the activation delay of these protections is not compatible with the reaction delay of an operator (less than one minute). The duration is always zero if the OperationalLimitType.acceptableDuration is exchanged. Only one limit value exists for the TC type.
     */
    _tc("tc"),
    /**
     * Tripping Current Threshold  (TCT) is a value in engineering units defined for TC and calculated using a percentage less than 100 % of the TC type intended to alert operators of an arising condition. The percentage should be given in the name of the OperationalLimitSet. The aceptableDuration is another way to express the severity of the limit.
     */
    _tct("tct"),
    /**
     * Referring to the rating of the equipments, a voltage too high can lead to accelerated ageing or the destruction of the equipment.  This limit type may or may not have duration.
     */
    _highVoltage("highVoltage"),
    /**
     * A too low voltage can disturb the normal operation of some protections and transformer equipped with on-load tap changers, electronic power devices or can affect the behaviour of the auxiliaries of generation units. This limit type may or may not have duration.
     */
    _lowVoltage("lowVoltage"),
    /**
     * Operational voltage limit.
     */
    _operationalVoltageLimit("operationalVoltageLimit"),
    /**
     * Voltage alarm.
     */
    _alarmVoltage("alarmVoltage"),
    /**
     * Voltage warning.
     */
    _warningVoltage("warningVoltage"),
    /**
     * Stability.
     */
    _stability("stability"),
    ;

    private final String value;

    private LimitKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static LimitKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, LimitKind> ENUM_MAP;
    static {
        var map = new HashMap<String, LimitKind>();
        for (LimitKind instance : LimitKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
