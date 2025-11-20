package exception_handling;

public class Third {
	
	public static void main (String [] args) {
		
		int Balance = 5000;
		
		int Amount = 10000;
		
		try {
			
			if(Amount <= Balance) {
				
				throw new InSufficintBalance("Widrowal Succefully............");
			}
			
			else {
				System.out.println("In sufficint balance: "+Balance);
			}
		}
		
		catch (InSufficintBalance ex) {
			
			System.out.println(ex.getMessage());
		}
	}

}

class InSufficintBalance extends Exception  {
	
	public InSufficintBalance(String str) {
		
		super(str);
	}
}
