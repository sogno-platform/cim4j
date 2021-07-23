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
	private BaseClass[] LoadComposite_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
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

		
		
		
		
		
		
		
		
		
		
		
	
	public LoadComposite() {
		LoadComposite_attributes = new BaseClass[LoadComposite_primitive_builder.values().length];
	}

	public void updateAttributeInArray(LoadComposite_primitive_builder attrEnum, BaseClass value) {
		try {
			LoadComposite_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//LoadComposite_ATTR_ENUM attrEnum = LoadComposite_ATTR_BC_ENUM.valueOf(attrName);
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
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (LoadComposite_primitive_builder attrEnum: LoadComposite_primitive_builder.values()) {
			BaseClass bc = LoadComposite_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
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
