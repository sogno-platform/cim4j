package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TurbineGovernorDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ActivePower;
import cim4j.PU;
import cim4j.DroopSignalFeedbackKind;
import cim4j.Seconds;
import cim4j.Boolean;
import cim4j.Simple_Float;
import cim4j.Frequency;



/*
General governor model with frequency-dependent fuel flow limit.  This model is a modification of the GovCT1model in order to represent the frequency-dependent fuel flow limit of a specific gas turbine manufacturer.
*/
public class GovCT2 extends TurbineGovernorDynamics
{
	private BaseClass[] GovCT2_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum GovCT2_primitive_builder implements PrimitiveBuilder {
			mwbase(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			r(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			rselect(){
			public BaseClass construct (java.lang.String value) {
				return new DroopSignalFeedbackKind(value);
			}
		},
			tpelec(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			maxerr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			minerr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kpgov(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kigov(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kdgov(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tdgov(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			vmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tact(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			kturb(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			wfnl(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tb(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tc(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			wfspd(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			teng(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tfload(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			kpload(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kiload(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ldref(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			dm(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ropen(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			rclose(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			kimw(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			aset(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			ka(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ta(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			db(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tsa(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tsb(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			rup(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			rdown(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			prate(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			flim1(){
			public BaseClass construct (java.lang.String value) {
				return new Frequency(value);
			}
		},
			plim1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			flim2(){
			public BaseClass construct (java.lang.String value) {
				return new Frequency(value);
			}
		},
			plim2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			flim3(){
			public BaseClass construct (java.lang.String value) {
				return new Frequency(value);
			}
		},
			plim3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			flim4(){
			public BaseClass construct (java.lang.String value) {
				return new Frequency(value);
			}
		},
			plim4(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			flim5(){
			public BaseClass construct (java.lang.String value) {
				return new Frequency(value);
			}
		},
			plim5(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			flim6(){
			public BaseClass construct (java.lang.String value) {
				return new Frequency(value);
			}
		},
			plim6(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			flim7(){
			public BaseClass construct (java.lang.String value) {
				return new Frequency(value);
			}
		},
			plim7(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			flim8(){
			public BaseClass construct (java.lang.String value) {
				return new Frequency(value);
			}
		},
			plim8(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			flim9(){
			public BaseClass construct (java.lang.String value) {
				return new Frequency(value);
			}
		},
			plim9(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			flim10(){
			public BaseClass construct (java.lang.String value) {
				return new Frequency(value);
			}
		},
			plim10(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovCT2() {
		GovCT2_attributes = new BaseClass[GovCT2_primitive_builder.values().length];
	}

	public void updateAttributeInArray(GovCT2_primitive_builder attrEnum, BaseClass value) {
		try {
			GovCT2_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//GovCT2_ATTR_ENUM attrEnum = GovCT2_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovCT2_primitive_builder attrEnum = GovCT2_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (GovCT2_primitive_builder attrEnum: GovCT2_primitive_builder.values()) {
			BaseClass bc = GovCT2_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "GovCT2";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovCT2();
        }
};
