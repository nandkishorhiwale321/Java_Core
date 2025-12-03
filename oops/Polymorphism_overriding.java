package oops;


public class Polymorphism_overriding {

	public static void main(String[] args) {
		pet ani = new pet();
		ani.run();

	}

}
class Animals {
	
	public void run() {
		System.out.println("This is run method of Animals class");
	}
	
}
class Dog extends Animals {
	
	public void run() {
		super.run();
	  System.out.println(" This is run method of dog ");
	}
}
class cat extends Dog {
	public void run () {
		super.run();
		System.out.println("This is run method of cat class");
	}
}
class pet extends cat {
	public void run () {
		super.run();
		System.out.println("This is run method of the pet class");
	}
}

