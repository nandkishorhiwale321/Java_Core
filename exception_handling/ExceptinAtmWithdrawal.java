package exception_handling;

import java.util.Scanner;

public class ExceptinAtmWithdrawal {
	
	public static void main (String [] args) {
		
		int balance = 10000;
		//int withdrawal;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Withdrawal Amount:");
		
		int withdrawal = sc.nextInt();
		
		if(withdrawal <= balance && withdrawal > 1) {
			
			System.out.println("Withdraw Successful...\n"+withdrawal);
			
		}
		if(withdrawal < 1) {
			System.out.println(" Enter valid amount");
		}
		else {
			System.out.println("insupcint balance");
		}
		
		
	}

}
