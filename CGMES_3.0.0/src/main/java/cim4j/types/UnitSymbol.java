/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The derived units defined for usage in the CIM. In some cases, the derived unit is equal to an SI unit. Whenever possible, the standard derived symbol is used instead of the formula for the derived unit. For example, the unit symbol Farad is defined as "F" instead of "CPerV". In cases where a standard symbol does not exist for a derived unit, the formula for the unit is used as the unit symbol. For example, density does not have a standard symbol and so it is represented as "kgPerm3". With the exception of the "kg", which is an SI unit, the unit symbols do not contain multipliers and therefore represent the base derived unit to which a multiplier can be applied as a whole.  Every unit symbol is treated as an unparseable text as if it were a single-letter symbol. The meaning of each unit symbol is defined by the accompanying descriptive text and not by the text contents of the unit symbol. To allow the widest possible range of serializations without requiring special character handling, several substitutions are made which deviate from the format described in IEC 80000-1. The division symbol "/" is replaced by the letters "Per". Exponents are written in plain text after the unit as "m3" instead of being formatted as "m" with a superscript of 3  or introducing a symbol as in "m^3". The degree symbol "[SYMBOL REMOVED]" is replaced with the letters "deg". Any clarification of the meaning for a substitution is included in the description for the unit symbol. Non-SI units are included in list of unit symbols to allow sources of data to be correctly labelled with their non-SI units (for example, a GPS sensor that is reporting numbers that represent feet instead of meters). This allows software to use the unit symbol information correctly convert and scale the raw data of those sources into SI-based units.  The integer values are used for harmonization with IEC 61850.
 */
