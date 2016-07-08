import java.util.Scanner;
import java.util.Arrays;

public class Reverser {
	public static void main(String[] args) {
		
		// Define reverseValue function
		// This is where I get a persistent error message -- need work
		function reverseValue(value) {
			return Number(value.toString().split("").reverse().join(""));
		}
		
		// Create new scanner object
		Scanner input = new Scanner(System.in);
			
		// Prompt the user to enter a number
		// Not sure why I am getting an error here. May have to do with line 9.
		System.out.println("Enter a number and I'll reverse it: ");
			
		// Wait for user to enter number
		value = input.nextInt();
		
		// Output the reversed number
		System.out.println("The reversed number is: " + reverseValue(value));
	}
}	