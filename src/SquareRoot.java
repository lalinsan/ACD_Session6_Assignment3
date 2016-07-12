/*
 * Student: Eduardo Aguirre
 * Session 6
 * Assignment 3
 * Java Class that implements the Runnable class to run the Sauare root of X and Y
 *  
 */

import java.text.DecimalFormat; //Imports Java Class to define the format of a number

public class SquareRoot implements Runnable //implements Runnable Class that allows running threads
{
	Thread tr; //Create a Thread instance and assign variable tr
	boolean running=true; //set variable running = true
	
	//Contructor
	SquareRoot (String name, int p)
	{
		tr=new Thread (this, name);
		tr.setPriority(p);
		tr.start();
	}
	
	@Override
	public void run() //Executes method
	{
		System.out.println("===================");
		System.out.println("SQUARE ROOT THREAD");
		System.out.print("=====================");
		
		System.out.println("\n" + tr + "-start"); //Start Thread
		double x=12.75;
		double y=3.0;
		double squareRootX;
		double squareRootY;
		
		squareRootX=Math.sqrt(x); //Calculates Square Root of X
		squareRootY=Math.sqrt(y); //Calculates Square Root of Y
		
		DecimalFormat df = new DecimalFormat ("0.000");
		System.out.println("Square Root of " +x  +" " +df.format(squareRootX));
		System.out.println("Square Root of " +y  +" " +df.format(squareRootY));
		
		
		System.out.println(tr + "-exiting"); //Ends treat
		System.out.println("=================================");
   }

}
