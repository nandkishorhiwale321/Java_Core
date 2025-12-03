package oops;

public class Instance_methodUsingPolymorphim {

	public static void main(String[] args) {
		M c= new K();
		c.display();
		
}
}
class M {
	
	 int display() {
		System.out.println("i am first class");
		
		return 1;
	}
}
class K extends M {
	
	protected int display () {
		super.display();
		System.out.println("i am second class");
		
		return 2;
		
	}
}
class C extends K {
	
	public int display () {
		super.display();
		System.out.println("i am thrid class");
		
	return 3;}
	}