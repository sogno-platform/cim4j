package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.EquivalentEquipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Resistance;
import cim4j.Reactance;



/*
The class represents equivalent branches.
*/
public class EquivalentBranch extends EquivalentEquipment
{
	private BaseClass[] EquivalentBranch_class_attributes;
	private BaseClass[] EquivalentBranch_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum EquivalentBranch_primitive_builder implements PrimitiveBuilder {
		r(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
		r21(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
		x(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
		x21(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
		negativeR12(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
		negativeR21(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
		negativeX12(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
		negativeX21(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
		positiveR12(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
		positiveR21(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
		positiveX12(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
		positiveX21(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
		zeroR12(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
		zeroR21(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
		zeroX12(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
		zeroX21(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum EquivalentBranch_class_attributes_enum {
		r,
		r21,
		x,
		x21,
		negativeR12,
		negativeR21,
		negativeX12,
		negativeX21,
		positiveR12,
		positiveR21,
		positiveX12,
		positiveX21,
		zeroR12,
		zeroR21,
		zeroX12,
		zeroX21,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public EquivalentBranch() {
		EquivalentBranch_primitive_attributes = new BaseClass[EquivalentBranch_primitive_builder.values().length];
		EquivalentBranch_class_attributes = new BaseClass[EquivalentBranch_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(EquivalentBranch_class_attributes_enum attrEnum, BaseClass value) {
		try {
			EquivalentBranch_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(EquivalentBranch_primitive_builder attrEnum, BaseClass value) {
		try {
			EquivalentBranch_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			EquivalentBranch_class_attributes_enum attrEnum = EquivalentBranch_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated EquivalentBranch, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			EquivalentBranch_primitive_builder attrEnum = EquivalentBranch_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated EquivalentBranch, setting " + attrName  + " to: "  + value);
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
			for (EquivalentBranch_primitive_builder attrEnum: EquivalentBranch_primitive_builder.values()) {
				BaseClass bc = EquivalentBranch_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    EquivalentBranch." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (EquivalentBranch_class_attributes_enum attrEnum: EquivalentBranch_class_attributes_enum.values()) {
				BaseClass bc = EquivalentBranch_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    EquivalentBranch." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(EquivalentBranch) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "EquivalentBranch";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new EquivalentBranch();
        }
};
