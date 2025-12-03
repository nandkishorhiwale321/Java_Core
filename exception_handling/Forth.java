package exception_handling;

public class Forth {

	public static void main(String[] args) {

		int age = 50;
		
		try {
			
				if( age< 18) {
					
					throw new ChildException("you are adult....") ;

				}
				
				if(age > 18 && age < 40) {
					
					throw new YounghExcepton("You are youngh.....");
				
			}
				
				if (age> 41) {
					
					throw new SeniorException("you are Senior parson");
				}
		}
		
		catch (ChildException ec) {
			
			System.out.println(ec.getMessage());
		}
		
		catch(YounghExcepton ey) {
			
			System.out.println(ey.getMessage());
		}
		
		catch (SeniorException es) {
			System.out.println(es.getMessage());
		}
	}

}

class ChildException extends Exception {
	
	public ChildException(String str) {
		super(str);
	}
}

class YounghExcepton extends Exception {
	
	public YounghExcepton (String str) {
		super(str);
	}
}

class SeniorException extends Exception {
	
	public SeniorException(String str) {
		
		super(str);
	}
}
