package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Integer;
import cim4j.Boolean;
import cim4j.Simple_Float;
import cim4j.AngleDegrees;


import cim4j.Diagram;
import cim4j.IdentifiedObject;
import cim4j.DiagramObjectPoint;
import cim4j.VisibilityLayer;
import cim4j.DiagramObjectStyle;

/*
An object that defines one or more points in a given space. This object can be associated with anything that specializes IdentifiedObject. For single line diagrams such objects typically include such items as analog values, breakers, disconnectors, power transformers, and transmission lines.
*/
public class DiagramObject extends IdentifiedObject
{
	private BaseClass[] DiagramObject_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum DiagramObject_primitive_builder implements PrimitiveBuilder {
			drawingOrder(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
			isPolygon(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			offsetX(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			offsetY(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			rotation(){
			public BaseClass construct (java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
		
		
	
	public DiagramObject() {
		DiagramObject_attributes = new BaseClass[DiagramObject_primitive_builder.values().length];
	}

	public void updateAttributeInArray(DiagramObject_primitive_builder attrEnum, BaseClass value) {
		try {
			DiagramObject_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//DiagramObject_ATTR_ENUM attrEnum = DiagramObject_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DiagramObject_primitive_builder attrEnum = DiagramObject_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (DiagramObject_primitive_builder attrEnum: DiagramObject_primitive_builder.values()) {
			BaseClass bc = DiagramObject_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "DiagramObject";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DiagramObject();
        }
};
