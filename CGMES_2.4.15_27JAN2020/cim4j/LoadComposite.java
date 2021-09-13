package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.LoadDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;
import cim4j.Seconds;



/*
This models combines static load and induction motor load effects. The dynamics of the motor are simplified by linearizing the induction machine equations.
*/
public class LoadComposite extends LoadDynamics
{
	private BaseClass[] LoadComposite_class_attributes;
	private BaseClass[] LoadComposite_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum LoadComposite_primitive_builder implements PrimitiveBuilder {
		epvs(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		epfs(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		eqvs(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		eqfs(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		epvd(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		epfd(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		eqvd(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		eqfd(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		lfrac(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		h(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		pfrac(){
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

	private enum LoadComposite_class_attributes_enum {
		epvs,
		epfs,
		eqvs,
		eqfs,
		epvd,
		epfd,
		eqvd,
		eqfd,
		lfrac,
		h,
		pfrac,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
	
	public LoadComposite() {
		LoadComposite_primitive_attributes = new BaseClass[LoadComposite_primitive_builder.values().length];
		LoadComposite_class_attributes = new BaseClass[LoadComposite_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(LoadComposite_class_attributes_enum attrEnum, BaseClass value) {
		try {
			LoadComposite_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(LoadComposite_primitive_builder attrEnum, BaseClass value) {
		try {
			LoadComposite_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			LoadComposite_class_attributes_enum attrEnum = LoadComposite_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated LoadComposite, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			LoadComposite_primitive_builder attrEnum = LoadComposite_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated LoadComposite, setting " + attrName  + " to: "  + value);
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
			for (LoadComposite_primitive_builder attrEnum: LoadComposite_primitive_builder.values()) {
				BaseClass bc = LoadComposite_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LoadComposite." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (LoadComposite_class_attributes_enum attrEnum: LoadComposite_class_attributes_enum.values()) {
				BaseClass bc = LoadComposite_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LoadComposite." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(LoadComposite) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "LoadComposite";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new LoadComposite();
        }
};
