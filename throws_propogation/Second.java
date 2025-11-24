package throws_propogation;

public class Second {
	public static void main (String [] args) {
		
		ATM atm =new ATM();
		try
		{
			atm.method3(10000.0);
		}
		catch(InsuficintBalanceException ex) {
			
			System.out.println(ex.getMessage());
		}
		
	}

}

class ATM {
	 void method1(double Balance) throws InsuficintBalanceException {
	
	if(Balance < 1000) {
	
	throw new InsuficintBalanceException("Balance is too low ") ;
}
	System.out.println("Balance is suficint...........");
}
	void method2(double Balance) throws InsuficintBalanceException {
		method1(Balance);
		
	}
	void method3(double Balance) throws InsuficintBalanceException  {
		method2(Balance);
	}

}
class InsuficintBalanceException extends Exception {
	public InsuficintBalanceException( String str) {
		super(str);
	}
}
