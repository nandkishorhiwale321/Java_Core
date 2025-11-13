package oops;

public class Interface_5 {
	
public static void main (String [] args) {
	
	BhimUpi_App obj =new BhimUpi_App();
	
	obj.pay();
	obj.Cpay();
	obj.run();
	obj.show();
	
}

}

interface IPayment {
	
	 void pay();
}

interface IPhonePay extends IPayment {
	
	 default void pay() {
		System.out.println("✅ Payment successful through PhonePe...!");
	}
	
	 default void Cpay() {
		 System.out.println("⌛ Checking payment status on PhonePe !.");
		 
	 }
}

interface IGPay extends IPayment {
	
	default void run() {
		System.out.println("⚠️ Something went wrong please try again on GPay....");
		
	}
	
}

interface IBhimUPI extends IPhonePay, IGPay {
	
	default void show() {
		System.out.println("🔉Dont press back button during transaction.......");
	}
	
}
class BhimUpi_App implements IBhimUPI {
	
}

