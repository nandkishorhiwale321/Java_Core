package conditional;

import java.util.Scanner;

public class ConditionalIf_else {
	
public static void main (String [] args) {
		
		int balance = 10000;
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Withdrawal Amount:");
		
		int withdrawal = sc.nextInt();
		
		if(withdrawal < 1) {
			
			
			System.out.println("Enter valid amount");

			
		}
		
		else if(withdrawal > balance) {
			System.out.println("insuffient balance");

		}
		else {
		
			System.out.println("Withdraw Successful...\n"+withdrawal);

		}
		
		
	}

}



