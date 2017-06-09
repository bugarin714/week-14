/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

/**
 *
 * @author juan
 */
public class Bicycle extends HumanPoweredCycles{
    	 public Bicycle(int numberofwheel, int numberofgear, String Name, String Color, int Speed) {

	        super(numberofwheel, numberofgear, Name, Color, Speed);

		// TODO Auto-generated constructor stub
	}

	
	
	public int GetCurrentSpeed(){

		

		return currentSpeed;
	}

		 @Override

		    public String toString(){

		        return super.toString();

		

	}

	



}

