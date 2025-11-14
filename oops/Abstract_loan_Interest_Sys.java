package oops;
import java.util.Scanner;

public class Abstract_loan_Interest_Sys {
	
	public static void main (String [] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Loan Amount:");
		double amount = sc.nextDouble();
		
		System.out.println("Choose loan type");
		System.out.println("1. Home loan");
		System.out.println("2. Car Loan");
		System.out.println("3. Pesnal Loan");
		System.out.println("Enter Your Choose");
		
		int choise = sc.nextInt();
		
		Loan loan = null;
		
		switch (choise) {
		
		case 1:
			
			loan = new Homeloan (amount);
			
			break;
			
		case 2 :
			
			loan = new CarLoan (amount);
			
			break;
			
		case 3:
			
			loan = new PersonlLoan(amount);
			
			break;
			
			default:
				
				System.out.println("Invalid choise...!");
				return;
				
			
		}
		double interest = loan.interest();
		System.out.println("Interest Amount:"+ interest);
		
		System.out.println("Total Payable:"+(amount + interest));
	}
}

abstract class Loan {
	
	double amount ;
	
	Loan (double amount){
		
		this.amount = amount;
	}
	
	abstract double interest();
}
class Homeloan extends Loan {

	Homeloan(double amount) {
		super(amount);
		
	}

	@Override
	double interest() {
		return amount * 0.08;
		
		
	}
	
}
class CarLoan extends Loan {

	CarLoan(double amount) {
		super(amount);
		
	}

	@Override
	double interest() {
		return amount * 0.10;
		
		
	}
	
}
class PersonlLoan extends Loan {

	PersonlLoan(double amount) {
		super(amount);
		

	
		
	}

	@Override
	double interest() {
		
		return amount * 0.09;
	}
	
}
