package Constructor;

public class Constructor_5 {

	public static void main(String[] args) {
		//  Constructor overloading
		
		Parent p = new Parent();
		Parent p1 = new Parent ("nandkishor");
		Parent p2 = new Parent (1);
		Parent p3 = new Parent(1.01);
		
	}

}
class  Parent {
	
	Parent(){   
		System.out.println("1. no- arg. constructor");
	}
	
	Parent (String a){
		System.out.println("2. String- arg. constructor");
	}
	Parent(int a){
		System.out.println("3. int.- arg. constructor");
	}
	
	Parent (double a){
		System.out.println("4. double- arg. constructor");
	}
}
