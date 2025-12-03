package object_class_method;

import java.util.Objects;

public class Fifth {
	public static void main (String [] args) {
		
		Animal ani1 = new Animal(1212,"nanda");
		Animal ani2 = new Animal(1212,"nanda");
		
		System.out.println(ani1.equals(ani2));
		System.out.println("*-*-*-*-*-*-*-*-*");
		
		System.out.println(ani1.hashCode());
		System.out.println(ani2.hashCode());
		
	}

}

class Animal {
	
	int number;
	String name;
	
	protected Animal(int number, String name) {
		this.name = name;
		this.number =number;
		
	}
	
	public int hashCode() {
		
		return Objects.hash(this.name,this.number);
	}
	
public boolean equals(Object o) {
		
		Animal A = (Animal) o;
		
		
		
		return this.number==A.number && this.name.equals(A.name);
		
		
	}
	
	

	
	
	
	
}
