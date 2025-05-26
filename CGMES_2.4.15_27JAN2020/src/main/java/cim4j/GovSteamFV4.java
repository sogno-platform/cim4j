/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Detailed electro-hydraulic governor for steam unit.
 */
@SuppressWarnings("unused")
public class GovSteamFV4 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovSteamFV4.class);

    /**
     * Constructor.
     */
    public GovSteamFV4(String rdfid) {
        super("GovSteamFV4", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovSteamFV4(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Minimum value of pressure regulator output (Cpsmn).  Typical Value = -1.
     */
    private Double cpsmn; // PU

    public Double getCpsmn() {
        return cpsmn;
    }

    public void setCpsmn(Double _value_) {
        cpsmn = _value_;
    }

    private static Object getCpsmn(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getCpsmn();
    }

    private static void setCpsmn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setCpsmn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setCpsmn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum value of pressure regulator output (Cpsmx).  Typical Value = 1.
     */
    private Double cpsmx; // PU

    public Double getCpsmx() {
        return cpsmx;
    }

    public void setCpsmx(Double _value_) {
        cpsmx = _value_;
    }

    private static Object getCpsmx(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getCpsmx();
    }

    private static void setCpsmx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setCpsmx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setCpsmx(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum value of regulator set-point (Crmn).  Typical Value = 0.
     */
    private Double crmn; // PU

    public Double getCrmn() {
        return crmn;
    }

    public void setCrmn(Double _value_) {
        crmn = _value_;
    }

    private static Object getCrmn(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getCrmn();
    }

    private static void setCrmn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setCrmn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setCrmn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum value of regulator set-point (Crmx).  Typical Value = 1.2.
     */
    private Double crmx; // PU

    public Double getCrmx() {
        return crmx;
    }

    public void setCrmx(Double _value_) {
        crmx = _value_;
    }

    private static Object getCrmx(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getCrmx();
    }

    private static void setCrmx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setCrmx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setCrmx(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Derivative gain of pressure regulator (Kdc).  Typical Value = 1.
     */
    private Double kdc; // PU

    public Double getKdc() {
        return kdc;
    }

    public void setKdc(Double _value_) {
        kdc = _value_;
    }

    private static Object getKdc(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getKdc();
    }

    private static void setKdc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setKdc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setKdc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Frequency bias (reciprocal of droop) (Kf1).  Typical Value = 20.
     */
    private Double kf1; // PU

    public Double getKf1() {
        return kf1;
    }

    public void setKf1(Double _value_) {
        kf1 = _value_;
    }

    private static Object getKf1(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getKf1();
    }

    private static void setKf1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setKf1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setKf1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Frequency control (reciprocal of droop) (Kf3).  Typical Value = 20.
     */
    private Double kf3; // PU

    public Double getKf3() {
        return kf3;
    }

    public void setKf3(Double _value_) {
        kf3 = _value_;
    }

    private static Object getKf3(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getKf3();
    }

    private static void setKf3(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setKf3((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setKf3(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Fraction  of total turbine output generated by HP part (Khp).  Typical Value = 0.35.
     */
    private Double khp; // PU

    public Double getKhp() {
        return khp;
    }

    public void setKhp(Double _value_) {
        khp = _value_;
    }

    private static Object getKhp(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getKhp();
    }

    private static void setKhp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setKhp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setKhp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Integral gain of pressure regulator (Kic).  Typical Value = 0.0033.
     */
    private Double kic; // PU

    public Double getKic() {
        return kic;
    }

    public void setKic(Double _value_) {
        kic = _value_;
    }

    private static Object getKic(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getKic();
    }

    private static void setKic(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setKic((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setKic(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Integral gain of pressure feedback regulator (Kip).  Typical Value = 0.5.
     */
    private Double kip; // PU

    public Double getKip() {
        return kip;
    }

    public void setKip(Double _value_) {
        kip = _value_;
    }

    private static Object getKip(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getKip();
    }

    private static void setKip(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setKip((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setKip(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Integral gain of electro-hydraulic regulator (Kit).  Typical Value = 0.04.
     */
    private Double kit; // PU

    public Double getKit() {
        return kit;
    }

    public void setKit(Double _value_) {
        kit = _value_;
    }

    private static Object getKit(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getKit();
    }

    private static void setKit(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setKit((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setKit(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * First gain coefficient of  intercept valves characteristic (Kmp1).  Typical Value = 0.5.
     */
    private Double kmp1; // PU

    public Double getKmp1() {
        return kmp1;
    }

    public void setKmp1(Double _value_) {
        kmp1 = _value_;
    }

    private static Object getKmp1(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getKmp1();
    }

    private static void setKmp1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setKmp1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setKmp1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Second gain coefficient of intercept valves characteristic (Kmp2).  Typical Value = 3.5.
     */
    private Double kmp2; // PU

    public Double getKmp2() {
        return kmp2;
    }

    public void setKmp2(Double _value_) {
        kmp2 = _value_;
    }

    private static Object getKmp2(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getKmp2();
    }

    private static void setKmp2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setKmp2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setKmp2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Proportional gain of pressure regulator (Kpc).  Typical Value = 0.5.
     */
    private Double kpc; // PU

    public Double getKpc() {
        return kpc;
    }

    public void setKpc(Double _value_) {
        kpc = _value_;
    }

    private static Object getKpc(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getKpc();
    }

    private static void setKpc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setKpc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setKpc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Proportional gain of pressure feedback regulator (Kpp).  Typical Value = 1.
     */
    private Double kpp; // PU

    public Double getKpp() {
        return kpp;
    }

    public void setKpp(Double _value_) {
        kpp = _value_;
    }

    private static Object getKpp(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getKpp();
    }

    private static void setKpp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setKpp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setKpp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Proportional gain of electro-hydraulic regulator (Kpt).  Typical Value = 0.3.
     */
    private Double kpt; // PU

    public Double getKpt() {
        return kpt;
    }

    public void setKpt(Double _value_) {
        kpt = _value_;
    }

    private static Object getKpt(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getKpt();
    }

    private static void setKpt(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setKpt((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setKpt(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum variation of fuel flow (Krc).  Typical Value = 0.05.
     */
    private Double krc; // PU

    public Double getKrc() {
        return krc;
    }

    public void setKrc(Double _value_) {
        krc = _value_;
    }

    private static Object getKrc(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getKrc();
    }

    private static void setKrc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setKrc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setKrc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Pressure loss due to flow friction in the boiler tubes (Ksh).  Typical Value = 0.08.
     */
    private Double ksh; // PU

    public Double getKsh() {
        return ksh;
    }

    public void setKsh(Double _value_) {
        ksh = _value_;
    }

    private static Object getKsh(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getKsh();
    }

    private static void setKsh(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setKsh((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setKsh(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum negative power error (Lpi).  Typical Value = -0.15.
     */
    private Double lpi; // PU

    public Double getLpi() {
        return lpi;
    }

    public void setLpi(Double _value_) {
        lpi = _value_;
    }

    private static Object getLpi(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getLpi();
    }

    private static void setLpi(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setLpi((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setLpi(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum positive power error (Lps).  Typical Value = 0.03.
     */
    private Double lps; // PU

    public Double getLps() {
        return lps;
    }

    public void setLps(Double _value_) {
        lps = _value_;
    }

    private static Object getLps(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getLps();
    }

    private static void setLps(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setLps((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setLps(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Lower limit for frequency correction (MN).  Typical Value = -0.05.
     */
    private Double mnef; // PU

    public Double getMnef() {
        return mnef;
    }

    public void setMnef(Double _value_) {
        mnef = _value_;
    }

    private static Object getMnef(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getMnef();
    }

    private static void setMnef(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setMnef((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setMnef(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Upper limit for frequency correction (MX).  Typical Value = 0.05.
     */
    private Double mxef; // PU

    public Double getMxef() {
        return mxef;
    }

    public void setMxef(Double _value_) {
        mxef = _value_;
    }

    private static Object getMxef(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getMxef();
    }

    private static void setMxef(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setMxef((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setMxef(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * First value of pressure set point static characteristic (Pr1).  Typical Value = 0.2.
     */
    private Double pr1; // PU

    public Double getPr1() {
        return pr1;
    }

    public void setPr1(Double _value_) {
        pr1 = _value_;
    }

    private static Object getPr1(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getPr1();
    }

    private static void setPr1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setPr1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setPr1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Second value of pressure set point static characteristic, corresponding to Ps0 = 1.0 PU (Pr2).  Typical Value = 0.75.
     */
    private Double pr2; // PU

    public Double getPr2() {
        return pr2;
    }

    public void setPr2(Double _value_) {
        pr2 = _value_;
    }

    private static Object getPr2(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getPr2();
    }

    private static void setPr2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setPr2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setPr2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum value of pressure set point static characteristic (Psmn).  Typical Value = 1.
     */
    private Double psmn; // PU

    public Double getPsmn() {
        return psmn;
    }

    public void setPsmn(Double _value_) {
        psmn = _value_;
    }

    private static Object getPsmn(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getPsmn();
    }

    private static void setPsmn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setPsmn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setPsmn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum value of integral regulator (Rsmimn).  Typical Value = 0.
     */
    private Double rsmimn; // PU

    public Double getRsmimn() {
        return rsmimn;
    }

    public void setRsmimn(Double _value_) {
        rsmimn = _value_;
    }

    private static Object getRsmimn(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getRsmimn();
    }

    private static void setRsmimn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setRsmimn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setRsmimn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum value of integral regulator (Rsmimx).  Typical Value = 1.1.
     */
    private Double rsmimx; // PU

    public Double getRsmimx() {
        return rsmimx;
    }

    public void setRsmimx(Double _value_) {
        rsmimx = _value_;
    }

    private static Object getRsmimx(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getRsmimx();
    }

    private static void setRsmimx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setRsmimx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setRsmimx(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum value of integral regulator (Rvgmn).  Typical Value = 0.
     */
    private Double rvgmn; // PU

    public Double getRvgmn() {
        return rvgmn;
    }

    public void setRvgmn(Double _value_) {
        rvgmn = _value_;
    }

    private static Object getRvgmn(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getRvgmn();
    }

    private static void setRvgmn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setRvgmn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setRvgmn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum value of integral regulator (Rvgmx).  Typical Value = 1.2.
     */
    private Double rvgmx; // PU

    public Double getRvgmx() {
        return rvgmx;
    }

    public void setRvgmx(Double _value_) {
        rvgmx = _value_;
    }

    private static Object getRvgmx(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getRvgmx();
    }

    private static void setRvgmx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setRvgmx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setRvgmx(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum valve opening (Srmn).  Typical Value = 0.
     */
    private Double srmn; // PU

    public Double getSrmn() {
        return srmn;
    }

    public void setSrmn(Double _value_) {
        srmn = _value_;
    }

    private static Object getSrmn(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getSrmn();
    }

    private static void setSrmn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setSrmn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setSrmn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum valve opening (Srmx).  Typical Value = 1.1.
     */
    private Double srmx; // PU

    public Double getSrmx() {
        return srmx;
    }

    public void setSrmx(Double _value_) {
        srmx = _value_;
    }

    private static Object getSrmx(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getSrmx();
    }

    private static void setSrmx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setSrmx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setSrmx(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intercept valves characteristic discontinuity point (Srsmp).  Typical Value = 0.43.
     */
    private Double srsmp; // PU

    public Double getSrsmp() {
        return srsmp;
    }

    public void setSrsmp(Double _value_) {
        srsmp = _value_;
    }

    private static Object getSrsmp(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getSrsmp();
    }

    private static void setSrsmp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setSrsmp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setSrsmp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum regulator gate closing velocity (Svmn).  Typical Value = -0.0333.
     */
    private Double svmn; // Simple_Float

    public Double getSvmn() {
        return svmn;
    }

    public void setSvmn(Double _value_) {
        svmn = _value_;
    }

    private static Object getSvmn(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getSvmn();
    }

    private static void setSvmn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setSvmn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setSvmn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum regulator gate opening velocity (Svmx).  Typical Value = 0.0333.
     */
    private Double svmx; // Simple_Float

    public Double getSvmx() {
        return svmx;
    }

    public void setSvmx(Double _value_) {
        svmx = _value_;
    }

    private static Object getSvmx(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getSvmx();
    }

    private static void setSvmx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setSvmx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setSvmx(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Control valves rate opening time (Ta).  Typical Value = 0.8.
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    private static Object getTa(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getTa();
    }

    private static void setTa(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setTa((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setTa(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intercept valves rate opening time (Tam).  Typical Value = 0.8.
     */
    private Double tam; // Seconds

    public Double getTam() {
        return tam;
    }

    public void setTam(Double _value_) {
        tam = _value_;
    }

    private static Object getTam(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getTam();
    }

    private static void setTam(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setTam((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setTam(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Control valves rate closing time (Tc).  Typical Value = 0.5.
     */
    private Double tc; // Seconds

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    private static Object getTc(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getTc();
    }

    private static void setTc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setTc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setTc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Intercept valves rate closing time (Tcm).  Typical Value = 0.5.
     */
    private Double tcm; // Seconds

    public Double getTcm() {
        return tcm;
    }

    public void setTcm(Double _value_) {
        tcm = _value_;
    }

    private static Object getTcm(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getTcm();
    }

    private static void setTcm(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setTcm((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setTcm(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Derivative time constant of pressure regulator (Tdc).  Typical Value = 90.
     */
    private Double tdc; // Seconds

    public Double getTdc() {
        return tdc;
    }

    public void setTdc(Double _value_) {
        tdc = _value_;
    }

    private static Object getTdc(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getTdc();
    }

    private static void setTdc(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setTdc((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setTdc(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant of fuel regulation (Tf1).  Typical Value = 10.
     */
    private Double tf1; // Seconds

    public Double getTf1() {
        return tf1;
    }

    public void setTf1(Double _value_) {
        tf1 = _value_;
    }

    private static Object getTf1(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getTf1();
    }

    private static void setTf1(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setTf1((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setTf1(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Time constant of steam chest (Tf2).  Typical Value = 10.
     */
    private Double tf2; // Seconds

    public Double getTf2() {
        return tf2;
    }

    public void setTf2(Double _value_) {
        tf2 = _value_;
    }

    private static Object getTf2(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getTf2();
    }

    private static void setTf2(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setTf2((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setTf2(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * High pressure (HP) time constant of the turbine (Thp).  Typical Value = 0.15.
     */
    private Double thp; // Seconds

    public Double getThp() {
        return thp;
    }

    public void setThp(Double _value_) {
        thp = _value_;
    }

    private static Object getThp(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getThp();
    }

    private static void setThp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setThp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setThp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Low pressure (LP) time constant of the turbine (Tmp).  Typical Value = 0.4.
     */
    private Double tmp; // Seconds

    public Double getTmp() {
        return tmp;
    }

    public void setTmp(Double _value_) {
        tmp = _value_;
    }

    private static Object getTmp(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getTmp();
    }

    private static void setTmp(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setTmp((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setTmp(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Reheater  time constant of the turbine (Trh).  Typical Value = 10.
     */
    private Double trh; // Seconds

    public Double getTrh() {
        return trh;
    }

    public void setTrh(Double _value_) {
        trh = _value_;
    }

    private static Object getTrh(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getTrh();
    }

    private static void setTrh(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setTrh((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setTrh(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Boiler time constant (Tv).  Typical Value = 60.
     */
    private Double tv; // Seconds

    public Double getTv() {
        return tv;
    }

    public void setTv(Double _value_) {
        tv = _value_;
    }

    private static Object getTv(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getTv();
    }

    private static void setTv(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setTv((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setTv(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Control valves servo time constant (Ty).  Typical Value = 0.1.
     */
    private Double ty; // Seconds

    public Double getTy() {
        return ty;
    }

    public void setTy(Double _value_) {
        ty = _value_;
    }

    private static Object getTy(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getTy();
    }

    private static void setTy(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setTy((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setTy(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Coefficient of linearized equations of turbine (Stodola formulation) (Y).  Typical Value = 0.13.
     */
    private Double y; // PU

    public Double getY() {
        return y;
    }

    public void setY(Double _value_) {
        y = _value_;
    }

    private static Object getY(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getY();
    }

    private static void setY(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setY((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setY(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum control valve position (Yhpmn).  Typical Value = 0.
     */
    private Double yhpmn; // PU

    public Double getYhpmn() {
        return yhpmn;
    }

    public void setYhpmn(Double _value_) {
        yhpmn = _value_;
    }

    private static Object getYhpmn(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getYhpmn();
    }

    private static void setYhpmn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setYhpmn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setYhpmn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum control valve position (Yhpmx).  Typical Value = 1.1.
     */
    private Double yhpmx; // PU

    public Double getYhpmx() {
        return yhpmx;
    }

    public void setYhpmx(Double _value_) {
        yhpmx = _value_;
    }

    private static Object getYhpmx(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getYhpmx();
    }

    private static void setYhpmx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setYhpmx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setYhpmx(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Minimum intercept valve position (Ympmn).  Typical Value = 0.
     */
    private Double ympmn; // PU

    public Double getYmpmn() {
        return ympmn;
    }

    public void setYmpmn(Double _value_) {
        ympmn = _value_;
    }

    private static Object getYmpmn(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getYmpmn();
    }

    private static void setYmpmn(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setYmpmn((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setYmpmn(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Maximum intercept valve position (Ympmx).  Typical Value = 1.1.
     */
    private Double ympmx; // PU

    public Double getYmpmx() {
        return ympmx;
    }

    public void setYmpmx(Double _value_) {
        ympmx = _value_;
    }

    private static Object getYmpmx(BaseClass _this_) {
        return ((GovSteamFV4) _this_).getYmpmx();
    }

    private static void setYmpmx(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((GovSteamFV4) _this_).setYmpmx((Double) _value_);
        } else if (_value_ instanceof String) {
            ((GovSteamFV4) _this_).setYmpmx(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Get a list of all attribute names of the CIM type.
     *
     * The list includes all inherited attributes. The attribute name is only the
     * last part of the full name (without the class name).
     *
     * @return All attributes of the CIM type
     */
    @Override
    public List<String> getAttributeNames() {
        return ATTR_NAMES_LIST;
    }

    @Override
    protected Map<String, AttrDetails> allAttrDetailsMap() {
        Map<String, AttrDetails> map = new LinkedHashMap<>(CLASS_ATTR_DETAILS_MAP);
        map.putAll(super.allAttrDetailsMap());
        return map;
    }

    /**
     * Get the full name of an attribute.
     *
     * The full name is "<class_name>.<attribute_name>".
     *
     * @param attrName The attribute name
     * @return         The full name
     */
    @Override
    public String getAttributeFullName(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) ? ATTR_DETAILS_MAP.get(attrName).fullName : null;
    }

    /**
     * Get an attribute value.
     *
     * @param attrName The attribute name
     * @return         The attribute value
     */
    @Override
    public Object getAttribute(String attrName) {
        if (ATTR_DETAILS_MAP.containsKey(attrName)) {
            var getterFunction = ATTR_DETAILS_MAP.get(attrName).getter;
            return getterFunction.apply(this);
        }
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovSteamFV4", attrName));
        return "";
    }

    /**
     * Set an attribute value.
     *
     * @param attrName The attribute name
     * @param value    The attribute value
     */
    @Override
    public void setAttribute(String attrName, Object value) {
        if (ATTR_DETAILS_MAP.containsKey(attrName)) {
            var setterFunction = ATTR_DETAILS_MAP.get(attrName).setter;
            setterFunction.accept(this, value);
        } else {
            LOG.error(String.format("No-one knows what to do with attribute %s.%s and value %s",
                "GovSteamFV4", attrName, value));
        }
    }

    /**
     * Check if the attribute is a primitive attribute.
     *
     * This includes datatype_attributes.
     *
     * @param attrName The attribute name
     * @return         Is it a primitive attribute?
     */
    @Override
    public boolean isPrimitiveAttribute(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) && ATTR_DETAILS_MAP.get(attrName).isPrimitive;
    }

    /**
     * Check if the attribute is an enum attribute.
     *
     * @param attrName The attribute name
     * @return         Is it an enum attribute?
     */
    @Override
    public boolean isEnumAttribute(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) && ATTR_DETAILS_MAP.get(attrName).isEnum;
    }

    /**
     * Check if the attribute is used.
     *
     * Some attributes are declared as unused in the CGMES definition. In most cases
     * these are list attributes, i.e. lists of links to other CIM objects. But
     * there are some exceptions, e.g. the list of ToplogicalNodes in
     * TopologicalIsland.
     *
     * @param attrName The attribute name
     * @return         Is the attribute used?
     */
    @Override
    public boolean isUsedAttribute(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) && ATTR_DETAILS_MAP.get(attrName).isUsed;
    }

    /**
     * Get the namespace URL of an object of this class.
     *
     * @return The namespace URL
     */
    @Override
    public String getClassNamespaceUrl() {
        return CLASS_NAMESPACE;
    }

    /**
     * Get the namespace URL of an attribute (also for inherited attributes).
     *
     * @return The namespace URL
     */
    @Override
    public String getAttributeNamespaceUrl(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) ? ATTR_DETAILS_MAP.get(attrName).nameSpace : null;
    }

    /**
     * A resource can be used by multiple profiles. This is the set of profiles
     * where this element can be found.
     *
     * @return All possible profiles for an object of this class
     */
    @Override
    public Set<CGMESProfile> getPossibleProfiles() {
        return POSSIBLE_PROFILES;
    }

    /**
     * This is the profile with most of the attributes.
     * It should be used to write the data to as few as possible files.
     *
     * @return The recommended profiles for an object of this class
     */
    @Override
    public CGMESProfile getRecommendedProfile() {
        return RECOMMENDED_PROFILE;
    }

    /**
     * Get the possible profiles of an attribute (also for inherited attributes).
     *
     * @return All possible profiles for an attribute
     */
    @Override
    public Set<CGMESProfile> getPossibleAttributeProfiles(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) ? ATTR_DETAILS_MAP.get(attrName).profiles : null;
    }

    /**
     * Get the possible profiles for an object of this class including the possible
     * profiles of all direct or inherited attributes.
     *
     * A resource can be used by multiple profiles. This is the set of profiles
     * where this element or an attribute of this element can be found.
     *
     * @return All possible profiles for an object of this class and its attributes
     */
    @Override
    public Set<CGMESProfile> getPossibleProfilesIncludingAttributes() {
        return POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    }

    /**
     * Private infos.
     */

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/2013/CIM-schema-cim16#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("cpsmn", new AttrDetails("GovSteamFV4.cpsmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getCpsmn, GovSteamFV4::setCpsmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("cpsmx", new AttrDetails("GovSteamFV4.cpsmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getCpsmx, GovSteamFV4::setCpsmx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("crmn", new AttrDetails("GovSteamFV4.crmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getCrmn, GovSteamFV4::setCrmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("crmx", new AttrDetails("GovSteamFV4.crmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getCrmx, GovSteamFV4::setCrmx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kdc", new AttrDetails("GovSteamFV4.kdc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getKdc, GovSteamFV4::setKdc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf1", new AttrDetails("GovSteamFV4.kf1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getKf1, GovSteamFV4::setKf1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf3", new AttrDetails("GovSteamFV4.kf3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getKf3, GovSteamFV4::setKf3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("khp", new AttrDetails("GovSteamFV4.khp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getKhp, GovSteamFV4::setKhp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kic", new AttrDetails("GovSteamFV4.kic", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getKic, GovSteamFV4::setKic));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kip", new AttrDetails("GovSteamFV4.kip", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getKip, GovSteamFV4::setKip));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kit", new AttrDetails("GovSteamFV4.kit", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getKit, GovSteamFV4::setKit));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kmp1", new AttrDetails("GovSteamFV4.kmp1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getKmp1, GovSteamFV4::setKmp1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kmp2", new AttrDetails("GovSteamFV4.kmp2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getKmp2, GovSteamFV4::setKmp2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpc", new AttrDetails("GovSteamFV4.kpc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getKpc, GovSteamFV4::setKpc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpp", new AttrDetails("GovSteamFV4.kpp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getKpp, GovSteamFV4::setKpp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpt", new AttrDetails("GovSteamFV4.kpt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getKpt, GovSteamFV4::setKpt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("krc", new AttrDetails("GovSteamFV4.krc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getKrc, GovSteamFV4::setKrc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ksh", new AttrDetails("GovSteamFV4.ksh", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getKsh, GovSteamFV4::setKsh));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lpi", new AttrDetails("GovSteamFV4.lpi", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getLpi, GovSteamFV4::setLpi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lps", new AttrDetails("GovSteamFV4.lps", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getLps, GovSteamFV4::setLps));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mnef", new AttrDetails("GovSteamFV4.mnef", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getMnef, GovSteamFV4::setMnef));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mxef", new AttrDetails("GovSteamFV4.mxef", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getMxef, GovSteamFV4::setMxef));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pr1", new AttrDetails("GovSteamFV4.pr1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getPr1, GovSteamFV4::setPr1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pr2", new AttrDetails("GovSteamFV4.pr2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getPr2, GovSteamFV4::setPr2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("psmn", new AttrDetails("GovSteamFV4.psmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getPsmn, GovSteamFV4::setPsmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rsmimn", new AttrDetails("GovSteamFV4.rsmimn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getRsmimn, GovSteamFV4::setRsmimn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rsmimx", new AttrDetails("GovSteamFV4.rsmimx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getRsmimx, GovSteamFV4::setRsmimx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rvgmn", new AttrDetails("GovSteamFV4.rvgmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getRvgmn, GovSteamFV4::setRvgmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rvgmx", new AttrDetails("GovSteamFV4.rvgmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getRvgmx, GovSteamFV4::setRvgmx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("srmn", new AttrDetails("GovSteamFV4.srmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getSrmn, GovSteamFV4::setSrmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("srmx", new AttrDetails("GovSteamFV4.srmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getSrmx, GovSteamFV4::setSrmx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("srsmp", new AttrDetails("GovSteamFV4.srsmp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getSrsmp, GovSteamFV4::setSrsmp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("svmn", new AttrDetails("GovSteamFV4.svmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getSvmn, GovSteamFV4::setSvmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("svmx", new AttrDetails("GovSteamFV4.svmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getSvmx, GovSteamFV4::setSvmx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("GovSteamFV4.ta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getTa, GovSteamFV4::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tam", new AttrDetails("GovSteamFV4.tam", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getTam, GovSteamFV4::setTam));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("GovSteamFV4.tc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getTc, GovSteamFV4::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tcm", new AttrDetails("GovSteamFV4.tcm", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getTcm, GovSteamFV4::setTcm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tdc", new AttrDetails("GovSteamFV4.tdc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getTdc, GovSteamFV4::setTdc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf1", new AttrDetails("GovSteamFV4.tf1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getTf1, GovSteamFV4::setTf1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf2", new AttrDetails("GovSteamFV4.tf2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getTf2, GovSteamFV4::setTf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("thp", new AttrDetails("GovSteamFV4.thp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getThp, GovSteamFV4::setThp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tmp", new AttrDetails("GovSteamFV4.tmp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getTmp, GovSteamFV4::setTmp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("trh", new AttrDetails("GovSteamFV4.trh", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getTrh, GovSteamFV4::setTrh));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tv", new AttrDetails("GovSteamFV4.tv", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getTv, GovSteamFV4::setTv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ty", new AttrDetails("GovSteamFV4.ty", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getTy, GovSteamFV4::setTy));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("y", new AttrDetails("GovSteamFV4.y", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getY, GovSteamFV4::setY));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("yhpmn", new AttrDetails("GovSteamFV4.yhpmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getYhpmn, GovSteamFV4::setYhpmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("yhpmx", new AttrDetails("GovSteamFV4.yhpmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getYhpmx, GovSteamFV4::setYhpmx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ympmn", new AttrDetails("GovSteamFV4.ympmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getYmpmn, GovSteamFV4::setYmpmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ympmx", new AttrDetails("GovSteamFV4.ympmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::getYmpmx, GovSteamFV4::setYmpmx));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovSteamFV4(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.DY);
        POSSIBLE_PROFILES = Collections.unmodifiableSet(profiles);
    }

    private static final CGMESProfile RECOMMENDED_PROFILE = CGMESProfile.DY;

    private static final Set<CGMESProfile> POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>(POSSIBLE_PROFILES);
        for (var attrDetails : ATTR_DETAILS_MAP.values()) {
            profiles.addAll(attrDetails.profiles);
        }
        POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES = Collections.unmodifiableSet(profiles);
    }
}
