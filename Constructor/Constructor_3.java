package Constructor;

public class Constructor_3 {

	public static void main(String[] args) {
		                                        //Constructor super() call and this () call
		                                        // super() and this() constructor call we can use only  first line of the inside of constructor
	                                            //we can use only one but not both simultaneusally
		
		C b = new C();                       // create object
		
	}

}
class Test {
	
	String s = "Instance string of the test class ";
	
	Test(){
		
		
		System.out.println(s);
		
		
	}
}
class B extends Test {                           //  class B extends class Test
	
	String s ="Instance String of the B class";
	
	B () {
		super();             //Call parent (Test) constructor
       System.out.println(s);	

	
	}
}
class  C extends B {           //inheritce B
	
	String s = "class C";
	
	C() {                     //this() call
		this("java");        // Calls another constructor in the same class
		                     
		System.out.println(s);
	}
	C(String a){
		super();              //Call parent (B) constructo
		System.out.println("parameterized constructor of C"+s); 
	}
}

