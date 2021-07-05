package com.example.demo;

/*
 * No package must be added here because some Online Judges don't support it
 * please remove, if any.
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Only classes with 'Main' name are accepted in CodeChef and some other online judges
 */
public class Solution2
{

	/*
	 * In a Programming contest, you are expected to print the output at the
	 * end, so `output` variable will hold all the processed results till the
	 * end
	 */
	public static String output = "";

	// Program's starting point
	public static void main(String[] args) {
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * final int cases; try { cases = Integer.parseInt(br.readLine().trim());
		 * 
		 * Solver solver = new Solver(); for (int i = 0; i < cases; i++) {
		 * solver.solve(br.readLine()); }
		 * 
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } // Print the final output System.out.println(output);
		 */
		
		
	}
	public String lastLetter(String a)
	{
		return a.charAt(a.length()-1)+" "+a.charAt(a.length()-2);
	}
	
	

}
/*
 * Some basic rules while coding in Programming Contests:
 * Try to follow at least 80% of them
	Correctness
		- final declaration for required data types
		- avoid Object creation 
		- Scanner slows down, use InputReader
		- avoid too many static functions	
	Efficiency
		- use library functions as much as possible		
		- assertEquals("RESULT", functionToCall())
	Debugging-ability
		- avoid too many global variables 
		- Separate logic from meta-processing
		- variable/function pneumonics must make sense
 * 
 */
class Solver {

	/*
	 * Logic goes here ...
	 * Add to the global variables after processing the input
	 * Maybe reverse a string or parse to an integer or , etc.
	 */	
	public void solve(String input) {					
		Main.output.concat(input);	
	}

}