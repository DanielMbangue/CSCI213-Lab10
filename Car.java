import java.util.*;

import java.lang.*;

/**
 * 
 * This is the Car class which extends of Vehicle
 * and it consists of the constructor, getNumDoors, getNumPass, toString, 
 * equals and copy.
 * 
 * @author Daniel Mbangue 
 * Date: 05/11/2023
 *
 */
public class Car extends Vehicle{

	private int numDoors;

	private int numPass;

	public Car(String aMake, String aModel, String aPlate, int aNumDoors, int aNumPass){

		super(aMake, aModel, aPlate);

		this.numDoors = aNumDoors;

		this.numPass = aNumPass;

	}


	public int getNumDoors() {

		return this.numDoors;
	}

 

	public int getNumPass() {

		return this.numPass;
	}


	/**
	 * This method prints a string with the Car information.
	 * 
	 * @return the string with the Car make, model, number of doors and plate.
	 * 
	 */
	@Override
	public String toString() {
		
		String result = String.format("%d-door %s %s with license %s." , this.getNumDoors(), super.getMake(), super.getModel(), super.getPlate());
		
		return result;
		
	}

	/**
	 * This method checks if two Cars are equal, if inherited 
	 * properties of Vehicle are equal.
	 * 
	 * @param objC car object.
	 * @return false if incorrect type, true if Cars are equal.
	 * 
	 */
	@Override
	public boolean equals(Object objC) {
		
		// return false if other is incorrect type.
		if (!(objC instanceof Car)) {
			return false;
		}

		// cast other to current type.
		Car other = (Car) objC;
		
		// test instance variables (Two Cars are equal).
		if ((this.numDoors == other.getNumDoors() && this.numPass == other.getNumPass())) {
			// check superclass properties.
			return super.equals(objC);

		}

		// Otherwise false.
		return false;
	
	}



	/**
	 * This method creates a copy of the Car.
	 * 
	 * @return the copy of the Car.
	 */
	public Car copy() {
		
		// Get the data
		String theMake = super.getMake();
		String theModel = super.getModel();
		String thePlate = super.getPlate();
		int theNumDoors = this.numDoors;
		int theNumPass = this.numPass;

		// Create and return a copy
		Car theCopy = new Car(theMake, theModel, thePlate, theNumDoors, theNumPass);
		
		return theCopy;
	}


}










