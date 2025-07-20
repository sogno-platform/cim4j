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
 * Supports definition of one or more parameters of several different datatypes for use by proprietary user-defined models.  NOTE: This class does not inherit from IdentifiedObject since it is not intended that a single instance of it be referenced by more than one proprietary user-defined model instance.
 */
@SuppressWarnings("unused")
public class ProprietaryParameterDynamics extends BaseClass {

    private static final Logging LOG = Logging.getLogger(ProprietaryParameterDynamics.class);

    /**
     * Constructor.
     */
    public ProprietaryParameterDynamics(String rdfid) {
        super("ProprietaryParameterDynamics", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ProprietaryParameterDynamics(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private AsynchronousMachineUserDefined AsynchronousMachineUserDefined; // ManyToOne

    private String AsynchronousMachineUserDefinedId;

    public AsynchronousMachineUserDefined getAsynchronousMachineUserDefined() {
        return AsynchronousMachineUserDefined;
    }

    public void setAsynchronousMachineUserDefined(AsynchronousMachineUserDefined _object_) {
        if (AsynchronousMachineUserDefined != _object_) {
            AsynchronousMachineUserDefined = _object_;
            _object_.setProprietaryParameterDynamics(this);
            AsynchronousMachineUserDefinedId = _object_.getRdfid();
        }
    }

    private static Object getAsynchronousMachineUserDefined(BaseClass _this_) {
        var obj = ((ProprietaryParameterDynamics) _this_).getAsynchronousMachineUserDefined();
        var id = ((ProprietaryParameterDynamics) _this_).AsynchronousMachineUserDefinedId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setAsynchronousMachineUserDefined(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ProprietaryParameterDynamics) _this_).AsynchronousMachineUserDefinedId = (String) _value_;
        } else if (_value_ instanceof AsynchronousMachineUserDefined) {
            ((ProprietaryParameterDynamics) _this_).setAsynchronousMachineUserDefined((AsynchronousMachineUserDefined) _value_);
        } else {
            throw new IllegalArgumentException("Object is not AsynchronousMachineUserDefined");
        }
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private DiscontinuousExcitationControlUserDefined DiscontinuousExcitationControlUserDefined; // ManyToOne

    private String DiscontinuousExcitationControlUserDefinedId;

    public DiscontinuousExcitationControlUserDefined getDiscontinuousExcitationControlUserDefined() {
        return DiscontinuousExcitationControlUserDefined;
    }

    public void setDiscontinuousExcitationControlUserDefined(DiscontinuousExcitationControlUserDefined _object_) {
        if (DiscontinuousExcitationControlUserDefined != _object_) {
            DiscontinuousExcitationControlUserDefined = _object_;
            _object_.setProprietaryParameterDynamics(this);
            DiscontinuousExcitationControlUserDefinedId = _object_.getRdfid();
        }
    }

    private static Object getDiscontinuousExcitationControlUserDefined(BaseClass _this_) {
        var obj = ((ProprietaryParameterDynamics) _this_).getDiscontinuousExcitationControlUserDefined();
        var id = ((ProprietaryParameterDynamics) _this_).DiscontinuousExcitationControlUserDefinedId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setDiscontinuousExcitationControlUserDefined(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ProprietaryParameterDynamics) _this_).DiscontinuousExcitationControlUserDefinedId = (String) _value_;
        } else if (_value_ instanceof DiscontinuousExcitationControlUserDefined) {
            ((ProprietaryParameterDynamics) _this_).setDiscontinuousExcitationControlUserDefined((DiscontinuousExcitationControlUserDefined) _value_);
        } else {
            throw new IllegalArgumentException("Object is not DiscontinuousExcitationControlUserDefined");
        }
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private ExcitationSystemUserDefined ExcitationSystemUserDefined; // ManyToOne

    private String ExcitationSystemUserDefinedId;

    public ExcitationSystemUserDefined getExcitationSystemUserDefined() {
        return ExcitationSystemUserDefined;
    }

    public void setExcitationSystemUserDefined(ExcitationSystemUserDefined _object_) {
        if (ExcitationSystemUserDefined != _object_) {
            ExcitationSystemUserDefined = _object_;
            _object_.setProprietaryParameterDynamics(this);
            ExcitationSystemUserDefinedId = _object_.getRdfid();
        }
    }

    private static Object getExcitationSystemUserDefined(BaseClass _this_) {
        var obj = ((ProprietaryParameterDynamics) _this_).getExcitationSystemUserDefined();
        var id = ((ProprietaryParameterDynamics) _this_).ExcitationSystemUserDefinedId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setExcitationSystemUserDefined(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ProprietaryParameterDynamics) _this_).ExcitationSystemUserDefinedId = (String) _value_;
        } else if (_value_ instanceof ExcitationSystemUserDefined) {
            ((ProprietaryParameterDynamics) _this_).setExcitationSystemUserDefined((ExcitationSystemUserDefined) _value_);
        } else {
            throw new IllegalArgumentException("Object is not ExcitationSystemUserDefined");
        }
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private LoadUserDefined LoadUserDefined; // ManyToOne

