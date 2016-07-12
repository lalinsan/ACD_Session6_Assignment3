/*
 * Student: Eduardo Aguirre
 * Session 6
 * Assignment 3
 * Java Class that implements the Runnable class to run the Shuffle thread that prints the characters to form a-b c-d
 *  
 */

public class Shuffle implements Runnable //implements Runnable Class that allows running threads
{
	Thread tr; //Create a Thread instance and assign variable tr
	boolean running=true; //set variable running = true
	
	//Constructor
	Shuffle (String name, int p)
	{
		tr=new Thread (this, name);
		tr.setPriority(p);
		tr.start();
	}
	
	@Override
	public void run() //Executes method
	{
		System.out.println("================");
		System.out.println("SHUFFLE THREAD");
		System.out.print("================");
		System.out.println("\n" + tr + "-start");//Start Thread
		int x=3;
		while (x>0)
		{
			if (x>2)
			{
				System.out.print("a");
			}
			x-=1;
			System.out.print("--");
		    if (x==2)
		    {
		    	System.out.print("b c");
		    }
			
		    if (x==1)
		    {
		    	System.out.print("d");
		    	x-=1;
		    	System.out.println();
		    }
		}
		
		System.out.println(tr + "-exiting"); //Ends treat
		System.out.println("==========================");
   }
}
