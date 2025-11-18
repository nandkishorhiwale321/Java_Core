package exception_handling;
import java.util.Scanner;

public class First {
	 
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age:");
		
		int age = sc.nextInt();
		
		
		
		
		try {
			
			if( age < 18) {
				
				throw new InvalidAgeException("You are NOT eligible for votting");
				
			}
			System.out.println("You are eligible for votting");		
			}
		catch (Exception ex) {
			
			System.out.println("Something went wrong :"+ex.getMessage());
			
		}
		
		finally {
			
			System.out.println("*****THE END*****");
		}
		
		
		
		
		
	}
		
	}

 class InvalidAgeException extends Exception {
	 
	 public InvalidAgeException(String str) {
		 super(str);
	 }
	 
 }