    private String LoadUserDefinedId;

    public LoadUserDefined getLoadUserDefined() {
        return LoadUserDefined;
    }

    public void setLoadUserDefined(LoadUserDefined _object_) {
        if (LoadUserDefined != _object_) {
            LoadUserDefined = _object_;
            _object_.setProprietaryParameterDynamics(this);
            LoadUserDefinedId = _object_.getRdfid();
        }
    }

    private static Object getLoadUserDefined(BaseClass _this_) {
        var obj = ((ProprietaryParameterDynamics) _this_).getLoadUserDefined();
        var id = ((ProprietaryParameterDynamics) _this_).LoadUserDefinedId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setLoadUserDefined(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ProprietaryParameterDynamics) _this_).LoadUserDefinedId = (String) _value_;
        } else if (_value_ instanceof LoadUserDefined) {
            ((ProprietaryParameterDynamics) _this_).setLoadUserDefined((LoadUserDefined) _value_);
        } else {
            throw new IllegalArgumentException("Object is not LoadUserDefined");
        }
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private MechanicalLoadUserDefined MechanicalLoadUserDefined; // ManyToOne

    private String MechanicalLoadUserDefinedId;

    public MechanicalLoadUserDefined getMechanicalLoadUserDefined() {
        return MechanicalLoadUserDefined;
    }

    public void setMechanicalLoadUserDefined(MechanicalLoadUserDefined _object_) {
        if (MechanicalLoadUserDefined != _object_) {
            MechanicalLoadUserDefined = _object_;
            _object_.setProprietaryParameterDynamics(this);
            MechanicalLoadUserDefinedId = _object_.getRdfid();
        }
    }

    private static Object getMechanicalLoadUserDefined(BaseClass _this_) {
        var obj = ((ProprietaryParameterDynamics) _this_).getMechanicalLoadUserDefined();
        var id = ((ProprietaryParameterDynamics) _this_).MechanicalLoadUserDefinedId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setMechanicalLoadUserDefined(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ProprietaryParameterDynamics) _this_).MechanicalLoadUserDefinedId = (String) _value_;
        } else if (_value_ instanceof MechanicalLoadUserDefined) {
            ((ProprietaryParameterDynamics) _this_).setMechanicalLoadUserDefined((MechanicalLoadUserDefined) _value_);
        } else {
            throw new IllegalArgumentException("Object is not MechanicalLoadUserDefined");
        }
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private OverexcitationLimiterUserDefined OverexcitationLimiterUserDefined; // ManyToOne

    private String OverexcitationLimiterUserDefinedId;

    public OverexcitationLimiterUserDefined getOverexcitationLimiterUserDefined() {
        return OverexcitationLimiterUserDefined;
    }

    public void setOverexcitationLimiterUserDefined(OverexcitationLimiterUserDefined _object_) {
        if (OverexcitationLimiterUserDefined != _object_) {
            OverexcitationLimiterUserDefined = _object_;
            _object_.setProprietaryParameterDynamics(this);
            OverexcitationLimiterUserDefinedId = _object_.getRdfid();
        }
    }

    private static Object getOverexcitationLimiterUserDefined(BaseClass _this_) {
        var obj = ((ProprietaryParameterDynamics) _this_).getOverexcitationLimiterUserDefined();
        var id = ((ProprietaryParameterDynamics) _this_).OverexcitationLimiterUserDefinedId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setOverexcitationLimiterUserDefined(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ProprietaryParameterDynamics) _this_).OverexcitationLimiterUserDefinedId = (String) _value_;
        } else if (_value_ instanceof OverexcitationLimiterUserDefined) {
            ((ProprietaryParameterDynamics) _this_).setOverexcitationLimiterUserDefined((OverexcitationLimiterUserDefined) _value_);
        } else {
            throw new IllegalArgumentException("Object is not OverexcitationLimiterUserDefined");
        }
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private PFVArControllerType1UserDefined PFVArControllerType1UserDefined; // ManyToOne

    private String PFVArControllerType1UserDefinedId;

    public PFVArControllerType1UserDefined getPFVArControllerType1UserDefined() {
        return PFVArControllerType1UserDefined;
    }

    public void setPFVArControllerType1UserDefined(PFVArControllerType1UserDefined _object_) {
        if (PFVArControllerType1UserDefined != _object_) {
            PFVArControllerType1UserDefined = _object_;
            _object_.setProprietaryParameterDynamics(this);
            PFVArControllerType1UserDefinedId = _object_.getRdfid();
        }
    }

    private static Object getPFVArControllerType1UserDefined(BaseClass _this_) {
        var obj = ((ProprietaryParameterDynamics) _this_).getPFVArControllerType1UserDefined();
        var id = ((ProprietaryParameterDynamics) _this_).PFVArControllerType1UserDefinedId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setPFVArControllerType1UserDefined(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ProprietaryParameterDynamics) _this_).PFVArControllerType1UserDefinedId = (String) _value_;
        } else if (_value_ instanceof PFVArControllerType1UserDefined) {
            ((ProprietaryParameterDynamics) _this_).setPFVArControllerType1UserDefined((PFVArControllerType1UserDefined) _value_);
        } else {
            throw new IllegalArgumentException("Object is not PFVArControllerType1UserDefined");
        }
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private PFVArControllerType2UserDefined PFVArControllerType2UserDefined; // ManyToOne

    private String PFVArControllerType2UserDefinedId;

    public PFVArControllerType2UserDefined getPFVArControllerType2UserDefined() {
        return PFVArControllerType2UserDefined;
    }

    public void setPFVArControllerType2UserDefined(PFVArControllerType2UserDefined _object_) {
        if (PFVArControllerType2UserDefined != _object_) {
            PFVArControllerType2UserDefined = _object_;
            _object_.setProprietaryParameterDynamics(this);
            PFVArControllerType2UserDefinedId = _object_.getRdfid();
        }
    }

    private static Object getPFVArControllerType2UserDefined(BaseClass _this_) {
        var obj = ((ProprietaryParameterDynamics) _this_).getPFVArControllerType2UserDefined();
        var id = ((ProprietaryParameterDynamics) _this_).PFVArControllerType2UserDefinedId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setPFVArControllerType2UserDefined(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ProprietaryParameterDynamics) _this_).PFVArControllerType2UserDefinedId = (String) _value_;
        } else if (_value_ instanceof PFVArControllerType2UserDefined) {
            ((ProprietaryParameterDynamics) _this_).setPFVArControllerType2UserDefined((PFVArControllerType2UserDefined) _value_);
        } else {
            throw new IllegalArgumentException("Object is not PFVArControllerType2UserDefined");
        }
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private PowerSystemStabilizerUserDefined PowerSystemStabilizerUserDefined; // ManyToOne

    private String PowerSystemStabilizerUserDefinedId;

    public PowerSystemStabilizerUserDefined getPowerSystemStabilizerUserDefined() {
        return PowerSystemStabilizerUserDefined;
    }

    public void setPowerSystemStabilizerUserDefined(PowerSystemStabilizerUserDefined _object_) {
        if (PowerSystemStabilizerUserDefined != _object_) {
            PowerSystemStabilizerUserDefined = _object_;
            _object_.setProprietaryParameterDynamics(this);
            PowerSystemStabilizerUserDefinedId = _object_.getRdfid();
        }
    }

    private static Object getPowerSystemStabilizerUserDefined(BaseClass _this_) {
        var obj = ((ProprietaryParameterDynamics) _this_).getPowerSystemStabilizerUserDefined();
        var id = ((ProprietaryParameterDynamics) _this_).PowerSystemStabilizerUserDefinedId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setPowerSystemStabilizerUserDefined(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ProprietaryParameterDynamics) _this_).PowerSystemStabilizerUserDefinedId = (String) _value_;
        } else if (_value_ instanceof PowerSystemStabilizerUserDefined) {
            ((ProprietaryParameterDynamics) _this_).setPowerSystemStabilizerUserDefined((PowerSystemStabilizerUserDefined) _value_);
        } else {
            throw new IllegalArgumentException("Object is not PowerSystemStabilizerUserDefined");
        }
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private SynchronousMachineUserDefined SynchronousMachineUserDefined; // ManyToOne

    private String SynchronousMachineUserDefinedId;

    public SynchronousMachineUserDefined getSynchronousMachineUserDefined() {
        return SynchronousMachineUserDefined;
    }

    public void setSynchronousMachineUserDefined(SynchronousMachineUserDefined _object_) {
        if (SynchronousMachineUserDefined != _object_) {
            SynchronousMachineUserDefined = _object_;
            _object_.setProprietaryParameterDynamics(this);
            SynchronousMachineUserDefinedId = _object_.getRdfid();
        }
    }

    private static Object getSynchronousMachineUserDefined(BaseClass _this_) {
        var obj = ((ProprietaryParameterDynamics) _this_).getSynchronousMachineUserDefined();
        var id = ((ProprietaryParameterDynamics) _this_).SynchronousMachineUserDefinedId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setSynchronousMachineUserDefined(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ProprietaryParameterDynamics) _this_).SynchronousMachineUserDefinedId = (String) _value_;
        } else if (_value_ instanceof SynchronousMachineUserDefined) {
            ((ProprietaryParameterDynamics) _this_).setSynchronousMachineUserDefined((SynchronousMachineUserDefined) _value_);
        } else {
            throw new IllegalArgumentException("Object is not SynchronousMachineUserDefined");
        }
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private TurbineGovernorUserDefined TurbineGovernorUserDefined; // ManyToOne

    private String TurbineGovernorUserDefinedId;

    public TurbineGovernorUserDefined getTurbineGovernorUserDefined() {
        return TurbineGovernorUserDefined;
    }

    public void setTurbineGovernorUserDefined(TurbineGovernorUserDefined _object_) {
        if (TurbineGovernorUserDefined != _object_) {
            TurbineGovernorUserDefined = _object_;
            _object_.setProprietaryParameterDynamics(this);
            TurbineGovernorUserDefinedId = _object_.getRdfid();
        }
    }

    private static Object getTurbineGovernorUserDefined(BaseClass _this_) {
        var obj = ((ProprietaryParameterDynamics) _this_).getTurbineGovernorUserDefined();
        var id = ((ProprietaryParameterDynamics) _this_).TurbineGovernorUserDefinedId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setTurbineGovernorUserDefined(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ProprietaryParameterDynamics) _this_).TurbineGovernorUserDefinedId = (String) _value_;
        } else if (_value_ instanceof TurbineGovernorUserDefined) {
            ((ProprietaryParameterDynamics) _this_).setTurbineGovernorUserDefined((TurbineGovernorUserDefined) _value_);
        } else {
            throw new IllegalArgumentException("Object is not TurbineGovernorUserDefined");
        }
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private TurbineLoadControllerUserDefined TurbineLoadControllerUserDefined; // ManyToOne

    private String TurbineLoadControllerUserDefinedId;

    public TurbineLoadControllerUserDefined getTurbineLoadControllerUserDefined() {
        return TurbineLoadControllerUserDefined;
    }

    public void setTurbineLoadControllerUserDefined(TurbineLoadControllerUserDefined _object_) {
        if (TurbineLoadControllerUserDefined != _object_) {
            TurbineLoadControllerUserDefined = _object_;
            _object_.setProprietaryParameterDynamics(this);
            TurbineLoadControllerUserDefinedId = _object_.getRdfid();
        }
    }

    private static Object getTurbineLoadControllerUserDefined(BaseClass _this_) {
        var obj = ((ProprietaryParameterDynamics) _this_).getTurbineLoadControllerUserDefined();
        var id = ((ProprietaryParameterDynamics) _this_).TurbineLoadControllerUserDefinedId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setTurbineLoadControllerUserDefined(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ProprietaryParameterDynamics) _this_).TurbineLoadControllerUserDefinedId = (String) _value_;
        } else if (_value_ instanceof TurbineLoadControllerUserDefined) {
            ((ProprietaryParameterDynamics) _this_).setTurbineLoadControllerUserDefined((TurbineLoadControllerUserDefined) _value_);
        } else {
            throw new IllegalArgumentException("Object is not TurbineLoadControllerUserDefined");
        }
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private UnderexcitationLimiterUserDefined UnderexcitationLimiterUserDefined; // ManyToOne

    private String UnderexcitationLimiterUserDefinedId;

    public UnderexcitationLimiterUserDefined getUnderexcitationLimiterUserDefined() {
        return UnderexcitationLimiterUserDefined;
    }

    public void setUnderexcitationLimiterUserDefined(UnderexcitationLimiterUserDefined _object_) {
        if (UnderexcitationLimiterUserDefined != _object_) {
            UnderexcitationLimiterUserDefined = _object_;
            _object_.setProprietaryParameterDynamics(this);
            UnderexcitationLimiterUserDefinedId = _object_.getRdfid();
        }
    }

    private static Object getUnderexcitationLimiterUserDefined(BaseClass _this_) {
        var obj = ((ProprietaryParameterDynamics) _this_).getUnderexcitationLimiterUserDefined();
        var id = ((ProprietaryParameterDynamics) _this_).UnderexcitationLimiterUserDefinedId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setUnderexcitationLimiterUserDefined(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ProprietaryParameterDynamics) _this_).UnderexcitationLimiterUserDefinedId = (String) _value_;
        } else if (_value_ instanceof UnderexcitationLimiterUserDefined) {
            ((ProprietaryParameterDynamics) _this_).setUnderexcitationLimiterUserDefined((UnderexcitationLimiterUserDefined) _value_);
        } else {
            throw new IllegalArgumentException("Object is not UnderexcitationLimiterUserDefined");
        }
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private VoltageAdjusterUserDefined VoltageAdjusterUserDefined; // ManyToOne

    private String VoltageAdjusterUserDefinedId;

    public VoltageAdjusterUserDefined getVoltageAdjusterUserDefined() {
        return VoltageAdjusterUserDefined;
    }

    public void setVoltageAdjusterUserDefined(VoltageAdjusterUserDefined _object_) {
        if (VoltageAdjusterUserDefined != _object_) {
            VoltageAdjusterUserDefined = _object_;
            _object_.setProprietaryParameterDynamics(this);
            VoltageAdjusterUserDefinedId = _object_.getRdfid();
        }
    }

    private static Object getVoltageAdjusterUserDefined(BaseClass _this_) {
        var obj = ((ProprietaryParameterDynamics) _this_).getVoltageAdjusterUserDefined();
        var id = ((ProprietaryParameterDynamics) _this_).VoltageAdjusterUserDefinedId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setVoltageAdjusterUserDefined(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ProprietaryParameterDynamics) _this_).VoltageAdjusterUserDefinedId = (String) _value_;
        } else if (_value_ instanceof VoltageAdjusterUserDefined) {
            ((ProprietaryParameterDynamics) _this_).setVoltageAdjusterUserDefined((VoltageAdjusterUserDefined) _value_);
        } else {
            throw new IllegalArgumentException("Object is not VoltageAdjusterUserDefined");
        }
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private VoltageCompensatorUserDefined VoltageCompensatorUserDefined; // ManyToOne

    private String VoltageCompensatorUserDefinedId;

    public VoltageCompensatorUserDefined getVoltageCompensatorUserDefined() {
        return VoltageCompensatorUserDefined;
    }

    public void setVoltageCompensatorUserDefined(VoltageCompensatorUserDefined _object_) {
        if (VoltageCompensatorUserDefined != _object_) {
            VoltageCompensatorUserDefined = _object_;
            _object_.setProprietaryParameterDynamics(this);
            VoltageCompensatorUserDefinedId = _object_.getRdfid();
        }
    }

    private static Object getVoltageCompensatorUserDefined(BaseClass _this_) {
        var obj = ((ProprietaryParameterDynamics) _this_).getVoltageCompensatorUserDefined();
        var id = ((ProprietaryParameterDynamics) _this_).VoltageCompensatorUserDefinedId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setVoltageCompensatorUserDefined(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ProprietaryParameterDynamics) _this_).VoltageCompensatorUserDefinedId = (String) _value_;
        } else if (_value_ instanceof VoltageCompensatorUserDefined) {
            ((ProprietaryParameterDynamics) _this_).setVoltageCompensatorUserDefined((VoltageCompensatorUserDefined) _value_);
        } else {
            throw new IllegalArgumentException("Object is not VoltageCompensatorUserDefined");
        }
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private WindPlantUserDefined WindPlantUserDefined; // ManyToOne

    private String WindPlantUserDefinedId;

    public WindPlantUserDefined getWindPlantUserDefined() {
        return WindPlantUserDefined;
    }

    public void setWindPlantUserDefined(WindPlantUserDefined _object_) {
        if (WindPlantUserDefined != _object_) {
            WindPlantUserDefined = _object_;
            _object_.setProprietaryParameterDynamics(this);
            WindPlantUserDefinedId = _object_.getRdfid();
        }
    }

    private static Object getWindPlantUserDefined(BaseClass _this_) {
        var obj = ((ProprietaryParameterDynamics) _this_).getWindPlantUserDefined();
        var id = ((ProprietaryParameterDynamics) _this_).WindPlantUserDefinedId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setWindPlantUserDefined(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ProprietaryParameterDynamics) _this_).WindPlantUserDefinedId = (String) _value_;
        } else if (_value_ instanceof WindPlantUserDefined) {
            ((ProprietaryParameterDynamics) _this_).setWindPlantUserDefined((WindPlantUserDefined) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindPlantUserDefined");
        }
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private WindType1or2UserDefined WindType1or2UserDefined; // ManyToOne

    private String WindType1or2UserDefinedId;

    public WindType1or2UserDefined getWindType1or2UserDefined() {
        return WindType1or2UserDefined;
    }

    public void setWindType1or2UserDefined(WindType1or2UserDefined _object_) {
        if (WindType1or2UserDefined != _object_) {
            WindType1or2UserDefined = _object_;
            _object_.setProprietaryParameterDynamics(this);
            WindType1or2UserDefinedId = _object_.getRdfid();
        }
    }

    private static Object getWindType1or2UserDefined(BaseClass _this_) {
        var obj = ((ProprietaryParameterDynamics) _this_).getWindType1or2UserDefined();
        var id = ((ProprietaryParameterDynamics) _this_).WindType1or2UserDefinedId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setWindType1or2UserDefined(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ProprietaryParameterDynamics) _this_).WindType1or2UserDefinedId = (String) _value_;
        } else if (_value_ instanceof WindType1or2UserDefined) {
            ((ProprietaryParameterDynamics) _this_).setWindType1or2UserDefined((WindType1or2UserDefined) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindType1or2UserDefined");
        }
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private WindType3or4UserDefined WindType3or4UserDefined; // ManyToOne

    private String WindType3or4UserDefinedId;

    public WindType3or4UserDefined getWindType3or4UserDefined() {
        return WindType3or4UserDefined;
    }

    public void setWindType3or4UserDefined(WindType3or4UserDefined _object_) {
        if (WindType3or4UserDefined != _object_) {
            WindType3or4UserDefined = _object_;
            _object_.setProprietaryParameterDynamics(this);
            WindType3or4UserDefinedId = _object_.getRdfid();
        }
    }

    private static Object getWindType3or4UserDefined(BaseClass _this_) {
        var obj = ((ProprietaryParameterDynamics) _this_).getWindType3or4UserDefined();
        var id = ((ProprietaryParameterDynamics) _this_).WindType3or4UserDefinedId;
        if (obj == null && id != null) {
            return id;
        }
        return obj;
    }

    private static void setWindType3or4UserDefined(BaseClass _this_, Object _value_) {
        if (_value_ instanceof String) {
            ((ProprietaryParameterDynamics) _this_).WindType3or4UserDefinedId = (String) _value_;
        } else if (_value_ instanceof WindType3or4UserDefined) {
            ((ProprietaryParameterDynamics) _this_).setWindType3or4UserDefined((WindType3or4UserDefined) _value_);
        } else {
            throw new IllegalArgumentException("Object is not WindType3or4UserDefined");
        }
    }

    /**
     * Used for boolean parameter value. If this attribute is populated, integerParameterValue and floatParameterValue will not be.
     */
    private Boolean booleanParameterValue; // Boolean

    public Boolean getBooleanParameterValue() {
        return booleanParameterValue;
    }

    public void setBooleanParameterValue(Boolean _value_) {
        booleanParameterValue = _value_;
    }

    private static Object getBooleanParameterValue(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).getBooleanParameterValue();
    }

    private static void setBooleanParameterValue(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Boolean) {
            ((ProprietaryParameterDynamics) _this_).setBooleanParameterValue((Boolean) _value_);
        } else if (_value_ instanceof String) {
            ((ProprietaryParameterDynamics) _this_).setBooleanParameterValue(getBooleanFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Boolean nor String");
        }
    }

    /**
     * Used for floating point parameter value.  If this attribute is populated, booleanParameterValue and integerParameterValue will not be.
     */
    private Double floatParameterValue; // Simple_Float

    public Double getFloatParameterValue() {
        return floatParameterValue;
    }

    public void setFloatParameterValue(Double _value_) {
        floatParameterValue = _value_;
    }

    private static Object getFloatParameterValue(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).getFloatParameterValue();
    }

    private static void setFloatParameterValue(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Double) {
            ((ProprietaryParameterDynamics) _this_).setFloatParameterValue((Double) _value_);
        } else if (_value_ instanceof String) {
            ((ProprietaryParameterDynamics) _this_).setFloatParameterValue(getDoubleFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Double nor String");
        }
    }

    /**
     * Used for integer parameter value.  If this attribute is populated, booleanParameterValue and floatParameterValue will not be.
     */
    private Integer integerParameterValue; // Integer

    public Integer getIntegerParameterValue() {
        return integerParameterValue;
    }

    public void setIntegerParameterValue(Integer _value_) {
        integerParameterValue = _value_;
    }

    private static Object getIntegerParameterValue(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).getIntegerParameterValue();
    }

    private static void setIntegerParameterValue(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((ProprietaryParameterDynamics) _this_).setIntegerParameterValue((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((ProprietaryParameterDynamics) _this_).setIntegerParameterValue(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
        }
    }

    /**
     * Sequence number of the parameter among the set of parameters associated with the related proprietary user-defined model.
     */
    private Integer parameterNumber; // Integer

    public Integer getParameterNumber() {
        return parameterNumber;
    }

    public void setParameterNumber(Integer _value_) {
        parameterNumber = _value_;
    }

    private static Object getParameterNumber(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).getParameterNumber();
    }

    private static void setParameterNumber(BaseClass _this_, Object _value_) {
        if (_value_ instanceof Integer) {
            ((ProprietaryParameterDynamics) _this_).setParameterNumber((Integer) _value_);
        } else if (_value_ instanceof String) {
            ((ProprietaryParameterDynamics) _this_).setParameterNumber(getIntegerFromString((String) _value_));
        } else {
            throw new IllegalArgumentException("Object is neither Integer nor String");
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ProprietaryParameterDynamics", attrName));
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
                "ProprietaryParameterDynamics", attrName, value));
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
            map.put("AsynchronousMachineUserDefined", new AttrDetails("ProprietaryParameterDynamics.AsynchronousMachineUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ProprietaryParameterDynamics::getAsynchronousMachineUserDefined, ProprietaryParameterDynamics::setAsynchronousMachineUserDefined));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("DiscontinuousExcitationControlUserDefined", new AttrDetails("ProprietaryParameterDynamics.DiscontinuousExcitationControlUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ProprietaryParameterDynamics::getDiscontinuousExcitationControlUserDefined, ProprietaryParameterDynamics::setDiscontinuousExcitationControlUserDefined));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ExcitationSystemUserDefined", new AttrDetails("ProprietaryParameterDynamics.ExcitationSystemUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ProprietaryParameterDynamics::getExcitationSystemUserDefined, ProprietaryParameterDynamics::setExcitationSystemUserDefined));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("LoadUserDefined", new AttrDetails("ProprietaryParameterDynamics.LoadUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ProprietaryParameterDynamics::getLoadUserDefined, ProprietaryParameterDynamics::setLoadUserDefined));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("MechanicalLoadUserDefined", new AttrDetails("ProprietaryParameterDynamics.MechanicalLoadUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ProprietaryParameterDynamics::getMechanicalLoadUserDefined, ProprietaryParameterDynamics::setMechanicalLoadUserDefined));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("OverexcitationLimiterUserDefined", new AttrDetails("ProprietaryParameterDynamics.OverexcitationLimiterUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ProprietaryParameterDynamics::getOverexcitationLimiterUserDefined, ProprietaryParameterDynamics::setOverexcitationLimiterUserDefined));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("PFVArControllerType1UserDefined", new AttrDetails("ProprietaryParameterDynamics.PFVArControllerType1UserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ProprietaryParameterDynamics::getPFVArControllerType1UserDefined, ProprietaryParameterDynamics::setPFVArControllerType1UserDefined));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("PFVArControllerType2UserDefined", new AttrDetails("ProprietaryParameterDynamics.PFVArControllerType2UserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ProprietaryParameterDynamics::getPFVArControllerType2UserDefined, ProprietaryParameterDynamics::setPFVArControllerType2UserDefined));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("PowerSystemStabilizerUserDefined", new AttrDetails("ProprietaryParameterDynamics.PowerSystemStabilizerUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ProprietaryParameterDynamics::getPowerSystemStabilizerUserDefined, ProprietaryParameterDynamics::setPowerSystemStabilizerUserDefined));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("SynchronousMachineUserDefined", new AttrDetails("ProprietaryParameterDynamics.SynchronousMachineUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ProprietaryParameterDynamics::getSynchronousMachineUserDefined, ProprietaryParameterDynamics::setSynchronousMachineUserDefined));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("TurbineGovernorUserDefined", new AttrDetails("ProprietaryParameterDynamics.TurbineGovernorUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ProprietaryParameterDynamics::getTurbineGovernorUserDefined, ProprietaryParameterDynamics::setTurbineGovernorUserDefined));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("TurbineLoadControllerUserDefined", new AttrDetails("ProprietaryParameterDynamics.TurbineLoadControllerUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ProprietaryParameterDynamics::getTurbineLoadControllerUserDefined, ProprietaryParameterDynamics::setTurbineLoadControllerUserDefined));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("UnderexcitationLimiterUserDefined", new AttrDetails("ProprietaryParameterDynamics.UnderexcitationLimiterUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ProprietaryParameterDynamics::getUnderexcitationLimiterUserDefined, ProprietaryParameterDynamics::setUnderexcitationLimiterUserDefined));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("VoltageAdjusterUserDefined", new AttrDetails("ProprietaryParameterDynamics.VoltageAdjusterUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ProprietaryParameterDynamics::getVoltageAdjusterUserDefined, ProprietaryParameterDynamics::setVoltageAdjusterUserDefined));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("VoltageCompensatorUserDefined", new AttrDetails("ProprietaryParameterDynamics.VoltageCompensatorUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ProprietaryParameterDynamics::getVoltageCompensatorUserDefined, ProprietaryParameterDynamics::setVoltageCompensatorUserDefined));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindPlantUserDefined", new AttrDetails("ProprietaryParameterDynamics.WindPlantUserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ProprietaryParameterDynamics::getWindPlantUserDefined, ProprietaryParameterDynamics::setWindPlantUserDefined));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindType1or2UserDefined", new AttrDetails("ProprietaryParameterDynamics.WindType1or2UserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ProprietaryParameterDynamics::getWindType1or2UserDefined, ProprietaryParameterDynamics::setWindType1or2UserDefined));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindType3or4UserDefined", new AttrDetails("ProprietaryParameterDynamics.WindType3or4UserDefined", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ProprietaryParameterDynamics::getWindType3or4UserDefined, ProprietaryParameterDynamics::setWindType3or4UserDefined));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("booleanParameterValue", new AttrDetails("ProprietaryParameterDynamics.booleanParameterValue", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ProprietaryParameterDynamics::getBooleanParameterValue, ProprietaryParameterDynamics::setBooleanParameterValue));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("floatParameterValue", new AttrDetails("ProprietaryParameterDynamics.floatParameterValue", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ProprietaryParameterDynamics::getFloatParameterValue, ProprietaryParameterDynamics::setFloatParameterValue));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("integerParameterValue", new AttrDetails("ProprietaryParameterDynamics.integerParameterValue", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ProprietaryParameterDynamics::getIntegerParameterValue, ProprietaryParameterDynamics::setIntegerParameterValue));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("parameterNumber", new AttrDetails("ProprietaryParameterDynamics.parameterNumber", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ProprietaryParameterDynamics::getParameterNumber, ProprietaryParameterDynamics::setParameterNumber));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ProprietaryParameterDynamics(null).allAttrDetailsMap());
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
