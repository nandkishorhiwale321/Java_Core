package oops;

public class Inheritace_4 {
	public static void main (String []args) {
		
		//  this hybrid type of inheritnce
		
		State dist = new State();
		System.out.println(dist.name);
		dist.A();
		System.out.println("************************");
		
		Pune k = new Pune();
		System.out.println(k.name);
		k.A();
		k.B();
		System.out.println("************************");

		Kothrud l = new Kothrud();
		System.out.println(l.name);
         l.A();
         l.B();
         l.C();
         System.out.println("************************");

         
         Buldhana b = new Buldhana();
         System.out.println(b.name);
         b.A();
         b.D();
	}

}
class State {
	String name = "MAHARASTRA";
	
	public void A() {
		System.out.println("welcome to maharastra");
	}
}
class Pune extends State {
	public void B() {
		System.out.println("you are in pune city");
	}
}
class Kothrud extends Pune {
	public void C() {
		System.out.println("This is kothrud");
	}
}
class Buldhana extends State {
	public void D () {
		System.out.println("your wwlcome to our buldhana");
	}
	
}
