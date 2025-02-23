package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ACDCConverter;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.AngleDegrees;
import cim4j.CurrentFlow;
import cim4j.CsOperatingModeKind;
import cim4j.CsPpccControlKind;



/*
DC side of the current source converter (CSC).
*/
public class CsConverter extends ACDCConverter
{
	private BaseClass[] CsConverter_class_attributes;
	private BaseClass[] CsConverter_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum CsConverter_primitive_builder implements PrimitiveBuilder {
		maxAlpha(){
			public BaseClass construct (java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
		maxGamma(){
			public BaseClass construct (java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
		maxIdc(){
			public BaseClass construct (java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
		minAlpha(){
			public BaseClass construct (java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
		minGamma(){
			public BaseClass construct (java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
		minIdc(){
			public BaseClass construct (java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
		ratedIdc(){
			public BaseClass construct (java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
		operatingMode(){
			public BaseClass construct (java.lang.String value) {
				return new CsOperatingModeKind(value);
			}
		},
		pPccControl(){
			public BaseClass construct (java.lang.String value) {
				return new CsPpccControlKind(value);
			}
		},
		targetAlpha(){
			public BaseClass construct (java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
		targetGamma(){
			public BaseClass construct (java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
		targetIdc(){
			public BaseClass construct (java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
		alpha(){
			public BaseClass construct (java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
		gamma(){
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

	private enum CsConverter_class_attributes_enum {
		maxAlpha,
		maxGamma,
		maxIdc,
		minAlpha,
		minGamma,
		minIdc,
		ratedIdc,
		operatingMode,
		pPccControl,
		targetAlpha,
		targetGamma,
		targetIdc,
		alpha,
		gamma,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public CsConverter() {
		CsConverter_primitive_attributes = new BaseClass[CsConverter_primitive_builder.values().length];
		CsConverter_class_attributes = new BaseClass[CsConverter_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(CsConverter_class_attributes_enum attrEnum, BaseClass value) {
		try {
			CsConverter_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(CsConverter_primitive_builder attrEnum, BaseClass value) {
		try {
			CsConverter_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			CsConverter_class_attributes_enum attrEnum = CsConverter_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated CsConverter, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			CsConverter_primitive_builder attrEnum = CsConverter_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated CsConverter, setting " + attrName  + " to: "  + value);
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
			for (CsConverter_primitive_builder attrEnum: CsConverter_primitive_builder.values()) {
				BaseClass bc = CsConverter_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    CsConverter." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (CsConverter_class_attributes_enum attrEnum: CsConverter_class_attributes_enum.values()) {
				BaseClass bc = CsConverter_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    CsConverter." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(CsConverter) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "CsConverter";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new CsConverter();
        }
};
