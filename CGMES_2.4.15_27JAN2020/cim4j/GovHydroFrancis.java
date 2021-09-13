package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TurbineGovernorDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Area;
import cim4j.Frequency;
import cim4j.FrancisGovernorControlKind;
import cim4j.Length;
import cim4j.Seconds;
import cim4j.Simple_Float;
import cim4j.Boolean;


import cim4j.VolumeFlowRate;

/*
Detailed hydro unit - Francis model.  This model can be used to represent three types of governors. A schematic of the hydraulic system of detailed hydro unit models, like Francis and Pelton, is provided in the DetailedHydroModelHydraulicSystem diagram.
*/
public class GovHydroFrancis extends TurbineGovernorDynamics
{
	private BaseClass[] GovHydroFrancis_class_attributes;
	private BaseClass[] GovHydroFrancis_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum GovHydroFrancis_primitive_builder implements PrimitiveBuilder {
		am(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		av0(){
			public BaseClass construct (java.lang.String value) {
				return new Area(value);
			}
		},
		av1(){
			public BaseClass construct (java.lang.String value) {
				return new Area(value);
			}
		},
		bp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		db1(){
			public BaseClass construct (java.lang.String value) {
				return new Frequency(value);
			}
		},
		etamax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		governorControl(){
			public BaseClass construct (java.lang.String value) {
				return new FrancisGovernorControlKind(value);
			}
		},
		h1(){
			public BaseClass construct (java.lang.String value) {
				return new Length(value);
			}
		},
		h2(){
			public BaseClass construct (java.lang.String value) {
				return new Length(value);
			}
		},
		hn(){
			public BaseClass construct (java.lang.String value) {
				return new Length(value);
			}
		},
		kc(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kg(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kt(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		qc0(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ta(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		td(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		ts(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		twnc(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		twng(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tx(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		va(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		valvmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		valvmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vc(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		waterTunnelSurgeChamberSimulation(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		zsfc(){
			public BaseClass construct (java.lang.String value) {
				return new Length(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum GovHydroFrancis_class_attributes_enum {
		am,
		av0,
		av1,
		bp,
		db1,
		etamax,
		governorControl,
		h1,
		h2,
		hn,
		kc,
		kg,
		kt,
		qc0,
		qn,
		ta,
		td,
		ts,
		twnc,
		twng,
		tx,
		va,
		valvmax,
		valvmin,
		vc,
		waterTunnelSurgeChamberSimulation,
		zsfc,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovHydroFrancis() {
		GovHydroFrancis_primitive_attributes = new BaseClass[GovHydroFrancis_primitive_builder.values().length];
		GovHydroFrancis_class_attributes = new BaseClass[GovHydroFrancis_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GovHydroFrancis_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovHydroFrancis_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GovHydroFrancis_primitive_builder attrEnum, BaseClass value) {
		try {
			GovHydroFrancis_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovHydroFrancis_class_attributes_enum attrEnum = GovHydroFrancis_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GovHydroFrancis, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovHydroFrancis_primitive_builder attrEnum = GovHydroFrancis_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated GovHydroFrancis, setting " + attrName  + " to: "  + value);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString(boolean topClass) {
		java.lang.String result = "";
		java.lang.String indent = "";
		if (topClass) {
			for (GovHydroFrancis_primitive_builder attrEnum: GovHydroFrancis_primitive_builder.values()) {
				BaseClass bc = GovHydroFrancis_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydroFrancis." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovHydroFrancis_class_attributes_enum attrEnum: GovHydroFrancis_class_attributes_enum.values()) {
				BaseClass bc = GovHydroFrancis_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydroFrancis." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GovHydroFrancis) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "GovHydroFrancis";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovHydroFrancis();
        }
};
