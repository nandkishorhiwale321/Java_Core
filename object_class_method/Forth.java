package object_class_method;
import java.util.Objects;

public class Forth {
	
	public static void main(String [] args) {
		
		/*
		 * The Contract between .equals and .hashCode
		 * 
		 * If two objects are equal (equals() returns true), then they must have the same hashCode
		 * if two objects have same hashCode ,then they may or may not be equal
		 * if equals returns false ,then hashCode can be same or different-- it's possible collition
		 */
		
		Collage c1 = new Collage(121,"abc");
		Collage c2 = new Collage(121,"abc");
		
		
		System.out.println(c1.equals(c2));
		System.out.println("*-*-*-*-*-**-*-*--**");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
	}

}

class Collage {
	
	int id;
	String name;
	
	public Collage(int id,String name) {
		
		this.id=id;
		this.name=name;
	}
	
	public boolean equals(Object obj) {
		
		Collage collage =(Collage)obj;
		return this.id==collage.id && this.name.equals(collage.name);

	}
			
	

public int hashCode() {
	return Objects.hash(this.id,this.name);
}
}