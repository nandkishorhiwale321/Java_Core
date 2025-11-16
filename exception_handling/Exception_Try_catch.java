package exception_handling;

public class Exception_Try_catch {
public static void main(String [] args) {
	
	System.out.println("Strating program.....");
	
	System.out.println("Hello, we are studying exception handling");
	try {
		
		int a = 10;
		int b = 0;
		
		int result = a/b;
		
		System.out.println(result);
	
}
	catch( Exception e){
		
		
		System.out.println("Error:"+e.getMessage());

		
	}
	
	finally {
		System.out.println("Program Finished (finally block always runs).");
	}
	System.out.println("end of main method");
		
	}
}
