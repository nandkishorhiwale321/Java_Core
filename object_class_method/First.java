package object_class_method;
import java.util.Objects;

public class First {
	public static void main (String [] args) {
		Demo D =new Demo();
		Demo D2 = new Demo();
		
		D.id=123;
		D.name="john";
		
		D2.id=123;
		D2.name="john";
		
		System.out.println(D.hashCode());
		System.out.println(D2.hashCode());
		
	}

}
class Demo {
	
	int id ;
	String name;
	
	public int hashCode() {
		return Objects.hash(this.id,this.name);
		
	}
	
}
