package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.StaticLoadModelKind;
import cim4j.Simple_Float;


import cim4j.LoadAggregate;

/*
General static load model representing the sensitivity of the real and reactive power consumed by the load to the amplitude and frequency of the bus voltage.
*/
public class LoadStatic extends IdentifiedObject
{
	private BaseClass[] LoadStatic_class_attributes;
	private BaseClass[] LoadStatic_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum LoadStatic_primitive_builder implements PrimitiveBuilder {
		staticLoadModelType(){
			public BaseClass construct (java.lang.String value) {
				return new StaticLoadModelKind(value);
			}
		},
		kp1(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kp2(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kp3(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kp4(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		ep1(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		ep2(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		ep3(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kpf(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kq1(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kq2(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kq3(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kq4(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		eq1(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		eq2(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		eq3(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kqf(){
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

	private enum LoadStatic_class_attributes_enum {
		LoadAggregate,
		staticLoadModelType,
		kp1,
		kp2,
		kp3,
		kp4,
		ep1,
		ep2,
		ep3,
		kpf,
		kq1,
		kq2,
		kq3,
		kq4,
		eq1,
		eq2,
		eq3,
		kqf,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public LoadStatic() {
		LoadStatic_primitive_attributes = new BaseClass[LoadStatic_primitive_builder.values().length];
		LoadStatic_class_attributes = new BaseClass[LoadStatic_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(LoadStatic_class_attributes_enum attrEnum, BaseClass value) {
		try {
			LoadStatic_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(LoadStatic_primitive_builder attrEnum, BaseClass value) {
		try {
			LoadStatic_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			LoadStatic_class_attributes_enum attrEnum = LoadStatic_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated LoadStatic, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			LoadStatic_primitive_builder attrEnum = LoadStatic_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated LoadStatic, setting " + attrName  + " to: "  + value);
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
			for (LoadStatic_primitive_builder attrEnum: LoadStatic_primitive_builder.values()) {
				BaseClass bc = LoadStatic_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LoadStatic." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (LoadStatic_class_attributes_enum attrEnum: LoadStatic_class_attributes_enum.values()) {
				BaseClass bc = LoadStatic_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LoadStatic." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(LoadStatic) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "LoadStatic";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new LoadStatic();
        }
};
