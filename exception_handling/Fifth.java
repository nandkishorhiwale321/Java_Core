package exception_handling;

public class Fifth {
	
	public static void main (String [] args)
	{
		
		int Dividend = -20;
		int divisor = -2;
		
		try {
			
			if(divisor == 0) {
				
				throw new ZeroDivisorException("you are divisor is zero.....");
				
			}
			
			if(Dividend < 0 &&  divisor < 0) {
				
				throw new NagetiveNumberException(" Both number are nagetive.....");
			}
			
			else {
				
				System.out.println(Dividend/divisor);
			}
		}
		catch(ZeroDivisorException ex) {
			
			System.out.println(ex.getMessage());
		}
		
		catch(NagetiveNumberException en) {
			
			System.out.println(en.getMessage());
		}
	}

}

class ZeroDivisorException extends Exception {
	
	public ZeroDivisorException(String str) {
		
		super(str);
	}
}

class NagetiveNumberException extends Exception {
	
	public NagetiveNumberException (String str) {
		super(str);
	}
}
