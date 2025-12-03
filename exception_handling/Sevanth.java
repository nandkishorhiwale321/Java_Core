package exception_handling;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Sevanth {
	public  static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println(" Enter your first number:");
			int num1 =sc.nextInt();
			
			System.out.println("Enter your second number : ");
			int num2 =sc.nextInt();
			
			int Result = num1/num2;
			
			System.out.println("Result :"+Result);
		}
		catch(ArithmeticException ex) {
			System.out.println("Error: can not divide by zero..!");
		}
		catch(InputMismatchException e) {
			System.out.println(" Error:Please enter only numeric values..");
			
		}
		finally {
			System.out.println("thank you for using calculater..");
		}
	}

}
