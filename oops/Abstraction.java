package oops;

public class Abstraction {

	public static void main(String[] args)
	{
		Animal ele = new Elephant();
		ele.eat("hi");
		ele.sleep();
		
	}
	

}
abstract  class Animal {
	
	abstract void eat(String str);  // abstract method (no implemention)
	
	void sleep()                    // concrete method (non-abstract method)
	{
		System.out.println("which animal are sleeping..............?");
	}
}
 class Elephant extends Animal   //subclass providing implemention
{

	@Override
	void eat(String str) {
		System.out.println("which animal are eating...........?");		
	}
	 
}
 
	
	
