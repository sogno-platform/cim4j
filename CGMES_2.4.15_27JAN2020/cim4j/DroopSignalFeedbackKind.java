package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Governor droop signal feedback source.
*/
public class DroopSignalFeedbackKind extends BaseClass
{
	private enum DroopSignalFeedbackKind_ENUM
	{
			/**
		 * Electrical power feedback (connection indicated as 1 in the block diagrams of models, e.g. GovCT1, GovCT2).
		 */
		electricalPower,
			/**
		 * No droop signal feedback, is isochronous governor.
		 */
		none,
			/**
		 * Fuel valve stroke feedback (true stroke) (connection indicated as 2 in the block diagrams of model, e.g. GovCT1, GovCT2).
		 */
		fuelValveStroke,
			/**
		 * Governor output feedback (requested stroke) (connection indicated as 3 in the block diagrams of models, e.g. GovCT1, GovCT2).
		 */
		governorOutput,
			MAX_DroopSignalFeedbackKind_ENUM;
	}

	private DroopSignalFeedbackKind_ENUM value;

	public BaseClass construct() {
		return new DroopSignalFeedbackKind();
        }

	public DroopSignalFeedbackKind() {}

	public DroopSignalFeedbackKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = DroopSignalFeedbackKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = DroopSignalFeedbackKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "DroopSignalFeedbackKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString() {
		return "";
	}
};

