package oops;

public class Anonymous_Interface {
	
	public static void main ( String [] args) {
		
		ISbi sbi = new ISbi() {

			@Override
			public void Loan(String str) {
				
				System.out.println("In the year " + str + ", SBI provided ₹1.50 crore in loans to farmers");
				
			}

			@Override
			public double deposit(double amount) {
				
				System.out.println("Deposited in the last 6 months: ₹" + amount);
				return amount;
			}

			@Override
			public int withdrowl(int amount) {
				
				System.out.println("Withdrawn between Jan–Aug 2025: ₹" + amount);
                return	amount;		
                		}

			@Override
			public void BankName() {
				
				System.out.println("Bank Name: State Bank of India (SBI)");
			}	
		};
		
		System.out.println("***** BANK DETAILS *****\n");
		sbi.BankName();
		
		double dep = sbi.deposit(1225565.32);
        System.out.println("Total Deposit Returned: ₹" + dep);
		
        int with = sbi.withdrowl(46466640);
        System.out.println("Total Withdrawl Returned: ₹" + with);
        
		sbi.Loan("2024-25");
		
		
	}

}
interface ISbi {
	
	abstract void Loan (String str);
	
	double deposit(double amount);

	int withdrowl(int amount);

	public void BankName();
	
}
