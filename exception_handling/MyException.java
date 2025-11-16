package exception_handling;

public class MyException {
	
	public static void main (String [] args) {
		
		
		Scam s = new scam2();
		Scam s2 = new scam2();
		Scam s3 = new Scam();
		
		
		System.out.println(s.getClass());
		System.out.println(s3.getClass());
		System.out.println("***************************");
		System.out.println(s.toString());
		System.out.println(s2.toString());
		System.out.println("**************************");
		
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		
		
	}
}
class Scam {
	
}
class scam2 extends Scam {
	
		
}
class scam3 extends scam2 {
	
}
