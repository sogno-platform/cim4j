package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.Date;

/*
Profile version details.
*/
public class EquipmentBoundaryVersion extends BaseClass
{
	private BaseClass[] EquipmentBoundaryVersion_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum EquipmentBoundaryVersion_primitive_builder implements PrimitiveBuilder {
			baseUML(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
			baseURI(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
			differenceModelURI(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
			entsoeUML(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
			entsoeURIcore(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
			entsoeURIoperation(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
			modelDescriptionURI(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
			namespaceRDF(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
			namespaceUML(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
			shortName(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
		
		
		
	
	public EquipmentBoundaryVersion() {
		EquipmentBoundaryVersion_attributes = new BaseClass[EquipmentBoundaryVersion_primitive_builder.values().length];
	}

	public void updateAttributeInArray(EquipmentBoundaryVersion_primitive_builder attrEnum, BaseClass value) {
		try {
			EquipmentBoundaryVersion_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//EquipmentBoundaryVersion_ATTR_ENUM attrEnum = EquipmentBoundaryVersion_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			EquipmentBoundaryVersion_primitive_builder attrEnum = EquipmentBoundaryVersion_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (EquipmentBoundaryVersion_primitive_builder attrEnum: EquipmentBoundaryVersion_primitive_builder.values()) {
			BaseClass bc = EquipmentBoundaryVersion_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "EquipmentBoundaryVersion";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new EquipmentBoundaryVersion();
        }
};