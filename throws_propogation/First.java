package throws_propogation;

public class First {
	public static void main(String[] args) {
		
		Throws_prpoogation tx=new Throws_prpoogation();
		
		
		try {
			tx.method1();
		}
		catch(Exception ex) {
			System.out.println("Exception handled:"+ex.getMessage());
		}

	}

}

class Throws_prpoogation {

	void method1() throws Exception {
		throw new Exception("Error occurred in method1");

	}
	void method2() throws Exception {
		method1();
	}
	void method3() throws Exception {
		method2();
	}

}
