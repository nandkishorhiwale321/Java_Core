package oops;

public class MISC {

	public static void main(String[] args) {
		
		AA  c = new CC();
		c.run();
		
		

	}

}

interface AA {
	
	default void run() {
		System.out.println(" default run method from AA");
		
	}
	
	 void show();
	
	
}

interface BB {
	
	default void run() {
		System.out.println(" default run method from BB");
	}
	
}

class CC implements AA,BB {
	
	public void run() {
		AA.super.run();
		BB.super.run();
		System.out.println(" run method from CC");
	}
	
	public  void show() {
		System.out.println("show method from cc ");
	}
	
}
