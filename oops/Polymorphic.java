package oops;

public class Polymorphic {

	public static void main(String[] args) {
		
		Comic cap = new Avenger();
		cap.Character();
		Comic iron = new MCU();
		iron.Character();
		iron.role();
		
//		Comic co = new Comic();
//		co.role();
	}

}

class Comic{
	public void Character() {
		System.out.println("Comic Character.");
	}
	public Dc role() {
		System.out.println("DC Universe");
		return new Dc();
	}
}
class MCU extends Comic{
	public void Character() {
		System.out.println("Marvel Character.");
	}
	public JL role() {
		System.out.println("Justice League Uni.");
		return new JL();
	}
}
class Avenger extends MCU{
	public void Character() {
		System.out.println("Avengers Characters.");
	}
}


class Dc{
	public void JusticeLeage() {
		System.out.println("DC Comics");
	}
	Dc(){
		System.out.println("Dc Constructor.");
	}
}
class JL extends Dc{
	JL(){
		System.out.println("JL Constructor");
	}
}

