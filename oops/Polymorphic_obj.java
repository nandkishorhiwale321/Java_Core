package oops;

public class Polymorphic_obj { 
	public static void main (String args []) {
		
		Mahaa maha = new Akola();
		maha.hit();
		Gujrat g = new Gujrat();
		g.hit();
		pune p = new pune();
		p.bit();
		
		
		
	}
}
class Mahaa {
	String str = "maharastra";
	public void hit() {
		System.out.println("This is MH");
	}
	
}
class pune extends Mahaa {
	
	public void hit () {
		System.out.println("welcome to buldhana");
	}
	public Surat bit() {
		System.out.println("role");
		
		return new Surat ();
	}
}
class Akola extends Mahaa {
	
	public void hit () {
		System.out.println(" this is cotton city akola");
		}
}
class Gujrat {
	public void hit() {
		System.out.println("welcomr to the Gj");
	}
}
class Surat extends Gujrat {
 Surat() {
	System.out.println("you are in surat");
}
}