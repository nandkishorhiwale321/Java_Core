package oops;

public class Inheritance {
	public static void main(String args[]) {
		
		Shyam A = new Shyam();
		
		System.out.println(A.name);
		System.out.println(A.age);
		System.out.println(A.Nation);
		A.run();
		
		System.out.println("******************");
		
		Ram b = new Ram();
		System.out.println(b.name);
		System.out.println(b.age);
		System.out.println(b.Nation);
		b.run();
	}

}
class Shyam {
	
	String name = "Jemmy";
	int age = 25;
	 String  Nation = "Astrulia";
	
	public void run() {
		System.out.println("This is a single level inheritace");
		
	}
	
}
class Ram extends Shyam {
	
}
