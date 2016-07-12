/*
 * Student: Eduardo Aguirre
 * Session 6
 * Assignment 3
 * Java Class that implements the Runnable class to run the Print Number Thread
 * Run Method prints number from 1 to 10 
 */

public class PrintNumbers implements Runnable  //implements Runnable Class that allows running threads
{
    	Thread tr; //Create a Thread instance and assign variable tr
    	boolean running=true; //set variable running = true
    	
    	//Constructor
    	PrintNumbers(String name, int p)
    	{
    		tr=new Thread (this, name);
    		tr.setPriority(p); //Calls setPriority
    		tr.start(); //Calls start 
    	}
    	
    	@Override
    	public void run() //Executes method
    	{
    		System.out.println("================");
    		System.out.println("PRINT NUMBERS");
    		System.out.print("================");
    		
    		System.out.println("\n" + tr + "-start"); //Start Thread
    		for(int i=1; i<11; i++) 
            {
            	System.out.println("Number: " +i); //Print number 1-10
            }
    		
    		System.out.println(tr + "-exiting"); //Ends Thread
    		System.out.println("=============================");
       }
    	
}
