package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleApp {
	static int theNumber;
	
	public static void main(String[] args) throws IOException{
		System.out.println("Enter a number: ");
		theNumber = getInt();
		int theAnswer = triangle(theNumber);
		System.out.println("Triangle = "+theAnswer);
	} //end main()
//................................................................
	
	public static int triangle(int n) { 
		/*Each time this method calls itself, the user's input (n) is added to
		 * each number below it up until 1. n is then reduced by 1 and the method is called again
		 * until n finally reaches a value of 1 itself.
		 * of 1:
		 * EXAMPLE:
		 * n = 5
		 * 5 + 4 + 3 + 2 + 1 = 15, Return 15
		 * n = 4
		 * 4 + 3 + 2 + 1 = 10, Return 10
		 * n = 3
		 * 3 + 2 + 1 = 6, Return 6
		 * n = 2
		 * 2 + 1 = 3, Return 3
		 * n = 1
		 * 1 = 1, Return 1
		 * 1
		 * */
		
		System.out.println("Entering: n=" + n);
		if (n==1) {
			System.out.println("Returning 1");
			return 1;
		}
		else {
			int temp = n + triangle(n-1);
			System.out.println("Returning " + temp);
			return temp;
		}
	} //end triangle()
//................................................................
	
	public static String getString() throws IOException{	//Read user input
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	} //end getString()
//................................................................

	public static int getInt() throws IOException{ //Parse users input as an integer
		String s = getString();
		return Integer.parseInt(s);
	} //end getInt()
//................................................................
	
	
	
} //end class TriangleApp
