package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.OrientationKind;
import cim4j.Simple_Float;


import cim4j.DiagramStyle;
import cim4j.DiagramObject;

/*
The diagram being exchanged.  The coordinate system is a standard Cartesian coordinate system and the orientation attribute defines the orientation.
*/
public class Diagram extends IdentifiedObject
{
	private BaseClass[] Diagram_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum Diagram_primitive_builder implements PrimitiveBuilder {
			orientation(){
			public BaseClass construct (java.lang.String value) {
				return new OrientationKind(value);
			}
		},
			x1InitialView(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			x2InitialView(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			y1InitialView(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			y2InitialView(){
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

		
		
		
		
		
		
		
	
	public Diagram() {
		Diagram_attributes = new BaseClass[Diagram_primitive_builder.values().length];
	}

	public void updateAttributeInArray(Diagram_primitive_builder attrEnum, BaseClass value) {
		try {
			Diagram_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//Diagram_ATTR_ENUM attrEnum = Diagram_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Diagram_primitive_builder attrEnum = Diagram_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (Diagram_primitive_builder attrEnum: Diagram_primitive_builder.values()) {
			BaseClass bc = Diagram_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "Diagram";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Diagram();
        }
};
