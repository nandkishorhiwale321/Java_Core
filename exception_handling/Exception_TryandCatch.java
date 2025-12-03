package exception_handling;

public class Exception_TryandCatch {
	public static void main (String [] args) {
		
		
		
	int age = 1;
	
	
	try {
		
		if (age >= 18  && age <= 30) {
			
			throw new AgeVaildException("you can vote gracefully........");
		}
		
		else if (age >= 31 && age <= 50) {
			
			throw new Age2ValidException("you can vote carefully........") ;
			
		}
		
		else {
			System.out.println("you are not eligible");
		}
	}
	
	catch(Exception ex) {
		
		System.out.println(ex.getMessage());
		
	}	
	}
		
}

class AgeVaildException extends Exception {
	
	public AgeVaildException(String str) {
		super(str);
	}
}



class Age2ValidException extends Exception {
	 
	public Age2ValidException(String str) {
		
		super(str);
	}
}


