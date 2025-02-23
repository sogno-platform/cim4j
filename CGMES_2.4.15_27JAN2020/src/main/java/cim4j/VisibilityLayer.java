package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Integer;


import cim4j.DiagramObject;

/*
Layers are typically used for grouping diagram objects according to themes and scales. Themes are used to display or hide certain information (e.g., lakes, borders), while scales are used for hiding or displaying information depending on the current zoom level (hide text when it is too small to be read, or when it exceeds the screen size). This is also called de-cluttering.  CIM based graphics exchange will support an m:n relationship between diagram objects and layers. It will be the task of the importing system to convert an m:n case into an appropriate 1:n representation if the importing system does not support m:n.
*/
public class VisibilityLayer extends IdentifiedObject
{
	private BaseClass[] VisibilityLayer_class_attributes;
	private BaseClass[] VisibilityLayer_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum VisibilityLayer_primitive_builder implements PrimitiveBuilder {
		drawingOrder(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum VisibilityLayer_class_attributes_enum {
		VisibleObjects,
		drawingOrder,
			LAST_ENUM;
	}

		
		
	
	public VisibilityLayer() {
		VisibilityLayer_primitive_attributes = new BaseClass[VisibilityLayer_primitive_builder.values().length];
		VisibilityLayer_class_attributes = new BaseClass[VisibilityLayer_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(VisibilityLayer_class_attributes_enum attrEnum, BaseClass value) {
		try {
			VisibilityLayer_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(VisibilityLayer_primitive_builder attrEnum, BaseClass value) {
		try {
			VisibilityLayer_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			VisibilityLayer_class_attributes_enum attrEnum = VisibilityLayer_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated VisibilityLayer, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			VisibilityLayer_primitive_builder attrEnum = VisibilityLayer_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated VisibilityLayer, setting " + attrName  + " to: "  + value);
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
			for (VisibilityLayer_primitive_builder attrEnum: VisibilityLayer_primitive_builder.values()) {
				BaseClass bc = VisibilityLayer_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    VisibilityLayer." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (VisibilityLayer_class_attributes_enum attrEnum: VisibilityLayer_class_attributes_enum.values()) {
				BaseClass bc = VisibilityLayer_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    VisibilityLayer." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(VisibilityLayer) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "VisibilityLayer";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new VisibilityLayer();
        }
};
