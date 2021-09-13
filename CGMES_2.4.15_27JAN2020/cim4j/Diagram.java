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
	private BaseClass[] Diagram_class_attributes;
	private BaseClass[] Diagram_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

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

	private enum Diagram_class_attributes_enum {
		DiagramStyle,
		orientation,
		x1InitialView,
		x2InitialView,
		y1InitialView,
		y2InitialView,
		DiagramElements,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
	
	public Diagram() {
		Diagram_primitive_attributes = new BaseClass[Diagram_primitive_builder.values().length];
		Diagram_class_attributes = new BaseClass[Diagram_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(Diagram_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Diagram_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(Diagram_primitive_builder attrEnum, BaseClass value) {
		try {
			Diagram_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Diagram_class_attributes_enum attrEnum = Diagram_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated Diagram, setting " + attrName);
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
			System.out.println("Updated Diagram, setting " + attrName  + " to: "  + value);
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
			for (Diagram_primitive_builder attrEnum: Diagram_primitive_builder.values()) {
				BaseClass bc = Diagram_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Diagram." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Diagram_class_attributes_enum attrEnum: Diagram_class_attributes_enum.values()) {
				BaseClass bc = Diagram_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Diagram." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(Diagram) RDFID: " + rdfid;
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