public enum UnitSymbol {
    /**
     * Dimension less quantity, e.g. count, per unit, etc.
     */
    _none("none"),
    /**
     * Length in metres.
     */
    _m("m"),
    /**
     * Mass in kilograms.  Note: multiplier &quot;k&quot; is included in this unit symbol for compatibility with IEC 61850-7-3.
     */
    _kg("kg"),
    /**
     * Time in seconds.
     */
    _s("s"),
    /**
     * Current in amperes.
     */
    _A("A"),
    /**
     * Temperature in kelvins.
     */
    _K("K"),
    /**
     * Amount of substance in moles.
     */
    _mol("mol"),
    /**
     * Luminous intensity in candelas.
     */
    _cd("cd"),
    /**
     * Plane angle in degrees.
     */
    _deg("deg"),
    /**
     * Plane angle in radians (m/m).
     */
    _rad("rad"),
    /**
     * Solid angle in steradians (m2/m2).
     */
    _sr("sr"),
    /**
     * Absorbed dose in grays (J/kg).
     */
    _Gy("Gy"),
    /**
     * Radioactivity in becquerels (1/s).
     */
    _Bq("Bq"),
    /**
     * Relative temperature in degrees Celsius. In the SI unit system the symbol is [SYMBOL REMOVED]C. Electric charge is measured in coulomb that has the unit symbol C. To distinguish degree Celsius from coulomb the symbol used in the UML is degC. The reason for not using [SYMBOL REMOVED]C is that the special character [SYMBOL REMOVED] is difficult to manage in software.
     */
    _degC("degC"),
    /**
     * Dose equivalent in sieverts (J/kg).
     */
    _Sv("Sv"),
    /**
     * Electric capacitance in farads (C/V).
     */
    _F("F"),
    /**
     * Electric charge in coulombs (A·s).
     */
    _C("C"),
    /**
     * Conductance in siemens.
     */
    _S("S"),
    /**
     * Electric inductance in henrys (Wb/A).
     */
    _H("H"),
    /**
     * Electric potential in volts (W/A).
     */
    _V("V"),
    /**
     * Electric resistance in ohms (V/A).
     */
    _ohm("ohm"),
    /**
     * Energy in joules (N·m = C·V = W·s).
     */
    _J("J"),
    /**
     * Force in newtons (kg·m/s²).
     */
    _N("N"),
    /**
     * Frequency in hertz (1/s).
     */
    _Hz("Hz"),
    /**
     * Illuminance in lux (lm/m²).
     */
    _lx("lx"),
    /**
     * Luminous flux in lumens (cd·sr).
     */
    _lm("lm"),
    /**
     * Magnetic flux in webers (V·s).
     */
    _Wb("Wb"),
    /**
     * Magnetic flux density in teslas (Wb/m2).
     */
    _T("T"),
    /**
     * Real power in watts (J/s). Electrical power may have real and reactive components. The real portion of electrical power (I&amp;#178;R or VIcos(phi)), is expressed in Watts. See also apparent power and reactive power.
     */
    _W("W"),
    /**
     * Pressure in pascals (N/m²). Note: the absolute or relative measurement of pressure is implied with this entry. See below for more explicit forms.
     */
    _Pa("Pa"),
    /**
     * Area in square metres (m²).
     */
    _m2("m2"),
    /**
     * Volume in cubic metres (m³).
     */
    _m3("m3"),
    /**
     * Velocity in metres per second (m/s).
     */
    _mPers("mPers"),
    /**
     * Acceleration in metres per second squared (m/s²).
     */
    _mPers2("mPers2"),
    /**
     * Volumetric flow rate in cubic metres per second (m³/s).
     */
    _m3Pers("m3Pers"),
    /**
     * Fuel efficiency in metres per cubic metres (m/m³).
     */
    _mPerm3("mPerm3"),
    /**
     * Moment of mass in kilogram metres (kg·m) (first moment of mass). Note: multiplier &quot;k&quot; is included in this unit symbol for compatibility with IEC 61850-7-3.
     */
    _kgm("kgm"),
    /**
     * Density in kilogram/cubic metres (kg/m³). Note: multiplier &quot;k&quot; is included in this unit symbol for compatibility with IEC 61850-7-3.
     */
    _kgPerm3("kgPerm3"),
    /**
     * Viscosity in square metres / second (m²/s).
     */
    _m2Pers("m2Pers"),
    /**
     * Thermal conductivity in watt/metres kelvin.
     */
    _WPermK("WPermK"),
    /**
     * Heat capacity in joules/kelvin.
     */
    _JPerK("JPerK"),
    /**
     * Concentration in parts per million.
     */
    _ppm("ppm"),
    /**
     * Rotations per second (1/s). See also Hz (1/s).
     */
    _rotPers("rotPers"),
    /**
     * Angular velocity in radians per second (rad/s).
     */
    _radPers("radPers"),
    /**
     * Heat flux density, irradiance, watts per square metre.
     */
    _WPerm2("WPerm2"),
    /**
     * Insulation energy density, joules per square metre or watt second per square metre.
     */
    _JPerm2("JPerm2"),
    /**
     * Conductance per length (F/m).
     */
    _SPerm("SPerm"),
    /**
     * Temperature change rate in kelvins per second.
     */
    _KPers("KPers"),
    /**
     * Pressure change rate in pascals per second.
     */
    _PaPers("PaPers"),
    /**
     * Specific heat capacity, specific entropy, joules per kilogram Kelvin.
     */
    _JPerkgK("JPerkgK"),
    /**
     * Apparent power in volt amperes. See also real power and reactive power.
     */
    _VA("VA"),
    /**
     * Reactive power in volt amperes reactive. The &quot;reactive&quot; or &quot;imaginary&quot; component of electrical power (VIsin(phi)). (See also real power and apparent power). Note: Different meter designs use different methods to arrive at their results. Some meters may compute reactive power as an arithmetic value, while others compute the value vectorially. The data consumer should determine the method in use and the suitability of the measurement for the intended purpose.
     */
    _VAr("VAr"),
    /**
     * Power factor, dimensionless. Note 1: This definition of power factor only holds for balanced systems. See the alternative definition under code 153. Note 2 : Beware of differing sign conventions in use between the IEC and EEI. It is assumed that the data consumer understands the type of meter in use and the sign convention in use by the utility.
     */
    _cosPhi("cosPhi"),
    /**
     * Volt seconds (Ws/A).
     */
    _Vs("Vs"),
    /**
     * Volt squared (W²/A²).
     */
    _V2("V2"),
    /**
     * Ampere seconds (A·s).
     */
    _As("As"),
    /**
     * Amperes squared (A²).
     */
    _A2("A2"),
    /**
     * Ampere squared time in square amperes (A²s).
     */
    _A2s("A2s"),
    /**
     * Apparent energy in volt ampere hours.
     */
    _VAh("VAh"),
    /**
     * Real energy in watt hours.
     */
    _Wh("Wh"),
    /**
     * Reactive energy in volt ampere reactive hours.
     */
    _VArh("VArh"),
    /**
     * Magnetic flux in volt per hertz.
     */
    _VPerHz("VPerHz"),
    /**
     * Rate of change of frequency in hertz per second.
     */
    _HzPers("HzPers"),
    /**
     * Number of characters.
     */
    _character("character"),
    /**
     * Data rate (baud) in characters per second.
     */
    _charPers("charPers"),
    /**
     * Moment of mass in kilogram square metres (kg·m²) (Second moment of mass, commonly called the moment of inertia). Note: multiplier &quot;k&quot; is included in this unit symbol for compatibility with IEC 61850-7-3.
     */
    _kgm2("kgm2"),
    /**
     * Sound pressure level in decibels. Note:  multiplier &quot;d&quot; is included in this unit symbol for compatibility with IEC 61850-7-3.
     */
    _dB("dB"),
    /**
     * Ramp rate in watts per second.
     */
    _WPers("WPers"),
    /**
     * Volumetric flow rate in litres per second.
     */
    _lPers("lPers"),
    /**
     * Power level (logarithmic ratio of signal strength , Bel-mW), normalized to 1mW. Note:  multiplier &quot;d&quot; is included in this unit symbol for compatibility with IEC 61850-7-3.
     */
    _dBm("dBm"),
    /**
     * Time in hours, hour = 60 min = 3600 s.
     */
    _h("h"),
    /**
     * Time in minutes, minute  = 60 s.
     */
    _min("min"),
    /**
     * Quantity power, Q.
     */
    _Q("Q"),
    /**
     * Quantity energy, Qh.
     */
    _Qh("Qh"),
    /**
     * Resistivity, ohm metres, (rho).
     */
    _ohmm("ohmm"),
    /**
     * A/m, magnetic field strength, amperes per metre.
     */
    _APerm("APerm"),
    /**
     * Volt-squared hour, volt-squared-hours.
     */
    _V2h("V2h"),
    /**
     * Ampere-squared hour, ampere-squared hour.
     */
    _A2h("A2h"),
    /**
     * Ampere-hours, ampere-hours.
     */
    _Ah("Ah"),
    /**
     * Amount of substance, Counter value.
     */
    _count("count"),
    /**
     * Volume, cubic feet.
     */
    _ft3("ft3"),
    /**
     * Volumetric flow rate, cubic metres per hour.
     */
    _m3Perh("m3Perh"),
    /**
     * Volume in gallons, US gallon (1 gal = 231 in3 = 128 fl ounce).
     */
    _gal("gal"),
    /**
     * Energy, British Thermal Units.
     */
    _Btu("Btu"),
    /**
     * Volume in litres, litre = dm3 = m3/1000.
     */
    _l("l"),
    /**
     * Volumetric flow rate, litres per hour.
     */
    _lPerh("lPerh"),
    /**
     * Concentration, The ratio of the volume of a solute divided by the volume of  the solution. Note: Users may need use a prefix such a ‘µ' to express a quantity such as ‘µL/L'.
     */
    _lPerl("lPerl"),
    /**
     * Concentration, The ratio of the mass of a solute divided by the mass of  the solution. Note: Users may need use a prefix such a ‘µ' to express a quantity such as ‘µg/g'.
     */
    _gPerg("gPerg"),
    /**
     * Concentration, The amount of substance concentration, (c), the amount of solvent in moles divided by the volume of solution in m³.
     */
    _molPerm3("molPerm3"),
    /**
     * Concentration, Molar fraction, the ratio of the molar amount of a solute divided by the molar amount of the solution.
     */
    _molPermol("molPermol"),
    /**
     * Concentration, Molality, the amount of solute in moles and the amount of solvent in kilograms.
     */
    _molPerkg("molPerkg"),
    /**
     * Time, Ratio of time.  Note: Users may need to supply a prefix such as ‘&amp;#181;' to show rates such as ‘&amp;#181;s/s'.
     */
    _sPers("sPers"),
    /**
     * Frequency, rate of frequency change.   Note: Users may need to supply a prefix such as ‘m' to show rates such as ‘mHz/Hz'.
     */
    _HzPerHz("HzPerHz"),
    /**
     * Voltage, ratio of voltages.  Note: Users may need to supply a prefix such as ‘m' to show rates such as ‘mV/V'.
     */
    _VPerV("VPerV"),
    /**
     * Current, ratio of amperages.   Note: Users may need to supply a prefix such as ‘m' to show rates such as ‘mA/A'.
     */
    _APerA("APerA"),
    /**
     * Power factor, PF, the ratio of the active power to the apparent power.  Note: The sign convention used for power factor will differ between IEC meters and EEI (ANSI) meters. It is assumed that the data consumers understand the type of meter being used and agree on the sign convention in use at any given utility.
     */
    _VPerVA("VPerVA"),
    /**
     * Amount of rotation, revolutions.
     */
    _rev("rev"),
    /**
     * Catalytic activity, katal = mol / s.
     */
    _kat("kat"),
    /**
     * Specific energy, Joules / kg.
     */
    _JPerkg("JPerkg"),
    /**
     * Volume, cubic metres, with the value uncompensated for weather effects.
     */
    _m3Uncompensated("m3Uncompensated"),
    /**
     * Volume, cubic metres, with the value compensated for weather effects.
     */
    _m3Compensated("m3Compensated"),
    /**
     * Signal Strength, ratio of power.   Note: Users may need to supply a prefix such as ‘m' to show rates such as ‘mW/W'.
     */
    _WPerW("WPerW"),
    /**
     * Energy, therms.
     */
    _therm("therm"),
    /**
     * Wavenumber, reciprocal metres,  (1/m).
     */
    _onePerm("onePerm"),
    /**
     * Specific volume, cubic metres per kilogram, v.
     */
    _m3Perkg("m3Perkg"),
    /**
     * Dynamic viscosity, pascal seconds.
     */
    _Pas("Pas"),
    /**
     * Moment of force, newton metres.
     */
    _Nm("Nm"),
    /**
     * Surface tension, newton per metre.
     */
    _NPerm("NPerm"),
    /**
     * Angular acceleration, radians per second squared.
     */
    _radPers2("radPers2"),
    /**
     * Energy density, joules per cubic metre.
     */
    _JPerm3("JPerm3"),
    /**
     * Electric field strength, volts per metre.
     */
    _VPerm("VPerm"),
    /**
     * Electric charge density, coulombs per cubic metre.
     */
    _CPerm3("CPerm3"),
    /**
     * Surface charge density, coulombs per square metre.
     */
    _CPerm2("CPerm2"),
    /**
     * Permittivity, farads per metre.
     */
    _FPerm("FPerm"),
    /**
     * Permeability, henrys per metre.
     */
    _HPerm("HPerm"),
    /**
     * Molar energy, joules per mole.
     */
    _JPermol("JPermol"),
    /**
     * Molar entropy, molar heat capacity, joules per mole kelvin.
     */
    _JPermolK("JPermolK"),
    /**
     * Exposure (x rays), coulombs per kilogram.
     */
    _CPerkg("CPerkg"),
    /**
     * Absorbed dose rate, grays per second.
     */
    _GyPers("GyPers"),
    /**
     * Radiant intensity, watts per steradian.
     */
    _WPersr("WPersr"),
    /**
     * Radiance, watts per square metre steradian.
     */
    _WPerm2sr("WPerm2sr"),
    /**
     * Catalytic activity concentration, katals per cubic metre.
     */
    _katPerm3("katPerm3"),
    /**
     * Time in days, day = 24 h = 86400 s.
     */
    _d("d"),
    /**
     * Plane angle, minutes.
     */
    _anglemin("anglemin"),
    /**
     * Plane angle, seconds.
     */
    _anglesec("anglesec"),
    /**
     * Area, hectares.
     */
    _ha("ha"),
    /**
     * Mass in tons, &quot;tonne&quot; or &quot;metric  ton&quot; (1000 kg = 1 Mg).
     */
    _tonne("tonne"),
    /**
     * Pressure in bars, (1 bar = 100 kPa).
     */
    _bar("bar"),
    /**
     * Pressure, millimetres of mercury (1 mmHg is approximately 133.3 Pa).
     */
    _mmHg("mmHg"),
    /**
     * Length, nautical miles (1 M = 1852 m).
     */
    _M("M"),
    /**
     * Speed, knots (1 kn = 1852/3600) m/s.
     */
    _kn("kn"),
    /**
     * Magnetic flux, maxwells (1 Mx = 10-8 Wb).
     */
    _Mx("Mx"),
    /**
     * Magnetic flux density, gausses (1 G = 10-4 T).
     */
    _G("G"),
    /**
     * Magnetic field in oersteds, (1 Oe = (103/4p) A/m).
     */
    _Oe("Oe"),
    /**
     * Volt-hour, Volt hours.
     */
    _Vh("Vh"),
    /**
     * Active power per current flow, watts per Ampere.
     */
    _WPerA("WPerA"),
    /**
     * Reciprocal of frequency (1/Hz).
     */
    _onePerHz("onePerHz"),
    /**
     * Power factor, PF, the ratio of the active power to the apparent power. Note: The sign convention used for power factor will differ between IEC meters and EEI (ANSI) meters. It is assumed that the data consumers understand the type of meter being used and agree on the sign convention in use at any given utility.
     */
    _VPerVAr("VPerVAr"),
    /**
     * Electric resistance per length in ohms per metre ((V/A)/m).
     */
    _ohmPerm("ohmPerm"),
    /**
     * Weight per energy in kilograms per joule (kg/J). Note: multiplier &quot;k&quot; is included in this unit symbol for compatibility with IEC 61850-7-3.
     */
    _kgPerJ("kgPerJ"),
    /**
     * Energy rate in joules per second (J/s).
     */
    _JPers("JPers"),
    ;

    private final String value;

    private UnitSymbol(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static UnitSymbol fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, UnitSymbol> ENUM_MAP;
    static {
        var map = new HashMap<String, UnitSymbol>();
        for (UnitSymbol instance : UnitSymbol.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
