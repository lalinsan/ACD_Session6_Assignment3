/*
 * Student: Eduardo Aguirre
 * Session 6
 * Assignment 3
 * Java Class that runs the PrintNumber | Shuffle | SquareRoot Threads
 *  
 */


public class ThreadTest {

	public static void main(String[] args) {
		new PrintNumbers ("High Priority", Thread.MAX_PRIORITY); //New instance of Print Numbers, Thread Priority to Maximum
		new Shuffle ("Normal Priority", Thread.NORM_PRIORITY); //New instance of Shuffle Thread Priority to Normal
		new SquareRoot ("Low Priority", Thread.MIN_PRIORITY); //New instance of Square Root, Thread Priority to Low
		
	}

}
