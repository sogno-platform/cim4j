package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;
import cim4j.Simple_Float;



/*
The class represents IEEE Std 421.5-2005 type AC5A model. The model represents a simplified model for brushless excitation systems. The regulator is supplied from a source, such as a permanent magnet generator, which is not affected by system disturbances.  Unlike other ac models, this model uses loaded rather than open circuit exciter saturation data in the same way as it is used for the dc models.  Because the model has been widely implemented by the industry, it is sometimes used to represent other types of systems when either detailed data for them are not available or simplified models are required.   Reference: IEEE Standard 421.5-2005 Section 6.5.
*/
public class ExcIEEEAC5A extends ExcitationSystemDynamics
{
	private BaseClass[] ExcIEEEAC5A_class_attributes;
	private BaseClass[] ExcIEEEAC5A_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcIEEEAC5A_primitive_builder implements PrimitiveBuilder {
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
		vrmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vrmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ke(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		te(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		kf(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tf1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tf2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tf3(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		efd1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		seefd1(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		efd2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		seefd2(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum ExcIEEEAC5A_class_attributes_enum {
		ka,
		ta,
		vrmax,
		vrmin,
		ke,
		te,
		kf,
		tf1,
		tf2,
		tf3,
		efd1,
		seefd1,
		efd2,
		seefd2,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcIEEEAC5A() {
		ExcIEEEAC5A_primitive_attributes = new BaseClass[ExcIEEEAC5A_primitive_builder.values().length];
		ExcIEEEAC5A_class_attributes = new BaseClass[ExcIEEEAC5A_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcIEEEAC5A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcIEEEAC5A_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcIEEEAC5A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcIEEEAC5A_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcIEEEAC5A_class_attributes_enum attrEnum = ExcIEEEAC5A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcIEEEAC5A, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcIEEEAC5A_primitive_builder attrEnum = ExcIEEEAC5A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcIEEEAC5A, setting " + attrName  + " to: "  + value);
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
			for (ExcIEEEAC5A_primitive_builder attrEnum: ExcIEEEAC5A_primitive_builder.values()) {
				BaseClass bc = ExcIEEEAC5A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEAC5A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcIEEEAC5A_class_attributes_enum attrEnum: ExcIEEEAC5A_class_attributes_enum.values()) {
				BaseClass bc = ExcIEEEAC5A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEAC5A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcIEEEAC5A) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcIEEEAC5A";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcIEEEAC5A();
        }
};
