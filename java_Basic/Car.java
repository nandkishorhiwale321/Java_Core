package java_Basic;

public class Car {
	public static void main(String [] args) {
		
		cars maruti = new cars();       //here create a object
		
		
		
		//maruti.A();
		
		 maruti.name="Breza";
		 maruti.price=826000.12;
		 maruti.company="MARUTI";
		 maruti.milege="25.42KMPL";
	     maruti.A();
		 
		 
		 
		System.out.println("\nThis is using  instace veriable \n Name:"+maruti.name+",\n Price:"+maruti.price+",\n Company:"+maruti.company+",\n Milege:"+maruti.milege+",");
				 
		System.out.println("\n*****END*****");

			
	}

}
class cars{
	String name;                                //This is instance veriable
	double price;                               //
	String company;                             //
	String milege;                              //
	
public void A() {                               //this my method
  
	
	
	String name="Carens";                      //This is local veriable
	 double price=1277000.1020;
	 String company="KIA";
	 String milege="15.6KMPL";
	 
	
	
	System.out.println();
	System.out.println("This is using local veriable");
	System.out.println("  Name:"+name+",\n  Price:"+price+",\n  Company:"+company+",\n  Milege:"+milege+",");

}
}
