package oops;
import java.util.Scanner;

public class SuperUPI_APP {
	
	public static void main(String [] args) {
		
		SuperUpiApp app = new SuperUpiApp(); 

		app.makepayment();
		app.reachrge();
		
		
	}

}
interface IUPIServices {
	
	void makePayment(double amount);
	
}

interface IPhonePeServices extends IUPIServices
{
	//
	
	default void makepayment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount:");
		int Amount = sc.nextInt();
		if(Amount > 0) {
			
			System.out.println("Payment done using phonePe ...."+Amount);
			System.out.println("PhonePe: Cashback Credited....");
		}
		else{
			System.out.println("enter vaid amount....");
			
		}
	}
}

interface IGPayServices {
	
	
	default void makepayment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount:");
		int Amount = sc.nextInt();
			
				
				if(Amount > 0) {
		System.out.println("Payment done using GPay...:"+Amount);
		System.out.println("You got scrach card..............");
	}
				else {
					System.out.println("Enter vaid Amount");
				}
	}
				
	
				
}

interface IPaytmService  {
	
	default void reachrge() {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Mobile Number:");
		String Number = sc.next();
		
		if(Number.length() == 10) {
			System.out.println("Paytm:Mobile recharge successfull..."); 

		}
		else {
			System.out.println("Enter vaid mobile number");
		}
	}
}

class SuperUpiApp implements IPhonePeServices,IGPayServices,IPaytmService {

	@Override
	public void makepayment() {
		
		//IPhonePeServices.super.makepayment();
		IGPayServices.super.makepayment();
		
		
		
	}

	@Override
	public void makePayment(double amount) {
		
		
		
		
		
	}
	
}