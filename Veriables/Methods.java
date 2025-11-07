package Veriables;

public class Methods {
	public static void main(String [] args) {
	
	Bank kotak = new Bank();                                 // CREAT A OBJECT OF CLASS BANK 
	
	kotak.branchcode = 124576;
	kotak.user = " KARTIK";
	kotak.INRATE = 5.5;
	
	Bank SBI = new Bank();
	
	SBI.branchcode = 321576;
	SBI.user = " VISHAL";
	SBI.INRATE =6;
	
	SBI.demo();                                              // CALL demo() method         
	Bank.repo();                                             // CALL repo() method
	System.out.println("BRANCH CODE:"+kotak.display());      // CALL display() method

	
System.out.println();

	kotak.demo();
	Bank.repo();
	System.out.println("BRANCH CODE:"+SBI.display());
}
}
class Bank{
	
	int branchcode;                                          // INSTACE VERIABLE
    double INRATE;                      
	String user;
	
	void demo() {                                           //  INSTANCE METHOD
		
		System.out.println("AC NAME:"+user);
		System.out.println("INTEREST RATE:"+INRATE+"%");
		
	}
	
	static void repo() {                                    //  STATIC METHOD

	final	String branch = "PUNE";                         //  DECLEAR AS AFINAL
		System.out.println("BRANCH:"+branch);		
	}
	
public int display() {                                      //  RETURN METHOD
	return branchcode;
	
}
}
