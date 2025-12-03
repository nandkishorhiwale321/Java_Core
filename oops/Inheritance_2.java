package oops;

public class Inheritance_2 {

	public static void main(String[] args) {
		Company A = new Company();
		A.name = "Boach";
		A.strat();
	//	System.out.println(A.name);
		System.out.println(A.location);
		System.out.println(A.Type);
		
		System.out.println("************************");
		
		Company_2 B = new Company_2();
		B.name = "PSML";
		B.strat();
	//	System.out.println(A.name);
		System.out.println(B.location);
		System.out.println(B.Type);
	

		System.out.println("************************");
		
		company_3 c = new company_3();
		c.name = "Amphenol";
		c.strat();
	//	System.out.println(A.name);
		System.out.println(c.location);
		System.out.println(c.Type);
		c.go();
	
	}

}
class Company {
	String name;
	String  location ="Pune";
	String Type = "Manufacring";
	public void strat() {
		
		System.out.println(name);
	}
}
class Company_2 extends Company {
	
}
class company_3 extends Company_2 {
	public void go() {
		System.out.println("i achieve multi-level inheritance");
	}
	
}