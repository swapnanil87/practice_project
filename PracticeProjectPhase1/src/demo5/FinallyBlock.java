package demo5;

import java.io.*;

class FinallyBlock {
	public static void main(String[] args)
	{
		try {
			System.out.println("inside try block");
			
			// Not throw any exception
			System.out.println(34 / 2);
		}
		
		// Not execute in this case
		catch (ArithmeticException e) {
			
			System.out.println("Arithmetic Exception");
			
		}
		// Always execute
		finally {
			
			System.out.println(
				"finally : i execute always.");
			
		}
	}
}
